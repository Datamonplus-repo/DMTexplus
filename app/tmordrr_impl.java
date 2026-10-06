package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordrr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_16H1233( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9446OMRepCod = (int)(GXutil.lval( httpContext.GetPar( "OMRepCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A9446OMRepCod) ;
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
            A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Res Repuestos,Orden de trabajo", ""), (short)(0)) ;
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

   public tmordrr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordrr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordrr_impl.class ));
   }

   public tmordrr_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
      cmbOMRTpo = new HTMLChoice();
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
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMOrdRR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod de Orden de Mantto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Desc Maquina Ord Mantto", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Costo Total Reserva Repuesto", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRRCosT_Enabled!=0) ? localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999") : localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRRCosT_Jsonclick, 0, "", "", "", "", "", 1, edtOMRRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdRR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TMOrdRR.htm");
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
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
         nBlankRcdCount1233 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1233 = (short)(1) ;
            scanStart16H1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               init_level_properties1233( ) ;
               getByPrimaryKey16H1233( ) ;
               addRow16H1233( ) ;
               scanNext16H1233( ) ;
            }
            scanEnd16H1233( ) ;
            nBlankRcdCount1233 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9444OMRRCosT = A9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         standaloneNotModal16H1233( ) ;
         standaloneModal16H1233( ) ;
         sMode1233 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow16H1233( ) ;
            edtavnRcdDeleted_1233_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1233_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1233_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1233_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRepPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMRCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1233 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16H1233( ) ;
            }
            sendRow16H1233( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9444OMRRCosT = B9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         nRcdExists_1233 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16H1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551233( ) ;
               init_level_properties1233( ) ;
               standaloneNotModal16H1233( ) ;
               getByPrimaryKey16H1233( ) ;
               standaloneModal16H1233( ) ;
               addRow16H1233( ) ;
               scanNext16H1233( ) ;
            }
            scanEnd16H1233( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1233 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551233( ) ;
      initAll16H1233( ) ;
      init_level_properties1233( ) ;
      B9444OMRRCosT = A9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      nRcdExists_1233 = (short)(0) ;
      nIsMod_1233 = (short)(0) ;
      nRcdDeleted_1233 = (short)(0) ;
      nBlankRcdCount1233 = (short)(nBlankRcdUsr1233+nBlankRcdCount1233) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1233 > 0 )
      {
         standaloneNotModal16H1233( ) ;
         standaloneModal16H1233( ) ;
         addRow16H1233( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtOMRepCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1233 = (short)(nBlankRcdCount1233-1) ;
      }
      Gx_mode = sMode1233 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A9444OMRRCosT = B9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdRR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMOrdRR.htm");
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
      e1116H2 ();
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
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            Z9426OMMaqCod = httpContext.cgiGet( "Z9426OMMaqCod") ;
            O9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( "O9444OMRRCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16oOMRRCnt = localUtil.ctond( httpContext.cgiGet( "vOOMRRCNT")) ;
            AV19nOMRRCnt = localUtil.ctond( httpContext.cgiGet( "vNOMRRCNT")) ;
            AV20ServerNow = localUtil.ctot( httpContext.cgiGet( "vSERVERNOW"), 0) ;
            AV18MTMovNom = httpContext.cgiGet( "vMTMOVNOM") ;
            AV17MTMovCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMTMOVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
            n9427OMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
            A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            cmbOMEst.setName( cmbOMEst.getInternalname() );
            cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdRR");
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            forbiddenHiddens.add("OMMaqCod", GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmordrr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
                        e1116H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216H2 ();
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
         e1216H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16H1232( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1233_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1233_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes16H1232( ) ;
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

   public void confirm_16H0( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16H1232( ) ;
         }
         else
         {
            checkExtendedTable16H1232( ) ;
            if ( AnyError == 0 )
            {
               zm16H1232( 16) ;
               zm16H1232( 17) ;
               zm16H1232( 18) ;
            }
            closeExtendedTableCursors16H1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_16H1233( ) ;
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
         confirmValues16H0( ) ;
      }
   }

   public void confirm_16H1233( )
   {
      s9444OMRRCosT = O9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16H1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            getKey16H1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               if ( RcdFound1233 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16H1233( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        zm16H1233( 20) ;
                     }
                     closeExtendedTableCursors16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9444OMRRCosT = A9444OMRRCosT ;
                     n9444OMRRCosT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMREPCOD_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMRepCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( nRcdDeleted_1233 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16H1233( ) ;
                     load16H1233( ) ;
                     beforeValidate16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16H1233( ) ;
                        O9444OMRRCosT = A9444OMRRCosT ;
                        n9444OMRRCosT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16H1233( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16H1233( ) ;
                           if ( AnyError == 0 )
                           {
                              zm16H1233( 20) ;
                           }
                           closeExtendedTableCursors16H1233( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9444OMRRCosT = A9444OMRRCosT ;
                           n9444OMRRCosT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1233_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRepNom_Internalname, GXutil.rtrim( A9447OMRepNom)) ;
         httpContext.changePostValue( edtOMRepPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_55_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9450OMRRCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9471OMRRCos_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1233_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9444OMRRCosT = s9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16H0( )
   {
   }

   public void e1116H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmordrr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV22Pgmname, (byte)(99), GXv_char2) ;
      tmordrr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmordrr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordrr_impl.this.A396EmprCod = GXv_char2[0] ;
      tmordrr_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordrr_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int5[0] = AV17MTMovCod ;
      GXv_char2[0] = AV18MTMovNom ;
      new app.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      tmordrr_impl.this.A396EmprCod = GXv_char4[0] ;
      tmordrr_impl.this.AV17MTMovCod = GXv_int5[0] ;
      tmordrr_impl.this.AV18MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
   }

   public void e1216H2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A9425OMCod)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A9425OMCod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm16H1232( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9445OMEst = T016H6_A9445OMEst[0] ;
            Z9426OMMaqCod = T016H6_A9426OMMaqCod[0] ;
         }
         else
         {
            Z9445OMEst = A9445OMEst ;
            Z9426OMMaqCod = A9426OMMaqCod ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9445OMEst = A9445OMEst ;
         Z396EmprCod = A396EmprCod ;
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z9444OMRRCosT = A9444OMRRCosT ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      AV22Pgmname = "TMOrdRR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      /* Using cursor T016H7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016H7_A407EmprNom[0] ;
      n407EmprNom = T016H7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T016H10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A9444OMRRCosT = T016H10_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H10_n9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      O9444OMRRCosT = A9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
      /* Using cursor T016H8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
      }
      A9427OMMaqDsc = T016H8_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T016H8_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      pr_default.close(6);
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

   public void load16H1232( )
   {
      /* Using cursor T016H12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A407EmprNom = T016H12_A407EmprNom[0] ;
         n407EmprNom = T016H12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9427OMMaqDsc = T016H12_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T016H12_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9445OMEst = T016H12_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9426OMMaqCod = T016H12_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9444OMRRCosT = T016H12_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H12_n9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         zm16H1232( -15) ;
      }
      pr_default.close(8);
      onLoadActions16H1232( ) ;
   }

   public void onLoadActions16H1232( )
   {
      O9444OMRRCosT = A9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
   }

   public void checkExtendedTable16H1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors16H1232( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16H1232( )
   {
      /* Using cursor T016H13 */
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
      /* Using cursor T016H6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T016H6_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T016H6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16H1232( 15) ;
         RcdFound1232 = (short)(1) ;
         A9445OMEst = T016H6_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9426OMMaqCod = T016H6_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16H1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey16H1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey16H1232( ) ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16H1232( ) ;
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
      /* Using cursor T016H14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016H14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016H14_A9425OMCod[0] == A9425OMCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016H14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016H14_A9425OMCod[0] == A9425OMCod ) )
         {
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016H15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T016H15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016H15_A9425OMCod[0] == A9425OMCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T016H15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016H15_A9425OMCod[0] == A9425OMCod ) )
         {
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16H1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9444OMRRCosT = O9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         insert16H1232( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               update16H1232( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               insert16H1232( ) ;
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
                  A9444OMRRCosT = O9444OMRRCosT ;
                  n9444OMRRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                  insert16H1232( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9444OMRRCosT = O9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
      getKey16H1232( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordrr");
   }

   public void insert_check( )
   {
      confirm_16H0( ) ;
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
      scanStart16H1232( ) ;
      if ( RcdFound1232 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16H1232( ) ;
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
      scanStart16H1232( ) ;
      if ( RcdFound1232 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1232 != 0 )
         {
            scanNext16H1232( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16H1232( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16H1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016H5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9445OMEst, T016H5_A9445OMEst[0]) != 0 ) || ( GXutil.strcmp(Z9426OMMaqCod, T016H5_A9426OMMaqCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9445OMEst, T016H5_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("tmordrr:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T016H5_A9445OMEst[0]);
            }
            if ( GXutil.strcmp(Z9426OMMaqCod, T016H5_A9426OMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tmordrr:[seudo value changed for attri]"+"OMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9426OMMaqCod);
               GXutil.writeLogRaw("Current: ",T016H5_A9426OMMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16H1232( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16H1232( 0) ;
         checkOptimisticConcurrency16H1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16H1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16H1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H16 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A9425OMCod), A9445OMEst, A396EmprCod, A9426OMMaqCod});
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
                        processLevel16H1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16H0( ) ;
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
            load16H1232( ) ;
         }
         endLevel16H1232( ) ;
      }
      closeExtendedTableCursors16H1232( ) ;
   }

   public void update16H1232( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16H1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16H1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16H1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H17 */
                  pr_default.execute(13, new Object[] {A9445OMEst, A9426OMMaqCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16H1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16H1232( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16H0( ) ;
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
         endLevel16H1232( ) ;
      }
      closeExtendedTableCursors16H1232( ) ;
   }

   public void deferredUpdate16H1232( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16H1232( ) ;
         afterConfirm16H1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16H1232( ) ;
            if ( AnyError == 0 )
            {
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               scanStart16H1233( ) ;
               while ( RcdFound1233 != 0 )
               {
                  getByPrimaryKey16H1233( ) ;
                  delete16H1233( ) ;
                  scanNext16H1233( ) ;
                  O9444OMRRCosT = A9444OMRRCosT ;
                  n9444OMRRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               }
               scanEnd16H1233( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H18 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
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
                           initAll16H1232( ) ;
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
                        resetCaption16H0( ) ;
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
      sMode1232 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16H1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16H1232( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T016H19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T016H20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T016H21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MO de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel16H1233( )
   {
      s9444OMRRCosT = O9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16H1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            standaloneNotModal16H1233( ) ;
            getKey16H1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16H1233( ) ;
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( ( nRcdDeleted_1233 != 0 ) && ( nRcdExists_1233 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16H1233( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16H1233( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9444OMRRCosT = A9444OMRRCosT ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1233_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRepNom_Internalname, GXutil.rtrim( A9447OMRepNom)) ;
         httpContext.changePostValue( edtOMRepPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_55_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9450OMRRCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9471OMRRCos_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1233_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16H1233( ) ;
      if ( AnyError != 0 )
      {
         O9444OMRRCosT = s9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      nRcdExists_1233 = (short)(0) ;
      nIsMod_1233 = (short)(0) ;
      nRcdDeleted_1233 = (short)(0) ;
   }

   public void processLevel16H1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel16H1233( ) ;
      if ( AnyError != 0 )
      {
         O9444OMRRCosT = s9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16H1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmordrr");
         if ( AnyError == 0 )
         {
            confirmValues16H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordrr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16H1232( )
   {
      /* Scan By routine */
      /* Using cursor T016H22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16H1232( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
   }

   public void scanEnd16H1232( )
   {
      pr_default.close(18);
   }

   public void afterConfirm16H1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16H1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16H1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16H1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16H1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16H1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16H1232( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      edtOMRRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
   }

   public void zm16H1233( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9451OMRRPre = T016H3_A9451OMRRPre[0] ;
            Z9450OMRRCnt = T016H3_A9450OMRRCnt[0] ;
            Z9452OMRCCnt = T016H3_A9452OMRCCnt[0] ;
            Z9453OMRCPre = T016H3_A9453OMRCPre[0] ;
         }
         else
         {
            Z9451OMRRPre = A9451OMRRPre ;
            Z9450OMRRCnt = A9450OMRRCnt ;
            Z9452OMRCCnt = A9452OMRCCnt ;
            Z9453OMRCPre = A9453OMRCPre ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         Z9451OMRRPre = A9451OMRRPre ;
         Z9450OMRRCnt = A9450OMRRCnt ;
         Z9452OMRCCnt = A9452OMRCCnt ;
         Z9453OMRCPre = A9453OMRCPre ;
         Z396EmprCod = A396EmprCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9447OMRepNom = A9447OMRepNom ;
         Z9448OMRepPre = A9448OMRepPre ;
      }
   }

   public void standaloneNotModal16H1233( )
   {
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void standaloneModal16H1233( )
   {
      if ( isIns( )  )
      {
         A9449OMRTpo = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtOMRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load16H1233( )
   {
      /* Using cursor T016H23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9451OMRRPre = T016H23_A9451OMRRPre[0] ;
         A9447OMRepNom = T016H23_A9447OMRepNom[0] ;
         n9447OMRepNom = T016H23_n9447OMRepNom[0] ;
         A9448OMRepPre = T016H23_A9448OMRepPre[0] ;
         n9448OMRepPre = T016H23_n9448OMRepPre[0] ;
         A9450OMRRCnt = T016H23_A9450OMRRCnt[0] ;
         A9452OMRCCnt = T016H23_A9452OMRCCnt[0] ;
         A9453OMRCPre = T016H23_A9453OMRCPre[0] ;
         zm16H1233( -19) ;
      }
      pr_default.close(19);
      onLoadActions16H1233( ) ;
   }

   public void onLoadActions16H1233( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
      O9471OMRRCos = A9471OMRRCos ;
      if ( isIns( )  )
      {
         A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
         }
      }
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
   }

   public void checkExtendedTable16H1233( )
   {
      nIsDirty_1233 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal16H1233( ) ;
      /* Using cursor T016H4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T016H4_A9447OMRepNom[0] ;
      n9447OMRepNom = T016H4_n9447OMRepNom[0] ;
      A9448OMRepPre = T016H4_A9448OMRepPre[0] ;
      n9448OMRepPre = T016H4_n9448OMRepPre[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1233 = (short)(1) ;
         A9451OMRRPre = A9448OMRepPre ;
      }
      nIsDirty_1233 = (short)(1) ;
      A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1233 = (short)(1) ;
         A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1233 = (short)(1) ;
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1233 = (short)(1) ;
               A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
         }
      }
      nIsDirty_1233 = (short)(1) ;
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
   }

   public void closeExtendedTableCursors16H1233( )
   {
      pr_default.close(2);
   }

   public void enableDisable16H1233( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          int A9446OMRepCod )
   {
      /* Using cursor T016H24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T016H24_A9447OMRepNom[0] ;
      n9447OMRepNom = T016H24_n9447OMRepNom[0] ;
      A9448OMRepPre = T016H24_A9448OMRepPre[0] ;
      n9448OMRepPre = T016H24_n9448OMRepPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9447OMRepNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey16H1233( )
   {
      /* Using cursor T016H25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1233 = (short)(1) ;
      }
      else
      {
         RcdFound1233 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey16H1233( )
   {
      /* Using cursor T016H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(1) != 101) && ( T016H3_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T016H3_A9449OMRTpo[0], "R") == 0 ) && ( GXutil.strcmp(T016H3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16H1233( 19) ;
         RcdFound1233 = (short)(1) ;
         initializeNonKey16H1233( ) ;
         A9449OMRTpo = T016H3_A9449OMRTpo[0] ;
         A9451OMRRPre = T016H3_A9451OMRRPre[0] ;
         A9450OMRRCnt = T016H3_A9450OMRRCnt[0] ;
         A9452OMRCCnt = T016H3_A9452OMRCCnt[0] ;
         A9453OMRCPre = T016H3_A9453OMRCPre[0] ;
         A9446OMRepCod = T016H3_A9446OMRepCod[0] ;
         O9450OMRRCnt = A9450OMRRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16H1233( ) ;
         load16H1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1233 = (short)(0) ;
         initializeNonKey16H1233( ) ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16H1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16H1233( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16H1233( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9451OMRRPre, T016H2_A9451OMRRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9450OMRRCnt, T016H2_A9450OMRRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9452OMRCCnt, T016H2_A9452OMRCCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9453OMRCPre, T016H2_A9453OMRCPre[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9451OMRRPre, T016H2_A9451OMRRPre[0]) != 0 )
            {
               GXutil.writeLogln("tmordrr:[seudo value changed for attri]"+"OMRRPre");
               GXutil.writeLogRaw("Old: ",Z9451OMRRPre);
               GXutil.writeLogRaw("Current: ",T016H2_A9451OMRRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9450OMRRCnt, T016H2_A9450OMRRCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordrr:[seudo value changed for attri]"+"OMRRCnt");
               GXutil.writeLogRaw("Old: ",Z9450OMRRCnt);
               GXutil.writeLogRaw("Current: ",T016H2_A9450OMRRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9452OMRCCnt, T016H2_A9452OMRCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordrr:[seudo value changed for attri]"+"OMRCCnt");
               GXutil.writeLogRaw("Old: ",Z9452OMRCCnt);
               GXutil.writeLogRaw("Current: ",T016H2_A9452OMRCCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9453OMRCPre, T016H2_A9453OMRCPre[0]) != 0 )
            {
               GXutil.writeLogln("tmordrr:[seudo value changed for attri]"+"OMRCPre");
               GXutil.writeLogRaw("Old: ",Z9453OMRCPre);
               GXutil.writeLogRaw("Current: ",T016H2_A9453OMRCPre[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrRep"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16H1233( )
   {
      beforeValidate16H1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1233( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16H1233( 0) ;
         checkOptimisticConcurrency16H1233( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16H1233( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16H1233( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H26 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A9425OMCod), A9449OMRTpo, A9451OMRRPre, A9450OMRRCnt, A9452OMRCCnt, A9453OMRCPre, A396EmprCod, Integer.valueOf(A9446OMRepCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
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
            load16H1233( ) ;
         }
         endLevel16H1233( ) ;
      }
      closeExtendedTableCursors16H1233( ) ;
   }

   public void update16H1233( )
   {
      beforeValidate16H1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1233( ) ;
      }
      if ( ( nIsMod_1233 != 0 ) || ( nIsDirty_1233 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16H1233( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16H1233( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16H1233( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016H27 */
                     pr_default.execute(23, new Object[] {A9451OMRRPre, A9450OMRRCnt, A9452OMRCCnt, A9453OMRCPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16H1233( ) ;
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
            endLevel16H1233( ) ;
         }
      }
      closeExtendedTableCursors16H1233( ) ;
   }

   public void deferredUpdate16H1233( )
   {
   }

   public void delete16H1233( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16H1233( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16H1233( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16H1233( ) ;
         afterConfirm16H1233( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16H1233( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016H28 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
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
      sMode1233 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16H1233( ) ;
      Gx_mode = sMode1233 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16H1233( )
   {
      standaloneModal16H1233( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016H29 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         A9447OMRepNom = T016H29_A9447OMRepNom[0] ;
         n9447OMRepNom = T016H29_n9447OMRepNom[0] ;
         A9448OMRepPre = T016H29_A9448OMRepPre[0] ;
         n9448OMRepPre = T016H29_n9448OMRepPre[0] ;
         pr_default.close(25);
         A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
         A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
         if ( isIns( )  )
         {
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
                  n9444OMRRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               }
            }
         }
      }
   }

   public void endLevel16H1233( )
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

   public void scanStart16H1233( )
   {
      /* Scan By routine */
      /* Using cursor T016H30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T016H30_A9446OMRepCod[0] ;
         A9449OMRTpo = T016H30_A9449OMRTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16H1233( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T016H30_A9446OMRepCod[0] ;
         A9449OMRTpo = T016H30_A9449OMRTpo[0] ;
      }
   }

   public void scanEnd16H1233( )
   {
      pr_default.close(26);
   }

   public void afterConfirm16H1233( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         AV20ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV16oOMRRCnt = O9450OMRRCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV19nOMRRCnt = A9450OMRRCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19nOMRRCnt", GXutil.ltrimstr( AV19nOMRRCnt, 12, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9425OMCod ;
         GXv_int6[0] = A9446OMRepCod ;
         GXv_int7[0] = AV17MTMovCod ;
         GXv_char3[0] = AV18MTMovNom ;
         GXv_int8[0] = (byte)(1) ;
         GXv_decimal9[0] = AV16oOMRRCnt ;
         GXv_decimal10[0] = A9450OMRRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime11[0] = AV20ServerNow ;
         new app.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3, GXv_int8, GXv_decimal9, GXv_decimal10, GXv_char2, GXv_dtime11) ;
         tmordrr_impl.this.A396EmprCod = GXv_char4[0] ;
         tmordrr_impl.this.A9425OMCod = GXv_int5[0] ;
         tmordrr_impl.this.A9446OMRepCod = GXv_int6[0] ;
         tmordrr_impl.this.AV17MTMovCod = GXv_int7[0] ;
         tmordrr_impl.this.AV18MTMovNom = GXv_char3[0] ;
         tmordrr_impl.this.AV16oOMRRCnt = GXv_decimal9[0] ;
         tmordrr_impl.this.A9450OMRRCnt = GXv_decimal10[0] ;
         tmordrr_impl.this.AV20ServerNow = GXv_dtime11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert16H1233( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16H1233( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16H1233( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16H1233( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16H1233( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16H1233( )
   {
      edtOMRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRepPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRRCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes16H1233( )
   {
   }

   public void send_integrity_lvl_hashes16H1232( )
   {
   }

   public void subsflControlProps_551233( )
   {
      edtavnRcdDeleted_1233_Internalname = "vNRCDDELETED_1233_"+sGXsfl_55_idx ;
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_55_idx ;
      edtOMRepNom_Internalname = "OMREPNOM_"+sGXsfl_55_idx ;
      edtOMRepPre_Internalname = "OMREPPRE_"+sGXsfl_55_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_55_idx );
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_55_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_55_idx ;
      edtOMRRCos_Internalname = "OMRRCOS_"+sGXsfl_55_idx ;
      edtOMRCCnt_Internalname = "OMRCCNT_"+sGXsfl_55_idx ;
      edtOMRCPre_Internalname = "OMRCPRE_"+sGXsfl_55_idx ;
      edtOMRCCos_Internalname = "OMRCCOS_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551233( )
   {
      edtavnRcdDeleted_1233_Internalname = "vNRCDDELETED_1233_"+sGXsfl_55_fel_idx ;
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_55_fel_idx ;
      edtOMRepNom_Internalname = "OMREPNOM_"+sGXsfl_55_fel_idx ;
      edtOMRepPre_Internalname = "OMREPPRE_"+sGXsfl_55_fel_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_55_fel_idx );
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_55_fel_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_55_fel_idx ;
      edtOMRRCos_Internalname = "OMRRCOS_"+sGXsfl_55_fel_idx ;
      edtOMRCCnt_Internalname = "OMRCCNT_"+sGXsfl_55_fel_idx ;
      edtOMRCPre_Internalname = "OMRCPRE_"+sGXsfl_55_fel_idx ;
      edtOMRCCos_Internalname = "OMRCCOS_"+sGXsfl_55_fel_idx ;
   }

   public void addRow16H1233( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551233( ) ;
      sendRow16H1233( ) ;
   }

   public void sendRow16H1233( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1233_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1233_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1233), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1233), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1233_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1233_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRepCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepNom_Internalname,GXutil.rtrim( A9447OMRepNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRepNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRepPre_Enabled!=0) ? localUtil.format( A9448OMRepPre, "ZZZZZZ9.999") : localUtil.format( A9448OMRepPre, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRepPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMRTPO_" + sGXsfl_55_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9449OMRTpo)==0) )
         {
            A9449OMRTpo = "R" ;
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMRTpo,cmbOMRTpo.getInternalname(),GXutil.rtrim( A9449OMRTpo),Integer.valueOf(1),cmbOMRTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMRTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Values", cmbOMRTpo.ToJavascriptSource(), !bGXsfl_55_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCnt_Enabled!=0) ? localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRPre_Enabled!=0) ? localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRRPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCos_Enabled!=0) ? localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999") : localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRCCnt_Enabled!=0) ? localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRCPre_Enabled!=0) ? localUtil.format( A9453OMRCPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9453OMRCPre, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRCCos_Enabled!=0) ? localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999") : localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRCCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16H1233( ) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9449OMRTpo));
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9450OMRRCnt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9471OMRRCos_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1233_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1233_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1233_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRTPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16H1233( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551233( ) ;
      edtavnRcdDeleted_1233_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1233_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1233_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1233_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1233");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1233_Internalname ;
         wbErr = true ;
         nRcdDeleted_1233 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1233 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1233_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         wbErr = true ;
         A9446OMRepCod = 0 ;
      }
      else
      {
         A9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9447OMRepNom = httpContext.cgiGet( edtOMRepNom_Internalname) ;
      n9447OMRepNom = false ;
      A9448OMRepPre = localUtil.ctond( httpContext.cgiGet( edtOMRepPre_Internalname)) ;
      n9448OMRepPre = false ;
      cmbOMRTpo.setName( cmbOMRTpo.getInternalname() );
      cmbOMRTpo.setValue( httpContext.cgiGet( cmbOMRTpo.getInternalname()) );
      A9449OMRTpo = httpContext.cgiGet( cmbOMRTpo.getInternalname()) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRRCNT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRRCnt_Internalname ;
         wbErr = true ;
         A9450OMRRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)) ;
      }
      A9451OMRRPre = localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)) ;
      A9471OMRRCos = localUtil.ctond( httpContext.cgiGet( edtOMRRCos_Internalname)) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRCCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRCCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRCCNT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRCCnt_Internalname ;
         wbErr = true ;
         A9452OMRCCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( edtOMRCCnt_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRCPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRCPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRCPRE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRCPre_Internalname ;
         wbErr = true ;
         A9453OMRCPre = DecimalUtil.ZERO ;
      }
      else
      {
         A9453OMRCPre = localUtil.ctond( httpContext.cgiGet( edtOMRCPre_Internalname)) ;
      }
      A9454OMRCCos = localUtil.ctond( httpContext.cgiGet( edtOMRCCos_Internalname)) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_55_idx ;
      Z9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_55_idx ;
      Z9449OMRTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_55_idx ;
      Z9451OMRRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_55_idx ;
      Z9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_55_idx ;
      Z9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_55_idx ;
      Z9453OMRCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9450OMRRCnt_" + sGXsfl_55_idx ;
      O9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9471OMRRCos_" + sGXsfl_55_idx ;
      O9471OMRRCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_55_idx ;
      nRcdDeleted_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1233_" + sGXsfl_55_idx ;
      nRcdExists_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1233_" + sGXsfl_55_idx ;
      nIsMod_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOMRRPre_Enabled = edtOMRRPre_Enabled ;
      defcmbOMRTpo_Enabled = cmbOMRTpo.getEnabled() ;
      defedtOMRepCod_Enabled = edtOMRepCod_Enabled ;
   }

   public void confirmValues16H0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551233( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551233( ) ;
         httpContext.changePostValue( "Z9446OMRepCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9446OMRepCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9449OMRTpo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9449OMRTpo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9451OMRRPre_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9451OMRRPre_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9450OMRRCnt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9452OMRCCnt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9453OMRCPre_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9453OMRCPre_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_55_idx) ;
      }
      httpContext.changePostValue( "O9450OMRRCnt", httpContext.cgiGet( "T9450OMRRCnt")) ;
      httpContext.deletePostValue( "T9450OMRRCnt") ;
      httpContext.changePostValue( "O9471OMRRCos", httpContext.cgiGet( "T9471OMRRCos")) ;
      httpContext.deletePostValue( "T9471OMRRCos") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmordrr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0))}, new String[] {"EmprCod","OMCod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdRR");
      forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
      forbiddenHiddens.add("OMMaqCod", GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmordrr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( O9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV22Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOOMRRCNT", GXutil.ltrim( localUtil.ntoc( AV16oOMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMRRCNT", GXutil.ltrim( localUtil.ntoc( AV19nOMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERVERNOW", localUtil.ttoc( AV20ServerNow, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVNOM", GXutil.rtrim( AV18MTMovNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVCOD", GXutil.ltrim( localUtil.ntoc( AV17MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmordrr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0))}, new String[] {"EmprCod","OMCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMOrdRR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Res Repuestos,Orden de trabajo", "") ;
   }

   public void initializeNonKey16H1232( )
   {
      A9426OMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      A9445OMEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      O9444OMRRCosT = A9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      Z9445OMEst = "" ;
      Z9426OMMaqCod = "" ;
   }

   public void initAll16H1232( )
   {
      initializeNonKey16H1232( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16H1233( )
   {
      AV16oOMRRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
      AV19nOMRRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19nOMRRCnt", GXutil.ltrimstr( AV19nOMRRCnt, 12, 3));
      AV20ServerNow = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9454OMRCCos = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9447OMRepNom = "" ;
      n9447OMRepNom = false ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      n9448OMRepPre = false ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      O9450OMRRCnt = A9450OMRRCnt ;
      O9471OMRRCos = A9471OMRRCos ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
   }

   public void initAll16H1233( )
   {
      A9446OMRepCod = 0 ;
      A9449OMRTpo = "R" ;
      initializeNonKey16H1233( ) ;
   }

   public void standaloneModalInsert16H1233( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623134567", true, true);
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
      httpContext.AddJavascriptSource("tmordrr.js", "?20263623134568", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1233( )
   {
      edtOMRRPre_Enabled = defedtOMRRPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      cmbOMRTpo.setEnabled( defcmbOMRTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
      edtOMRepCod_Enabled = defedtOMRepCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9447OMRepNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9449OMRTpo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOMCod_Internalname = "OMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtavnRcdDeleted_1233_Internalname = "vNRCDDELETED_1233" ;
      edtOMRepCod_Internalname = "OMREPCOD" ;
      edtOMRepNom_Internalname = "OMREPNOM" ;
      edtOMRepPre_Internalname = "OMREPPRE" ;
      cmbOMRTpo.setInternalname( "OMRTPO" );
      edtOMRRCnt_Internalname = "OMRRCNT" ;
      edtOMRRPre_Internalname = "OMRRPRE" ;
      edtOMRRCos_Internalname = "OMRRCOS" ;
      edtOMRCCnt_Internalname = "OMRCCNT" ;
      edtOMRCPre_Internalname = "OMRCPRE" ;
      edtOMRCCos_Internalname = "OMRCCOS" ;
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
      Form.setCaption( httpContext.getMessage( "Res Repuestos,Orden de trabajo", "") );
      edtOMRCCos_Jsonclick = "" ;
      edtOMRCPre_Jsonclick = "" ;
      edtOMRCCnt_Jsonclick = "" ;
      edtOMRRCos_Jsonclick = "" ;
      edtOMRRPre_Jsonclick = "" ;
      edtOMRRCnt_Jsonclick = "" ;
      cmbOMRTpo.setJsonclick( "" );
      edtOMRepPre_Jsonclick = "" ;
      edtOMRepNom_Jsonclick = "" ;
      edtOMRepCod_Jsonclick = "" ;
      edtavnRcdDeleted_1233_Jsonclick = "" ;
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
      edtOMRCCos_Enabled = 0 ;
      edtOMRCPre_Enabled = 1 ;
      edtOMRCCnt_Enabled = 1 ;
      edtOMRRCos_Enabled = 0 ;
      edtOMRRPre_Enabled = 0 ;
      edtOMRRCnt_Enabled = 1 ;
      cmbOMRTpo.setEnabled( 0 );
      edtOMRepPre_Enabled = 0 ;
      edtOMRepNom_Enabled = 0 ;
      edtOMRepCod_Enabled = 1 ;
      edtavnRcdDeleted_1233_Enabled = 1 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      cmbOMEst.setIBackground( (int)(0xFFFFFF) );
      edtOMRRCosT_Jsonclick = "" ;
      edtOMRRCosT_Backcolor = (int)(0xFFFFFF) ;
      edtOMRRCosT_Enabled = 0 ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtOMMaqDsc_Enabled = 0 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtOMMaqCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOMCod_Jsonclick = "" ;
      edtOMCod_Backcolor = (int)(0xFFFFFF) ;
      edtOMCod_Enabled = 0 ;
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

   public void xc_14_16H1233( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A9425OMCod ;
         GXv_int6[0] = A9446OMRepCod ;
         GXv_int5[0] = AV17MTMovCod ;
         GXv_char3[0] = AV18MTMovNom ;
         GXv_int8[0] = (byte)(1) ;
         GXv_decimal10[0] = AV16oOMRRCnt ;
         GXv_decimal9[0] = A9450OMRRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime11[0] = AV20ServerNow ;
         new app.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_int5, GXv_char3, GXv_int8, GXv_decimal10, GXv_decimal9, GXv_char2, GXv_dtime11) ;
         A396EmprCod = GXv_char4[0] ;
         A9425OMCod = GXv_int7[0] ;
         A9446OMRepCod = GXv_int6[0] ;
         AV17MTMovCod = GXv_int5[0] ;
         AV18MTMovNom = GXv_char3[0] ;
         AV16oOMRRCnt = GXv_decimal10[0] ;
         A9450OMRRCnt = GXv_decimal9[0] ;
         AV20ServerNow = GXv_dtime11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      subsflControlProps_551233( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16H1233( ) ;
         standaloneModal16H1233( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16H1233( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551233( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbOMEst.setName( "OMEST" );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      GXCCtl = "OMRTPO_" + sGXsfl_55_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9449OMRTpo)==0) )
         {
            A9449OMRTpo = "R" ;
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T016H31 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016H31_A407EmprNom[0] ;
      n407EmprNom = T016H31_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(27);
      /* Using cursor T016H33 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A9444OMRRCosT = T016H33_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H33_n9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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

   public void valid_Omcod( )
   {
      A9445OMEst = cmbOMEst.getValue() ;
      cmbOMEst.setValue( A9445OMEst );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         cmbOMEst.setValue( A9445OMEst );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", GXutil.rtrim( A9426OMMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", GXutil.rtrim( A9427OMMaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", GXutil.rtrim( A9445OMEst));
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9427OMMaqDsc", GXutil.rtrim( Z9427OMMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( Z9444OMRRCosT, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      httpContext.ajax_rsp_assign_attri("", false, "O9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( O9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Omrepcod( )
   {
      n9448OMRepPre = false ;
      n9447OMRepNom = false ;
      /* Using cursor T016H29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMREPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
      }
      A9447OMRepNom = T016H29_A9447OMRepNom[0] ;
      n9447OMRepNom = T016H29_n9447OMRepNom[0] ;
      A9448OMRepPre = T016H29_A9448OMRepPre[0] ;
      n9448OMRepPre = T016H29_n9448OMRepPre[0] ;
      pr_default.close(25);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      dynload_actions( ) ;
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         A9449OMRTpo = cmbOMRTpo.getValidValue(A9449OMRTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9447OMRepNom", GXutil.rtrim( A9447OMRepNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9448OMRepPre", GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9451OMRRPre", GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(12), (byte)(3), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1216H2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_OMCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9425OMCod'},{av:'Z407EmprNom'},{av:'Z9426OMMaqCod'},{av:'Z9427OMMaqDsc'},{av:'Z9444OMRRCosT'},{av:'Z9445OMEst'},{av:'O9444OMRRCosT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMREPCOD","{handler:'valid_Omrepcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9451OMRRPre',fld:'OMRRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMREPCOD",",oparms:[{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'A9451OMRRPre',fld:'OMRRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMREPPRE","{handler:'valid_Omreppre',iparms:[]");
      setEventMetadata("VALID_OMREPPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRTPO","{handler:'valid_Omrtpo',iparms:[]");
      setEventMetadata("VALID_OMRTPO",",oparms:[]}");
      setEventMetadata("VALID_OMRRCNT","{handler:'valid_Omrrcnt',iparms:[]");
      setEventMetadata("VALID_OMRRCNT",",oparms:[]}");
      setEventMetadata("VALID_OMRRPRE","{handler:'valid_Omrrpre',iparms:[]");
      setEventMetadata("VALID_OMRRPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOS","{handler:'valid_Omrrcos',iparms:[]");
      setEventMetadata("VALID_OMRRCOS",",oparms:[]}");
      setEventMetadata("VALID_OMRCCNT","{handler:'valid_Omrccnt',iparms:[]");
      setEventMetadata("VALID_OMRCCNT",",oparms:[]}");
      setEventMetadata("VALID_OMRCPRE","{handler:'valid_Omrcpre',iparms:[]");
      setEventMetadata("VALID_OMRCPRE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Omrccos',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9445OMEst = "" ;
      Z9426OMMaqCod = "" ;
      O9444OMRRCosT = DecimalUtil.ZERO ;
      Z9449OMRTpo = "" ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      O9450OMRRCnt = DecimalUtil.ZERO ;
      O9471OMRRCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_mode = "" ;
      A9445OMEst = "" ;
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
      A9426OMMaqCod = "" ;
      lblTextblock5_Jsonclick = "" ;
      A9427OMMaqDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9444OMRRCosT = DecimalUtil.ZERO ;
      sMode1233 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV22Pgmname = "" ;
      AV16oOMRRCnt = DecimalUtil.ZERO ;
      AV19nOMRRCnt = DecimalUtil.ZERO ;
      AV20ServerNow = GXutil.resetTime( GXutil.nullDate() );
      AV18MTMovNom = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1232 = "" ;
      s9444OMRRCosT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9447OMRepNom = "" ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      A9449OMRTpo = "" ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      T9450OMRRCnt = DecimalUtil.ZERO ;
      T9471OMRRCos = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z9427OMMaqDsc = "" ;
      Z9444OMRRCosT = DecimalUtil.ZERO ;
      T016H7_A407EmprNom = new String[] {""} ;
      T016H7_n407EmprNom = new boolean[] {false} ;
      T016H10_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H10_n9444OMRRCosT = new boolean[] {false} ;
      T016H8_A9427OMMaqDsc = new String[] {""} ;
      T016H8_n9427OMMaqDsc = new boolean[] {false} ;
      T016H12_A9425OMCod = new int[1] ;
      T016H12_A407EmprNom = new String[] {""} ;
      T016H12_n407EmprNom = new boolean[] {false} ;
      T016H12_A9427OMMaqDsc = new String[] {""} ;
      T016H12_n9427OMMaqDsc = new boolean[] {false} ;
      T016H12_A9445OMEst = new String[] {""} ;
      T016H12_A396EmprCod = new String[] {""} ;
      T016H12_A9426OMMaqCod = new String[] {""} ;
      T016H12_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H12_n9444OMRRCosT = new boolean[] {false} ;
      T016H13_A396EmprCod = new String[] {""} ;
      T016H13_A9425OMCod = new int[1] ;
      T016H6_A9425OMCod = new int[1] ;
      T016H6_A9445OMEst = new String[] {""} ;
      T016H6_A396EmprCod = new String[] {""} ;
      T016H6_A9426OMMaqCod = new String[] {""} ;
      T016H14_A396EmprCod = new String[] {""} ;
      T016H14_A9425OMCod = new int[1] ;
      T016H15_A396EmprCod = new String[] {""} ;
      T016H15_A9425OMCod = new int[1] ;
      T016H5_A9425OMCod = new int[1] ;
      T016H5_A9445OMEst = new String[] {""} ;
      T016H5_A396EmprCod = new String[] {""} ;
      T016H5_A9426OMMaqCod = new String[] {""} ;
      T016H19_A396EmprCod = new String[] {""} ;
      T016H19_A9425OMCod = new int[1] ;
      T016H19_A11446OMMEquCod = new String[] {""} ;
      T016H19_A11447OMMSEqCod = new String[] {""} ;
      T016H19_A11448OMMPieCod = new String[] {""} ;
      T016H20_A396EmprCod = new String[] {""} ;
      T016H20_A9425OMCod = new int[1] ;
      T016H20_A9430TMCod = new int[1] ;
      T016H21_A396EmprCod = new String[] {""} ;
      T016H21_A9425OMCod = new int[1] ;
      T016H21_A9455OMOpeCod = new int[1] ;
      T016H21_A9458OMMTpo = new String[] {""} ;
      T016H22_A396EmprCod = new String[] {""} ;
      T016H22_A9425OMCod = new int[1] ;
      Z9447OMRepNom = "" ;
      Z9448OMRepPre = DecimalUtil.ZERO ;
      T016H23_A9425OMCod = new int[1] ;
      T016H23_A9449OMRTpo = new String[] {""} ;
      T016H23_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H23_A9447OMRepNom = new String[] {""} ;
      T016H23_n9447OMRepNom = new boolean[] {false} ;
      T016H23_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H23_n9448OMRepPre = new boolean[] {false} ;
      T016H23_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H23_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H23_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H23_A396EmprCod = new String[] {""} ;
      T016H23_A9446OMRepCod = new int[1] ;
      T016H4_A9447OMRepNom = new String[] {""} ;
      T016H4_n9447OMRepNom = new boolean[] {false} ;
      T016H4_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H4_n9448OMRepPre = new boolean[] {false} ;
      T016H24_A9447OMRepNom = new String[] {""} ;
      T016H24_n9447OMRepNom = new boolean[] {false} ;
      T016H24_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H24_n9448OMRepPre = new boolean[] {false} ;
      T016H25_A396EmprCod = new String[] {""} ;
      T016H25_A9425OMCod = new int[1] ;
      T016H25_A9446OMRepCod = new int[1] ;
      T016H25_A9449OMRTpo = new String[] {""} ;
      T016H3_A9425OMCod = new int[1] ;
      T016H3_A9449OMRTpo = new String[] {""} ;
      T016H3_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A396EmprCod = new String[] {""} ;
      T016H3_A9446OMRepCod = new int[1] ;
      T016H2_A9425OMCod = new int[1] ;
      T016H2_A9449OMRTpo = new String[] {""} ;
      T016H2_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A396EmprCod = new String[] {""} ;
      T016H2_A9446OMRepCod = new int[1] ;
      T016H29_A9447OMRepNom = new String[] {""} ;
      T016H29_n9447OMRepNom = new boolean[] {false} ;
      T016H29_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H29_n9448OMRepPre = new boolean[] {false} ;
      T016H30_A396EmprCod = new String[] {""} ;
      T016H30_A9425OMCod = new int[1] ;
      T016H30_A9446OMRepCod = new int[1] ;
      T016H30_A9449OMRTpo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      T016H31_A407EmprNom = new String[] {""} ;
      T016H31_n407EmprNom = new boolean[] {false} ;
      T016H33_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H33_n9444OMRRCosT = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9426OMMaqCod = "" ;
      ZZ9427OMMaqDsc = "" ;
      ZZ9444OMRRCosT = DecimalUtil.ZERO ;
      ZZ9445OMEst = "" ;
      ZO9444OMRRCosT = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmordrr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmordrr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmordrr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordrr__default(),
         new Object[] {
             new Object[] {
            T016H2_A9425OMCod, T016H2_A9449OMRTpo, T016H2_A9451OMRRPre, T016H2_A9450OMRRCnt, T016H2_A9452OMRCCnt, T016H2_A9453OMRCPre, T016H2_A396EmprCod, T016H2_A9446OMRepCod
            }
            , new Object[] {
            T016H3_A9425OMCod, T016H3_A9449OMRTpo, T016H3_A9451OMRRPre, T016H3_A9450OMRRCnt, T016H3_A9452OMRCCnt, T016H3_A9453OMRCPre, T016H3_A396EmprCod, T016H3_A9446OMRepCod
            }
            , new Object[] {
            T016H4_A9447OMRepNom, T016H4_n9447OMRepNom, T016H4_A9448OMRepPre, T016H4_n9448OMRepPre
            }
            , new Object[] {
            T016H5_A9425OMCod, T016H5_A9445OMEst, T016H5_A396EmprCod, T016H5_A9426OMMaqCod
            }
            , new Object[] {
            T016H6_A9425OMCod, T016H6_A9445OMEst, T016H6_A396EmprCod, T016H6_A9426OMMaqCod
            }
            , new Object[] {
            T016H7_A407EmprNom, T016H7_n407EmprNom
            }
            , new Object[] {
            T016H8_A9427OMMaqDsc, T016H8_n9427OMMaqDsc
            }
            , new Object[] {
            T016H10_A9444OMRRCosT, T016H10_n9444OMRRCosT
            }
            , new Object[] {
            T016H12_A9425OMCod, T016H12_A407EmprNom, T016H12_n407EmprNom, T016H12_A9427OMMaqDsc, T016H12_n9427OMMaqDsc, T016H12_A9445OMEst, T016H12_A396EmprCod, T016H12_A9426OMMaqCod, T016H12_A9444OMRRCosT, T016H12_n9444OMRRCosT
            }
            , new Object[] {
            T016H13_A396EmprCod, T016H13_A9425OMCod
            }
            , new Object[] {
            T016H14_A396EmprCod, T016H14_A9425OMCod
            }
            , new Object[] {
            T016H15_A396EmprCod, T016H15_A9425OMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016H19_A396EmprCod, T016H19_A9425OMCod, T016H19_A11446OMMEquCod, T016H19_A11447OMMSEqCod, T016H19_A11448OMMPieCod
            }
            , new Object[] {
            T016H20_A396EmprCod, T016H20_A9425OMCod, T016H20_A9430TMCod
            }
            , new Object[] {
            T016H21_A396EmprCod, T016H21_A9425OMCod, T016H21_A9455OMOpeCod, T016H21_A9458OMMTpo
            }
            , new Object[] {
            T016H22_A396EmprCod, T016H22_A9425OMCod
            }
            , new Object[] {
            T016H23_A9425OMCod, T016H23_A9449OMRTpo, T016H23_A9451OMRRPre, T016H23_A9447OMRepNom, T016H23_n9447OMRepNom, T016H23_A9448OMRepPre, T016H23_n9448OMRepPre, T016H23_A9450OMRRCnt, T016H23_A9452OMRCCnt, T016H23_A9453OMRCPre,
            T016H23_A396EmprCod, T016H23_A9446OMRepCod
            }
            , new Object[] {
            T016H24_A9447OMRepNom, T016H24_n9447OMRepNom, T016H24_A9448OMRepPre, T016H24_n9448OMRepPre
            }
            , new Object[] {
            T016H25_A396EmprCod, T016H25_A9425OMCod, T016H25_A9446OMRepCod, T016H25_A9449OMRTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016H29_A9447OMRepNom, T016H29_n9447OMRepNom, T016H29_A9448OMRepPre, T016H29_n9448OMRepPre
            }
            , new Object[] {
            T016H30_A396EmprCod, T016H30_A9425OMCod, T016H30_A9446OMRepCod, T016H30_A9449OMRTpo
            }
            , new Object[] {
            T016H31_A407EmprNom, T016H31_n407EmprNom
            }
            , new Object[] {
            T016H33_A9444OMRRCosT, T016H33_n9444OMRRCosT
            }
         }
      );
      Z9425OMCod = 0 ;
      A9425OMCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV22Pgmname = "TMOrdRR" ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      Z9449OMRTpo = "R" ;
      A9449OMRTpo = "R" ;
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
   private byte GXv_int8[] ;
   private short nRcdDeleted_1233 ;
   private short nRcdExists_1233 ;
   private short nIsMod_1233 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1233 ;
   private short RcdFound1233 ;
   private short nBlankRcdUsr1233 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1233 ;
   private int wcpOA9425OMCod ;
   private int Z9425OMCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z9446OMRepCod ;
   private int A9446OMRepCod ;
   private int A9425OMCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtOMCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtOMMaqCod_Enabled ;
   private int edtOMMaqDsc_Enabled ;
   private int edtOMRRCosT_Enabled ;
   private int edtavnRcdDeleted_1233_Enabled ;
   private int edtOMRepCod_Enabled ;
   private int edtOMRepNom_Enabled ;
   private int edtOMRepPre_Enabled ;
   private int edtOMRRCnt_Enabled ;
   private int edtOMRRPre_Enabled ;
   private int edtOMRRCos_Enabled ;
   private int edtOMRCCnt_Enabled ;
   private int edtOMRCPre_Enabled ;
   private int edtOMRCCos_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV17MTMovCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtOMRRPre_Enabled ;
   private int defcmbOMRTpo_Enabled ;
   private int defedtOMRepCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtOMRRCosT_Backcolor ;
   private int edtOMMaqDsc_Backcolor ;
   private int edtOMMaqCod_Backcolor ;
   private int edtOMCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int ZZ9425OMCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O9444OMRRCosT ;
   private java.math.BigDecimal Z9451OMRRPre ;
   private java.math.BigDecimal Z9450OMRRCnt ;
   private java.math.BigDecimal Z9452OMRCCnt ;
   private java.math.BigDecimal Z9453OMRCPre ;
   private java.math.BigDecimal O9450OMRRCnt ;
   private java.math.BigDecimal O9471OMRRCos ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal B9444OMRRCosT ;
   private java.math.BigDecimal AV16oOMRRCnt ;
   private java.math.BigDecimal AV19nOMRRCnt ;
   private java.math.BigDecimal s9444OMRRCosT ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal T9450OMRRCnt ;
   private java.math.BigDecimal T9471OMRRCos ;
   private java.math.BigDecimal Z9444OMRRCosT ;
   private java.math.BigDecimal Z9448OMRepPre ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal ZZ9444OMRRCosT ;
   private java.math.BigDecimal ZO9444OMRRCosT ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z9445OMEst ;
   private String Z9426OMMaqCod ;
   private String Z9449OMRTpo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_55_idx="0001" ;
   private String Gx_mode ;
   private String A9445OMEst ;
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
   private String edtOMCod_Internalname ;
   private String edtOMCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtOMMaqCod_Internalname ;
   private String A9426OMMaqCod ;
   private String edtOMMaqCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtOMMaqDsc_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRRCosT_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String sMode1233 ;
   private String edtavnRcdDeleted_1233_Internalname ;
   private String edtOMRepCod_Internalname ;
   private String edtOMRepNom_Internalname ;
   private String edtOMRepPre_Internalname ;
   private String edtOMRRCnt_Internalname ;
   private String edtOMRRPre_Internalname ;
   private String edtOMRRCos_Internalname ;
   private String edtOMRCCnt_Internalname ;
   private String edtOMRCPre_Internalname ;
   private String edtOMRCCos_Internalname ;
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
   private String AV22Pgmname ;
   private String AV18MTMovNom ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1232 ;
   private String GXCCtl ;
   private String A9447OMRepNom ;
   private String A9449OMRTpo ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z9447OMRepNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1233_Jsonclick ;
   private String edtOMRepCod_Jsonclick ;
   private String edtOMRepNom_Jsonclick ;
   private String edtOMRepPre_Jsonclick ;
   private String edtOMRRCnt_Jsonclick ;
   private String edtOMRRPre_Jsonclick ;
   private String edtOMRRCos_Jsonclick ;
   private String edtOMRCCnt_Jsonclick ;
   private String edtOMRCPre_Jsonclick ;
   private String edtOMRCCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ9426OMMaqCod ;
   private String ZZ9427OMMaqDsc ;
   private String ZZ9445OMEst ;
   private java.util.Date AV20ServerNow ;
   private java.util.Date GXv_dtime11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9444OMRRCosT ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9427OMMaqDsc ;
   private boolean returnInSub ;
   private boolean n9447OMRepNom ;
   private boolean n9448OMRepPre ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMRTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T016H7_A407EmprNom ;
   private boolean[] T016H7_n407EmprNom ;
   private java.math.BigDecimal[] T016H10_A9444OMRRCosT ;
   private boolean[] T016H10_n9444OMRRCosT ;
   private String[] T016H8_A9427OMMaqDsc ;
   private boolean[] T016H8_n9427OMMaqDsc ;
   private int[] T016H12_A9425OMCod ;
   private String[] T016H12_A407EmprNom ;
   private boolean[] T016H12_n407EmprNom ;
   private String[] T016H12_A9427OMMaqDsc ;
   private boolean[] T016H12_n9427OMMaqDsc ;
   private String[] T016H12_A9445OMEst ;
   private String[] T016H12_A396EmprCod ;
   private String[] T016H12_A9426OMMaqCod ;
   private java.math.BigDecimal[] T016H12_A9444OMRRCosT ;
   private boolean[] T016H12_n9444OMRRCosT ;
   private String[] T016H13_A396EmprCod ;
   private int[] T016H13_A9425OMCod ;
   private int[] T016H6_A9425OMCod ;
   private String[] T016H6_A9445OMEst ;
   private String[] T016H6_A396EmprCod ;
   private String[] T016H6_A9426OMMaqCod ;
   private String[] T016H14_A396EmprCod ;
   private int[] T016H14_A9425OMCod ;
   private String[] T016H15_A396EmprCod ;
   private int[] T016H15_A9425OMCod ;
   private int[] T016H5_A9425OMCod ;
   private String[] T016H5_A9445OMEst ;
   private String[] T016H5_A396EmprCod ;
   private String[] T016H5_A9426OMMaqCod ;
   private String[] T016H19_A396EmprCod ;
   private int[] T016H19_A9425OMCod ;
   private String[] T016H19_A11446OMMEquCod ;
   private String[] T016H19_A11447OMMSEqCod ;
   private String[] T016H19_A11448OMMPieCod ;
   private String[] T016H20_A396EmprCod ;
   private int[] T016H20_A9425OMCod ;
   private int[] T016H20_A9430TMCod ;
   private String[] T016H21_A396EmprCod ;
   private int[] T016H21_A9425OMCod ;
   private int[] T016H21_A9455OMOpeCod ;
   private String[] T016H21_A9458OMMTpo ;
   private String[] T016H22_A396EmprCod ;
   private int[] T016H22_A9425OMCod ;
   private int[] T016H23_A9425OMCod ;
   private String[] T016H23_A9449OMRTpo ;
   private java.math.BigDecimal[] T016H23_A9451OMRRPre ;
   private String[] T016H23_A9447OMRepNom ;
   private boolean[] T016H23_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H23_A9448OMRepPre ;
   private boolean[] T016H23_n9448OMRepPre ;
   private java.math.BigDecimal[] T016H23_A9450OMRRCnt ;
   private java.math.BigDecimal[] T016H23_A9452OMRCCnt ;
   private java.math.BigDecimal[] T016H23_A9453OMRCPre ;
   private String[] T016H23_A396EmprCod ;
   private int[] T016H23_A9446OMRepCod ;
   private String[] T016H4_A9447OMRepNom ;
   private boolean[] T016H4_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H4_A9448OMRepPre ;
   private boolean[] T016H4_n9448OMRepPre ;
   private String[] T016H24_A9447OMRepNom ;
   private boolean[] T016H24_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H24_A9448OMRepPre ;
   private boolean[] T016H24_n9448OMRepPre ;
   private String[] T016H25_A396EmprCod ;
   private int[] T016H25_A9425OMCod ;
   private int[] T016H25_A9446OMRepCod ;
   private String[] T016H25_A9449OMRTpo ;
   private int[] T016H3_A9425OMCod ;
   private String[] T016H3_A9449OMRTpo ;
   private java.math.BigDecimal[] T016H3_A9451OMRRPre ;
   private java.math.BigDecimal[] T016H3_A9450OMRRCnt ;
   private java.math.BigDecimal[] T016H3_A9452OMRCCnt ;
   private java.math.BigDecimal[] T016H3_A9453OMRCPre ;
   private String[] T016H3_A396EmprCod ;
   private int[] T016H3_A9446OMRepCod ;
   private int[] T016H2_A9425OMCod ;
   private String[] T016H2_A9449OMRTpo ;
   private java.math.BigDecimal[] T016H2_A9451OMRRPre ;
   private java.math.BigDecimal[] T016H2_A9450OMRRCnt ;
   private java.math.BigDecimal[] T016H2_A9452OMRCCnt ;
   private java.math.BigDecimal[] T016H2_A9453OMRCPre ;
   private String[] T016H2_A396EmprCod ;
   private int[] T016H2_A9446OMRepCod ;
   private String[] T016H29_A9447OMRepNom ;
   private boolean[] T016H29_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H29_A9448OMRepPre ;
   private boolean[] T016H29_n9448OMRepPre ;
   private String[] T016H30_A396EmprCod ;
   private int[] T016H30_A9425OMCod ;
   private int[] T016H30_A9446OMRepCod ;
   private String[] T016H30_A9449OMRTpo ;
   private String[] T016H31_A407EmprNom ;
   private boolean[] T016H31_n407EmprNom ;
   private java.math.BigDecimal[] T016H33_A9444OMRRCosT ;
   private boolean[] T016H33_n9444OMRRCosT ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmordrr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016H2", "SELECT OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?  FOR UPDATE OF OMRRPre, OMRRCnt, OMRCCnt, OMRCPre NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H3", "SELECT OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H4", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H5", "SELECT OMCod, OMEst, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMEst, OMMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H6", "SELECT OMCod, OMEst, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H8", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H10", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H12", "SELECT /*+ FIRST_ROWS(1) */ TM1.OMCod, T2.EmprNom, T3.MaqDsc AS OMMaqDsc, TM1.OMEst, TM1.EmprCod, TM1.OMMaqCod AS OMMaqCod, COALESCE( T4.OMRRCosT, 0) AS OMRRCosT FROM (((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.OMMaqCod) LEFT JOIN (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016H16", "INSERT INTO TXPMORDEN(OMCod, OMEst, EmprCod, OMMaqCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMNot) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016H17", "UPDATE TXPMORDEN SET OMEst=?, OMMaqCod=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016H18", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T016H19", "SELECT * FROM (SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H20", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H21", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H23", "SELECT T1.OMCod, T1.OMRTpo, T1.OMRRPre, T2.MRNom AS OMRepNom, T2.MRStkPre AS OMRepPre, T1.OMRRCnt, T1.OMRCCnt, T1.OMRCPre, T1.EmprCod, T1.OMRepCod AS OMRepCod FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMRepCod = ? and T1.OMRTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod, T1.OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H24", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H25", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016H26", "INSERT INTO TXPMOrRep(OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, EmprCod, OMRepCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T016H27", "UPDATE TXPMOrRep SET OMRRPre=?, OMRRCnt=?, OMRCCnt=?, OMRCPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T016H28", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new ForEachCursor("T016H29", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H30", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRTpo = 'R' ORDER BY EmprCod, OMCod, OMRepCod, OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H31", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H33", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
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
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 23 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

