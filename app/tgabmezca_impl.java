package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tgabmezca_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A12946GabMezCalI = (byte)(GXutil.lval( httpContext.GetPar( "GabMezCalI"))) ;
         n12946GabMezCalI = false ;
         Gx_msg = httpContext.GetPar( "Gx_msg") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_1M11774( A396EmprCod, A4364GrdTipArt, A12946GabMezCalI, Gx_msg) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12946GabMezCalI = (byte)(GXutil.lval( httpContext.GetPar( "GabMezCalI"))) ;
         n12946GabMezCalI = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A12946GabMezCalI) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Gabardina o Mezclilla Calidades", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtGrdTipArt_Internalname ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
      A12937GabMezUlt = (short)(GXutil.lval( httpContext.GetPar( "GabMezUlt"))) ;
      n12937GabMezUlt = false ;
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

   public tgabmezca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tgabmezca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgabmezca_impl.class ));
   }

   public tgabmezca_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TGABMEZCA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Gran Tipo de Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtGrdTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion Gran Tipo de Artic", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipDsc_Internalname, GXutil.rtrim( A4368GrdTipDsc), GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipDsc_Jsonclick, 0, "", "", "", "", "", 1, edtGrdTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGabMezUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A12937GabMezUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGabMezUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12937GabMezUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12937GabMezUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGabMezUlt_Jsonclick, 0, "", "", "", "", "", 1, edtGabMezUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TGABMEZCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1774 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1774 = (short)(1) ;
            scanStart1M11774( ) ;
            while ( RcdFound1774 != 0 )
            {
               init_level_properties1774( ) ;
               getByPrimaryKey1M11774( ) ;
               addRow1M11774( ) ;
               scanNext1M11774( ) ;
            }
            scanEnd1M11774( ) ;
            nBlankRcdCount1774 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12937GabMezUlt = A12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         standaloneNotModal1M11774( ) ;
         standaloneModal1M11774( ) ;
         sMode1774 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1M11774( ) ;
            edtavnRcdDeleted_1774_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1774_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1774_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1774_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZID_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezVMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZVMIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezVMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezVMin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezVMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZVMAX_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezVMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezVMax_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezMtsI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZMTSI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezMtsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezMtsI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezMtsF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZMTSF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezMtsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezMtsF_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezCrtI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCRTI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezCrtI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCrtI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezCrtF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCRTF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezCrtF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCrtF_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezEmpI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZEMPI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezEmpI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezEmpI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezEmpF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZEMPF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezEmpF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezEmpF_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezCalI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCALI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezCalI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCalI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGabMezCalN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCALN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGabMezCalN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCalN_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1774 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1M11774( ) ;
            }
            sendRow1M11774( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1774 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12937GabMezUlt = B12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1774 = (short)(5) ;
         nRcdExists_1774 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1M11774( ) ;
            while ( RcdFound1774 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451774( ) ;
               init_level_properties1774( ) ;
               standaloneNotModal1M11774( ) ;
               getByPrimaryKey1M11774( ) ;
               standaloneModal1M11774( ) ;
               addRow1M11774( ) ;
               scanNext1M11774( ) ;
            }
            scanEnd1M11774( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1774 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451774( ) ;
      initAll1M11774( ) ;
      init_level_properties1774( ) ;
      B12937GabMezUlt = A12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      nRcdExists_1774 = (short)(0) ;
      nIsMod_1774 = (short)(0) ;
      nRcdDeleted_1774 = (short)(0) ;
      nBlankRcdCount1774 = (short)(nBlankRcdUsr1774+nBlankRcdCount1774) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1774 > 0 )
      {
         standaloneNotModal1M11774( ) ;
         standaloneModal1M11774( ) ;
         addRow1M11774( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtGabMezID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1774 = (short)(nBlankRcdCount1774-1) ;
      }
      Gx_mode = sMode1774 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12937GabMezUlt = B12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGABMEZCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TGABMEZCA.htm");
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
      e111M12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4364GrdTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4368GrdTipDsc = httpContext.cgiGet( "Z4368GrdTipDsc") ;
            Z12937GabMezUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z12937GabMezUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12937GabMezUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O12937GabMezUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRDTIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4364GrdTipArt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            }
            else
            {
               A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            }
            A4368GrdTipDsc = httpContext.cgiGet( edtGrdTipDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
            A12937GabMezUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12937GabMezUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
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
               A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
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
                        e111M12 ();
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
            initAll1M1660( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1774_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1774_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1M1660( ) ;
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

   public void confirm_1M10( )
   {
      beforeValidate1M1660( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M1660( ) ;
         }
         else
         {
            checkExtendedTable1M1660( ) ;
            if ( AnyError == 0 )
            {
               zm1M1660( 9) ;
            }
            closeExtendedTableCursors1M1660( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode660 = Gx_mode ;
         confirm_1M11774( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode660 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1M10( ) ;
      }
   }

   public void confirm_1M11774( )
   {
      s12937GabMezUlt = O12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1M11774( ) ;
         if ( ( nRcdExists_1774 != 0 ) || ( nIsMod_1774 != 0 ) )
         {
            getKey1M11774( ) ;
            if ( ( nRcdExists_1774 == 0 ) && ( nRcdDeleted_1774 == 0 ) )
            {
               if ( RcdFound1774 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1M11774( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1M11774( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1M11774( 11) ;
                     }
                     closeExtendedTableCursors1M11774( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12937GabMezUlt = A12937GabMezUlt ;
                     n12937GabMezUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "GABMEZID_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGabMezID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1774 != 0 )
               {
                  if ( nRcdDeleted_1774 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1M11774( ) ;
                     load1M11774( ) ;
                     beforeValidate1M11774( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1M11774( ) ;
                        O12937GabMezUlt = A12937GabMezUlt ;
                        n12937GabMezUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1774 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1M11774( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1M11774( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1M11774( 11) ;
                           }
                           closeExtendedTableCursors1M11774( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12937GabMezUlt = A12937GabMezUlt ;
                           n12937GabMezUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1774 == 0 )
                  {
                     GXCCtl = "GABMEZID_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGabMezID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1774_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezID_Internalname, GXutil.ltrim( localUtil.ntoc( A12938GabMezID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezVMin_Internalname, GXutil.ltrim( localUtil.ntoc( A12939GabMezVMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezVMax_Internalname, GXutil.ltrim( localUtil.ntoc( A12940GabMezVMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezMtsI_Internalname, GXutil.ltrim( localUtil.ntoc( A12941GabMezMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezMtsF_Internalname, GXutil.ltrim( localUtil.ntoc( A12942GabMezMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCrtI_Internalname, GXutil.ltrim( localUtil.ntoc( A13103GabMezCrtI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCrtF_Internalname, GXutil.ltrim( localUtil.ntoc( A13104GabMezCrtF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezEmpI_Internalname, GXutil.ltrim( localUtil.ntoc( A13105GabMezEmpI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezEmpF_Internalname, GXutil.ltrim( localUtil.ntoc( A13106GabMezEmpF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCalI_Internalname, GXutil.ltrim( localUtil.ntoc( A12946GabMezCalI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCalN_Internalname, GXutil.rtrim( A12947GabMezCalN)) ;
         httpContext.changePostValue( "ZT_"+"Z12938GabMezID_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12938GabMezID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12939GabMezVMin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12939GabMezVMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12940GabMezVMax_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12940GabMezVMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12941GabMezMtsI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12941GabMezMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12942GabMezMtsF_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12942GabMezMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13103GabMezCrtI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13103GabMezCrtI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13104GabMezCrtF_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13104GabMezCrtF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13105GabMezEmpI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13105GabMezEmpI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13106GabMezEmpF_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13106GabMezEmpF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12946GabMezCalI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12946GabMezCalI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1774_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1774_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1774_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1774 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1774_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1774_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZID_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZVMIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZVMAX_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZMTSI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZMTSF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCRTI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCRTF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZEMPI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZEMPF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCALI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCALN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12937GabMezUlt = s12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1M10( )
   {
   }

   public void e111M12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tgabmezca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tgabmezca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tgabmezca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tgabmezca_impl.this.A396EmprCod = GXv_char2[0] ;
      tgabmezca_impl.this.AV11EmprNom = GXv_char3[0] ;
      tgabmezca_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1M1660( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4368GrdTipDsc = T01M16_A4368GrdTipDsc[0] ;
            Z12937GabMezUlt = T01M16_A12937GabMezUlt[0] ;
         }
         else
         {
            Z4368GrdTipDsc = A4368GrdTipDsc ;
            Z12937GabMezUlt = A12937GabMezUlt ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z4368GrdTipDsc = A4368GrdTipDsc ;
         Z12937GabMezUlt = A12937GabMezUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtGabMezUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezUlt_Enabled), 5, 0), true);
      AV35Pgmname = "TGABMEZCA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtGabMezUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezUlt_Enabled), 5, 0), true);
      /* Using cursor T01M17 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01M17_A407EmprNom[0] ;
      n407EmprNom = T01M17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( ( isDlt( )  || isIns( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load1M1660( )
   {
      /* Using cursor T01M18 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A407EmprNom = T01M18_A407EmprNom[0] ;
         n407EmprNom = T01M18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4368GrdTipDsc = T01M18_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A12937GabMezUlt = T01M18_A12937GabMezUlt[0] ;
         n12937GabMezUlt = T01M18_n12937GabMezUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         zm1M1660( -8) ;
      }
      pr_default.close(6);
      onLoadActions1M1660( ) ;
   }

   public void onLoadActions1M1660( )
   {
   }

   public void checkExtendedTable1M1660( )
   {
      nIsDirty_660 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1M1660( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1M1660( )
   {
      /* Using cursor T01M19 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound660 = (short)(1) ;
      }
      else
      {
         RcdFound660 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01M16 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01M16_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1M1660( 8) ;
         RcdFound660 = (short)(1) ;
         A4364GrdTipArt = T01M16_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4368GrdTipDsc = T01M16_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A12937GabMezUlt = T01M16_A12937GabMezUlt[0] ;
         n12937GabMezUlt = T01M16_n12937GabMezUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         O12937GabMezUlt = A12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         sMode660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M1660( ) ;
         if ( AnyError == 1 )
         {
            RcdFound660 = (short)(0) ;
            initializeNonKey1M1660( ) ;
         }
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound660 = (short)(0) ;
         initializeNonKey1M1660( ) ;
         sMode660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1M1660( ) ;
      if ( RcdFound660 == 0 )
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
      RcdFound660 = (short)(0) ;
      /* Using cursor T01M110 */
      pr_default.execute(8, new Object[] {Short.valueOf(A4364GrdTipArt), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01M110_A4364GrdTipArt[0] < A4364GrdTipArt ) ) && ( GXutil.strcmp(T01M110_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01M110_A4364GrdTipArt[0] > A4364GrdTipArt ) ) && ( GXutil.strcmp(T01M110_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4364GrdTipArt = T01M110_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            RcdFound660 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound660 = (short)(0) ;
      /* Using cursor T01M111 */
      pr_default.execute(9, new Object[] {Short.valueOf(A4364GrdTipArt), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01M111_A4364GrdTipArt[0] > A4364GrdTipArt ) ) && ( GXutil.strcmp(T01M111_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01M111_A4364GrdTipArt[0] < A4364GrdTipArt ) ) && ( GXutil.strcmp(T01M111_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4364GrdTipArt = T01M111_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            RcdFound660 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M1660( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12937GabMezUlt = O12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         GX_FocusControl = edtGrdTipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M1660( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound660 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
            {
               A4364GrdTipArt = Z4364GrdTipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12937GabMezUlt = O12937GabMezUlt ;
               n12937GabMezUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtGrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A12937GabMezUlt = O12937GabMezUlt ;
               n12937GabMezUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
               update1M1660( ) ;
               GX_FocusControl = edtGrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12937GabMezUlt = O12937GabMezUlt ;
               n12937GabMezUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
               GX_FocusControl = edtGrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M1660( ) ;
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
                  A12937GabMezUlt = O12937GabMezUlt ;
                  n12937GabMezUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
                  GX_FocusControl = edtGrdTipArt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1M1660( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
      {
         A4364GrdTipArt = Z4364GrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12937GabMezUlt = O12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
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
      getKey1M1660( ) ;
      if ( RcdFound660 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
         {
            A4364GrdTipArt = Z4364GrdTipArt ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tgabmezca");
      GX_FocusControl = edtGrdTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1M10( ) ;
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
      if ( RcdFound660 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtGrdTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1M1660( ) ;
      if ( RcdFound660 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M1660( ) ;
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
      if ( RcdFound660 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipDsc_Internalname ;
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
      if ( RcdFound660 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipDsc_Internalname ;
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
      scanStart1M1660( ) ;
      if ( RcdFound660 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound660 != 0 )
         {
            scanNext1M1660( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M1660( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M1660( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M15 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTIP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z4368GrdTipDsc, T01M15_A4368GrdTipDsc[0]) != 0 ) || ( Z12937GabMezUlt != T01M15_A12937GabMezUlt[0] ) )
         {
            if ( GXutil.strcmp(Z4368GrdTipDsc, T01M15_A4368GrdTipDsc[0]) != 0 )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GrdTipDsc");
               GXutil.writeLogRaw("Old: ",Z4368GrdTipDsc);
               GXutil.writeLogRaw("Current: ",T01M15_A4368GrdTipDsc[0]);
            }
            if ( Z12937GabMezUlt != T01M15_A12937GabMezUlt[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezUlt");
               GXutil.writeLogRaw("Old: ",Z12937GabMezUlt);
               GXutil.writeLogRaw("Current: ",T01M15_A12937GabMezUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRDTIP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M1660( )
   {
      beforeValidate1M1660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M1660( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M1660( 0) ;
         checkOptimisticConcurrency1M1660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M1660( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M1660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M112 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A4364GrdTipArt), A4368GrdTipDsc, Boolean.valueOf(n12937GabMezUlt), Short.valueOf(A12937GabMezUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
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
                        processLevel1M1660( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1M10( ) ;
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
            load1M1660( ) ;
         }
         endLevel1M1660( ) ;
      }
      closeExtendedTableCursors1M1660( ) ;
   }

   public void update1M1660( )
   {
      beforeValidate1M1660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M1660( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M1660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M1660( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M1660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M113 */
                  pr_default.execute(11, new Object[] {A4368GrdTipDsc, Boolean.valueOf(n12937GabMezUlt), Short.valueOf(A12937GabMezUlt), A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTIP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M1660( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1M1660( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1M10( ) ;
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
         endLevel1M1660( ) ;
      }
      closeExtendedTableCursors1M1660( ) ;
   }

   public void deferredUpdate1M1660( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M1660( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M1660( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M1660( ) ;
         afterConfirm1M1660( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M1660( ) ;
            if ( AnyError == 0 )
            {
               A12937GabMezUlt = O12937GabMezUlt ;
               n12937GabMezUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
               scanStart1M11774( ) ;
               while ( RcdFound1774 != 0 )
               {
                  getByPrimaryKey1M11774( ) ;
                  delete1M11774( ) ;
                  scanNext1M11774( ) ;
                  O12937GabMezUlt = A12937GabMezUlt ;
                  n12937GabMezUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
               }
               scanEnd1M11774( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M114 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound660 == 0 )
                        {
                           initAll1M1660( ) ;
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
                        resetCaption1M10( ) ;
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
      sMode660 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M1660( ) ;
      Gx_mode = sMode660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M1660( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01M115 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01M116 */
         pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COLPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01M117 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIxFI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01M118 */
         pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01M119 */
         pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01M120 */
         pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1M11774( )
   {
      s12937GabMezUlt = O12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1M11774( ) ;
         if ( ( nRcdExists_1774 != 0 ) || ( nIsMod_1774 != 0 ) )
         {
            standaloneNotModal1M11774( ) ;
            getKey1M11774( ) ;
            if ( ( nRcdExists_1774 == 0 ) && ( nRcdDeleted_1774 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1M11774( ) ;
            }
            else
            {
               if ( RcdFound1774 != 0 )
               {
                  if ( ( nRcdDeleted_1774 != 0 ) && ( nRcdExists_1774 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1M11774( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1774 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1M11774( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1774 == 0 )
                  {
                     GXCCtl = "GABMEZID_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGabMezID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12937GabMezUlt = A12937GabMezUlt ;
            n12937GabMezUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1774_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezID_Internalname, GXutil.ltrim( localUtil.ntoc( A12938GabMezID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezVMin_Internalname, GXutil.ltrim( localUtil.ntoc( A12939GabMezVMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezVMax_Internalname, GXutil.ltrim( localUtil.ntoc( A12940GabMezVMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezMtsI_Internalname, GXutil.ltrim( localUtil.ntoc( A12941GabMezMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezMtsF_Internalname, GXutil.ltrim( localUtil.ntoc( A12942GabMezMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCrtI_Internalname, GXutil.ltrim( localUtil.ntoc( A13103GabMezCrtI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCrtF_Internalname, GXutil.ltrim( localUtil.ntoc( A13104GabMezCrtF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezEmpI_Internalname, GXutil.ltrim( localUtil.ntoc( A13105GabMezEmpI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezEmpF_Internalname, GXutil.ltrim( localUtil.ntoc( A13106GabMezEmpF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCalI_Internalname, GXutil.ltrim( localUtil.ntoc( A12946GabMezCalI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGabMezCalN_Internalname, GXutil.rtrim( A12947GabMezCalN)) ;
         httpContext.changePostValue( "ZT_"+"Z12938GabMezID_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12938GabMezID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12939GabMezVMin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12939GabMezVMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12940GabMezVMax_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12940GabMezVMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12941GabMezMtsI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12941GabMezMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12942GabMezMtsF_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12942GabMezMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13103GabMezCrtI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13103GabMezCrtI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13104GabMezCrtF_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13104GabMezCrtF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13105GabMezEmpI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13105GabMezEmpI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13106GabMezEmpF_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13106GabMezEmpF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12946GabMezCalI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z12946GabMezCalI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1774_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1774_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1774_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1774 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1774_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1774_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZID_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZVMIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZVMAX_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZMTSI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZMTSF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCRTI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCRTF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZEMPI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZEMPF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCALI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GABMEZCALN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1M11774( ) ;
      if ( AnyError != 0 )
      {
         O12937GabMezUlt = s12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      }
      nRcdExists_1774 = (short)(0) ;
      nIsMod_1774 = (short)(0) ;
      nRcdDeleted_1774 = (short)(0) ;
   }

   public void processLevel1M1660( )
   {
      /* Save parent mode. */
      sMode660 = Gx_mode ;
      processNestedLevel1M11774( ) ;
      if ( AnyError != 0 )
      {
         O12937GabMezUlt = s12937GabMezUlt ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01M121 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n12937GabMezUlt), Short.valueOf(A12937GabMezUlt), A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
   }

   public void endLevel1M1660( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1M1660( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tgabmezca");
         if ( AnyError == 0 )
         {
            confirmValues1M10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tgabmezca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M1660( )
   {
      /* Scan By routine */
      /* Using cursor T01M122 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      RcdFound660 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A4364GrdTipArt = T01M122_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M1660( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound660 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A4364GrdTipArt = T01M122_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      }
   }

   public void scanEnd1M1660( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1M1660( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M1660( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M1660( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M1660( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M1660( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M1660( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M1660( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      edtGabMezUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezUlt_Enabled), 5, 0), true);
   }

   public void zm1M11774( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12939GabMezVMin = T01M13_A12939GabMezVMin[0] ;
            Z12940GabMezVMax = T01M13_A12940GabMezVMax[0] ;
            Z12941GabMezMtsI = T01M13_A12941GabMezMtsI[0] ;
            Z12942GabMezMtsF = T01M13_A12942GabMezMtsF[0] ;
            Z13103GabMezCrtI = T01M13_A13103GabMezCrtI[0] ;
            Z13104GabMezCrtF = T01M13_A13104GabMezCrtF[0] ;
            Z13105GabMezEmpI = T01M13_A13105GabMezEmpI[0] ;
            Z13106GabMezEmpF = T01M13_A13106GabMezEmpF[0] ;
            Z12946GabMezCalI = T01M13_A12946GabMezCalI[0] ;
         }
         else
         {
            Z12939GabMezVMin = A12939GabMezVMin ;
            Z12940GabMezVMax = A12940GabMezVMax ;
            Z12941GabMezMtsI = A12941GabMezMtsI ;
            Z12942GabMezMtsF = A12942GabMezMtsF ;
            Z13103GabMezCrtI = A13103GabMezCrtI ;
            Z13104GabMezCrtF = A13104GabMezCrtF ;
            Z13105GabMezEmpI = A13105GabMezEmpI ;
            Z13106GabMezEmpF = A13106GabMezEmpF ;
            Z12946GabMezCalI = A12946GabMezCalI ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z12938GabMezID = A12938GabMezID ;
         Z12939GabMezVMin = A12939GabMezVMin ;
         Z12940GabMezVMax = A12940GabMezVMax ;
         Z12941GabMezMtsI = A12941GabMezMtsI ;
         Z12942GabMezMtsF = A12942GabMezMtsF ;
         Z13103GabMezCrtI = A13103GabMezCrtI ;
         Z13104GabMezCrtF = A13104GabMezCrtF ;
         Z13105GabMezEmpI = A13105GabMezEmpI ;
         Z13106GabMezEmpF = A13106GabMezEmpF ;
         Z396EmprCod = A396EmprCod ;
         Z12946GabMezCalI = A12946GabMezCalI ;
         Z12947GabMezCalN = A12947GabMezCalN ;
      }
   }

   public void standaloneNotModal1M11774( )
   {
      edtGabMezUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezUlt_Enabled), 5, 0), true);
      edtGabMezUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1M11774( )
   {
      if ( isIns( )  )
      {
         A12937GabMezUlt = (short)(O12937GabMezUlt+1) ;
         n12937GabMezUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A12938GabMezID = A12937GabMezUlt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGabMezID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGabMezID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtGabMezID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGabMezID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1M11774( )
   {
      /* Using cursor T01M123 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1774 = (short)(1) ;
         A12939GabMezVMin = T01M123_A12939GabMezVMin[0] ;
         n12939GabMezVMin = T01M123_n12939GabMezVMin[0] ;
         A12940GabMezVMax = T01M123_A12940GabMezVMax[0] ;
         n12940GabMezVMax = T01M123_n12940GabMezVMax[0] ;
         A12941GabMezMtsI = T01M123_A12941GabMezMtsI[0] ;
         n12941GabMezMtsI = T01M123_n12941GabMezMtsI[0] ;
         A12942GabMezMtsF = T01M123_A12942GabMezMtsF[0] ;
         n12942GabMezMtsF = T01M123_n12942GabMezMtsF[0] ;
         A13103GabMezCrtI = T01M123_A13103GabMezCrtI[0] ;
         n13103GabMezCrtI = T01M123_n13103GabMezCrtI[0] ;
         A13104GabMezCrtF = T01M123_A13104GabMezCrtF[0] ;
         n13104GabMezCrtF = T01M123_n13104GabMezCrtF[0] ;
         A13105GabMezEmpI = T01M123_A13105GabMezEmpI[0] ;
         n13105GabMezEmpI = T01M123_n13105GabMezEmpI[0] ;
         A13106GabMezEmpF = T01M123_A13106GabMezEmpF[0] ;
         n13106GabMezEmpF = T01M123_n13106GabMezEmpF[0] ;
         A12947GabMezCalN = T01M123_A12947GabMezCalN[0] ;
         n12947GabMezCalN = T01M123_n12947GabMezCalN[0] ;
         A12946GabMezCalI = T01M123_A12946GabMezCalI[0] ;
         n12946GabMezCalI = T01M123_n12946GabMezCalI[0] ;
         zm1M11774( -10) ;
      }
      pr_default.close(21);
      onLoadActions1M11774( ) ;
   }

   public void onLoadActions1M11774( )
   {
   }

   public void checkExtendedTable1M11774( )
   {
      nIsDirty_1774 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1M11774( ) ;
      /* Using cursor T01M14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n12946GabMezCalI), Byte.valueOf(A12946GabMezCalI)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "GABMEZCALI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidades", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezCalI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12947GabMezCalN = T01M14_A12947GabMezCalN[0] ;
      n12947GabMezCalN = T01M14_n12947GabMezCalN[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1M11774( )
   {
      pr_default.close(2);
   }

   public void enableDisable1M11774( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          byte A12946GabMezCalI )
   {
      /* Using cursor T01M124 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n12946GabMezCalI), Byte.valueOf(A12946GabMezCalI)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "GABMEZCALI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidades", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezCalI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12947GabMezCalN = T01M124_A12947GabMezCalN[0] ;
      n12947GabMezCalN = T01M124_n12947GabMezCalN[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12947GabMezCalN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1M11774( )
   {
      /* Using cursor T01M125 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1774 = (short)(1) ;
      }
      else
      {
         RcdFound1774 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey1M11774( )
   {
      /* Using cursor T01M13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01M13_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1M11774( 10) ;
         RcdFound1774 = (short)(1) ;
         initializeNonKey1M11774( ) ;
         A12938GabMezID = T01M13_A12938GabMezID[0] ;
         A12939GabMezVMin = T01M13_A12939GabMezVMin[0] ;
         n12939GabMezVMin = T01M13_n12939GabMezVMin[0] ;
         A12940GabMezVMax = T01M13_A12940GabMezVMax[0] ;
         n12940GabMezVMax = T01M13_n12940GabMezVMax[0] ;
         A12941GabMezMtsI = T01M13_A12941GabMezMtsI[0] ;
         n12941GabMezMtsI = T01M13_n12941GabMezMtsI[0] ;
         A12942GabMezMtsF = T01M13_A12942GabMezMtsF[0] ;
         n12942GabMezMtsF = T01M13_n12942GabMezMtsF[0] ;
         A13103GabMezCrtI = T01M13_A13103GabMezCrtI[0] ;
         n13103GabMezCrtI = T01M13_n13103GabMezCrtI[0] ;
         A13104GabMezCrtF = T01M13_A13104GabMezCrtF[0] ;
         n13104GabMezCrtF = T01M13_n13104GabMezCrtF[0] ;
         A13105GabMezEmpI = T01M13_A13105GabMezEmpI[0] ;
         n13105GabMezEmpI = T01M13_n13105GabMezEmpI[0] ;
         A13106GabMezEmpF = T01M13_A13106GabMezEmpF[0] ;
         n13106GabMezEmpF = T01M13_n13106GabMezEmpF[0] ;
         A12946GabMezCalI = T01M13_A12946GabMezCalI[0] ;
         n12946GabMezCalI = T01M13_n12946GabMezCalI[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z12938GabMezID = A12938GabMezID ;
         sMode1774 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M11774( ) ;
         load1M11774( ) ;
         Gx_mode = sMode1774 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1774 = (short)(0) ;
         initializeNonKey1M11774( ) ;
         sMode1774 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M11774( ) ;
         Gx_mode = sMode1774 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1M11774( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1M11774( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGABMEZ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12939GabMezVMin != T01M12_A12939GabMezVMin[0] ) || ( Z12940GabMezVMax != T01M12_A12940GabMezVMax[0] ) || ( DecimalUtil.compareTo(Z12941GabMezMtsI, T01M12_A12941GabMezMtsI[0]) != 0 ) || ( DecimalUtil.compareTo(Z12942GabMezMtsF, T01M12_A12942GabMezMtsF[0]) != 0 ) || ( Z13103GabMezCrtI != T01M12_A13103GabMezCrtI[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13104GabMezCrtF != T01M12_A13104GabMezCrtF[0] ) || ( Z13105GabMezEmpI != T01M12_A13105GabMezEmpI[0] ) || ( Z13106GabMezEmpF != T01M12_A13106GabMezEmpF[0] ) || ( Z12946GabMezCalI != T01M12_A12946GabMezCalI[0] ) )
         {
            if ( Z12939GabMezVMin != T01M12_A12939GabMezVMin[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezVMin");
               GXutil.writeLogRaw("Old: ",Z12939GabMezVMin);
               GXutil.writeLogRaw("Current: ",T01M12_A12939GabMezVMin[0]);
            }
            if ( Z12940GabMezVMax != T01M12_A12940GabMezVMax[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezVMax");
               GXutil.writeLogRaw("Old: ",Z12940GabMezVMax);
               GXutil.writeLogRaw("Current: ",T01M12_A12940GabMezVMax[0]);
            }
            if ( DecimalUtil.compareTo(Z12941GabMezMtsI, T01M12_A12941GabMezMtsI[0]) != 0 )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezMtsI");
               GXutil.writeLogRaw("Old: ",Z12941GabMezMtsI);
               GXutil.writeLogRaw("Current: ",T01M12_A12941GabMezMtsI[0]);
            }
            if ( DecimalUtil.compareTo(Z12942GabMezMtsF, T01M12_A12942GabMezMtsF[0]) != 0 )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezMtsF");
               GXutil.writeLogRaw("Old: ",Z12942GabMezMtsF);
               GXutil.writeLogRaw("Current: ",T01M12_A12942GabMezMtsF[0]);
            }
            if ( Z13103GabMezCrtI != T01M12_A13103GabMezCrtI[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezCrtI");
               GXutil.writeLogRaw("Old: ",Z13103GabMezCrtI);
               GXutil.writeLogRaw("Current: ",T01M12_A13103GabMezCrtI[0]);
            }
            if ( Z13104GabMezCrtF != T01M12_A13104GabMezCrtF[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezCrtF");
               GXutil.writeLogRaw("Old: ",Z13104GabMezCrtF);
               GXutil.writeLogRaw("Current: ",T01M12_A13104GabMezCrtF[0]);
            }
            if ( Z13105GabMezEmpI != T01M12_A13105GabMezEmpI[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezEmpI");
               GXutil.writeLogRaw("Old: ",Z13105GabMezEmpI);
               GXutil.writeLogRaw("Current: ",T01M12_A13105GabMezEmpI[0]);
            }
            if ( Z13106GabMezEmpF != T01M12_A13106GabMezEmpF[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezEmpF");
               GXutil.writeLogRaw("Old: ",Z13106GabMezEmpF);
               GXutil.writeLogRaw("Current: ",T01M12_A13106GabMezEmpF[0]);
            }
            if ( Z12946GabMezCalI != T01M12_A12946GabMezCalI[0] )
            {
               GXutil.writeLogln("tgabmezca:[seudo value changed for attri]"+"GabMezCalI");
               GXutil.writeLogRaw("Old: ",Z12946GabMezCalI);
               GXutil.writeLogRaw("Current: ",T01M12_A12946GabMezCalI[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGABMEZ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M11774( )
   {
      beforeValidate1M11774( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M11774( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M11774( 0) ;
         checkOptimisticConcurrency1M11774( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M11774( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M11774( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M126 */
                  pr_default.execute(24, new Object[] {Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID), Boolean.valueOf(n12939GabMezVMin), Short.valueOf(A12939GabMezVMin), Boolean.valueOf(n12940GabMezVMax), Short.valueOf(A12940GabMezVMax), Boolean.valueOf(n12941GabMezMtsI), A12941GabMezMtsI, Boolean.valueOf(n12942GabMezMtsF), A12942GabMezMtsF, Boolean.valueOf(n13103GabMezCrtI), Short.valueOf(A13103GabMezCrtI), Boolean.valueOf(n13104GabMezCrtF), Short.valueOf(A13104GabMezCrtF), Boolean.valueOf(n13105GabMezEmpI), Short.valueOf(A13105GabMezEmpI), Boolean.valueOf(n13106GabMezEmpF), Short.valueOf(A13106GabMezEmpF), A396EmprCod, Boolean.valueOf(n12946GabMezCalI), Byte.valueOf(A12946GabMezCalI)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGABMEZ");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1M11774( ) ;
         }
         endLevel1M11774( ) ;
      }
      closeExtendedTableCursors1M11774( ) ;
   }

   public void update1M11774( )
   {
      beforeValidate1M11774( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M11774( ) ;
      }
      if ( ( nIsMod_1774 != 0 ) || ( nIsDirty_1774 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1M11774( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1M11774( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1M11774( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01M127 */
                     pr_default.execute(25, new Object[] {Boolean.valueOf(n12939GabMezVMin), Short.valueOf(A12939GabMezVMin), Boolean.valueOf(n12940GabMezVMax), Short.valueOf(A12940GabMezVMax), Boolean.valueOf(n12941GabMezMtsI), A12941GabMezMtsI, Boolean.valueOf(n12942GabMezMtsF), A12942GabMezMtsF, Boolean.valueOf(n13103GabMezCrtI), Short.valueOf(A13103GabMezCrtI), Boolean.valueOf(n13104GabMezCrtF), Short.valueOf(A13104GabMezCrtF), Boolean.valueOf(n13105GabMezEmpI), Short.valueOf(A13105GabMezEmpI), Boolean.valueOf(n13106GabMezEmpF), Short.valueOf(A13106GabMezEmpF), Boolean.valueOf(n12946GabMezCalI), Byte.valueOf(A12946GabMezCalI), A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGABMEZ");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGABMEZ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1M11774( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1M11774( ) ;
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
            endLevel1M11774( ) ;
         }
      }
      closeExtendedTableCursors1M11774( ) ;
   }

   public void deferredUpdate1M11774( )
   {
   }

   public void delete1M11774( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M11774( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M11774( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M11774( ) ;
         afterConfirm1M11774( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M11774( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M128 */
               pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A12938GabMezID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGABMEZ");
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
      sMode1774 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M11774( ) ;
      Gx_mode = sMode1774 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M11774( )
   {
      standaloneModal1M11774( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01M129 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n12946GabMezCalI), Byte.valueOf(A12946GabMezCalI)});
         A12947GabMezCalN = T01M129_A12947GabMezCalN[0] ;
         n12947GabMezCalN = T01M129_n12947GabMezCalN[0] ;
         pr_default.close(27);
      }
   }

   public void endLevel1M11774( )
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

   public void scanStart1M11774( )
   {
      /* Scan By routine */
      /* Using cursor T01M130 */
      pr_default.execute(28, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      RcdFound1774 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1774 = (short)(1) ;
         A12938GabMezID = T01M130_A12938GabMezID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M11774( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1774 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1774 = (short)(1) ;
         A12938GabMezID = T01M130_A12938GabMezID[0] ;
      }
   }

   public void scanEnd1M11774( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1M11774( )
   {
      /* After Confirm Rules */
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A4364GrdTipArt ;
         GXv_int6[0] = A12946GabMezCalI ;
         GXv_char3[0] = Gx_msg ;
         new app.pprc137(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
         tgabmezca_impl.this.A396EmprCod = GXv_char4[0] ;
         tgabmezca_impl.this.A4364GrdTipArt = GXv_int5[0] ;
         tgabmezca_impl.this.A12946GabMezCalI = GXv_int6[0] ;
         tgabmezca_impl.this.Gx_msg = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      if ( ( GXutil.strcmp(Gx_msg, " ") != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1M11774( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M11774( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M11774( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M11774( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M11774( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M11774( )
   {
      edtGabMezID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezVMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezVMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezVMin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezVMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezVMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezVMax_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezMtsI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezMtsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezMtsI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezMtsF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezMtsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezMtsF_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezCrtI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezCrtI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCrtI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezCrtF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezCrtF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCrtF_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezEmpI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezEmpI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezEmpI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezEmpF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezEmpF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezEmpF_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezCalI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezCalI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCalI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGabMezCalN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezCalN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezCalN_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1M11774( )
   {
   }

   public void send_integrity_lvl_hashes1M1660( )
   {
   }

   public void subsflControlProps_451774( )
   {
      edtavnRcdDeleted_1774_Internalname = "vNRCDDELETED_1774_"+sGXsfl_45_idx ;
      edtGabMezID_Internalname = "GABMEZID_"+sGXsfl_45_idx ;
      edtGabMezVMin_Internalname = "GABMEZVMIN_"+sGXsfl_45_idx ;
      edtGabMezVMax_Internalname = "GABMEZVMAX_"+sGXsfl_45_idx ;
      edtGabMezMtsI_Internalname = "GABMEZMTSI_"+sGXsfl_45_idx ;
      edtGabMezMtsF_Internalname = "GABMEZMTSF_"+sGXsfl_45_idx ;
      edtGabMezCrtI_Internalname = "GABMEZCRTI_"+sGXsfl_45_idx ;
      edtGabMezCrtF_Internalname = "GABMEZCRTF_"+sGXsfl_45_idx ;
      edtGabMezEmpI_Internalname = "GABMEZEMPI_"+sGXsfl_45_idx ;
      edtGabMezEmpF_Internalname = "GABMEZEMPF_"+sGXsfl_45_idx ;
      edtGabMezCalI_Internalname = "GABMEZCALI_"+sGXsfl_45_idx ;
      edtGabMezCalN_Internalname = "GABMEZCALN_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451774( )
   {
      edtavnRcdDeleted_1774_Internalname = "vNRCDDELETED_1774_"+sGXsfl_45_fel_idx ;
      edtGabMezID_Internalname = "GABMEZID_"+sGXsfl_45_fel_idx ;
      edtGabMezVMin_Internalname = "GABMEZVMIN_"+sGXsfl_45_fel_idx ;
      edtGabMezVMax_Internalname = "GABMEZVMAX_"+sGXsfl_45_fel_idx ;
      edtGabMezMtsI_Internalname = "GABMEZMTSI_"+sGXsfl_45_fel_idx ;
      edtGabMezMtsF_Internalname = "GABMEZMTSF_"+sGXsfl_45_fel_idx ;
      edtGabMezCrtI_Internalname = "GABMEZCRTI_"+sGXsfl_45_fel_idx ;
      edtGabMezCrtF_Internalname = "GABMEZCRTF_"+sGXsfl_45_fel_idx ;
      edtGabMezEmpI_Internalname = "GABMEZEMPI_"+sGXsfl_45_fel_idx ;
      edtGabMezEmpF_Internalname = "GABMEZEMPF_"+sGXsfl_45_fel_idx ;
      edtGabMezCalI_Internalname = "GABMEZCALI_"+sGXsfl_45_fel_idx ;
      edtGabMezCalN_Internalname = "GABMEZCALN_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1M11774( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451774( ) ;
      sendRow1M11774( ) ;
   }

   public void sendRow1M11774( )
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
         if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1774_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1774_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1774), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1774), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1774_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1774_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezID_Internalname,GXutil.ltrim( localUtil.ntoc( A12938GabMezID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12938GabMezID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezID_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezVMin_Internalname,GXutil.ltrim( localUtil.ntoc( A12939GabMezVMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezVMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12939GabMezVMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12939GabMezVMin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezVMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezVMin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezVMax_Internalname,GXutil.ltrim( localUtil.ntoc( A12940GabMezVMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezVMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12940GabMezVMax), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12940GabMezVMax), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezVMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezVMax_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezMtsI_Internalname,GXutil.ltrim( localUtil.ntoc( A12941GabMezMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezMtsI_Enabled!=0) ? localUtil.format( A12941GabMezMtsI, "ZZZZZ9.99") : localUtil.format( A12941GabMezMtsI, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezMtsI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezMtsI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezMtsF_Internalname,GXutil.ltrim( localUtil.ntoc( A12942GabMezMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezMtsF_Enabled!=0) ? localUtil.format( A12942GabMezMtsF, "ZZZZZ9.99") : localUtil.format( A12942GabMezMtsF, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezMtsF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezMtsF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezCrtI_Internalname,GXutil.ltrim( localUtil.ntoc( A13103GabMezCrtI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezCrtI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13103GabMezCrtI), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13103GabMezCrtI), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezCrtI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezCrtI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezCrtF_Internalname,GXutil.ltrim( localUtil.ntoc( A13104GabMezCrtF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezCrtF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13104GabMezCrtF), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13104GabMezCrtF), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezCrtF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezCrtF_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezEmpI_Internalname,GXutil.ltrim( localUtil.ntoc( A13105GabMezEmpI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezEmpI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13105GabMezEmpI), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13105GabMezEmpI), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezEmpI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezEmpI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezEmpF_Internalname,GXutil.ltrim( localUtil.ntoc( A13106GabMezEmpF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezEmpF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13106GabMezEmpF), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13106GabMezEmpF), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezEmpF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezEmpF_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1774_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezCalI_Internalname,GXutil.ltrim( localUtil.ntoc( A12946GabMezCalI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGabMezCalI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12946GabMezCalI), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12946GabMezCalI), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezCalI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezCalI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGabMezCalN_Internalname,GXutil.rtrim( A12947GabMezCalN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGabMezCalN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGabMezCalN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1M11774( ) ;
      GXCCtl = "Z12938GabMezID_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12938GabMezID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12939GabMezVMin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12939GabMezVMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12940GabMezVMax_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12940GabMezVMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12941GabMezMtsI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12941GabMezMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12942GabMezMtsF_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12942GabMezMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13103GabMezCrtI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13103GabMezCrtI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13104GabMezCrtF_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13104GabMezCrtF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13105GabMezEmpI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13105GabMezEmpI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13106GabMezEmpF_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13106GabMezEmpF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12946GabMezCalI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12946GabMezCalI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1774_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1774_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1774_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1774, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1774_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1774_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZID_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZVMIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZVMAX_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZMTSI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZMTSF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZCRTI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZCRTF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZEMPI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZEMPF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZCALI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GABMEZCALN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalN_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1M11774( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451774( ) ;
      edtavnRcdDeleted_1774_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1774_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZID_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezVMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZVMIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezVMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZVMAX_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezMtsI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZMTSI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezMtsF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZMTSF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezCrtI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCRTI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezCrtF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCRTF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezEmpI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZEMPI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezEmpF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZEMPF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezCalI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCALI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGabMezCalN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GABMEZCALN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1774_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1774_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1774");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1774_Internalname ;
         wbErr = true ;
         nRcdDeleted_1774 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1774 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1774_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZID_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezID_Internalname ;
         wbErr = true ;
         A12938GabMezID = (short)(0) ;
      }
      else
      {
         A12938GabMezID = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezVMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezVMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZVMIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezVMin_Internalname ;
         wbErr = true ;
         A12939GabMezVMin = (short)(0) ;
         n12939GabMezVMin = false ;
      }
      else
      {
         A12939GabMezVMin = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezVMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12939GabMezVMin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezVMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezVMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZVMAX_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezVMax_Internalname ;
         wbErr = true ;
         A12940GabMezVMax = (short)(0) ;
         n12940GabMezVMax = false ;
      }
      else
      {
         A12940GabMezVMax = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezVMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12940GabMezVMax = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGabMezMtsI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGabMezMtsI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "GABMEZMTSI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezMtsI_Internalname ;
         wbErr = true ;
         A12941GabMezMtsI = DecimalUtil.ZERO ;
         n12941GabMezMtsI = false ;
      }
      else
      {
         A12941GabMezMtsI = localUtil.ctond( httpContext.cgiGet( edtGabMezMtsI_Internalname)) ;
         n12941GabMezMtsI = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGabMezMtsF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGabMezMtsF_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "GABMEZMTSF_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezMtsF_Internalname ;
         wbErr = true ;
         A12942GabMezMtsF = DecimalUtil.ZERO ;
         n12942GabMezMtsF = false ;
      }
      else
      {
         A12942GabMezMtsF = localUtil.ctond( httpContext.cgiGet( edtGabMezMtsF_Internalname)) ;
         n12942GabMezMtsF = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezCrtI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezCrtI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZCRTI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezCrtI_Internalname ;
         wbErr = true ;
         A13103GabMezCrtI = (short)(0) ;
         n13103GabMezCrtI = false ;
      }
      else
      {
         A13103GabMezCrtI = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezCrtI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13103GabMezCrtI = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezCrtF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezCrtF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZCRTF_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezCrtF_Internalname ;
         wbErr = true ;
         A13104GabMezCrtF = (short)(0) ;
         n13104GabMezCrtF = false ;
      }
      else
      {
         A13104GabMezCrtF = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezCrtF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13104GabMezCrtF = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezEmpI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezEmpI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZEMPI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezEmpI_Internalname ;
         wbErr = true ;
         A13105GabMezEmpI = (short)(0) ;
         n13105GabMezEmpI = false ;
      }
      else
      {
         A13105GabMezEmpI = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezEmpI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13105GabMezEmpI = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezEmpF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezEmpF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GABMEZEMPF_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezEmpF_Internalname ;
         wbErr = true ;
         A13106GabMezEmpF = (short)(0) ;
         n13106GabMezEmpF = false ;
      }
      else
      {
         A13106GabMezEmpF = (short)(localUtil.ctol( httpContext.cgiGet( edtGabMezEmpF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13106GabMezEmpF = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezCalI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGabMezCalI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "GABMEZCALI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezCalI_Internalname ;
         wbErr = true ;
         A12946GabMezCalI = (byte)(0) ;
         n12946GabMezCalI = false ;
      }
      else
      {
         A12946GabMezCalI = (byte)(localUtil.ctol( httpContext.cgiGet( edtGabMezCalI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12946GabMezCalI = false ;
      }
      A12947GabMezCalN = httpContext.cgiGet( edtGabMezCalN_Internalname) ;
      n12947GabMezCalN = false ;
      GXCCtl = "Z12938GabMezID_" + sGXsfl_45_idx ;
      Z12938GabMezID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12939GabMezVMin_" + sGXsfl_45_idx ;
      Z12939GabMezVMin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12940GabMezVMax_" + sGXsfl_45_idx ;
      Z12940GabMezVMax = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12941GabMezMtsI_" + sGXsfl_45_idx ;
      Z12941GabMezMtsI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12942GabMezMtsF_" + sGXsfl_45_idx ;
      Z12942GabMezMtsF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13103GabMezCrtI_" + sGXsfl_45_idx ;
      Z13103GabMezCrtI = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13104GabMezCrtF_" + sGXsfl_45_idx ;
      Z13104GabMezCrtF = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13105GabMezEmpI_" + sGXsfl_45_idx ;
      Z13105GabMezEmpI = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13106GabMezEmpF_" + sGXsfl_45_idx ;
      Z13106GabMezEmpF = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12946GabMezCalI_" + sGXsfl_45_idx ;
      Z12946GabMezCalI = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1774_" + sGXsfl_45_idx ;
      nRcdDeleted_1774 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1774_" + sGXsfl_45_idx ;
      nRcdExists_1774 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1774_" + sGXsfl_45_idx ;
      nIsMod_1774 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtGabMezID_Enabled = edtGabMezID_Enabled ;
   }

   public void confirmValues1M10( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451774( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451774( ) ;
         httpContext.changePostValue( "Z12938GabMezID_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12938GabMezID_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12938GabMezID_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z12939GabMezVMin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12939GabMezVMin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12939GabMezVMin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z12940GabMezVMax_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12940GabMezVMax_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12940GabMezVMax_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z12941GabMezMtsI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12941GabMezMtsI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12941GabMezMtsI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z12942GabMezMtsF_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12942GabMezMtsF_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12942GabMezMtsF_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13103GabMezCrtI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13103GabMezCrtI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13103GabMezCrtI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13104GabMezCrtF_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13104GabMezCrtF_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13104GabMezCrtF_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13105GabMezEmpI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13105GabMezEmpI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13105GabMezEmpI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13106GabMezEmpF_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13106GabMezEmpF_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13106GabMezEmpF_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z12946GabMezCalI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z12946GabMezCalI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12946GabMezCalI_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tgabmezca", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4368GrdTipDsc", GXutil.rtrim( Z4368GrdTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12937GabMezUlt", GXutil.ltrim( localUtil.ntoc( Z12937GabMezUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12937GabMezUlt", GXutil.ltrim( localUtil.ntoc( O12937GabMezUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
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
      return formatLink("app.tgabmezca", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TGABMEZCA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Gabardina o Mezclilla Calidades", "") ;
   }

   public void initializeNonKey1M1660( )
   {
      A4368GrdTipDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      A12937GabMezUlt = (short)(0) ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      O12937GabMezUlt = A12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
      Z4368GrdTipDsc = "" ;
      Z12937GabMezUlt = (short)(0) ;
   }

   public void initAll1M1660( )
   {
      A4364GrdTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      initializeNonKey1M1660( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1M11774( )
   {
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A12939GabMezVMin = (short)(0) ;
      n12939GabMezVMin = false ;
      A12940GabMezVMax = (short)(0) ;
      n12940GabMezVMax = false ;
      A12941GabMezMtsI = DecimalUtil.ZERO ;
      n12941GabMezMtsI = false ;
      A12942GabMezMtsF = DecimalUtil.ZERO ;
      n12942GabMezMtsF = false ;
      A13103GabMezCrtI = (short)(0) ;
      n13103GabMezCrtI = false ;
      A13104GabMezCrtF = (short)(0) ;
      n13104GabMezCrtF = false ;
      A13105GabMezEmpI = (short)(0) ;
      n13105GabMezEmpI = false ;
      A13106GabMezEmpF = (short)(0) ;
      n13106GabMezEmpF = false ;
      A12946GabMezCalI = (byte)(0) ;
      n12946GabMezCalI = false ;
      A12947GabMezCalN = "" ;
      n12947GabMezCalN = false ;
      Z12939GabMezVMin = (short)(0) ;
      Z12940GabMezVMax = (short)(0) ;
      Z12941GabMezMtsI = DecimalUtil.ZERO ;
      Z12942GabMezMtsF = DecimalUtil.ZERO ;
      Z13103GabMezCrtI = (short)(0) ;
      Z13104GabMezCrtF = (short)(0) ;
      Z13105GabMezEmpI = (short)(0) ;
      Z13106GabMezEmpF = (short)(0) ;
      Z12946GabMezCalI = (byte)(0) ;
   }

   public void initAll1M11774( )
   {
      A12938GabMezID = (short)(0) ;
      initializeNonKey1M11774( ) ;
   }

   public void standaloneModalInsert1M11774( )
   {
      A12937GabMezUlt = i12937GabMezUlt ;
      n12937GabMezUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12937GabMezUlt), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241593880", true, true);
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
      httpContext.AddJavascriptSource("tgabmezca.js", "?20268241593881", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1774( )
   {
      edtGabMezID_Enabled = defedtGabMezID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGabMezID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGabMezID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1774, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1774_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12938GabMezID, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12939GabMezVMin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12940GabMezVMax, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezVMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12941GabMezMtsI, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12942GabMezMtsF, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezMtsF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13103GabMezCrtI, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13104GabMezCrtF, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCrtF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13105GabMezEmpI, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13106GabMezEmpF, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezEmpF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12946GabMezCalI, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12947GabMezCalN));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGabMezCalN_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtGrdTipArt_Internalname = "GRDTIPART" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtGrdTipDsc_Internalname = "GRDTIPDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtGabMezUlt_Internalname = "GABMEZULT" ;
      edtavnRcdDeleted_1774_Internalname = "vNRCDDELETED_1774" ;
      edtGabMezID_Internalname = "GABMEZID" ;
      edtGabMezVMin_Internalname = "GABMEZVMIN" ;
      edtGabMezVMax_Internalname = "GABMEZVMAX" ;
      edtGabMezMtsI_Internalname = "GABMEZMTSI" ;
      edtGabMezMtsF_Internalname = "GABMEZMTSF" ;
      edtGabMezCrtI_Internalname = "GABMEZCRTI" ;
      edtGabMezCrtF_Internalname = "GABMEZCRTF" ;
      edtGabMezEmpI_Internalname = "GABMEZEMPI" ;
      edtGabMezEmpF_Internalname = "GABMEZEMPF" ;
      edtGabMezCalI_Internalname = "GABMEZCALI" ;
      edtGabMezCalN_Internalname = "GABMEZCALN" ;
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
      Form.setCaption( httpContext.getMessage( "Gabardina o Mezclilla Calidades", "") );
      edtGabMezCalN_Jsonclick = "" ;
      edtGabMezCalI_Jsonclick = "" ;
      edtGabMezEmpF_Jsonclick = "" ;
      edtGabMezEmpI_Jsonclick = "" ;
      edtGabMezCrtF_Jsonclick = "" ;
      edtGabMezCrtI_Jsonclick = "" ;
      edtGabMezMtsF_Jsonclick = "" ;
      edtGabMezMtsI_Jsonclick = "" ;
      edtGabMezVMax_Jsonclick = "" ;
      edtGabMezVMin_Jsonclick = "" ;
      edtGabMezID_Jsonclick = "" ;
      edtavnRcdDeleted_1774_Jsonclick = "" ;
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
      edtGabMezCalN_Enabled = 0 ;
      edtGabMezCalI_Enabled = 1 ;
      edtGabMezEmpF_Enabled = 1 ;
      edtGabMezEmpI_Enabled = 1 ;
      edtGabMezCrtF_Enabled = 1 ;
      edtGabMezCrtI_Enabled = 1 ;
      edtGabMezMtsF_Enabled = 1 ;
      edtGabMezMtsI_Enabled = 1 ;
      edtGabMezVMax_Enabled = 1 ;
      edtGabMezVMin_Enabled = 1 ;
      edtGabMezID_Enabled = 1 ;
      edtavnRcdDeleted_1774_Enabled = 1 ;
      edtGabMezUlt_Jsonclick = "" ;
      edtGabMezUlt_Backcolor = (int)(0xFFFFFF) ;
      edtGabMezUlt_Enabled = 0 ;
      edtGrdTipDsc_Jsonclick = "" ;
      edtGrdTipDsc_Backcolor = (int)(0xFFFFFF) ;
      edtGrdTipDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtGrdTipArt_Jsonclick = "" ;
      edtGrdTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtGrdTipArt_Enabled = 1 ;
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

   public void xc_6_1M11774( String A396EmprCod ,
                             short A4364GrdTipArt ,
                             byte A12946GabMezCalI ,
                             String Gx_msg )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A4364GrdTipArt ;
         GXv_int6[0] = A12946GabMezCalI ;
         GXv_char3[0] = Gx_msg ;
         new app.pprc137(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A4364GrdTipArt = GXv_int5[0] ;
         A12946GabMezCalI = GXv_int6[0] ;
         Gx_msg = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12946GabMezCalI, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
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
      subsflControlProps_451774( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1M11774( ) ;
         standaloneModal1M11774( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1M11774( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451774( ) ;
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
      /* Using cursor T01M131 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01M131_A407EmprNom[0] ;
      n407EmprNom = T01M131_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(29);
      GX_FocusControl = edtGrdTipDsc_Internalname ;
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

   public void valid_Grdtipart( )
   {
      n12937GabMezUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", GXutil.rtrim( A4368GrdTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12937GabMezUlt", GXutil.ltrim( localUtil.ntoc( A12937GabMezUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4368GrdTipDsc", GXutil.rtrim( Z4368GrdTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12937GabMezUlt", GXutil.ltrim( localUtil.ntoc( Z12937GabMezUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O12937GabMezUlt", GXutil.ltrim( localUtil.ntoc( O12937GabMezUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Gabmezcali( )
   {
      n12946GabMezCalI = false ;
      n12947GabMezCalN = false ;
      /* Using cursor T01M129 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n12946GabMezCalI), Byte.valueOf(A12946GabMezCalI)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidades", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GABMEZCALI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGabMezCalI_Internalname ;
      }
      A12947GabMezCalN = T01M129_A12947GabMezCalN[0] ;
      n12947GabMezCalN = T01M129_n12947GabMezCalN[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12947GabMezCalN", GXutil.rtrim( A12947GabMezCalN));
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
      setEventMetadata("VALID_GRDTIPART","{handler:'valid_Grdtipart',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12937GabMezUlt',fld:'GABMEZULT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_GRDTIPART",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''},{av:'A12937GabMezUlt',fld:'GABMEZULT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4364GrdTipArt'},{av:'Z407EmprNom'},{av:'Z4368GrdTipDsc'},{av:'Z12937GabMezUlt'},{av:'O12937GabMezUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_GABMEZULT","{handler:'valid_Gabmezult',iparms:[]");
      setEventMetadata("VALID_GABMEZULT",",oparms:[]}");
      setEventMetadata("VALID_GABMEZID","{handler:'valid_Gabmezid',iparms:[]");
      setEventMetadata("VALID_GABMEZID",",oparms:[]}");
      setEventMetadata("VALID_GABMEZCALI","{handler:'valid_Gabmezcali',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12946GabMezCalI',fld:'GABMEZCALI',pic:'Z9'},{av:'A12947GabMezCalN',fld:'GABMEZCALN',pic:''}]");
      setEventMetadata("VALID_GABMEZCALI",",oparms:[{av:'A12947GabMezCalN',fld:'GABMEZCALN',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Gabmezcaln',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4368GrdTipDsc = "" ;
      Z12941GabMezMtsI = DecimalUtil.ZERO ;
      Z12942GabMezMtsF = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_msg = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      A4368GrdTipDsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1774 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode660 = "" ;
      GXCCtl = "" ;
      A12941GabMezMtsI = DecimalUtil.ZERO ;
      A12942GabMezMtsF = DecimalUtil.ZERO ;
      A12947GabMezCalN = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T01M17_A407EmprNom = new String[] {""} ;
      T01M17_n407EmprNom = new boolean[] {false} ;
      T01M18_A4364GrdTipArt = new short[1] ;
      T01M18_A407EmprNom = new String[] {""} ;
      T01M18_n407EmprNom = new boolean[] {false} ;
      T01M18_A4368GrdTipDsc = new String[] {""} ;
      T01M18_A12937GabMezUlt = new short[1] ;
      T01M18_n12937GabMezUlt = new boolean[] {false} ;
      T01M18_A396EmprCod = new String[] {""} ;
      T01M19_A396EmprCod = new String[] {""} ;
      T01M19_A4364GrdTipArt = new short[1] ;
      T01M16_A4364GrdTipArt = new short[1] ;
      T01M16_A4368GrdTipDsc = new String[] {""} ;
      T01M16_A12937GabMezUlt = new short[1] ;
      T01M16_n12937GabMezUlt = new boolean[] {false} ;
      T01M16_A396EmprCod = new String[] {""} ;
      T01M110_A396EmprCod = new String[] {""} ;
      T01M110_A4364GrdTipArt = new short[1] ;
      T01M111_A396EmprCod = new String[] {""} ;
      T01M111_A4364GrdTipArt = new short[1] ;
      T01M15_A4364GrdTipArt = new short[1] ;
      T01M15_A4368GrdTipDsc = new String[] {""} ;
      T01M15_A12937GabMezUlt = new short[1] ;
      T01M15_n12937GabMezUlt = new boolean[] {false} ;
      T01M15_A396EmprCod = new String[] {""} ;
      T01M115_A396EmprCod = new String[] {""} ;
      T01M115_A4364GrdTipArt = new short[1] ;
      T01M115_A12944FamCalID = new byte[1] ;
      T01M116_A396EmprCod = new String[] {""} ;
      T01M116_A252CliCod = new int[1] ;
      T01M116_A4364GrdTipArt = new short[1] ;
      T01M116_A4365NomColor = new String[] {""} ;
      T01M116_A4366NumColor = new int[1] ;
      T01M116_A4367TipColor = new byte[1] ;
      T01M116_A5740TipProd = new String[] {""} ;
      T01M117_A396EmprCod = new String[] {""} ;
      T01M117_A4364GrdTipArt = new short[1] ;
      T01M117_A5657Tifi_l = new short[1] ;
      T01M118_A396EmprCod = new String[] {""} ;
      T01M118_A5654Mgen_com = new String[] {""} ;
      T01M118_A4364GrdTipArt = new short[1] ;
      T01M119_A396EmprCod = new String[] {""} ;
      T01M119_A4364GrdTipArt = new short[1] ;
      T01M119_A829TipArtCod = new short[1] ;
      T01M120_A396EmprCod = new String[] {""} ;
      T01M120_A4364GrdTipArt = new short[1] ;
      T01M120_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M122_A396EmprCod = new String[] {""} ;
      T01M122_A4364GrdTipArt = new short[1] ;
      Z12947GabMezCalN = "" ;
      T01M123_A4364GrdTipArt = new short[1] ;
      T01M123_A12938GabMezID = new short[1] ;
      T01M123_A12939GabMezVMin = new short[1] ;
      T01M123_n12939GabMezVMin = new boolean[] {false} ;
      T01M123_A12940GabMezVMax = new short[1] ;
      T01M123_n12940GabMezVMax = new boolean[] {false} ;
      T01M123_A12941GabMezMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M123_n12941GabMezMtsI = new boolean[] {false} ;
      T01M123_A12942GabMezMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M123_n12942GabMezMtsF = new boolean[] {false} ;
      T01M123_A13103GabMezCrtI = new short[1] ;
      T01M123_n13103GabMezCrtI = new boolean[] {false} ;
      T01M123_A13104GabMezCrtF = new short[1] ;
      T01M123_n13104GabMezCrtF = new boolean[] {false} ;
      T01M123_A13105GabMezEmpI = new short[1] ;
      T01M123_n13105GabMezEmpI = new boolean[] {false} ;
      T01M123_A13106GabMezEmpF = new short[1] ;
      T01M123_n13106GabMezEmpF = new boolean[] {false} ;
      T01M123_A12947GabMezCalN = new String[] {""} ;
      T01M123_n12947GabMezCalN = new boolean[] {false} ;
      T01M123_A396EmprCod = new String[] {""} ;
      T01M123_A12946GabMezCalI = new byte[1] ;
      T01M123_n12946GabMezCalI = new boolean[] {false} ;
      T01M14_A12947GabMezCalN = new String[] {""} ;
      T01M14_n12947GabMezCalN = new boolean[] {false} ;
      T01M124_A12947GabMezCalN = new String[] {""} ;
      T01M124_n12947GabMezCalN = new boolean[] {false} ;
      T01M125_A396EmprCod = new String[] {""} ;
      T01M125_A4364GrdTipArt = new short[1] ;
      T01M125_A12938GabMezID = new short[1] ;
      T01M13_A4364GrdTipArt = new short[1] ;
      T01M13_A12938GabMezID = new short[1] ;
      T01M13_A12939GabMezVMin = new short[1] ;
      T01M13_n12939GabMezVMin = new boolean[] {false} ;
      T01M13_A12940GabMezVMax = new short[1] ;
      T01M13_n12940GabMezVMax = new boolean[] {false} ;
      T01M13_A12941GabMezMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M13_n12941GabMezMtsI = new boolean[] {false} ;
      T01M13_A12942GabMezMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M13_n12942GabMezMtsF = new boolean[] {false} ;
      T01M13_A13103GabMezCrtI = new short[1] ;
      T01M13_n13103GabMezCrtI = new boolean[] {false} ;
      T01M13_A13104GabMezCrtF = new short[1] ;
      T01M13_n13104GabMezCrtF = new boolean[] {false} ;
      T01M13_A13105GabMezEmpI = new short[1] ;
      T01M13_n13105GabMezEmpI = new boolean[] {false} ;
      T01M13_A13106GabMezEmpF = new short[1] ;
      T01M13_n13106GabMezEmpF = new boolean[] {false} ;
      T01M13_A396EmprCod = new String[] {""} ;
      T01M13_A12946GabMezCalI = new byte[1] ;
      T01M13_n12946GabMezCalI = new boolean[] {false} ;
      T01M12_A4364GrdTipArt = new short[1] ;
      T01M12_A12938GabMezID = new short[1] ;
      T01M12_A12939GabMezVMin = new short[1] ;
      T01M12_n12939GabMezVMin = new boolean[] {false} ;
      T01M12_A12940GabMezVMax = new short[1] ;
      T01M12_n12940GabMezVMax = new boolean[] {false} ;
      T01M12_A12941GabMezMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M12_n12941GabMezMtsI = new boolean[] {false} ;
      T01M12_A12942GabMezMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M12_n12942GabMezMtsF = new boolean[] {false} ;
      T01M12_A13103GabMezCrtI = new short[1] ;
      T01M12_n13103GabMezCrtI = new boolean[] {false} ;
      T01M12_A13104GabMezCrtF = new short[1] ;
      T01M12_n13104GabMezCrtF = new boolean[] {false} ;
      T01M12_A13105GabMezEmpI = new short[1] ;
      T01M12_n13105GabMezEmpI = new boolean[] {false} ;
      T01M12_A13106GabMezEmpF = new short[1] ;
      T01M12_n13106GabMezEmpF = new boolean[] {false} ;
      T01M12_A396EmprCod = new String[] {""} ;
      T01M12_A12946GabMezCalI = new byte[1] ;
      T01M12_n12946GabMezCalI = new boolean[] {false} ;
      T01M129_A12947GabMezCalN = new String[] {""} ;
      T01M129_n12947GabMezCalN = new boolean[] {false} ;
      T01M130_A396EmprCod = new String[] {""} ;
      T01M130_A4364GrdTipArt = new short[1] ;
      T01M130_A12938GabMezID = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      T01M131_A407EmprNom = new String[] {""} ;
      T01M131_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4368GrdTipDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tgabmezca__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tgabmezca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tgabmezca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tgabmezca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tgabmezca__default(),
         new Object[] {
             new Object[] {
            T01M12_A4364GrdTipArt, T01M12_A12938GabMezID, T01M12_A12939GabMezVMin, T01M12_n12939GabMezVMin, T01M12_A12940GabMezVMax, T01M12_n12940GabMezVMax, T01M12_A12941GabMezMtsI, T01M12_n12941GabMezMtsI, T01M12_A12942GabMezMtsF, T01M12_n12942GabMezMtsF,
            T01M12_A13103GabMezCrtI, T01M12_n13103GabMezCrtI, T01M12_A13104GabMezCrtF, T01M12_n13104GabMezCrtF, T01M12_A13105GabMezEmpI, T01M12_n13105GabMezEmpI, T01M12_A13106GabMezEmpF, T01M12_n13106GabMezEmpF, T01M12_A396EmprCod, T01M12_A12946GabMezCalI,
            T01M12_n12946GabMezCalI
            }
            , new Object[] {
            T01M13_A4364GrdTipArt, T01M13_A12938GabMezID, T01M13_A12939GabMezVMin, T01M13_n12939GabMezVMin, T01M13_A12940GabMezVMax, T01M13_n12940GabMezVMax, T01M13_A12941GabMezMtsI, T01M13_n12941GabMezMtsI, T01M13_A12942GabMezMtsF, T01M13_n12942GabMezMtsF,
            T01M13_A13103GabMezCrtI, T01M13_n13103GabMezCrtI, T01M13_A13104GabMezCrtF, T01M13_n13104GabMezCrtF, T01M13_A13105GabMezEmpI, T01M13_n13105GabMezEmpI, T01M13_A13106GabMezEmpF, T01M13_n13106GabMezEmpF, T01M13_A396EmprCod, T01M13_A12946GabMezCalI,
            T01M13_n12946GabMezCalI
            }
            , new Object[] {
            T01M14_A12947GabMezCalN, T01M14_n12947GabMezCalN
            }
            , new Object[] {
            T01M15_A4364GrdTipArt, T01M15_A4368GrdTipDsc, T01M15_A12937GabMezUlt, T01M15_n12937GabMezUlt, T01M15_A396EmprCod
            }
            , new Object[] {
            T01M16_A4364GrdTipArt, T01M16_A4368GrdTipDsc, T01M16_A12937GabMezUlt, T01M16_n12937GabMezUlt, T01M16_A396EmprCod
            }
            , new Object[] {
            T01M17_A407EmprNom, T01M17_n407EmprNom
            }
            , new Object[] {
            T01M18_A4364GrdTipArt, T01M18_A407EmprNom, T01M18_n407EmprNom, T01M18_A4368GrdTipDsc, T01M18_A12937GabMezUlt, T01M18_n12937GabMezUlt, T01M18_A396EmprCod
            }
            , new Object[] {
            T01M19_A396EmprCod, T01M19_A4364GrdTipArt
            }
            , new Object[] {
            T01M110_A396EmprCod, T01M110_A4364GrdTipArt
            }
            , new Object[] {
            T01M111_A396EmprCod, T01M111_A4364GrdTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M115_A396EmprCod, T01M115_A4364GrdTipArt, T01M115_A12944FamCalID
            }
            , new Object[] {
            T01M116_A396EmprCod, T01M116_A252CliCod, T01M116_A4364GrdTipArt, T01M116_A4365NomColor, T01M116_A4366NumColor, T01M116_A4367TipColor, T01M116_A5740TipProd
            }
            , new Object[] {
            T01M117_A396EmprCod, T01M117_A4364GrdTipArt, T01M117_A5657Tifi_l
            }
            , new Object[] {
            T01M118_A396EmprCod, T01M118_A5654Mgen_com, T01M118_A4364GrdTipArt
            }
            , new Object[] {
            T01M119_A396EmprCod, T01M119_A4364GrdTipArt, T01M119_A829TipArtCod
            }
            , new Object[] {
            T01M120_A396EmprCod, T01M120_A4364GrdTipArt, T01M120_A4376GrdTipVal
            }
            , new Object[] {
            }
            , new Object[] {
            T01M122_A396EmprCod, T01M122_A4364GrdTipArt
            }
            , new Object[] {
            T01M123_A4364GrdTipArt, T01M123_A12938GabMezID, T01M123_A12939GabMezVMin, T01M123_n12939GabMezVMin, T01M123_A12940GabMezVMax, T01M123_n12940GabMezVMax, T01M123_A12941GabMezMtsI, T01M123_n12941GabMezMtsI, T01M123_A12942GabMezMtsF, T01M123_n12942GabMezMtsF,
            T01M123_A13103GabMezCrtI, T01M123_n13103GabMezCrtI, T01M123_A13104GabMezCrtF, T01M123_n13104GabMezCrtF, T01M123_A13105GabMezEmpI, T01M123_n13105GabMezEmpI, T01M123_A13106GabMezEmpF, T01M123_n13106GabMezEmpF, T01M123_A12947GabMezCalN, T01M123_n12947GabMezCalN,
            T01M123_A396EmprCod, T01M123_A12946GabMezCalI, T01M123_n12946GabMezCalI
            }
            , new Object[] {
            T01M124_A12947GabMezCalN, T01M124_n12947GabMezCalN
            }
            , new Object[] {
            T01M125_A396EmprCod, T01M125_A4364GrdTipArt, T01M125_A12938GabMezID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M129_A12947GabMezCalN, T01M129_n12947GabMezCalN
            }
            , new Object[] {
            T01M130_A396EmprCod, T01M130_A4364GrdTipArt, T01M130_A12938GabMezID
            }
            , new Object[] {
            T01M131_A407EmprNom, T01M131_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TGABMEZCA" ;
   }

   private byte Z12946GabMezCalI ;
   private byte GxWebError ;
   private byte A12946GabMezCalI ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int6[] ;
   private short Z4364GrdTipArt ;
   private short Z12937GabMezUlt ;
   private short O12937GabMezUlt ;
   private short Z12938GabMezID ;
   private short Z12939GabMezVMin ;
   private short Z12940GabMezVMax ;
   private short Z13103GabMezCrtI ;
   private short Z13104GabMezCrtF ;
   private short Z13105GabMezEmpI ;
   private short Z13106GabMezEmpF ;
   private short nRcdDeleted_1774 ;
   private short nRcdExists_1774 ;
   private short nIsMod_1774 ;
   private short A4364GrdTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12937GabMezUlt ;
   private short nBlankRcdCount1774 ;
   private short RcdFound1774 ;
   private short B12937GabMezUlt ;
   private short nBlankRcdUsr1774 ;
   private short s12937GabMezUlt ;
   private short A12938GabMezID ;
   private short A12939GabMezVMin ;
   private short A12940GabMezVMax ;
   private short A13103GabMezCrtI ;
   private short A13104GabMezCrtF ;
   private short A13105GabMezEmpI ;
   private short A13106GabMezEmpF ;
   private short RcdFound660 ;
   private short nIsDirty_660 ;
   private short nIsDirty_1774 ;
   private short i12937GabMezUlt ;
   private short GXv_int5[] ;
   private short ZZ4364GrdTipArt ;
   private short ZZ12937GabMezUlt ;
   private short ZO12937GabMezUlt ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtGrdTipArt_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtGrdTipDsc_Enabled ;
   private int edtGabMezUlt_Enabled ;
   private int edtavnRcdDeleted_1774_Enabled ;
   private int edtGabMezID_Enabled ;
   private int edtGabMezVMin_Enabled ;
   private int edtGabMezVMax_Enabled ;
   private int edtGabMezMtsI_Enabled ;
   private int edtGabMezMtsF_Enabled ;
   private int edtGabMezCrtI_Enabled ;
   private int edtGabMezCrtF_Enabled ;
   private int edtGabMezEmpI_Enabled ;
   private int edtGabMezEmpF_Enabled ;
   private int edtGabMezCalI_Enabled ;
   private int edtGabMezCalN_Enabled ;
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
   private int defedtGabMezID_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtGabMezUlt_Backcolor ;
   private int edtGrdTipDsc_Backcolor ;
   private int edtGrdTipArt_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12941GabMezMtsI ;
   private java.math.BigDecimal Z12942GabMezMtsF ;
   private java.math.BigDecimal A12941GabMezMtsI ;
   private java.math.BigDecimal A12942GabMezMtsF ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4368GrdTipDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtGrdTipArt_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtGrdTipArt_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtGrdTipDsc_Internalname ;
   private String A4368GrdTipDsc ;
   private String edtGrdTipDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtGabMezUlt_Internalname ;
   private String edtGabMezUlt_Jsonclick ;
   private String sMode1774 ;
   private String edtavnRcdDeleted_1774_Internalname ;
   private String edtGabMezID_Internalname ;
   private String edtGabMezVMin_Internalname ;
   private String edtGabMezVMax_Internalname ;
   private String edtGabMezMtsI_Internalname ;
   private String edtGabMezMtsF_Internalname ;
   private String edtGabMezCrtI_Internalname ;
   private String edtGabMezCrtF_Internalname ;
   private String edtGabMezEmpI_Internalname ;
   private String edtGabMezEmpF_Internalname ;
   private String edtGabMezCalI_Internalname ;
   private String edtGabMezCalN_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode660 ;
   private String GXCCtl ;
   private String A12947GabMezCalN ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z12947GabMezCalN ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1774_Jsonclick ;
   private String edtGabMezID_Jsonclick ;
   private String edtGabMezVMin_Jsonclick ;
   private String edtGabMezVMax_Jsonclick ;
   private String edtGabMezMtsI_Jsonclick ;
   private String edtGabMezMtsF_Jsonclick ;
   private String edtGabMezCrtI_Jsonclick ;
   private String edtGabMezCrtF_Jsonclick ;
   private String edtGabMezEmpI_Jsonclick ;
   private String edtGabMezEmpF_Jsonclick ;
   private String edtGabMezCalI_Jsonclick ;
   private String edtGabMezCalN_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ4368GrdTipDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n12946GabMezCalI ;
   private boolean wbErr ;
   private boolean n12937GabMezUlt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n12939GabMezVMin ;
   private boolean n12940GabMezVMax ;
   private boolean n12941GabMezMtsI ;
   private boolean n12942GabMezMtsF ;
   private boolean n13103GabMezCrtI ;
   private boolean n13104GabMezCrtF ;
   private boolean n13105GabMezEmpI ;
   private boolean n13106GabMezEmpF ;
   private boolean n12947GabMezCalN ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01M17_A407EmprNom ;
   private boolean[] T01M17_n407EmprNom ;
   private short[] T01M18_A4364GrdTipArt ;
   private String[] T01M18_A407EmprNom ;
   private boolean[] T01M18_n407EmprNom ;
   private String[] T01M18_A4368GrdTipDsc ;
   private short[] T01M18_A12937GabMezUlt ;
   private boolean[] T01M18_n12937GabMezUlt ;
   private String[] T01M18_A396EmprCod ;
   private String[] T01M19_A396EmprCod ;
   private short[] T01M19_A4364GrdTipArt ;
   private short[] T01M16_A4364GrdTipArt ;
   private String[] T01M16_A4368GrdTipDsc ;
   private short[] T01M16_A12937GabMezUlt ;
   private boolean[] T01M16_n12937GabMezUlt ;
   private String[] T01M16_A396EmprCod ;
   private String[] T01M110_A396EmprCod ;
   private short[] T01M110_A4364GrdTipArt ;
   private String[] T01M111_A396EmprCod ;
   private short[] T01M111_A4364GrdTipArt ;
   private short[] T01M15_A4364GrdTipArt ;
   private String[] T01M15_A4368GrdTipDsc ;
   private short[] T01M15_A12937GabMezUlt ;
   private boolean[] T01M15_n12937GabMezUlt ;
   private String[] T01M15_A396EmprCod ;
   private String[] T01M115_A396EmprCod ;
   private short[] T01M115_A4364GrdTipArt ;
   private byte[] T01M115_A12944FamCalID ;
   private String[] T01M116_A396EmprCod ;
   private int[] T01M116_A252CliCod ;
   private short[] T01M116_A4364GrdTipArt ;
   private String[] T01M116_A4365NomColor ;
   private int[] T01M116_A4366NumColor ;
   private byte[] T01M116_A4367TipColor ;
   private String[] T01M116_A5740TipProd ;
   private String[] T01M117_A396EmprCod ;
   private short[] T01M117_A4364GrdTipArt ;
   private short[] T01M117_A5657Tifi_l ;
   private String[] T01M118_A396EmprCod ;
   private String[] T01M118_A5654Mgen_com ;
   private short[] T01M118_A4364GrdTipArt ;
   private String[] T01M119_A396EmprCod ;
   private short[] T01M119_A4364GrdTipArt ;
   private short[] T01M119_A829TipArtCod ;
   private String[] T01M120_A396EmprCod ;
   private short[] T01M120_A4364GrdTipArt ;
   private java.math.BigDecimal[] T01M120_A4376GrdTipVal ;
   private String[] T01M122_A396EmprCod ;
   private short[] T01M122_A4364GrdTipArt ;
   private short[] T01M123_A4364GrdTipArt ;
   private short[] T01M123_A12938GabMezID ;
   private short[] T01M123_A12939GabMezVMin ;
   private boolean[] T01M123_n12939GabMezVMin ;
   private short[] T01M123_A12940GabMezVMax ;
   private boolean[] T01M123_n12940GabMezVMax ;
   private java.math.BigDecimal[] T01M123_A12941GabMezMtsI ;
   private boolean[] T01M123_n12941GabMezMtsI ;
   private java.math.BigDecimal[] T01M123_A12942GabMezMtsF ;
   private boolean[] T01M123_n12942GabMezMtsF ;
   private short[] T01M123_A13103GabMezCrtI ;
   private boolean[] T01M123_n13103GabMezCrtI ;
   private short[] T01M123_A13104GabMezCrtF ;
   private boolean[] T01M123_n13104GabMezCrtF ;
   private short[] T01M123_A13105GabMezEmpI ;
   private boolean[] T01M123_n13105GabMezEmpI ;
   private short[] T01M123_A13106GabMezEmpF ;
   private boolean[] T01M123_n13106GabMezEmpF ;
   private String[] T01M123_A12947GabMezCalN ;
   private boolean[] T01M123_n12947GabMezCalN ;
   private String[] T01M123_A396EmprCod ;
   private byte[] T01M123_A12946GabMezCalI ;
   private boolean[] T01M123_n12946GabMezCalI ;
   private String[] T01M14_A12947GabMezCalN ;
   private boolean[] T01M14_n12947GabMezCalN ;
   private String[] T01M124_A12947GabMezCalN ;
   private boolean[] T01M124_n12947GabMezCalN ;
   private String[] T01M125_A396EmprCod ;
   private short[] T01M125_A4364GrdTipArt ;
   private short[] T01M125_A12938GabMezID ;
   private short[] T01M13_A4364GrdTipArt ;
   private short[] T01M13_A12938GabMezID ;
   private short[] T01M13_A12939GabMezVMin ;
   private boolean[] T01M13_n12939GabMezVMin ;
   private short[] T01M13_A12940GabMezVMax ;
   private boolean[] T01M13_n12940GabMezVMax ;
   private java.math.BigDecimal[] T01M13_A12941GabMezMtsI ;
   private boolean[] T01M13_n12941GabMezMtsI ;
   private java.math.BigDecimal[] T01M13_A12942GabMezMtsF ;
   private boolean[] T01M13_n12942GabMezMtsF ;
   private short[] T01M13_A13103GabMezCrtI ;
   private boolean[] T01M13_n13103GabMezCrtI ;
   private short[] T01M13_A13104GabMezCrtF ;
   private boolean[] T01M13_n13104GabMezCrtF ;
   private short[] T01M13_A13105GabMezEmpI ;
   private boolean[] T01M13_n13105GabMezEmpI ;
   private short[] T01M13_A13106GabMezEmpF ;
   private boolean[] T01M13_n13106GabMezEmpF ;
   private String[] T01M13_A396EmprCod ;
   private byte[] T01M13_A12946GabMezCalI ;
   private boolean[] T01M13_n12946GabMezCalI ;
   private short[] T01M12_A4364GrdTipArt ;
   private short[] T01M12_A12938GabMezID ;
   private short[] T01M12_A12939GabMezVMin ;
   private boolean[] T01M12_n12939GabMezVMin ;
   private short[] T01M12_A12940GabMezVMax ;
   private boolean[] T01M12_n12940GabMezVMax ;
   private java.math.BigDecimal[] T01M12_A12941GabMezMtsI ;
   private boolean[] T01M12_n12941GabMezMtsI ;
   private java.math.BigDecimal[] T01M12_A12942GabMezMtsF ;
   private boolean[] T01M12_n12942GabMezMtsF ;
   private short[] T01M12_A13103GabMezCrtI ;
   private boolean[] T01M12_n13103GabMezCrtI ;
   private short[] T01M12_A13104GabMezCrtF ;
   private boolean[] T01M12_n13104GabMezCrtF ;
   private short[] T01M12_A13105GabMezEmpI ;
   private boolean[] T01M12_n13105GabMezEmpI ;
   private short[] T01M12_A13106GabMezEmpF ;
   private boolean[] T01M12_n13106GabMezEmpF ;
   private String[] T01M12_A396EmprCod ;
   private byte[] T01M12_A12946GabMezCalI ;
   private boolean[] T01M12_n12946GabMezCalI ;
   private String[] T01M129_A12947GabMezCalN ;
   private boolean[] T01M129_n12947GabMezCalN ;
   private String[] T01M130_A396EmprCod ;
   private short[] T01M130_A4364GrdTipArt ;
   private short[] T01M130_A12938GabMezID ;
   private String[] T01M131_A407EmprNom ;
   private boolean[] T01M131_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tgabmezca__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgabmezca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgabmezca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgabmezca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgabmezca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M12", "SELECT GrdTipArt, GabMezID, GabMezVMin, GabMezVMax, GabMezMtsI, GabMezMtsF, GabMezCrtI, GabMezCrtF, GabMezEmpI, GabMezEmpF, EmprCod, GabMezCalI FROM TXPGABMEZ WHERE EmprCod = ? AND GrdTipArt = ? AND GabMezID = ?  FOR UPDATE OF GabMezVMin, GabMezVMax, GabMezMtsI, GabMezMtsF, GabMezCrtI, GabMezCrtF, GabMezEmpI, GabMezEmpF, GabMezCalI NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M13", "SELECT GrdTipArt, GabMezID, GabMezVMin, GabMezVMax, GabMezMtsI, GabMezMtsF, GabMezCrtI, GabMezCrtF, GabMezEmpI, GabMezEmpF, EmprCod, GabMezCalI FROM TXPGABMEZ WHERE EmprCod = ? AND GrdTipArt = ? AND GabMezID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M14", "SELECT CalidadNm AS GabMezCalN FROM TXPCALIDA WHERE EmprCod = ? AND CalidadId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M15", "SELECT GrdTipArt, GrdTipDsc, GabMezUlt, EmprCod FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ?  FOR UPDATE OF GrdTipDsc, GabMezUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M16", "SELECT GrdTipArt, GrdTipDsc, GabMezUlt, EmprCod FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M18", "SELECT /*+ FIRST_ROWS(100) */ TM1.GrdTipArt, T2.EmprNom, TM1.GrdTipDsc, TM1.GabMezUlt, TM1.EmprCod FROM (TXPGRDTIP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.GrdTipArt = ? ORDER BY TM1.EmprCod, TM1.GrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M110", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE ( GrdTipArt > ?) and EmprCod = ? ORDER BY EmprCod, GrdTipArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M111", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE ( GrdTipArt < ?) and EmprCod = ? ORDER BY EmprCod DESC, GrdTipArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M112", "INSERT INTO TXPGRDTIP(GrdTipArt, GrdTipDsc, GabMezUlt, EmprCod, Tifi_Ul) VALUES(?, ?, ?, ?, 0)", GX_NOMASK, "TXPGRDTIP")
         ,new UpdateCursor("T01M113", "UPDATE TXPGRDTIP SET GrdTipDsc=?, GabMezUlt=?  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new UpdateCursor("T01M114", "DELETE FROM TXPGRDTIP  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new ForEachCursor("T01M115", "SELECT * FROM (SELECT EmprCod, GrdTipArt, FamCalID FROM TXPFAMCAL WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M116", "SELECT * FROM (SELECT EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M117", "SELECT * FROM (SELECT EmprCod, GrdTipArt, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M118", "SELECT * FROM (SELECT EmprCod, Mgen_com, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M119", "SELECT * FROM (SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M120", "SELECT * FROM (SELECT EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M121", "UPDATE TXPGRDTIP SET GabMezUlt=?  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new ForEachCursor("T01M122", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE EmprCod = ? ORDER BY EmprCod, GrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M123", "SELECT T1.GrdTipArt, T1.GabMezID, T1.GabMezVMin, T1.GabMezVMax, T1.GabMezMtsI, T1.GabMezMtsF, T1.GabMezCrtI, T1.GabMezCrtF, T1.GabMezEmpI, T1.GabMezEmpF, T2.CalidadNm AS GabMezCalN, T1.EmprCod, T1.GabMezCalI AS GabMezCalI FROM (TXPGABMEZ T1 LEFT JOIN TXPCALIDA T2 ON T2.EmprCod = T1.EmprCod AND T2.CalidadId = T1.GabMezCalI) WHERE T1.EmprCod = ? and T1.GrdTipArt = ? and T1.GabMezID = ? ORDER BY T1.EmprCod, T1.GrdTipArt, T1.GabMezID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M124", "SELECT CalidadNm AS GabMezCalN FROM TXPCALIDA WHERE EmprCod = ? AND CalidadId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M125", "SELECT EmprCod, GrdTipArt, GabMezID FROM TXPGABMEZ WHERE EmprCod = ? AND GrdTipArt = ? AND GabMezID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M126", "INSERT INTO TXPGABMEZ(GrdTipArt, GabMezID, GabMezVMin, GabMezVMax, GabMezMtsI, GabMezMtsF, GabMezCrtI, GabMezCrtF, GabMezEmpI, GabMezEmpF, EmprCod, GabMezCalI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPGABMEZ")
         ,new UpdateCursor("T01M127", "UPDATE TXPGABMEZ SET GabMezVMin=?, GabMezVMax=?, GabMezMtsI=?, GabMezMtsF=?, GabMezCrtI=?, GabMezCrtF=?, GabMezEmpI=?, GabMezEmpF=?, GabMezCalI=?  WHERE EmprCod = ? AND GrdTipArt = ? AND GabMezID = ?", GX_NOMASK, "TXPGABMEZ")
         ,new UpdateCursor("T01M128", "DELETE FROM TXPGABMEZ  WHERE EmprCod = ? AND GrdTipArt = ? AND GabMezID = ?", GX_NOMASK, "TXPGABMEZ")
         ,new ForEachCursor("T01M129", "SELECT CalidadNm AS GabMezCalN FROM TXPCALIDA WHERE EmprCod = ? AND CalidadId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M130", "SELECT EmprCod, GrdTipArt, GabMezID FROM TXPGABMEZ WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, GabMezID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M131", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 30);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 24 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[17]).shortValue());
               }
               stmt.setString(11, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[20]).byteValue());
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               stmt.setShort(12, ((Number) parms[20]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

