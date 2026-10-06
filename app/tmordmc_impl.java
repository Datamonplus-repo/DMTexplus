package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordmc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A9455OMOpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Con Mano de Obra Orden Trabajo", ""), (short)(0)) ;
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

   public tmordmc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordmc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordmc_impl.class ));
   }

   public tmordmc_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
      cmbOMMTpo = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMOrdMC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod de Orden de Mantto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Desc Maquina Ord Mantto", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Costo Total Consumo Mano Obra", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCCosT_Enabled!=0) ? localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999") : localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCosT_Jsonclick, 0, "", "", "", "", "", 1, edtOMMCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdMC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TMOrdMC.htm");
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
         nBlankRcdCount1234 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1234 = (short)(1) ;
            scanStart16D1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               init_level_properties1234( ) ;
               getByPrimaryKey16D1234( ) ;
               addRow16D1234( ) ;
               scanNext16D1234( ) ;
            }
            scanEnd16D1234( ) ;
            nBlankRcdCount1234 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9441OMMCCosT = A9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         standaloneNotModal16D1234( ) ;
         standaloneModal16D1234( ) ;
         sMode1234 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow16D1234( ) ;
            edtavnRcdDeleted_1234_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1234_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1234_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1234_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
            edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMMRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1234 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16D1234( ) ;
            }
            sendRow16D1234( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         nRcdExists_1234 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16D1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551234( ) ;
               init_level_properties1234( ) ;
               standaloneNotModal16D1234( ) ;
               getByPrimaryKey16D1234( ) ;
               standaloneModal16D1234( ) ;
               addRow16D1234( ) ;
               scanNext16D1234( ) ;
            }
            scanEnd16D1234( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1234 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551234( ) ;
      initAll16D1234( ) ;
      init_level_properties1234( ) ;
      B9441OMMCCosT = A9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      nRcdExists_1234 = (short)(0) ;
      nIsMod_1234 = (short)(0) ;
      nRcdDeleted_1234 = (short)(0) ;
      nBlankRcdCount1234 = (short)(nBlankRcdUsr1234+nBlankRcdCount1234) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1234 > 0 )
      {
         standaloneNotModal16D1234( ) ;
         standaloneModal16D1234( ) ;
         addRow16D1234( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtOMOpeCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1234 = (short)(nBlankRcdCount1234-1) ;
      }
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A9441OMMCCosT = B9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMOrdMC.htm");
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
      e1116D2 ();
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
            O9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( "O9441OMMCCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            cmbOMEst.setName( cmbOMEst.getInternalname() );
            cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdMC");
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            forbiddenHiddens.add("OMMaqCod", GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmordmc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        e1116D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216D2 ();
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
         e1216D2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16D1232( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1234_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1234_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes16D1232( ) ;
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

   public void confirm_16D0( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16D1232( ) ;
         }
         else
         {
            checkExtendedTable16D1232( ) ;
            if ( AnyError == 0 )
            {
               zm16D1232( 13) ;
               zm16D1232( 14) ;
               zm16D1232( 15) ;
            }
            closeExtendedTableCursors16D1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_16D1234( ) ;
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
         confirmValues16D0( ) ;
      }
   }

   public void confirm_16D1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16D1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            getKey16D1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               if ( RcdFound1234 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16D1234( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        zm16D1234( 17) ;
                     }
                     closeExtendedTableCursors16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9441OMMCCosT = A9441OMMCCosT ;
                     n9441OMMCCosT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMOPECOD_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( nRcdDeleted_1234 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16D1234( ) ;
                     load16D1234( ) ;
                     beforeValidate16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16D1234( ) ;
                        O9441OMMCCosT = A9441OMMCCosT ;
                        n9441OMMCCosT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16D1234( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16D1234( ) ;
                           if ( AnyError == 0 )
                           {
                              zm16D1234( 17) ;
                           }
                           closeExtendedTableCursors16D1234( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9441OMMCCosT = A9441OMMCCosT ;
                           n9441OMMCCosT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1234_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_55_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1234_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9441OMMCCosT = s9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16D0( )
   {
   }

   public void e1116D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmordmc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV21Pgmname, (byte)(99), GXv_char2) ;
      tmordmc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmordmc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordmc_impl.this.A396EmprCod = GXv_char2[0] ;
      tmordmc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordmc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int5[0] = AV17MTMovCod ;
      GXv_char2[0] = AV18MTMovNom ;
      new app.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      tmordmc_impl.this.A396EmprCod = GXv_char4[0] ;
      tmordmc_impl.this.AV17MTMovCod = GXv_int5[0] ;
      tmordmc_impl.this.AV18MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
   }

   public void e1216D2( )
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

   public void zm16D1232( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9445OMEst = T016D6_A9445OMEst[0] ;
            Z9426OMMaqCod = T016D6_A9426OMMaqCod[0] ;
         }
         else
         {
            Z9445OMEst = A9445OMEst ;
            Z9426OMMaqCod = A9426OMMaqCod ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9445OMEst = A9445OMEst ;
         Z396EmprCod = A396EmprCod ;
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z9441OMMCCosT = A9441OMMCCosT ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      AV21Pgmname = "TMOrdMC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      /* Using cursor T016D7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016D7_A407EmprNom[0] ;
      n407EmprNom = T016D7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T016D10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A9441OMMCCosT = T016D10_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D10_n9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      O9441OMMCCosT = A9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      pr_default.close(7);
   }

   public void standaloneModal( )
   {
      A9445OMEst = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
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
      /* Using cursor T016D8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
      }
      A9427OMMaqDsc = T016D8_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T016D8_n9427OMMaqDsc[0] ;
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

   public void load16D1232( )
   {
      /* Using cursor T016D12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9445OMEst = T016D12_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A407EmprNom = T016D12_A407EmprNom[0] ;
         n407EmprNom = T016D12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9427OMMaqDsc = T016D12_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T016D12_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9426OMMaqCod = T016D12_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9441OMMCCosT = T016D12_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D12_n9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         zm16D1232( -12) ;
      }
      pr_default.close(8);
      onLoadActions16D1232( ) ;
   }

   public void onLoadActions16D1232( )
   {
      O9441OMMCCosT = A9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
   }

   public void checkExtendedTable16D1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors16D1232( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16D1232( )
   {
      /* Using cursor T016D13 */
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
      /* Using cursor T016D6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T016D6_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T016D6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16D1232( 12) ;
         RcdFound1232 = (short)(1) ;
         A9445OMEst = T016D6_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9426OMMaqCod = T016D6_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16D1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey16D1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey16D1232( ) ;
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
      getKey16D1232( ) ;
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
      /* Using cursor T016D14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016D14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D14_A9425OMCod[0] == A9425OMCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016D14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D14_A9425OMCod[0] == A9425OMCod ) )
         {
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016D15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T016D15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D15_A9425OMCod[0] == A9425OMCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T016D15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D15_A9425OMCod[0] == A9425OMCod ) )
         {
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16D1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9441OMMCCosT = O9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         insert16D1232( ) ;
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
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               update16D1232( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               insert16D1232( ) ;
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
                  A9441OMMCCosT = O9441OMMCCosT ;
                  n9441OMMCCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  insert16D1232( ) ;
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
         A9441OMMCCosT = O9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
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
      getKey16D1232( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordmc");
   }

   public void insert_check( )
   {
      confirm_16D0( ) ;
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
      scanStart16D1232( ) ;
      if ( RcdFound1232 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16D1232( ) ;
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
      scanStart16D1232( ) ;
      if ( RcdFound1232 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1232 != 0 )
         {
            scanNext16D1232( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16D1232( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16D1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016D5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9445OMEst, T016D5_A9445OMEst[0]) != 0 ) || ( GXutil.strcmp(Z9426OMMaqCod, T016D5_A9426OMMaqCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9445OMEst, T016D5_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("tmordmc:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T016D5_A9445OMEst[0]);
            }
            if ( GXutil.strcmp(Z9426OMMaqCod, T016D5_A9426OMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tmordmc:[seudo value changed for attri]"+"OMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9426OMMaqCod);
               GXutil.writeLogRaw("Current: ",T016D5_A9426OMMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16D1232( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16D1232( 0) ;
         checkOptimisticConcurrency16D1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16D1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16D1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D16 */
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
                        processLevel16D1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16D0( ) ;
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
            load16D1232( ) ;
         }
         endLevel16D1232( ) ;
      }
      closeExtendedTableCursors16D1232( ) ;
   }

   public void update16D1232( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16D1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16D1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16D1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D17 */
                  pr_default.execute(13, new Object[] {A9445OMEst, A9426OMMaqCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16D1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16D1232( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16D0( ) ;
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
         endLevel16D1232( ) ;
      }
      closeExtendedTableCursors16D1232( ) ;
   }

   public void deferredUpdate16D1232( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16D1232( ) ;
         afterConfirm16D1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16D1232( ) ;
            if ( AnyError == 0 )
            {
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               scanStart16D1234( ) ;
               while ( RcdFound1234 != 0 )
               {
                  getByPrimaryKey16D1234( ) ;
                  delete16D1234( ) ;
                  scanNext16D1234( ) ;
                  O9441OMMCCosT = A9441OMMCCosT ;
                  n9441OMMCCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               }
               scanEnd16D1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D18 */
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
                           initAll16D1232( ) ;
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
                        resetCaption16D0( ) ;
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
      endLevel16D1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16D1232( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T016D19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T016D20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T016D21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T016D22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel16D1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16D1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            standaloneNotModal16D1234( ) ;
            getKey16D1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16D1234( ) ;
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( ( nRcdDeleted_1234 != 0 ) && ( nRcdExists_1234 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16D1234( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16D1234( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9441OMMCCosT = A9441OMMCCosT ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1234_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_55_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1234_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16D1234( ) ;
      if ( AnyError != 0 )
      {
         O9441OMMCCosT = s9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      nRcdExists_1234 = (short)(0) ;
      nIsMod_1234 = (short)(0) ;
      nRcdDeleted_1234 = (short)(0) ;
   }

   public void processLevel16D1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel16D1234( ) ;
      if ( AnyError != 0 )
      {
         O9441OMMCCosT = s9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16D1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmordmc");
         if ( AnyError == 0 )
         {
            confirmValues16D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordmc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16D1232( )
   {
      /* Scan By routine */
      /* Using cursor T016D23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16D1232( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
   }

   public void scanEnd16D1232( )
   {
      pr_default.close(19);
   }

   public void afterConfirm16D1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16D1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16D1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16D1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16D1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16D1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16D1232( )
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
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
   }

   public void zm16D1234( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9462OMMCPre = T016D3_A9462OMMCPre[0] ;
            Z9459OMMRCnt = T016D3_A9459OMMRCnt[0] ;
            Z9460OMMRPre = T016D3_A9460OMMRPre[0] ;
            Z9461OMMCCnt = T016D3_A9461OMMCCnt[0] ;
         }
         else
         {
            Z9462OMMCPre = A9462OMMCPre ;
            Z9459OMMRCnt = A9459OMMRCnt ;
            Z9460OMMRPre = A9460OMMRPre ;
            Z9461OMMCCnt = A9461OMMCCnt ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         Z9462OMMCPre = A9462OMMCPre ;
         Z9459OMMRCnt = A9459OMMRCnt ;
         Z9460OMMRPre = A9460OMMRPre ;
         Z9461OMMCCnt = A9461OMMCCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9456OMOpeNom = A9456OMOpeNom ;
         Z9457OMOpePre = A9457OMOpePre ;
      }
   }

   public void standaloneNotModal16D1234( )
   {
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void standaloneModal16D1234( )
   {
      if ( isIns( )  )
      {
         A9458OMMTpo = httpContext.getMessage( httpContext.getMessage( "C", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtOMOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load16D1234( )
   {
      /* Using cursor T016D24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9462OMMCPre = T016D24_A9462OMMCPre[0] ;
         A9456OMOpeNom = T016D24_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T016D24_n9456OMOpeNom[0] ;
         A9457OMOpePre = T016D24_A9457OMOpePre[0] ;
         n9457OMOpePre = T016D24_n9457OMOpePre[0] ;
         A9459OMMRCnt = T016D24_A9459OMMRCnt[0] ;
         A9460OMMRPre = T016D24_A9460OMMRPre[0] ;
         A9461OMMCCnt = T016D24_A9461OMMCCnt[0] ;
         zm16D1234( -16) ;
      }
      pr_default.close(20);
      onLoadActions16D1234( ) ;
   }

   public void onLoadActions16D1234( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      O9463OMMCCos = A9463OMMCCos ;
      if ( isIns( )  )
      {
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
   }

   public void checkExtendedTable16D1234( )
   {
      nIsDirty_1234 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal16D1234( ) ;
      /* Using cursor T016D4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T016D4_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016D4_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016D4_A9457OMOpePre[0] ;
      n9457OMOpePre = T016D4_n9457OMOpePre[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1234 = (short)(1) ;
         A9462OMMCPre = A9457OMOpePre ;
      }
      nIsDirty_1234 = (short)(1) ;
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      nIsDirty_1234 = (short)(1) ;
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1234 = (short)(1) ;
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1234 = (short)(1) ;
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1234 = (short)(1) ;
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
   }

   public void closeExtendedTableCursors16D1234( )
   {
      pr_default.close(2);
   }

   public void enableDisable16D1234( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          int A9455OMOpeCod )
   {
      /* Using cursor T016D25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T016D25_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016D25_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016D25_A9457OMOpePre[0] ;
      n9457OMOpePre = T016D25_n9457OMOpePre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9456OMOpeNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey16D1234( )
   {
      /* Using cursor T016D26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1234 = (short)(1) ;
      }
      else
      {
         RcdFound1234 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey16D1234( )
   {
      /* Using cursor T016D3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(1) != 101) && ( T016D3_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T016D3_A9458OMMTpo[0], "C") == 0 ) && ( GXutil.strcmp(T016D3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16D1234( 16) ;
         RcdFound1234 = (short)(1) ;
         initializeNonKey16D1234( ) ;
         A9458OMMTpo = T016D3_A9458OMMTpo[0] ;
         A9462OMMCPre = T016D3_A9462OMMCPre[0] ;
         A9459OMMRCnt = T016D3_A9459OMMRCnt[0] ;
         A9460OMMRPre = T016D3_A9460OMMRPre[0] ;
         A9461OMMCCnt = T016D3_A9461OMMCCnt[0] ;
         A9455OMOpeCod = T016D3_A9455OMOpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16D1234( ) ;
         load16D1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1234 = (short)(0) ;
         initializeNonKey16D1234( ) ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16D1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16D1234( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16D1234( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9462OMMCPre, T016D2_A9462OMMCPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9459OMMRCnt, T016D2_A9459OMMRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9460OMMRPre, T016D2_A9460OMMRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9461OMMCCnt, T016D2_A9461OMMCCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9462OMMCPre, T016D2_A9462OMMCPre[0]) != 0 )
            {
               GXutil.writeLogln("tmordmc:[seudo value changed for attri]"+"OMMCPre");
               GXutil.writeLogRaw("Old: ",Z9462OMMCPre);
               GXutil.writeLogRaw("Current: ",T016D2_A9462OMMCPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9459OMMRCnt, T016D2_A9459OMMRCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordmc:[seudo value changed for attri]"+"OMMRCnt");
               GXutil.writeLogRaw("Old: ",Z9459OMMRCnt);
               GXutil.writeLogRaw("Current: ",T016D2_A9459OMMRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9460OMMRPre, T016D2_A9460OMMRPre[0]) != 0 )
            {
               GXutil.writeLogln("tmordmc:[seudo value changed for attri]"+"OMMRPre");
               GXutil.writeLogRaw("Old: ",Z9460OMMRPre);
               GXutil.writeLogRaw("Current: ",T016D2_A9460OMMRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9461OMMCCnt, T016D2_A9461OMMCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordmc:[seudo value changed for attri]"+"OMMCCnt");
               GXutil.writeLogRaw("Old: ",Z9461OMMCCnt);
               GXutil.writeLogRaw("Current: ",T016D2_A9461OMMCCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16D1234( )
   {
      beforeValidate16D1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16D1234( 0) ;
         checkOptimisticConcurrency16D1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16D1234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16D1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D27 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A9425OMCod), A9458OMMTpo, A9462OMMCPre, A9459OMMRCnt, A9460OMMRPre, A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
            load16D1234( ) ;
         }
         endLevel16D1234( ) ;
      }
      closeExtendedTableCursors16D1234( ) ;
   }

   public void update16D1234( )
   {
      beforeValidate16D1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1234( ) ;
      }
      if ( ( nIsMod_1234 != 0 ) || ( nIsDirty_1234 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16D1234( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16D1234( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16D1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016D28 */
                     pr_default.execute(24, new Object[] {A9462OMMCPre, A9459OMMRCnt, A9460OMMRPre, A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16D1234( ) ;
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
            endLevel16D1234( ) ;
         }
      }
      closeExtendedTableCursors16D1234( ) ;
   }

   public void deferredUpdate16D1234( )
   {
   }

   public void delete16D1234( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16D1234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16D1234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16D1234( ) ;
         afterConfirm16D1234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16D1234( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016D29 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
      sMode1234 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16D1234( ) ;
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16D1234( )
   {
      standaloneModal16D1234( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016D30 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T016D30_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T016D30_n9456OMOpeNom[0] ;
         A9457OMOpePre = T016D30_A9457OMOpePre[0] ;
         n9457OMOpePre = T016D30_n9457OMOpePre[0] ;
         pr_default.close(26);
         A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
         A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
         if ( isIns( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
                  n9441OMMCCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T016D31 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void endLevel16D1234( )
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

   public void scanStart16D1234( )
   {
      /* Scan By routine */
      /* Using cursor T016D32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T016D32_A9455OMOpeCod[0] ;
         A9458OMMTpo = T016D32_A9458OMMTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16D1234( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T016D32_A9455OMOpeCod[0] ;
         A9458OMMTpo = T016D32_A9458OMMTpo[0] ;
      }
   }

   public void scanEnd16D1234( )
   {
      pr_default.close(28);
   }

   public void afterConfirm16D1234( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
   }

   public void beforeInsert16D1234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16D1234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16D1234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16D1234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16D1234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16D1234( )
   {
      edtOMOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMOpePre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMRCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOMMCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes16D1234( )
   {
   }

   public void send_integrity_lvl_hashes16D1232( )
   {
   }

   public void subsflControlProps_551234( )
   {
      edtavnRcdDeleted_1234_Internalname = "vNRCDDELETED_1234_"+sGXsfl_55_idx ;
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_55_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_55_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_55_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_55_idx );
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_55_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_55_idx ;
      edtOMMRCos_Internalname = "OMMRCOS_"+sGXsfl_55_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_55_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_55_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551234( )
   {
      edtavnRcdDeleted_1234_Internalname = "vNRCDDELETED_1234_"+sGXsfl_55_fel_idx ;
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_55_fel_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_55_fel_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_55_fel_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_55_fel_idx );
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_55_fel_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_55_fel_idx ;
      edtOMMRCos_Internalname = "OMMRCOS_"+sGXsfl_55_fel_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_55_fel_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_55_fel_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_55_fel_idx ;
   }

   public void addRow16D1234( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551234( ) ;
      sendRow16D1234( ) ;
   }

   public void sendRow16D1234( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1234_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1234_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1234), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1234), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1234_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1234_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeNom_Internalname,GXutil.rtrim( A9456OMOpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpePre_Internalname,GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMOpePre_Enabled!=0) ? localUtil.format( A9457OMOpePre, "ZZZZZ9.999") : localUtil.format( A9457OMOpePre, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpePre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMOpePre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMMTPO_" + sGXsfl_55_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9458OMMTpo)==0) )
         {
            A9458OMMTpo = "C" ;
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMMTpo,cmbOMMTpo.getInternalname(),GXutil.rtrim( A9458OMMTpo),Integer.valueOf(1),cmbOMMTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMMTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Values", cmbOMMTpo.ToJavascriptSource(), !bGXsfl_55_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCnt_Enabled!=0) ? localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRPre_Enabled!=0) ? localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMRPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCos_Enabled!=0) ? localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999") : localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCnt_Enabled!=0) ? localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCPre_Enabled!=0) ? localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCos_Enabled!=0) ? localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999") : localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMCCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16D1234( ) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9458OMMTpo));
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9463OMMCCos_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1234_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1234_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1234_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPENOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPEPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCOS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16D1234( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551234( ) ;
      edtavnRcdDeleted_1234_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1234_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1234_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1234_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1234");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1234_Internalname ;
         wbErr = true ;
         nRcdDeleted_1234 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1234 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1234_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         wbErr = true ;
         A9455OMOpeCod = 0 ;
      }
      else
      {
         A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9456OMOpeNom = httpContext.cgiGet( edtOMOpeNom_Internalname) ;
      n9456OMOpeNom = false ;
      A9457OMOpePre = localUtil.ctond( httpContext.cgiGet( edtOMOpePre_Internalname)) ;
      n9457OMOpePre = false ;
      cmbOMMTpo.setName( cmbOMMTpo.getInternalname() );
      cmbOMMTpo.setValue( httpContext.cgiGet( cmbOMMTpo.getInternalname()) );
      A9458OMMTpo = httpContext.cgiGet( cmbOMMTpo.getInternalname()) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMRCNT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMRCnt_Internalname ;
         wbErr = true ;
         A9459OMMRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMRPRE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMRPre_Internalname ;
         wbErr = true ;
         A9460OMMRPre = DecimalUtil.ZERO ;
      }
      else
      {
         A9460OMMRPre = localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)) ;
      }
      A9472OMMRCos = localUtil.ctond( httpContext.cgiGet( edtOMMRCos_Internalname)) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMCCNT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMCCnt_Internalname ;
         wbErr = true ;
         A9461OMMCCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)) ;
      }
      A9462OMMCPre = localUtil.ctond( httpContext.cgiGet( edtOMMCPre_Internalname)) ;
      A9463OMMCCos = localUtil.ctond( httpContext.cgiGet( edtOMMCCos_Internalname)) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_55_idx ;
      Z9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_55_idx ;
      Z9458OMMTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_55_idx ;
      Z9462OMMCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_55_idx ;
      Z9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_55_idx ;
      Z9460OMMRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_55_idx ;
      Z9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9463OMMCCos_" + sGXsfl_55_idx ;
      O9463OMMCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_55_idx ;
      nRcdDeleted_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1234_" + sGXsfl_55_idx ;
      nRcdExists_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1234_" + sGXsfl_55_idx ;
      nIsMod_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOMMCPre_Enabled = edtOMMCPre_Enabled ;
      defcmbOMMTpo_Enabled = cmbOMMTpo.getEnabled() ;
      defedtOMOpeCod_Enabled = edtOMOpeCod_Enabled ;
   }

   public void confirmValues16D0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551234( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551234( ) ;
         httpContext.changePostValue( "Z9455OMOpeCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9458OMMTpo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9458OMMTpo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9462OMMCPre_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9462OMMCPre_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9459OMMRCnt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9460OMMRPre_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9460OMMRPre_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9461OMMCCnt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_55_idx) ;
      }
      httpContext.changePostValue( "O9463OMMCCos", httpContext.cgiGet( "T9463OMMCCos")) ;
      httpContext.deletePostValue( "T9463OMMCCos") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmordmc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0))}, new String[] {"EmprCod","OMCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdMC");
      forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
      forbiddenHiddens.add("OMMaqCod", GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmordmc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "O9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( O9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
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
      return formatLink("app.tmordmc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0))}, new String[] {"EmprCod","OMCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMOrdMC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Con Mano de Obra Orden Trabajo", "") ;
   }

   public void initializeNonKey16D1232( )
   {
      A9445OMEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      A9426OMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      O9441OMMCCosT = A9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      Z9445OMEst = "" ;
      Z9426OMMaqCod = "" ;
   }

   public void initAll16D1232( )
   {
      initializeNonKey16D1232( ) ;
   }

   public void standaloneModalInsert( )
   {
      A9445OMEst = i9445OMEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
   }

   public void initializeNonKey16D1234( )
   {
      A9463OMMCCos = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9456OMOpeNom = "" ;
      n9456OMOpeNom = false ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      n9457OMOpePre = false ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      O9463OMMCCos = A9463OMMCCos ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
   }

   public void initAll16D1234( )
   {
      A9455OMOpeCod = 0 ;
      A9458OMMTpo = "C" ;
      initializeNonKey16D1234( ) ;
   }

   public void standaloneModalInsert16D1234( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251911261", true, true);
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
      httpContext.AddJavascriptSource("tmordmc.js", "?20261251911261", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1234( )
   {
      edtOMMCPre_Enabled = defedtOMMCPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      cmbOMMTpo.setEnabled( defcmbOMMTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_55_Refreshing);
      edtOMOpeCod_Enabled = defedtOMOpeCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9456OMOpeNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9458OMMTpo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtavnRcdDeleted_1234_Internalname = "vNRCDDELETED_1234" ;
      edtOMOpeCod_Internalname = "OMOPECOD" ;
      edtOMOpeNom_Internalname = "OMOPENOM" ;
      edtOMOpePre_Internalname = "OMOPEPRE" ;
      cmbOMMTpo.setInternalname( "OMMTPO" );
      edtOMMRCnt_Internalname = "OMMRCNT" ;
      edtOMMRPre_Internalname = "OMMRPRE" ;
      edtOMMRCos_Internalname = "OMMRCOS" ;
      edtOMMCCnt_Internalname = "OMMCCNT" ;
      edtOMMCPre_Internalname = "OMMCPRE" ;
      edtOMMCCos_Internalname = "OMMCCOS" ;
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
      Form.setCaption( httpContext.getMessage( "Con Mano de Obra Orden Trabajo", "") );
      edtOMMCCos_Jsonclick = "" ;
      edtOMMCPre_Jsonclick = "" ;
      edtOMMCCnt_Jsonclick = "" ;
      edtOMMRCos_Jsonclick = "" ;
      edtOMMRPre_Jsonclick = "" ;
      edtOMMRCnt_Jsonclick = "" ;
      cmbOMMTpo.setJsonclick( "" );
      edtOMOpePre_Jsonclick = "" ;
      edtOMOpeNom_Jsonclick = "" ;
      edtOMOpeCod_Jsonclick = "" ;
      edtavnRcdDeleted_1234_Jsonclick = "" ;
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
      edtOMMCCos_Enabled = 0 ;
      edtOMMCPre_Enabled = 0 ;
      edtOMMCCnt_Enabled = 1 ;
      edtOMMRCos_Enabled = 0 ;
      edtOMMRPre_Enabled = 1 ;
      edtOMMRCnt_Enabled = 1 ;
      cmbOMMTpo.setEnabled( 0 );
      edtOMOpePre_Enabled = 0 ;
      edtOMOpeNom_Enabled = 0 ;
      edtOMOpeCod_Enabled = 1 ;
      edtavnRcdDeleted_1234_Enabled = 1 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      cmbOMEst.setIBackground( (int)(0xFFFFFF) );
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMCCosT_Backcolor = (int)(0xFFFFFF) ;
      edtOMMCCosT_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_551234( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16D1234( ) ;
         standaloneModal16D1234( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16D1234( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551234( ) ;
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
      GXCCtl = "OMMTPO_" + sGXsfl_55_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9458OMMTpo)==0) )
         {
            A9458OMMTpo = "C" ;
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T016D33 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016D33_A407EmprNom[0] ;
      n407EmprNom = T016D33_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(29);
      /* Using cursor T016D35 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         A9441OMMCCosT = T016D35_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D35_n9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      pr_default.close(30);
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
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", GXutil.rtrim( A9445OMEst));
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", GXutil.rtrim( A9426OMMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", GXutil.rtrim( A9427OMMaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9427OMMaqDsc", GXutil.rtrim( Z9427OMMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( Z9441OMMCCosT, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( O9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Omopecod( )
   {
      n9457OMOpePre = false ;
      n9456OMOpeNom = false ;
      /* Using cursor T016D30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
      }
      A9456OMOpeNom = T016D30_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016D30_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016D30_A9457OMOpePre[0] ;
      n9457OMOpePre = T016D30_n9457OMOpePre[0] ;
      pr_default.close(26);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
      dynload_actions( ) ;
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", GXutil.rtrim( A9456OMOpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9457OMOpePre", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9462OMMCPre", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(12), (byte)(3), ".", "")));
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
      setEventMetadata("AFTER TRN","{handler:'e1216D2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''}]");
      setEventMetadata("VALID_OMCOD",",oparms:[{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9425OMCod'},{av:'Z9445OMEst'},{av:'Z407EmprNom'},{av:'Z9426OMMaqCod'},{av:'Z9427OMMaqDsc'},{av:'Z9441OMMCCosT'},{av:'O9441OMMCCosT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMOPECOD","{handler:'valid_Omopecod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMOPECOD",",oparms:[{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMOPEPRE","{handler:'valid_Omopepre',iparms:[]");
      setEventMetadata("VALID_OMOPEPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMTPO","{handler:'valid_Ommtpo',iparms:[]");
      setEventMetadata("VALID_OMMTPO",",oparms:[]}");
      setEventMetadata("VALID_OMMRCNT","{handler:'valid_Ommrcnt',iparms:[]");
      setEventMetadata("VALID_OMMRCNT",",oparms:[]}");
      setEventMetadata("VALID_OMMRPRE","{handler:'valid_Ommrpre',iparms:[]");
      setEventMetadata("VALID_OMMRPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMCCNT","{handler:'valid_Ommccnt',iparms:[]");
      setEventMetadata("VALID_OMMCCNT",",oparms:[]}");
      setEventMetadata("VALID_OMMCPRE","{handler:'valid_Ommcpre',iparms:[]");
      setEventMetadata("VALID_OMMCPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOS","{handler:'valid_Ommccos',iparms:[]");
      setEventMetadata("VALID_OMMCCOS",",oparms:[]}");
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
      pr_default.close(26);
      pr_default.close(29);
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9445OMEst = "" ;
      Z9426OMMaqCod = "" ;
      O9441OMMCCosT = DecimalUtil.ZERO ;
      Z9458OMMTpo = "" ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      O9463OMMCCos = DecimalUtil.ZERO ;
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
      A9441OMMCCosT = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9441OMMCCosT = DecimalUtil.ZERO ;
      sMode1234 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV21Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1232 = "" ;
      s9441OMMCCosT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9456OMOpeNom = "" ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9458OMMTpo = "" ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      T9463OMMCCos = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV18MTMovNom = "" ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z9427OMMaqDsc = "" ;
      Z9441OMMCCosT = DecimalUtil.ZERO ;
      T016D7_A407EmprNom = new String[] {""} ;
      T016D7_n407EmprNom = new boolean[] {false} ;
      T016D10_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D10_n9441OMMCCosT = new boolean[] {false} ;
      T016D8_A9427OMMaqDsc = new String[] {""} ;
      T016D8_n9427OMMaqDsc = new boolean[] {false} ;
      T016D12_A9425OMCod = new int[1] ;
      T016D12_A9445OMEst = new String[] {""} ;
      T016D12_A407EmprNom = new String[] {""} ;
      T016D12_n407EmprNom = new boolean[] {false} ;
      T016D12_A9427OMMaqDsc = new String[] {""} ;
      T016D12_n9427OMMaqDsc = new boolean[] {false} ;
      T016D12_A396EmprCod = new String[] {""} ;
      T016D12_A9426OMMaqCod = new String[] {""} ;
      T016D12_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D12_n9441OMMCCosT = new boolean[] {false} ;
      T016D13_A396EmprCod = new String[] {""} ;
      T016D13_A9425OMCod = new int[1] ;
      T016D6_A9425OMCod = new int[1] ;
      T016D6_A9445OMEst = new String[] {""} ;
      T016D6_A396EmprCod = new String[] {""} ;
      T016D6_A9426OMMaqCod = new String[] {""} ;
      T016D14_A396EmprCod = new String[] {""} ;
      T016D14_A9425OMCod = new int[1] ;
      T016D15_A396EmprCod = new String[] {""} ;
      T016D15_A9425OMCod = new int[1] ;
      T016D5_A9425OMCod = new int[1] ;
      T016D5_A9445OMEst = new String[] {""} ;
      T016D5_A396EmprCod = new String[] {""} ;
      T016D5_A9426OMMaqCod = new String[] {""} ;
      T016D19_A396EmprCod = new String[] {""} ;
      T016D19_A9425OMCod = new int[1] ;
      T016D19_A11446OMMEquCod = new String[] {""} ;
      T016D19_A11447OMMSEqCod = new String[] {""} ;
      T016D19_A11448OMMPieCod = new String[] {""} ;
      T016D20_A396EmprCod = new String[] {""} ;
      T016D20_A9425OMCod = new int[1] ;
      T016D20_A9430TMCod = new int[1] ;
      T016D21_A396EmprCod = new String[] {""} ;
      T016D21_A9425OMCod = new int[1] ;
      T016D21_A9455OMOpeCod = new int[1] ;
      T016D21_A9458OMMTpo = new String[] {""} ;
      T016D21_A9466OMMCLin = new short[1] ;
      T016D22_A396EmprCod = new String[] {""} ;
      T016D22_A9425OMCod = new int[1] ;
      T016D22_A9446OMRepCod = new int[1] ;
      T016D22_A9449OMRTpo = new String[] {""} ;
      T016D23_A396EmprCod = new String[] {""} ;
      T016D23_A9425OMCod = new int[1] ;
      Z9456OMOpeNom = "" ;
      Z9457OMOpePre = DecimalUtil.ZERO ;
      T016D24_A9425OMCod = new int[1] ;
      T016D24_A9458OMMTpo = new String[] {""} ;
      T016D24_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D24_A9456OMOpeNom = new String[] {""} ;
      T016D24_n9456OMOpeNom = new boolean[] {false} ;
      T016D24_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D24_n9457OMOpePre = new boolean[] {false} ;
      T016D24_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D24_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D24_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D24_A396EmprCod = new String[] {""} ;
      T016D24_A9455OMOpeCod = new int[1] ;
      T016D4_A9456OMOpeNom = new String[] {""} ;
      T016D4_n9456OMOpeNom = new boolean[] {false} ;
      T016D4_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D4_n9457OMOpePre = new boolean[] {false} ;
      T016D25_A9456OMOpeNom = new String[] {""} ;
      T016D25_n9456OMOpeNom = new boolean[] {false} ;
      T016D25_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D25_n9457OMOpePre = new boolean[] {false} ;
      T016D26_A396EmprCod = new String[] {""} ;
      T016D26_A9425OMCod = new int[1] ;
      T016D26_A9455OMOpeCod = new int[1] ;
      T016D26_A9458OMMTpo = new String[] {""} ;
      T016D3_A9425OMCod = new int[1] ;
      T016D3_A9458OMMTpo = new String[] {""} ;
      T016D3_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A396EmprCod = new String[] {""} ;
      T016D3_A9455OMOpeCod = new int[1] ;
      T016D2_A9425OMCod = new int[1] ;
      T016D2_A9458OMMTpo = new String[] {""} ;
      T016D2_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A396EmprCod = new String[] {""} ;
      T016D2_A9455OMOpeCod = new int[1] ;
      T016D30_A9456OMOpeNom = new String[] {""} ;
      T016D30_n9456OMOpeNom = new boolean[] {false} ;
      T016D30_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D30_n9457OMOpePre = new boolean[] {false} ;
      T016D31_A396EmprCod = new String[] {""} ;
      T016D31_A9425OMCod = new int[1] ;
      T016D31_A9455OMOpeCod = new int[1] ;
      T016D31_A9458OMMTpo = new String[] {""} ;
      T016D31_A9466OMMCLin = new short[1] ;
      T016D32_A396EmprCod = new String[] {""} ;
      T016D32_A9425OMCod = new int[1] ;
      T016D32_A9455OMOpeCod = new int[1] ;
      T016D32_A9458OMMTpo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9445OMEst = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016D33_A407EmprNom = new String[] {""} ;
      T016D33_n407EmprNom = new boolean[] {false} ;
      T016D35_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D35_n9441OMMCCosT = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9445OMEst = "" ;
      ZZ407EmprNom = "" ;
      ZZ9426OMMaqCod = "" ;
      ZZ9427OMMaqDsc = "" ;
      ZZ9441OMMCCosT = DecimalUtil.ZERO ;
      ZO9441OMMCCosT = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmordmc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmordmc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmordmc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordmc__default(),
         new Object[] {
             new Object[] {
            T016D2_A9425OMCod, T016D2_A9458OMMTpo, T016D2_A9462OMMCPre, T016D2_A9459OMMRCnt, T016D2_A9460OMMRPre, T016D2_A9461OMMCCnt, T016D2_A396EmprCod, T016D2_A9455OMOpeCod
            }
            , new Object[] {
            T016D3_A9425OMCod, T016D3_A9458OMMTpo, T016D3_A9462OMMCPre, T016D3_A9459OMMRCnt, T016D3_A9460OMMRPre, T016D3_A9461OMMCCnt, T016D3_A396EmprCod, T016D3_A9455OMOpeCod
            }
            , new Object[] {
            T016D4_A9456OMOpeNom, T016D4_n9456OMOpeNom, T016D4_A9457OMOpePre, T016D4_n9457OMOpePre
            }
            , new Object[] {
            T016D5_A9425OMCod, T016D5_A9445OMEst, T016D5_A396EmprCod, T016D5_A9426OMMaqCod
            }
            , new Object[] {
            T016D6_A9425OMCod, T016D6_A9445OMEst, T016D6_A396EmprCod, T016D6_A9426OMMaqCod
            }
            , new Object[] {
            T016D7_A407EmprNom, T016D7_n407EmprNom
            }
            , new Object[] {
            T016D8_A9427OMMaqDsc, T016D8_n9427OMMaqDsc
            }
            , new Object[] {
            T016D10_A9441OMMCCosT, T016D10_n9441OMMCCosT
            }
            , new Object[] {
            T016D12_A9425OMCod, T016D12_A9445OMEst, T016D12_A407EmprNom, T016D12_n407EmprNom, T016D12_A9427OMMaqDsc, T016D12_n9427OMMaqDsc, T016D12_A396EmprCod, T016D12_A9426OMMaqCod, T016D12_A9441OMMCCosT, T016D12_n9441OMMCCosT
            }
            , new Object[] {
            T016D13_A396EmprCod, T016D13_A9425OMCod
            }
            , new Object[] {
            T016D14_A396EmprCod, T016D14_A9425OMCod
            }
            , new Object[] {
            T016D15_A396EmprCod, T016D15_A9425OMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016D19_A396EmprCod, T016D19_A9425OMCod, T016D19_A11446OMMEquCod, T016D19_A11447OMMSEqCod, T016D19_A11448OMMPieCod
            }
            , new Object[] {
            T016D20_A396EmprCod, T016D20_A9425OMCod, T016D20_A9430TMCod
            }
            , new Object[] {
            T016D21_A396EmprCod, T016D21_A9425OMCod, T016D21_A9455OMOpeCod, T016D21_A9458OMMTpo, T016D21_A9466OMMCLin
            }
            , new Object[] {
            T016D22_A396EmprCod, T016D22_A9425OMCod, T016D22_A9446OMRepCod, T016D22_A9449OMRTpo
            }
            , new Object[] {
            T016D23_A396EmprCod, T016D23_A9425OMCod
            }
            , new Object[] {
            T016D24_A9425OMCod, T016D24_A9458OMMTpo, T016D24_A9462OMMCPre, T016D24_A9456OMOpeNom, T016D24_n9456OMOpeNom, T016D24_A9457OMOpePre, T016D24_n9457OMOpePre, T016D24_A9459OMMRCnt, T016D24_A9460OMMRPre, T016D24_A9461OMMCCnt,
            T016D24_A396EmprCod, T016D24_A9455OMOpeCod
            }
            , new Object[] {
            T016D25_A9456OMOpeNom, T016D25_n9456OMOpeNom, T016D25_A9457OMOpePre, T016D25_n9457OMOpePre
            }
            , new Object[] {
            T016D26_A396EmprCod, T016D26_A9425OMCod, T016D26_A9455OMOpeCod, T016D26_A9458OMMTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016D30_A9456OMOpeNom, T016D30_n9456OMOpeNom, T016D30_A9457OMOpePre, T016D30_n9457OMOpePre
            }
            , new Object[] {
            T016D31_A396EmprCod, T016D31_A9425OMCod, T016D31_A9455OMOpeCod, T016D31_A9458OMMTpo, T016D31_A9466OMMCLin
            }
            , new Object[] {
            T016D32_A396EmprCod, T016D32_A9425OMCod, T016D32_A9455OMOpeCod, T016D32_A9458OMMTpo
            }
            , new Object[] {
            T016D33_A407EmprNom, T016D33_n407EmprNom
            }
            , new Object[] {
            T016D35_A9441OMMCCosT, T016D35_n9441OMMCCosT
            }
         }
      );
      Z9425OMCod = 0 ;
      A9425OMCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "TMOrdMC" ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      Z9458OMMTpo = "C" ;
      A9458OMMTpo = "C" ;
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
   private short nRcdDeleted_1234 ;
   private short nRcdExists_1234 ;
   private short nIsMod_1234 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1234 ;
   private short RcdFound1234 ;
   private short nBlankRcdUsr1234 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1234 ;
   private int wcpOA9425OMCod ;
   private int Z9425OMCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z9455OMOpeCod ;
   private int A9455OMOpeCod ;
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
   private int edtOMMCCosT_Enabled ;
   private int edtavnRcdDeleted_1234_Enabled ;
   private int edtOMOpeCod_Enabled ;
   private int edtOMOpeNom_Enabled ;
   private int edtOMOpePre_Enabled ;
   private int edtOMMRCnt_Enabled ;
   private int edtOMMRPre_Enabled ;
   private int edtOMMRCos_Enabled ;
   private int edtOMMCCnt_Enabled ;
   private int edtOMMCPre_Enabled ;
   private int edtOMMCCos_Enabled ;
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
   private int GXv_int5[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtOMMCPre_Enabled ;
   private int defcmbOMMTpo_Enabled ;
   private int defedtOMOpeCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtOMMCCosT_Backcolor ;
   private int edtOMMaqDsc_Backcolor ;
   private int edtOMMaqCod_Backcolor ;
   private int edtOMCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ9425OMCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O9441OMMCCosT ;
   private java.math.BigDecimal Z9462OMMCPre ;
   private java.math.BigDecimal Z9459OMMRCnt ;
   private java.math.BigDecimal Z9460OMMRPre ;
   private java.math.BigDecimal Z9461OMMCCnt ;
   private java.math.BigDecimal O9463OMMCCos ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal B9441OMMCCosT ;
   private java.math.BigDecimal s9441OMMCCosT ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9472OMMRCos ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal T9463OMMCCos ;
   private java.math.BigDecimal Z9441OMMCCosT ;
   private java.math.BigDecimal Z9457OMOpePre ;
   private java.math.BigDecimal ZZ9441OMMCCosT ;
   private java.math.BigDecimal ZO9441OMMCCosT ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z9445OMEst ;
   private String Z9426OMMaqCod ;
   private String Z9458OMMTpo ;
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
   private String edtOMMCCosT_Internalname ;
   private String edtOMMCCosT_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String sMode1234 ;
   private String edtavnRcdDeleted_1234_Internalname ;
   private String edtOMOpeCod_Internalname ;
   private String edtOMOpeNom_Internalname ;
   private String edtOMOpePre_Internalname ;
   private String edtOMMRCnt_Internalname ;
   private String edtOMMRPre_Internalname ;
   private String edtOMMRCos_Internalname ;
   private String edtOMMCCnt_Internalname ;
   private String edtOMMCPre_Internalname ;
   private String edtOMMCCos_Internalname ;
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
   private String AV21Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1232 ;
   private String GXCCtl ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV18MTMovNom ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z9456OMOpeNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1234_Jsonclick ;
   private String edtOMOpeCod_Jsonclick ;
   private String edtOMOpeNom_Jsonclick ;
   private String edtOMOpePre_Jsonclick ;
   private String edtOMMRCnt_Jsonclick ;
   private String edtOMMRPre_Jsonclick ;
   private String edtOMMRCos_Jsonclick ;
   private String edtOMMCCnt_Jsonclick ;
   private String edtOMMCPre_Jsonclick ;
   private String edtOMMCCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9445OMEst ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ9445OMEst ;
   private String ZZ407EmprNom ;
   private String ZZ9426OMMaqCod ;
   private String ZZ9427OMMaqDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9441OMMCCosT ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9427OMMaqDsc ;
   private boolean returnInSub ;
   private boolean n9456OMOpeNom ;
   private boolean n9457OMOpePre ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMMTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T016D7_A407EmprNom ;
   private boolean[] T016D7_n407EmprNom ;
   private java.math.BigDecimal[] T016D10_A9441OMMCCosT ;
   private boolean[] T016D10_n9441OMMCCosT ;
   private String[] T016D8_A9427OMMaqDsc ;
   private boolean[] T016D8_n9427OMMaqDsc ;
   private int[] T016D12_A9425OMCod ;
   private String[] T016D12_A9445OMEst ;
   private String[] T016D12_A407EmprNom ;
   private boolean[] T016D12_n407EmprNom ;
   private String[] T016D12_A9427OMMaqDsc ;
   private boolean[] T016D12_n9427OMMaqDsc ;
   private String[] T016D12_A396EmprCod ;
   private String[] T016D12_A9426OMMaqCod ;
   private java.math.BigDecimal[] T016D12_A9441OMMCCosT ;
   private boolean[] T016D12_n9441OMMCCosT ;
   private String[] T016D13_A396EmprCod ;
   private int[] T016D13_A9425OMCod ;
   private int[] T016D6_A9425OMCod ;
   private String[] T016D6_A9445OMEst ;
   private String[] T016D6_A396EmprCod ;
   private String[] T016D6_A9426OMMaqCod ;
   private String[] T016D14_A396EmprCod ;
   private int[] T016D14_A9425OMCod ;
   private String[] T016D15_A396EmprCod ;
   private int[] T016D15_A9425OMCod ;
   private int[] T016D5_A9425OMCod ;
   private String[] T016D5_A9445OMEst ;
   private String[] T016D5_A396EmprCod ;
   private String[] T016D5_A9426OMMaqCod ;
   private String[] T016D19_A396EmprCod ;
   private int[] T016D19_A9425OMCod ;
   private String[] T016D19_A11446OMMEquCod ;
   private String[] T016D19_A11447OMMSEqCod ;
   private String[] T016D19_A11448OMMPieCod ;
   private String[] T016D20_A396EmprCod ;
   private int[] T016D20_A9425OMCod ;
   private int[] T016D20_A9430TMCod ;
   private String[] T016D21_A396EmprCod ;
   private int[] T016D21_A9425OMCod ;
   private int[] T016D21_A9455OMOpeCod ;
   private String[] T016D21_A9458OMMTpo ;
   private short[] T016D21_A9466OMMCLin ;
   private String[] T016D22_A396EmprCod ;
   private int[] T016D22_A9425OMCod ;
   private int[] T016D22_A9446OMRepCod ;
   private String[] T016D22_A9449OMRTpo ;
   private String[] T016D23_A396EmprCod ;
   private int[] T016D23_A9425OMCod ;
   private int[] T016D24_A9425OMCod ;
   private String[] T016D24_A9458OMMTpo ;
   private java.math.BigDecimal[] T016D24_A9462OMMCPre ;
   private String[] T016D24_A9456OMOpeNom ;
   private boolean[] T016D24_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D24_A9457OMOpePre ;
   private boolean[] T016D24_n9457OMOpePre ;
   private java.math.BigDecimal[] T016D24_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016D24_A9460OMMRPre ;
   private java.math.BigDecimal[] T016D24_A9461OMMCCnt ;
   private String[] T016D24_A396EmprCod ;
   private int[] T016D24_A9455OMOpeCod ;
   private String[] T016D4_A9456OMOpeNom ;
   private boolean[] T016D4_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D4_A9457OMOpePre ;
   private boolean[] T016D4_n9457OMOpePre ;
   private String[] T016D25_A9456OMOpeNom ;
   private boolean[] T016D25_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D25_A9457OMOpePre ;
   private boolean[] T016D25_n9457OMOpePre ;
   private String[] T016D26_A396EmprCod ;
   private int[] T016D26_A9425OMCod ;
   private int[] T016D26_A9455OMOpeCod ;
   private String[] T016D26_A9458OMMTpo ;
   private int[] T016D3_A9425OMCod ;
   private String[] T016D3_A9458OMMTpo ;
   private java.math.BigDecimal[] T016D3_A9462OMMCPre ;
   private java.math.BigDecimal[] T016D3_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016D3_A9460OMMRPre ;
   private java.math.BigDecimal[] T016D3_A9461OMMCCnt ;
   private String[] T016D3_A396EmprCod ;
   private int[] T016D3_A9455OMOpeCod ;
   private int[] T016D2_A9425OMCod ;
   private String[] T016D2_A9458OMMTpo ;
   private java.math.BigDecimal[] T016D2_A9462OMMCPre ;
   private java.math.BigDecimal[] T016D2_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016D2_A9460OMMRPre ;
   private java.math.BigDecimal[] T016D2_A9461OMMCCnt ;
   private String[] T016D2_A396EmprCod ;
   private int[] T016D2_A9455OMOpeCod ;
   private String[] T016D30_A9456OMOpeNom ;
   private boolean[] T016D30_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D30_A9457OMOpePre ;
   private boolean[] T016D30_n9457OMOpePre ;
   private String[] T016D31_A396EmprCod ;
   private int[] T016D31_A9425OMCod ;
   private int[] T016D31_A9455OMOpeCod ;
   private String[] T016D31_A9458OMMTpo ;
   private short[] T016D31_A9466OMMCLin ;
   private String[] T016D32_A396EmprCod ;
   private int[] T016D32_A9425OMCod ;
   private int[] T016D32_A9455OMOpeCod ;
   private String[] T016D32_A9458OMMTpo ;
   private String[] T016D33_A407EmprNom ;
   private boolean[] T016D33_n407EmprNom ;
   private java.math.BigDecimal[] T016D35_A9441OMMCCosT ;
   private boolean[] T016D35_n9441OMMCCosT ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmordmc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016D2", "SELECT OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?  FOR UPDATE OF OMMCPre, OMMRCnt, OMMRPre, OMMCCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D3", "SELECT OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D4", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D5", "SELECT OMCod, OMEst, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMEst, OMMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D6", "SELECT OMCod, OMEst, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D8", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D10", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D12", "SELECT /*+ FIRST_ROWS(1) */ TM1.OMCod, TM1.OMEst, T2.EmprNom, T3.MaqDsc AS OMMaqDsc, TM1.EmprCod, TM1.OMMaqCod AS OMMaqCod, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT FROM (((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.OMMaqCod) LEFT JOIN (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016D16", "INSERT INTO TXPMORDEN(OMCod, OMEst, EmprCod, OMMaqCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMNot) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016D17", "UPDATE TXPMORDEN SET OMEst=?, OMMaqCod=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016D18", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T016D19", "SELECT * FROM (SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D20", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D21", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D22", "SELECT * FROM (SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D24", "SELECT T1.OMCod, T1.OMMTpo, T1.OMMCPre, T2.OpeNom AS OMOpeNom, T2.OpePreHor AS OMOpePre, T1.OMMRCnt, T1.OMMRPre, T1.OMMCCnt, T1.EmprCod, T1.OMOpeCod AS OMOpeCod FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? and T1.OMMTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod, T1.OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D25", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D26", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016D27", "INSERT INTO TXPMOrMO(OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod, OMMCUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T016D28", "UPDATE TXPMOrMO SET OMMCPre=?, OMMRCnt=?, OMMRPre=?, OMMCCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T016D29", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new ForEachCursor("T016D30", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D31", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D32", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMMTpo = 'C' ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D33", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D35", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 24 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
      }
   }

}

