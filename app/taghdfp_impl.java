package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class taghdfp_impl extends GXDataArea
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
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4643BarFasLot = (int)(GXutil.lval( httpContext.GetPar( "BarFasLot"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4643BarFasLot) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AGRUPACION P/HDR+PARTIDA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
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
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
      edtAp_Barcod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Title", edtAp_Barcod_Title, !bGXsfl_85_Refreshing);
      edtAp_ProCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Title", edtAp_ProCod_Title, !bGXsfl_85_Refreshing);
      edtAp_BarOrd_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Title", edtAp_BarOrd_Title, !bGXsfl_85_Refreshing);
      edtAp_Kilos_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Kilos_Internalname, "Title", edtAp_Kilos_Title, !bGXsfl_85_Refreshing);
      edtAp_Piezas_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Piezas_Internalname, "Title", edtAp_Piezas_Title, !bGXsfl_85_Refreshing);
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

   public taghdfp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public taghdfp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( taghdfp_impl.class ));
   }

   public taghdfp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TAGHDFP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero de Lote", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4643BarFasLot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4643BarFasLot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasLot_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasLot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Total Kilos", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtKgsp_A_Internalname, GXutil.ltrim( localUtil.ntoc( A5952Kgsp_A, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKgsp_A_Enabled!=0) ? localUtil.format( A5952Kgsp_A, "ZZZZZ9.99") : localUtil.format( A5952Kgsp_A, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKgsp_A_Jsonclick, 0, "", "", "", "", "", 1, edtKgsp_A_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Suma Piezas", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPzsp_A_Internalname, GXutil.ltrim( localUtil.ntoc( A5953Pzsp_A, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPzsp_A_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5953Pzsp_A), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5953Pzsp_A), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPzsp_A_Jsonclick, 0, "", "", "", "", "", 1, edtPzsp_A_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAGHDFP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount870 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_870 = (short)(1) ;
            scanStartSV870( ) ;
            while ( RcdFound870 != 0 )
            {
               init_level_properties870( ) ;
               getByPrimaryKeySV870( ) ;
               addRowSV870( ) ;
               scanNextSV870( ) ;
            }
            scanEndSV870( ) ;
            nBlankRcdCount870 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5953Pzsp_A = A5953Pzsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         B5952Kgsp_A = A5952Kgsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         standaloneNotModalSV870( ) ;
         standaloneModalSV870( ) ;
         sMode870 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRowSV870( ) ;
            edtavnRcdDeleted_870_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_870_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_870_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_870_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_Barcod_Title = httpContext.cgiGet( "AP_BARCOD_"+sGXsfl_85_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Title", edtAp_Barcod_Title, !bGXsfl_85_Refreshing);
            edtAp_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Barcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARREO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARPAR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_ProCod_Title = httpContext.cgiGet( "AP_PROCOD_"+sGXsfl_85_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Title", edtAp_ProCod_Title, !bGXsfl_85_Refreshing);
            edtAp_ProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_PROCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ProCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_BarOrd_Title = httpContext.cgiGet( "AP_BARORD_"+sGXsfl_85_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Title", edtAp_BarOrd_Title, !bGXsfl_85_Refreshing);
            edtAp_BarOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARORD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarOrd_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_Kilos_Title = httpContext.cgiGet( "AP_KILOS_"+sGXsfl_85_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_Kilos_Internalname, "Title", edtAp_Kilos_Title, !bGXsfl_85_Refreshing);
            edtAp_Kilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_KILOS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Kilos_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAp_Piezas_Title = httpContext.cgiGet( "AP_PIEZAS_"+sGXsfl_85_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_Piezas_Internalname, "Title", edtAp_Piezas_Title, !bGXsfl_85_Refreshing);
            edtAp_Piezas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_PIEZAS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAp_Piezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Piezas_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_870 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalSV870( ) ;
            }
            sendRowSV870( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode870 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5953Pzsp_A = B5953Pzsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         A5952Kgsp_A = B5952Kgsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount870 = (short)(5) ;
         nRcdExists_870 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartSV870( ) ;
            while ( RcdFound870 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_85870( ) ;
               init_level_properties870( ) ;
               standaloneNotModalSV870( ) ;
               getByPrimaryKeySV870( ) ;
               standaloneModalSV870( ) ;
               addRowSV870( ) ;
               scanNextSV870( ) ;
            }
            scanEndSV870( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode870 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_85870( ) ;
      initAllSV870( ) ;
      init_level_properties870( ) ;
      B5953Pzsp_A = A5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      B5952Kgsp_A = A5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      nRcdExists_870 = (short)(0) ;
      nIsMod_870 = (short)(0) ;
      nRcdDeleted_870 = (short)(0) ;
      nBlankRcdCount870 = (short)(nBlankRcdUsr870+nBlankRcdCount870) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount870 > 0 )
      {
         standaloneNotModalSV870( ) ;
         standaloneModalSV870( ) ;
         addRowSV870( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAp_Barcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount870 = (short)(nBlankRcdCount870-1) ;
      }
      Gx_mode = sMode870 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5953Pzsp_A = B5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      A5952Kgsp_A = B5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAGHDFP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TAGHDFP.htm");
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
      e11SV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4643BarFasLot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4643BarFasLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5953Pzsp_A = (short)(localUtil.ctol( httpContext.cgiGet( "O5953Pzsp_A"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5952Kgsp_A = localUtil.ctond( httpContext.cgiGet( "O5952Kgsp_A")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A194BarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            else
            {
               A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASLOT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasLot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4643BarFasLot = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
            }
            else
            {
               A4643BarFasLot = (int)(localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
            }
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A5952Kgsp_A = localUtil.ctond( httpContext.cgiGet( edtKgsp_A_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
            A5953Pzsp_A = (short)(localUtil.ctol( httpContext.cgiGet( edtPzsp_A_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4643BarFasLot = (int)(GXutil.lval( httpContext.GetPar( "BarFasLot"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
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
                        e11SV2 ();
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
            initAllSV688( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_870_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_870_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributesSV688( ) ;
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

   public void confirm_SV0( )
   {
      beforeValidateSV688( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsSV688( ) ;
         }
         else
         {
            checkExtendedTableSV688( ) ;
            if ( AnyError == 0 )
            {
               zmSV688( 4) ;
               zmSV688( 5) ;
               zmSV688( 6) ;
               zmSV688( 7) ;
               zmSV688( 8) ;
            }
            closeExtendedTableCursorsSV688( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode688 = Gx_mode ;
         confirm_SV870( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode688 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesSV0( ) ;
      }
   }

   public void confirm_SV870( )
   {
      s5953Pzsp_A = O5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      s5952Kgsp_A = O5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRowSV870( ) ;
         if ( ( nRcdExists_870 != 0 ) || ( nIsMod_870 != 0 ) )
         {
            getKeySV870( ) ;
            if ( ( nRcdExists_870 == 0 ) && ( nRcdDeleted_870 == 0 ) )
            {
               if ( RcdFound870 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateSV870( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableSV870( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsSV870( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5953Pzsp_A = A5953Pzsp_A ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
                     O5952Kgsp_A = A5952Kgsp_A ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "AP_BARCOD_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAp_Barcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound870 != 0 )
               {
                  if ( nRcdDeleted_870 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeySV870( ) ;
                     loadSV870( ) ;
                     beforeValidateSV870( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsSV870( ) ;
                        O5953Pzsp_A = A5953Pzsp_A ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
                        O5952Kgsp_A = A5952Kgsp_A ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_870 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateSV870( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableSV870( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsSV870( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5953Pzsp_A = A5953Pzsp_A ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
                           O5952Kgsp_A = A5952Kgsp_A ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_870 == 0 )
                  {
                     GXCCtl = "AP_BARCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAp_Barcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_870_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5954Ap_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5955Ap_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_BarPar_Internalname, GXutil.rtrim( A5956Ap_BarPar)) ;
         httpContext.changePostValue( edtAp_ProCod_Internalname, GXutil.rtrim( A5957Ap_ProCod)) ;
         httpContext.changePostValue( edtAp_BarOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A5958Ap_BarOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_Piezas_Internalname, GXutil.ltrim( localUtil.ntoc( A5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5954Ap_Barcod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5954Ap_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5955Ap_BarReo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5955Ap_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5956Ap_BarPar_"+sGXsfl_85_idx, GXutil.rtrim( Z5956Ap_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5957Ap_ProCod_"+sGXsfl_85_idx, GXutil.rtrim( Z5957Ap_ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5958Ap_BarOrd_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5958Ap_BarOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5959Ap_Kilos_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5960Ap_Piezas_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5960Ap_Piezas_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5959Ap_Kilos_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_870_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_870_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_870_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_870 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_870_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_870_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARCOD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Barcod_Title)) ;
            httpContext.changePostValue( "AP_BARCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_PROCOD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_ProCod_Title)) ;
            httpContext.changePostValue( "AP_PROCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_ProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARORD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_BarOrd_Title)) ;
            httpContext.changePostValue( "AP_BARORD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_KILOS_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Kilos_Title)) ;
            httpContext.changePostValue( "AP_KILOS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Kilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_PIEZAS_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Piezas_Title)) ;
            httpContext.changePostValue( "AP_PIEZAS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Piezas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5953Pzsp_A = s5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      O5952Kgsp_A = s5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionSV0( )
   {
   }

   public void e11SV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV24Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV053_", ""), (byte)(99), GXv_char2) ;
      taghdfp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit13", AV24Lit13);
      AV25Lit14 = httpContext.getMessage( "Partida", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit14", AV25Lit14);
      edtAp_Barcod_Title = AV14Lit2 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Title", edtAp_Barcod_Title, !bGXsfl_85_Refreshing);
      edtAp_ProCod_Title = AV15Lit3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Title", edtAp_ProCod_Title, !bGXsfl_85_Refreshing);
      edtAp_BarOrd_Title = AV16Lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Title", edtAp_BarOrd_Title, !bGXsfl_85_Refreshing);
      edtAp_Kilos_Title = AV18Lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Kilos_Internalname, "Title", edtAp_Kilos_Title, !bGXsfl_85_Refreshing);
      edtAp_Piezas_Title = AV19Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Piezas_Internalname, "Title", edtAp_Piezas_Title, !bGXsfl_85_Refreshing);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      taghdfp_impl.this.A396EmprCod = GXv_char2[0] ;
      taghdfp_impl.this.AV11EmprNom = GXv_char3[0] ;
      taghdfp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmSV688( int GX_JID )
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
         Z4643BarFasLot = A4643BarFasLot ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z5952Kgsp_A = A5952Kgsp_A ;
         Z5953Pzsp_A = A5953Pzsp_A ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TAGHDFP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T00SV6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00SV6_A407EmprNom[0] ;
      n407EmprNom = T00SV6_n407EmprNom[0] ;
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

   public void loadSV688( )
   {
      /* Using cursor T00SV13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A460FasDsc = T00SV13_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A407EmprNom = T00SV13_A407EmprNom[0] ;
         n407EmprNom = T00SV13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T00SV13_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A457FasCod = T00SV13_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A5952Kgsp_A = T00SV13_A5952Kgsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         A5953Pzsp_A = T00SV13_A5953Pzsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         zmSV688( -3) ;
      }
      pr_default.close(9);
      onLoadActionsSV688( ) ;
   }

   public void onLoadActionsSV688( )
   {
      O5953Pzsp_A = A5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      O5952Kgsp_A = A5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
   }

   public void checkExtendedTableSV688( )
   {
      nIsDirty_688 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00SV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00SV7_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(5);
      /* Using cursor T00SV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A457FasCod = T00SV8_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      pr_default.close(6);
      /* Using cursor T00SV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00SV9_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(7);
      /* Using cursor T00SV11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A5952Kgsp_A = T00SV11_A5952Kgsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         A5953Pzsp_A = T00SV11_A5953Pzsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      else
      {
         nIsDirty_688 = (short)(1) ;
         A5952Kgsp_A = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         nIsDirty_688 = (short)(1) ;
         A5953Pzsp_A = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursorsSV688( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A758ProCod )
   {
      /* Using cursor T00SV14 */
      pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00SV14_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_6( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A758ProCod ,
                         short A194BarOrdLin )
   {
      /* Using cursor T00SV15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A457FasCod = T00SV15_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_7( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T00SV16 */
      pr_default.execute(12, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00SV16_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_8( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A758ProCod ,
                         short A194BarOrdLin ,
                         int A4643BarFasLot )
   {
      /* Using cursor T00SV18 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A5952Kgsp_A = T00SV18_A5952Kgsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         A5953Pzsp_A = T00SV18_A5953Pzsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      else
      {
         A5952Kgsp_A = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         A5953Pzsp_A = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5952Kgsp_A, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5953Pzsp_A, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKeySV688( )
   {
      /* Using cursor T00SV19 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound688 = (short)(1) ;
      }
      else
      {
         RcdFound688 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00SV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00SV5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmSV688( 3) ;
         RcdFound688 = (short)(1) ;
         A4643BarFasLot = T00SV5_A4643BarFasLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
         A129BarCod = T00SV5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00SV5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00SV5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T00SV5_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00SV5_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         sMode688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadSV688( ) ;
         if ( AnyError == 1 )
         {
            RcdFound688 = (short)(0) ;
            initializeNonKeySV688( ) ;
         }
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound688 = (short)(0) ;
         initializeNonKeySV688( ) ;
         sMode688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeySV688( ) ;
      if ( RcdFound688 == 0 )
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
      RcdFound688 = (short)(0) ;
      /* Using cursor T00SV20 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A4643BarFasLot), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T00SV20_A129BarCod[0] < A129BarCod ) || ( T00SV20_A129BarCod[0] == A129BarCod ) && ( T00SV20_A132BarCodReo[0] < A132BarCodReo ) || ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV20_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00SV20_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( T00SV20_A194BarOrdLin[0] < A194BarOrdLin ) || ( T00SV20_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00SV20_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( T00SV20_A4643BarFasLot[0] < A4643BarFasLot ) ) && ( GXutil.strcmp(T00SV20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T00SV20_A129BarCod[0] > A129BarCod ) || ( T00SV20_A129BarCod[0] == A129BarCod ) && ( T00SV20_A132BarCodReo[0] > A132BarCodReo ) || ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV20_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00SV20_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( T00SV20_A194BarOrdLin[0] > A194BarOrdLin ) || ( T00SV20_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00SV20_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV20_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV20_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV20_A129BarCod[0] == A129BarCod ) && ( T00SV20_A4643BarFasLot[0] > A4643BarFasLot ) ) && ( GXutil.strcmp(T00SV20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T00SV20_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00SV20_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00SV20_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T00SV20_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T00SV20_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4643BarFasLot = T00SV20_A4643BarFasLot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
            RcdFound688 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound688 = (short)(0) ;
      /* Using cursor T00SV21 */
      pr_default.execute(16, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A4643BarFasLot), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T00SV21_A129BarCod[0] > A129BarCod ) || ( T00SV21_A129BarCod[0] == A129BarCod ) && ( T00SV21_A132BarCodReo[0] > A132BarCodReo ) || ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV21_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00SV21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( T00SV21_A194BarOrdLin[0] > A194BarOrdLin ) || ( T00SV21_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00SV21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( T00SV21_A4643BarFasLot[0] > A4643BarFasLot ) ) && ( GXutil.strcmp(T00SV21_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T00SV21_A129BarCod[0] < A129BarCod ) || ( T00SV21_A129BarCod[0] == A129BarCod ) && ( T00SV21_A132BarCodReo[0] < A132BarCodReo ) || ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00SV21_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00SV21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( T00SV21_A194BarOrdLin[0] < A194BarOrdLin ) || ( T00SV21_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00SV21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00SV21_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00SV21_A132BarCodReo[0] == A132BarCodReo ) && ( T00SV21_A129BarCod[0] == A129BarCod ) && ( T00SV21_A4643BarFasLot[0] < A4643BarFasLot ) ) && ( GXutil.strcmp(T00SV21_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T00SV21_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00SV21_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00SV21_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T00SV21_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T00SV21_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4643BarFasLot = T00SV21_A4643BarFasLot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
            RcdFound688 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeySV688( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5953Pzsp_A = O5953Pzsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         A5952Kgsp_A = O5952Kgsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertSV688( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound688 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4643BarFasLot = Z4643BarFasLot ;
               httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5953Pzsp_A = O5953Pzsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
               A5952Kgsp_A = O5952Kgsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A5953Pzsp_A = O5953Pzsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
               A5952Kgsp_A = O5952Kgsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
               updateSV688( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5953Pzsp_A = O5953Pzsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
               A5952Kgsp_A = O5952Kgsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertSV688( ) ;
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
                  A5953Pzsp_A = O5953Pzsp_A ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
                  A5952Kgsp_A = O5952Kgsp_A ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertSV688( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4643BarFasLot = Z4643BarFasLot ;
         httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5953Pzsp_A = O5953Pzsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         A5952Kgsp_A = O5952Kgsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKeySV688( ) ;
      if ( RcdFound688 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = Z758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = Z194BarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4643BarFasLot = Z4643BarFasLot ;
            httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "taghdfp");
   }

   public void insert_check( )
   {
      confirm_SV0( ) ;
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
      if ( RcdFound688 == 0 )
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
      scanStartSV688( ) ;
      if ( RcdFound688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndSV688( ) ;
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
      if ( RcdFound688 == 0 )
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
      if ( RcdFound688 == 0 )
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
      scanStartSV688( ) ;
      if ( RcdFound688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound688 != 0 )
         {
            scanNextSV688( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndSV688( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencySV688( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSV688( )
   {
      beforeValidateSV688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSV688( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSV688( 0) ;
         checkOptimisticConcurrencySV688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSV688( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSV688( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SV22 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A4643BarFasLot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
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
                        processLevelSV688( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionSV0( ) ;
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
            loadSV688( ) ;
         }
         endLevelSV688( ) ;
      }
      closeExtendedTableCursorsSV688( ) ;
   }

   public void updateSV688( )
   {
      beforeValidateSV688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSV688( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySV688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSV688( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateSV688( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPFASMAQ */
                  deferredUpdateSV688( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelSV688( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionSV0( ) ;
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
         endLevelSV688( ) ;
      }
      closeExtendedTableCursorsSV688( ) ;
   }

   public void deferredUpdateSV688( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSV688( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySV688( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSV688( ) ;
         afterConfirmSV688( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSV688( ) ;
            if ( AnyError == 0 )
            {
               A5953Pzsp_A = O5953Pzsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
               A5952Kgsp_A = O5952Kgsp_A ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
               scanStartSV870( ) ;
               while ( RcdFound870 != 0 )
               {
                  getByPrimaryKeySV870( ) ;
                  deleteSV870( ) ;
                  scanNextSV870( ) ;
                  O5953Pzsp_A = A5953Pzsp_A ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
                  O5952Kgsp_A = A5952Kgsp_A ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
               }
               scanEndSV870( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SV23 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound688 == 0 )
                        {
                           initAllSV688( ) ;
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
                        resetCaptionSV0( ) ;
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
      sMode688 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSV688( ) ;
      Gx_mode = sMode688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSV688( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00SV24 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T00SV24_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(19);
         /* Using cursor T00SV25 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         A457FasCod = T00SV25_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         pr_default.close(20);
         /* Using cursor T00SV26 */
         pr_default.execute(21, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00SV26_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(21);
         /* Using cursor T00SV28 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A5952Kgsp_A = T00SV28_A5952Kgsp_A[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
            A5953Pzsp_A = T00SV28_A5953Pzsp_A[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         }
         else
         {
            A5952Kgsp_A = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
            A5953Pzsp_A = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         }
         pr_default.close(22);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00SV29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00SV30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ContPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevelSV870( )
   {
      s5953Pzsp_A = O5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      s5952Kgsp_A = O5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRowSV870( ) ;
         if ( ( nRcdExists_870 != 0 ) || ( nIsMod_870 != 0 ) )
         {
            standaloneNotModalSV870( ) ;
            getKeySV870( ) ;
            if ( ( nRcdExists_870 == 0 ) && ( nRcdDeleted_870 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertSV870( ) ;
            }
            else
            {
               if ( RcdFound870 != 0 )
               {
                  if ( ( nRcdDeleted_870 != 0 ) && ( nRcdExists_870 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteSV870( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_870 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateSV870( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_870 == 0 )
                  {
                     GXCCtl = "AP_BARCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAp_Barcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5953Pzsp_A = A5953Pzsp_A ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
            O5952Kgsp_A = A5952Kgsp_A ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_870_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5954Ap_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5955Ap_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_BarPar_Internalname, GXutil.rtrim( A5956Ap_BarPar)) ;
         httpContext.changePostValue( edtAp_ProCod_Internalname, GXutil.rtrim( A5957Ap_ProCod)) ;
         httpContext.changePostValue( edtAp_BarOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A5958Ap_BarOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAp_Piezas_Internalname, GXutil.ltrim( localUtil.ntoc( A5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5954Ap_Barcod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5954Ap_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5955Ap_BarReo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5955Ap_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5956Ap_BarPar_"+sGXsfl_85_idx, GXutil.rtrim( Z5956Ap_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5957Ap_ProCod_"+sGXsfl_85_idx, GXutil.rtrim( Z5957Ap_ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5958Ap_BarOrd_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5958Ap_BarOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5959Ap_Kilos_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5960Ap_Piezas_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5960Ap_Piezas_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5959Ap_Kilos_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_870_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_870_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_870_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_870 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_870_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_870_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARCOD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Barcod_Title)) ;
            httpContext.changePostValue( "AP_BARCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_PROCOD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_ProCod_Title)) ;
            httpContext.changePostValue( "AP_PROCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_ProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_BARORD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_BarOrd_Title)) ;
            httpContext.changePostValue( "AP_BARORD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_KILOS_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Kilos_Title)) ;
            httpContext.changePostValue( "AP_KILOS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Kilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AP_PIEZAS_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Piezas_Title)) ;
            httpContext.changePostValue( "AP_PIEZAS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Piezas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllSV870( ) ;
      if ( AnyError != 0 )
      {
         O5953Pzsp_A = s5953Pzsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         O5952Kgsp_A = s5952Kgsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      }
      nRcdExists_870 = (short)(0) ;
      nIsMod_870 = (short)(0) ;
      nRcdDeleted_870 = (short)(0) ;
   }

   public void processLevelSV688( )
   {
      /* Save parent mode. */
      sMode688 = Gx_mode ;
      processNestedLevelSV870( ) ;
      if ( AnyError != 0 )
      {
         O5953Pzsp_A = s5953Pzsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         O5952Kgsp_A = s5952Kgsp_A ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelSV688( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteSV688( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "taghdfp");
         if ( AnyError == 0 )
         {
            confirmValuesSV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "taghdfp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartSV688( )
   {
      /* Scan By routine */
      /* Using cursor T00SV31 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound688 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A129BarCod = T00SV31_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00SV31_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00SV31_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T00SV31_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00SV31_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4643BarFasLot = T00SV31_A4643BarFasLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSV688( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound688 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A129BarCod = T00SV31_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00SV31_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00SV31_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T00SV31_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00SV31_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4643BarFasLot = T00SV31_A4643BarFasLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
      }
   }

   public void scanEndSV688( )
   {
      pr_default.close(25);
   }

   public void afterConfirmSV688( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSV688( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSV688( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSV688( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSV688( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSV688( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSV688( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtBarFasLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtKgsp_A_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgsp_A_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgsp_A_Enabled), 5, 0), true);
      edtPzsp_A_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPzsp_A_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPzsp_A_Enabled), 5, 0), true);
   }

   public void zmSV870( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5959Ap_Kilos = T00SV3_A5959Ap_Kilos[0] ;
            Z5960Ap_Piezas = T00SV3_A5960Ap_Piezas[0] ;
         }
         else
         {
            Z5959Ap_Kilos = A5959Ap_Kilos ;
            Z5960Ap_Piezas = A5960Ap_Piezas ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         Z5954Ap_Barcod = A5954Ap_Barcod ;
         Z5955Ap_BarReo = A5955Ap_BarReo ;
         Z5956Ap_BarPar = A5956Ap_BarPar ;
         Z5957Ap_ProCod = A5957Ap_ProCod ;
         Z5958Ap_BarOrd = A5958Ap_BarOrd ;
         Z5959Ap_Kilos = A5959Ap_Kilos ;
         Z5960Ap_Piezas = A5960Ap_Piezas ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModalSV870( )
   {
   }

   public void standaloneModalSV870( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAp_Barcod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Barcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtAp_Barcod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Barcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAp_BarReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtAp_BarReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAp_BarPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtAp_BarPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAp_ProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ProCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtAp_ProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ProCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAp_BarOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarOrd_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtAp_BarOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarOrd_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void loadSV870( )
   {
      /* Using cursor T00SV32 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound870 = (short)(1) ;
         A5959Ap_Kilos = T00SV32_A5959Ap_Kilos[0] ;
         n5959Ap_Kilos = T00SV32_n5959Ap_Kilos[0] ;
         A5960Ap_Piezas = T00SV32_A5960Ap_Piezas[0] ;
         n5960Ap_Piezas = T00SV32_n5960Ap_Piezas[0] ;
         zmSV870( -9) ;
      }
      pr_default.close(26);
      onLoadActionsSV870( ) ;
   }

   public void onLoadActionsSV870( )
   {
      if ( isIns( )  )
      {
         A5952Kgsp_A = O5952Kgsp_A.add(A5959Ap_Kilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5952Kgsp_A = O5952Kgsp_A.add(A5959Ap_Kilos).subtract(O5959Ap_Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5952Kgsp_A = O5952Kgsp_A.subtract(O5959Ap_Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A5953Pzsp_A = (short)(O5953Pzsp_A+A5960Ap_Piezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5953Pzsp_A = (short)(O5953Pzsp_A+A5960Ap_Piezas-O5960Ap_Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5953Pzsp_A = (short)(O5953Pzsp_A-O5960Ap_Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
            }
         }
      }
   }

   public void checkExtendedTableSV870( )
   {
      nIsDirty_870 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalSV870( ) ;
      if ( isIns( )  )
      {
         nIsDirty_870 = (short)(1) ;
         A5952Kgsp_A = O5952Kgsp_A.add(A5959Ap_Kilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_870 = (short)(1) ;
            A5952Kgsp_A = O5952Kgsp_A.add(A5959Ap_Kilos).subtract(O5959Ap_Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_870 = (short)(1) ;
               A5952Kgsp_A = O5952Kgsp_A.subtract(O5959Ap_Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_870 = (short)(1) ;
         A5953Pzsp_A = (short)(O5953Pzsp_A+A5960Ap_Piezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_870 = (short)(1) ;
            A5953Pzsp_A = (short)(O5953Pzsp_A+A5960Ap_Piezas-O5960Ap_Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_870 = (short)(1) ;
               A5953Pzsp_A = (short)(O5953Pzsp_A-O5960Ap_Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursorsSV870( )
   {
   }

   public void enableDisableSV870( )
   {
   }

   public void getKeySV870( )
   {
      /* Using cursor T00SV33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound870 = (short)(1) ;
      }
      else
      {
         RcdFound870 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKeySV870( )
   {
      /* Using cursor T00SV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00SV3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmSV870( 9) ;
         RcdFound870 = (short)(1) ;
         initializeNonKeySV870( ) ;
         A5954Ap_Barcod = T00SV3_A5954Ap_Barcod[0] ;
         A5955Ap_BarReo = T00SV3_A5955Ap_BarReo[0] ;
         A5956Ap_BarPar = T00SV3_A5956Ap_BarPar[0] ;
         A5957Ap_ProCod = T00SV3_A5957Ap_ProCod[0] ;
         A5958Ap_BarOrd = T00SV3_A5958Ap_BarOrd[0] ;
         A5959Ap_Kilos = T00SV3_A5959Ap_Kilos[0] ;
         n5959Ap_Kilos = T00SV3_n5959Ap_Kilos[0] ;
         A5960Ap_Piezas = T00SV3_A5960Ap_Piezas[0] ;
         n5960Ap_Piezas = T00SV3_n5960Ap_Piezas[0] ;
         O5960Ap_Piezas = A5960Ap_Piezas ;
         n5960Ap_Piezas = false ;
         O5959Ap_Kilos = A5959Ap_Kilos ;
         n5959Ap_Kilos = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         Z5954Ap_Barcod = A5954Ap_Barcod ;
         Z5955Ap_BarReo = A5955Ap_BarReo ;
         Z5956Ap_BarPar = A5956Ap_BarPar ;
         Z5957Ap_ProCod = A5957Ap_ProCod ;
         Z5958Ap_BarOrd = A5958Ap_BarOrd ;
         sMode870 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSV870( ) ;
         loadSV870( ) ;
         Gx_mode = sMode870 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound870 = (short)(0) ;
         initializeNonKeySV870( ) ;
         sMode870 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSV870( ) ;
         Gx_mode = sMode870 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesSV870( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencySV870( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAGHDFP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5959Ap_Kilos, T00SV2_A5959Ap_Kilos[0]) != 0 ) || ( Z5960Ap_Piezas != T00SV2_A5960Ap_Piezas[0] ) )
         {
            if ( DecimalUtil.compareTo(Z5959Ap_Kilos, T00SV2_A5959Ap_Kilos[0]) != 0 )
            {
               GXutil.writeLogln("taghdfp:[seudo value changed for attri]"+"Ap_Kilos");
               GXutil.writeLogRaw("Old: ",Z5959Ap_Kilos);
               GXutil.writeLogRaw("Current: ",T00SV2_A5959Ap_Kilos[0]);
            }
            if ( Z5960Ap_Piezas != T00SV2_A5960Ap_Piezas[0] )
            {
               GXutil.writeLogln("taghdfp:[seudo value changed for attri]"+"Ap_Piezas");
               GXutil.writeLogRaw("Old: ",Z5960Ap_Piezas);
               GXutil.writeLogRaw("Current: ",T00SV2_A5960Ap_Piezas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAGHDFP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSV870( )
   {
      beforeValidateSV870( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSV870( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSV870( 0) ;
         checkOptimisticConcurrencySV870( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSV870( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSV870( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SV34 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd), Boolean.valueOf(n5959Ap_Kilos), A5959Ap_Kilos, Boolean.valueOf(n5960Ap_Piezas), Short.valueOf(A5960Ap_Piezas), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAGHDFP");
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
            loadSV870( ) ;
         }
         endLevelSV870( ) ;
      }
      closeExtendedTableCursorsSV870( ) ;
   }

   public void updateSV870( )
   {
      beforeValidateSV870( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSV870( ) ;
      }
      if ( ( nIsMod_870 != 0 ) || ( nIsDirty_870 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencySV870( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmSV870( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateSV870( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00SV35 */
                     pr_default.execute(29, new Object[] {Boolean.valueOf(n5959Ap_Kilos), A5959Ap_Kilos, Boolean.valueOf(n5960Ap_Piezas), Short.valueOf(A5960Ap_Piezas), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAGHDFP");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAGHDFP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateSV870( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeySV870( ) ;
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
            endLevelSV870( ) ;
         }
      }
      closeExtendedTableCursorsSV870( ) ;
   }

   public void deferredUpdateSV870( )
   {
   }

   public void deleteSV870( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSV870( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySV870( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSV870( ) ;
         afterConfirmSV870( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSV870( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SV36 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Integer.valueOf(A5954Ap_Barcod), Byte.valueOf(A5955Ap_BarReo), A5956Ap_BarPar, A5957Ap_ProCod, Short.valueOf(A5958Ap_BarOrd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAGHDFP");
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
      sMode870 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSV870( ) ;
      Gx_mode = sMode870 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSV870( )
   {
      standaloneModalSV870( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A5952Kgsp_A = O5952Kgsp_A.add(A5959Ap_Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5952Kgsp_A = O5952Kgsp_A.add(A5959Ap_Kilos).subtract(O5959Ap_Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5952Kgsp_A = O5952Kgsp_A.subtract(O5959Ap_Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A5953Pzsp_A = (short)(O5953Pzsp_A+A5960Ap_Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5953Pzsp_A = (short)(O5953Pzsp_A+A5960Ap_Piezas-O5960Ap_Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5953Pzsp_A = (short)(O5953Pzsp_A-O5960Ap_Piezas) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
               }
            }
         }
      }
   }

   public void endLevelSV870( )
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

   public void scanStartSV870( )
   {
      /* Scan By routine */
      /* Using cursor T00SV37 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      RcdFound870 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound870 = (short)(1) ;
         A5954Ap_Barcod = T00SV37_A5954Ap_Barcod[0] ;
         A5955Ap_BarReo = T00SV37_A5955Ap_BarReo[0] ;
         A5956Ap_BarPar = T00SV37_A5956Ap_BarPar[0] ;
         A5957Ap_ProCod = T00SV37_A5957Ap_ProCod[0] ;
         A5958Ap_BarOrd = T00SV37_A5958Ap_BarOrd[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSV870( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound870 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound870 = (short)(1) ;
         A5954Ap_Barcod = T00SV37_A5954Ap_Barcod[0] ;
         A5955Ap_BarReo = T00SV37_A5955Ap_BarReo[0] ;
         A5956Ap_BarPar = T00SV37_A5956Ap_BarPar[0] ;
         A5957Ap_ProCod = T00SV37_A5957Ap_ProCod[0] ;
         A5958Ap_BarOrd = T00SV37_A5958Ap_BarOrd[0] ;
      }
   }

   public void scanEndSV870( )
   {
      pr_default.close(31);
   }

   public void afterConfirmSV870( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSV870( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSV870( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSV870( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSV870( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSV870( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSV870( )
   {
      edtAp_Barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Barcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_BarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_BarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_ProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ProCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_BarOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarOrd_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_Kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Kilos_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_Piezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Piezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Piezas_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashesSV870( )
   {
   }

   public void send_integrity_lvl_hashesSV688( )
   {
   }

   public void subsflControlProps_85870( )
   {
      edtavnRcdDeleted_870_Internalname = "vNRCDDELETED_870_"+sGXsfl_85_idx ;
      edtAp_Barcod_Internalname = "AP_BARCOD_"+sGXsfl_85_idx ;
      edtAp_BarReo_Internalname = "AP_BARREO_"+sGXsfl_85_idx ;
      edtAp_BarPar_Internalname = "AP_BARPAR_"+sGXsfl_85_idx ;
      edtAp_ProCod_Internalname = "AP_PROCOD_"+sGXsfl_85_idx ;
      edtAp_BarOrd_Internalname = "AP_BARORD_"+sGXsfl_85_idx ;
      edtAp_Kilos_Internalname = "AP_KILOS_"+sGXsfl_85_idx ;
      edtAp_Piezas_Internalname = "AP_PIEZAS_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_85870( )
   {
      edtavnRcdDeleted_870_Internalname = "vNRCDDELETED_870_"+sGXsfl_85_fel_idx ;
      edtAp_Barcod_Internalname = "AP_BARCOD_"+sGXsfl_85_fel_idx ;
      edtAp_BarReo_Internalname = "AP_BARREO_"+sGXsfl_85_fel_idx ;
      edtAp_BarPar_Internalname = "AP_BARPAR_"+sGXsfl_85_fel_idx ;
      edtAp_ProCod_Internalname = "AP_PROCOD_"+sGXsfl_85_fel_idx ;
      edtAp_BarOrd_Internalname = "AP_BARORD_"+sGXsfl_85_fel_idx ;
      edtAp_Kilos_Internalname = "AP_KILOS_"+sGXsfl_85_fel_idx ;
      edtAp_Piezas_Internalname = "AP_PIEZAS_"+sGXsfl_85_fel_idx ;
   }

   public void addRowSV870( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85870( ) ;
      sendRowSV870( ) ;
   }

   public void sendRowSV870( )
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_870_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_870_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_870), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_870), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_870_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_870_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_Barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A5954Ap_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5954Ap_Barcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_Barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_Barcod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_BarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5955Ap_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5955Ap_BarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_BarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_BarReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_BarPar_Internalname,GXutil.rtrim( A5956Ap_BarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_BarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_BarPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_ProCod_Internalname,GXutil.rtrim( A5957Ap_ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_ProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_ProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_BarOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A5958Ap_BarOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5958Ap_BarOrd), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_BarOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_BarOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_Kilos_Internalname,GXutil.ltrim( localUtil.ntoc( A5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAp_Kilos_Enabled!=0) ? localUtil.format( A5959Ap_Kilos, "ZZZZZ9.99") : localUtil.format( A5959Ap_Kilos, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_Kilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_Kilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_870_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAp_Piezas_Internalname,GXutil.ltrim( localUtil.ntoc( A5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAp_Piezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5960Ap_Piezas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5960Ap_Piezas), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAp_Piezas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAp_Piezas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesSV870( ) ;
      GXCCtl = "Z5954Ap_Barcod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5954Ap_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5955Ap_BarReo_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5955Ap_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5956Ap_BarPar_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5956Ap_BarPar));
      GXCCtl = "Z5957Ap_ProCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5957Ap_ProCod));
      GXCCtl = "Z5958Ap_BarOrd_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5958Ap_BarOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5959Ap_Kilos_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5960Ap_Piezas_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5960Ap_Piezas_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5960Ap_Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5959Ap_Kilos_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5959Ap_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_870_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_870_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_870_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_870, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_870_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_870_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_BARCOD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Barcod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_BARCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_BARREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_BARPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_PROCOD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_ProCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_PROCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_ProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_BARORD_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_BarOrd_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_BARORD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_KILOS_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Kilos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_KILOS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_PIEZAS_"+sGXsfl_85_idx+"Title", GXutil.rtrim( edtAp_Piezas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "AP_PIEZAS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Piezas_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowSV870( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85870( ) ;
      edtavnRcdDeleted_870_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_870_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_Barcod_Title = httpContext.cgiGet( "AP_BARCOD_"+sGXsfl_85_idx+"Title") ;
      edtAp_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARREO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARPAR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_ProCod_Title = httpContext.cgiGet( "AP_PROCOD_"+sGXsfl_85_idx+"Title") ;
      edtAp_ProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_PROCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_BarOrd_Title = httpContext.cgiGet( "AP_BARORD_"+sGXsfl_85_idx+"Title") ;
      edtAp_BarOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_BARORD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_Kilos_Title = httpContext.cgiGet( "AP_KILOS_"+sGXsfl_85_idx+"Title") ;
      edtAp_Kilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_KILOS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAp_Piezas_Title = httpContext.cgiGet( "AP_PIEZAS_"+sGXsfl_85_idx+"Title") ;
      edtAp_Piezas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AP_PIEZAS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_870_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_870_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_870");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_870_Internalname ;
         wbErr = true ;
         nRcdDeleted_870 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_870 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_870_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "AP_BARCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAp_Barcod_Internalname ;
         wbErr = true ;
         A5954Ap_Barcod = 0 ;
      }
      else
      {
         A5954Ap_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtAp_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "AP_BARREO_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAp_BarReo_Internalname ;
         wbErr = true ;
         A5955Ap_BarReo = (byte)(0) ;
      }
      else
      {
         A5955Ap_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtAp_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5956Ap_BarPar = httpContext.cgiGet( edtAp_BarPar_Internalname) ;
      A5957Ap_ProCod = httpContext.cgiGet( edtAp_ProCod_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_BarOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_BarOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "AP_BARORD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAp_BarOrd_Internalname ;
         wbErr = true ;
         A5958Ap_BarOrd = (short)(0) ;
      }
      else
      {
         A5958Ap_BarOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtAp_BarOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAp_Kilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAp_Kilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "AP_KILOS_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAp_Kilos_Internalname ;
         wbErr = true ;
         A5959Ap_Kilos = DecimalUtil.ZERO ;
         n5959Ap_Kilos = false ;
      }
      else
      {
         A5959Ap_Kilos = localUtil.ctond( httpContext.cgiGet( edtAp_Kilos_Internalname)) ;
         n5959Ap_Kilos = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Piezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAp_Piezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "AP_PIEZAS_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAp_Piezas_Internalname ;
         wbErr = true ;
         A5960Ap_Piezas = (short)(0) ;
         n5960Ap_Piezas = false ;
      }
      else
      {
         A5960Ap_Piezas = (short)(localUtil.ctol( httpContext.cgiGet( edtAp_Piezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5960Ap_Piezas = false ;
      }
      GXCCtl = "Z5954Ap_Barcod_" + sGXsfl_85_idx ;
      Z5954Ap_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5955Ap_BarReo_" + sGXsfl_85_idx ;
      Z5955Ap_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5956Ap_BarPar_" + sGXsfl_85_idx ;
      Z5956Ap_BarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5957Ap_ProCod_" + sGXsfl_85_idx ;
      Z5957Ap_ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5958Ap_BarOrd_" + sGXsfl_85_idx ;
      Z5958Ap_BarOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5959Ap_Kilos_" + sGXsfl_85_idx ;
      Z5959Ap_Kilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5960Ap_Piezas_" + sGXsfl_85_idx ;
      Z5960Ap_Piezas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5960Ap_Piezas_" + sGXsfl_85_idx ;
      O5960Ap_Piezas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5959Ap_Kilos_" + sGXsfl_85_idx ;
      O5959Ap_Kilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_870_" + sGXsfl_85_idx ;
      nRcdDeleted_870 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_870_" + sGXsfl_85_idx ;
      nRcdExists_870 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_870_" + sGXsfl_85_idx ;
      nIsMod_870 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAp_BarOrd_Enabled = edtAp_BarOrd_Enabled ;
      defedtAp_ProCod_Enabled = edtAp_ProCod_Enabled ;
      defedtAp_BarPar_Enabled = edtAp_BarPar_Enabled ;
      defedtAp_BarReo_Enabled = edtAp_BarReo_Enabled ;
      defedtAp_Barcod_Enabled = edtAp_Barcod_Enabled ;
   }

   public void confirmValuesSV0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85870( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85870( ) ;
         httpContext.changePostValue( "Z5954Ap_Barcod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5954Ap_Barcod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5954Ap_Barcod_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z5955Ap_BarReo_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5955Ap_BarReo_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5955Ap_BarReo_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z5956Ap_BarPar_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5956Ap_BarPar_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5956Ap_BarPar_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z5957Ap_ProCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5957Ap_ProCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5957Ap_ProCod_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z5958Ap_BarOrd_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5958Ap_BarOrd_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5958Ap_BarOrd_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z5959Ap_Kilos_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5959Ap_Kilos_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5959Ap_Kilos_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z5960Ap_Piezas_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z5960Ap_Piezas_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5960Ap_Piezas_"+sGXsfl_85_idx) ;
      }
      httpContext.changePostValue( "O5960Ap_Piezas", httpContext.cgiGet( "T5960Ap_Piezas")) ;
      httpContext.deletePostValue( "T5960Ap_Piezas") ;
      httpContext.changePostValue( "O5959Ap_Kilos", httpContext.cgiGet( "T5959Ap_Kilos")) ;
      httpContext.deletePostValue( "T5959Ap_Kilos") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.taghdfp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4643BarFasLot", GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5953Pzsp_A", GXutil.ltrim( localUtil.ntoc( O5953Pzsp_A, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5952Kgsp_A", GXutil.ltrim( localUtil.ntoc( O5952Kgsp_A, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.taghdfp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TAGHDFP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AGRUPACION P/HDR+PARTIDA", "") ;
   }

   public void initializeNonKeySV688( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A5952Kgsp_A = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
      A5953Pzsp_A = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      O5953Pzsp_A = A5953Pzsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      O5952Kgsp_A = A5952Kgsp_A ;
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
   }

   public void initAllSV688( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      A4643BarFasLot = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
      initializeNonKeySV688( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeySV870( )
   {
      A5959Ap_Kilos = DecimalUtil.ZERO ;
      n5959Ap_Kilos = false ;
      A5960Ap_Piezas = (short)(0) ;
      n5960Ap_Piezas = false ;
      O5960Ap_Piezas = A5960Ap_Piezas ;
      n5960Ap_Piezas = false ;
      O5959Ap_Kilos = A5959Ap_Kilos ;
      n5959Ap_Kilos = false ;
      Z5959Ap_Kilos = DecimalUtil.ZERO ;
      Z5960Ap_Piezas = (short)(0) ;
   }

   public void initAllSV870( )
   {
      A5954Ap_Barcod = 0 ;
      A5955Ap_BarReo = (byte)(0) ;
      A5956Ap_BarPar = "" ;
      A5957Ap_ProCod = "" ;
      A5958Ap_BarOrd = (short)(0) ;
      initializeNonKeySV870( ) ;
   }

   public void standaloneModalInsertSV870( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525591", true, true);
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
      httpContext.AddJavascriptSource("taghdfp.js", "?20268241525591", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties870( )
   {
      edtAp_BarOrd_Enabled = defedtAp_BarOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarOrd_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_ProCod_Enabled = defedtAp_ProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_ProCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_BarPar_Enabled = defedtAp_BarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_BarReo_Enabled = defedtAp_BarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_BarReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAp_Barcod_Enabled = defedtAp_Barcod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAp_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAp_Barcod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void startgridcontrol85( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_870, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_870_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5954Ap_Barcod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtAp_Barcod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5955Ap_BarReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5956Ap_BarPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5957Ap_ProCod));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtAp_ProCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_ProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5958Ap_BarOrd, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtAp_BarOrd_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_BarOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5959Ap_Kilos, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtAp_Kilos_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5960Ap_Piezas, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtAp_Piezas_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAp_Piezas_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarFasLot_Internalname = "BARFASLOT" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtKgsp_A_Internalname = "KGSP_A" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPzsp_A_Internalname = "PZSP_A" ;
      edtavnRcdDeleted_870_Internalname = "vNRCDDELETED_870" ;
      edtAp_Barcod_Internalname = "AP_BARCOD" ;
      edtAp_BarReo_Internalname = "AP_BARREO" ;
      edtAp_BarPar_Internalname = "AP_BARPAR" ;
      edtAp_ProCod_Internalname = "AP_PROCOD" ;
      edtAp_BarOrd_Internalname = "AP_BARORD" ;
      edtAp_Kilos_Internalname = "AP_KILOS" ;
      edtAp_Piezas_Internalname = "AP_PIEZAS" ;
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
      Form.setCaption( httpContext.getMessage( "AGRUPACION P/HDR+PARTIDA", "") );
      edtAp_Piezas_Jsonclick = "" ;
      edtAp_Kilos_Jsonclick = "" ;
      edtAp_BarOrd_Jsonclick = "" ;
      edtAp_ProCod_Jsonclick = "" ;
      edtAp_BarPar_Jsonclick = "" ;
      edtAp_BarReo_Jsonclick = "" ;
      edtAp_Barcod_Jsonclick = "" ;
      edtavnRcdDeleted_870_Jsonclick = "" ;
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
      edtAp_Piezas_Enabled = 1 ;
      edtAp_Kilos_Enabled = 1 ;
      edtAp_BarOrd_Enabled = 1 ;
      edtAp_ProCod_Enabled = 1 ;
      edtAp_BarPar_Enabled = 1 ;
      edtAp_BarReo_Enabled = 1 ;
      edtAp_Barcod_Enabled = 1 ;
      edtavnRcdDeleted_870_Enabled = 1 ;
      edtPzsp_A_Jsonclick = "" ;
      edtPzsp_A_Backcolor = (int)(0xFFFFFF) ;
      edtPzsp_A_Enabled = 0 ;
      edtKgsp_A_Jsonclick = "" ;
      edtKgsp_A_Backcolor = (int)(0xFFFFFF) ;
      edtKgsp_A_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarFasLot_Jsonclick = "" ;
      edtBarFasLot_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasLot_Enabled = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      edtAp_Piezas_Title = httpContext.getMessage( "Piezas Agrupadas", "") ;
      edtAp_Kilos_Title = httpContext.getMessage( "Kilos Agrupados", "") ;
      edtAp_BarOrd_Title = httpContext.getMessage( "Orden fase", "") ;
      edtAp_ProCod_Title = httpContext.getMessage( "Proceso", "") ;
      edtAp_Barcod_Title = httpContext.getMessage( "Hdr", "") ;
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
      subsflControlProps_85870( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalSV870( ) ;
         standaloneModalSV870( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowSV870( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85870( ) ;
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
      /* Using cursor T00SV38 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00SV38_A407EmprNom[0] ;
      n407EmprNom = T00SV38_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      /* Using cursor T00SV24 */
      pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00SV24_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(19);
      /* Using cursor T00SV25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A457FasCod = T00SV25_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      pr_default.close(20);
      /* Using cursor T00SV26 */
      pr_default.execute(21, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00SV26_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(21);
      /* Using cursor T00SV28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A5952Kgsp_A = T00SV28_A5952Kgsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         A5953Pzsp_A = T00SV28_A5953Pzsp_A[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      else
      {
         A5952Kgsp_A = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrimstr( A5952Kgsp_A, 9, 2));
         A5953Pzsp_A = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5953Pzsp_A), 4, 0));
      }
      pr_default.close(22);
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

   public void valid_Procod( )
   {
      /* Using cursor T00SV24 */
      pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00SV24_A759ProDsc[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Barordlin( )
   {
      /* Using cursor T00SV25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A457FasCod = T00SV25_A457FasCod[0] ;
      pr_default.close(20);
      /* Using cursor T00SV26 */
      pr_default.execute(21, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00SV26_A460FasDsc[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Barfaslot( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00SV28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A5952Kgsp_A = T00SV28_A5952Kgsp_A[0] ;
         A5953Pzsp_A = T00SV28_A5953Pzsp_A[0] ;
      }
      else
      {
         A5952Kgsp_A = DecimalUtil.doubleToDec(0) ;
         A5953Pzsp_A = (short)(0) ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5952Kgsp_A", GXutil.ltrim( localUtil.ntoc( A5952Kgsp_A, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5953Pzsp_A", GXutil.ltrim( localUtil.ntoc( A5953Pzsp_A, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4643BarFasLot", GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5952Kgsp_A", GXutil.ltrim( localUtil.ntoc( Z5952Kgsp_A, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5953Pzsp_A", GXutil.ltrim( localUtil.ntoc( Z5953Pzsp_A, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5953Pzsp_A", GXutil.ltrim( localUtil.ntoc( O5953Pzsp_A, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5952Kgsp_A", GXutil.ltrim( localUtil.ntoc( O5952Kgsp_A, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_BARFASLOT","{handler:'valid_Barfaslot',iparms:[{av:'edtAp_Piezas_Title',ctrl:'AP_PIEZAS',prop:'Title'},{av:'edtAp_Kilos_Title',ctrl:'AP_KILOS',prop:'Title'},{av:'edtAp_BarOrd_Title',ctrl:'AP_BARORD',prop:'Title'},{av:'edtAp_ProCod_Title',ctrl:'AP_PROCOD',prop:'Title'},{av:'edtAp_Barcod_Title',ctrl:'AP_BARCOD',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4643BarFasLot',fld:'BARFASLOT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARFASLOT",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A5952Kgsp_A',fld:'KGSP_A',pic:'ZZZZZ9.99'},{av:'A5953Pzsp_A',fld:'PZSP_A',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4643BarFasLot'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z457FasCod'},{av:'Z460FasDsc'},{av:'Z5952Kgsp_A'},{av:'Z5953Pzsp_A'},{av:'O5953Pzsp_A'},{av:'O5952Kgsp_A'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_AP_BARCOD","{handler:'valid_Ap_barcod',iparms:[]");
      setEventMetadata("VALID_AP_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_AP_BARREO","{handler:'valid_Ap_barreo',iparms:[]");
      setEventMetadata("VALID_AP_BARREO",",oparms:[]}");
      setEventMetadata("VALID_AP_BARPAR","{handler:'valid_Ap_barpar',iparms:[]");
      setEventMetadata("VALID_AP_BARPAR",",oparms:[]}");
      setEventMetadata("VALID_AP_PROCOD","{handler:'valid_Ap_procod',iparms:[]");
      setEventMetadata("VALID_AP_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_AP_BARORD","{handler:'valid_Ap_barord',iparms:[]");
      setEventMetadata("VALID_AP_BARORD",",oparms:[]}");
      setEventMetadata("VALID_AP_KILOS","{handler:'valid_Ap_kilos',iparms:[]");
      setEventMetadata("VALID_AP_KILOS",",oparms:[]}");
      setEventMetadata("VALID_AP_PIEZAS","{handler:'valid_Ap_piezas',iparms:[]");
      setEventMetadata("VALID_AP_PIEZAS",",oparms:[]}");
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
      pr_default.close(20);
      pr_default.close(32);
      pr_default.close(19);
      pr_default.close(21);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      O5952Kgsp_A = DecimalUtil.ZERO ;
      Z5956Ap_BarPar = "" ;
      Z5957Ap_ProCod = "" ;
      Z5959Ap_Kilos = DecimalUtil.ZERO ;
      O5959Ap_Kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A5952Kgsp_A = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B5952Kgsp_A = DecimalUtil.ZERO ;
      sMode870 = "" ;
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
      sMode688 = "" ;
      s5952Kgsp_A = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A5956Ap_BarPar = "" ;
      A5957Ap_ProCod = "" ;
      A5959Ap_Kilos = DecimalUtil.ZERO ;
      T5959Ap_Kilos = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV24Lit13 = "" ;
      GXt_char1 = "" ;
      AV25Lit14 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      Z457FasCod = "" ;
      Z460FasDsc = "" ;
      Z5952Kgsp_A = DecimalUtil.ZERO ;
      T00SV6_A407EmprNom = new String[] {""} ;
      T00SV6_n407EmprNom = new boolean[] {false} ;
      T00SV13_A4643BarFasLot = new int[1] ;
      T00SV13_A460FasDsc = new String[] {""} ;
      T00SV13_A407EmprNom = new String[] {""} ;
      T00SV13_n407EmprNom = new boolean[] {false} ;
      T00SV13_A759ProDsc = new String[] {""} ;
      T00SV13_A396EmprCod = new String[] {""} ;
      T00SV13_A129BarCod = new int[1] ;
      T00SV13_A132BarCodReo = new byte[1] ;
      T00SV13_A130BarCodPar = new String[] {""} ;
      T00SV13_A758ProCod = new String[] {""} ;
      T00SV13_A194BarOrdLin = new short[1] ;
      T00SV13_A457FasCod = new String[] {""} ;
      T00SV13_A5952Kgsp_A = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV13_A5953Pzsp_A = new short[1] ;
      T00SV7_A759ProDsc = new String[] {""} ;
      T00SV8_A457FasCod = new String[] {""} ;
      T00SV9_A460FasDsc = new String[] {""} ;
      T00SV11_A5952Kgsp_A = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV11_A5953Pzsp_A = new short[1] ;
      T00SV14_A759ProDsc = new String[] {""} ;
      T00SV15_A457FasCod = new String[] {""} ;
      T00SV16_A460FasDsc = new String[] {""} ;
      T00SV18_A5952Kgsp_A = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV18_A5953Pzsp_A = new short[1] ;
      T00SV19_A396EmprCod = new String[] {""} ;
      T00SV19_A129BarCod = new int[1] ;
      T00SV19_A132BarCodReo = new byte[1] ;
      T00SV19_A130BarCodPar = new String[] {""} ;
      T00SV19_A758ProCod = new String[] {""} ;
      T00SV19_A194BarOrdLin = new short[1] ;
      T00SV19_A4643BarFasLot = new int[1] ;
      T00SV5_A4643BarFasLot = new int[1] ;
      T00SV5_A396EmprCod = new String[] {""} ;
      T00SV5_A129BarCod = new int[1] ;
      T00SV5_A132BarCodReo = new byte[1] ;
      T00SV5_A130BarCodPar = new String[] {""} ;
      T00SV5_A758ProCod = new String[] {""} ;
      T00SV5_A194BarOrdLin = new short[1] ;
      T00SV20_A396EmprCod = new String[] {""} ;
      T00SV20_A129BarCod = new int[1] ;
      T00SV20_A132BarCodReo = new byte[1] ;
      T00SV20_A130BarCodPar = new String[] {""} ;
      T00SV20_A758ProCod = new String[] {""} ;
      T00SV20_A194BarOrdLin = new short[1] ;
      T00SV20_A4643BarFasLot = new int[1] ;
      T00SV21_A396EmprCod = new String[] {""} ;
      T00SV21_A129BarCod = new int[1] ;
      T00SV21_A132BarCodReo = new byte[1] ;
      T00SV21_A130BarCodPar = new String[] {""} ;
      T00SV21_A758ProCod = new String[] {""} ;
      T00SV21_A194BarOrdLin = new short[1] ;
      T00SV21_A4643BarFasLot = new int[1] ;
      T00SV4_A4643BarFasLot = new int[1] ;
      T00SV4_A396EmprCod = new String[] {""} ;
      T00SV4_A129BarCod = new int[1] ;
      T00SV4_A132BarCodReo = new byte[1] ;
      T00SV4_A130BarCodPar = new String[] {""} ;
      T00SV4_A758ProCod = new String[] {""} ;
      T00SV4_A194BarOrdLin = new short[1] ;
      T00SV24_A759ProDsc = new String[] {""} ;
      T00SV25_A457FasCod = new String[] {""} ;
      T00SV26_A460FasDsc = new String[] {""} ;
      T00SV28_A5952Kgsp_A = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV28_A5953Pzsp_A = new short[1] ;
      T00SV29_A396EmprCod = new String[] {""} ;
      T00SV29_A129BarCod = new int[1] ;
      T00SV29_A132BarCodReo = new byte[1] ;
      T00SV29_A130BarCodPar = new String[] {""} ;
      T00SV29_A758ProCod = new String[] {""} ;
      T00SV29_A194BarOrdLin = new short[1] ;
      T00SV29_A4643BarFasLot = new int[1] ;
      T00SV29_A10084BarPFcod = new short[1] ;
      T00SV30_A396EmprCod = new String[] {""} ;
      T00SV30_A129BarCod = new int[1] ;
      T00SV30_A132BarCodReo = new byte[1] ;
      T00SV30_A130BarCodPar = new String[] {""} ;
      T00SV30_A758ProCod = new String[] {""} ;
      T00SV30_A194BarOrdLin = new short[1] ;
      T00SV30_A4643BarFasLot = new int[1] ;
      T00SV30_A6579DataReg = new java.util.Date[] {GXutil.nullDate()} ;
      T00SV30_A6574Turno = new byte[1] ;
      T00SV30_A6580Seccao = new byte[1] ;
      T00SV30_A6577FuncCod = new int[1] ;
      T00SV31_A396EmprCod = new String[] {""} ;
      T00SV31_A129BarCod = new int[1] ;
      T00SV31_A132BarCodReo = new byte[1] ;
      T00SV31_A130BarCodPar = new String[] {""} ;
      T00SV31_A758ProCod = new String[] {""} ;
      T00SV31_A194BarOrdLin = new short[1] ;
      T00SV31_A4643BarFasLot = new int[1] ;
      T00SV32_A129BarCod = new int[1] ;
      T00SV32_A132BarCodReo = new byte[1] ;
      T00SV32_A130BarCodPar = new String[] {""} ;
      T00SV32_A194BarOrdLin = new short[1] ;
      T00SV32_A4643BarFasLot = new int[1] ;
      T00SV32_A5954Ap_Barcod = new int[1] ;
      T00SV32_A5955Ap_BarReo = new byte[1] ;
      T00SV32_A5956Ap_BarPar = new String[] {""} ;
      T00SV32_A5957Ap_ProCod = new String[] {""} ;
      T00SV32_A5958Ap_BarOrd = new short[1] ;
      T00SV32_A5959Ap_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV32_n5959Ap_Kilos = new boolean[] {false} ;
      T00SV32_A5960Ap_Piezas = new short[1] ;
      T00SV32_n5960Ap_Piezas = new boolean[] {false} ;
      T00SV32_A396EmprCod = new String[] {""} ;
      T00SV32_A758ProCod = new String[] {""} ;
      T00SV33_A396EmprCod = new String[] {""} ;
      T00SV33_A129BarCod = new int[1] ;
      T00SV33_A132BarCodReo = new byte[1] ;
      T00SV33_A130BarCodPar = new String[] {""} ;
      T00SV33_A758ProCod = new String[] {""} ;
      T00SV33_A194BarOrdLin = new short[1] ;
      T00SV33_A4643BarFasLot = new int[1] ;
      T00SV33_A5954Ap_Barcod = new int[1] ;
      T00SV33_A5955Ap_BarReo = new byte[1] ;
      T00SV33_A5956Ap_BarPar = new String[] {""} ;
      T00SV33_A5957Ap_ProCod = new String[] {""} ;
      T00SV33_A5958Ap_BarOrd = new short[1] ;
      T00SV3_A129BarCod = new int[1] ;
      T00SV3_A132BarCodReo = new byte[1] ;
      T00SV3_A130BarCodPar = new String[] {""} ;
      T00SV3_A194BarOrdLin = new short[1] ;
      T00SV3_A4643BarFasLot = new int[1] ;
      T00SV3_A5954Ap_Barcod = new int[1] ;
      T00SV3_A5955Ap_BarReo = new byte[1] ;
      T00SV3_A5956Ap_BarPar = new String[] {""} ;
      T00SV3_A5957Ap_ProCod = new String[] {""} ;
      T00SV3_A5958Ap_BarOrd = new short[1] ;
      T00SV3_A5959Ap_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV3_n5959Ap_Kilos = new boolean[] {false} ;
      T00SV3_A5960Ap_Piezas = new short[1] ;
      T00SV3_n5960Ap_Piezas = new boolean[] {false} ;
      T00SV3_A396EmprCod = new String[] {""} ;
      T00SV3_A758ProCod = new String[] {""} ;
      T00SV2_A129BarCod = new int[1] ;
      T00SV2_A132BarCodReo = new byte[1] ;
      T00SV2_A130BarCodPar = new String[] {""} ;
      T00SV2_A194BarOrdLin = new short[1] ;
      T00SV2_A4643BarFasLot = new int[1] ;
      T00SV2_A5954Ap_Barcod = new int[1] ;
      T00SV2_A5955Ap_BarReo = new byte[1] ;
      T00SV2_A5956Ap_BarPar = new String[] {""} ;
      T00SV2_A5957Ap_ProCod = new String[] {""} ;
      T00SV2_A5958Ap_BarOrd = new short[1] ;
      T00SV2_A5959Ap_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SV2_n5959Ap_Kilos = new boolean[] {false} ;
      T00SV2_A5960Ap_Piezas = new short[1] ;
      T00SV2_n5960Ap_Piezas = new boolean[] {false} ;
      T00SV2_A396EmprCod = new String[] {""} ;
      T00SV2_A758ProCod = new String[] {""} ;
      T00SV37_A396EmprCod = new String[] {""} ;
      T00SV37_A129BarCod = new int[1] ;
      T00SV37_A132BarCodReo = new byte[1] ;
      T00SV37_A130BarCodPar = new String[] {""} ;
      T00SV37_A758ProCod = new String[] {""} ;
      T00SV37_A194BarOrdLin = new short[1] ;
      T00SV37_A4643BarFasLot = new int[1] ;
      T00SV37_A5954Ap_Barcod = new int[1] ;
      T00SV37_A5955Ap_BarReo = new byte[1] ;
      T00SV37_A5956Ap_BarPar = new String[] {""} ;
      T00SV37_A5957Ap_ProCod = new String[] {""} ;
      T00SV37_A5958Ap_BarOrd = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00SV38_A407EmprNom = new String[] {""} ;
      T00SV38_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      ZZ5952Kgsp_A = DecimalUtil.ZERO ;
      ZO5952Kgsp_A = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.taghdfp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.taghdfp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.taghdfp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.taghdfp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.taghdfp__default(),
         new Object[] {
             new Object[] {
            T00SV2_A129BarCod, T00SV2_A132BarCodReo, T00SV2_A130BarCodPar, T00SV2_A194BarOrdLin, T00SV2_A4643BarFasLot, T00SV2_A5954Ap_Barcod, T00SV2_A5955Ap_BarReo, T00SV2_A5956Ap_BarPar, T00SV2_A5957Ap_ProCod, T00SV2_A5958Ap_BarOrd,
            T00SV2_A5959Ap_Kilos, T00SV2_n5959Ap_Kilos, T00SV2_A5960Ap_Piezas, T00SV2_n5960Ap_Piezas, T00SV2_A396EmprCod, T00SV2_A758ProCod
            }
            , new Object[] {
            T00SV3_A129BarCod, T00SV3_A132BarCodReo, T00SV3_A130BarCodPar, T00SV3_A194BarOrdLin, T00SV3_A4643BarFasLot, T00SV3_A5954Ap_Barcod, T00SV3_A5955Ap_BarReo, T00SV3_A5956Ap_BarPar, T00SV3_A5957Ap_ProCod, T00SV3_A5958Ap_BarOrd,
            T00SV3_A5959Ap_Kilos, T00SV3_n5959Ap_Kilos, T00SV3_A5960Ap_Piezas, T00SV3_n5960Ap_Piezas, T00SV3_A396EmprCod, T00SV3_A758ProCod
            }
            , new Object[] {
            T00SV4_A4643BarFasLot, T00SV4_A396EmprCod, T00SV4_A129BarCod, T00SV4_A132BarCodReo, T00SV4_A130BarCodPar, T00SV4_A758ProCod, T00SV4_A194BarOrdLin
            }
            , new Object[] {
            T00SV5_A4643BarFasLot, T00SV5_A396EmprCod, T00SV5_A129BarCod, T00SV5_A132BarCodReo, T00SV5_A130BarCodPar, T00SV5_A758ProCod, T00SV5_A194BarOrdLin
            }
            , new Object[] {
            T00SV6_A407EmprNom, T00SV6_n407EmprNom
            }
            , new Object[] {
            T00SV7_A759ProDsc
            }
            , new Object[] {
            T00SV8_A457FasCod
            }
            , new Object[] {
            T00SV9_A460FasDsc
            }
            , new Object[] {
            T00SV11_A5952Kgsp_A, T00SV11_A5953Pzsp_A
            }
            , new Object[] {
            T00SV13_A4643BarFasLot, T00SV13_A460FasDsc, T00SV13_A407EmprNom, T00SV13_n407EmprNom, T00SV13_A759ProDsc, T00SV13_A396EmprCod, T00SV13_A129BarCod, T00SV13_A132BarCodReo, T00SV13_A130BarCodPar, T00SV13_A758ProCod,
            T00SV13_A194BarOrdLin, T00SV13_A457FasCod, T00SV13_A5952Kgsp_A, T00SV13_A5953Pzsp_A
            }
            , new Object[] {
            T00SV14_A759ProDsc
            }
            , new Object[] {
            T00SV15_A457FasCod
            }
            , new Object[] {
            T00SV16_A460FasDsc
            }
            , new Object[] {
            T00SV18_A5952Kgsp_A, T00SV18_A5953Pzsp_A
            }
            , new Object[] {
            T00SV19_A396EmprCod, T00SV19_A129BarCod, T00SV19_A132BarCodReo, T00SV19_A130BarCodPar, T00SV19_A758ProCod, T00SV19_A194BarOrdLin, T00SV19_A4643BarFasLot
            }
            , new Object[] {
            T00SV20_A396EmprCod, T00SV20_A129BarCod, T00SV20_A132BarCodReo, T00SV20_A130BarCodPar, T00SV20_A758ProCod, T00SV20_A194BarOrdLin, T00SV20_A4643BarFasLot
            }
            , new Object[] {
            T00SV21_A396EmprCod, T00SV21_A129BarCod, T00SV21_A132BarCodReo, T00SV21_A130BarCodPar, T00SV21_A758ProCod, T00SV21_A194BarOrdLin, T00SV21_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SV24_A759ProDsc
            }
            , new Object[] {
            T00SV25_A457FasCod
            }
            , new Object[] {
            T00SV26_A460FasDsc
            }
            , new Object[] {
            T00SV28_A5952Kgsp_A, T00SV28_A5953Pzsp_A
            }
            , new Object[] {
            T00SV29_A396EmprCod, T00SV29_A129BarCod, T00SV29_A132BarCodReo, T00SV29_A130BarCodPar, T00SV29_A758ProCod, T00SV29_A194BarOrdLin, T00SV29_A4643BarFasLot, T00SV29_A10084BarPFcod
            }
            , new Object[] {
            T00SV30_A396EmprCod, T00SV30_A129BarCod, T00SV30_A132BarCodReo, T00SV30_A130BarCodPar, T00SV30_A758ProCod, T00SV30_A194BarOrdLin, T00SV30_A4643BarFasLot, T00SV30_A6579DataReg, T00SV30_A6574Turno, T00SV30_A6580Seccao,
            T00SV30_A6577FuncCod
            }
            , new Object[] {
            T00SV31_A396EmprCod, T00SV31_A129BarCod, T00SV31_A132BarCodReo, T00SV31_A130BarCodPar, T00SV31_A758ProCod, T00SV31_A194BarOrdLin, T00SV31_A4643BarFasLot
            }
            , new Object[] {
            T00SV32_A129BarCod, T00SV32_A132BarCodReo, T00SV32_A130BarCodPar, T00SV32_A194BarOrdLin, T00SV32_A4643BarFasLot, T00SV32_A5954Ap_Barcod, T00SV32_A5955Ap_BarReo, T00SV32_A5956Ap_BarPar, T00SV32_A5957Ap_ProCod, T00SV32_A5958Ap_BarOrd,
            T00SV32_A5959Ap_Kilos, T00SV32_n5959Ap_Kilos, T00SV32_A5960Ap_Piezas, T00SV32_n5960Ap_Piezas, T00SV32_A396EmprCod, T00SV32_A758ProCod
            }
            , new Object[] {
            T00SV33_A396EmprCod, T00SV33_A129BarCod, T00SV33_A132BarCodReo, T00SV33_A130BarCodPar, T00SV33_A758ProCod, T00SV33_A194BarOrdLin, T00SV33_A4643BarFasLot, T00SV33_A5954Ap_Barcod, T00SV33_A5955Ap_BarReo, T00SV33_A5956Ap_BarPar,
            T00SV33_A5957Ap_ProCod, T00SV33_A5958Ap_BarOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SV37_A396EmprCod, T00SV37_A129BarCod, T00SV37_A132BarCodReo, T00SV37_A130BarCodPar, T00SV37_A758ProCod, T00SV37_A194BarOrdLin, T00SV37_A4643BarFasLot, T00SV37_A5954Ap_Barcod, T00SV37_A5955Ap_BarReo, T00SV37_A5956Ap_BarPar,
            T00SV37_A5957Ap_ProCod, T00SV37_A5958Ap_BarOrd
            }
            , new Object[] {
            T00SV38_A407EmprNom, T00SV38_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TAGHDFP" ;
   }

   private byte Z132BarCodReo ;
   private byte Z5955Ap_BarReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A5955Ap_BarReo ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z194BarOrdLin ;
   private short O5953Pzsp_A ;
   private short Z5958Ap_BarOrd ;
   private short Z5960Ap_Piezas ;
   private short O5960Ap_Piezas ;
   private short nRcdDeleted_870 ;
   private short nRcdExists_870 ;
   private short nIsMod_870 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5953Pzsp_A ;
   private short nBlankRcdCount870 ;
   private short RcdFound870 ;
   private short B5953Pzsp_A ;
   private short nBlankRcdUsr870 ;
   private short s5953Pzsp_A ;
   private short A5958Ap_BarOrd ;
   private short A5960Ap_Piezas ;
   private short T5960Ap_Piezas ;
   private short Z5953Pzsp_A ;
   private short RcdFound688 ;
   private short nIsDirty_688 ;
   private short nIsDirty_870 ;
   private short ZZ194BarOrdLin ;
   private short ZZ5953Pzsp_A ;
   private short ZO5953Pzsp_A ;
   private int Z129BarCod ;
   private int Z4643BarFasLot ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int Z5954Ap_Barcod ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtBarFasLot_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtKgsp_A_Enabled ;
   private int edtPzsp_A_Enabled ;
   private int edtavnRcdDeleted_870_Enabled ;
   private int edtAp_Barcod_Enabled ;
   private int edtAp_BarReo_Enabled ;
   private int edtAp_BarPar_Enabled ;
   private int edtAp_ProCod_Enabled ;
   private int edtAp_BarOrd_Enabled ;
   private int edtAp_Kilos_Enabled ;
   private int edtAp_Piezas_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A5954Ap_Barcod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAp_BarOrd_Enabled ;
   private int defedtAp_ProCod_Enabled ;
   private int defedtAp_BarPar_Enabled ;
   private int defedtAp_BarReo_Enabled ;
   private int defedtAp_Barcod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPzsp_A_Backcolor ;
   private int edtKgsp_A_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtBarFasLot_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4643BarFasLot ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O5952Kgsp_A ;
   private java.math.BigDecimal Z5959Ap_Kilos ;
   private java.math.BigDecimal O5959Ap_Kilos ;
   private java.math.BigDecimal A5952Kgsp_A ;
   private java.math.BigDecimal B5952Kgsp_A ;
   private java.math.BigDecimal s5952Kgsp_A ;
   private java.math.BigDecimal A5959Ap_Kilos ;
   private java.math.BigDecimal T5959Ap_Kilos ;
   private java.math.BigDecimal Z5952Kgsp_A ;
   private java.math.BigDecimal ZZ5952Kgsp_A ;
   private java.math.BigDecimal ZO5952Kgsp_A ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z5956Ap_BarPar ;
   private String Z5957Ap_ProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
   private String sGXsfl_85_idx="0001" ;
   private String edtAp_Barcod_Title ;
   private String edtAp_Barcod_Internalname ;
   private String edtAp_ProCod_Title ;
   private String edtAp_ProCod_Internalname ;
   private String edtAp_BarOrd_Title ;
   private String edtAp_BarOrd_Internalname ;
   private String edtAp_Kilos_Title ;
   private String edtAp_Kilos_Internalname ;
   private String edtAp_Piezas_Title ;
   private String edtAp_Piezas_Internalname ;
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
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarFasLot_Internalname ;
   private String edtBarFasLot_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtKgsp_A_Internalname ;
   private String edtKgsp_A_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPzsp_A_Internalname ;
   private String edtPzsp_A_Jsonclick ;
   private String sMode870 ;
   private String edtavnRcdDeleted_870_Internalname ;
   private String edtAp_BarReo_Internalname ;
   private String edtAp_BarPar_Internalname ;
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
   private String sMode688 ;
   private String GXCCtl ;
   private String A5956Ap_BarPar ;
   private String A5957Ap_ProCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV24Lit13 ;
   private String GXt_char1 ;
   private String AV25Lit14 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String Z457FasCod ;
   private String Z460FasDsc ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_870_Jsonclick ;
   private String edtAp_Barcod_Jsonclick ;
   private String edtAp_BarReo_Jsonclick ;
   private String edtAp_BarPar_Jsonclick ;
   private String edtAp_ProCod_Jsonclick ;
   private String edtAp_BarOrd_Jsonclick ;
   private String edtAp_Kilos_Jsonclick ;
   private String edtAp_Piezas_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n5959Ap_Kilos ;
   private boolean n5960Ap_Piezas ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00SV6_A407EmprNom ;
   private boolean[] T00SV6_n407EmprNom ;
   private int[] T00SV13_A4643BarFasLot ;
   private String[] T00SV13_A460FasDsc ;
   private String[] T00SV13_A407EmprNom ;
   private boolean[] T00SV13_n407EmprNom ;
   private String[] T00SV13_A759ProDsc ;
   private String[] T00SV13_A396EmprCod ;
   private int[] T00SV13_A129BarCod ;
   private byte[] T00SV13_A132BarCodReo ;
   private String[] T00SV13_A130BarCodPar ;
   private String[] T00SV13_A758ProCod ;
   private short[] T00SV13_A194BarOrdLin ;
   private String[] T00SV13_A457FasCod ;
   private java.math.BigDecimal[] T00SV13_A5952Kgsp_A ;
   private short[] T00SV13_A5953Pzsp_A ;
   private String[] T00SV7_A759ProDsc ;
   private String[] T00SV8_A457FasCod ;
   private String[] T00SV9_A460FasDsc ;
   private java.math.BigDecimal[] T00SV11_A5952Kgsp_A ;
   private short[] T00SV11_A5953Pzsp_A ;
   private String[] T00SV14_A759ProDsc ;
   private String[] T00SV15_A457FasCod ;
   private String[] T00SV16_A460FasDsc ;
   private java.math.BigDecimal[] T00SV18_A5952Kgsp_A ;
   private short[] T00SV18_A5953Pzsp_A ;
   private String[] T00SV19_A396EmprCod ;
   private int[] T00SV19_A129BarCod ;
   private byte[] T00SV19_A132BarCodReo ;
   private String[] T00SV19_A130BarCodPar ;
   private String[] T00SV19_A758ProCod ;
   private short[] T00SV19_A194BarOrdLin ;
   private int[] T00SV19_A4643BarFasLot ;
   private int[] T00SV5_A4643BarFasLot ;
   private String[] T00SV5_A396EmprCod ;
   private int[] T00SV5_A129BarCod ;
   private byte[] T00SV5_A132BarCodReo ;
   private String[] T00SV5_A130BarCodPar ;
   private String[] T00SV5_A758ProCod ;
   private short[] T00SV5_A194BarOrdLin ;
   private String[] T00SV20_A396EmprCod ;
   private int[] T00SV20_A129BarCod ;
   private byte[] T00SV20_A132BarCodReo ;
   private String[] T00SV20_A130BarCodPar ;
   private String[] T00SV20_A758ProCod ;
   private short[] T00SV20_A194BarOrdLin ;
   private int[] T00SV20_A4643BarFasLot ;
   private String[] T00SV21_A396EmprCod ;
   private int[] T00SV21_A129BarCod ;
   private byte[] T00SV21_A132BarCodReo ;
   private String[] T00SV21_A130BarCodPar ;
   private String[] T00SV21_A758ProCod ;
   private short[] T00SV21_A194BarOrdLin ;
   private int[] T00SV21_A4643BarFasLot ;
   private int[] T00SV4_A4643BarFasLot ;
   private String[] T00SV4_A396EmprCod ;
   private int[] T00SV4_A129BarCod ;
   private byte[] T00SV4_A132BarCodReo ;
   private String[] T00SV4_A130BarCodPar ;
   private String[] T00SV4_A758ProCod ;
   private short[] T00SV4_A194BarOrdLin ;
   private String[] T00SV24_A759ProDsc ;
   private String[] T00SV25_A457FasCod ;
   private String[] T00SV26_A460FasDsc ;
   private java.math.BigDecimal[] T00SV28_A5952Kgsp_A ;
   private short[] T00SV28_A5953Pzsp_A ;
   private String[] T00SV29_A396EmprCod ;
   private int[] T00SV29_A129BarCod ;
   private byte[] T00SV29_A132BarCodReo ;
   private String[] T00SV29_A130BarCodPar ;
   private String[] T00SV29_A758ProCod ;
   private short[] T00SV29_A194BarOrdLin ;
   private int[] T00SV29_A4643BarFasLot ;
   private short[] T00SV29_A10084BarPFcod ;
   private String[] T00SV30_A396EmprCod ;
   private int[] T00SV30_A129BarCod ;
   private byte[] T00SV30_A132BarCodReo ;
   private String[] T00SV30_A130BarCodPar ;
   private String[] T00SV30_A758ProCod ;
   private short[] T00SV30_A194BarOrdLin ;
   private int[] T00SV30_A4643BarFasLot ;
   private java.util.Date[] T00SV30_A6579DataReg ;
   private byte[] T00SV30_A6574Turno ;
   private byte[] T00SV30_A6580Seccao ;
   private int[] T00SV30_A6577FuncCod ;
   private String[] T00SV31_A396EmprCod ;
   private int[] T00SV31_A129BarCod ;
   private byte[] T00SV31_A132BarCodReo ;
   private String[] T00SV31_A130BarCodPar ;
   private String[] T00SV31_A758ProCod ;
   private short[] T00SV31_A194BarOrdLin ;
   private int[] T00SV31_A4643BarFasLot ;
   private int[] T00SV32_A129BarCod ;
   private byte[] T00SV32_A132BarCodReo ;
   private String[] T00SV32_A130BarCodPar ;
   private short[] T00SV32_A194BarOrdLin ;
   private int[] T00SV32_A4643BarFasLot ;
   private int[] T00SV32_A5954Ap_Barcod ;
   private byte[] T00SV32_A5955Ap_BarReo ;
   private String[] T00SV32_A5956Ap_BarPar ;
   private String[] T00SV32_A5957Ap_ProCod ;
   private short[] T00SV32_A5958Ap_BarOrd ;
   private java.math.BigDecimal[] T00SV32_A5959Ap_Kilos ;
   private boolean[] T00SV32_n5959Ap_Kilos ;
   private short[] T00SV32_A5960Ap_Piezas ;
   private boolean[] T00SV32_n5960Ap_Piezas ;
   private String[] T00SV32_A396EmprCod ;
   private String[] T00SV32_A758ProCod ;
   private String[] T00SV33_A396EmprCod ;
   private int[] T00SV33_A129BarCod ;
   private byte[] T00SV33_A132BarCodReo ;
   private String[] T00SV33_A130BarCodPar ;
   private String[] T00SV33_A758ProCod ;
   private short[] T00SV33_A194BarOrdLin ;
   private int[] T00SV33_A4643BarFasLot ;
   private int[] T00SV33_A5954Ap_Barcod ;
   private byte[] T00SV33_A5955Ap_BarReo ;
   private String[] T00SV33_A5956Ap_BarPar ;
   private String[] T00SV33_A5957Ap_ProCod ;
   private short[] T00SV33_A5958Ap_BarOrd ;
   private int[] T00SV3_A129BarCod ;
   private byte[] T00SV3_A132BarCodReo ;
   private String[] T00SV3_A130BarCodPar ;
   private short[] T00SV3_A194BarOrdLin ;
   private int[] T00SV3_A4643BarFasLot ;
   private int[] T00SV3_A5954Ap_Barcod ;
   private byte[] T00SV3_A5955Ap_BarReo ;
   private String[] T00SV3_A5956Ap_BarPar ;
   private String[] T00SV3_A5957Ap_ProCod ;
   private short[] T00SV3_A5958Ap_BarOrd ;
   private java.math.BigDecimal[] T00SV3_A5959Ap_Kilos ;
   private boolean[] T00SV3_n5959Ap_Kilos ;
   private short[] T00SV3_A5960Ap_Piezas ;
   private boolean[] T00SV3_n5960Ap_Piezas ;
   private String[] T00SV3_A396EmprCod ;
   private String[] T00SV3_A758ProCod ;
   private int[] T00SV2_A129BarCod ;
   private byte[] T00SV2_A132BarCodReo ;
   private String[] T00SV2_A130BarCodPar ;
   private short[] T00SV2_A194BarOrdLin ;
   private int[] T00SV2_A4643BarFasLot ;
   private int[] T00SV2_A5954Ap_Barcod ;
   private byte[] T00SV2_A5955Ap_BarReo ;
   private String[] T00SV2_A5956Ap_BarPar ;
   private String[] T00SV2_A5957Ap_ProCod ;
   private short[] T00SV2_A5958Ap_BarOrd ;
   private java.math.BigDecimal[] T00SV2_A5959Ap_Kilos ;
   private boolean[] T00SV2_n5959Ap_Kilos ;
   private short[] T00SV2_A5960Ap_Piezas ;
   private boolean[] T00SV2_n5960Ap_Piezas ;
   private String[] T00SV2_A396EmprCod ;
   private String[] T00SV2_A758ProCod ;
   private String[] T00SV37_A396EmprCod ;
   private int[] T00SV37_A129BarCod ;
   private byte[] T00SV37_A132BarCodReo ;
   private String[] T00SV37_A130BarCodPar ;
   private String[] T00SV37_A758ProCod ;
   private short[] T00SV37_A194BarOrdLin ;
   private int[] T00SV37_A4643BarFasLot ;
   private int[] T00SV37_A5954Ap_Barcod ;
   private byte[] T00SV37_A5955Ap_BarReo ;
   private String[] T00SV37_A5956Ap_BarPar ;
   private String[] T00SV37_A5957Ap_ProCod ;
   private short[] T00SV37_A5958Ap_BarOrd ;
   private String[] T00SV38_A407EmprNom ;
   private boolean[] T00SV38_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class taghdfp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taghdfp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taghdfp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taghdfp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taghdfp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00SV2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd, Ap_Kilos, Ap_Piezas, EmprCod, ProCod FROM TXPAGHDFP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND Ap_Barcod = ? AND Ap_BarReo = ? AND Ap_BarPar = ? AND Ap_ProCod = ? AND Ap_BarOrd = ?  FOR UPDATE OF Ap_Kilos, Ap_Piezas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd, Ap_Kilos, Ap_Piezas, EmprCod, ProCod FROM TXPAGHDFP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND Ap_Barcod = ? AND Ap_BarReo = ? AND Ap_BarPar = ? AND Ap_ProCod = ? AND Ap_BarOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV4", "SELECT BarFasLot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?  FOR UPDATE OF BarFasLot NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV5", "SELECT BarFasLot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV7", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV8", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV9", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV11", "SELECT COALESCE( T1.Kgsp_A, 0) AS Kgsp_A, COALESCE( T1.Pzsp_A, 0) AS Pzsp_A FROM (SELECT SUM(Ap_Kilos) AS Kgsp_A, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, SUM(Ap_Piezas) AS Pzsp_A FROM TXPAGHDFP GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? AND T1.BarOrdLin = ? AND T1.BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV13", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarFasLot, T5.FasDsc, T2.EmprNom, T3.ProDsc, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, T4.FasCod, COALESCE( T6.Kgsp_A, 0) AS Kgsp_A, COALESCE( T6.Pzsp_A, 0) AS Pzsp_A FROM (((((TXPFASMAQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) INNER JOIN TXPBARFAS T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar AND T4.ProCod = TM1.ProCod AND T4.BarOrdLin = TM1.BarOrdLin) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = TM1.EmprCod AND T5.FasCod = T4.FasCod) LEFT JOIN (SELECT SUM(Ap_Kilos) AS Kgsp_A, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, SUM(Ap_Piezas) AS Pzsp_A FROM TXPAGHDFP GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar AND T6.ProCod = TM1.ProCod AND T6.BarOrdLin = TM1.BarOrdLin AND T6.BarFasLot = TM1.BarFasLot) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.BarFasLot = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.BarFasLot ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV14", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV15", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV16", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV18", "SELECT COALESCE( T1.Kgsp_A, 0) AS Kgsp_A, COALESCE( T1.Pzsp_A, 0) AS Pzsp_A FROM (SELECT SUM(Ap_Kilos) AS Kgsp_A, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, SUM(Ap_Piezas) AS Pzsp_A FROM TXPAGHDFP GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? AND T1.BarOrdLin = ? AND T1.BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin > ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarFasLot > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SV21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin < ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarFasLot < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, BarFasLot DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00SV22", "INSERT INTO TXPFASMAQ(BarFasLot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ')", GX_NOMASK, "TXPFASMAQ")
         ,new UpdateCursor("T00SV23", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK, "TXPFASMAQ")
         ,new ForEachCursor("T00SV24", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV25", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV26", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV28", "SELECT COALESCE( T1.Kgsp_A, 0) AS Kgsp_A, COALESCE( T1.Pzsp_A, 0) AS Pzsp_A FROM (SELECT SUM(Ap_Kilos) AS Kgsp_A, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, SUM(Ap_Piezas) AS Pzsp_A FROM TXPAGHDFP GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? AND T1.BarOrdLin = ? AND T1.BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SV30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, DataReg, Turno, Seccao, FuncCod FROM TXPContPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SV31", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV32", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd, Ap_Kilos, Ap_Piezas, EmprCod, ProCod FROM TXPAGHDFP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? and Ap_Barcod = ? and Ap_BarReo = ? and Ap_BarPar = ? and Ap_ProCod = ? and Ap_BarOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV33", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND Ap_Barcod = ? AND Ap_BarReo = ? AND Ap_BarPar = ? AND Ap_ProCod = ? AND Ap_BarOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00SV34", "INSERT INTO TXPAGHDFP(BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd, Ap_Kilos, Ap_Piezas, EmprCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAGHDFP")
         ,new UpdateCursor("T00SV35", "UPDATE TXPAGHDFP SET Ap_Kilos=?, Ap_Piezas=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND Ap_Barcod = ? AND Ap_BarReo = ? AND Ap_BarPar = ? AND Ap_ProCod = ? AND Ap_BarOrd = ?", GX_NOMASK, "TXPAGHDFP")
         ,new UpdateCursor("T00SV36", "DELETE FROM TXPAGHDFP  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND Ap_Barcod = ? AND Ap_BarReo = ? AND Ap_BarPar = ? AND Ap_ProCod = ? AND Ap_BarOrd = ?", GX_NOMASK, "TXPAGHDFP")
         ,new ForEachCursor("T00SV37", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SV38", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[13]).shortValue());
               }
               stmt.setString(13, (String)parms[14], 3);
               stmt.setString(14, (String)parms[15], 8);
               return;
            case 29 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setString(7, (String)parms[8], 8);
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setInt(10, ((Number) parms[11]).intValue());
               stmt.setByte(11, ((Number) parms[12]).byteValue());
               stmt.setString(12, (String)parms[13], 1);
               stmt.setString(13, (String)parms[14], 8);
               stmt.setShort(14, ((Number) parms[15]).shortValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

