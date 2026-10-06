package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpeddg7_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A764ProForCod) ;
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
            A13026PedDGId = (int)(GXutil.lval( httpContext.GetPar( "PedDGId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13026PedDGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13026PedDGId), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A13045PedDGFasLi = (short)(GXutil.lval( httpContext.GetPar( "PedDGFasLi"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13045PedDGFasLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13045PedDGFasLi), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tratamientos Quimicos", ""), (short)(0)) ;
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
      A13056PedDGPQUlt = (short)(GXutil.lval( httpContext.GetPar( "PedDGPQUlt"))) ;
      n13056PedDGPQUlt = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tpeddg7_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpeddg7_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpeddg7_impl.class ));
   }

   public tpeddg7_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPEDDG7.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Pedido Interno", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedDGId_Internalname, GXutil.ltrim( localUtil.ntoc( A13026PedDGId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedDGId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13026PedDGId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13026PedDGId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedDGId_Jsonclick, 0, "", "", "", "", "", 1, edtPedDGId_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedDGFasLi_Internalname, GXutil.ltrim( localUtil.ntoc( A13045PedDGFasLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedDGFasLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13045PedDGFasLi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13045PedDGFasLi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedDGFasLi_Jsonclick, 0, "", "", "", "", "", 1, edtPedDGFasLi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea Procesos QUimicos", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDDG7.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedDGPQUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13056PedDGPQUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedDGPQUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13056PedDGPQUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13056PedDGPQUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedDGPQUlt_Jsonclick, 0, "", "", "", "", "", 1, edtPedDGPQUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDDG7.htm");
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
         nBlankRcdCount1788 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1788 = (short)(1) ;
            scanStart1ME1788( ) ;
            while ( RcdFound1788 != 0 )
            {
               init_level_properties1788( ) ;
               getByPrimaryKey1ME1788( ) ;
               addRow1ME1788( ) ;
               scanNext1ME1788( ) ;
            }
            scanEnd1ME1788( ) ;
            nBlankRcdCount1788 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13056PedDGPQUlt = A13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
         standaloneNotModal1ME1788( ) ;
         standaloneModal1ME1788( ) ;
         sMode1788 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1ME1788( ) ;
            edtavnRcdDeleted_1788_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1788_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1788_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1788_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPedDGPQLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDDGPQLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1788 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1ME1788( ) ;
            }
            sendRow1ME1788( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1788 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13056PedDGPQUlt = B13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1788 = (short)(5) ;
         nRcdExists_1788 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1ME1788( ) ;
            while ( RcdFound1788 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551788( ) ;
               init_level_properties1788( ) ;
               standaloneNotModal1ME1788( ) ;
               getByPrimaryKey1ME1788( ) ;
               standaloneModal1ME1788( ) ;
               addRow1ME1788( ) ;
               scanNext1ME1788( ) ;
            }
            scanEnd1ME1788( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1788 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551788( ) ;
      initAll1ME1788( ) ;
      init_level_properties1788( ) ;
      B13056PedDGPQUlt = A13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      nRcdExists_1788 = (short)(0) ;
      nIsMod_1788 = (short)(0) ;
      nRcdDeleted_1788 = (short)(0) ;
      nBlankRcdCount1788 = (short)(nBlankRcdUsr1788+nBlankRcdCount1788) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1788 > 0 )
      {
         standaloneNotModal1ME1788( ) ;
         standaloneModal1ME1788( ) ;
         addRow1ME1788( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1788 = (short)(nBlankRcdCount1788-1) ;
      }
      Gx_mode = sMode1788 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13056PedDGPQUlt = B13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDDG7.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPEDDG7.htm");
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
      e111ME2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13026PedDGId = (int)(localUtil.ctol( httpContext.cgiGet( "Z13026PedDGId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z13045PedDGFasLi = (short)(localUtil.ctol( httpContext.cgiGet( "Z13045PedDGFasLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13056PedDGPQUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z13056PedDGPQUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13056PedDGPQUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O13056PedDGPQUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33OldProf = httpContext.cgiGet( "vOLDPROF") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A13026PedDGId = (int)(localUtil.ctol( httpContext.cgiGet( edtPedDGId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13026PedDGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13026PedDGId), 8, 0));
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A13045PedDGFasLi = (short)(localUtil.ctol( httpContext.cgiGet( edtPedDGFasLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13045PedDGFasLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13045PedDGFasLi), 4, 0));
            A13056PedDGPQUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtPedDGPQUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13056PedDGPQUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
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
               A13026PedDGId = (int)(GXutil.lval( httpContext.GetPar( "PedDGId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13026PedDGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13026PedDGId), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A13045PedDGFasLi = (short)(GXutil.lval( httpContext.GetPar( "PedDGFasLi"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13045PedDGFasLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13045PedDGFasLi), 4, 0));
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
                        e111ME2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121ME2 ();
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
         /* Execute user event: After Trn */
         e121ME2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1ME1786( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1788_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1788_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1ME1786( ) ;
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

   public void confirm_1ME0( )
   {
      beforeValidate1ME1786( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1ME1786( ) ;
         }
         else
         {
            checkExtendedTable1ME1786( ) ;
            if ( AnyError == 0 )
            {
               zm1ME1786( 8) ;
               zm1ME1786( 9) ;
               zm1ME1786( 10) ;
            }
            closeExtendedTableCursors1ME1786( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1786 = Gx_mode ;
         confirm_1ME1788( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1786 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1786 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1ME0( ) ;
      }
   }

   public void confirm_1ME1788( )
   {
      s13056PedDGPQUlt = O13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1ME1788( ) ;
         if ( ( nRcdExists_1788 != 0 ) || ( nIsMod_1788 != 0 ) )
         {
            getKey1ME1788( ) ;
            if ( ( nRcdExists_1788 == 0 ) && ( nRcdDeleted_1788 == 0 ) )
            {
               if ( RcdFound1788 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1ME1788( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1ME1788( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1ME1788( 12) ;
                     }
                     closeExtendedTableCursors1ME1788( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13056PedDGPQUlt = A13056PedDGPQUlt ;
                     n13056PedDGPQUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1788 != 0 )
               {
                  if ( nRcdDeleted_1788 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1ME1788( ) ;
                     load1ME1788( ) ;
                     beforeValidate1ME1788( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1ME1788( ) ;
                        O13056PedDGPQUlt = A13056PedDGPQUlt ;
                        n13056PedDGPQUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1788 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1ME1788( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1ME1788( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1ME1788( 12) ;
                           }
                           closeExtendedTableCursors1ME1788( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13056PedDGPQUlt = A13056PedDGPQUlt ;
                           n13056PedDGPQUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1788 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1788_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedDGPQLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13057PedDGPQLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13057PedDGPQLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13057PedDGPQLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_55_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1788_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1788_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1788_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1788 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1788_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1788_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDDGPQLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDGPQLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13056PedDGPQUlt = s13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1ME0( )
   {
   }

   public void e111ME2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpeddg7_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tpeddg7_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpeddg7_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpeddg7_impl.this.A396EmprCod = GXv_char2[0] ;
      tpeddg7_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpeddg7_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121ME2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A13026PedDGId ;
      GXv_char3[0] = A758ProCod ;
      GXv_int6[0] = A13045PedDGFasLi ;
      new app.ppddg09(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6) ;
      tpeddg7_impl.this.A396EmprCod = GXv_char4[0] ;
      tpeddg7_impl.this.A13026PedDGId = GXv_int5[0] ;
      tpeddg7_impl.this.A758ProCod = GXv_char3[0] ;
      tpeddg7_impl.this.A13045PedDGFasLi = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A13026PedDGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13026PedDGId), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A13045PedDGFasLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13045PedDGFasLi), 4, 0));
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A13026PedDGId ;
      GXv_char3[0] = A758ProCod ;
      new app.ppddg10(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tpeddg7_impl.this.A396EmprCod = GXv_char4[0] ;
      tpeddg7_impl.this.A13026PedDGId = GXv_int5[0] ;
      tpeddg7_impl.this.A758ProCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A13026PedDGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13026PedDGId), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      /*  Sending Event outputs  */
   }

   public void zm1ME1786( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13056PedDGPQUlt = T01ME6_A13056PedDGPQUlt[0] ;
         }
         else
         {
            Z13056PedDGPQUlt = A13056PedDGPQUlt ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z13045PedDGFasLi = A13045PedDGFasLi ;
         Z13056PedDGPQUlt = A13056PedDGPQUlt ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z13026PedDGId = A13026PedDGId ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPedDGPQUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQUlt_Enabled), 5, 0), true);
      AV36Pgmname = "TPEDDG7" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPedDGPQUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQUlt_Enabled), 5, 0), true);
      /* Using cursor T01ME7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01ME7_A407EmprNom[0] ;
      n407EmprNom = T01ME7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01ME8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01ME8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T01ME9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Procesos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
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

   public void load1ME1786( )
   {
      /* Using cursor T01ME10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1786 = (short)(1) ;
         A407EmprNom = T01ME10_A407EmprNom[0] ;
         n407EmprNom = T01ME10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T01ME10_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A13056PedDGPQUlt = T01ME10_A13056PedDGPQUlt[0] ;
         n13056PedDGPQUlt = T01ME10_n13056PedDGPQUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
         zm1ME1786( -7) ;
      }
      pr_default.close(8);
      onLoadActions1ME1786( ) ;
   }

   public void onLoadActions1ME1786( )
   {
   }

   public void checkExtendedTable1ME1786( )
   {
      nIsDirty_1786 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1ME1786( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1ME1786( )
   {
      /* Using cursor T01ME11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1786 = (short)(1) ;
      }
      else
      {
         RcdFound1786 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01ME6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      if ( (pr_default.getStatus(4) != 101) && ( T01ME6_A13045PedDGFasLi[0] == A13045PedDGFasLi ) && ( GXutil.strcmp(T01ME6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01ME6_A758ProCod[0], A758ProCod) == 0 ) && ( T01ME6_A13026PedDGId[0] == A13026PedDGId ) )
      {
         zm1ME1786( 7) ;
         RcdFound1786 = (short)(1) ;
         A13056PedDGPQUlt = T01ME6_A13056PedDGPQUlt[0] ;
         n13056PedDGPQUlt = T01ME6_n13056PedDGPQUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
         O13056PedDGPQUlt = A13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13026PedDGId = A13026PedDGId ;
         Z758ProCod = A758ProCod ;
         Z13045PedDGFasLi = A13045PedDGFasLi ;
         sMode1786 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1ME1786( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1786 = (short)(0) ;
            initializeNonKey1ME1786( ) ;
         }
         Gx_mode = sMode1786 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1786 = (short)(0) ;
         initializeNonKey1ME1786( ) ;
         sMode1786 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1786 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1ME1786( ) ;
      if ( RcdFound1786 == 0 )
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
      RcdFound1786 = (short)(0) ;
      /* Using cursor T01ME12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01ME12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01ME12_A13026PedDGId[0] == A13026PedDGId ) && ( GXutil.strcmp(T01ME12_A758ProCod[0], A758ProCod) == 0 ) && ( T01ME12_A13045PedDGFasLi[0] == A13045PedDGFasLi ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01ME12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01ME12_A13026PedDGId[0] == A13026PedDGId ) && ( GXutil.strcmp(T01ME12_A758ProCod[0], A758ProCod) == 0 ) && ( T01ME12_A13045PedDGFasLi[0] == A13045PedDGFasLi ) )
         {
            RcdFound1786 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1786 = (short)(0) ;
      /* Using cursor T01ME13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01ME13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01ME13_A13026PedDGId[0] == A13026PedDGId ) && ( GXutil.strcmp(T01ME13_A758ProCod[0], A758ProCod) == 0 ) && ( T01ME13_A13045PedDGFasLi[0] == A13045PedDGFasLi ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01ME13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01ME13_A13026PedDGId[0] == A13026PedDGId ) && ( GXutil.strcmp(T01ME13_A758ProCod[0], A758ProCod) == 0 ) && ( T01ME13_A13045PedDGFasLi[0] == A13045PedDGFasLi ) )
         {
            RcdFound1786 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1ME1786( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13056PedDGPQUlt = O13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
         insert1ME1786( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1786 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13026PedDGId != Z13026PedDGId ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A13045PedDGFasLi != Z13045PedDGFasLi ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13056PedDGPQUlt = O13056PedDGPQUlt ;
               n13056PedDGPQUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13056PedDGPQUlt = O13056PedDGPQUlt ;
               n13056PedDGPQUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
               update1ME1786( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13026PedDGId != Z13026PedDGId ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A13045PedDGFasLi != Z13045PedDGFasLi ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13056PedDGPQUlt = O13056PedDGPQUlt ;
               n13056PedDGPQUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
               insert1ME1786( ) ;
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
                  A13056PedDGPQUlt = O13056PedDGPQUlt ;
                  n13056PedDGPQUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
                  insert1ME1786( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13026PedDGId != Z13026PedDGId ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A13045PedDGFasLi != Z13045PedDGFasLi ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13056PedDGPQUlt = O13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
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
      getKey1ME1786( ) ;
      if ( RcdFound1786 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13026PedDGId != Z13026PedDGId ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A13045PedDGFasLi != Z13045PedDGFasLi ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13026PedDGId != Z13026PedDGId ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A13045PedDGFasLi != Z13045PedDGFasLi ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpeddg7");
   }

   public void insert_check( )
   {
      confirm_1ME0( ) ;
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
      if ( RcdFound1786 == 0 )
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
      scanStart1ME1786( ) ;
      if ( RcdFound1786 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1ME1786( ) ;
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
      if ( RcdFound1786 == 0 )
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
      if ( RcdFound1786 == 0 )
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
      scanStart1ME1786( ) ;
      if ( RcdFound1786 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1786 != 0 )
         {
            scanNext1ME1786( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1ME1786( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1ME1786( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01ME5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDDG5"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z13056PedDGPQUlt != T01ME5_A13056PedDGPQUlt[0] ) )
         {
            if ( Z13056PedDGPQUlt != T01ME5_A13056PedDGPQUlt[0] )
            {
               GXutil.writeLogln("tpeddg7:[seudo value changed for attri]"+"PedDGPQUlt");
               GXutil.writeLogRaw("Old: ",Z13056PedDGPQUlt);
               GXutil.writeLogRaw("Current: ",T01ME5_A13056PedDGPQUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDDG5"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1ME1786( )
   {
      beforeValidate1ME1786( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ME1786( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1ME1786( 0) ;
         checkOptimisticConcurrency1ME1786( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ME1786( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1ME1786( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ME14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A13045PedDGFasLi), Boolean.valueOf(n13056PedDGPQUlt), Short.valueOf(A13056PedDGPQUlt), A396EmprCod, A758ProCod, Integer.valueOf(A13026PedDGId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
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
                        processLevel1ME1786( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1ME0( ) ;
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
            load1ME1786( ) ;
         }
         endLevel1ME1786( ) ;
      }
      closeExtendedTableCursors1ME1786( ) ;
   }

   public void update1ME1786( )
   {
      beforeValidate1ME1786( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ME1786( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ME1786( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ME1786( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1ME1786( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ME15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n13056PedDGPQUlt), Short.valueOf(A13056PedDGPQUlt), A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDDG5"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1ME1786( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1ME1786( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1ME0( ) ;
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
         endLevel1ME1786( ) ;
      }
      closeExtendedTableCursors1ME1786( ) ;
   }

   public void deferredUpdate1ME1786( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1ME1786( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ME1786( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1ME1786( ) ;
         afterConfirm1ME1786( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1ME1786( ) ;
            if ( AnyError == 0 )
            {
               A13056PedDGPQUlt = O13056PedDGPQUlt ;
               n13056PedDGPQUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
               scanStart1ME1788( ) ;
               while ( RcdFound1788 != 0 )
               {
                  getByPrimaryKey1ME1788( ) ;
                  delete1ME1788( ) ;
                  scanNext1ME1788( ) ;
                  O13056PedDGPQUlt = A13056PedDGPQUlt ;
                  n13056PedDGPQUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
               }
               scanEnd1ME1788( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ME16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1786 == 0 )
                        {
                           initAll1ME1786( ) ;
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
                        resetCaption1ME0( ) ;
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
      sMode1786 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1ME1786( ) ;
      Gx_mode = sMode1786 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1ME1786( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01ME17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1ME1788( )
   {
      s13056PedDGPQUlt = O13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1ME1788( ) ;
         if ( ( nRcdExists_1788 != 0 ) || ( nIsMod_1788 != 0 ) )
         {
            standaloneNotModal1ME1788( ) ;
            getKey1ME1788( ) ;
            if ( ( nRcdExists_1788 == 0 ) && ( nRcdDeleted_1788 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1ME1788( ) ;
            }
            else
            {
               if ( RcdFound1788 != 0 )
               {
                  if ( ( nRcdDeleted_1788 != 0 ) && ( nRcdExists_1788 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1ME1788( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1788 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1ME1788( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1788 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O13056PedDGPQUlt = A13056PedDGPQUlt ;
            n13056PedDGPQUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1788_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedDGPQLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13057PedDGPQLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13057PedDGPQLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13057PedDGPQLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_55_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1788_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1788_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1788_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1788 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1788_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1788_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDDGPQLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDGPQLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1ME1788( ) ;
      if ( AnyError != 0 )
      {
         O13056PedDGPQUlt = s13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      }
      nRcdExists_1788 = (short)(0) ;
      nIsMod_1788 = (short)(0) ;
      nRcdDeleted_1788 = (short)(0) ;
   }

   public void processLevel1ME1786( )
   {
      /* Save parent mode. */
      sMode1786 = Gx_mode ;
      processNestedLevel1ME1788( ) ;
      if ( AnyError != 0 )
      {
         O13056PedDGPQUlt = s13056PedDGPQUlt ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1786 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01ME18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n13056PedDGPQUlt), Short.valueOf(A13056PedDGPQUlt), A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
   }

   public void endLevel1ME1786( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1ME1786( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpeddg7");
         if ( AnyError == 0 )
         {
            confirmValues1ME0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpeddg7");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1ME1786( )
   {
      /* Scan By routine */
      /* Using cursor T01ME19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      RcdFound1786 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1786 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1ME1786( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1786 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1786 = (short)(1) ;
      }
   }

   public void scanEnd1ME1786( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1ME1786( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1ME1786( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1ME1786( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1ME1786( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1ME1786( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1ME1786( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1ME1786( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPedDGId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGId_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtPedDGFasLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGFasLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGFasLi_Enabled), 5, 0), true);
      edtPedDGPQUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQUlt_Enabled), 5, 0), true);
   }

   public void zm1ME1788( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z764ProForCod = T01ME3_A764ProForCod[0] ;
         }
         else
         {
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z13026PedDGId = A13026PedDGId ;
         Z758ProCod = A758ProCod ;
         Z13045PedDGFasLi = A13045PedDGFasLi ;
         Z13057PedDGPQLin = A13057PedDGPQLin ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModal1ME1788( )
   {
      edtPedDGPQLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPedDGPQUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQUlt_Enabled), 5, 0), true);
      edtPedDGPQUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1ME1788( )
   {
      if ( isIns( )  )
      {
         A13056PedDGPQUlt = (short)(O13056PedDGPQUlt+10) ;
         n13056PedDGPQUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13057PedDGPQLin = A13056PedDGPQUlt ;
      }
   }

   public void load1ME1788( )
   {
      /* Using cursor T01ME20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1788 = (short)(1) ;
         A766ProForDsc = T01ME20_A766ProForDsc[0] ;
         A764ProForCod = T01ME20_A764ProForCod[0] ;
         n764ProForCod = T01ME20_n764ProForCod[0] ;
         zm1ME1788( -11) ;
      }
      pr_default.close(18);
      onLoadActions1ME1788( ) ;
   }

   public void onLoadActions1ME1788( )
   {
      AV33OldProf = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldProf", AV33OldProf);
   }

   public void checkExtendedTable1ME1788( )
   {
      nIsDirty_1788 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1ME1788( ) ;
      /* Using cursor T01ME4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01ME4_A766ProForDsc[0] ;
      pr_default.close(2);
      AV33OldProf = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldProf", AV33OldProf);
   }

   public void closeExtendedTableCursors1ME1788( )
   {
      pr_default.close(2);
   }

   public void enableDisable1ME1788( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T01ME21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01ME21_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1ME1788( )
   {
      /* Using cursor T01ME22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1788 = (short)(1) ;
      }
      else
      {
         RcdFound1788 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1ME1788( )
   {
      /* Using cursor T01ME3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01ME3_A13026PedDGId[0] == A13026PedDGId ) && ( GXutil.strcmp(T01ME3_A758ProCod[0], A758ProCod) == 0 ) && ( T01ME3_A13045PedDGFasLi[0] == A13045PedDGFasLi ) && ( GXutil.strcmp(T01ME3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1ME1788( 11) ;
         RcdFound1788 = (short)(1) ;
         initializeNonKey1ME1788( ) ;
         A13057PedDGPQLin = T01ME3_A13057PedDGPQLin[0] ;
         A764ProForCod = T01ME3_A764ProForCod[0] ;
         n764ProForCod = T01ME3_n764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13026PedDGId = A13026PedDGId ;
         Z758ProCod = A758ProCod ;
         Z13045PedDGFasLi = A13045PedDGFasLi ;
         Z13057PedDGPQLin = A13057PedDGPQLin ;
         sMode1788 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1ME1788( ) ;
         load1ME1788( ) ;
         Gx_mode = sMode1788 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1788 = (short)(0) ;
         initializeNonKey1ME1788( ) ;
         sMode1788 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1ME1788( ) ;
         Gx_mode = sMode1788 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1ME1788( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1ME1788( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01ME2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDDG7"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z764ProForCod, T01ME2_A764ProForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z764ProForCod, T01ME2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("tpeddg7:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01ME2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDDG7"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1ME1788( )
   {
      beforeValidate1ME1788( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ME1788( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1ME1788( 0) ;
         checkOptimisticConcurrency1ME1788( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ME1788( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1ME1788( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ME23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG7");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1ME1788( ) ;
         }
         endLevel1ME1788( ) ;
      }
      closeExtendedTableCursors1ME1788( ) ;
   }

   public void update1ME1788( )
   {
      beforeValidate1ME1788( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ME1788( ) ;
      }
      if ( ( nIsMod_1788 != 0 ) || ( nIsDirty_1788 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1ME1788( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1ME1788( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1ME1788( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01ME24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG7");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDDG7"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1ME1788( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1ME1788( ) ;
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
            endLevel1ME1788( ) ;
         }
      }
      closeExtendedTableCursors1ME1788( ) ;
   }

   public void deferredUpdate1ME1788( )
   {
   }

   public void delete1ME1788( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1ME1788( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ME1788( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1ME1788( ) ;
         afterConfirm1ME1788( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1ME1788( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01ME25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG7");
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
      sMode1788 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1ME1788( ) ;
      Gx_mode = sMode1788 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1ME1788( )
   {
      standaloneModal1ME1788( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01ME26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         A766ProForDsc = T01ME26_A766ProForDsc[0] ;
         pr_default.close(24);
         AV33OldProf = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OldProf", AV33OldProf);
      }
   }

   public void endLevel1ME1788( )
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

   public void scanStart1ME1788( )
   {
      /* Scan By routine */
      /* Using cursor T01ME27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      RcdFound1788 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1788 = (short)(1) ;
         A13057PedDGPQLin = T01ME27_A13057PedDGPQLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1ME1788( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1788 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1788 = (short)(1) ;
         A13057PedDGPQLin = T01ME27_A13057PedDGPQLin[0] ;
      }
   }

   public void scanEnd1ME1788( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1ME1788( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1ME1788( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1ME1788( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1ME1788( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1ME1788( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1ME1788( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1ME1788( )
   {
      edtPedDGPQLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1ME1788( )
   {
   }

   public void send_integrity_lvl_hashes1ME1786( )
   {
   }

   public void subsflControlProps_551788( )
   {
      edtavnRcdDeleted_1788_Internalname = "vNRCDDELETED_1788_"+sGXsfl_55_idx ;
      edtPedDGPQLin_Internalname = "PEDDGPQLIN_"+sGXsfl_55_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_55_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551788( )
   {
      edtavnRcdDeleted_1788_Internalname = "vNRCDDELETED_1788_"+sGXsfl_55_fel_idx ;
      edtPedDGPQLin_Internalname = "PEDDGPQLIN_"+sGXsfl_55_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_55_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1ME1788( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551788( ) ;
      sendRow1ME1788( ) ;
   }

   public void sendRow1ME1788( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1788_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1788_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1788_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1788), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1788), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1788_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1788_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedDGPQLin_Internalname,GXutil.ltrim( localUtil.ntoc( A13057PedDGPQLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPedDGPQLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13057PedDGPQLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13057PedDGPQLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedDGPQLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPedDGPQLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1788_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1ME1788( ) ;
      GXCCtl = "Z13057PedDGPQLin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13057PedDGPQLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "nRcdDeleted_1788_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1788_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1788_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1788, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1788_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1788_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDDGPQLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDGPQLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1ME1788( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551788( ) ;
      edtavnRcdDeleted_1788_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1788_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedDGPQLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDDGPQLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1788_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1788_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1788");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1788_Internalname ;
         wbErr = true ;
         nRcdDeleted_1788 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1788 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1788_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13057PedDGPQLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPedDGPQLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      n764ProForCod = false ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      GXCCtl = "Z13057PedDGPQLin_" + sGXsfl_55_idx ;
      Z13057PedDGPQLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_55_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1788_" + sGXsfl_55_idx ;
      nRcdDeleted_1788 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1788_" + sGXsfl_55_idx ;
      nRcdExists_1788 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1788_" + sGXsfl_55_idx ;
      nIsMod_1788 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPedDGPQLin_Enabled = edtPedDGPQLin_Enabled ;
   }

   public void confirmValues1ME0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551788( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551788( ) ;
         httpContext.changePostValue( "Z13057PedDGPQLin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13057PedDGPQLin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13057PedDGPQLin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpeddg7", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13026PedDGId,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A13045PedDGFasLi,4,0))}, new String[] {"EmprCod","PedDGId","ProCod","PedDGFasLi"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13026PedDGId", GXutil.ltrim( localUtil.ntoc( Z13026PedDGId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13045PedDGFasLi", GXutil.ltrim( localUtil.ntoc( Z13045PedDGFasLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13056PedDGPQUlt", GXutil.ltrim( localUtil.ntoc( Z13056PedDGPQUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13056PedDGPQUlt", GXutil.ltrim( localUtil.ntoc( O13056PedDGPQUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPROF", GXutil.rtrim( AV33OldProf));
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
      return formatLink("app.tpeddg7", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13026PedDGId,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A13045PedDGFasLi,4,0))}, new String[] {"EmprCod","PedDGId","ProCod","PedDGFasLi"})  ;
   }

   public String getPgmname( )
   {
      return "TPEDDG7" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tratamientos Quimicos", "") ;
   }

   public void initializeNonKey1ME1786( )
   {
      A13056PedDGPQUlt = (short)(0) ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      O13056PedDGPQUlt = A13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
      Z13056PedDGPQUlt = (short)(0) ;
   }

   public void initAll1ME1786( )
   {
      initializeNonKey1ME1786( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1ME1788( )
   {
      AV33OldProf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldProf", AV33OldProf);
      A764ProForCod = "" ;
      n764ProForCod = false ;
      A766ProForDsc = "" ;
      Z764ProForCod = "" ;
   }

   public void initAll1ME1788( )
   {
      A13057PedDGPQLin = (short)(0) ;
      initializeNonKey1ME1788( ) ;
   }

   public void standaloneModalInsert1ME1788( )
   {
      A13056PedDGPQUlt = i13056PedDGPQUlt ;
      n13056PedDGPQUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13056PedDGPQUlt), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241594584", true, true);
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
      httpContext.AddJavascriptSource("tpeddg7.js", "?20268241594584", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1788( )
   {
      edtPedDGPQLin_Enabled = defedtPedDGPQLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDGPQLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDGPQLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1788, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1788_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13057PedDGPQLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDGPQLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPedDGId_Internalname = "PEDDGID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPedDGFasLi_Internalname = "PEDDGFASLI" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPedDGPQUlt_Internalname = "PEDDGPQULT" ;
      edtavnRcdDeleted_1788_Internalname = "vNRCDDELETED_1788" ;
      edtPedDGPQLin_Internalname = "PEDDGPQLIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
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
      Form.setCaption( httpContext.getMessage( "Tratamientos Quimicos", "") );
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtPedDGPQLin_Jsonclick = "" ;
      edtavnRcdDeleted_1788_Jsonclick = "" ;
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
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtPedDGPQLin_Enabled = 0 ;
      edtavnRcdDeleted_1788_Enabled = 1 ;
      edtPedDGPQUlt_Jsonclick = "" ;
      edtPedDGPQUlt_Backcolor = (int)(0xFFFFFF) ;
      edtPedDGPQUlt_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPedDGFasLi_Jsonclick = "" ;
      edtPedDGFasLi_Backcolor = (int)(0xFFFFFF) ;
      edtPedDGFasLi_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtPedDGId_Jsonclick = "" ;
      edtPedDGId_Backcolor = (int)(0xFFFFFF) ;
      edtPedDGId_Enabled = 0 ;
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
      subsflControlProps_551788( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1ME1788( ) ;
         standaloneModal1ME1788( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1ME1788( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551788( ) ;
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
      /* Using cursor T01ME28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01ME28_A407EmprNom[0] ;
      n407EmprNom = T01ME28_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T01ME29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01ME29_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(27);
      /* Using cursor T01ME30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Procesos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(28);
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

   public void valid_Peddgfasli( )
   {
      n13056PedDGPQUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13056PedDGPQUlt", GXutil.ltrim( localUtil.ntoc( A13056PedDGPQUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13026PedDGId", GXutil.ltrim( localUtil.ntoc( Z13026PedDGId, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13045PedDGFasLi", GXutil.ltrim( localUtil.ntoc( Z13045PedDGFasLi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13056PedDGPQUlt", GXutil.ltrim( localUtil.ntoc( Z13056PedDGPQUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13056PedDGPQUlt", GXutil.ltrim( localUtil.ntoc( O13056PedDGPQUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      /* Using cursor T01ME26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T01ME26_A766ProForDsc[0] ;
      pr_default.close(24);
      AV33OldProf = A764ProForCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV33OldProf", GXutil.rtrim( AV33OldProf));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13026PedDGId',fld:'PEDDGID',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A13045PedDGFasLi',fld:'PEDDGFASLI',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121ME2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13026PedDGId',fld:'PEDDGID',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A13045PedDGFasLi',fld:'PEDDGFASLI',pic:'ZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A13045PedDGFasLi',fld:'PEDDGFASLI',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A13026PedDGId',fld:'PEDDGID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PEDDGID","{handler:'valid_Peddgid',iparms:[]");
      setEventMetadata("VALID_PEDDGID",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_PEDDGFASLI","{handler:'valid_Peddgfasli',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A13056PedDGPQUlt',fld:'PEDDGPQULT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13026PedDGId',fld:'PEDDGID',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A13045PedDGFasLi',fld:'PEDDGFASLI',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PEDDGFASLI",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A13056PedDGPQUlt',fld:'PEDDGPQULT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13026PedDGId'},{av:'Z758ProCod'},{av:'Z13045PedDGFasLi'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z13056PedDGPQUlt'},{av:'O13056PedDGPQUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PEDDGPQULT","{handler:'valid_Peddgpqult',iparms:[]");
      setEventMetadata("VALID_PEDDGPQULT",",oparms:[]}");
      setEventMetadata("VALID_PEDDGPQLIN","{handler:'valid_Peddgpqlin',iparms:[]");
      setEventMetadata("VALID_PEDDGPQLIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'AV33OldProf',fld:'vOLDPROF',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'AV33OldProf',fld:'vOLDPROF',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Profordsc',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A758ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      A759ProDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1788 = "" ;
      Gx_mode = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      AV33OldProf = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1786 = "" ;
      A766ProForDsc = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      T01ME7_A407EmprNom = new String[] {""} ;
      T01ME7_n407EmprNom = new boolean[] {false} ;
      T01ME8_A759ProDsc = new String[] {""} ;
      T01ME9_A396EmprCod = new String[] {""} ;
      T01ME10_A13045PedDGFasLi = new short[1] ;
      T01ME10_A407EmprNom = new String[] {""} ;
      T01ME10_n407EmprNom = new boolean[] {false} ;
      T01ME10_A759ProDsc = new String[] {""} ;
      T01ME10_A13056PedDGPQUlt = new short[1] ;
      T01ME10_n13056PedDGPQUlt = new boolean[] {false} ;
      T01ME10_A396EmprCod = new String[] {""} ;
      T01ME10_A758ProCod = new String[] {""} ;
      T01ME10_A13026PedDGId = new int[1] ;
      T01ME11_A396EmprCod = new String[] {""} ;
      T01ME11_A13026PedDGId = new int[1] ;
      T01ME11_A758ProCod = new String[] {""} ;
      T01ME11_A13045PedDGFasLi = new short[1] ;
      T01ME6_A13045PedDGFasLi = new short[1] ;
      T01ME6_A13056PedDGPQUlt = new short[1] ;
      T01ME6_n13056PedDGPQUlt = new boolean[] {false} ;
      T01ME6_A396EmprCod = new String[] {""} ;
      T01ME6_A758ProCod = new String[] {""} ;
      T01ME6_A13026PedDGId = new int[1] ;
      T01ME12_A396EmprCod = new String[] {""} ;
      T01ME12_A13026PedDGId = new int[1] ;
      T01ME12_A758ProCod = new String[] {""} ;
      T01ME12_A13045PedDGFasLi = new short[1] ;
      T01ME13_A396EmprCod = new String[] {""} ;
      T01ME13_A13026PedDGId = new int[1] ;
      T01ME13_A758ProCod = new String[] {""} ;
      T01ME13_A13045PedDGFasLi = new short[1] ;
      T01ME5_A13045PedDGFasLi = new short[1] ;
      T01ME5_A13056PedDGPQUlt = new short[1] ;
      T01ME5_n13056PedDGPQUlt = new boolean[] {false} ;
      T01ME5_A396EmprCod = new String[] {""} ;
      T01ME5_A758ProCod = new String[] {""} ;
      T01ME5_A13026PedDGId = new int[1] ;
      T01ME17_A396EmprCod = new String[] {""} ;
      T01ME17_A13026PedDGId = new int[1] ;
      T01ME17_A758ProCod = new String[] {""} ;
      T01ME17_A13045PedDGFasLi = new short[1] ;
      T01ME17_A1664ParFasCod = new short[1] ;
      T01ME19_A396EmprCod = new String[] {""} ;
      T01ME19_A13026PedDGId = new int[1] ;
      T01ME19_A758ProCod = new String[] {""} ;
      T01ME19_A13045PedDGFasLi = new short[1] ;
      Z766ProForDsc = "" ;
      T01ME20_A13026PedDGId = new int[1] ;
      T01ME20_A758ProCod = new String[] {""} ;
      T01ME20_A13045PedDGFasLi = new short[1] ;
      T01ME20_A13057PedDGPQLin = new short[1] ;
      T01ME20_A766ProForDsc = new String[] {""} ;
      T01ME20_A396EmprCod = new String[] {""} ;
      T01ME20_A764ProForCod = new String[] {""} ;
      T01ME20_n764ProForCod = new boolean[] {false} ;
      T01ME4_A766ProForDsc = new String[] {""} ;
      GXCCtl = "" ;
      T01ME21_A766ProForDsc = new String[] {""} ;
      T01ME22_A396EmprCod = new String[] {""} ;
      T01ME22_A13026PedDGId = new int[1] ;
      T01ME22_A758ProCod = new String[] {""} ;
      T01ME22_A13045PedDGFasLi = new short[1] ;
      T01ME22_A13057PedDGPQLin = new short[1] ;
      T01ME3_A13026PedDGId = new int[1] ;
      T01ME3_A758ProCod = new String[] {""} ;
      T01ME3_A13045PedDGFasLi = new short[1] ;
      T01ME3_A13057PedDGPQLin = new short[1] ;
      T01ME3_A396EmprCod = new String[] {""} ;
      T01ME3_A764ProForCod = new String[] {""} ;
      T01ME3_n764ProForCod = new boolean[] {false} ;
      T01ME2_A13026PedDGId = new int[1] ;
      T01ME2_A758ProCod = new String[] {""} ;
      T01ME2_A13045PedDGFasLi = new short[1] ;
      T01ME2_A13057PedDGPQLin = new short[1] ;
      T01ME2_A396EmprCod = new String[] {""} ;
      T01ME2_A764ProForCod = new String[] {""} ;
      T01ME2_n764ProForCod = new boolean[] {false} ;
      T01ME26_A766ProForDsc = new String[] {""} ;
      T01ME27_A396EmprCod = new String[] {""} ;
      T01ME27_A13026PedDGId = new int[1] ;
      T01ME27_A758ProCod = new String[] {""} ;
      T01ME27_A13045PedDGFasLi = new short[1] ;
      T01ME27_A13057PedDGPQLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01ME28_A407EmprNom = new String[] {""} ;
      T01ME28_n407EmprNom = new boolean[] {false} ;
      T01ME29_A759ProDsc = new String[] {""} ;
      T01ME30_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZV33OldProf = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpeddg7__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpeddg7__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpeddg7__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpeddg7__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpeddg7__default(),
         new Object[] {
             new Object[] {
            T01ME2_A13026PedDGId, T01ME2_A758ProCod, T01ME2_A13045PedDGFasLi, T01ME2_A13057PedDGPQLin, T01ME2_A396EmprCod, T01ME2_A764ProForCod, T01ME2_n764ProForCod
            }
            , new Object[] {
            T01ME3_A13026PedDGId, T01ME3_A758ProCod, T01ME3_A13045PedDGFasLi, T01ME3_A13057PedDGPQLin, T01ME3_A396EmprCod, T01ME3_A764ProForCod, T01ME3_n764ProForCod
            }
            , new Object[] {
            T01ME4_A766ProForDsc
            }
            , new Object[] {
            T01ME5_A13045PedDGFasLi, T01ME5_A13056PedDGPQUlt, T01ME5_n13056PedDGPQUlt, T01ME5_A396EmprCod, T01ME5_A758ProCod, T01ME5_A13026PedDGId
            }
            , new Object[] {
            T01ME6_A13045PedDGFasLi, T01ME6_A13056PedDGPQUlt, T01ME6_n13056PedDGPQUlt, T01ME6_A396EmprCod, T01ME6_A758ProCod, T01ME6_A13026PedDGId
            }
            , new Object[] {
            T01ME7_A407EmprNom, T01ME7_n407EmprNom
            }
            , new Object[] {
            T01ME8_A759ProDsc
            }
            , new Object[] {
            T01ME9_A396EmprCod
            }
            , new Object[] {
            T01ME10_A13045PedDGFasLi, T01ME10_A407EmprNom, T01ME10_n407EmprNom, T01ME10_A759ProDsc, T01ME10_A13056PedDGPQUlt, T01ME10_n13056PedDGPQUlt, T01ME10_A396EmprCod, T01ME10_A758ProCod, T01ME10_A13026PedDGId
            }
            , new Object[] {
            T01ME11_A396EmprCod, T01ME11_A13026PedDGId, T01ME11_A758ProCod, T01ME11_A13045PedDGFasLi
            }
            , new Object[] {
            T01ME12_A396EmprCod, T01ME12_A13026PedDGId, T01ME12_A758ProCod, T01ME12_A13045PedDGFasLi
            }
            , new Object[] {
            T01ME13_A396EmprCod, T01ME13_A13026PedDGId, T01ME13_A758ProCod, T01ME13_A13045PedDGFasLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01ME17_A396EmprCod, T01ME17_A13026PedDGId, T01ME17_A758ProCod, T01ME17_A13045PedDGFasLi, T01ME17_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01ME19_A396EmprCod, T01ME19_A13026PedDGId, T01ME19_A758ProCod, T01ME19_A13045PedDGFasLi
            }
            , new Object[] {
            T01ME20_A13026PedDGId, T01ME20_A758ProCod, T01ME20_A13045PedDGFasLi, T01ME20_A13057PedDGPQLin, T01ME20_A766ProForDsc, T01ME20_A396EmprCod, T01ME20_A764ProForCod, T01ME20_n764ProForCod
            }
            , new Object[] {
            T01ME21_A766ProForDsc
            }
            , new Object[] {
            T01ME22_A396EmprCod, T01ME22_A13026PedDGId, T01ME22_A758ProCod, T01ME22_A13045PedDGFasLi, T01ME22_A13057PedDGPQLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01ME26_A766ProForDsc
            }
            , new Object[] {
            T01ME27_A396EmprCod, T01ME27_A13026PedDGId, T01ME27_A758ProCod, T01ME27_A13045PedDGFasLi, T01ME27_A13057PedDGPQLin
            }
            , new Object[] {
            T01ME28_A407EmprNom, T01ME28_n407EmprNom
            }
            , new Object[] {
            T01ME29_A759ProDsc
            }
            , new Object[] {
            T01ME30_A396EmprCod
            }
         }
      );
      Z13045PedDGFasLi = (short)(0) ;
      A13045PedDGFasLi = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z13026PedDGId = 0 ;
      A13026PedDGId = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TPEDDG7" ;
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
   private short wcpOA13045PedDGFasLi ;
   private short Z13045PedDGFasLi ;
   private short Z13056PedDGPQUlt ;
   private short O13056PedDGPQUlt ;
   private short Z13057PedDGPQLin ;
   private short nRcdDeleted_1788 ;
   private short nRcdExists_1788 ;
   private short nIsMod_1788 ;
   private short A13045PedDGFasLi ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13056PedDGPQUlt ;
   private short nBlankRcdCount1788 ;
   private short RcdFound1788 ;
   private short B13056PedDGPQUlt ;
   private short nBlankRcdUsr1788 ;
   private short s13056PedDGPQUlt ;
   private short A13057PedDGPQLin ;
   private short GXv_int6[] ;
   private short RcdFound1786 ;
   private short nIsDirty_1786 ;
   private short nIsDirty_1788 ;
   private short i13056PedDGPQUlt ;
   private short ZZ13045PedDGFasLi ;
   private short ZZ13056PedDGPQUlt ;
   private short ZO13056PedDGPQUlt ;
   private int wcpOA13026PedDGId ;
   private int Z13026PedDGId ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int A13026PedDGId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPedDGId_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtPedDGFasLi_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPedDGPQUlt_Enabled ;
   private int edtavnRcdDeleted_1788_Enabled ;
   private int edtPedDGPQLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPedDGPQLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPedDGPQUlt_Backcolor ;
   private int edtPedDGFasLi_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtPedDGId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13026PedDGId ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtPedDGId_Internalname ;
   private String edtPedDGId_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPedDGFasLi_Internalname ;
   private String edtPedDGFasLi_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPedDGPQUlt_Internalname ;
   private String edtPedDGPQUlt_Jsonclick ;
   private String sMode1788 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1788_Internalname ;
   private String edtPedDGPQLin_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForDsc_Internalname ;
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
   private String AV36Pgmname ;
   private String AV33OldProf ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1786 ;
   private String A766ProForDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String Z766ProForDsc ;
   private String GXCCtl ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1788_Jsonclick ;
   private String edtPedDGPQLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZV33OldProf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean wbErr ;
   private boolean n13056PedDGPQUlt ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01ME7_A407EmprNom ;
   private boolean[] T01ME7_n407EmprNom ;
   private String[] T01ME8_A759ProDsc ;
   private String[] T01ME9_A396EmprCod ;
   private short[] T01ME10_A13045PedDGFasLi ;
   private String[] T01ME10_A407EmprNom ;
   private boolean[] T01ME10_n407EmprNom ;
   private String[] T01ME10_A759ProDsc ;
   private short[] T01ME10_A13056PedDGPQUlt ;
   private boolean[] T01ME10_n13056PedDGPQUlt ;
   private String[] T01ME10_A396EmprCod ;
   private String[] T01ME10_A758ProCod ;
   private int[] T01ME10_A13026PedDGId ;
   private String[] T01ME11_A396EmprCod ;
   private int[] T01ME11_A13026PedDGId ;
   private String[] T01ME11_A758ProCod ;
   private short[] T01ME11_A13045PedDGFasLi ;
   private short[] T01ME6_A13045PedDGFasLi ;
   private short[] T01ME6_A13056PedDGPQUlt ;
   private boolean[] T01ME6_n13056PedDGPQUlt ;
   private String[] T01ME6_A396EmprCod ;
   private String[] T01ME6_A758ProCod ;
   private int[] T01ME6_A13026PedDGId ;
   private String[] T01ME12_A396EmprCod ;
   private int[] T01ME12_A13026PedDGId ;
   private String[] T01ME12_A758ProCod ;
   private short[] T01ME12_A13045PedDGFasLi ;
   private String[] T01ME13_A396EmprCod ;
   private int[] T01ME13_A13026PedDGId ;
   private String[] T01ME13_A758ProCod ;
   private short[] T01ME13_A13045PedDGFasLi ;
   private short[] T01ME5_A13045PedDGFasLi ;
   private short[] T01ME5_A13056PedDGPQUlt ;
   private boolean[] T01ME5_n13056PedDGPQUlt ;
   private String[] T01ME5_A396EmprCod ;
   private String[] T01ME5_A758ProCod ;
   private int[] T01ME5_A13026PedDGId ;
   private String[] T01ME17_A396EmprCod ;
   private int[] T01ME17_A13026PedDGId ;
   private String[] T01ME17_A758ProCod ;
   private short[] T01ME17_A13045PedDGFasLi ;
   private short[] T01ME17_A1664ParFasCod ;
   private String[] T01ME19_A396EmprCod ;
   private int[] T01ME19_A13026PedDGId ;
   private String[] T01ME19_A758ProCod ;
   private short[] T01ME19_A13045PedDGFasLi ;
   private int[] T01ME20_A13026PedDGId ;
   private String[] T01ME20_A758ProCod ;
   private short[] T01ME20_A13045PedDGFasLi ;
   private short[] T01ME20_A13057PedDGPQLin ;
   private String[] T01ME20_A766ProForDsc ;
   private String[] T01ME20_A396EmprCod ;
   private String[] T01ME20_A764ProForCod ;
   private boolean[] T01ME20_n764ProForCod ;
   private String[] T01ME4_A766ProForDsc ;
   private String[] T01ME21_A766ProForDsc ;
   private String[] T01ME22_A396EmprCod ;
   private int[] T01ME22_A13026PedDGId ;
   private String[] T01ME22_A758ProCod ;
   private short[] T01ME22_A13045PedDGFasLi ;
   private short[] T01ME22_A13057PedDGPQLin ;
   private int[] T01ME3_A13026PedDGId ;
   private String[] T01ME3_A758ProCod ;
   private short[] T01ME3_A13045PedDGFasLi ;
   private short[] T01ME3_A13057PedDGPQLin ;
   private String[] T01ME3_A396EmprCod ;
   private String[] T01ME3_A764ProForCod ;
   private boolean[] T01ME3_n764ProForCod ;
   private int[] T01ME2_A13026PedDGId ;
   private String[] T01ME2_A758ProCod ;
   private short[] T01ME2_A13045PedDGFasLi ;
   private short[] T01ME2_A13057PedDGPQLin ;
   private String[] T01ME2_A396EmprCod ;
   private String[] T01ME2_A764ProForCod ;
   private boolean[] T01ME2_n764ProForCod ;
   private String[] T01ME26_A766ProForDsc ;
   private String[] T01ME27_A396EmprCod ;
   private int[] T01ME27_A13026PedDGId ;
   private String[] T01ME27_A758ProCod ;
   private short[] T01ME27_A13045PedDGFasLi ;
   private short[] T01ME27_A13057PedDGPQLin ;
   private String[] T01ME28_A407EmprNom ;
   private boolean[] T01ME28_n407EmprNom ;
   private String[] T01ME29_A759ProDsc ;
   private String[] T01ME30_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpeddg7__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeddg7__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeddg7__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeddg7__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeddg7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01ME2", "SELECT PedDGId, ProCod, PedDGFasLi, PedDGPQLin, EmprCod, ProForCod FROM TXPPEDDG7 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? AND PedDGPQLin = ?  FOR UPDATE OF ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME3", "SELECT PedDGId, ProCod, PedDGFasLi, PedDGPQLin, EmprCod, ProForCod FROM TXPPEDDG7 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? AND PedDGPQLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME4", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME5", "SELECT PedDGFasLi, PedDGPQUlt, EmprCod, ProCod, PedDGId FROM TXPPEDDG5 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?  FOR UPDATE OF PedDGPQUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME6", "SELECT PedDGFasLi, PedDGPQUlt, EmprCod, ProCod, PedDGId FROM TXPPEDDG5 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME9", "SELECT EmprCod FROM TXPPEDDG4 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME10", "SELECT /*+ FIRST_ROWS(1) */ TM1.PedDGFasLi, T2.EmprNom, T3.ProDsc, TM1.PedDGPQUlt, TM1.EmprCod, TM1.ProCod, TM1.PedDGId FROM ((TXPPEDDG5 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.PedDGId = ? and TM1.ProCod = ? and TM1.PedDGFasLi = ? ORDER BY TM1.EmprCod, TM1.PedDGId, TM1.ProCod, TM1.PedDGFasLi ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? ORDER BY EmprCod DESC, PedDGId DESC, ProCod DESC, PedDGFasLi DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01ME14", "INSERT INTO TXPPEDDG5(PedDGFasLi, PedDGPQUlt, EmprCod, ProCod, PedDGId, FasCod, PedDGObFas) VALUES(?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK, "TXPPEDDG5")
         ,new UpdateCursor("T01ME15", "UPDATE TXPPEDDG5 SET PedDGPQUlt=?  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?", GX_NOMASK, "TXPPEDDG5")
         ,new UpdateCursor("T01ME16", "DELETE FROM TXPPEDDG5  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?", GX_NOMASK, "TXPPEDDG5")
         ,new ForEachCursor("T01ME17", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod FROM TXPPEDDG8 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01ME18", "UPDATE TXPPEDDG5 SET PedDGPQUlt=?  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?", GX_NOMASK, "TXPPEDDG5")
         ,new ForEachCursor("T01ME19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ME20", "SELECT T1.PedDGId, T1.ProCod, T1.PedDGFasLi, T1.PedDGPQLin, T2.ProForDsc, T1.EmprCod, T1.ProForCod FROM (TXPPEDDG7 T1 LEFT JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.PedDGId = ? and T1.ProCod = ? and T1.PedDGFasLi = ? and T1.PedDGPQLin = ? ORDER BY T1.EmprCod, T1.PedDGId, T1.ProCod, T1.PedDGFasLi, T1.PedDGPQLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME21", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME22", "SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? AND PedDGPQLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01ME23", "INSERT INTO TXPPEDDG7(PedDGId, ProCod, PedDGFasLi, PedDGPQLin, EmprCod, ProForCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEDDG7")
         ,new UpdateCursor("T01ME24", "UPDATE TXPPEDDG7 SET ProForCod=?  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? AND PedDGPQLin = ?", GX_NOMASK, "TXPPEDDG7")
         ,new UpdateCursor("T01ME25", "DELETE FROM TXPPEDDG7  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ? AND PedDGPQLin = ?", GX_NOMASK, "TXPPEDDG7")
         ,new ForEachCursor("T01ME26", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME27", "SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME29", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ME30", "SELECT EmprCod FROM TXPPEDDG4 WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 28 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

