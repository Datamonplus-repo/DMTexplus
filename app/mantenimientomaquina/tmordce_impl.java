package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordce_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action19") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_19_13S1233( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9434OMOpeRes = (int)(GXutil.lval( httpContext.GetPar( "OMOpeRes"))) ;
         n9434OMOpeRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9434OMOpeRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9434OMOpeRes), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A9434OMOpeRes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A9429PMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = (int)(GXutil.lval( httpContext.GetPar( "SMCod"))) ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A9428SMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_37") == 0 )
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
         gxload_37( A396EmprCod, A9446OMRepCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
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
         gxload_39( A396EmprCod, A9455OMOpeCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ordenes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOMMaqCod_Internalname ;
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
      nRC_GXsfl_120 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_120"))) ;
      nGXsfl_120_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_120_idx"))) ;
      sGXsfl_120_idx = httpContext.GetPar( "sGXsfl_120_idx") ;
      cmbOMRTpo.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMRTpo.getVisible(), 5, 0), !bGXsfl_120_Refreshing);
      cmbOMRTpo.setWidth( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Width", GXutil.ltrimstr( cmbOMRTpo.getWidth(), 9, 0), !bGXsfl_120_Refreshing);
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_134 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_134"))) ;
      nGXsfl_134_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_134_idx"))) ;
      sGXsfl_134_idx = httpContext.GetPar( "sGXsfl_134_idx") ;
      cmbOMMTpo.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMMTpo.getVisible(), 5, 0), !bGXsfl_134_Refreshing);
      cmbOMMTpo.setWidth( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Width", GXutil.ltrimstr( cmbOMMTpo.getWidth(), 9, 0), !bGXsfl_134_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tmordce_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordce_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordce_impl.class ));
   }

   public tmordce_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
      cmbOMRTpo = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMOrdCe.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod de Orden de Mantto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Desc Maquina Ord Mantto", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cod de Solicitud de Mantto", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMCod_Jsonclick, 0, "", "", "", "", "", 1, edtSMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cod de Preventivo de Mantto", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "", "", "", "", "", 1, edtPMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Desc del Trabajo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOMTxt_Internalname, A9433OMTxt, "", "", (short)(0), 1, edtOMTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Operario Responsable", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMOpeRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9434OMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMOpeRes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9434OMOpeRes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9434OMOpeRes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMOpeRes_Jsonclick, 0, "", "", "", "", "", 1, edtOMOpeRes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre del Responsable", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMOpeResN_Internalname, GXutil.rtrim( A9435OMOpeResN), GXutil.rtrim( localUtil.format( A9435OMOpeResN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMOpeResN_Jsonclick, 0, "", "", "", "", "", 1, edtOMOpeResN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOMFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCre_Internalname, localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9436OMFchCre, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCre_Jsonclick, 0, "", "", "", "", "", 1, edtOMFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Usuario que Crea", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMUsuCre_Internalname, GXutil.rtrim( A9437OMUsuCre), GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMUsuCre_Jsonclick, 0, "", "", "", "", "", 1, edtOMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Prevista", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOMFchPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchPre_Internalname, localUtil.format(A9438OMFchPre, "99/99/99"), localUtil.format( A9438OMFchPre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchPre_Jsonclick, 0, "", "", "", "", "", 1, edtOMFchPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Cerrada", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtOMFchCer_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMFchCer_Internalname, localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9439OMFchCer, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMFchCer_Jsonclick, 0, "", "", "", "", "", 1, edtOMFchCer_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOMFchCer_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOMFchCer_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Costo Real", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCosRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCosRea_Enabled!=0) ? localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCosRea_Jsonclick, 0, "", "", "", "", "", 1, edtOMCosRea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Costo Total Consumo Mano Obra", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCCosT_Enabled!=0) ? localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999") : localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCosT_Jsonclick, 0, "", "", "", "", "", 1, edtOMMCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMRCosT_Enabled!=0) ? localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999") : localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMRCosT_Jsonclick, 0, "", "", "", "", "", 1, edtOMMRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Costo Total Consumo Repuesto", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRCCosT_Enabled!=0) ? localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999") : localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRCCosT_Jsonclick, 0, "", "", "", "", "", 1, edtOMRCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Costo Total Reserva Repuesto", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRRCosT_Enabled!=0) ? localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999") : localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRRCosT_Jsonclick, 0, "", "", "", "", "", 1, edtOMRRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol120( ) ;
      nGXsfl_120_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1233 = (short)(1) ;
            scanStart13S1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               init_level_properties1233( ) ;
               getByPrimaryKey13S1233( ) ;
               addRow13S1233( ) ;
               scanNext13S1233( ) ;
            }
            scanEnd13S1233( ) ;
            nBlankRcdCount1233 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         standaloneNotModal13S1233( ) ;
         standaloneModal13S1233( ) ;
         sMode1233 = Gx_mode ;
         while ( nGXsfl_120_idx < nRC_GXsfl_120 )
         {
            bGXsfl_120_Refreshing = true ;
            readRow13S1233( ) ;
            edtavnRcdDeleted_1233_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1233_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1233_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1233_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPNOM_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRepPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPPRE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            cmbOMRTpo.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_120_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMRTpo.getVisible(), 5, 0), !bGXsfl_120_Refreshing);
            cmbOMRTpo.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_120_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Width", GXutil.ltrimstr( cmbOMRTpo.getWidth(), 9, 0), !bGXsfl_120_Refreshing);
            cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCNT_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCnt_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCPRE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtOMRCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCOS_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCos_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            if ( ( nRcdExists_1233 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13S1233( ) ;
            }
            sendRow13S1233( ) ;
            bGXsfl_120_Refreshing = false ;
         }
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         nRcdExists_1233 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13S1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1201233( ) ;
               init_level_properties1233( ) ;
               standaloneNotModal13S1233( ) ;
               getByPrimaryKey13S1233( ) ;
               standaloneModal13S1233( ) ;
               addRow13S1233( ) ;
               scanNext13S1233( ) ;
            }
            scanEnd13S1233( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1233 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1201233( ) ;
         initAll13S1233( ) ;
         init_level_properties1233( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         nRcdExists_1233 = (short)(0) ;
         nIsMod_1233 = (short)(0) ;
         nRcdDeleted_1233 = (short)(0) ;
         nBlankRcdCount1233 = (short)(nBlankRcdUsr1233+nBlankRcdCount1233) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1233 > 0 )
         {
            standaloneNotModal13S1233( ) ;
            standaloneModal13S1233( ) ;
            addRow13S1233( ) ;
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
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
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
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol134( ) ;
      nGXsfl_134_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1234 = (short)(1) ;
            scanStart13S1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               init_level_properties1234( ) ;
               getByPrimaryKey13S1234( ) ;
               addRow13S1234( ) ;
               scanNext13S1234( ) ;
            }
            scanEnd13S1234( ) ;
            nBlankRcdCount1234 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         standaloneNotModal13S1234( ) ;
         standaloneModal13S1234( ) ;
         sMode1234 = Gx_mode ;
         while ( nGXsfl_134_idx < nRC_GXsfl_134 )
         {
            bGXsfl_134_Refreshing = true ;
            readRow13S1234( ) ;
            edtavnRcdDeleted_1234_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1234_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1234_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1234_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            cmbOMMTpo.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_134_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMMTpo.getVisible(), 5, 0), !bGXsfl_134_Refreshing);
            cmbOMMTpo.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_134_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Width", GXutil.ltrimstr( cmbOMMTpo.getWidth(), 9, 0), !bGXsfl_134_Refreshing);
            cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_134_Refreshing);
            edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_134_Refreshing);
            if ( ( nRcdExists_1234 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13S1234( ) ;
            }
            sendRow13S1234( ) ;
            bGXsfl_134_Refreshing = false ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         nRcdExists_1234 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13S1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1341234( ) ;
               init_level_properties1234( ) ;
               standaloneNotModal13S1234( ) ;
               getByPrimaryKey13S1234( ) ;
               standaloneModal13S1234( ) ;
               addRow13S1234( ) ;
               scanNext13S1234( ) ;
            }
            scanEnd13S1234( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1234 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1341234( ) ;
         initAll13S1234( ) ;
         init_level_properties1234( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         B9443OMRCCosT = A9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         nRcdExists_1234 = (short)(0) ;
         nIsMod_1234 = (short)(0) ;
         nRcdDeleted_1234 = (short)(0) ;
         nBlankRcdCount1234 = (short)(nBlankRcdUsr1234+nBlankRcdCount1234) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1234 > 0 )
         {
            standaloneNotModal13S1234( ) ;
            standaloneModal13S1234( ) ;
            addRow13S1234( ) ;
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
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9443OMRCCosT = B9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Nota", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOMNot_Internalname, A9464OMNot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", (short)(0), 1, edtOMNot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdCe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMOrdCe.htm");
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
      e1113S2 ();
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
            Z9433OMTxt = httpContext.cgiGet( "Z9433OMTxt") ;
            Z9436OMFchCre = localUtil.ctot( httpContext.cgiGet( "Z9436OMFchCre"), 0) ;
            Z9437OMUsuCre = httpContext.cgiGet( "Z9437OMUsuCre") ;
            Z9438OMFchPre = localUtil.ctod( httpContext.cgiGet( "Z9438OMFchPre"), 0) ;
            Z9439OMFchCer = localUtil.ctot( httpContext.cgiGet( "Z9439OMFchCer"), 0) ;
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            Z9464OMNot = httpContext.cgiGet( "Z9464OMNot") ;
            Z9426OMMaqCod = httpContext.cgiGet( "Z9426OMMaqCod") ;
            Z9434OMOpeRes = (int)(localUtil.ctol( httpContext.cgiGet( "Z9434OMOpeRes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9428SMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( "O9441OMMCCosT")) ;
            O9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( "O9443OMRCCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_120 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_120"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_134 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_134"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15oOMRCCnt = localUtil.ctond( httpContext.cgiGet( "vOOMRCCNT")) ;
            AV18nOMRCCnt = localUtil.ctond( httpContext.cgiGet( "vNOMRCCNT")) ;
            AV19ServerNow = localUtil.ctot( httpContext.cgiGet( "vSERVERNOW"), 0) ;
            AV17MTMovNom = httpContext.cgiGet( "vMTMOVNOM") ;
            AV16MTMovCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMTMOVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9428SMCod = 0 ;
               n9428SMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            }
            else
            {
               A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9428SMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9429PMCod = 0 ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            }
            else
            {
               A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            }
            A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMOPERES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMOpeRes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9434OMOpeRes = 0 ;
               n9434OMOpeRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9434OMOpeRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9434OMOpeRes), 6, 0));
            }
            else
            {
               A9434OMOpeRes = (int)(localUtil.ctol( httpContext.cgiGet( edtOMOpeRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9434OMOpeRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9434OMOpeRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9434OMOpeRes), 6, 0));
            }
            A9435OMOpeResN = httpContext.cgiGet( edtOMOpeResN_Internalname) ;
            n9435OMOpeResN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", A9435OMOpeResN);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtOMFchCre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OMFCHCRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMFchCre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
            if ( localUtil.vcdate( httpContext.cgiGet( edtOMFchPre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "OMFCHPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMFchPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9438OMFchPre = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
            }
            else
            {
               A9438OMFchPre = localUtil.ctod( httpContext.cgiGet( edtOMFchPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
            }
            A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            cmbOMEst.setName( cmbOMEst.getInternalname() );
            cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdCe");
            A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
            forbiddenHiddens.add("OMTxt", GXutil.rtrim( localUtil.format( A9433OMTxt, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("OMFchCer", localUtil.format( A9439OMFchCer, "99/99/99 99:99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmordce:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode1232 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1232 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1232 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13S0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                        e1113S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
         e1213S2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13S1232( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes13S1232( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1233_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1233_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1234_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1234_Enabled), 5, 0), !bGXsfl_134_Refreshing);
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

   public void confirm_13S0( )
   {
      beforeValidate13S1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13S1232( ) ;
         }
         else
         {
            checkExtendedTable13S1232( ) ;
            if ( AnyError == 0 )
            {
               zm13S1232( 29) ;
               zm13S1232( 30) ;
               zm13S1232( 31) ;
               zm13S1232( 32) ;
               zm13S1232( 33) ;
               zm13S1232( 34) ;
               zm13S1232( 35) ;
            }
            closeExtendedTableCursors13S1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_13S1233( ) ;
         if ( AnyError == 0 )
         {
            confirm_13S1234( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode1232 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues13S0( ) ;
      }
   }

   public void confirm_13S1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_134_idx = 0 ;
      while ( nGXsfl_134_idx < nRC_GXsfl_134 )
      {
         readRow13S1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            getKey13S1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               if ( RcdFound1234 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13S1234( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13S1234( ) ;
                     if ( AnyError == 0 )
                     {
                        zm13S1234( 39) ;
                     }
                     closeExtendedTableCursors13S1234( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9441OMMCCosT = A9441OMMCCosT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                     O9440OMCosRea = A9440OMCosRea ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMOPECOD_" + sGXsfl_134_idx ;
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
                     getByPrimaryKey13S1234( ) ;
                     load13S1234( ) ;
                     beforeValidate13S1234( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13S1234( ) ;
                        O9441OMMCCosT = A9441OMMCCosT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                        O9440OMCosRea = A9440OMCosRea ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13S1234( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13S1234( ) ;
                           if ( AnyError == 0 )
                           {
                              zm13S1234( 39) ;
                           }
                           closeExtendedTableCursors13S1234( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9441OMMCCosT = A9441OMMCCosT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                           O9440OMCosRea = A9440OMCosRea ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_134_idx ;
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
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_134_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1234_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_134_idx+"Width", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9441OMMCCosT = s9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9440OMCosRea = s9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13S1233( )
   {
      s9443OMRCCosT = O9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_120_idx = 0 ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         readRow13S1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            getKey13S1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               if ( RcdFound1233 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13S1233( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13S1233( ) ;
                     if ( AnyError == 0 )
                     {
                        zm13S1233( 37) ;
                     }
                     closeExtendedTableCursors13S1233( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9443OMRCCosT = A9443OMRCCosT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                     O9440OMCosRea = A9440OMCosRea ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMREPCOD_" + sGXsfl_120_idx ;
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
                     getByPrimaryKey13S1233( ) ;
                     load13S1233( ) ;
                     beforeValidate13S1233( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13S1233( ) ;
                        O9443OMRCCosT = A9443OMRCCosT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                        O9440OMCosRea = A9440OMCosRea ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13S1233( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13S1233( ) ;
                           if ( AnyError == 0 )
                           {
                              zm13S1233( 37) ;
                           }
                           closeExtendedTableCursors13S1233( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9443OMRCCosT = A9443OMRCCosT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                           O9440OMCosRea = A9440OMCosRea ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_120_idx ;
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
         httpContext.changePostValue( edtOMRCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_120_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9452OMRCCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( O9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9454OMRCCos_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( O9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1233_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPNOM_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_120_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_120_idx+"Width", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCOS_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9443OMRCCosT = s9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      O9440OMCosRea = s9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13S0( )
   {
   }

   public void e1113S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmordce_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV21Pgmname, (byte)(99), GXv_char2) ;
      tmordce_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmordce_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordce_impl.this.A396EmprCod = GXv_char2[0] ;
      tmordce_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordce_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      cmbOMRTpo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMRTpo.getVisible(), 5, 0), !bGXsfl_120_Refreshing);
      cmbOMRTpo.setWidth( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Width", GXutil.ltrimstr( cmbOMRTpo.getWidth(), 9, 0), !bGXsfl_120_Refreshing);
      cmbOMMTpo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMMTpo.getVisible(), 5, 0), !bGXsfl_134_Refreshing);
      cmbOMMTpo.setWidth( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Width", GXutil.ltrimstr( cmbOMMTpo.getWidth(), 9, 0), !bGXsfl_134_Refreshing);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int5[0] = AV16MTMovCod ;
      GXv_char2[0] = AV17MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      tmordce_impl.this.A396EmprCod = GXv_char4[0] ;
      tmordce_impl.this.AV16MTMovCod = GXv_int5[0] ;
      tmordce_impl.this.AV17MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
   }

   public void e1213S2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A9425OMCod),Gx_mode});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A9425OMCod","Gx_mode"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(14);
      pr_default.close(13);
      pr_default.close(12);
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm13S1232( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9433OMTxt = T013S9_A9433OMTxt[0] ;
            Z9436OMFchCre = T013S9_A9436OMFchCre[0] ;
            Z9437OMUsuCre = T013S9_A9437OMUsuCre[0] ;
            Z9438OMFchPre = T013S9_A9438OMFchPre[0] ;
            Z9439OMFchCer = T013S9_A9439OMFchCer[0] ;
            Z9445OMEst = T013S9_A9445OMEst[0] ;
            Z9464OMNot = T013S9_A9464OMNot[0] ;
            Z9426OMMaqCod = T013S9_A9426OMMaqCod[0] ;
            Z9434OMOpeRes = T013S9_A9434OMOpeRes[0] ;
            Z9429PMCod = T013S9_A9429PMCod[0] ;
            Z9428SMCod = T013S9_A9428SMCod[0] ;
         }
         else
         {
            Z9433OMTxt = A9433OMTxt ;
            Z9436OMFchCre = A9436OMFchCre ;
            Z9437OMUsuCre = A9437OMUsuCre ;
            Z9438OMFchPre = A9438OMFchPre ;
            Z9439OMFchCer = A9439OMFchCer ;
            Z9445OMEst = A9445OMEst ;
            Z9464OMNot = A9464OMNot ;
            Z9426OMMaqCod = A9426OMMaqCod ;
            Z9434OMOpeRes = A9434OMOpeRes ;
            Z9429PMCod = A9429PMCod ;
            Z9428SMCod = A9428SMCod ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9433OMTxt = A9433OMTxt ;
         Z9436OMFchCre = A9436OMFchCre ;
         Z9437OMUsuCre = A9437OMUsuCre ;
         Z9438OMFchPre = A9438OMFchPre ;
         Z9439OMFchCer = A9439OMFchCer ;
         Z9445OMEst = A9445OMEst ;
         Z9464OMNot = A9464OMNot ;
         Z396EmprCod = A396EmprCod ;
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z9434OMOpeRes = A9434OMOpeRes ;
         Z9429PMCod = A9429PMCod ;
         Z9428SMCod = A9428SMCod ;
         Z407EmprNom = A407EmprNom ;
         Z9441OMMCCosT = A9441OMMCCosT ;
         Z9442OMMRCosT = A9442OMMRCosT ;
         Z9443OMRCCosT = A9443OMRCCosT ;
         Z9444OMRRCosT = A9444OMRRCosT ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z9435OMOpeResN = A9435OMOpeResN ;
      }
   }

   public void standaloneNotModal( )
   {
      edtOMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      AV21Pgmname = "MantenimientoMaquina.TMOrdCe" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtOMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T013S10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013S10_A407EmprNom[0] ;
      n407EmprNom = T013S10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T013S16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A9441OMMCCosT = T013S16_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = T013S16_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      O9441OMMCCosT = A9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      pr_default.close(13);
      /* Using cursor T013S18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A9443OMRCCosT = T013S18_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = T013S18_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         A9443OMRCCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      O9443OMRCCosT = A9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      pr_default.close(14);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite crear ordenes cerradas.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar ordenes cerradas.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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

   public void load13S1232( )
   {
      /* Using cursor T013S21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A407EmprNom = T013S21_A407EmprNom[0] ;
         n407EmprNom = T013S21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9427OMMaqDsc = T013S21_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013S21_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9433OMTxt = T013S21_A9433OMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
         A9435OMOpeResN = T013S21_A9435OMOpeResN[0] ;
         n9435OMOpeResN = T013S21_n9435OMOpeResN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", A9435OMOpeResN);
         A9436OMFchCre = T013S21_A9436OMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9437OMUsuCre = T013S21_A9437OMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
         A9438OMFchPre = T013S21_A9438OMFchPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         A9439OMFchCer = T013S21_A9439OMFchCer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9445OMEst = T013S21_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9464OMNot = T013S21_A9464OMNot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
         A9426OMMaqCod = T013S21_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9434OMOpeRes = T013S21_A9434OMOpeRes[0] ;
         n9434OMOpeRes = T013S21_n9434OMOpeRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9434OMOpeRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9434OMOpeRes), 6, 0));
         A9429PMCod = T013S21_A9429PMCod[0] ;
         n9429PMCod = T013S21_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9428SMCod = T013S21_A9428SMCod[0] ;
         n9428SMCod = T013S21_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9441OMMCCosT = T013S21_A9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9442OMMRCosT = T013S21_A9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         A9443OMRCCosT = T013S21_A9443OMRCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9444OMRRCosT = T013S21_A9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         zm13S1232( -28) ;
      }
      pr_default.close(15);
      onLoadActions13S1232( ) ;
   }

   public void onLoadActions13S1232( )
   {
      O9441OMMCCosT = A9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9443OMRCCosT = A9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
   }

   public void checkExtendedTable13S1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T013S11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9427OMMaqDsc = T013S11_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013S11_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      pr_default.close(9);
      /* Using cursor T013S12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n9434OMOpeRes), Integer.valueOf(A9434OMOpeRes)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9434OMOpeRes) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPERES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOMOpeRes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9435OMOpeResN = T013S12_A9435OMOpeResN[0] ;
      n9435OMOpeResN = T013S12_n9435OMOpeResN[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", A9435OMOpeResN);
      pr_default.close(10);
      /* Using cursor T013S13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(11);
      /* Using cursor T013S14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9428SMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(12);
      if ( ! ( ( GXutil.strcmp(A9445OMEst, "P") == 0 ) || ( GXutil.strcmp(A9445OMEst, "R") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "OMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbOMEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, no se permite modificar", ""), 1, "OMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbOMEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         nIsDirty_1232 = (short)(1) ;
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            nIsDirty_1232 = (short)(1) ;
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            nIsDirty_1232 = (short)(1) ;
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
   }

   public void closeExtendedTableCursors13S1232( )
   {
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
      pr_default.close(12);
   }

   public void enableDisable( )
   {
   }

   public void gxload_30( String A396EmprCod ,
                          String A9426OMMaqCod )
   {
      /* Using cursor T013S22 */
      pr_default.execute(16, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9427OMMaqDsc = T013S22_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013S22_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9427OMMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_31( String A396EmprCod ,
                          int A9434OMOpeRes )
   {
      /* Using cursor T013S23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n9434OMOpeRes), Integer.valueOf(A9434OMOpeRes)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9434OMOpeRes) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPERES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOMOpeRes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9435OMOpeResN = T013S23_A9435OMOpeResN[0] ;
      n9435OMOpeResN = T013S23_n9435OMOpeResN[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", A9435OMOpeResN);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9435OMOpeResN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_32( String A396EmprCod ,
                          int A9429PMCod )
   {
      /* Using cursor T013S24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_33( String A396EmprCod ,
                          int A9428SMCod )
   {
      /* Using cursor T013S25 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9428SMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey13S1232( )
   {
      /* Using cursor T013S26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      else
      {
         RcdFound1232 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013S9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) && ( T013S9_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013S9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13S1232( 28) ;
         RcdFound1232 = (short)(1) ;
         A9433OMTxt = T013S9_A9433OMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
         A9436OMFchCre = T013S9_A9436OMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9437OMUsuCre = T013S9_A9437OMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
         A9438OMFchPre = T013S9_A9438OMFchPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
         A9439OMFchCer = T013S9_A9439OMFchCer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9445OMEst = T013S9_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9464OMNot = T013S9_A9464OMNot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
         A9426OMMaqCod = T013S9_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9434OMOpeRes = T013S9_A9434OMOpeRes[0] ;
         n9434OMOpeRes = T013S9_n9434OMOpeRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9434OMOpeRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9434OMOpeRes), 6, 0));
         A9429PMCod = T013S9_A9429PMCod[0] ;
         n9429PMCod = T013S9_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         A9428SMCod = T013S9_A9428SMCod[0] ;
         n9428SMCod = T013S9_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13S1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey13S1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey13S1232( ) ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey13S1232( ) ;
      if ( RcdFound1232 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T013S27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( GXutil.strcmp(T013S27_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013S27_A9425OMCod[0] == A9425OMCod ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( GXutil.strcmp(T013S27_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013S27_A9425OMCod[0] == A9425OMCod ) )
         {
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T013S28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( GXutil.strcmp(T013S28_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013S28_A9425OMCod[0] == A9425OMCod ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( GXutil.strcmp(T013S28_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013S28_A9425OMCod[0] == A9425OMCod ) )
         {
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13S1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9443OMRCCosT = O9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         A9441OMMCCosT = O9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13S1232( ) ;
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
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               update13S1232( ) ;
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               /* Insert record */
               A9443OMRCCosT = O9443OMRCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               A9441OMMCCosT = O9441OMMCCosT ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               A9440OMCosRea = O9440OMCosRea ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
               GX_FocusControl = edtOMMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13S1232( ) ;
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
                  /* Insert record */
                  A9443OMRCCosT = O9443OMRCCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
                  A9440OMCosRea = O9440OMCosRea ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  A9441OMMCCosT = O9441OMMCCosT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  A9440OMCosRea = O9440OMCosRea ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
                  GX_FocusControl = edtOMMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13S1232( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
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
         A9443OMRCCosT = O9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         A9441OMMCCosT = O9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         A9440OMCosRea = O9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOMMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey13S1232( ) ;
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordce");
      GX_FocusControl = edtOMMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_13S0( ) ;
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

   public void checkOptimisticConcurrency13S1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013S8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z9433OMTxt, T013S8_A9433OMTxt[0]) != 0 ) || !( GXutil.dateCompare(Z9436OMFchCre, T013S8_A9436OMFchCre[0]) ) || ( GXutil.strcmp(Z9437OMUsuCre, T013S8_A9437OMUsuCre[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9438OMFchPre), GXutil.resetTime(T013S8_A9438OMFchPre[0])) ) || !( GXutil.dateCompare(Z9439OMFchCer, T013S8_A9439OMFchCer[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9445OMEst, T013S8_A9445OMEst[0]) != 0 ) || ( GXutil.strcmp(Z9464OMNot, T013S8_A9464OMNot[0]) != 0 ) || ( GXutil.strcmp(Z9426OMMaqCod, T013S8_A9426OMMaqCod[0]) != 0 ) || ( Z9434OMOpeRes != T013S8_A9434OMOpeRes[0] ) || ( Z9429PMCod != T013S8_A9429PMCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9428SMCod != T013S8_A9428SMCod[0] ) )
         {
            if ( GXutil.strcmp(Z9433OMTxt, T013S8_A9433OMTxt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMTxt");
               GXutil.writeLogRaw("Old: ",Z9433OMTxt);
               GXutil.writeLogRaw("Current: ",T013S8_A9433OMTxt[0]);
            }
            if ( !( GXutil.dateCompare(Z9436OMFchCre, T013S8_A9436OMFchCre[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMFchCre");
               GXutil.writeLogRaw("Old: ",Z9436OMFchCre);
               GXutil.writeLogRaw("Current: ",T013S8_A9436OMFchCre[0]);
            }
            if ( GXutil.strcmp(Z9437OMUsuCre, T013S8_A9437OMUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMUsuCre");
               GXutil.writeLogRaw("Old: ",Z9437OMUsuCre);
               GXutil.writeLogRaw("Current: ",T013S8_A9437OMUsuCre[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9438OMFchPre), GXutil.resetTime(T013S8_A9438OMFchPre[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMFchPre");
               GXutil.writeLogRaw("Old: ",Z9438OMFchPre);
               GXutil.writeLogRaw("Current: ",T013S8_A9438OMFchPre[0]);
            }
            if ( !( GXutil.dateCompare(Z9439OMFchCer, T013S8_A9439OMFchCer[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMFchCer");
               GXutil.writeLogRaw("Old: ",Z9439OMFchCer);
               GXutil.writeLogRaw("Current: ",T013S8_A9439OMFchCer[0]);
            }
            if ( GXutil.strcmp(Z9445OMEst, T013S8_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T013S8_A9445OMEst[0]);
            }
            if ( GXutil.strcmp(Z9464OMNot, T013S8_A9464OMNot[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMNot");
               GXutil.writeLogRaw("Old: ",Z9464OMNot);
               GXutil.writeLogRaw("Current: ",T013S8_A9464OMNot[0]);
            }
            if ( GXutil.strcmp(Z9426OMMaqCod, T013S8_A9426OMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9426OMMaqCod);
               GXutil.writeLogRaw("Current: ",T013S8_A9426OMMaqCod[0]);
            }
            if ( Z9434OMOpeRes != T013S8_A9434OMOpeRes[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMOpeRes");
               GXutil.writeLogRaw("Old: ",Z9434OMOpeRes);
               GXutil.writeLogRaw("Current: ",T013S8_A9434OMOpeRes[0]);
            }
            if ( Z9429PMCod != T013S8_A9429PMCod[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"PMCod");
               GXutil.writeLogRaw("Old: ",Z9429PMCod);
               GXutil.writeLogRaw("Current: ",T013S8_A9429PMCod[0]);
            }
            if ( Z9428SMCod != T013S8_A9428SMCod[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"SMCod");
               GXutil.writeLogRaw("Old: ",Z9428SMCod);
               GXutil.writeLogRaw("Current: ",T013S8_A9428SMCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13S1232( )
   {
      beforeValidate13S1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13S1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13S1232( 0) ;
         checkOptimisticConcurrency13S1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13S1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13S1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013S29 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A9425OMCod), A9433OMTxt, A9436OMFchCre, A9437OMUsuCre, A9438OMFchPre, A9439OMFchCer, A9445OMEst, A9464OMNot, A396EmprCod, A9426OMMaqCod, Boolean.valueOf(n9434OMOpeRes), Integer.valueOf(A9434OMOpeRes), Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
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
                        processLevel13S1232( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load13S1232( ) ;
         }
         endLevel13S1232( ) ;
      }
      closeExtendedTableCursors13S1232( ) ;
   }

   public void update13S1232( )
   {
      beforeValidate13S1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13S1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13S1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13S1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13S1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013S30 */
                  pr_default.execute(24, new Object[] {A9433OMTxt, A9436OMFchCre, A9437OMUsuCre, A9438OMFchPre, A9439OMFchCer, A9445OMEst, A9464OMNot, A9426OMMaqCod, Boolean.valueOf(n9434OMOpeRes), Integer.valueOf(A9434OMOpeRes), Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod), A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13S1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13S1232( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel13S1232( ) ;
      }
      closeExtendedTableCursors13S1232( ) ;
   }

   public void deferredUpdate13S1232( )
   {
   }

   public void delete( )
   {
      beforeValidate13S1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13S1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13S1232( ) ;
         afterConfirm13S1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13S1232( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013S31 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isIns( ) || isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
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
      }
      sMode1232 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13S1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13S1232( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) && isUpd( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden ya cerrada, no se permite modificar", ""), 1, "OMEST");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbOMEst.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T013S32 */
         pr_default.execute(26, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T013S32_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T013S32_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(26);
         /* Using cursor T013S33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n9434OMOpeRes), Integer.valueOf(A9434OMOpeRes)});
         A9435OMOpeResN = T013S33_A9435OMOpeResN[0] ;
         n9435OMOpeResN = T013S33_n9435OMOpeResN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", A9435OMOpeResN);
         pr_default.close(27);
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
            {
               A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
            else
            {
               A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
         }
      }
   }

   public void processNestedLevel13S1233( )
   {
      s9443OMRCCosT = O9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_120_idx = 0 ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         readRow13S1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            standaloneNotModal13S1233( ) ;
            getKey13S1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13S1233( ) ;
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( ( nRcdDeleted_1233 != 0 ) && ( nRcdExists_1233 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13S1233( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13S1233( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_120_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9443OMRCCosT = A9443OMRCCosT ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            O9440OMCosRea = A9440OMCosRea ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1233_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRepNom_Internalname, GXutil.rtrim( A9447OMRepNom)) ;
         httpContext.changePostValue( edtOMRepPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_120_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9452OMRCCnt_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( O9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9454OMRCCos_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( O9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1233_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPNOM_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_120_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_120_idx+"Width", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRCCOS_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13S1233( ) ;
      if ( AnyError != 0 )
      {
         O9443OMRCCosT = s9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      nRcdExists_1233 = (short)(0) ;
      nIsMod_1233 = (short)(0) ;
      nRcdDeleted_1233 = (short)(0) ;
   }

   public void processNestedLevel13S1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      s9440OMCosRea = O9440OMCosRea ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      nGXsfl_134_idx = 0 ;
      while ( nGXsfl_134_idx < nRC_GXsfl_134 )
      {
         readRow13S1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            standaloneNotModal13S1234( ) ;
            getKey13S1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13S1234( ) ;
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( ( nRcdDeleted_1234 != 0 ) && ( nRcdExists_1234 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13S1234( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13S1234( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_134_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9441OMMCCosT = A9441OMMCCosT ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            O9440OMCosRea = A9440OMCosRea ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1234_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_134_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1234_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_134_idx+"Width", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getWidth(), (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13S1234( ) ;
      if ( AnyError != 0 )
      {
         O9441OMMCCosT = s9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      nRcdExists_1234 = (short)(0) ;
      nIsMod_1234 = (short)(0) ;
      nRcdDeleted_1234 = (short)(0) ;
   }

   public void processLevel13S1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel13S1233( ) ;
      processNestedLevel13S1234( ) ;
      if ( AnyError != 0 )
      {
         O9443OMRCCosT = s9443OMRCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         O9441OMMCCosT = s9441OMMCCosT ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         O9440OMCosRea = s9440OMCosRea ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13S1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13S1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordce");
         if ( AnyError == 0 )
         {
            confirmValues13S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordce");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13S1232( )
   {
      /* Scan By routine */
      /* Using cursor T013S34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13S1232( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
   }

   public void scanEnd13S1232( )
   {
      pr_default.close(28);
   }

   public void afterConfirm13S1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13S1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13S1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13S1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13S1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13S1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13S1232( )
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
      edtSMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      edtPMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
      edtOMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Enabled), 5, 0), true);
      edtOMOpeRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeRes_Enabled), 5, 0), true);
      edtOMOpeResN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeResN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeResN_Enabled), 5, 0), true);
      edtOMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Enabled), 5, 0), true);
      edtOMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Enabled), 5, 0), true);
      edtOMFchPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Enabled), 5, 0), true);
      edtOMFchCer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Enabled), 5, 0), true);
      edtOMCosRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCosRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCosRea_Enabled), 5, 0), true);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      edtOMMRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCosT_Enabled), 5, 0), true);
      edtOMRCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCosT_Enabled), 5, 0), true);
      edtOMRRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMNot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMNot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMNot_Enabled), 5, 0), true);
   }

   public void zm13S1233( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9453OMRCPre = T013S6_A9453OMRCPre[0] ;
            Z9450OMRRCnt = T013S6_A9450OMRRCnt[0] ;
            Z9451OMRRPre = T013S6_A9451OMRRPre[0] ;
            Z9452OMRCCnt = T013S6_A9452OMRCCnt[0] ;
         }
         else
         {
            Z9453OMRCPre = A9453OMRCPre ;
            Z9450OMRRCnt = A9450OMRRCnt ;
            Z9451OMRRPre = A9451OMRRPre ;
            Z9452OMRCCnt = A9452OMRCCnt ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         Z9453OMRCPre = A9453OMRCPre ;
         Z9450OMRRCnt = A9450OMRRCnt ;
         Z9451OMRRPre = A9451OMRRPre ;
         Z9452OMRCCnt = A9452OMRCCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9447OMRepNom = A9447OMRepNom ;
         Z9448OMRepPre = A9448OMRepPre ;
      }
   }

   public void standaloneNotModal13S1233( )
   {
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void standaloneModal13S1233( )
   {
      if ( isIns( )  )
      {
         A9449OMRTpo = httpContext.getMessage( httpContext.getMessage( "C", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      }
      else
      {
         edtOMRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      }
   }

   public void load13S1233( )
   {
      /* Using cursor T013S35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9453OMRCPre = T013S35_A9453OMRCPre[0] ;
         A9447OMRepNom = T013S35_A9447OMRepNom[0] ;
         n9447OMRepNom = T013S35_n9447OMRepNom[0] ;
         A9448OMRepPre = T013S35_A9448OMRepPre[0] ;
         n9448OMRepPre = T013S35_n9448OMRepPre[0] ;
         A9450OMRRCnt = T013S35_A9450OMRRCnt[0] ;
         A9451OMRRPre = T013S35_A9451OMRRPre[0] ;
         A9452OMRCCnt = T013S35_A9452OMRCCnt[0] ;
         zm13S1233( -36) ;
      }
      pr_default.close(29);
      onLoadActions13S1233( ) ;
   }

   public void onLoadActions13S1233( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9453OMRCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9453OMRCPre = A9448OMRepPre ;
      }
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
      O9454OMRCCos = A9454OMRCCos ;
      if ( isIns( )  )
      {
         A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos).subtract(O9454OMRCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9443OMRCCosT = O9443OMRCCosT.subtract(O9454OMRCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
      AV18nOMRCCnt = A9452OMRCCnt.negate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18nOMRCCnt", GXutil.ltrimstr( AV18nOMRCCnt, 12, 3));
   }

   public void checkExtendedTable13S1233( )
   {
      nIsDirty_1233 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13S1233( ) ;
      /* Using cursor T013S7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T013S7_A9447OMRepNom[0] ;
      n9447OMRepNom = T013S7_n9447OMRepNom[0] ;
      A9448OMRepPre = T013S7_A9448OMRepPre[0] ;
      n9448OMRepPre = T013S7_n9448OMRepPre[0] ;
      pr_default.close(5);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9453OMRCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1233 = (short)(1) ;
         A9453OMRCPre = A9448OMRepPre ;
      }
      nIsDirty_1233 = (short)(1) ;
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1233 = (short)(1) ;
         A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1233 = (short)(1) ;
            A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos).subtract(O9454OMRCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1233 = (short)(1) ;
               A9443OMRCCosT = O9443OMRCCosT.subtract(O9454OMRCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         nIsDirty_1233 = (short)(1) ;
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            nIsDirty_1233 = (short)(1) ;
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            nIsDirty_1233 = (short)(1) ;
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
      AV18nOMRCCnt = A9452OMRCCnt.negate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18nOMRCCnt", GXutil.ltrimstr( AV18nOMRCCnt, 12, 3));
   }

   public void closeExtendedTableCursors13S1233( )
   {
      pr_default.close(5);
   }

   public void enableDisable13S1233( )
   {
   }

   public void gxload_37( String A396EmprCod ,
                          int A9446OMRepCod )
   {
      /* Using cursor T013S36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T013S36_A9447OMRepNom[0] ;
      n9447OMRepNom = T013S36_n9447OMRepNom[0] ;
      A9448OMRepPre = T013S36_A9448OMRepPre[0] ;
      n9448OMRepPre = T013S36_n9448OMRepPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9447OMRepNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void getKey13S1233( )
   {
      /* Using cursor T013S37 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1233 = (short)(1) ;
      }
      else
      {
         RcdFound1233 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey13S1233( )
   {
      /* Using cursor T013S6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(4) != 101) && ( T013S6_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013S6_A9449OMRTpo[0], "C") == 0 ) && ( GXutil.strcmp(T013S6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13S1233( 36) ;
         RcdFound1233 = (short)(1) ;
         initializeNonKey13S1233( ) ;
         A9449OMRTpo = T013S6_A9449OMRTpo[0] ;
         A9453OMRCPre = T013S6_A9453OMRCPre[0] ;
         A9450OMRRCnt = T013S6_A9450OMRRCnt[0] ;
         A9451OMRRPre = T013S6_A9451OMRRPre[0] ;
         A9452OMRCCnt = T013S6_A9452OMRCCnt[0] ;
         A9446OMRepCod = T013S6_A9446OMRepCod[0] ;
         O9452OMRCCnt = A9452OMRCCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13S1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1233 = (short)(0) ;
         initializeNonKey13S1233( ) ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13S1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13S1233( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency13S1233( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013S5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z9453OMRCPre, T013S5_A9453OMRCPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9450OMRRCnt, T013S5_A9450OMRRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9451OMRRPre, T013S5_A9451OMRRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9452OMRCCnt, T013S5_A9452OMRCCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9453OMRCPre, T013S5_A9453OMRCPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMRCPre");
               GXutil.writeLogRaw("Old: ",Z9453OMRCPre);
               GXutil.writeLogRaw("Current: ",T013S5_A9453OMRCPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9450OMRRCnt, T013S5_A9450OMRRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMRRCnt");
               GXutil.writeLogRaw("Old: ",Z9450OMRRCnt);
               GXutil.writeLogRaw("Current: ",T013S5_A9450OMRRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9451OMRRPre, T013S5_A9451OMRRPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMRRPre");
               GXutil.writeLogRaw("Old: ",Z9451OMRRPre);
               GXutil.writeLogRaw("Current: ",T013S5_A9451OMRRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9452OMRCCnt, T013S5_A9452OMRCCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMRCCnt");
               GXutil.writeLogRaw("Old: ",Z9452OMRCCnt);
               GXutil.writeLogRaw("Current: ",T013S5_A9452OMRCCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrRep"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13S1233( )
   {
      beforeValidate13S1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13S1233( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13S1233( 0) ;
         checkOptimisticConcurrency13S1233( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13S1233( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13S1233( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013S38 */
                  pr_default.execute(32, new Object[] {Integer.valueOf(A9425OMCod), A9449OMRTpo, A9453OMRCPre, A9450OMRRCnt, A9451OMRRPre, A9452OMRCCnt, A396EmprCod, Integer.valueOf(A9446OMRepCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                  if ( (pr_default.getStatus(32) == 1) )
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
            load13S1233( ) ;
         }
         endLevel13S1233( ) ;
      }
      closeExtendedTableCursors13S1233( ) ;
   }

   public void update13S1233( )
   {
      beforeValidate13S1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13S1233( ) ;
      }
      if ( ( nIsMod_1233 != 0 ) || ( nIsDirty_1233 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13S1233( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13S1233( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13S1233( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013S39 */
                     pr_default.execute(33, new Object[] {A9453OMRCPre, A9450OMRRCnt, A9451OMRRPre, A9452OMRCCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13S1233( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13S1233( ) ;
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
            endLevel13S1233( ) ;
         }
      }
      closeExtendedTableCursors13S1233( ) ;
   }

   public void deferredUpdate13S1233( )
   {
   }

   public void delete13S1233( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13S1233( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13S1233( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13S1233( ) ;
         afterConfirm13S1233( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13S1233( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013S40 */
               pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
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
      endLevel13S1233( ) ;
      Gx_mode = sMode1233 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13S1233( )
   {
      standaloneModal13S1233( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013S41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         A9447OMRepNom = T013S41_A9447OMRepNom[0] ;
         n9447OMRepNom = T013S41_n9447OMRepNom[0] ;
         A9448OMRepPre = T013S41_A9448OMRepPre[0] ;
         n9448OMRepPre = T013S41_n9448OMRepPre[0] ;
         pr_default.close(35);
         AV18nOMRCCnt = A9452OMRCCnt.negate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18nOMRCCnt", GXutil.ltrimstr( AV18nOMRCCnt, 12, 3));
         A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
         if ( isIns( )  )
         {
            A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9443OMRCCosT = O9443OMRCCosT.add(A9454OMRCCos).subtract(O9454OMRCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9443OMRCCosT = O9443OMRCCosT.subtract(O9454OMRCCos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
               }
            }
         }
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
            {
               A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
            else
            {
               A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
         }
      }
   }

   public void endLevel13S1233( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13S1233( )
   {
      /* Scan By routine */
      /* Using cursor T013S42 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T013S42_A9446OMRepCod[0] ;
         A9449OMRTpo = T013S42_A9449OMRTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13S1233( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T013S42_A9446OMRepCod[0] ;
         A9449OMRTpo = T013S42_A9449OMRTpo[0] ;
      }
   }

   public void scanEnd13S1233( )
   {
      pr_default.close(36);
   }

   public void afterConfirm13S1233( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9453OMRCPre = A9448OMRepPre ;
      }
      if ( true /* After */ && true /* Level */ )
      {
         AV15oOMRCCnt = O9452OMRCCnt.negate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15oOMRCCnt", GXutil.ltrimstr( AV15oOMRCCnt, 12, 3));
      }
      if ( ( DecimalUtil.compareTo(AV15oOMRCCnt, A9452OMRCCnt) != 0 ) && true /* After */ && true /* Level */ )
      {
         AV19ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( DecimalUtil.compareTo(AV15oOMRCCnt, A9452OMRCCnt) != 0 ) && true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9425OMCod ;
         GXv_int6[0] = A9446OMRepCod ;
         GXv_int7[0] = AV16MTMovCod ;
         GXv_char3[0] = AV17MTMovNom ;
         GXv_int8[0] = (byte)(1) ;
         GXv_decimal9[0] = AV15oOMRCCnt ;
         GXv_decimal10[0] = A9452OMRCCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime11[0] = AV19ServerNow ;
         GXv_decimal12[0] = DecimalUtil.ZERO ;
         new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3, GXv_int8, GXv_decimal9, GXv_decimal10, GXv_char2, GXv_dtime11, GXv_decimal12) ;
         tmordce_impl.this.A396EmprCod = GXv_char4[0] ;
         tmordce_impl.this.A9425OMCod = GXv_int5[0] ;
         tmordce_impl.this.A9446OMRepCod = GXv_int6[0] ;
         tmordce_impl.this.AV16MTMovCod = GXv_int7[0] ;
         tmordce_impl.this.AV17MTMovNom = GXv_char3[0] ;
         tmordce_impl.this.AV15oOMRCCnt = GXv_decimal9[0] ;
         tmordce_impl.this.A9452OMRCCnt = GXv_decimal10[0] ;
         tmordce_impl.this.AV19ServerNow = GXv_dtime11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV15oOMRCCnt", GXutil.ltrimstr( AV15oOMRCCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert13S1233( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13S1233( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13S1233( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13S1233( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13S1233( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13S1233( )
   {
      edtOMRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepNom_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRepPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCnt_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCos_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void send_integrity_lvl_hashes13S1233( )
   {
   }

   public void zm13S1234( int GX_JID )
   {
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9462OMMCPre = T013S3_A9462OMMCPre[0] ;
            Z9459OMMRCnt = T013S3_A9459OMMRCnt[0] ;
            Z9460OMMRPre = T013S3_A9460OMMRPre[0] ;
            Z9461OMMCCnt = T013S3_A9461OMMCCnt[0] ;
         }
         else
         {
            Z9462OMMCPre = A9462OMMCPre ;
            Z9459OMMRCnt = A9459OMMRCnt ;
            Z9460OMMRPre = A9460OMMRPre ;
            Z9461OMMCCnt = A9461OMMCCnt ;
         }
      }
      if ( GX_JID == -38 )
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

   public void standaloneNotModal13S1234( )
   {
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_134_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
   }

   public void standaloneModal13S1234( )
   {
      if ( isIns( )  )
      {
         A9458OMMTpo = httpContext.getMessage( httpContext.getMessage( "C", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      }
      else
      {
         edtOMOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      }
   }

   public void load13S1234( )
   {
      /* Using cursor T013S43 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9462OMMCPre = T013S43_A9462OMMCPre[0] ;
         A9456OMOpeNom = T013S43_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013S43_n9456OMOpeNom[0] ;
         A9457OMOpePre = T013S43_A9457OMOpePre[0] ;
         n9457OMOpePre = T013S43_n9457OMOpePre[0] ;
         A9459OMMRCnt = T013S43_A9459OMMRCnt[0] ;
         A9460OMMRPre = T013S43_A9460OMMRPre[0] ;
         A9461OMMCCnt = T013S43_A9461OMMCCnt[0] ;
         zm13S1234( -38) ;
      }
      pr_default.close(37);
      onLoadActions13S1234( ) ;
   }

   public void onLoadActions13S1234( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      O9463OMMCCos = A9463OMMCCos ;
      if ( isIns( )  )
      {
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
   }

   public void checkExtendedTable13S1234( )
   {
      nIsDirty_1234 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13S1234( ) ;
      /* Using cursor T013S4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_134_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T013S4_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013S4_n9456OMOpeNom[0] ;
      A9457OMOpePre = T013S4_A9457OMOpePre[0] ;
      n9457OMOpePre = T013S4_n9457OMOpePre[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1234 = (short)(1) ;
         A9462OMMCPre = A9457OMOpePre ;
      }
      nIsDirty_1234 = (short)(1) ;
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1234 = (short)(1) ;
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1234 = (short)(1) ;
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1234 = (short)(1) ;
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         nIsDirty_1234 = (short)(1) ;
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            nIsDirty_1234 = (short)(1) ;
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            nIsDirty_1234 = (short)(1) ;
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
      }
   }

   public void closeExtendedTableCursors13S1234( )
   {
      pr_default.close(2);
   }

   public void enableDisable13S1234( )
   {
   }

   public void gxload_39( String A396EmprCod ,
                          int A9455OMOpeCod )
   {
      /* Using cursor T013S44 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_134_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T013S44_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013S44_n9456OMOpeNom[0] ;
      A9457OMOpePre = T013S44_A9457OMOpePre[0] ;
      n9457OMOpePre = T013S44_n9457OMOpePre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9456OMOpeNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(38) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(38);
   }

   public void getKey13S1234( )
   {
      /* Using cursor T013S45 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1234 = (short)(1) ;
      }
      else
      {
         RcdFound1234 = (short)(0) ;
      }
      pr_default.close(39);
   }

   public void getByPrimaryKey13S1234( )
   {
      /* Using cursor T013S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(1) != 101) && ( T013S3_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013S3_A9458OMMTpo[0], "C") == 0 ) && ( GXutil.strcmp(T013S3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13S1234( 38) ;
         RcdFound1234 = (short)(1) ;
         initializeNonKey13S1234( ) ;
         A9458OMMTpo = T013S3_A9458OMMTpo[0] ;
         A9462OMMCPre = T013S3_A9462OMMCPre[0] ;
         A9459OMMRCnt = T013S3_A9459OMMRCnt[0] ;
         A9460OMMRPre = T013S3_A9460OMMRPre[0] ;
         A9461OMMCCnt = T013S3_A9461OMMCCnt[0] ;
         A9455OMOpeCod = T013S3_A9455OMOpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13S1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1234 = (short)(0) ;
         initializeNonKey13S1234( ) ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13S1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13S1234( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13S1234( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9462OMMCPre, T013S2_A9462OMMCPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9459OMMRCnt, T013S2_A9459OMMRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9460OMMRPre, T013S2_A9460OMMRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9461OMMCCnt, T013S2_A9461OMMCCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9462OMMCPre, T013S2_A9462OMMCPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMMCPre");
               GXutil.writeLogRaw("Old: ",Z9462OMMCPre);
               GXutil.writeLogRaw("Current: ",T013S2_A9462OMMCPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9459OMMRCnt, T013S2_A9459OMMRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMMRCnt");
               GXutil.writeLogRaw("Old: ",Z9459OMMRCnt);
               GXutil.writeLogRaw("Current: ",T013S2_A9459OMMRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9460OMMRPre, T013S2_A9460OMMRPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMMRPre");
               GXutil.writeLogRaw("Old: ",Z9460OMMRPre);
               GXutil.writeLogRaw("Current: ",T013S2_A9460OMMRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9461OMMCCnt, T013S2_A9461OMMCCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordce:[seudo value changed for attri]"+"OMMCCnt");
               GXutil.writeLogRaw("Old: ",Z9461OMMCCnt);
               GXutil.writeLogRaw("Current: ",T013S2_A9461OMMCCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13S1234( )
   {
      beforeValidate13S1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13S1234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13S1234( 0) ;
         checkOptimisticConcurrency13S1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13S1234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13S1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013S46 */
                  pr_default.execute(40, new Object[] {Integer.valueOf(A9425OMCod), A9458OMMTpo, A9462OMMCPre, A9459OMMRCnt, A9460OMMRPre, A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                  if ( (pr_default.getStatus(40) == 1) )
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
            load13S1234( ) ;
         }
         endLevel13S1234( ) ;
      }
      closeExtendedTableCursors13S1234( ) ;
   }

   public void update13S1234( )
   {
      beforeValidate13S1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13S1234( ) ;
      }
      if ( ( nIsMod_1234 != 0 ) || ( nIsDirty_1234 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13S1234( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13S1234( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13S1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013S47 */
                     pr_default.execute(41, new Object[] {A9462OMMCPre, A9459OMMRCnt, A9460OMMRPre, A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                     if ( (pr_default.getStatus(41) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13S1234( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13S1234( ) ;
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
            endLevel13S1234( ) ;
         }
      }
      closeExtendedTableCursors13S1234( ) ;
   }

   public void deferredUpdate13S1234( )
   {
   }

   public void delete13S1234( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13S1234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13S1234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13S1234( ) ;
         afterConfirm13S1234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13S1234( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013S48 */
               pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
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
      endLevel13S1234( ) ;
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13S1234( )
   {
      standaloneModal13S1234( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013S49 */
         pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T013S49_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013S49_n9456OMOpeNom[0] ;
         A9457OMOpePre = T013S49_A9457OMOpePre[0] ;
         n9457OMOpePre = T013S49_n9457OMOpePre[0] ;
         pr_default.close(43);
         A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
         if ( isIns( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               }
            }
         }
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
         }
         else
         {
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
            {
               A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
            else
            {
               A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013S50 */
         pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
      }
   }

   public void endLevel13S1234( )
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

   public void scanStart13S1234( )
   {
      /* Scan By routine */
      /* Using cursor T013S51 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T013S51_A9455OMOpeCod[0] ;
         A9458OMMTpo = T013S51_A9458OMMTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13S1234( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T013S51_A9455OMOpeCod[0] ;
         A9458OMMTpo = T013S51_A9458OMMTpo[0] ;
      }
   }

   public void scanEnd13S1234( )
   {
      pr_default.close(45);
   }

   public void afterConfirm13S1234( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
   }

   public void beforeInsert13S1234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13S1234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13S1234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13S1234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13S1234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13S1234( )
   {
      edtOMOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      edtOMOpePre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_134_Refreshing);
      edtOMMRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      edtOMMRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      edtOMMCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      edtOMMCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_134_Refreshing);
   }

   public void send_integrity_lvl_hashes13S1234( )
   {
   }

   public void send_integrity_lvl_hashes13S1232( )
   {
   }

   public void subsflControlProps_1201233( )
   {
      edtavnRcdDeleted_1233_Internalname = "vNRCDDELETED_1233_"+sGXsfl_120_idx ;
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_120_idx ;
      edtOMRepNom_Internalname = "OMREPNOM_"+sGXsfl_120_idx ;
      edtOMRepPre_Internalname = "OMREPPRE_"+sGXsfl_120_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_120_idx );
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_120_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_120_idx ;
      edtOMRCCnt_Internalname = "OMRCCNT_"+sGXsfl_120_idx ;
      edtOMRCPre_Internalname = "OMRCPRE_"+sGXsfl_120_idx ;
      edtOMRCCos_Internalname = "OMRCCOS_"+sGXsfl_120_idx ;
   }

   public void subsflControlProps_fel_1201233( )
   {
      edtavnRcdDeleted_1233_Internalname = "vNRCDDELETED_1233_"+sGXsfl_120_fel_idx ;
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_120_fel_idx ;
      edtOMRepNom_Internalname = "OMREPNOM_"+sGXsfl_120_fel_idx ;
      edtOMRepPre_Internalname = "OMREPPRE_"+sGXsfl_120_fel_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_120_fel_idx );
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_120_fel_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_120_fel_idx ;
      edtOMRCCnt_Internalname = "OMRCCNT_"+sGXsfl_120_fel_idx ;
      edtOMRCPre_Internalname = "OMRCPRE_"+sGXsfl_120_fel_idx ;
      edtOMRCCos_Internalname = "OMRCCOS_"+sGXsfl_120_fel_idx ;
   }

   public void addRow13S1233( )
   {
      nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1201233( ) ;
      sendRow13S1233( ) ;
   }

   public void sendRow13S1233( )
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
         if ( ((int)((nGXsfl_120_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1233_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1233_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1233), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1233), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1233_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1233_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRepCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepNom_Internalname,GXutil.rtrim( A9447OMRepNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRepNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRepPre_Enabled!=0) ? localUtil.format( A9448OMRepPre, "ZZZZZZ9.999") : localUtil.format( A9448OMRepPre, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRepPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMRTPO_" + sGXsfl_120_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9449OMRTpo)==0) )
         {
            A9449OMRTpo = "C" ;
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMRTpo,cmbOMRTpo.getInternalname(),GXutil.rtrim( A9449OMRTpo),Integer.valueOf(1),cmbOMRTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbOMRTpo.getVisible()),Integer.valueOf(cmbOMRTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Values", cmbOMRTpo.ToJavascriptSource(), !bGXsfl_120_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCnt_Enabled!=0) ? localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRPre_Enabled!=0) ? localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRRPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRCCnt_Enabled!=0) ? localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRCPre_Enabled!=0) ? localUtil.format( A9453OMRCPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9453OMRCPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRCCos_Enabled!=0) ? localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999") : localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMRCCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes13S1233( ) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9449OMRTpo));
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9452OMRCCnt_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9454OMRCCos_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1233_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1233_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1233_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1233_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPCOD_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPNOM_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRTPO_"+sGXsfl_120_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRTPO_"+sGXsfl_120_idx+"Width", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getWidth(), (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRTPO_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCNT_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCPRE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCOS_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow13S1233( )
   {
      nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1201233( ) ;
      edtavnRcdDeleted_1233_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1233_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPNOM_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPPRE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMRTpo.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_120_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbOMRTpo.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_120_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCNT_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCPRE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRCCOS_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "OMREPCOD_" + sGXsfl_120_idx ;
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
         GXCCtl = "OMRRCNT_" + sGXsfl_120_idx ;
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
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRRPRE_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRRPre_Internalname ;
         wbErr = true ;
         A9451OMRRPre = DecimalUtil.ZERO ;
      }
      else
      {
         A9451OMRRPre = localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRCCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRCCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRCCNT_" + sGXsfl_120_idx ;
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
      A9453OMRCPre = localUtil.ctond( httpContext.cgiGet( edtOMRCPre_Internalname)) ;
      A9454OMRCCos = localUtil.ctond( httpContext.cgiGet( edtOMRCCos_Internalname)) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_120_idx ;
      Z9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_120_idx ;
      Z9449OMRTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_120_idx ;
      Z9453OMRCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_120_idx ;
      Z9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_120_idx ;
      Z9451OMRRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_120_idx ;
      Z9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9452OMRCCnt_" + sGXsfl_120_idx ;
      O9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9454OMRCCos_" + sGXsfl_120_idx ;
      O9454OMRCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_120_idx ;
      nRcdDeleted_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1233_" + sGXsfl_120_idx ;
      nRcdExists_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1233_" + sGXsfl_120_idx ;
      nIsMod_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1341234( )
   {
      edtavnRcdDeleted_1234_Internalname = "vNRCDDELETED_1234_"+sGXsfl_134_idx ;
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_134_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_134_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_134_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_134_idx );
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_134_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_134_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_134_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_134_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_134_idx ;
   }

   public void subsflControlProps_fel_1341234( )
   {
      edtavnRcdDeleted_1234_Internalname = "vNRCDDELETED_1234_"+sGXsfl_134_fel_idx ;
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_134_fel_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_134_fel_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_134_fel_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_134_fel_idx );
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_134_fel_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_134_fel_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_134_fel_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_134_fel_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_134_fel_idx ;
   }

   public void addRow13S1234( )
   {
      nGXsfl_134_idx = (int)(nGXsfl_134_idx+1) ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1341234( ) ;
      sendRow13S1234( ) ;
   }

   public void sendRow13S1234( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_134_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1234_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1234_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1234), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1234), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1234_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1234_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeNom_Internalname,GXutil.rtrim( A9456OMOpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpePre_Internalname,GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMOpePre_Enabled!=0) ? localUtil.format( A9457OMOpePre, "ZZZZZ9.999") : localUtil.format( A9457OMOpePre, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpePre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMOpePre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMMTPO_" + sGXsfl_134_idx ;
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
      Grid2Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMMTpo,cmbOMMTpo.getInternalname(),GXutil.rtrim( A9458OMMTpo),Integer.valueOf(1),cmbOMMTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbOMMTpo.getVisible()),Integer.valueOf(cmbOMMTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Values", cmbOMMTpo.ToJavascriptSource(), !bGXsfl_134_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCnt_Enabled!=0) ? localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,140);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRPre_Enabled!=0) ? localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMRPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCnt_Enabled!=0) ? localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,142);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCPre_Enabled!=0) ? localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCos_Enabled!=0) ? localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999") : localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOMMCCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes13S1234( ) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9458OMMTpo));
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9463OMMCCos_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1234_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1234_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_134_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1234_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECOD_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPENOM_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPEPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_134_idx+"Width", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getWidth(), (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCNT_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCNT_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCPRE_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCOS_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow13S1234( )
   {
      nGXsfl_134_idx = (int)(nGXsfl_134_idx+1) ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1341234( ) ;
      edtavnRcdDeleted_1234_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1234_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMMTpo.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_134_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbOMMTpo.setWidth( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_134_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_134_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "OMOPECOD_" + sGXsfl_134_idx ;
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
         GXCCtl = "OMMRCNT_" + sGXsfl_134_idx ;
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
         GXCCtl = "OMMRPRE_" + sGXsfl_134_idx ;
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
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMCCNT_" + sGXsfl_134_idx ;
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
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_134_idx ;
      Z9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_134_idx ;
      Z9458OMMTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_134_idx ;
      Z9462OMMCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_134_idx ;
      Z9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_134_idx ;
      Z9460OMMRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_134_idx ;
      Z9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9463OMMCCos_" + sGXsfl_134_idx ;
      O9463OMMCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_134_idx ;
      nRcdDeleted_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1234_" + sGXsfl_134_idx ;
      nRcdExists_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1234_" + sGXsfl_134_idx ;
      nIsMod_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOMMCPre_Enabled = edtOMMCPre_Enabled ;
      defcmbOMMTpo_Enabled = cmbOMMTpo.getEnabled() ;
      defedtOMOpeCod_Enabled = edtOMOpeCod_Enabled ;
      defedtOMRCPre_Enabled = edtOMRCPre_Enabled ;
      defcmbOMRTpo_Enabled = cmbOMRTpo.getEnabled() ;
      defedtOMRepCod_Enabled = edtOMRepCod_Enabled ;
   }

   public void confirmValues13S0( )
   {
      nGXsfl_120_idx = 0 ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1201233( ) ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1201233( ) ;
         httpContext.changePostValue( "Z9446OMRepCod_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z9446OMRepCod_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z9449OMRTpo_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z9449OMRTpo_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z9453OMRCPre_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z9453OMRCPre_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z9450OMRRCnt_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z9451OMRRPre_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z9451OMRRPre_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z9452OMRCCnt_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_120_idx) ;
      }
      nGXsfl_134_idx = 0 ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1341234( ) ;
      while ( nGXsfl_134_idx < nRC_GXsfl_134 )
      {
         nGXsfl_134_idx = (int)(nGXsfl_134_idx+1) ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1341234( ) ;
         httpContext.changePostValue( "Z9455OMOpeCod_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z9458OMMTpo_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z9458OMMTpo_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z9462OMMCPre_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z9462OMMCPre_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z9459OMMRCnt_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z9460OMMRPre_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z9460OMMRPre_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z9461OMMCCnt_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_134_idx) ;
      }
      httpContext.changePostValue( "O9452OMRCCnt", httpContext.cgiGet( "T9452OMRCCnt")) ;
      httpContext.deletePostValue( "T9452OMRCCnt") ;
      httpContext.changePostValue( "O9454OMRCCos", httpContext.cgiGet( "T9454OMRCCos")) ;
      httpContext.deletePostValue( "T9454OMRCCos") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmordce", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","OMCod","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdCe");
      forbiddenHiddens.add("OMTxt", GXutil.rtrim( localUtil.format( A9433OMTxt, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("OMFchCer", localUtil.format( A9439OMFchCer, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmordce:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9433OMTxt", Z9433OMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9436OMFchCre", localUtil.ttoc( Z9436OMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9437OMUsuCre", GXutil.rtrim( Z9437OMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9438OMFchPre", localUtil.dtoc( Z9438OMFchPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9439OMFchCer", localUtil.ttoc( Z9439OMFchCer, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9464OMNot", Z9464OMNot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9434OMOpeRes", GXutil.ltrim( localUtil.ntoc( Z9434OMOpeRes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9429PMCod", GXutil.ltrim( localUtil.ntoc( Z9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9428SMCod", GXutil.ltrim( localUtil.ntoc( Z9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( O9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9443OMRCCosT", GXutil.ltrim( localUtil.ntoc( O9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_120", GXutil.ltrim( localUtil.ntoc( nGXsfl_120_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_134", GXutil.ltrim( localUtil.ntoc( nGXsfl_134_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOOMRCCNT", GXutil.ltrim( localUtil.ntoc( AV15oOMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMRCCNT", GXutil.ltrim( localUtil.ntoc( AV18nOMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERVERNOW", localUtil.ttoc( AV19ServerNow, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVNOM", GXutil.rtrim( AV17MTMovNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVCOD", GXutil.ltrim( localUtil.ntoc( AV16MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mantenimientomaquina.tmordce", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","OMCod","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMOrdCe" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ordenes de Mantenimiento", "") ;
   }

   public void initializeNonKey13S1232( )
   {
      A9440OMCosRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9440OMCosRea", GXutil.ltrimstr( A9440OMCosRea, 12, 3));
      A9426OMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      A9428SMCod = 0 ;
      n9428SMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      A9429PMCod = 0 ;
      n9429PMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      A9433OMTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9433OMTxt", A9433OMTxt);
      A9434OMOpeRes = 0 ;
      n9434OMOpeRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9434OMOpeRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9434OMOpeRes), 6, 0));
      A9435OMOpeResN = "" ;
      n9435OMOpeResN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", A9435OMOpeResN);
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A9436OMFchCre", localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9437OMUsuCre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9437OMUsuCre", A9437OMUsuCre);
      A9438OMFchPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A9438OMFchPre", localUtil.format(A9438OMFchPre, "99/99/99"));
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A9439OMFchCer", localUtil.ttoc( A9439OMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9445OMEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      A9464OMNot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9464OMNot", A9464OMNot);
      O9441OMMCCosT = A9441OMMCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9443OMRCCosT = A9443OMRCCosT ;
      httpContext.ajax_rsp_assign_attri("", false, "A9443OMRCCosT", GXutil.ltrimstr( A9443OMRCCosT, 12, 3));
      Z9433OMTxt = "" ;
      Z9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9437OMUsuCre = "" ;
      Z9438OMFchPre = GXutil.nullDate() ;
      Z9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      Z9445OMEst = "" ;
      Z9464OMNot = "" ;
      Z9426OMMaqCod = "" ;
      Z9434OMOpeRes = 0 ;
      Z9429PMCod = 0 ;
      Z9428SMCod = 0 ;
   }

   public void initAll13S1232( )
   {
      initializeNonKey13S1232( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey13S1233( )
   {
      AV15oOMRCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15oOMRCCnt", GXutil.ltrimstr( AV15oOMRCCnt, 12, 3));
      AV18nOMRCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18nOMRCCnt", GXutil.ltrimstr( AV18nOMRCCnt, 12, 3));
      AV19ServerNow = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9454OMRCCos = DecimalUtil.ZERO ;
      A9447OMRepNom = "" ;
      n9447OMRepNom = false ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      n9448OMRepPre = false ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      O9452OMRCCnt = A9452OMRCCnt ;
      O9454OMRCCos = A9454OMRCCos ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
   }

   public void initAll13S1233( )
   {
      A9446OMRepCod = 0 ;
      A9449OMRTpo = "C" ;
      initializeNonKey13S1233( ) ;
   }

   public void standaloneModalInsert13S1233( )
   {
   }

   public void initializeNonKey13S1234( )
   {
      A9463OMMCCos = DecimalUtil.ZERO ;
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

   public void initAll13S1234( )
   {
      A9455OMOpeCod = 0 ;
      A9458OMMTpo = "C" ;
      initializeNonKey13S1234( ) ;
   }

   public void standaloneModalInsert13S1234( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241542379", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmordce.js", "?20268241542379", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1233( )
   {
      edtOMRCPre_Enabled = defedtOMRCPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCPre_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      cmbOMRTpo.setEnabled( defcmbOMRTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_120_Refreshing);
      edtOMRepCod_Enabled = defedtOMRepCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void init_level_properties1234( )
   {
      edtOMMCPre_Enabled = defedtOMMCPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_134_Refreshing);
      cmbOMMTpo.setEnabled( defcmbOMMTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_134_Refreshing);
      edtOMOpeCod_Enabled = defedtOMOpeCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_134_Refreshing);
   }

   public void startgridcontrol120( )
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
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getWidth(), (byte)(9), (byte)(0), ".", "")));
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

   public void startgridcontrol134( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1234_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A9456OMOpeNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A9458OMMTpo));
      Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getWidth(), (byte)(9), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtSMCod_Internalname = "SMCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPMCod_Internalname = "PMCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtOMTxt_Internalname = "OMTXT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtOMOpeRes_Internalname = "OMOPERES" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtOMOpeResN_Internalname = "OMOPERESN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtOMFchCre_Internalname = "OMFCHCRE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtOMUsuCre_Internalname = "OMUSUCRE" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtOMFchPre_Internalname = "OMFCHPRE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOMFchCer_Internalname = "OMFCHCER" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOMCosRea_Internalname = "OMCOSREA" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtOMMRCosT_Internalname = "OMMRCOST" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtOMRCCosT_Internalname = "OMRCCOST" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtavnRcdDeleted_1233_Internalname = "vNRCDDELETED_1233" ;
      edtOMRepCod_Internalname = "OMREPCOD" ;
      edtOMRepNom_Internalname = "OMREPNOM" ;
      edtOMRepPre_Internalname = "OMREPPRE" ;
      cmbOMRTpo.setInternalname( "OMRTPO" );
      edtOMRRCnt_Internalname = "OMRRCNT" ;
      edtOMRRPre_Internalname = "OMRRPRE" ;
      edtOMRCCnt_Internalname = "OMRCCNT" ;
      edtOMRCPre_Internalname = "OMRCPRE" ;
      edtOMRCCos_Internalname = "OMRCCOS" ;
      edtavnRcdDeleted_1234_Internalname = "vNRCDDELETED_1234" ;
      edtOMOpeCod_Internalname = "OMOPECOD" ;
      edtOMOpeNom_Internalname = "OMOPENOM" ;
      edtOMOpePre_Internalname = "OMOPEPRE" ;
      cmbOMMTpo.setInternalname( "OMMTPO" );
      edtOMMRCnt_Internalname = "OMMRCNT" ;
      edtOMMRPre_Internalname = "OMMRPRE" ;
      edtOMMCCnt_Internalname = "OMMCCNT" ;
      edtOMMCPre_Internalname = "OMMCPRE" ;
      edtOMMCCos_Internalname = "OMMCCOS" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtOMNot_Internalname = "OMNOT" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Ordenes de Mantenimiento", "") );
      edtOMMCCos_Jsonclick = "" ;
      edtOMMCPre_Jsonclick = "" ;
      edtOMMCCnt_Jsonclick = "" ;
      edtOMMRPre_Jsonclick = "" ;
      edtOMMRCnt_Jsonclick = "" ;
      cmbOMMTpo.setJsonclick( "" );
      edtOMOpePre_Jsonclick = "" ;
      edtOMOpeNom_Jsonclick = "" ;
      edtOMOpeCod_Jsonclick = "" ;
      edtavnRcdDeleted_1234_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtOMRCCos_Jsonclick = "" ;
      edtOMRCPre_Jsonclick = "" ;
      edtOMRCCnt_Jsonclick = "" ;
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
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtOMNot_Backcolor = (int)(0xFFFFFF) ;
      edtOMNot_Enabled = 1 ;
      edtOMMCCos_Enabled = 0 ;
      edtOMMCPre_Enabled = 0 ;
      edtOMMCCnt_Enabled = 1 ;
      edtOMMRPre_Enabled = 1 ;
      edtOMMRCnt_Enabled = 1 ;
      cmbOMMTpo.setEnabled( 0 );
      edtOMOpePre_Enabled = 0 ;
      edtOMOpeNom_Enabled = 0 ;
      edtOMOpeCod_Enabled = 1 ;
      edtavnRcdDeleted_1234_Enabled = 1 ;
      edtOMRCCos_Enabled = 0 ;
      edtOMRCPre_Enabled = 0 ;
      edtOMRCCnt_Enabled = 1 ;
      edtOMRRPre_Enabled = 1 ;
      edtOMRRCnt_Enabled = 1 ;
      cmbOMRTpo.setEnabled( 0 );
      edtOMRepPre_Enabled = 0 ;
      edtOMRepNom_Enabled = 0 ;
      edtOMRepCod_Enabled = 1 ;
      edtavnRcdDeleted_1233_Enabled = 1 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 1 );
      cmbOMEst.setIBackground( (int)(0xFFFFFF) );
      edtOMRRCosT_Jsonclick = "" ;
      edtOMRRCosT_Backcolor = (int)(0xFFFFFF) ;
      edtOMRRCosT_Enabled = 0 ;
      edtOMRCCosT_Jsonclick = "" ;
      edtOMRCCosT_Backcolor = (int)(0xFFFFFF) ;
      edtOMRCCosT_Enabled = 0 ;
      edtOMMRCosT_Jsonclick = "" ;
      edtOMMRCosT_Backcolor = (int)(0xFFFFFF) ;
      edtOMMRCosT_Enabled = 0 ;
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMCCosT_Backcolor = (int)(0xFFFFFF) ;
      edtOMMCCosT_Enabled = 0 ;
      edtOMCosRea_Jsonclick = "" ;
      edtOMCosRea_Backcolor = (int)(0xFFFFFF) ;
      edtOMCosRea_Enabled = 0 ;
      edtOMFchCer_Jsonclick = "" ;
      edtOMFchCer_Backcolor = (int)(0xFFFFFF) ;
      edtOMFchCer_Enabled = 0 ;
      edtOMFchPre_Jsonclick = "" ;
      edtOMFchPre_Backcolor = (int)(0xFFFFFF) ;
      edtOMFchPre_Enabled = 1 ;
      edtOMUsuCre_Jsonclick = "" ;
      edtOMUsuCre_Backcolor = (int)(0xFFFFFF) ;
      edtOMUsuCre_Enabled = 1 ;
      edtOMFchCre_Jsonclick = "" ;
      edtOMFchCre_Backcolor = (int)(0xFFFFFF) ;
      edtOMFchCre_Enabled = 1 ;
      edtOMOpeResN_Jsonclick = "" ;
      edtOMOpeResN_Backcolor = (int)(0xFFFFFF) ;
      edtOMOpeResN_Enabled = 0 ;
      edtOMOpeRes_Jsonclick = "" ;
      edtOMOpeRes_Backcolor = (int)(0xFFFFFF) ;
      edtOMOpeRes_Enabled = 1 ;
      edtOMTxt_Backcolor = (int)(0xFFFFFF) ;
      edtOMTxt_Enabled = 0 ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Backcolor = (int)(0xFFFFFF) ;
      edtPMCod_Enabled = 1 ;
      edtSMCod_Jsonclick = "" ;
      edtSMCod_Backcolor = (int)(0xFFFFFF) ;
      edtSMCod_Enabled = 1 ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtOMMaqDsc_Enabled = 0 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtOMMaqCod_Enabled = 1 ;
      bttBtn_get_Enabled = 0 ;
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
      cmbOMMTpo.setWidth( 0 );
      cmbOMMTpo.setVisible( -1 );
      cmbOMRTpo.setWidth( 0 );
      cmbOMRTpo.setVisible( -1 );
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

   public void xc_19_13S1233( )
   {
      if ( ( DecimalUtil.compareTo(AV15oOMRCCnt, A9452OMRCCnt) != 0 ) && true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A9425OMCod ;
         GXv_int6[0] = A9446OMRepCod ;
         GXv_int5[0] = AV16MTMovCod ;
         GXv_char3[0] = AV17MTMovNom ;
         GXv_int8[0] = (byte)(1) ;
         GXv_decimal12[0] = AV15oOMRCCnt ;
         GXv_decimal10[0] = A9452OMRCCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime11[0] = AV19ServerNow ;
         GXv_decimal9[0] = DecimalUtil.ZERO ;
         new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_int5, GXv_char3, GXv_int8, GXv_decimal12, GXv_decimal10, GXv_char2, GXv_dtime11, GXv_decimal9) ;
         A396EmprCod = GXv_char4[0] ;
         A9425OMCod = GXv_int7[0] ;
         A9446OMRepCod = GXv_int6[0] ;
         AV16MTMovCod = GXv_int5[0] ;
         AV17MTMovNom = GXv_char3[0] ;
         AV15oOMRCCnt = GXv_decimal12[0] ;
         A9452OMRCCnt = GXv_decimal10[0] ;
         AV19ServerNow = GXv_dtime11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV15oOMRCCnt", GXutil.ltrimstr( AV15oOMRCCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      subsflControlProps_1201233( ) ;
      while ( nGXsfl_120_idx <= nRC_GXsfl_120 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13S1233( ) ;
         standaloneModal13S1233( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13S1233( ) ;
         nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1201233( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1341234( ) ;
      while ( nGXsfl_134_idx <= nRC_GXsfl_134 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13S1234( ) ;
         standaloneModal13S1234( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13S1234( ) ;
         nGXsfl_134_idx = (int)(nGXsfl_134_idx+1) ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1341234( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      GXCCtl = "OMRTPO_" + sGXsfl_120_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9449OMRTpo)==0) )
         {
            A9449OMRTpo = "C" ;
         }
      }
      GXCCtl = "OMMTPO_" + sGXsfl_134_idx ;
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

   public void valid_Ommaqcod( )
   {
      n9427OMMaqDsc = false ;
      /* Using cursor T013S32 */
      pr_default.execute(26, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMaqCod_Internalname ;
      }
      A9427OMMaqDsc = T013S32_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T013S32_n9427OMMaqDsc[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", GXutil.rtrim( A9427OMMaqDsc));
   }

   public void valid_Smcod( )
   {
      n9428SMCod = false ;
      /* Using cursor T013S52 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9428SMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSolicitudes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSMCod_Internalname ;
         }
      }
      pr_default.close(46);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Pmcod( )
   {
      n9429PMCod = false ;
      /* Using cursor T013S53 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9429PMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPreventivo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPMCod_Internalname ;
         }
      }
      pr_default.close(47);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Omoperes( )
   {
      n9434OMOpeRes = false ;
      n9435OMOpeResN = false ;
      /* Using cursor T013S33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n9434OMOpeRes), Integer.valueOf(A9434OMOpeRes)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9434OMOpeRes) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPERES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOMOpeRes_Internalname ;
         }
      }
      A9435OMOpeResN = T013S33_A9435OMOpeResN[0] ;
      n9435OMOpeResN = T013S33_n9435OMOpeResN[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9435OMOpeResN", GXutil.rtrim( A9435OMOpeResN));
   }

   public void valid_Omrepcod( )
   {
      n9448OMRepPre = false ;
      n9447OMRepNom = false ;
      /* Using cursor T013S41 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMREPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
      }
      A9447OMRepNom = T013S41_A9447OMRepNom[0] ;
      n9447OMRepNom = T013S41_n9447OMRepNom[0] ;
      A9448OMRepPre = T013S41_A9448OMRepPre[0] ;
      n9448OMRepPre = T013S41_n9448OMRepPre[0] ;
      pr_default.close(35);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9453OMRCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9453OMRCPre = A9448OMRepPre ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A9453OMRCPre", GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Omrccnt( )
   {
      A9445OMEst = cmbOMEst.getValue() ;
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
      }
      else
      {
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
         }
         else
         {
            A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
         }
      }
      AV18nOMRCCnt = A9452OMRCCnt.negate() ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18nOMRCCnt", GXutil.ltrim( localUtil.ntoc( AV18nOMRCCnt, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Omopecod( )
   {
      n9457OMOpePre = false ;
      n9456OMOpeNom = false ;
      /* Using cursor T013S49 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
      }
      A9456OMOpeNom = T013S49_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013S49_n9456OMOpeNom[0] ;
      A9457OMOpePre = T013S49_A9457OMOpePre[0] ;
      n9457OMOpePre = T013S49_n9457OMOpePre[0] ;
      pr_default.close(43);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213S2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''}]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''}]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_SMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMOPERES","{handler:'valid_Omoperes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9434OMOpeRes',fld:'OMOPERES',pic:'ZZZZZ9'},{av:'A9435OMOpeResN',fld:'OMOPERESN',pic:''}]");
      setEventMetadata("VALID_OMOPERES",",oparms:[{av:'A9435OMOpeResN',fld:'OMOPERESN',pic:''}]}");
      setEventMetadata("VALID_OMMCCOST","{handler:'valid_Ommccost',iparms:[]");
      setEventMetadata("VALID_OMMCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOST","{handler:'valid_Ommrcost',iparms:[]");
      setEventMetadata("VALID_OMMRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOST","{handler:'valid_Omrccost',iparms:[]");
      setEventMetadata("VALID_OMRCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOST","{handler:'valid_Omrrcost',iparms:[]");
      setEventMetadata("VALID_OMRRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMEST","{handler:'valid_Omest',iparms:[]");
      setEventMetadata("VALID_OMEST",",oparms:[]}");
      setEventMetadata("VALID_OMREPCOD","{handler:'valid_Omrepcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMREPCOD",",oparms:[{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMREPPRE","{handler:'valid_Omreppre',iparms:[]");
      setEventMetadata("VALID_OMREPPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRTPO","{handler:'valid_Omrtpo',iparms:[]");
      setEventMetadata("VALID_OMRTPO",",oparms:[]}");
      setEventMetadata("VALID_OMRCCNT","{handler:'valid_Omrccnt',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O9454OMRCCos'},{av:'O9443OMRCCosT'},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9454OMRCCos',fld:'OMRCCOS',pic:'ZZZZZZZ9.999'},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'},{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9443OMRCCosT',fld:'OMRCCOST',pic:'ZZZZZZZ9.999'},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV18nOMRCCnt',fld:'vNOMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMRCCNT",",oparms:[{av:'A9454OMRCCos',fld:'OMRCCOS',pic:'ZZZZZZZ9.999'},{av:'AV18nOMRCCnt',fld:'vNOMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMRCPRE","{handler:'valid_Omrcpre',iparms:[]");
      setEventMetadata("VALID_OMRCPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOS","{handler:'valid_Omrccos',iparms:[]");
      setEventMetadata("VALID_OMRCCOS",",oparms:[]}");
      setEventMetadata("VALID_OMOPECOD","{handler:'valid_Omopecod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMOPECOD",",oparms:[{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMOPEPRE","{handler:'valid_Omopepre',iparms:[]");
      setEventMetadata("VALID_OMOPEPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMTPO","{handler:'valid_Ommtpo',iparms:[]");
      setEventMetadata("VALID_OMMTPO",",oparms:[]}");
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
      pr_default.close(43);
      pr_default.close(35);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(47);
      pr_default.close(46);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z9433OMTxt = "" ;
      Z9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9437OMUsuCre = "" ;
      Z9438OMFchPre = GXutil.nullDate() ;
      Z9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      Z9445OMEst = "" ;
      Z9464OMNot = "" ;
      Z9426OMMaqCod = "" ;
      O9441OMMCCosT = DecimalUtil.ZERO ;
      O9443OMRCCosT = DecimalUtil.ZERO ;
      Z9449OMRTpo = "" ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      O9452OMRCCnt = DecimalUtil.ZERO ;
      O9454OMRCCos = DecimalUtil.ZERO ;
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
      A9426OMMaqCod = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      A9427OMMaqDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A9433OMTxt = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A9435OMOpeResN = "" ;
      lblTextblock11_Jsonclick = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock12_Jsonclick = "" ;
      A9437OMUsuCre = "" ;
      lblTextblock13_Jsonclick = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock15_Jsonclick = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9441OMMCCosT = DecimalUtil.ZERO ;
      B9443OMRCCosT = DecimalUtil.ZERO ;
      sMode1233 = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1234 = "" ;
      lblTextblock21_Jsonclick = "" ;
      A9464OMNot = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV21Pgmname = "" ;
      AV15oOMRCCnt = DecimalUtil.ZERO ;
      AV18nOMRCCnt = DecimalUtil.ZERO ;
      AV19ServerNow = GXutil.resetTime( GXutil.nullDate() );
      AV17MTMovNom = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1232 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s9441OMMCCosT = DecimalUtil.ZERO ;
      s9440OMCosRea = DecimalUtil.ZERO ;
      O9440OMCosRea = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9456OMOpeNom = "" ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9458OMMTpo = "" ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      T9463OMMCCos = DecimalUtil.ZERO ;
      s9443OMRCCosT = DecimalUtil.ZERO ;
      A9447OMRepNom = "" ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      A9449OMRTpo = "" ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      T9452OMRCCnt = DecimalUtil.ZERO ;
      T9454OMRCCos = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z9441OMMCCosT = DecimalUtil.ZERO ;
      Z9442OMMRCosT = DecimalUtil.ZERO ;
      Z9443OMRCCosT = DecimalUtil.ZERO ;
      Z9444OMRRCosT = DecimalUtil.ZERO ;
      Z9427OMMaqDsc = "" ;
      Z9435OMOpeResN = "" ;
      T013S10_A407EmprNom = new String[] {""} ;
      T013S10_n407EmprNom = new boolean[] {false} ;
      T013S16_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S16_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S18_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S18_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S21_A9425OMCod = new int[1] ;
      T013S21_A407EmprNom = new String[] {""} ;
      T013S21_n407EmprNom = new boolean[] {false} ;
      T013S21_A9427OMMaqDsc = new String[] {""} ;
      T013S21_n9427OMMaqDsc = new boolean[] {false} ;
      T013S21_A9433OMTxt = new String[] {""} ;
      T013S21_A9435OMOpeResN = new String[] {""} ;
      T013S21_n9435OMOpeResN = new boolean[] {false} ;
      T013S21_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013S21_A9437OMUsuCre = new String[] {""} ;
      T013S21_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013S21_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013S21_A9445OMEst = new String[] {""} ;
      T013S21_A9464OMNot = new String[] {""} ;
      T013S21_A396EmprCod = new String[] {""} ;
      T013S21_A9426OMMaqCod = new String[] {""} ;
      T013S21_A9434OMOpeRes = new int[1] ;
      T013S21_n9434OMOpeRes = new boolean[] {false} ;
      T013S21_A9429PMCod = new int[1] ;
      T013S21_n9429PMCod = new boolean[] {false} ;
      T013S21_A9428SMCod = new int[1] ;
      T013S21_n9428SMCod = new boolean[] {false} ;
      T013S21_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S21_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S21_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S21_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S11_A9427OMMaqDsc = new String[] {""} ;
      T013S11_n9427OMMaqDsc = new boolean[] {false} ;
      T013S12_A9435OMOpeResN = new String[] {""} ;
      T013S12_n9435OMOpeResN = new boolean[] {false} ;
      T013S13_A396EmprCod = new String[] {""} ;
      T013S14_A396EmprCod = new String[] {""} ;
      T013S22_A9427OMMaqDsc = new String[] {""} ;
      T013S22_n9427OMMaqDsc = new boolean[] {false} ;
      T013S23_A9435OMOpeResN = new String[] {""} ;
      T013S23_n9435OMOpeResN = new boolean[] {false} ;
      T013S24_A396EmprCod = new String[] {""} ;
      T013S25_A396EmprCod = new String[] {""} ;
      T013S26_A396EmprCod = new String[] {""} ;
      T013S26_A9425OMCod = new int[1] ;
      T013S9_A9425OMCod = new int[1] ;
      T013S9_A9433OMTxt = new String[] {""} ;
      T013S9_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013S9_A9437OMUsuCre = new String[] {""} ;
      T013S9_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013S9_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013S9_A9445OMEst = new String[] {""} ;
      T013S9_A9464OMNot = new String[] {""} ;
      T013S9_A396EmprCod = new String[] {""} ;
      T013S9_A9426OMMaqCod = new String[] {""} ;
      T013S9_A9434OMOpeRes = new int[1] ;
      T013S9_n9434OMOpeRes = new boolean[] {false} ;
      T013S9_A9429PMCod = new int[1] ;
      T013S9_n9429PMCod = new boolean[] {false} ;
      T013S9_A9428SMCod = new int[1] ;
      T013S9_n9428SMCod = new boolean[] {false} ;
      T013S27_A396EmprCod = new String[] {""} ;
      T013S27_A9425OMCod = new int[1] ;
      T013S28_A396EmprCod = new String[] {""} ;
      T013S28_A9425OMCod = new int[1] ;
      T013S8_A9425OMCod = new int[1] ;
      T013S8_A9433OMTxt = new String[] {""} ;
      T013S8_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013S8_A9437OMUsuCre = new String[] {""} ;
      T013S8_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      T013S8_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      T013S8_A9445OMEst = new String[] {""} ;
      T013S8_A9464OMNot = new String[] {""} ;
      T013S8_A396EmprCod = new String[] {""} ;
      T013S8_A9426OMMaqCod = new String[] {""} ;
      T013S8_A9434OMOpeRes = new int[1] ;
      T013S8_n9434OMOpeRes = new boolean[] {false} ;
      T013S8_A9429PMCod = new int[1] ;
      T013S8_n9429PMCod = new boolean[] {false} ;
      T013S8_A9428SMCod = new int[1] ;
      T013S8_n9428SMCod = new boolean[] {false} ;
      T013S32_A9427OMMaqDsc = new String[] {""} ;
      T013S32_n9427OMMaqDsc = new boolean[] {false} ;
      T013S33_A9435OMOpeResN = new String[] {""} ;
      T013S33_n9435OMOpeResN = new boolean[] {false} ;
      T013S34_A396EmprCod = new String[] {""} ;
      T013S34_A9425OMCod = new int[1] ;
      Z9447OMRepNom = "" ;
      Z9448OMRepPre = DecimalUtil.ZERO ;
      T013S35_A9425OMCod = new int[1] ;
      T013S35_A9449OMRTpo = new String[] {""} ;
      T013S35_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S35_A9447OMRepNom = new String[] {""} ;
      T013S35_n9447OMRepNom = new boolean[] {false} ;
      T013S35_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S35_n9448OMRepPre = new boolean[] {false} ;
      T013S35_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S35_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S35_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S35_A396EmprCod = new String[] {""} ;
      T013S35_A9446OMRepCod = new int[1] ;
      T013S7_A9447OMRepNom = new String[] {""} ;
      T013S7_n9447OMRepNom = new boolean[] {false} ;
      T013S7_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S7_n9448OMRepPre = new boolean[] {false} ;
      T013S36_A9447OMRepNom = new String[] {""} ;
      T013S36_n9447OMRepNom = new boolean[] {false} ;
      T013S36_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S36_n9448OMRepPre = new boolean[] {false} ;
      T013S37_A396EmprCod = new String[] {""} ;
      T013S37_A9425OMCod = new int[1] ;
      T013S37_A9446OMRepCod = new int[1] ;
      T013S37_A9449OMRTpo = new String[] {""} ;
      T013S6_A9425OMCod = new int[1] ;
      T013S6_A9449OMRTpo = new String[] {""} ;
      T013S6_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S6_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S6_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S6_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S6_A396EmprCod = new String[] {""} ;
      T013S6_A9446OMRepCod = new int[1] ;
      T013S5_A9425OMCod = new int[1] ;
      T013S5_A9449OMRTpo = new String[] {""} ;
      T013S5_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S5_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S5_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S5_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S5_A396EmprCod = new String[] {""} ;
      T013S5_A9446OMRepCod = new int[1] ;
      T013S41_A9447OMRepNom = new String[] {""} ;
      T013S41_n9447OMRepNom = new boolean[] {false} ;
      T013S41_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S41_n9448OMRepPre = new boolean[] {false} ;
      T013S42_A396EmprCod = new String[] {""} ;
      T013S42_A9425OMCod = new int[1] ;
      T013S42_A9446OMRepCod = new int[1] ;
      T013S42_A9449OMRTpo = new String[] {""} ;
      Z9456OMOpeNom = "" ;
      Z9457OMOpePre = DecimalUtil.ZERO ;
      T013S43_A9425OMCod = new int[1] ;
      T013S43_A9458OMMTpo = new String[] {""} ;
      T013S43_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S43_A9456OMOpeNom = new String[] {""} ;
      T013S43_n9456OMOpeNom = new boolean[] {false} ;
      T013S43_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S43_n9457OMOpePre = new boolean[] {false} ;
      T013S43_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S43_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S43_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S43_A396EmprCod = new String[] {""} ;
      T013S43_A9455OMOpeCod = new int[1] ;
      T013S4_A9456OMOpeNom = new String[] {""} ;
      T013S4_n9456OMOpeNom = new boolean[] {false} ;
      T013S4_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S4_n9457OMOpePre = new boolean[] {false} ;
      T013S44_A9456OMOpeNom = new String[] {""} ;
      T013S44_n9456OMOpeNom = new boolean[] {false} ;
      T013S44_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S44_n9457OMOpePre = new boolean[] {false} ;
      T013S45_A396EmprCod = new String[] {""} ;
      T013S45_A9425OMCod = new int[1] ;
      T013S45_A9455OMOpeCod = new int[1] ;
      T013S45_A9458OMMTpo = new String[] {""} ;
      T013S3_A9425OMCod = new int[1] ;
      T013S3_A9458OMMTpo = new String[] {""} ;
      T013S3_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S3_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S3_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S3_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S3_A396EmprCod = new String[] {""} ;
      T013S3_A9455OMOpeCod = new int[1] ;
      T013S2_A9425OMCod = new int[1] ;
      T013S2_A9458OMMTpo = new String[] {""} ;
      T013S2_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S2_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S2_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S2_A396EmprCod = new String[] {""} ;
      T013S2_A9455OMOpeCod = new int[1] ;
      T013S49_A9456OMOpeNom = new String[] {""} ;
      T013S49_n9456OMOpeNom = new boolean[] {false} ;
      T013S49_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013S49_n9457OMOpePre = new boolean[] {false} ;
      T013S50_A396EmprCod = new String[] {""} ;
      T013S50_A9425OMCod = new int[1] ;
      T013S50_A9455OMOpeCod = new int[1] ;
      T013S50_A9458OMMTpo = new String[] {""} ;
      T013S50_A9466OMMCLin = new short[1] ;
      T013S51_A396EmprCod = new String[] {""} ;
      T013S51_A9425OMCod = new int[1] ;
      T013S51_A9455OMOpeCod = new int[1] ;
      T013S51_A9458OMMTpo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      T013S52_A396EmprCod = new String[] {""} ;
      T013S53_A396EmprCod = new String[] {""} ;
      Z9454OMRCCos = DecimalUtil.ZERO ;
      ZV18nOMRCCnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordce__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordce__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordce__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordce__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordce__default(),
         new Object[] {
             new Object[] {
            T013S2_A9425OMCod, T013S2_A9458OMMTpo, T013S2_A9462OMMCPre, T013S2_A9459OMMRCnt, T013S2_A9460OMMRPre, T013S2_A9461OMMCCnt, T013S2_A396EmprCod, T013S2_A9455OMOpeCod
            }
            , new Object[] {
            T013S3_A9425OMCod, T013S3_A9458OMMTpo, T013S3_A9462OMMCPre, T013S3_A9459OMMRCnt, T013S3_A9460OMMRPre, T013S3_A9461OMMCCnt, T013S3_A396EmprCod, T013S3_A9455OMOpeCod
            }
            , new Object[] {
            T013S4_A9456OMOpeNom, T013S4_n9456OMOpeNom, T013S4_A9457OMOpePre, T013S4_n9457OMOpePre
            }
            , new Object[] {
            T013S5_A9425OMCod, T013S5_A9449OMRTpo, T013S5_A9453OMRCPre, T013S5_A9450OMRRCnt, T013S5_A9451OMRRPre, T013S5_A9452OMRCCnt, T013S5_A396EmprCod, T013S5_A9446OMRepCod
            }
            , new Object[] {
            T013S6_A9425OMCod, T013S6_A9449OMRTpo, T013S6_A9453OMRCPre, T013S6_A9450OMRRCnt, T013S6_A9451OMRRPre, T013S6_A9452OMRCCnt, T013S6_A396EmprCod, T013S6_A9446OMRepCod
            }
            , new Object[] {
            T013S7_A9447OMRepNom, T013S7_n9447OMRepNom, T013S7_A9448OMRepPre, T013S7_n9448OMRepPre
            }
            , new Object[] {
            T013S8_A9425OMCod, T013S8_A9433OMTxt, T013S8_A9436OMFchCre, T013S8_A9437OMUsuCre, T013S8_A9438OMFchPre, T013S8_A9439OMFchCer, T013S8_A9445OMEst, T013S8_A9464OMNot, T013S8_A396EmprCod, T013S8_A9426OMMaqCod,
            T013S8_A9434OMOpeRes, T013S8_n9434OMOpeRes, T013S8_A9429PMCod, T013S8_n9429PMCod, T013S8_A9428SMCod, T013S8_n9428SMCod
            }
            , new Object[] {
            T013S9_A9425OMCod, T013S9_A9433OMTxt, T013S9_A9436OMFchCre, T013S9_A9437OMUsuCre, T013S9_A9438OMFchPre, T013S9_A9439OMFchCer, T013S9_A9445OMEst, T013S9_A9464OMNot, T013S9_A396EmprCod, T013S9_A9426OMMaqCod,
            T013S9_A9434OMOpeRes, T013S9_n9434OMOpeRes, T013S9_A9429PMCod, T013S9_n9429PMCod, T013S9_A9428SMCod, T013S9_n9428SMCod
            }
            , new Object[] {
            T013S10_A407EmprNom, T013S10_n407EmprNom
            }
            , new Object[] {
            T013S11_A9427OMMaqDsc, T013S11_n9427OMMaqDsc
            }
            , new Object[] {
            T013S12_A9435OMOpeResN, T013S12_n9435OMOpeResN
            }
            , new Object[] {
            T013S13_A396EmprCod
            }
            , new Object[] {
            T013S14_A396EmprCod
            }
            , new Object[] {
            T013S16_A9441OMMCCosT, T013S16_A9442OMMRCosT
            }
            , new Object[] {
            T013S18_A9443OMRCCosT, T013S18_A9444OMRRCosT
            }
            , new Object[] {
            T013S21_A9425OMCod, T013S21_A407EmprNom, T013S21_n407EmprNom, T013S21_A9427OMMaqDsc, T013S21_n9427OMMaqDsc, T013S21_A9433OMTxt, T013S21_A9435OMOpeResN, T013S21_n9435OMOpeResN, T013S21_A9436OMFchCre, T013S21_A9437OMUsuCre,
            T013S21_A9438OMFchPre, T013S21_A9439OMFchCer, T013S21_A9445OMEst, T013S21_A9464OMNot, T013S21_A396EmprCod, T013S21_A9426OMMaqCod, T013S21_A9434OMOpeRes, T013S21_n9434OMOpeRes, T013S21_A9429PMCod, T013S21_n9429PMCod,
            T013S21_A9428SMCod, T013S21_n9428SMCod, T013S21_A9441OMMCCosT, T013S21_A9442OMMRCosT, T013S21_A9443OMRCCosT, T013S21_A9444OMRRCosT
            }
            , new Object[] {
            T013S22_A9427OMMaqDsc, T013S22_n9427OMMaqDsc
            }
            , new Object[] {
            T013S23_A9435OMOpeResN, T013S23_n9435OMOpeResN
            }
            , new Object[] {
            T013S24_A396EmprCod
            }
            , new Object[] {
            T013S25_A396EmprCod
            }
            , new Object[] {
            T013S26_A396EmprCod, T013S26_A9425OMCod
            }
            , new Object[] {
            T013S27_A396EmprCod, T013S27_A9425OMCod
            }
            , new Object[] {
            T013S28_A396EmprCod, T013S28_A9425OMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013S32_A9427OMMaqDsc, T013S32_n9427OMMaqDsc
            }
            , new Object[] {
            T013S33_A9435OMOpeResN, T013S33_n9435OMOpeResN
            }
            , new Object[] {
            T013S34_A396EmprCod, T013S34_A9425OMCod
            }
            , new Object[] {
            T013S35_A9425OMCod, T013S35_A9449OMRTpo, T013S35_A9453OMRCPre, T013S35_A9447OMRepNom, T013S35_n9447OMRepNom, T013S35_A9448OMRepPre, T013S35_n9448OMRepPre, T013S35_A9450OMRRCnt, T013S35_A9451OMRRPre, T013S35_A9452OMRCCnt,
            T013S35_A396EmprCod, T013S35_A9446OMRepCod
            }
            , new Object[] {
            T013S36_A9447OMRepNom, T013S36_n9447OMRepNom, T013S36_A9448OMRepPre, T013S36_n9448OMRepPre
            }
            , new Object[] {
            T013S37_A396EmprCod, T013S37_A9425OMCod, T013S37_A9446OMRepCod, T013S37_A9449OMRTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013S41_A9447OMRepNom, T013S41_n9447OMRepNom, T013S41_A9448OMRepPre, T013S41_n9448OMRepPre
            }
            , new Object[] {
            T013S42_A396EmprCod, T013S42_A9425OMCod, T013S42_A9446OMRepCod, T013S42_A9449OMRTpo
            }
            , new Object[] {
            T013S43_A9425OMCod, T013S43_A9458OMMTpo, T013S43_A9462OMMCPre, T013S43_A9456OMOpeNom, T013S43_n9456OMOpeNom, T013S43_A9457OMOpePre, T013S43_n9457OMOpePre, T013S43_A9459OMMRCnt, T013S43_A9460OMMRPre, T013S43_A9461OMMCCnt,
            T013S43_A396EmprCod, T013S43_A9455OMOpeCod
            }
            , new Object[] {
            T013S44_A9456OMOpeNom, T013S44_n9456OMOpeNom, T013S44_A9457OMOpePre, T013S44_n9457OMOpePre
            }
            , new Object[] {
            T013S45_A396EmprCod, T013S45_A9425OMCod, T013S45_A9455OMOpeCod, T013S45_A9458OMMTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013S49_A9456OMOpeNom, T013S49_n9456OMOpeNom, T013S49_A9457OMOpePre, T013S49_n9457OMOpePre
            }
            , new Object[] {
            T013S50_A396EmprCod, T013S50_A9425OMCod, T013S50_A9455OMOpeCod, T013S50_A9458OMMTpo, T013S50_A9466OMMCLin
            }
            , new Object[] {
            T013S51_A396EmprCod, T013S51_A9425OMCod, T013S51_A9455OMOpeCod, T013S51_A9458OMMTpo
            }
            , new Object[] {
            T013S52_A396EmprCod
            }
            , new Object[] {
            T013S53_A396EmprCod
            }
         }
      );
      Z9425OMCod = 0 ;
      A9425OMCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "MantenimientoMaquina.TMOrdCe" ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      Z9458OMMTpo = "C" ;
      A9458OMMTpo = "C" ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      Z9449OMRTpo = "C" ;
      A9449OMRTpo = "C" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte GXv_int8[] ;
   private short nRcdDeleted_1233 ;
   private short nRcdExists_1233 ;
   private short nIsMod_1233 ;
   private short nRcdDeleted_1234 ;
   private short nRcdExists_1234 ;
   private short nIsMod_1234 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1233 ;
   private short RcdFound1233 ;
   private short nBlankRcdUsr1233 ;
   private short nBlankRcdCount1234 ;
   private short RcdFound1234 ;
   private short nBlankRcdUsr1234 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1233 ;
   private short nIsDirty_1234 ;
   private int wcpOA9425OMCod ;
   private int Z9425OMCod ;
   private int Z9434OMOpeRes ;
   private int Z9429PMCod ;
   private int Z9428SMCod ;
   private int nRC_GXsfl_120 ;
   private int nGXsfl_120_idx=1 ;
   private int nRC_GXsfl_134 ;
   private int nGXsfl_134_idx=1 ;
   private int Z9446OMRepCod ;
   private int Z9455OMOpeCod ;
   private int A9434OMOpeRes ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int A9446OMRepCod ;
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
   private int edtSMCod_Enabled ;
   private int edtPMCod_Enabled ;
   private int edtOMTxt_Enabled ;
   private int edtOMOpeRes_Enabled ;
   private int edtOMOpeResN_Enabled ;
   private int edtOMFchCre_Enabled ;
   private int edtOMUsuCre_Enabled ;
   private int edtOMFchPre_Enabled ;
   private int edtOMFchCer_Enabled ;
   private int edtOMCosRea_Enabled ;
   private int edtOMMCCosT_Enabled ;
   private int edtOMMRCosT_Enabled ;
   private int edtOMRCCosT_Enabled ;
   private int edtOMRRCosT_Enabled ;
   private int edtavnRcdDeleted_1233_Enabled ;
   private int edtOMRepCod_Enabled ;
   private int edtOMRepNom_Enabled ;
   private int edtOMRepPre_Enabled ;
   private int edtOMRRCnt_Enabled ;
   private int edtOMRRPre_Enabled ;
   private int edtOMRCCnt_Enabled ;
   private int edtOMRCPre_Enabled ;
   private int edtOMRCCos_Enabled ;
   private int fRowAdded ;
   private int edtavnRcdDeleted_1234_Enabled ;
   private int edtOMOpeCod_Enabled ;
   private int edtOMOpeNom_Enabled ;
   private int edtOMOpePre_Enabled ;
   private int edtOMMRCnt_Enabled ;
   private int edtOMMRPre_Enabled ;
   private int edtOMMCCnt_Enabled ;
   private int edtOMMCPre_Enabled ;
   private int edtOMMCCos_Enabled ;
   private int edtOMNot_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV16MTMovCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtOMMCPre_Enabled ;
   private int defcmbOMMTpo_Enabled ;
   private int defedtOMOpeCod_Enabled ;
   private int defedtOMRCPre_Enabled ;
   private int defcmbOMRTpo_Enabled ;
   private int defedtOMRepCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtOMNot_Backcolor ;
   private int edtOMRRCosT_Backcolor ;
   private int edtOMRCCosT_Backcolor ;
   private int edtOMMRCosT_Backcolor ;
   private int edtOMMCCosT_Backcolor ;
   private int edtOMCosRea_Backcolor ;
   private int edtOMFchCer_Backcolor ;
   private int edtOMFchPre_Backcolor ;
   private int edtOMUsuCre_Backcolor ;
   private int edtOMFchCre_Backcolor ;
   private int edtOMOpeResN_Backcolor ;
   private int edtOMOpeRes_Backcolor ;
   private int edtOMTxt_Backcolor ;
   private int edtPMCod_Backcolor ;
   private int edtSMCod_Backcolor ;
   private int edtOMMaqDsc_Backcolor ;
   private int edtOMMaqCod_Backcolor ;
   private int edtOMCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private java.math.BigDecimal O9441OMMCCosT ;
   private java.math.BigDecimal O9443OMRCCosT ;
   private java.math.BigDecimal Z9453OMRCPre ;
   private java.math.BigDecimal Z9450OMRRCnt ;
   private java.math.BigDecimal Z9451OMRRPre ;
   private java.math.BigDecimal Z9452OMRCCnt ;
   private java.math.BigDecimal O9452OMRCCnt ;
   private java.math.BigDecimal O9454OMRCCos ;
   private java.math.BigDecimal Z9462OMMCPre ;
   private java.math.BigDecimal Z9459OMMRCnt ;
   private java.math.BigDecimal Z9460OMMRPre ;
   private java.math.BigDecimal Z9461OMMCCnt ;
   private java.math.BigDecimal O9463OMMCCos ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal B9441OMMCCosT ;
   private java.math.BigDecimal B9443OMRCCosT ;
   private java.math.BigDecimal AV15oOMRCCnt ;
   private java.math.BigDecimal AV18nOMRCCnt ;
   private java.math.BigDecimal s9441OMMCCosT ;
   private java.math.BigDecimal s9440OMCosRea ;
   private java.math.BigDecimal O9440OMCosRea ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal T9463OMMCCos ;
   private java.math.BigDecimal s9443OMRCCosT ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal T9452OMRCCnt ;
   private java.math.BigDecimal T9454OMRCCos ;
   private java.math.BigDecimal Z9441OMMCCosT ;
   private java.math.BigDecimal Z9442OMMRCosT ;
   private java.math.BigDecimal Z9443OMRCCosT ;
   private java.math.BigDecimal Z9444OMRRCosT ;
   private java.math.BigDecimal Z9448OMRepPre ;
   private java.math.BigDecimal Z9457OMOpePre ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal Z9454OMRCCos ;
   private java.math.BigDecimal ZV18nOMRCCnt ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z9437OMUsuCre ;
   private String Z9445OMEst ;
   private String Z9426OMMaqCod ;
   private String Z9449OMRTpo ;
   private String Z9458OMMTpo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9426OMMaqCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOMMaqCod_Internalname ;
   private String sGXsfl_120_idx="0001" ;
   private String sGXsfl_134_idx="0001" ;
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
   private String edtOMMaqCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtOMMaqDsc_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtSMCod_Internalname ;
   private String edtSMCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPMCod_Internalname ;
   private String edtPMCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtOMTxt_Internalname ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtOMOpeRes_Internalname ;
   private String edtOMOpeRes_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtOMOpeResN_Internalname ;
   private String A9435OMOpeResN ;
   private String edtOMOpeResN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtOMFchCre_Internalname ;
   private String edtOMFchCre_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtOMUsuCre_Internalname ;
   private String A9437OMUsuCre ;
   private String edtOMUsuCre_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtOMFchPre_Internalname ;
   private String edtOMFchPre_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtOMFchCer_Internalname ;
   private String edtOMFchCer_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtOMCosRea_Internalname ;
   private String edtOMCosRea_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtOMMCCosT_Internalname ;
   private String edtOMMCCosT_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtOMMRCosT_Internalname ;
   private String edtOMMRCosT_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtOMRCCosT_Internalname ;
   private String edtOMRCCosT_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRRCosT_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String sMode1233 ;
   private String edtavnRcdDeleted_1233_Internalname ;
   private String edtOMRepCod_Internalname ;
   private String edtOMRepNom_Internalname ;
   private String edtOMRepPre_Internalname ;
   private String edtOMRRCnt_Internalname ;
   private String edtOMRRPre_Internalname ;
   private String edtOMRCCnt_Internalname ;
   private String edtOMRCPre_Internalname ;
   private String edtOMRCCos_Internalname ;
   private String subGrid1_Internalname ;
   private String sMode1234 ;
   private String edtavnRcdDeleted_1234_Internalname ;
   private String edtOMOpeCod_Internalname ;
   private String edtOMOpeNom_Internalname ;
   private String edtOMOpePre_Internalname ;
   private String edtOMMRCnt_Internalname ;
   private String edtOMMRPre_Internalname ;
   private String edtOMMCCnt_Internalname ;
   private String edtOMMCPre_Internalname ;
   private String edtOMMCCos_Internalname ;
   private String subGrid2_Internalname ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtOMNot_Internalname ;
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
   private String AV17MTMovNom ;
   private String hsh ;
   private String sMode1232 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
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
   private String Z9435OMOpeResN ;
   private String Z9447OMRepNom ;
   private String Z9456OMOpeNom ;
   private String sGXsfl_120_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1233_Jsonclick ;
   private String edtOMRepCod_Jsonclick ;
   private String edtOMRepNom_Jsonclick ;
   private String edtOMRepPre_Jsonclick ;
   private String edtOMRRCnt_Jsonclick ;
   private String edtOMRRPre_Jsonclick ;
   private String edtOMRCCnt_Jsonclick ;
   private String edtOMRCPre_Jsonclick ;
   private String edtOMRCCos_Jsonclick ;
   private String sGXsfl_134_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1234_Jsonclick ;
   private String edtOMOpeCod_Jsonclick ;
   private String edtOMOpeNom_Jsonclick ;
   private String edtOMOpePre_Jsonclick ;
   private String edtOMMRCnt_Jsonclick ;
   private String edtOMMRPre_Jsonclick ;
   private String edtOMMCCnt_Jsonclick ;
   private String edtOMMCPre_Jsonclick ;
   private String edtOMMCCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String subGrid2_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z9436OMFchCre ;
   private java.util.Date Z9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date AV19ServerNow ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date Z9438OMFchPre ;
   private java.util.Date A9438OMFchPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9434OMOpeRes ;
   private boolean n9429PMCod ;
   private boolean n9428SMCod ;
   private boolean wbErr ;
   private boolean bGXsfl_120_Refreshing=false ;
   private boolean bGXsfl_134_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9427OMMaqDsc ;
   private boolean n9435OMOpeResN ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n9447OMRepNom ;
   private boolean n9448OMRepPre ;
   private boolean n9456OMOpeNom ;
   private boolean n9457OMOpePre ;
   private String Z9433OMTxt ;
   private String Z9464OMNot ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMRTpo ;
   private HTMLChoice cmbOMMTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T013S10_A407EmprNom ;
   private boolean[] T013S10_n407EmprNom ;
   private java.math.BigDecimal[] T013S16_A9441OMMCCosT ;
   private java.math.BigDecimal[] T013S16_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013S18_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013S18_A9444OMRRCosT ;
   private int[] T013S21_A9425OMCod ;
   private String[] T013S21_A407EmprNom ;
   private boolean[] T013S21_n407EmprNom ;
   private String[] T013S21_A9427OMMaqDsc ;
   private boolean[] T013S21_n9427OMMaqDsc ;
   private String[] T013S21_A9433OMTxt ;
   private String[] T013S21_A9435OMOpeResN ;
   private boolean[] T013S21_n9435OMOpeResN ;
   private java.util.Date[] T013S21_A9436OMFchCre ;
   private String[] T013S21_A9437OMUsuCre ;
   private java.util.Date[] T013S21_A9438OMFchPre ;
   private java.util.Date[] T013S21_A9439OMFchCer ;
   private String[] T013S21_A9445OMEst ;
   private String[] T013S21_A9464OMNot ;
   private String[] T013S21_A396EmprCod ;
   private String[] T013S21_A9426OMMaqCod ;
   private int[] T013S21_A9434OMOpeRes ;
   private boolean[] T013S21_n9434OMOpeRes ;
   private int[] T013S21_A9429PMCod ;
   private boolean[] T013S21_n9429PMCod ;
   private int[] T013S21_A9428SMCod ;
   private boolean[] T013S21_n9428SMCod ;
   private java.math.BigDecimal[] T013S21_A9441OMMCCosT ;
   private java.math.BigDecimal[] T013S21_A9442OMMRCosT ;
   private java.math.BigDecimal[] T013S21_A9443OMRCCosT ;
   private java.math.BigDecimal[] T013S21_A9444OMRRCosT ;
   private String[] T013S11_A9427OMMaqDsc ;
   private boolean[] T013S11_n9427OMMaqDsc ;
   private String[] T013S12_A9435OMOpeResN ;
   private boolean[] T013S12_n9435OMOpeResN ;
   private String[] T013S13_A396EmprCod ;
   private String[] T013S14_A396EmprCod ;
   private String[] T013S22_A9427OMMaqDsc ;
   private boolean[] T013S22_n9427OMMaqDsc ;
   private String[] T013S23_A9435OMOpeResN ;
   private boolean[] T013S23_n9435OMOpeResN ;
   private String[] T013S24_A396EmprCod ;
   private String[] T013S25_A396EmprCod ;
   private String[] T013S26_A396EmprCod ;
   private int[] T013S26_A9425OMCod ;
   private int[] T013S9_A9425OMCod ;
   private String[] T013S9_A9433OMTxt ;
   private java.util.Date[] T013S9_A9436OMFchCre ;
   private String[] T013S9_A9437OMUsuCre ;
   private java.util.Date[] T013S9_A9438OMFchPre ;
   private java.util.Date[] T013S9_A9439OMFchCer ;
   private String[] T013S9_A9445OMEst ;
   private String[] T013S9_A9464OMNot ;
   private String[] T013S9_A396EmprCod ;
   private String[] T013S9_A9426OMMaqCod ;
   private int[] T013S9_A9434OMOpeRes ;
   private boolean[] T013S9_n9434OMOpeRes ;
   private int[] T013S9_A9429PMCod ;
   private boolean[] T013S9_n9429PMCod ;
   private int[] T013S9_A9428SMCod ;
   private boolean[] T013S9_n9428SMCod ;
   private String[] T013S27_A396EmprCod ;
   private int[] T013S27_A9425OMCod ;
   private String[] T013S28_A396EmprCod ;
   private int[] T013S28_A9425OMCod ;
   private int[] T013S8_A9425OMCod ;
   private String[] T013S8_A9433OMTxt ;
   private java.util.Date[] T013S8_A9436OMFchCre ;
   private String[] T013S8_A9437OMUsuCre ;
   private java.util.Date[] T013S8_A9438OMFchPre ;
   private java.util.Date[] T013S8_A9439OMFchCer ;
   private String[] T013S8_A9445OMEst ;
   private String[] T013S8_A9464OMNot ;
   private String[] T013S8_A396EmprCod ;
   private String[] T013S8_A9426OMMaqCod ;
   private int[] T013S8_A9434OMOpeRes ;
   private boolean[] T013S8_n9434OMOpeRes ;
   private int[] T013S8_A9429PMCod ;
   private boolean[] T013S8_n9429PMCod ;
   private int[] T013S8_A9428SMCod ;
   private boolean[] T013S8_n9428SMCod ;
   private String[] T013S32_A9427OMMaqDsc ;
   private boolean[] T013S32_n9427OMMaqDsc ;
   private String[] T013S33_A9435OMOpeResN ;
   private boolean[] T013S33_n9435OMOpeResN ;
   private String[] T013S34_A396EmprCod ;
   private int[] T013S34_A9425OMCod ;
   private int[] T013S35_A9425OMCod ;
   private String[] T013S35_A9449OMRTpo ;
   private java.math.BigDecimal[] T013S35_A9453OMRCPre ;
   private String[] T013S35_A9447OMRepNom ;
   private boolean[] T013S35_n9447OMRepNom ;
   private java.math.BigDecimal[] T013S35_A9448OMRepPre ;
   private boolean[] T013S35_n9448OMRepPre ;
   private java.math.BigDecimal[] T013S35_A9450OMRRCnt ;
   private java.math.BigDecimal[] T013S35_A9451OMRRPre ;
   private java.math.BigDecimal[] T013S35_A9452OMRCCnt ;
   private String[] T013S35_A396EmprCod ;
   private int[] T013S35_A9446OMRepCod ;
   private String[] T013S7_A9447OMRepNom ;
   private boolean[] T013S7_n9447OMRepNom ;
   private java.math.BigDecimal[] T013S7_A9448OMRepPre ;
   private boolean[] T013S7_n9448OMRepPre ;
   private String[] T013S36_A9447OMRepNom ;
   private boolean[] T013S36_n9447OMRepNom ;
   private java.math.BigDecimal[] T013S36_A9448OMRepPre ;
   private boolean[] T013S36_n9448OMRepPre ;
   private String[] T013S37_A396EmprCod ;
   private int[] T013S37_A9425OMCod ;
   private int[] T013S37_A9446OMRepCod ;
   private String[] T013S37_A9449OMRTpo ;
   private int[] T013S6_A9425OMCod ;
   private String[] T013S6_A9449OMRTpo ;
   private java.math.BigDecimal[] T013S6_A9453OMRCPre ;
   private java.math.BigDecimal[] T013S6_A9450OMRRCnt ;
   private java.math.BigDecimal[] T013S6_A9451OMRRPre ;
   private java.math.BigDecimal[] T013S6_A9452OMRCCnt ;
   private String[] T013S6_A396EmprCod ;
   private int[] T013S6_A9446OMRepCod ;
   private int[] T013S5_A9425OMCod ;
   private String[] T013S5_A9449OMRTpo ;
   private java.math.BigDecimal[] T013S5_A9453OMRCPre ;
   private java.math.BigDecimal[] T013S5_A9450OMRRCnt ;
   private java.math.BigDecimal[] T013S5_A9451OMRRPre ;
   private java.math.BigDecimal[] T013S5_A9452OMRCCnt ;
   private String[] T013S5_A396EmprCod ;
   private int[] T013S5_A9446OMRepCod ;
   private String[] T013S41_A9447OMRepNom ;
   private boolean[] T013S41_n9447OMRepNom ;
   private java.math.BigDecimal[] T013S41_A9448OMRepPre ;
   private boolean[] T013S41_n9448OMRepPre ;
   private String[] T013S42_A396EmprCod ;
   private int[] T013S42_A9425OMCod ;
   private int[] T013S42_A9446OMRepCod ;
   private String[] T013S42_A9449OMRTpo ;
   private int[] T013S43_A9425OMCod ;
   private String[] T013S43_A9458OMMTpo ;
   private java.math.BigDecimal[] T013S43_A9462OMMCPre ;
   private String[] T013S43_A9456OMOpeNom ;
   private boolean[] T013S43_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013S43_A9457OMOpePre ;
   private boolean[] T013S43_n9457OMOpePre ;
   private java.math.BigDecimal[] T013S43_A9459OMMRCnt ;
   private java.math.BigDecimal[] T013S43_A9460OMMRPre ;
   private java.math.BigDecimal[] T013S43_A9461OMMCCnt ;
   private String[] T013S43_A396EmprCod ;
   private int[] T013S43_A9455OMOpeCod ;
   private String[] T013S4_A9456OMOpeNom ;
   private boolean[] T013S4_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013S4_A9457OMOpePre ;
   private boolean[] T013S4_n9457OMOpePre ;
   private String[] T013S44_A9456OMOpeNom ;
   private boolean[] T013S44_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013S44_A9457OMOpePre ;
   private boolean[] T013S44_n9457OMOpePre ;
   private String[] T013S45_A396EmprCod ;
   private int[] T013S45_A9425OMCod ;
   private int[] T013S45_A9455OMOpeCod ;
   private String[] T013S45_A9458OMMTpo ;
   private int[] T013S3_A9425OMCod ;
   private String[] T013S3_A9458OMMTpo ;
   private java.math.BigDecimal[] T013S3_A9462OMMCPre ;
   private java.math.BigDecimal[] T013S3_A9459OMMRCnt ;
   private java.math.BigDecimal[] T013S3_A9460OMMRPre ;
   private java.math.BigDecimal[] T013S3_A9461OMMCCnt ;
   private String[] T013S3_A396EmprCod ;
   private int[] T013S3_A9455OMOpeCod ;
   private int[] T013S2_A9425OMCod ;
   private String[] T013S2_A9458OMMTpo ;
   private java.math.BigDecimal[] T013S2_A9462OMMCPre ;
   private java.math.BigDecimal[] T013S2_A9459OMMRCnt ;
   private java.math.BigDecimal[] T013S2_A9460OMMRPre ;
   private java.math.BigDecimal[] T013S2_A9461OMMCCnt ;
   private String[] T013S2_A396EmprCod ;
   private int[] T013S2_A9455OMOpeCod ;
   private String[] T013S49_A9456OMOpeNom ;
   private boolean[] T013S49_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013S49_A9457OMOpePre ;
   private boolean[] T013S49_n9457OMOpePre ;
   private String[] T013S50_A396EmprCod ;
   private int[] T013S50_A9425OMCod ;
   private int[] T013S50_A9455OMOpeCod ;
   private String[] T013S50_A9458OMMTpo ;
   private short[] T013S50_A9466OMMCLin ;
   private String[] T013S51_A396EmprCod ;
   private int[] T013S51_A9425OMCod ;
   private int[] T013S51_A9455OMOpeCod ;
   private String[] T013S51_A9458OMMTpo ;
   private String[] T013S52_A396EmprCod ;
   private String[] T013S53_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmordce__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordce__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordce__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordce__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordce__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013S2", "SELECT OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?  FOR UPDATE OF OMMCPre, OMMRCnt, OMMRPre, OMMCCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S3", "SELECT OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S4", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S5", "SELECT OMCod, OMRTpo, OMRCPre, OMRRCnt, OMRRPre, OMRCCnt, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?  FOR UPDATE OF OMRCPre, OMRRCnt, OMRRPre, OMRCCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S6", "SELECT OMCod, OMRTpo, OMRCPre, OMRRCnt, OMRRPre, OMRCCnt, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S7", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S8", "SELECT OMCod, OMTxt, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMEst, OMNot, EmprCod, OMMaqCod, OMOpeRes, PMCod, SMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMTxt, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMEst, OMNot, OMMaqCod, OMOpeRes, PMCod, SMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S9", "SELECT OMCod, OMTxt, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMEst, OMNot, EmprCod, OMMaqCod, OMOpeRes, PMCod, SMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S11", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S12", "SELECT OpeNom AS OMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S13", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S14", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S16", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT, COALESCE( T1.OMMRCosT, 0) AS OMMRCosT FROM (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S18", "SELECT COALESCE( T1.OMRCCosT, 0) AS OMRCCosT, COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT, EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S21", "SELECT /*+ FIRST_ROWS(1) */ TM1.OMCod, T2.EmprNom, T5.MaqDsc AS OMMaqDsc, TM1.OMTxt, T6.OpeNom AS OMOpeResN, TM1.OMFchCre, TM1.OMUsuCre, TM1.OMFchPre, TM1.OMFchCer, TM1.OMEst, TM1.OMNot, TM1.EmprCod, TM1.OMMaqCod AS OMMaqCod, TM1.OMOpeRes AS OMOpeRes, TM1.PMCod, TM1.SMCod, COALESCE( T3.OMMCCosT, 0) AS OMMCCosT, COALESCE( T3.OMMRCosT, 0) AS OMMRCosT, COALESCE( T4.OMRCCosT, 0) AS OMRCCosT, COALESCE( T4.OMRRCosT, 0) AS OMRRCosT FROM (((((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.OMCod = TM1.OMCod) LEFT JOIN (SELECT SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT, EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) INNER JOIN TXPMAQUIN T5 ON T5.EmprCod = TM1.EmprCod AND T5.MaqCod = TM1.OMMaqCod) LEFT JOIN TXPOPERAR T6 ON T6.EmprCod = TM1.EmprCod AND T6.OpeCod = TM1.OMOpeRes) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S22", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S23", "SELECT OpeNom AS OMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S24", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S25", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S26", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S27", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S28", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013S29", "INSERT INTO TXPMORDEN(OMCod, OMTxt, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMEst, OMNot, EmprCod, OMMaqCod, OMOpeRes, PMCod, SMCod, OMPri, OMTipoId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T013S30", "UPDATE TXPMORDEN SET OMTxt=?, OMFchCre=?, OMUsuCre=?, OMFchPre=?, OMFchCer=?, OMEst=?, OMNot=?, OMMaqCod=?, OMOpeRes=?, PMCod=?, SMCod=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T013S31", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T013S32", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S33", "SELECT OpeNom AS OMOpeResN FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S35", "SELECT T1.OMCod, T1.OMRTpo, T1.OMRCPre, T2.MRNom AS OMRepNom, T2.MRStkPre AS OMRepPre, T1.OMRRCnt, T1.OMRRPre, T1.OMRCCnt, T1.EmprCod, T1.OMRepCod AS OMRepCod FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMRepCod = ? and T1.OMRTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod, T1.OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S36", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S37", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013S38", "INSERT INTO TXPMOrRep(OMCod, OMRTpo, OMRCPre, OMRRCnt, OMRRPre, OMRCCnt, EmprCod, OMRepCod, OMRObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T013S39", "UPDATE TXPMOrRep SET OMRCPre=?, OMRRCnt=?, OMRRPre=?, OMRCCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T013S40", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new ForEachCursor("T013S41", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S42", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRTpo = 'C' ORDER BY EmprCod, OMCod, OMRepCod, OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S43", "SELECT T1.OMCod, T1.OMMTpo, T1.OMMCPre, T2.OpeNom AS OMOpeNom, T2.OpePreHor AS OMOpePre, T1.OMMRCnt, T1.OMMRPre, T1.OMMCCnt, T1.EmprCod, T1.OMOpeCod AS OMOpeCod FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? and T1.OMMTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod, T1.OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S44", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S45", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013S46", "INSERT INTO TXPMOrMO(OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod, OMMCUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T013S47", "UPDATE TXPMOrMO SET OMMCPre=?, OMMRCnt=?, OMMRPre=?, OMMCCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T013S48", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new ForEachCursor("T013S49", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S50", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013S51", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMMTpo = 'C' ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S52", "SELECT EmprCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013S53", "SELECT EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,3);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 37 :
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
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 47 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 2000, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setVarchar(8, (String)parms[7], 2000, false);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[15]).intValue());
               }
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 2000, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setVarchar(7, (String)parms[6], 2000, false);
               stmt.setString(8, (String)parms[7], 6);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[13]).intValue());
               }
               stmt.setString(12, (String)parms[14], 3);
               stmt.setInt(13, ((Number) parms[15]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
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
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
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
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 32 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 33 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 40 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 41 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 46 :
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
            case 47 :
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

