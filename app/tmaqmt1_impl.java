package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqmt1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A602MaqCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", ""), (short)(0)) ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public tmaqmt1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqmt1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqmt1_impl.class ));
   }

   public tmaqmt1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAQMT1.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAnyM_Internalname, GXutil.ltrim( localUtil.ntoc( A12434MaqAnyM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAnyM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12434MaqAnyM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12434MaqAnyM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAnyM_Jsonclick, 0, "", "", "", "", "", 1, edtMaqAnyM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMesM_Internalname, GXutil.ltrim( localUtil.ntoc( A12435MaqMesM, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMesM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12435MaqMesM), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12435MaqMesM), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMesM_Jsonclick, 0, "", "", "", "", "", 1, edtMaqMesM_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Horas Mantenimiento Mes_Maquina", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMtoMes_Internalname, GXutil.rtrim( A12427MaqMtoMes), GXutil.rtrim( localUtil.format( A12427MaqMtoMes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMtoMes_Jsonclick, 0, "", "", "", "", "", 1, edtMaqMtoMes_Enabled, 0, "text", "", 63, "chr", 1, "row", 63, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQMT1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1720 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1720 = (short)(1) ;
            scanStart1KE1720( ) ;
            while ( RcdFound1720 != 0 )
            {
               init_level_properties1720( ) ;
               getByPrimaryKey1KE1720( ) ;
               addRow1KE1720( ) ;
               scanNext1KE1720( ) ;
            }
            scanEnd1KE1720( ) ;
            nBlankRcdCount1720 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KE1720( ) ;
         standaloneModal1KE1720( ) ;
         sMode1720 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1KE1720( ) ;
            edtavnRcdDeleted_1720_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1720_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1720_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1720_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoDia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTODIA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoDia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoI1i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI1I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI1i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI1i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoI1f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI1F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI1f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI1f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoI2i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI2I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI2i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI2i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoI2f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI2F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI2f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI2f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoI3i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI3I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI3i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI3i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqMtoI3f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI3F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI3f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI3f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1720 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KE1720( ) ;
            }
            sendRow1KE1720( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1720 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1720 = (short)(5) ;
         nRcdExists_1720 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KE1720( ) ;
            while ( RcdFound1720 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501720( ) ;
               init_level_properties1720( ) ;
               standaloneNotModal1KE1720( ) ;
               getByPrimaryKey1KE1720( ) ;
               standaloneModal1KE1720( ) ;
               addRow1KE1720( ) ;
               scanNext1KE1720( ) ;
            }
            scanEnd1KE1720( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1720 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501720( ) ;
      initAll1KE1720( ) ;
      init_level_properties1720( ) ;
      nRcdExists_1720 = (short)(0) ;
      nIsMod_1720 = (short)(0) ;
      nRcdDeleted_1720 = (short)(0) ;
      nBlankRcdCount1720 = (short)(nBlankRcdUsr1720+nBlankRcdCount1720) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1720 > 0 )
      {
         standaloneNotModal1KE1720( ) ;
         standaloneModal1KE1720( ) ;
         addRow1KE1720( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqMtoDia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1720 = (short)(nBlankRcdCount1720-1) ;
      }
      Gx_mode = sMode1720 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQMT1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMAQMT1.htm");
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
      e111KE2 ();
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
            Z12434MaqAnyM = (short)(localUtil.ctol( httpContext.cgiGet( "Z12434MaqAnyM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12435MaqMesM = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12435MaqMesM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12427MaqMtoMes = httpContext.cgiGet( "Z12427MaqMtoMes") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAnyM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAnyM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQANYM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqAnyM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12434MaqAnyM = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
            }
            else
            {
               A12434MaqAnyM = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAnyM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMesM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMesM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMESM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMesM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12435MaqMesM = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
            }
            else
            {
               A12435MaqMesM = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMesM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
            }
            A12427MaqMtoMes = httpContext.cgiGet( edtMaqMtoMes_Internalname) ;
            n12427MaqMtoMes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12427MaqMtoMes", A12427MaqMtoMes);
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
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A12434MaqAnyM = (short)(GXutil.lval( httpContext.GetPar( "MaqAnyM"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
               A12435MaqMesM = (byte)(GXutil.lval( httpContext.GetPar( "MaqMesM"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
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
                        e111KE2 ();
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
            initAll1KE1719( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1720_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1720_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1KE1719( ) ;
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

   public void confirm_1KE0( )
   {
      beforeValidate1KE1719( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KE1719( ) ;
         }
         else
         {
            checkExtendedTable1KE1719( ) ;
            if ( AnyError == 0 )
            {
               zm1KE1719( 2) ;
               zm1KE1719( 3) ;
            }
            closeExtendedTableCursors1KE1719( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1719 = Gx_mode ;
         confirm_1KE1720( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1719 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1719 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KE0( ) ;
      }
   }

   public void confirm_1KE1720( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1KE1720( ) ;
         if ( ( nRcdExists_1720 != 0 ) || ( nIsMod_1720 != 0 ) )
         {
            getKey1KE1720( ) ;
            if ( ( nRcdExists_1720 == 0 ) && ( nRcdDeleted_1720 == 0 ) )
            {
               if ( RcdFound1720 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KE1720( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KE1720( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1KE1720( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQMTODIA_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqMtoDia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1720 != 0 )
               {
                  if ( nRcdDeleted_1720 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KE1720( ) ;
                     load1KE1720( ) ;
                     beforeValidate1KE1720( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KE1720( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1720 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KE1720( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KE1720( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1KE1720( ) ;
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
                  if ( nRcdDeleted_1720 == 0 )
                  {
                     GXCCtl = "MAQMTODIA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqMtoDia_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1720_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqMtoDia_Internalname, GXutil.ltrim( localUtil.ntoc( A12436MaqMtoDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqMtoI1i_Internalname, localUtil.ttoc( A12428MaqMtoI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI1f_Internalname, localUtil.ttoc( A12429MaqMtoI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI2i_Internalname, localUtil.ttoc( A12430MaqMtoI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI2f_Internalname, localUtil.ttoc( A12431MaqMtoI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI3i_Internalname, localUtil.ttoc( A12432MaqMtoI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI3f_Internalname, localUtil.ttoc( A12433MaqMtoI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12436MaqMtoDia_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12436MaqMtoDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12428MaqMtoI1i_"+sGXsfl_50_idx, localUtil.ttoc( Z12428MaqMtoI1i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12429MaqMtoI1f_"+sGXsfl_50_idx, localUtil.ttoc( Z12429MaqMtoI1f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12430MaqMtoI2i_"+sGXsfl_50_idx, localUtil.ttoc( Z12430MaqMtoI2i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12431MaqMtoI2f_"+sGXsfl_50_idx, localUtil.ttoc( Z12431MaqMtoI2f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12432MaqMtoI3i_"+sGXsfl_50_idx, localUtil.ttoc( Z12432MaqMtoI3i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12433MaqMtoI3f_"+sGXsfl_50_idx, localUtil.ttoc( Z12433MaqMtoI3f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1720_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1720_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1720_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1720 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1720_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1720_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTODIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoDia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI1I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI1F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI2I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI2F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI3I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI3F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KE0( )
   {
   }

   public void e111KE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmaqmt1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tmaqmt1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmaqmt1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqmt1_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqmt1_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmaqmt1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KE1719( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12427MaqMtoMes = T01KE5_A12427MaqMtoMes[0] ;
         }
         else
         {
            Z12427MaqMtoMes = A12427MaqMtoMes ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12434MaqAnyM = A12434MaqAnyM ;
         Z12435MaqMesM = A12435MaqMesM ;
         Z12427MaqMtoMes = A12427MaqMtoMes ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TMAQMT1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01KE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KE6_A407EmprNom[0] ;
      n407EmprNom = T01KE6_n407EmprNom[0] ;
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

   public void load1KE1719( )
   {
      /* Using cursor T01KE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1719 = (short)(1) ;
         A407EmprNom = T01KE8_A407EmprNom[0] ;
         n407EmprNom = T01KE8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12427MaqMtoMes = T01KE8_A12427MaqMtoMes[0] ;
         n12427MaqMtoMes = T01KE8_n12427MaqMtoMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12427MaqMtoMes", A12427MaqMtoMes);
         zm1KE1719( -1) ;
      }
      pr_default.close(6);
      onLoadActions1KE1719( ) ;
   }

   public void onLoadActions1KE1719( )
   {
   }

   public void checkExtendedTable1KE1719( )
   {
      nIsDirty_1719 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01KE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1KE1719( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T01KE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1KE1719( )
   {
      /* Using cursor T01KE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1719 = (short)(1) ;
      }
      else
      {
         RcdFound1719 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01KE5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KE1719( 1) ;
         RcdFound1719 = (short)(1) ;
         A12434MaqAnyM = T01KE5_A12434MaqAnyM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
         A12435MaqMesM = T01KE5_A12435MaqMesM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
         A12427MaqMtoMes = T01KE5_A12427MaqMtoMes[0] ;
         n12427MaqMtoMes = T01KE5_n12427MaqMtoMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12427MaqMtoMes", A12427MaqMtoMes);
         A602MaqCod = T01KE5_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z12434MaqAnyM = A12434MaqAnyM ;
         Z12435MaqMesM = A12435MaqMesM ;
         sMode1719 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KE1719( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1719 = (short)(0) ;
            initializeNonKey1KE1719( ) ;
         }
         Gx_mode = sMode1719 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1719 = (short)(0) ;
         initializeNonKey1KE1719( ) ;
         sMode1719 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1719 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1KE1719( ) ;
      if ( RcdFound1719 == 0 )
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
      RcdFound1719 = (short)(0) ;
      /* Using cursor T01KE11 */
      pr_default.execute(9, new Object[] {A602MaqCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Short.valueOf(A12434MaqAnyM), A602MaqCod, Byte.valueOf(A12435MaqMesM), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KE11_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01KE11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE11_A12434MaqAnyM[0] < A12434MaqAnyM ) || ( T01KE11_A12434MaqAnyM[0] == A12434MaqAnyM ) && ( GXutil.strcmp(T01KE11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE11_A12435MaqMesM[0] < A12435MaqMesM ) ) && ( GXutil.strcmp(T01KE11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KE11_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01KE11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE11_A12434MaqAnyM[0] > A12434MaqAnyM ) || ( T01KE11_A12434MaqAnyM[0] == A12434MaqAnyM ) && ( GXutil.strcmp(T01KE11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE11_A12435MaqMesM[0] > A12435MaqMesM ) ) && ( GXutil.strcmp(T01KE11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T01KE11_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A12434MaqAnyM = T01KE11_A12434MaqAnyM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
            A12435MaqMesM = T01KE11_A12435MaqMesM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
            RcdFound1719 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1719 = (short)(0) ;
      /* Using cursor T01KE12 */
      pr_default.execute(10, new Object[] {A602MaqCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Short.valueOf(A12434MaqAnyM), A602MaqCod, Byte.valueOf(A12435MaqMesM), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01KE12_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01KE12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE12_A12434MaqAnyM[0] > A12434MaqAnyM ) || ( T01KE12_A12434MaqAnyM[0] == A12434MaqAnyM ) && ( GXutil.strcmp(T01KE12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE12_A12435MaqMesM[0] > A12435MaqMesM ) ) && ( GXutil.strcmp(T01KE12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01KE12_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01KE12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE12_A12434MaqAnyM[0] < A12434MaqAnyM ) || ( T01KE12_A12434MaqAnyM[0] == A12434MaqAnyM ) && ( GXutil.strcmp(T01KE12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KE12_A12435MaqMesM[0] < A12435MaqMesM ) ) && ( GXutil.strcmp(T01KE12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T01KE12_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A12434MaqAnyM = T01KE12_A12434MaqAnyM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
            A12435MaqMesM = T01KE12_A12435MaqMesM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
            RcdFound1719 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KE1719( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KE1719( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1719 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12434MaqAnyM != Z12434MaqAnyM ) || ( A12435MaqMesM != Z12435MaqMesM ) )
            {
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A12434MaqAnyM = Z12434MaqAnyM ;
               httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
               A12435MaqMesM = Z12435MaqMesM ;
               httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
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
               update1KE1719( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12434MaqAnyM != Z12434MaqAnyM ) || ( A12435MaqMesM != Z12435MaqMesM ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KE1719( ) ;
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
                  insert1KE1719( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12434MaqAnyM != Z12434MaqAnyM ) || ( A12435MaqMesM != Z12435MaqMesM ) )
      {
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A12434MaqAnyM = Z12434MaqAnyM ;
         httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
         A12435MaqMesM = Z12435MaqMesM ;
         httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
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
      getKey1KE1719( ) ;
      if ( RcdFound1719 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12434MaqAnyM != Z12434MaqAnyM ) || ( A12435MaqMesM != Z12435MaqMesM ) )
         {
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A12434MaqAnyM = Z12434MaqAnyM ;
            httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
            A12435MaqMesM = Z12435MaqMesM ;
            httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12434MaqAnyM != Z12434MaqAnyM ) || ( A12435MaqMesM != Z12435MaqMesM ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqmt1");
      GX_FocusControl = edtMaqMtoMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KE0( ) ;
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
      if ( RcdFound1719 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqMtoMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KE1719( ) ;
      if ( RcdFound1719 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqMtoMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KE1719( ) ;
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
      if ( RcdFound1719 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqMtoMes_Internalname ;
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
      if ( RcdFound1719 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqMtoMes_Internalname ;
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
      scanStart1KE1719( ) ;
      if ( RcdFound1719 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1719 != 0 )
         {
            scanNext1KE1719( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqMtoMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KE1719( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KE1719( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQMT1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z12427MaqMtoMes, T01KE4_A12427MaqMtoMes[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12427MaqMtoMes, T01KE4_A12427MaqMtoMes[0]) != 0 )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoMes");
               GXutil.writeLogRaw("Old: ",Z12427MaqMtoMes);
               GXutil.writeLogRaw("Current: ",T01KE4_A12427MaqMtoMes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQMT1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KE1719( )
   {
      beforeValidate1KE1719( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KE1719( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KE1719( 0) ;
         checkOptimisticConcurrency1KE1719( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KE1719( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KE1719( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KE13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Boolean.valueOf(n12427MaqMtoMes), A12427MaqMtoMes, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQMT1");
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
                        processLevel1KE1719( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KE0( ) ;
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
            load1KE1719( ) ;
         }
         endLevel1KE1719( ) ;
      }
      closeExtendedTableCursors1KE1719( ) ;
   }

   public void update1KE1719( )
   {
      beforeValidate1KE1719( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KE1719( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KE1719( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KE1719( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KE1719( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KE14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n12427MaqMtoMes), A12427MaqMtoMes, A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQMT1");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQMT1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KE1719( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KE1719( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KE0( ) ;
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
         endLevel1KE1719( ) ;
      }
      closeExtendedTableCursors1KE1719( ) ;
   }

   public void deferredUpdate1KE1719( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KE1719( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KE1719( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KE1719( ) ;
         afterConfirm1KE1719( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KE1719( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KE1720( ) ;
               while ( RcdFound1720 != 0 )
               {
                  getByPrimaryKey1KE1720( ) ;
                  delete1KE1720( ) ;
                  scanNext1KE1720( ) ;
               }
               scanEnd1KE1720( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KE15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQMT1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1719 == 0 )
                        {
                           initAll1KE1719( ) ;
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
                        resetCaption1KE0( ) ;
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
      sMode1719 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KE1719( ) ;
      Gx_mode = sMode1719 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KE1719( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1KE1720( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1KE1720( ) ;
         if ( ( nRcdExists_1720 != 0 ) || ( nIsMod_1720 != 0 ) )
         {
            standaloneNotModal1KE1720( ) ;
            getKey1KE1720( ) ;
            if ( ( nRcdExists_1720 == 0 ) && ( nRcdDeleted_1720 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KE1720( ) ;
            }
            else
            {
               if ( RcdFound1720 != 0 )
               {
                  if ( ( nRcdDeleted_1720 != 0 ) && ( nRcdExists_1720 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KE1720( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1720 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KE1720( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1720 == 0 )
                  {
                     GXCCtl = "MAQMTODIA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqMtoDia_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1720_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqMtoDia_Internalname, GXutil.ltrim( localUtil.ntoc( A12436MaqMtoDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqMtoI1i_Internalname, localUtil.ttoc( A12428MaqMtoI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI1f_Internalname, localUtil.ttoc( A12429MaqMtoI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI2i_Internalname, localUtil.ttoc( A12430MaqMtoI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI2f_Internalname, localUtil.ttoc( A12431MaqMtoI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI3i_Internalname, localUtil.ttoc( A12432MaqMtoI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqMtoI3f_Internalname, localUtil.ttoc( A12433MaqMtoI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12436MaqMtoDia_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12436MaqMtoDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12428MaqMtoI1i_"+sGXsfl_50_idx, localUtil.ttoc( Z12428MaqMtoI1i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12429MaqMtoI1f_"+sGXsfl_50_idx, localUtil.ttoc( Z12429MaqMtoI1f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12430MaqMtoI2i_"+sGXsfl_50_idx, localUtil.ttoc( Z12430MaqMtoI2i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12431MaqMtoI2f_"+sGXsfl_50_idx, localUtil.ttoc( Z12431MaqMtoI2f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12432MaqMtoI3i_"+sGXsfl_50_idx, localUtil.ttoc( Z12432MaqMtoI3i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12433MaqMtoI3f_"+sGXsfl_50_idx, localUtil.ttoc( Z12433MaqMtoI3f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1720_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1720_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1720_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1720 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1720_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1720_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTODIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoDia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI1I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI1F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI2I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI2F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI3I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQMTOI3F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KE1720( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1720 = (short)(0) ;
      nIsMod_1720 = (short)(0) ;
      nRcdDeleted_1720 = (short)(0) ;
   }

   public void processLevel1KE1719( )
   {
      /* Save parent mode. */
      sMode1719 = Gx_mode ;
      processNestedLevel1KE1720( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1719 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KE1719( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KE1719( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqmt1");
         if ( AnyError == 0 )
         {
            confirmValues1KE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqmt1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KE1719( )
   {
      /* Scan By routine */
      /* Using cursor T01KE16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1719 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1719 = (short)(1) ;
         A602MaqCod = T01KE16_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A12434MaqAnyM = T01KE16_A12434MaqAnyM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
         A12435MaqMesM = T01KE16_A12435MaqMesM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KE1719( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1719 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1719 = (short)(1) ;
         A602MaqCod = T01KE16_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A12434MaqAnyM = T01KE16_A12434MaqAnyM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
         A12435MaqMesM = T01KE16_A12435MaqMesM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
      }
   }

   public void scanEnd1KE1719( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1KE1719( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KE1719( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KE1719( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KE1719( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KE1719( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KE1719( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KE1719( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqAnyM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAnyM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAnyM_Enabled), 5, 0), true);
      edtMaqMesM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMesM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMesM_Enabled), 5, 0), true);
      edtMaqMtoMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoMes_Enabled), 5, 0), true);
   }

   public void zm1KE1720( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12428MaqMtoI1i = T01KE3_A12428MaqMtoI1i[0] ;
            Z12429MaqMtoI1f = T01KE3_A12429MaqMtoI1f[0] ;
            Z12430MaqMtoI2i = T01KE3_A12430MaqMtoI2i[0] ;
            Z12431MaqMtoI2f = T01KE3_A12431MaqMtoI2f[0] ;
            Z12432MaqMtoI3i = T01KE3_A12432MaqMtoI3i[0] ;
            Z12433MaqMtoI3f = T01KE3_A12433MaqMtoI3f[0] ;
         }
         else
         {
            Z12428MaqMtoI1i = A12428MaqMtoI1i ;
            Z12429MaqMtoI1f = A12429MaqMtoI1f ;
            Z12430MaqMtoI2i = A12430MaqMtoI2i ;
            Z12431MaqMtoI2f = A12431MaqMtoI2f ;
            Z12432MaqMtoI3i = A12432MaqMtoI3i ;
            Z12433MaqMtoI3f = A12433MaqMtoI3f ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z602MaqCod = A602MaqCod ;
         Z12434MaqAnyM = A12434MaqAnyM ;
         Z12435MaqMesM = A12435MaqMesM ;
         Z12436MaqMtoDia = A12436MaqMtoDia ;
         Z12428MaqMtoI1i = A12428MaqMtoI1i ;
         Z12429MaqMtoI1f = A12429MaqMtoI1f ;
         Z12430MaqMtoI2i = A12430MaqMtoI2i ;
         Z12431MaqMtoI2f = A12431MaqMtoI2f ;
         Z12432MaqMtoI3i = A12432MaqMtoI3i ;
         Z12433MaqMtoI3f = A12433MaqMtoI3f ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1KE1720( )
   {
   }

   public void standaloneModal1KE1720( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqMtoDia_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoDia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtMaqMtoDia_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoDia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1KE1720( )
   {
      /* Using cursor T01KE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1720 = (short)(1) ;
         A12428MaqMtoI1i = T01KE17_A12428MaqMtoI1i[0] ;
         n12428MaqMtoI1i = T01KE17_n12428MaqMtoI1i[0] ;
         A12429MaqMtoI1f = T01KE17_A12429MaqMtoI1f[0] ;
         n12429MaqMtoI1f = T01KE17_n12429MaqMtoI1f[0] ;
         A12430MaqMtoI2i = T01KE17_A12430MaqMtoI2i[0] ;
         n12430MaqMtoI2i = T01KE17_n12430MaqMtoI2i[0] ;
         A12431MaqMtoI2f = T01KE17_A12431MaqMtoI2f[0] ;
         n12431MaqMtoI2f = T01KE17_n12431MaqMtoI2f[0] ;
         A12432MaqMtoI3i = T01KE17_A12432MaqMtoI3i[0] ;
         n12432MaqMtoI3i = T01KE17_n12432MaqMtoI3i[0] ;
         A12433MaqMtoI3f = T01KE17_A12433MaqMtoI3f[0] ;
         n12433MaqMtoI3f = T01KE17_n12433MaqMtoI3f[0] ;
         zm1KE1720( -4) ;
      }
      pr_default.close(15);
      onLoadActions1KE1720( ) ;
   }

   public void onLoadActions1KE1720( )
   {
   }

   public void checkExtendedTable1KE1720( )
   {
      nIsDirty_1720 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KE1720( ) ;
   }

   public void closeExtendedTableCursors1KE1720( )
   {
   }

   public void enableDisable1KE1720( )
   {
   }

   public void getKey1KE1720( )
   {
      /* Using cursor T01KE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1720 = (short)(1) ;
      }
      else
      {
         RcdFound1720 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1KE1720( )
   {
      /* Using cursor T01KE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01KE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KE1720( 4) ;
         RcdFound1720 = (short)(1) ;
         initializeNonKey1KE1720( ) ;
         A12436MaqMtoDia = T01KE3_A12436MaqMtoDia[0] ;
         A12428MaqMtoI1i = T01KE3_A12428MaqMtoI1i[0] ;
         n12428MaqMtoI1i = T01KE3_n12428MaqMtoI1i[0] ;
         A12429MaqMtoI1f = T01KE3_A12429MaqMtoI1f[0] ;
         n12429MaqMtoI1f = T01KE3_n12429MaqMtoI1f[0] ;
         A12430MaqMtoI2i = T01KE3_A12430MaqMtoI2i[0] ;
         n12430MaqMtoI2i = T01KE3_n12430MaqMtoI2i[0] ;
         A12431MaqMtoI2f = T01KE3_A12431MaqMtoI2f[0] ;
         n12431MaqMtoI2f = T01KE3_n12431MaqMtoI2f[0] ;
         A12432MaqMtoI3i = T01KE3_A12432MaqMtoI3i[0] ;
         n12432MaqMtoI3i = T01KE3_n12432MaqMtoI3i[0] ;
         A12433MaqMtoI3f = T01KE3_A12433MaqMtoI3f[0] ;
         n12433MaqMtoI3f = T01KE3_n12433MaqMtoI3f[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z12434MaqAnyM = A12434MaqAnyM ;
         Z12435MaqMesM = A12435MaqMesM ;
         Z12436MaqMtoDia = A12436MaqMtoDia ;
         sMode1720 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KE1720( ) ;
         load1KE1720( ) ;
         Gx_mode = sMode1720 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1720 = (short)(0) ;
         initializeNonKey1KE1720( ) ;
         sMode1720 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KE1720( ) ;
         Gx_mode = sMode1720 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KE1720( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KE1720( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQMT2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z12428MaqMtoI1i, T01KE2_A12428MaqMtoI1i[0]) ) || !( GXutil.dateCompare(Z12429MaqMtoI1f, T01KE2_A12429MaqMtoI1f[0]) ) || !( GXutil.dateCompare(Z12430MaqMtoI2i, T01KE2_A12430MaqMtoI2i[0]) ) || !( GXutil.dateCompare(Z12431MaqMtoI2f, T01KE2_A12431MaqMtoI2f[0]) ) || !( GXutil.dateCompare(Z12432MaqMtoI3i, T01KE2_A12432MaqMtoI3i[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z12433MaqMtoI3f, T01KE2_A12433MaqMtoI3f[0]) ) )
         {
            if ( !( GXutil.dateCompare(Z12428MaqMtoI1i, T01KE2_A12428MaqMtoI1i[0]) ) )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoI1i");
               GXutil.writeLogRaw("Old: ",Z12428MaqMtoI1i);
               GXutil.writeLogRaw("Current: ",T01KE2_A12428MaqMtoI1i[0]);
            }
            if ( !( GXutil.dateCompare(Z12429MaqMtoI1f, T01KE2_A12429MaqMtoI1f[0]) ) )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoI1f");
               GXutil.writeLogRaw("Old: ",Z12429MaqMtoI1f);
               GXutil.writeLogRaw("Current: ",T01KE2_A12429MaqMtoI1f[0]);
            }
            if ( !( GXutil.dateCompare(Z12430MaqMtoI2i, T01KE2_A12430MaqMtoI2i[0]) ) )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoI2i");
               GXutil.writeLogRaw("Old: ",Z12430MaqMtoI2i);
               GXutil.writeLogRaw("Current: ",T01KE2_A12430MaqMtoI2i[0]);
            }
            if ( !( GXutil.dateCompare(Z12431MaqMtoI2f, T01KE2_A12431MaqMtoI2f[0]) ) )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoI2f");
               GXutil.writeLogRaw("Old: ",Z12431MaqMtoI2f);
               GXutil.writeLogRaw("Current: ",T01KE2_A12431MaqMtoI2f[0]);
            }
            if ( !( GXutil.dateCompare(Z12432MaqMtoI3i, T01KE2_A12432MaqMtoI3i[0]) ) )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoI3i");
               GXutil.writeLogRaw("Old: ",Z12432MaqMtoI3i);
               GXutil.writeLogRaw("Current: ",T01KE2_A12432MaqMtoI3i[0]);
            }
            if ( !( GXutil.dateCompare(Z12433MaqMtoI3f, T01KE2_A12433MaqMtoI3f[0]) ) )
            {
               GXutil.writeLogln("tmaqmt1:[seudo value changed for attri]"+"MaqMtoI3f");
               GXutil.writeLogRaw("Old: ",Z12433MaqMtoI3f);
               GXutil.writeLogRaw("Current: ",T01KE2_A12433MaqMtoI3f[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQMT2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KE1720( )
   {
      beforeValidate1KE1720( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KE1720( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KE1720( 0) ;
         checkOptimisticConcurrency1KE1720( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KE1720( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KE1720( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KE19 */
                  pr_default.execute(17, new Object[] {A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia), Boolean.valueOf(n12428MaqMtoI1i), A12428MaqMtoI1i, Boolean.valueOf(n12429MaqMtoI1f), A12429MaqMtoI1f, Boolean.valueOf(n12430MaqMtoI2i), A12430MaqMtoI2i, Boolean.valueOf(n12431MaqMtoI2f), A12431MaqMtoI2f, Boolean.valueOf(n12432MaqMtoI3i), A12432MaqMtoI3i, Boolean.valueOf(n12433MaqMtoI3f), A12433MaqMtoI3f, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQMT2");
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
            load1KE1720( ) ;
         }
         endLevel1KE1720( ) ;
      }
      closeExtendedTableCursors1KE1720( ) ;
   }

   public void update1KE1720( )
   {
      beforeValidate1KE1720( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KE1720( ) ;
      }
      if ( ( nIsMod_1720 != 0 ) || ( nIsDirty_1720 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KE1720( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KE1720( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KE1720( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01KE20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n12428MaqMtoI1i), A12428MaqMtoI1i, Boolean.valueOf(n12429MaqMtoI1f), A12429MaqMtoI1f, Boolean.valueOf(n12430MaqMtoI2i), A12430MaqMtoI2i, Boolean.valueOf(n12431MaqMtoI2f), A12431MaqMtoI2f, Boolean.valueOf(n12432MaqMtoI3i), A12432MaqMtoI3i, Boolean.valueOf(n12433MaqMtoI3f), A12433MaqMtoI3f, A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQMT2");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQMT2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1KE1720( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KE1720( ) ;
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
            endLevel1KE1720( ) ;
         }
      }
      closeExtendedTableCursors1KE1720( ) ;
   }

   public void deferredUpdate1KE1720( )
   {
   }

   public void delete1KE1720( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KE1720( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KE1720( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KE1720( ) ;
         afterConfirm1KE1720( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KE1720( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KE21 */
               pr_default.execute(19, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM), Byte.valueOf(A12436MaqMtoDia)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQMT2");
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
      sMode1720 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KE1720( ) ;
      Gx_mode = sMode1720 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KE1720( )
   {
      standaloneModal1KE1720( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KE1720( )
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

   public void scanStart1KE1720( )
   {
      /* Scan By routine */
      /* Using cursor T01KE22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12434MaqAnyM), Byte.valueOf(A12435MaqMesM)});
      RcdFound1720 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1720 = (short)(1) ;
         A12436MaqMtoDia = T01KE22_A12436MaqMtoDia[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KE1720( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1720 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1720 = (short)(1) ;
         A12436MaqMtoDia = T01KE22_A12436MaqMtoDia[0] ;
      }
   }

   public void scanEnd1KE1720( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1KE1720( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KE1720( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KE1720( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KE1720( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KE1720( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KE1720( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KE1720( )
   {
      edtMaqMtoDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoDia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqMtoI1i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI1i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI1i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqMtoI1f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI1f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI1f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqMtoI2i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI2i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI2i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqMtoI2f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI2f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI2f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqMtoI3i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI3i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI3i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqMtoI3f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoI3f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoI3f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1KE1720( )
   {
   }

   public void send_integrity_lvl_hashes1KE1719( )
   {
   }

   public void subsflControlProps_501720( )
   {
      edtavnRcdDeleted_1720_Internalname = "vNRCDDELETED_1720_"+sGXsfl_50_idx ;
      edtMaqMtoDia_Internalname = "MAQMTODIA_"+sGXsfl_50_idx ;
      edtMaqMtoI1i_Internalname = "MAQMTOI1I_"+sGXsfl_50_idx ;
      edtMaqMtoI1f_Internalname = "MAQMTOI1F_"+sGXsfl_50_idx ;
      edtMaqMtoI2i_Internalname = "MAQMTOI2I_"+sGXsfl_50_idx ;
      edtMaqMtoI2f_Internalname = "MAQMTOI2F_"+sGXsfl_50_idx ;
      edtMaqMtoI3i_Internalname = "MAQMTOI3I_"+sGXsfl_50_idx ;
      edtMaqMtoI3f_Internalname = "MAQMTOI3F_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501720( )
   {
      edtavnRcdDeleted_1720_Internalname = "vNRCDDELETED_1720_"+sGXsfl_50_fel_idx ;
      edtMaqMtoDia_Internalname = "MAQMTODIA_"+sGXsfl_50_fel_idx ;
      edtMaqMtoI1i_Internalname = "MAQMTOI1I_"+sGXsfl_50_fel_idx ;
      edtMaqMtoI1f_Internalname = "MAQMTOI1F_"+sGXsfl_50_fel_idx ;
      edtMaqMtoI2i_Internalname = "MAQMTOI2I_"+sGXsfl_50_fel_idx ;
      edtMaqMtoI2f_Internalname = "MAQMTOI2F_"+sGXsfl_50_fel_idx ;
      edtMaqMtoI3i_Internalname = "MAQMTOI3I_"+sGXsfl_50_fel_idx ;
      edtMaqMtoI3f_Internalname = "MAQMTOI3F_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1KE1720( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501720( ) ;
      sendRow1KE1720( ) ;
   }

   public void sendRow1KE1720( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1720_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1720_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1720), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1720), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1720_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1720_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoDia_Internalname,GXutil.ltrim( localUtil.ntoc( A12436MaqMtoDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12436MaqMtoDia), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoDia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoDia_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoI1i_Internalname,localUtil.ttoc( A12428MaqMtoI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12428MaqMtoI1i, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoI1i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoI1i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoI1f_Internalname,localUtil.ttoc( A12429MaqMtoI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12429MaqMtoI1f, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoI1f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoI1f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoI2i_Internalname,localUtil.ttoc( A12430MaqMtoI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12430MaqMtoI2i, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoI2i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoI2i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoI2f_Internalname,localUtil.ttoc( A12431MaqMtoI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12431MaqMtoI2f, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoI2f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoI2f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoI3i_Internalname,localUtil.ttoc( A12432MaqMtoI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12432MaqMtoI3i, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoI3i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoI3i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1720_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMtoI3f_Internalname,localUtil.ttoc( A12433MaqMtoI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12433MaqMtoI3f, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMtoI3f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqMtoI3f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1KE1720( ) ;
      GXCCtl = "Z12436MaqMtoDia_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12436MaqMtoDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12428MaqMtoI1i_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12428MaqMtoI1i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12429MaqMtoI1f_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12429MaqMtoI1f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12430MaqMtoI2i_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12430MaqMtoI2i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12431MaqMtoI2f_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12431MaqMtoI2f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12432MaqMtoI3i_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12432MaqMtoI3i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12433MaqMtoI3f_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12433MaqMtoI3f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1720_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1720_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1720_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1720, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1720_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1720_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTODIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoDia_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTOI1I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTOI1F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTOI2I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTOI2F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTOI3I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMTOI3F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3f_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1KE1720( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501720( ) ;
      edtavnRcdDeleted_1720_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1720_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoDia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTODIA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoI1i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI1I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoI1f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI1F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoI2i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI2I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoI2f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI2F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoI3i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI3I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqMtoI3f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQMTOI3F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1720_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1720_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1720");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1720_Internalname ;
         wbErr = true ;
         nRcdDeleted_1720 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1720 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1720_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMtoDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMtoDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MAQMTODIA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoDia_Internalname ;
         wbErr = true ;
         A12436MaqMtoDia = (byte)(0) ;
      }
      else
      {
         A12436MaqMtoDia = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMtoDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqMtoI1i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQMTOI1I_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoI1i_Internalname ;
         wbErr = true ;
         A12428MaqMtoI1i = GXutil.resetTime( GXutil.nullDate() );
         n12428MaqMtoI1i = false ;
      }
      else
      {
         A12428MaqMtoI1i = localUtil.ctot( httpContext.cgiGet( edtMaqMtoI1i_Internalname)) ;
         n12428MaqMtoI1i = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqMtoI1f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQMTOI1F_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoI1f_Internalname ;
         wbErr = true ;
         A12429MaqMtoI1f = GXutil.resetTime( GXutil.nullDate() );
         n12429MaqMtoI1f = false ;
      }
      else
      {
         A12429MaqMtoI1f = localUtil.ctot( httpContext.cgiGet( edtMaqMtoI1f_Internalname)) ;
         n12429MaqMtoI1f = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqMtoI2i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQMTOI2I_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoI2i_Internalname ;
         wbErr = true ;
         A12430MaqMtoI2i = GXutil.resetTime( GXutil.nullDate() );
         n12430MaqMtoI2i = false ;
      }
      else
      {
         A12430MaqMtoI2i = localUtil.ctot( httpContext.cgiGet( edtMaqMtoI2i_Internalname)) ;
         n12430MaqMtoI2i = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqMtoI2f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQMTOI2F_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoI2f_Internalname ;
         wbErr = true ;
         A12431MaqMtoI2f = GXutil.resetTime( GXutil.nullDate() );
         n12431MaqMtoI2f = false ;
      }
      else
      {
         A12431MaqMtoI2f = localUtil.ctot( httpContext.cgiGet( edtMaqMtoI2f_Internalname)) ;
         n12431MaqMtoI2f = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqMtoI3i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQMTOI3I_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoI3i_Internalname ;
         wbErr = true ;
         A12432MaqMtoI3i = GXutil.resetTime( GXutil.nullDate() );
         n12432MaqMtoI3i = false ;
      }
      else
      {
         A12432MaqMtoI3i = localUtil.ctot( httpContext.cgiGet( edtMaqMtoI3i_Internalname)) ;
         n12432MaqMtoI3i = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqMtoI3f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQMTOI3F_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqMtoI3f_Internalname ;
         wbErr = true ;
         A12433MaqMtoI3f = GXutil.resetTime( GXutil.nullDate() );
         n12433MaqMtoI3f = false ;
      }
      else
      {
         A12433MaqMtoI3f = localUtil.ctot( httpContext.cgiGet( edtMaqMtoI3f_Internalname)) ;
         n12433MaqMtoI3f = false ;
      }
      GXCCtl = "Z12436MaqMtoDia_" + sGXsfl_50_idx ;
      Z12436MaqMtoDia = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12428MaqMtoI1i_" + sGXsfl_50_idx ;
      Z12428MaqMtoI1i = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12429MaqMtoI1f_" + sGXsfl_50_idx ;
      Z12429MaqMtoI1f = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12430MaqMtoI2i_" + sGXsfl_50_idx ;
      Z12430MaqMtoI2i = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12431MaqMtoI2f_" + sGXsfl_50_idx ;
      Z12431MaqMtoI2f = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12432MaqMtoI3i_" + sGXsfl_50_idx ;
      Z12432MaqMtoI3i = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12433MaqMtoI3f_" + sGXsfl_50_idx ;
      Z12433MaqMtoI3f = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_1720_" + sGXsfl_50_idx ;
      nRcdDeleted_1720 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1720_" + sGXsfl_50_idx ;
      nRcdExists_1720 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1720_" + sGXsfl_50_idx ;
      nIsMod_1720 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqMtoDia_Enabled = edtMaqMtoDia_Enabled ;
   }

   public void confirmValues1KE0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501720( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501720( ) ;
         httpContext.changePostValue( "Z12436MaqMtoDia_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12436MaqMtoDia_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12436MaqMtoDia_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12428MaqMtoI1i_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12428MaqMtoI1i_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12428MaqMtoI1i_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12429MaqMtoI1f_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12429MaqMtoI1f_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12429MaqMtoI1f_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12430MaqMtoI2i_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12430MaqMtoI2i_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12430MaqMtoI2i_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12431MaqMtoI2f_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12431MaqMtoI2f_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12431MaqMtoI2f_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12432MaqMtoI3i_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12432MaqMtoI3i_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12432MaqMtoI3i_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12433MaqMtoI3f_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12433MaqMtoI3f_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12433MaqMtoI3f_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmaqmt1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12434MaqAnyM", GXutil.ltrim( localUtil.ntoc( Z12434MaqAnyM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12435MaqMesM", GXutil.ltrim( localUtil.ntoc( Z12435MaqMesM, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12427MaqMtoMes", GXutil.rtrim( Z12427MaqMtoMes));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmaqmt1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQMT1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "") ;
   }

   public void initializeNonKey1KE1719( )
   {
      A12427MaqMtoMes = "" ;
      n12427MaqMtoMes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12427MaqMtoMes", A12427MaqMtoMes);
      Z12427MaqMtoMes = "" ;
   }

   public void initAll1KE1719( )
   {
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A12434MaqAnyM = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12434MaqAnyM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12434MaqAnyM), 4, 0));
      A12435MaqMesM = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12435MaqMesM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12435MaqMesM), 2, 0));
      initializeNonKey1KE1719( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KE1720( )
   {
      A12428MaqMtoI1i = GXutil.resetTime( GXutil.nullDate() );
      n12428MaqMtoI1i = false ;
      A12429MaqMtoI1f = GXutil.resetTime( GXutil.nullDate() );
      n12429MaqMtoI1f = false ;
      A12430MaqMtoI2i = GXutil.resetTime( GXutil.nullDate() );
      n12430MaqMtoI2i = false ;
      A12431MaqMtoI2f = GXutil.resetTime( GXutil.nullDate() );
      n12431MaqMtoI2f = false ;
      A12432MaqMtoI3i = GXutil.resetTime( GXutil.nullDate() );
      n12432MaqMtoI3i = false ;
      A12433MaqMtoI3f = GXutil.resetTime( GXutil.nullDate() );
      n12433MaqMtoI3f = false ;
      Z12428MaqMtoI1i = GXutil.resetTime( GXutil.nullDate() );
      Z12429MaqMtoI1f = GXutil.resetTime( GXutil.nullDate() );
      Z12430MaqMtoI2i = GXutil.resetTime( GXutil.nullDate() );
      Z12431MaqMtoI2f = GXutil.resetTime( GXutil.nullDate() );
      Z12432MaqMtoI3i = GXutil.resetTime( GXutil.nullDate() );
      Z12433MaqMtoI3f = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1KE1720( )
   {
      A12436MaqMtoDia = (byte)(0) ;
      initializeNonKey1KE1720( ) ;
   }

   public void standaloneModalInsert1KE1720( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584371", true, true);
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
      httpContext.AddJavascriptSource("tmaqmt1.js", "?20268241584371", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1720( )
   {
      edtMaqMtoDia_Enabled = defedtMaqMtoDia_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMtoDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMtoDia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1720, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1720_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12436MaqMtoDia, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoDia_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12428MaqMtoI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12429MaqMtoI1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI1f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12430MaqMtoI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12431MaqMtoI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI2f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12432MaqMtoI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12433MaqMtoI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqMtoI3f_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqAnyM_Internalname = "MAQANYM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqMesM_Internalname = "MAQMESM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqMtoMes_Internalname = "MAQMTOMES" ;
      edtavnRcdDeleted_1720_Internalname = "vNRCDDELETED_1720" ;
      edtMaqMtoDia_Internalname = "MAQMTODIA" ;
      edtMaqMtoI1i_Internalname = "MAQMTOI1I" ;
      edtMaqMtoI1f_Internalname = "MAQMTOI1F" ;
      edtMaqMtoI2i_Internalname = "MAQMTOI2I" ;
      edtMaqMtoI2f_Internalname = "MAQMTOI2F" ;
      edtMaqMtoI3i_Internalname = "MAQMTOI3I" ;
      edtMaqMtoI3f_Internalname = "MAQMTOI3F" ;
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
      Form.setCaption( httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "") );
      edtMaqMtoI3f_Jsonclick = "" ;
      edtMaqMtoI3i_Jsonclick = "" ;
      edtMaqMtoI2f_Jsonclick = "" ;
      edtMaqMtoI2i_Jsonclick = "" ;
      edtMaqMtoI1f_Jsonclick = "" ;
      edtMaqMtoI1i_Jsonclick = "" ;
      edtMaqMtoDia_Jsonclick = "" ;
      edtavnRcdDeleted_1720_Jsonclick = "" ;
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
      edtMaqMtoI3f_Enabled = 1 ;
      edtMaqMtoI3i_Enabled = 1 ;
      edtMaqMtoI2f_Enabled = 1 ;
      edtMaqMtoI2i_Enabled = 1 ;
      edtMaqMtoI1f_Enabled = 1 ;
      edtMaqMtoI1i_Enabled = 1 ;
      edtMaqMtoDia_Enabled = 1 ;
      edtavnRcdDeleted_1720_Enabled = 1 ;
      edtMaqMtoMes_Jsonclick = "" ;
      edtMaqMtoMes_Backcolor = (int)(0xFFFFFF) ;
      edtMaqMtoMes_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqMesM_Jsonclick = "" ;
      edtMaqMesM_Backcolor = (int)(0xFFFFFF) ;
      edtMaqMesM_Enabled = 1 ;
      edtMaqAnyM_Jsonclick = "" ;
      edtMaqAnyM_Backcolor = (int)(0xFFFFFF) ;
      edtMaqAnyM_Enabled = 1 ;
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
      subsflControlProps_501720( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KE1720( ) ;
         standaloneModal1KE1720( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KE1720( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501720( ) ;
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
      /* Using cursor T01KE23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KE23_A407EmprNom[0] ;
      n407EmprNom = T01KE23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T01KE24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(22);
      GX_FocusControl = edtMaqMtoMes_Internalname ;
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
      /* Using cursor T01KE24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Maqmesm( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12427MaqMtoMes", GXutil.rtrim( A12427MaqMtoMes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12434MaqAnyM", GXutil.ltrim( localUtil.ntoc( Z12434MaqAnyM, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12435MaqMesM", GXutil.ltrim( localUtil.ntoc( Z12435MaqMesM, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12427MaqMtoMes", GXutil.rtrim( Z12427MaqMtoMes));
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
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQANYM","{handler:'valid_Maqanym',iparms:[]");
      setEventMetadata("VALID_MAQANYM",",oparms:[]}");
      setEventMetadata("VALID_MAQMESM","{handler:'valid_Maqmesm',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12434MaqAnyM',fld:'MAQANYM',pic:'ZZZ9'},{av:'A12435MaqMesM',fld:'MAQMESM',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQMESM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12427MaqMtoMes',fld:'MAQMTOMES',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z12434MaqAnyM'},{av:'Z12435MaqMesM'},{av:'Z407EmprNom'},{av:'Z12427MaqMtoMes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQMTODIA","{handler:'valid_Maqmtodia',iparms:[]");
      setEventMetadata("VALID_MAQMTODIA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqmtoi3f',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z12427MaqMtoMes = "" ;
      Z12428MaqMtoI1i = GXutil.resetTime( GXutil.nullDate() );
      Z12429MaqMtoI1f = GXutil.resetTime( GXutil.nullDate() );
      Z12430MaqMtoI2i = GXutil.resetTime( GXutil.nullDate() );
      Z12431MaqMtoI2f = GXutil.resetTime( GXutil.nullDate() );
      Z12432MaqMtoI3i = GXutil.resetTime( GXutil.nullDate() );
      Z12433MaqMtoI3f = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12427MaqMtoMes = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1720 = "" ;
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
      sMode1719 = "" ;
      GXCCtl = "" ;
      A12428MaqMtoI1i = GXutil.resetTime( GXutil.nullDate() );
      A12429MaqMtoI1f = GXutil.resetTime( GXutil.nullDate() );
      A12430MaqMtoI2i = GXutil.resetTime( GXutil.nullDate() );
      A12431MaqMtoI2f = GXutil.resetTime( GXutil.nullDate() );
      A12432MaqMtoI3i = GXutil.resetTime( GXutil.nullDate() );
      A12433MaqMtoI3f = GXutil.resetTime( GXutil.nullDate() );
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
      T01KE6_A407EmprNom = new String[] {""} ;
      T01KE6_n407EmprNom = new boolean[] {false} ;
      T01KE8_A12434MaqAnyM = new short[1] ;
      T01KE8_A12435MaqMesM = new byte[1] ;
      T01KE8_A407EmprNom = new String[] {""} ;
      T01KE8_n407EmprNom = new boolean[] {false} ;
      T01KE8_A12427MaqMtoMes = new String[] {""} ;
      T01KE8_n12427MaqMtoMes = new boolean[] {false} ;
      T01KE8_A396EmprCod = new String[] {""} ;
      T01KE8_A602MaqCod = new String[] {""} ;
      T01KE7_A396EmprCod = new String[] {""} ;
      T01KE9_A396EmprCod = new String[] {""} ;
      T01KE10_A396EmprCod = new String[] {""} ;
      T01KE10_A602MaqCod = new String[] {""} ;
      T01KE10_A12434MaqAnyM = new short[1] ;
      T01KE10_A12435MaqMesM = new byte[1] ;
      T01KE5_A12434MaqAnyM = new short[1] ;
      T01KE5_A12435MaqMesM = new byte[1] ;
      T01KE5_A12427MaqMtoMes = new String[] {""} ;
      T01KE5_n12427MaqMtoMes = new boolean[] {false} ;
      T01KE5_A396EmprCod = new String[] {""} ;
      T01KE5_A602MaqCod = new String[] {""} ;
      T01KE11_A396EmprCod = new String[] {""} ;
      T01KE11_A602MaqCod = new String[] {""} ;
      T01KE11_A12434MaqAnyM = new short[1] ;
      T01KE11_A12435MaqMesM = new byte[1] ;
      T01KE12_A396EmprCod = new String[] {""} ;
      T01KE12_A602MaqCod = new String[] {""} ;
      T01KE12_A12434MaqAnyM = new short[1] ;
      T01KE12_A12435MaqMesM = new byte[1] ;
      T01KE4_A12434MaqAnyM = new short[1] ;
      T01KE4_A12435MaqMesM = new byte[1] ;
      T01KE4_A12427MaqMtoMes = new String[] {""} ;
      T01KE4_n12427MaqMtoMes = new boolean[] {false} ;
      T01KE4_A396EmprCod = new String[] {""} ;
      T01KE4_A602MaqCod = new String[] {""} ;
      T01KE16_A396EmprCod = new String[] {""} ;
      T01KE16_A602MaqCod = new String[] {""} ;
      T01KE16_A12434MaqAnyM = new short[1] ;
      T01KE16_A12435MaqMesM = new byte[1] ;
      T01KE17_A602MaqCod = new String[] {""} ;
      T01KE17_A12434MaqAnyM = new short[1] ;
      T01KE17_A12435MaqMesM = new byte[1] ;
      T01KE17_A12436MaqMtoDia = new byte[1] ;
      T01KE17_A12428MaqMtoI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE17_n12428MaqMtoI1i = new boolean[] {false} ;
      T01KE17_A12429MaqMtoI1f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE17_n12429MaqMtoI1f = new boolean[] {false} ;
      T01KE17_A12430MaqMtoI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE17_n12430MaqMtoI2i = new boolean[] {false} ;
      T01KE17_A12431MaqMtoI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE17_n12431MaqMtoI2f = new boolean[] {false} ;
      T01KE17_A12432MaqMtoI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE17_n12432MaqMtoI3i = new boolean[] {false} ;
      T01KE17_A12433MaqMtoI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE17_n12433MaqMtoI3f = new boolean[] {false} ;
      T01KE17_A396EmprCod = new String[] {""} ;
      T01KE18_A396EmprCod = new String[] {""} ;
      T01KE18_A602MaqCod = new String[] {""} ;
      T01KE18_A12434MaqAnyM = new short[1] ;
      T01KE18_A12435MaqMesM = new byte[1] ;
      T01KE18_A12436MaqMtoDia = new byte[1] ;
      T01KE3_A602MaqCod = new String[] {""} ;
      T01KE3_A12434MaqAnyM = new short[1] ;
      T01KE3_A12435MaqMesM = new byte[1] ;
      T01KE3_A12436MaqMtoDia = new byte[1] ;
      T01KE3_A12428MaqMtoI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE3_n12428MaqMtoI1i = new boolean[] {false} ;
      T01KE3_A12429MaqMtoI1f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE3_n12429MaqMtoI1f = new boolean[] {false} ;
      T01KE3_A12430MaqMtoI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE3_n12430MaqMtoI2i = new boolean[] {false} ;
      T01KE3_A12431MaqMtoI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE3_n12431MaqMtoI2f = new boolean[] {false} ;
      T01KE3_A12432MaqMtoI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE3_n12432MaqMtoI3i = new boolean[] {false} ;
      T01KE3_A12433MaqMtoI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE3_n12433MaqMtoI3f = new boolean[] {false} ;
      T01KE3_A396EmprCod = new String[] {""} ;
      T01KE2_A602MaqCod = new String[] {""} ;
      T01KE2_A12434MaqAnyM = new short[1] ;
      T01KE2_A12435MaqMesM = new byte[1] ;
      T01KE2_A12436MaqMtoDia = new byte[1] ;
      T01KE2_A12428MaqMtoI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE2_n12428MaqMtoI1i = new boolean[] {false} ;
      T01KE2_A12429MaqMtoI1f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE2_n12429MaqMtoI1f = new boolean[] {false} ;
      T01KE2_A12430MaqMtoI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE2_n12430MaqMtoI2i = new boolean[] {false} ;
      T01KE2_A12431MaqMtoI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE2_n12431MaqMtoI2f = new boolean[] {false} ;
      T01KE2_A12432MaqMtoI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE2_n12432MaqMtoI3i = new boolean[] {false} ;
      T01KE2_A12433MaqMtoI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KE2_n12433MaqMtoI3f = new boolean[] {false} ;
      T01KE2_A396EmprCod = new String[] {""} ;
      T01KE22_A396EmprCod = new String[] {""} ;
      T01KE22_A602MaqCod = new String[] {""} ;
      T01KE22_A12434MaqAnyM = new short[1] ;
      T01KE22_A12435MaqMesM = new byte[1] ;
      T01KE22_A12436MaqMtoDia = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01KE23_A407EmprNom = new String[] {""} ;
      T01KE23_n407EmprNom = new boolean[] {false} ;
      T01KE24_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ12427MaqMtoMes = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqmt1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqmt1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqmt1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqmt1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqmt1__default(),
         new Object[] {
             new Object[] {
            T01KE2_A602MaqCod, T01KE2_A12434MaqAnyM, T01KE2_A12435MaqMesM, T01KE2_A12436MaqMtoDia, T01KE2_A12428MaqMtoI1i, T01KE2_n12428MaqMtoI1i, T01KE2_A12429MaqMtoI1f, T01KE2_n12429MaqMtoI1f, T01KE2_A12430MaqMtoI2i, T01KE2_n12430MaqMtoI2i,
            T01KE2_A12431MaqMtoI2f, T01KE2_n12431MaqMtoI2f, T01KE2_A12432MaqMtoI3i, T01KE2_n12432MaqMtoI3i, T01KE2_A12433MaqMtoI3f, T01KE2_n12433MaqMtoI3f, T01KE2_A396EmprCod
            }
            , new Object[] {
            T01KE3_A602MaqCod, T01KE3_A12434MaqAnyM, T01KE3_A12435MaqMesM, T01KE3_A12436MaqMtoDia, T01KE3_A12428MaqMtoI1i, T01KE3_n12428MaqMtoI1i, T01KE3_A12429MaqMtoI1f, T01KE3_n12429MaqMtoI1f, T01KE3_A12430MaqMtoI2i, T01KE3_n12430MaqMtoI2i,
            T01KE3_A12431MaqMtoI2f, T01KE3_n12431MaqMtoI2f, T01KE3_A12432MaqMtoI3i, T01KE3_n12432MaqMtoI3i, T01KE3_A12433MaqMtoI3f, T01KE3_n12433MaqMtoI3f, T01KE3_A396EmprCod
            }
            , new Object[] {
            T01KE4_A12434MaqAnyM, T01KE4_A12435MaqMesM, T01KE4_A12427MaqMtoMes, T01KE4_n12427MaqMtoMes, T01KE4_A396EmprCod, T01KE4_A602MaqCod
            }
            , new Object[] {
            T01KE5_A12434MaqAnyM, T01KE5_A12435MaqMesM, T01KE5_A12427MaqMtoMes, T01KE5_n12427MaqMtoMes, T01KE5_A396EmprCod, T01KE5_A602MaqCod
            }
            , new Object[] {
            T01KE6_A407EmprNom, T01KE6_n407EmprNom
            }
            , new Object[] {
            T01KE7_A396EmprCod
            }
            , new Object[] {
            T01KE8_A12434MaqAnyM, T01KE8_A12435MaqMesM, T01KE8_A407EmprNom, T01KE8_n407EmprNom, T01KE8_A12427MaqMtoMes, T01KE8_n12427MaqMtoMes, T01KE8_A396EmprCod, T01KE8_A602MaqCod
            }
            , new Object[] {
            T01KE9_A396EmprCod
            }
            , new Object[] {
            T01KE10_A396EmprCod, T01KE10_A602MaqCod, T01KE10_A12434MaqAnyM, T01KE10_A12435MaqMesM
            }
            , new Object[] {
            T01KE11_A396EmprCod, T01KE11_A602MaqCod, T01KE11_A12434MaqAnyM, T01KE11_A12435MaqMesM
            }
            , new Object[] {
            T01KE12_A396EmprCod, T01KE12_A602MaqCod, T01KE12_A12434MaqAnyM, T01KE12_A12435MaqMesM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KE16_A396EmprCod, T01KE16_A602MaqCod, T01KE16_A12434MaqAnyM, T01KE16_A12435MaqMesM
            }
            , new Object[] {
            T01KE17_A602MaqCod, T01KE17_A12434MaqAnyM, T01KE17_A12435MaqMesM, T01KE17_A12436MaqMtoDia, T01KE17_A12428MaqMtoI1i, T01KE17_n12428MaqMtoI1i, T01KE17_A12429MaqMtoI1f, T01KE17_n12429MaqMtoI1f, T01KE17_A12430MaqMtoI2i, T01KE17_n12430MaqMtoI2i,
            T01KE17_A12431MaqMtoI2f, T01KE17_n12431MaqMtoI2f, T01KE17_A12432MaqMtoI3i, T01KE17_n12432MaqMtoI3i, T01KE17_A12433MaqMtoI3f, T01KE17_n12433MaqMtoI3f, T01KE17_A396EmprCod
            }
            , new Object[] {
            T01KE18_A396EmprCod, T01KE18_A602MaqCod, T01KE18_A12434MaqAnyM, T01KE18_A12435MaqMesM, T01KE18_A12436MaqMtoDia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KE22_A396EmprCod, T01KE22_A602MaqCod, T01KE22_A12434MaqAnyM, T01KE22_A12435MaqMesM, T01KE22_A12436MaqMtoDia
            }
            , new Object[] {
            T01KE23_A407EmprNom, T01KE23_n407EmprNom
            }
            , new Object[] {
            T01KE24_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TMAQMT1" ;
   }

   private byte Z12435MaqMesM ;
   private byte Z12436MaqMtoDia ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12435MaqMesM ;
   private byte A12436MaqMtoDia ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ12435MaqMesM ;
   private short Z12434MaqAnyM ;
   private short nRcdDeleted_1720 ;
   private short nRcdExists_1720 ;
   private short nIsMod_1720 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12434MaqAnyM ;
   private short nBlankRcdCount1720 ;
   private short RcdFound1720 ;
   private short nBlankRcdUsr1720 ;
   private short RcdFound1719 ;
   private short nIsDirty_1719 ;
   private short nIsDirty_1720 ;
   private short ZZ12434MaqAnyM ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqAnyM_Enabled ;
   private int edtMaqMesM_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqMtoMes_Enabled ;
   private int edtavnRcdDeleted_1720_Enabled ;
   private int edtMaqMtoDia_Enabled ;
   private int edtMaqMtoI1i_Enabled ;
   private int edtMaqMtoI1f_Enabled ;
   private int edtMaqMtoI2i_Enabled ;
   private int edtMaqMtoI2f_Enabled ;
   private int edtMaqMtoI3i_Enabled ;
   private int edtMaqMtoI3f_Enabled ;
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
   private int defedtMaqMtoDia_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqMtoMes_Backcolor ;
   private int edtMaqMesM_Backcolor ;
   private int edtMaqAnyM_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z12427MaqMtoMes ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqAnyM_Internalname ;
   private String edtMaqAnyM_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqMesM_Internalname ;
   private String edtMaqMesM_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqMtoMes_Internalname ;
   private String A12427MaqMtoMes ;
   private String edtMaqMtoMes_Jsonclick ;
   private String sMode1720 ;
   private String edtavnRcdDeleted_1720_Internalname ;
   private String edtMaqMtoDia_Internalname ;
   private String edtMaqMtoI1i_Internalname ;
   private String edtMaqMtoI1f_Internalname ;
   private String edtMaqMtoI2i_Internalname ;
   private String edtMaqMtoI2f_Internalname ;
   private String edtMaqMtoI3i_Internalname ;
   private String edtMaqMtoI3f_Internalname ;
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
   private String sMode1719 ;
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
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1720_Jsonclick ;
   private String edtMaqMtoDia_Jsonclick ;
   private String edtMaqMtoI1i_Jsonclick ;
   private String edtMaqMtoI1f_Jsonclick ;
   private String edtMaqMtoI2i_Jsonclick ;
   private String edtMaqMtoI2f_Jsonclick ;
   private String edtMaqMtoI3i_Jsonclick ;
   private String edtMaqMtoI3f_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ12427MaqMtoMes ;
   private java.util.Date Z12428MaqMtoI1i ;
   private java.util.Date Z12429MaqMtoI1f ;
   private java.util.Date Z12430MaqMtoI2i ;
   private java.util.Date Z12431MaqMtoI2f ;
   private java.util.Date Z12432MaqMtoI3i ;
   private java.util.Date Z12433MaqMtoI3f ;
   private java.util.Date A12428MaqMtoI1i ;
   private java.util.Date A12429MaqMtoI1f ;
   private java.util.Date A12430MaqMtoI2i ;
   private java.util.Date A12431MaqMtoI2f ;
   private java.util.Date A12432MaqMtoI3i ;
   private java.util.Date A12433MaqMtoI3f ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12427MaqMtoMes ;
   private boolean returnInSub ;
   private boolean n12428MaqMtoI1i ;
   private boolean n12429MaqMtoI1f ;
   private boolean n12430MaqMtoI2i ;
   private boolean n12431MaqMtoI2f ;
   private boolean n12432MaqMtoI3i ;
   private boolean n12433MaqMtoI3f ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01KE6_A407EmprNom ;
   private boolean[] T01KE6_n407EmprNom ;
   private short[] T01KE8_A12434MaqAnyM ;
   private byte[] T01KE8_A12435MaqMesM ;
   private String[] T01KE8_A407EmprNom ;
   private boolean[] T01KE8_n407EmprNom ;
   private String[] T01KE8_A12427MaqMtoMes ;
   private boolean[] T01KE8_n12427MaqMtoMes ;
   private String[] T01KE8_A396EmprCod ;
   private String[] T01KE8_A602MaqCod ;
   private String[] T01KE7_A396EmprCod ;
   private String[] T01KE9_A396EmprCod ;
   private String[] T01KE10_A396EmprCod ;
   private String[] T01KE10_A602MaqCod ;
   private short[] T01KE10_A12434MaqAnyM ;
   private byte[] T01KE10_A12435MaqMesM ;
   private short[] T01KE5_A12434MaqAnyM ;
   private byte[] T01KE5_A12435MaqMesM ;
   private String[] T01KE5_A12427MaqMtoMes ;
   private boolean[] T01KE5_n12427MaqMtoMes ;
   private String[] T01KE5_A396EmprCod ;
   private String[] T01KE5_A602MaqCod ;
   private String[] T01KE11_A396EmprCod ;
   private String[] T01KE11_A602MaqCod ;
   private short[] T01KE11_A12434MaqAnyM ;
   private byte[] T01KE11_A12435MaqMesM ;
   private String[] T01KE12_A396EmprCod ;
   private String[] T01KE12_A602MaqCod ;
   private short[] T01KE12_A12434MaqAnyM ;
   private byte[] T01KE12_A12435MaqMesM ;
   private short[] T01KE4_A12434MaqAnyM ;
   private byte[] T01KE4_A12435MaqMesM ;
   private String[] T01KE4_A12427MaqMtoMes ;
   private boolean[] T01KE4_n12427MaqMtoMes ;
   private String[] T01KE4_A396EmprCod ;
   private String[] T01KE4_A602MaqCod ;
   private String[] T01KE16_A396EmprCod ;
   private String[] T01KE16_A602MaqCod ;
   private short[] T01KE16_A12434MaqAnyM ;
   private byte[] T01KE16_A12435MaqMesM ;
   private String[] T01KE17_A602MaqCod ;
   private short[] T01KE17_A12434MaqAnyM ;
   private byte[] T01KE17_A12435MaqMesM ;
   private byte[] T01KE17_A12436MaqMtoDia ;
   private java.util.Date[] T01KE17_A12428MaqMtoI1i ;
   private boolean[] T01KE17_n12428MaqMtoI1i ;
   private java.util.Date[] T01KE17_A12429MaqMtoI1f ;
   private boolean[] T01KE17_n12429MaqMtoI1f ;
   private java.util.Date[] T01KE17_A12430MaqMtoI2i ;
   private boolean[] T01KE17_n12430MaqMtoI2i ;
   private java.util.Date[] T01KE17_A12431MaqMtoI2f ;
   private boolean[] T01KE17_n12431MaqMtoI2f ;
   private java.util.Date[] T01KE17_A12432MaqMtoI3i ;
   private boolean[] T01KE17_n12432MaqMtoI3i ;
   private java.util.Date[] T01KE17_A12433MaqMtoI3f ;
   private boolean[] T01KE17_n12433MaqMtoI3f ;
   private String[] T01KE17_A396EmprCod ;
   private String[] T01KE18_A396EmprCod ;
   private String[] T01KE18_A602MaqCod ;
   private short[] T01KE18_A12434MaqAnyM ;
   private byte[] T01KE18_A12435MaqMesM ;
   private byte[] T01KE18_A12436MaqMtoDia ;
   private String[] T01KE3_A602MaqCod ;
   private short[] T01KE3_A12434MaqAnyM ;
   private byte[] T01KE3_A12435MaqMesM ;
   private byte[] T01KE3_A12436MaqMtoDia ;
   private java.util.Date[] T01KE3_A12428MaqMtoI1i ;
   private boolean[] T01KE3_n12428MaqMtoI1i ;
   private java.util.Date[] T01KE3_A12429MaqMtoI1f ;
   private boolean[] T01KE3_n12429MaqMtoI1f ;
   private java.util.Date[] T01KE3_A12430MaqMtoI2i ;
   private boolean[] T01KE3_n12430MaqMtoI2i ;
   private java.util.Date[] T01KE3_A12431MaqMtoI2f ;
   private boolean[] T01KE3_n12431MaqMtoI2f ;
   private java.util.Date[] T01KE3_A12432MaqMtoI3i ;
   private boolean[] T01KE3_n12432MaqMtoI3i ;
   private java.util.Date[] T01KE3_A12433MaqMtoI3f ;
   private boolean[] T01KE3_n12433MaqMtoI3f ;
   private String[] T01KE3_A396EmprCod ;
   private String[] T01KE2_A602MaqCod ;
   private short[] T01KE2_A12434MaqAnyM ;
   private byte[] T01KE2_A12435MaqMesM ;
   private byte[] T01KE2_A12436MaqMtoDia ;
   private java.util.Date[] T01KE2_A12428MaqMtoI1i ;
   private boolean[] T01KE2_n12428MaqMtoI1i ;
   private java.util.Date[] T01KE2_A12429MaqMtoI1f ;
   private boolean[] T01KE2_n12429MaqMtoI1f ;
   private java.util.Date[] T01KE2_A12430MaqMtoI2i ;
   private boolean[] T01KE2_n12430MaqMtoI2i ;
   private java.util.Date[] T01KE2_A12431MaqMtoI2f ;
   private boolean[] T01KE2_n12431MaqMtoI2f ;
   private java.util.Date[] T01KE2_A12432MaqMtoI3i ;
   private boolean[] T01KE2_n12432MaqMtoI3i ;
   private java.util.Date[] T01KE2_A12433MaqMtoI3f ;
   private boolean[] T01KE2_n12433MaqMtoI3f ;
   private String[] T01KE2_A396EmprCod ;
   private String[] T01KE22_A396EmprCod ;
   private String[] T01KE22_A602MaqCod ;
   private short[] T01KE22_A12434MaqAnyM ;
   private byte[] T01KE22_A12435MaqMesM ;
   private byte[] T01KE22_A12436MaqMtoDia ;
   private String[] T01KE23_A407EmprNom ;
   private boolean[] T01KE23_n407EmprNom ;
   private String[] T01KE24_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqmt1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqmt1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqmt1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqmt1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqmt1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KE2", "SELECT MaqCod, MaqAnyM, MaqMesM, MaqMtoDia, MaqMtoI1i, MaqMtoI1f, MaqMtoI2i, MaqMtoI2f, MaqMtoI3i, MaqMtoI3f, EmprCod FROM TXPMAQMT2 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? AND MaqMtoDia = ?  FOR UPDATE OF MaqMtoI1i, MaqMtoI1f, MaqMtoI2i, MaqMtoI2f, MaqMtoI3i, MaqMtoI3f NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE3", "SELECT MaqCod, MaqAnyM, MaqMesM, MaqMtoDia, MaqMtoI1i, MaqMtoI1f, MaqMtoI2i, MaqMtoI2f, MaqMtoI3i, MaqMtoI3f, EmprCod FROM TXPMAQMT2 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? AND MaqMtoDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE4", "SELECT MaqAnyM, MaqMesM, MaqMtoMes, EmprCod, MaqCod FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ?  FOR UPDATE OF MaqMtoMes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE5", "SELECT MaqAnyM, MaqMesM, MaqMtoMes, EmprCod, MaqCod FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE7", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE8", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqAnyM, TM1.MaqMesM, T2.EmprNom, TM1.MaqMtoMes, TM1.EmprCod, TM1.MaqCod FROM (TXPMAQMT1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqAnyM = ? and TM1.MaqMesM = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqAnyM, TM1.MaqMesM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE9", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE ( MaqCod > ? or MaqCod = ? and MaqAnyM > ? or MaqAnyM = ? and MaqCod = ? and MaqMesM > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod, MaqAnyM, MaqMesM) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KE12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE ( MaqCod < ? or MaqCod = ? and MaqAnyM < ? or MaqAnyM = ? and MaqCod = ? and MaqMesM < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC, MaqAnyM DESC, MaqMesM DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KE13", "INSERT INTO TXPMAQMT1(MaqAnyM, MaqMesM, MaqMtoMes, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQMT1")
         ,new UpdateCursor("T01KE14", "UPDATE TXPMAQMT1 SET MaqMtoMes=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ?", GX_NOMASK, "TXPMAQMT1")
         ,new UpdateCursor("T01KE15", "DELETE FROM TXPMAQMT1  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ?", GX_NOMASK, "TXPMAQMT1")
         ,new ForEachCursor("T01KE16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? ORDER BY EmprCod, MaqCod, MaqAnyM, MaqMesM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE17", "SELECT MaqCod, MaqAnyM, MaqMesM, MaqMtoDia, MaqMtoI1i, MaqMtoI1f, MaqMtoI2i, MaqMtoI2f, MaqMtoI3i, MaqMtoI3f, EmprCod FROM TXPMAQMT2 WHERE EmprCod = ? and MaqCod = ? and MaqAnyM = ? and MaqMesM = ? and MaqMtoDia = ? ORDER BY EmprCod, MaqCod, MaqAnyM, MaqMesM, MaqMtoDia ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE18", "SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM, MaqMtoDia FROM TXPMAQMT2 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? AND MaqMtoDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KE19", "INSERT INTO TXPMAQMT2(MaqCod, MaqAnyM, MaqMesM, MaqMtoDia, MaqMtoI1i, MaqMtoI1f, MaqMtoI2i, MaqMtoI2f, MaqMtoI3i, MaqMtoI3f, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQMT2")
         ,new UpdateCursor("T01KE20", "UPDATE TXPMAQMT2 SET MaqMtoI1i=?, MaqMtoI1f=?, MaqMtoI2i=?, MaqMtoI2f=?, MaqMtoI3i=?, MaqMtoI3f=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? AND MaqMtoDia = ?", GX_NOMASK, "TXPMAQMT2")
         ,new UpdateCursor("T01KE21", "DELETE FROM TXPMAQMT2  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyM = ? AND MaqMesM = ? AND MaqMtoDia = ?", GX_NOMASK, "TXPMAQMT2")
         ,new ForEachCursor("T01KE22", "SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM, MaqMtoDia FROM TXPMAQMT2 WHERE EmprCod = ? and MaqCod = ? and MaqAnyM = ? and MaqMesM = ? ORDER BY EmprCod, MaqCod, MaqAnyM, MaqMesM, MaqMtoDia ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KE24", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 63);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 63);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 63);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 63);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 63);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], false);
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

