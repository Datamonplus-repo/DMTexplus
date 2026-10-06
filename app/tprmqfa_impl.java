package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprmqfa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"MAQDSCF") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9832MaqCodF = httpContext.GetPar( "MaqCodF") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asamaqdscf15J1301( A396EmprCod, A9832MaqCodF) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DSC_PARA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9861Cod_parA = (short)(GXutil.lval( httpContext.GetPar( "Cod_parA"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadsc_para15J1302( A396EmprCod, A9861Cod_parA) ;
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
            A457FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A9832MaqCodF = httpContext.GetPar( "MaqCodF") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS FASE-MAQUINA-ANCHO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqAncM_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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

   public tprmqfa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprmqfa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprmqfa_impl.class ));
   }

   public tprmqfa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRMQFA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodF_Internalname, GXutil.rtrim( A9832MaqCodF), GXutil.rtrim( localUtil.format( A9832MaqCodF, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodF_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodF_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDscF_Internalname, GXutil.rtrim( A9833MaqDscF), GXutil.rtrim( localUtil.format( A9833MaqDscF, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDscF_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDscF_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAncM_Internalname, GXutil.ltrim( localUtil.ntoc( A9863MaqAncM, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAncM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9863MaqAncM), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9863MaqAncM), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAncM_Jsonclick, 0, "", "", "", "", "", 1, edtMaqAncM_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
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
         nBlankRcdCount1302 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1302 = (short)(1) ;
            scanStart15J1302( ) ;
            while ( RcdFound1302 != 0 )
            {
               init_level_properties1302( ) ;
               getByPrimaryKey15J1302( ) ;
               addRow15J1302( ) ;
               scanNext15J1302( ) ;
            }
            scanEnd15J1302( ) ;
            nBlankRcdCount1302 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal15J1302( ) ;
         standaloneModal15J1302( ) ;
         sMode1302 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow15J1302( ) ;
            edtavnRcdDeleted_1302_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1302_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1302_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1302_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCod_parA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COD_PARA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCod_parA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDsc_ParA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSC_PARA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDsc_ParA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_ParA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1302 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15J1302( ) ;
            }
            sendRow15J1302( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1302 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1302 = (short)(5) ;
         nRcdExists_1302 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15J1302( ) ;
            while ( RcdFound1302 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551302( ) ;
               init_level_properties1302( ) ;
               standaloneNotModal15J1302( ) ;
               getByPrimaryKey15J1302( ) ;
               standaloneModal15J1302( ) ;
               addRow15J1302( ) ;
               scanNext15J1302( ) ;
            }
            scanEnd15J1302( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1302 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551302( ) ;
      initAll15J1302( ) ;
      init_level_properties1302( ) ;
      nRcdExists_1302 = (short)(0) ;
      nIsMod_1302 = (short)(0) ;
      nRcdDeleted_1302 = (short)(0) ;
      nBlankRcdCount1302 = (short)(nBlankRcdUsr1302+nBlankRcdCount1302) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1302 > 0 )
      {
         standaloneNotModal15J1302( ) ;
         standaloneModal15J1302( ) ;
         addRow15J1302( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCod_parA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1302 = (short)(nBlankRcdCount1302-1) ;
      }
      Gx_mode = sMode1302 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPRMQFA.htm");
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
      e1115J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z9832MaqCodF = httpContext.cgiGet( "Z9832MaqCodF") ;
            Z9863MaqAncM = (short)(localUtil.ctol( httpContext.cgiGet( "Z9863MaqAncM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A9832MaqCodF = httpContext.cgiGet( edtMaqCodF_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
            A9833MaqDscF = httpContext.cgiGet( edtMaqDscF_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9833MaqDscF", A9833MaqDscF);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAncM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAncM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQANCM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqAncM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9863MaqAncM = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
            }
            else
            {
               A9863MaqAncM = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAncM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
            }
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
               A457FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
               A9832MaqCodF = httpContext.GetPar( "MaqCodF") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
               A9863MaqAncM = (short)(GXutil.lval( httpContext.GetPar( "MaqAncM"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
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
                        e1115J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'COPIAR ANCHOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Copiar ANCHOS' */
                        e1215J2 ();
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
            initAll15J1301( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1302_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1302_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes15J1301( ) ;
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

   public void confirm_15J0( )
   {
      beforeValidate15J1301( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15J1301( ) ;
         }
         else
         {
            checkExtendedTable15J1301( ) ;
            if ( AnyError == 0 )
            {
               zm15J1301( 6) ;
               zm15J1301( 7) ;
               zm15J1301( 8) ;
            }
            closeExtendedTableCursors15J1301( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1301 = Gx_mode ;
         confirm_15J1302( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1301 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1301 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15J0( ) ;
      }
   }

   public void confirm_15J1302( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow15J1302( ) ;
         if ( ( nRcdExists_1302 != 0 ) || ( nIsMod_1302 != 0 ) )
         {
            getKey15J1302( ) ;
            if ( ( nRcdExists_1302 == 0 ) && ( nRcdDeleted_1302 == 0 ) )
            {
               if ( RcdFound1302 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15J1302( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15J1302( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors15J1302( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "COD_PARA_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCod_parA_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1302 != 0 )
               {
                  if ( nRcdDeleted_1302 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15J1302( ) ;
                     load15J1302( ) ;
                     beforeValidate15J1302( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15J1302( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1302 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15J1302( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15J1302( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors15J1302( ) ;
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
                  if ( nRcdDeleted_1302 == 0 )
                  {
                     GXCCtl = "COD_PARA_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCod_parA_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1302_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCod_parA_Internalname, GXutil.ltrim( localUtil.ntoc( A9861Cod_parA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDsc_ParA_Internalname, GXutil.rtrim( A9862Dsc_ParA)) ;
         httpContext.changePostValue( "ZT_"+"Z9861Cod_parA_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9861Cod_parA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1302_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1302_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1302_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1302 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1302_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1302_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COD_PARA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSC_PARA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15J0( )
   {
   }

   public void e1115J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tprmqfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tprmqfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tprmqfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Fase", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Maquina", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Ancho", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char2[0] ;
      tprmqfa_impl.this.AV11EmprNom = GXv_char3[0] ;
      tprmqfa_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e1215J2( )
   {
      /* 'Copiar ANCHOS' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm15J1301( int GX_JID )
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
         Z9863MaqAncM = A9863MaqAncM ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TPRMQFA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T015J6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015J6_A407EmprNom[0] ;
      n407EmprNom = T015J6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T015J7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015J7_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(5);
      /* Using cursor T015J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFSMQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODF");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfa_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprmqfa_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
      A9833MaqDscF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9833MaqDscF", A9833MaqDscF);
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

   public void load15J1301( )
   {
      /* Using cursor T015J9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1301 = (short)(1) ;
         A407EmprNom = T015J9_A407EmprNom[0] ;
         n407EmprNom = T015J9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A460FasDsc = T015J9_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         zm15J1301( -5) ;
      }
      pr_default.close(7);
      onLoadActions15J1301( ) ;
   }

   public void onLoadActions15J1301( )
   {
   }

   public void checkExtendedTable15J1301( )
   {
      nIsDirty_1301 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15J1301( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15J1301( )
   {
      /* Using cursor T015J10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1301 = (short)(1) ;
      }
      else
      {
         RcdFound1301 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015J5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T015J5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015J5_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015J5_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
      {
         zm15J1301( 5) ;
         RcdFound1301 = (short)(1) ;
         A9863MaqAncM = T015J5_A9863MaqAncM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z9863MaqAncM = A9863MaqAncM ;
         sMode1301 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15J1301( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1301 = (short)(0) ;
            initializeNonKey15J1301( ) ;
         }
         Gx_mode = sMode1301 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1301 = (short)(0) ;
         initializeNonKey15J1301( ) ;
         sMode1301 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1301 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey15J1301( ) ;
      if ( RcdFound1301 == 0 )
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
      RcdFound1301 = (short)(0) ;
      /* Using cursor T015J11 */
      pr_default.execute(9, new Object[] {Short.valueOf(A9863MaqAncM), A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T015J11_A9863MaqAncM[0] < A9863MaqAncM ) ) && ( GXutil.strcmp(T015J11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015J11_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015J11_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T015J11_A9863MaqAncM[0] > A9863MaqAncM ) ) && ( GXutil.strcmp(T015J11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015J11_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015J11_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            A9863MaqAncM = T015J11_A9863MaqAncM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
            RcdFound1301 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1301 = (short)(0) ;
      /* Using cursor T015J12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A9863MaqAncM), A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T015J12_A9863MaqAncM[0] > A9863MaqAncM ) ) && ( GXutil.strcmp(T015J12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015J12_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015J12_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T015J12_A9863MaqAncM[0] < A9863MaqAncM ) ) && ( GXutil.strcmp(T015J12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015J12_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015J12_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            A9863MaqAncM = T015J12_A9863MaqAncM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
            RcdFound1301 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15J1301( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqAncM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15J1301( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1301 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) || ( A9863MaqAncM != Z9863MaqAncM ) )
            {
               A9863MaqAncM = Z9863MaqAncM ;
               httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqAncM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15J1301( ) ;
               GX_FocusControl = edtMaqAncM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) || ( A9863MaqAncM != Z9863MaqAncM ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqAncM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15J1301( ) ;
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
                  GX_FocusControl = edtMaqAncM_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15J1301( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) || ( A9863MaqAncM != Z9863MaqAncM ) )
      {
         A9863MaqAncM = Z9863MaqAncM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqAncM_Internalname ;
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
      getKey15J1301( ) ;
      if ( RcdFound1301 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) || ( A9863MaqAncM != Z9863MaqAncM ) )
         {
            A9863MaqAncM = Z9863MaqAncM ;
            httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) || ( A9863MaqAncM != Z9863MaqAncM ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tprmqfa");
   }

   public void insert_check( )
   {
      confirm_15J0( ) ;
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
      if ( RcdFound1301 == 0 )
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
      scanStart15J1301( ) ;
      if ( RcdFound1301 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15J1301( ) ;
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
      if ( RcdFound1301 == 0 )
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
      if ( RcdFound1301 == 0 )
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
      scanStart15J1301( ) ;
      if ( RcdFound1301 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1301 != 0 )
         {
            scanNext15J1301( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15J1301( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15J1301( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015J4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRMQFA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRMQFA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15J1301( )
   {
      beforeValidate15J1301( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15J1301( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15J1301( 0) ;
         checkOptimisticConcurrency15J1301( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15J1301( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15J1301( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015J13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A9863MaqAncM), A396EmprCod, A457FasCod, A9832MaqCodF});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRMQFA");
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
                        processLevel15J1301( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15J0( ) ;
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
            load15J1301( ) ;
         }
         endLevel15J1301( ) ;
      }
      closeExtendedTableCursors15J1301( ) ;
   }

   public void update15J1301( )
   {
      beforeValidate15J1301( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15J1301( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15J1301( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15J1301( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15J1301( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPPRMQFA */
                  deferredUpdate15J1301( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15J1301( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15J0( ) ;
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
         endLevel15J1301( ) ;
      }
      closeExtendedTableCursors15J1301( ) ;
   }

   public void deferredUpdate15J1301( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15J1301( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15J1301( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15J1301( ) ;
         afterConfirm15J1301( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15J1301( ) ;
            if ( AnyError == 0 )
            {
               scanStart15J1302( ) ;
               while ( RcdFound1302 != 0 )
               {
                  getByPrimaryKey15J1302( ) ;
                  delete15J1302( ) ;
                  scanNext15J1302( ) ;
               }
               scanEnd15J1302( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015J14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRMQFA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1301 == 0 )
                        {
                           initAll15J1301( ) ;
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
                        resetCaption15J0( ) ;
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
      sMode1301 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15J1301( ) ;
      Gx_mode = sMode1301 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15J1301( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel15J1302( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow15J1302( ) ;
         if ( ( nRcdExists_1302 != 0 ) || ( nIsMod_1302 != 0 ) )
         {
            standaloneNotModal15J1302( ) ;
            getKey15J1302( ) ;
            if ( ( nRcdExists_1302 == 0 ) && ( nRcdDeleted_1302 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15J1302( ) ;
            }
            else
            {
               if ( RcdFound1302 != 0 )
               {
                  if ( ( nRcdDeleted_1302 != 0 ) && ( nRcdExists_1302 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15J1302( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1302 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15J1302( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1302 == 0 )
                  {
                     GXCCtl = "COD_PARA_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCod_parA_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1302_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCod_parA_Internalname, GXutil.ltrim( localUtil.ntoc( A9861Cod_parA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDsc_ParA_Internalname, GXutil.rtrim( A9862Dsc_ParA)) ;
         httpContext.changePostValue( "ZT_"+"Z9861Cod_parA_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9861Cod_parA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1302_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1302_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1302_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1302 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1302_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1302_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COD_PARA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSC_PARA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15J1302( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1302 = (short)(0) ;
      nIsMod_1302 = (short)(0) ;
      nRcdDeleted_1302 = (short)(0) ;
   }

   public void processLevel15J1301( )
   {
      /* Save parent mode. */
      sMode1301 = Gx_mode ;
      processNestedLevel15J1302( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1301 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15J1301( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15J1301( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprmqfa");
         if ( AnyError == 0 )
         {
            confirmValues15J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprmqfa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15J1301( )
   {
      /* Scan By routine */
      /* Using cursor T015J15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      RcdFound1301 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1301 = (short)(1) ;
         A9863MaqAncM = T015J15_A9863MaqAncM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15J1301( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1301 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1301 = (short)(1) ;
         A9863MaqAncM = T015J15_A9863MaqAncM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
      }
   }

   public void scanEnd15J1301( )
   {
      pr_default.close(13);
   }

   public void afterConfirm15J1301( )
   {
      /* After Confirm Rules */
      if ( ( A9863MaqAncM == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ancho con valor 0 ¡¡¡", ""), 1, "MAQANCM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqAncM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert15J1301( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15J1301( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15J1301( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15J1301( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15J1301( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15J1301( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtMaqCodF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodF_Enabled), 5, 0), true);
      edtMaqDscF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDscF_Enabled), 5, 0), true);
      edtMaqAncM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAncM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAncM_Enabled), 5, 0), true);
   }

   public void zm15J1302( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -9 )
      {
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z9863MaqAncM = A9863MaqAncM ;
         Z9861Cod_parA = A9861Cod_parA ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal15J1302( )
   {
   }

   public void standaloneModal15J1302( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCod_parA_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_parA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtCod_parA_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_parA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load15J1302( )
   {
      /* Using cursor T015J16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM), Short.valueOf(A9861Cod_parA)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1302 = (short)(1) ;
         zm15J1302( -9) ;
      }
      pr_default.close(14);
      onLoadActions15J1302( ) ;
   }

   public void onLoadActions15J1302( )
   {
      GXt_char1 = A9862Dsc_ParA ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9861Cod_parA ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfa_impl.this.A9861Cod_parA = GXv_int5[0] ;
      tprmqfa_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9862Dsc_ParA = GXt_char1 ;
   }

   public void checkExtendedTable15J1302( )
   {
      nIsDirty_1302 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal15J1302( ) ;
      nIsDirty_1302 = (short)(1) ;
      GXt_char1 = A9862Dsc_ParA ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9861Cod_parA ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfa_impl.this.A9861Cod_parA = GXv_int5[0] ;
      tprmqfa_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9862Dsc_ParA = GXt_char1 ;
      if ( true /* Level */ && ( GXutil.strcmp(A9862Dsc_ParA, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "COD_PARA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15J1302( )
   {
   }

   public void enableDisable15J1302( )
   {
   }

   public void getKey15J1302( )
   {
      /* Using cursor T015J17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM), Short.valueOf(A9861Cod_parA)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1302 = (short)(1) ;
      }
      else
      {
         RcdFound1302 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey15J1302( )
   {
      /* Using cursor T015J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM), Short.valueOf(A9861Cod_parA)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015J3_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015J3_A9832MaqCodF[0], A9832MaqCodF) == 0 ) && ( GXutil.strcmp(T015J3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15J1302( 9) ;
         RcdFound1302 = (short)(1) ;
         initializeNonKey15J1302( ) ;
         A9861Cod_parA = T015J3_A9861Cod_parA[0] ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z9863MaqAncM = A9863MaqAncM ;
         Z9861Cod_parA = A9861Cod_parA ;
         sMode1302 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15J1302( ) ;
         load15J1302( ) ;
         Gx_mode = sMode1302 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1302 = (short)(0) ;
         initializeNonKey15J1302( ) ;
         sMode1302 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15J1302( ) ;
         Gx_mode = sMode1302 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15J1302( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15J1302( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM), Short.valueOf(A9861Cod_parA)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRMQF1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRMQF1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15J1302( )
   {
      beforeValidate15J1302( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15J1302( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15J1302( 0) ;
         checkOptimisticConcurrency15J1302( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15J1302( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15J1302( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015J18 */
                  pr_default.execute(16, new Object[] {A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM), Short.valueOf(A9861Cod_parA), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRMQF1");
                  if ( (pr_default.getStatus(16) == 1) )
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
            load15J1302( ) ;
         }
         endLevel15J1302( ) ;
      }
      closeExtendedTableCursors15J1302( ) ;
   }

   public void update15J1302( )
   {
      beforeValidate15J1302( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15J1302( ) ;
      }
      if ( ( nIsMod_1302 != 0 ) || ( nIsDirty_1302 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15J1302( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15J1302( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15J1302( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPPRMQF1 */
                     deferredUpdate15J1302( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15J1302( ) ;
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
            endLevel15J1302( ) ;
         }
      }
      closeExtendedTableCursors15J1302( ) ;
   }

   public void deferredUpdate15J1302( )
   {
   }

   public void delete15J1302( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15J1302( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15J1302( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15J1302( ) ;
         afterConfirm15J1302( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15J1302( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015J19 */
               pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM), Short.valueOf(A9861Cod_parA)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRMQF1");
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
      sMode1302 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15J1302( ) ;
      Gx_mode = sMode1302 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15J1302( )
   {
      standaloneModal15J1302( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A9862Dsc_ParA ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9861Cod_parA ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
         tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
         tprmqfa_impl.this.A9861Cod_parA = GXv_int5[0] ;
         tprmqfa_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9862Dsc_ParA = GXt_char1 ;
      }
   }

   public void endLevel15J1302( )
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

   public void scanStart15J1302( )
   {
      /* Scan By routine */
      /* Using cursor T015J20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9863MaqAncM)});
      RcdFound1302 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1302 = (short)(1) ;
         A9861Cod_parA = T015J20_A9861Cod_parA[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15J1302( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1302 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1302 = (short)(1) ;
         A9861Cod_parA = T015J20_A9861Cod_parA[0] ;
      }
   }

   public void scanEnd15J1302( )
   {
      pr_default.close(18);
   }

   public void afterConfirm15J1302( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15J1302( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15J1302( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15J1302( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15J1302( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15J1302( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15J1302( )
   {
      edtCod_parA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_parA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDsc_ParA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDsc_ParA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_ParA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes15J1302( )
   {
   }

   public void send_integrity_lvl_hashes15J1301( )
   {
   }

   public void subsflControlProps_551302( )
   {
      edtavnRcdDeleted_1302_Internalname = "vNRCDDELETED_1302_"+sGXsfl_55_idx ;
      edtCod_parA_Internalname = "COD_PARA_"+sGXsfl_55_idx ;
      edtDsc_ParA_Internalname = "DSC_PARA_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551302( )
   {
      edtavnRcdDeleted_1302_Internalname = "vNRCDDELETED_1302_"+sGXsfl_55_fel_idx ;
      edtCod_parA_Internalname = "COD_PARA_"+sGXsfl_55_fel_idx ;
      edtDsc_ParA_Internalname = "DSC_PARA_"+sGXsfl_55_fel_idx ;
   }

   public void addRow15J1302( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551302( ) ;
      sendRow15J1302( ) ;
   }

   public void sendRow15J1302( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1302_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1302_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1302_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1302), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1302), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1302_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1302_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1302_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_parA_Internalname,GXutil.ltrim( localUtil.ntoc( A9861Cod_parA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9861Cod_parA), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_parA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCod_parA_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDsc_ParA_Internalname,GXutil.rtrim( A9862Dsc_ParA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDsc_ParA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDsc_ParA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15J1302( ) ;
      GXCCtl = "Z9861Cod_parA_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9861Cod_parA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1302_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1302_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1302_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1302, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1302_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1302_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COD_PARA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DSC_PARA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParA_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15J1302( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551302( ) ;
      edtavnRcdDeleted_1302_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1302_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCod_parA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COD_PARA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDsc_ParA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSC_PARA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1302_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1302_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1302");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1302_Internalname ;
         wbErr = true ;
         nRcdDeleted_1302 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1302 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1302_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCod_parA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCod_parA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COD_PARA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parA_Internalname ;
         wbErr = true ;
         A9861Cod_parA = (short)(0) ;
      }
      else
      {
         A9861Cod_parA = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_parA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9862Dsc_ParA = httpContext.cgiGet( edtDsc_ParA_Internalname) ;
      GXCCtl = "Z9861Cod_parA_" + sGXsfl_55_idx ;
      Z9861Cod_parA = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1302_" + sGXsfl_55_idx ;
      nRcdDeleted_1302 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1302_" + sGXsfl_55_idx ;
      nRcdExists_1302 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1302_" + sGXsfl_55_idx ;
      nIsMod_1302 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCod_parA_Enabled = edtCod_parA_Enabled ;
   }

   public void confirmValues15J0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551302( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551302( ) ;
         httpContext.changePostValue( "Z9861Cod_parA_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9861Cod_parA_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9861Cod_parA_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tprmqfa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9832MaqCodF", GXutil.rtrim( Z9832MaqCodF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9863MaqAncM", GXutil.ltrim( localUtil.ntoc( Z9863MaqAncM, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tprmqfa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"})  ;
   }

   public String getPgmname( )
   {
      return "TPRMQFA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS FASE-MAQUINA-ANCHO", "") ;
   }

   public void initializeNonKey15J1301( )
   {
   }

   public void initAll15J1301( )
   {
      A9863MaqAncM = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9863MaqAncM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9863MaqAncM), 3, 0));
      initializeNonKey15J1301( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15J1302( )
   {
      A9862Dsc_ParA = "" ;
   }

   public void initAll15J1302( )
   {
      A9861Cod_parA = (short)(0) ;
      initializeNonKey15J1302( ) ;
   }

   public void standaloneModalInsert15J1302( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543066", true, true);
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
      httpContext.AddJavascriptSource("tprmqfa.js", "?20268241543066", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1302( )
   {
      edtCod_parA_Enabled = defedtCod_parA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_parA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1302, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1302_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9861Cod_parA, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9862Dsc_ParA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParA_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqCodF_Internalname = "MAQCODF" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqDscF_Internalname = "MAQDSCF" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMaqAncM_Internalname = "MAQANCM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1302_Internalname = "vNRCDDELETED_1302" ;
      edtCod_parA_Internalname = "COD_PARA" ;
      edtDsc_ParA_Internalname = "DSC_PARA" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS FASE-MAQUINA-ANCHO", "") );
      edtDsc_ParA_Jsonclick = "" ;
      edtCod_parA_Jsonclick = "" ;
      edtavnRcdDeleted_1302_Jsonclick = "" ;
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
      edtDsc_ParA_Enabled = 0 ;
      edtCod_parA_Enabled = 1 ;
      edtavnRcdDeleted_1302_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqAncM_Jsonclick = "" ;
      edtMaqAncM_Backcolor = (int)(0xFFFFFF) ;
      edtMaqAncM_Enabled = 1 ;
      edtMaqDscF_Jsonclick = "" ;
      edtMaqDscF_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDscF_Enabled = 0 ;
      edtMaqCodF_Jsonclick = "" ;
      edtMaqCodF_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCodF_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
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

   public void gx1asamaqdscf15J1301( String A396EmprCod ,
                                     String A9832MaqCodF )
   {
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfa_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprmqfa_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
      A9833MaqDscF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9833MaqDscF", A9833MaqDscF);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9833MaqDscF))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asadsc_para15J1302( String A396EmprCod ,
                                      short A9861Cod_parA )
   {
      GXt_char1 = A9862Dsc_ParA ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9861Cod_parA ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfa_impl.this.A9861Cod_parA = GXv_int5[0] ;
      tprmqfa_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9862Dsc_ParA = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9862Dsc_ParA))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_551302( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15J1302( ) ;
         standaloneModal15J1302( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15J1302( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551302( ) ;
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
      /* Using cursor T015J21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015J21_A407EmprNom[0] ;
      n407EmprNom = T015J21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T015J22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015J22_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(20);
      /* Using cursor T015J23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFSMQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODF");
         AnyError = (short)(1) ;
      }
      pr_default.close(21);
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

   public void valid_Maqancm( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9833MaqDscF", GXutil.rtrim( A9833MaqDscF));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9832MaqCodF", GXutil.rtrim( Z9832MaqCodF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9863MaqAncM", GXutil.ltrim( localUtil.ntoc( Z9863MaqAncM, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9833MaqDscF", GXutil.rtrim( Z9833MaqDscF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cod_para( )
   {
      GXt_char1 = A9862Dsc_ParA ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9861Cod_parA ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tprmqfa_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfa_impl.this.A9861Cod_parA = GXv_int5[0] ;
      tprmqfa_impl.this.GXt_char1 = GXv_char3[0] ;
      A9862Dsc_ParA = GXt_char1 ;
      if ( true /* Level */ && ( GXutil.strcmp(A9862Dsc_ParA, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Inexistente", ""), 1, "COD_PARA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parA_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9862Dsc_ParA", GXutil.rtrim( A9862Dsc_ParA));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'COPIAR ANCHOS'","{handler:'e1215J2',iparms:[{av:'A9863MaqAncM',fld:'MAQANCM',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''}]");
      setEventMetadata("'COPIAR ANCHOS'",",oparms:[{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCODF","{handler:'valid_Maqcodf',iparms:[]");
      setEventMetadata("VALID_MAQCODF",",oparms:[]}");
      setEventMetadata("VALID_MAQANCM","{handler:'valid_Maqancm',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'A9863MaqAncM',fld:'MAQANCM',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQANCM",",oparms:[{av:'A9833MaqDscF',fld:'MAQDSCF',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z457FasCod'},{av:'Z9832MaqCodF'},{av:'Z9863MaqAncM'},{av:'Z9833MaqDscF'},{av:'Z407EmprNom'},{av:'Z460FasDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COD_PARA","{handler:'valid_Cod_para',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9861Cod_parA',fld:'COD_PARA',pic:'ZZZ9'},{av:'A9862Dsc_ParA',fld:'DSC_PARA',pic:''}]");
      setEventMetadata("VALID_COD_PARA",",oparms:[{av:'A9862Dsc_ParA',fld:'DSC_PARA',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Dsc_para',iparms:[]");
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
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA457FasCod = "" ;
      wcpOA9832MaqCodF = "" ;
      Z396EmprCod = "" ;
      Z457FasCod = "" ;
      Z9832MaqCodF = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9832MaqCodF = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9833MaqDscF = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1302 = "" ;
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
      sMode1301 = "" ;
      GXCCtl = "" ;
      A9862Dsc_ParA = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      T015J6_A407EmprNom = new String[] {""} ;
      T015J6_n407EmprNom = new boolean[] {false} ;
      T015J7_A460FasDsc = new String[] {""} ;
      T015J8_A396EmprCod = new String[] {""} ;
      T015J9_A9863MaqAncM = new short[1] ;
      T015J9_A407EmprNom = new String[] {""} ;
      T015J9_n407EmprNom = new boolean[] {false} ;
      T015J9_A460FasDsc = new String[] {""} ;
      T015J9_A396EmprCod = new String[] {""} ;
      T015J9_A457FasCod = new String[] {""} ;
      T015J9_A9832MaqCodF = new String[] {""} ;
      T015J10_A396EmprCod = new String[] {""} ;
      T015J10_A457FasCod = new String[] {""} ;
      T015J10_A9832MaqCodF = new String[] {""} ;
      T015J10_A9863MaqAncM = new short[1] ;
      T015J5_A9863MaqAncM = new short[1] ;
      T015J5_A396EmprCod = new String[] {""} ;
      T015J5_A457FasCod = new String[] {""} ;
      T015J5_A9832MaqCodF = new String[] {""} ;
      T015J11_A396EmprCod = new String[] {""} ;
      T015J11_A457FasCod = new String[] {""} ;
      T015J11_A9832MaqCodF = new String[] {""} ;
      T015J11_A9863MaqAncM = new short[1] ;
      T015J12_A396EmprCod = new String[] {""} ;
      T015J12_A457FasCod = new String[] {""} ;
      T015J12_A9832MaqCodF = new String[] {""} ;
      T015J12_A9863MaqAncM = new short[1] ;
      T015J4_A9863MaqAncM = new short[1] ;
      T015J4_A396EmprCod = new String[] {""} ;
      T015J4_A457FasCod = new String[] {""} ;
      T015J4_A9832MaqCodF = new String[] {""} ;
      T015J15_A396EmprCod = new String[] {""} ;
      T015J15_A457FasCod = new String[] {""} ;
      T015J15_A9832MaqCodF = new String[] {""} ;
      T015J15_A9863MaqAncM = new short[1] ;
      T015J16_A457FasCod = new String[] {""} ;
      T015J16_A9832MaqCodF = new String[] {""} ;
      T015J16_A9863MaqAncM = new short[1] ;
      T015J16_A9861Cod_parA = new short[1] ;
      T015J16_A396EmprCod = new String[] {""} ;
      T015J17_A396EmprCod = new String[] {""} ;
      T015J17_A457FasCod = new String[] {""} ;
      T015J17_A9832MaqCodF = new String[] {""} ;
      T015J17_A9863MaqAncM = new short[1] ;
      T015J17_A9861Cod_parA = new short[1] ;
      T015J3_A457FasCod = new String[] {""} ;
      T015J3_A9832MaqCodF = new String[] {""} ;
      T015J3_A9863MaqAncM = new short[1] ;
      T015J3_A9861Cod_parA = new short[1] ;
      T015J3_A396EmprCod = new String[] {""} ;
      T015J2_A457FasCod = new String[] {""} ;
      T015J2_A9832MaqCodF = new String[] {""} ;
      T015J2_A9863MaqAncM = new short[1] ;
      T015J2_A9861Cod_parA = new short[1] ;
      T015J2_A396EmprCod = new String[] {""} ;
      T015J20_A396EmprCod = new String[] {""} ;
      T015J20_A457FasCod = new String[] {""} ;
      T015J20_A9832MaqCodF = new String[] {""} ;
      T015J20_A9863MaqAncM = new short[1] ;
      T015J20_A9861Cod_parA = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char2 = new String[1] ;
      T015J21_A407EmprNom = new String[] {""} ;
      T015J21_n407EmprNom = new boolean[] {false} ;
      T015J22_A460FasDsc = new String[] {""} ;
      T015J23_A396EmprCod = new String[] {""} ;
      Z9833MaqDscF = "" ;
      ZZ396EmprCod = "" ;
      ZZ457FasCod = "" ;
      ZZ9832MaqCodF = "" ;
      ZZ9833MaqDscF = "" ;
      ZZ407EmprNom = "" ;
      ZZ460FasDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char3 = new String[1] ;
      Z9862Dsc_ParA = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprmqfa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprmqfa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprmqfa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprmqfa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprmqfa__default(),
         new Object[] {
             new Object[] {
            T015J2_A457FasCod, T015J2_A9832MaqCodF, T015J2_A9863MaqAncM, T015J2_A9861Cod_parA, T015J2_A396EmprCod
            }
            , new Object[] {
            T015J3_A457FasCod, T015J3_A9832MaqCodF, T015J3_A9863MaqAncM, T015J3_A9861Cod_parA, T015J3_A396EmprCod
            }
            , new Object[] {
            T015J4_A9863MaqAncM, T015J4_A396EmprCod, T015J4_A457FasCod, T015J4_A9832MaqCodF
            }
            , new Object[] {
            T015J5_A9863MaqAncM, T015J5_A396EmprCod, T015J5_A457FasCod, T015J5_A9832MaqCodF
            }
            , new Object[] {
            T015J6_A407EmprNom, T015J6_n407EmprNom
            }
            , new Object[] {
            T015J7_A460FasDsc
            }
            , new Object[] {
            T015J8_A396EmprCod
            }
            , new Object[] {
            T015J9_A9863MaqAncM, T015J9_A407EmprNom, T015J9_n407EmprNom, T015J9_A460FasDsc, T015J9_A396EmprCod, T015J9_A457FasCod, T015J9_A9832MaqCodF
            }
            , new Object[] {
            T015J10_A396EmprCod, T015J10_A457FasCod, T015J10_A9832MaqCodF, T015J10_A9863MaqAncM
            }
            , new Object[] {
            T015J11_A396EmprCod, T015J11_A457FasCod, T015J11_A9832MaqCodF, T015J11_A9863MaqAncM
            }
            , new Object[] {
            T015J12_A396EmprCod, T015J12_A457FasCod, T015J12_A9832MaqCodF, T015J12_A9863MaqAncM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015J15_A396EmprCod, T015J15_A457FasCod, T015J15_A9832MaqCodF, T015J15_A9863MaqAncM
            }
            , new Object[] {
            T015J16_A457FasCod, T015J16_A9832MaqCodF, T015J16_A9863MaqAncM, T015J16_A9861Cod_parA, T015J16_A396EmprCod
            }
            , new Object[] {
            T015J17_A396EmprCod, T015J17_A457FasCod, T015J17_A9832MaqCodF, T015J17_A9863MaqAncM, T015J17_A9861Cod_parA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015J20_A396EmprCod, T015J20_A457FasCod, T015J20_A9832MaqCodF, T015J20_A9863MaqAncM, T015J20_A9861Cod_parA
            }
            , new Object[] {
            T015J21_A407EmprNom, T015J21_n407EmprNom
            }
            , new Object[] {
            T015J22_A460FasDsc
            }
            , new Object[] {
            T015J23_A396EmprCod
            }
         }
      );
      Z9832MaqCodF = "" ;
      A9832MaqCodF = "" ;
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TPRMQFA" ;
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
   private short Z9863MaqAncM ;
   private short Z9861Cod_parA ;
   private short nRcdDeleted_1302 ;
   private short nRcdExists_1302 ;
   private short nIsMod_1302 ;
   private short A9861Cod_parA ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9863MaqAncM ;
   private short nBlankRcdCount1302 ;
   private short RcdFound1302 ;
   private short nBlankRcdUsr1302 ;
   private short RcdFound1301 ;
   private short nIsDirty_1301 ;
   private short nIsDirty_1302 ;
   private short ZZ9863MaqAncM ;
   private short GXv_int5[] ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCodF_Enabled ;
   private int edtMaqDscF_Enabled ;
   private int edtMaqAncM_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1302_Enabled ;
   private int edtCod_parA_Enabled ;
   private int edtDsc_ParA_Enabled ;
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
   private int defedtCod_parA_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqAncM_Backcolor ;
   private int edtMaqDscF_Backcolor ;
   private int edtMaqCodF_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA457FasCod ;
   private String wcpOA9832MaqCodF ;
   private String Z396EmprCod ;
   private String Z457FasCod ;
   private String Z9832MaqCodF ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9832MaqCodF ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqAncM_Internalname ;
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
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqCodF_Internalname ;
   private String edtMaqCodF_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqDscF_Internalname ;
   private String A9833MaqDscF ;
   private String edtMaqDscF_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMaqAncM_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1302 ;
   private String edtavnRcdDeleted_1302_Internalname ;
   private String edtCod_parA_Internalname ;
   private String edtDsc_ParA_Internalname ;
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
   private String sMode1301 ;
   private String GXCCtl ;
   private String A9862Dsc_ParA ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1302_Jsonclick ;
   private String edtCod_parA_Jsonclick ;
   private String edtDsc_ParA_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char2[] ;
   private String Z9833MaqDscF ;
   private String ZZ396EmprCod ;
   private String ZZ457FasCod ;
   private String ZZ9832MaqCodF ;
   private String ZZ9833MaqDscF ;
   private String ZZ407EmprNom ;
   private String ZZ460FasDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z9862Dsc_ParA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015J6_A407EmprNom ;
   private boolean[] T015J6_n407EmprNom ;
   private String[] T015J7_A460FasDsc ;
   private String[] T015J8_A396EmprCod ;
   private short[] T015J9_A9863MaqAncM ;
   private String[] T015J9_A407EmprNom ;
   private boolean[] T015J9_n407EmprNom ;
   private String[] T015J9_A460FasDsc ;
   private String[] T015J9_A396EmprCod ;
   private String[] T015J9_A457FasCod ;
   private String[] T015J9_A9832MaqCodF ;
   private String[] T015J10_A396EmprCod ;
   private String[] T015J10_A457FasCod ;
   private String[] T015J10_A9832MaqCodF ;
   private short[] T015J10_A9863MaqAncM ;
   private short[] T015J5_A9863MaqAncM ;
   private String[] T015J5_A396EmprCod ;
   private String[] T015J5_A457FasCod ;
   private String[] T015J5_A9832MaqCodF ;
   private String[] T015J11_A396EmprCod ;
   private String[] T015J11_A457FasCod ;
   private String[] T015J11_A9832MaqCodF ;
   private short[] T015J11_A9863MaqAncM ;
   private String[] T015J12_A396EmprCod ;
   private String[] T015J12_A457FasCod ;
   private String[] T015J12_A9832MaqCodF ;
   private short[] T015J12_A9863MaqAncM ;
   private short[] T015J4_A9863MaqAncM ;
   private String[] T015J4_A396EmprCod ;
   private String[] T015J4_A457FasCod ;
   private String[] T015J4_A9832MaqCodF ;
   private String[] T015J15_A396EmprCod ;
   private String[] T015J15_A457FasCod ;
   private String[] T015J15_A9832MaqCodF ;
   private short[] T015J15_A9863MaqAncM ;
   private String[] T015J16_A457FasCod ;
   private String[] T015J16_A9832MaqCodF ;
   private short[] T015J16_A9863MaqAncM ;
   private short[] T015J16_A9861Cod_parA ;
   private String[] T015J16_A396EmprCod ;
   private String[] T015J17_A396EmprCod ;
   private String[] T015J17_A457FasCod ;
   private String[] T015J17_A9832MaqCodF ;
   private short[] T015J17_A9863MaqAncM ;
   private short[] T015J17_A9861Cod_parA ;
   private String[] T015J3_A457FasCod ;
   private String[] T015J3_A9832MaqCodF ;
   private short[] T015J3_A9863MaqAncM ;
   private short[] T015J3_A9861Cod_parA ;
   private String[] T015J3_A396EmprCod ;
   private String[] T015J2_A457FasCod ;
   private String[] T015J2_A9832MaqCodF ;
   private short[] T015J2_A9863MaqAncM ;
   private short[] T015J2_A9861Cod_parA ;
   private String[] T015J2_A396EmprCod ;
   private String[] T015J20_A396EmprCod ;
   private String[] T015J20_A457FasCod ;
   private String[] T015J20_A9832MaqCodF ;
   private short[] T015J20_A9863MaqAncM ;
   private short[] T015J20_A9861Cod_parA ;
   private String[] T015J21_A407EmprNom ;
   private boolean[] T015J21_n407EmprNom ;
   private String[] T015J22_A460FasDsc ;
   private String[] T015J23_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprmqfa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015J2", "SELECT FasCod, MaqCodF, MaqAncM, Cod_parA, EmprCod FROM TXPPRMQF1 WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ? AND Cod_parA = ?  FOR UPDATE OF FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J3", "SELECT FasCod, MaqCodF, MaqAncM, Cod_parA, EmprCod FROM TXPPRMQF1 WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ? AND Cod_parA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J4", "SELECT MaqAncM, EmprCod, FasCod, MaqCodF FROM TXPPRMQFA WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ?  FOR UPDATE OF MaqAncM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J5", "SELECT MaqAncM, EmprCod, FasCod, MaqCodF FROM TXPPRMQFA WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J7", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J8", "SELECT EmprCod FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J9", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqAncM, T2.EmprNom, T3.FasDsc, TM1.EmprCod, TM1.FasCod, TM1.MaqCodF FROM ((TXPPRMQFA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.FasCod = ? and TM1.MaqCodF = ? and TM1.MaqAncM = ? ORDER BY TM1.EmprCod, TM1.FasCod, TM1.MaqCodF, TM1.MaqAncM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod, MaqCodF, MaqAncM FROM TXPPRMQFA WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod, MaqCodF, MaqAncM FROM TXPPRMQFA WHERE ( MaqAncM > ?) and EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF, MaqAncM) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015J12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod, MaqCodF, MaqAncM FROM TXPPRMQFA WHERE ( MaqAncM < ?) and EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod DESC, FasCod DESC, MaqCodF DESC, MaqAncM DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015J13", "INSERT INTO TXPPRMQFA(MaqAncM, EmprCod, FasCod, MaqCodF) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPRMQFA")
         ,new UpdateCursor("T015J14", "DELETE FROM TXPPRMQFA  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ?", GX_NOMASK, "TXPPRMQFA")
         ,new ForEachCursor("T015J15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FasCod, MaqCodF, MaqAncM FROM TXPPRMQFA WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF, MaqAncM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J16", "SELECT FasCod, MaqCodF, MaqAncM, Cod_parA, EmprCod FROM TXPPRMQF1 WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? and MaqAncM = ? and Cod_parA = ? ORDER BY EmprCod, FasCod, MaqCodF, MaqAncM, Cod_parA ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J17", "SELECT EmprCod, FasCod, MaqCodF, MaqAncM, Cod_parA FROM TXPPRMQF1 WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ? AND Cod_parA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015J18", "INSERT INTO TXPPRMQF1(FasCod, MaqCodF, MaqAncM, Cod_parA, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPRMQF1")
         ,new UpdateCursor("T015J19", "DELETE FROM TXPPRMQF1  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND MaqAncM = ? AND Cod_parA = ?", GX_NOMASK, "TXPPRMQF1")
         ,new ForEachCursor("T015J20", "SELECT EmprCod, FasCod, MaqCodF, MaqAncM, Cod_parA FROM TXPPRMQF1 WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? and MaqAncM = ? ORDER BY EmprCod, FasCod, MaqCodF, MaqAncM, Cod_parA ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J22", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015J23", "SELECT EmprCod FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 21 :
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

