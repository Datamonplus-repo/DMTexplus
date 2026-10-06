package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tingccn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
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
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11296CcLnV = httpContext.GetPar( "CcLnV") ;
         n11296CcLnV = false ;
         A11295CcLnT = (short)(GXutil.lval( httpContext.GetPar( "CcLnT"))) ;
         AV43Ok = (byte)(GXutil.lval( httpContext.GetPar( "Ok"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Ok", GXutil.str( AV43Ok, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_1BJ1509( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A11296CcLnV, A11295CcLnT, AV43Ok) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"CCDSCL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11295CcLnT = (short)(GXutil.lval( httpContext.GetPar( "CcLnT"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaccdscl1BJ1509( A396EmprCod, A4031CCTCod, A11295CcLnT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"vCCTVALD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11295CcLnT = (short)(GXutil.lval( httpContext.GetPar( "CcLnT"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asacctvald1BJ1509( A396EmprCod, A4031CCTCod, A11295CcLnT) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A11294CcLn = (short)(GXutil.lval( httpContext.GetPar( "CcLn"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11294CcLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11294CcLn), 4, 0));
            AV33BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarKgm", GXutil.ltrimstr( AV33BarKgm, 9, 2));
            AV46BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarMtr", GXutil.ltrimstr( AV46BarMtr, 9, 2));
            AV34BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarPie), 6, 0));
            AV47DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47DisCod), 8, 0));
            AV48Ccobs = httpContext.GetPar( "Ccobs") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Ccobs", AV48Ccobs);
            AV36ForTonal = httpContext.GetPar( "ForTonal") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36ForTonal", AV36ForTonal);
            AV42OpeNom = httpContext.GetPar( "OpeNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42OpeNom", AV42OpeNom);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO n CONTROLES CALIDAD", ""), (short)(0)) ;
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
      nRC_GXsfl_190 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_190"))) ;
      nGXsfl_190_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_190_idx"))) ;
      sGXsfl_190_idx = httpContext.GetPar( "sGXsfl_190_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tingccn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tingccn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tingccn_impl.class ));
   }

   public tingccn_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e111BJ2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TIngCCn.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcLn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11294CcLn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11294CcLn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcLn_Jsonclick, 0, "", "", "", "", "", 1, edtCcLn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripción del Test", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFch_Internalname, localUtil.format(A4033CCFch, "99/99/99"), localUtil.format( A4033CCFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFch_Jsonclick, 0, "", "", "", "", "", 1, edtCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TIngCCn.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Utilzacion", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtCCFchUti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFchUti_Internalname, localUtil.format(A7691CCFchUti, "99/99/99"), localUtil.format( A7691CCFchUti, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFchUti_Jsonclick, 0, "", "", "", "", "", 1, edtCCFchUti_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFchUti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFchUti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TIngCCn.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncCom_Enabled!=0) ? localUtil.format( A1223BarEncCom, "999.99") : localUtil.format( A1223BarEncCom, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCom_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca_Jsonclick, 0, "", "", "", "", "", 1, edtBarGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncAnh_Enabled!=0) ? localUtil.format( A1224BarEncAnh, "999.99") : localUtil.format( A1224BarEncAnh, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncAnh_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Gramaje Acabado 2", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca2_Jsonclick, 0, "", "", "", "", "", 1, edtBarGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Observaciones en Ancho Final", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarObsAnc_Internalname, GXutil.rtrim( A5352BarObsAnc), GXutil.rtrim( localUtil.format( A5352BarObsAnc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarObsAnc_Jsonclick, 0, "", "", "", "", "", 1, edtBarObsAnc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Observaciones en Grm2", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarObsGrm_Internalname, GXutil.rtrim( A5351BarObsGrm), GXutil.rtrim( localUtil.format( A5351BarObsGrm, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarObsGrm_Jsonclick, 0, "", "", "", "", "", 1, edtBarObsGrm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Coste Añadidas", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosAny_Internalname, GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosAny_Enabled!=0) ? localUtil.format( A140BarCosAny, "ZZZZZZ9.99") : localUtil.format( A140BarCosAny, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosAny_Jsonclick, 0, "", "", "", "", "", 1, edtBarCosAny_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Coste Produccion", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosPro_Internalname, GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosPro_Enabled!=0) ? localUtil.format( A141BarCosPro, "ZZZZZZ9.99") : localUtil.format( A141BarCosPro, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosPro_Jsonclick, 0, "", "", "", "", "", 1, edtBarCosPro_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Fecha Disposicion Cliente", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtBarFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecCli_Internalname, localUtil.format(A155BarFecCli, "99/99/99"), localUtil.format( A155BarFecCli, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TIngCCn.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Ancho Acabado 2", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca2_Jsonclick, 0, "", "", "", "", "", 1, edtBarAncAca2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Ancho Acabado 1", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca1_Jsonclick, 0, "", "", "", "", "", 1, edtBarAncAca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Rendimiento en Acabado", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarRdoA_Enabled!=0) ? localUtil.format( A1911BarRdoA, "ZZ9.99") : localUtil.format( A1911BarRdoA, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRdoA_Jsonclick, 0, "", "", "", "", "", 1, edtBarRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol190( ) ;
      nGXsfl_190_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1509 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1509 = (short)(1) ;
            scanStart1BJ1509( ) ;
            while ( RcdFound1509 != 0 )
            {
               init_level_properties1509( ) ;
               getByPrimaryKey1BJ1509( ) ;
               addRow1BJ1509( ) ;
               scanNext1BJ1509( ) ;
            }
            scanEnd1BJ1509( ) ;
            nBlankRcdCount1509 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BJ1509( ) ;
         standaloneModal1BJ1509( ) ;
         sMode1509 = Gx_mode ;
         while ( nGXsfl_190_idx < nRC_GXsfl_190 )
         {
            bGXsfl_190_Refreshing = true ;
            readRow1BJ1509( ) ;
            edtavnRcdDeleted_1509_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1509_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1509_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1509_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtCcLnT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNT_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtCCDscL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCDSCL_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCDscL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCDscL_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtCcLnV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNV_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLnV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnV_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            if ( ( nRcdExists_1509 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BJ1509( ) ;
            }
            sendRow1BJ1509( ) ;
            bGXsfl_190_Refreshing = false ;
         }
         Gx_mode = sMode1509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1509 = (short)(5) ;
         nRcdExists_1509 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BJ1509( ) ;
            while ( RcdFound1509 != 0 )
            {
               sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1901509( ) ;
               init_level_properties1509( ) ;
               standaloneNotModal1BJ1509( ) ;
               getByPrimaryKey1BJ1509( ) ;
               standaloneModal1BJ1509( ) ;
               addRow1BJ1509( ) ;
               scanNext1BJ1509( ) ;
            }
            scanEnd1BJ1509( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1509 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1901509( ) ;
      initAll1BJ1509( ) ;
      init_level_properties1509( ) ;
      nRcdExists_1509 = (short)(0) ;
      nIsMod_1509 = (short)(0) ;
      nRcdDeleted_1509 = (short)(0) ;
      nBlankRcdCount1509 = (short)(nBlankRcdUsr1509+nBlankRcdCount1509) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1509 > 0 )
      {
         standaloneNotModal1BJ1509( ) ;
         standaloneModal1BJ1509( ) ;
         addRow1BJ1509( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCcLnV_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1509 = (short)(nBlankRcdCount1509-1) ;
      }
      Gx_mode = sMode1509 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TIngCCn.htm");
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
      e121BJ2 ();
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
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11294CcLn = (short)(localUtil.ctol( httpContext.cgiGet( "Z11294CcLn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7691CCFchUti = localUtil.ctod( httpContext.cgiGet( "Z7691CCFchUti"), 0) ;
            Z4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4032CCOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4033CCFch = localUtil.ctod( httpContext.cgiGet( "Z4033CCFch"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_190 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_190"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV53Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV45CCTVALD = httpContext.cgiGet( "vCCTVALD") ;
            AV43Ok = (byte)(localUtil.ctol( httpContext.cgiGet( "vOK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A11294CcLn = (short)(localUtil.ctol( httpContext.cgiGet( edtCcLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11294CcLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11294CcLn), 4, 0));
            A4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4032CCOpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
            A4033CCFch = localUtil.ctod( httpContext.cgiGet( edtCCFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4033CCFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            A7691CCFchUti = localUtil.ctod( httpContext.cgiGet( edtCCFchUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7691CCFchUti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A1223BarEncCom = localUtil.ctond( httpContext.cgiGet( edtBarEncCom_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
            A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
            A1224BarEncAnh = localUtil.ctond( httpContext.cgiGet( edtBarEncAnh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
            A3137BarGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
            A5352BarObsAnc = httpContext.cgiGet( edtBarObsAnc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
            A5351BarObsGrm = httpContext.cgiGet( edtBarObsGrm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
            A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A140BarCosAny = localUtil.ctond( httpContext.cgiGet( edtBarCosAny_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
            A141BarCosPro = localUtil.ctond( httpContext.cgiGet( edtBarCosPro_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A155BarFecCli = localUtil.ctod( httpContext.cgiGet( edtBarFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A126BarAncAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
            A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
            A1911BarRdoA = localUtil.ctond( httpContext.cgiGet( edtBarRdoA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               A11294CcLn = (short)(GXutil.lval( httpContext.GetPar( "CcLn"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11294CcLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11294CcLn), 4, 0));
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
                     if ( GXutil.strcmp(sEvt, "'OBSERVACIONES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Observaciones' */
                        e131BJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e121BJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver' */
                        e141BJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111BJ2 ();
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
            initAll1BJ1508( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1509_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1509_Enabled), 5, 0), !bGXsfl_190_Refreshing);
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
      disableAttributes1BJ1508( ) ;
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

   public void confirm_1BJ0( )
   {
      beforeValidate1BJ1508( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BJ1508( ) ;
         }
         else
         {
            checkExtendedTable1BJ1508( ) ;
            if ( AnyError == 0 )
            {
               zm1BJ1508( 8) ;
               zm1BJ1508( 9) ;
               zm1BJ1508( 10) ;
               zm1BJ1508( 11) ;
               zm1BJ1508( 12) ;
            }
            closeExtendedTableCursors1BJ1508( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1508 = Gx_mode ;
         confirm_1BJ1509( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1508 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1508 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BJ0( ) ;
      }
   }

   public void confirm_1BJ1509( )
   {
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow1BJ1509( ) ;
         if ( ( nRcdExists_1509 != 0 ) || ( nIsMod_1509 != 0 ) )
         {
            getKey1BJ1509( ) ;
            if ( ( nRcdExists_1509 == 0 ) && ( nRcdDeleted_1509 == 0 ) )
            {
               if ( RcdFound1509 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BJ1509( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BJ1509( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BJ1509( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
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
               if ( RcdFound1509 != 0 )
               {
                  if ( nRcdDeleted_1509 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BJ1509( ) ;
                     load1BJ1509( ) ;
                     beforeValidate1BJ1509( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BJ1509( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1509 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BJ1509( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BJ1509( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BJ1509( ) ;
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
                  if ( nRcdDeleted_1509 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1509_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCcLnT_Internalname, GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCDscL_Internalname, GXutil.rtrim( A11301CCDscL)) ;
         httpContext.changePostValue( edtCcLnV_Internalname, GXutil.rtrim( A11296CcLnV)) ;
         httpContext.changePostValue( "ZT_"+"Z11295CcLnT_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( Z11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11296CcLnV_"+sGXsfl_190_idx, GXutil.rtrim( Z11296CcLnV)) ;
         httpContext.changePostValue( "nRcdDeleted_1509_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1509_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1509_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1509 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1509_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNT_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCDSCL_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCDscL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNV_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BJ0( )
   {
   }

   public void e121BJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV53Pgmname, (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN136_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1102_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      GXt_char1 = AV24Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit13", AV24Lit13);
      GXt_char1 = AV25Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit14", AV25Lit14);
      GXt_char1 = AV29Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN436_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit18", AV29Lit18);
      GXt_char1 = AV32Lit45 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit45 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit45", AV32Lit45);
      GXt_char1 = AV39Lit47 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT12_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit47 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit47", AV39Lit47);
      GXt_char1 = AV40Lit48 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT13_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit48 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit48", AV40Lit48);
      GXt_char1 = AV37Lit63 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2003_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit63 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit63", AV37Lit63);
      GXt_char1 = AV35Lit73 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit73 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit73", AV35Lit73);
      GXt_char1 = AV41Lit80 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1045_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit80 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit80", AV41Lit80);
      GXt_char1 = AV49Lit81 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT558_", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Lit81 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lit81", AV49Lit81);
      GXt_char1 = AV50Lit82 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char2) ;
      tingccn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Lit82 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lit82", AV50Lit82);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tingccn_impl.this.A396EmprCod = GXv_char2[0] ;
      tingccn_impl.this.AV11EmprNom = GXv_char3[0] ;
      tingccn_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e141BJ2( )
   {
      /* 'Ver' Routine */
      returnInSub = false ;
      GXv_char4[0] = httpContext.getMessage( "SCR", "") ;
      GXv_char3[0] = httpContext.getMessage( "Original", "") ;
      new app.rhdrcarv(remoteHandle, context).execute( "", A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV51ImpCod, GXv_char4, GXv_char3) ;
   }

   public void e131BJ2( )
   {
      /* 'Observaciones' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111BJ2 ();
      if ( returnInSub )
      {
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111BJ2( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A758ProCod ;
      GXv_int7[0] = A194BarOrdLin ;
      GXv_int8[0] = A4031CCTCod ;
      new app.plock35(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_int8) ;
      tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
      tingccn_impl.this.A129BarCod = GXv_int5[0] ;
      tingccn_impl.this.A132BarCodReo = GXv_int6[0] ;
      tingccn_impl.this.A130BarCodPar = GXv_char3[0] ;
      tingccn_impl.this.A758ProCod = GXv_char2[0] ;
      tingccn_impl.this.A194BarOrdLin = GXv_int7[0] ;
      tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A758ProCod,Short.valueOf(A194BarOrdLin),Integer.valueOf(A4031CCTCod),Short.valueOf(A11294CcLn),AV33BarKgm,AV46BarMtr,Integer.valueOf(AV34BarPie),Integer.valueOf(AV47DisCod),AV48Ccobs,AV36ForTonal,AV42OpeNom});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A194BarOrdLin","A4031CCTCod","A11294CcLn","AV33BarKgm","AV46BarMtr","AV34BarPie","AV47DisCod","AV48Ccobs","AV36ForTonal","AV42OpeNom"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm1BJ1508( int GX_JID )
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
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         Z7691CCFchUti = T01BJ10_A7691CCFchUti[0] ;
         Z4032CCOpeCod = T01BJ10_A4032CCOpeCod[0] ;
         Z4033CCFch = T01BJ10_A4033CCFch[0] ;
      }
      if ( GX_JID == -7 )
      {
         Z11294CcLn = A11294CcLn ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z407EmprNom = A407EmprNom ;
         Z1223BarEncCom = A1223BarEncCom ;
         Z1909BarGraAca = A1909BarGraAca ;
         Z1224BarEncAnh = A1224BarEncAnh ;
         Z3137BarGraAca2 = A3137BarGraAca2 ;
         Z5352BarObsAnc = A5352BarObsAnc ;
         Z5351BarObsGrm = A5351BarObsGrm ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z212BarSer = A212BarSer ;
         Z140BarCosAny = A140BarCosAny ;
         Z141BarCosPro = A141BarCosPro ;
         Z1235BarNumCli = A1235BarNumCli ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z136BarColNum = A136BarColNum ;
         Z135BarColNom = A135BarColNom ;
         Z155BarFecCli = A155BarFecCli ;
         Z143BarDisNum = A143BarDisNum ;
         Z126BarAncAca2 = A126BarAncAca2 ;
         Z125BarAncAca1 = A125BarAncAca1 ;
         Z1911BarRdoA = A1911BarRdoA ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z4036CCTDsc = A4036CCTDsc ;
         Z7691CCFchUti = A7691CCFchUti ;
         Z4032CCOpeCod = A4032CCOpeCod ;
         Z4033CCFch = A4033CCFch ;
      }
   }

   public void standaloneNotModal( )
   {
      AV53Pgmname = "TIngCCn" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      /* Using cursor T01BJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BJ6_A407EmprNom[0] ;
      n407EmprNom = T01BJ6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01BJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1223BarEncCom = T01BJ7_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1909BarGraAca = T01BJ7_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A1224BarEncAnh = T01BJ7_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A3137BarGraAca2 = T01BJ7_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A5352BarObsAnc = T01BJ7_A5352BarObsAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
      A5351BarObsGrm = T01BJ7_A5351BarObsGrm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
      A4812BarEncCli = T01BJ7_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A212BarSer = T01BJ7_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A140BarCosAny = T01BJ7_A140BarCosAny[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
      A141BarCosPro = T01BJ7_A141BarCosPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
      A1235BarNumCli = T01BJ7_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = T01BJ7_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A136BarColNum = T01BJ7_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = T01BJ7_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A155BarFecCli = T01BJ7_A155BarFecCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      A143BarDisNum = T01BJ7_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A126BarAncAca2 = T01BJ7_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A125BarAncAca1 = T01BJ7_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A1911BarRdoA = T01BJ7_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A252CliCod = T01BJ7_A252CliCod[0] ;
      n252CliCod = T01BJ7_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(5);
      /* Using cursor T01BJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T01BJ11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(9);
      /* Using cursor T01BJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A4036CCTDsc = T01BJ8_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(6);
      /* Using cursor T01BJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      zm1BJ1508( 11) ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A7691CCFchUti = T01BJ10_A7691CCFchUti[0] ;
      n7691CCFchUti = T01BJ10_n7691CCFchUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
      A4032CCOpeCod = T01BJ10_A4032CCOpeCod[0] ;
      n4032CCOpeCod = T01BJ10_n4032CCOpeCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
      A4033CCFch = T01BJ10_A4033CCFch[0] ;
      n4033CCFch = T01BJ10_n4033CCFch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
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
      A7691CCFchUti = GXutil.today( ) ;
      n7691CCFchUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
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

   public void load1BJ1508( )
   {
      /* Using cursor T01BJ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1508 = (short)(1) ;
         A7691CCFchUti = T01BJ12_A7691CCFchUti[0] ;
         n7691CCFchUti = T01BJ12_n7691CCFchUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
         A407EmprNom = T01BJ12_A407EmprNom[0] ;
         n407EmprNom = T01BJ12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4032CCOpeCod = T01BJ12_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T01BJ12_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4036CCTDsc = T01BJ12_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4033CCFch = T01BJ12_A4033CCFch[0] ;
         n4033CCFch = T01BJ12_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A279CliNom = T01BJ12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1223BarEncCom = T01BJ12_A1223BarEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1909BarGraAca = T01BJ12_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A1224BarEncAnh = T01BJ12_A1224BarEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A3137BarGraAca2 = T01BJ12_A3137BarGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A5352BarObsAnc = T01BJ12_A5352BarObsAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
         A5351BarObsGrm = T01BJ12_A5351BarObsGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
         A4812BarEncCli = T01BJ12_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A212BarSer = T01BJ12_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A140BarCosAny = T01BJ12_A140BarCosAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
         A141BarCosPro = T01BJ12_A141BarCosPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
         A1235BarNumCli = T01BJ12_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A1234BarNomCli = T01BJ12_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A136BarColNum = T01BJ12_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A135BarColNom = T01BJ12_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A155BarFecCli = T01BJ12_A155BarFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
         A143BarDisNum = T01BJ12_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A126BarAncAca2 = T01BJ12_A126BarAncAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A125BarAncAca1 = T01BJ12_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A1911BarRdoA = T01BJ12_A1911BarRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A252CliCod = T01BJ12_A252CliCod[0] ;
         n252CliCod = T01BJ12_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1BJ1508( -7) ;
      }
      pr_default.close(10);
      onLoadActions1BJ1508( ) ;
   }

   public void onLoadActions1BJ1508( )
   {
   }

   public void checkExtendedTable1BJ1508( )
   {
      nIsDirty_1508 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1BJ1508( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1BJ1508( )
   {
      /* Using cursor T01BJ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1508 = (short)(1) ;
      }
      else
      {
         RcdFound1508 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(3) != 101) && ( T01BJ5_A11294CcLn[0] == A11294CcLn ) && ( GXutil.strcmp(T01BJ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BJ5_A129BarCod[0] == A129BarCod ) && ( T01BJ5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01BJ5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01BJ5_A758ProCod[0], A758ProCod) == 0 ) && ( T01BJ5_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01BJ5_A4031CCTCod[0] == A4031CCTCod ) )
      {
         zm1BJ1508( 7) ;
         RcdFound1508 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z11294CcLn = A11294CcLn ;
         sMode1508 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BJ1508( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1508 = (short)(0) ;
            initializeNonKey1BJ1508( ) ;
         }
         Gx_mode = sMode1508 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1508 = (short)(0) ;
         initializeNonKey1BJ1508( ) ;
         sMode1508 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1508 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1BJ1508( ) ;
      if ( RcdFound1508 == 0 )
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
      RcdFound1508 = (short)(0) ;
      /* Using cursor T01BJ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01BJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BJ14_A129BarCod[0] == A129BarCod ) && ( T01BJ14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01BJ14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01BJ14_A758ProCod[0], A758ProCod) == 0 ) && ( T01BJ14_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01BJ14_A4031CCTCod[0] == A4031CCTCod ) && ( T01BJ14_A11294CcLn[0] == A11294CcLn ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01BJ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BJ14_A129BarCod[0] == A129BarCod ) && ( T01BJ14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01BJ14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01BJ14_A758ProCod[0], A758ProCod) == 0 ) && ( T01BJ14_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01BJ14_A4031CCTCod[0] == A4031CCTCod ) && ( T01BJ14_A11294CcLn[0] == A11294CcLn ) )
         {
            RcdFound1508 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1508 = (short)(0) ;
      /* Using cursor T01BJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01BJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BJ15_A129BarCod[0] == A129BarCod ) && ( T01BJ15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01BJ15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01BJ15_A758ProCod[0], A758ProCod) == 0 ) && ( T01BJ15_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01BJ15_A4031CCTCod[0] == A4031CCTCod ) && ( T01BJ15_A11294CcLn[0] == A11294CcLn ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01BJ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BJ15_A129BarCod[0] == A129BarCod ) && ( T01BJ15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01BJ15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01BJ15_A758ProCod[0], A758ProCod) == 0 ) && ( T01BJ15_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01BJ15_A4031CCTCod[0] == A4031CCTCod ) && ( T01BJ15_A11294CcLn[0] == A11294CcLn ) )
         {
            RcdFound1508 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BJ1508( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1BJ1508( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1508 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11294CcLn != Z11294CcLn ) )
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
               update1BJ1508( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11294CcLn != Z11294CcLn ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1BJ1508( ) ;
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
                  insert1BJ1508( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11294CcLn != Z11294CcLn ) )
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
      getKey1BJ1508( ) ;
      if ( RcdFound1508 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11294CcLn != Z11294CcLn ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11294CcLn != Z11294CcLn ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tingccn");
   }

   public void insert_check( )
   {
      confirm_1BJ0( ) ;
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
      if ( RcdFound1508 == 0 )
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
      scanStart1BJ1508( ) ;
      if ( RcdFound1508 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BJ1508( ) ;
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
      if ( RcdFound1508 == 0 )
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
      if ( RcdFound1508 == 0 )
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
      scanStart1BJ1508( ) ;
      if ( RcdFound1508 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1508 != 0 )
         {
            scanNext1BJ1508( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BJ1508( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BJ1508( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCn"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCn"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01BJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || !( GXutil.dateCompare(GXutil.resetTime(Z7691CCFchUti), GXutil.resetTime(T01BJ16_A7691CCFchUti[0])) ) || ( Z4032CCOpeCod != T01BJ16_A4032CCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01BJ16_A4033CCFch[0])) ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7691CCFchUti), GXutil.resetTime(T01BJ16_A7691CCFchUti[0])) ) )
            {
               GXutil.writeLogln("tingccn:[seudo value changed for attri]"+"CCFchUti");
               GXutil.writeLogRaw("Old: ",Z7691CCFchUti);
               GXutil.writeLogRaw("Current: ",T01BJ16_A7691CCFchUti[0]);
            }
            if ( Z4032CCOpeCod != T01BJ16_A4032CCOpeCod[0] )
            {
               GXutil.writeLogln("tingccn:[seudo value changed for attri]"+"CCOpeCod");
               GXutil.writeLogRaw("Old: ",Z4032CCOpeCod);
               GXutil.writeLogRaw("Current: ",T01BJ16_A4032CCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01BJ16_A4033CCFch[0])) ) )
            {
               GXutil.writeLogln("tingccn:[seudo value changed for attri]"+"CCFch");
               GXutil.writeLogRaw("Old: ",Z4033CCFch);
               GXutil.writeLogRaw("Current: ",T01BJ16_A4033CCFch[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BJ1508( )
   {
      beforeValidate1BJ1508( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BJ1508( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BJ1508( 0) ;
         checkOptimisticConcurrency1BJ1508( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BJ1508( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BJ1508( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BJ17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A11294CcLn), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11BJ1508( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BJ1508( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BJ0( ) ;
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
            load1BJ1508( ) ;
         }
         endLevel1BJ1508( ) ;
      }
      closeExtendedTableCursors1BJ1508( ) ;
   }

   public void update1BJ1508( )
   {
      beforeValidate1BJ1508( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BJ1508( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BJ1508( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BJ1508( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BJ1508( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCCn */
                  deferredUpdate1BJ1508( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11BJ1508( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BJ1508( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BJ0( ) ;
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
         endLevel1BJ1508( ) ;
      }
      closeExtendedTableCursors1BJ1508( ) ;
   }

   public void deferredUpdate1BJ1508( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BJ1508( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BJ1508( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BJ1508( ) ;
         afterConfirm1BJ1508( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BJ1508( ) ;
            if ( AnyError == 0 )
            {
               scanStart1BJ1509( ) ;
               while ( RcdFound1509 != 0 )
               {
                  getByPrimaryKey1BJ1509( ) ;
                  delete1BJ1509( ) ;
                  scanNext1BJ1509( ) ;
               }
               scanEnd1BJ1509( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BJ18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11BJ1508( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1508 == 0 )
                        {
                           initAll1BJ1508( ) ;
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
                        resetCaption1BJ0( ) ;
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
      sMode1508 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BJ1508( ) ;
      Gx_mode = sMode1508 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BJ1508( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1BJ1509( )
   {
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow1BJ1509( ) ;
         if ( ( nRcdExists_1509 != 0 ) || ( nIsMod_1509 != 0 ) )
         {
            standaloneNotModal1BJ1509( ) ;
            getKey1BJ1509( ) ;
            if ( ( nRcdExists_1509 == 0 ) && ( nRcdDeleted_1509 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BJ1509( ) ;
            }
            else
            {
               if ( RcdFound1509 != 0 )
               {
                  if ( ( nRcdDeleted_1509 != 0 ) && ( nRcdExists_1509 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BJ1509( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1509 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BJ1509( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1509 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1509_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCcLnT_Internalname, GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCDscL_Internalname, GXutil.rtrim( A11301CCDscL)) ;
         httpContext.changePostValue( edtCcLnV_Internalname, GXutil.rtrim( A11296CcLnV)) ;
         httpContext.changePostValue( "ZT_"+"Z11295CcLnT_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( Z11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11296CcLnV_"+sGXsfl_190_idx, GXutil.rtrim( Z11296CcLnV)) ;
         httpContext.changePostValue( "nRcdDeleted_1509_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1509_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1509_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1509 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1509_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNT_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCDSCL_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCDscL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNV_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BJ1509( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1509 = (short)(0) ;
      nIsMod_1509 = (short)(0) ;
      nRcdDeleted_1509 = (short)(0) ;
   }

   public void processLevel1BJ1508( )
   {
      /* Save parent mode. */
      sMode1508 = Gx_mode ;
      processNestedLevel1BJ1509( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1508 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11BJ1508( )
   {
      /* Using cursor T01BJ19 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n7691CCFchUti), A7691CCFchUti, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
   }

   public void endLevel1BJ1508( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      pr_default.close(14);
      if ( AnyError == 0 )
      {
         beforeComplete1BJ1508( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tingccn");
         if ( AnyError == 0 )
         {
            confirmValues1BJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tingccn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BJ1508( )
   {
      /* Scan By routine */
      /* Using cursor T01BJ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      RcdFound1508 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1508 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BJ1508( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1508 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1508 = (short)(1) ;
      }
   }

   public void scanEnd1BJ1508( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1BJ1508( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BJ1508( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BJ1508( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BJ1508( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BJ1508( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BJ1508( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BJ1508( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCcLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLn_Enabled), 5, 0), true);
      edtCCOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOpeCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtCCFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFch_Enabled), 5, 0), true);
      edtCCFchUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFchUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFchUti_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarEncCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCom_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      edtBarEncAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncAnh_Enabled), 5, 0), true);
      edtBarGraAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca2_Enabled), 5, 0), true);
      edtBarObsAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarObsAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsAnc_Enabled), 5, 0), true);
      edtBarObsGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarObsGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsGrm_Enabled), 5, 0), true);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarCosAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAny_Enabled), 5, 0), true);
      edtBarCosPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPro_Enabled), 5, 0), true);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtBarAncAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca2_Enabled), 5, 0), true);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarRdoA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRdoA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRdoA_Enabled), 5, 0), true);
   }

   public void zm1BJ1509( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11296CcLnV = T01BJ3_A11296CcLnV[0] ;
         }
         else
         {
            Z11296CcLnV = A11296CcLnV ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z11294CcLn = A11294CcLn ;
         Z11295CcLnT = A11295CcLnT ;
         Z11296CcLnV = A11296CcLnV ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal1BJ1509( )
   {
      edtCcLnT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void standaloneModal1BJ1509( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void load1BJ1509( )
   {
      /* Using cursor T01BJ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1509 = (short)(1) ;
         A11296CcLnV = T01BJ21_A11296CcLnV[0] ;
         n11296CcLnV = T01BJ21_n11296CcLnV[0] ;
         zm1BJ1509( -13) ;
      }
      pr_default.close(19);
      onLoadActions1BJ1509( ) ;
   }

   public void onLoadActions1BJ1509( )
   {
      GXt_char1 = A11301CCDscL ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A4031CCTCod ;
      GXv_int7[0] = A11295CcLnT ;
      GXv_char3[0] = GXt_char1 ;
      new app.pdscccc(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3) ;
      tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
      tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
      tingccn_impl.this.A11295CcLnT = GXv_int7[0] ;
      tingccn_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A11301CCDscL = GXt_char1 ;
      if ( true /* After */ )
      {
         GXt_char1 = AV45CCTVALD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A4031CCTCod ;
         GXv_int7[0] = A11295CcLnT ;
         GXv_char3[0] = GXt_char1 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3) ;
         tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
         tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
         tingccn_impl.this.A11295CcLnT = GXv_int7[0] ;
         tingccn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         AV45CCTVALD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45CCTVALD", AV45CCTVALD);
      }
   }

   public void checkExtendedTable1BJ1509( )
   {
      nIsDirty_1509 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BJ1509( ) ;
      nIsDirty_1509 = (short)(1) ;
      GXt_char1 = A11301CCDscL ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A4031CCTCod ;
      GXv_int7[0] = A11295CcLnT ;
      GXv_char3[0] = GXt_char1 ;
      new app.pdscccc(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3) ;
      tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
      tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
      tingccn_impl.this.A11295CcLnT = GXv_int7[0] ;
      tingccn_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A11301CCDscL = GXt_char1 ;
      if ( true /* After */ )
      {
         GXt_char1 = AV45CCTVALD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A4031CCTCod ;
         GXv_int7[0] = A11295CcLnT ;
         GXv_char3[0] = GXt_char1 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3) ;
         tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
         tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
         tingccn_impl.this.A11295CcLnT = GXv_int7[0] ;
         tingccn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         AV45CCTVALD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45CCTVALD", AV45CCTVALD);
      }
   }

   public void closeExtendedTableCursors1BJ1509( )
   {
   }

   public void enableDisable1BJ1509( )
   {
   }

   public void getKey1BJ1509( )
   {
      /* Using cursor T01BJ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1509 = (short)(1) ;
      }
      else
      {
         RcdFound1509 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1BJ1509( )
   {
      /* Using cursor T01BJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
      if ( (pr_default.getStatus(1) != 101) && ( T01BJ3_A129BarCod[0] == A129BarCod ) && ( T01BJ3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01BJ3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BJ3_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01BJ3_A11294CcLn[0] == A11294CcLn ) && ( GXutil.strcmp(T01BJ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BJ3_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01BJ3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm1BJ1509( 13) ;
         RcdFound1509 = (short)(1) ;
         initializeNonKey1BJ1509( ) ;
         A11295CcLnT = T01BJ3_A11295CcLnT[0] ;
         A11296CcLnV = T01BJ3_A11296CcLnV[0] ;
         n11296CcLnV = T01BJ3_n11296CcLnV[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z11294CcLn = A11294CcLn ;
         Z11295CcLnT = A11295CcLnT ;
         sMode1509 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BJ1509( ) ;
         load1BJ1509( ) ;
         Gx_mode = sMode1509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1509 = (short)(0) ;
         initializeNonKey1BJ1509( ) ;
         sMode1509 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BJ1509( ) ;
         Gx_mode = sMode1509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BJ1509( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BJ1509( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCnT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11296CcLnV, T01BJ2_A11296CcLnV[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11296CcLnV, T01BJ2_A11296CcLnV[0]) != 0 )
            {
               GXutil.writeLogln("tingccn:[seudo value changed for attri]"+"CcLnV");
               GXutil.writeLogRaw("Old: ",Z11296CcLnV);
               GXutil.writeLogRaw("Current: ",T01BJ2_A11296CcLnV[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCnT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BJ1509( )
   {
      beforeValidate1BJ1509( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BJ1509( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BJ1509( 0) ;
         checkOptimisticConcurrency1BJ1509( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BJ1509( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BJ1509( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BJ23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT), Boolean.valueOf(n11296CcLnV), A11296CcLnV, A396EmprCod, Integer.valueOf(A4031CCTCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
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
            load1BJ1509( ) ;
         }
         endLevel1BJ1509( ) ;
      }
      closeExtendedTableCursors1BJ1509( ) ;
   }

   public void update1BJ1509( )
   {
      beforeValidate1BJ1509( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BJ1509( ) ;
      }
      if ( ( nIsMod_1509 != 0 ) || ( nIsDirty_1509 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BJ1509( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BJ1509( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BJ1509( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BJ24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n11296CcLnV), A11296CcLnV, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCnT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BJ1509( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BJ1509( ) ;
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
            endLevel1BJ1509( ) ;
         }
      }
      closeExtendedTableCursors1BJ1509( ) ;
   }

   public void deferredUpdate1BJ1509( )
   {
   }

   public void delete1BJ1509( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BJ1509( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BJ1509( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BJ1509( ) ;
         afterConfirm1BJ1509( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BJ1509( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BJ25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
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
      sMode1509 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BJ1509( ) ;
      Gx_mode = sMode1509 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BJ1509( )
   {
      standaloneModal1BJ1509( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11301CCDscL ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A4031CCTCod ;
         GXv_int7[0] = A11295CcLnT ;
         GXv_char3[0] = GXt_char1 ;
         new app.pdscccc(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3) ;
         tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
         tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
         tingccn_impl.this.A11295CcLnT = GXv_int7[0] ;
         tingccn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11301CCDscL = GXt_char1 ;
         if ( true /* After */ )
         {
            GXt_char1 = AV45CCTVALD ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A4031CCTCod ;
            GXv_int7[0] = A11295CcLnT ;
            GXv_char3[0] = GXt_char1 ;
            new app.pccdef2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3) ;
            tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
            tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
            tingccn_impl.this.A11295CcLnT = GXv_int7[0] ;
            tingccn_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            AV45CCTVALD = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45CCTVALD", AV45CCTVALD);
         }
      }
   }

   public void endLevel1BJ1509( )
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

   public void scanStart1BJ1509( )
   {
      /* Scan By routine */
      /* Using cursor T01BJ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      RcdFound1509 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1509 = (short)(1) ;
         A11295CcLnT = T01BJ26_A11295CcLnT[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BJ1509( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1509 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1509 = (short)(1) ;
         A11295CcLnT = T01BJ26_A11295CcLnT[0] ;
      }
   }

   public void scanEnd1BJ1509( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1BJ1509( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A758ProCod ;
         GXv_int7[0] = A194BarOrdLin ;
         GXv_int5[0] = A4031CCTCod ;
         GXv_char9[0] = A11296CcLnV ;
         GXv_int10[0] = A11295CcLnT ;
         GXv_int11[0] = AV43Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_int5, GXv_char9, GXv_int10, GXv_int11) ;
         tingccn_impl.this.A396EmprCod = GXv_char4[0] ;
         tingccn_impl.this.A129BarCod = GXv_int8[0] ;
         tingccn_impl.this.A132BarCodReo = GXv_int6[0] ;
         tingccn_impl.this.A130BarCodPar = GXv_char3[0] ;
         tingccn_impl.this.A758ProCod = GXv_char2[0] ;
         tingccn_impl.this.A194BarOrdLin = GXv_int7[0] ;
         tingccn_impl.this.A4031CCTCod = GXv_int5[0] ;
         tingccn_impl.this.A11296CcLnV = GXv_char9[0] ;
         tingccn_impl.this.A11295CcLnT = GXv_int10[0] ;
         tingccn_impl.this.AV43Ok = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43Ok", GXutil.str( AV43Ok, 1, 0));
      }
   }

   public void beforeInsert1BJ1509( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BJ1509( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BJ1509( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BJ1509( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BJ1509( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BJ1509( )
   {
      edtCcLnT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      edtCCDscL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCDscL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCDscL_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      edtCcLnV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnV_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void send_integrity_lvl_hashes1BJ1509( )
   {
   }

   public void send_integrity_lvl_hashes1BJ1508( )
   {
   }

   public void subsflControlProps_1901509( )
   {
      edtavnRcdDeleted_1509_Internalname = "vNRCDDELETED_1509_"+sGXsfl_190_idx ;
      edtCcLnT_Internalname = "CCLNT_"+sGXsfl_190_idx ;
      edtCCDscL_Internalname = "CCDSCL_"+sGXsfl_190_idx ;
      edtCcLnV_Internalname = "CCLNV_"+sGXsfl_190_idx ;
   }

   public void subsflControlProps_fel_1901509( )
   {
      edtavnRcdDeleted_1509_Internalname = "vNRCDDELETED_1509_"+sGXsfl_190_fel_idx ;
      edtCcLnT_Internalname = "CCLNT_"+sGXsfl_190_fel_idx ;
      edtCCDscL_Internalname = "CCDSCL_"+sGXsfl_190_fel_idx ;
      edtCcLnV_Internalname = "CCLNV_"+sGXsfl_190_fel_idx ;
   }

   public void addRow1BJ1509( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1901509( ) ;
      sendRow1BJ1509( ) ;
   }

   public void sendRow1BJ1509( )
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
         if ( ((int)((nGXsfl_190_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1509_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1509_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1509), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1509), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1509_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1509_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLnT_Internalname,GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCcLnT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11295CcLnT), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11295CcLnT), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLnT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCcLnT_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCDscL_Internalname,GXutil.rtrim( A11301CCDscL),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCDscL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCDscL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLnV_Internalname,GXutil.rtrim( A11296CcLnV),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLnV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCcLnV_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BJ1509( ) ;
      GXCCtl = "Z11295CcLnT_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11296CcLnV_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11296CcLnV));
      GXCCtl = "nRcdDeleted_1509_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1509_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1509_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vIMPCOD_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV51ImpCod));
      GXCCtl = "vDISCOD_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV47DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARKGM_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARMTR_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV46BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARPIE_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCCOBS_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV48Ccobs);
      GXCCtl = "vFORTONAL_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV36ForTonal));
      GXCCtl = "vOPENOM_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1509_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLNT_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCDSCL_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCDscL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLNV_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BJ1509( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1901509( ) ;
      edtavnRcdDeleted_1509_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1509_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCcLnT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNT_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCDscL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCDSCL_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCcLnV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNV_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1509_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1509_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1509");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1509_Internalname ;
         wbErr = true ;
         nRcdDeleted_1509 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1509 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1509_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11295CcLnT = (short)(localUtil.ctol( httpContext.cgiGet( edtCcLnT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A11301CCDscL = httpContext.cgiGet( edtCCDscL_Internalname) ;
      A11296CcLnV = httpContext.cgiGet( edtCcLnV_Internalname) ;
      n11296CcLnV = false ;
      GXCCtl = "Z11295CcLnT_" + sGXsfl_190_idx ;
      Z11295CcLnT = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11296CcLnV_" + sGXsfl_190_idx ;
      Z11296CcLnV = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1509_" + sGXsfl_190_idx ;
      nRcdDeleted_1509 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1509_" + sGXsfl_190_idx ;
      nRcdExists_1509 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1509_" + sGXsfl_190_idx ;
      nIsMod_1509 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCcLnT_Enabled = edtCcLnT_Enabled ;
   }

   public void confirmValues1BJ0( )
   {
      nGXsfl_190_idx = 0 ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1901509( ) ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
         sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1901509( ) ;
         httpContext.changePostValue( "Z11295CcLnT_"+sGXsfl_190_idx, httpContext.cgiGet( "ZT_"+"Z11295CcLnT_"+sGXsfl_190_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11295CcLnT_"+sGXsfl_190_idx) ;
         httpContext.changePostValue( "Z11296CcLnV_"+sGXsfl_190_idx, httpContext.cgiGet( "ZT_"+"Z11296CcLnV_"+sGXsfl_190_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11296CcLnV_"+sGXsfl_190_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tingccn", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A11294CcLn,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarPie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV47DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV48Ccobs)),GXutil.URLEncode(GXutil.rtrim(AV36ForTonal)),GXutil.URLEncode(GXutil.rtrim(AV42OpeNom))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod","CcLn","BarKgm","BarMtr","BarPie","DisCod","Ccobs","ForTonal","OpeNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11294CcLn", GXutil.ltrim( localUtil.ntoc( Z11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7691CCFchUti", localUtil.dtoc( Z7691CCFchUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.dtoc( Z4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_190", GXutil.ltrim( localUtil.ntoc( nGXsfl_190_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV51ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV47DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV33BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV46BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIE", GXutil.ltrim( localUtil.ntoc( AV34BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCOBS", AV48Ccobs);
      app.GxWebStd.gx_hidden_field( httpContext, "vFORTONAL", GXutil.rtrim( AV36ForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV42OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV53Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTVALD", AV45CCTVALD);
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.ltrim( localUtil.ntoc( AV43Ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tingccn", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A11294CcLn,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarPie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV47DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV48Ccobs)),GXutil.URLEncode(GXutil.rtrim(AV36ForTonal)),GXutil.URLEncode(GXutil.rtrim(AV42OpeNom))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod","CcLn","BarKgm","BarMtr","BarPie","DisCod","Ccobs","ForTonal","OpeNom"})  ;
   }

   public String getPgmname( )
   {
      return "TIngCCn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO n CONTROLES CALIDAD", "") ;
   }

   public void initializeNonKey1BJ1508( )
   {
      Z7691CCFchUti = GXutil.nullDate() ;
      Z4032CCOpeCod = 0 ;
      Z4033CCFch = GXutil.nullDate() ;
   }

   public void initAll1BJ1508( )
   {
      initializeNonKey1BJ1508( ) ;
   }

   public void standaloneModalInsert( )
   {
      A7691CCFchUti = i7691CCFchUti ;
      n7691CCFchUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
   }

   public void initializeNonKey1BJ1509( )
   {
      AV43Ok = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Ok", GXutil.str( AV43Ok, 1, 0));
      AV45CCTVALD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45CCTVALD", AV45CCTVALD);
      A11301CCDscL = "" ;
      A11296CcLnV = "" ;
      n11296CcLnV = false ;
      Z11296CcLnV = "" ;
   }

   public void initAll1BJ1509( )
   {
      A11295CcLnT = (short)(0) ;
      initializeNonKey1BJ1509( ) ;
   }

   public void standaloneModalInsert1BJ1509( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565271", true, true);
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
      httpContext.AddJavascriptSource("tingccn.js", "?20268241565271", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1509( )
   {
      edtCcLnT_Enabled = defedtCcLnT_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void startgridcontrol190( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11301CCDscL));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCDscL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11296CcLnV));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCcLn_Internalname = "CCLN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCCOpeCod_Internalname = "CCOPECOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCCFch_Internalname = "CCFCH" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtCCFchUti_Internalname = "CCFCHUTI" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarEncCom_Internalname = "BARENCCOM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarGraAca_Internalname = "BARGRAACA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarEncAnh_Internalname = "BARENCANH" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarGraAca2_Internalname = "BARGRAACA2" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarObsAnc_Internalname = "BAROBSANC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarObsGrm_Internalname = "BAROBSGRM" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarCosAny_Internalname = "BARCOSANY" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarCosPro_Internalname = "BARCOSPRO" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBarFecCli_Internalname = "BARFECCLI" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBarAncAca2_Internalname = "BARANCACA2" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtBarRdoA_Internalname = "BARRDOA" ;
      edtavnRcdDeleted_1509_Internalname = "vNRCDDELETED_1509" ;
      edtCcLnT_Internalname = "CCLNT" ;
      edtCCDscL_Internalname = "CCDSCL" ;
      edtCcLnV_Internalname = "CCLNV" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO n CONTROLES CALIDAD", "") );
      edtCcLnV_Jsonclick = "" ;
      edtCCDscL_Jsonclick = "" ;
      edtCcLnT_Jsonclick = "" ;
      edtavnRcdDeleted_1509_Jsonclick = "" ;
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
      edtCcLnV_Enabled = 1 ;
      edtCCDscL_Enabled = 0 ;
      edtCcLnT_Enabled = 0 ;
      edtavnRcdDeleted_1509_Enabled = 1 ;
      edtBarRdoA_Jsonclick = "" ;
      edtBarRdoA_Backcolor = (int)(0xFFFFFF) ;
      edtBarRdoA_Enabled = 0 ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarAncAca1_Backcolor = (int)(0xFFFFFF) ;
      edtBarAncAca1_Enabled = 0 ;
      edtBarAncAca2_Jsonclick = "" ;
      edtBarAncAca2_Backcolor = (int)(0xFFFFFF) ;
      edtBarAncAca2_Enabled = 0 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarDisNum_Enabled = 0 ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecCli_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNomCli_Enabled = 0 ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumCli_Enabled = 0 ;
      edtBarCosPro_Jsonclick = "" ;
      edtBarCosPro_Backcolor = (int)(0xFFFFFF) ;
      edtBarCosPro_Enabled = 0 ;
      edtBarCosAny_Jsonclick = "" ;
      edtBarCosAny_Backcolor = (int)(0xFFFFFF) ;
      edtBarCosAny_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncCli_Enabled = 0 ;
      edtBarObsGrm_Jsonclick = "" ;
      edtBarObsGrm_Backcolor = (int)(0xFFFFFF) ;
      edtBarObsGrm_Enabled = 0 ;
      edtBarObsAnc_Jsonclick = "" ;
      edtBarObsAnc_Backcolor = (int)(0xFFFFFF) ;
      edtBarObsAnc_Enabled = 0 ;
      edtBarGraAca2_Jsonclick = "" ;
      edtBarGraAca2_Backcolor = (int)(0xFFFFFF) ;
      edtBarGraAca2_Enabled = 0 ;
      edtBarEncAnh_Jsonclick = "" ;
      edtBarEncAnh_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncAnh_Enabled = 0 ;
      edtBarGraAca_Jsonclick = "" ;
      edtBarGraAca_Backcolor = (int)(0xFFFFFF) ;
      edtBarGraAca_Enabled = 0 ;
      edtBarEncCom_Jsonclick = "" ;
      edtBarEncCom_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncCom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtCCFchUti_Jsonclick = "" ;
      edtCCFchUti_Backcolor = (int)(0xFFFFFF) ;
      edtCCFchUti_Enabled = 0 ;
      edtCCFch_Jsonclick = "" ;
      edtCCFch_Backcolor = (int)(0xFFFFFF) ;
      edtCCFch_Enabled = 0 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCCTDsc_Enabled = 0 ;
      edtCCOpeCod_Jsonclick = "" ;
      edtCCOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCOpeCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCcLn_Jsonclick = "" ;
      edtCcLn_Backcolor = (int)(0xFFFFFF) ;
      edtCcLn_Enabled = 0 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCTCod_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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

   public void gx2asaccdscl1BJ1509( String A396EmprCod ,
                                    int A4031CCTCod ,
                                    short A11295CcLnT )
   {
      GXt_char1 = A11301CCDscL ;
      GXv_char9[0] = A396EmprCod ;
      GXv_int8[0] = A4031CCTCod ;
      GXv_int10[0] = A11295CcLnT ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscccc(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int10, GXv_char4) ;
      tingccn_impl.this.A396EmprCod = GXv_char9[0] ;
      tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
      tingccn_impl.this.A11295CcLnT = GXv_int10[0] ;
      tingccn_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A11301CCDscL = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11301CCDscL))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asacctvald1BJ1509( String A396EmprCod ,
                                     int A4031CCTCod ,
                                     short A11295CcLnT )
   {
      if ( true /* After */ )
      {
         GXt_char1 = AV45CCTVALD ;
         GXv_char9[0] = A396EmprCod ;
         GXv_int8[0] = A4031CCTCod ;
         GXv_int10[0] = A11295CcLnT ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int10, GXv_char4) ;
         tingccn_impl.this.A396EmprCod = GXv_char9[0] ;
         tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
         tingccn_impl.this.A11295CcLnT = GXv_int10[0] ;
         tingccn_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         AV45CCTVALD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45CCTVALD", AV45CCTVALD);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( AV45CCTVALD)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_6_1BJ1509( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A758ProCod ,
                             short A194BarOrdLin ,
                             int A4031CCTCod ,
                             String A11296CcLnV ,
                             short A11295CcLnT ,
                             byte AV43Ok )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int8[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A758ProCod ;
         GXv_int10[0] = A194BarOrdLin ;
         GXv_int5[0] = A4031CCTCod ;
         GXv_char2[0] = A11296CcLnV ;
         GXv_int7[0] = A11295CcLnT ;
         GXv_int6[0] = AV43Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int11, GXv_char4, GXv_char3, GXv_int10, GXv_int5, GXv_char2, GXv_int7, GXv_int6) ;
         A396EmprCod = GXv_char9[0] ;
         A129BarCod = GXv_int8[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A758ProCod = GXv_char3[0] ;
         A194BarOrdLin = GXv_int10[0] ;
         A4031CCTCod = GXv_int5[0] ;
         A11296CcLnV = GXv_char2[0] ;
         A11295CcLnT = GXv_int7[0] ;
         AV43Ok = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43Ok", GXutil.str( AV43Ok, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11296CcLnV))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV43Ok, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_1901509( ) ;
      while ( nGXsfl_190_idx <= nRC_GXsfl_190 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BJ1509( ) ;
         standaloneModal1BJ1509( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BJ1509( ) ;
         nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
         sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1901509( ) ;
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
      /* Using cursor T01BJ27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BJ27_A407EmprNom[0] ;
      n407EmprNom = T01BJ27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01BJ28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1223BarEncCom = T01BJ28_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1909BarGraAca = T01BJ28_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A1224BarEncAnh = T01BJ28_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A3137BarGraAca2 = T01BJ28_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A5352BarObsAnc = T01BJ28_A5352BarObsAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
      A5351BarObsGrm = T01BJ28_A5351BarObsGrm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
      A4812BarEncCli = T01BJ28_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A212BarSer = T01BJ28_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A140BarCosAny = T01BJ28_A140BarCosAny[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
      A141BarCosPro = T01BJ28_A141BarCosPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
      A1235BarNumCli = T01BJ28_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = T01BJ28_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A136BarColNum = T01BJ28_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = T01BJ28_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A155BarFecCli = T01BJ28_A155BarFecCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      A143BarDisNum = T01BJ28_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A126BarAncAca2 = T01BJ28_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A125BarAncAca1 = T01BJ28_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A1911BarRdoA = T01BJ28_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A252CliCod = T01BJ28_A252CliCod[0] ;
      n252CliCod = T01BJ28_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(26);
      /* Using cursor T01BJ29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T01BJ29_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(27);
      /* Using cursor T01BJ30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A4036CCTDsc = T01BJ30_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(28);
      /* Using cursor T01BJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A7691CCFchUti = T01BJ10_A7691CCFchUti[0] ;
      n7691CCFchUti = T01BJ10_n7691CCFchUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
      A4032CCOpeCod = T01BJ10_A4032CCOpeCod[0] ;
      n4032CCOpeCod = T01BJ10_n4032CCOpeCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
      A4033CCFch = T01BJ10_A4033CCFch[0] ;
      n4033CCFch = T01BJ10_n4033CCFch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      pr_default.close(8);
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

   public void valid_Ccln( )
   {
      n7691CCFchUti = false ;
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", GXutil.rtrim( A5352BarObsAnc));
      httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", GXutil.rtrim( A5351BarObsGrm));
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", GXutil.rtrim( A4812BarEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11294CcLn", GXutil.ltrim( localUtil.ntoc( Z11294CcLn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7691CCFchUti", localUtil.format(Z7691CCFchUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.format(Z4033CCFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1223BarEncCom", GXutil.ltrim( localUtil.ntoc( Z1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1909BarGraAca", GXutil.ltrim( localUtil.ntoc( Z1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( Z1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( Z3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5352BarObsAnc", GXutil.rtrim( Z5352BarObsAnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5351BarObsGrm", GXutil.rtrim( Z5351BarObsGrm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4812BarEncCli", GXutil.rtrim( Z4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z140BarCosAny", GXutil.ltrim( localUtil.ntoc( Z140BarCosAny, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z141BarCosPro", GXutil.ltrim( localUtil.ntoc( Z141BarCosPro, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1235BarNumCli", GXutil.ltrim( localUtil.ntoc( Z1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z155BarFecCli", localUtil.format(Z155BarFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z126BarAncAca2", GXutil.ltrim( localUtil.ntoc( Z126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z125BarAncAca1", GXutil.ltrim( localUtil.ntoc( Z125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1911BarRdoA", GXutil.ltrim( localUtil.ntoc( Z1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cclnt( )
   {
      GXt_char1 = A11301CCDscL ;
      GXv_char9[0] = A396EmprCod ;
      GXv_int8[0] = A4031CCTCod ;
      GXv_int10[0] = A11295CcLnT ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscccc(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int10, GXv_char4) ;
      tingccn_impl.this.A396EmprCod = GXv_char9[0] ;
      tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
      tingccn_impl.this.A11295CcLnT = GXv_int10[0] ;
      tingccn_impl.this.GXt_char1 = GXv_char4[0] ;
      A11301CCDscL = GXt_char1 ;
      if ( true /* After */ )
      {
         GXt_char1 = AV45CCTVALD ;
         GXv_char9[0] = A396EmprCod ;
         GXv_int8[0] = A4031CCTCod ;
         GXv_int10[0] = A11295CcLnT ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_int10, GXv_char4) ;
         tingccn_impl.this.A396EmprCod = GXv_char9[0] ;
         tingccn_impl.this.A4031CCTCod = GXv_int8[0] ;
         tingccn_impl.this.A11295CcLnT = GXv_int10[0] ;
         tingccn_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45CCTVALD = GXt_char1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11301CCDscL", GXutil.rtrim( A11301CCDscL));
      httpContext.ajax_rsp_assign_attri("", false, "AV45CCTVALD", AV45CCTVALD);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A11294CcLn',fld:'CCLN',pic:'ZZZ9'},{av:'AV33BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV46BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV34BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV47DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV48Ccobs',fld:'vCCOBS',pic:''},{av:'AV36ForTonal',fld:'vFORTONAL',pic:''},{av:'AV42OpeNom',fld:'vOPENOM',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV51ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'VER'","{handler:'e141BJ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV51ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("'VER'",",oparms:[]}");
      setEventMetadata("'OBSERVACIONES'","{handler:'e131BJ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV47DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'OBSERVACIONES'",",oparms:[{av:'AV47DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("EXIT","{handler:'e111BJ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[]");
      setEventMetadata("VALID_CCTCOD",",oparms:[]}");
      setEventMetadata("VALID_CCLN","{handler:'valid_Ccln',iparms:[{av:'AV51ImpCod',fld:'vIMPCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A11294CcLn',fld:'CCLN',pic:'ZZZ9'},{av:'A7691CCFchUti',fld:'CCFCHUTI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CCLN",",oparms:[{av:'A7691CCFchUti',fld:'CCFCHUTI',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1223BarEncCom',fld:'BARENCCOM',pic:'999.99'},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A1224BarEncAnh',fld:'BARENCANH',pic:'999.99'},{av:'A3137BarGraAca2',fld:'BARGRAACA2',pic:'ZZZ9'},{av:'A5352BarObsAnc',fld:'BAROBSANC',pic:''},{av:'A5351BarObsGrm',fld:'BAROBSGRM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A126BarAncAca2',fld:'BARANCACA2',pic:'ZZ9'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A1911BarRdoA',fld:'BARRDOA',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4031CCTCod'},{av:'Z11294CcLn'},{av:'Z7691CCFchUti'},{av:'Z407EmprNom'},{av:'Z4032CCOpeCod'},{av:'Z4036CCTDsc'},{av:'Z4033CCFch'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z1223BarEncCom'},{av:'Z1909BarGraAca'},{av:'Z1224BarEncAnh'},{av:'Z3137BarGraAca2'},{av:'Z5352BarObsAnc'},{av:'Z5351BarObsGrm'},{av:'Z4812BarEncCli'},{av:'Z212BarSer'},{av:'Z140BarCosAny'},{av:'Z141BarCosPro'},{av:'Z1235BarNumCli'},{av:'Z1234BarNomCli'},{av:'Z136BarColNum'},{av:'Z135BarColNom'},{av:'Z155BarFecCli'},{av:'Z143BarDisNum'},{av:'Z126BarAncAca2'},{av:'Z125BarAncAca1'},{av:'Z1911BarRdoA'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCFCHUTI","{handler:'valid_Ccfchuti',iparms:[]");
      setEventMetadata("VALID_CCFCHUTI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CCLNT","{handler:'valid_Cclnt',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A11295CcLnT',fld:'CCLNT',pic:'ZZZ9'},{av:'A11301CCDscL',fld:'CCDSCL',pic:''},{av:'AV45CCTVALD',fld:'vCCTVALD',pic:''}]");
      setEventMetadata("VALID_CCLNT",",oparms:[{av:'A11301CCDscL',fld:'CCDSCL',pic:''},{av:'AV45CCTVALD',fld:'vCCTVALD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cclnv',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(8);
      pr_default.close(28);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      wcpOAV33BarKgm = DecimalUtil.ZERO ;
      wcpOAV46BarMtr = DecimalUtil.ZERO ;
      wcpOAV48Ccobs = "" ;
      wcpOAV36ForTonal = "" ;
      wcpOAV42OpeNom = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z7691CCFchUti = GXutil.nullDate() ;
      Z4033CCFch = GXutil.nullDate() ;
      Z11296CcLnV = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A11296CcLnV = "" ;
      AV33BarKgm = DecimalUtil.ZERO ;
      AV46BarMtr = DecimalUtil.ZERO ;
      AV48Ccobs = "" ;
      AV36ForTonal = "" ;
      AV42OpeNom = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A4036CCTDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4033CCFch = GXutil.nullDate() ;
      lblTextblock13_Jsonclick = "" ;
      A7691CCFchUti = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock16_Jsonclick = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A5352BarObsAnc = "" ;
      lblTextblock21_Jsonclick = "" ;
      A5351BarObsGrm = "" ;
      lblTextblock22_Jsonclick = "" ;
      A4812BarEncCli = "" ;
      lblTextblock23_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock24_Jsonclick = "" ;
      A140BarCosAny = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A1234BarNomCli = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock30_Jsonclick = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      lblTextblock31_Jsonclick = "" ;
      A143BarDisNum = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1509 = "" ;
      Gx_mode = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV53Pgmname = "" ;
      AV45CCTVALD = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1508 = "" ;
      A11301CCDscL = "" ;
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
      AV24Lit13 = "" ;
      AV25Lit14 = "" ;
      AV29Lit18 = "" ;
      AV32Lit45 = "" ;
      AV39Lit47 = "" ;
      AV40Lit48 = "" ;
      AV37Lit63 = "" ;
      AV35Lit73 = "" ;
      AV41Lit80 = "" ;
      AV49Lit81 = "" ;
      AV50Lit82 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV51ImpCod = "" ;
      Z407EmprNom = "" ;
      Z1223BarEncCom = DecimalUtil.ZERO ;
      Z1224BarEncAnh = DecimalUtil.ZERO ;
      Z5352BarObsAnc = "" ;
      Z5351BarObsGrm = "" ;
      Z4812BarEncCli = "" ;
      Z212BarSer = "" ;
      Z140BarCosAny = DecimalUtil.ZERO ;
      Z141BarCosPro = DecimalUtil.ZERO ;
      Z1234BarNomCli = "" ;
      Z135BarColNom = "" ;
      Z155BarFecCli = GXutil.nullDate() ;
      Z143BarDisNum = "" ;
      Z1911BarRdoA = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z4036CCTDsc = "" ;
      T01BJ6_A407EmprNom = new String[] {""} ;
      T01BJ6_n407EmprNom = new boolean[] {false} ;
      T01BJ7_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ7_A1909BarGraAca = new short[1] ;
      T01BJ7_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ7_A3137BarGraAca2 = new short[1] ;
      T01BJ7_A5352BarObsAnc = new String[] {""} ;
      T01BJ7_A5351BarObsGrm = new String[] {""} ;
      T01BJ7_A4812BarEncCli = new String[] {""} ;
      T01BJ7_A212BarSer = new String[] {""} ;
      T01BJ7_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ7_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ7_A1235BarNumCli = new int[1] ;
      T01BJ7_A1234BarNomCli = new String[] {""} ;
      T01BJ7_A136BarColNum = new int[1] ;
      T01BJ7_A135BarColNom = new String[] {""} ;
      T01BJ7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ7_A143BarDisNum = new String[] {""} ;
      T01BJ7_A126BarAncAca2 = new short[1] ;
      T01BJ7_A125BarAncAca1 = new short[1] ;
      T01BJ7_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ7_A252CliCod = new int[1] ;
      T01BJ7_n252CliCod = new boolean[] {false} ;
      T01BJ11_A279CliNom = new String[] {""} ;
      T01BJ8_A4036CCTDsc = new String[] {""} ;
      T01BJ10_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ10_n7691CCFchUti = new boolean[] {false} ;
      T01BJ10_A4032CCOpeCod = new int[1] ;
      T01BJ10_n4032CCOpeCod = new boolean[] {false} ;
      T01BJ10_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ10_n4033CCFch = new boolean[] {false} ;
      T01BJ12_A11294CcLn = new short[1] ;
      T01BJ12_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ12_n7691CCFchUti = new boolean[] {false} ;
      T01BJ12_A407EmprNom = new String[] {""} ;
      T01BJ12_n407EmprNom = new boolean[] {false} ;
      T01BJ12_A4032CCOpeCod = new int[1] ;
      T01BJ12_n4032CCOpeCod = new boolean[] {false} ;
      T01BJ12_A4036CCTDsc = new String[] {""} ;
      T01BJ12_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ12_n4033CCFch = new boolean[] {false} ;
      T01BJ12_A279CliNom = new String[] {""} ;
      T01BJ12_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ12_A1909BarGraAca = new short[1] ;
      T01BJ12_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ12_A3137BarGraAca2 = new short[1] ;
      T01BJ12_A5352BarObsAnc = new String[] {""} ;
      T01BJ12_A5351BarObsGrm = new String[] {""} ;
      T01BJ12_A4812BarEncCli = new String[] {""} ;
      T01BJ12_A212BarSer = new String[] {""} ;
      T01BJ12_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ12_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ12_A1235BarNumCli = new int[1] ;
      T01BJ12_A1234BarNomCli = new String[] {""} ;
      T01BJ12_A136BarColNum = new int[1] ;
      T01BJ12_A135BarColNom = new String[] {""} ;
      T01BJ12_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ12_A143BarDisNum = new String[] {""} ;
      T01BJ12_A126BarAncAca2 = new short[1] ;
      T01BJ12_A125BarAncAca1 = new short[1] ;
      T01BJ12_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ12_A396EmprCod = new String[] {""} ;
      T01BJ12_A129BarCod = new int[1] ;
      T01BJ12_A132BarCodReo = new byte[1] ;
      T01BJ12_A130BarCodPar = new String[] {""} ;
      T01BJ12_A758ProCod = new String[] {""} ;
      T01BJ12_A194BarOrdLin = new short[1] ;
      T01BJ12_A4031CCTCod = new int[1] ;
      T01BJ12_A252CliCod = new int[1] ;
      T01BJ12_n252CliCod = new boolean[] {false} ;
      T01BJ13_A396EmprCod = new String[] {""} ;
      T01BJ13_A129BarCod = new int[1] ;
      T01BJ13_A132BarCodReo = new byte[1] ;
      T01BJ13_A130BarCodPar = new String[] {""} ;
      T01BJ13_A758ProCod = new String[] {""} ;
      T01BJ13_A194BarOrdLin = new short[1] ;
      T01BJ13_A4031CCTCod = new int[1] ;
      T01BJ13_A11294CcLn = new short[1] ;
      T01BJ5_A11294CcLn = new short[1] ;
      T01BJ5_A396EmprCod = new String[] {""} ;
      T01BJ5_A129BarCod = new int[1] ;
      T01BJ5_A132BarCodReo = new byte[1] ;
      T01BJ5_A130BarCodPar = new String[] {""} ;
      T01BJ5_A758ProCod = new String[] {""} ;
      T01BJ5_A194BarOrdLin = new short[1] ;
      T01BJ5_A4031CCTCod = new int[1] ;
      T01BJ14_A396EmprCod = new String[] {""} ;
      T01BJ14_A129BarCod = new int[1] ;
      T01BJ14_A132BarCodReo = new byte[1] ;
      T01BJ14_A130BarCodPar = new String[] {""} ;
      T01BJ14_A758ProCod = new String[] {""} ;
      T01BJ14_A194BarOrdLin = new short[1] ;
      T01BJ14_A4031CCTCod = new int[1] ;
      T01BJ14_A11294CcLn = new short[1] ;
      T01BJ15_A396EmprCod = new String[] {""} ;
      T01BJ15_A129BarCod = new int[1] ;
      T01BJ15_A132BarCodReo = new byte[1] ;
      T01BJ15_A130BarCodPar = new String[] {""} ;
      T01BJ15_A758ProCod = new String[] {""} ;
      T01BJ15_A194BarOrdLin = new short[1] ;
      T01BJ15_A4031CCTCod = new int[1] ;
      T01BJ15_A11294CcLn = new short[1] ;
      T01BJ4_A11294CcLn = new short[1] ;
      T01BJ4_A396EmprCod = new String[] {""} ;
      T01BJ4_A129BarCod = new int[1] ;
      T01BJ4_A132BarCodReo = new byte[1] ;
      T01BJ4_A130BarCodPar = new String[] {""} ;
      T01BJ4_A758ProCod = new String[] {""} ;
      T01BJ4_A194BarOrdLin = new short[1] ;
      T01BJ4_A4031CCTCod = new int[1] ;
      T01BJ16_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ16_n7691CCFchUti = new boolean[] {false} ;
      T01BJ16_A4032CCOpeCod = new int[1] ;
      T01BJ16_n4032CCOpeCod = new boolean[] {false} ;
      T01BJ16_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ16_n4033CCFch = new boolean[] {false} ;
      T01BJ20_A396EmprCod = new String[] {""} ;
      T01BJ20_A129BarCod = new int[1] ;
      T01BJ20_A132BarCodReo = new byte[1] ;
      T01BJ20_A130BarCodPar = new String[] {""} ;
      T01BJ20_A758ProCod = new String[] {""} ;
      T01BJ20_A194BarOrdLin = new short[1] ;
      T01BJ20_A4031CCTCod = new int[1] ;
      T01BJ20_A11294CcLn = new short[1] ;
      T01BJ21_A129BarCod = new int[1] ;
      T01BJ21_A132BarCodReo = new byte[1] ;
      T01BJ21_A130BarCodPar = new String[] {""} ;
      T01BJ21_A194BarOrdLin = new short[1] ;
      T01BJ21_A11294CcLn = new short[1] ;
      T01BJ21_A11295CcLnT = new short[1] ;
      T01BJ21_A11296CcLnV = new String[] {""} ;
      T01BJ21_n11296CcLnV = new boolean[] {false} ;
      T01BJ21_A396EmprCod = new String[] {""} ;
      T01BJ21_A4031CCTCod = new int[1] ;
      T01BJ21_A758ProCod = new String[] {""} ;
      T01BJ22_A396EmprCod = new String[] {""} ;
      T01BJ22_A129BarCod = new int[1] ;
      T01BJ22_A132BarCodReo = new byte[1] ;
      T01BJ22_A130BarCodPar = new String[] {""} ;
      T01BJ22_A758ProCod = new String[] {""} ;
      T01BJ22_A194BarOrdLin = new short[1] ;
      T01BJ22_A4031CCTCod = new int[1] ;
      T01BJ22_A11294CcLn = new short[1] ;
      T01BJ22_A11295CcLnT = new short[1] ;
      T01BJ3_A129BarCod = new int[1] ;
      T01BJ3_A132BarCodReo = new byte[1] ;
      T01BJ3_A130BarCodPar = new String[] {""} ;
      T01BJ3_A194BarOrdLin = new short[1] ;
      T01BJ3_A11294CcLn = new short[1] ;
      T01BJ3_A11295CcLnT = new short[1] ;
      T01BJ3_A11296CcLnV = new String[] {""} ;
      T01BJ3_n11296CcLnV = new boolean[] {false} ;
      T01BJ3_A396EmprCod = new String[] {""} ;
      T01BJ3_A4031CCTCod = new int[1] ;
      T01BJ3_A758ProCod = new String[] {""} ;
      T01BJ2_A129BarCod = new int[1] ;
      T01BJ2_A132BarCodReo = new byte[1] ;
      T01BJ2_A130BarCodPar = new String[] {""} ;
      T01BJ2_A194BarOrdLin = new short[1] ;
      T01BJ2_A11294CcLn = new short[1] ;
      T01BJ2_A11295CcLnT = new short[1] ;
      T01BJ2_A11296CcLnV = new String[] {""} ;
      T01BJ2_n11296CcLnV = new boolean[] {false} ;
      T01BJ2_A396EmprCod = new String[] {""} ;
      T01BJ2_A4031CCTCod = new int[1] ;
      T01BJ2_A758ProCod = new String[] {""} ;
      T01BJ26_A396EmprCod = new String[] {""} ;
      T01BJ26_A129BarCod = new int[1] ;
      T01BJ26_A132BarCodReo = new byte[1] ;
      T01BJ26_A130BarCodPar = new String[] {""} ;
      T01BJ26_A758ProCod = new String[] {""} ;
      T01BJ26_A194BarOrdLin = new short[1] ;
      T01BJ26_A4031CCTCod = new int[1] ;
      T01BJ26_A11294CcLn = new short[1] ;
      T01BJ26_A11295CcLnT = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i7691CCFchUti = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int6 = new byte[1] ;
      T01BJ27_A407EmprNom = new String[] {""} ;
      T01BJ27_n407EmprNom = new boolean[] {false} ;
      T01BJ28_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ28_A1909BarGraAca = new short[1] ;
      T01BJ28_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ28_A3137BarGraAca2 = new short[1] ;
      T01BJ28_A5352BarObsAnc = new String[] {""} ;
      T01BJ28_A5351BarObsGrm = new String[] {""} ;
      T01BJ28_A4812BarEncCli = new String[] {""} ;
      T01BJ28_A212BarSer = new String[] {""} ;
      T01BJ28_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ28_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ28_A1235BarNumCli = new int[1] ;
      T01BJ28_A1234BarNomCli = new String[] {""} ;
      T01BJ28_A136BarColNum = new int[1] ;
      T01BJ28_A135BarColNom = new String[] {""} ;
      T01BJ28_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01BJ28_A143BarDisNum = new String[] {""} ;
      T01BJ28_A126BarAncAca2 = new short[1] ;
      T01BJ28_A125BarAncAca1 = new short[1] ;
      T01BJ28_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BJ28_A252CliCod = new int[1] ;
      T01BJ28_n252CliCod = new boolean[] {false} ;
      T01BJ29_A279CliNom = new String[] {""} ;
      T01BJ30_A4036CCTDsc = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ7691CCFchUti = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ4036CCTDsc = "" ;
      ZZ4033CCFch = GXutil.nullDate() ;
      ZZ279CliNom = "" ;
      ZZ1223BarEncCom = DecimalUtil.ZERO ;
      ZZ1224BarEncAnh = DecimalUtil.ZERO ;
      ZZ5352BarObsAnc = "" ;
      ZZ5351BarObsGrm = "" ;
      ZZ4812BarEncCli = "" ;
      ZZ212BarSer = "" ;
      ZZ140BarCosAny = DecimalUtil.ZERO ;
      ZZ141BarCosPro = DecimalUtil.ZERO ;
      ZZ1234BarNomCli = "" ;
      ZZ135BarColNom = "" ;
      ZZ155BarFecCli = GXutil.nullDate() ;
      ZZ143BarDisNum = "" ;
      ZZ1911BarRdoA = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      GXv_char9 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int10 = new short[1] ;
      GXv_char4 = new String[1] ;
      Z11301CCDscL = "" ;
      ZV45CCTVALD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tingccn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tingccn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tingccn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tingccn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tingccn__default(),
         new Object[] {
             new Object[] {
            T01BJ2_A129BarCod, T01BJ2_A132BarCodReo, T01BJ2_A130BarCodPar, T01BJ2_A194BarOrdLin, T01BJ2_A11294CcLn, T01BJ2_A11295CcLnT, T01BJ2_A11296CcLnV, T01BJ2_n11296CcLnV, T01BJ2_A396EmprCod, T01BJ2_A4031CCTCod,
            T01BJ2_A758ProCod
            }
            , new Object[] {
            T01BJ3_A129BarCod, T01BJ3_A132BarCodReo, T01BJ3_A130BarCodPar, T01BJ3_A194BarOrdLin, T01BJ3_A11294CcLn, T01BJ3_A11295CcLnT, T01BJ3_A11296CcLnV, T01BJ3_n11296CcLnV, T01BJ3_A396EmprCod, T01BJ3_A4031CCTCod,
            T01BJ3_A758ProCod
            }
            , new Object[] {
            T01BJ4_A11294CcLn, T01BJ4_A396EmprCod, T01BJ4_A129BarCod, T01BJ4_A132BarCodReo, T01BJ4_A130BarCodPar, T01BJ4_A758ProCod, T01BJ4_A194BarOrdLin, T01BJ4_A4031CCTCod
            }
            , new Object[] {
            T01BJ5_A11294CcLn, T01BJ5_A396EmprCod, T01BJ5_A129BarCod, T01BJ5_A132BarCodReo, T01BJ5_A130BarCodPar, T01BJ5_A758ProCod, T01BJ5_A194BarOrdLin, T01BJ5_A4031CCTCod
            }
            , new Object[] {
            T01BJ6_A407EmprNom, T01BJ6_n407EmprNom
            }
            , new Object[] {
            T01BJ7_A1223BarEncCom, T01BJ7_A1909BarGraAca, T01BJ7_A1224BarEncAnh, T01BJ7_A3137BarGraAca2, T01BJ7_A5352BarObsAnc, T01BJ7_A5351BarObsGrm, T01BJ7_A4812BarEncCli, T01BJ7_A212BarSer, T01BJ7_A140BarCosAny, T01BJ7_A141BarCosPro,
            T01BJ7_A1235BarNumCli, T01BJ7_A1234BarNomCli, T01BJ7_A136BarColNum, T01BJ7_A135BarColNom, T01BJ7_A155BarFecCli, T01BJ7_A143BarDisNum, T01BJ7_A126BarAncAca2, T01BJ7_A125BarAncAca1, T01BJ7_A1911BarRdoA, T01BJ7_A252CliCod,
            T01BJ7_n252CliCod
            }
            , new Object[] {
            T01BJ8_A4036CCTDsc
            }
            , new Object[] {
            T01BJ9_A7691CCFchUti, T01BJ9_n7691CCFchUti, T01BJ9_A4032CCOpeCod, T01BJ9_n4032CCOpeCod, T01BJ9_A4033CCFch, T01BJ9_n4033CCFch
            }
            , new Object[] {
            T01BJ10_A7691CCFchUti, T01BJ10_n7691CCFchUti, T01BJ10_A4032CCOpeCod, T01BJ10_n4032CCOpeCod, T01BJ10_A4033CCFch, T01BJ10_n4033CCFch
            }
            , new Object[] {
            T01BJ11_A279CliNom
            }
            , new Object[] {
            T01BJ12_A11294CcLn, T01BJ12_A7691CCFchUti, T01BJ12_n7691CCFchUti, T01BJ12_A407EmprNom, T01BJ12_n407EmprNom, T01BJ12_A4032CCOpeCod, T01BJ12_n4032CCOpeCod, T01BJ12_A4036CCTDsc, T01BJ12_A4033CCFch, T01BJ12_n4033CCFch,
            T01BJ12_A279CliNom, T01BJ12_A1223BarEncCom, T01BJ12_A1909BarGraAca, T01BJ12_A1224BarEncAnh, T01BJ12_A3137BarGraAca2, T01BJ12_A5352BarObsAnc, T01BJ12_A5351BarObsGrm, T01BJ12_A4812BarEncCli, T01BJ12_A212BarSer, T01BJ12_A140BarCosAny,
            T01BJ12_A141BarCosPro, T01BJ12_A1235BarNumCli, T01BJ12_A1234BarNomCli, T01BJ12_A136BarColNum, T01BJ12_A135BarColNom, T01BJ12_A155BarFecCli, T01BJ12_A143BarDisNum, T01BJ12_A126BarAncAca2, T01BJ12_A125BarAncAca1, T01BJ12_A1911BarRdoA,
            T01BJ12_A396EmprCod, T01BJ12_A129BarCod, T01BJ12_A132BarCodReo, T01BJ12_A130BarCodPar, T01BJ12_A758ProCod, T01BJ12_A194BarOrdLin, T01BJ12_A4031CCTCod, T01BJ12_A252CliCod, T01BJ12_n252CliCod
            }
            , new Object[] {
            T01BJ13_A396EmprCod, T01BJ13_A129BarCod, T01BJ13_A132BarCodReo, T01BJ13_A130BarCodPar, T01BJ13_A758ProCod, T01BJ13_A194BarOrdLin, T01BJ13_A4031CCTCod, T01BJ13_A11294CcLn
            }
            , new Object[] {
            T01BJ14_A396EmprCod, T01BJ14_A129BarCod, T01BJ14_A132BarCodReo, T01BJ14_A130BarCodPar, T01BJ14_A758ProCod, T01BJ14_A194BarOrdLin, T01BJ14_A4031CCTCod, T01BJ14_A11294CcLn
            }
            , new Object[] {
            T01BJ15_A396EmprCod, T01BJ15_A129BarCod, T01BJ15_A132BarCodReo, T01BJ15_A130BarCodPar, T01BJ15_A758ProCod, T01BJ15_A194BarOrdLin, T01BJ15_A4031CCTCod, T01BJ15_A11294CcLn
            }
            , new Object[] {
            T01BJ16_A7691CCFchUti, T01BJ16_n7691CCFchUti, T01BJ16_A4032CCOpeCod, T01BJ16_n4032CCOpeCod, T01BJ16_A4033CCFch, T01BJ16_n4033CCFch
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BJ20_A396EmprCod, T01BJ20_A129BarCod, T01BJ20_A132BarCodReo, T01BJ20_A130BarCodPar, T01BJ20_A758ProCod, T01BJ20_A194BarOrdLin, T01BJ20_A4031CCTCod, T01BJ20_A11294CcLn
            }
            , new Object[] {
            T01BJ21_A129BarCod, T01BJ21_A132BarCodReo, T01BJ21_A130BarCodPar, T01BJ21_A194BarOrdLin, T01BJ21_A11294CcLn, T01BJ21_A11295CcLnT, T01BJ21_A11296CcLnV, T01BJ21_n11296CcLnV, T01BJ21_A396EmprCod, T01BJ21_A4031CCTCod,
            T01BJ21_A758ProCod
            }
            , new Object[] {
            T01BJ22_A396EmprCod, T01BJ22_A129BarCod, T01BJ22_A132BarCodReo, T01BJ22_A130BarCodPar, T01BJ22_A758ProCod, T01BJ22_A194BarOrdLin, T01BJ22_A4031CCTCod, T01BJ22_A11294CcLn, T01BJ22_A11295CcLnT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BJ26_A396EmprCod, T01BJ26_A129BarCod, T01BJ26_A132BarCodReo, T01BJ26_A130BarCodPar, T01BJ26_A758ProCod, T01BJ26_A194BarOrdLin, T01BJ26_A4031CCTCod, T01BJ26_A11294CcLn, T01BJ26_A11295CcLnT
            }
            , new Object[] {
            T01BJ27_A407EmprNom, T01BJ27_n407EmprNom
            }
            , new Object[] {
            T01BJ28_A1223BarEncCom, T01BJ28_A1909BarGraAca, T01BJ28_A1224BarEncAnh, T01BJ28_A3137BarGraAca2, T01BJ28_A5352BarObsAnc, T01BJ28_A5351BarObsGrm, T01BJ28_A4812BarEncCli, T01BJ28_A212BarSer, T01BJ28_A140BarCosAny, T01BJ28_A141BarCosPro,
            T01BJ28_A1235BarNumCli, T01BJ28_A1234BarNomCli, T01BJ28_A136BarColNum, T01BJ28_A135BarColNom, T01BJ28_A155BarFecCli, T01BJ28_A143BarDisNum, T01BJ28_A126BarAncAca2, T01BJ28_A125BarAncAca1, T01BJ28_A1911BarRdoA, T01BJ28_A252CliCod,
            T01BJ28_n252CliCod
            }
            , new Object[] {
            T01BJ29_A279CliNom
            }
            , new Object[] {
            T01BJ30_A4036CCTDsc
            }
         }
      );
      Z11294CcLn = (short)(0) ;
      A11294CcLn = (short)(0) ;
      Z4031CCTCod = 0 ;
      A4031CCTCod = 0 ;
      Z194BarOrdLin = (short)(0) ;
      A194BarOrdLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV53Pgmname = "TIngCCn" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV43Ok ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int11[] ;
   private byte GXv_int6[] ;
   private byte ZZ132BarCodReo ;
   private short wcpOA194BarOrdLin ;
   private short wcpOA11294CcLn ;
   private short Z194BarOrdLin ;
   private short Z11294CcLn ;
   private short Z11295CcLnT ;
   private short nRcdDeleted_1509 ;
   private short nRcdExists_1509 ;
   private short nIsMod_1509 ;
   private short A194BarOrdLin ;
   private short A11295CcLnT ;
   private short A11294CcLn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A126BarAncAca2 ;
   private short A125BarAncAca1 ;
   private short nBlankRcdCount1509 ;
   private short RcdFound1509 ;
   private short nBlankRcdUsr1509 ;
   private short Z1909BarGraAca ;
   private short Z3137BarGraAca2 ;
   private short Z126BarAncAca2 ;
   private short Z125BarAncAca1 ;
   private short RcdFound1508 ;
   private short nIsDirty_1508 ;
   private short nIsDirty_1509 ;
   private short GXv_int7[] ;
   private short ZZ194BarOrdLin ;
   private short ZZ11294CcLn ;
   private short ZZ1909BarGraAca ;
   private short ZZ3137BarGraAca2 ;
   private short ZZ126BarAncAca2 ;
   private short ZZ125BarAncAca1 ;
   private short GXv_int10[] ;
   private int wcpOA129BarCod ;
   private int wcpOA4031CCTCod ;
   private int wcpOAV34BarPie ;
   private int wcpOAV47DisCod ;
   private int Z129BarCod ;
   private int Z4031CCTCod ;
   private int Z4032CCOpeCod ;
   private int nRC_GXsfl_190 ;
   private int nGXsfl_190_idx=1 ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int AV34BarPie ;
   private int AV47DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtCCTCod_Enabled ;
   private int edtCcLn_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A4032CCOpeCod ;
   private int edtCCOpeCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtCCFch_Enabled ;
   private int edtCCFchUti_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarEncCom_Enabled ;
   private int edtBarGraAca_Enabled ;
   private int edtBarEncAnh_Enabled ;
   private int edtBarGraAca2_Enabled ;
   private int edtBarObsAnc_Enabled ;
   private int edtBarObsGrm_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarCosAny_Enabled ;
   private int edtBarCosPro_Enabled ;
   private int A1235BarNumCli ;
   private int edtBarNumCli_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarFecCli_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtBarAncAca2_Enabled ;
   private int edtBarAncAca1_Enabled ;
   private int edtBarRdoA_Enabled ;
   private int edtavnRcdDeleted_1509_Enabled ;
   private int edtCcLnT_Enabled ;
   private int edtCCDscL_Enabled ;
   private int edtCcLnV_Enabled ;
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
   private int Z1235BarNumCli ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCcLnT_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarRdoA_Backcolor ;
   private int edtBarAncAca1_Backcolor ;
   private int edtBarAncAca2_Backcolor ;
   private int edtBarDisNum_Backcolor ;
   private int edtBarFecCli_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarNomCli_Backcolor ;
   private int edtBarNumCli_Backcolor ;
   private int edtBarCosPro_Backcolor ;
   private int edtBarCosAny_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtBarEncCli_Backcolor ;
   private int edtBarObsGrm_Backcolor ;
   private int edtBarObsAnc_Backcolor ;
   private int edtBarGraAca2_Backcolor ;
   private int edtBarEncAnh_Backcolor ;
   private int edtBarGraAca_Backcolor ;
   private int edtBarEncCom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtCCFchUti_Backcolor ;
   private int edtCCFch_Backcolor ;
   private int edtCCTDsc_Backcolor ;
   private int edtCCOpeCod_Backcolor ;
   private int edtCcLn_Backcolor ;
   private int edtCCTCod_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int5[] ;
   private int ZZ129BarCod ;
   private int ZZ4031CCTCod ;
   private int ZZ4032CCOpeCod ;
   private int ZZ252CliCod ;
   private int ZZ1235BarNumCli ;
   private int ZZ136BarColNum ;
   private int GXv_int8[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV33BarKgm ;
   private java.math.BigDecimal wcpOAV46BarMtr ;
   private java.math.BigDecimal AV33BarKgm ;
   private java.math.BigDecimal AV46BarMtr ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal Z1223BarEncCom ;
   private java.math.BigDecimal Z1224BarEncAnh ;
   private java.math.BigDecimal Z140BarCosAny ;
   private java.math.BigDecimal Z141BarCosPro ;
   private java.math.BigDecimal Z1911BarRdoA ;
   private java.math.BigDecimal ZZ1223BarEncCom ;
   private java.math.BigDecimal ZZ1224BarEncAnh ;
   private java.math.BigDecimal ZZ140BarCosAny ;
   private java.math.BigDecimal ZZ141BarCosPro ;
   private java.math.BigDecimal ZZ1911BarRdoA ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String wcpOAV36ForTonal ;
   private String wcpOAV42OpeNom ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z11296CcLnV ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A11296CcLnV ;
   private String AV36ForTonal ;
   private String AV42OpeNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_190_idx="0001" ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCcLn_Internalname ;
   private String edtCcLn_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCCOpeCod_Internalname ;
   private String edtCCOpeCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCCFch_Internalname ;
   private String edtCCFch_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtCCFchUti_Internalname ;
   private String edtCCFchUti_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarEncCom_Internalname ;
   private String edtBarEncCom_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarGraAca_Internalname ;
   private String edtBarGraAca_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarEncAnh_Internalname ;
   private String edtBarEncAnh_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarGraAca2_Internalname ;
   private String edtBarGraAca2_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarObsAnc_Internalname ;
   private String A5352BarObsAnc ;
   private String edtBarObsAnc_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarObsGrm_Internalname ;
   private String A5351BarObsGrm ;
   private String edtBarObsGrm_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarEncCli_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarCosAny_Internalname ;
   private String edtBarCosAny_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarCosPro_Internalname ;
   private String edtBarCosPro_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNumCli_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecCli_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBarAncAca2_Internalname ;
   private String edtBarAncAca2_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBarAncAca1_Internalname ;
   private String edtBarAncAca1_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtBarRdoA_Internalname ;
   private String edtBarRdoA_Jsonclick ;
   private String sMode1509 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1509_Internalname ;
   private String edtCcLnT_Internalname ;
   private String edtCCDscL_Internalname ;
   private String edtCcLnV_Internalname ;
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
   private String AV53Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1508 ;
   private String A11301CCDscL ;
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
   private String AV24Lit13 ;
   private String AV25Lit14 ;
   private String AV29Lit18 ;
   private String AV32Lit45 ;
   private String AV39Lit47 ;
   private String AV40Lit48 ;
   private String AV37Lit63 ;
   private String AV35Lit73 ;
   private String AV41Lit80 ;
   private String AV49Lit81 ;
   private String AV50Lit82 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV51ImpCod ;
   private String Z407EmprNom ;
   private String Z5352BarObsAnc ;
   private String Z5351BarObsGrm ;
   private String Z4812BarEncCli ;
   private String Z212BarSer ;
   private String Z1234BarNomCli ;
   private String Z135BarColNom ;
   private String Z143BarDisNum ;
   private String Z279CliNom ;
   private String Z4036CCTDsc ;
   private String sGXsfl_190_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1509_Jsonclick ;
   private String edtCcLnT_Jsonclick ;
   private String edtCCDscL_Jsonclick ;
   private String edtCcLnV_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ4036CCTDsc ;
   private String ZZ279CliNom ;
   private String ZZ5352BarObsAnc ;
   private String ZZ5351BarObsGrm ;
   private String ZZ4812BarEncCli ;
   private String ZZ212BarSer ;
   private String ZZ1234BarNomCli ;
   private String ZZ135BarColNom ;
   private String ZZ143BarDisNum ;
   private String GXt_char1 ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String Z11301CCDscL ;
   private java.util.Date Z7691CCFchUti ;
   private java.util.Date Z4033CCFch ;
   private java.util.Date A4033CCFch ;
   private java.util.Date A7691CCFchUti ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Z155BarFecCli ;
   private java.util.Date i7691CCFchUti ;
   private java.util.Date ZZ7691CCFchUti ;
   private java.util.Date ZZ4033CCFch ;
   private java.util.Date ZZ155BarFecCli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11296CcLnV ;
   private boolean wbErr ;
   private boolean bGXsfl_190_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private boolean n7691CCFchUti ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private String wcpOAV48Ccobs ;
   private String AV48Ccobs ;
   private String AV45CCTVALD ;
   private String ZV45CCTVALD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BJ6_A407EmprNom ;
   private boolean[] T01BJ6_n407EmprNom ;
   private java.math.BigDecimal[] T01BJ7_A1223BarEncCom ;
   private short[] T01BJ7_A1909BarGraAca ;
   private java.math.BigDecimal[] T01BJ7_A1224BarEncAnh ;
   private short[] T01BJ7_A3137BarGraAca2 ;
   private String[] T01BJ7_A5352BarObsAnc ;
   private String[] T01BJ7_A5351BarObsGrm ;
   private String[] T01BJ7_A4812BarEncCli ;
   private String[] T01BJ7_A212BarSer ;
   private java.math.BigDecimal[] T01BJ7_A140BarCosAny ;
   private java.math.BigDecimal[] T01BJ7_A141BarCosPro ;
   private int[] T01BJ7_A1235BarNumCli ;
   private String[] T01BJ7_A1234BarNomCli ;
   private int[] T01BJ7_A136BarColNum ;
   private String[] T01BJ7_A135BarColNom ;
   private java.util.Date[] T01BJ7_A155BarFecCli ;
   private String[] T01BJ7_A143BarDisNum ;
   private short[] T01BJ7_A126BarAncAca2 ;
   private short[] T01BJ7_A125BarAncAca1 ;
   private java.math.BigDecimal[] T01BJ7_A1911BarRdoA ;
   private int[] T01BJ7_A252CliCod ;
   private boolean[] T01BJ7_n252CliCod ;
   private String[] T01BJ11_A279CliNom ;
   private String[] T01BJ8_A4036CCTDsc ;
   private java.util.Date[] T01BJ10_A7691CCFchUti ;
   private boolean[] T01BJ10_n7691CCFchUti ;
   private int[] T01BJ10_A4032CCOpeCod ;
   private boolean[] T01BJ10_n4032CCOpeCod ;
   private java.util.Date[] T01BJ10_A4033CCFch ;
   private boolean[] T01BJ10_n4033CCFch ;
   private short[] T01BJ12_A11294CcLn ;
   private java.util.Date[] T01BJ12_A7691CCFchUti ;
   private boolean[] T01BJ12_n7691CCFchUti ;
   private String[] T01BJ12_A407EmprNom ;
   private boolean[] T01BJ12_n407EmprNom ;
   private int[] T01BJ12_A4032CCOpeCod ;
   private boolean[] T01BJ12_n4032CCOpeCod ;
   private String[] T01BJ12_A4036CCTDsc ;
   private java.util.Date[] T01BJ12_A4033CCFch ;
   private boolean[] T01BJ12_n4033CCFch ;
   private String[] T01BJ12_A279CliNom ;
   private java.math.BigDecimal[] T01BJ12_A1223BarEncCom ;
   private short[] T01BJ12_A1909BarGraAca ;
   private java.math.BigDecimal[] T01BJ12_A1224BarEncAnh ;
   private short[] T01BJ12_A3137BarGraAca2 ;
   private String[] T01BJ12_A5352BarObsAnc ;
   private String[] T01BJ12_A5351BarObsGrm ;
   private String[] T01BJ12_A4812BarEncCli ;
   private String[] T01BJ12_A212BarSer ;
   private java.math.BigDecimal[] T01BJ12_A140BarCosAny ;
   private java.math.BigDecimal[] T01BJ12_A141BarCosPro ;
   private int[] T01BJ12_A1235BarNumCli ;
   private String[] T01BJ12_A1234BarNomCli ;
   private int[] T01BJ12_A136BarColNum ;
   private String[] T01BJ12_A135BarColNom ;
   private java.util.Date[] T01BJ12_A155BarFecCli ;
   private String[] T01BJ12_A143BarDisNum ;
   private short[] T01BJ12_A126BarAncAca2 ;
   private short[] T01BJ12_A125BarAncAca1 ;
   private java.math.BigDecimal[] T01BJ12_A1911BarRdoA ;
   private String[] T01BJ12_A396EmprCod ;
   private int[] T01BJ12_A129BarCod ;
   private byte[] T01BJ12_A132BarCodReo ;
   private String[] T01BJ12_A130BarCodPar ;
   private String[] T01BJ12_A758ProCod ;
   private short[] T01BJ12_A194BarOrdLin ;
   private int[] T01BJ12_A4031CCTCod ;
   private int[] T01BJ12_A252CliCod ;
   private boolean[] T01BJ12_n252CliCod ;
   private String[] T01BJ13_A396EmprCod ;
   private int[] T01BJ13_A129BarCod ;
   private byte[] T01BJ13_A132BarCodReo ;
   private String[] T01BJ13_A130BarCodPar ;
   private String[] T01BJ13_A758ProCod ;
   private short[] T01BJ13_A194BarOrdLin ;
   private int[] T01BJ13_A4031CCTCod ;
   private short[] T01BJ13_A11294CcLn ;
   private short[] T01BJ5_A11294CcLn ;
   private String[] T01BJ5_A396EmprCod ;
   private int[] T01BJ5_A129BarCod ;
   private byte[] T01BJ5_A132BarCodReo ;
   private String[] T01BJ5_A130BarCodPar ;
   private String[] T01BJ5_A758ProCod ;
   private short[] T01BJ5_A194BarOrdLin ;
   private int[] T01BJ5_A4031CCTCod ;
   private String[] T01BJ14_A396EmprCod ;
   private int[] T01BJ14_A129BarCod ;
   private byte[] T01BJ14_A132BarCodReo ;
   private String[] T01BJ14_A130BarCodPar ;
   private String[] T01BJ14_A758ProCod ;
   private short[] T01BJ14_A194BarOrdLin ;
   private int[] T01BJ14_A4031CCTCod ;
   private short[] T01BJ14_A11294CcLn ;
   private String[] T01BJ15_A396EmprCod ;
   private int[] T01BJ15_A129BarCod ;
   private byte[] T01BJ15_A132BarCodReo ;
   private String[] T01BJ15_A130BarCodPar ;
   private String[] T01BJ15_A758ProCod ;
   private short[] T01BJ15_A194BarOrdLin ;
   private int[] T01BJ15_A4031CCTCod ;
   private short[] T01BJ15_A11294CcLn ;
   private short[] T01BJ4_A11294CcLn ;
   private String[] T01BJ4_A396EmprCod ;
   private int[] T01BJ4_A129BarCod ;
   private byte[] T01BJ4_A132BarCodReo ;
   private String[] T01BJ4_A130BarCodPar ;
   private String[] T01BJ4_A758ProCod ;
   private short[] T01BJ4_A194BarOrdLin ;
   private int[] T01BJ4_A4031CCTCod ;
   private java.util.Date[] T01BJ16_A7691CCFchUti ;
   private boolean[] T01BJ16_n7691CCFchUti ;
   private int[] T01BJ16_A4032CCOpeCod ;
   private boolean[] T01BJ16_n4032CCOpeCod ;
   private java.util.Date[] T01BJ16_A4033CCFch ;
   private boolean[] T01BJ16_n4033CCFch ;
   private String[] T01BJ20_A396EmprCod ;
   private int[] T01BJ20_A129BarCod ;
   private byte[] T01BJ20_A132BarCodReo ;
   private String[] T01BJ20_A130BarCodPar ;
   private String[] T01BJ20_A758ProCod ;
   private short[] T01BJ20_A194BarOrdLin ;
   private int[] T01BJ20_A4031CCTCod ;
   private short[] T01BJ20_A11294CcLn ;
   private int[] T01BJ21_A129BarCod ;
   private byte[] T01BJ21_A132BarCodReo ;
   private String[] T01BJ21_A130BarCodPar ;
   private short[] T01BJ21_A194BarOrdLin ;
   private short[] T01BJ21_A11294CcLn ;
   private short[] T01BJ21_A11295CcLnT ;
   private String[] T01BJ21_A11296CcLnV ;
   private boolean[] T01BJ21_n11296CcLnV ;
   private String[] T01BJ21_A396EmprCod ;
   private int[] T01BJ21_A4031CCTCod ;
   private String[] T01BJ21_A758ProCod ;
   private String[] T01BJ22_A396EmprCod ;
   private int[] T01BJ22_A129BarCod ;
   private byte[] T01BJ22_A132BarCodReo ;
   private String[] T01BJ22_A130BarCodPar ;
   private String[] T01BJ22_A758ProCod ;
   private short[] T01BJ22_A194BarOrdLin ;
   private int[] T01BJ22_A4031CCTCod ;
   private short[] T01BJ22_A11294CcLn ;
   private short[] T01BJ22_A11295CcLnT ;
   private int[] T01BJ3_A129BarCod ;
   private byte[] T01BJ3_A132BarCodReo ;
   private String[] T01BJ3_A130BarCodPar ;
   private short[] T01BJ3_A194BarOrdLin ;
   private short[] T01BJ3_A11294CcLn ;
   private short[] T01BJ3_A11295CcLnT ;
   private String[] T01BJ3_A11296CcLnV ;
   private boolean[] T01BJ3_n11296CcLnV ;
   private String[] T01BJ3_A396EmprCod ;
   private int[] T01BJ3_A4031CCTCod ;
   private String[] T01BJ3_A758ProCod ;
   private int[] T01BJ2_A129BarCod ;
   private byte[] T01BJ2_A132BarCodReo ;
   private String[] T01BJ2_A130BarCodPar ;
   private short[] T01BJ2_A194BarOrdLin ;
   private short[] T01BJ2_A11294CcLn ;
   private short[] T01BJ2_A11295CcLnT ;
   private String[] T01BJ2_A11296CcLnV ;
   private boolean[] T01BJ2_n11296CcLnV ;
   private String[] T01BJ2_A396EmprCod ;
   private int[] T01BJ2_A4031CCTCod ;
   private String[] T01BJ2_A758ProCod ;
   private String[] T01BJ26_A396EmprCod ;
   private int[] T01BJ26_A129BarCod ;
   private byte[] T01BJ26_A132BarCodReo ;
   private String[] T01BJ26_A130BarCodPar ;
   private String[] T01BJ26_A758ProCod ;
   private short[] T01BJ26_A194BarOrdLin ;
   private int[] T01BJ26_A4031CCTCod ;
   private short[] T01BJ26_A11294CcLn ;
   private short[] T01BJ26_A11295CcLnT ;
   private String[] T01BJ27_A407EmprNom ;
   private boolean[] T01BJ27_n407EmprNom ;
   private java.math.BigDecimal[] T01BJ28_A1223BarEncCom ;
   private short[] T01BJ28_A1909BarGraAca ;
   private java.math.BigDecimal[] T01BJ28_A1224BarEncAnh ;
   private short[] T01BJ28_A3137BarGraAca2 ;
   private String[] T01BJ28_A5352BarObsAnc ;
   private String[] T01BJ28_A5351BarObsGrm ;
   private String[] T01BJ28_A4812BarEncCli ;
   private String[] T01BJ28_A212BarSer ;
   private java.math.BigDecimal[] T01BJ28_A140BarCosAny ;
   private java.math.BigDecimal[] T01BJ28_A141BarCosPro ;
   private int[] T01BJ28_A1235BarNumCli ;
   private String[] T01BJ28_A1234BarNomCli ;
   private int[] T01BJ28_A136BarColNum ;
   private String[] T01BJ28_A135BarColNom ;
   private java.util.Date[] T01BJ28_A155BarFecCli ;
   private String[] T01BJ28_A143BarDisNum ;
   private short[] T01BJ28_A126BarAncAca2 ;
   private short[] T01BJ28_A125BarAncAca1 ;
   private java.math.BigDecimal[] T01BJ28_A1911BarRdoA ;
   private int[] T01BJ28_A252CliCod ;
   private boolean[] T01BJ28_n252CliCod ;
   private String[] T01BJ29_A279CliNom ;
   private String[] T01BJ30_A4036CCTDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.util.Date[] T01BJ9_A7691CCFchUti ;
   private int[] T01BJ9_A4032CCOpeCod ;
   private java.util.Date[] T01BJ9_A4033CCFch ;
   private boolean[] T01BJ9_n7691CCFchUti ;
   private boolean[] T01BJ9_n4032CCOpeCod ;
   private boolean[] T01BJ9_n4033CCFch ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tingccn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingccn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingccn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingccn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingccn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BJ2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, EmprCod, CCTCod, ProCod FROM TXPCCnT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?  FOR UPDATE OF CcLnV NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BJ3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, EmprCod, CCTCod, ProCod FROM TXPCCnT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BJ4", "SELECT CcLn, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ?  FOR UPDATE OF CcLn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ5", "SELECT CcLn, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ7", "SELECT BarEncCom, BarGraAca, BarEncAnh, BarGraAca2, BarObsAnc, BarObsGrm, BarEncCli, BarSer, BarCosAny, BarCosPro, BarNumCli, BarNomCli, BarColNum, BarColNom, BarFecCli, BarDisNum, BarAncAca2, BarAncAca1, BarRdoA, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ8", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ9", "SELECT CCFchUti, CCOpeCod, CCFch FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCFchUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ10", "SELECT CCFchUti, CCOpeCod, CCFch FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ12", "SELECT /*+ FIRST_ROWS(1) */ TM1.CcLn, T6.CCFchUti, T2.EmprNom, T6.CCOpeCod, T5.CCTDsc, T6.CCFch, T4.CliNom, T3.BarEncCom, T3.BarGraAca, T3.BarEncAnh, T3.BarGraAca2, T3.BarObsAnc, T3.BarObsGrm, T3.BarEncCli, T3.BarSer, T3.BarCosAny, T3.BarCosPro, T3.BarNumCli, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarFecCli, T3.BarDisNum, T3.BarAncAca2, T3.BarAncAca1, T3.BarRdoA, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod, T3.CliCod FROM (((((TXPCCn TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPCCDef T5 ON T5.EmprCod = TM1.EmprCod AND T5.CCTCod = TM1.CCTCod) INNER JOIN TXPCC T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar AND T6.ProCod = TM1.ProCod AND T6.BarOrdLin = TM1.BarOrdLin AND T6.CCTCod = TM1.CCTCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.CCTCod = ? and TM1.CcLn = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod, TM1.CcLn ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, CCTCod DESC, CcLn DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ16", "SELECT CCFchUti, CCOpeCod, CCFch FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCFchUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BJ17", "INSERT INTO TXPCCn(CcLn, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCn")
         ,new UpdateCursor("T01BJ18", "DELETE FROM TXPCCn  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ?", GX_NOMASK, "TXPCCn")
         ,new UpdateCursor("T01BJ19", "UPDATE TXPCC SET CCFchUti=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new ForEachCursor("T01BJ20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ21", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, EmprCod, CCTCod, ProCod FROM TXPCCnT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? and CcLnT = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BJ22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT FROM TXPCCnT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BJ23", "INSERT INTO TXPCCnT(BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, EmprCod, CCTCod, ProCod, CcLnFc, CcLnOp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK, "TXPCCnT")
         ,new UpdateCursor("T01BJ24", "UPDATE TXPCCnT SET CcLnV=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?", GX_NOMASK, "TXPCCnT")
         ,new UpdateCursor("T01BJ25", "DELETE FROM TXPCCnT  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?", GX_NOMASK, "TXPCCnT")
         ,new ForEachCursor("T01BJ26", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT FROM TXPCCnT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BJ27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ28", "SELECT BarEncCom, BarGraAca, BarEncAnh, BarGraAca2, BarObsAnc, BarObsGrm, BarEncCli, BarSer, BarCosAny, BarCosPro, BarNumCli, BarNomCli, BarColNum, BarColNom, BarFecCli, BarDisNum, BarAncAca2, BarAncAca1, BarRdoA, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ29", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BJ30", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 20);
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((String[]) buf[17])[0] = rslt.getString(14, 20);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 13);
               ((int[]) buf[23])[0] = rslt.getInt(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 13);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 8);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((short[]) buf[28])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[30])[0] = rslt.getString(27, 3);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((byte[]) buf[32])[0] = rslt.getByte(29);
               ((String[]) buf[33])[0] = rslt.getString(30, 1);
               ((String[]) buf[34])[0] = rslt.getString(31, 8);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((int[]) buf[36])[0] = rslt.getInt(33);
               ((int[]) buf[37])[0] = rslt.getInt(34);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 14 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 40);
               }
               stmt.setString(8, (String)parms[8], 3);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setString(10, (String)parms[10], 8);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
      }
   }

}

