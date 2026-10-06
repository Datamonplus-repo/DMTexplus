package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbarfae_impl extends GXDataArea
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
         xc_14_FN14( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
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
         n758ProCod = false ;
         A761ProFasLin = (short)(GXutil.lval( httpContext.GetPar( "ProFasLin"))) ;
         n761ProFasLin = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_FN14( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A761ProFasLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
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
         n758ProCod = false ;
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_FN15( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action40") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_40_FN15( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_48( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
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
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_49( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_52( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_53") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_53( A396EmprCod, A603MaqCodBis) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCESOS / FASES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarSit_Internalname ;
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
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
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
      nRC_GXsfl_127 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_127"))) ;
      nGXsfl_127_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_127_idx"))) ;
      sGXsfl_127_idx = httpContext.GetPar( "sGXsfl_127_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      n758ProCod = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tbarfae_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbarfae_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbarfae_impl.class ));
   }

   public tbarfae_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARFAE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Dibujo Cliente en Hoja Ruta", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDibCli_Internalname, GXutil.rtrim( A1798BarDibCli), GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Dibujo Interno en Hoja Ruta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtBarDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Número de Colores", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A1051DisNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1051DisNumCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1051DisNumCol), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumCol_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Código Empesa", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpesCod_Internalname, GXutil.rtrim( A1031EmpesCod), GXutil.rtrim( localUtil.format( A1031EmpesCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpesCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmpesCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Codigo Tipo Articulo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "MaxOrdFas", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaxOrdFas_Internalname, GXutil.ltrim( localUtil.ntoc( A628MaxOrdFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaxOrdFas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A628MaxOrdFas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A628MaxOrdFas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaxOrdFas_Jsonclick, 0, "", "", "", "", "", 1, edtMaxOrdFas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARFAE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      /* Save parent mode. */
      sMode14 = Gx_mode ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount14 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_14 = (short)(1) ;
            scanStartFN14( ) ;
            while ( RcdFound14 != 0 )
            {
               init_level_properties14( ) ;
               getByPrimaryKeyFN14( ) ;
               addRowFN14( ) ;
               scanNextFN14( ) ;
            }
            scanEndFN14( ) ;
            nBlankRcdCount14 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalFN14( ) ;
         standaloneModalFN14( ) ;
         sMode14 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRowFN14( ) ;
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtProFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtProFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASEST_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasEst_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_14 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalFN14( ) ;
            }
            sendRowFN14( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount14 = (short)(5) ;
         nRcdExists_14 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartFN14( ) ;
            while ( RcdFound14 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_10014( ) ;
               init_level_properties14( ) ;
               standaloneNotModalFN14( ) ;
               getByPrimaryKeyFN14( ) ;
               standaloneModalFN14( ) ;
               addRowFN14( ) ;
               scanNextFN14( ) ;
            }
            scanEndFN14( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode14 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_10014( ) ;
      initAllFN14( ) ;
      init_level_properties14( ) ;
      nRcdExists_14 = (short)(0) ;
      nIsMod_14 = (short)(0) ;
      nRcdDeleted_14 = (short)(0) ;
      nBlankRcdCount14 = (short)(nBlankRcdUsr14+nBlankRcdCount14) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount14 > 0 )
      {
         standaloneNotModalFN14( ) ;
         standaloneModalFN14( ) ;
         addRowFN14( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount14 = (short)(nBlankRcdCount14-1) ;
      }
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode14 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARFAE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARFAE.htm");
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
      e11FN2 ();
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
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z1798BarDibCli = httpContext.cgiGet( "Z1798BarDibCli") ;
            Z1799BarDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1799BarDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z217BarTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
            A1799BarDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtBarDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
            A1051DisNumCol = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1051DisNumCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
            A1031EmpesCod = httpContext.cgiGet( edtEmpesCod_Internalname) ;
            n1031EmpesCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
            A628MaxOrdFas = (short)(localUtil.ctol( httpContext.cgiGet( edtMaxOrdFas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n628MaxOrdFas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A213BarSit = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            else
            {
               A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBARFAE");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
            forbiddenHiddens.add("BarDibCli", GXutil.rtrim( localUtil.format( A1798BarDibCli, "")));
            A1799BarDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtBarDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
            forbiddenHiddens.add("BarDibInt", localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9"));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( A212BarSer, "")));
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
            forbiddenHiddens.add("BarTipArt", localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbarfae:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                        e11FN2 ();
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
            initAllFN12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_15_Enabled), 5, 0), !bGXsfl_127_Refreshing);
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
      disableAttributesFN12( ) ;
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

   public void confirm_FN0( )
   {
      beforeValidateFN12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsFN12( ) ;
         }
         else
         {
            checkExtendedTableFN12( ) ;
            if ( AnyError == 0 )
            {
               zmFN12( 42) ;
               zmFN12( 43) ;
               zmFN12( 44) ;
               zmFN12( 45) ;
               zmFN12( 46) ;
            }
            closeExtendedTableCursorsFN12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_FN14( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesFN0( ) ;
      }
   }

   public void confirm_FN15( )
   {
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRowFN15( ) ;
         if ( ( nRcdExists_15 != 0 ) || ( nIsMod_15 != 0 ) )
         {
            getKeyFN15( ) ;
            if ( ( nRcdExists_15 == 0 ) && ( nRcdDeleted_15 == 0 ) )
            {
               if ( RcdFound15 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateFN15( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableFN15( ) ;
                     if ( AnyError == 0 )
                     {
                        zmFN15( 51) ;
                        zmFN15( 52) ;
                        zmFN15( 53) ;
                        zmFN15( 55) ;
                        zmFN15( 56) ;
                     }
                     closeExtendedTableCursorsFN15( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound15 != 0 )
               {
                  if ( nRcdDeleted_15 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyFN15( ) ;
                     loadFN15( ) ;
                     beforeValidateFN15( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsFN15( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_15 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateFN15( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableFN15( ) ;
                           if ( AnyError == 0 )
                           {
                              zmFN15( 51) ;
                              zmFN15( 52) ;
                              zmFN15( 53) ;
                              zmFN15( 55) ;
                              zmFN15( 56) ;
                           }
                           closeExtendedTableCursorsFN15( ) ;
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
                  if ( nRcdDeleted_15 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_15_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtBarFasCon_Internalname, GXutil.rtrim( A152BarFasCon)) ;
         httpContext.changePostValue( edtBarFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtBarFacTin_Internalname, GXutil.rtrim( A150BarFacTin)) ;
         httpContext.changePostValue( edtBarFecTeo_Internalname, localUtil.format(A162BarFecTeo, "99/99/99")) ;
         httpContext.changePostValue( edtBarFecRea_Internalname, localUtil.format(A160BarFecRea, "99/99/99")) ;
         httpContext.changePostValue( edtBarTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarUni_Internalname, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarLoc_Internalname, GXutil.rtrim( A179BarLoc)) ;
         httpContext.changePostValue( edtBarHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpcVir_Internalname, GXutil.rtrim( A1788EmpcVir)) ;
         httpContext.changePostValue( edtBarCoVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPaVir_Internalname, GXutil.rtrim( A1786BarPaVir)) ;
         httpContext.changePostValue( edtProCodVir_Internalname, GXutil.rtrim( A1789ProCodVir)) ;
         httpContext.changePostValue( edtOrdLinVir_Internalname, GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasAnt_Internalname, GXutil.rtrim( A1785BarFasAnt)) ;
         httpContext.changePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z152BarFasCon_"+sGXsfl_127_idx, GXutil.rtrim( Z152BarFasCon)) ;
         httpContext.changePostValue( "ZT_"+"Z150BarFacTin_"+sGXsfl_127_idx, GXutil.rtrim( Z150BarFacTin)) ;
         httpContext.changePostValue( "ZT_"+"Z153BarFasEst_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z162BarFecTeo_"+sGXsfl_127_idx, localUtil.dtoc( Z162BarFecTeo, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z160BarFecRea_"+sGXsfl_127_idx, localUtil.dtoc( Z160BarFecRea, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z216BarTieTeo_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z227BarUni_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z179BarLoc_"+sGXsfl_127_idx, GXutil.rtrim( Z179BarLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z165BarHorIni_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z164BarHorFin_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z215BarTieRea_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_127_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z603MaqCodBis_"+sGXsfl_127_idx, GXutil.rtrim( Z603MaqCodBis)) ;
         httpContext.changePostValue( "nRcdDeleted_15_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_15_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_15_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N216BarTieTeo_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N603MaqCodBis_"+sGXsfl_127_idx, GXutil.rtrim( A603MaqCodBis)) ;
         httpContext.changePostValue( "N160BarFecRea_"+sGXsfl_127_idx, localUtil.dtoc( A160BarFecRea, 0, "/")) ;
         httpContext.changePostValue( "N227BarUni_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_15 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_15_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASCON_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEST_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCODBIS_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFACTIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECTEO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECREA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIETEO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARUNI_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLOC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORINI_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORFIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIEREA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPCVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPAVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCODVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDLINVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASANT_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00FN10 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A628MaxOrdFas = T00FN10_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00FN10_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      /* Using cursor T00FN12 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A760ProFasEst = T00FN12_A760ProFasEst[0] ;
         n760ProFasEst = T00FN12_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      if ( true /* Level */ && ( A760ProFasEst != 0 ) && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se permite borrar el Proceso", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* End of After( level) rules */
   }

   public void confirm_FN14( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRowFN14( ) ;
         if ( ( nRcdExists_14 != 0 ) || ( nIsMod_14 != 0 ) )
         {
            getKeyFN14( ) ;
            if ( ( nRcdExists_14 == 0 ) && ( nRcdDeleted_14 == 0 ) )
            {
               if ( RcdFound14 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateFN14( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableFN14( ) ;
                     if ( AnyError == 0 )
                     {
                        zmFN14( 48) ;
                        zmFN14( 49) ;
                     }
                     closeExtendedTableCursorsFN14( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode14 = Gx_mode ;
                        confirm_FN15( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode14 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode14 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound14 != 0 )
               {
                  if ( nRcdDeleted_14 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyFN14( ) ;
                     loadFN14( ) ;
                     beforeValidateFN14( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsFN14( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_14 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateFN14( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableFN14( ) ;
                           if ( AnyError == 0 )
                           {
                              zmFN14( 48) ;
                              zmFN14( 49) ;
                           }
                           closeExtendedTableCursorsFN14( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode14 = Gx_mode ;
                              confirm_FN15( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode14 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode14 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_14 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtProFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_100_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z761ProFasLin_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_14_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_14_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_14_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_14 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASEST_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionFN0( )
   {
   }

   public void e11FN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT613_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV20Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char1 = AV21Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit5", AV21Lit5);
      GXt_char1 = AV22Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1027_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit6", AV22Lit6);
      GXt_char1 = AV23Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit7", AV23Lit7);
      GXt_char1 = AV24Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN619_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit8", AV24Lit8);
      GXt_char1 = AV25Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit9", AV25Lit9);
      GXt_char1 = AV26Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN437_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit10", AV26Lit10);
      GXt_char1 = AV27Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1106_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit11", AV27Lit11);
      GXt_char1 = AV28Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1074_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit12", AV28Lit12);
      GXt_char1 = AV29Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1245_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit13", AV29Lit13);
      GXt_char1 = AV30Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN467_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit14", AV30Lit14);
      GXt_char1 = AV31Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1141_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit15", AV31Lit15);
      GXt_char1 = AV32Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1139_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit16", AV32Lit16);
      GXt_char1 = AV33Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1365_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit17", AV33Lit17);
      GXt_char1 = AV34Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN466_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit18", AV34Lit18);
      GXt_char1 = AV37Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1479_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit19", AV37Lit19);
      GXt_char1 = AV36LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tbarfae_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36LitFe", AV36LitFe);
      AV38Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbarfae_impl.this.A396EmprCod = GXv_char2[0] ;
      tbarfae_impl.this.AV39EmprNom = GXv_char3[0] ;
      tbarfae_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV39EmprNom", AV39EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
   }

   public void zmFN12( int GX_JID )
   {
      if ( ( GX_JID == 41 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T00FN17_A361DisCod[0] ;
            Z2759BarMaqGru = T00FN17_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T00FN17_A180BarMaqCod[0] ;
            Z1798BarDibCli = T00FN17_A1798BarDibCli[0] ;
            Z1799BarDibInt = T00FN17_A1799BarDibInt[0] ;
            Z212BarSer = T00FN17_A212BarSer[0] ;
            Z213BarSit = T00FN17_A213BarSit[0] ;
            Z120BarAgrEst = T00FN17_A120BarAgrEst[0] ;
            Z217BarTipArt = T00FN17_A217BarTipArt[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z1798BarDibCli = A1798BarDibCli ;
            Z1799BarDibInt = A1799BarDibInt ;
            Z212BarSer = A212BarSer ;
            Z213BarSit = A213BarSit ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z217BarTipArt = A217BarTipArt ;
         }
      }
      if ( GX_JID == -41 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z252CliCod = A252CliCod ;
         Z1798BarDibCli = A1798BarDibCli ;
         Z1799BarDibInt = A1799BarDibInt ;
         Z212BarSer = A212BarSer ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z217BarTipArt = A217BarTipArt ;
         Z407EmprNom = A407EmprNom ;
         Z1051DisNumCol = A1051DisNumCol ;
         Z1031EmpesCod = A1031EmpesCod ;
         Z279CliNom = A279CliNom ;
         Z628MaxOrdFas = A628MaxOrdFas ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Enabled), 5, 0), true);
      edtBarDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibInt_Enabled), 5, 0), true);
      edtEmpesCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Enabled), 5, 0), true);
      edtBarDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibInt_Enabled), 5, 0), true);
      edtEmpesCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      /* Using cursor T00FN18 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00FN18_A407EmprNom[0] ;
      n407EmprNom = T00FN18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      /* Using cursor T00FN10 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A628MaxOrdFas = T00FN10_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00FN10_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminacion", ""), 1, "");
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
      /* Using cursor T00FN19 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T00FN19_A252CliCod[0] ;
      n252CliCod = T00FN19_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1051DisNumCol = T00FN19_A1051DisNumCol[0] ;
      n1051DisNumCol = T00FN19_n1051DisNumCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
      A1031EmpesCod = T00FN19_A1031EmpesCod[0] ;
      n1031EmpesCod = T00FN19_n1031EmpesCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
      A365DisDes = T00FN19_A365DisDes[0] ;
      pr_default.close(13);
      /* Using cursor T00FN21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00FN21_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(15);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      /* Using cursor T00FN20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A217BarTipArt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTIPART");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(14);
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

   public void loadFN12( )
   {
      /* Using cursor T00FN23 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T00FN23_A361DisCod[0] ;
         A2759BarMaqGru = T00FN23_A2759BarMaqGru[0] ;
         A180BarMaqCod = T00FN23_A180BarMaqCod[0] ;
         A252CliCod = T00FN23_A252CliCod[0] ;
         n252CliCod = T00FN23_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T00FN23_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1798BarDibCli = T00FN23_A1798BarDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
         A1799BarDibInt = T00FN23_A1799BarDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
         A1051DisNumCol = T00FN23_A1051DisNumCol[0] ;
         n1051DisNumCol = T00FN23_n1051DisNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
         A1031EmpesCod = T00FN23_A1031EmpesCod[0] ;
         n1031EmpesCod = T00FN23_n1031EmpesCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
         A212BarSer = T00FN23_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A213BarSit = T00FN23_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T00FN23_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = T00FN23_A407EmprNom[0] ;
         n407EmprNom = T00FN23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A365DisDes = T00FN23_A365DisDes[0] ;
         A217BarTipArt = T00FN23_A217BarTipArt[0] ;
         n217BarTipArt = T00FN23_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         A628MaxOrdFas = T00FN23_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00FN23_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
         zmFN12( -41) ;
      }
      pr_default.close(16);
      onLoadActionsFN12( ) ;
   }

   public void onLoadActionsFN12( )
   {
   }

   public void checkExtendedTableFN12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsFN12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyFN12( )
   {
      /* Using cursor T00FN24 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00FN17 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) && ( T00FN17_A129BarCod[0] == A129BarCod ) && ( T00FN17_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN17_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00FN17_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmFN12( 41) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T00FN17_A361DisCod[0] ;
         A2759BarMaqGru = T00FN17_A2759BarMaqGru[0] ;
         A180BarMaqCod = T00FN17_A180BarMaqCod[0] ;
         A1798BarDibCli = T00FN17_A1798BarDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
         A1799BarDibInt = T00FN17_A1799BarDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
         A212BarSer = T00FN17_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A213BarSit = T00FN17_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T00FN17_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A217BarTipArt = T00FN17_A217BarTipArt[0] ;
         n217BarTipArt = T00FN17_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadFN12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKeyFN12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKeyFN12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKeyFN12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T00FN25 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( GXutil.strcmp(T00FN25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FN25_A129BarCod[0] == A129BarCod ) && ( T00FN25_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN25_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( GXutil.strcmp(T00FN25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FN25_A129BarCod[0] == A129BarCod ) && ( T00FN25_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN25_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T00FN26 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( GXutil.strcmp(T00FN26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FN26_A129BarCod[0] == A129BarCod ) && ( T00FN26_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN26_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( GXutil.strcmp(T00FN26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FN26_A129BarCod[0] == A129BarCod ) && ( T00FN26_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN26_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyFN12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarSit_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertFN12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateFN12( ) ;
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertFN12( ) ;
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
                  GX_FocusControl = edtBarSit_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertFN12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         GX_FocusControl = edtBarSit_Internalname ;
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
      getKeyFN12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarfae");
      GX_FocusControl = edtBarSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_FN0( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartFN12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndFN12( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarSit_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarSit_Internalname ;
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
      scanStartFN12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNextFN12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndFN12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyFN12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FN16 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(10) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(10) == 101) || ( Z361DisCod != T00FN16_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T00FN16_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T00FN16_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z1798BarDibCli, T00FN16_A1798BarDibCli[0]) != 0 ) || ( Z1799BarDibInt != T00FN16_A1799BarDibInt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z212BarSer, T00FN16_A212BarSer[0]) != 0 ) || ( Z213BarSit != T00FN16_A213BarSit[0] ) || ( GXutil.strcmp(Z120BarAgrEst, T00FN16_A120BarAgrEst[0]) != 0 ) || ( Z217BarTipArt != T00FN16_A217BarTipArt[0] ) )
         {
            if ( Z361DisCod != T00FN16_A361DisCod[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T00FN16_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T00FN16_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T00FN16_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T00FN16_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T00FN16_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z1798BarDibCli, T00FN16_A1798BarDibCli[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarDibCli");
               GXutil.writeLogRaw("Old: ",Z1798BarDibCli);
               GXutil.writeLogRaw("Current: ",T00FN16_A1798BarDibCli[0]);
            }
            if ( Z1799BarDibInt != T00FN16_A1799BarDibInt[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarDibInt");
               GXutil.writeLogRaw("Old: ",Z1799BarDibInt);
               GXutil.writeLogRaw("Current: ",T00FN16_A1799BarDibInt[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T00FN16_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T00FN16_A212BarSer[0]);
            }
            if ( Z213BarSit != T00FN16_A213BarSit[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T00FN16_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T00FN16_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T00FN16_A120BarAgrEst[0]);
            }
            if ( Z217BarTipArt != T00FN16_A217BarTipArt[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarTipArt");
               GXutil.writeLogRaw("Old: ",Z217BarTipArt);
               GXutil.writeLogRaw("Current: ",T00FN16_A217BarTipArt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFN12( )
   {
      beforeValidateFN12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFN12( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFN12( 0) ;
         checkOptimisticConcurrencyFN12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFN12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFN12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FN27 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A180BarMaqCod, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A212BarSer, Byte.valueOf(A213BarSit), A120BarAgrEst, A396EmprCod, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(20) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN1FN12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelFN12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionFN0( ) ;
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
            loadFN12( ) ;
         }
         endLevelFN12( ) ;
      }
      closeExtendedTableCursorsFN12( ) ;
   }

   public void updateFN12( )
   {
      beforeValidateFN12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFN12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFN12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFN12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateFN12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FN28 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A212BarSer, Byte.valueOf(A213BarSit), A120BarAgrEst, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateFN12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
                     tbarfae_impl.this.A396EmprCod = GXv_char4[0] ;
                     tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
                     tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tbarfae_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN1FN12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelFN12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionFN0( ) ;
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
         endLevelFN12( ) ;
      }
      closeExtendedTableCursorsFN12( ) ;
   }

   public void deferredUpdateFN12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFN12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFN12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFN12( ) ;
         afterConfirmFN12( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFN12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00FN29 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               if ( AnyError == 0 )
               {
                  updateTablesN1FN12( ) ;
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound12 == 0 )
                     {
                        initAllFN12( ) ;
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
                     resetCaptionFN0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFN12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFN12( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelFN14( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRowFN14( ) ;
         if ( ( nRcdExists_14 != 0 ) || ( nIsMod_14 != 0 ) )
         {
            standaloneNotModalFN14( ) ;
            getKeyFN14( ) ;
            if ( ( nRcdExists_14 == 0 ) && ( nRcdDeleted_14 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertFN14( ) ;
            }
            else
            {
               if ( RcdFound14 != 0 )
               {
                  if ( ( nRcdDeleted_14 != 0 ) && ( nRcdExists_14 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteFN14( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_14 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateFN14( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_14 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtProFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_100_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z761ProFasLin_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_14_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_14_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_14_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_14 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFASEST_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllFN14( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_14 = (short)(0) ;
      nIsMod_14 = (short)(0) ;
      nRcdDeleted_14 = (short)(0) ;
   }

   public void processLevelFN12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevelFN14( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN1FN12( )
   {
      /* Using cursor T00FN30 */
      pr_default.execute(23, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevelFN12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(10);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteFN12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbarfae");
         if ( AnyError == 0 )
         {
            confirmValuesFN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarfae");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartFN12( )
   {
      /* Scan By routine */
      /* Using cursor T00FN31 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFN12( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEndFN12( )
   {
      pr_default.close(24);
   }

   public void afterConfirmFN12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertFN12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFN12( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFN12( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFN12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFN12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFN12( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Enabled), 5, 0), true);
      edtBarDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibInt_Enabled), 5, 0), true);
      edtDisNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCol_Enabled), 5, 0), true);
      edtEmpesCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      edtMaxOrdFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaxOrdFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaxOrdFas_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmFN14( int GX_JID )
   {
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z761ProFasLin = T00FN14_A761ProFasLin[0] ;
         }
         else
         {
            Z761ProFasLin = A761ProFasLin ;
         }
      }
      if ( GX_JID == -47 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z761ProFasLin = A761ProFasLin ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z760ProFasEst = A760ProFasEst ;
      }
   }

   public void standaloneNotModalFN14( )
   {
   }

   public void standaloneModalFN14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
   }

   public void loadFN14( )
   {
      /* Using cursor T00FN33 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A759ProDsc = T00FN33_A759ProDsc[0] ;
         A761ProFasLin = T00FN33_A761ProFasLin[0] ;
         n761ProFasLin = T00FN33_n761ProFasLin[0] ;
         A760ProFasEst = T00FN33_A760ProFasEst[0] ;
         n760ProFasEst = T00FN33_n760ProFasEst[0] ;
         zmFN14( -47) ;
      }
      pr_default.close(25);
      onLoadActionsFN14( ) ;
   }

   public void onLoadActionsFN14( )
   {
   }

   public void checkExtendedTableFN14( )
   {
      nIsDirty_14 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalFN14( ) ;
      /* Using cursor T00FN15 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00FN15_A759ProDsc[0] ;
      pr_default.close(9);
      /* Using cursor T00FN12 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A760ProFasEst = T00FN12_A760ProFasEst[0] ;
         n760ProFasEst = T00FN12_n760ProFasEst[0] ;
      }
      else
      {
         nIsDirty_14 = (short)(1) ;
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      pr_default.close(6);
      if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta Agrupada", ""), 0, GXCCtl);
      }
      if ( ( A213BarSit > 8 ) && true /* After */ )
      {
         GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta cerrada", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A213BarSit == 4 ) && true /* After */ )
      {
         GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta con receta", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursorsFN14( )
   {
      pr_default.close(9);
      pr_default.close(6);
   }

   public void enableDisableFN14( )
   {
   }

   public void gxload_48( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T00FN34 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00FN34_A759ProDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void gxload_49( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A758ProCod )
   {
      /* Using cursor T00FN36 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A760ProFasEst = T00FN36_A760ProFasEst[0] ;
         n760ProFasEst = T00FN36_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void getKeyFN14( )
   {
      /* Using cursor T00FN37 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKeyFN14( )
   {
      /* Using cursor T00FN14 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(8) != 101) && ( T00FN14_A129BarCod[0] == A129BarCod ) && ( T00FN14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00FN14_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmFN14( 47) ;
         RcdFound14 = (short)(1) ;
         initializeNonKeyFN14( ) ;
         A761ProFasLin = T00FN14_A761ProFasLin[0] ;
         n761ProFasLin = T00FN14_n761ProFasLin[0] ;
         A758ProCod = T00FN14_A758ProCod[0] ;
         n758ProCod = T00FN14_n758ProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFN14( ) ;
         loadFN14( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKeyFN14( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFN14( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesFN14( ) ;
      }
      pr_default.close(8);
   }

   public void checkOptimisticConcurrencyFN14( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FN13 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( Z761ProFasLin != T00FN13_A761ProFasLin[0] ) )
         {
            if ( Z761ProFasLin != T00FN13_A761ProFasLin[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"ProFasLin");
               GXutil.writeLogRaw("Old: ",Z761ProFasLin);
               GXutil.writeLogRaw("Current: ",T00FN13_A761ProFasLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFN14( )
   {
      beforeValidateFN14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFN14( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFN14( 0) ;
         checkOptimisticConcurrencyFN14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFN14( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFN14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FN38 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
                  if ( (pr_default.getStatus(29) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        GXv_char2[0] = A758ProCod ;
                        new app.pnuefas(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2) ;
                        tbarfae_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
                        tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbarfae_impl.this.A130BarCodPar = GXv_char3[0] ;
                        tbarfae_impl.this.A758ProCod = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelFN14( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            loadFN14( ) ;
         }
         endLevelFN14( ) ;
      }
      closeExtendedTableCursorsFN14( ) ;
   }

   public void updateFN14( )
   {
      beforeValidateFN14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFN14( ) ;
      }
      if ( ( nIsMod_14 != 0 ) || ( nIsDirty_14 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyFN14( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmFN14( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateFN14( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00FN39 */
                     pr_default.execute(30, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateFN14( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
                        tbarfae_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
                        tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbarfae_impl.this.A130BarCodPar = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelFN14( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyFN14( ) ;
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
            endLevelFN14( ) ;
         }
      }
      closeExtendedTableCursorsFN14( ) ;
   }

   public void deferredUpdateFN14( )
   {
   }

   public void deleteFN14( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFN14( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFN14( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFN14( ) ;
         afterConfirmFN14( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFN14( ) ;
            if ( AnyError == 0 )
            {
               scanStartFN15( ) ;
               while ( RcdFound15 != 0 )
               {
                  getByPrimaryKeyFN15( ) ;
                  deleteFN15( ) ;
                  scanNextFN15( ) ;
               }
               scanEndFN15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FN40 */
                  pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
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
      }
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFN14( ) ;
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFN14( )
   {
      standaloneModalFN14( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00FN41 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T00FN41_A759ProDsc[0] ;
         pr_default.close(32);
         /* Using cursor T00FN43 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            A760ProFasEst = T00FN43_A760ProFasEst[0] ;
            n760ProFasEst = T00FN43_n760ProFasEst[0] ;
         }
         else
         {
            A760ProFasEst = (byte)(0) ;
            n760ProFasEst = false ;
         }
         pr_default.close(33);
         if ( true /* Level */ && ( A760ProFasEst != 0 ) && isDlt( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se permite borrar el Proceso", ""), 1, "");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00FN44 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00FN45 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void processNestedLevelFN15( )
   {
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRowFN15( ) ;
         if ( ( nRcdExists_15 != 0 ) || ( nIsMod_15 != 0 ) )
         {
            standaloneNotModalFN15( ) ;
            getKeyFN15( ) ;
            if ( ( nRcdExists_15 == 0 ) && ( nRcdDeleted_15 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertFN15( ) ;
            }
            else
            {
               if ( RcdFound15 != 0 )
               {
                  if ( ( nRcdDeleted_15 != 0 ) && ( nRcdExists_15 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteFN15( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_15 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateFN15( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_15 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_15_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtBarFasCon_Internalname, GXutil.rtrim( A152BarFasCon)) ;
         httpContext.changePostValue( edtBarFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtBarFacTin_Internalname, GXutil.rtrim( A150BarFacTin)) ;
         httpContext.changePostValue( edtBarFecTeo_Internalname, localUtil.format(A162BarFecTeo, "99/99/99")) ;
         httpContext.changePostValue( edtBarFecRea_Internalname, localUtil.format(A160BarFecRea, "99/99/99")) ;
         httpContext.changePostValue( edtBarTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarUni_Internalname, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarLoc_Internalname, GXutil.rtrim( A179BarLoc)) ;
         httpContext.changePostValue( edtBarHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpcVir_Internalname, GXutil.rtrim( A1788EmpcVir)) ;
         httpContext.changePostValue( edtBarCoVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReVir_Internalname, GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPaVir_Internalname, GXutil.rtrim( A1786BarPaVir)) ;
         httpContext.changePostValue( edtProCodVir_Internalname, GXutil.rtrim( A1789ProCodVir)) ;
         httpContext.changePostValue( edtOrdLinVir_Internalname, GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasAnt_Internalname, GXutil.rtrim( A1785BarFasAnt)) ;
         httpContext.changePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z152BarFasCon_"+sGXsfl_127_idx, GXutil.rtrim( Z152BarFasCon)) ;
         httpContext.changePostValue( "ZT_"+"Z150BarFacTin_"+sGXsfl_127_idx, GXutil.rtrim( Z150BarFacTin)) ;
         httpContext.changePostValue( "ZT_"+"Z153BarFasEst_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z162BarFecTeo_"+sGXsfl_127_idx, localUtil.dtoc( Z162BarFecTeo, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z160BarFecRea_"+sGXsfl_127_idx, localUtil.dtoc( Z160BarFecRea, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z216BarTieTeo_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z227BarUni_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z179BarLoc_"+sGXsfl_127_idx, GXutil.rtrim( Z179BarLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z165BarHorIni_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z164BarHorFin_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z215BarTieRea_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_127_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z603MaqCodBis_"+sGXsfl_127_idx, GXutil.rtrim( Z603MaqCodBis)) ;
         httpContext.changePostValue( "nRcdDeleted_15_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_15_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_15_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N216BarTieTeo_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N603MaqCodBis_"+sGXsfl_127_idx, GXutil.rtrim( A603MaqCodBis)) ;
         httpContext.changePostValue( "N160BarFecRea_"+sGXsfl_127_idx, localUtil.dtoc( A160BarFecRea, 0, "/")) ;
         httpContext.changePostValue( "N227BarUni_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_15 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_15_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASCON_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEST_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCODBIS_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFACTIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECTEO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECREA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIETEO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARUNI_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLOC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORINI_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORFIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIEREA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPCVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPAVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCODVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDLINVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASANT_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00FN47 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(36) != 101) )
      {
         A628MaxOrdFas = T00FN47_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00FN47_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      /* Using cursor T00FN43 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A760ProFasEst = T00FN43_A760ProFasEst[0] ;
         n760ProFasEst = T00FN43_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      if ( true /* Level */ && ( A760ProFasEst != 0 ) && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se permite borrar el Proceso", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* End of After( level) rules */
      initAllFN15( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_15 = (short)(0) ;
      nIsMod_15 = (short)(0) ;
      nRcdDeleted_15 = (short)(0) ;
   }

   public void processLevelFN14( )
   {
      /* Save parent mode. */
      sMode14 = Gx_mode ;
      processNestedLevelFN15( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelFN14( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartFN14( )
   {
      /* Scan By routine */
      /* Using cursor T00FN48 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A758ProCod = T00FN48_A758ProCod[0] ;
         n758ProCod = T00FN48_n758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFN14( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A758ProCod = T00FN48_A758ProCod[0] ;
         n758ProCod = T00FN48_n758ProCod[0] ;
      }
   }

   public void scanEndFN14( )
   {
      pr_default.close(37);
   }

   public void afterConfirmFN14( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isDlt( )  && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A758ProCod ;
         GXv_char7[0] = httpContext.getMessage( "DEL", "") ;
         new app.prenfas(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char7) ;
         tbarfae_impl.this.A396EmprCod = GXv_char4[0] ;
         tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
         tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
         tbarfae_impl.this.A130BarCodPar = GXv_char3[0] ;
         tbarfae_impl.this.A758ProCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void beforeInsertFN14( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFN14( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFN14( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFN14( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFN14( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFN14( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtProFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtProFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFasEst_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void zmFN15( int GX_JID )
   {
      if ( ( GX_JID == 50 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z152BarFasCon = T00FN3_A152BarFasCon[0] ;
            Z150BarFacTin = T00FN3_A150BarFacTin[0] ;
            Z153BarFasEst = T00FN3_A153BarFasEst[0] ;
            Z162BarFecTeo = T00FN3_A162BarFecTeo[0] ;
            Z160BarFecRea = T00FN3_A160BarFecRea[0] ;
            Z216BarTieTeo = T00FN3_A216BarTieTeo[0] ;
            Z227BarUni = T00FN3_A227BarUni[0] ;
            Z179BarLoc = T00FN3_A179BarLoc[0] ;
            Z165BarHorIni = T00FN3_A165BarHorIni[0] ;
            Z164BarHorFin = T00FN3_A164BarHorFin[0] ;
            Z215BarTieRea = T00FN3_A215BarTieRea[0] ;
            Z457FasCod = T00FN3_A457FasCod[0] ;
            Z603MaqCodBis = T00FN3_A603MaqCodBis[0] ;
         }
         else
         {
            Z152BarFasCon = A152BarFasCon ;
            Z150BarFacTin = A150BarFacTin ;
            Z153BarFasEst = A153BarFasEst ;
            Z162BarFecTeo = A162BarFecTeo ;
            Z160BarFecRea = A160BarFecRea ;
            Z216BarTieTeo = A216BarTieTeo ;
            Z227BarUni = A227BarUni ;
            Z179BarLoc = A179BarLoc ;
            Z165BarHorIni = A165BarHorIni ;
            Z164BarHorFin = A164BarHorFin ;
            Z215BarTieRea = A215BarTieRea ;
            Z457FasCod = A457FasCod ;
            Z603MaqCodBis = A603MaqCodBis ;
         }
      }
      if ( GX_JID == -50 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z152BarFasCon = A152BarFasCon ;
         Z150BarFacTin = A150BarFacTin ;
         Z153BarFasEst = A153BarFasEst ;
         Z162BarFecTeo = A162BarFecTeo ;
         Z160BarFecRea = A160BarFecRea ;
         Z216BarTieTeo = A216BarTieTeo ;
         Z227BarUni = A227BarUni ;
         Z179BarLoc = A179BarLoc ;
         Z165BarHorIni = A165BarHorIni ;
         Z164BarHorFin = A164BarHorFin ;
         Z215BarTieRea = A215BarTieRea ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z1785BarFasAnt = A1785BarFasAnt ;
         Z458FasCon = A458FasCon ;
         Z459FasDec = A459FasDec ;
         Z602MaqCod = A602MaqCod ;
         Z456FasActTin = A456FasActTin ;
      }
   }

   public void standaloneNotModalFN15( )
   {
      /* Using cursor T00FN6 */
      pr_default.execute(2, new Object[] {Short.valueOf(A655OrdLinVir), A1788EmpcVir, Integer.valueOf(A1784BarCoVir), Byte.valueOf(A1787BarReVir), A1786BarPaVir, A1789ProCodVir});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1785BarFasAnt = T00FN6_A1785BarFasAnt[0] ;
         n1785BarFasAnt = T00FN6_n1785BarFasAnt[0] ;
      }
      else
      {
         A1785BarFasAnt = "        " ;
         n1785BarFasAnt = false ;
      }
      pr_default.close(2);
      edtBarFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFecTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFacTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      A1788EmpcVir = A396EmprCod ;
      A1784BarCoVir = A129BarCod ;
      A1787BarReVir = A132BarCodReo ;
      A1786BarPaVir = A130BarCodPar ;
      A1789ProCodVir = A758ProCod ;
   }

   public void standaloneModalFN15( )
   {
      if ( ( A153BarFasEst == 1 ) || ( A153BarFasEst == 2 ) )
      {
         edtBarTieTeo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtBarTieTeo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      if ( ( A153BarFasEst == 1 ) || ( A153BarFasEst == 2 ) )
      {
         edtMaqCodBis_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtMaqCodBis_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      if ( ( A153BarFasEst == 0 ) || ( A153BarFasEst == 2 ) )
      {
         edtBarFecRea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtBarFecRea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      if ( ( A153BarFasEst == 0 ) || ( A153BarFasEst == 2 ) )
      {
         edtBarUni_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtBarUni_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarOrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtBarOrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
   }

   public void loadFN15( )
   {
      /* Using cursor T00FN51 */
      pr_default.execute(38, new Object[] {Short.valueOf(A655OrdLinVir), A1788EmpcVir, Integer.valueOf(A1784BarCoVir), Byte.valueOf(A1787BarReVir), A1786BarPaVir, A1789ProCodVir, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A152BarFasCon = T00FN51_A152BarFasCon[0] ;
         A150BarFacTin = T00FN51_A150BarFacTin[0] ;
         A458FasCon = T00FN51_A458FasCon[0] ;
         n458FasCon = T00FN51_n458FasCon[0] ;
         A153BarFasEst = T00FN51_A153BarFasEst[0] ;
         A459FasDec = T00FN51_A459FasDec[0] ;
         n459FasDec = T00FN51_n459FasDec[0] ;
         A602MaqCod = T00FN51_A602MaqCod[0] ;
         n602MaqCod = T00FN51_n602MaqCod[0] ;
         A456FasActTin = T00FN51_A456FasActTin[0] ;
         n456FasActTin = T00FN51_n456FasActTin[0] ;
         A162BarFecTeo = T00FN51_A162BarFecTeo[0] ;
         A160BarFecRea = T00FN51_A160BarFecRea[0] ;
         A216BarTieTeo = T00FN51_A216BarTieTeo[0] ;
         A227BarUni = T00FN51_A227BarUni[0] ;
         A179BarLoc = T00FN51_A179BarLoc[0] ;
         A165BarHorIni = T00FN51_A165BarHorIni[0] ;
         A164BarHorFin = T00FN51_A164BarHorFin[0] ;
         A215BarTieRea = T00FN51_A215BarTieRea[0] ;
         A457FasCod = T00FN51_A457FasCod[0] ;
         A603MaqCodBis = T00FN51_A603MaqCodBis[0] ;
         A1785BarFasAnt = T00FN51_A1785BarFasAnt[0] ;
         n1785BarFasAnt = T00FN51_n1785BarFasAnt[0] ;
         zmFN15( -50) ;
      }
      pr_default.close(38);
      onLoadActionsFN15( ) ;
   }

   public void onLoadActionsFN15( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A603MaqCodBis)==0) && ( Gx_BScreen == 0 ) )
      {
         A603MaqCodBis = A602MaqCod ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A152BarFasCon)==0) && ( Gx_BScreen == 0 ) )
      {
         A152BarFasCon = A458FasCon ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A150BarFacTin)==0) && ( Gx_BScreen == 0 ) )
      {
         A150BarFacTin = A456FasActTin ;
      }
      A655OrdLinVir = A194BarOrdLin ;
   }

   public void checkExtendedTableFN15( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalFN15( ) ;
      /* Using cursor T00FN7 */
      pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A458FasCon = T00FN7_A458FasCon[0] ;
      n458FasCon = T00FN7_n458FasCon[0] ;
      A459FasDec = T00FN7_A459FasDec[0] ;
      n459FasDec = T00FN7_n459FasDec[0] ;
      A602MaqCod = T00FN7_A602MaqCod[0] ;
      n602MaqCod = T00FN7_n602MaqCod[0] ;
      A456FasActTin = T00FN7_A456FasActTin[0] ;
      n456FasActTin = T00FN7_n456FasActTin[0] ;
      pr_default.close(3);
      if ( isIns( )  && (GXutil.strcmp("", A603MaqCodBis)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_15 = (short)(1) ;
         A603MaqCodBis = A602MaqCod ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A152BarFasCon)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_15 = (short)(1) ;
         A152BarFasCon = A458FasCon ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A150BarFacTin)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_15 = (short)(1) ;
         A150BarFacTin = A456FasActTin ;
      }
      nIsDirty_15 = (short)(1) ;
      A655OrdLinVir = A194BarOrdLin ;
      /* Using cursor T00FN8 */
      pr_default.execute(4, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "MAQCODBIS_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursorsFN15( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisableFN15( )
   {
   }

   public void gxload_52( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00FN52 */
      pr_default.execute(39, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A458FasCon = T00FN52_A458FasCon[0] ;
      n458FasCon = T00FN52_n458FasCon[0] ;
      A459FasDec = T00FN52_A459FasDec[0] ;
      n459FasDec = T00FN52_n459FasDec[0] ;
      A602MaqCod = T00FN52_A602MaqCod[0] ;
      n602MaqCod = T00FN52_n602MaqCod[0] ;
      A456FasActTin = T00FN52_A456FasActTin[0] ;
      n456FasActTin = T00FN52_n456FasActTin[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(39) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(39);
   }

   public void gxload_53( String A396EmprCod ,
                          String A603MaqCodBis )
   {
      /* Using cursor T00FN53 */
      pr_default.execute(40, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(40) == 101) )
      {
         GXCCtl = "MAQCODBIS_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(40) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(40);
   }

   public void getKeyFN15( )
   {
      /* Using cursor T00FN54 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(41);
   }

   public void getByPrimaryKeyFN15( )
   {
      /* Using cursor T00FN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00FN3_A129BarCod[0] == A129BarCod ) && ( T00FN3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00FN3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00FN3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmFN15( 50) ;
         RcdFound15 = (short)(1) ;
         initializeNonKeyFN15( ) ;
         A194BarOrdLin = T00FN3_A194BarOrdLin[0] ;
         A152BarFasCon = T00FN3_A152BarFasCon[0] ;
         A150BarFacTin = T00FN3_A150BarFacTin[0] ;
         A153BarFasEst = T00FN3_A153BarFasEst[0] ;
         A162BarFecTeo = T00FN3_A162BarFecTeo[0] ;
         A160BarFecRea = T00FN3_A160BarFecRea[0] ;
         A216BarTieTeo = T00FN3_A216BarTieTeo[0] ;
         A227BarUni = T00FN3_A227BarUni[0] ;
         A179BarLoc = T00FN3_A179BarLoc[0] ;
         A165BarHorIni = T00FN3_A165BarHorIni[0] ;
         A164BarHorFin = T00FN3_A164BarHorFin[0] ;
         A215BarTieRea = T00FN3_A215BarTieRea[0] ;
         A457FasCod = T00FN3_A457FasCod[0] ;
         A603MaqCodBis = T00FN3_A603MaqCodBis[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFN15( ) ;
         loadFN15( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKeyFN15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFN15( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesFN15( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyFN15( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z152BarFasCon, T00FN2_A152BarFasCon[0]) != 0 ) || ( GXutil.strcmp(Z150BarFacTin, T00FN2_A150BarFacTin[0]) != 0 ) || ( Z153BarFasEst != T00FN2_A153BarFasEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T00FN2_A162BarFecTeo[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T00FN2_A160BarFecRea[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z216BarTieTeo, T00FN2_A216BarTieTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z227BarUni, T00FN2_A227BarUni[0]) != 0 ) || ( GXutil.strcmp(Z179BarLoc, T00FN2_A179BarLoc[0]) != 0 ) || ( Z165BarHorIni != T00FN2_A165BarHorIni[0] ) || ( Z164BarHorFin != T00FN2_A164BarHorFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z215BarTieRea, T00FN2_A215BarTieRea[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T00FN2_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z603MaqCodBis, T00FN2_A603MaqCodBis[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z152BarFasCon, T00FN2_A152BarFasCon[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarFasCon");
               GXutil.writeLogRaw("Old: ",Z152BarFasCon);
               GXutil.writeLogRaw("Current: ",T00FN2_A152BarFasCon[0]);
            }
            if ( GXutil.strcmp(Z150BarFacTin, T00FN2_A150BarFacTin[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarFacTin");
               GXutil.writeLogRaw("Old: ",Z150BarFacTin);
               GXutil.writeLogRaw("Current: ",T00FN2_A150BarFacTin[0]);
            }
            if ( Z153BarFasEst != T00FN2_A153BarFasEst[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarFasEst");
               GXutil.writeLogRaw("Old: ",Z153BarFasEst);
               GXutil.writeLogRaw("Current: ",T00FN2_A153BarFasEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T00FN2_A162BarFecTeo[0])) ) )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarFecTeo");
               GXutil.writeLogRaw("Old: ",Z162BarFecTeo);
               GXutil.writeLogRaw("Current: ",T00FN2_A162BarFecTeo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T00FN2_A160BarFecRea[0])) ) )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarFecRea");
               GXutil.writeLogRaw("Old: ",Z160BarFecRea);
               GXutil.writeLogRaw("Current: ",T00FN2_A160BarFecRea[0]);
            }
            if ( DecimalUtil.compareTo(Z216BarTieTeo, T00FN2_A216BarTieTeo[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarTieTeo");
               GXutil.writeLogRaw("Old: ",Z216BarTieTeo);
               GXutil.writeLogRaw("Current: ",T00FN2_A216BarTieTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z227BarUni, T00FN2_A227BarUni[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarUni");
               GXutil.writeLogRaw("Old: ",Z227BarUni);
               GXutil.writeLogRaw("Current: ",T00FN2_A227BarUni[0]);
            }
            if ( GXutil.strcmp(Z179BarLoc, T00FN2_A179BarLoc[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarLoc");
               GXutil.writeLogRaw("Old: ",Z179BarLoc);
               GXutil.writeLogRaw("Current: ",T00FN2_A179BarLoc[0]);
            }
            if ( Z165BarHorIni != T00FN2_A165BarHorIni[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarHorIni");
               GXutil.writeLogRaw("Old: ",Z165BarHorIni);
               GXutil.writeLogRaw("Current: ",T00FN2_A165BarHorIni[0]);
            }
            if ( Z164BarHorFin != T00FN2_A164BarHorFin[0] )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarHorFin");
               GXutil.writeLogRaw("Old: ",Z164BarHorFin);
               GXutil.writeLogRaw("Current: ",T00FN2_A164BarHorFin[0]);
            }
            if ( DecimalUtil.compareTo(Z215BarTieRea, T00FN2_A215BarTieRea[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"BarTieRea");
               GXutil.writeLogRaw("Old: ",Z215BarTieRea);
               GXutil.writeLogRaw("Current: ",T00FN2_A215BarTieRea[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00FN2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00FN2_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z603MaqCodBis, T00FN2_A603MaqCodBis[0]) != 0 )
            {
               GXutil.writeLogln("tbarfae:[seudo value changed for attri]"+"MaqCodBis");
               GXutil.writeLogRaw("Old: ",Z603MaqCodBis);
               GXutil.writeLogRaw("Current: ",T00FN2_A603MaqCodBis[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFN15( )
   {
      beforeValidateFN15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFN15( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFN15( 0) ;
         checkOptimisticConcurrencyFN15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFN15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFN15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FN55 */
                  pr_default.execute(42, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, A150BarFacTin, Byte.valueOf(A153BarFasEst), A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A396EmprCod, A457FasCod, A603MaqCodBis});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(42) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        GXv_char7[0] = A396EmprCod ;
                        GXv_int5[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char4[0] = A130BarCodPar ;
                        GXv_char3[0] = A758ProCod ;
                        GXv_char2[0] = httpContext.getMessage( "INS", "") ;
                        new app.prenfas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
                        tbarfae_impl.this.A396EmprCod = GXv_char7[0] ;
                        tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
                        tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbarfae_impl.this.A130BarCodPar = GXv_char4[0] ;
                        tbarfae_impl.this.A758ProCod = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
            loadFN15( ) ;
         }
         endLevelFN15( ) ;
      }
      closeExtendedTableCursorsFN15( ) ;
   }

   public void updateFN15( )
   {
      beforeValidateFN15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFN15( ) ;
      }
      if ( ( nIsMod_15 != 0 ) || ( nIsDirty_15 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyFN15( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmFN15( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateFN15( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00FN56 */
                     pr_default.execute(43, new Object[] {A152BarFasCon, A150BarFacTin, Byte.valueOf(A153BarFasEst), A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A457FasCod, A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                     if ( (pr_default.getStatus(43) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateFN15( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char7[0] = A396EmprCod ;
                        GXv_int5[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char4[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4) ;
                        tbarfae_impl.this.A396EmprCod = GXv_char7[0] ;
                        tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
                        tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbarfae_impl.this.A130BarCodPar = GXv_char4[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyFN15( ) ;
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
            endLevelFN15( ) ;
         }
      }
      closeExtendedTableCursorsFN15( ) ;
   }

   public void deferredUpdateFN15( )
   {
   }

   public void deleteFN15( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFN15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFN15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFN15( ) ;
         afterConfirmFN15( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFN15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00FN57 */
               pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                  {
                     GXv_char7[0] = A396EmprCod ;
                     GXv_int5[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     GXv_char3[0] = A758ProCod ;
                     GXv_char2[0] = httpContext.getMessage( "INS", "") ;
                     new app.prenfas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
                     tbarfae_impl.this.A396EmprCod = GXv_char7[0] ;
                     tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
                     tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tbarfae_impl.this.A130BarCodPar = GXv_char4[0] ;
                     tbarfae_impl.this.A758ProCod = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFN15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFN15( )
   {
      standaloneModalFN15( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A655OrdLinVir = A194BarOrdLin ;
         /* Using cursor T00FN58 */
         pr_default.execute(45, new Object[] {A396EmprCod, A457FasCod});
         A458FasCon = T00FN58_A458FasCon[0] ;
         n458FasCon = T00FN58_n458FasCon[0] ;
         A459FasDec = T00FN58_A459FasDec[0] ;
         n459FasDec = T00FN58_n459FasDec[0] ;
         A602MaqCod = T00FN58_A602MaqCod[0] ;
         n602MaqCod = T00FN58_n602MaqCod[0] ;
         A456FasActTin = T00FN58_A456FasActTin[0] ;
         n456FasActTin = T00FN58_n456FasActTin[0] ;
         pr_default.close(45);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00FN59 */
         pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00FN60 */
         pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00FN61 */
         pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00FN62 */
         pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00FN63 */
         pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00FN64 */
         pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00FN65 */
         pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00FN66 */
         pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00FN67 */
         pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00FN68 */
         pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00FN69 */
         pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00FN70 */
         pr_default.execute(57, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00FN71 */
         pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00FN72 */
         pr_default.execute(59, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00FN73 */
         pr_default.execute(60, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00FN74 */
         pr_default.execute(61, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00FN75 */
         pr_default.execute(62, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00FN76 */
         pr_default.execute(63, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00FN77 */
         pr_default.execute(64, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T00FN78 */
         pr_default.execute(65, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T00FN79 */
         pr_default.execute(66, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
      }
   }

   public void endLevelFN15( )
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

   public void scanStartFN15( )
   {
      /* Scan By routine */
      /* Using cursor T00FN80 */
      pr_default.execute(67, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00FN80_A194BarOrdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFN15( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00FN80_A194BarOrdLin[0] ;
      }
   }

   public void scanEndFN15( )
   {
      pr_default.close(67);
   }

   public void afterConfirmFN15( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && (0==A194BarOrdLin) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A758ProCod ;
         GXv_int8[0] = A194BarOrdLin ;
         new app.pnumfas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3, GXv_int8) ;
         tbarfae_impl.this.A396EmprCod = GXv_char7[0] ;
         tbarfae_impl.this.A129BarCod = GXv_int5[0] ;
         tbarfae_impl.this.A132BarCodReo = GXv_int6[0] ;
         tbarfae_impl.this.A130BarCodPar = GXv_char4[0] ;
         tbarfae_impl.this.A758ProCod = GXv_char3[0] ;
         tbarfae_impl.this.A194BarOrdLin = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void beforeInsertFN15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFN15( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFN15( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFN15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFN15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFN15( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtMaxOrdFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaxOrdFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaxOrdFas_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFacTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFecTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFecRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarTieTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLoc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarHorIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarHorFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtEmpcVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpcVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpcVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarCoVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCoVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCoVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarReVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarReVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarPaVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPaVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPaVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtProCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCodVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtOrdLinVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLinVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLinVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFasAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasAnt_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void send_integrity_lvl_hashesFN15( )
   {
   }

   public void send_integrity_lvl_hashesFN14( )
   {
   }

   public void send_integrity_lvl_hashesFN12( )
   {
   }

   public void subsflControlProps_10014( )
   {
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_100_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_100_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_100_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_100_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_100_idx ;
      edtProFasLin_Internalname = "PROFASLIN_"+sGXsfl_100_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_100_idx ;
      edtProFasEst_Internalname = "PROFASEST_"+sGXsfl_100_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_10014( )
   {
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_100_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_100_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_100_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_100_fel_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_100_fel_idx ;
      edtProFasLin_Internalname = "PROFASLIN_"+sGXsfl_100_fel_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_100_fel_idx ;
      edtProFasEst_Internalname = "PROFASEST_"+sGXsfl_100_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_100_fel_idx ;
   }

   public void addRowFN14( )
   {
      nRC_GXsfl_127 = 0 ;
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10014( ) ;
      sendRowFN14( ) ;
   }

   public void sendRowFN14( )
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
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_100_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_100_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_100_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Codigo Proceso", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "Descripcion Proceso", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock19_Internalname,httpContext.getMessage( "Ultima Linea Fases", ""),"","",lblTextblock19_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A761ProFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A761ProFasLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFasLin_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProFasLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock20_Internalname,httpContext.getMessage( "Indica si fase con estado&lt;&gt;0", ""),"","",lblTextblock20_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A760ProFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A760ProFasEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFasEst_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProFasEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol127( ) ;
      nGXsfl_127_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount15 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_15 = (short)(1) ;
            scanStartFN15( ) ;
            while ( RcdFound15 != 0 )
            {
               init_level_properties15( ) ;
               getByPrimaryKeyFN15( ) ;
               addRowFN15( ) ;
               scanNextFN15( ) ;
            }
            scanEndFN15( ) ;
            nBlankRcdCount15 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalFN15( ) ;
         standaloneModalFN15( ) ;
         sMode15 = Gx_mode ;
         while ( nGXsfl_127_idx < nRC_GXsfl_127 )
         {
            bGXsfl_127_Refreshing = true ;
            readRowFN15( ) ;
            edtavnRcdDeleted_15_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_15_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_15_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASCON_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEST_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtMaqCodBis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCODBIS_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarFacTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFACTIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarFecTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECTEO_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarFecRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECREA_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarTieTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIETEO_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARUNI_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLOC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLoc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarHorIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORINI_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarHorFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarTieRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIEREA_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtEmpcVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPCVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmpcVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpcVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarCoVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCoVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCoVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarReVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarReVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarPaVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPAVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPaVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPaVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtProCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCODVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCodVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtOrdLinVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDLINVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdLinVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLinVir_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtBarFasAnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASANT_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasAnt_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            if ( ( nRcdExists_15 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalFN15( ) ;
            }
            sendRowFN15( ) ;
            bGXsfl_127_Refreshing = false ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount15 = (short)(5) ;
         nRcdExists_15 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartFN15( ) ;
            while ( RcdFound15 != 0 )
            {
               sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
               subsflControlProps_12715( ) ;
               init_level_properties15( ) ;
               standaloneNotModalFN15( ) ;
               getByPrimaryKeyFN15( ) ;
               standaloneModalFN15( ) ;
               addRowFN15( ) ;
               scanNextFN15( ) ;
            }
            scanEndFN15( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode15 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_12715( ) ;
      initAllFN15( ) ;
      init_level_properties15( ) ;
      nRcdExists_15 = (short)(0) ;
      nIsMod_15 = (short)(0) ;
      nRcdDeleted_15 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 100 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_100_idx, ".")) == 0 ) )
      {
         nBlankRcdCount15 = (short)(nBlankRcdUsr15+nBlankRcdCount15) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount15 > 0 )
      {
         standaloneNotModalFN15( ) ;
         standaloneModalFN15( ) ;
         addRowFN15( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarOrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount15 = (short)(nBlankRcdCount15-1) ;
      }
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_100_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_100_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_100_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesFN14( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "Z761ProFasLin_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z761ProFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_127_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_14_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_14_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_14_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFASLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFASEST_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_100_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowFN14( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10014( ) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFASEST_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      n758ProCod = false ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFASLIN_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFasLin_Internalname ;
         wbErr = true ;
         A761ProFasLin = (short)(0) ;
         n761ProFasLin = false ;
      }
      else
      {
         A761ProFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n761ProFasLin = false ;
      }
      A760ProFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtProFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n760ProFasEst = false ;
      GXCCtl = "Z758ProCod_" + sGXsfl_100_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z761ProFasLin_" + sGXsfl_100_idx ;
      Z761ProFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_100_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_14_" + sGXsfl_100_idx ;
      nRcdDeleted_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_14_" + sGXsfl_100_idx ;
      nRcdExists_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_14_" + sGXsfl_100_idx ;
      nIsMod_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_100_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_100_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_12715( )
   {
      edtavnRcdDeleted_15_Internalname = "vNRCDDELETED_15_"+sGXsfl_127_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_127_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_127_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_127_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_127_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_127_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_127_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_127_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_127_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_127_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_127_idx ;
      edtBarFecTeo_Internalname = "BARFECTEO_"+sGXsfl_127_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_127_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_127_idx ;
      edtBarUni_Internalname = "BARUNI_"+sGXsfl_127_idx ;
      edtBarLoc_Internalname = "BARLOC_"+sGXsfl_127_idx ;
      edtBarHorIni_Internalname = "BARHORINI_"+sGXsfl_127_idx ;
      edtBarHorFin_Internalname = "BARHORFIN_"+sGXsfl_127_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_127_idx ;
      edtEmpcVir_Internalname = "EMPCVIR_"+sGXsfl_127_idx ;
      edtBarCoVir_Internalname = "BARCOVIR_"+sGXsfl_127_idx ;
      edtBarReVir_Internalname = "BARREVIR_"+sGXsfl_127_idx ;
      edtBarPaVir_Internalname = "BARPAVIR_"+sGXsfl_127_idx ;
      edtProCodVir_Internalname = "PROCODVIR_"+sGXsfl_127_idx ;
      edtOrdLinVir_Internalname = "ORDLINVIR_"+sGXsfl_127_idx ;
      edtBarFasAnt_Internalname = "BARFASANT_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_12715( )
   {
      edtavnRcdDeleted_15_Internalname = "vNRCDDELETED_15_"+sGXsfl_127_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_127_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_127_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_127_fel_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_127_fel_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_127_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_127_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_127_fel_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_127_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_127_fel_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_127_fel_idx ;
      edtBarFecTeo_Internalname = "BARFECTEO_"+sGXsfl_127_fel_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_127_fel_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_127_fel_idx ;
      edtBarUni_Internalname = "BARUNI_"+sGXsfl_127_fel_idx ;
      edtBarLoc_Internalname = "BARLOC_"+sGXsfl_127_fel_idx ;
      edtBarHorIni_Internalname = "BARHORINI_"+sGXsfl_127_fel_idx ;
      edtBarHorFin_Internalname = "BARHORFIN_"+sGXsfl_127_fel_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_127_fel_idx ;
      edtEmpcVir_Internalname = "EMPCVIR_"+sGXsfl_127_fel_idx ;
      edtBarCoVir_Internalname = "BARCOVIR_"+sGXsfl_127_fel_idx ;
      edtBarReVir_Internalname = "BARREVIR_"+sGXsfl_127_fel_idx ;
      edtBarPaVir_Internalname = "BARPAVIR_"+sGXsfl_127_fel_idx ;
      edtProCodVir_Internalname = "PROCODVIR_"+sGXsfl_127_fel_idx ;
      edtOrdLinVir_Internalname = "ORDLINVIR_"+sGXsfl_127_fel_idx ;
      edtBarFasAnt_Internalname = "BARFASANT_"+sGXsfl_127_fel_idx ;
   }

   public void addRowFN15( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_12715( ) ;
      sendRowFN15( ) ;
   }

   public void sendRowFN15( )
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
         if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_15_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_15_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_15), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_15), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_15_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarOrdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCon_Internalname,GXutil.rtrim( A152BarFasCon),GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCodBis_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFacTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecTeo_Internalname,localUtil.format(A162BarFecTeo, "99/99/99"),localUtil.format( A162BarFecTeo, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecTeo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRea_Internalname,localUtil.format(A160BarFecRea, "99/99/99"),localUtil.format( A160BarFecRea, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,140);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecRea_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A216BarTieTeo, "Z9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTieTeo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUni_Internalname,GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A227BarUni, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,142);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarUni_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarLoc_Internalname,GXutil.rtrim( A179BarLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,143);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHorIni_Internalname,GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarHorIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarHorIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarHorIni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 145,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHorFin_Internalname,GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarHorFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,145);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarHorFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarHorFin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_15_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_14_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTieRea_Enabled!=0) ? localUtil.format( A215BarTieRea, "Z9.99") : localUtil.format( A215BarTieRea, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTieRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpcVir_Internalname,GXutil.rtrim( A1788EmpcVir),GXutil.rtrim( localUtil.format( A1788EmpcVir, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpcVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmpcVir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCoVir_Internalname,GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCoVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1784BarCoVir), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1784BarCoVir), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCoVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCoVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarReVir_Internalname,GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarReVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1787BarReVir), "9") : localUtil.format( DecimalUtil.doubleToDec(A1787BarReVir), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarReVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarReVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPaVir_Internalname,GXutil.rtrim( A1786BarPaVir),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPaVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPaVir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCodVir_Internalname,GXutil.rtrim( A1789ProCodVir),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCodVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProCodVir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdLinVir_Internalname,GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdLinVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A655OrdLinVir), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A655OrdLinVir), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdLinVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdLinVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasAnt_Internalname,GXutil.rtrim( A1785BarFasAnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasAnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasAnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesFN15( ) ;
      GXCCtl = "Z194BarOrdLin_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z152BarFasCon_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z152BarFasCon));
      GXCCtl = "Z150BarFacTin_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z150BarFacTin));
      GXCCtl = "Z153BarFasEst_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z162BarFecTeo_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z162BarFecTeo, 0, "/"));
      GXCCtl = "Z160BarFecRea_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z160BarFecRea, 0, "/"));
      GXCCtl = "Z216BarTieTeo_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z227BarUni_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z179BarLoc_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z179BarLoc));
      GXCCtl = "Z165BarHorIni_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z164BarHorFin_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z215BarTieRea_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z603MaqCodBis_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z603MaqCodBis));
      GXCCtl = "nRcdDeleted_15_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_15_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_15_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N216BarTieTeo_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N603MaqCodBis_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A603MaqCodBis));
      GXCCtl = "N160BarFecRea_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A160BarFecRea, 0, "/"));
      GXCCtl = "N227BarUni_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_15_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECTEO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECREA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNI_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARLOC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEREA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPCVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARREVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPAVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCODVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDLINVIR_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASANT_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowFN15( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_12715( ) ;
      edtavnRcdDeleted_15_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_15_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASCON_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEST_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCodBis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCODBIS_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFacTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFACTIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECTEO_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECREA_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTieTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIETEO_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARUNI_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLOC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarHorIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORINI_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarHorFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTieRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIEREA_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmpcVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPCVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCoVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarReVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPaVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPAVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCODVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdLinVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDLINVIR_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasAnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASANT_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_15");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_15_Internalname ;
         wbErr = true ;
         nRcdDeleted_15 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_15 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARORDLIN_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarOrdLin_Internalname ;
         wbErr = true ;
         A194BarOrdLin = (short)(0) ;
      }
      else
      {
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
      n458FasCon = false ;
      A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
      A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
      n459FasDec = false ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      n602MaqCod = false ;
      A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
      A162BarFecTeo = localUtil.ctod( httpContext.cgiGet( edtBarFecTeo_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARFECREA_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecRea_Internalname ;
         wbErr = true ;
         A160BarFecRea = GXutil.nullDate() ;
      }
      else
      {
         A160BarFecRea = localUtil.ctod( httpContext.cgiGet( edtBarFecRea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "BARTIETEO_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTieTeo_Internalname ;
         wbErr = true ;
         A216BarTieTeo = DecimalUtil.ZERO ;
      }
      else
      {
         A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARUNI_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarUni_Internalname ;
         wbErr = true ;
         A227BarUni = DecimalUtil.ZERO ;
      }
      else
      {
         A227BarUni = localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)) ;
      }
      A179BarLoc = httpContext.cgiGet( edtBarLoc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARHORINI_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarHorIni_Internalname ;
         wbErr = true ;
         A165BarHorIni = (short)(0) ;
      }
      else
      {
         A165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARHORFIN_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarHorFin_Internalname ;
         wbErr = true ;
         A164BarHorFin = (short)(0) ;
      }
      else
      {
         A164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "BARTIEREA_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTieRea_Internalname ;
         wbErr = true ;
         A215BarTieRea = DecimalUtil.ZERO ;
      }
      else
      {
         A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
      }
      A1788EmpcVir = GXutil.upper( httpContext.cgiGet( edtEmpcVir_Internalname)) ;
      A1784BarCoVir = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCoVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1787BarReVir = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarReVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1786BarPaVir = httpContext.cgiGet( edtBarPaVir_Internalname) ;
      A1789ProCodVir = httpContext.cgiGet( edtProCodVir_Internalname) ;
      A655OrdLinVir = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLinVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1785BarFasAnt = httpContext.cgiGet( edtBarFasAnt_Internalname) ;
      n1785BarFasAnt = false ;
      GXCCtl = "Z194BarOrdLin_" + sGXsfl_127_idx ;
      Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z152BarFasCon_" + sGXsfl_127_idx ;
      Z152BarFasCon = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z150BarFacTin_" + sGXsfl_127_idx ;
      Z150BarFacTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z153BarFasEst_" + sGXsfl_127_idx ;
      Z153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z162BarFecTeo_" + sGXsfl_127_idx ;
      Z162BarFecTeo = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z160BarFecRea_" + sGXsfl_127_idx ;
      Z160BarFecRea = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z216BarTieTeo_" + sGXsfl_127_idx ;
      Z216BarTieTeo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z227BarUni_" + sGXsfl_127_idx ;
      Z227BarUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z179BarLoc_" + sGXsfl_127_idx ;
      Z179BarLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z165BarHorIni_" + sGXsfl_127_idx ;
      Z165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z164BarHorFin_" + sGXsfl_127_idx ;
      Z164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z215BarTieRea_" + sGXsfl_127_idx ;
      Z215BarTieRea = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_127_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z603MaqCodBis_" + sGXsfl_127_idx ;
      Z603MaqCodBis = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_15_" + sGXsfl_127_idx ;
      nRcdDeleted_15 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_15_" + sGXsfl_127_idx ;
      nRcdExists_15 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_15_" + sGXsfl_127_idx ;
      nIsMod_15 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N216BarTieTeo_" + sGXsfl_127_idx ;
      N216BarTieTeo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N603MaqCodBis_" + sGXsfl_127_idx ;
      N603MaqCodBis = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N160BarFecRea_" + sGXsfl_127_idx ;
      N160BarFecRea = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "N227BarUni_" + sGXsfl_127_idx ;
      N227BarUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtBarUni_Enabled = edtBarUni_Enabled ;
      defedtBarTieTeo_Enabled = edtBarTieTeo_Enabled ;
      defedtBarFecRea_Enabled = edtBarFecRea_Enabled ;
      defedtBarFecTeo_Enabled = edtBarFecTeo_Enabled ;
      defedtBarFacTin_Enabled = edtBarFacTin_Enabled ;
      defedtMaqCodBis_Enabled = edtMaqCodBis_Enabled ;
      defedtBarFasEst_Enabled = edtBarFasEst_Enabled ;
      defedtBarFasCon_Enabled = edtBarFasCon_Enabled ;
      defedtBarOrdLin_Enabled = edtBarOrdLin_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValuesFN0( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10014( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10014( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z761ProFasLin_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z761ProFasLin_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z761ProFasLin_"+sGXsfl_100_idx) ;
      }
      nGXsfl_127_idx = 0 ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_12715( ) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
         subsflControlProps_12715( ) ;
         httpContext.changePostValue( "Z194BarOrdLin_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z194BarOrdLin_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z152BarFasCon_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z152BarFasCon_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z152BarFasCon_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z150BarFacTin_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z150BarFacTin_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z150BarFacTin_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z153BarFasEst_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z153BarFasEst_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z153BarFasEst_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z162BarFecTeo_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z162BarFecTeo_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z162BarFecTeo_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z160BarFecRea_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z160BarFecRea_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z160BarFecRea_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z216BarTieTeo_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z216BarTieTeo_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z216BarTieTeo_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z227BarUni_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z227BarUni_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z227BarUni_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z179BarLoc_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z179BarLoc_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z179BarLoc_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z165BarHorIni_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z165BarHorIni_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z165BarHorIni_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z164BarHorFin_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z164BarHorFin_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z164BarHorFin_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z215BarTieRea_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z215BarTieRea_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z215BarTieRea_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z603MaqCodBis_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z603MaqCodBis_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z603MaqCodBis_"+sGXsfl_127_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbarfae", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARFAE");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      forbiddenHiddens.add("BarDibCli", GXutil.rtrim( localUtil.format( A1798BarDibCli, "")));
      forbiddenHiddens.add("BarDibInt", localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( A212BarSer, "")));
      forbiddenHiddens.add("BarTipArt", localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbarfae:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1798BarDibCli", GXutil.rtrim( Z1798BarDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1799BarDibInt", GXutil.ltrim( localUtil.ntoc( Z1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z217BarTipArt", GXutil.ltrim( localUtil.ntoc( Z217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.tbarfae", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TBARFAE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS / FASES", "") ;
   }

   public void initializeNonKeyFN12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1798BarDibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
      A1799BarDibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
      A1051DisNumCol = (short)(0) ;
      n1051DisNumCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
      A1031EmpesCod = "" ;
      n1031EmpesCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A217BarTipArt = (short)(0) ;
      n217BarTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z1798BarDibCli = "" ;
      Z1799BarDibInt = 0 ;
      Z212BarSer = "" ;
      Z213BarSit = (byte)(0) ;
      Z120BarAgrEst = "" ;
      Z217BarTipArt = (short)(0) ;
   }

   public void initAllFN12( )
   {
      initializeNonKeyFN12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyFN14( )
   {
      A759ProDsc = "" ;
      A761ProFasLin = (short)(0) ;
      n761ProFasLin = false ;
      A760ProFasEst = (byte)(0) ;
      n760ProFasEst = false ;
      Z761ProFasLin = (short)(0) ;
   }

   public void initAllFN14( )
   {
      A758ProCod = "" ;
      n758ProCod = false ;
      initializeNonKeyFN14( ) ;
   }

   public void standaloneModalInsertFN14( )
   {
   }

   public void initializeNonKeyFN15( )
   {
      A655OrdLinVir = (short)(0) ;
      A457FasCod = "" ;
      A458FasCon = "" ;
      n458FasCon = false ;
      A153BarFasEst = (byte)(0) ;
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      A602MaqCod = "" ;
      n602MaqCod = false ;
      A456FasActTin = "" ;
      n456FasActTin = false ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A165BarHorIni = (short)(0) ;
      A164BarHorFin = (short)(0) ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      Z152BarFasCon = "" ;
      Z150BarFacTin = "" ;
      Z153BarFasEst = (byte)(0) ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z165BarHorIni = (short)(0) ;
      Z164BarHorFin = (short)(0) ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
   }

   public void initAllFN15( )
   {
      A194BarOrdLin = (short)(0) ;
      initializeNonKeyFN15( ) ;
   }

   public void standaloneModalInsertFN15( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241523844", true, true);
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
      httpContext.AddJavascriptSource("tbarfae.js", "?20268241523844", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties14( )
   {
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void init_level_properties15( )
   {
      edtBarUni_Enabled = defedtBarUni_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarTieTeo_Enabled = defedtBarTieTeo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFecRea_Enabled = defedtBarFecRea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFecTeo_Enabled = defedtBarFecTeo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFacTin_Enabled = defedtBarFacTin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtMaqCodBis_Enabled = defedtMaqCodBis_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFasEst_Enabled = defedtBarFasEst_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarFasCon_Enabled = defedtBarFasCon_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtBarOrdLin_Enabled = defedtBarOrdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void startgridcontrol100( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock18_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock19_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A761ProFasLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock20_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol127( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_15, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_15_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A152BarFasCon));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFacTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A162BarFecTeo, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A160BarFecRea, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A179BarLoc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1788EmpcVir));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpcVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1784BarCoVir, (byte)(8), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCoVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1787BarReVir, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1786BarPaVir));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPaVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1789ProCodVir));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A655OrdLinVir, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdLinVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1785BarFasAnt));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasAnt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarDibCli_Internalname = "BARDIBCLI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarDibInt_Internalname = "BARDIBINT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDisNumCol_Internalname = "DISNUMCOL" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEmpesCod_Internalname = "EMPESCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtMaxOrdFas_Internalname = "MAXORDFAS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtProFasLin_Internalname = "PROFASLIN" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtProFasEst_Internalname = "PROFASEST" ;
      edtavnRcdDeleted_15_Internalname = "vNRCDDELETED_15" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasCon_Internalname = "FASCON" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      edtBarFecTeo_Internalname = "BARFECTEO" ;
      edtBarFecRea_Internalname = "BARFECREA" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      edtBarUni_Internalname = "BARUNI" ;
      edtBarLoc_Internalname = "BARLOC" ;
      edtBarHorIni_Internalname = "BARHORINI" ;
      edtBarHorFin_Internalname = "BARHORFIN" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      edtEmpcVir_Internalname = "EMPCVIR" ;
      edtBarCoVir_Internalname = "BARCOVIR" ;
      edtBarReVir_Internalname = "BARREVIR" ;
      edtBarPaVir_Internalname = "BARPAVIR" ;
      edtProCodVir_Internalname = "PROCODVIR" ;
      edtOrdLinVir_Internalname = "ORDLINVIR" ;
      edtBarFasAnt_Internalname = "BARFASANT" ;
      tblTable3_Internalname = "TABLE3" ;
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
      lblTextblock20_Caption = httpContext.getMessage( "Indica si fase con estado&lt;&gt;0", "") ;
      lblTextblock19_Caption = httpContext.getMessage( "Ultima Linea Fases", "") ;
      lblTextblock18_Caption = httpContext.getMessage( "Descripcion Proceso", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "Codigo Proceso", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROCESOS / FASES", "") );
      edtBarFasAnt_Jsonclick = "" ;
      edtOrdLinVir_Jsonclick = "" ;
      edtProCodVir_Jsonclick = "" ;
      edtBarPaVir_Jsonclick = "" ;
      edtBarReVir_Jsonclick = "" ;
      edtBarCoVir_Jsonclick = "" ;
      edtEmpcVir_Jsonclick = "" ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarHorFin_Jsonclick = "" ;
      edtBarHorIni_Jsonclick = "" ;
      edtBarLoc_Jsonclick = "" ;
      edtBarUni_Jsonclick = "" ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarFecRea_Jsonclick = "" ;
      edtBarFecTeo_Jsonclick = "" ;
      edtBarFacTin_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasCon_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtavnRcdDeleted_15_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtProFasEst_Jsonclick = "" ;
      edtProFasLin_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtBarFasAnt_Enabled = 0 ;
      edtOrdLinVir_Enabled = 0 ;
      edtProCodVir_Enabled = 0 ;
      edtBarPaVir_Enabled = 0 ;
      edtBarReVir_Enabled = 0 ;
      edtBarCoVir_Enabled = 0 ;
      edtEmpcVir_Enabled = 0 ;
      edtBarTieRea_Enabled = 1 ;
      edtBarHorFin_Enabled = 1 ;
      edtBarHorIni_Enabled = 1 ;
      edtBarLoc_Enabled = 1 ;
      edtBarUni_Enabled = 1 ;
      edtBarTieTeo_Enabled = 1 ;
      edtBarFecRea_Enabled = 1 ;
      edtBarFecTeo_Enabled = 0 ;
      edtBarFacTin_Enabled = 0 ;
      edtFasActTin_Enabled = 0 ;
      edtMaqCodBis_Enabled = 1 ;
      edtMaqCod_Enabled = 0 ;
      edtFasDec_Enabled = 0 ;
      edtBarFasEst_Enabled = 0 ;
      edtBarFasCon_Enabled = 0 ;
      edtFasCon_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtBarOrdLin_Enabled = 1 ;
      edtavnRcdDeleted_15_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProFasEst_Enabled = 0 ;
      edtProFasLin_Enabled = 1 ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 1 ;
      edtMaxOrdFas_Jsonclick = "" ;
      edtMaxOrdFas_Backcolor = (int)(0xFFFFFF) ;
      edtMaxOrdFas_Enabled = 0 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipArt_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtEmpesCod_Jsonclick = "" ;
      edtEmpesCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmpesCod_Enabled = 0 ;
      edtDisNumCol_Jsonclick = "" ;
      edtDisNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumCol_Enabled = 0 ;
      edtBarDibInt_Jsonclick = "" ;
      edtBarDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtBarDibInt_Enabled = 0 ;
      edtBarDibCli_Jsonclick = "" ;
      edtBarDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarDibCli_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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

   public void xc_14_FN14( )
   {
      if ( true /* After */ && isDlt( )  && true /* Level */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A758ProCod ;
         GXv_char2[0] = httpContext.getMessage( "DEL", "") ;
         new app.prenfas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A129BarCod = GXv_int5[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A758ProCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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

   public void xc_15_FN14( String A396EmprCod ,
                           int A129BarCod ,
                           byte A132BarCodReo ,
                           String A130BarCodPar ,
                           String A758ProCod ,
                           short A761ProFasLin )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A758ProCod ;
         new app.pnuefas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char7[0] ;
         A129BarCod = GXv_int5[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A758ProCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_33_FN15( String A396EmprCod ,
                           int A129BarCod ,
                           byte A132BarCodReo ,
                           String A130BarCodPar ,
                           String A758ProCod ,
                           short A194BarOrdLin )
   {
      if ( true /* After */ && (0==A194BarOrdLin) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A758ProCod ;
         GXv_int8[0] = A194BarOrdLin ;
         new app.pnumfas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3, GXv_int8) ;
         A396EmprCod = GXv_char7[0] ;
         A129BarCod = GXv_int5[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A758ProCod = GXv_char3[0] ;
         A194BarOrdLin = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_40_FN15( )
   {
      if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A758ProCod ;
         GXv_char2[0] = httpContext.getMessage( "INS", "") ;
         new app.prenfas(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A129BarCod = GXv_int5[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A758ProCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
      subsflControlProps_10014( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalFN14( ) ;
         standaloneModalFN14( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowFN14( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10014( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_12715( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalFN14( ) ;
         standaloneModalFN14( ) ;
         standaloneNotModalFN15( ) ;
         standaloneModalFN15( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowFN15( ) ;
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
         subsflControlProps_12715( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T00FN81 */
      pr_default.execute(68, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00FN81_A407EmprNom[0] ;
      n407EmprNom = T00FN81_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(68);
      /* Using cursor T00FN47 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(36) != 101) )
      {
         A628MaxOrdFas = T00FN47_A628MaxOrdFas[0] ;
         n628MaxOrdFas = T00FN47_n628MaxOrdFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      else
      {
         A628MaxOrdFas = (short)(0) ;
         n628MaxOrdFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A628MaxOrdFas), 4, 0));
      }
      pr_default.close(36);
      GX_FocusControl = edtBarSit_Internalname ;
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

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      n217BarTipArt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", GXutil.rtrim( A1798BarDibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrim( localUtil.ntoc( A1051DisNumCol, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", GXutil.rtrim( A1031EmpesCod));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A628MaxOrdFas", GXutil.ltrim( localUtil.ntoc( A628MaxOrdFas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1798BarDibCli", GXutil.rtrim( Z1798BarDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1799BarDibInt", GXutil.ltrim( localUtil.ntoc( Z1799BarDibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1051DisNumCol", GXutil.ltrim( localUtil.ntoc( Z1051DisNumCol, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1031EmpesCod", GXutil.rtrim( Z1031EmpesCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z217BarTipArt", GXutil.ltrim( localUtil.ntoc( Z217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z628MaxOrdFas", GXutil.ltrim( localUtil.ntoc( Z628MaxOrdFas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Procod( )
   {
      n758ProCod = false ;
      n760ProFasEst = false ;
      /* Using cursor T00FN41 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00FN41_A759ProDsc[0] ;
      pr_default.close(32);
      /* Using cursor T00FN43 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A760ProFasEst = T00FN43_A760ProFasEst[0] ;
         n760ProFasEst = T00FN43_n760ProFasEst[0] ;
      }
      else
      {
         A760ProFasEst = (byte)(0) ;
         n760ProFasEst = false ;
      }
      pr_default.close(33);
      if ( true /* Level */ && ( A760ProFasEst != 0 ) && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se permite borrar el Proceso", ""), 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta Agrupada", ""), 0, "PROCOD");
      }
      if ( ( A213BarSit > 8 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta cerrada", ""), 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      if ( ( A213BarSit == 4 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta con receta", ""), 0, "PROCOD");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A760ProFasEst", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Fascod( )
   {
      n458FasCon = false ;
      n602MaqCod = false ;
      n456FasActTin = false ;
      n459FasDec = false ;
      /* Using cursor T00FN58 */
      pr_default.execute(45, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A458FasCon = T00FN58_A458FasCon[0] ;
      n458FasCon = T00FN58_n458FasCon[0] ;
      A459FasDec = T00FN58_A459FasDec[0] ;
      n459FasDec = T00FN58_n459FasDec[0] ;
      A602MaqCod = T00FN58_A602MaqCod[0] ;
      n602MaqCod = T00FN58_n602MaqCod[0] ;
      A456FasActTin = T00FN58_A456FasActTin[0] ;
      n456FasActTin = T00FN58_n456FasActTin[0] ;
      pr_default.close(45);
      if ( isIns( )  && (GXutil.strcmp("", A152BarFasCon)==0) && ( Gx_BScreen == 0 ) )
      {
         A152BarFasCon = A458FasCon ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A603MaqCodBis)==0) && ( Gx_BScreen == 0 ) )
      {
         A603MaqCodBis = A602MaqCod ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A150BarFacTin)==0) && ( Gx_BScreen == 0 ) )
      {
         A150BarFacTin = A456FasActTin ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", GXutil.rtrim( A152BarFasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", GXutil.rtrim( A603MaqCodBis));
      httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", GXutil.rtrim( A150BarFacTin));
   }

   public void valid_Maqcodbis( )
   {
      /* Using cursor T00FN82 */
      pr_default.execute(69, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
      }
      pr_default.close(69);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'A1051DisNumCol',fld:'DISNUMCOL',pic:'ZZZ9'},{av:'A1031EmpesCod',fld:'EMPESCOD',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A628MaxOrdFas',fld:'MAXORDFAS',pic:'ZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z1798BarDibCli'},{av:'Z1799BarDibInt'},{av:'Z1051DisNumCol'},{av:'Z1031EmpesCod'},{av:'Z212BarSer'},{av:'Z217BarTipArt'},{av:'Z628MaxOrdFas'},{av:'Z213BarSit'},{av:'Z120BarAgrEst'},{av:'Z407EmprNom'},{av:'Z365DisDes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'}]}");
      setEventMetadata("VALID_PROFASEST","{handler:'valid_Profasest',iparms:[]");
      setEventMetadata("VALID_PROFASEST",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'}]}");
      setEventMetadata("VALID_FASCON","{handler:'valid_Fascon',iparms:[]");
      setEventMetadata("VALID_FASCON",",oparms:[]}");
      setEventMetadata("VALID_BARFASEST","{handler:'valid_Barfasest',iparms:[]");
      setEventMetadata("VALID_BARFASEST",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''}]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[]}");
      setEventMetadata("VALID_FASACTTIN","{handler:'valid_Fasacttin',iparms:[]");
      setEventMetadata("VALID_FASACTTIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfasant',iparms:[]");
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
      pr_default.close(45);
      pr_default.close(69);
      pr_default.close(32);
      pr_default.close(33);
      pr_default.close(68);
      pr_default.close(36);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z1798BarDibCli = "" ;
      Z212BarSer = "" ;
      Z120BarAgrEst = "" ;
      Z758ProCod = "" ;
      Z152BarFasCon = "" ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      N216BarTieTeo = DecimalUtil.ZERO ;
      N603MaqCodBis = "" ;
      N160BarFecRea = GXutil.nullDate() ;
      N227BarUni = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1798BarDibCli = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1031EmpesCod = "" ;
      lblTextblock11_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A120BarAgrEst = "" ;
      lblTextblock16_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode14 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      GXCCtl = "" ;
      A458FasCon = "" ;
      A152BarFasCon = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A150BarFacTin = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A1788EmpcVir = "" ;
      A1786BarPaVir = "" ;
      A1789ProCodVir = "" ;
      A1785BarFasAnt = "" ;
      T00FN10_A628MaxOrdFas = new short[1] ;
      T00FN10_n628MaxOrdFas = new boolean[] {false} ;
      T00FN12_A760ProFasEst = new byte[1] ;
      T00FN12_n760ProFasEst = new boolean[] {false} ;
      A759ProDsc = "" ;
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      AV21Lit5 = "" ;
      AV22Lit6 = "" ;
      AV23Lit7 = "" ;
      AV24Lit8 = "" ;
      AV25Lit9 = "" ;
      AV26Lit10 = "" ;
      AV27Lit11 = "" ;
      AV28Lit12 = "" ;
      AV29Lit13 = "" ;
      AV30Lit14 = "" ;
      AV31Lit15 = "" ;
      AV32Lit16 = "" ;
      AV33Lit17 = "" ;
      AV34Lit18 = "" ;
      AV37Lit19 = "" ;
      AV36LitFe = "" ;
      GXt_char1 = "" ;
      AV38Station = "" ;
      AV39EmprNom = "" ;
      AV35UsurCod = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z1031EmpesCod = "" ;
      Z279CliNom = "" ;
      T00FN18_A407EmprNom = new String[] {""} ;
      T00FN18_n407EmprNom = new boolean[] {false} ;
      T00FN19_A252CliCod = new int[1] ;
      T00FN19_n252CliCod = new boolean[] {false} ;
      T00FN19_A1051DisNumCol = new short[1] ;
      T00FN19_n1051DisNumCol = new boolean[] {false} ;
      T00FN19_A1031EmpesCod = new String[] {""} ;
      T00FN19_n1031EmpesCod = new boolean[] {false} ;
      T00FN19_A365DisDes = new String[] {""} ;
      T00FN21_A279CliNom = new String[] {""} ;
      T00FN20_A396EmprCod = new String[] {""} ;
      T00FN23_A361DisCod = new int[1] ;
      T00FN23_A2759BarMaqGru = new String[] {""} ;
      T00FN23_A129BarCod = new int[1] ;
      T00FN23_A132BarCodReo = new byte[1] ;
      T00FN23_A130BarCodPar = new String[] {""} ;
      T00FN23_A180BarMaqCod = new String[] {""} ;
      T00FN23_A252CliCod = new int[1] ;
      T00FN23_n252CliCod = new boolean[] {false} ;
      T00FN23_A279CliNom = new String[] {""} ;
      T00FN23_A1798BarDibCli = new String[] {""} ;
      T00FN23_A1799BarDibInt = new int[1] ;
      T00FN23_A1051DisNumCol = new short[1] ;
      T00FN23_n1051DisNumCol = new boolean[] {false} ;
      T00FN23_A1031EmpesCod = new String[] {""} ;
      T00FN23_n1031EmpesCod = new boolean[] {false} ;
      T00FN23_A212BarSer = new String[] {""} ;
      T00FN23_A213BarSit = new byte[1] ;
      T00FN23_A120BarAgrEst = new String[] {""} ;
      T00FN23_A407EmprNom = new String[] {""} ;
      T00FN23_n407EmprNom = new boolean[] {false} ;
      T00FN23_A365DisDes = new String[] {""} ;
      T00FN23_A396EmprCod = new String[] {""} ;
      T00FN23_A217BarTipArt = new short[1] ;
      T00FN23_n217BarTipArt = new boolean[] {false} ;
      T00FN23_A628MaxOrdFas = new short[1] ;
      T00FN23_n628MaxOrdFas = new boolean[] {false} ;
      T00FN24_A396EmprCod = new String[] {""} ;
      T00FN24_A129BarCod = new int[1] ;
      T00FN24_A132BarCodReo = new byte[1] ;
      T00FN24_A130BarCodPar = new String[] {""} ;
      T00FN17_A361DisCod = new int[1] ;
      T00FN17_A2759BarMaqGru = new String[] {""} ;
      T00FN17_A129BarCod = new int[1] ;
      T00FN17_A132BarCodReo = new byte[1] ;
      T00FN17_A130BarCodPar = new String[] {""} ;
      T00FN17_A180BarMaqCod = new String[] {""} ;
      T00FN17_A1798BarDibCli = new String[] {""} ;
      T00FN17_A1799BarDibInt = new int[1] ;
      T00FN17_A212BarSer = new String[] {""} ;
      T00FN17_A213BarSit = new byte[1] ;
      T00FN17_A120BarAgrEst = new String[] {""} ;
      T00FN17_A396EmprCod = new String[] {""} ;
      T00FN17_A217BarTipArt = new short[1] ;
      T00FN17_n217BarTipArt = new boolean[] {false} ;
      T00FN17_A252CliCod = new int[1] ;
      T00FN17_n252CliCod = new boolean[] {false} ;
      T00FN17_A365DisDes = new String[] {""} ;
      T00FN25_A396EmprCod = new String[] {""} ;
      T00FN25_A129BarCod = new int[1] ;
      T00FN25_A132BarCodReo = new byte[1] ;
      T00FN25_A130BarCodPar = new String[] {""} ;
      T00FN26_A396EmprCod = new String[] {""} ;
      T00FN26_A129BarCod = new int[1] ;
      T00FN26_A132BarCodReo = new byte[1] ;
      T00FN26_A130BarCodPar = new String[] {""} ;
      T00FN16_A361DisCod = new int[1] ;
      T00FN16_A2759BarMaqGru = new String[] {""} ;
      T00FN16_A129BarCod = new int[1] ;
      T00FN16_A132BarCodReo = new byte[1] ;
      T00FN16_A130BarCodPar = new String[] {""} ;
      T00FN16_A180BarMaqCod = new String[] {""} ;
      T00FN16_A1798BarDibCli = new String[] {""} ;
      T00FN16_A1799BarDibInt = new int[1] ;
      T00FN16_A212BarSer = new String[] {""} ;
      T00FN16_A213BarSit = new byte[1] ;
      T00FN16_A120BarAgrEst = new String[] {""} ;
      T00FN16_A396EmprCod = new String[] {""} ;
      T00FN16_A217BarTipArt = new short[1] ;
      T00FN16_n217BarTipArt = new boolean[] {false} ;
      T00FN16_A252CliCod = new int[1] ;
      T00FN16_n252CliCod = new boolean[] {false} ;
      T00FN16_A365DisDes = new String[] {""} ;
      T00FN31_A396EmprCod = new String[] {""} ;
      T00FN31_A129BarCod = new int[1] ;
      T00FN31_A132BarCodReo = new byte[1] ;
      T00FN31_A130BarCodPar = new String[] {""} ;
      Z759ProDsc = "" ;
      T00FN33_A129BarCod = new int[1] ;
      T00FN33_A132BarCodReo = new byte[1] ;
      T00FN33_A130BarCodPar = new String[] {""} ;
      T00FN33_A759ProDsc = new String[] {""} ;
      T00FN33_A761ProFasLin = new short[1] ;
      T00FN33_n761ProFasLin = new boolean[] {false} ;
      T00FN33_A396EmprCod = new String[] {""} ;
      T00FN33_A758ProCod = new String[] {""} ;
      T00FN33_n758ProCod = new boolean[] {false} ;
      T00FN33_A760ProFasEst = new byte[1] ;
      T00FN33_n760ProFasEst = new boolean[] {false} ;
      T00FN15_A759ProDsc = new String[] {""} ;
      T00FN34_A759ProDsc = new String[] {""} ;
      T00FN36_A760ProFasEst = new byte[1] ;
      T00FN36_n760ProFasEst = new boolean[] {false} ;
      T00FN37_A396EmprCod = new String[] {""} ;
      T00FN37_A129BarCod = new int[1] ;
      T00FN37_A132BarCodReo = new byte[1] ;
      T00FN37_A130BarCodPar = new String[] {""} ;
      T00FN37_A758ProCod = new String[] {""} ;
      T00FN37_n758ProCod = new boolean[] {false} ;
      T00FN14_A129BarCod = new int[1] ;
      T00FN14_A132BarCodReo = new byte[1] ;
      T00FN14_A130BarCodPar = new String[] {""} ;
      T00FN14_A761ProFasLin = new short[1] ;
      T00FN14_n761ProFasLin = new boolean[] {false} ;
      T00FN14_A396EmprCod = new String[] {""} ;
      T00FN14_A758ProCod = new String[] {""} ;
      T00FN14_n758ProCod = new boolean[] {false} ;
      T00FN13_A129BarCod = new int[1] ;
      T00FN13_A132BarCodReo = new byte[1] ;
      T00FN13_A130BarCodPar = new String[] {""} ;
      T00FN13_A761ProFasLin = new short[1] ;
      T00FN13_n761ProFasLin = new boolean[] {false} ;
      T00FN13_A396EmprCod = new String[] {""} ;
      T00FN13_A758ProCod = new String[] {""} ;
      T00FN13_n758ProCod = new boolean[] {false} ;
      T00FN41_A759ProDsc = new String[] {""} ;
      T00FN43_A760ProFasEst = new byte[1] ;
      T00FN43_n760ProFasEst = new boolean[] {false} ;
      T00FN44_A396EmprCod = new String[] {""} ;
      T00FN44_A30AlbProCod = new long[1] ;
      T00FN44_A129BarCod = new int[1] ;
      T00FN44_A132BarCodReo = new byte[1] ;
      T00FN44_A130BarCodPar = new String[] {""} ;
      T00FN44_A1468AlbPrdLin = new short[1] ;
      T00FN45_A396EmprCod = new String[] {""} ;
      T00FN45_A129BarCod = new int[1] ;
      T00FN45_A132BarCodReo = new byte[1] ;
      T00FN45_A130BarCodPar = new String[] {""} ;
      T00FN45_A758ProCod = new String[] {""} ;
      T00FN45_n758ProCod = new boolean[] {false} ;
      T00FN45_A194BarOrdLin = new short[1] ;
      T00FN45_A1664ParFasCod = new short[1] ;
      T00FN47_A628MaxOrdFas = new short[1] ;
      T00FN47_n628MaxOrdFas = new boolean[] {false} ;
      T00FN48_A396EmprCod = new String[] {""} ;
      T00FN48_A129BarCod = new int[1] ;
      T00FN48_A132BarCodReo = new byte[1] ;
      T00FN48_A130BarCodPar = new String[] {""} ;
      T00FN48_A758ProCod = new String[] {""} ;
      T00FN48_n758ProCod = new boolean[] {false} ;
      Z1785BarFasAnt = "" ;
      Z458FasCon = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      Z456FasActTin = "" ;
      T00FN6_A1785BarFasAnt = new String[] {""} ;
      T00FN6_n1785BarFasAnt = new boolean[] {false} ;
      T00FN51_A129BarCod = new int[1] ;
      T00FN51_A132BarCodReo = new byte[1] ;
      T00FN51_A130BarCodPar = new String[] {""} ;
      T00FN51_A758ProCod = new String[] {""} ;
      T00FN51_n758ProCod = new boolean[] {false} ;
      T00FN51_A194BarOrdLin = new short[1] ;
      T00FN51_A152BarFasCon = new String[] {""} ;
      T00FN51_A150BarFacTin = new String[] {""} ;
      T00FN51_A458FasCon = new String[] {""} ;
      T00FN51_n458FasCon = new boolean[] {false} ;
      T00FN51_A153BarFasEst = new byte[1] ;
      T00FN51_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN51_n459FasDec = new boolean[] {false} ;
      T00FN51_A602MaqCod = new String[] {""} ;
      T00FN51_n602MaqCod = new boolean[] {false} ;
      T00FN51_A456FasActTin = new String[] {""} ;
      T00FN51_n456FasActTin = new boolean[] {false} ;
      T00FN51_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T00FN51_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00FN51_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN51_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN51_A179BarLoc = new String[] {""} ;
      T00FN51_A165BarHorIni = new short[1] ;
      T00FN51_A164BarHorFin = new short[1] ;
      T00FN51_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN51_A396EmprCod = new String[] {""} ;
      T00FN51_A457FasCod = new String[] {""} ;
      T00FN51_A603MaqCodBis = new String[] {""} ;
      T00FN51_A1785BarFasAnt = new String[] {""} ;
      T00FN51_n1785BarFasAnt = new boolean[] {false} ;
      T00FN7_A458FasCon = new String[] {""} ;
      T00FN7_n458FasCon = new boolean[] {false} ;
      T00FN7_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN7_n459FasDec = new boolean[] {false} ;
      T00FN7_A602MaqCod = new String[] {""} ;
      T00FN7_n602MaqCod = new boolean[] {false} ;
      T00FN7_A456FasActTin = new String[] {""} ;
      T00FN7_n456FasActTin = new boolean[] {false} ;
      T00FN8_A396EmprCod = new String[] {""} ;
      T00FN52_A458FasCon = new String[] {""} ;
      T00FN52_n458FasCon = new boolean[] {false} ;
      T00FN52_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN52_n459FasDec = new boolean[] {false} ;
      T00FN52_A602MaqCod = new String[] {""} ;
      T00FN52_n602MaqCod = new boolean[] {false} ;
      T00FN52_A456FasActTin = new String[] {""} ;
      T00FN52_n456FasActTin = new boolean[] {false} ;
      T00FN53_A396EmprCod = new String[] {""} ;
      T00FN54_A396EmprCod = new String[] {""} ;
      T00FN54_A129BarCod = new int[1] ;
      T00FN54_A132BarCodReo = new byte[1] ;
      T00FN54_A130BarCodPar = new String[] {""} ;
      T00FN54_A758ProCod = new String[] {""} ;
      T00FN54_n758ProCod = new boolean[] {false} ;
      T00FN54_A194BarOrdLin = new short[1] ;
      T00FN3_A129BarCod = new int[1] ;
      T00FN3_A132BarCodReo = new byte[1] ;
      T00FN3_A130BarCodPar = new String[] {""} ;
      T00FN3_A758ProCod = new String[] {""} ;
      T00FN3_n758ProCod = new boolean[] {false} ;
      T00FN3_A194BarOrdLin = new short[1] ;
      T00FN3_A152BarFasCon = new String[] {""} ;
      T00FN3_A150BarFacTin = new String[] {""} ;
      T00FN3_A153BarFasEst = new byte[1] ;
      T00FN3_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T00FN3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00FN3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN3_A179BarLoc = new String[] {""} ;
      T00FN3_A165BarHorIni = new short[1] ;
      T00FN3_A164BarHorFin = new short[1] ;
      T00FN3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN3_A396EmprCod = new String[] {""} ;
      T00FN3_A457FasCod = new String[] {""} ;
      T00FN3_A603MaqCodBis = new String[] {""} ;
      sMode15 = "" ;
      T00FN2_A129BarCod = new int[1] ;
      T00FN2_A132BarCodReo = new byte[1] ;
      T00FN2_A130BarCodPar = new String[] {""} ;
      T00FN2_A758ProCod = new String[] {""} ;
      T00FN2_n758ProCod = new boolean[] {false} ;
      T00FN2_A194BarOrdLin = new short[1] ;
      T00FN2_A152BarFasCon = new String[] {""} ;
      T00FN2_A150BarFacTin = new String[] {""} ;
      T00FN2_A153BarFasEst = new byte[1] ;
      T00FN2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T00FN2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00FN2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN2_A179BarLoc = new String[] {""} ;
      T00FN2_A165BarHorIni = new short[1] ;
      T00FN2_A164BarHorFin = new short[1] ;
      T00FN2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN2_A396EmprCod = new String[] {""} ;
      T00FN2_A457FasCod = new String[] {""} ;
      T00FN2_A603MaqCodBis = new String[] {""} ;
      T00FN58_A458FasCon = new String[] {""} ;
      T00FN58_n458FasCon = new boolean[] {false} ;
      T00FN58_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FN58_n459FasDec = new boolean[] {false} ;
      T00FN58_A602MaqCod = new String[] {""} ;
      T00FN58_n602MaqCod = new boolean[] {false} ;
      T00FN58_A456FasActTin = new String[] {""} ;
      T00FN58_n456FasActTin = new boolean[] {false} ;
      T00FN59_A396EmprCod = new String[] {""} ;
      T00FN59_A129BarCod = new int[1] ;
      T00FN59_A132BarCodReo = new byte[1] ;
      T00FN59_A130BarCodPar = new String[] {""} ;
      T00FN59_A758ProCod = new String[] {""} ;
      T00FN59_n758ProCod = new boolean[] {false} ;
      T00FN59_A194BarOrdLin = new short[1] ;
      T00FN59_A12517SolAfLn = new short[1] ;
      T00FN60_A396EmprCod = new String[] {""} ;
      T00FN60_A129BarCod = new int[1] ;
      T00FN60_A132BarCodReo = new byte[1] ;
      T00FN60_A130BarCodPar = new String[] {""} ;
      T00FN60_A758ProCod = new String[] {""} ;
      T00FN60_n758ProCod = new boolean[] {false} ;
      T00FN60_A194BarOrdLin = new short[1] ;
      T00FN60_A12516SolLzLn = new short[1] ;
      T00FN61_A396EmprCod = new String[] {""} ;
      T00FN61_A129BarCod = new int[1] ;
      T00FN61_A132BarCodReo = new byte[1] ;
      T00FN61_A130BarCodPar = new String[] {""} ;
      T00FN61_A758ProCod = new String[] {""} ;
      T00FN61_n758ProCod = new boolean[] {false} ;
      T00FN61_A194BarOrdLin = new short[1] ;
      T00FN61_A12515SolPlLn = new short[1] ;
      T00FN62_A396EmprCod = new String[] {""} ;
      T00FN62_A129BarCod = new int[1] ;
      T00FN62_A132BarCodReo = new byte[1] ;
      T00FN62_A130BarCodPar = new String[] {""} ;
      T00FN62_A758ProCod = new String[] {""} ;
      T00FN62_n758ProCod = new boolean[] {false} ;
      T00FN62_A194BarOrdLin = new short[1] ;
      T00FN62_A12514SolSAlLn = new short[1] ;
      T00FN63_A396EmprCod = new String[] {""} ;
      T00FN63_A129BarCod = new int[1] ;
      T00FN63_A132BarCodReo = new byte[1] ;
      T00FN63_A130BarCodPar = new String[] {""} ;
      T00FN63_A758ProCod = new String[] {""} ;
      T00FN63_n758ProCod = new boolean[] {false} ;
      T00FN63_A194BarOrdLin = new short[1] ;
      T00FN63_A12513SolSAcLn = new short[1] ;
      T00FN64_A396EmprCod = new String[] {""} ;
      T00FN64_A129BarCod = new int[1] ;
      T00FN64_A132BarCodReo = new byte[1] ;
      T00FN64_A130BarCodPar = new String[] {""} ;
      T00FN64_A758ProCod = new String[] {""} ;
      T00FN64_n758ProCod = new boolean[] {false} ;
      T00FN64_A194BarOrdLin = new short[1] ;
      T00FN64_A12512SolFrLn = new short[1] ;
      T00FN65_A396EmprCod = new String[] {""} ;
      T00FN65_A129BarCod = new int[1] ;
      T00FN65_A132BarCodReo = new byte[1] ;
      T00FN65_A130BarCodPar = new String[] {""} ;
      T00FN65_A758ProCod = new String[] {""} ;
      T00FN65_n758ProCod = new boolean[] {false} ;
      T00FN65_A194BarOrdLin = new short[1] ;
      T00FN65_A12511SolAgLn = new short[1] ;
      T00FN66_A396EmprCod = new String[] {""} ;
      T00FN66_A129BarCod = new int[1] ;
      T00FN66_A132BarCodReo = new byte[1] ;
      T00FN66_A130BarCodPar = new String[] {""} ;
      T00FN66_A758ProCod = new String[] {""} ;
      T00FN66_n758ProCod = new boolean[] {false} ;
      T00FN66_A194BarOrdLin = new short[1] ;
      T00FN66_A12510SolLvLn = new short[1] ;
      T00FN67_A396EmprCod = new String[] {""} ;
      T00FN67_A129BarCod = new int[1] ;
      T00FN67_A132BarCodReo = new byte[1] ;
      T00FN67_A130BarCodPar = new String[] {""} ;
      T00FN67_A758ProCod = new String[] {""} ;
      T00FN67_n758ProCod = new boolean[] {false} ;
      T00FN67_A194BarOrdLin = new short[1] ;
      T00FN67_A10781BarFasNb = new int[1] ;
      T00FN68_A396EmprCod = new String[] {""} ;
      T00FN68_A129BarCod = new int[1] ;
      T00FN68_A132BarCodReo = new byte[1] ;
      T00FN68_A130BarCodPar = new String[] {""} ;
      T00FN68_A758ProCod = new String[] {""} ;
      T00FN68_n758ProCod = new boolean[] {false} ;
      T00FN68_A194BarOrdLin = new short[1] ;
      T00FN68_A719PrdNum = new String[] {""} ;
      T00FN69_A396EmprCod = new String[] {""} ;
      T00FN69_A129BarCod = new int[1] ;
      T00FN69_A132BarCodReo = new byte[1] ;
      T00FN69_A130BarCodPar = new String[] {""} ;
      T00FN69_A758ProCod = new String[] {""} ;
      T00FN69_n758ProCod = new boolean[] {false} ;
      T00FN69_A194BarOrdLin = new short[1] ;
      T00FN69_A9966Em_cod = new String[] {""} ;
      T00FN70_A396EmprCod = new String[] {""} ;
      T00FN70_A129BarCod = new int[1] ;
      T00FN70_A132BarCodReo = new byte[1] ;
      T00FN70_A130BarCodPar = new String[] {""} ;
      T00FN70_A758ProCod = new String[] {""} ;
      T00FN70_n758ProCod = new boolean[] {false} ;
      T00FN70_A194BarOrdLin = new short[1] ;
      T00FN70_A9940Ab_cod = new String[] {""} ;
      T00FN71_A396EmprCod = new String[] {""} ;
      T00FN71_A129BarCod = new int[1] ;
      T00FN71_A132BarCodReo = new byte[1] ;
      T00FN71_A130BarCodPar = new String[] {""} ;
      T00FN71_A758ProCod = new String[] {""} ;
      T00FN71_n758ProCod = new boolean[] {false} ;
      T00FN71_A194BarOrdLin = new short[1] ;
      T00FN71_A9911Ca_cod = new String[] {""} ;
      T00FN72_A396EmprCod = new String[] {""} ;
      T00FN72_A129BarCod = new int[1] ;
      T00FN72_A132BarCodReo = new byte[1] ;
      T00FN72_A130BarCodPar = new String[] {""} ;
      T00FN72_A758ProCod = new String[] {""} ;
      T00FN72_n758ProCod = new boolean[] {false} ;
      T00FN72_A194BarOrdLin = new short[1] ;
      T00FN72_A9878Pe_cod = new String[] {""} ;
      T00FN73_A396EmprCod = new String[] {""} ;
      T00FN73_A129BarCod = new int[1] ;
      T00FN73_A132BarCodReo = new byte[1] ;
      T00FN73_A130BarCodPar = new String[] {""} ;
      T00FN73_A758ProCod = new String[] {""} ;
      T00FN73_n758ProCod = new boolean[] {false} ;
      T00FN73_A194BarOrdLin = new short[1] ;
      T00FN73_A9870Rm_cod = new String[] {""} ;
      T00FN74_A396EmprCod = new String[] {""} ;
      T00FN74_A129BarCod = new int[1] ;
      T00FN74_A132BarCodReo = new byte[1] ;
      T00FN74_A130BarCodPar = new String[] {""} ;
      T00FN74_A758ProCod = new String[] {""} ;
      T00FN74_n758ProCod = new boolean[] {false} ;
      T00FN74_A194BarOrdLin = new short[1] ;
      T00FN74_A7934Dtb_Ordl = new short[1] ;
      T00FN75_A396EmprCod = new String[] {""} ;
      T00FN75_A129BarCod = new int[1] ;
      T00FN75_A132BarCodReo = new byte[1] ;
      T00FN75_A130BarCodPar = new String[] {""} ;
      T00FN75_A758ProCod = new String[] {""} ;
      T00FN75_n758ProCod = new boolean[] {false} ;
      T00FN75_A194BarOrdLin = new short[1] ;
      T00FN75_A5371FasQuiLin = new short[1] ;
      T00FN76_A396EmprCod = new String[] {""} ;
      T00FN76_A129BarCod = new int[1] ;
      T00FN76_A132BarCodReo = new byte[1] ;
      T00FN76_A130BarCodPar = new String[] {""} ;
      T00FN76_A758ProCod = new String[] {""} ;
      T00FN76_n758ProCod = new boolean[] {false} ;
      T00FN76_A194BarOrdLin = new short[1] ;
      T00FN76_A4940A_Barcod = new int[1] ;
      T00FN76_A4941A_BarReo = new byte[1] ;
      T00FN76_A4942A_BarPar = new String[] {""} ;
      T00FN76_A4943A_ProCod = new String[] {""} ;
      T00FN76_A4944A_BarOrd = new short[1] ;
      T00FN77_A396EmprCod = new String[] {""} ;
      T00FN77_A129BarCod = new int[1] ;
      T00FN77_A132BarCodReo = new byte[1] ;
      T00FN77_A130BarCodPar = new String[] {""} ;
      T00FN77_A758ProCod = new String[] {""} ;
      T00FN77_n758ProCod = new boolean[] {false} ;
      T00FN77_A194BarOrdLin = new short[1] ;
      T00FN77_A4643BarFasLot = new int[1] ;
      T00FN78_A396EmprCod = new String[] {""} ;
      T00FN78_A129BarCod = new int[1] ;
      T00FN78_A132BarCodReo = new byte[1] ;
      T00FN78_A130BarCodPar = new String[] {""} ;
      T00FN78_A758ProCod = new String[] {""} ;
      T00FN78_n758ProCod = new boolean[] {false} ;
      T00FN78_A194BarOrdLin = new short[1] ;
      T00FN78_A4031CCTCod = new int[1] ;
      T00FN79_A396EmprCod = new String[] {""} ;
      T00FN79_A129BarCod = new int[1] ;
      T00FN79_A132BarCodReo = new byte[1] ;
      T00FN79_A130BarCodPar = new String[] {""} ;
      T00FN79_A758ProCod = new String[] {""} ;
      T00FN79_n758ProCod = new boolean[] {false} ;
      T00FN79_A194BarOrdLin = new short[1] ;
      T00FN79_A1664ParFasCod = new short[1] ;
      T00FN80_A396EmprCod = new String[] {""} ;
      T00FN80_A129BarCod = new int[1] ;
      T00FN80_A132BarCodReo = new byte[1] ;
      T00FN80_A130BarCodPar = new String[] {""} ;
      T00FN80_A758ProCod = new String[] {""} ;
      T00FN80_n758ProCod = new boolean[] {false} ;
      T00FN80_A194BarOrdLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock17_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int8 = new short[1] ;
      GXv_char7 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T00FN81_A407EmprNom = new String[] {""} ;
      T00FN81_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ279CliNom = "" ;
      ZZ1798BarDibCli = "" ;
      ZZ1031EmpesCod = "" ;
      ZZ212BarSer = "" ;
      ZZ120BarAgrEst = "" ;
      ZZ407EmprNom = "" ;
      ZZ365DisDes = "" ;
      T00FN82_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbarfae__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbarfae__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbarfae__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbarfae__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbarfae__default(),
         new Object[] {
             new Object[] {
            T00FN2_A129BarCod, T00FN2_A132BarCodReo, T00FN2_A130BarCodPar, T00FN2_A758ProCod, T00FN2_A194BarOrdLin, T00FN2_A152BarFasCon, T00FN2_A150BarFacTin, T00FN2_A153BarFasEst, T00FN2_A162BarFecTeo, T00FN2_A160BarFecRea,
            T00FN2_A216BarTieTeo, T00FN2_A227BarUni, T00FN2_A179BarLoc, T00FN2_A165BarHorIni, T00FN2_A164BarHorFin, T00FN2_A215BarTieRea, T00FN2_A396EmprCod, T00FN2_A457FasCod, T00FN2_A603MaqCodBis
            }
            , new Object[] {
            T00FN3_A129BarCod, T00FN3_A132BarCodReo, T00FN3_A130BarCodPar, T00FN3_A758ProCod, T00FN3_A194BarOrdLin, T00FN3_A152BarFasCon, T00FN3_A150BarFacTin, T00FN3_A153BarFasEst, T00FN3_A162BarFecTeo, T00FN3_A160BarFecRea,
            T00FN3_A216BarTieTeo, T00FN3_A227BarUni, T00FN3_A179BarLoc, T00FN3_A165BarHorIni, T00FN3_A164BarHorFin, T00FN3_A215BarTieRea, T00FN3_A396EmprCod, T00FN3_A457FasCod, T00FN3_A603MaqCodBis
            }
            , new Object[] {
            T00FN6_A1785BarFasAnt, T00FN6_n1785BarFasAnt
            }
            , new Object[] {
            T00FN7_A458FasCon, T00FN7_n458FasCon, T00FN7_A459FasDec, T00FN7_n459FasDec, T00FN7_A602MaqCod, T00FN7_n602MaqCod, T00FN7_A456FasActTin, T00FN7_n456FasActTin
            }
            , new Object[] {
            T00FN8_A396EmprCod
            }
            , new Object[] {
            T00FN10_A628MaxOrdFas, T00FN10_n628MaxOrdFas
            }
            , new Object[] {
            T00FN12_A760ProFasEst, T00FN12_n760ProFasEst
            }
            , new Object[] {
            T00FN13_A129BarCod, T00FN13_A132BarCodReo, T00FN13_A130BarCodPar, T00FN13_A761ProFasLin, T00FN13_n761ProFasLin, T00FN13_A396EmprCod, T00FN13_A758ProCod
            }
            , new Object[] {
            T00FN14_A129BarCod, T00FN14_A132BarCodReo, T00FN14_A130BarCodPar, T00FN14_A761ProFasLin, T00FN14_n761ProFasLin, T00FN14_A396EmprCod, T00FN14_A758ProCod
            }
            , new Object[] {
            T00FN15_A759ProDsc
            }
            , new Object[] {
            T00FN16_A361DisCod, T00FN16_A2759BarMaqGru, T00FN16_A129BarCod, T00FN16_A132BarCodReo, T00FN16_A130BarCodPar, T00FN16_A180BarMaqCod, T00FN16_A1798BarDibCli, T00FN16_A1799BarDibInt, T00FN16_A212BarSer, T00FN16_A213BarSit,
            T00FN16_A120BarAgrEst, T00FN16_A396EmprCod, T00FN16_A217BarTipArt, T00FN16_n217BarTipArt, T00FN16_A252CliCod, T00FN16_n252CliCod, T00FN16_A365DisDes
            }
            , new Object[] {
            T00FN17_A361DisCod, T00FN17_A2759BarMaqGru, T00FN17_A129BarCod, T00FN17_A132BarCodReo, T00FN17_A130BarCodPar, T00FN17_A180BarMaqCod, T00FN17_A1798BarDibCli, T00FN17_A1799BarDibInt, T00FN17_A212BarSer, T00FN17_A213BarSit,
            T00FN17_A120BarAgrEst, T00FN17_A396EmprCod, T00FN17_A217BarTipArt, T00FN17_n217BarTipArt, T00FN17_A252CliCod, T00FN17_n252CliCod, T00FN17_A365DisDes
            }
            , new Object[] {
            T00FN18_A407EmprNom, T00FN18_n407EmprNom
            }
            , new Object[] {
            T00FN19_A252CliCod, T00FN19_A1051DisNumCol, T00FN19_n1051DisNumCol, T00FN19_A1031EmpesCod, T00FN19_n1031EmpesCod, T00FN19_A365DisDes
            }
            , new Object[] {
            T00FN20_A396EmprCod
            }
            , new Object[] {
            T00FN21_A279CliNom
            }
            , new Object[] {
            T00FN23_A361DisCod, T00FN23_A2759BarMaqGru, T00FN23_A129BarCod, T00FN23_A132BarCodReo, T00FN23_A130BarCodPar, T00FN23_A180BarMaqCod, T00FN23_A252CliCod, T00FN23_n252CliCod, T00FN23_A279CliNom, T00FN23_A1798BarDibCli,
            T00FN23_A1799BarDibInt, T00FN23_A1051DisNumCol, T00FN23_n1051DisNumCol, T00FN23_A1031EmpesCod, T00FN23_n1031EmpesCod, T00FN23_A212BarSer, T00FN23_A213BarSit, T00FN23_A120BarAgrEst, T00FN23_A407EmprNom, T00FN23_n407EmprNom,
            T00FN23_A365DisDes, T00FN23_A396EmprCod, T00FN23_A217BarTipArt, T00FN23_n217BarTipArt, T00FN23_A628MaxOrdFas, T00FN23_n628MaxOrdFas
            }
            , new Object[] {
            T00FN24_A396EmprCod, T00FN24_A129BarCod, T00FN24_A132BarCodReo, T00FN24_A130BarCodPar
            }
            , new Object[] {
            T00FN25_A396EmprCod, T00FN25_A129BarCod, T00FN25_A132BarCodReo, T00FN25_A130BarCodPar
            }
            , new Object[] {
            T00FN26_A396EmprCod, T00FN26_A129BarCod, T00FN26_A132BarCodReo, T00FN26_A130BarCodPar
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
            T00FN31_A396EmprCod, T00FN31_A129BarCod, T00FN31_A132BarCodReo, T00FN31_A130BarCodPar
            }
            , new Object[] {
            T00FN33_A129BarCod, T00FN33_A132BarCodReo, T00FN33_A130BarCodPar, T00FN33_A759ProDsc, T00FN33_A761ProFasLin, T00FN33_n761ProFasLin, T00FN33_A396EmprCod, T00FN33_A758ProCod, T00FN33_A760ProFasEst, T00FN33_n760ProFasEst
            }
            , new Object[] {
            T00FN34_A759ProDsc
            }
            , new Object[] {
            T00FN36_A760ProFasEst, T00FN36_n760ProFasEst
            }
            , new Object[] {
            T00FN37_A396EmprCod, T00FN37_A129BarCod, T00FN37_A132BarCodReo, T00FN37_A130BarCodPar, T00FN37_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FN41_A759ProDsc
            }
            , new Object[] {
            T00FN43_A760ProFasEst, T00FN43_n760ProFasEst
            }
            , new Object[] {
            T00FN44_A396EmprCod, T00FN44_A30AlbProCod, T00FN44_A129BarCod, T00FN44_A132BarCodReo, T00FN44_A130BarCodPar, T00FN44_A1468AlbPrdLin
            }
            , new Object[] {
            T00FN45_A396EmprCod, T00FN45_A129BarCod, T00FN45_A132BarCodReo, T00FN45_A130BarCodPar, T00FN45_A758ProCod, T00FN45_A194BarOrdLin, T00FN45_A1664ParFasCod
            }
            , new Object[] {
            T00FN47_A628MaxOrdFas, T00FN47_n628MaxOrdFas
            }
            , new Object[] {
            T00FN48_A396EmprCod, T00FN48_A129BarCod, T00FN48_A132BarCodReo, T00FN48_A130BarCodPar, T00FN48_A758ProCod
            }
            , new Object[] {
            T00FN51_A129BarCod, T00FN51_A132BarCodReo, T00FN51_A130BarCodPar, T00FN51_A758ProCod, T00FN51_A194BarOrdLin, T00FN51_A152BarFasCon, T00FN51_A150BarFacTin, T00FN51_A458FasCon, T00FN51_n458FasCon, T00FN51_A153BarFasEst,
            T00FN51_A459FasDec, T00FN51_n459FasDec, T00FN51_A602MaqCod, T00FN51_n602MaqCod, T00FN51_A456FasActTin, T00FN51_n456FasActTin, T00FN51_A162BarFecTeo, T00FN51_A160BarFecRea, T00FN51_A216BarTieTeo, T00FN51_A227BarUni,
            T00FN51_A179BarLoc, T00FN51_A165BarHorIni, T00FN51_A164BarHorFin, T00FN51_A215BarTieRea, T00FN51_A396EmprCod, T00FN51_A457FasCod, T00FN51_A603MaqCodBis, T00FN51_A1785BarFasAnt, T00FN51_n1785BarFasAnt
            }
            , new Object[] {
            T00FN52_A458FasCon, T00FN52_n458FasCon, T00FN52_A459FasDec, T00FN52_n459FasDec, T00FN52_A602MaqCod, T00FN52_n602MaqCod, T00FN52_A456FasActTin, T00FN52_n456FasActTin
            }
            , new Object[] {
            T00FN53_A396EmprCod
            }
            , new Object[] {
            T00FN54_A396EmprCod, T00FN54_A129BarCod, T00FN54_A132BarCodReo, T00FN54_A130BarCodPar, T00FN54_A758ProCod, T00FN54_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FN58_A458FasCon, T00FN58_n458FasCon, T00FN58_A459FasDec, T00FN58_n459FasDec, T00FN58_A602MaqCod, T00FN58_n602MaqCod, T00FN58_A456FasActTin, T00FN58_n456FasActTin
            }
            , new Object[] {
            T00FN59_A396EmprCod, T00FN59_A129BarCod, T00FN59_A132BarCodReo, T00FN59_A130BarCodPar, T00FN59_A758ProCod, T00FN59_A194BarOrdLin, T00FN59_A12517SolAfLn
            }
            , new Object[] {
            T00FN60_A396EmprCod, T00FN60_A129BarCod, T00FN60_A132BarCodReo, T00FN60_A130BarCodPar, T00FN60_A758ProCod, T00FN60_A194BarOrdLin, T00FN60_A12516SolLzLn
            }
            , new Object[] {
            T00FN61_A396EmprCod, T00FN61_A129BarCod, T00FN61_A132BarCodReo, T00FN61_A130BarCodPar, T00FN61_A758ProCod, T00FN61_A194BarOrdLin, T00FN61_A12515SolPlLn
            }
            , new Object[] {
            T00FN62_A396EmprCod, T00FN62_A129BarCod, T00FN62_A132BarCodReo, T00FN62_A130BarCodPar, T00FN62_A758ProCod, T00FN62_A194BarOrdLin, T00FN62_A12514SolSAlLn
            }
            , new Object[] {
            T00FN63_A396EmprCod, T00FN63_A129BarCod, T00FN63_A132BarCodReo, T00FN63_A130BarCodPar, T00FN63_A758ProCod, T00FN63_A194BarOrdLin, T00FN63_A12513SolSAcLn
            }
            , new Object[] {
            T00FN64_A396EmprCod, T00FN64_A129BarCod, T00FN64_A132BarCodReo, T00FN64_A130BarCodPar, T00FN64_A758ProCod, T00FN64_A194BarOrdLin, T00FN64_A12512SolFrLn
            }
            , new Object[] {
            T00FN65_A396EmprCod, T00FN65_A129BarCod, T00FN65_A132BarCodReo, T00FN65_A130BarCodPar, T00FN65_A758ProCod, T00FN65_A194BarOrdLin, T00FN65_A12511SolAgLn
            }
            , new Object[] {
            T00FN66_A396EmprCod, T00FN66_A129BarCod, T00FN66_A132BarCodReo, T00FN66_A130BarCodPar, T00FN66_A758ProCod, T00FN66_A194BarOrdLin, T00FN66_A12510SolLvLn
            }
            , new Object[] {
            T00FN67_A396EmprCod, T00FN67_A129BarCod, T00FN67_A132BarCodReo, T00FN67_A130BarCodPar, T00FN67_A758ProCod, T00FN67_A194BarOrdLin, T00FN67_A10781BarFasNb
            }
            , new Object[] {
            T00FN68_A396EmprCod, T00FN68_A129BarCod, T00FN68_A132BarCodReo, T00FN68_A130BarCodPar, T00FN68_A758ProCod, T00FN68_A194BarOrdLin, T00FN68_A719PrdNum
            }
            , new Object[] {
            T00FN69_A396EmprCod, T00FN69_A129BarCod, T00FN69_A132BarCodReo, T00FN69_A130BarCodPar, T00FN69_A758ProCod, T00FN69_A194BarOrdLin, T00FN69_A9966Em_cod
            }
            , new Object[] {
            T00FN70_A396EmprCod, T00FN70_A129BarCod, T00FN70_A132BarCodReo, T00FN70_A130BarCodPar, T00FN70_A758ProCod, T00FN70_A194BarOrdLin, T00FN70_A9940Ab_cod
            }
            , new Object[] {
            T00FN71_A396EmprCod, T00FN71_A129BarCod, T00FN71_A132BarCodReo, T00FN71_A130BarCodPar, T00FN71_A758ProCod, T00FN71_A194BarOrdLin, T00FN71_A9911Ca_cod
            }
            , new Object[] {
            T00FN72_A396EmprCod, T00FN72_A129BarCod, T00FN72_A132BarCodReo, T00FN72_A130BarCodPar, T00FN72_A758ProCod, T00FN72_A194BarOrdLin, T00FN72_A9878Pe_cod
            }
            , new Object[] {
            T00FN73_A396EmprCod, T00FN73_A129BarCod, T00FN73_A132BarCodReo, T00FN73_A130BarCodPar, T00FN73_A758ProCod, T00FN73_A194BarOrdLin, T00FN73_A9870Rm_cod
            }
            , new Object[] {
            T00FN74_A396EmprCod, T00FN74_A129BarCod, T00FN74_A132BarCodReo, T00FN74_A130BarCodPar, T00FN74_A758ProCod, T00FN74_A194BarOrdLin, T00FN74_A7934Dtb_Ordl
            }
            , new Object[] {
            T00FN75_A396EmprCod, T00FN75_A129BarCod, T00FN75_A132BarCodReo, T00FN75_A130BarCodPar, T00FN75_A758ProCod, T00FN75_A194BarOrdLin, T00FN75_A5371FasQuiLin
            }
            , new Object[] {
            T00FN76_A396EmprCod, T00FN76_A129BarCod, T00FN76_A132BarCodReo, T00FN76_A130BarCodPar, T00FN76_A758ProCod, T00FN76_A194BarOrdLin, T00FN76_A4940A_Barcod, T00FN76_A4941A_BarReo, T00FN76_A4942A_BarPar, T00FN76_A4943A_ProCod,
            T00FN76_A4944A_BarOrd
            }
            , new Object[] {
            T00FN77_A396EmprCod, T00FN77_A129BarCod, T00FN77_A132BarCodReo, T00FN77_A130BarCodPar, T00FN77_A758ProCod, T00FN77_A194BarOrdLin, T00FN77_A4643BarFasLot
            }
            , new Object[] {
            T00FN78_A396EmprCod, T00FN78_A129BarCod, T00FN78_A132BarCodReo, T00FN78_A130BarCodPar, T00FN78_A758ProCod, T00FN78_A194BarOrdLin, T00FN78_A4031CCTCod
            }
            , new Object[] {
            T00FN79_A396EmprCod, T00FN79_A129BarCod, T00FN79_A132BarCodReo, T00FN79_A130BarCodPar, T00FN79_A758ProCod, T00FN79_A194BarOrdLin, T00FN79_A1664ParFasCod
            }
            , new Object[] {
            T00FN80_A396EmprCod, T00FN80_A129BarCod, T00FN80_A132BarCodReo, T00FN80_A130BarCodPar, T00FN80_A758ProCod, T00FN80_A194BarOrdLin
            }
            , new Object[] {
            T00FN81_A407EmprNom, T00FN81_n407EmprNom
            }
            , new Object[] {
            T00FN82_A396EmprCod
            }
         }
      );
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z150BarFacTin = "" ;
      A150BarFacTin = "" ;
      Z152BarFasCon = "" ;
      A152BarFasCon = "" ;
      Z603MaqCodBis = "" ;
      N603MaqCodBis = "" ;
      A603MaqCodBis = "" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z213BarSit ;
   private byte Z153BarFasEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte Gx_BScreen ;
   private byte A153BarFasEst ;
   private byte A1787BarReVir ;
   private byte A760ProFasEst ;
   private byte Z760ProFasEst ;
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
   private byte GXv_int6[] ;
   private byte ZZ132BarCodReo ;
   private byte ZZ213BarSit ;
   private short Z217BarTipArt ;
   private short Z761ProFasLin ;
   private short nRcdDeleted_14 ;
   private short nRcdExists_14 ;
   private short nIsMod_14 ;
   private short Z194BarOrdLin ;
   private short Z165BarHorIni ;
   private short Z164BarHorFin ;
   private short nRcdDeleted_15 ;
   private short nRcdExists_15 ;
   private short nIsMod_15 ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1051DisNumCol ;
   private short A217BarTipArt ;
   private short A628MaxOrdFas ;
   private short nBlankRcdCount14 ;
   private short RcdFound14 ;
   private short nBlankRcdUsr14 ;
   private short RcdFound15 ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A655OrdLinVir ;
   private short Z1051DisNumCol ;
   private short Z628MaxOrdFas ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_14 ;
   private short nIsDirty_15 ;
   private short nBlankRcdCount15 ;
   private short nBlankRcdUsr15 ;
   private short subGrid1_Borderwidth ;
   private short GXv_int8[] ;
   private short ZZ1051DisNumCol ;
   private short ZZ217BarTipArt ;
   private short ZZ628MaxOrdFas ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z1799BarDibInt ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int nRC_GXsfl_127 ;
   private int nGXsfl_127_idx=1 ;
   private int A129BarCod ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarDibCli_Enabled ;
   private int A1799BarDibInt ;
   private int edtBarDibInt_Enabled ;
   private int edtDisNumCol_Enabled ;
   private int edtEmpesCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarTipArt_Enabled ;
   private int edtMaxOrdFas_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProFasLin_Enabled ;
   private int edtProFasEst_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int edtavnRcdDeleted_15_Enabled ;
   private int A1784BarCoVir ;
   private int edtBarOrdLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasCon_Enabled ;
   private int edtBarFasCon_Enabled ;
   private int edtBarFasEst_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqCodBis_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtBarFacTin_Enabled ;
   private int edtBarFecTeo_Enabled ;
   private int edtBarFecRea_Enabled ;
   private int edtBarTieTeo_Enabled ;
   private int edtBarUni_Enabled ;
   private int edtBarLoc_Enabled ;
   private int edtBarHorIni_Enabled ;
   private int edtBarHorFin_Enabled ;
   private int edtBarTieRea_Enabled ;
   private int edtEmpcVir_Enabled ;
   private int edtBarCoVir_Enabled ;
   private int edtBarReVir_Enabled ;
   private int edtBarPaVir_Enabled ;
   private int edtProCodVir_Enabled ;
   private int edtOrdLinVir_Enabled ;
   private int edtBarFasAnt_Enabled ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtBarUni_Enabled ;
   private int defedtBarTieTeo_Enabled ;
   private int defedtBarFecRea_Enabled ;
   private int defedtBarFecTeo_Enabled ;
   private int defedtBarFacTin_Enabled ;
   private int defedtMaqCodBis_Enabled ;
   private int defedtBarFasEst_Enabled ;
   private int defedtBarFasCon_Enabled ;
   private int defedtBarOrdLin_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarAgrEst_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtMaxOrdFas_Backcolor ;
   private int edtBarTipArt_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtEmpesCod_Backcolor ;
   private int edtDisNumCol_Backcolor ;
   private int edtBarDibInt_Backcolor ;
   private int edtBarDibCli_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int5[] ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ1799BarDibInt ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z216BarTieTeo ;
   private java.math.BigDecimal Z227BarUni ;
   private java.math.BigDecimal Z215BarTieRea ;
   private java.math.BigDecimal N216BarTieTeo ;
   private java.math.BigDecimal N227BarUni ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z1798BarDibCli ;
   private String Z212BarSer ;
   private String Z120BarAgrEst ;
   private String Z758ProCod ;
   private String Z152BarFasCon ;
   private String Z150BarFacTin ;
   private String Z179BarLoc ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String N603MaqCodBis ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarSit_Internalname ;
   private String sGXsfl_100_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_127_idx="0001" ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarDibCli_Internalname ;
   private String A1798BarDibCli ;
   private String edtBarDibCli_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarDibInt_Internalname ;
   private String edtBarDibInt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDisNumCol_Internalname ;
   private String edtDisNumCol_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEmpesCod_Internalname ;
   private String A1031EmpesCod ;
   private String edtEmpesCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarTipArt_Internalname ;
   private String edtBarTipArt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtMaxOrdFas_Internalname ;
   private String edtMaxOrdFas_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode14 ;
   private String edtProCod_Internalname ;
   private String edtProDsc_Internalname ;
   private String edtProFasLin_Internalname ;
   private String edtProFasEst_Internalname ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_15_Internalname ;
   private String sMode12 ;
   private String GXCCtl ;
   private String edtBarOrdLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCon_Internalname ;
   private String A458FasCon ;
   private String edtBarFasCon_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasEst_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCodBis_Internalname ;
   private String edtFasActTin_Internalname ;
   private String A456FasActTin ;
   private String edtBarFacTin_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFecTeo_Internalname ;
   private String edtBarFecRea_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarUni_Internalname ;
   private String edtBarLoc_Internalname ;
   private String A179BarLoc ;
   private String edtBarHorIni_Internalname ;
   private String edtBarHorFin_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtEmpcVir_Internalname ;
   private String A1788EmpcVir ;
   private String edtBarCoVir_Internalname ;
   private String edtBarReVir_Internalname ;
   private String edtBarPaVir_Internalname ;
   private String A1786BarPaVir ;
   private String edtProCodVir_Internalname ;
   private String A1789ProCodVir ;
   private String edtOrdLinVir_Internalname ;
   private String edtBarFasAnt_Internalname ;
   private String A1785BarFasAnt ;
   private String A759ProDsc ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String AV21Lit5 ;
   private String AV22Lit6 ;
   private String AV23Lit7 ;
   private String AV24Lit8 ;
   private String AV25Lit9 ;
   private String AV26Lit10 ;
   private String AV27Lit11 ;
   private String AV28Lit12 ;
   private String AV29Lit13 ;
   private String AV30Lit14 ;
   private String AV31Lit15 ;
   private String AV32Lit16 ;
   private String AV33Lit17 ;
   private String AV34Lit18 ;
   private String AV37Lit19 ;
   private String AV36LitFe ;
   private String GXt_char1 ;
   private String AV38Station ;
   private String AV39EmprNom ;
   private String AV35UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z1031EmpesCod ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z1785BarFasAnt ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String Z456FasActTin ;
   private String sMode15 ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock20_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock19_Jsonclick ;
   private String edtProFasLin_Jsonclick ;
   private String lblTextblock20_Jsonclick ;
   private String edtProFasEst_Jsonclick ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_15_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtBarFasCon_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtBarFecTeo_Jsonclick ;
   private String edtBarFecRea_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtBarUni_Jsonclick ;
   private String edtBarLoc_Jsonclick ;
   private String edtBarHorIni_Jsonclick ;
   private String edtBarHorFin_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtEmpcVir_Jsonclick ;
   private String edtBarCoVir_Jsonclick ;
   private String edtBarReVir_Jsonclick ;
   private String edtBarPaVir_Jsonclick ;
   private String edtProCodVir_Jsonclick ;
   private String edtOrdLinVir_Jsonclick ;
   private String edtBarFasAnt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock17_Caption ;
   private String lblTextblock18_Caption ;
   private String lblTextblock19_Caption ;
   private String lblTextblock20_Caption ;
   private String subGrid2_Header ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ279CliNom ;
   private String ZZ1798BarDibCli ;
   private String ZZ1031EmpesCod ;
   private String ZZ212BarSer ;
   private String ZZ120BarAgrEst ;
   private String ZZ407EmprNom ;
   private String ZZ365DisDes ;
   private java.util.Date Z162BarFecTeo ;
   private java.util.Date Z160BarFecRea ;
   private java.util.Date N160BarFecRea ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n758ProCod ;
   private boolean n761ProFasLin ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n1051DisNumCol ;
   private boolean n1031EmpesCod ;
   private boolean n217BarTipArt ;
   private boolean n628MaxOrdFas ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean n760ProFasEst ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n1785BarFasAnt ;
   private boolean n458FasCon ;
   private boolean n459FasDec ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T00FN10_A628MaxOrdFas ;
   private boolean[] T00FN10_n628MaxOrdFas ;
   private byte[] T00FN12_A760ProFasEst ;
   private boolean[] T00FN12_n760ProFasEst ;
   private String[] T00FN18_A407EmprNom ;
   private boolean[] T00FN18_n407EmprNom ;
   private int[] T00FN19_A252CliCod ;
   private boolean[] T00FN19_n252CliCod ;
   private short[] T00FN19_A1051DisNumCol ;
   private boolean[] T00FN19_n1051DisNumCol ;
   private String[] T00FN19_A1031EmpesCod ;
   private boolean[] T00FN19_n1031EmpesCod ;
   private String[] T00FN19_A365DisDes ;
   private String[] T00FN21_A279CliNom ;
   private String[] T00FN20_A396EmprCod ;
   private int[] T00FN23_A361DisCod ;
   private String[] T00FN23_A2759BarMaqGru ;
   private int[] T00FN23_A129BarCod ;
   private byte[] T00FN23_A132BarCodReo ;
   private String[] T00FN23_A130BarCodPar ;
   private String[] T00FN23_A180BarMaqCod ;
   private int[] T00FN23_A252CliCod ;
   private boolean[] T00FN23_n252CliCod ;
   private String[] T00FN23_A279CliNom ;
   private String[] T00FN23_A1798BarDibCli ;
   private int[] T00FN23_A1799BarDibInt ;
   private short[] T00FN23_A1051DisNumCol ;
   private boolean[] T00FN23_n1051DisNumCol ;
   private String[] T00FN23_A1031EmpesCod ;
   private boolean[] T00FN23_n1031EmpesCod ;
   private String[] T00FN23_A212BarSer ;
   private byte[] T00FN23_A213BarSit ;
   private String[] T00FN23_A120BarAgrEst ;
   private String[] T00FN23_A407EmprNom ;
   private boolean[] T00FN23_n407EmprNom ;
   private String[] T00FN23_A365DisDes ;
   private String[] T00FN23_A396EmprCod ;
   private short[] T00FN23_A217BarTipArt ;
   private boolean[] T00FN23_n217BarTipArt ;
   private short[] T00FN23_A628MaxOrdFas ;
   private boolean[] T00FN23_n628MaxOrdFas ;
   private String[] T00FN24_A396EmprCod ;
   private int[] T00FN24_A129BarCod ;
   private byte[] T00FN24_A132BarCodReo ;
   private String[] T00FN24_A130BarCodPar ;
   private int[] T00FN17_A361DisCod ;
   private String[] T00FN17_A2759BarMaqGru ;
   private int[] T00FN17_A129BarCod ;
   private byte[] T00FN17_A132BarCodReo ;
   private String[] T00FN17_A130BarCodPar ;
   private String[] T00FN17_A180BarMaqCod ;
   private String[] T00FN17_A1798BarDibCli ;
   private int[] T00FN17_A1799BarDibInt ;
   private String[] T00FN17_A212BarSer ;
   private byte[] T00FN17_A213BarSit ;
   private String[] T00FN17_A120BarAgrEst ;
   private String[] T00FN17_A396EmprCod ;
   private short[] T00FN17_A217BarTipArt ;
   private boolean[] T00FN17_n217BarTipArt ;
   private int[] T00FN17_A252CliCod ;
   private boolean[] T00FN17_n252CliCod ;
   private String[] T00FN17_A365DisDes ;
   private String[] T00FN25_A396EmprCod ;
   private int[] T00FN25_A129BarCod ;
   private byte[] T00FN25_A132BarCodReo ;
   private String[] T00FN25_A130BarCodPar ;
   private String[] T00FN26_A396EmprCod ;
   private int[] T00FN26_A129BarCod ;
   private byte[] T00FN26_A132BarCodReo ;
   private String[] T00FN26_A130BarCodPar ;
   private int[] T00FN16_A361DisCod ;
   private String[] T00FN16_A2759BarMaqGru ;
   private int[] T00FN16_A129BarCod ;
   private byte[] T00FN16_A132BarCodReo ;
   private String[] T00FN16_A130BarCodPar ;
   private String[] T00FN16_A180BarMaqCod ;
   private String[] T00FN16_A1798BarDibCli ;
   private int[] T00FN16_A1799BarDibInt ;
   private String[] T00FN16_A212BarSer ;
   private byte[] T00FN16_A213BarSit ;
   private String[] T00FN16_A120BarAgrEst ;
   private String[] T00FN16_A396EmprCod ;
   private short[] T00FN16_A217BarTipArt ;
   private boolean[] T00FN16_n217BarTipArt ;
   private int[] T00FN16_A252CliCod ;
   private boolean[] T00FN16_n252CliCod ;
   private String[] T00FN16_A365DisDes ;
   private String[] T00FN31_A396EmprCod ;
   private int[] T00FN31_A129BarCod ;
   private byte[] T00FN31_A132BarCodReo ;
   private String[] T00FN31_A130BarCodPar ;
   private int[] T00FN33_A129BarCod ;
   private byte[] T00FN33_A132BarCodReo ;
   private String[] T00FN33_A130BarCodPar ;
   private String[] T00FN33_A759ProDsc ;
   private short[] T00FN33_A761ProFasLin ;
   private boolean[] T00FN33_n761ProFasLin ;
   private String[] T00FN33_A396EmprCod ;
   private String[] T00FN33_A758ProCod ;
   private boolean[] T00FN33_n758ProCod ;
   private byte[] T00FN33_A760ProFasEst ;
   private boolean[] T00FN33_n760ProFasEst ;
   private String[] T00FN15_A759ProDsc ;
   private String[] T00FN34_A759ProDsc ;
   private byte[] T00FN36_A760ProFasEst ;
   private boolean[] T00FN36_n760ProFasEst ;
   private String[] T00FN37_A396EmprCod ;
   private int[] T00FN37_A129BarCod ;
   private byte[] T00FN37_A132BarCodReo ;
   private String[] T00FN37_A130BarCodPar ;
   private String[] T00FN37_A758ProCod ;
   private boolean[] T00FN37_n758ProCod ;
   private int[] T00FN14_A129BarCod ;
   private byte[] T00FN14_A132BarCodReo ;
   private String[] T00FN14_A130BarCodPar ;
   private short[] T00FN14_A761ProFasLin ;
   private boolean[] T00FN14_n761ProFasLin ;
   private String[] T00FN14_A396EmprCod ;
   private String[] T00FN14_A758ProCod ;
   private boolean[] T00FN14_n758ProCod ;
   private int[] T00FN13_A129BarCod ;
   private byte[] T00FN13_A132BarCodReo ;
   private String[] T00FN13_A130BarCodPar ;
   private short[] T00FN13_A761ProFasLin ;
   private boolean[] T00FN13_n761ProFasLin ;
   private String[] T00FN13_A396EmprCod ;
   private String[] T00FN13_A758ProCod ;
   private boolean[] T00FN13_n758ProCod ;
   private String[] T00FN41_A759ProDsc ;
   private byte[] T00FN43_A760ProFasEst ;
   private boolean[] T00FN43_n760ProFasEst ;
   private String[] T00FN44_A396EmprCod ;
   private long[] T00FN44_A30AlbProCod ;
   private int[] T00FN44_A129BarCod ;
   private byte[] T00FN44_A132BarCodReo ;
   private String[] T00FN44_A130BarCodPar ;
   private short[] T00FN44_A1468AlbPrdLin ;
   private String[] T00FN45_A396EmprCod ;
   private int[] T00FN45_A129BarCod ;
   private byte[] T00FN45_A132BarCodReo ;
   private String[] T00FN45_A130BarCodPar ;
   private String[] T00FN45_A758ProCod ;
   private boolean[] T00FN45_n758ProCod ;
   private short[] T00FN45_A194BarOrdLin ;
   private short[] T00FN45_A1664ParFasCod ;
   private short[] T00FN47_A628MaxOrdFas ;
   private boolean[] T00FN47_n628MaxOrdFas ;
   private String[] T00FN48_A396EmprCod ;
   private int[] T00FN48_A129BarCod ;
   private byte[] T00FN48_A132BarCodReo ;
   private String[] T00FN48_A130BarCodPar ;
   private String[] T00FN48_A758ProCod ;
   private boolean[] T00FN48_n758ProCod ;
   private String[] T00FN6_A1785BarFasAnt ;
   private boolean[] T00FN6_n1785BarFasAnt ;
   private int[] T00FN51_A129BarCod ;
   private byte[] T00FN51_A132BarCodReo ;
   private String[] T00FN51_A130BarCodPar ;
   private String[] T00FN51_A758ProCod ;
   private boolean[] T00FN51_n758ProCod ;
   private short[] T00FN51_A194BarOrdLin ;
   private String[] T00FN51_A152BarFasCon ;
   private String[] T00FN51_A150BarFacTin ;
   private String[] T00FN51_A458FasCon ;
   private boolean[] T00FN51_n458FasCon ;
   private byte[] T00FN51_A153BarFasEst ;
   private java.math.BigDecimal[] T00FN51_A459FasDec ;
   private boolean[] T00FN51_n459FasDec ;
   private String[] T00FN51_A602MaqCod ;
   private boolean[] T00FN51_n602MaqCod ;
   private String[] T00FN51_A456FasActTin ;
   private boolean[] T00FN51_n456FasActTin ;
   private java.util.Date[] T00FN51_A162BarFecTeo ;
   private java.util.Date[] T00FN51_A160BarFecRea ;
   private java.math.BigDecimal[] T00FN51_A216BarTieTeo ;
   private java.math.BigDecimal[] T00FN51_A227BarUni ;
   private String[] T00FN51_A179BarLoc ;
   private short[] T00FN51_A165BarHorIni ;
   private short[] T00FN51_A164BarHorFin ;
   private java.math.BigDecimal[] T00FN51_A215BarTieRea ;
   private String[] T00FN51_A396EmprCod ;
   private String[] T00FN51_A457FasCod ;
   private String[] T00FN51_A603MaqCodBis ;
   private String[] T00FN51_A1785BarFasAnt ;
   private boolean[] T00FN51_n1785BarFasAnt ;
   private String[] T00FN7_A458FasCon ;
   private boolean[] T00FN7_n458FasCon ;
   private java.math.BigDecimal[] T00FN7_A459FasDec ;
   private boolean[] T00FN7_n459FasDec ;
   private String[] T00FN7_A602MaqCod ;
   private boolean[] T00FN7_n602MaqCod ;
   private String[] T00FN7_A456FasActTin ;
   private boolean[] T00FN7_n456FasActTin ;
   private String[] T00FN8_A396EmprCod ;
   private String[] T00FN52_A458FasCon ;
   private boolean[] T00FN52_n458FasCon ;
   private java.math.BigDecimal[] T00FN52_A459FasDec ;
   private boolean[] T00FN52_n459FasDec ;
   private String[] T00FN52_A602MaqCod ;
   private boolean[] T00FN52_n602MaqCod ;
   private String[] T00FN52_A456FasActTin ;
   private boolean[] T00FN52_n456FasActTin ;
   private String[] T00FN53_A396EmprCod ;
   private String[] T00FN54_A396EmprCod ;
   private int[] T00FN54_A129BarCod ;
   private byte[] T00FN54_A132BarCodReo ;
   private String[] T00FN54_A130BarCodPar ;
   private String[] T00FN54_A758ProCod ;
   private boolean[] T00FN54_n758ProCod ;
   private short[] T00FN54_A194BarOrdLin ;
   private int[] T00FN3_A129BarCod ;
   private byte[] T00FN3_A132BarCodReo ;
   private String[] T00FN3_A130BarCodPar ;
   private String[] T00FN3_A758ProCod ;
   private boolean[] T00FN3_n758ProCod ;
   private short[] T00FN3_A194BarOrdLin ;
   private String[] T00FN3_A152BarFasCon ;
   private String[] T00FN3_A150BarFacTin ;
   private byte[] T00FN3_A153BarFasEst ;
   private java.util.Date[] T00FN3_A162BarFecTeo ;
   private java.util.Date[] T00FN3_A160BarFecRea ;
   private java.math.BigDecimal[] T00FN3_A216BarTieTeo ;
   private java.math.BigDecimal[] T00FN3_A227BarUni ;
   private String[] T00FN3_A179BarLoc ;
   private short[] T00FN3_A165BarHorIni ;
   private short[] T00FN3_A164BarHorFin ;
   private java.math.BigDecimal[] T00FN3_A215BarTieRea ;
   private String[] T00FN3_A396EmprCod ;
   private String[] T00FN3_A457FasCod ;
   private String[] T00FN3_A603MaqCodBis ;
   private int[] T00FN2_A129BarCod ;
   private byte[] T00FN2_A132BarCodReo ;
   private String[] T00FN2_A130BarCodPar ;
   private String[] T00FN2_A758ProCod ;
   private boolean[] T00FN2_n758ProCod ;
   private short[] T00FN2_A194BarOrdLin ;
   private String[] T00FN2_A152BarFasCon ;
   private String[] T00FN2_A150BarFacTin ;
   private byte[] T00FN2_A153BarFasEst ;
   private java.util.Date[] T00FN2_A162BarFecTeo ;
   private java.util.Date[] T00FN2_A160BarFecRea ;
   private java.math.BigDecimal[] T00FN2_A216BarTieTeo ;
   private java.math.BigDecimal[] T00FN2_A227BarUni ;
   private String[] T00FN2_A179BarLoc ;
   private short[] T00FN2_A165BarHorIni ;
   private short[] T00FN2_A164BarHorFin ;
   private java.math.BigDecimal[] T00FN2_A215BarTieRea ;
   private String[] T00FN2_A396EmprCod ;
   private String[] T00FN2_A457FasCod ;
   private String[] T00FN2_A603MaqCodBis ;
   private String[] T00FN58_A458FasCon ;
   private boolean[] T00FN58_n458FasCon ;
   private java.math.BigDecimal[] T00FN58_A459FasDec ;
   private boolean[] T00FN58_n459FasDec ;
   private String[] T00FN58_A602MaqCod ;
   private boolean[] T00FN58_n602MaqCod ;
   private String[] T00FN58_A456FasActTin ;
   private boolean[] T00FN58_n456FasActTin ;
   private String[] T00FN59_A396EmprCod ;
   private int[] T00FN59_A129BarCod ;
   private byte[] T00FN59_A132BarCodReo ;
   private String[] T00FN59_A130BarCodPar ;
   private String[] T00FN59_A758ProCod ;
   private boolean[] T00FN59_n758ProCod ;
   private short[] T00FN59_A194BarOrdLin ;
   private short[] T00FN59_A12517SolAfLn ;
   private String[] T00FN60_A396EmprCod ;
   private int[] T00FN60_A129BarCod ;
   private byte[] T00FN60_A132BarCodReo ;
   private String[] T00FN60_A130BarCodPar ;
   private String[] T00FN60_A758ProCod ;
   private boolean[] T00FN60_n758ProCod ;
   private short[] T00FN60_A194BarOrdLin ;
   private short[] T00FN60_A12516SolLzLn ;
   private String[] T00FN61_A396EmprCod ;
   private int[] T00FN61_A129BarCod ;
   private byte[] T00FN61_A132BarCodReo ;
   private String[] T00FN61_A130BarCodPar ;
   private String[] T00FN61_A758ProCod ;
   private boolean[] T00FN61_n758ProCod ;
   private short[] T00FN61_A194BarOrdLin ;
   private short[] T00FN61_A12515SolPlLn ;
   private String[] T00FN62_A396EmprCod ;
   private int[] T00FN62_A129BarCod ;
   private byte[] T00FN62_A132BarCodReo ;
   private String[] T00FN62_A130BarCodPar ;
   private String[] T00FN62_A758ProCod ;
   private boolean[] T00FN62_n758ProCod ;
   private short[] T00FN62_A194BarOrdLin ;
   private short[] T00FN62_A12514SolSAlLn ;
   private String[] T00FN63_A396EmprCod ;
   private int[] T00FN63_A129BarCod ;
   private byte[] T00FN63_A132BarCodReo ;
   private String[] T00FN63_A130BarCodPar ;
   private String[] T00FN63_A758ProCod ;
   private boolean[] T00FN63_n758ProCod ;
   private short[] T00FN63_A194BarOrdLin ;
   private short[] T00FN63_A12513SolSAcLn ;
   private String[] T00FN64_A396EmprCod ;
   private int[] T00FN64_A129BarCod ;
   private byte[] T00FN64_A132BarCodReo ;
   private String[] T00FN64_A130BarCodPar ;
   private String[] T00FN64_A758ProCod ;
   private boolean[] T00FN64_n758ProCod ;
   private short[] T00FN64_A194BarOrdLin ;
   private short[] T00FN64_A12512SolFrLn ;
   private String[] T00FN65_A396EmprCod ;
   private int[] T00FN65_A129BarCod ;
   private byte[] T00FN65_A132BarCodReo ;
   private String[] T00FN65_A130BarCodPar ;
   private String[] T00FN65_A758ProCod ;
   private boolean[] T00FN65_n758ProCod ;
   private short[] T00FN65_A194BarOrdLin ;
   private short[] T00FN65_A12511SolAgLn ;
   private String[] T00FN66_A396EmprCod ;
   private int[] T00FN66_A129BarCod ;
   private byte[] T00FN66_A132BarCodReo ;
   private String[] T00FN66_A130BarCodPar ;
   private String[] T00FN66_A758ProCod ;
   private boolean[] T00FN66_n758ProCod ;
   private short[] T00FN66_A194BarOrdLin ;
   private short[] T00FN66_A12510SolLvLn ;
   private String[] T00FN67_A396EmprCod ;
   private int[] T00FN67_A129BarCod ;
   private byte[] T00FN67_A132BarCodReo ;
   private String[] T00FN67_A130BarCodPar ;
   private String[] T00FN67_A758ProCod ;
   private boolean[] T00FN67_n758ProCod ;
   private short[] T00FN67_A194BarOrdLin ;
   private int[] T00FN67_A10781BarFasNb ;
   private String[] T00FN68_A396EmprCod ;
   private int[] T00FN68_A129BarCod ;
   private byte[] T00FN68_A132BarCodReo ;
   private String[] T00FN68_A130BarCodPar ;
   private String[] T00FN68_A758ProCod ;
   private boolean[] T00FN68_n758ProCod ;
   private short[] T00FN68_A194BarOrdLin ;
   private String[] T00FN68_A719PrdNum ;
   private String[] T00FN69_A396EmprCod ;
   private int[] T00FN69_A129BarCod ;
   private byte[] T00FN69_A132BarCodReo ;
   private String[] T00FN69_A130BarCodPar ;
   private String[] T00FN69_A758ProCod ;
   private boolean[] T00FN69_n758ProCod ;
   private short[] T00FN69_A194BarOrdLin ;
   private String[] T00FN69_A9966Em_cod ;
   private String[] T00FN70_A396EmprCod ;
   private int[] T00FN70_A129BarCod ;
   private byte[] T00FN70_A132BarCodReo ;
   private String[] T00FN70_A130BarCodPar ;
   private String[] T00FN70_A758ProCod ;
   private boolean[] T00FN70_n758ProCod ;
   private short[] T00FN70_A194BarOrdLin ;
   private String[] T00FN70_A9940Ab_cod ;
   private String[] T00FN71_A396EmprCod ;
   private int[] T00FN71_A129BarCod ;
   private byte[] T00FN71_A132BarCodReo ;
   private String[] T00FN71_A130BarCodPar ;
   private String[] T00FN71_A758ProCod ;
   private boolean[] T00FN71_n758ProCod ;
   private short[] T00FN71_A194BarOrdLin ;
   private String[] T00FN71_A9911Ca_cod ;
   private String[] T00FN72_A396EmprCod ;
   private int[] T00FN72_A129BarCod ;
   private byte[] T00FN72_A132BarCodReo ;
   private String[] T00FN72_A130BarCodPar ;
   private String[] T00FN72_A758ProCod ;
   private boolean[] T00FN72_n758ProCod ;
   private short[] T00FN72_A194BarOrdLin ;
   private String[] T00FN72_A9878Pe_cod ;
   private String[] T00FN73_A396EmprCod ;
   private int[] T00FN73_A129BarCod ;
   private byte[] T00FN73_A132BarCodReo ;
   private String[] T00FN73_A130BarCodPar ;
   private String[] T00FN73_A758ProCod ;
   private boolean[] T00FN73_n758ProCod ;
   private short[] T00FN73_A194BarOrdLin ;
   private String[] T00FN73_A9870Rm_cod ;
   private String[] T00FN74_A396EmprCod ;
   private int[] T00FN74_A129BarCod ;
   private byte[] T00FN74_A132BarCodReo ;
   private String[] T00FN74_A130BarCodPar ;
   private String[] T00FN74_A758ProCod ;
   private boolean[] T00FN74_n758ProCod ;
   private short[] T00FN74_A194BarOrdLin ;
   private short[] T00FN74_A7934Dtb_Ordl ;
   private String[] T00FN75_A396EmprCod ;
   private int[] T00FN75_A129BarCod ;
   private byte[] T00FN75_A132BarCodReo ;
   private String[] T00FN75_A130BarCodPar ;
   private String[] T00FN75_A758ProCod ;
   private boolean[] T00FN75_n758ProCod ;
   private short[] T00FN75_A194BarOrdLin ;
   private short[] T00FN75_A5371FasQuiLin ;
   private String[] T00FN76_A396EmprCod ;
   private int[] T00FN76_A129BarCod ;
   private byte[] T00FN76_A132BarCodReo ;
   private String[] T00FN76_A130BarCodPar ;
   private String[] T00FN76_A758ProCod ;
   private boolean[] T00FN76_n758ProCod ;
   private short[] T00FN76_A194BarOrdLin ;
   private int[] T00FN76_A4940A_Barcod ;
   private byte[] T00FN76_A4941A_BarReo ;
   private String[] T00FN76_A4942A_BarPar ;
   private String[] T00FN76_A4943A_ProCod ;
   private short[] T00FN76_A4944A_BarOrd ;
   private String[] T00FN77_A396EmprCod ;
   private int[] T00FN77_A129BarCod ;
   private byte[] T00FN77_A132BarCodReo ;
   private String[] T00FN77_A130BarCodPar ;
   private String[] T00FN77_A758ProCod ;
   private boolean[] T00FN77_n758ProCod ;
   private short[] T00FN77_A194BarOrdLin ;
   private int[] T00FN77_A4643BarFasLot ;
   private String[] T00FN78_A396EmprCod ;
   private int[] T00FN78_A129BarCod ;
   private byte[] T00FN78_A132BarCodReo ;
   private String[] T00FN78_A130BarCodPar ;
   private String[] T00FN78_A758ProCod ;
   private boolean[] T00FN78_n758ProCod ;
   private short[] T00FN78_A194BarOrdLin ;
   private int[] T00FN78_A4031CCTCod ;
   private String[] T00FN79_A396EmprCod ;
   private int[] T00FN79_A129BarCod ;
   private byte[] T00FN79_A132BarCodReo ;
   private String[] T00FN79_A130BarCodPar ;
   private String[] T00FN79_A758ProCod ;
   private boolean[] T00FN79_n758ProCod ;
   private short[] T00FN79_A194BarOrdLin ;
   private short[] T00FN79_A1664ParFasCod ;
   private String[] T00FN80_A396EmprCod ;
   private int[] T00FN80_A129BarCod ;
   private byte[] T00FN80_A132BarCodReo ;
   private String[] T00FN80_A130BarCodPar ;
   private String[] T00FN80_A758ProCod ;
   private boolean[] T00FN80_n758ProCod ;
   private short[] T00FN80_A194BarOrdLin ;
   private String[] T00FN81_A407EmprNom ;
   private boolean[] T00FN81_n407EmprNom ;
   private String[] T00FN82_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbarfae__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarfae__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarfae__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarfae__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarfae__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00FN2", "SELECT BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFacTin, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, EmprCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF BarFasCon, BarFacTin, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, FasCod, MaqCodBis NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN3", "SELECT BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFacTin, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, EmprCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN6", "SELECT COALESCE( T1.BarFasAnt, '        ') AS BarFasAnt FROM (SELECT MIN(T2.FasCod) AS BarFasAnt FROM TXPBARFAS T2,  (SELECT MAX(BarOrdLin) AS GXC1 FROM TXPBARFAS WHERE (BarOrdLin >= 0) AND (BarOrdLin < ?) AND (BarFasEst <> 0) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) ) T3 WHERE T2.BarOrdLin = T3.GXC1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN7", "SELECT FasCon, FasDec, MaqCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN8", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN10", "SELECT COALESCE( T1.MaxOrdFas, 0) AS MaxOrdFas FROM (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN12", "SELECT COALESCE( T1.ProFasEst, 0) AS ProFasEst FROM (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN13", "SELECT BarCod, BarCodReo, BarCodPar, ProFasLin, EmprCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?  FOR UPDATE OF ProFasLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN14", "SELECT BarCod, BarCodReo, BarCodPar, ProFasLin, EmprCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN15", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN16", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDibCli, BarDibInt, BarSer, BarSit, BarAgrEst, EmprCod, BarTipArt, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, BarDibCli, BarDibInt, BarSer, BarSit, BarAgrEst, BarTipArt, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN17", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDibCli, BarDibInt, BarSer, BarSit, BarAgrEst, EmprCod, BarTipArt, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN19", "SELECT CliCod, DisNumCol, EmpesCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN20", "SELECT EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN21", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN23", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.CliCod, T4.CliNom, TM1.BarDibCli, TM1.BarDibInt, T3.DisNumCol, T3.EmpesCod, TM1.BarSer, TM1.BarSit, TM1.BarAgrEst, T2.EmprNom, TM1.DisDes, TM1.EmprCod, TM1.BarTipArt AS BarTipArt, COALESCE( T5.MaxOrdFas, 0) AS MaxOrdFas FROM ((((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN24", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00FN27", "INSERT INTO TXPBARCAD(CliCod, DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDibCli, BarDibInt, BarSer, BarSit, BarAgrEst, EmprCod, BarTipArt, BarVolMaq, BarDisNum, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00FN28", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, BarDibCli=?, BarDibInt=?, BarSer=?, BarSit=?, BarAgrEst=?, BarTipArt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00FN29", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00FN30", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T00FN31", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN33", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.ProFasLin, T1.EmprCod, T1.ProCod, COALESCE( T3.ProFasEst, 0) AS ProFasEst FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN34", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN36", "SELECT COALESCE( T1.ProFasEst, 0) AS ProFasEst FROM (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN37", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00FN38", "INSERT INTO TXPBARPRO(BarCod, BarCodReo, BarCodPar, ProFasLin, EmprCod, ProCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARPRO")
         ,new UpdateCursor("T00FN39", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK, "TXPBARPRO")
         ,new UpdateCursor("T00FN40", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK, "TXPBARPRO")
         ,new ForEachCursor("T00FN41", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN43", "SELECT COALESCE( T1.ProFasEst, 0) AS ProFasEst FROM (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN44", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN47", "SELECT COALESCE( T1.MaxOrdFas, 0) AS MaxOrdFas FROM (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN48", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN51", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.BarFasCon, T1.BarFacTin, T3.FasCon, T1.BarFasEst, T3.FasDec, T3.MaqCod, T3.FasActTin, T1.BarFecTeo, T1.BarFecRea, T1.BarTieTeo, T1.BarUni, T1.BarLoc, T1.BarHorIni, T1.BarHorFin, T1.BarTieRea, T1.EmprCod, T1.FasCod, T1.MaqCodBis, COALESCE( T2.BarFasAnt, '        ') AS BarFasAnt FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod),  (SELECT MIN(T4.FasCod) AS BarFasAnt FROM TXPBARFAS T4,  (SELECT MAX(BarOrdLin) AS GXC1 FROM TXPBARFAS WHERE (BarOrdLin >= 0) AND (BarOrdLin < ?) AND (BarFasEst <> 0) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) ) T5 WHERE T4.BarOrdLin = T5.GXC1 ) T2 WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN52", "SELECT FasCon, FasDec, MaqCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN53", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN54", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00FN55", "INSERT INTO TXPBARFAS(BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFacTin, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, EmprCod, FasCod, MaqCodBis, BarFecRIni, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00FN56", "UPDATE TXPBARFAS SET BarFasCon=?, BarFacTin=?, BarFasEst=?, BarFecTeo=?, BarFecRea=?, BarTieTeo=?, BarUni=?, BarLoc=?, BarHorIni=?, BarHorFin=?, BarTieRea=?, FasCod=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00FN57", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00FN58", "SELECT FasCon, FasDec, MaqCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN59", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN60", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN61", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN64", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN65", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN66", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN67", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN68", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN69", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN70", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN71", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN74", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN75", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN78", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN79", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FN80", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN81", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FN82", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 16);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 3);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 27 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 33 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 36 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[20])[0] = rslt.getString(17, 10);
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 3);
               ((String[]) buf[25])[0] = rslt.getString(22, 8);
               ((String[]) buf[26])[0] = rslt.getString(23, 6);
               ((String[]) buf[27])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 69 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 6);
               stmt.setString(9, (String)parms[9], 16);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 16);
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 1);
               stmt.setString(14, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[16]).shortValue());
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               stmt.setString(5, (String)parms[5], 6);
               stmt.setString(6, (String)parms[6], 16);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 16);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[12]).shortValue());
               }
               stmt.setString(12, (String)parms[13], 3);
               stmt.setInt(13, ((Number) parms[14]).intValue());
               stmt.setByte(14, ((Number) parms[15]).byteValue());
               stmt.setString(15, (String)parms[16], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 8);
               }
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 8);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 38 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 8);
               }
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 42 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
               }
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 1);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setDate(9, (java.util.Date)parms[9]);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(13, (String)parms[13], 10);
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 3);
               stmt.setString(18, (String)parms[18], 8);
               stmt.setString(19, (String)parms[19], 6);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[18], 8);
               }
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

