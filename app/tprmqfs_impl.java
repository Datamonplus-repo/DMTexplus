package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprmqfs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_15C1299( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_15C1299( ) ;
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
         gx1asamaqdscf15C1290( A396EmprCod, A9832MaqCodF) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DSC_PARF") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9834Cod_parF = (short)(GXutil.lval( httpContext.GetPar( "Cod_parF"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadsc_parf15C1299( A396EmprCod, A9834Cod_parF) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FASE-MAQUINA-PARAMETROS", ""), (short)(0)) ;
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

   public tprmqfs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprmqfs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprmqfs_impl.class ));
   }

   public tprmqfs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRMQFS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodF_Internalname, GXutil.rtrim( A9832MaqCodF), GXutil.rtrim( localUtil.format( A9832MaqCodF, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodF_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodF_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRMQFS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDscF_Internalname, GXutil.rtrim( A9833MaqDscF), GXutil.rtrim( localUtil.format( A9833MaqDscF, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDscF_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDscF_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRMQFS.htm");
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
         nBlankRcdCount1299 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1299 = (short)(1) ;
            scanStart15C1299( ) ;
            while ( RcdFound1299 != 0 )
            {
               init_level_properties1299( ) ;
               getByPrimaryKey15C1299( ) ;
               addRow15C1299( ) ;
               scanNext15C1299( ) ;
            }
            scanEnd15C1299( ) ;
            nBlankRcdCount1299 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal15C1299( ) ;
         standaloneModal15C1299( ) ;
         sMode1299 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow15C1299( ) ;
            edtavnRcdDeleted_1299_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1299_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1299_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1299_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCod_parF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COD_PARF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCod_parF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDsc_ParF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSC_PARF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDsc_ParF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_ParF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtItm_ord1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtItm_ord1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1299 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15C1299( ) ;
            }
            sendRow15C1299( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1299 = (short)(5) ;
         nRcdExists_1299 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15C1299( ) ;
            while ( RcdFound1299 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501299( ) ;
               init_level_properties1299( ) ;
               standaloneNotModal15C1299( ) ;
               getByPrimaryKey15C1299( ) ;
               standaloneModal15C1299( ) ;
               addRow15C1299( ) ;
               scanNext15C1299( ) ;
            }
            scanEnd15C1299( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1299 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501299( ) ;
      initAll15C1299( ) ;
      init_level_properties1299( ) ;
      nRcdExists_1299 = (short)(0) ;
      nIsMod_1299 = (short)(0) ;
      nRcdDeleted_1299 = (short)(0) ;
      nBlankRcdCount1299 = (short)(nBlankRcdUsr1299+nBlankRcdCount1299) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1299 > 0 )
      {
         standaloneNotModal15C1299( ) ;
         standaloneModal15C1299( ) ;
         addRow15C1299( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCod_parF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1299 = (short)(nBlankRcdCount1299-1) ;
      }
      Gx_mode = sMode1299 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRMQFS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPRMQFS.htm");
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
      e1115C2 ();
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
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
                        e1115C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1215C2 ();
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
         e1215C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll15C1290( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1299_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1299_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes15C1290( ) ;
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

   public void confirm_15C0( )
   {
      beforeValidate15C1290( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15C1290( ) ;
         }
         else
         {
            checkExtendedTable15C1290( ) ;
            if ( AnyError == 0 )
            {
               zm15C1290( 8) ;
               zm15C1290( 9) ;
            }
            closeExtendedTableCursors15C1290( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1290 = Gx_mode ;
         confirm_15C1299( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1290 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1290 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15C0( ) ;
      }
   }

   public void confirm_15C1299( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow15C1299( ) ;
         if ( ( nRcdExists_1299 != 0 ) || ( nIsMod_1299 != 0 ) )
         {
            getKey15C1299( ) ;
            if ( ( nRcdExists_1299 == 0 ) && ( nRcdDeleted_1299 == 0 ) )
            {
               if ( RcdFound1299 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15C1299( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15C1299( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors15C1299( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "COD_PARF_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCod_parF_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1299 != 0 )
               {
                  if ( nRcdDeleted_1299 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15C1299( ) ;
                     load15C1299( ) ;
                     beforeValidate15C1299( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15C1299( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15C1299( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15C1299( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors15C1299( ) ;
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
                  if ( nRcdDeleted_1299 == 0 )
                  {
                     GXCCtl = "COD_PARF_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCod_parF_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1299_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCod_parF_Internalname, GXutil.ltrim( localUtil.ntoc( A9834Cod_parF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDsc_ParF_Internalname, GXutil.rtrim( A9835Dsc_ParF)) ;
         httpContext.changePostValue( edtItm_ord1_Internalname, GXutil.ltrim( localUtil.ntoc( A10265Itm_ord1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9834Cod_parF_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9834Cod_parF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10265Itm_ord1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10265Itm_ord1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1299_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1299_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1299_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1299 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1299_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1299_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COD_PARF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSC_PARF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15C0( )
   {
   }

   public void e1115C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tprmqfs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tprmqfs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tprmqfs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Fase", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Maquina", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char2[0] ;
      tprmqfs_impl.this.AV11EmprNom = GXv_char3[0] ;
      tprmqfs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV32Modif = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
   }

   public void e1215C2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      Gx_msg = httpContext.getMessage( "Desea aplicar el ORDEN en las Fichas Tecnicas?", "") ;
      GXutil.Confirmed = true;
      if ( GXutil.Confirmed )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_char2[0] = A9832MaqCodF ;
         new app.pmabera(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tprmqfs_impl.this.A396EmprCod = GXv_char4[0] ;
         tprmqfs_impl.this.A457FasCod = GXv_char3[0] ;
         tprmqfs_impl.this.A9832MaqCodF = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
      }
      /*  Sending Event outputs  */
   }

   public void zm15C1290( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -7 )
      {
         Z9832MaqCodF = A9832MaqCodF ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TPRMQFS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T015C6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015C6_A407EmprNom[0] ;
      n407EmprNom = T015C6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T015C7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015C7_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(5);
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfs_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprmqfs_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
      A9833MaqDscF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9833MaqDscF", A9833MaqDscF);
      if ( ( GXutil.strcmp(A9833MaqDscF, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load15C1290( )
   {
      /* Using cursor T015C8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1290 = (short)(1) ;
         A407EmprNom = T015C8_A407EmprNom[0] ;
         n407EmprNom = T015C8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A460FasDsc = T015C8_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         zm15C1290( -7) ;
      }
      pr_default.close(6);
      onLoadActions15C1290( ) ;
   }

   public void onLoadActions15C1290( )
   {
   }

   public void checkExtendedTable15C1290( )
   {
      nIsDirty_1290 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15C1290( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15C1290( )
   {
      /* Using cursor T015C9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1290 = (short)(1) ;
      }
      else
      {
         RcdFound1290 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015C5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T015C5_A9832MaqCodF[0], A9832MaqCodF) == 0 ) && ( GXutil.strcmp(T015C5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015C5_A457FasCod[0], A457FasCod) == 0 ) )
      {
         zm15C1290( 7) ;
         RcdFound1290 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         sMode1290 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15C1290( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1290 = (short)(0) ;
            initializeNonKey15C1290( ) ;
         }
         Gx_mode = sMode1290 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1290 = (short)(0) ;
         initializeNonKey15C1290( ) ;
         sMode1290 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1290 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey15C1290( ) ;
      if ( RcdFound1290 == 0 )
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
      RcdFound1290 = (short)(0) ;
      /* Using cursor T015C10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T015C10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015C10_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015C10_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T015C10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015C10_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015C10_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            RcdFound1290 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1290 = (short)(0) ;
      /* Using cursor T015C11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015C11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015C11_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015C11_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015C11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015C11_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015C11_A9832MaqCodF[0], A9832MaqCodF) == 0 ) )
         {
            RcdFound1290 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15C1290( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert15C1290( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1290 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) )
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
               update15C1290( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert15C1290( ) ;
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
                  insert15C1290( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) )
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
      getKey15C1290( ) ;
      if ( RcdFound1290 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) || ( GXutil.strcmp(A9832MaqCodF, Z9832MaqCodF) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tprmqfs");
   }

   public void insert_check( )
   {
      confirm_15C0( ) ;
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
      if ( RcdFound1290 == 0 )
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
      scanStart15C1290( ) ;
      if ( RcdFound1290 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15C1290( ) ;
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
      if ( RcdFound1290 == 0 )
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
      if ( RcdFound1290 == 0 )
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
      scanStart15C1290( ) ;
      if ( RcdFound1290 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1290 != 0 )
         {
            scanNext15C1290( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd15C1290( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15C1290( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015C4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPARFSM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPARFSM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15C1290( )
   {
      beforeValidate15C1290( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15C1290( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15C1290( 0) ;
         checkOptimisticConcurrency15C1290( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15C1290( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15C1290( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015C12 */
                  pr_default.execute(10, new Object[] {A9832MaqCodF, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFSM");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel15C1290( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15C0( ) ;
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
            load15C1290( ) ;
         }
         endLevel15C1290( ) ;
      }
      closeExtendedTableCursors15C1290( ) ;
   }

   public void update15C1290( )
   {
      beforeValidate15C1290( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15C1290( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15C1290( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15C1290( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15C1290( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPPARFSM */
                  deferredUpdate15C1290( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15C1290( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15C0( ) ;
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
         endLevel15C1290( ) ;
      }
      closeExtendedTableCursors15C1290( ) ;
   }

   public void deferredUpdate15C1290( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15C1290( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15C1290( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15C1290( ) ;
         afterConfirm15C1290( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15C1290( ) ;
            if ( AnyError == 0 )
            {
               scanStart15C1299( ) ;
               while ( RcdFound1299 != 0 )
               {
                  getByPrimaryKey15C1299( ) ;
                  delete15C1299( ) ;
                  scanNext15C1299( ) ;
               }
               scanEnd15C1299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015C13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFSM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1290 == 0 )
                        {
                           initAll15C1290( ) ;
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
                        resetCaption15C0( ) ;
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
      sMode1290 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15C1290( ) ;
      Gx_mode = sMode1290 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15C1290( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015C14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRMQFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T015C15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel15C1299( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow15C1299( ) ;
         if ( ( nRcdExists_1299 != 0 ) || ( nIsMod_1299 != 0 ) )
         {
            standaloneNotModal15C1299( ) ;
            getKey15C1299( ) ;
            if ( ( nRcdExists_1299 == 0 ) && ( nRcdDeleted_1299 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15C1299( ) ;
            }
            else
            {
               if ( RcdFound1299 != 0 )
               {
                  if ( ( nRcdDeleted_1299 != 0 ) && ( nRcdExists_1299 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15C1299( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15C1299( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1299 == 0 )
                  {
                     GXCCtl = "COD_PARF_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCod_parF_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1299_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCod_parF_Internalname, GXutil.ltrim( localUtil.ntoc( A9834Cod_parF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDsc_ParF_Internalname, GXutil.rtrim( A9835Dsc_ParF)) ;
         httpContext.changePostValue( edtItm_ord1_Internalname, GXutil.ltrim( localUtil.ntoc( A10265Itm_ord1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9834Cod_parF_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9834Cod_parF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10265Itm_ord1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10265Itm_ord1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1299_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1299_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1299_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1299 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1299_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1299_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COD_PARF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSC_PARF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15C1299( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1299 = (short)(0) ;
      nIsMod_1299 = (short)(0) ;
      nRcdDeleted_1299 = (short)(0) ;
   }

   public void processLevel15C1290( )
   {
      /* Save parent mode. */
      sMode1290 = Gx_mode ;
      processNestedLevel15C1299( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1290 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15C1290( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15C1290( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprmqfs");
         if ( AnyError == 0 )
         {
            confirmValues15C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprmqfs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15C1290( )
   {
      /* Scan By routine */
      /* Using cursor T015C16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      RcdFound1290 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1290 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15C1290( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1290 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1290 = (short)(1) ;
      }
   }

   public void scanEnd15C1290( )
   {
      pr_default.close(14);
   }

   public void afterConfirm15C1290( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15C1290( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15C1290( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15C1290( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15C1290( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15C1290( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15C1290( )
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
   }

   public void zm15C1299( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10265Itm_ord1 = T015C3_A10265Itm_ord1[0] ;
         }
         else
         {
            Z10265Itm_ord1 = A10265Itm_ord1 ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z9834Cod_parF = A9834Cod_parF ;
         Z10265Itm_ord1 = A10265Itm_ord1 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal15C1299( )
   {
   }

   public void standaloneModal15C1299( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCod_parF_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_parF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtCod_parF_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCod_parF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load15C1299( )
   {
      /* Using cursor T015C17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1299 = (short)(1) ;
         A10265Itm_ord1 = T015C17_A10265Itm_ord1[0] ;
         n10265Itm_ord1 = T015C17_n10265Itm_ord1[0] ;
         zm15C1299( -10) ;
      }
      pr_default.close(15);
      onLoadActions15C1299( ) ;
   }

   public void onLoadActions15C1299( )
   {
      GXt_char1 = A9835Dsc_ParF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9834Cod_parF ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfs_impl.this.A9834Cod_parF = GXv_int5[0] ;
      tprmqfs_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9835Dsc_ParF = GXt_char1 ;
   }

   public void checkExtendedTable15C1299( )
   {
      nIsDirty_1299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal15C1299( ) ;
      nIsDirty_1299 = (short)(1) ;
      GXt_char1 = A9835Dsc_ParF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A9834Cod_parF ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char4[0] ;
      tprmqfs_impl.this.A9834Cod_parF = GXv_int5[0] ;
      tprmqfs_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9835Dsc_ParF = GXt_char1 ;
      if ( true /* Level */ && ( GXutil.strcmp(A9835Dsc_ParF, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "COD_PARF_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15C1299( )
   {
   }

   public void enableDisable15C1299( )
   {
   }

   public void getKey15C1299( )
   {
      /* Using cursor T015C18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1299 = (short)(1) ;
      }
      else
      {
         RcdFound1299 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey15C1299( )
   {
      /* Using cursor T015C3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015C3_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015C3_A9832MaqCodF[0], A9832MaqCodF) == 0 ) && ( GXutil.strcmp(T015C3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15C1299( 10) ;
         RcdFound1299 = (short)(1) ;
         initializeNonKey15C1299( ) ;
         A9834Cod_parF = T015C3_A9834Cod_parF[0] ;
         A10265Itm_ord1 = T015C3_A10265Itm_ord1[0] ;
         n10265Itm_ord1 = T015C3_n10265Itm_ord1[0] ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z9834Cod_parF = A9834Cod_parF ;
         sMode1299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15C1299( ) ;
         load15C1299( ) ;
         Gx_mode = sMode1299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1299 = (short)(0) ;
         initializeNonKey15C1299( ) ;
         sMode1299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15C1299( ) ;
         Gx_mode = sMode1299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15C1299( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15C1299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015C2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRFSMQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z10265Itm_ord1 != T015C2_A10265Itm_ord1[0] ) )
         {
            if ( Z10265Itm_ord1 != T015C2_A10265Itm_ord1[0] )
            {
               GXutil.writeLogln("tprmqfs:[seudo value changed for attri]"+"Itm_ord1");
               GXutil.writeLogRaw("Old: ",Z10265Itm_ord1);
               GXutil.writeLogRaw("Current: ",T015C2_A10265Itm_ord1[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRFSMQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15C1299( )
   {
      beforeValidate15C1299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15C1299( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15C1299( 0) ;
         checkOptimisticConcurrency15C1299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15C1299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15C1299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015C19 */
                  pr_default.execute(17, new Object[] {A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF), Boolean.valueOf(n10265Itm_ord1), Short.valueOf(A10265Itm_ord1), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRFSMQ");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A457FasCod ;
                        GXv_char2[0] = A9832MaqCodF ;
                        GXv_int5[0] = A9834Cod_parF ;
                        GXv_int6[0] = A10265Itm_ord1 ;
                        GXv_char7[0] = httpContext.getMessage( "INS", "") ;
                        new app.pagepunt(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5, GXv_int6, GXv_char7) ;
                        tprmqfs_impl.this.A396EmprCod = GXv_char4[0] ;
                        tprmqfs_impl.this.A457FasCod = GXv_char3[0] ;
                        tprmqfs_impl.this.A9832MaqCodF = GXv_char2[0] ;
                        tprmqfs_impl.this.A9834Cod_parF = GXv_int5[0] ;
                        tprmqfs_impl.this.A10265Itm_ord1 = GXv_int6[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
                     }
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
            load15C1299( ) ;
         }
         endLevel15C1299( ) ;
      }
      closeExtendedTableCursors15C1299( ) ;
   }

   public void update15C1299( )
   {
      beforeValidate15C1299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15C1299( ) ;
      }
      if ( ( nIsMod_1299 != 0 ) || ( nIsDirty_1299 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15C1299( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15C1299( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15C1299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015C20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n10265Itm_ord1), Short.valueOf(A10265Itm_ord1), A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRFSMQ");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRFSMQ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15C1299( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15C1299( ) ;
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
            endLevel15C1299( ) ;
         }
      }
      closeExtendedTableCursors15C1299( ) ;
   }

   public void deferredUpdate15C1299( )
   {
   }

   public void delete15C1299( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15C1299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15C1299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15C1299( ) ;
         afterConfirm15C1299( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15C1299( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015C21 */
               pr_default.execute(19, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Short.valueOf(A9834Cod_parF)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRFSMQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     GXv_char7[0] = A396EmprCod ;
                     GXv_char4[0] = A457FasCod ;
                     GXv_char3[0] = A9832MaqCodF ;
                     GXv_int6[0] = A9834Cod_parF ;
                     GXv_int5[0] = A10265Itm_ord1 ;
                     GXv_char2[0] = httpContext.getMessage( "DEL", "") ;
                     new app.pagepunt(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char3, GXv_int6, GXv_int5, GXv_char2) ;
                     tprmqfs_impl.this.A396EmprCod = GXv_char7[0] ;
                     tprmqfs_impl.this.A457FasCod = GXv_char4[0] ;
                     tprmqfs_impl.this.A9832MaqCodF = GXv_char3[0] ;
                     tprmqfs_impl.this.A9834Cod_parF = GXv_int6[0] ;
                     tprmqfs_impl.this.A10265Itm_ord1 = GXv_int5[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
                  }
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
      sMode1299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15C1299( ) ;
      Gx_mode = sMode1299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15C1299( )
   {
      standaloneModal15C1299( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A9835Dsc_ParF ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = A9834Cod_parF ;
         GXv_char4[0] = GXt_char1 ;
         new app.pexparfs(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char4) ;
         tprmqfs_impl.this.A396EmprCod = GXv_char7[0] ;
         tprmqfs_impl.this.A9834Cod_parF = GXv_int6[0] ;
         tprmqfs_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9835Dsc_ParF = GXt_char1 ;
      }
   }

   public void endLevel15C1299( )
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

   public void scanStart15C1299( )
   {
      /* Scan By routine */
      /* Using cursor T015C22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      RcdFound1299 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1299 = (short)(1) ;
         A9834Cod_parF = T015C22_A9834Cod_parF[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15C1299( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1299 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1299 = (short)(1) ;
         A9834Cod_parF = T015C22_A9834Cod_parF[0] ;
      }
   }

   public void scanEnd15C1299( )
   {
      pr_default.close(20);
   }

   public void afterConfirm15C1299( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15C1299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15C1299( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15C1299( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15C1299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15C1299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15C1299( )
   {
      edtCod_parF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_parF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDsc_ParF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDsc_ParF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_ParF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtItm_ord1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItm_ord1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes15C1299( )
   {
   }

   public void send_integrity_lvl_hashes15C1290( )
   {
   }

   public void subsflControlProps_501299( )
   {
      edtavnRcdDeleted_1299_Internalname = "vNRCDDELETED_1299_"+sGXsfl_50_idx ;
      edtCod_parF_Internalname = "COD_PARF_"+sGXsfl_50_idx ;
      edtDsc_ParF_Internalname = "DSC_PARF_"+sGXsfl_50_idx ;
      edtItm_ord1_Internalname = "ITM_ORD1_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501299( )
   {
      edtavnRcdDeleted_1299_Internalname = "vNRCDDELETED_1299_"+sGXsfl_50_fel_idx ;
      edtCod_parF_Internalname = "COD_PARF_"+sGXsfl_50_fel_idx ;
      edtDsc_ParF_Internalname = "DSC_PARF_"+sGXsfl_50_fel_idx ;
      edtItm_ord1_Internalname = "ITM_ORD1_"+sGXsfl_50_fel_idx ;
   }

   public void addRow15C1299( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501299( ) ;
      sendRow15C1299( ) ;
   }

   public void sendRow15C1299( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1299_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1299_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1299_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1299), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1299), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1299_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1299_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1299_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_parF_Internalname,GXutil.ltrim( localUtil.ntoc( A9834Cod_parF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9834Cod_parF), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_parF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCod_parF_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDsc_ParF_Internalname,GXutil.rtrim( A9835Dsc_ParF),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDsc_ParF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDsc_ParF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1299_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItm_ord1_Internalname,GXutil.ltrim( localUtil.ntoc( A10265Itm_ord1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtItm_ord1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10265Itm_ord1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10265Itm_ord1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItm_ord1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtItm_ord1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15C1299( ) ;
      GXCCtl = "Z9834Cod_parF_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9834Cod_parF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10265Itm_ord1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10265Itm_ord1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1299_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1299_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1299_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1299_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1299_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COD_PARF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DSC_PARF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ITM_ORD1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord1_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15C1299( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501299( ) ;
      edtavnRcdDeleted_1299_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1299_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCod_parF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COD_PARF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDsc_ParF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSC_PARF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtItm_ord1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1299");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1299_Internalname ;
         wbErr = true ;
         nRcdDeleted_1299 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1299 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCod_parF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCod_parF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COD_PARF_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parF_Internalname ;
         wbErr = true ;
         A9834Cod_parF = (short)(0) ;
      }
      else
      {
         A9834Cod_parF = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_parF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9835Dsc_ParF = httpContext.cgiGet( edtDsc_ParF_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ITM_ORD1_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtItm_ord1_Internalname ;
         wbErr = true ;
         A10265Itm_ord1 = (short)(0) ;
         n10265Itm_ord1 = false ;
      }
      else
      {
         A10265Itm_ord1 = (short)(localUtil.ctol( httpContext.cgiGet( edtItm_ord1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10265Itm_ord1 = false ;
      }
      GXCCtl = "Z9834Cod_parF_" + sGXsfl_50_idx ;
      Z9834Cod_parF = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10265Itm_ord1_" + sGXsfl_50_idx ;
      Z10265Itm_ord1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1299_" + sGXsfl_50_idx ;
      nRcdDeleted_1299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1299_" + sGXsfl_50_idx ;
      nRcdExists_1299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1299_" + sGXsfl_50_idx ;
      nIsMod_1299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCod_parF_Enabled = edtCod_parF_Enabled ;
   }

   public void confirmValues15C0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501299( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501299( ) ;
         httpContext.changePostValue( "Z9834Cod_parF_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9834Cod_parF_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9834Cod_parF_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10265Itm_ord1_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10265Itm_ord1_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10265Itm_ord1_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tprmqfs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tprmqfs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"})  ;
   }

   public String getPgmname( )
   {
      return "TPRMQFS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FASE-MAQUINA-PARAMETROS", "") ;
   }

   public void initializeNonKey15C1290( )
   {
   }

   public void initAll15C1290( )
   {
      initializeNonKey15C1290( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15C1299( )
   {
      A9835Dsc_ParF = "" ;
      A10265Itm_ord1 = (short)(0) ;
      n10265Itm_ord1 = false ;
      Z10265Itm_ord1 = (short)(0) ;
   }

   public void initAll15C1299( )
   {
      A9834Cod_parF = (short)(0) ;
      initializeNonKey15C1299( ) ;
   }

   public void standaloneModalInsert15C1299( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241542732", true, true);
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
      httpContext.AddJavascriptSource("tprmqfs.js", "?20268241542732", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1299( )
   {
      edtCod_parF_Enabled = defedtCod_parF_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_parF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_parF_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1299, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1299_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9834Cod_parF, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCod_parF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9835Dsc_ParF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDsc_ParF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10265Itm_ord1, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord1_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqDscF_Internalname = "MAQDSCF" ;
      edtavnRcdDeleted_1299_Internalname = "vNRCDDELETED_1299" ;
      edtCod_parF_Internalname = "COD_PARF" ;
      edtDsc_ParF_Internalname = "DSC_PARF" ;
      edtItm_ord1_Internalname = "ITM_ORD1" ;
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
      Form.setCaption( httpContext.getMessage( "FASE-MAQUINA-PARAMETROS", "") );
      edtItm_ord1_Jsonclick = "" ;
      edtDsc_ParF_Jsonclick = "" ;
      edtCod_parF_Jsonclick = "" ;
      edtavnRcdDeleted_1299_Jsonclick = "" ;
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
      edtItm_ord1_Enabled = 1 ;
      edtDsc_ParF_Enabled = 0 ;
      edtCod_parF_Enabled = 1 ;
      edtavnRcdDeleted_1299_Enabled = 1 ;
      edtMaqDscF_Jsonclick = "" ;
      edtMaqDscF_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDscF_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gx1asamaqdscf15C1290( String A396EmprCod ,
                                     String A9832MaqCodF )
   {
      GXt_char1 = A9833MaqDscF ;
      GXv_char7[0] = A396EmprCod ;
      GXv_char4[0] = A9832MaqCodF ;
      GXv_char3[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char3) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char7[0] ;
      tprmqfs_impl.this.A9832MaqCodF = GXv_char4[0] ;
      tprmqfs_impl.this.GXt_char1 = GXv_char3[0] ;
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

   public void gx3asadsc_parf15C1299( String A396EmprCod ,
                                      short A9834Cod_parF )
   {
      GXt_char1 = A9835Dsc_ParF ;
      GXv_char7[0] = A396EmprCod ;
      GXv_int6[0] = A9834Cod_parF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char4) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char7[0] ;
      tprmqfs_impl.this.A9834Cod_parF = GXv_int6[0] ;
      tprmqfs_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9835Dsc_ParF = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9835Dsc_ParF))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_5_15C1299( )
   {
      if ( true /* After */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A457FasCod ;
         GXv_char3[0] = A9832MaqCodF ;
         GXv_int6[0] = A9834Cod_parF ;
         GXv_int5[0] = A10265Itm_ord1 ;
         GXv_char2[0] = httpContext.getMessage( "DEL", "") ;
         new app.pagepunt(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char3, GXv_int6, GXv_int5, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A457FasCod = GXv_char4[0] ;
         A9832MaqCodF = GXv_char3[0] ;
         A9834Cod_parF = GXv_int6[0] ;
         A10265Itm_ord1 = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_6_15C1299( )
   {
      if ( true /* After */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A457FasCod ;
         GXv_char3[0] = A9832MaqCodF ;
         GXv_int6[0] = A9834Cod_parF ;
         GXv_int5[0] = A10265Itm_ord1 ;
         GXv_char2[0] = httpContext.getMessage( "INS", "") ;
         new app.pagepunt(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char3, GXv_int6, GXv_int5, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A457FasCod = GXv_char4[0] ;
         A9832MaqCodF = GXv_char3[0] ;
         A9834Cod_parF = GXv_int6[0] ;
         A10265Itm_ord1 = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9832MaqCodF", A9832MaqCodF);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      subsflControlProps_501299( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15C1299( ) ;
         standaloneModal15C1299( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15C1299( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501299( ) ;
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
      /* Using cursor T015C23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015C23_A407EmprNom[0] ;
      n407EmprNom = T015C23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T015C24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015C24_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
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

   public void valid_Maqcodf( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9833MaqDscF", GXutil.rtrim( Z9833MaqDscF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cod_parf( )
   {
      GXt_char1 = A9835Dsc_ParF ;
      GXv_char7[0] = A396EmprCod ;
      GXv_int6[0] = A9834Cod_parF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pexparfs(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char4) ;
      tprmqfs_impl.this.A396EmprCod = GXv_char7[0] ;
      tprmqfs_impl.this.A9834Cod_parF = GXv_int6[0] ;
      tprmqfs_impl.this.GXt_char1 = GXv_char4[0] ;
      A9835Dsc_ParF = GXt_char1 ;
      if ( true /* Level */ && ( GXutil.strcmp(A9835Dsc_ParF, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Inexistente", ""), 1, "COD_PARF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCod_parF_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9835Dsc_ParF", GXutil.rtrim( A9835Dsc_ParF));
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
      setEventMetadata("AFTER TRN","{handler:'e1215C2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCODF","{handler:'valid_Maqcodf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQCODF",",oparms:[{av:'A9833MaqDscF',fld:'MAQDSCF',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z457FasCod'},{av:'Z9832MaqCodF'},{av:'Z9833MaqDscF'},{av:'Z407EmprNom'},{av:'Z460FasDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COD_PARF","{handler:'valid_Cod_parf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9834Cod_parF',fld:'COD_PARF',pic:'ZZZ9'},{av:'A9835Dsc_ParF',fld:'DSC_PARF',pic:''}]");
      setEventMetadata("VALID_COD_PARF",",oparms:[{av:'A9835Dsc_ParF',fld:'DSC_PARF',pic:''}]}");
      setEventMetadata("VALID_ITM_ORD1","{handler:'valid_Itm_ord1',iparms:[]");
      setEventMetadata("VALID_ITM_ORD1",",oparms:[]}");
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9833MaqDscF = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1299 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1290 = "" ;
      GXCCtl = "" ;
      A9835Dsc_ParF = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV32Modif = "" ;
      Gx_msg = "" ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      T015C6_A407EmprNom = new String[] {""} ;
      T015C6_n407EmprNom = new boolean[] {false} ;
      T015C7_A460FasDsc = new String[] {""} ;
      T015C8_A9832MaqCodF = new String[] {""} ;
      T015C8_A407EmprNom = new String[] {""} ;
      T015C8_n407EmprNom = new boolean[] {false} ;
      T015C8_A460FasDsc = new String[] {""} ;
      T015C8_A396EmprCod = new String[] {""} ;
      T015C8_A457FasCod = new String[] {""} ;
      T015C9_A396EmprCod = new String[] {""} ;
      T015C9_A457FasCod = new String[] {""} ;
      T015C9_A9832MaqCodF = new String[] {""} ;
      T015C5_A9832MaqCodF = new String[] {""} ;
      T015C5_A396EmprCod = new String[] {""} ;
      T015C5_A457FasCod = new String[] {""} ;
      T015C10_A396EmprCod = new String[] {""} ;
      T015C10_A457FasCod = new String[] {""} ;
      T015C10_A9832MaqCodF = new String[] {""} ;
      T015C11_A396EmprCod = new String[] {""} ;
      T015C11_A457FasCod = new String[] {""} ;
      T015C11_A9832MaqCodF = new String[] {""} ;
      T015C4_A9832MaqCodF = new String[] {""} ;
      T015C4_A396EmprCod = new String[] {""} ;
      T015C4_A457FasCod = new String[] {""} ;
      T015C14_A396EmprCod = new String[] {""} ;
      T015C14_A457FasCod = new String[] {""} ;
      T015C14_A9832MaqCodF = new String[] {""} ;
      T015C14_A9863MaqAncM = new short[1] ;
      T015C15_A396EmprCod = new String[] {""} ;
      T015C15_A457FasCod = new String[] {""} ;
      T015C15_A9832MaqCodF = new String[] {""} ;
      T015C15_A9723Cod_par = new short[1] ;
      T015C16_A396EmprCod = new String[] {""} ;
      T015C16_A457FasCod = new String[] {""} ;
      T015C16_A9832MaqCodF = new String[] {""} ;
      T015C17_A457FasCod = new String[] {""} ;
      T015C17_A9832MaqCodF = new String[] {""} ;
      T015C17_A9834Cod_parF = new short[1] ;
      T015C17_A10265Itm_ord1 = new short[1] ;
      T015C17_n10265Itm_ord1 = new boolean[] {false} ;
      T015C17_A396EmprCod = new String[] {""} ;
      T015C18_A396EmprCod = new String[] {""} ;
      T015C18_A457FasCod = new String[] {""} ;
      T015C18_A9832MaqCodF = new String[] {""} ;
      T015C18_A9834Cod_parF = new short[1] ;
      T015C3_A457FasCod = new String[] {""} ;
      T015C3_A9832MaqCodF = new String[] {""} ;
      T015C3_A9834Cod_parF = new short[1] ;
      T015C3_A10265Itm_ord1 = new short[1] ;
      T015C3_n10265Itm_ord1 = new boolean[] {false} ;
      T015C3_A396EmprCod = new String[] {""} ;
      T015C2_A457FasCod = new String[] {""} ;
      T015C2_A9832MaqCodF = new String[] {""} ;
      T015C2_A9834Cod_parF = new short[1] ;
      T015C2_A10265Itm_ord1 = new short[1] ;
      T015C2_n10265Itm_ord1 = new boolean[] {false} ;
      T015C2_A396EmprCod = new String[] {""} ;
      T015C22_A396EmprCod = new String[] {""} ;
      T015C22_A457FasCod = new String[] {""} ;
      T015C22_A9832MaqCodF = new String[] {""} ;
      T015C22_A9834Cod_parF = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char3 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char2 = new String[1] ;
      T015C23_A407EmprNom = new String[] {""} ;
      T015C23_n407EmprNom = new boolean[] {false} ;
      T015C24_A460FasDsc = new String[] {""} ;
      Z9833MaqDscF = "" ;
      ZZ396EmprCod = "" ;
      ZZ457FasCod = "" ;
      ZZ9832MaqCodF = "" ;
      ZZ9833MaqDscF = "" ;
      ZZ407EmprNom = "" ;
      ZZ460FasDsc = "" ;
      GXt_char1 = "" ;
      GXv_char7 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char4 = new String[1] ;
      Z9835Dsc_ParF = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprmqfs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprmqfs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprmqfs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprmqfs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprmqfs__default(),
         new Object[] {
             new Object[] {
            T015C2_A457FasCod, T015C2_A9832MaqCodF, T015C2_A9834Cod_parF, T015C2_A10265Itm_ord1, T015C2_n10265Itm_ord1, T015C2_A396EmprCod
            }
            , new Object[] {
            T015C3_A457FasCod, T015C3_A9832MaqCodF, T015C3_A9834Cod_parF, T015C3_A10265Itm_ord1, T015C3_n10265Itm_ord1, T015C3_A396EmprCod
            }
            , new Object[] {
            T015C4_A9832MaqCodF, T015C4_A396EmprCod, T015C4_A457FasCod
            }
            , new Object[] {
            T015C5_A9832MaqCodF, T015C5_A396EmprCod, T015C5_A457FasCod
            }
            , new Object[] {
            T015C6_A407EmprNom, T015C6_n407EmprNom
            }
            , new Object[] {
            T015C7_A460FasDsc
            }
            , new Object[] {
            T015C8_A9832MaqCodF, T015C8_A407EmprNom, T015C8_n407EmprNom, T015C8_A460FasDsc, T015C8_A396EmprCod, T015C8_A457FasCod
            }
            , new Object[] {
            T015C9_A396EmprCod, T015C9_A457FasCod, T015C9_A9832MaqCodF
            }
            , new Object[] {
            T015C10_A396EmprCod, T015C10_A457FasCod, T015C10_A9832MaqCodF
            }
            , new Object[] {
            T015C11_A396EmprCod, T015C11_A457FasCod, T015C11_A9832MaqCodF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015C14_A396EmprCod, T015C14_A457FasCod, T015C14_A9832MaqCodF, T015C14_A9863MaqAncM
            }
            , new Object[] {
            T015C15_A396EmprCod, T015C15_A457FasCod, T015C15_A9832MaqCodF, T015C15_A9723Cod_par
            }
            , new Object[] {
            T015C16_A396EmprCod, T015C16_A457FasCod, T015C16_A9832MaqCodF
            }
            , new Object[] {
            T015C17_A457FasCod, T015C17_A9832MaqCodF, T015C17_A9834Cod_parF, T015C17_A10265Itm_ord1, T015C17_n10265Itm_ord1, T015C17_A396EmprCod
            }
            , new Object[] {
            T015C18_A396EmprCod, T015C18_A457FasCod, T015C18_A9832MaqCodF, T015C18_A9834Cod_parF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015C22_A396EmprCod, T015C22_A457FasCod, T015C22_A9832MaqCodF, T015C22_A9834Cod_parF
            }
            , new Object[] {
            T015C23_A407EmprNom, T015C23_n407EmprNom
            }
            , new Object[] {
            T015C24_A460FasDsc
            }
         }
      );
      Z9832MaqCodF = "" ;
      A9832MaqCodF = "" ;
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TPRMQFS" ;
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
   private short Z9834Cod_parF ;
   private short Z10265Itm_ord1 ;
   private short nRcdDeleted_1299 ;
   private short nRcdExists_1299 ;
   private short nIsMod_1299 ;
   private short A9834Cod_parF ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1299 ;
   private short RcdFound1299 ;
   private short nBlankRcdUsr1299 ;
   private short A10265Itm_ord1 ;
   private short RcdFound1290 ;
   private short nIsDirty_1290 ;
   private short nIsDirty_1299 ;
   private short GXv_int5[] ;
   private short GXv_int6[] ;
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
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCodF_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqDscF_Enabled ;
   private int edtavnRcdDeleted_1299_Enabled ;
   private int edtCod_parF_Enabled ;
   private int edtDsc_ParF_Enabled ;
   private int edtItm_ord1_Enabled ;
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
   private int defedtCod_parF_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqDscF_Internalname ;
   private String A9833MaqDscF ;
   private String edtMaqDscF_Jsonclick ;
   private String sMode1299 ;
   private String edtavnRcdDeleted_1299_Internalname ;
   private String edtCod_parF_Internalname ;
   private String edtDsc_ParF_Internalname ;
   private String edtItm_ord1_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1290 ;
   private String GXCCtl ;
   private String A9835Dsc_ParF ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV32Modif ;
   private String Gx_msg ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1299_Jsonclick ;
   private String edtCod_parF_Jsonclick ;
   private String edtDsc_ParF_Jsonclick ;
   private String edtItm_ord1_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9833MaqDscF ;
   private String ZZ396EmprCod ;
   private String ZZ457FasCod ;
   private String ZZ9832MaqCodF ;
   private String ZZ9833MaqDscF ;
   private String ZZ407EmprNom ;
   private String ZZ460FasDsc ;
   private String GXt_char1 ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String Z9835Dsc_ParF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10265Itm_ord1 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015C6_A407EmprNom ;
   private boolean[] T015C6_n407EmprNom ;
   private String[] T015C7_A460FasDsc ;
   private String[] T015C8_A9832MaqCodF ;
   private String[] T015C8_A407EmprNom ;
   private boolean[] T015C8_n407EmprNom ;
   private String[] T015C8_A460FasDsc ;
   private String[] T015C8_A396EmprCod ;
   private String[] T015C8_A457FasCod ;
   private String[] T015C9_A396EmprCod ;
   private String[] T015C9_A457FasCod ;
   private String[] T015C9_A9832MaqCodF ;
   private String[] T015C5_A9832MaqCodF ;
   private String[] T015C5_A396EmprCod ;
   private String[] T015C5_A457FasCod ;
   private String[] T015C10_A396EmprCod ;
   private String[] T015C10_A457FasCod ;
   private String[] T015C10_A9832MaqCodF ;
   private String[] T015C11_A396EmprCod ;
   private String[] T015C11_A457FasCod ;
   private String[] T015C11_A9832MaqCodF ;
   private String[] T015C4_A9832MaqCodF ;
   private String[] T015C4_A396EmprCod ;
   private String[] T015C4_A457FasCod ;
   private String[] T015C14_A396EmprCod ;
   private String[] T015C14_A457FasCod ;
   private String[] T015C14_A9832MaqCodF ;
   private short[] T015C14_A9863MaqAncM ;
   private String[] T015C15_A396EmprCod ;
   private String[] T015C15_A457FasCod ;
   private String[] T015C15_A9832MaqCodF ;
   private short[] T015C15_A9723Cod_par ;
   private String[] T015C16_A396EmprCod ;
   private String[] T015C16_A457FasCod ;
   private String[] T015C16_A9832MaqCodF ;
   private String[] T015C17_A457FasCod ;
   private String[] T015C17_A9832MaqCodF ;
   private short[] T015C17_A9834Cod_parF ;
   private short[] T015C17_A10265Itm_ord1 ;
   private boolean[] T015C17_n10265Itm_ord1 ;
   private String[] T015C17_A396EmprCod ;
   private String[] T015C18_A396EmprCod ;
   private String[] T015C18_A457FasCod ;
   private String[] T015C18_A9832MaqCodF ;
   private short[] T015C18_A9834Cod_parF ;
   private String[] T015C3_A457FasCod ;
   private String[] T015C3_A9832MaqCodF ;
   private short[] T015C3_A9834Cod_parF ;
   private short[] T015C3_A10265Itm_ord1 ;
   private boolean[] T015C3_n10265Itm_ord1 ;
   private String[] T015C3_A396EmprCod ;
   private String[] T015C2_A457FasCod ;
   private String[] T015C2_A9832MaqCodF ;
   private short[] T015C2_A9834Cod_parF ;
   private short[] T015C2_A10265Itm_ord1 ;
   private boolean[] T015C2_n10265Itm_ord1 ;
   private String[] T015C2_A396EmprCod ;
   private String[] T015C22_A396EmprCod ;
   private String[] T015C22_A457FasCod ;
   private String[] T015C22_A9832MaqCodF ;
   private short[] T015C22_A9834Cod_parF ;
   private String[] T015C23_A407EmprNom ;
   private boolean[] T015C23_n407EmprNom ;
   private String[] T015C24_A460FasDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprmqfs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprmqfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015C2", "SELECT FasCod, MaqCodF, Cod_parF, Itm_ord1, EmprCod FROM TXPPRFSMQ WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND Cod_parF = ?  FOR UPDATE OF Itm_ord1 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015C3", "SELECT FasCod, MaqCodF, Cod_parF, Itm_ord1, EmprCod FROM TXPPRFSMQ WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND Cod_parF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015C4", "SELECT MaqCodF, EmprCod, FasCod FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?  FOR UPDATE OF MaqCodF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C5", "SELECT MaqCodF, EmprCod, FasCod FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C7", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C8", "SELECT /*+ FIRST_ROWS(1) */ TM1.MaqCodF, T2.EmprNom, T3.FasDsc, TM1.EmprCod, TM1.FasCod FROM ((TXPPARFSM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.FasCod = ? and TM1.MaqCodF = ? ORDER BY TM1.EmprCod, TM1.FasCod, TM1.MaqCodF ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod DESC, FasCod DESC, MaqCodF DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015C12", "INSERT INTO TXPPARFSM(MaqCodF, EmprCod, FasCod, MaqAnc) VALUES(?, ?, ?, 0)", GX_NOMASK, "TXPPARFSM")
         ,new UpdateCursor("T015C13", "DELETE FROM TXPPARFSM  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?", GX_NOMASK, "TXPPARFSM")
         ,new ForEachCursor("T015C14", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF, MaqAncM FROM TXPPRMQFA WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C15", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF, Cod_par FROM TXPPARFS1 WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015C17", "SELECT FasCod, MaqCodF, Cod_parF, Itm_ord1, EmprCod FROM TXPPRFSMQ WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? and Cod_parF = ? ORDER BY EmprCod, FasCod, MaqCodF, Cod_parF ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015C18", "SELECT EmprCod, FasCod, MaqCodF, Cod_parF FROM TXPPRFSMQ WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND Cod_parF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015C19", "INSERT INTO TXPPRFSMQ(FasCod, MaqCodF, Cod_parF, Itm_ord1, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPRFSMQ")
         ,new UpdateCursor("T015C20", "UPDATE TXPPRFSMQ SET Itm_ord1=?  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND Cod_parF = ?", GX_NOMASK, "TXPPRFSMQ")
         ,new UpdateCursor("T015C21", "DELETE FROM TXPPRFSMQ  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? AND Cod_parF = ?", GX_NOMASK, "TXPPRFSMQ")
         ,new ForEachCursor("T015C22", "SELECT EmprCod, FasCod, MaqCodF, Cod_parF FROM TXPPRFSMQ WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF, Cod_parF ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015C23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015C24", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
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
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 6);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

