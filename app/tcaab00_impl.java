package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcaab00_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A652OpeCod) ;
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            A10486Abh_cod = httpContext.GetPar( "Abh_cod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10486Abh_cod", A10486Abh_cod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CAPTURA DATOS ABRIR", ""), (short)(0)) ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A10480Abh_ult = (int)(GXutil.lval( httpContext.GetPar( "Abh_ult"))) ;
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

   public tcaab00_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcaab00_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcaab00_impl.class ));
   }

   public tcaab00_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCAAB00.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtHisProFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFec_Internalname, localUtil.format(A558HisProFec, "99/99/99"), localUtil.format( A558HisProFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFec_Jsonclick, 0, "", "", "", "", "", 1, edtHisProFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCAAB00.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCAAB00.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Linea Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProLin_Jsonclick, 0, "", "", "", "", "", 1, edtHisProLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Seccion Actividad", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAbh_cod_Internalname, GXutil.rtrim( A10486Abh_cod), GXutil.rtrim( localUtil.format( A10486Abh_cod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAbh_cod_Jsonclick, 0, "", "", "", "", "", 1, edtAbh_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAbh_ult_Internalname, GXutil.ltrim( localUtil.ntoc( A10480Abh_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAbh_ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10480Abh_ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10480Abh_ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAbh_ult_Jsonclick, 0, "", "", "", "", "", 1, edtAbh_ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCAAB00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1413 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1413 = (short)(1) ;
            scanStart18C1413( ) ;
            while ( RcdFound1413 != 0 )
            {
               init_level_properties1413( ) ;
               getByPrimaryKey18C1413( ) ;
               addRow18C1413( ) ;
               scanNext18C1413( ) ;
            }
            scanEnd18C1413( ) ;
            nBlankRcdCount1413 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B10480Abh_ult = A10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
         standaloneNotModal18C1413( ) ;
         standaloneModal18C1413( ) ;
         sMode1413 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow18C1413( ) ;
            edtavnRcdDeleted_1413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1413_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1413_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtAbh_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_LIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAbh_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtAbh_car_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_CAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAbh_car_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_car_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtAbh_des_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_DES_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAbh_des_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_des_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtAbh_lmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_LMP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAbh_lmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lmp_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtAbh_dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_DIA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAbh_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_dia_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1413 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18C1413( ) ;
            }
            sendRow18C1413( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10480Abh_ult = B10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1413 = (short)(5) ;
         nRcdExists_1413 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18C1413( ) ;
            while ( RcdFound1413 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551413( ) ;
               init_level_properties1413( ) ;
               standaloneNotModal18C1413( ) ;
               getByPrimaryKey18C1413( ) ;
               standaloneModal18C1413( ) ;
               addRow18C1413( ) ;
               scanNext18C1413( ) ;
            }
            scanEnd18C1413( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1413 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551413( ) ;
      initAll18C1413( ) ;
      init_level_properties1413( ) ;
      B10480Abh_ult = A10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      nRcdExists_1413 = (short)(0) ;
      nIsMod_1413 = (short)(0) ;
      nRcdDeleted_1413 = (short)(0) ;
      nBlankRcdCount1413 = (short)(nBlankRcdUsr1413+nBlankRcdCount1413) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1413 > 0 )
      {
         standaloneNotModal18C1413( ) ;
         standaloneModal18C1413( ) ;
         addRow18C1413( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAbh_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1413 = (short)(nBlankRcdCount1413-1) ;
      }
      Gx_mode = sMode1413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A10480Abh_ult = B10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCAAB00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCAAB00.htm");
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
      e1118C2 ();
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
            Z558HisProFec = localUtil.ctod( httpContext.cgiGet( "Z558HisProFec"), 0) ;
            Z561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z561HisProLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10486Abh_cod = httpContext.cgiGet( "Z10486Abh_cod") ;
            Z10480Abh_ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z10480Abh_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10480Abh_ult = (int)(localUtil.ctol( httpContext.cgiGet( "O10480Abh_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = localUtil.ctod( httpContext.cgiGet( edtHisProFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            A10486Abh_cod = httpContext.cgiGet( edtAbh_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10486Abh_cod", A10486Abh_cod);
            A10480Abh_ult = (int)(localUtil.ctol( httpContext.cgiGet( edtAbh_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
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
               A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
               A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
               A10486Abh_cod = httpContext.GetPar( "Abh_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10486Abh_cod", A10486Abh_cod);
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
                        e1118C2 ();
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
            initAll18C1412( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1413_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes18C1412( ) ;
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

   public void confirm_18C0( )
   {
      beforeValidate18C1412( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18C1412( ) ;
         }
         else
         {
            checkExtendedTable18C1412( ) ;
            if ( AnyError == 0 )
            {
               zm18C1412( 6) ;
               zm18C1412( 7) ;
            }
            closeExtendedTableCursors18C1412( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1412 = Gx_mode ;
         confirm_18C1413( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1412 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues18C0( ) ;
      }
   }

   public void confirm_18C1413( )
   {
      s10480Abh_ult = O10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow18C1413( ) ;
         if ( ( nRcdExists_1413 != 0 ) || ( nIsMod_1413 != 0 ) )
         {
            getKey18C1413( ) ;
            if ( ( nRcdExists_1413 == 0 ) && ( nRcdDeleted_1413 == 0 ) )
            {
               if ( RcdFound1413 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18C1413( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18C1413( ) ;
                     if ( AnyError == 0 )
                     {
                        zm18C1413( 9) ;
                     }
                     closeExtendedTableCursors18C1413( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O10480Abh_ult = A10480Abh_ult ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "ABH_LIN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAbh_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1413 != 0 )
               {
                  if ( nRcdDeleted_1413 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18C1413( ) ;
                     load18C1413( ) ;
                     beforeValidate18C1413( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18C1413( ) ;
                        O10480Abh_ult = A10480Abh_ult ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18C1413( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18C1413( ) ;
                           if ( AnyError == 0 )
                           {
                              zm18C1413( 9) ;
                           }
                           closeExtendedTableCursors18C1413( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O10480Abh_ult = A10480Abh_ult ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1413 == 0 )
                  {
                     GXCCtl = "ABH_LIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAbh_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAbh_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10481Abh_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAbh_car_Internalname, GXutil.rtrim( A10482Abh_car)) ;
         httpContext.changePostValue( edtAbh_des_Internalname, GXutil.rtrim( A10483Abh_des)) ;
         httpContext.changePostValue( edtAbh_lmp_Internalname, GXutil.rtrim( A10484Abh_lmp)) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAbh_dia_Internalname, localUtil.ttoc( A10485Abh_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10481Abh_lin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10481Abh_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10482Abh_car_"+sGXsfl_55_idx, GXutil.rtrim( Z10482Abh_car)) ;
         httpContext.changePostValue( "ZT_"+"Z10483Abh_des_"+sGXsfl_55_idx, GXutil.rtrim( Z10483Abh_des)) ;
         httpContext.changePostValue( "ZT_"+"Z10484Abh_lmp_"+sGXsfl_55_idx, GXutil.rtrim( Z10484Abh_lmp)) ;
         httpContext.changePostValue( "ZT_"+"Z10485Abh_dia_"+sGXsfl_55_idx, localUtil.ttoc( Z10485Abh_dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1413_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1413_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1413_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1413_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_LIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_CAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_car_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_DES_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_des_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_LMP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_DIA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O10480Abh_ult = s10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18C0( )
   {
   }

   public void e1118C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARCODC", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT15_", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASCODC", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PARFASCODC", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN461_", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tcaab00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      AV22Lit11 = httpContext.getMessage( "Nº de veces limpiar  baño", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit11", AV22Lit11);
      AV23Lit12 = httpContext.getMessage( "Nº de veces cambiar cuchillas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit12", AV23Lit12);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcaab00_impl.this.A396EmprCod = GXv_char2[0] ;
      tcaab00_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcaab00_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm18C1412( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10480Abh_ult = T018C6_A10480Abh_ult[0] ;
         }
         else
         {
            Z10480Abh_ult = A10480Abh_ult ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z10486Abh_cod = A10486Abh_cod ;
         Z10480Abh_ult = A10480Abh_ult ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAbh_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_ult_Enabled), 5, 0), true);
      AV37Pgmname = "TCAAB00" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAbh_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_ult_Enabled), 5, 0), true);
      /* Using cursor T018C7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018C7_A407EmprNom[0] ;
      n407EmprNom = T018C7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T018C8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROLIN");
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

   public void load18C1412( )
   {
      /* Using cursor T018C9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1412 = (short)(1) ;
         A407EmprNom = T018C9_A407EmprNom[0] ;
         n407EmprNom = T018C9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10480Abh_ult = T018C9_A10480Abh_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
         zm18C1412( -5) ;
      }
      pr_default.close(7);
      onLoadActions18C1412( ) ;
   }

   public void onLoadActions18C1412( )
   {
   }

   public void checkExtendedTable18C1412( )
   {
      nIsDirty_1412 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors18C1412( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey18C1412( )
   {
      /* Using cursor T018C10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1412 = (short)(1) ;
      }
      else
      {
         RcdFound1412 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018C6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T018C6_A10486Abh_cod[0], A10486Abh_cod) == 0 ) && ( GXutil.strcmp(T018C6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018C6_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018C6_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( T018C6_A561HisProLin[0] == A561HisProLin ) )
      {
         zm18C1412( 5) ;
         RcdFound1412 = (short)(1) ;
         A10480Abh_ult = T018C6_A10480Abh_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
         O10480Abh_ult = A10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         Z10486Abh_cod = A10486Abh_cod ;
         sMode1412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18C1412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1412 = (short)(0) ;
            initializeNonKey18C1412( ) ;
         }
         Gx_mode = sMode1412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1412 = (short)(0) ;
         initializeNonKey18C1412( ) ;
         sMode1412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey18C1412( ) ;
      if ( RcdFound1412 == 0 )
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
      RcdFound1412 = (short)(0) ;
      /* Using cursor T018C11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T018C11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018C11_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018C11_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( T018C11_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T018C11_A10486Abh_cod[0], A10486Abh_cod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T018C11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018C11_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018C11_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( T018C11_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T018C11_A10486Abh_cod[0], A10486Abh_cod) == 0 ) )
         {
            RcdFound1412 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1412 = (short)(0) ;
      /* Using cursor T018C12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T018C12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018C12_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018C12_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( T018C12_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T018C12_A10486Abh_cod[0], A10486Abh_cod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T018C12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018C12_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018C12_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( T018C12_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T018C12_A10486Abh_cod[0], A10486Abh_cod) == 0 ) )
         {
            RcdFound1412 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18C1412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A10480Abh_ult = O10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
         insert18C1412( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1412 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) || ( GXutil.strcmp(A10486Abh_cod, Z10486Abh_cod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A10480Abh_ult = O10480Abh_ult ;
               httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A10480Abh_ult = O10480Abh_ult ;
               httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
               update18C1412( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) || ( GXutil.strcmp(A10486Abh_cod, Z10486Abh_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A10480Abh_ult = O10480Abh_ult ;
               httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
               insert18C1412( ) ;
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
                  A10480Abh_ult = O10480Abh_ult ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
                  insert18C1412( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) || ( GXutil.strcmp(A10486Abh_cod, Z10486Abh_cod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A10480Abh_ult = O10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
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
      getKey18C1412( ) ;
      if ( RcdFound1412 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) || ( GXutil.strcmp(A10486Abh_cod, Z10486Abh_cod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) || ( GXutil.strcmp(A10486Abh_cod, Z10486Abh_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcaab00");
   }

   public void insert_check( )
   {
      confirm_18C0( ) ;
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
      if ( RcdFound1412 == 0 )
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
      scanStart18C1412( ) ;
      if ( RcdFound1412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18C1412( ) ;
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
      if ( RcdFound1412 == 0 )
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
      if ( RcdFound1412 == 0 )
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
      scanStart18C1412( ) ;
      if ( RcdFound1412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1412 != 0 )
         {
            scanNext18C1412( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18C1412( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18C1412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018C5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAAB00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z10480Abh_ult != T018C5_A10480Abh_ult[0] ) )
         {
            if ( Z10480Abh_ult != T018C5_A10480Abh_ult[0] )
            {
               GXutil.writeLogln("tcaab00:[seudo value changed for attri]"+"Abh_ult");
               GXutil.writeLogRaw("Old: ",Z10480Abh_ult);
               GXutil.writeLogRaw("Current: ",T018C5_A10480Abh_ult[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCAAB00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18C1412( )
   {
      beforeValidate18C1412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18C1412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18C1412( 0) ;
         checkOptimisticConcurrency18C1412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18C1412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18C1412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018C13 */
                  pr_default.execute(11, new Object[] {A10486Abh_cod, Integer.valueOf(A10480Abh_ult), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB00");
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
                        processLevel18C1412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18C0( ) ;
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
            load18C1412( ) ;
         }
         endLevel18C1412( ) ;
      }
      closeExtendedTableCursors18C1412( ) ;
   }

   public void update18C1412( )
   {
      beforeValidate18C1412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18C1412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18C1412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18C1412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18C1412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018C14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A10480Abh_ult), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB00");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAAB00"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate18C1412( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18C1412( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18C0( ) ;
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
         endLevel18C1412( ) ;
      }
      closeExtendedTableCursors18C1412( ) ;
   }

   public void deferredUpdate18C1412( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18C1412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18C1412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18C1412( ) ;
         afterConfirm18C1412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18C1412( ) ;
            if ( AnyError == 0 )
            {
               A10480Abh_ult = O10480Abh_ult ;
               httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
               scanStart18C1413( ) ;
               while ( RcdFound1413 != 0 )
               {
                  getByPrimaryKey18C1413( ) ;
                  delete18C1413( ) ;
                  scanNext18C1413( ) ;
                  O10480Abh_ult = A10480Abh_ult ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
               }
               scanEnd18C1413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018C15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB00");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1412 == 0 )
                        {
                           initAll18C1412( ) ;
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
                        resetCaption18C0( ) ;
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
      sMode1412 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18C1412( ) ;
      Gx_mode = sMode1412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18C1412( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel18C1413( )
   {
      s10480Abh_ult = O10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow18C1413( ) ;
         if ( ( nRcdExists_1413 != 0 ) || ( nIsMod_1413 != 0 ) )
         {
            standaloneNotModal18C1413( ) ;
            getKey18C1413( ) ;
            if ( ( nRcdExists_1413 == 0 ) && ( nRcdDeleted_1413 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18C1413( ) ;
            }
            else
            {
               if ( RcdFound1413 != 0 )
               {
                  if ( ( nRcdDeleted_1413 != 0 ) && ( nRcdExists_1413 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18C1413( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18C1413( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1413 == 0 )
                  {
                     GXCCtl = "ABH_LIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAbh_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O10480Abh_ult = A10480Abh_ult ;
            httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAbh_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10481Abh_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAbh_car_Internalname, GXutil.rtrim( A10482Abh_car)) ;
         httpContext.changePostValue( edtAbh_des_Internalname, GXutil.rtrim( A10483Abh_des)) ;
         httpContext.changePostValue( edtAbh_lmp_Internalname, GXutil.rtrim( A10484Abh_lmp)) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAbh_dia_Internalname, localUtil.ttoc( A10485Abh_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10481Abh_lin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10481Abh_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10482Abh_car_"+sGXsfl_55_idx, GXutil.rtrim( Z10482Abh_car)) ;
         httpContext.changePostValue( "ZT_"+"Z10483Abh_des_"+sGXsfl_55_idx, GXutil.rtrim( Z10483Abh_des)) ;
         httpContext.changePostValue( "ZT_"+"Z10484Abh_lmp_"+sGXsfl_55_idx, GXutil.rtrim( Z10484Abh_lmp)) ;
         httpContext.changePostValue( "ZT_"+"Z10485Abh_dia_"+sGXsfl_55_idx, localUtil.ttoc( Z10485Abh_dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1413_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1413_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1413_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1413_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_LIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_CAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_car_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_DES_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_des_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_LMP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ABH_DIA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18C1413( ) ;
      if ( AnyError != 0 )
      {
         O10480Abh_ult = s10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      }
      nRcdExists_1413 = (short)(0) ;
      nIsMod_1413 = (short)(0) ;
      nRcdDeleted_1413 = (short)(0) ;
   }

   public void processLevel18C1412( )
   {
      /* Save parent mode. */
      sMode1412 = Gx_mode ;
      processNestedLevel18C1413( ) ;
      if ( AnyError != 0 )
      {
         O10480Abh_ult = s10480Abh_ult ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T018C16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A10480Abh_ult), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB00");
   }

   public void endLevel18C1412( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete18C1412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcaab00");
         if ( AnyError == 0 )
         {
            confirmValues18C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcaab00");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18C1412( )
   {
      /* Scan By routine */
      /* Using cursor T018C17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      RcdFound1412 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1412 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18C1412( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1412 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1412 = (short)(1) ;
      }
   }

   public void scanEnd18C1412( )
   {
      pr_default.close(15);
   }

   public void afterConfirm18C1412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18C1412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18C1412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18C1412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18C1412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18C1412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18C1412( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtHisProFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Enabled), 5, 0), true);
      edtHisProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), true);
      edtAbh_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_cod_Enabled), 5, 0), true);
      edtAbh_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_ult_Enabled), 5, 0), true);
   }

   public void zm18C1413( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10482Abh_car = T018C3_A10482Abh_car[0] ;
            Z10483Abh_des = T018C3_A10483Abh_des[0] ;
            Z10484Abh_lmp = T018C3_A10484Abh_lmp[0] ;
            Z10485Abh_dia = T018C3_A10485Abh_dia[0] ;
            Z652OpeCod = T018C3_A652OpeCod[0] ;
         }
         else
         {
            Z10482Abh_car = A10482Abh_car ;
            Z10483Abh_des = A10483Abh_des ;
            Z10484Abh_lmp = A10484Abh_lmp ;
            Z10485Abh_dia = A10485Abh_dia ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         Z10486Abh_cod = A10486Abh_cod ;
         Z10481Abh_lin = A10481Abh_lin ;
         Z10482Abh_car = A10482Abh_car ;
         Z10483Abh_des = A10483Abh_des ;
         Z10484Abh_lmp = A10484Abh_lmp ;
         Z10485Abh_dia = A10485Abh_dia ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
      }
   }

   public void standaloneNotModal18C1413( )
   {
      edtAbh_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_ult_Enabled), 5, 0), true);
      edtAbh_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_ult_Enabled), 5, 0), true);
   }

   public void standaloneModal18C1413( )
   {
      if ( isIns( )  )
      {
         A10480Abh_ult = (int)(O10480Abh_ult+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A10481Abh_lin = A10480Abh_ult ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAbh_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAbh_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtAbh_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAbh_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load18C1413( )
   {
      /* Using cursor T018C18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1413 = (short)(1) ;
         A10482Abh_car = T018C18_A10482Abh_car[0] ;
         n10482Abh_car = T018C18_n10482Abh_car[0] ;
         A10483Abh_des = T018C18_A10483Abh_des[0] ;
         A10484Abh_lmp = T018C18_A10484Abh_lmp[0] ;
         A10485Abh_dia = T018C18_A10485Abh_dia[0] ;
         A652OpeCod = T018C18_A652OpeCod[0] ;
         n652OpeCod = T018C18_n652OpeCod[0] ;
         zm18C1413( -8) ;
      }
      pr_default.close(16);
      onLoadActions18C1413( ) ;
   }

   public void onLoadActions18C1413( )
   {
   }

   public void checkExtendedTable18C1413( )
   {
      nIsDirty_1413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal18C1413( ) ;
      /* Using cursor T018C4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors18C1413( )
   {
      pr_default.close(2);
   }

   public void enableDisable18C1413( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T018C19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey18C1413( )
   {
      /* Using cursor T018C20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1413 = (short)(1) ;
      }
      else
      {
         RcdFound1413 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey18C1413( )
   {
      /* Using cursor T018C3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T018C3_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T018C3_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( T018C3_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T018C3_A10486Abh_cod[0], A10486Abh_cod) == 0 ) && ( GXutil.strcmp(T018C3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18C1413( 8) ;
         RcdFound1413 = (short)(1) ;
         initializeNonKey18C1413( ) ;
         A10481Abh_lin = T018C3_A10481Abh_lin[0] ;
         A10482Abh_car = T018C3_A10482Abh_car[0] ;
         n10482Abh_car = T018C3_n10482Abh_car[0] ;
         A10483Abh_des = T018C3_A10483Abh_des[0] ;
         A10484Abh_lmp = T018C3_A10484Abh_lmp[0] ;
         A10485Abh_dia = T018C3_A10485Abh_dia[0] ;
         A652OpeCod = T018C3_A652OpeCod[0] ;
         n652OpeCod = T018C3_n652OpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         Z10486Abh_cod = A10486Abh_cod ;
         Z10481Abh_lin = A10481Abh_lin ;
         sMode1413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18C1413( ) ;
         load18C1413( ) ;
         Gx_mode = sMode1413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1413 = (short)(0) ;
         initializeNonKey18C1413( ) ;
         sMode1413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18C1413( ) ;
         Gx_mode = sMode1413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18C1413( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18C1413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018C2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAAB01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10482Abh_car, T018C2_A10482Abh_car[0]) != 0 ) || ( GXutil.strcmp(Z10483Abh_des, T018C2_A10483Abh_des[0]) != 0 ) || ( GXutil.strcmp(Z10484Abh_lmp, T018C2_A10484Abh_lmp[0]) != 0 ) || !( GXutil.dateCompare(Z10485Abh_dia, T018C2_A10485Abh_dia[0]) ) || ( Z652OpeCod != T018C2_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z10482Abh_car, T018C2_A10482Abh_car[0]) != 0 )
            {
               GXutil.writeLogln("tcaab00:[seudo value changed for attri]"+"Abh_car");
               GXutil.writeLogRaw("Old: ",Z10482Abh_car);
               GXutil.writeLogRaw("Current: ",T018C2_A10482Abh_car[0]);
            }
            if ( GXutil.strcmp(Z10483Abh_des, T018C2_A10483Abh_des[0]) != 0 )
            {
               GXutil.writeLogln("tcaab00:[seudo value changed for attri]"+"Abh_des");
               GXutil.writeLogRaw("Old: ",Z10483Abh_des);
               GXutil.writeLogRaw("Current: ",T018C2_A10483Abh_des[0]);
            }
            if ( GXutil.strcmp(Z10484Abh_lmp, T018C2_A10484Abh_lmp[0]) != 0 )
            {
               GXutil.writeLogln("tcaab00:[seudo value changed for attri]"+"Abh_lmp");
               GXutil.writeLogRaw("Old: ",Z10484Abh_lmp);
               GXutil.writeLogRaw("Current: ",T018C2_A10484Abh_lmp[0]);
            }
            if ( !( GXutil.dateCompare(Z10485Abh_dia, T018C2_A10485Abh_dia[0]) ) )
            {
               GXutil.writeLogln("tcaab00:[seudo value changed for attri]"+"Abh_dia");
               GXutil.writeLogRaw("Old: ",Z10485Abh_dia);
               GXutil.writeLogRaw("Current: ",T018C2_A10485Abh_dia[0]);
            }
            if ( Z652OpeCod != T018C2_A652OpeCod[0] )
            {
               GXutil.writeLogln("tcaab00:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T018C2_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCAAB01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18C1413( )
   {
      beforeValidate18C1413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18C1413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18C1413( 0) ;
         checkOptimisticConcurrency18C1413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18C1413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18C1413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018C21 */
                  pr_default.execute(19, new Object[] {A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin), Boolean.valueOf(n10482Abh_car), A10482Abh_car, A10483Abh_des, A10484Abh_lmp, A10485Abh_dia, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB01");
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
            load18C1413( ) ;
         }
         endLevel18C1413( ) ;
      }
      closeExtendedTableCursors18C1413( ) ;
   }

   public void update18C1413( )
   {
      beforeValidate18C1413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18C1413( ) ;
      }
      if ( ( nIsMod_1413 != 0 ) || ( nIsDirty_1413 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18C1413( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18C1413( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18C1413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018C22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n10482Abh_car), A10482Abh_car, A10483Abh_des, A10484Abh_lmp, A10485Abh_dia, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB01");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAAB01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18C1413( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18C1413( ) ;
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
            endLevel18C1413( ) ;
         }
      }
      closeExtendedTableCursors18C1413( ) ;
   }

   public void deferredUpdate18C1413( )
   {
   }

   public void delete18C1413( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18C1413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18C1413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18C1413( ) ;
         afterConfirm18C1413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18C1413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018C23 */
               pr_default.execute(21, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod, Integer.valueOf(A10481Abh_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAAB01");
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
      sMode1413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18C1413( ) ;
      Gx_mode = sMode1413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18C1413( )
   {
      standaloneModal18C1413( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel18C1413( )
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

   public void scanStart18C1413( )
   {
      /* Scan By routine */
      /* Using cursor T018C24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10486Abh_cod});
      RcdFound1413 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1413 = (short)(1) ;
         A10481Abh_lin = T018C24_A10481Abh_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18C1413( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1413 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1413 = (short)(1) ;
         A10481Abh_lin = T018C24_A10481Abh_lin[0] ;
      }
   }

   public void scanEnd18C1413( )
   {
      pr_default.close(22);
   }

   public void afterConfirm18C1413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18C1413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18C1413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18C1413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18C1413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18C1413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18C1413( )
   {
      edtAbh_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtAbh_car_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_car_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_car_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtAbh_des_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_des_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_des_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtAbh_lmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_lmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lmp_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtAbh_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_dia_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes18C1413( )
   {
   }

   public void send_integrity_lvl_hashes18C1412( )
   {
   }

   public void subsflControlProps_551413( )
   {
      edtavnRcdDeleted_1413_Internalname = "vNRCDDELETED_1413_"+sGXsfl_55_idx ;
      edtAbh_lin_Internalname = "ABH_LIN_"+sGXsfl_55_idx ;
      edtAbh_car_Internalname = "ABH_CAR_"+sGXsfl_55_idx ;
      edtAbh_des_Internalname = "ABH_DES_"+sGXsfl_55_idx ;
      edtAbh_lmp_Internalname = "ABH_LMP_"+sGXsfl_55_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_55_idx ;
      edtAbh_dia_Internalname = "ABH_DIA_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551413( )
   {
      edtavnRcdDeleted_1413_Internalname = "vNRCDDELETED_1413_"+sGXsfl_55_fel_idx ;
      edtAbh_lin_Internalname = "ABH_LIN_"+sGXsfl_55_fel_idx ;
      edtAbh_car_Internalname = "ABH_CAR_"+sGXsfl_55_fel_idx ;
      edtAbh_des_Internalname = "ABH_DES_"+sGXsfl_55_fel_idx ;
      edtAbh_lmp_Internalname = "ABH_LMP_"+sGXsfl_55_fel_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_55_fel_idx ;
      edtAbh_dia_Internalname = "ABH_DIA_"+sGXsfl_55_fel_idx ;
   }

   public void addRow18C1413( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551413( ) ;
      sendRow18C1413( ) ;
   }

   public void sendRow18C1413( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1413_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1413_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1413), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1413), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1413_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1413_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAbh_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A10481Abh_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10481Abh_lin), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAbh_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAbh_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAbh_car_Internalname,GXutil.rtrim( A10482Abh_car),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAbh_car_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAbh_car_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAbh_des_Internalname,GXutil.rtrim( A10483Abh_des),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAbh_des_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAbh_des_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAbh_lmp_Internalname,GXutil.rtrim( A10484Abh_lmp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAbh_lmp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAbh_lmp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOpeCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1413_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAbh_dia_Internalname,localUtil.ttoc( A10485Abh_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10485Abh_dia, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAbh_dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAbh_dia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18C1413( ) ;
      GXCCtl = "Z10481Abh_lin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10481Abh_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10482Abh_car_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10482Abh_car));
      GXCCtl = "Z10483Abh_des_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10483Abh_des));
      GXCCtl = "Z10484Abh_lmp_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10484Abh_lmp));
      GXCCtl = "Z10485Abh_dia_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10485Abh_dia, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z652OpeCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1413_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1413_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1413_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1413_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1413_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ABH_LIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ABH_CAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_car_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ABH_DES_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_des_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ABH_LMP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ABH_DIA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18C1413( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551413( ) ;
      edtavnRcdDeleted_1413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1413_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAbh_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_LIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAbh_car_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_CAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAbh_des_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_DES_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAbh_lmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_LMP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAbh_dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ABH_DIA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1413");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1413_Internalname ;
         wbErr = true ;
         nRcdDeleted_1413 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1413 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAbh_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAbh_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ABH_LIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAbh_lin_Internalname ;
         wbErr = true ;
         A10481Abh_lin = 0 ;
      }
      else
      {
         A10481Abh_lin = (int)(localUtil.ctol( httpContext.cgiGet( edtAbh_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10482Abh_car = httpContext.cgiGet( edtAbh_car_Internalname) ;
      n10482Abh_car = false ;
      A10483Abh_des = httpContext.cgiGet( edtAbh_des_Internalname) ;
      A10484Abh_lmp = httpContext.cgiGet( edtAbh_lmp_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         wbErr = true ;
         A652OpeCod = 0 ;
         n652OpeCod = false ;
      }
      else
      {
         A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n652OpeCod = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtAbh_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "ABH_DIA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAbh_dia_Internalname ;
         wbErr = true ;
         A10485Abh_dia = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A10485Abh_dia = localUtil.ctot( httpContext.cgiGet( edtAbh_dia_Internalname)) ;
      }
      GXCCtl = "Z10481Abh_lin_" + sGXsfl_55_idx ;
      Z10481Abh_lin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10482Abh_car_" + sGXsfl_55_idx ;
      Z10482Abh_car = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10483Abh_des_" + sGXsfl_55_idx ;
      Z10483Abh_des = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10484Abh_lmp_" + sGXsfl_55_idx ;
      Z10484Abh_lmp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10485Abh_dia_" + sGXsfl_55_idx ;
      Z10485Abh_dia = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z652OpeCod_" + sGXsfl_55_idx ;
      Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1413_" + sGXsfl_55_idx ;
      nRcdDeleted_1413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1413_" + sGXsfl_55_idx ;
      nRcdExists_1413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1413_" + sGXsfl_55_idx ;
      nIsMod_1413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAbh_lin_Enabled = edtAbh_lin_Enabled ;
   }

   public void confirmValues18C0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551413( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551413( ) ;
         httpContext.changePostValue( "Z10481Abh_lin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10481Abh_lin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10481Abh_lin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10482Abh_car_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10482Abh_car_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10482Abh_car_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10483Abh_des_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10483Abh_des_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10483Abh_des_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10484Abh_lmp_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10484Abh_lmp_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10484Abh_lmp_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10485Abh_dia_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10485Abh_dia_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10485Abh_dia_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z652OpeCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcaab00", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec)),GXutil.URLEncode(GXutil.ltrimstr(A561HisProLin,8,0)),GXutil.URLEncode(GXutil.rtrim(A10486Abh_cod))}, new String[] {"EmprCod","MaqCod","HisProFec","HisProLin","Abh_cod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.dtoc( Z558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10486Abh_cod", GXutil.rtrim( Z10486Abh_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10480Abh_ult", GXutil.ltrim( localUtil.ntoc( Z10480Abh_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10480Abh_ult", GXutil.ltrim( localUtil.ntoc( O10480Abh_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
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
      return formatLink("app.tcaab00", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec)),GXutil.URLEncode(GXutil.ltrimstr(A561HisProLin,8,0)),GXutil.URLEncode(GXutil.rtrim(A10486Abh_cod))}, new String[] {"EmprCod","MaqCod","HisProFec","HisProLin","Abh_cod"})  ;
   }

   public String getPgmname( )
   {
      return "TCAAB00" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAPTURA DATOS ABRIR", "") ;
   }

   public void initializeNonKey18C1412( )
   {
      A10480Abh_ult = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      O10480Abh_ult = A10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
      Z10480Abh_ult = 0 ;
   }

   public void initAll18C1412( )
   {
      initializeNonKey18C1412( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18C1413( )
   {
      A10482Abh_car = "" ;
      n10482Abh_car = false ;
      A10483Abh_des = "" ;
      A10484Abh_lmp = "" ;
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      A10485Abh_dia = GXutil.resetTime( GXutil.nullDate() );
      Z10482Abh_car = "" ;
      Z10483Abh_des = "" ;
      Z10484Abh_lmp = "" ;
      Z10485Abh_dia = GXutil.resetTime( GXutil.nullDate() );
      Z652OpeCod = 0 ;
   }

   public void initAll18C1413( )
   {
      A10481Abh_lin = 0 ;
      initializeNonKey18C1413( ) ;
   }

   public void standaloneModalInsert18C1413( )
   {
      A10480Abh_ult = i10480Abh_ult ;
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10480Abh_ult), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555014", true, true);
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
      httpContext.AddJavascriptSource("tcaab00.js", "?20268241555014", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1413( )
   {
      edtAbh_lin_Enabled = defedtAbh_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAbh_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAbh_lin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1413, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1413_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10481Abh_lin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10482Abh_car));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_car_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10483Abh_des));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_des_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10484Abh_lmp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_lmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10485Abh_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAbh_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHisProFec_Internalname = "HISPROFEC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAbh_cod_Internalname = "ABH_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAbh_ult_Internalname = "ABH_ULT" ;
      edtavnRcdDeleted_1413_Internalname = "vNRCDDELETED_1413" ;
      edtAbh_lin_Internalname = "ABH_LIN" ;
      edtAbh_car_Internalname = "ABH_CAR" ;
      edtAbh_des_Internalname = "ABH_DES" ;
      edtAbh_lmp_Internalname = "ABH_LMP" ;
      edtOpeCod_Internalname = "OPECOD" ;
      edtAbh_dia_Internalname = "ABH_DIA" ;
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
      Form.setCaption( httpContext.getMessage( "CAPTURA DATOS ABRIR", "") );
      edtAbh_dia_Jsonclick = "" ;
      edtOpeCod_Jsonclick = "" ;
      edtAbh_lmp_Jsonclick = "" ;
      edtAbh_des_Jsonclick = "" ;
      edtAbh_car_Jsonclick = "" ;
      edtAbh_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1413_Jsonclick = "" ;
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
      edtAbh_dia_Enabled = 1 ;
      edtOpeCod_Enabled = 1 ;
      edtAbh_lmp_Enabled = 1 ;
      edtAbh_des_Enabled = 1 ;
      edtAbh_car_Enabled = 1 ;
      edtAbh_lin_Enabled = 1 ;
      edtavnRcdDeleted_1413_Enabled = 1 ;
      edtAbh_ult_Jsonclick = "" ;
      edtAbh_ult_Backcolor = (int)(0xFFFFFF) ;
      edtAbh_ult_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAbh_cod_Jsonclick = "" ;
      edtAbh_cod_Backcolor = (int)(0xFFFFFF) ;
      edtAbh_cod_Enabled = 0 ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProLin_Backcolor = (int)(0xFFFFFF) ;
      edtHisProLin_Enabled = 0 ;
      edtHisProFec_Jsonclick = "" ;
      edtHisProFec_Backcolor = (int)(0xFFFFFF) ;
      edtHisProFec_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 0 ;
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
      subsflControlProps_551413( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18C1413( ) ;
         standaloneModal18C1413( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18C1413( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551413( ) ;
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
      /* Using cursor T018C25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018C25_A407EmprNom[0] ;
      n407EmprNom = T018C25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T018C26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROLIN");
         AnyError = (short)(1) ;
      }
      pr_default.close(24);
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

   public void valid_Abh_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10480Abh_ult", GXutil.ltrim( localUtil.ntoc( A10480Abh_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.format(Z558HisProFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10486Abh_cod", GXutil.rtrim( Z10486Abh_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10480Abh_ult", GXutil.ltrim( localUtil.ntoc( Z10480Abh_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10480Abh_ult", GXutil.ltrim( localUtil.ntoc( O10480Abh_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      /* Using cursor T018C27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A10486Abh_cod',fld:'ABH_COD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_HISPROFEC","{handler:'valid_Hisprofec',iparms:[]");
      setEventMetadata("VALID_HISPROFEC",",oparms:[]}");
      setEventMetadata("VALID_HISPROLIN","{handler:'valid_Hisprolin',iparms:[]");
      setEventMetadata("VALID_HISPROLIN",",oparms:[]}");
      setEventMetadata("VALID_ABH_COD","{handler:'valid_Abh_cod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A10480Abh_ult',fld:'ABH_ULT',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A10486Abh_cod',fld:'ABH_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ABH_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10480Abh_ult',fld:'ABH_ULT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z558HisProFec'},{av:'Z561HisProLin'},{av:'Z10486Abh_cod'},{av:'Z407EmprNom'},{av:'Z10480Abh_ult'},{av:'O10480Abh_ult'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ABH_ULT","{handler:'valid_Abh_ult',iparms:[]");
      setEventMetadata("VALID_ABH_ULT",",oparms:[]}");
      setEventMetadata("VALID_ABH_LIN","{handler:'valid_Abh_lin',iparms:[]");
      setEventMetadata("VALID_ABH_LIN",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_OPECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Abh_dia',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA602MaqCod = "" ;
      wcpOA558HisProFec = GXutil.nullDate() ;
      wcpOA10486Abh_cod = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z558HisProFec = GXutil.nullDate() ;
      Z10486Abh_cod = "" ;
      Z10482Abh_car = "" ;
      Z10483Abh_des = "" ;
      Z10484Abh_lmp = "" ;
      Z10485Abh_dia = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A10486Abh_cod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1413 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1412 = "" ;
      GXCCtl = "" ;
      A10482Abh_car = "" ;
      A10483Abh_des = "" ;
      A10484Abh_lmp = "" ;
      A10485Abh_dia = GXutil.resetTime( GXutil.nullDate() );
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV13Lit9 = "" ;
      AV21Lit10 = "" ;
      GXt_char1 = "" ;
      AV22Lit11 = "" ;
      AV23Lit12 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T018C7_A407EmprNom = new String[] {""} ;
      T018C7_n407EmprNom = new boolean[] {false} ;
      T018C8_A396EmprCod = new String[] {""} ;
      T018C9_A10486Abh_cod = new String[] {""} ;
      T018C9_A407EmprNom = new String[] {""} ;
      T018C9_n407EmprNom = new boolean[] {false} ;
      T018C9_A10480Abh_ult = new int[1] ;
      T018C9_A396EmprCod = new String[] {""} ;
      T018C9_A602MaqCod = new String[] {""} ;
      T018C9_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C9_A561HisProLin = new int[1] ;
      T018C10_A396EmprCod = new String[] {""} ;
      T018C10_A602MaqCod = new String[] {""} ;
      T018C10_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C10_A561HisProLin = new int[1] ;
      T018C10_A10486Abh_cod = new String[] {""} ;
      T018C6_A10486Abh_cod = new String[] {""} ;
      T018C6_A10480Abh_ult = new int[1] ;
      T018C6_A396EmprCod = new String[] {""} ;
      T018C6_A602MaqCod = new String[] {""} ;
      T018C6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C6_A561HisProLin = new int[1] ;
      T018C11_A396EmprCod = new String[] {""} ;
      T018C11_A602MaqCod = new String[] {""} ;
      T018C11_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C11_A561HisProLin = new int[1] ;
      T018C11_A10486Abh_cod = new String[] {""} ;
      T018C12_A396EmprCod = new String[] {""} ;
      T018C12_A602MaqCod = new String[] {""} ;
      T018C12_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C12_A561HisProLin = new int[1] ;
      T018C12_A10486Abh_cod = new String[] {""} ;
      T018C5_A10486Abh_cod = new String[] {""} ;
      T018C5_A10480Abh_ult = new int[1] ;
      T018C5_A396EmprCod = new String[] {""} ;
      T018C5_A602MaqCod = new String[] {""} ;
      T018C5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C5_A561HisProLin = new int[1] ;
      T018C17_A396EmprCod = new String[] {""} ;
      T018C17_A602MaqCod = new String[] {""} ;
      T018C17_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C17_A561HisProLin = new int[1] ;
      T018C17_A10486Abh_cod = new String[] {""} ;
      T018C18_A602MaqCod = new String[] {""} ;
      T018C18_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C18_A561HisProLin = new int[1] ;
      T018C18_A10486Abh_cod = new String[] {""} ;
      T018C18_A10481Abh_lin = new int[1] ;
      T018C18_A10482Abh_car = new String[] {""} ;
      T018C18_n10482Abh_car = new boolean[] {false} ;
      T018C18_A10483Abh_des = new String[] {""} ;
      T018C18_A10484Abh_lmp = new String[] {""} ;
      T018C18_A10485Abh_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018C18_A396EmprCod = new String[] {""} ;
      T018C18_A652OpeCod = new int[1] ;
      T018C18_n652OpeCod = new boolean[] {false} ;
      T018C4_A396EmprCod = new String[] {""} ;
      T018C19_A396EmprCod = new String[] {""} ;
      T018C20_A396EmprCod = new String[] {""} ;
      T018C20_A602MaqCod = new String[] {""} ;
      T018C20_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C20_A561HisProLin = new int[1] ;
      T018C20_A10486Abh_cod = new String[] {""} ;
      T018C20_A10481Abh_lin = new int[1] ;
      T018C3_A602MaqCod = new String[] {""} ;
      T018C3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C3_A561HisProLin = new int[1] ;
      T018C3_A10486Abh_cod = new String[] {""} ;
      T018C3_A10481Abh_lin = new int[1] ;
      T018C3_A10482Abh_car = new String[] {""} ;
      T018C3_n10482Abh_car = new boolean[] {false} ;
      T018C3_A10483Abh_des = new String[] {""} ;
      T018C3_A10484Abh_lmp = new String[] {""} ;
      T018C3_A10485Abh_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018C3_A396EmprCod = new String[] {""} ;
      T018C3_A652OpeCod = new int[1] ;
      T018C3_n652OpeCod = new boolean[] {false} ;
      T018C2_A602MaqCod = new String[] {""} ;
      T018C2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C2_A561HisProLin = new int[1] ;
      T018C2_A10486Abh_cod = new String[] {""} ;
      T018C2_A10481Abh_lin = new int[1] ;
      T018C2_A10482Abh_car = new String[] {""} ;
      T018C2_n10482Abh_car = new boolean[] {false} ;
      T018C2_A10483Abh_des = new String[] {""} ;
      T018C2_A10484Abh_lmp = new String[] {""} ;
      T018C2_A10485Abh_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018C2_A396EmprCod = new String[] {""} ;
      T018C2_A652OpeCod = new int[1] ;
      T018C2_n652OpeCod = new boolean[] {false} ;
      T018C24_A396EmprCod = new String[] {""} ;
      T018C24_A602MaqCod = new String[] {""} ;
      T018C24_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018C24_A561HisProLin = new int[1] ;
      T018C24_A10486Abh_cod = new String[] {""} ;
      T018C24_A10481Abh_lin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018C25_A407EmprNom = new String[] {""} ;
      T018C25_n407EmprNom = new boolean[] {false} ;
      T018C26_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ558HisProFec = GXutil.nullDate() ;
      ZZ10486Abh_cod = "" ;
      ZZ407EmprNom = "" ;
      T018C27_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcaab00__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcaab00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcaab00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcaab00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcaab00__default(),
         new Object[] {
             new Object[] {
            T018C2_A602MaqCod, T018C2_A558HisProFec, T018C2_A561HisProLin, T018C2_A10486Abh_cod, T018C2_A10481Abh_lin, T018C2_A10482Abh_car, T018C2_n10482Abh_car, T018C2_A10483Abh_des, T018C2_A10484Abh_lmp, T018C2_A10485Abh_dia,
            T018C2_A396EmprCod, T018C2_A652OpeCod, T018C2_n652OpeCod
            }
            , new Object[] {
            T018C3_A602MaqCod, T018C3_A558HisProFec, T018C3_A561HisProLin, T018C3_A10486Abh_cod, T018C3_A10481Abh_lin, T018C3_A10482Abh_car, T018C3_n10482Abh_car, T018C3_A10483Abh_des, T018C3_A10484Abh_lmp, T018C3_A10485Abh_dia,
            T018C3_A396EmprCod, T018C3_A652OpeCod, T018C3_n652OpeCod
            }
            , new Object[] {
            T018C4_A396EmprCod
            }
            , new Object[] {
            T018C5_A10486Abh_cod, T018C5_A10480Abh_ult, T018C5_A396EmprCod, T018C5_A602MaqCod, T018C5_A558HisProFec, T018C5_A561HisProLin
            }
            , new Object[] {
            T018C6_A10486Abh_cod, T018C6_A10480Abh_ult, T018C6_A396EmprCod, T018C6_A602MaqCod, T018C6_A558HisProFec, T018C6_A561HisProLin
            }
            , new Object[] {
            T018C7_A407EmprNom, T018C7_n407EmprNom
            }
            , new Object[] {
            T018C8_A396EmprCod
            }
            , new Object[] {
            T018C9_A10486Abh_cod, T018C9_A407EmprNom, T018C9_n407EmprNom, T018C9_A10480Abh_ult, T018C9_A396EmprCod, T018C9_A602MaqCod, T018C9_A558HisProFec, T018C9_A561HisProLin
            }
            , new Object[] {
            T018C10_A396EmprCod, T018C10_A602MaqCod, T018C10_A558HisProFec, T018C10_A561HisProLin, T018C10_A10486Abh_cod
            }
            , new Object[] {
            T018C11_A396EmprCod, T018C11_A602MaqCod, T018C11_A558HisProFec, T018C11_A561HisProLin, T018C11_A10486Abh_cod
            }
            , new Object[] {
            T018C12_A396EmprCod, T018C12_A602MaqCod, T018C12_A558HisProFec, T018C12_A561HisProLin, T018C12_A10486Abh_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018C17_A396EmprCod, T018C17_A602MaqCod, T018C17_A558HisProFec, T018C17_A561HisProLin, T018C17_A10486Abh_cod
            }
            , new Object[] {
            T018C18_A602MaqCod, T018C18_A558HisProFec, T018C18_A561HisProLin, T018C18_A10486Abh_cod, T018C18_A10481Abh_lin, T018C18_A10482Abh_car, T018C18_n10482Abh_car, T018C18_A10483Abh_des, T018C18_A10484Abh_lmp, T018C18_A10485Abh_dia,
            T018C18_A396EmprCod, T018C18_A652OpeCod, T018C18_n652OpeCod
            }
            , new Object[] {
            T018C19_A396EmprCod
            }
            , new Object[] {
            T018C20_A396EmprCod, T018C20_A602MaqCod, T018C20_A558HisProFec, T018C20_A561HisProLin, T018C20_A10486Abh_cod, T018C20_A10481Abh_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018C24_A396EmprCod, T018C24_A602MaqCod, T018C24_A558HisProFec, T018C24_A561HisProLin, T018C24_A10486Abh_cod, T018C24_A10481Abh_lin
            }
            , new Object[] {
            T018C25_A407EmprNom, T018C25_n407EmprNom
            }
            , new Object[] {
            T018C26_A396EmprCod
            }
            , new Object[] {
            T018C27_A396EmprCod
            }
         }
      );
      Z10486Abh_cod = "" ;
      A10486Abh_cod = "" ;
      Z561HisProLin = 0 ;
      A561HisProLin = 0 ;
      Z558HisProFec = GXutil.nullDate() ;
      A558HisProFec = GXutil.nullDate() ;
      Z602MaqCod = "" ;
      A602MaqCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TCAAB00" ;
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
   private short nRcdDeleted_1413 ;
   private short nRcdExists_1413 ;
   private short nIsMod_1413 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1413 ;
   private short RcdFound1413 ;
   private short nBlankRcdUsr1413 ;
   private short RcdFound1412 ;
   private short nIsDirty_1412 ;
   private short nIsDirty_1413 ;
   private int wcpOA561HisProLin ;
   private int Z561HisProLin ;
   private int Z10480Abh_ult ;
   private int O10480Abh_ult ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z10481Abh_lin ;
   private int Z652OpeCod ;
   private int A652OpeCod ;
   private int A561HisProLin ;
   private int trnEnded ;
   private int A10480Abh_ult ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtHisProFec_Enabled ;
   private int edtHisProLin_Enabled ;
   private int edtAbh_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAbh_ult_Enabled ;
   private int B10480Abh_ult ;
   private int edtavnRcdDeleted_1413_Enabled ;
   private int edtAbh_lin_Enabled ;
   private int edtAbh_car_Enabled ;
   private int edtAbh_des_Enabled ;
   private int edtAbh_lmp_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtAbh_dia_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s10480Abh_ult ;
   private int A10481Abh_lin ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAbh_lin_Enabled ;
   private int i10480Abh_ult ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAbh_ult_Backcolor ;
   private int edtAbh_cod_Backcolor ;
   private int edtHisProLin_Backcolor ;
   private int edtHisProFec_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ561HisProLin ;
   private int ZZ10480Abh_ult ;
   private int ZO10480Abh_ult ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String wcpOA10486Abh_cod ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z10486Abh_cod ;
   private String Z10482Abh_car ;
   private String Z10483Abh_des ;
   private String Z10484Abh_lmp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A10486Abh_cod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHisProFec_Internalname ;
   private String edtHisProFec_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHisProLin_Internalname ;
   private String edtHisProLin_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAbh_cod_Internalname ;
   private String edtAbh_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAbh_ult_Internalname ;
   private String edtAbh_ult_Jsonclick ;
   private String sMode1413 ;
   private String edtavnRcdDeleted_1413_Internalname ;
   private String edtAbh_lin_Internalname ;
   private String edtAbh_car_Internalname ;
   private String edtAbh_des_Internalname ;
   private String edtAbh_lmp_Internalname ;
   private String edtOpeCod_Internalname ;
   private String edtAbh_dia_Internalname ;
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
   private String AV37Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1412 ;
   private String GXCCtl ;
   private String A10482Abh_car ;
   private String A10483Abh_des ;
   private String A10484Abh_lmp ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV13Lit9 ;
   private String AV21Lit10 ;
   private String GXt_char1 ;
   private String AV22Lit11 ;
   private String AV23Lit12 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1413_Jsonclick ;
   private String edtAbh_lin_Jsonclick ;
   private String edtAbh_car_Jsonclick ;
   private String edtAbh_des_Jsonclick ;
   private String edtAbh_lmp_Jsonclick ;
   private String edtOpeCod_Jsonclick ;
   private String edtAbh_dia_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ10486Abh_cod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10485Abh_dia ;
   private java.util.Date A10485Abh_dia ;
   private java.util.Date wcpOA558HisProFec ;
   private java.util.Date Z558HisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date ZZ558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10482Abh_car ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018C7_A407EmprNom ;
   private boolean[] T018C7_n407EmprNom ;
   private String[] T018C8_A396EmprCod ;
   private String[] T018C9_A10486Abh_cod ;
   private String[] T018C9_A407EmprNom ;
   private boolean[] T018C9_n407EmprNom ;
   private int[] T018C9_A10480Abh_ult ;
   private String[] T018C9_A396EmprCod ;
   private String[] T018C9_A602MaqCod ;
   private java.util.Date[] T018C9_A558HisProFec ;
   private int[] T018C9_A561HisProLin ;
   private String[] T018C10_A396EmprCod ;
   private String[] T018C10_A602MaqCod ;
   private java.util.Date[] T018C10_A558HisProFec ;
   private int[] T018C10_A561HisProLin ;
   private String[] T018C10_A10486Abh_cod ;
   private String[] T018C6_A10486Abh_cod ;
   private int[] T018C6_A10480Abh_ult ;
   private String[] T018C6_A396EmprCod ;
   private String[] T018C6_A602MaqCod ;
   private java.util.Date[] T018C6_A558HisProFec ;
   private int[] T018C6_A561HisProLin ;
   private String[] T018C11_A396EmprCod ;
   private String[] T018C11_A602MaqCod ;
   private java.util.Date[] T018C11_A558HisProFec ;
   private int[] T018C11_A561HisProLin ;
   private String[] T018C11_A10486Abh_cod ;
   private String[] T018C12_A396EmprCod ;
   private String[] T018C12_A602MaqCod ;
   private java.util.Date[] T018C12_A558HisProFec ;
   private int[] T018C12_A561HisProLin ;
   private String[] T018C12_A10486Abh_cod ;
   private String[] T018C5_A10486Abh_cod ;
   private int[] T018C5_A10480Abh_ult ;
   private String[] T018C5_A396EmprCod ;
   private String[] T018C5_A602MaqCod ;
   private java.util.Date[] T018C5_A558HisProFec ;
   private int[] T018C5_A561HisProLin ;
   private String[] T018C17_A396EmprCod ;
   private String[] T018C17_A602MaqCod ;
   private java.util.Date[] T018C17_A558HisProFec ;
   private int[] T018C17_A561HisProLin ;
   private String[] T018C17_A10486Abh_cod ;
   private String[] T018C18_A602MaqCod ;
   private java.util.Date[] T018C18_A558HisProFec ;
   private int[] T018C18_A561HisProLin ;
   private String[] T018C18_A10486Abh_cod ;
   private int[] T018C18_A10481Abh_lin ;
   private String[] T018C18_A10482Abh_car ;
   private boolean[] T018C18_n10482Abh_car ;
   private String[] T018C18_A10483Abh_des ;
   private String[] T018C18_A10484Abh_lmp ;
   private java.util.Date[] T018C18_A10485Abh_dia ;
   private String[] T018C18_A396EmprCod ;
   private int[] T018C18_A652OpeCod ;
   private boolean[] T018C18_n652OpeCod ;
   private String[] T018C4_A396EmprCod ;
   private String[] T018C19_A396EmprCod ;
   private String[] T018C20_A396EmprCod ;
   private String[] T018C20_A602MaqCod ;
   private java.util.Date[] T018C20_A558HisProFec ;
   private int[] T018C20_A561HisProLin ;
   private String[] T018C20_A10486Abh_cod ;
   private int[] T018C20_A10481Abh_lin ;
   private String[] T018C3_A602MaqCod ;
   private java.util.Date[] T018C3_A558HisProFec ;
   private int[] T018C3_A561HisProLin ;
   private String[] T018C3_A10486Abh_cod ;
   private int[] T018C3_A10481Abh_lin ;
   private String[] T018C3_A10482Abh_car ;
   private boolean[] T018C3_n10482Abh_car ;
   private String[] T018C3_A10483Abh_des ;
   private String[] T018C3_A10484Abh_lmp ;
   private java.util.Date[] T018C3_A10485Abh_dia ;
   private String[] T018C3_A396EmprCod ;
   private int[] T018C3_A652OpeCod ;
   private boolean[] T018C3_n652OpeCod ;
   private String[] T018C2_A602MaqCod ;
   private java.util.Date[] T018C2_A558HisProFec ;
   private int[] T018C2_A561HisProLin ;
   private String[] T018C2_A10486Abh_cod ;
   private int[] T018C2_A10481Abh_lin ;
   private String[] T018C2_A10482Abh_car ;
   private boolean[] T018C2_n10482Abh_car ;
   private String[] T018C2_A10483Abh_des ;
   private String[] T018C2_A10484Abh_lmp ;
   private java.util.Date[] T018C2_A10485Abh_dia ;
   private String[] T018C2_A396EmprCod ;
   private int[] T018C2_A652OpeCod ;
   private boolean[] T018C2_n652OpeCod ;
   private String[] T018C24_A396EmprCod ;
   private String[] T018C24_A602MaqCod ;
   private java.util.Date[] T018C24_A558HisProFec ;
   private int[] T018C24_A561HisProLin ;
   private String[] T018C24_A10486Abh_cod ;
   private int[] T018C24_A10481Abh_lin ;
   private String[] T018C25_A407EmprNom ;
   private boolean[] T018C25_n407EmprNom ;
   private String[] T018C26_A396EmprCod ;
   private String[] T018C27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcaab00__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaab00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaab00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaab00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaab00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018C2", "SELECT MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin, Abh_car, Abh_des, Abh_lmp, Abh_dia, EmprCod, OpeCod FROM TXPCAAB01 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? AND Abh_lin = ?  FOR UPDATE OF Abh_car, Abh_des, Abh_lmp, Abh_dia, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018C3", "SELECT MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin, Abh_car, Abh_des, Abh_lmp, Abh_dia, EmprCod, OpeCod FROM TXPCAAB01 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? AND Abh_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018C4", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C5", "SELECT Abh_cod, Abh_ult, EmprCod, MaqCod, HisProFec, HisProLin FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ?  FOR UPDATE OF Abh_ult NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C6", "SELECT Abh_cod, Abh_ult, EmprCod, MaqCod, HisProFec, HisProLin FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C8", "SELECT EmprCod FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C9", "SELECT /*+ FIRST_ROWS(1) */ TM1.Abh_cod, T2.EmprNom, TM1.Abh_ult, TM1.EmprCod, TM1.MaqCod, TM1.HisProFec, TM1.HisProLin FROM (TXPCAAB00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.HisProFec = ? and TM1.HisProLin = ? and TM1.Abh_cod = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.HisProFec, TM1.HisProLin, TM1.Abh_cod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? and Abh_cod = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? and Abh_cod = ? ORDER BY EmprCod DESC, MaqCod DESC, HisProFec DESC, HisProLin DESC, Abh_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018C13", "INSERT INTO TXPCAAB00(Abh_cod, Abh_ult, EmprCod, MaqCod, HisProFec, HisProLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCAAB00")
         ,new UpdateCursor("T018C14", "UPDATE TXPCAAB00 SET Abh_ult=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ?", GX_NOMASK, "TXPCAAB00")
         ,new UpdateCursor("T018C15", "DELETE FROM TXPCAAB00  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ?", GX_NOMASK, "TXPCAAB00")
         ,new UpdateCursor("T018C16", "UPDATE TXPCAAB00 SET Abh_ult=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ?", GX_NOMASK, "TXPCAAB00")
         ,new ForEachCursor("T018C17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? and Abh_cod = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C18", "SELECT MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin, Abh_car, Abh_des, Abh_lmp, Abh_dia, EmprCod, OpeCod FROM TXPCAAB01 WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? and Abh_cod = ? and Abh_lin = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018C19", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C20", "SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin FROM TXPCAAB01 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? AND Abh_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018C21", "INSERT INTO TXPCAAB01(MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin, Abh_car, Abh_des, Abh_lmp, Abh_dia, EmprCod, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCAAB01")
         ,new UpdateCursor("T018C22", "UPDATE TXPCAAB01 SET Abh_car=?, Abh_des=?, Abh_lmp=?, Abh_dia=?, OpeCod=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? AND Abh_lin = ?", GX_NOMASK, "TXPCAAB01")
         ,new UpdateCursor("T018C23", "DELETE FROM TXPCAAB01  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND Abh_cod = ? AND Abh_lin = ?", GX_NOMASK, "TXPCAAB01")
         ,new ForEachCursor("T018C24", "SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin FROM TXPCAAB01 WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? and Abh_cod = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018C25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C26", "SELECT EmprCod FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018C27", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 25 :
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 1);
               stmt.setDateTime(9, (java.util.Date)parms[9], false);
               stmt.setString(10, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[12]).intValue());
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setDateTime(4, (java.util.Date)parms[4], false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setString(7, (String)parms[8], 6);
               stmt.setDate(8, (java.util.Date)parms[9]);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setString(10, (String)parms[11], 6);
               stmt.setInt(11, ((Number) parms[12]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 25 :
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
      }
   }

}

