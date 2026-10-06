package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclse00_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV36Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV35Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2119RecEstCP = CommonUtil.decimalVal( httpContext.GetPar( "RecEstCP"), ".") ;
         n2119RecEstCP = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1N7594( A396EmprCod, AV36Pgmname, AV8UsurCod, AV12Station, AV35Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A2119RecEstCP) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A795PrvNum) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
            A1056DisComCod = httpContext.GetPar( "DisComCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
            A1032FonCod = httpContext.GetPar( "FonCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
            A2124RecMolCod = (byte)(GXutil.lval( httpContext.GetPar( "RecMolCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2124RecMolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2124RecMolCod), 2, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Productos desde Cierre", ""), (short)(0)) ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
      edtPrdExiCC_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_75_Refreshing);
      A2676RecPasTotC = CommonUtil.decimalVal( httpContext.GetPar( "RecPasTotC"), ".") ;
      n2676RecPasTotC = false ;
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

   public tclse00_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclse00_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclse00_impl.class ));
   }

   public tclse00_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLSE00.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Linea Combinacion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComLin_Jsonclick, 0, "", "", "", "", "", 1, edtDisComLin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Combinación", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod), GXutil.rtrim( localUtil.format( A1056DisComCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisComCod_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código de Fondo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFonCod_Internalname, GXutil.rtrim( A1032FonCod), GXutil.rtrim( localUtil.format( A1032FonCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFonCod_Jsonclick, 0, "", "", "", "", "", 1, edtFonCod_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "BarCodLan", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodLan_Internalname, GXutil.ltrim( localUtil.ntoc( A2509BarCodLan, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2509BarCodLan), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2509BarCodLan), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodLan_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodLan_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Molde", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMolCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2124RecMolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMolCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2124RecMolCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2124RecMolCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMolCod_Jsonclick, 0, "", "", "", "", "", 1, edtRecMolCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Total Candidad de Pasta", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPasTotC_Internalname, GXutil.ltrim( localUtil.ntoc( A2676RecPasTotC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecPasTotC_Enabled!=0) ? localUtil.format( A2676RecPasTotC, "ZZZZZ9.99") : localUtil.format( A2676RecPasTotC, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPasTotC_Jsonclick, 0, "", "", "", "", "", 1, edtRecPasTotC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLSE00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount594 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_594 = (short)(1) ;
            scanStart1N7594( ) ;
            while ( RcdFound594 != 0 )
            {
               init_level_properties594( ) ;
               getByPrimaryKey1N7594( ) ;
               addRow1N7594( ) ;
               scanNext1N7594( ) ;
            }
            scanEnd1N7594( ) ;
            nBlankRcdCount594 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1N7594( ) ;
         standaloneModal1N7594( ) ;
         sMode594 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1N7594( ) ;
            edtavnRcdDeleted_594_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_594_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_594_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_594_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecMolLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMOLLIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecMolLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMolLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdUniCom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUNICOM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCom_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdUniCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUNICON_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCon_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecUniCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECUNICOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecUniCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUniCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstGK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTGK_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstGK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstGK_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCP_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCP_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstCPF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCPF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstCPF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCPF_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstCPPa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCPPA_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstCPPa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCPPa_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstCosK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCOSK_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstCosK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCosK_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrvNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNOM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTPAR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtRecEstFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTFIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstFin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtPrdExiCC_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_75_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_594 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1N7594( ) ;
            }
            sendRow1N7594( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode594 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount594 = (short)(5) ;
         nRcdExists_594 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1N7594( ) ;
            while ( RcdFound594 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75594( ) ;
               init_level_properties594( ) ;
               standaloneNotModal1N7594( ) ;
               getByPrimaryKey1N7594( ) ;
               standaloneModal1N7594( ) ;
               addRow1N7594( ) ;
               scanNext1N7594( ) ;
            }
            scanEnd1N7594( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode594 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75594( ) ;
      initAll1N7594( ) ;
      init_level_properties594( ) ;
      nRcdExists_594 = (short)(0) ;
      nIsMod_594 = (short)(0) ;
      nRcdDeleted_594 = (short)(0) ;
      nBlankRcdCount594 = (short)(nBlankRcdUsr594+nBlankRcdCount594) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount594 > 0 )
      {
         standaloneNotModal1N7594( ) ;
         standaloneModal1N7594( ) ;
         addRow1N7594( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRecMolLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount594 = (short)(nBlankRcdCount594-1) ;
      }
      Gx_mode = sMode594 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLSE00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLSE00.htm");
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
      e111N72 ();
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
            Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2524DisComLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1056DisComCod = httpContext.cgiGet( "Z1056DisComCod") ;
            Z1032FonCod = httpContext.cgiGet( "Z1032FonCod") ;
            Z2124RecMolCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2124RecMolCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV34Flag1 = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV33CocinaC = (byte)(localUtil.ctol( httpContext.cgiGet( "vCOCINAC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
            A1056DisComCod = httpContext.cgiGet( edtDisComCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
            A1032FonCod = httpContext.cgiGet( edtFonCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
            A2509BarCodLan = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2509BarCodLan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2509BarCodLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2509BarCodLan), 8, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A2124RecMolCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2124RecMolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2124RecMolCod), 2, 0));
            A2676RecPasTotC = localUtil.ctond( httpContext.cgiGet( edtRecPasTotC_Internalname)) ;
            n2676RecPasTotC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrimstr( A2676RecPasTotC, 9, 2));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
            if ( isUpd( )  )
            {
               forbiddenHiddens2.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
            }
            hsh2 = httpContext.cgiGet( "hsh2") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens2.toString(), hsh2, GXKey) )
            {
               GXutil.writeLogError("tclse00:[ CondSecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens2.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
               A1056DisComCod = httpContext.GetPar( "DisComCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
               A1032FonCod = httpContext.GetPar( "FonCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
               A2124RecMolCod = (byte)(GXutil.lval( httpContext.GetPar( "RecMolCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2124RecMolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2124RecMolCod), 2, 0));
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
                        e111N72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121N72 ();
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
         e121N72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1N7597( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_594_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_594_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1N7597( ) ;
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

   public void confirm_1N70( )
   {
      beforeValidate1N7597( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1N7597( ) ;
         }
         else
         {
            checkExtendedTable1N7597( ) ;
            if ( AnyError == 0 )
            {
               zm1N7597( 16) ;
               zm1N7597( 17) ;
               zm1N7597( 18) ;
            }
            closeExtendedTableCursors1N7597( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode597 = Gx_mode ;
         confirm_1N7594( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode597 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode597 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1N70( ) ;
      }
   }

   public void confirm_1N7594( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1N7594( ) ;
         if ( ( nRcdExists_594 != 0 ) || ( nIsMod_594 != 0 ) )
         {
            getKey1N7594( ) ;
            if ( ( nRcdExists_594 == 0 ) && ( nRcdDeleted_594 == 0 ) )
            {
               if ( RcdFound594 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1N7594( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1N7594( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1N7594( 20) ;
                        zm1N7594( 21) ;
                     }
                     closeExtendedTableCursors1N7594( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RECMOLLIN_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRecMolLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound594 != 0 )
               {
                  if ( nRcdDeleted_594 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1N7594( ) ;
                     load1N7594( ) ;
                     beforeValidate1N7594( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1N7594( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_594 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1N7594( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1N7594( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1N7594( 20) ;
                              zm1N7594( 21) ;
                           }
                           closeExtendedTableCursors1N7594( ) ;
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
                  if ( nRcdDeleted_594 == 0 )
                  {
                     GXCCtl = "RECMOLLIN_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecMolLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_594_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecMolLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdUniCon_Internalname, GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecUniCod_Internalname, GXutil.rtrim( A2134RecUniCod)) ;
         httpContext.changePostValue( edtRecEstGK_Internalname, GXutil.ltrim( localUtil.ntoc( A2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCP_Internalname, GXutil.ltrim( localUtil.ntoc( A2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCPF_Internalname, GXutil.ltrim( localUtil.ntoc( A2669RecEstCPF, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCPPa_Internalname, GXutil.ltrim( localUtil.ntoc( A5105RecEstCPPa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCosK_Internalname, GXutil.ltrim( localUtil.ntoc( A5106RecEstCosK, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom)) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstPar_Internalname, GXutil.ltrim( localUtil.ntoc( A6063RecEstPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstFin_Internalname, GXutil.ltrim( localUtil.ntoc( A8461RecEstFin, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2126RecMolLin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2119RecEstCP_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2134RecUniCod_"+sGXsfl_75_idx, GXutil.rtrim( Z2134RecUniCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2120RecEstGK_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5105RecEstCPPa_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z5105RecEstCPPa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5106RecEstCosK_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z5106RecEstCosK, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6063RecEstPar_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6063RecEstPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8461RecEstFin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z8461RecEstFin, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_75_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_75_idx, GXutil.rtrim( Z718PrdNom)) ;
         httpContext.changePostValue( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z742PrdUniCom_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z743PrdUniCon_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2119RecEstCP_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2669RecEstCPF_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O2669RecEstCPF, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T685PrdCanRes_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2120RecEstGK_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_594_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_594_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_594_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_594 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_594_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_594_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMOLLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMolLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUNICOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUNICON_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECUNICOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUniCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTGK_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstGK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCPF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCPPA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPPa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCOSK_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCosK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVNOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTPAR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTFIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_75_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1N70( )
   {
   }

   public void e111N72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tclse00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tclse00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tclse00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclse00_impl.this.A396EmprCod = GXv_char2[0] ;
      tclse00_impl.this.AV11EmprNom = GXv_char3[0] ;
      tclse00_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33CocinaC ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int6) ;
      tclse00_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33CocinaC = (byte)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33CocinaC", GXutil.str( AV33CocinaC, 1, 0));
      GXt_int7 = AV34Flag1 ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKEST", ""), GXv_int8) ;
      tclse00_impl.this.GXt_int7 = GXv_int8[0] ;
      AV34Flag1 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Flag1", GXutil.str( AV34Flag1, 1, 0));
      edtPrdExiCC_Visible = ((AV33CocinaC==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void e121N72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A2509BarCodLan ;
      new app.prcrc00(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
      tclse00_impl.this.A396EmprCod = GXv_char4[0] ;
      tclse00_impl.this.A2509BarCodLan = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A2509BarCodLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2509BarCodLan), 8, 0));
      /*  Sending Event outputs  */
   }

   public void zm1N7597( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -15 )
      {
         Z2124RecMolCod = A2124RecMolCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z407EmprNom = A407EmprNom ;
         Z2509BarCodLan = A2509BarCodLan ;
         Z2676RecPasTotC = A2676RecPasTotC ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TCLSE00" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T01N79 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N79_A407EmprNom[0] ;
      n407EmprNom = T01N79_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T01N710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARCOM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FONCOD");
         AnyError = (short)(1) ;
      }
      A2509BarCodLan = T01N710_A2509BarCodLan[0] ;
      n2509BarCodLan = T01N710_n2509BarCodLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2509BarCodLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2509BarCodLan), 8, 0));
      pr_default.close(8);
      /* Using cursor T01N712 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A2676RecPasTotC = T01N712_A2676RecPasTotC[0] ;
         n2676RecPasTotC = T01N712_n2676RecPasTotC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrimstr( A2676RecPasTotC, 9, 2));
      }
      else
      {
         A2676RecPasTotC = DecimalUtil.doubleToDec(0) ;
         n2676RecPasTotC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrimstr( A2676RecPasTotC, 9, 2));
      }
      pr_default.close(9);
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

   public void load1N7597( )
   {
      /* Using cursor T01N714 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound597 = (short)(1) ;
         A2509BarCodLan = T01N714_A2509BarCodLan[0] ;
         n2509BarCodLan = T01N714_n2509BarCodLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2509BarCodLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2509BarCodLan), 8, 0));
         A407EmprNom = T01N714_A407EmprNom[0] ;
         n407EmprNom = T01N714_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2676RecPasTotC = T01N714_A2676RecPasTotC[0] ;
         n2676RecPasTotC = T01N714_n2676RecPasTotC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrimstr( A2676RecPasTotC, 9, 2));
         zm1N7597( -15) ;
      }
      pr_default.close(10);
      onLoadActions1N7597( ) ;
   }

   public void onLoadActions1N7597( )
   {
   }

   public void checkExtendedTable1N7597( )
   {
      nIsDirty_597 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1N7597( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1N7597( )
   {
      /* Using cursor T01N715 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound597 = (short)(1) ;
      }
      else
      {
         RcdFound597 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01N78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(6) != 101) && ( T01N78_A2124RecMolCod[0] == A2124RecMolCod ) && ( GXutil.strcmp(T01N78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N78_A129BarCod[0] == A129BarCod ) && ( T01N78_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01N78_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01N78_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T01N78_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T01N78_A1032FonCod[0], A1032FonCod) == 0 ) )
      {
         zm1N7597( 15) ;
         RcdFound597 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z2124RecMolCod = A2124RecMolCod ;
         sMode597 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N7597( ) ;
         if ( AnyError == 1 )
         {
            RcdFound597 = (short)(0) ;
            initializeNonKey1N7597( ) ;
         }
         Gx_mode = sMode597 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound597 = (short)(0) ;
         initializeNonKey1N7597( ) ;
         sMode597 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode597 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1N7597( ) ;
      if ( RcdFound597 == 0 )
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
      RcdFound597 = (short)(0) ;
      /* Using cursor T01N716 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01N716_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N716_A129BarCod[0] == A129BarCod ) && ( T01N716_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01N716_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01N716_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T01N716_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T01N716_A1032FonCod[0], A1032FonCod) == 0 ) && ( T01N716_A2124RecMolCod[0] == A2124RecMolCod ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01N716_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N716_A129BarCod[0] == A129BarCod ) && ( T01N716_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01N716_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01N716_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T01N716_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T01N716_A1032FonCod[0], A1032FonCod) == 0 ) && ( T01N716_A2124RecMolCod[0] == A2124RecMolCod ) )
         {
            RcdFound597 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound597 = (short)(0) ;
      /* Using cursor T01N717 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01N717_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N717_A129BarCod[0] == A129BarCod ) && ( T01N717_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01N717_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01N717_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T01N717_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T01N717_A1032FonCod[0], A1032FonCod) == 0 ) && ( T01N717_A2124RecMolCod[0] == A2124RecMolCod ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01N717_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N717_A129BarCod[0] == A129BarCod ) && ( T01N717_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01N717_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01N717_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T01N717_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T01N717_A1032FonCod[0], A1032FonCod) == 0 ) && ( T01N717_A2124RecMolCod[0] == A2124RecMolCod ) )
         {
            RcdFound597 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N7597( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1N7597( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound597 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) || ( A2124RecMolCod != Z2124RecMolCod ) )
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
               update1N7597( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) || ( A2124RecMolCod != Z2124RecMolCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1N7597( ) ;
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
                  insert1N7597( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) || ( A2124RecMolCod != Z2124RecMolCod ) )
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
      getKey1N7597( ) ;
      if ( RcdFound597 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) || ( A2124RecMolCod != Z2124RecMolCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) || ( A2124RecMolCod != Z2124RecMolCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclse00");
   }

   public void insert_check( )
   {
      confirm_1N70( ) ;
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
      if ( RcdFound597 == 0 )
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
      scanStart1N7597( ) ;
      if ( RcdFound597 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1N7597( ) ;
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
      if ( RcdFound597 == 0 )
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
      if ( RcdFound597 == 0 )
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
      scanStart1N7597( ) ;
      if ( RcdFound597 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound597 != 0 )
         {
            scanNext1N7597( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1N7597( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N7597( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N77 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMOL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECMOL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N7597( )
   {
      beforeValidate1N7597( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N7597( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N7597( 0) ;
         checkOptimisticConcurrency1N7597( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N7597( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N7597( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N718 */
                  pr_default.execute(14, new Object[] {Byte.valueOf(A2124RecMolCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMOL");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1N7597( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1N70( ) ;
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
            load1N7597( ) ;
         }
         endLevel1N7597( ) ;
      }
      closeExtendedTableCursors1N7597( ) ;
   }

   public void update1N7597( )
   {
      beforeValidate1N7597( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N7597( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N7597( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N7597( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N7597( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPRECMOL */
                  deferredUpdate1N7597( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1N7597( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1N70( ) ;
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
         endLevel1N7597( ) ;
      }
      closeExtendedTableCursors1N7597( ) ;
   }

   public void deferredUpdate1N7597( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N7597( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N7597( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N7597( ) ;
         afterConfirm1N7597( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N7597( ) ;
            if ( AnyError == 0 )
            {
               scanStart1N7594( ) ;
               while ( RcdFound594 != 0 )
               {
                  getByPrimaryKey1N7594( ) ;
                  delete1N7594( ) ;
                  scanNext1N7594( ) ;
               }
               scanEnd1N7594( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N719 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMOL");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound597 == 0 )
                        {
                           initAll1N7597( ) ;
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
                        resetCaption1N70( ) ;
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
      sMode597 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N7597( ) ;
      Gx_mode = sMode597 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N7597( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01N720 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01N721 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel1N7594( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1N7594( ) ;
         if ( ( nRcdExists_594 != 0 ) || ( nIsMod_594 != 0 ) )
         {
            standaloneNotModal1N7594( ) ;
            getKey1N7594( ) ;
            if ( ( nRcdExists_594 == 0 ) && ( nRcdDeleted_594 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1N7594( ) ;
            }
            else
            {
               if ( RcdFound594 != 0 )
               {
                  if ( ( nRcdDeleted_594 != 0 ) && ( nRcdExists_594 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1N7594( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_594 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1N7594( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_594 == 0 )
                  {
                     GXCCtl = "RECMOLLIN_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecMolLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_594_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecMolLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdUniCon_Internalname, GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecUniCod_Internalname, GXutil.rtrim( A2134RecUniCod)) ;
         httpContext.changePostValue( edtRecEstGK_Internalname, GXutil.ltrim( localUtil.ntoc( A2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCP_Internalname, GXutil.ltrim( localUtil.ntoc( A2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCPF_Internalname, GXutil.ltrim( localUtil.ntoc( A2669RecEstCPF, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCPPa_Internalname, GXutil.ltrim( localUtil.ntoc( A5105RecEstCPPa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstCosK_Internalname, GXutil.ltrim( localUtil.ntoc( A5106RecEstCosK, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom)) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstPar_Internalname, GXutil.ltrim( localUtil.ntoc( A6063RecEstPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecEstFin_Internalname, GXutil.ltrim( localUtil.ntoc( A8461RecEstFin, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2126RecMolLin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2119RecEstCP_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2134RecUniCod_"+sGXsfl_75_idx, GXutil.rtrim( Z2134RecUniCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2120RecEstGK_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5105RecEstCPPa_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z5105RecEstCPPa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5106RecEstCosK_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z5106RecEstCosK, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6063RecEstPar_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6063RecEstPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8461RecEstFin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z8461RecEstFin, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_75_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_75_idx, GXutil.rtrim( Z718PrdNom)) ;
         httpContext.changePostValue( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z742PrdUniCom_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z743PrdUniCon_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2119RecEstCP_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2669RecEstCPF_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O2669RecEstCPF, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T685PrdCanRes_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2120RecEstGK_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_594_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_594_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_594_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_594 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_594_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_594_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMOLLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMolLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUNICOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUNICON_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECUNICOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUniCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTGK_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstGK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCPF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCPPA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPPa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTCOSK_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCosK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVNOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTPAR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTFIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_75_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1N7594( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_594 = (short)(0) ;
      nIsMod_594 = (short)(0) ;
      nRcdDeleted_594 = (short)(0) ;
   }

   public void processLevel1N7597( )
   {
      /* Save parent mode. */
      sMode597 = Gx_mode ;
      processNestedLevel1N7594( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode597 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1N7597( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1N7597( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclse00");
         if ( AnyError == 0 )
         {
            confirmValues1N70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclse00");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N7597( )
   {
      /* Scan By routine */
      /* Using cursor T01N722 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      RcdFound597 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound597 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N7597( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound597 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound597 = (short)(1) ;
      }
   }

   public void scanEnd1N7597( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1N7597( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N7597( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N7597( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N7597( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N7597( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N7597( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N7597( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), true);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), true);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), true);
      edtBarCodLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodLan_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtRecMolCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMolCod_Enabled), 5, 0), true);
      edtRecPasTotC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPasTotC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPasTotC_Enabled), 5, 0), true);
   }

   public void zm1N7594( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2119RecEstCP = T01N73_A2119RecEstCP[0] ;
            Z2134RecUniCod = T01N73_A2134RecUniCod[0] ;
            Z2120RecEstGK = T01N73_A2120RecEstGK[0] ;
            Z5105RecEstCPPa = T01N73_A5105RecEstCPPa[0] ;
            Z5106RecEstCosK = T01N73_A5106RecEstCosK[0] ;
            Z6063RecEstPar = T01N73_A6063RecEstPar[0] ;
            Z8461RecEstFin = T01N73_A8461RecEstFin[0] ;
            Z719PrdNum = T01N73_A719PrdNum[0] ;
         }
         else
         {
            Z2119RecEstCP = A2119RecEstCP ;
            Z2134RecUniCod = A2134RecUniCod ;
            Z2120RecEstGK = A2120RecEstGK ;
            Z5105RecEstCPPa = A5105RecEstCPPa ;
            Z5106RecEstCosK = A5106RecEstCosK ;
            Z6063RecEstPar = A6063RecEstPar ;
            Z8461RecEstFin = A8461RecEstFin ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         Z795PrvNum = T01N75_A795PrvNum[0] ;
         Z718PrdNom = T01N75_A718PrdNom[0] ;
         Z704PrdExiAlm = T01N75_A704PrdExiAlm[0] ;
         Z705PrdExiCC = T01N75_A705PrdExiCC[0] ;
         Z742PrdUniCom = T01N75_A742PrdUniCom[0] ;
         Z743PrdUniCon = T01N75_A743PrdUniCon[0] ;
      }
      if ( GX_JID == -19 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2124RecMolCod = A2124RecMolCod ;
         Z2126RecMolLin = A2126RecMolLin ;
         Z2119RecEstCP = A2119RecEstCP ;
         Z2134RecUniCod = A2134RecUniCod ;
         Z2120RecEstGK = A2120RecEstGK ;
         Z5105RecEstCPPa = A5105RecEstCPPa ;
         Z5106RecEstCosK = A5106RecEstCosK ;
         Z6063RecEstPar = A6063RecEstPar ;
         Z8461RecEstFin = A8461RecEstFin ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z1032FonCod = A1032FonCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z795PrvNum = A795PrvNum ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z718PrdNom = A718PrdNom ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z742PrdUniCom = A742PrdUniCom ;
         Z743PrdUniCon = A743PrdUniCon ;
         Z794PrvNom = A794PrvNom ;
      }
   }

   public void standaloneNotModal1N7594( )
   {
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstGK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstGK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstGK_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecUniCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUniCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUniCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void standaloneModal1N7594( )
   {
      if ( true /* Level */ && ( isIns( )  || isDlt( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( DecimalUtil.compareTo(A2120RecEstGK, O2120RecEstGK) != 0 ) && isUpd( )  && true /* Level */ )
      {
         A2119RecEstCP = A2120RecEstGK.multiply(A2676RecPasTotC) ;
         n2119RecEstCP = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRecMolLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecMolLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMolLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtRecMolLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecMolLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMolLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1N7594( )
   {
      /* Using cursor T01N723 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin), A396EmprCod, A1032FonCod, Byte.valueOf(A2524DisComLin), A1056DisComCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound594 = (short)(1) ;
         A795PrvNum = T01N723_A795PrvNum[0] ;
         A2119RecEstCP = T01N723_A2119RecEstCP[0] ;
         n2119RecEstCP = T01N723_n2119RecEstCP[0] ;
         A685PrdCanRes = T01N723_A685PrdCanRes[0] ;
         A718PrdNom = T01N723_A718PrdNom[0] ;
         A2134RecUniCod = T01N723_A2134RecUniCod[0] ;
         n2134RecUniCod = T01N723_n2134RecUniCod[0] ;
         A2120RecEstGK = T01N723_A2120RecEstGK[0] ;
         n2120RecEstGK = T01N723_n2120RecEstGK[0] ;
         A5105RecEstCPPa = T01N723_A5105RecEstCPPa[0] ;
         n5105RecEstCPPa = T01N723_n5105RecEstCPPa[0] ;
         A5106RecEstCosK = T01N723_A5106RecEstCosK[0] ;
         n5106RecEstCosK = T01N723_n5106RecEstCosK[0] ;
         A794PrvNom = T01N723_A794PrvNom[0] ;
         n794PrvNom = T01N723_n794PrvNom[0] ;
         A704PrdExiAlm = T01N723_A704PrdExiAlm[0] ;
         A6063RecEstPar = T01N723_A6063RecEstPar[0] ;
         n6063RecEstPar = T01N723_n6063RecEstPar[0] ;
         A8461RecEstFin = T01N723_A8461RecEstFin[0] ;
         n8461RecEstFin = T01N723_n8461RecEstFin[0] ;
         A705PrdExiCC = T01N723_A705PrdExiCC[0] ;
         A719PrdNum = T01N723_A719PrdNum[0] ;
         n719PrdNum = T01N723_n719PrdNum[0] ;
         A742PrdUniCom = T01N723_A742PrdUniCom[0] ;
         A743PrdUniCon = T01N723_A743PrdUniCon[0] ;
         zm1N7594( -19) ;
      }
      pr_default.close(19);
      onLoadActions1N7594( ) ;
   }

   public void onLoadActions1N7594( )
   {
      if ( GXutil.strcmp(A2134RecUniCod, httpContext.getMessage( "GRS", "")) == 0 )
      {
         A2669RecEstCPF = A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         A2669RecEstCPF = A2119RecEstCP ;
      }
      O2669RecEstCPF = A2669RecEstCPF ;
      if ( isDlt( )  && ( ( AV34Flag1 == 1 ) ) )
      {
         A685PrdCanRes = O685PrdCanRes.subtract(O2669RecEstCPF) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( AV34Flag1 == 1 ) ) && ( ( AV34Flag1 == 1 ) ) )
         {
            A685PrdCanRes = O685PrdCanRes.subtract(O2669RecEstCPF) ;
         }
         else
         {
            if ( isUpd( )  && ( ( AV34Flag1 == 1 ) ) && ! ( ( AV34Flag1 == 1 ) ) )
            {
               A685PrdCanRes = O685PrdCanRes.add(A2669RecEstCPF) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( AV34Flag1 == 1 ) ) )
               {
                  A685PrdCanRes = O685PrdCanRes.add(A2669RecEstCPF).subtract(O2669RecEstCPF) ;
               }
            }
         }
      }
   }

   public void checkExtendedTable1N7594( )
   {
      nIsDirty_594 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1N7594( ) ;
      /* Using cursor T01N75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A795PrvNum = T01N75_A795PrvNum[0] ;
      A685PrdCanRes = T01N75_A685PrdCanRes[0] ;
      A718PrdNom = T01N75_A718PrdNom[0] ;
      A704PrdExiAlm = T01N75_A704PrdExiAlm[0] ;
      A705PrdExiCC = T01N75_A705PrdExiCC[0] ;
      A742PrdUniCom = T01N75_A742PrdUniCom[0] ;
      A743PrdUniCon = T01N75_A743PrdUniCon[0] ;
      nIsDirty_594 = (short)(1) ;
      O685PrdCanRes = A685PrdCanRes ;
      pr_default.close(3);
      /* Using cursor T01N76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01N76_A794PrvNom[0] ;
      n794PrvNom = T01N76_n794PrvNom[0] ;
      pr_default.close(4);
      if ( GXutil.strcmp(A2134RecUniCod, httpContext.getMessage( "GRS", "")) == 0 )
      {
         nIsDirty_594 = (short)(1) ;
         A2669RecEstCPF = A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         nIsDirty_594 = (short)(1) ;
         A2669RecEstCPF = A2119RecEstCP ;
      }
      if ( isDlt( )  && ( ( AV34Flag1 == 1 ) ) )
      {
         nIsDirty_594 = (short)(1) ;
         A685PrdCanRes = O685PrdCanRes.subtract(O2669RecEstCPF) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( AV34Flag1 == 1 ) ) && ( ( AV34Flag1 == 1 ) ) )
         {
            nIsDirty_594 = (short)(1) ;
            A685PrdCanRes = O685PrdCanRes.subtract(O2669RecEstCPF) ;
         }
         else
         {
            if ( isUpd( )  && ( ( AV34Flag1 == 1 ) ) && ! ( ( AV34Flag1 == 1 ) ) )
            {
               nIsDirty_594 = (short)(1) ;
               A685PrdCanRes = O685PrdCanRes.add(A2669RecEstCPF) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( AV34Flag1 == 1 ) ) )
               {
                  nIsDirty_594 = (short)(1) ;
                  A685PrdCanRes = O685PrdCanRes.add(A2669RecEstCPF).subtract(O2669RecEstCPF) ;
               }
            }
         }
      }
      if ( ( DecimalUtil.compareTo(A685PrdCanRes, A704PrdExiAlm) > 0 ) && ( AV34Flag1 == 1 ) && ( AV33CocinaC == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay stock suficiente en ALMACEN GENERAL", ""), 0, "");
      }
      if ( ( DecimalUtil.compareTo(A685PrdCanRes, A705PrdExiCC) > 0 ) && ( AV34Flag1 == 1 ) && ( AV33CocinaC == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay stock suficiente en CUARTO COLORES", ""), 0, "");
      }
   }

   public void closeExtendedTableCursors1N7594( )
   {
      pr_default.close(2);
      pr_default.close(4);
   }

   public void enableDisable1N7594( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01N75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A795PrvNum = T01N75_A795PrvNum[0] ;
      A685PrdCanRes = T01N75_A685PrdCanRes[0] ;
      A718PrdNom = T01N75_A718PrdNom[0] ;
      A704PrdExiAlm = T01N75_A704PrdExiAlm[0] ;
      A705PrdExiCC = T01N75_A705PrdExiCC[0] ;
      A742PrdUniCom = T01N75_A742PrdUniCom[0] ;
      A743PrdUniCon = T01N75_A743PrdUniCon[0] ;
      O685PrdCanRes = A685PrdCanRes ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void gxload_21( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T01N724 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01N724_A794PrvNom[0] ;
      n794PrvNom = T01N724_n794PrvNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1N7594( )
   {
      /* Using cursor T01N725 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound594 = (short)(1) ;
      }
      else
      {
         RcdFound594 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1N7594( )
   {
      /* Using cursor T01N73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01N73_A129BarCod[0] == A129BarCod ) && ( T01N73_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01N73_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01N73_A2124RecMolCod[0] == A2124RecMolCod ) && ( GXutil.strcmp(T01N73_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N73_A1032FonCod[0], A1032FonCod) == 0 ) && ( T01N73_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T01N73_A1056DisComCod[0], A1056DisComCod) == 0 ) )
      {
         zm1N7594( 19) ;
         RcdFound594 = (short)(1) ;
         initializeNonKey1N7594( ) ;
         A2126RecMolLin = T01N73_A2126RecMolLin[0] ;
         A2119RecEstCP = T01N73_A2119RecEstCP[0] ;
         n2119RecEstCP = T01N73_n2119RecEstCP[0] ;
         A2134RecUniCod = T01N73_A2134RecUniCod[0] ;
         n2134RecUniCod = T01N73_n2134RecUniCod[0] ;
         A2120RecEstGK = T01N73_A2120RecEstGK[0] ;
         n2120RecEstGK = T01N73_n2120RecEstGK[0] ;
         A5105RecEstCPPa = T01N73_A5105RecEstCPPa[0] ;
         n5105RecEstCPPa = T01N73_n5105RecEstCPPa[0] ;
         A5106RecEstCosK = T01N73_A5106RecEstCosK[0] ;
         n5106RecEstCosK = T01N73_n5106RecEstCosK[0] ;
         A6063RecEstPar = T01N73_A6063RecEstPar[0] ;
         n6063RecEstPar = T01N73_n6063RecEstPar[0] ;
         A8461RecEstFin = T01N73_A8461RecEstFin[0] ;
         n8461RecEstFin = T01N73_n8461RecEstFin[0] ;
         A719PrdNum = T01N73_A719PrdNum[0] ;
         n719PrdNum = T01N73_n719PrdNum[0] ;
         O2119RecEstCP = A2119RecEstCP ;
         n2119RecEstCP = false ;
         O2120RecEstGK = A2120RecEstGK ;
         n2120RecEstGK = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z2124RecMolCod = A2124RecMolCod ;
         Z2126RecMolLin = A2126RecMolLin ;
         sMode594 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N7594( ) ;
         load1N7594( ) ;
         Gx_mode = sMode594 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound594 = (short)(0) ;
         initializeNonKey1N7594( ) ;
         sMode594 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N7594( ) ;
         Gx_mode = sMode594 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1N7594( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1N7594( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2119RecEstCP, T01N72_A2119RecEstCP[0]) != 0 ) || ( GXutil.strcmp(Z2134RecUniCod, T01N72_A2134RecUniCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z2120RecEstGK, T01N72_A2120RecEstGK[0]) != 0 ) || ( DecimalUtil.compareTo(Z5105RecEstCPPa, T01N72_A5105RecEstCPPa[0]) != 0 ) || ( DecimalUtil.compareTo(Z5106RecEstCosK, T01N72_A5106RecEstCosK[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6063RecEstPar != T01N72_A6063RecEstPar[0] ) || ( DecimalUtil.compareTo(Z8461RecEstFin, T01N72_A8461RecEstFin[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01N72_A719PrdNum[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2119RecEstCP, T01N72_A2119RecEstCP[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecEstCP");
               GXutil.writeLogRaw("Old: ",Z2119RecEstCP);
               GXutil.writeLogRaw("Current: ",T01N72_A2119RecEstCP[0]);
            }
            if ( GXutil.strcmp(Z2134RecUniCod, T01N72_A2134RecUniCod[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecUniCod");
               GXutil.writeLogRaw("Old: ",Z2134RecUniCod);
               GXutil.writeLogRaw("Current: ",T01N72_A2134RecUniCod[0]);
            }
            if ( DecimalUtil.compareTo(Z2120RecEstGK, T01N72_A2120RecEstGK[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecEstGK");
               GXutil.writeLogRaw("Old: ",Z2120RecEstGK);
               GXutil.writeLogRaw("Current: ",T01N72_A2120RecEstGK[0]);
            }
            if ( DecimalUtil.compareTo(Z5105RecEstCPPa, T01N72_A5105RecEstCPPa[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecEstCPPa");
               GXutil.writeLogRaw("Old: ",Z5105RecEstCPPa);
               GXutil.writeLogRaw("Current: ",T01N72_A5105RecEstCPPa[0]);
            }
            if ( DecimalUtil.compareTo(Z5106RecEstCosK, T01N72_A5106RecEstCosK[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecEstCosK");
               GXutil.writeLogRaw("Old: ",Z5106RecEstCosK);
               GXutil.writeLogRaw("Current: ",T01N72_A5106RecEstCosK[0]);
            }
            if ( Z6063RecEstPar != T01N72_A6063RecEstPar[0] )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecEstPar");
               GXutil.writeLogRaw("Old: ",Z6063RecEstPar);
               GXutil.writeLogRaw("Current: ",T01N72_A6063RecEstPar[0]);
            }
            if ( DecimalUtil.compareTo(Z8461RecEstFin, T01N72_A8461RecEstFin[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"RecEstFin");
               GXutil.writeLogRaw("Old: ",Z8461RecEstFin);
               GXutil.writeLogRaw("Current: ",T01N72_A8461RecEstFin[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01N72_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01N72_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01N726 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(22) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z795PrvNum != T01N726_A795PrvNum[0] ) || ( GXutil.strcmp(Z718PrdNom, T01N726_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, T01N726_A704PrdExiAlm[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01N726_A705PrdExiCC[0]) != 0 ) || ( Z742PrdUniCom != T01N726_A742PrdUniCom[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z743PrdUniCon != T01N726_A743PrdUniCon[0] ) )
         {
            if ( Z795PrvNum != T01N726_A795PrvNum[0] )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01N726_A795PrvNum[0]);
            }
            if ( GXutil.strcmp(Z718PrdNom, T01N726_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01N726_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z704PrdExiAlm, T01N726_A704PrdExiAlm[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrdExiAlm");
               GXutil.writeLogRaw("Old: ",Z704PrdExiAlm);
               GXutil.writeLogRaw("Current: ",T01N726_A704PrdExiAlm[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01N726_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01N726_A705PrdExiCC[0]);
            }
            if ( Z742PrdUniCom != T01N726_A742PrdUniCom[0] )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrdUniCom");
               GXutil.writeLogRaw("Old: ",Z742PrdUniCom);
               GXutil.writeLogRaw("Current: ",T01N726_A742PrdUniCom[0]);
            }
            if ( Z743PrdUniCon != T01N726_A743PrdUniCon[0] )
            {
               GXutil.writeLogln("tclse00:[seudo value changed for attri]"+"PrdUniCon");
               GXutil.writeLogRaw("Old: ",Z743PrdUniCon);
               GXutil.writeLogRaw("Current: ",T01N726_A743PrdUniCon[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N7594( )
   {
      beforeValidate1N7594( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N7594( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N7594( 0) ;
         checkOptimisticConcurrency1N7594( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N7594( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N7594( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N727 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin), Boolean.valueOf(n2119RecEstCP), A2119RecEstCP, Boolean.valueOf(n2134RecUniCod), A2134RecUniCod, Boolean.valueOf(n2120RecEstGK), A2120RecEstGK, Boolean.valueOf(n5105RecEstCPPa), A5105RecEstCPPa, Boolean.valueOf(n5106RecEstCosK), A5106RecEstCosK, Boolean.valueOf(n6063RecEstPar), Short.valueOf(A6063RecEstPar), Boolean.valueOf(n8461RecEstFin), A8461RecEstFin, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A1032FonCod, Byte.valueOf(A2524DisComLin), A1056DisComCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPRD");
                  if ( (pr_default.getStatus(23) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11N7594( ) ;
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
            load1N7594( ) ;
         }
         endLevel1N7594( ) ;
      }
      closeExtendedTableCursors1N7594( ) ;
   }

   public void update1N7594( )
   {
      beforeValidate1N7594( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N7594( ) ;
      }
      if ( ( nIsMod_594 != 0 ) || ( nIsDirty_594 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1N7594( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1N7594( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1N7594( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01N728 */
                     pr_default.execute(24, new Object[] {Boolean.valueOf(n2119RecEstCP), A2119RecEstCP, Boolean.valueOf(n2134RecUniCod), A2134RecUniCod, Boolean.valueOf(n2120RecEstGK), A2120RecEstGK, Boolean.valueOf(n5105RecEstCPPa), A5105RecEstCPPa, Boolean.valueOf(n5106RecEstCosK), A5106RecEstCosK, Boolean.valueOf(n6063RecEstPar), Short.valueOf(A6063RecEstPar), Boolean.valueOf(n8461RecEstFin), A8461RecEstFin, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPRD");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPRD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1N7594( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && ( DecimalUtil.compareTo(A2119RecEstCP, O2119RecEstCP) != 0 ) )
                        {
                           AV35Inc_obs = httpContext.getMessage( httpContext.getMessage( "Linea ", ""), "") + GXutil.str( A2126RecMolLin, 2, 0) + httpContext.getMessage( httpContext.getMessage( " Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( " Cant Old= ", ""), "") + GXutil.trim( GXutil.str( O2119RecEstCP, 10, 3)) + httpContext.getMessage( httpContext.getMessage( " Cant New= ", ""), "") + GXutil.str( A2119RecEstCP, 10, 3) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A2119RecEstCP, O2119RecEstCP) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV8UsurCod, AV12Station, AV35Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11N7594( ) ;
                           getByPrimaryKey1N7594( ) ;
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
            endLevel1N7594( ) ;
         }
      }
      closeExtendedTableCursors1N7594( ) ;
   }

   public void deferredUpdate1N7594( )
   {
   }

   public void delete1N7594( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N7594( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N7594( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N7594( ) ;
         afterConfirm1N7594( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N7594( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01N729 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPRD");
               if ( AnyError == 0 )
               {
                  updateTablesN11N7594( ) ;
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
      sMode594 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N7594( ) ;
      Gx_mode = sMode594 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N7594( )
   {
      standaloneModal1N7594( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01N730 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Z795PrvNum = T01N730_A795PrvNum[0] ;
         Z718PrdNom = T01N730_A718PrdNom[0] ;
         Z704PrdExiAlm = T01N730_A704PrdExiAlm[0] ;
         Z705PrdExiCC = T01N730_A705PrdExiCC[0] ;
         Z742PrdUniCom = T01N730_A742PrdUniCom[0] ;
         Z743PrdUniCon = T01N730_A743PrdUniCon[0] ;
         A795PrvNum = T01N730_A795PrvNum[0] ;
         A685PrdCanRes = T01N730_A685PrdCanRes[0] ;
         A718PrdNom = T01N730_A718PrdNom[0] ;
         A704PrdExiAlm = T01N730_A704PrdExiAlm[0] ;
         A705PrdExiCC = T01N730_A705PrdExiCC[0] ;
         A742PrdUniCom = T01N730_A742PrdUniCom[0] ;
         A743PrdUniCon = T01N730_A743PrdUniCon[0] ;
         O685PrdCanRes = A685PrdCanRes ;
         pr_default.close(26);
         /* Using cursor T01N731 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01N731_A794PrvNom[0] ;
         n794PrvNom = T01N731_n794PrvNom[0] ;
         pr_default.close(27);
         if ( GXutil.strcmp(A2134RecUniCod, httpContext.getMessage( "GRS", "")) == 0 )
         {
            A2669RecEstCPF = A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            A2669RecEstCPF = A2119RecEstCP ;
         }
         if ( isDlt( )  && ( ( AV34Flag1 == 1 ) ) )
         {
            A685PrdCanRes = O685PrdCanRes.subtract(O2669RecEstCPF) ;
         }
         else
         {
            if ( isUpd( )  && ! ( ( AV34Flag1 == 1 ) ) && ( ( AV34Flag1 == 1 ) ) )
            {
               A685PrdCanRes = O685PrdCanRes.subtract(O2669RecEstCPF) ;
            }
            else
            {
               if ( isUpd( )  && ( ( AV34Flag1 == 1 ) ) && ! ( ( AV34Flag1 == 1 ) ) )
               {
                  A685PrdCanRes = O685PrdCanRes.add(A2669RecEstCPF) ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( AV34Flag1 == 1 ) ) )
                  {
                     A685PrdCanRes = O685PrdCanRes.add(A2669RecEstCPF).subtract(O2669RecEstCPF) ;
                  }
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01N732 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void updateTablesN11N7594( )
   {
      /* Using cursor T01N733 */
      pr_default.execute(29, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1N7594( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(22);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N7594( )
   {
      /* Scan By routine */
      /* Using cursor T01N734 */
      pr_default.execute(30, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2124RecMolCod), A396EmprCod, A1032FonCod, Byte.valueOf(A2524DisComLin), A1056DisComCod});
      RcdFound594 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound594 = (short)(1) ;
         A2126RecMolLin = T01N734_A2126RecMolLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N7594( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound594 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound594 = (short)(1) ;
         A2126RecMolLin = T01N734_A2126RecMolLin[0] ;
      }
   }

   public void scanEnd1N7594( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1N7594( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N7594( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N7594( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N7594( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N7594( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N7594( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N7594( )
   {
      edtRecMolLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMolLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMolLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdUniCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCom_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdUniCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCon_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecUniCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUniCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUniCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstGK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstGK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstGK_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCP_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstCPF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstCPF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCPF_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstCPPa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstCPPa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCPPa_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstCosK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstCosK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstCosK_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstFin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1N7594( )
   {
   }

   public void send_integrity_lvl_hashes1N7597( )
   {
   }

   public void subsflControlProps_75594( )
   {
      edtavnRcdDeleted_594_Internalname = "vNRCDDELETED_594_"+sGXsfl_75_idx ;
      edtRecMolLin_Internalname = "RECMOLLIN_"+sGXsfl_75_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_75_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_75_idx ;
      edtPrdUniCom_Internalname = "PRDUNICOM_"+sGXsfl_75_idx ;
      edtPrdUniCon_Internalname = "PRDUNICON_"+sGXsfl_75_idx ;
      edtRecUniCod_Internalname = "RECUNICOD_"+sGXsfl_75_idx ;
      edtRecEstGK_Internalname = "RECESTGK_"+sGXsfl_75_idx ;
      edtRecEstCP_Internalname = "RECESTCP_"+sGXsfl_75_idx ;
      edtRecEstCPF_Internalname = "RECESTCPF_"+sGXsfl_75_idx ;
      edtRecEstCPPa_Internalname = "RECESTCPPA_"+sGXsfl_75_idx ;
      edtRecEstCosK_Internalname = "RECESTCOSK_"+sGXsfl_75_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_75_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_75_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_75_idx ;
      edtRecEstPar_Internalname = "RECESTPAR_"+sGXsfl_75_idx ;
      edtRecEstFin_Internalname = "RECESTFIN_"+sGXsfl_75_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75594( )
   {
      edtavnRcdDeleted_594_Internalname = "vNRCDDELETED_594_"+sGXsfl_75_fel_idx ;
      edtRecMolLin_Internalname = "RECMOLLIN_"+sGXsfl_75_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_75_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_75_fel_idx ;
      edtPrdUniCom_Internalname = "PRDUNICOM_"+sGXsfl_75_fel_idx ;
      edtPrdUniCon_Internalname = "PRDUNICON_"+sGXsfl_75_fel_idx ;
      edtRecUniCod_Internalname = "RECUNICOD_"+sGXsfl_75_fel_idx ;
      edtRecEstGK_Internalname = "RECESTGK_"+sGXsfl_75_fel_idx ;
      edtRecEstCP_Internalname = "RECESTCP_"+sGXsfl_75_fel_idx ;
      edtRecEstCPF_Internalname = "RECESTCPF_"+sGXsfl_75_fel_idx ;
      edtRecEstCPPa_Internalname = "RECESTCPPA_"+sGXsfl_75_fel_idx ;
      edtRecEstCosK_Internalname = "RECESTCOSK_"+sGXsfl_75_fel_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_75_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_75_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_75_fel_idx ;
      edtRecEstPar_Internalname = "RECESTPAR_"+sGXsfl_75_fel_idx ;
      edtRecEstFin_Internalname = "RECESTFIN_"+sGXsfl_75_fel_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1N7594( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75594( ) ;
      sendRow1N7594( ) ;
   }

   public void sendRow1N7594( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_594_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_594_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_594), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_594), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_594_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_594_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMolLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2126RecMolLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecMolLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecMolLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUniCom_Internalname,GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdUniCom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9") : localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdUniCom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdUniCom_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUniCon_Internalname,GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdUniCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdUniCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdUniCon_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecUniCod_Internalname,GXutil.rtrim( A2134RecUniCod),GXutil.rtrim( localUtil.format( A2134RecUniCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecUniCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecUniCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstGK_Internalname,GXutil.ltrim( localUtil.ntoc( A2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstGK_Enabled!=0) ? localUtil.format( A2120RecEstGK, "ZZZZZ9.999") : localUtil.format( A2120RecEstGK, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstGK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstGK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstCP_Internalname,GXutil.ltrim( localUtil.ntoc( A2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstCP_Enabled!=0) ? localUtil.format( A2119RecEstCP, "ZZZZZ9.999") : localUtil.format( A2119RecEstCP, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstCP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstCP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstCPF_Internalname,GXutil.ltrim( localUtil.ntoc( A2669RecEstCPF, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstCPF_Enabled!=0) ? localUtil.format( A2669RecEstCPF, "ZZZZZZ9.9999") : localUtil.format( A2669RecEstCPF, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstCPF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstCPF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstCPPa_Internalname,GXutil.ltrim( localUtil.ntoc( A5105RecEstCPPa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstCPPa_Enabled!=0) ? localUtil.format( A5105RecEstCPPa, "ZZZZZ9.99") : localUtil.format( A5105RecEstCPPa, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstCPPa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstCPPa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstCosK_Internalname,GXutil.ltrim( localUtil.ntoc( A5106RecEstCosK, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstCosK_Enabled!=0) ? localUtil.format( A5106RecEstCosK, "ZZZZ9.9999") : localUtil.format( A5106RecEstCosK, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstCosK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstCosK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrvNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdCanRes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdExiAlm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstPar_Internalname,GXutil.ltrim( localUtil.ntoc( A6063RecEstPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6063RecEstPar), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6063RecEstPar), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_594_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstFin_Internalname,GXutil.ltrim( localUtil.ntoc( A8461RecEstFin, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstFin_Enabled!=0) ? localUtil.format( A8461RecEstFin, "ZZZZZ9.999") : localUtil.format( A8461RecEstFin, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstFin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(edtPrdExiCC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1N7594( ) ;
      GXCCtl = "Z2126RecMolLin_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2119RecEstCP_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2134RecUniCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2134RecUniCod));
      GXCCtl = "Z2120RecEstGK_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5105RecEstCPPa_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5105RecEstCPPa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5106RecEstCosK_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5106RecEstCosK, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6063RecEstPar_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6063RecEstPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8461RecEstFin_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8461RecEstFin, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z795PrvNum_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z718PrdNom_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z718PrdNom));
      GXCCtl = "Z704PrdExiAlm_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z705PrdExiCC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z742PrdUniCom_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z743PrdUniCon_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2119RecEstCP_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2119RecEstCP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2669RecEstCPF_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2669RecEstCPF, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O685PrdCanRes_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2120RecEstGK_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2120RecEstGK, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_594_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_594_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_594_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_594, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_594_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_594_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMOLLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMolLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUNICOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUNICON_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECUNICOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUniCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTGK_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstGK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTCP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTCPF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTCPPA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPPa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTCOSK_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCosK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNOM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTPAR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTFIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_75_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1N7594( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75594( ) ;
      edtavnRcdDeleted_594_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_594_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecMolLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMOLLIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdUniCom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUNICOM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdUniCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUNICON_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecUniCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECUNICOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstGK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTGK_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCP_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstCPF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCPF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstCPPa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCPPA_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstCosK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTCOSK_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrvNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNOM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTPAR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTFIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_75_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_594_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_594_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_594");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_594_Internalname ;
         wbErr = true ;
         nRcdDeleted_594 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_594 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_594_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMolLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMolLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "RECMOLLIN_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecMolLin_Internalname ;
         wbErr = true ;
         A2126RecMolLin = (byte)(0) ;
      }
      else
      {
         A2126RecMolLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMolLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2134RecUniCod = GXutil.upper( httpContext.cgiGet( edtRecUniCod_Internalname)) ;
      n2134RecUniCod = false ;
      A2120RecEstGK = localUtil.ctond( httpContext.cgiGet( edtRecEstGK_Internalname)) ;
      n2120RecEstGK = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecEstCP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecEstCP_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "RECESTCP_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecEstCP_Internalname ;
         wbErr = true ;
         A2119RecEstCP = DecimalUtil.ZERO ;
         n2119RecEstCP = false ;
      }
      else
      {
         A2119RecEstCP = localUtil.ctond( httpContext.cgiGet( edtRecEstCP_Internalname)) ;
         n2119RecEstCP = false ;
      }
      A2669RecEstCPF = localUtil.ctond( httpContext.cgiGet( edtRecEstCPF_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecEstCPPa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecEstCPPa_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "RECESTCPPA_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecEstCPPa_Internalname ;
         wbErr = true ;
         A5105RecEstCPPa = DecimalUtil.ZERO ;
         n5105RecEstCPPa = false ;
      }
      else
      {
         A5105RecEstCPPa = localUtil.ctond( httpContext.cgiGet( edtRecEstCPPa_Internalname)) ;
         n5105RecEstCPPa = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecEstCosK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecEstCosK_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECESTCOSK_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecEstCosK_Internalname ;
         wbErr = true ;
         A5106RecEstCosK = DecimalUtil.ZERO ;
         n5106RecEstCosK = false ;
      }
      else
      {
         A5106RecEstCosK = localUtil.ctond( httpContext.cgiGet( edtRecEstCosK_Internalname)) ;
         n5106RecEstCosK = false ;
      }
      A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
      n794PrvNom = false ;
      A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
      A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecEstPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecEstPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "RECESTPAR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecEstPar_Internalname ;
         wbErr = true ;
         A6063RecEstPar = (short)(0) ;
         n6063RecEstPar = false ;
      }
      else
      {
         A6063RecEstPar = (short)(localUtil.ctol( httpContext.cgiGet( edtRecEstPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6063RecEstPar = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecEstFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecEstFin_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "RECESTFIN_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecEstFin_Internalname ;
         wbErr = true ;
         A8461RecEstFin = DecimalUtil.ZERO ;
         n8461RecEstFin = false ;
      }
      else
      {
         A8461RecEstFin = localUtil.ctond( httpContext.cgiGet( edtRecEstFin_Internalname)) ;
         n8461RecEstFin = false ;
      }
      A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
      GXCCtl = "Z2126RecMolLin_" + sGXsfl_75_idx ;
      Z2126RecMolLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2119RecEstCP_" + sGXsfl_75_idx ;
      Z2119RecEstCP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2134RecUniCod_" + sGXsfl_75_idx ;
      Z2134RecUniCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2120RecEstGK_" + sGXsfl_75_idx ;
      Z2120RecEstGK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5105RecEstCPPa_" + sGXsfl_75_idx ;
      Z5105RecEstCPPa = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5106RecEstCosK_" + sGXsfl_75_idx ;
      Z5106RecEstCosK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6063RecEstPar_" + sGXsfl_75_idx ;
      Z6063RecEstPar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8461RecEstFin_" + sGXsfl_75_idx ;
      Z8461RecEstFin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_75_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z795PrvNum_" + sGXsfl_75_idx ;
      Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z718PrdNom_" + sGXsfl_75_idx ;
      Z718PrdNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z704PrdExiAlm_" + sGXsfl_75_idx ;
      Z704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z705PrdExiCC_" + sGXsfl_75_idx ;
      Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z742PrdUniCom_" + sGXsfl_75_idx ;
      Z742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z743PrdUniCon_" + sGXsfl_75_idx ;
      Z743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z795PrvNum_" + sGXsfl_75_idx ;
      A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2119RecEstCP_" + sGXsfl_75_idx ;
      O2119RecEstCP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2669RecEstCPF_" + sGXsfl_75_idx ;
      O2669RecEstCPF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O685PrdCanRes_" + sGXsfl_75_idx ;
      O685PrdCanRes = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2120RecEstGK_" + sGXsfl_75_idx ;
      O2120RecEstGK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_594_" + sGXsfl_75_idx ;
      nRcdDeleted_594 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_594_" + sGXsfl_75_idx ;
      nRcdExists_594 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_594_" + sGXsfl_75_idx ;
      nIsMod_594 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdExiCC_Enabled = edtPrdExiCC_Enabled ;
      defedtPrdExiAlm_Enabled = edtPrdExiAlm_Enabled ;
      defedtPrdCanRes_Enabled = edtPrdCanRes_Enabled ;
      defedtRecEstGK_Enabled = edtRecEstGK_Enabled ;
      defedtRecUniCod_Enabled = edtRecUniCod_Enabled ;
      defedtRecMolLin_Enabled = edtRecMolLin_Enabled ;
   }

   public void confirmValues1N70( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75594( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75594( ) ;
         httpContext.changePostValue( "Z2126RecMolLin_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2126RecMolLin_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2126RecMolLin_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2119RecEstCP_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2119RecEstCP_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2119RecEstCP_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2134RecUniCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2134RecUniCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2134RecUniCod_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2120RecEstGK_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2120RecEstGK_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2120RecEstGK_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z5105RecEstCPPa_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z5105RecEstCPPa_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5105RecEstCPPa_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z5106RecEstCosK_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z5106RecEstCosK_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5106RecEstCosK_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6063RecEstPar_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6063RecEstPar_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6063RecEstPar_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z8461RecEstFin_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z8461RecEstFin_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8461RecEstFin_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z795PrvNum_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z795PrvNum_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z718PrdNom_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z718PrdNom_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z704PrdExiAlm_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z705PrdExiCC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z705PrdExiCC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z742PrdUniCom_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z742PrdUniCom_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z742PrdUniCom_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z743PrdUniCon_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z743PrdUniCon_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z743PrdUniCon_"+sGXsfl_75_idx) ;
      }
      httpContext.changePostValue( "O2119RecEstCP", httpContext.cgiGet( "T2119RecEstCP")) ;
      httpContext.deletePostValue( "T2119RecEstCP") ;
      httpContext.changePostValue( "O2669RecEstCPF", httpContext.cgiGet( "T2669RecEstCPF")) ;
      httpContext.deletePostValue( "T2669RecEstCPF") ;
      httpContext.changePostValue( "O685PrdCanRes", httpContext.cgiGet( "T685PrdCanRes")) ;
      httpContext.deletePostValue( "T685PrdCanRes") ;
      httpContext.changePostValue( "O2120RecEstGK", httpContext.cgiGet( "T2120RecEstGK")) ;
      httpContext.deletePostValue( "T2120RecEstGK") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclse00", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2524DisComLin,2,0)),GXutil.URLEncode(GXutil.rtrim(A1056DisComCod)),GXutil.URLEncode(GXutil.rtrim(A1032FonCod)),GXutil.URLEncode(GXutil.ltrimstr(A2124RecMolCod,2,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","DisComLin","DisComCod","FonCod","RecMolCod"}) +"\">") ;
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
      forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
      if ( isUpd( )  )
      {
         forbiddenHiddens2.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
      }
      app.GxWebStd.gx_hidden_field( httpContext, "hsh2", httpContext.getEncryptedSignature( forbiddenHiddens2.toString(), GXKey));
      GXutil.writeLogInfo("tclse00:[ SendCondSecurityCheck value for]"+forbiddenHiddens2.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2524DisComLin", GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1056DisComCod", GXutil.rtrim( Z1056DisComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1032FonCod", GXutil.rtrim( Z1032FonCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2124RecMolCod", GXutil.ltrim( localUtil.ntoc( Z2124RecMolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG1", GXutil.ltrim( localUtil.ntoc( AV34Flag1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV35Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vCOCINAC", GXutil.ltrim( localUtil.ntoc( AV33CocinaC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tclse00", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2524DisComLin,2,0)),GXutil.URLEncode(GXutil.rtrim(A1056DisComCod)),GXutil.URLEncode(GXutil.rtrim(A1032FonCod)),GXutil.URLEncode(GXutil.ltrimstr(A2124RecMolCod,2,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","DisComLin","DisComCod","FonCod","RecMolCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCLSE00" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Productos desde Cierre", "") ;
   }

   public void initializeNonKey1N7597( )
   {
   }

   public void initAll1N7597( )
   {
      initializeNonKey1N7597( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1N7594( )
   {
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A2119RecEstCP = DecimalUtil.ZERO ;
      n2119RecEstCP = false ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV35Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
      A2669RecEstCPF = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A742PrdUniCom = (byte)(0) ;
      A743PrdUniCon = (byte)(0) ;
      A2134RecUniCod = "" ;
      n2134RecUniCod = false ;
      A2120RecEstGK = DecimalUtil.ZERO ;
      n2120RecEstGK = false ;
      A5105RecEstCPPa = DecimalUtil.ZERO ;
      n5105RecEstCPPa = false ;
      A5106RecEstCosK = DecimalUtil.ZERO ;
      n5106RecEstCosK = false ;
      A794PrvNom = "" ;
      n794PrvNom = false ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A6063RecEstPar = (short)(0) ;
      n6063RecEstPar = false ;
      A8461RecEstFin = DecimalUtil.ZERO ;
      n8461RecEstFin = false ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      O2119RecEstCP = A2119RecEstCP ;
      n2119RecEstCP = false ;
      O2669RecEstCPF = A2669RecEstCPF ;
      O685PrdCanRes = A685PrdCanRes ;
      O2120RecEstGK = A2120RecEstGK ;
      n2120RecEstGK = false ;
      Z2119RecEstCP = DecimalUtil.ZERO ;
      Z2134RecUniCod = "" ;
      Z2120RecEstGK = DecimalUtil.ZERO ;
      Z5105RecEstCPPa = DecimalUtil.ZERO ;
      Z5106RecEstCosK = DecimalUtil.ZERO ;
      Z6063RecEstPar = (short)(0) ;
      Z8461RecEstFin = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z795PrvNum = 0 ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z742PrdUniCom = (byte)(0) ;
      Z743PrdUniCon = (byte)(0) ;
   }

   public void initAll1N7594( )
   {
      A2126RecMolLin = (byte)(0) ;
      initializeNonKey1N7594( ) ;
   }

   public void standaloneModalInsert1N7594( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415101666", true, true);
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
      httpContext.AddJavascriptSource("tclse00.js", "?202682415101666", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties594( )
   {
      edtPrdExiCC_Enabled = defedtPrdExiCC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdExiAlm_Enabled = defedtPrdExiAlm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtPrdCanRes_Enabled = defedtPrdCanRes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecEstGK_Enabled = defedtRecEstGK_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstGK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstGK_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecUniCod_Enabled = defedtRecUniCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUniCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUniCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtRecMolLin_Enabled = defedtRecMolLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMolLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMolLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_594, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_594_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2126RecMolLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMolLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUniCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2134RecUniCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUniCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2120RecEstGK, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstGK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2119RecEstCP, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2669RecEstCPF, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5105RecEstCPPa, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCPPa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5106RecEstCosK, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstCosK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6063RecEstPar, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8461RecEstFin, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFonCod_Internalname = "FONCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarCodLan_Internalname = "BARCODLAN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtRecMolCod_Internalname = "RECMOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtRecPasTotC_Internalname = "RECPASTOTC" ;
      edtavnRcdDeleted_594_Internalname = "vNRCDDELETED_594" ;
      edtRecMolLin_Internalname = "RECMOLLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdUniCom_Internalname = "PRDUNICOM" ;
      edtPrdUniCon_Internalname = "PRDUNICON" ;
      edtRecUniCod_Internalname = "RECUNICOD" ;
      edtRecEstGK_Internalname = "RECESTGK" ;
      edtRecEstCP_Internalname = "RECESTCP" ;
      edtRecEstCPF_Internalname = "RECESTCPF" ;
      edtRecEstCPPa_Internalname = "RECESTCPPA" ;
      edtRecEstCosK_Internalname = "RECESTCOSK" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtRecEstPar_Internalname = "RECESTPAR" ;
      edtRecEstFin_Internalname = "RECESTFIN" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Productos desde Cierre", "") );
      edtPrdExiCC_Jsonclick = "" ;
      edtRecEstFin_Jsonclick = "" ;
      edtRecEstPar_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtRecEstCosK_Jsonclick = "" ;
      edtRecEstCPPa_Jsonclick = "" ;
      edtRecEstCPF_Jsonclick = "" ;
      edtRecEstCP_Jsonclick = "" ;
      edtRecEstGK_Jsonclick = "" ;
      edtRecUniCod_Jsonclick = "" ;
      edtPrdUniCon_Jsonclick = "" ;
      edtPrdUniCom_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRecMolLin_Jsonclick = "" ;
      edtavnRcdDeleted_594_Jsonclick = "" ;
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
      edtPrdExiCC_Enabled = 0 ;
      edtRecEstFin_Enabled = 1 ;
      edtRecEstPar_Enabled = 1 ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrvNom_Enabled = 0 ;
      edtRecEstCosK_Enabled = 1 ;
      edtRecEstCPPa_Enabled = 1 ;
      edtRecEstCPF_Enabled = 0 ;
      edtRecEstCP_Enabled = 1 ;
      edtRecEstGK_Enabled = 0 ;
      edtRecUniCod_Enabled = 0 ;
      edtPrdUniCon_Enabled = 0 ;
      edtPrdUniCom_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtRecMolLin_Enabled = 1 ;
      edtavnRcdDeleted_594_Enabled = 1 ;
      edtRecPasTotC_Jsonclick = "" ;
      edtRecPasTotC_Backcolor = (int)(0xFFFFFF) ;
      edtRecPasTotC_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRecMolCod_Jsonclick = "" ;
      edtRecMolCod_Backcolor = (int)(0xFFFFFF) ;
      edtRecMolCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarCodLan_Jsonclick = "" ;
      edtBarCodLan_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodLan_Enabled = 0 ;
      edtFonCod_Jsonclick = "" ;
      edtFonCod_Backcolor = (int)(0xFFFFFF) ;
      edtFonCod_Enabled = 0 ;
      edtDisComCod_Jsonclick = "" ;
      edtDisComCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisComCod_Enabled = 0 ;
      edtDisComLin_Jsonclick = "" ;
      edtDisComLin_Backcolor = (int)(0xFFFFFF) ;
      edtDisComLin_Enabled = 0 ;
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
      edtPrdExiCC_Visible = -1 ;
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

   public void xc_14_1N7594( String A396EmprCod ,
                             String AV36Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV35Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             java.math.BigDecimal A2119RecEstCP )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A2119RecEstCP, O2119RecEstCP) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV8UsurCod, AV12Station, AV35Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      subsflControlProps_75594( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1N7594( ) ;
         standaloneModal1N7594( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1N7594( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75594( ) ;
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
      /* Using cursor T01N735 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N735_A407EmprNom[0] ;
      n407EmprNom = T01N735_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(31);
      /* Using cursor T01N736 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARCOM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FONCOD");
         AnyError = (short)(1) ;
      }
      A2509BarCodLan = T01N736_A2509BarCodLan[0] ;
      n2509BarCodLan = T01N736_n2509BarCodLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2509BarCodLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2509BarCodLan), 8, 0));
      pr_default.close(32);
      /* Using cursor T01N738 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A2676RecPasTotC = T01N738_A2676RecPasTotC[0] ;
         n2676RecPasTotC = T01N738_n2676RecPasTotC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrimstr( A2676RecPasTotC, 9, 2));
      }
      else
      {
         A2676RecPasTotC = DecimalUtil.doubleToDec(0) ;
         n2676RecPasTotC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrimstr( A2676RecPasTotC, 9, 2));
      }
      pr_default.close(33);
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

   public void valid_Recmolcod( )
   {
      n2676RecPasTotC = false ;
      n2120RecEstGK = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2509BarCodLan", GXutil.ltrim( localUtil.ntoc( A2509BarCodLan, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2676RecPasTotC", GXutil.ltrim( localUtil.ntoc( A2676RecPasTotC, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2524DisComLin", GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1056DisComCod", GXutil.rtrim( Z1056DisComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1032FonCod", GXutil.rtrim( Z1032FonCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2124RecMolCod", GXutil.ltrim( localUtil.ntoc( Z2124RecMolCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2509BarCodLan", GXutil.ltrim( localUtil.ntoc( Z2509BarCodLan, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2676RecPasTotC", GXutil.ltrim( localUtil.ntoc( Z2676RecPasTotC, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      n794PrvNom = false ;
      /* Using cursor T01N730 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      Z795PrvNum = T01N730_A795PrvNum[0] ;
      Z718PrdNom = T01N730_A718PrdNom[0] ;
      Z704PrdExiAlm = T01N730_A704PrdExiAlm[0] ;
      Z705PrdExiCC = T01N730_A705PrdExiCC[0] ;
      Z742PrdUniCom = T01N730_A742PrdUniCom[0] ;
      Z743PrdUniCon = T01N730_A743PrdUniCon[0] ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A795PrvNum = T01N730_A795PrvNum[0] ;
      A685PrdCanRes = T01N730_A685PrdCanRes[0] ;
      A718PrdNom = T01N730_A718PrdNom[0] ;
      A704PrdExiAlm = T01N730_A704PrdExiAlm[0] ;
      A705PrdExiCC = T01N730_A705PrdExiCC[0] ;
      A742PrdUniCom = T01N730_A742PrdUniCom[0] ;
      A743PrdUniCon = T01N730_A743PrdUniCon[0] ;
      O685PrdCanRes = A685PrdCanRes ;
      pr_default.close(26);
      /* Using cursor T01N731 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01N731_A794PrvNom[0] ;
      n794PrvNom = T01N731_n794PrvNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O685PrdCanRes", GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2524DisComLin',fld:'DISCOMLIN',pic:'Z9'},{av:'A1056DisComCod',fld:'DISCOMCOD',pic:''},{av:'A1032FonCod',fld:'FONCOD',pic:''},{av:'A2124RecMolCod',fld:'RECMOLCOD',pic:'Z9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121N72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2509BarCodLan',fld:'BARCODLAN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A2509BarCodLan',fld:'BARCODLAN',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[]");
      setEventMetadata("VALID_FONCOD",",oparms:[]}");
      setEventMetadata("VALID_RECMOLCOD","{handler:'valid_Recmolcod',iparms:[{av:'A2676RecPasTotC',fld:'RECPASTOTC',pic:'ZZZZZ9.99'},{av:'A2120RecEstGK',fld:'RECESTGK',pic:'ZZZZZ9.999'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'AV34Flag1',fld:'vFLAG1',pic:'9'},{av:'AV33CocinaC',fld:'vCOCINAC',pic:'9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2524DisComLin',fld:'DISCOMLIN',pic:'Z9'},{av:'A1056DisComCod',fld:'DISCOMCOD',pic:''},{av:'A1032FonCod',fld:'FONCOD',pic:''},{av:'A2124RecMolCod',fld:'RECMOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECMOLCOD",",oparms:[{av:'A2509BarCodLan',fld:'BARCODLAN',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2676RecPasTotC',fld:'RECPASTOTC',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2524DisComLin'},{av:'Z1056DisComCod'},{av:'Z1032FonCod'},{av:'Z2124RecMolCod'},{av:'Z2509BarCodLan'},{av:'Z407EmprNom'},{av:'Z2676RecPasTotC'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECPASTOTC","{handler:'valid_Recpastotc',iparms:[]");
      setEventMetadata("VALID_RECPASTOTC",",oparms:[]}");
      setEventMetadata("VALID_RECMOLLIN","{handler:'valid_Recmollin',iparms:[]");
      setEventMetadata("VALID_RECMOLLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'O685PrdCanRes'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]}");
      setEventMetadata("VALID_RECUNICOD","{handler:'valid_Recunicod',iparms:[]");
      setEventMetadata("VALID_RECUNICOD",",oparms:[]}");
      setEventMetadata("VALID_RECESTGK","{handler:'valid_Recestgk',iparms:[]");
      setEventMetadata("VALID_RECESTGK",",oparms:[]}");
      setEventMetadata("VALID_RECESTCP","{handler:'valid_Recestcp',iparms:[]");
      setEventMetadata("VALID_RECESTCP",",oparms:[]}");
      setEventMetadata("VALID_RECESTCPF","{handler:'valid_Recestcpf',iparms:[]");
      setEventMetadata("VALID_RECESTCPF",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXICC","{handler:'valid_Prdexicc',iparms:[]");
      setEventMetadata("VALID_PRDEXICC",",oparms:[]}");
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
      pr_default.close(27);
      pr_default.close(31);
      pr_default.close(32);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA1056DisComCod = "" ;
      wcpOA1032FonCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      Z2119RecEstCP = DecimalUtil.ZERO ;
      Z2134RecUniCod = "" ;
      Z2120RecEstGK = DecimalUtil.ZERO ;
      Z5105RecEstCPPa = DecimalUtil.ZERO ;
      Z5106RecEstCosK = DecimalUtil.ZERO ;
      Z8461RecEstFin = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      O2119RecEstCP = DecimalUtil.ZERO ;
      O2669RecEstCPF = DecimalUtil.ZERO ;
      O685PrdCanRes = DecimalUtil.ZERO ;
      O2120RecEstGK = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV35Inc_obs = "" ;
      A130BarCodPar = "" ;
      A2119RecEstCP = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      A2676RecPasTotC = DecimalUtil.ZERO ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode594 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens2 = new com.genexus.util.GXProperties();
      hsh2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode597 = "" ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A2134RecUniCod = "" ;
      A2120RecEstGK = DecimalUtil.ZERO ;
      A2669RecEstCPF = DecimalUtil.ZERO ;
      A5105RecEstCPPa = DecimalUtil.ZERO ;
      A5106RecEstCosK = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A8461RecEstFin = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      T2119RecEstCP = DecimalUtil.ZERO ;
      T2669RecEstCPF = DecimalUtil.ZERO ;
      T685PrdCanRes = DecimalUtil.ZERO ;
      T2120RecEstGK = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      Z407EmprNom = "" ;
      Z2676RecPasTotC = DecimalUtil.ZERO ;
      T01N79_A407EmprNom = new String[] {""} ;
      T01N79_n407EmprNom = new boolean[] {false} ;
      T01N710_A2509BarCodLan = new int[1] ;
      T01N710_n2509BarCodLan = new boolean[] {false} ;
      T01N712_A2676RecPasTotC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N712_n2676RecPasTotC = new boolean[] {false} ;
      T01N714_A2124RecMolCod = new byte[1] ;
      T01N714_A2509BarCodLan = new int[1] ;
      T01N714_n2509BarCodLan = new boolean[] {false} ;
      T01N714_A407EmprNom = new String[] {""} ;
      T01N714_n407EmprNom = new boolean[] {false} ;
      T01N714_A396EmprCod = new String[] {""} ;
      T01N714_A129BarCod = new int[1] ;
      T01N714_A132BarCodReo = new byte[1] ;
      T01N714_A130BarCodPar = new String[] {""} ;
      T01N714_A2524DisComLin = new byte[1] ;
      T01N714_A1056DisComCod = new String[] {""} ;
      T01N714_A1032FonCod = new String[] {""} ;
      T01N714_A2676RecPasTotC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N714_n2676RecPasTotC = new boolean[] {false} ;
      T01N715_A396EmprCod = new String[] {""} ;
      T01N715_A129BarCod = new int[1] ;
      T01N715_A132BarCodReo = new byte[1] ;
      T01N715_A130BarCodPar = new String[] {""} ;
      T01N715_A2524DisComLin = new byte[1] ;
      T01N715_A1056DisComCod = new String[] {""} ;
      T01N715_A1032FonCod = new String[] {""} ;
      T01N715_A2124RecMolCod = new byte[1] ;
      T01N78_A2124RecMolCod = new byte[1] ;
      T01N78_A396EmprCod = new String[] {""} ;
      T01N78_A129BarCod = new int[1] ;
      T01N78_A132BarCodReo = new byte[1] ;
      T01N78_A130BarCodPar = new String[] {""} ;
      T01N78_A2524DisComLin = new byte[1] ;
      T01N78_A1056DisComCod = new String[] {""} ;
      T01N78_A1032FonCod = new String[] {""} ;
      T01N716_A396EmprCod = new String[] {""} ;
      T01N716_A129BarCod = new int[1] ;
      T01N716_A132BarCodReo = new byte[1] ;
      T01N716_A130BarCodPar = new String[] {""} ;
      T01N716_A2524DisComLin = new byte[1] ;
      T01N716_A1056DisComCod = new String[] {""} ;
      T01N716_A1032FonCod = new String[] {""} ;
      T01N716_A2124RecMolCod = new byte[1] ;
      T01N717_A396EmprCod = new String[] {""} ;
      T01N717_A129BarCod = new int[1] ;
      T01N717_A132BarCodReo = new byte[1] ;
      T01N717_A130BarCodPar = new String[] {""} ;
      T01N717_A2524DisComLin = new byte[1] ;
      T01N717_A1056DisComCod = new String[] {""} ;
      T01N717_A1032FonCod = new String[] {""} ;
      T01N717_A2124RecMolCod = new byte[1] ;
      T01N77_A2124RecMolCod = new byte[1] ;
      T01N77_A396EmprCod = new String[] {""} ;
      T01N77_A129BarCod = new int[1] ;
      T01N77_A132BarCodReo = new byte[1] ;
      T01N77_A130BarCodPar = new String[] {""} ;
      T01N77_A2524DisComLin = new byte[1] ;
      T01N77_A1056DisComCod = new String[] {""} ;
      T01N77_A1032FonCod = new String[] {""} ;
      T01N720_A396EmprCod = new String[] {""} ;
      T01N720_A129BarCod = new int[1] ;
      T01N720_A132BarCodReo = new byte[1] ;
      T01N720_A130BarCodPar = new String[] {""} ;
      T01N720_A2524DisComLin = new byte[1] ;
      T01N720_A1056DisComCod = new String[] {""} ;
      T01N720_A1032FonCod = new String[] {""} ;
      T01N720_A2124RecMolCod = new byte[1] ;
      T01N720_A2126RecMolLin = new byte[1] ;
      T01N720_A2121RecEstNan = new byte[1] ;
      T01N721_A396EmprCod = new String[] {""} ;
      T01N721_A129BarCod = new int[1] ;
      T01N721_A132BarCodReo = new byte[1] ;
      T01N721_A130BarCodPar = new String[] {""} ;
      T01N721_A2524DisComLin = new byte[1] ;
      T01N721_A1056DisComCod = new String[] {""} ;
      T01N721_A1032FonCod = new String[] {""} ;
      T01N721_A2124RecMolCod = new byte[1] ;
      T01N721_A2672RecPasLin = new short[1] ;
      T01N722_A396EmprCod = new String[] {""} ;
      T01N722_A129BarCod = new int[1] ;
      T01N722_A132BarCodReo = new byte[1] ;
      T01N722_A130BarCodPar = new String[] {""} ;
      T01N722_A2524DisComLin = new byte[1] ;
      T01N722_A1056DisComCod = new String[] {""} ;
      T01N722_A1032FonCod = new String[] {""} ;
      T01N722_A2124RecMolCod = new byte[1] ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z794PrvNom = "" ;
      T01N723_A795PrvNum = new int[1] ;
      T01N723_A129BarCod = new int[1] ;
      T01N723_A132BarCodReo = new byte[1] ;
      T01N723_A130BarCodPar = new String[] {""} ;
      T01N723_A2124RecMolCod = new byte[1] ;
      T01N723_A2126RecMolLin = new byte[1] ;
      T01N723_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_n2119RecEstCP = new boolean[] {false} ;
      T01N723_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_A718PrdNom = new String[] {""} ;
      T01N723_A2134RecUniCod = new String[] {""} ;
      T01N723_n2134RecUniCod = new boolean[] {false} ;
      T01N723_A2120RecEstGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_n2120RecEstGK = new boolean[] {false} ;
      T01N723_A5105RecEstCPPa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_n5105RecEstCPPa = new boolean[] {false} ;
      T01N723_A5106RecEstCosK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_n5106RecEstCosK = new boolean[] {false} ;
      T01N723_A794PrvNom = new String[] {""} ;
      T01N723_n794PrvNom = new boolean[] {false} ;
      T01N723_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_A6063RecEstPar = new short[1] ;
      T01N723_n6063RecEstPar = new boolean[] {false} ;
      T01N723_A8461RecEstFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_n8461RecEstFin = new boolean[] {false} ;
      T01N723_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N723_A396EmprCod = new String[] {""} ;
      T01N723_A719PrdNum = new String[] {""} ;
      T01N723_n719PrdNum = new boolean[] {false} ;
      T01N723_A1032FonCod = new String[] {""} ;
      T01N723_A2524DisComLin = new byte[1] ;
      T01N723_A1056DisComCod = new String[] {""} ;
      T01N723_A742PrdUniCom = new byte[1] ;
      T01N723_A743PrdUniCon = new byte[1] ;
      T01N75_A795PrvNum = new int[1] ;
      T01N75_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N75_A718PrdNom = new String[] {""} ;
      T01N75_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N75_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N75_A742PrdUniCom = new byte[1] ;
      T01N75_A743PrdUniCon = new byte[1] ;
      T01N76_A794PrvNom = new String[] {""} ;
      T01N76_n794PrvNom = new boolean[] {false} ;
      T01N724_A794PrvNom = new String[] {""} ;
      T01N724_n794PrvNom = new boolean[] {false} ;
      T01N725_A396EmprCod = new String[] {""} ;
      T01N725_A129BarCod = new int[1] ;
      T01N725_A132BarCodReo = new byte[1] ;
      T01N725_A130BarCodPar = new String[] {""} ;
      T01N725_A2524DisComLin = new byte[1] ;
      T01N725_A1056DisComCod = new String[] {""} ;
      T01N725_A1032FonCod = new String[] {""} ;
      T01N725_A2124RecMolCod = new byte[1] ;
      T01N725_A2126RecMolLin = new byte[1] ;
      T01N73_A129BarCod = new int[1] ;
      T01N73_A132BarCodReo = new byte[1] ;
      T01N73_A130BarCodPar = new String[] {""} ;
      T01N73_A2124RecMolCod = new byte[1] ;
      T01N73_A2126RecMolLin = new byte[1] ;
      T01N73_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N73_n2119RecEstCP = new boolean[] {false} ;
      T01N73_A2134RecUniCod = new String[] {""} ;
      T01N73_n2134RecUniCod = new boolean[] {false} ;
      T01N73_A2120RecEstGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N73_n2120RecEstGK = new boolean[] {false} ;
      T01N73_A5105RecEstCPPa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N73_n5105RecEstCPPa = new boolean[] {false} ;
      T01N73_A5106RecEstCosK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N73_n5106RecEstCosK = new boolean[] {false} ;
      T01N73_A6063RecEstPar = new short[1] ;
      T01N73_n6063RecEstPar = new boolean[] {false} ;
      T01N73_A8461RecEstFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N73_n8461RecEstFin = new boolean[] {false} ;
      T01N73_A396EmprCod = new String[] {""} ;
      T01N73_A719PrdNum = new String[] {""} ;
      T01N73_n719PrdNum = new boolean[] {false} ;
      T01N73_A1032FonCod = new String[] {""} ;
      T01N73_A2524DisComLin = new byte[1] ;
      T01N73_A1056DisComCod = new String[] {""} ;
      T01N72_A129BarCod = new int[1] ;
      T01N72_A132BarCodReo = new byte[1] ;
      T01N72_A130BarCodPar = new String[] {""} ;
      T01N72_A2124RecMolCod = new byte[1] ;
      T01N72_A2126RecMolLin = new byte[1] ;
      T01N72_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N72_n2119RecEstCP = new boolean[] {false} ;
      T01N72_A2134RecUniCod = new String[] {""} ;
      T01N72_n2134RecUniCod = new boolean[] {false} ;
      T01N72_A2120RecEstGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N72_n2120RecEstGK = new boolean[] {false} ;
      T01N72_A5105RecEstCPPa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N72_n5105RecEstCPPa = new boolean[] {false} ;
      T01N72_A5106RecEstCosK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N72_n5106RecEstCosK = new boolean[] {false} ;
      T01N72_A6063RecEstPar = new short[1] ;
      T01N72_n6063RecEstPar = new boolean[] {false} ;
      T01N72_A8461RecEstFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N72_n8461RecEstFin = new boolean[] {false} ;
      T01N72_A396EmprCod = new String[] {""} ;
      T01N72_A719PrdNum = new String[] {""} ;
      T01N72_n719PrdNum = new boolean[] {false} ;
      T01N72_A1032FonCod = new String[] {""} ;
      T01N72_A2524DisComLin = new byte[1] ;
      T01N72_A1056DisComCod = new String[] {""} ;
      T01N726_A795PrvNum = new int[1] ;
      T01N726_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N726_A718PrdNom = new String[] {""} ;
      T01N726_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N726_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N726_A742PrdUniCom = new byte[1] ;
      T01N726_A743PrdUniCon = new byte[1] ;
      T01N730_A795PrvNum = new int[1] ;
      T01N730_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N730_A718PrdNom = new String[] {""} ;
      T01N730_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N730_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N730_A742PrdUniCom = new byte[1] ;
      T01N730_A743PrdUniCon = new byte[1] ;
      T01N731_A794PrvNom = new String[] {""} ;
      T01N731_n794PrvNom = new boolean[] {false} ;
      T01N732_A396EmprCod = new String[] {""} ;
      T01N732_A129BarCod = new int[1] ;
      T01N732_A132BarCodReo = new byte[1] ;
      T01N732_A130BarCodPar = new String[] {""} ;
      T01N732_A2524DisComLin = new byte[1] ;
      T01N732_A1056DisComCod = new String[] {""} ;
      T01N732_A1032FonCod = new String[] {""} ;
      T01N732_A2124RecMolCod = new byte[1] ;
      T01N732_A2126RecMolLin = new byte[1] ;
      T01N732_A2121RecEstNan = new byte[1] ;
      T01N734_A396EmprCod = new String[] {""} ;
      T01N734_A129BarCod = new int[1] ;
      T01N734_A132BarCodReo = new byte[1] ;
      T01N734_A130BarCodPar = new String[] {""} ;
      T01N734_A2524DisComLin = new byte[1] ;
      T01N734_A1056DisComCod = new String[] {""} ;
      T01N734_A1032FonCod = new String[] {""} ;
      T01N734_A2124RecMolCod = new byte[1] ;
      T01N734_A2126RecMolLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01N735_A407EmprNom = new String[] {""} ;
      T01N735_n407EmprNom = new boolean[] {false} ;
      T01N736_A2509BarCodLan = new int[1] ;
      T01N736_n2509BarCodLan = new boolean[] {false} ;
      T01N738_A2676RecPasTotC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N738_n2676RecPasTotC = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ1056DisComCod = "" ;
      ZZ1032FonCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ2676RecPasTotC = DecimalUtil.ZERO ;
      ZO685PrdCanRes = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclse00__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclse00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclse00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclse00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclse00__default(),
         new Object[] {
             new Object[] {
            T01N72_A129BarCod, T01N72_A132BarCodReo, T01N72_A130BarCodPar, T01N72_A2124RecMolCod, T01N72_A2126RecMolLin, T01N72_A2119RecEstCP, T01N72_n2119RecEstCP, T01N72_A2134RecUniCod, T01N72_n2134RecUniCod, T01N72_A2120RecEstGK,
            T01N72_n2120RecEstGK, T01N72_A5105RecEstCPPa, T01N72_n5105RecEstCPPa, T01N72_A5106RecEstCosK, T01N72_n5106RecEstCosK, T01N72_A6063RecEstPar, T01N72_n6063RecEstPar, T01N72_A8461RecEstFin, T01N72_n8461RecEstFin, T01N72_A396EmprCod,
            T01N72_A719PrdNum, T01N72_n719PrdNum, T01N72_A1032FonCod, T01N72_A2524DisComLin, T01N72_A1056DisComCod
            }
            , new Object[] {
            T01N73_A129BarCod, T01N73_A132BarCodReo, T01N73_A130BarCodPar, T01N73_A2124RecMolCod, T01N73_A2126RecMolLin, T01N73_A2119RecEstCP, T01N73_n2119RecEstCP, T01N73_A2134RecUniCod, T01N73_n2134RecUniCod, T01N73_A2120RecEstGK,
            T01N73_n2120RecEstGK, T01N73_A5105RecEstCPPa, T01N73_n5105RecEstCPPa, T01N73_A5106RecEstCosK, T01N73_n5106RecEstCosK, T01N73_A6063RecEstPar, T01N73_n6063RecEstPar, T01N73_A8461RecEstFin, T01N73_n8461RecEstFin, T01N73_A396EmprCod,
            T01N73_A719PrdNum, T01N73_n719PrdNum, T01N73_A1032FonCod, T01N73_A2524DisComLin, T01N73_A1056DisComCod
            }
            , new Object[] {
            T01N74_A795PrvNum, T01N74_A685PrdCanRes, T01N74_A718PrdNom, T01N74_A704PrdExiAlm, T01N74_A705PrdExiCC, T01N74_A742PrdUniCom, T01N74_A743PrdUniCon
            }
            , new Object[] {
            T01N75_A795PrvNum, T01N75_A685PrdCanRes, T01N75_A718PrdNom, T01N75_A704PrdExiAlm, T01N75_A705PrdExiCC, T01N75_A742PrdUniCom, T01N75_A743PrdUniCon
            }
            , new Object[] {
            T01N76_A794PrvNom, T01N76_n794PrvNom
            }
            , new Object[] {
            T01N77_A2124RecMolCod, T01N77_A396EmprCod, T01N77_A129BarCod, T01N77_A132BarCodReo, T01N77_A130BarCodPar, T01N77_A2524DisComLin, T01N77_A1056DisComCod, T01N77_A1032FonCod
            }
            , new Object[] {
            T01N78_A2124RecMolCod, T01N78_A396EmprCod, T01N78_A129BarCod, T01N78_A132BarCodReo, T01N78_A130BarCodPar, T01N78_A2524DisComLin, T01N78_A1056DisComCod, T01N78_A1032FonCod
            }
            , new Object[] {
            T01N79_A407EmprNom, T01N79_n407EmprNom
            }
            , new Object[] {
            T01N710_A2509BarCodLan, T01N710_n2509BarCodLan
            }
            , new Object[] {
            T01N712_A2676RecPasTotC, T01N712_n2676RecPasTotC
            }
            , new Object[] {
            T01N714_A2124RecMolCod, T01N714_A2509BarCodLan, T01N714_n2509BarCodLan, T01N714_A407EmprNom, T01N714_n407EmprNom, T01N714_A396EmprCod, T01N714_A129BarCod, T01N714_A132BarCodReo, T01N714_A130BarCodPar, T01N714_A2524DisComLin,
            T01N714_A1056DisComCod, T01N714_A1032FonCod, T01N714_A2676RecPasTotC, T01N714_n2676RecPasTotC
            }
            , new Object[] {
            T01N715_A396EmprCod, T01N715_A129BarCod, T01N715_A132BarCodReo, T01N715_A130BarCodPar, T01N715_A2524DisComLin, T01N715_A1056DisComCod, T01N715_A1032FonCod, T01N715_A2124RecMolCod
            }
            , new Object[] {
            T01N716_A396EmprCod, T01N716_A129BarCod, T01N716_A132BarCodReo, T01N716_A130BarCodPar, T01N716_A2524DisComLin, T01N716_A1056DisComCod, T01N716_A1032FonCod, T01N716_A2124RecMolCod
            }
            , new Object[] {
            T01N717_A396EmprCod, T01N717_A129BarCod, T01N717_A132BarCodReo, T01N717_A130BarCodPar, T01N717_A2524DisComLin, T01N717_A1056DisComCod, T01N717_A1032FonCod, T01N717_A2124RecMolCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N720_A396EmprCod, T01N720_A129BarCod, T01N720_A132BarCodReo, T01N720_A130BarCodPar, T01N720_A2524DisComLin, T01N720_A1056DisComCod, T01N720_A1032FonCod, T01N720_A2124RecMolCod, T01N720_A2126RecMolLin, T01N720_A2121RecEstNan
            }
            , new Object[] {
            T01N721_A396EmprCod, T01N721_A129BarCod, T01N721_A132BarCodReo, T01N721_A130BarCodPar, T01N721_A2524DisComLin, T01N721_A1056DisComCod, T01N721_A1032FonCod, T01N721_A2124RecMolCod, T01N721_A2672RecPasLin
            }
            , new Object[] {
            T01N722_A396EmprCod, T01N722_A129BarCod, T01N722_A132BarCodReo, T01N722_A130BarCodPar, T01N722_A2524DisComLin, T01N722_A1056DisComCod, T01N722_A1032FonCod, T01N722_A2124RecMolCod
            }
            , new Object[] {
            T01N723_A795PrvNum, T01N723_A129BarCod, T01N723_A132BarCodReo, T01N723_A130BarCodPar, T01N723_A2124RecMolCod, T01N723_A2126RecMolLin, T01N723_A2119RecEstCP, T01N723_n2119RecEstCP, T01N723_A685PrdCanRes, T01N723_A718PrdNom,
            T01N723_A2134RecUniCod, T01N723_n2134RecUniCod, T01N723_A2120RecEstGK, T01N723_n2120RecEstGK, T01N723_A5105RecEstCPPa, T01N723_n5105RecEstCPPa, T01N723_A5106RecEstCosK, T01N723_n5106RecEstCosK, T01N723_A794PrvNom, T01N723_n794PrvNom,
            T01N723_A704PrdExiAlm, T01N723_A6063RecEstPar, T01N723_n6063RecEstPar, T01N723_A8461RecEstFin, T01N723_n8461RecEstFin, T01N723_A705PrdExiCC, T01N723_A396EmprCod, T01N723_A719PrdNum, T01N723_n719PrdNum, T01N723_A1032FonCod,
            T01N723_A2524DisComLin, T01N723_A1056DisComCod, T01N723_A742PrdUniCom, T01N723_A743PrdUniCon
            }
            , new Object[] {
            T01N724_A794PrvNom, T01N724_n794PrvNom
            }
            , new Object[] {
            T01N725_A396EmprCod, T01N725_A129BarCod, T01N725_A132BarCodReo, T01N725_A130BarCodPar, T01N725_A2524DisComLin, T01N725_A1056DisComCod, T01N725_A1032FonCod, T01N725_A2124RecMolCod, T01N725_A2126RecMolLin
            }
            , new Object[] {
            T01N726_A795PrvNum, T01N726_A685PrdCanRes, T01N726_A718PrdNom, T01N726_A704PrdExiAlm, T01N726_A705PrdExiCC, T01N726_A742PrdUniCom, T01N726_A743PrdUniCon
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N730_A795PrvNum, T01N730_A685PrdCanRes, T01N730_A718PrdNom, T01N730_A704PrdExiAlm, T01N730_A705PrdExiCC, T01N730_A742PrdUniCom, T01N730_A743PrdUniCon
            }
            , new Object[] {
            T01N731_A794PrvNom, T01N731_n794PrvNom
            }
            , new Object[] {
            T01N732_A396EmprCod, T01N732_A129BarCod, T01N732_A132BarCodReo, T01N732_A130BarCodPar, T01N732_A2524DisComLin, T01N732_A1056DisComCod, T01N732_A1032FonCod, T01N732_A2124RecMolCod, T01N732_A2126RecMolLin, T01N732_A2121RecEstNan
            }
            , new Object[] {
            }
            , new Object[] {
            T01N734_A396EmprCod, T01N734_A129BarCod, T01N734_A132BarCodReo, T01N734_A130BarCodPar, T01N734_A2524DisComLin, T01N734_A1056DisComCod, T01N734_A1032FonCod, T01N734_A2124RecMolCod, T01N734_A2126RecMolLin
            }
            , new Object[] {
            T01N735_A407EmprNom, T01N735_n407EmprNom
            }
            , new Object[] {
            T01N736_A2509BarCodLan, T01N736_n2509BarCodLan
            }
            , new Object[] {
            T01N738_A2676RecPasTotC, T01N738_n2676RecPasTotC
            }
         }
      );
      Z2124RecMolCod = (byte)(0) ;
      A2124RecMolCod = (byte)(0) ;
      Z1032FonCod = "" ;
      A1032FonCod = "" ;
      Z1056DisComCod = "" ;
      A1056DisComCod = "" ;
      Z2524DisComLin = (byte)(0) ;
      A2524DisComLin = (byte)(0) ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TCLSE00" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte wcpOA2524DisComLin ;
   private byte wcpOA2124RecMolCod ;
   private byte Z132BarCodReo ;
   private byte Z2524DisComLin ;
   private byte Z2124RecMolCod ;
   private byte Z2126RecMolLin ;
   private byte Z742PrdUniCom ;
   private byte Z743PrdUniCon ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte nKeyPressed ;
   private byte AV34Flag1 ;
   private byte AV33CocinaC ;
   private byte A2126RecMolLin ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ2524DisComLin ;
   private byte ZZ2124RecMolCod ;
   private short Z6063RecEstPar ;
   private short nRcdDeleted_594 ;
   private short nRcdExists_594 ;
   private short nIsMod_594 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount594 ;
   private short RcdFound594 ;
   private short nBlankRcdUsr594 ;
   private short A6063RecEstPar ;
   private short RcdFound597 ;
   private short nIsDirty_597 ;
   private short nIsDirty_594 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z795PrvNum ;
   private int A129BarCod ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int edtPrdExiCC_Visible ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int A2509BarCodLan ;
   private int edtBarCodLan_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtRecMolCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtRecPasTotC_Enabled ;
   private int edtavnRcdDeleted_594_Enabled ;
   private int edtRecMolLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdUniCom_Enabled ;
   private int edtPrdUniCon_Enabled ;
   private int edtRecUniCod_Enabled ;
   private int edtRecEstGK_Enabled ;
   private int edtRecEstCP_Enabled ;
   private int edtRecEstCPF_Enabled ;
   private int edtRecEstCPPa_Enabled ;
   private int edtRecEstCosK_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtRecEstPar_Enabled ;
   private int edtRecEstFin_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int Z2509BarCodLan ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPrdExiCC_Enabled ;
   private int defedtPrdExiAlm_Enabled ;
   private int defedtPrdCanRes_Enabled ;
   private int defedtRecEstGK_Enabled ;
   private int defedtRecUniCod_Enabled ;
   private int defedtRecMolLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtRecPasTotC_Backcolor ;
   private int edtRecMolCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodLan_Backcolor ;
   private int edtFonCod_Backcolor ;
   private int edtDisComCod_Backcolor ;
   private int edtDisComLin_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ2509BarCodLan ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2119RecEstCP ;
   private java.math.BigDecimal Z2120RecEstGK ;
   private java.math.BigDecimal Z5105RecEstCPPa ;
   private java.math.BigDecimal Z5106RecEstCosK ;
   private java.math.BigDecimal Z8461RecEstFin ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal O2119RecEstCP ;
   private java.math.BigDecimal O2669RecEstCPF ;
   private java.math.BigDecimal O685PrdCanRes ;
   private java.math.BigDecimal O2120RecEstGK ;
   private java.math.BigDecimal A2119RecEstCP ;
   private java.math.BigDecimal A2676RecPasTotC ;
   private java.math.BigDecimal A2120RecEstGK ;
   private java.math.BigDecimal A2669RecEstCPF ;
   private java.math.BigDecimal A5105RecEstCPPa ;
   private java.math.BigDecimal A5106RecEstCosK ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A8461RecEstFin ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal T2119RecEstCP ;
   private java.math.BigDecimal T2669RecEstCPF ;
   private java.math.BigDecimal T685PrdCanRes ;
   private java.math.BigDecimal T2120RecEstGK ;
   private java.math.BigDecimal Z2676RecPasTotC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal ZZ2676RecPasTotC ;
   private java.math.BigDecimal ZO685PrdCanRes ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA1056DisComCod ;
   private String wcpOA1032FonCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String Z2134RecUniCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV36Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_75_idx="0001" ;
   private String edtPrdExiCC_Internalname ;
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
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisComLin_Internalname ;
   private String edtDisComLin_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisComCod_Internalname ;
   private String edtDisComCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFonCod_Internalname ;
   private String edtFonCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarCodLan_Internalname ;
   private String edtBarCodLan_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtRecMolCod_Internalname ;
   private String edtRecMolCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtRecPasTotC_Internalname ;
   private String edtRecPasTotC_Jsonclick ;
   private String sMode594 ;
   private String edtavnRcdDeleted_594_Internalname ;
   private String edtRecMolLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdUniCom_Internalname ;
   private String edtPrdUniCon_Internalname ;
   private String edtRecUniCod_Internalname ;
   private String edtRecEstGK_Internalname ;
   private String edtRecEstCP_Internalname ;
   private String edtRecEstCPF_Internalname ;
   private String edtRecEstCPPa_Internalname ;
   private String edtRecEstCosK_Internalname ;
   private String edtPrvNom_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtRecEstPar_Internalname ;
   private String edtRecEstFin_Internalname ;
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
   private String hsh2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode597 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A2134RecUniCod ;
   private String A794PrvNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_594_Jsonclick ;
   private String edtRecMolLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdUniCom_Jsonclick ;
   private String edtPrdUniCon_Jsonclick ;
   private String edtRecUniCod_Jsonclick ;
   private String edtRecEstGK_Jsonclick ;
   private String edtRecEstCP_Jsonclick ;
   private String edtRecEstCPF_Jsonclick ;
   private String edtRecEstCPPa_Jsonclick ;
   private String edtRecEstCosK_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtRecEstPar_Jsonclick ;
   private String edtRecEstFin_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ1056DisComCod ;
   private String ZZ1032FonCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2119RecEstCP ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n2676RecPasTotC ;
   private boolean n2509BarCodLan ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n2134RecUniCod ;
   private boolean n2120RecEstGK ;
   private boolean n5105RecEstCPPa ;
   private boolean n5106RecEstCosK ;
   private boolean n794PrvNom ;
   private boolean n6063RecEstPar ;
   private boolean n8461RecEstFin ;
   private boolean Gx_longc ;
   private String AV35Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens2 ;
   private IDataStoreProvider pr_default ;
   private String[] T01N79_A407EmprNom ;
   private boolean[] T01N79_n407EmprNom ;
   private int[] T01N710_A2509BarCodLan ;
   private boolean[] T01N710_n2509BarCodLan ;
   private java.math.BigDecimal[] T01N712_A2676RecPasTotC ;
   private boolean[] T01N712_n2676RecPasTotC ;
   private byte[] T01N714_A2124RecMolCod ;
   private int[] T01N714_A2509BarCodLan ;
   private boolean[] T01N714_n2509BarCodLan ;
   private String[] T01N714_A407EmprNom ;
   private boolean[] T01N714_n407EmprNom ;
   private String[] T01N714_A396EmprCod ;
   private int[] T01N714_A129BarCod ;
   private byte[] T01N714_A132BarCodReo ;
   private String[] T01N714_A130BarCodPar ;
   private byte[] T01N714_A2524DisComLin ;
   private String[] T01N714_A1056DisComCod ;
   private String[] T01N714_A1032FonCod ;
   private java.math.BigDecimal[] T01N714_A2676RecPasTotC ;
   private boolean[] T01N714_n2676RecPasTotC ;
   private String[] T01N715_A396EmprCod ;
   private int[] T01N715_A129BarCod ;
   private byte[] T01N715_A132BarCodReo ;
   private String[] T01N715_A130BarCodPar ;
   private byte[] T01N715_A2524DisComLin ;
   private String[] T01N715_A1056DisComCod ;
   private String[] T01N715_A1032FonCod ;
   private byte[] T01N715_A2124RecMolCod ;
   private byte[] T01N78_A2124RecMolCod ;
   private String[] T01N78_A396EmprCod ;
   private int[] T01N78_A129BarCod ;
   private byte[] T01N78_A132BarCodReo ;
   private String[] T01N78_A130BarCodPar ;
   private byte[] T01N78_A2524DisComLin ;
   private String[] T01N78_A1056DisComCod ;
   private String[] T01N78_A1032FonCod ;
   private String[] T01N716_A396EmprCod ;
   private int[] T01N716_A129BarCod ;
   private byte[] T01N716_A132BarCodReo ;
   private String[] T01N716_A130BarCodPar ;
   private byte[] T01N716_A2524DisComLin ;
   private String[] T01N716_A1056DisComCod ;
   private String[] T01N716_A1032FonCod ;
   private byte[] T01N716_A2124RecMolCod ;
   private String[] T01N717_A396EmprCod ;
   private int[] T01N717_A129BarCod ;
   private byte[] T01N717_A132BarCodReo ;
   private String[] T01N717_A130BarCodPar ;
   private byte[] T01N717_A2524DisComLin ;
   private String[] T01N717_A1056DisComCod ;
   private String[] T01N717_A1032FonCod ;
   private byte[] T01N717_A2124RecMolCod ;
   private byte[] T01N77_A2124RecMolCod ;
   private String[] T01N77_A396EmprCod ;
   private int[] T01N77_A129BarCod ;
   private byte[] T01N77_A132BarCodReo ;
   private String[] T01N77_A130BarCodPar ;
   private byte[] T01N77_A2524DisComLin ;
   private String[] T01N77_A1056DisComCod ;
   private String[] T01N77_A1032FonCod ;
   private String[] T01N720_A396EmprCod ;
   private int[] T01N720_A129BarCod ;
   private byte[] T01N720_A132BarCodReo ;
   private String[] T01N720_A130BarCodPar ;
   private byte[] T01N720_A2524DisComLin ;
   private String[] T01N720_A1056DisComCod ;
   private String[] T01N720_A1032FonCod ;
   private byte[] T01N720_A2124RecMolCod ;
   private byte[] T01N720_A2126RecMolLin ;
   private byte[] T01N720_A2121RecEstNan ;
   private String[] T01N721_A396EmprCod ;
   private int[] T01N721_A129BarCod ;
   private byte[] T01N721_A132BarCodReo ;
   private String[] T01N721_A130BarCodPar ;
   private byte[] T01N721_A2524DisComLin ;
   private String[] T01N721_A1056DisComCod ;
   private String[] T01N721_A1032FonCod ;
   private byte[] T01N721_A2124RecMolCod ;
   private short[] T01N721_A2672RecPasLin ;
   private String[] T01N722_A396EmprCod ;
   private int[] T01N722_A129BarCod ;
   private byte[] T01N722_A132BarCodReo ;
   private String[] T01N722_A130BarCodPar ;
   private byte[] T01N722_A2524DisComLin ;
   private String[] T01N722_A1056DisComCod ;
   private String[] T01N722_A1032FonCod ;
   private byte[] T01N722_A2124RecMolCod ;
   private int[] T01N723_A795PrvNum ;
   private int[] T01N723_A129BarCod ;
   private byte[] T01N723_A132BarCodReo ;
   private String[] T01N723_A130BarCodPar ;
   private byte[] T01N723_A2124RecMolCod ;
   private byte[] T01N723_A2126RecMolLin ;
   private java.math.BigDecimal[] T01N723_A2119RecEstCP ;
   private boolean[] T01N723_n2119RecEstCP ;
   private java.math.BigDecimal[] T01N723_A685PrdCanRes ;
   private String[] T01N723_A718PrdNom ;
   private String[] T01N723_A2134RecUniCod ;
   private boolean[] T01N723_n2134RecUniCod ;
   private java.math.BigDecimal[] T01N723_A2120RecEstGK ;
   private boolean[] T01N723_n2120RecEstGK ;
   private java.math.BigDecimal[] T01N723_A5105RecEstCPPa ;
   private boolean[] T01N723_n5105RecEstCPPa ;
   private java.math.BigDecimal[] T01N723_A5106RecEstCosK ;
   private boolean[] T01N723_n5106RecEstCosK ;
   private String[] T01N723_A794PrvNom ;
   private boolean[] T01N723_n794PrvNom ;
   private java.math.BigDecimal[] T01N723_A704PrdExiAlm ;
   private short[] T01N723_A6063RecEstPar ;
   private boolean[] T01N723_n6063RecEstPar ;
   private java.math.BigDecimal[] T01N723_A8461RecEstFin ;
   private boolean[] T01N723_n8461RecEstFin ;
   private java.math.BigDecimal[] T01N723_A705PrdExiCC ;
   private String[] T01N723_A396EmprCod ;
   private String[] T01N723_A719PrdNum ;
   private boolean[] T01N723_n719PrdNum ;
   private String[] T01N723_A1032FonCod ;
   private byte[] T01N723_A2524DisComLin ;
   private String[] T01N723_A1056DisComCod ;
   private byte[] T01N723_A742PrdUniCom ;
   private byte[] T01N723_A743PrdUniCon ;
   private int[] T01N75_A795PrvNum ;
   private java.math.BigDecimal[] T01N75_A685PrdCanRes ;
   private String[] T01N75_A718PrdNom ;
   private java.math.BigDecimal[] T01N75_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01N75_A705PrdExiCC ;
   private byte[] T01N75_A742PrdUniCom ;
   private byte[] T01N75_A743PrdUniCon ;
   private String[] T01N76_A794PrvNom ;
   private boolean[] T01N76_n794PrvNom ;
   private String[] T01N724_A794PrvNom ;
   private boolean[] T01N724_n794PrvNom ;
   private String[] T01N725_A396EmprCod ;
   private int[] T01N725_A129BarCod ;
   private byte[] T01N725_A132BarCodReo ;
   private String[] T01N725_A130BarCodPar ;
   private byte[] T01N725_A2524DisComLin ;
   private String[] T01N725_A1056DisComCod ;
   private String[] T01N725_A1032FonCod ;
   private byte[] T01N725_A2124RecMolCod ;
   private byte[] T01N725_A2126RecMolLin ;
   private int[] T01N73_A129BarCod ;
   private byte[] T01N73_A132BarCodReo ;
   private String[] T01N73_A130BarCodPar ;
   private byte[] T01N73_A2124RecMolCod ;
   private byte[] T01N73_A2126RecMolLin ;
   private java.math.BigDecimal[] T01N73_A2119RecEstCP ;
   private boolean[] T01N73_n2119RecEstCP ;
   private String[] T01N73_A2134RecUniCod ;
   private boolean[] T01N73_n2134RecUniCod ;
   private java.math.BigDecimal[] T01N73_A2120RecEstGK ;
   private boolean[] T01N73_n2120RecEstGK ;
   private java.math.BigDecimal[] T01N73_A5105RecEstCPPa ;
   private boolean[] T01N73_n5105RecEstCPPa ;
   private java.math.BigDecimal[] T01N73_A5106RecEstCosK ;
   private boolean[] T01N73_n5106RecEstCosK ;
   private short[] T01N73_A6063RecEstPar ;
   private boolean[] T01N73_n6063RecEstPar ;
   private java.math.BigDecimal[] T01N73_A8461RecEstFin ;
   private boolean[] T01N73_n8461RecEstFin ;
   private String[] T01N73_A396EmprCod ;
   private String[] T01N73_A719PrdNum ;
   private boolean[] T01N73_n719PrdNum ;
   private String[] T01N73_A1032FonCod ;
   private byte[] T01N73_A2524DisComLin ;
   private String[] T01N73_A1056DisComCod ;
   private int[] T01N72_A129BarCod ;
   private byte[] T01N72_A132BarCodReo ;
   private String[] T01N72_A130BarCodPar ;
   private byte[] T01N72_A2124RecMolCod ;
   private byte[] T01N72_A2126RecMolLin ;
   private java.math.BigDecimal[] T01N72_A2119RecEstCP ;
   private boolean[] T01N72_n2119RecEstCP ;
   private String[] T01N72_A2134RecUniCod ;
   private boolean[] T01N72_n2134RecUniCod ;
   private java.math.BigDecimal[] T01N72_A2120RecEstGK ;
   private boolean[] T01N72_n2120RecEstGK ;
   private java.math.BigDecimal[] T01N72_A5105RecEstCPPa ;
   private boolean[] T01N72_n5105RecEstCPPa ;
   private java.math.BigDecimal[] T01N72_A5106RecEstCosK ;
   private boolean[] T01N72_n5106RecEstCosK ;
   private short[] T01N72_A6063RecEstPar ;
   private boolean[] T01N72_n6063RecEstPar ;
   private java.math.BigDecimal[] T01N72_A8461RecEstFin ;
   private boolean[] T01N72_n8461RecEstFin ;
   private String[] T01N72_A396EmprCod ;
   private String[] T01N72_A719PrdNum ;
   private boolean[] T01N72_n719PrdNum ;
   private String[] T01N72_A1032FonCod ;
   private byte[] T01N72_A2524DisComLin ;
   private String[] T01N72_A1056DisComCod ;
   private int[] T01N726_A795PrvNum ;
   private java.math.BigDecimal[] T01N726_A685PrdCanRes ;
   private String[] T01N726_A718PrdNom ;
   private java.math.BigDecimal[] T01N726_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01N726_A705PrdExiCC ;
   private byte[] T01N726_A742PrdUniCom ;
   private byte[] T01N726_A743PrdUniCon ;
   private int[] T01N730_A795PrvNum ;
   private java.math.BigDecimal[] T01N730_A685PrdCanRes ;
   private String[] T01N730_A718PrdNom ;
   private java.math.BigDecimal[] T01N730_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01N730_A705PrdExiCC ;
   private byte[] T01N730_A742PrdUniCom ;
   private byte[] T01N730_A743PrdUniCon ;
   private String[] T01N731_A794PrvNom ;
   private boolean[] T01N731_n794PrvNom ;
   private String[] T01N732_A396EmprCod ;
   private int[] T01N732_A129BarCod ;
   private byte[] T01N732_A132BarCodReo ;
   private String[] T01N732_A130BarCodPar ;
   private byte[] T01N732_A2524DisComLin ;
   private String[] T01N732_A1056DisComCod ;
   private String[] T01N732_A1032FonCod ;
   private byte[] T01N732_A2124RecMolCod ;
   private byte[] T01N732_A2126RecMolLin ;
   private byte[] T01N732_A2121RecEstNan ;
   private String[] T01N734_A396EmprCod ;
   private int[] T01N734_A129BarCod ;
   private byte[] T01N734_A132BarCodReo ;
   private String[] T01N734_A130BarCodPar ;
   private byte[] T01N734_A2524DisComLin ;
   private String[] T01N734_A1056DisComCod ;
   private String[] T01N734_A1032FonCod ;
   private byte[] T01N734_A2124RecMolCod ;
   private byte[] T01N734_A2126RecMolLin ;
   private String[] T01N735_A407EmprNom ;
   private boolean[] T01N735_n407EmprNom ;
   private int[] T01N736_A2509BarCodLan ;
   private boolean[] T01N736_n2509BarCodLan ;
   private java.math.BigDecimal[] T01N738_A2676RecPasTotC ;
   private boolean[] T01N738_n2676RecPasTotC ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] T01N74_A795PrvNum ;
   private java.math.BigDecimal[] T01N74_A685PrdCanRes ;
   private String[] T01N74_A718PrdNom ;
   private java.math.BigDecimal[] T01N74_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01N74_A705PrdExiCC ;
   private byte[] T01N74_A742PrdUniCom ;
   private byte[] T01N74_A743PrdUniCon ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclse00__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclse00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclse00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclse00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclse00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01N72", "SELECT BarCod, BarCodReo, BarCodPar, RecMolCod, RecMolLin, RecEstCP, RecUniCod, RecEstGK, RecEstCPPa, RecEstCosK, RecEstPar, RecEstFin, EmprCod, PrdNum, FonCod, DisComLin, DisComCod FROM TXPRECPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ?  FOR UPDATE OF RecEstCP, RecUniCod, RecEstGK, RecEstCPPa, RecEstCosK, RecEstPar, RecEstFin, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N73", "SELECT BarCod, BarCodReo, BarCodPar, RecMolCod, RecMolLin, RecEstCP, RecUniCod, RecEstGK, RecEstCPPa, RecEstCosK, RecEstPar, RecEstFin, EmprCod, PrdNum, FonCod, DisComLin, DisComCod FROM TXPRECPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N74", "SELECT PrvNum, PrdCanRes, PrdNom, PrdExiAlm, PrdExiCC, PrdUniCom, PrdUniCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdCanRes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N75", "SELECT PrvNum, PrdCanRes, PrdNom, PrdExiAlm, PrdExiCC, PrdUniCom, PrdUniCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N76", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N77", "SELECT RecMolCod, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPRECMOL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ?  FOR UPDATE OF RecMolCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N78", "SELECT RecMolCod, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPRECMOL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N79", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N710", "SELECT BarCodLan FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N712", "SELECT COALESCE( T1.RecPasTotC, 0) AS RecPasTotC FROM (SELECT SUM(RecPasCan) AS RecPasTotC, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECPAS GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.DisComLin = ? AND T1.DisComCod = ? AND T1.FonCod = ? AND T1.RecMolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N714", "SELECT /*+ FIRST_ROWS(1) */ TM1.RecMolCod, T3.BarCodLan, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.DisComLin, TM1.DisComCod, TM1.FonCod, COALESCE( T4.RecPasTotC, 0) AS RecPasTotC FROM (((TXPRECMOL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCOM T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar AND T3.DisComLin = TM1.DisComLin AND T3.DisComCod = TM1.DisComCod AND T3.FonCod = TM1.FonCod) LEFT JOIN (SELECT SUM(RecPasCan) AS RecPasTotC, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECPAS GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar AND T4.DisComLin = TM1.DisComLin AND T4.DisComCod = TM1.DisComCod AND T4.FonCod = TM1.FonCod AND T4.RecMolCod = TM1.RecMolCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.DisComLin = ? and TM1.DisComCod = ? and TM1.FonCod = ? and TM1.RecMolCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.DisComLin, TM1.DisComCod, TM1.FonCod, TM1.RecMolCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N715", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECMOL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N716", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECMOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N717", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECMOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, DisComLin DESC, DisComCod DESC, FonCod DESC, RecMolCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N718", "INSERT INTO TXPRECMOL(RecMolCod, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolNom, RecMolDib, RecMolRep, RecPasUL, RecMolMtr, RecMolCns, RecMolTotK, RecMolNRep, RecMolCodC, RecMolCodD, RecMolCCOb, RecMolDgC, RecMolRec, RecPorCil) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0)", GX_NOMASK, "TXPRECMOL")
         ,new UpdateCursor("T01N719", "DELETE FROM TXPRECMOL  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ?", GX_NOMASK, "TXPRECMOL")
         ,new ForEachCursor("T01N720", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin, RecEstNan FROM TXPRECANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N721", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin FROM TXPRECPAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N722", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECMOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N723", "SELECT T2.PrvNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecMolCod, T1.RecMolLin, T1.RecEstCP, T2.PrdCanRes, T2.PrdNom, T1.RecUniCod, T1.RecEstGK, T1.RecEstCPPa, T1.RecEstCosK, T3.PrvNom, T2.PrdExiAlm, T1.RecEstPar, T1.RecEstFin, T2.PrdExiCC, T1.EmprCod, T1.PrdNum, T1.FonCod, T1.DisComLin, T1.DisComCod, T2.PrdUniCom, T2.PrdUniCon FROM ((TXPRECPRD T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T2.PrvNum) WHERE T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecMolCod = ? and T1.RecMolLin = ? and T1.EmprCod = ? and T1.FonCod = ? and T1.DisComLin = ? and T1.DisComCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecMolLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N724", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N725", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N726", "SELECT PrvNum, PrdCanRes, PrdNom, PrdExiAlm, PrdExiCC, PrdUniCom, PrdUniCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdCanRes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01N727", "INSERT INTO TXPRECPRD(BarCod, BarCodReo, BarCodPar, RecMolCod, RecMolLin, RecEstCP, RecUniCod, RecEstGK, RecEstCPPa, RecEstCosK, RecEstPar, RecEstFin, EmprCod, PrdNum, FonCod, DisComLin, DisComCod, RecEstUan) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPRECPRD")
         ,new UpdateCursor("T01N728", "UPDATE TXPRECPRD SET RecEstCP=?, RecUniCod=?, RecEstGK=?, RecEstCPPa=?, RecEstCosK=?, RecEstPar=?, RecEstFin=?, PrdNum=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ?", GX_NOMASK, "TXPRECPRD")
         ,new UpdateCursor("T01N729", "DELETE FROM TXPRECPRD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ?", GX_NOMASK, "TXPRECPRD")
         ,new ForEachCursor("T01N730", "SELECT PrvNum, PrdCanRes, PrdNom, PrdExiAlm, PrdExiCC, PrdUniCom, PrdUniCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N731", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N732", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin, RecEstNan FROM TXPRECANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N733", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01N734", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecMolCod = ? and EmprCod = ? and FonCod = ? and DisComLin = ? and DisComCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N735", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N736", "SELECT BarCodLan FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N738", "SELECT COALESCE( T1.RecPasTotC, 0) AS RecPasTotC FROM (SELECT SUM(RecPasCan) AS RecPasTotC, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod FROM TXPRECPAS GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.DisComLin = ? AND T1.DisComCod = ? AND T1.FonCod = ? AND T1.RecMolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 12);
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((String[]) buf[24])[0] = rslt.getString(17, 12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 12);
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((String[]) buf[24])[0] = rslt.getString(17, 12);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(15,4);
               ((short[]) buf[21])[0] = rslt.getShort(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[26])[0] = rslt.getString(19, 3);
               ((String[]) buf[27])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(21, 12);
               ((byte[]) buf[30])[0] = rslt.getByte(22);
               ((String[]) buf[31])[0] = rslt.getString(23, 12);
               ((byte[]) buf[32])[0] = rslt.getByte(24);
               ((byte[]) buf[33])[0] = rslt.getByte(25);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 12);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 22 :
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
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 3);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 4);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 3);
               }
               stmt.setString(13, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 6);
               }
               stmt.setString(15, (String)parms[22], 12);
               stmt.setByte(16, ((Number) parms[23]).byteValue());
               stmt.setString(17, (String)parms[24], 12);
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 3);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 4);
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 6);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               stmt.setString(14, (String)parms[21], 12);
               stmt.setString(15, (String)parms[22], 12);
               stmt.setByte(16, ((Number) parms[23]).byteValue());
               stmt.setByte(17, ((Number) parms[24]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 26 :
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
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 29 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

