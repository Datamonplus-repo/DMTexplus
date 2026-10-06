package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdispqr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12218PrdDisQu = httpContext.GetPar( "PrdDisQu") ;
         n12218PrdDisQu = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1JF1697( A396EmprCod, A12218PrdDisQu) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12218PrdDisQu = httpContext.GetPar( "PrdDisQu") ;
         n12218PrdDisQu = false ;
         A12224CntDisQ2 = CommonUtil.decimalVal( httpContext.GetPar( "CntDisQ2"), ".") ;
         n12224CntDisQ2 = false ;
         A12221CntDisQu = CommonUtil.decimalVal( httpContext.GetPar( "CntDisQu"), ".") ;
         n12221CntDisQu = false ;
         AV36PrdPreact = CommonUtil.decimalVal( httpContext.GetPar( "PrdPreact"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36PrdPreact", GXutil.ltrimstr( AV36PrdPreact, 14, 5));
         AV37msg_err = httpContext.GetPar( "msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37msg_err", AV37msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_1JF1697( A396EmprCod, A12218PrdDisQu, A12224CntDisQ2, A12221CntDisQu, AV36PrdPreact, AV37msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"UNDDISQ") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12210PrdDisQ = httpContext.GetPar( "PrdDisQ") ;
         n12210PrdDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaunddisq1JF1696( A396EmprCod, A12210PrdDisQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"UNDDISQU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12218PrdDisQu = httpContext.GetPar( "PrdDisQu") ;
         n12218PrdDisQu = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx19asaunddisqu1JF1697( A396EmprCod, A12218PrdDisQu) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"VALDISQU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12218PrdDisQu = httpContext.GetPar( "PrdDisQu") ;
         n12218PrdDisQu = false ;
         A12212CntDisQ = CommonUtil.decimalVal( httpContext.GetPar( "CntDisQ"), ".") ;
         n12212CntDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
         A12224CntDisQ2 = CommonUtil.decimalVal( httpContext.GetPar( "CntDisQ2"), ".") ;
         n12224CntDisQ2 = false ;
         A12221CntDisQu = CommonUtil.decimalVal( httpContext.GetPar( "CntDisQu"), ".") ;
         n12221CntDisQu = false ;
         A12227TotCntR = CommonUtil.decimalVal( httpContext.GetPar( "TotCntR"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx20asavaldisqu1JF1697( A396EmprCod, A12218PrdDisQu, A12212CntDisQ, A12224CntDisQ2, A12221CntDisQu, A12227TotCntR) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12210PrdDisQ = httpContext.GetPar( "PrdDisQ") ;
         n12210PrdDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A12210PrdDisQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12213UndDisQ = (byte)(GXutil.lval( httpContext.GetPar( "UndDisQ"))) ;
         n12213UndDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A12213UndDisQ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12218PrdDisQu = httpContext.GetPar( "PrdDisQu") ;
         n12218PrdDisQu = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A12218PrdDisQu) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12222UndDisQu = (byte)(GXutil.lval( httpContext.GetPar( "UndDisQu"))) ;
         n12222UndDisQu = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A12222UndDisQu) ;
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
            A12225DocDisID = GXutil.lval( httpContext.GetPar( "DocDisID")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12225DocDisID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12225DocDisID), 10, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Disolucion Quimicos REPROCESO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFecDisQ_Internalname ;
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
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A12215UltLinDisQ = (short)(GXutil.lval( httpContext.GetPar( "UltLinDisQ"))) ;
      n12215UltLinDisQ = false ;
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

   public tdispqr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdispqr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdispqr_impl.class ));
   }

   public tdispqr_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbStaDisQ = new HTMLChoice();
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
      if ( cmbStaDisQ.getItemCount() > 0 )
      {
         A12209StaDisQ = (byte)(GXutil.lval( cmbStaDisQ.getValidValue(GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0))))) ;
         n12209StaDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbStaDisQ.setValue( GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbStaDisQ.getInternalname(), "Values", cmbStaDisQ.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDisPqR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Documento Disolucion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDocDisID_Internalname, GXutil.ltrim( localUtil.ntoc( A12225DocDisID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDocDisID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12225DocDisID), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12225DocDisID), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocDisID_Jsonclick, 0, "", "", "", "", "", 1, edtDocDisID_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFecDisQ_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFecDisQ_Internalname, localUtil.format(A12208FecDisQ, "99/99/99"), localUtil.format( A12208FecDisQ, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFecDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtFecDisQ_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFecDisQ_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFecDisQ_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDisPqR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbStaDisQ, cmbStaDisQ.getInternalname(), GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0)), 1, cmbStaDisQ.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbStaDisQ.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TDisPqR.htm");
      cmbStaDisQ.setValue( GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbStaDisQ.getInternalname(), "Values", cmbStaDisQ.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDisQ_Internalname, GXutil.rtrim( A12210PrdDisQ), GXutil.rtrim( localUtil.format( A12210PrdDisQ, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtPrdDisQ_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDscDisQ_Internalname, GXutil.rtrim( A12211DscDisQ), GXutil.rtrim( localUtil.format( A12211DscDisQ, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDscDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtDscDisQ_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCntDisQ_Internalname, GXutil.ltrim( localUtil.ntoc( A12212CntDisQ, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCntDisQ_Enabled!=0) ? localUtil.format( A12212CntDisQ, "ZZZZZ9.99") : localUtil.format( A12212CntDisQ, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCntDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtCntDisQ_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUndDisQ_Internalname, GXutil.ltrim( localUtil.ntoc( A12213UndDisQ, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUndDisQ_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12213UndDisQ), "9") : localUtil.format( DecimalUtil.doubleToDec(A12213UndDisQ), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUndDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtUndDisQ_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDUnDisQ_Internalname, GXutil.rtrim( A12214DUnDisQ), GXutil.rtrim( localUtil.format( A12214DUnDisQ, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDUnDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtDUnDisQ_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltLinDisQ_Internalname, GXutil.ltrim( localUtil.ntoc( A12215UltLinDisQ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUltLinDisQ_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12215UltLinDisQ), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12215UltLinDisQ), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltLinDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtUltLinDisQ_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Total Porcentaje", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotPor_Internalname, GXutil.ltrim( localUtil.ntoc( A12216TotPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotPor_Enabled!=0) ? localUtil.format( A12216TotPor, "ZZ9.99") : localUtil.format( A12216TotPor, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotPor_Jsonclick, 0, "", "", "", "", "", 1, edtTotPor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Total Cantidad", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A12217TotCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotCnt_Enabled!=0) ? localUtil.format( A12217TotCnt, "ZZZZZ9.99") : localUtil.format( A12217TotCnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotCnt_Jsonclick, 0, "", "", "", "", "", 1, edtTotCnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Total Cantidad Reprocesada", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotCntR_Internalname, GXutil.ltrim( localUtil.ntoc( A12227TotCntR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotCntR_Enabled!=0) ? localUtil.format( A12227TotCntR, "ZZZZZ9.99") : localUtil.format( A12227TotCntR, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotCntR_Jsonclick, 0, "", "", "", "", "", 1, edtTotCntR_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Precio", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValDisQ_Internalname, GXutil.ltrim( localUtil.ntoc( A12231ValDisQ, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValDisQ_Enabled!=0) ? localUtil.format( A12231ValDisQ, "ZZZZ9.99999") : localUtil.format( A12231ValDisQ, "ZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValDisQ_Jsonclick, 0, "", "", "", "", "", 1, edtValDisQ_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisPqR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol95( ) ;
      nGXsfl_95_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1697 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1697 = (short)(1) ;
            scanStart1JF1697( ) ;
            while ( RcdFound1697 != 0 )
            {
               init_level_properties1697( ) ;
               getByPrimaryKey1JF1697( ) ;
               addRow1JF1697( ) ;
               scanNext1JF1697( ) ;
            }
            scanEnd1JF1697( ) ;
            nBlankRcdCount1697 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12215UltLinDisQ = A12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         B12227TotCntR = A12227TotCntR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         B12231ValDisQ = A12231ValDisQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         B12217TotCnt = A12217TotCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         B12216TotPor = A12216TotPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         standaloneNotModal1JF1697( ) ;
         standaloneModal1JF1697( ) ;
         sMode1697 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRow1JF1697( ) ;
            edtavnRcdDeleted_1697_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1697_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1697_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1697_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtLinDisID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LINDISID_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLinDisID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinDisID_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtPrdDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDscDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSCDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDscDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtPorDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PORDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPorDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCntDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CNTDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCntDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtValDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtValDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtUndDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNDDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUndDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtDUnDisQU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DUNDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDUnDisQU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDUnDisQU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCntDisQ2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CNTDISQ2_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCntDisQ2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQ2_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCntDif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CNTDIF_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCntDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDif_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_1697 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1JF1697( ) ;
            }
            sendRow1JF1697( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode1697 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12215UltLinDisQ = B12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         A12227TotCntR = B12227TotCntR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = B12231ValDisQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         A12217TotCnt = B12217TotCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12216TotPor = B12216TotPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1697 = (short)(5) ;
         nRcdExists_1697 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1JF1697( ) ;
            while ( RcdFound1697 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_951697( ) ;
               init_level_properties1697( ) ;
               standaloneNotModal1JF1697( ) ;
               getByPrimaryKey1JF1697( ) ;
               standaloneModal1JF1697( ) ;
               addRow1JF1697( ) ;
               scanNext1JF1697( ) ;
            }
            scanEnd1JF1697( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1697 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_951697( ) ;
      initAll1JF1697( ) ;
      init_level_properties1697( ) ;
      B12215UltLinDisQ = A12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      B12227TotCntR = A12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      B12231ValDisQ = A12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      B12217TotCnt = A12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      B12216TotPor = A12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      nRcdExists_1697 = (short)(0) ;
      nIsMod_1697 = (short)(0) ;
      nRcdDeleted_1697 = (short)(0) ;
      nBlankRcdCount1697 = (short)(nBlankRcdUsr1697+nBlankRcdCount1697) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1697 > 0 )
      {
         standaloneNotModal1JF1697( ) ;
         standaloneModal1JF1697( ) ;
         addRow1JF1697( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLinDisID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1697 = (short)(nBlankRcdCount1697-1) ;
      }
      Gx_mode = sMode1697 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12215UltLinDisQ = B12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      A12227TotCntR = B12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      A12231ValDisQ = B12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      A12217TotCnt = B12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      A12216TotPor = B12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisPqR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDisPqR.htm");
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
      e111JF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z12225DocDisID = localUtil.ctol( httpContext.cgiGet( "Z12225DocDisID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12208FecDisQ = localUtil.ctod( httpContext.cgiGet( "Z12208FecDisQ"), 0) ;
            Z12209StaDisQ = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12209StaDisQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12212CntDisQ = localUtil.ctond( httpContext.cgiGet( "Z12212CntDisQ")) ;
            Z12215UltLinDisQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z12215UltLinDisQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12210PrdDisQ = httpContext.cgiGet( "Z12210PrdDisQ") ;
            Z12213UndDisQ = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12213UndDisQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12215UltLinDisQ = (short)(localUtil.ctol( httpContext.cgiGet( "O12215UltLinDisQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12227TotCntR = localUtil.ctond( httpContext.cgiGet( "O12227TotCntR")) ;
            O12231ValDisQ = localUtil.ctond( httpContext.cgiGet( "O12231ValDisQ")) ;
            O12217TotCnt = localUtil.ctond( httpContext.cgiGet( "O12217TotCnt")) ;
            O12216TotPor = localUtil.ctond( httpContext.cgiGet( "O12216TotPor")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV34flag = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vVALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV36PrdPreact = localUtil.ctond( httpContext.cgiGet( "vPRDPREACT")) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A12225DocDisID = localUtil.ctol( httpContext.cgiGet( edtDocDisID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12225DocDisID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12225DocDisID), 10, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtFecDisQ_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FECDISQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFecDisQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12208FecDisQ = GXutil.nullDate() ;
               n12208FecDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
            }
            else
            {
               A12208FecDisQ = localUtil.ctod( httpContext.cgiGet( edtFecDisQ_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12208FecDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
            }
            cmbStaDisQ.setName( cmbStaDisQ.getInternalname() );
            cmbStaDisQ.setValue( httpContext.cgiGet( cmbStaDisQ.getInternalname()) );
            A12209StaDisQ = (byte)(GXutil.lval( httpContext.cgiGet( cmbStaDisQ.getInternalname()))) ;
            n12209StaDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
            A12210PrdDisQ = httpContext.cgiGet( edtPrdDisQ_Internalname) ;
            n12210PrdDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
            A12211DscDisQ = httpContext.cgiGet( edtDscDisQ_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", A12211DscDisQ);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCntDisQ_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCntDisQ_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CNTDISQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCntDisQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12212CntDisQ = DecimalUtil.ZERO ;
               n12212CntDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
            }
            else
            {
               A12212CntDisQ = localUtil.ctond( httpContext.cgiGet( edtCntDisQ_Internalname)) ;
               n12212CntDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
            }
            A12213UndDisQ = (byte)(localUtil.ctol( httpContext.cgiGet( edtUndDisQ_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12213UndDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
            A12214DUnDisQ = httpContext.cgiGet( edtDUnDisQ_Internalname) ;
            n12214DUnDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", A12214DUnDisQ);
            A12215UltLinDisQ = (short)(localUtil.ctol( httpContext.cgiGet( edtUltLinDisQ_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12215UltLinDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
            A12216TotPor = localUtil.ctond( httpContext.cgiGet( edtTotPor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
            A12217TotCnt = localUtil.ctond( httpContext.cgiGet( edtTotCnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
            A12227TotCntR = localUtil.ctond( httpContext.cgiGet( edtTotCntR_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
            A12231ValDisQ = localUtil.ctond( httpContext.cgiGet( edtValDisQ_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDisPqR");
            A12209StaDisQ = (byte)(GXutil.lval( httpContext.cgiGet( cmbStaDisQ.getInternalname()))) ;
            n12209StaDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
            forbiddenHiddens.add("StaDisQ", localUtil.format( DecimalUtil.doubleToDec(A12209StaDisQ), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdispqr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A12225DocDisID = GXutil.lval( httpContext.GetPar( "DocDisID")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12225DocDisID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12225DocDisID), 10, 0));
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
                        e111JF2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER INFORME'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver Informe' */
                        e121JF2 ();
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
            initAll1JF1696( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1697_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1697_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributes1JF1696( ) ;
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

   public void confirm_1JF0( )
   {
      beforeValidate1JF1696( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JF1696( ) ;
         }
         else
         {
            checkExtendedTable1JF1696( ) ;
            if ( AnyError == 0 )
            {
               zm1JF1696( 30) ;
               zm1JF1696( 31) ;
               zm1JF1696( 32) ;
               zm1JF1696( 33) ;
            }
            closeExtendedTableCursors1JF1696( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1696 = Gx_mode ;
         confirm_1JF1697( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1696 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1696 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1JF0( ) ;
      }
   }

   public void confirm_1JF1697( )
   {
      s12215UltLinDisQ = O12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      s12227TotCntR = O12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      s12231ValDisQ = O12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      s12217TotCnt = O12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      s12216TotPor = O12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1JF1697( ) ;
         if ( ( nRcdExists_1697 != 0 ) || ( nIsMod_1697 != 0 ) )
         {
            getKey1JF1697( ) ;
            if ( ( nRcdExists_1697 == 0 ) && ( nRcdDeleted_1697 == 0 ) )
            {
               if ( RcdFound1697 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1JF1697( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1JF1697( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1JF1697( 35) ;
                        zm1JF1697( 36) ;
                     }
                     closeExtendedTableCursors1JF1697( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12215UltLinDisQ = A12215UltLinDisQ ;
                     n12215UltLinDisQ = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
                     O12227TotCntR = A12227TotCntR ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
                     O12231ValDisQ = A12231ValDisQ ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
                     O12217TotCnt = A12217TotCnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
                     O12216TotPor = A12216TotPor ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
                  }
               }
               else
               {
                  GXCCtl = "LINDISID_" + sGXsfl_95_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLinDisID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1697 != 0 )
               {
                  if ( nRcdDeleted_1697 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1JF1697( ) ;
                     load1JF1697( ) ;
                     beforeValidate1JF1697( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1JF1697( ) ;
                        O12215UltLinDisQ = A12215UltLinDisQ ;
                        n12215UltLinDisQ = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
                        O12227TotCntR = A12227TotCntR ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
                        O12231ValDisQ = A12231ValDisQ ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
                        O12217TotCnt = A12217TotCnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
                        O12216TotPor = A12216TotPor ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1697 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1JF1697( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1JF1697( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1JF1697( 35) ;
                              zm1JF1697( 36) ;
                           }
                           closeExtendedTableCursors1JF1697( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12215UltLinDisQ = A12215UltLinDisQ ;
                           n12215UltLinDisQ = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
                           O12227TotCntR = A12227TotCntR ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
                           O12231ValDisQ = A12231ValDisQ ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
                           O12217TotCnt = A12217TotCnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
                           O12216TotPor = A12216TotPor ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1697 == 0 )
                  {
                     GXCCtl = "LINDISID_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLinDisID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1697_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLinDisID_Internalname, GXutil.ltrim( localUtil.ntoc( A12226LinDisID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdDisQu_Internalname, GXutil.rtrim( A12218PrdDisQu)) ;
         httpContext.changePostValue( edtDscDisQu_Internalname, GXutil.rtrim( A12219DscDisQu)) ;
         httpContext.changePostValue( edtPorDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCntDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtValDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUndDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12222UndDisQu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDUnDisQU_Internalname, GXutil.rtrim( A12223DUnDisQU)) ;
         httpContext.changePostValue( edtCntDisQ2_Internalname, GXutil.ltrim( localUtil.ntoc( A12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCntDif_Internalname, GXutil.ltrim( localUtil.ntoc( A12228CntDif, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12226LinDisID_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12226LinDisID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12224CntDisQ2_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12230ValDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12220PorDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12221CntDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12218PrdDisQu_"+sGXsfl_95_idx, GXutil.rtrim( Z12218PrdDisQu)) ;
         httpContext.changePostValue( "ZT_"+"Z12222UndDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12222UndDisQu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12224CntDisQ2_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12230ValDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12221CntDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12220PorDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1697_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1697_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1697_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1697 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1697_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1697_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LINDISID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLinDisID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSCDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDscDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PORDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPorDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CNTDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNDDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUndDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DUNDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDUnDisQU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CNTDISQ2_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQ2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CNTDIF_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12215UltLinDisQ = s12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      O12227TotCntR = s12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      O12231ValDisQ = s12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      O12217TotCnt = s12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      O12216TotPor = s12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1JF0( )
   {
   }

   public void e111JF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdispqr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV40Pgmname, (byte)(99), GXv_char2) ;
      tdispqr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdispqr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdispqr_impl.this.A396EmprCod = GXv_char2[0] ;
      tdispqr_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdispqr_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33ExisteC ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DISPQU", ""), GXv_int6) ;
      tdispqr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33ExisteC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ExisteC", GXutil.str( AV33ExisteC, 1, 0));
      if ( AV33ExisteC == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta contador DISPQU", ""));
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,Long.valueOf(A12225DocDisID)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A12225DocDisID"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e121JF2( )
   {
      /* 'Ver Informe' Routine */
      returnInSub = false ;
      if ( ! (0==A12225DocDisID) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A12225DocDisID ;
         GXv_char3[0] = httpContext.getMessage( "SCRN", "") ;
         new app.pdispq12(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12225DocDisID = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12225DocDisID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12225DocDisID), 10, 0));
      }
      /*  Sending Event outputs  */
   }

   public void zm1JF1696( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12208FecDisQ = T01JF7_A12208FecDisQ[0] ;
            Z12209StaDisQ = T01JF7_A12209StaDisQ[0] ;
            Z12212CntDisQ = T01JF7_A12212CntDisQ[0] ;
            Z12215UltLinDisQ = T01JF7_A12215UltLinDisQ[0] ;
            Z12210PrdDisQ = T01JF7_A12210PrdDisQ[0] ;
            Z12213UndDisQ = T01JF7_A12213UndDisQ[0] ;
         }
         else
         {
            Z12208FecDisQ = A12208FecDisQ ;
            Z12209StaDisQ = A12209StaDisQ ;
            Z12212CntDisQ = A12212CntDisQ ;
            Z12215UltLinDisQ = A12215UltLinDisQ ;
            Z12210PrdDisQ = A12210PrdDisQ ;
            Z12213UndDisQ = A12213UndDisQ ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z12225DocDisID = A12225DocDisID ;
         Z12208FecDisQ = A12208FecDisQ ;
         Z12209StaDisQ = A12209StaDisQ ;
         Z12212CntDisQ = A12212CntDisQ ;
         Z12215UltLinDisQ = A12215UltLinDisQ ;
         Z396EmprCod = A396EmprCod ;
         Z12210PrdDisQ = A12210PrdDisQ ;
         Z12213UndDisQ = A12213UndDisQ ;
         Z407EmprNom = A407EmprNom ;
         Z12214DUnDisQ = A12214DUnDisQ ;
         Z12216TotPor = A12216TotPor ;
         Z12217TotCnt = A12217TotCnt ;
         Z12227TotCntR = A12227TotCntR ;
         Z12231ValDisQ = A12231ValDisQ ;
         Z12211DscDisQ = A12211DscDisQ ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbStaDisQ.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbStaDisQ.getInternalname(), "Enabled", GXutil.ltrimstr( cmbStaDisQ.getEnabled(), 5, 0), true);
      edtUndDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUndDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQ_Enabled), 5, 0), true);
      edtUltLinDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinDisQ_Enabled), 5, 0), true);
      AV40Pgmname = "TDisPqR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbStaDisQ.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbStaDisQ.getInternalname(), "Enabled", GXutil.ltrimstr( cmbStaDisQ.getEnabled(), 5, 0), true);
      edtUndDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUndDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQ_Enabled), 5, 0), true);
      edtUltLinDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinDisQ_Enabled), 5, 0), true);
      /* Using cursor T01JF8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JF8_A407EmprNom[0] ;
      n407EmprNom = T01JF8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01JF12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A12216TotPor = T01JF12_A12216TotPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         A12217TotCnt = T01JF12_A12217TotCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12227TotCntR = T01JF12_A12227TotCntR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = T01JF12_A12231ValDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      }
      else
      {
         A12216TotPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         A12217TotCnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12227TotCntR = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      }
      O12216TotPor = A12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      O12217TotCnt = A12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      O12227TotCntR = A12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      O12231ValDisQ = A12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12208FecDisQ)) && ( Gx_BScreen == 0 ) )
      {
         A12208FecDisQ = GXutil.today( ) ;
         n12208FecDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
      }
      if ( isIns( )  && (0==A12209StaDisQ) && ( Gx_BScreen == 0 ) )
      {
         A12209StaDisQ = (byte)(0) ;
         n12209StaDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
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

   public void load1JF1696( )
   {
      /* Using cursor T01JF14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1696 = (short)(1) ;
         A407EmprNom = T01JF14_A407EmprNom[0] ;
         n407EmprNom = T01JF14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12208FecDisQ = T01JF14_A12208FecDisQ[0] ;
         n12208FecDisQ = T01JF14_n12208FecDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
         A12209StaDisQ = T01JF14_A12209StaDisQ[0] ;
         n12209StaDisQ = T01JF14_n12209StaDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
         A12211DscDisQ = T01JF14_A12211DscDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", A12211DscDisQ);
         A12212CntDisQ = T01JF14_A12212CntDisQ[0] ;
         n12212CntDisQ = T01JF14_n12212CntDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
         A12214DUnDisQ = T01JF14_A12214DUnDisQ[0] ;
         n12214DUnDisQ = T01JF14_n12214DUnDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", A12214DUnDisQ);
         A12215UltLinDisQ = T01JF14_A12215UltLinDisQ[0] ;
         n12215UltLinDisQ = T01JF14_n12215UltLinDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         A12210PrdDisQ = T01JF14_A12210PrdDisQ[0] ;
         n12210PrdDisQ = T01JF14_n12210PrdDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         A12213UndDisQ = T01JF14_A12213UndDisQ[0] ;
         n12213UndDisQ = T01JF14_n12213UndDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
         A12216TotPor = T01JF14_A12216TotPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         A12217TotCnt = T01JF14_A12217TotCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12227TotCntR = T01JF14_A12227TotCntR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = T01JF14_A12231ValDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         zm1JF1696( -29) ;
      }
      pr_default.close(10);
      onLoadActions1JF1696( ) ;
   }

   public void onLoadActions1JF1696( )
   {
      O12227TotCntR = A12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      O12231ValDisQ = A12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      O12217TotCnt = A12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      O12216TotPor = A12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      if ( true /* Level */ && ! (GXutil.strcmp("", A12210PrdDisQ)==0) )
      {
         GXt_int5 = A12213UndDisQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12210PrdDisQ ;
         GXv_int6[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12210PrdDisQ = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         A12213UndDisQ = GXt_int5 ;
         n12213UndDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
      }
   }

   public void checkExtendedTable1JF1696( )
   {
      nIsDirty_1696 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01JF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n12210PrdDisQ), A12210PrdDisQ});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDDISQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQ_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12211DscDisQ = T01JF9_A12211DscDisQ[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", A12211DscDisQ);
      pr_default.close(7);
      if ( true /* Level */ && ! (GXutil.strcmp("", A12210PrdDisQ)==0) )
      {
         nIsDirty_1696 = (short)(1) ;
         GXt_int5 = A12213UndDisQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12210PrdDisQ ;
         GXv_int6[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12210PrdDisQ = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         A12213UndDisQ = GXt_int5 ;
         n12213UndDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
      }
      /* Using cursor T01JF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n12213UndDisQ), Byte.valueOf(A12213UndDisQ)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Unidad Disolucion 1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNDDISQ");
         AnyError = (short)(1) ;
      }
      A12214DUnDisQ = T01JF10_A12214DUnDisQ[0] ;
      n12214DUnDisQ = T01JF10_n12214DUnDisQ[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", A12214DUnDisQ);
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1JF1696( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_31( String A396EmprCod ,
                          String A12210PrdDisQ )
   {
      /* Using cursor T01JF15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n12210PrdDisQ), A12210PrdDisQ});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDDISQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQ_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12211DscDisQ = T01JF15_A12211DscDisQ[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", A12211DscDisQ);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12211DscDisQ))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_32( String A396EmprCod ,
                          byte A12213UndDisQ )
   {
      /* Using cursor T01JF16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n12213UndDisQ), Byte.valueOf(A12213UndDisQ)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Unidad Disolucion 1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNDDISQ");
         AnyError = (short)(1) ;
      }
      A12214DUnDisQ = T01JF16_A12214DUnDisQ[0] ;
      n12214DUnDisQ = T01JF16_n12214DUnDisQ[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", A12214DUnDisQ);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12214DUnDisQ))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1JF1696( )
   {
      /* Using cursor T01JF17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1696 = (short)(1) ;
      }
      else
      {
         RcdFound1696 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(5) != 101) && ( T01JF7_A12225DocDisID[0] == A12225DocDisID ) && ( GXutil.strcmp(T01JF7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JF1696( 29) ;
         RcdFound1696 = (short)(1) ;
         A12208FecDisQ = T01JF7_A12208FecDisQ[0] ;
         n12208FecDisQ = T01JF7_n12208FecDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
         A12209StaDisQ = T01JF7_A12209StaDisQ[0] ;
         n12209StaDisQ = T01JF7_n12209StaDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
         A12212CntDisQ = T01JF7_A12212CntDisQ[0] ;
         n12212CntDisQ = T01JF7_n12212CntDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
         A12215UltLinDisQ = T01JF7_A12215UltLinDisQ[0] ;
         n12215UltLinDisQ = T01JF7_n12215UltLinDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         A12210PrdDisQ = T01JF7_A12210PrdDisQ[0] ;
         n12210PrdDisQ = T01JF7_n12210PrdDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         A12213UndDisQ = T01JF7_A12213UndDisQ[0] ;
         n12213UndDisQ = T01JF7_n12213UndDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
         O12215UltLinDisQ = A12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z12225DocDisID = A12225DocDisID ;
         sMode1696 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JF1696( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1696 = (short)(0) ;
            initializeNonKey1JF1696( ) ;
         }
         Gx_mode = sMode1696 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1696 = (short)(0) ;
         initializeNonKey1JF1696( ) ;
         sMode1696 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1696 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1JF1696( ) ;
      if ( RcdFound1696 == 0 )
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
      RcdFound1696 = (short)(0) ;
      /* Using cursor T01JF18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T01JF18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JF18_A12225DocDisID[0] == A12225DocDisID ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T01JF18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JF18_A12225DocDisID[0] == A12225DocDisID ) )
         {
            RcdFound1696 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound1696 = (short)(0) ;
      /* Using cursor T01JF19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01JF19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JF19_A12225DocDisID[0] == A12225DocDisID ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01JF19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JF19_A12225DocDisID[0] == A12225DocDisID ) )
         {
            RcdFound1696 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JF1696( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12215UltLinDisQ = O12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         A12227TotCntR = O12227TotCntR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = O12231ValDisQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         A12217TotCnt = O12217TotCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12216TotPor = O12216TotPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         GX_FocusControl = edtFecDisQ_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JF1696( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1696 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12225DocDisID != Z12225DocDisID ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12215UltLinDisQ = O12215UltLinDisQ ;
               n12215UltLinDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
               A12227TotCntR = O12227TotCntR ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
               A12231ValDisQ = O12231ValDisQ ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
               A12217TotCnt = O12217TotCnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
               A12216TotPor = O12216TotPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFecDisQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A12215UltLinDisQ = O12215UltLinDisQ ;
               n12215UltLinDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
               A12227TotCntR = O12227TotCntR ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
               A12231ValDisQ = O12231ValDisQ ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
               A12217TotCnt = O12217TotCnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
               A12216TotPor = O12216TotPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
               update1JF1696( ) ;
               GX_FocusControl = edtFecDisQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12225DocDisID != Z12225DocDisID ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12215UltLinDisQ = O12215UltLinDisQ ;
               n12215UltLinDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
               A12227TotCntR = O12227TotCntR ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
               A12231ValDisQ = O12231ValDisQ ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
               A12217TotCnt = O12217TotCnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
               A12216TotPor = O12216TotPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
               GX_FocusControl = edtFecDisQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JF1696( ) ;
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
                  A12215UltLinDisQ = O12215UltLinDisQ ;
                  n12215UltLinDisQ = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
                  A12227TotCntR = O12227TotCntR ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
                  A12231ValDisQ = O12231ValDisQ ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
                  A12217TotCnt = O12217TotCnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
                  A12216TotPor = O12216TotPor ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
                  GX_FocusControl = edtFecDisQ_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JF1696( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12225DocDisID != Z12225DocDisID ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12215UltLinDisQ = O12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         A12227TotCntR = O12227TotCntR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = O12231ValDisQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         A12217TotCnt = O12217TotCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12216TotPor = O12216TotPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFecDisQ_Internalname ;
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
      getKey1JF1696( ) ;
      if ( RcdFound1696 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12225DocDisID != Z12225DocDisID ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12225DocDisID != Z12225DocDisID ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdispqr");
      GX_FocusControl = edtFecDisQ_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1JF0( ) ;
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
      if ( RcdFound1696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFecDisQ_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JF1696( ) ;
      if ( RcdFound1696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecDisQ_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JF1696( ) ;
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
      if ( RcdFound1696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecDisQ_Internalname ;
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
      if ( RcdFound1696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecDisQ_Internalname ;
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
      scanStart1JF1696( ) ;
      if ( RcdFound1696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1696 != 0 )
         {
            scanNext1JF1696( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecDisQ_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JF1696( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JF1696( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JF6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDisPqu"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z12208FecDisQ), GXutil.resetTime(T01JF6_A12208FecDisQ[0])) ) || ( Z12209StaDisQ != T01JF6_A12209StaDisQ[0] ) || ( DecimalUtil.compareTo(Z12212CntDisQ, T01JF6_A12212CntDisQ[0]) != 0 ) || ( Z12215UltLinDisQ != T01JF6_A12215UltLinDisQ[0] ) || ( GXutil.strcmp(Z12210PrdDisQ, T01JF6_A12210PrdDisQ[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12213UndDisQ != T01JF6_A12213UndDisQ[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12208FecDisQ), GXutil.resetTime(T01JF6_A12208FecDisQ[0])) ) )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"FecDisQ");
               GXutil.writeLogRaw("Old: ",Z12208FecDisQ);
               GXutil.writeLogRaw("Current: ",T01JF6_A12208FecDisQ[0]);
            }
            if ( Z12209StaDisQ != T01JF6_A12209StaDisQ[0] )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"StaDisQ");
               GXutil.writeLogRaw("Old: ",Z12209StaDisQ);
               GXutil.writeLogRaw("Current: ",T01JF6_A12209StaDisQ[0]);
            }
            if ( DecimalUtil.compareTo(Z12212CntDisQ, T01JF6_A12212CntDisQ[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"CntDisQ");
               GXutil.writeLogRaw("Old: ",Z12212CntDisQ);
               GXutil.writeLogRaw("Current: ",T01JF6_A12212CntDisQ[0]);
            }
            if ( Z12215UltLinDisQ != T01JF6_A12215UltLinDisQ[0] )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"UltLinDisQ");
               GXutil.writeLogRaw("Old: ",Z12215UltLinDisQ);
               GXutil.writeLogRaw("Current: ",T01JF6_A12215UltLinDisQ[0]);
            }
            if ( GXutil.strcmp(Z12210PrdDisQ, T01JF6_A12210PrdDisQ[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"PrdDisQ");
               GXutil.writeLogRaw("Old: ",Z12210PrdDisQ);
               GXutil.writeLogRaw("Current: ",T01JF6_A12210PrdDisQ[0]);
            }
            if ( Z12213UndDisQ != T01JF6_A12213UndDisQ[0] )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"UndDisQ");
               GXutil.writeLogRaw("Old: ",Z12213UndDisQ);
               GXutil.writeLogRaw("Current: ",T01JF6_A12213UndDisQ[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDisPqu"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JF1696( )
   {
      beforeValidate1JF1696( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JF1696( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JF1696( 0) ;
         checkOptimisticConcurrency1JF1696( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JF1696( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JF1696( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JF20 */
                  pr_default.execute(16, new Object[] {Long.valueOf(A12225DocDisID), Boolean.valueOf(n12208FecDisQ), A12208FecDisQ, Boolean.valueOf(n12209StaDisQ), Byte.valueOf(A12209StaDisQ), Boolean.valueOf(n12212CntDisQ), A12212CntDisQ, Boolean.valueOf(n12215UltLinDisQ), Short.valueOf(A12215UltLinDisQ), A396EmprCod, Boolean.valueOf(n12210PrdDisQ), A12210PrdDisQ, Boolean.valueOf(n12213UndDisQ), Byte.valueOf(A12213UndDisQ)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPqu");
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
                        processLevel1JF1696( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1JF0( ) ;
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
            load1JF1696( ) ;
         }
         endLevel1JF1696( ) ;
      }
      closeExtendedTableCursors1JF1696( ) ;
   }

   public void update1JF1696( )
   {
      beforeValidate1JF1696( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JF1696( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JF1696( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JF1696( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JF1696( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JF21 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n12208FecDisQ), A12208FecDisQ, Boolean.valueOf(n12209StaDisQ), Byte.valueOf(A12209StaDisQ), Boolean.valueOf(n12212CntDisQ), A12212CntDisQ, Boolean.valueOf(n12215UltLinDisQ), Short.valueOf(A12215UltLinDisQ), Boolean.valueOf(n12210PrdDisQ), A12210PrdDisQ, Boolean.valueOf(n12213UndDisQ), Byte.valueOf(A12213UndDisQ), A396EmprCod, Long.valueOf(A12225DocDisID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPqu");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDisPqu"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JF1696( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1JF1696( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1JF0( ) ;
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
         endLevel1JF1696( ) ;
      }
      closeExtendedTableCursors1JF1696( ) ;
   }

   public void deferredUpdate1JF1696( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JF1696( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JF1696( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JF1696( ) ;
         afterConfirm1JF1696( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JF1696( ) ;
            if ( AnyError == 0 )
            {
               A12215UltLinDisQ = O12215UltLinDisQ ;
               n12215UltLinDisQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
               A12227TotCntR = O12227TotCntR ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
               A12231ValDisQ = O12231ValDisQ ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
               A12217TotCnt = O12217TotCnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
               A12216TotPor = O12216TotPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
               scanStart1JF1697( ) ;
               while ( RcdFound1697 != 0 )
               {
                  getByPrimaryKey1JF1697( ) ;
                  delete1JF1697( ) ;
                  scanNext1JF1697( ) ;
                  O12215UltLinDisQ = A12215UltLinDisQ ;
                  n12215UltLinDisQ = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
                  O12227TotCntR = A12227TotCntR ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
                  O12231ValDisQ = A12231ValDisQ ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
                  O12217TotCnt = A12217TotCnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
                  O12216TotPor = A12216TotPor ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
               }
               scanEnd1JF1697( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JF22 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPqu");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1696 == 0 )
                        {
                           initAll1JF1696( ) ;
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
                        resetCaption1JF0( ) ;
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
      sMode1696 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JF1696( ) ;
      Gx_mode = sMode1696 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JF1696( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01JF23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n12210PrdDisQ), A12210PrdDisQ});
         A12211DscDisQ = T01JF23_A12211DscDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", A12211DscDisQ);
         pr_default.close(19);
         /* Using cursor T01JF24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n12213UndDisQ), Byte.valueOf(A12213UndDisQ)});
         A12214DUnDisQ = T01JF24_A12214DUnDisQ[0] ;
         n12214DUnDisQ = T01JF24_n12214DUnDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", A12214DUnDisQ);
         pr_default.close(20);
      }
   }

   public void processNestedLevel1JF1697( )
   {
      s12215UltLinDisQ = O12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      s12227TotCntR = O12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      s12231ValDisQ = O12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      s12217TotCnt = O12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      s12216TotPor = O12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1JF1697( ) ;
         if ( ( nRcdExists_1697 != 0 ) || ( nIsMod_1697 != 0 ) )
         {
            standaloneNotModal1JF1697( ) ;
            getKey1JF1697( ) ;
            if ( ( nRcdExists_1697 == 0 ) && ( nRcdDeleted_1697 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1JF1697( ) ;
            }
            else
            {
               if ( RcdFound1697 != 0 )
               {
                  if ( ( nRcdDeleted_1697 != 0 ) && ( nRcdExists_1697 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1JF1697( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1697 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1JF1697( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1697 == 0 )
                  {
                     GXCCtl = "LINDISID_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLinDisID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12215UltLinDisQ = A12215UltLinDisQ ;
            n12215UltLinDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
            O12227TotCntR = A12227TotCntR ;
            httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
            O12231ValDisQ = A12231ValDisQ ;
            httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
            O12217TotCnt = A12217TotCnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
            O12216TotPor = A12216TotPor ;
            httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1697_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLinDisID_Internalname, GXutil.ltrim( localUtil.ntoc( A12226LinDisID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdDisQu_Internalname, GXutil.rtrim( A12218PrdDisQu)) ;
         httpContext.changePostValue( edtDscDisQu_Internalname, GXutil.rtrim( A12219DscDisQu)) ;
         httpContext.changePostValue( edtPorDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCntDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtValDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUndDisQu_Internalname, GXutil.ltrim( localUtil.ntoc( A12222UndDisQu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDUnDisQU_Internalname, GXutil.rtrim( A12223DUnDisQU)) ;
         httpContext.changePostValue( edtCntDisQ2_Internalname, GXutil.ltrim( localUtil.ntoc( A12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCntDif_Internalname, GXutil.ltrim( localUtil.ntoc( A12228CntDif, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12226LinDisID_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12226LinDisID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12224CntDisQ2_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12230ValDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12220PorDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12221CntDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12218PrdDisQu_"+sGXsfl_95_idx, GXutil.rtrim( Z12218PrdDisQu)) ;
         httpContext.changePostValue( "ZT_"+"Z12222UndDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12222UndDisQu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12224CntDisQ2_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12230ValDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12221CntDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12220PorDisQu_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( O12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1697_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1697_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1697_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1697 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1697_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1697_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LINDISID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLinDisID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSCDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDscDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PORDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPorDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CNTDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNDDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUndDisQu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DUNDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDUnDisQU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CNTDISQ2_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQ2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CNTDIF_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1JF1697( ) ;
      if ( AnyError != 0 )
      {
         O12215UltLinDisQ = s12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         O12227TotCntR = s12227TotCntR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         O12231ValDisQ = s12231ValDisQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         O12217TotCnt = s12217TotCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         O12216TotPor = s12216TotPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      }
      nRcdExists_1697 = (short)(0) ;
      nIsMod_1697 = (short)(0) ;
      nRcdDeleted_1697 = (short)(0) ;
   }

   public void processLevel1JF1696( )
   {
      /* Save parent mode. */
      sMode1696 = Gx_mode ;
      processNestedLevel1JF1697( ) ;
      if ( AnyError != 0 )
      {
         O12215UltLinDisQ = s12215UltLinDisQ ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
         O12227TotCntR = s12227TotCntR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         O12231ValDisQ = s12231ValDisQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         O12217TotCnt = s12217TotCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         O12216TotPor = s12216TotPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1696 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01JF25 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n12215UltLinDisQ), Short.valueOf(A12215UltLinDisQ), A396EmprCod, Long.valueOf(A12225DocDisID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPqu");
   }

   public void endLevel1JF1696( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete1JF1696( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdispqr");
         if ( AnyError == 0 )
         {
            confirmValues1JF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdispqr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JF1696( )
   {
      /* Scan By routine */
      /* Using cursor T01JF26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      RcdFound1696 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1696 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JF1696( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1696 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1696 = (short)(1) ;
      }
   }

   public void scanEnd1JF1696( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1JF1696( )
   {
      /* After Confirm Rules */
      if ( ( isDlt( )  || isUpd( )  ) && ( A12209StaDisQ > 3 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitidad.Estado Disolucion", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1JF1696( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JF1696( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JF1696( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JF1696( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JF1696( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JF1696( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDocDisID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocDisID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDocDisID_Enabled), 5, 0), true);
      edtFecDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFecDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFecDisQ_Enabled), 5, 0), true);
      cmbStaDisQ.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbStaDisQ.getInternalname(), "Enabled", GXutil.ltrimstr( cmbStaDisQ.getEnabled(), 5, 0), true);
      edtPrdDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisQ_Enabled), 5, 0), true);
      edtDscDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscDisQ_Enabled), 5, 0), true);
      edtCntDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQ_Enabled), 5, 0), true);
      edtUndDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUndDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQ_Enabled), 5, 0), true);
      edtDUnDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDUnDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDUnDisQ_Enabled), 5, 0), true);
      edtUltLinDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinDisQ_Enabled), 5, 0), true);
      edtTotPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotPor_Enabled), 5, 0), true);
      edtTotCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotCnt_Enabled), 5, 0), true);
      edtTotCntR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotCntR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotCntR_Enabled), 5, 0), true);
      edtValDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDisQ_Enabled), 5, 0), true);
   }

   public void zm1JF1697( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12224CntDisQ2 = T01JF3_A12224CntDisQ2[0] ;
            Z12230ValDisQu = T01JF3_A12230ValDisQu[0] ;
            Z12220PorDisQu = T01JF3_A12220PorDisQu[0] ;
            Z12221CntDisQu = T01JF3_A12221CntDisQu[0] ;
            Z12218PrdDisQu = T01JF3_A12218PrdDisQu[0] ;
            Z12222UndDisQu = T01JF3_A12222UndDisQu[0] ;
         }
         else
         {
            Z12224CntDisQ2 = A12224CntDisQ2 ;
            Z12230ValDisQu = A12230ValDisQu ;
            Z12220PorDisQu = A12220PorDisQu ;
            Z12221CntDisQu = A12221CntDisQu ;
            Z12218PrdDisQu = A12218PrdDisQu ;
            Z12222UndDisQu = A12222UndDisQu ;
         }
      }
      if ( GX_JID == -34 )
      {
         Z12225DocDisID = A12225DocDisID ;
         Z12226LinDisID = A12226LinDisID ;
         Z12224CntDisQ2 = A12224CntDisQ2 ;
         Z12230ValDisQu = A12230ValDisQu ;
         Z12220PorDisQu = A12220PorDisQu ;
         Z12221CntDisQu = A12221CntDisQu ;
         Z396EmprCod = A396EmprCod ;
         Z12218PrdDisQu = A12218PrdDisQu ;
         Z12222UndDisQu = A12222UndDisQu ;
         Z12223DUnDisQU = A12223DUnDisQU ;
         Z12219DscDisQu = A12219DscDisQu ;
      }
   }

   public void standaloneNotModal1JF1697( )
   {
      edtUndDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUndDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCntDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtValDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtUltLinDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinDisQ_Enabled), 5, 0), true);
      edtUltLinDisQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinDisQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinDisQ_Enabled), 5, 0), true);
   }

   public void standaloneModal1JF1697( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no disponible", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A12215UltLinDisQ = (short)(O12215UltLinDisQ+1) ;
         n12215UltLinDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12224CntDisQ2)==0) && ( Gx_BScreen == 0 ) )
      {
         A12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
         n12224CntDisQ2 = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A12226LinDisID = A12215UltLinDisQ ;
      }
      if ( isIns( )  )
      {
         A12217TotCnt = O12217TotCnt.add(A12221CntDisQu) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A12217TotCnt = O12217TotCnt.add(A12221CntDisQu).subtract(O12221CntDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A12217TotCnt = O12217TotCnt.subtract(O12221CntDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLinDisID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinDisID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinDisID_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtLinDisID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLinDisID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinDisID_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( true /* Level */ && true /* After */ )
         {
            GXt_decimal8 = A12230ValDisQu ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A12218PrdDisQu ;
            GXv_decimal9[0] = A12212CntDisQ ;
            GXv_decimal10[0] = A12224CntDisQ2 ;
            GXv_decimal11[0] = A12221CntDisQu ;
            GXv_decimal12[0] = A12227TotCntR ;
            GXv_decimal13[0] = GXt_decimal8 ;
            new app.pdispq11(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13) ;
            tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
            tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
            tdispqr_impl.this.A12212CntDisQ = GXv_decimal9[0] ;
            tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal10[0] ;
            tdispqr_impl.this.A12221CntDisQu = GXv_decimal11[0] ;
            tdispqr_impl.this.A12227TotCntR = GXv_decimal12[0] ;
            tdispqr_impl.this.GXt_decimal8 = GXv_decimal13[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
            A12230ValDisQu = GXt_decimal8 ;
            n12230ValDisQu = false ;
         }
      }
   }

   public void load1JF1697( )
   {
      /* Using cursor T01JF27 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1697 = (short)(1) ;
         A12224CntDisQ2 = T01JF27_A12224CntDisQ2[0] ;
         n12224CntDisQ2 = T01JF27_n12224CntDisQ2[0] ;
         A12230ValDisQu = T01JF27_A12230ValDisQu[0] ;
         n12230ValDisQu = T01JF27_n12230ValDisQu[0] ;
         A12219DscDisQu = T01JF27_A12219DscDisQu[0] ;
         A12220PorDisQu = T01JF27_A12220PorDisQu[0] ;
         n12220PorDisQu = T01JF27_n12220PorDisQu[0] ;
         A12221CntDisQu = T01JF27_A12221CntDisQu[0] ;
         n12221CntDisQu = T01JF27_n12221CntDisQu[0] ;
         A12223DUnDisQU = T01JF27_A12223DUnDisQU[0] ;
         n12223DUnDisQU = T01JF27_n12223DUnDisQU[0] ;
         A12218PrdDisQu = T01JF27_A12218PrdDisQu[0] ;
         n12218PrdDisQu = T01JF27_n12218PrdDisQu[0] ;
         A12222UndDisQu = T01JF27_A12222UndDisQu[0] ;
         n12222UndDisQu = T01JF27_n12222UndDisQu[0] ;
         zm1JF1697( -34) ;
      }
      pr_default.close(23);
      onLoadActions1JF1697( ) ;
   }

   public void onLoadActions1JF1697( )
   {
      if ( true /* Level */ && ! (GXutil.strcmp("", A12218PrdDisQu)==0) )
      {
         GXt_int5 = A12222UndDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_int6[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12222UndDisQu = GXt_int5 ;
         n12222UndDisQu = false ;
      }
      if ( isIns( )  )
      {
         A12216TotPor = O12216TotPor.add(A12220PorDisQu) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A12216TotPor = O12216TotPor.add(A12220PorDisQu).subtract(O12220PorDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A12216TotPor = O12216TotPor.subtract(O12220PorDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
            }
         }
      }
      if ( A12224CntDisQ2.doubleValue() > 0 )
      {
         A12228CntDif = A12224CntDisQ2.subtract(A12221CntDisQu) ;
      }
      else
      {
         A12228CntDif = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         A12227TotCntR = O12227TotCntR.add(A12224CntDisQ2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A12227TotCntR = O12227TotCntR.add(A12224CntDisQ2).subtract(O12224CntDisQ2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A12227TotCntR = O12227TotCntR.subtract(O12224CntDisQ2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
            }
         }
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXt_decimal8 = A12230ValDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12212CntDisQ ;
         GXv_decimal12[0] = A12224CntDisQ2 ;
         GXv_decimal11[0] = A12221CntDisQu ;
         GXv_decimal10[0] = A12227TotCntR ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pdispq11(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal9) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.A12212CntDisQ = GXv_decimal13[0] ;
         tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal12[0] ;
         tdispqr_impl.this.A12221CntDisQu = GXv_decimal11[0] ;
         tdispqr_impl.this.A12227TotCntR = GXv_decimal10[0] ;
         tdispqr_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12230ValDisQu = GXt_decimal8 ;
         n12230ValDisQu = false ;
      }
      if ( isIns( )  )
      {
         A12231ValDisQ = O12231ValDisQ.add(A12230ValDisQu) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A12231ValDisQ = O12231ValDisQ.add(A12230ValDisQu).subtract(O12230ValDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A12231ValDisQ = O12231ValDisQ.subtract(O12230ValDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
            }
         }
      }
   }

   public void checkExtendedTable1JF1697( )
   {
      nIsDirty_1697 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1JF1697( ) ;
      /* Using cursor T01JF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n12218PrdDisQu), A12218PrdDisQu});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12219DscDisQu = T01JF4_A12219DscDisQu[0] ;
      pr_default.close(2);
      if ( true /* Level */ && ! (GXutil.strcmp("", A12218PrdDisQu)==0) )
      {
         nIsDirty_1697 = (short)(1) ;
         GXt_int5 = A12222UndDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_int6[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12222UndDisQu = GXt_int5 ;
         n12222UndDisQu = false ;
      }
      /* Using cursor T01JF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n12222UndDisQu), Byte.valueOf(A12222UndDisQu)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "UNDDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Unidad Disolucion 2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A12223DUnDisQU = T01JF5_A12223DUnDisQU[0] ;
      n12223DUnDisQU = T01JF5_n12223DUnDisQU[0] ;
      pr_default.close(3);
      if ( true /* After */ )
      {
         GXv_int6[0] = AV34flag ;
         GXv_int14[0] = AV35ValCod ;
         new app.pbusval(remoteHandle, context).execute( A396EmprCod, A12218PrdDisQu, GXv_int6, GXv_int14) ;
         tdispqr_impl.this.AV34flag = GXv_int6[0] ;
         tdispqr_impl.this.AV35ValCod = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34flag", GXutil.str( AV34flag, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35ValCod", GXutil.str( AV35ValCod, 1, 0));
      }
      if ( ( AV35ValCod == 3 ) && true /* After */ )
      {
         GXCCtl = "PRDDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto SUPRIMIDO", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV34flag == 0 ) && true /* After */ )
      {
         GXCCtl = "PRDDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto INexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_1697 = (short)(1) ;
         A12216TotPor = O12216TotPor.add(A12220PorDisQu) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1697 = (short)(1) ;
            A12216TotPor = O12216TotPor.add(A12220PorDisQu).subtract(O12220PorDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1697 = (short)(1) ;
               A12216TotPor = O12216TotPor.subtract(O12220PorDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
            }
         }
      }
      if ( A12224CntDisQ2.doubleValue() > 0 )
      {
         nIsDirty_1697 = (short)(1) ;
         A12228CntDif = A12224CntDisQ2.subtract(A12221CntDisQu) ;
      }
      else
      {
         nIsDirty_1697 = (short)(1) ;
         A12228CntDif = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_1697 = (short)(1) ;
         A12227TotCntR = O12227TotCntR.add(A12224CntDisQ2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1697 = (short)(1) ;
            A12227TotCntR = O12227TotCntR.add(A12224CntDisQ2).subtract(O12224CntDisQ2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1697 = (short)(1) ;
               A12227TotCntR = O12227TotCntR.subtract(O12224CntDisQ2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
            }
         }
      }
      if ( true /* Level */ && true /* After */ )
      {
         nIsDirty_1697 = (short)(1) ;
         GXt_decimal8 = A12230ValDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12212CntDisQ ;
         GXv_decimal12[0] = A12224CntDisQ2 ;
         GXv_decimal11[0] = A12221CntDisQu ;
         GXv_decimal10[0] = A12227TotCntR ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pdispq11(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal9) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.A12212CntDisQ = GXv_decimal13[0] ;
         tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal12[0] ;
         tdispqr_impl.this.A12221CntDisQu = GXv_decimal11[0] ;
         tdispqr_impl.this.A12227TotCntR = GXv_decimal10[0] ;
         tdispqr_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12230ValDisQu = GXt_decimal8 ;
         n12230ValDisQu = false ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12224CntDisQ2 ;
         GXv_decimal12[0] = A12221CntDisQu ;
         GXv_decimal11[0] = AV36PrdPreact ;
         GXv_char2[0] = AV37msg_err ;
         new app.pdispq36(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_char2) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal13[0] ;
         tdispqr_impl.this.A12221CntDisQu = GXv_decimal12[0] ;
         tdispqr_impl.this.AV36PrdPreact = GXv_decimal11[0] ;
         tdispqr_impl.this.AV37msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV36PrdPreact", GXutil.ltrimstr( AV36PrdPreact, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV37msg_err", AV37msg_err);
      }
      if ( ! (GXutil.strcmp("", AV37msg_err)==0) && true /* After */ )
      {
         GXCCtl = "CNTDISQ2_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(AV37msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCntDisQ2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_1697 = (short)(1) ;
         A12231ValDisQ = O12231ValDisQ.add(A12230ValDisQu) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1697 = (short)(1) ;
            A12231ValDisQ = O12231ValDisQ.add(A12230ValDisQu).subtract(O12230ValDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1697 = (short)(1) ;
               A12231ValDisQ = O12231ValDisQ.subtract(O12230ValDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors1JF1697( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1JF1697( )
   {
   }

   public void gxload_35( String A396EmprCod ,
                          String A12218PrdDisQu )
   {
      /* Using cursor T01JF28 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n12218PrdDisQu), A12218PrdDisQu});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PRDDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12219DscDisQu = T01JF28_A12219DscDisQu[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12219DscDisQu))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_36( String A396EmprCod ,
                          byte A12222UndDisQu )
   {
      /* Using cursor T01JF29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n12222UndDisQu), Byte.valueOf(A12222UndDisQu)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "UNDDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Unidad Disolucion 2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A12223DUnDisQU = T01JF29_A12223DUnDisQU[0] ;
      n12223DUnDisQU = T01JF29_n12223DUnDisQU[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12223DUnDisQU))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey1JF1697( )
   {
      /* Using cursor T01JF30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1697 = (short)(1) ;
      }
      else
      {
         RcdFound1697 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1JF1697( )
   {
      /* Using cursor T01JF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID)});
      if ( (pr_default.getStatus(1) != 101) && ( T01JF3_A12225DocDisID[0] == A12225DocDisID ) && ( GXutil.strcmp(T01JF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JF1697( 34) ;
         RcdFound1697 = (short)(1) ;
         initializeNonKey1JF1697( ) ;
         A12226LinDisID = T01JF3_A12226LinDisID[0] ;
         A12224CntDisQ2 = T01JF3_A12224CntDisQ2[0] ;
         n12224CntDisQ2 = T01JF3_n12224CntDisQ2[0] ;
         A12230ValDisQu = T01JF3_A12230ValDisQu[0] ;
         n12230ValDisQu = T01JF3_n12230ValDisQu[0] ;
         A12220PorDisQu = T01JF3_A12220PorDisQu[0] ;
         n12220PorDisQu = T01JF3_n12220PorDisQu[0] ;
         A12221CntDisQu = T01JF3_A12221CntDisQu[0] ;
         n12221CntDisQu = T01JF3_n12221CntDisQu[0] ;
         A12218PrdDisQu = T01JF3_A12218PrdDisQu[0] ;
         n12218PrdDisQu = T01JF3_n12218PrdDisQu[0] ;
         A12222UndDisQu = T01JF3_A12222UndDisQu[0] ;
         n12222UndDisQu = T01JF3_n12222UndDisQu[0] ;
         O12224CntDisQ2 = A12224CntDisQ2 ;
         n12224CntDisQ2 = false ;
         O12230ValDisQu = A12230ValDisQu ;
         n12230ValDisQu = false ;
         O12221CntDisQu = A12221CntDisQu ;
         n12221CntDisQu = false ;
         O12220PorDisQu = A12220PorDisQu ;
         n12220PorDisQu = false ;
         Z396EmprCod = A396EmprCod ;
         Z12225DocDisID = A12225DocDisID ;
         Z12226LinDisID = A12226LinDisID ;
         sMode1697 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JF1697( ) ;
         load1JF1697( ) ;
         Gx_mode = sMode1697 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1697 = (short)(0) ;
         initializeNonKey1JF1697( ) ;
         sMode1697 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JF1697( ) ;
         Gx_mode = sMode1697 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1JF1697( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1JF1697( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDisPq1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12224CntDisQ2, T01JF2_A12224CntDisQ2[0]) != 0 ) || ( DecimalUtil.compareTo(Z12230ValDisQu, T01JF2_A12230ValDisQu[0]) != 0 ) || ( DecimalUtil.compareTo(Z12220PorDisQu, T01JF2_A12220PorDisQu[0]) != 0 ) || ( DecimalUtil.compareTo(Z12221CntDisQu, T01JF2_A12221CntDisQu[0]) != 0 ) || ( GXutil.strcmp(Z12218PrdDisQu, T01JF2_A12218PrdDisQu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12222UndDisQu != T01JF2_A12222UndDisQu[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12224CntDisQ2, T01JF2_A12224CntDisQ2[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"CntDisQ2");
               GXutil.writeLogRaw("Old: ",Z12224CntDisQ2);
               GXutil.writeLogRaw("Current: ",T01JF2_A12224CntDisQ2[0]);
            }
            if ( DecimalUtil.compareTo(Z12230ValDisQu, T01JF2_A12230ValDisQu[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"ValDisQu");
               GXutil.writeLogRaw("Old: ",Z12230ValDisQu);
               GXutil.writeLogRaw("Current: ",T01JF2_A12230ValDisQu[0]);
            }
            if ( DecimalUtil.compareTo(Z12220PorDisQu, T01JF2_A12220PorDisQu[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"PorDisQu");
               GXutil.writeLogRaw("Old: ",Z12220PorDisQu);
               GXutil.writeLogRaw("Current: ",T01JF2_A12220PorDisQu[0]);
            }
            if ( DecimalUtil.compareTo(Z12221CntDisQu, T01JF2_A12221CntDisQu[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"CntDisQu");
               GXutil.writeLogRaw("Old: ",Z12221CntDisQu);
               GXutil.writeLogRaw("Current: ",T01JF2_A12221CntDisQu[0]);
            }
            if ( GXutil.strcmp(Z12218PrdDisQu, T01JF2_A12218PrdDisQu[0]) != 0 )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"PrdDisQu");
               GXutil.writeLogRaw("Old: ",Z12218PrdDisQu);
               GXutil.writeLogRaw("Current: ",T01JF2_A12218PrdDisQu[0]);
            }
            if ( Z12222UndDisQu != T01JF2_A12222UndDisQu[0] )
            {
               GXutil.writeLogln("tdispqr:[seudo value changed for attri]"+"UndDisQu");
               GXutil.writeLogRaw("Old: ",Z12222UndDisQu);
               GXutil.writeLogRaw("Current: ",T01JF2_A12222UndDisQu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDisPq1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JF1697( )
   {
      beforeValidate1JF1697( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JF1697( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JF1697( 0) ;
         checkOptimisticConcurrency1JF1697( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JF1697( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JF1697( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JF31 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID), Boolean.valueOf(n12224CntDisQ2), A12224CntDisQ2, Boolean.valueOf(n12230ValDisQu), A12230ValDisQu, Boolean.valueOf(n12220PorDisQu), A12220PorDisQu, Boolean.valueOf(n12221CntDisQu), A12221CntDisQu, A396EmprCod, Boolean.valueOf(n12218PrdDisQu), A12218PrdDisQu, Boolean.valueOf(n12222UndDisQu), Byte.valueOf(A12222UndDisQu)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPq1");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1JF1697( ) ;
         }
         endLevel1JF1697( ) ;
      }
      closeExtendedTableCursors1JF1697( ) ;
   }

   public void update1JF1697( )
   {
      beforeValidate1JF1697( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JF1697( ) ;
      }
      if ( ( nIsMod_1697 != 0 ) || ( nIsDirty_1697 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1JF1697( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1JF1697( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1JF1697( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01JF32 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n12224CntDisQ2), A12224CntDisQ2, Boolean.valueOf(n12230ValDisQu), A12230ValDisQu, Boolean.valueOf(n12220PorDisQu), A12220PorDisQu, Boolean.valueOf(n12221CntDisQu), A12221CntDisQu, Boolean.valueOf(n12218PrdDisQu), A12218PrdDisQu, Boolean.valueOf(n12222UndDisQu), Byte.valueOf(A12222UndDisQu), A396EmprCod, Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPq1");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDisPq1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1JF1697( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1JF1697( ) ;
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
            endLevel1JF1697( ) ;
         }
      }
      closeExtendedTableCursors1JF1697( ) ;
   }

   public void deferredUpdate1JF1697( )
   {
   }

   public void delete1JF1697( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JF1697( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JF1697( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JF1697( ) ;
         afterConfirm1JF1697( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JF1697( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JF33 */
               pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID), Short.valueOf(A12226LinDisID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisPq1");
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
      sMode1697 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JF1697( ) ;
      Gx_mode = sMode1697 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JF1697( )
   {
      standaloneModal1JF1697( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01JF34 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n12218PrdDisQu), A12218PrdDisQu});
         A12219DscDisQu = T01JF34_A12219DscDisQu[0] ;
         pr_default.close(30);
         if ( isIns( )  )
         {
            A12216TotPor = O12216TotPor.add(A12220PorDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A12216TotPor = O12216TotPor.add(A12220PorDisQu).subtract(O12220PorDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A12216TotPor = O12216TotPor.subtract(O12220PorDisQu) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A12227TotCntR = O12227TotCntR.add(A12224CntDisQ2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A12227TotCntR = O12227TotCntR.add(A12224CntDisQ2).subtract(O12224CntDisQ2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A12227TotCntR = O12227TotCntR.subtract(O12224CntDisQ2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A12231ValDisQ = O12231ValDisQ.add(A12230ValDisQu) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A12231ValDisQ = O12231ValDisQ.add(A12230ValDisQu).subtract(O12230ValDisQu) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A12231ValDisQ = O12231ValDisQ.subtract(O12230ValDisQu) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
               }
            }
         }
         if ( A12224CntDisQ2.doubleValue() > 0 )
         {
            A12228CntDif = A12224CntDisQ2.subtract(A12221CntDisQu) ;
         }
         else
         {
            A12228CntDif = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor T01JF35 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n12222UndDisQu), Byte.valueOf(A12222UndDisQu)});
         A12223DUnDisQU = T01JF35_A12223DUnDisQU[0] ;
         n12223DUnDisQU = T01JF35_n12223DUnDisQU[0] ;
         pr_default.close(31);
      }
   }

   public void endLevel1JF1697( )
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

   public void scanStart1JF1697( )
   {
      /* Scan By routine */
      /* Using cursor T01JF36 */
      pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      RcdFound1697 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1697 = (short)(1) ;
         A12226LinDisID = T01JF36_A12226LinDisID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JF1697( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1697 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1697 = (short)(1) ;
         A12226LinDisID = T01JF36_A12226LinDisID[0] ;
      }
   }

   public void scanEnd1JF1697( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1JF1697( )
   {
      /* After Confirm Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A12224CntDisQ2)==0) && true /* After */ )
      {
         GXCCtl = "CNTDISQ2_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Añadida", ""), 0, GXCCtl);
      }
   }

   public void beforeInsert1JF1697( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JF1697( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JF1697( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JF1697( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JF1697( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JF1697( )
   {
      edtLinDisID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLinDisID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinDisID_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtPrdDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDscDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtPorDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPorDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCntDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtValDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtUndDisQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUndDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtDUnDisQU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDUnDisQU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDUnDisQU_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCntDisQ2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntDisQ2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQ2_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCntDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDif_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashes1JF1697( )
   {
   }

   public void send_integrity_lvl_hashes1JF1696( )
   {
   }

   public void subsflControlProps_951697( )
   {
      edtavnRcdDeleted_1697_Internalname = "vNRCDDELETED_1697_"+sGXsfl_95_idx ;
      edtLinDisID_Internalname = "LINDISID_"+sGXsfl_95_idx ;
      edtPrdDisQu_Internalname = "PRDDISQU_"+sGXsfl_95_idx ;
      edtDscDisQu_Internalname = "DSCDISQU_"+sGXsfl_95_idx ;
      edtPorDisQu_Internalname = "PORDISQU_"+sGXsfl_95_idx ;
      edtCntDisQu_Internalname = "CNTDISQU_"+sGXsfl_95_idx ;
      edtValDisQu_Internalname = "VALDISQU_"+sGXsfl_95_idx ;
      edtUndDisQu_Internalname = "UNDDISQU_"+sGXsfl_95_idx ;
      edtDUnDisQU_Internalname = "DUNDISQU_"+sGXsfl_95_idx ;
      edtCntDisQ2_Internalname = "CNTDISQ2_"+sGXsfl_95_idx ;
      edtCntDif_Internalname = "CNTDIF_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_951697( )
   {
      edtavnRcdDeleted_1697_Internalname = "vNRCDDELETED_1697_"+sGXsfl_95_fel_idx ;
      edtLinDisID_Internalname = "LINDISID_"+sGXsfl_95_fel_idx ;
      edtPrdDisQu_Internalname = "PRDDISQU_"+sGXsfl_95_fel_idx ;
      edtDscDisQu_Internalname = "DSCDISQU_"+sGXsfl_95_fel_idx ;
      edtPorDisQu_Internalname = "PORDISQU_"+sGXsfl_95_fel_idx ;
      edtCntDisQu_Internalname = "CNTDISQU_"+sGXsfl_95_fel_idx ;
      edtValDisQu_Internalname = "VALDISQU_"+sGXsfl_95_fel_idx ;
      edtUndDisQu_Internalname = "UNDDISQU_"+sGXsfl_95_fel_idx ;
      edtDUnDisQU_Internalname = "DUNDISQU_"+sGXsfl_95_fel_idx ;
      edtCntDisQ2_Internalname = "CNTDISQ2_"+sGXsfl_95_fel_idx ;
      edtCntDif_Internalname = "CNTDIF_"+sGXsfl_95_fel_idx ;
   }

   public void addRow1JF1697( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951697( ) ;
      sendRow1JF1697( ) ;
   }

   public void sendRow1JF1697( )
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
         if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1697_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1697_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1697_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1697), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1697), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1697_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1697_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1697_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLinDisID_Internalname,GXutil.ltrim( localUtil.ntoc( A12226LinDisID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12226LinDisID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLinDisID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLinDisID_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1697_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDisQu_Internalname,GXutil.rtrim( A12218PrdDisQu),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdDisQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdDisQu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDscDisQu_Internalname,GXutil.rtrim( A12219DscDisQu),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDscDisQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDscDisQu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1697_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPorDisQu_Internalname,GXutil.ltrim( localUtil.ntoc( A12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPorDisQu_Enabled!=0) ? localUtil.format( A12220PorDisQu, "ZZ9.99") : localUtil.format( A12220PorDisQu, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPorDisQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPorDisQu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCntDisQu_Internalname,GXutil.ltrim( localUtil.ntoc( A12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCntDisQu_Enabled!=0) ? localUtil.format( A12221CntDisQu, "ZZZZZ9.99") : localUtil.format( A12221CntDisQu, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCntDisQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCntDisQu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDisQu_Internalname,GXutil.ltrim( localUtil.ntoc( A12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtValDisQu_Enabled!=0) ? localUtil.format( A12230ValDisQu, "ZZZZ9.99999") : localUtil.format( A12230ValDisQu, "ZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValDisQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtValDisQu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUndDisQu_Internalname,GXutil.ltrim( localUtil.ntoc( A12222UndDisQu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtUndDisQu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12222UndDisQu), "9") : localUtil.format( DecimalUtil.doubleToDec(A12222UndDisQu), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUndDisQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUndDisQu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDUnDisQU_Internalname,GXutil.rtrim( A12223DUnDisQU),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDUnDisQU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDUnDisQU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1697_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCntDisQ2_Internalname,GXutil.ltrim( localUtil.ntoc( A12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCntDisQ2_Enabled!=0) ? localUtil.format( A12224CntDisQ2, "ZZZZZ9.99") : localUtil.format( A12224CntDisQ2, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCntDisQ2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCntDisQ2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCntDif_Internalname,GXutil.ltrim( localUtil.ntoc( A12228CntDif, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCntDif_Enabled!=0) ? localUtil.format( A12228CntDif, "ZZZZZ9.99") : localUtil.format( A12228CntDif, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCntDif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCntDif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1JF1697( ) ;
      GXCCtl = "Z12226LinDisID_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12226LinDisID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12224CntDisQ2_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12230ValDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12220PorDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12221CntDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12218PrdDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12218PrdDisQu));
      GXCCtl = "Z12222UndDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12222UndDisQu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12224CntDisQ2_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12224CntDisQ2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12230ValDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12230ValDisQu, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12221CntDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12221CntDisQu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12220PorDisQu_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12220PorDisQu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1697_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1697_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1697_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1697_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1697_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LINDISID_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLinDisID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DSCDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDscDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PORDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPorDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CNTDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UNDDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUndDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DUNDISQU_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDUnDisQU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CNTDISQ2_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQ2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CNTDIF_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDif_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1JF1697( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951697( ) ;
      edtavnRcdDeleted_1697_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1697_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLinDisID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LINDISID_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDscDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSCDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPorDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PORDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCntDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CNTDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtValDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUndDisQu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNDDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDUnDisQU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DUNDISQU_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCntDisQ2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CNTDISQ2_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCntDif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CNTDIF_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1697_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1697_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1697");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1697_Internalname ;
         wbErr = true ;
         nRcdDeleted_1697 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1697 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1697_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLinDisID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLinDisID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LINDISID_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLinDisID_Internalname ;
         wbErr = true ;
         A12226LinDisID = (short)(0) ;
      }
      else
      {
         A12226LinDisID = (short)(localUtil.ctol( httpContext.cgiGet( edtLinDisID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12218PrdDisQu = httpContext.cgiGet( edtPrdDisQu_Internalname) ;
      n12218PrdDisQu = false ;
      A12219DscDisQu = httpContext.cgiGet( edtDscDisQu_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPorDisQu_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPorDisQu_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PORDISQU_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPorDisQu_Internalname ;
         wbErr = true ;
         A12220PorDisQu = DecimalUtil.ZERO ;
         n12220PorDisQu = false ;
      }
      else
      {
         A12220PorDisQu = localUtil.ctond( httpContext.cgiGet( edtPorDisQu_Internalname)) ;
         n12220PorDisQu = false ;
      }
      A12221CntDisQu = localUtil.ctond( httpContext.cgiGet( edtCntDisQu_Internalname)) ;
      n12221CntDisQu = false ;
      A12230ValDisQu = localUtil.ctond( httpContext.cgiGet( edtValDisQu_Internalname)) ;
      n12230ValDisQu = false ;
      A12222UndDisQu = (byte)(localUtil.ctol( httpContext.cgiGet( edtUndDisQu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n12222UndDisQu = false ;
      A12223DUnDisQU = httpContext.cgiGet( edtDUnDisQU_Internalname) ;
      n12223DUnDisQU = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCntDisQ2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCntDisQ2_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "CNTDISQ2_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCntDisQ2_Internalname ;
         wbErr = true ;
         A12224CntDisQ2 = DecimalUtil.ZERO ;
         n12224CntDisQ2 = false ;
      }
      else
      {
         A12224CntDisQ2 = localUtil.ctond( httpContext.cgiGet( edtCntDisQ2_Internalname)) ;
         n12224CntDisQ2 = false ;
      }
      A12228CntDif = localUtil.ctond( httpContext.cgiGet( edtCntDif_Internalname)) ;
      GXCCtl = "Z12226LinDisID_" + sGXsfl_95_idx ;
      Z12226LinDisID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12224CntDisQ2_" + sGXsfl_95_idx ;
      Z12224CntDisQ2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12230ValDisQu_" + sGXsfl_95_idx ;
      Z12230ValDisQu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12220PorDisQu_" + sGXsfl_95_idx ;
      Z12220PorDisQu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12221CntDisQu_" + sGXsfl_95_idx ;
      Z12221CntDisQu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12218PrdDisQu_" + sGXsfl_95_idx ;
      Z12218PrdDisQu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12222UndDisQu_" + sGXsfl_95_idx ;
      Z12222UndDisQu = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O12224CntDisQ2_" + sGXsfl_95_idx ;
      O12224CntDisQ2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O12230ValDisQu_" + sGXsfl_95_idx ;
      O12230ValDisQu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O12221CntDisQu_" + sGXsfl_95_idx ;
      O12221CntDisQu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O12220PorDisQu_" + sGXsfl_95_idx ;
      O12220PorDisQu = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1697_" + sGXsfl_95_idx ;
      nRcdDeleted_1697 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1697_" + sGXsfl_95_idx ;
      nRcdExists_1697 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1697_" + sGXsfl_95_idx ;
      nIsMod_1697 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtUndDisQu_Enabled = edtUndDisQu_Enabled ;
      defedtValDisQu_Enabled = edtValDisQu_Enabled ;
      defedtCntDisQu_Enabled = edtCntDisQu_Enabled ;
      defedtLinDisID_Enabled = edtLinDisID_Enabled ;
   }

   public void confirmValues1JF0( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951697( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951697( ) ;
         httpContext.changePostValue( "Z12226LinDisID_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12226LinDisID_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12226LinDisID_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12224CntDisQ2_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12224CntDisQ2_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12224CntDisQ2_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12230ValDisQu_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12230ValDisQu_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12230ValDisQu_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12220PorDisQu_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12220PorDisQu_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12220PorDisQu_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12221CntDisQu_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12221CntDisQu_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12221CntDisQu_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12218PrdDisQu_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12218PrdDisQu_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12218PrdDisQu_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12222UndDisQu_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12222UndDisQu_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12222UndDisQu_"+sGXsfl_95_idx) ;
      }
      httpContext.changePostValue( "O12224CntDisQ2", httpContext.cgiGet( "T12224CntDisQ2")) ;
      httpContext.deletePostValue( "T12224CntDisQ2") ;
      httpContext.changePostValue( "O12230ValDisQu", httpContext.cgiGet( "T12230ValDisQu")) ;
      httpContext.deletePostValue( "T12230ValDisQu") ;
      httpContext.changePostValue( "O12221CntDisQu", httpContext.cgiGet( "T12221CntDisQu")) ;
      httpContext.deletePostValue( "T12221CntDisQu") ;
      httpContext.changePostValue( "O12220PorDisQu", httpContext.cgiGet( "T12220PorDisQu")) ;
      httpContext.deletePostValue( "T12220PorDisQu") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdispqr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A12225DocDisID,10,0))}, new String[] {"EmprCod","DocDisID"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDisPqR");
      forbiddenHiddens.add("StaDisQ", localUtil.format( DecimalUtil.doubleToDec(A12209StaDisQ), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdispqr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12225DocDisID", GXutil.ltrim( localUtil.ntoc( Z12225DocDisID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12208FecDisQ", localUtil.dtoc( Z12208FecDisQ, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12209StaDisQ", GXutil.ltrim( localUtil.ntoc( Z12209StaDisQ, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12212CntDisQ", GXutil.ltrim( localUtil.ntoc( Z12212CntDisQ, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12215UltLinDisQ", GXutil.ltrim( localUtil.ntoc( Z12215UltLinDisQ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12210PrdDisQ", GXutil.rtrim( Z12210PrdDisQ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12213UndDisQ", GXutil.ltrim( localUtil.ntoc( Z12213UndDisQ, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12215UltLinDisQ", GXutil.ltrim( localUtil.ntoc( O12215UltLinDisQ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12227TotCntR", GXutil.ltrim( localUtil.ntoc( O12227TotCntR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12231ValDisQ", GXutil.ltrim( localUtil.ntoc( O12231ValDisQ, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12217TotCnt", GXutil.ltrim( localUtil.ntoc( O12217TotCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12216TotPor", GXutil.ltrim( localUtil.ntoc( O12216TotPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV34flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOD", GXutil.ltrim( localUtil.ntoc( AV35ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV37msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV36PrdPreact, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdispqr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A12225DocDisID,10,0))}, new String[] {"EmprCod","DocDisID"})  ;
   }

   public String getPgmname( )
   {
      return "TDisPqR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Disolucion Quimicos REPROCESO", "") ;
   }

   public void initializeNonKey1JF1696( )
   {
      A12213UndDisQ = (byte)(0) ;
      n12213UndDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
      A12210PrdDisQ = "" ;
      n12210PrdDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
      A12211DscDisQ = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", A12211DscDisQ);
      A12212CntDisQ = DecimalUtil.ZERO ;
      n12212CntDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
      A12214DUnDisQ = "" ;
      n12214DUnDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", A12214DUnDisQ);
      A12215UltLinDisQ = (short)(0) ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      A12208FecDisQ = GXutil.today( ) ;
      n12208FecDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
      A12209StaDisQ = (byte)(0) ;
      n12209StaDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
      O12215UltLinDisQ = A12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      O12227TotCntR = A12227TotCntR ;
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
      O12231ValDisQ = A12231ValDisQ ;
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      O12217TotCnt = A12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
      O12216TotPor = A12216TotPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
      Z12208FecDisQ = GXutil.nullDate() ;
      Z12209StaDisQ = (byte)(0) ;
      Z12212CntDisQ = DecimalUtil.ZERO ;
      Z12215UltLinDisQ = (short)(0) ;
      Z12210PrdDisQ = "" ;
      Z12213UndDisQ = (byte)(0) ;
   }

   public void initAll1JF1696( )
   {
      initializeNonKey1JF1696( ) ;
   }

   public void standaloneModalInsert( )
   {
      A12208FecDisQ = i12208FecDisQ ;
      n12208FecDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
      A12209StaDisQ = i12209StaDisQ ;
      n12209StaDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
   }

   public void initializeNonKey1JF1697( )
   {
      A12222UndDisQu = (byte)(0) ;
      n12222UndDisQu = false ;
      A12230ValDisQu = DecimalUtil.ZERO ;
      n12230ValDisQu = false ;
      AV34flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34flag", GXutil.str( AV34flag, 1, 0));
      AV35ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35ValCod", GXutil.str( AV35ValCod, 1, 0));
      AV37msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37msg_err", AV37msg_err);
      AV36PrdPreact = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36PrdPreact", GXutil.ltrimstr( AV36PrdPreact, 14, 5));
      A12228CntDif = DecimalUtil.ZERO ;
      A12218PrdDisQu = "" ;
      n12218PrdDisQu = false ;
      A12219DscDisQu = "" ;
      A12220PorDisQu = DecimalUtil.ZERO ;
      n12220PorDisQu = false ;
      A12221CntDisQu = DecimalUtil.ZERO ;
      n12221CntDisQu = false ;
      A12223DUnDisQU = "" ;
      n12223DUnDisQU = false ;
      A12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
      n12224CntDisQ2 = false ;
      O12224CntDisQ2 = A12224CntDisQ2 ;
      n12224CntDisQ2 = false ;
      O12230ValDisQu = A12230ValDisQu ;
      n12230ValDisQu = false ;
      O12221CntDisQu = A12221CntDisQu ;
      n12221CntDisQu = false ;
      O12220PorDisQu = A12220PorDisQu ;
      n12220PorDisQu = false ;
      Z12224CntDisQ2 = DecimalUtil.ZERO ;
      Z12230ValDisQu = DecimalUtil.ZERO ;
      Z12220PorDisQu = DecimalUtil.ZERO ;
      Z12221CntDisQu = DecimalUtil.ZERO ;
      Z12218PrdDisQu = "" ;
      Z12222UndDisQu = (byte)(0) ;
   }

   public void initAll1JF1697( )
   {
      A12226LinDisID = (short)(0) ;
      initializeNonKey1JF1697( ) ;
   }

   public void standaloneModalInsert1JF1697( )
   {
      A12215UltLinDisQ = i12215UltLinDisQ ;
      n12215UltLinDisQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12215UltLinDisQ), 4, 0));
      A12224CntDisQ2 = i12224CntDisQ2 ;
      n12224CntDisQ2 = false ;
      A12217TotCnt = i12217TotCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241583822", true, true);
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
      httpContext.AddJavascriptSource("tdispqr.js", "?20268241583822", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1697( )
   {
      edtUndDisQu_Enabled = defedtUndDisQu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtUndDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUndDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtValDisQu_Enabled = defedtValDisQu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCntDisQu_Enabled = defedtCntDisQu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntDisQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCntDisQu_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtLinDisID_Enabled = defedtLinDisID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLinDisID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinDisID_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void startgridcontrol95( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1697, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1697_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12226LinDisID, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLinDisID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12218PrdDisQu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12219DscDisQu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDscDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12220PorDisQu, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPorDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12221CntDisQu, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12230ValDisQu, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtValDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12222UndDisQu, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUndDisQu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12223DUnDisQU));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDUnDisQU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12224CntDisQ2, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDisQ2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12228CntDif, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCntDif_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDocDisID_Internalname = "DOCDISID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFecDisQ_Internalname = "FECDISQ" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      cmbStaDisQ.setInternalname( "STADISQ" );
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPrdDisQ_Internalname = "PRDDISQ" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDscDisQ_Internalname = "DSCDISQ" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCntDisQ_Internalname = "CNTDISQ" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtUndDisQ_Internalname = "UNDDISQ" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDUnDisQ_Internalname = "DUNDISQ" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtUltLinDisQ_Internalname = "ULTLINDISQ" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTotPor_Internalname = "TOTPOR" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTotCnt_Internalname = "TOTCNT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTotCntR_Internalname = "TOTCNTR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtValDisQ_Internalname = "VALDISQ" ;
      edtavnRcdDeleted_1697_Internalname = "vNRCDDELETED_1697" ;
      edtLinDisID_Internalname = "LINDISID" ;
      edtPrdDisQu_Internalname = "PRDDISQU" ;
      edtDscDisQu_Internalname = "DSCDISQU" ;
      edtPorDisQu_Internalname = "PORDISQU" ;
      edtCntDisQu_Internalname = "CNTDISQU" ;
      edtValDisQu_Internalname = "VALDISQU" ;
      edtUndDisQu_Internalname = "UNDDISQU" ;
      edtDUnDisQU_Internalname = "DUNDISQU" ;
      edtCntDisQ2_Internalname = "CNTDISQ2" ;
      edtCntDif_Internalname = "CNTDIF" ;
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
      Form.setCaption( httpContext.getMessage( "Disolucion Quimicos REPROCESO", "") );
      edtCntDif_Jsonclick = "" ;
      edtCntDisQ2_Jsonclick = "" ;
      edtDUnDisQU_Jsonclick = "" ;
      edtUndDisQu_Jsonclick = "" ;
      edtValDisQu_Jsonclick = "" ;
      edtCntDisQu_Jsonclick = "" ;
      edtPorDisQu_Jsonclick = "" ;
      edtDscDisQu_Jsonclick = "" ;
      edtPrdDisQu_Jsonclick = "" ;
      edtLinDisID_Jsonclick = "" ;
      edtavnRcdDeleted_1697_Jsonclick = "" ;
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
      edtCntDif_Enabled = 0 ;
      edtCntDisQ2_Enabled = 1 ;
      edtDUnDisQU_Enabled = 0 ;
      edtUndDisQu_Enabled = 0 ;
      edtValDisQu_Enabled = 0 ;
      edtCntDisQu_Enabled = 0 ;
      edtPorDisQu_Enabled = 1 ;
      edtDscDisQu_Enabled = 0 ;
      edtPrdDisQu_Enabled = 1 ;
      edtLinDisID_Enabled = 1 ;
      edtavnRcdDeleted_1697_Enabled = 1 ;
      edtValDisQ_Jsonclick = "" ;
      edtValDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtValDisQ_Enabled = 0 ;
      edtTotCntR_Jsonclick = "" ;
      edtTotCntR_Backcolor = (int)(0xFFFFFF) ;
      edtTotCntR_Enabled = 0 ;
      edtTotCnt_Jsonclick = "" ;
      edtTotCnt_Backcolor = (int)(0xFFFFFF) ;
      edtTotCnt_Enabled = 0 ;
      edtTotPor_Jsonclick = "" ;
      edtTotPor_Backcolor = (int)(0xFFFFFF) ;
      edtTotPor_Enabled = 0 ;
      edtUltLinDisQ_Jsonclick = "" ;
      edtUltLinDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtUltLinDisQ_Enabled = 0 ;
      edtDUnDisQ_Jsonclick = "" ;
      edtDUnDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtDUnDisQ_Enabled = 0 ;
      edtUndDisQ_Jsonclick = "" ;
      edtUndDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtUndDisQ_Enabled = 0 ;
      edtCntDisQ_Jsonclick = "" ;
      edtCntDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtCntDisQ_Enabled = 1 ;
      edtDscDisQ_Jsonclick = "" ;
      edtDscDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtDscDisQ_Enabled = 0 ;
      edtPrdDisQ_Jsonclick = "" ;
      edtPrdDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtPrdDisQ_Enabled = 1 ;
      cmbStaDisQ.setJsonclick( "" );
      cmbStaDisQ.setEnabled( 0 );
      cmbStaDisQ.setIBackground( (int)(0xFFFFFF) );
      edtFecDisQ_Jsonclick = "" ;
      edtFecDisQ_Backcolor = (int)(0xFFFFFF) ;
      edtFecDisQ_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDocDisID_Jsonclick = "" ;
      edtDocDisID_Backcolor = (int)(0xFFFFFF) ;
      edtDocDisID_Enabled = 0 ;
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

   public void gx4asaunddisq1JF1696( String A396EmprCod ,
                                     String A12210PrdDisQ )
   {
      if ( true /* Level */ && ! (GXutil.strcmp("", A12210PrdDisQ)==0) )
      {
         GXt_int5 = A12213UndDisQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12210PrdDisQ ;
         GXv_int14[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int14) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12210PrdDisQ = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", A12210PrdDisQ);
         A12213UndDisQ = GXt_int5 ;
         n12213UndDisQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.str( A12213UndDisQ, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12213UndDisQ, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx19asaunddisqu1JF1697( String A396EmprCod ,
                                       String A12218PrdDisQu )
   {
      if ( true /* Level */ && ! (GXutil.strcmp("", A12218PrdDisQu)==0) )
      {
         GXt_int5 = A12222UndDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_int14[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int14) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12222UndDisQu = GXt_int5 ;
         n12222UndDisQu = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12222UndDisQu, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx20asavaldisqu1JF1697( String A396EmprCod ,
                                       String A12218PrdDisQu ,
                                       java.math.BigDecimal A12212CntDisQ ,
                                       java.math.BigDecimal A12224CntDisQ2 ,
                                       java.math.BigDecimal A12221CntDisQu ,
                                       java.math.BigDecimal A12227TotCntR )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXt_decimal8 = A12230ValDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12212CntDisQ ;
         GXv_decimal12[0] = A12224CntDisQ2 ;
         GXv_decimal11[0] = A12221CntDisQu ;
         GXv_decimal10[0] = A12227TotCntR ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pdispq11(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal9) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.A12212CntDisQ = GXv_decimal13[0] ;
         tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal12[0] ;
         tdispqr_impl.this.A12221CntDisQu = GXv_decimal11[0] ;
         tdispqr_impl.this.A12227TotCntR = GXv_decimal10[0] ;
         tdispqr_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrimstr( A12212CntDisQ, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12230ValDisQu = GXt_decimal8 ;
         n12230ValDisQu = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12230ValDisQu, (byte)(11), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_1JF1697( String A396EmprCod ,
                              String A12218PrdDisQu )
   {
      if ( true /* After */ )
      {
         GXv_int14[0] = AV34flag ;
         GXv_int6[0] = AV35ValCod ;
         new app.pbusval(remoteHandle, context).execute( A396EmprCod, A12218PrdDisQu, GXv_int14, GXv_int6) ;
         AV34flag = GXv_int14[0] ;
         AV35ValCod = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34flag", GXutil.str( AV34flag, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35ValCod", GXutil.str( AV35ValCod, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34flag, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_27_1JF1697( String A396EmprCod ,
                              String A12218PrdDisQu ,
                              java.math.BigDecimal A12224CntDisQ2 ,
                              java.math.BigDecimal A12221CntDisQu ,
                              java.math.BigDecimal AV36PrdPreact ,
                              String AV37msg_err )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12224CntDisQ2 ;
         GXv_decimal12[0] = A12221CntDisQu ;
         GXv_decimal11[0] = AV36PrdPreact ;
         GXv_char2[0] = AV37msg_err ;
         new app.pdispq36(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A12218PrdDisQu = GXv_char3[0] ;
         A12224CntDisQ2 = GXv_decimal13[0] ;
         A12221CntDisQu = GXv_decimal12[0] ;
         AV36PrdPreact = GXv_decimal11[0] ;
         AV37msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV36PrdPreact", GXutil.ltrimstr( AV36PrdPreact, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV37msg_err", AV37msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12218PrdDisQu))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12224CntDisQ2, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12221CntDisQu, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV36PrdPreact, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV37msg_err))+"\"") ;
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
      subsflControlProps_951697( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1JF1697( ) ;
         standaloneModal1JF1697( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1JF1697( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951697( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbStaDisQ.setName( "STADISQ" );
      cmbStaDisQ.setWebtags( "" );
      cmbStaDisQ.addItem("0", httpContext.getMessage( "Pendiente Control Disolucion", ""), (short)(0));
      cmbStaDisQ.addItem("1", httpContext.getMessage( "Disolucion Realizada", ""), (short)(0));
      cmbStaDisQ.addItem("2", httpContext.getMessage( "Control Calidad OK", ""), (short)(0));
      cmbStaDisQ.addItem("3", httpContext.getMessage( "Control Calidad No Ok", ""), (short)(0));
      cmbStaDisQ.addItem("4", httpContext.getMessage( "Reproceso Disolucion Realizada", ""), (short)(0));
      cmbStaDisQ.addItem("5", httpContext.getMessage( "Reproceso Control Calidad Ok", ""), (short)(0));
      cmbStaDisQ.addItem("6", httpContext.getMessage( "Cierre Documento", ""), (short)(0));
      if ( cmbStaDisQ.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A12209StaDisQ) )
         {
            A12209StaDisQ = (byte)(0) ;
            n12209StaDisQ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.str( A12209StaDisQ, 1, 0));
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01JF37 */
      pr_default.execute(33, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JF37_A407EmprNom[0] ;
      n407EmprNom = T01JF37_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(33);
      /* Using cursor T01JF39 */
      pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A12225DocDisID)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         A12216TotPor = T01JF39_A12216TotPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         A12217TotCnt = T01JF39_A12217TotCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12227TotCntR = T01JF39_A12227TotCntR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = T01JF39_A12231ValDisQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      }
      else
      {
         A12216TotPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrimstr( A12216TotPor, 6, 2));
         A12217TotCnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrimstr( A12217TotCnt, 9, 2));
         A12227TotCntR = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrimstr( A12227TotCntR, 9, 2));
         A12231ValDisQ = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrimstr( A12231ValDisQ, 11, 5));
      }
      pr_default.close(34);
      GX_FocusControl = edtFecDisQ_Internalname ;
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

   public void valid_Docdisid( )
   {
      n12221CntDisQu = false ;
      n12215UltLinDisQ = false ;
      n12208FecDisQ = false ;
      n12209StaDisQ = false ;
      A12209StaDisQ = (byte)(GXutil.lval( cmbStaDisQ.getValue())) ;
      n12209StaDisQ = false ;
      cmbStaDisQ.setValue( GXutil.str( A12209StaDisQ, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbStaDisQ.getItemCount() > 0 )
      {
         A12209StaDisQ = (byte)(GXutil.lval( cmbStaDisQ.getValidValue(GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0))))) ;
         n12209StaDisQ = false ;
         cmbStaDisQ.setValue( GXutil.str( A12209StaDisQ, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbStaDisQ.setValue( GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12208FecDisQ", localUtil.format(A12208FecDisQ, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12209StaDisQ", GXutil.ltrim( localUtil.ntoc( A12209StaDisQ, (byte)(1), (byte)(0), ".", "")));
      cmbStaDisQ.setValue( GXutil.trim( GXutil.str( A12209StaDisQ, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbStaDisQ.getInternalname(), "Values", cmbStaDisQ.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A12210PrdDisQ", GXutil.rtrim( A12210PrdDisQ));
      httpContext.ajax_rsp_assign_attri("", false, "A12212CntDisQ", GXutil.ltrim( localUtil.ntoc( A12212CntDisQ, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12215UltLinDisQ", GXutil.ltrim( localUtil.ntoc( A12215UltLinDisQ, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12216TotPor", GXutil.ltrim( localUtil.ntoc( A12216TotPor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12217TotCnt", GXutil.ltrim( localUtil.ntoc( A12217TotCnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12227TotCntR", GXutil.ltrim( localUtil.ntoc( A12227TotCntR, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12231ValDisQ", GXutil.ltrim( localUtil.ntoc( A12231ValDisQ, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", GXutil.rtrim( A12211DscDisQ));
      httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.ltrim( localUtil.ntoc( A12213UndDisQ, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", GXutil.rtrim( A12214DUnDisQ));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12225DocDisID", GXutil.ltrim( localUtil.ntoc( Z12225DocDisID, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12208FecDisQ", localUtil.format(Z12208FecDisQ, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12209StaDisQ", GXutil.ltrim( localUtil.ntoc( Z12209StaDisQ, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12210PrdDisQ", GXutil.rtrim( Z12210PrdDisQ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12212CntDisQ", GXutil.ltrim( localUtil.ntoc( Z12212CntDisQ, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12215UltLinDisQ", GXutil.ltrim( localUtil.ntoc( Z12215UltLinDisQ, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12216TotPor", GXutil.ltrim( localUtil.ntoc( Z12216TotPor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12217TotCnt", GXutil.ltrim( localUtil.ntoc( Z12217TotCnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12227TotCntR", GXutil.ltrim( localUtil.ntoc( Z12227TotCntR, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12231ValDisQ", GXutil.ltrim( localUtil.ntoc( Z12231ValDisQ, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12211DscDisQ", GXutil.rtrim( Z12211DscDisQ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12213UndDisQ", GXutil.ltrim( localUtil.ntoc( Z12213UndDisQ, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12214DUnDisQ", GXutil.rtrim( Z12214DUnDisQ));
      httpContext.ajax_rsp_assign_attri("", false, "O12215UltLinDisQ", GXutil.ltrim( localUtil.ntoc( O12215UltLinDisQ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O12227TotCntR", GXutil.ltrim( localUtil.ntoc( O12227TotCntR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O12231ValDisQ", GXutil.ltrim( localUtil.ntoc( O12231ValDisQ, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O12217TotCnt", GXutil.ltrim( localUtil.ntoc( O12217TotCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O12216TotPor", GXutil.ltrim( localUtil.ntoc( O12216TotPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prddisq( )
   {
      n12210PrdDisQ = false ;
      n12213UndDisQ = false ;
      n12214DUnDisQ = false ;
      /* Using cursor T01JF23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n12210PrdDisQ), A12210PrdDisQ});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDDISQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQ_Internalname ;
      }
      A12211DscDisQ = T01JF23_A12211DscDisQ[0] ;
      pr_default.close(19);
      if ( true /* Level */ && ! (GXutil.strcmp("", A12210PrdDisQ)==0) )
      {
         GXt_int5 = A12213UndDisQ ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12210PrdDisQ ;
         GXv_int14[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int14) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12210PrdDisQ = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int14[0] ;
         A12213UndDisQ = GXt_int5 ;
         n12213UndDisQ = false ;
      }
      /* Using cursor T01JF24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n12213UndDisQ), Byte.valueOf(A12213UndDisQ)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Unidad Disolucion 1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNDDISQ");
         AnyError = (short)(1) ;
      }
      A12214DUnDisQ = T01JF24_A12214DUnDisQ[0] ;
      n12214DUnDisQ = T01JF24_n12214DUnDisQ[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12211DscDisQ", GXutil.rtrim( A12211DscDisQ));
      httpContext.ajax_rsp_assign_attri("", false, "A12213UndDisQ", GXutil.ltrim( localUtil.ntoc( A12213UndDisQ, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12214DUnDisQ", GXutil.rtrim( A12214DUnDisQ));
   }

   public void valid_Prddisqu( )
   {
      n12218PrdDisQu = false ;
      n12222UndDisQu = false ;
      n12223DUnDisQU = false ;
      /* Using cursor T01JF34 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n12218PrdDisQu), A12218PrdDisQu});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDDISQU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
      }
      A12219DscDisQu = T01JF34_A12219DscDisQu[0] ;
      pr_default.close(30);
      if ( true /* Level */ && ! (GXutil.strcmp("", A12218PrdDisQu)==0) )
      {
         GXt_int5 = A12222UndDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_int14[0] = GXt_int5 ;
         new app.pdispq0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int14) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         tdispqr_impl.this.GXt_int5 = GXv_int14[0] ;
         A12222UndDisQu = GXt_int5 ;
         n12222UndDisQu = false ;
      }
      /* Using cursor T01JF35 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n12222UndDisQu), Byte.valueOf(A12222UndDisQu)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Unidad Disolucion 2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNDDISQU");
         AnyError = (short)(1) ;
      }
      A12223DUnDisQU = T01JF35_A12223DUnDisQU[0] ;
      n12223DUnDisQU = T01JF35_n12223DUnDisQU[0] ;
      pr_default.close(31);
      if ( true /* After */ )
      {
         GXv_int14[0] = AV34flag ;
         GXv_int6[0] = AV35ValCod ;
         new app.pbusval(remoteHandle, context).execute( A396EmprCod, A12218PrdDisQu, GXv_int14, GXv_int6) ;
         tdispqr_impl.this.AV34flag = GXv_int14[0] ;
         AV34flag = this.AV34flag ;
         tdispqr_impl.this.AV35ValCod = GXv_int6[0] ;
         AV35ValCod = this.AV35ValCod ;
      }
      if ( ( AV35ValCod == 3 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto SUPRIMIDO", ""), 1, "PRDDISQU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
      }
      if ( ( AV34flag == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto INexistente", ""), 1, "PRDDISQU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDisQu_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12219DscDisQu", GXutil.rtrim( A12219DscDisQu));
      httpContext.ajax_rsp_assign_attri("", false, "A12222UndDisQu", GXutil.ltrim( localUtil.ntoc( A12222UndDisQu, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12223DUnDisQU", GXutil.rtrim( A12223DUnDisQU));
      httpContext.ajax_rsp_assign_attri("", false, "AV34flag", GXutil.ltrim( localUtil.ntoc( AV34flag, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV35ValCod", GXutil.ltrim( localUtil.ntoc( AV35ValCod, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Cntdisq2( )
   {
      n12212CntDisQ = false ;
      n12218PrdDisQu = false ;
      n12224CntDisQ2 = false ;
      n12221CntDisQu = false ;
      n12230ValDisQu = false ;
      if ( A12224CntDisQ2.doubleValue() > 0 )
      {
         A12228CntDif = A12224CntDisQ2.subtract(A12221CntDisQu) ;
      }
      else
      {
         A12228CntDif = DecimalUtil.doubleToDec(0) ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXt_decimal8 = A12230ValDisQu ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12212CntDisQ ;
         GXv_decimal12[0] = A12224CntDisQ2 ;
         GXv_decimal11[0] = A12221CntDisQu ;
         GXv_decimal10[0] = A12227TotCntR ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pdispq11(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal9) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         A12218PrdDisQu = this.A12218PrdDisQu ;
         tdispqr_impl.this.A12212CntDisQ = GXv_decimal13[0] ;
         tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal12[0] ;
         A12224CntDisQ2 = this.A12224CntDisQ2 ;
         tdispqr_impl.this.A12221CntDisQu = GXv_decimal11[0] ;
         A12221CntDisQu = this.A12221CntDisQu ;
         tdispqr_impl.this.A12227TotCntR = GXv_decimal10[0] ;
         tdispqr_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         A12230ValDisQu = GXt_decimal8 ;
         n12230ValDisQu = false ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12218PrdDisQu ;
         GXv_decimal13[0] = A12224CntDisQ2 ;
         GXv_decimal12[0] = A12221CntDisQu ;
         GXv_decimal11[0] = AV36PrdPreact ;
         GXv_char2[0] = AV37msg_err ;
         new app.pdispq36(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_char2) ;
         tdispqr_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdispqr_impl.this.A12218PrdDisQu = GXv_char3[0] ;
         A12218PrdDisQu = this.A12218PrdDisQu ;
         tdispqr_impl.this.A12224CntDisQ2 = GXv_decimal13[0] ;
         A12224CntDisQ2 = this.A12224CntDisQ2 ;
         tdispqr_impl.this.A12221CntDisQu = GXv_decimal12[0] ;
         A12221CntDisQu = this.A12221CntDisQu ;
         tdispqr_impl.this.AV36PrdPreact = GXv_decimal11[0] ;
         AV36PrdPreact = this.AV36PrdPreact ;
         tdispqr_impl.this.AV37msg_err = GXv_char2[0] ;
         AV37msg_err = this.AV37msg_err ;
      }
      if ( ! (GXutil.strcmp("", AV37msg_err)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV37msg_err, 1, "CNTDISQ2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCntDisQ2_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12228CntDif", GXutil.ltrim( localUtil.ntoc( A12228CntDif, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12230ValDisQu", GXutil.ltrim( localUtil.ntoc( A12230ValDisQu, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A12218PrdDisQu", GXutil.rtrim( A12218PrdDisQu));
      httpContext.ajax_rsp_assign_attri("", false, "A12224CntDisQ2", GXutil.ltrim( localUtil.ntoc( A12224CntDisQ2, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12221CntDisQu", GXutil.ltrim( localUtil.ntoc( A12221CntDisQu, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36PrdPreact", GXutil.ltrim( localUtil.ntoc( AV36PrdPreact, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37msg_err", GXutil.rtrim( AV37msg_err));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12225DocDisID',fld:'DOCDISID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbStaDisQ'},{av:'A12209StaDisQ',fld:'STADISQ',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'VER INFORME'","{handler:'e121JF2',iparms:[{av:'A12225DocDisID',fld:'DOCDISID',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'VER INFORME'",",oparms:[{av:'A12225DocDisID',fld:'DOCDISID',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DOCDISID","{handler:'valid_Docdisid',iparms:[{av:'A12221CntDisQu',fld:'CNTDISQU',pic:'ZZZZZ9.99'},{av:'A12215UltLinDisQ',fld:'ULTLINDISQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12225DocDisID',fld:'DOCDISID',pic:'ZZZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A12208FecDisQ',fld:'FECDISQ',pic:''},{av:'cmbStaDisQ'},{av:'A12209StaDisQ',fld:'STADISQ',pic:'9'}]");
      setEventMetadata("VALID_DOCDISID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12208FecDisQ',fld:'FECDISQ',pic:''},{av:'cmbStaDisQ'},{av:'A12209StaDisQ',fld:'STADISQ',pic:'9'},{av:'A12210PrdDisQ',fld:'PRDDISQ',pic:''},{av:'A12212CntDisQ',fld:'CNTDISQ',pic:'ZZZZZ9.99'},{av:'A12215UltLinDisQ',fld:'ULTLINDISQ',pic:'ZZZ9'},{av:'A12216TotPor',fld:'TOTPOR',pic:'ZZ9.99'},{av:'A12217TotCnt',fld:'TOTCNT',pic:'ZZZZZ9.99'},{av:'A12227TotCntR',fld:'TOTCNTR',pic:'ZZZZZ9.99'},{av:'A12231ValDisQ',fld:'VALDISQ',pic:'ZZZZ9.99999'},{av:'A12211DscDisQ',fld:'DSCDISQ',pic:''},{av:'A12213UndDisQ',fld:'UNDDISQ',pic:'9'},{av:'A12214DUnDisQ',fld:'DUNDISQ',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12225DocDisID'},{av:'Z407EmprNom'},{av:'Z12208FecDisQ'},{av:'Z12209StaDisQ'},{av:'Z12210PrdDisQ'},{av:'Z12212CntDisQ'},{av:'Z12215UltLinDisQ'},{av:'Z12216TotPor'},{av:'Z12217TotCnt'},{av:'Z12227TotCntR'},{av:'Z12231ValDisQ'},{av:'Z12211DscDisQ'},{av:'Z12213UndDisQ'},{av:'Z12214DUnDisQ'},{av:'O12215UltLinDisQ'},{av:'O12227TotCntR'},{av:'O12231ValDisQ'},{av:'O12217TotCnt'},{av:'O12216TotPor'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_STADISQ","{handler:'valid_Stadisq',iparms:[]");
      setEventMetadata("VALID_STADISQ",",oparms:[]}");
      setEventMetadata("VALID_PRDDISQ","{handler:'valid_Prddisq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12210PrdDisQ',fld:'PRDDISQ',pic:''},{av:'A12213UndDisQ',fld:'UNDDISQ',pic:'9'},{av:'A12211DscDisQ',fld:'DSCDISQ',pic:''},{av:'A12214DUnDisQ',fld:'DUNDISQ',pic:''}]");
      setEventMetadata("VALID_PRDDISQ",",oparms:[{av:'A12211DscDisQ',fld:'DSCDISQ',pic:''},{av:'A12213UndDisQ',fld:'UNDDISQ',pic:'9'},{av:'A12214DUnDisQ',fld:'DUNDISQ',pic:''}]}");
      setEventMetadata("VALID_UNDDISQ","{handler:'valid_Unddisq',iparms:[]");
      setEventMetadata("VALID_UNDDISQ",",oparms:[]}");
      setEventMetadata("VALID_ULTLINDISQ","{handler:'valid_Ultlindisq',iparms:[]");
      setEventMetadata("VALID_ULTLINDISQ",",oparms:[]}");
      setEventMetadata("VALID_LINDISID","{handler:'valid_Lindisid',iparms:[]");
      setEventMetadata("VALID_LINDISID",",oparms:[]}");
      setEventMetadata("VALID_PRDDISQU","{handler:'valid_Prddisqu',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12218PrdDisQu',fld:'PRDDISQU',pic:''},{av:'A12222UndDisQu',fld:'UNDDISQU',pic:'9'},{av:'A12219DscDisQu',fld:'DSCDISQU',pic:''},{av:'A12223DUnDisQU',fld:'DUNDISQU',pic:''},{av:'AV34flag',fld:'vFLAG',pic:'9'},{av:'AV35ValCod',fld:'vVALCOD',pic:'9'}]");
      setEventMetadata("VALID_PRDDISQU",",oparms:[{av:'A12219DscDisQu',fld:'DSCDISQU',pic:''},{av:'A12222UndDisQu',fld:'UNDDISQU',pic:'9'},{av:'A12223DUnDisQU',fld:'DUNDISQU',pic:''},{av:'AV34flag',fld:'vFLAG',pic:'9'},{av:'AV35ValCod',fld:'vVALCOD',pic:'9'}]}");
      setEventMetadata("VALID_PORDISQU","{handler:'valid_Pordisqu',iparms:[]");
      setEventMetadata("VALID_PORDISQU",",oparms:[]}");
      setEventMetadata("VALID_CNTDISQU","{handler:'valid_Cntdisqu',iparms:[]");
      setEventMetadata("VALID_CNTDISQU",",oparms:[]}");
      setEventMetadata("VALID_VALDISQU","{handler:'valid_Valdisqu',iparms:[]");
      setEventMetadata("VALID_VALDISQU",",oparms:[]}");
      setEventMetadata("VALID_UNDDISQU","{handler:'valid_Unddisqu',iparms:[]");
      setEventMetadata("VALID_UNDDISQU",",oparms:[]}");
      setEventMetadata("VALID_CNTDISQ2","{handler:'valid_Cntdisq2',iparms:[{av:'A12227TotCntR',fld:'TOTCNTR',pic:'ZZZZZ9.99'},{av:'A12212CntDisQ',fld:'CNTDISQ',pic:'ZZZZZ9.99'},{av:'A12218PrdDisQu',fld:'PRDDISQU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O12230ValDisQu'},{av:'O12231ValDisQ'},{av:'O12224CntDisQ2'},{av:'O12227TotCntR'},{av:'A12224CntDisQ2',fld:'CNTDISQ2',pic:'ZZZZZ9.99'},{av:'A12221CntDisQu',fld:'CNTDISQU',pic:'ZZZZZ9.99'},{av:'A12230ValDisQu',fld:'VALDISQU',pic:'ZZZZ9.99999'},{av:'A12228CntDif',fld:'CNTDIF',pic:'ZZZZZ9.99'},{av:'AV37msg_err',fld:'vMSG_ERR',pic:''},{av:'AV36PrdPreact',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_CNTDISQ2",",oparms:[{av:'A12228CntDif',fld:'CNTDIF',pic:'ZZZZZ9.99'},{av:'A12230ValDisQu',fld:'VALDISQU',pic:'ZZZZ9.99999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12218PrdDisQu',fld:'PRDDISQU',pic:''},{av:'A12224CntDisQ2',fld:'CNTDISQ2',pic:'ZZZZZ9.99'},{av:'A12221CntDisQu',fld:'CNTDISQU',pic:'ZZZZZ9.99'},{av:'AV36PrdPreact',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV37msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cntdif',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(33);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(34);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z12208FecDisQ = GXutil.nullDate() ;
      Z12212CntDisQ = DecimalUtil.ZERO ;
      Z12210PrdDisQ = "" ;
      O12227TotCntR = DecimalUtil.ZERO ;
      O12231ValDisQ = DecimalUtil.ZERO ;
      O12217TotCnt = DecimalUtil.ZERO ;
      O12216TotPor = DecimalUtil.ZERO ;
      Z12224CntDisQ2 = DecimalUtil.ZERO ;
      Z12230ValDisQu = DecimalUtil.ZERO ;
      Z12220PorDisQu = DecimalUtil.ZERO ;
      Z12221CntDisQu = DecimalUtil.ZERO ;
      Z12218PrdDisQu = "" ;
      O12224CntDisQ2 = DecimalUtil.ZERO ;
      O12230ValDisQu = DecimalUtil.ZERO ;
      O12221CntDisQu = DecimalUtil.ZERO ;
      O12220PorDisQu = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A12218PrdDisQu = "" ;
      A12224CntDisQ2 = DecimalUtil.ZERO ;
      A12221CntDisQu = DecimalUtil.ZERO ;
      AV36PrdPreact = DecimalUtil.ZERO ;
      AV37msg_err = "" ;
      A12210PrdDisQ = "" ;
      A12212CntDisQ = DecimalUtil.ZERO ;
      A12227TotCntR = DecimalUtil.ZERO ;
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
      A12208FecDisQ = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12211DscDisQ = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12214DUnDisQ = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12216TotPor = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A12217TotCnt = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12231ValDisQ = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B12227TotCntR = DecimalUtil.ZERO ;
      B12231ValDisQ = DecimalUtil.ZERO ;
      B12217TotCnt = DecimalUtil.ZERO ;
      B12216TotPor = DecimalUtil.ZERO ;
      sMode1697 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV40Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1696 = "" ;
      s12227TotCntR = DecimalUtil.ZERO ;
      s12231ValDisQ = DecimalUtil.ZERO ;
      s12217TotCnt = DecimalUtil.ZERO ;
      s12216TotPor = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A12219DscDisQu = "" ;
      A12220PorDisQu = DecimalUtil.ZERO ;
      A12230ValDisQu = DecimalUtil.ZERO ;
      A12223DUnDisQU = "" ;
      A12228CntDif = DecimalUtil.ZERO ;
      T12224CntDisQ2 = DecimalUtil.ZERO ;
      T12230ValDisQu = DecimalUtil.ZERO ;
      T12221CntDisQu = DecimalUtil.ZERO ;
      T12220PorDisQu = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int7 = new long[1] ;
      Z407EmprNom = "" ;
      Z12214DUnDisQ = "" ;
      Z12216TotPor = DecimalUtil.ZERO ;
      Z12217TotCnt = DecimalUtil.ZERO ;
      Z12227TotCntR = DecimalUtil.ZERO ;
      Z12231ValDisQ = DecimalUtil.ZERO ;
      Z12211DscDisQ = "" ;
      T01JF8_A407EmprNom = new String[] {""} ;
      T01JF8_n407EmprNom = new boolean[] {false} ;
      T01JF12_A12216TotPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF12_A12217TotCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF12_A12227TotCntR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF12_A12231ValDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF14_A12225DocDisID = new long[1] ;
      T01JF14_A407EmprNom = new String[] {""} ;
      T01JF14_n407EmprNom = new boolean[] {false} ;
      T01JF14_A12208FecDisQ = new java.util.Date[] {GXutil.nullDate()} ;
      T01JF14_n12208FecDisQ = new boolean[] {false} ;
      T01JF14_A12209StaDisQ = new byte[1] ;
      T01JF14_n12209StaDisQ = new boolean[] {false} ;
      T01JF14_A12211DscDisQ = new String[] {""} ;
      T01JF14_A12212CntDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF14_n12212CntDisQ = new boolean[] {false} ;
      T01JF14_A12214DUnDisQ = new String[] {""} ;
      T01JF14_n12214DUnDisQ = new boolean[] {false} ;
      T01JF14_A12215UltLinDisQ = new short[1] ;
      T01JF14_n12215UltLinDisQ = new boolean[] {false} ;
      T01JF14_A396EmprCod = new String[] {""} ;
      T01JF14_A12210PrdDisQ = new String[] {""} ;
      T01JF14_n12210PrdDisQ = new boolean[] {false} ;
      T01JF14_A12213UndDisQ = new byte[1] ;
      T01JF14_n12213UndDisQ = new boolean[] {false} ;
      T01JF14_A12216TotPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF14_A12217TotCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF14_A12227TotCntR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF14_A12231ValDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF9_A12211DscDisQ = new String[] {""} ;
      T01JF10_A12214DUnDisQ = new String[] {""} ;
      T01JF10_n12214DUnDisQ = new boolean[] {false} ;
      T01JF15_A12211DscDisQ = new String[] {""} ;
      T01JF16_A12214DUnDisQ = new String[] {""} ;
      T01JF16_n12214DUnDisQ = new boolean[] {false} ;
      T01JF17_A396EmprCod = new String[] {""} ;
      T01JF17_A12225DocDisID = new long[1] ;
      T01JF7_A12225DocDisID = new long[1] ;
      T01JF7_A12208FecDisQ = new java.util.Date[] {GXutil.nullDate()} ;
      T01JF7_n12208FecDisQ = new boolean[] {false} ;
      T01JF7_A12209StaDisQ = new byte[1] ;
      T01JF7_n12209StaDisQ = new boolean[] {false} ;
      T01JF7_A12212CntDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF7_n12212CntDisQ = new boolean[] {false} ;
      T01JF7_A12215UltLinDisQ = new short[1] ;
      T01JF7_n12215UltLinDisQ = new boolean[] {false} ;
      T01JF7_A396EmprCod = new String[] {""} ;
      T01JF7_A12210PrdDisQ = new String[] {""} ;
      T01JF7_n12210PrdDisQ = new boolean[] {false} ;
      T01JF7_A12213UndDisQ = new byte[1] ;
      T01JF7_n12213UndDisQ = new boolean[] {false} ;
      T01JF18_A396EmprCod = new String[] {""} ;
      T01JF18_A12225DocDisID = new long[1] ;
      T01JF19_A396EmprCod = new String[] {""} ;
      T01JF19_A12225DocDisID = new long[1] ;
      T01JF6_A12225DocDisID = new long[1] ;
      T01JF6_A12208FecDisQ = new java.util.Date[] {GXutil.nullDate()} ;
      T01JF6_n12208FecDisQ = new boolean[] {false} ;
      T01JF6_A12209StaDisQ = new byte[1] ;
      T01JF6_n12209StaDisQ = new boolean[] {false} ;
      T01JF6_A12212CntDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF6_n12212CntDisQ = new boolean[] {false} ;
      T01JF6_A12215UltLinDisQ = new short[1] ;
      T01JF6_n12215UltLinDisQ = new boolean[] {false} ;
      T01JF6_A396EmprCod = new String[] {""} ;
      T01JF6_A12210PrdDisQ = new String[] {""} ;
      T01JF6_n12210PrdDisQ = new boolean[] {false} ;
      T01JF6_A12213UndDisQ = new byte[1] ;
      T01JF6_n12213UndDisQ = new boolean[] {false} ;
      T01JF23_A12211DscDisQ = new String[] {""} ;
      T01JF24_A12214DUnDisQ = new String[] {""} ;
      T01JF24_n12214DUnDisQ = new boolean[] {false} ;
      T01JF26_A396EmprCod = new String[] {""} ;
      T01JF26_A12225DocDisID = new long[1] ;
      Z12223DUnDisQU = "" ;
      Z12219DscDisQu = "" ;
      T01JF27_A12225DocDisID = new long[1] ;
      T01JF27_A12226LinDisID = new short[1] ;
      T01JF27_A12224CntDisQ2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF27_n12224CntDisQ2 = new boolean[] {false} ;
      T01JF27_A12230ValDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF27_n12230ValDisQu = new boolean[] {false} ;
      T01JF27_A12219DscDisQu = new String[] {""} ;
      T01JF27_A12220PorDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF27_n12220PorDisQu = new boolean[] {false} ;
      T01JF27_A12221CntDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF27_n12221CntDisQu = new boolean[] {false} ;
      T01JF27_A12223DUnDisQU = new String[] {""} ;
      T01JF27_n12223DUnDisQU = new boolean[] {false} ;
      T01JF27_A396EmprCod = new String[] {""} ;
      T01JF27_A12218PrdDisQu = new String[] {""} ;
      T01JF27_n12218PrdDisQu = new boolean[] {false} ;
      T01JF27_A12222UndDisQu = new byte[1] ;
      T01JF27_n12222UndDisQu = new boolean[] {false} ;
      T01JF4_A12219DscDisQu = new String[] {""} ;
      T01JF5_A12223DUnDisQU = new String[] {""} ;
      T01JF5_n12223DUnDisQU = new boolean[] {false} ;
      T01JF28_A12219DscDisQu = new String[] {""} ;
      T01JF29_A12223DUnDisQU = new String[] {""} ;
      T01JF29_n12223DUnDisQU = new boolean[] {false} ;
      T01JF30_A396EmprCod = new String[] {""} ;
      T01JF30_A12225DocDisID = new long[1] ;
      T01JF30_A12226LinDisID = new short[1] ;
      T01JF3_A12225DocDisID = new long[1] ;
      T01JF3_A12226LinDisID = new short[1] ;
      T01JF3_A12224CntDisQ2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF3_n12224CntDisQ2 = new boolean[] {false} ;
      T01JF3_A12230ValDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF3_n12230ValDisQu = new boolean[] {false} ;
      T01JF3_A12220PorDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF3_n12220PorDisQu = new boolean[] {false} ;
      T01JF3_A12221CntDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF3_n12221CntDisQu = new boolean[] {false} ;
      T01JF3_A396EmprCod = new String[] {""} ;
      T01JF3_A12218PrdDisQu = new String[] {""} ;
      T01JF3_n12218PrdDisQu = new boolean[] {false} ;
      T01JF3_A12222UndDisQu = new byte[1] ;
      T01JF3_n12222UndDisQu = new boolean[] {false} ;
      T01JF2_A12225DocDisID = new long[1] ;
      T01JF2_A12226LinDisID = new short[1] ;
      T01JF2_A12224CntDisQ2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF2_n12224CntDisQ2 = new boolean[] {false} ;
      T01JF2_A12230ValDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF2_n12230ValDisQu = new boolean[] {false} ;
      T01JF2_A12220PorDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF2_n12220PorDisQu = new boolean[] {false} ;
      T01JF2_A12221CntDisQu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF2_n12221CntDisQu = new boolean[] {false} ;
      T01JF2_A396EmprCod = new String[] {""} ;
      T01JF2_A12218PrdDisQu = new String[] {""} ;
      T01JF2_n12218PrdDisQu = new boolean[] {false} ;
      T01JF2_A12222UndDisQu = new byte[1] ;
      T01JF2_n12222UndDisQu = new boolean[] {false} ;
      T01JF34_A12219DscDisQu = new String[] {""} ;
      T01JF35_A12223DUnDisQU = new String[] {""} ;
      T01JF35_n12223DUnDisQU = new boolean[] {false} ;
      T01JF36_A396EmprCod = new String[] {""} ;
      T01JF36_A12225DocDisID = new long[1] ;
      T01JF36_A12226LinDisID = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i12208FecDisQ = GXutil.nullDate() ;
      i12224CntDisQ2 = DecimalUtil.ZERO ;
      i12217TotCnt = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01JF37_A407EmprNom = new String[] {""} ;
      T01JF37_n407EmprNom = new boolean[] {false} ;
      T01JF39_A12216TotPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF39_A12217TotCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF39_A12227TotCntR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JF39_A12231ValDisQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ12208FecDisQ = GXutil.nullDate() ;
      ZZ12210PrdDisQ = "" ;
      ZZ12212CntDisQ = DecimalUtil.ZERO ;
      ZZ12216TotPor = DecimalUtil.ZERO ;
      ZZ12217TotCnt = DecimalUtil.ZERO ;
      ZZ12227TotCntR = DecimalUtil.ZERO ;
      ZZ12231ValDisQ = DecimalUtil.ZERO ;
      ZZ12211DscDisQ = "" ;
      ZZ12214DUnDisQ = "" ;
      ZO12227TotCntR = DecimalUtil.ZERO ;
      ZO12231ValDisQ = DecimalUtil.ZERO ;
      ZO12217TotCnt = DecimalUtil.ZERO ;
      ZO12216TotPor = DecimalUtil.ZERO ;
      GXv_int14 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      Z12228CntDif = DecimalUtil.ZERO ;
      ZV36PrdPreact = DecimalUtil.ZERO ;
      ZV37msg_err = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdispqr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdispqr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdispqr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdispqr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdispqr__default(),
         new Object[] {
             new Object[] {
            T01JF2_A12225DocDisID, T01JF2_A12226LinDisID, T01JF2_A12224CntDisQ2, T01JF2_n12224CntDisQ2, T01JF2_A12230ValDisQu, T01JF2_n12230ValDisQu, T01JF2_A12220PorDisQu, T01JF2_n12220PorDisQu, T01JF2_A12221CntDisQu, T01JF2_n12221CntDisQu,
            T01JF2_A396EmprCod, T01JF2_A12218PrdDisQu, T01JF2_n12218PrdDisQu, T01JF2_A12222UndDisQu, T01JF2_n12222UndDisQu
            }
            , new Object[] {
            T01JF3_A12225DocDisID, T01JF3_A12226LinDisID, T01JF3_A12224CntDisQ2, T01JF3_n12224CntDisQ2, T01JF3_A12230ValDisQu, T01JF3_n12230ValDisQu, T01JF3_A12220PorDisQu, T01JF3_n12220PorDisQu, T01JF3_A12221CntDisQu, T01JF3_n12221CntDisQu,
            T01JF3_A396EmprCod, T01JF3_A12218PrdDisQu, T01JF3_n12218PrdDisQu, T01JF3_A12222UndDisQu, T01JF3_n12222UndDisQu
            }
            , new Object[] {
            T01JF4_A12219DscDisQu
            }
            , new Object[] {
            T01JF5_A12223DUnDisQU, T01JF5_n12223DUnDisQU
            }
            , new Object[] {
            T01JF6_A12225DocDisID, T01JF6_A12208FecDisQ, T01JF6_n12208FecDisQ, T01JF6_A12209StaDisQ, T01JF6_n12209StaDisQ, T01JF6_A12212CntDisQ, T01JF6_n12212CntDisQ, T01JF6_A12215UltLinDisQ, T01JF6_n12215UltLinDisQ, T01JF6_A396EmprCod,
            T01JF6_A12210PrdDisQ, T01JF6_n12210PrdDisQ, T01JF6_A12213UndDisQ, T01JF6_n12213UndDisQ
            }
            , new Object[] {
            T01JF7_A12225DocDisID, T01JF7_A12208FecDisQ, T01JF7_n12208FecDisQ, T01JF7_A12209StaDisQ, T01JF7_n12209StaDisQ, T01JF7_A12212CntDisQ, T01JF7_n12212CntDisQ, T01JF7_A12215UltLinDisQ, T01JF7_n12215UltLinDisQ, T01JF7_A396EmprCod,
            T01JF7_A12210PrdDisQ, T01JF7_n12210PrdDisQ, T01JF7_A12213UndDisQ, T01JF7_n12213UndDisQ
            }
            , new Object[] {
            T01JF8_A407EmprNom, T01JF8_n407EmprNom
            }
            , new Object[] {
            T01JF9_A12211DscDisQ
            }
            , new Object[] {
            T01JF10_A12214DUnDisQ, T01JF10_n12214DUnDisQ
            }
            , new Object[] {
            T01JF12_A12216TotPor, T01JF12_A12217TotCnt, T01JF12_A12227TotCntR, T01JF12_A12231ValDisQ
            }
            , new Object[] {
            T01JF14_A12225DocDisID, T01JF14_A407EmprNom, T01JF14_n407EmprNom, T01JF14_A12208FecDisQ, T01JF14_n12208FecDisQ, T01JF14_A12209StaDisQ, T01JF14_n12209StaDisQ, T01JF14_A12211DscDisQ, T01JF14_A12212CntDisQ, T01JF14_n12212CntDisQ,
            T01JF14_A12214DUnDisQ, T01JF14_n12214DUnDisQ, T01JF14_A12215UltLinDisQ, T01JF14_n12215UltLinDisQ, T01JF14_A396EmprCod, T01JF14_A12210PrdDisQ, T01JF14_n12210PrdDisQ, T01JF14_A12213UndDisQ, T01JF14_n12213UndDisQ, T01JF14_A12216TotPor,
            T01JF14_A12217TotCnt, T01JF14_A12227TotCntR, T01JF14_A12231ValDisQ
            }
            , new Object[] {
            T01JF15_A12211DscDisQ
            }
            , new Object[] {
            T01JF16_A12214DUnDisQ, T01JF16_n12214DUnDisQ
            }
            , new Object[] {
            T01JF17_A396EmprCod, T01JF17_A12225DocDisID
            }
            , new Object[] {
            T01JF18_A396EmprCod, T01JF18_A12225DocDisID
            }
            , new Object[] {
            T01JF19_A396EmprCod, T01JF19_A12225DocDisID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JF23_A12211DscDisQ
            }
            , new Object[] {
            T01JF24_A12214DUnDisQ, T01JF24_n12214DUnDisQ
            }
            , new Object[] {
            }
            , new Object[] {
            T01JF26_A396EmprCod, T01JF26_A12225DocDisID
            }
            , new Object[] {
            T01JF27_A12225DocDisID, T01JF27_A12226LinDisID, T01JF27_A12224CntDisQ2, T01JF27_n12224CntDisQ2, T01JF27_A12230ValDisQu, T01JF27_n12230ValDisQu, T01JF27_A12219DscDisQu, T01JF27_A12220PorDisQu, T01JF27_n12220PorDisQu, T01JF27_A12221CntDisQu,
            T01JF27_n12221CntDisQu, T01JF27_A12223DUnDisQU, T01JF27_n12223DUnDisQU, T01JF27_A396EmprCod, T01JF27_A12218PrdDisQu, T01JF27_n12218PrdDisQu, T01JF27_A12222UndDisQu, T01JF27_n12222UndDisQu
            }
            , new Object[] {
            T01JF28_A12219DscDisQu
            }
            , new Object[] {
            T01JF29_A12223DUnDisQU, T01JF29_n12223DUnDisQU
            }
            , new Object[] {
            T01JF30_A396EmprCod, T01JF30_A12225DocDisID, T01JF30_A12226LinDisID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JF34_A12219DscDisQu
            }
            , new Object[] {
            T01JF35_A12223DUnDisQU, T01JF35_n12223DUnDisQU
            }
            , new Object[] {
            T01JF36_A396EmprCod, T01JF36_A12225DocDisID, T01JF36_A12226LinDisID
            }
            , new Object[] {
            T01JF37_A407EmprNom, T01JF37_n407EmprNom
            }
            , new Object[] {
            T01JF39_A12216TotPor, T01JF39_A12217TotCnt, T01JF39_A12227TotCntR, T01JF39_A12231ValDisQ
            }
         }
      );
      Z12225DocDisID = 0 ;
      A12225DocDisID = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV40Pgmname = "TDisPqR" ;
      Z12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
      n12224CntDisQ2 = false ;
      O12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
      n12224CntDisQ2 = false ;
      T12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
      n12224CntDisQ2 = false ;
      i12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
      n12224CntDisQ2 = false ;
      A12224CntDisQ2 = DecimalUtil.doubleToDec(0) ;
      n12224CntDisQ2 = false ;
      Z12209StaDisQ = (byte)(0) ;
      n12209StaDisQ = false ;
      A12209StaDisQ = (byte)(0) ;
      n12209StaDisQ = false ;
      i12209StaDisQ = (byte)(0) ;
      n12209StaDisQ = false ;
      Z12208FecDisQ = GXutil.today( ) ;
      n12208FecDisQ = false ;
      A12208FecDisQ = GXutil.today( ) ;
      n12208FecDisQ = false ;
      i12208FecDisQ = GXutil.today( ) ;
      n12208FecDisQ = false ;
   }

   private byte Z12209StaDisQ ;
   private byte Z12213UndDisQ ;
   private byte Z12222UndDisQu ;
   private byte GxWebError ;
   private byte A12213UndDisQ ;
   private byte A12222UndDisQu ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A12209StaDisQ ;
   private byte AV34flag ;
   private byte AV35ValCod ;
   private byte AV33ExisteC ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i12209StaDisQ ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ12209StaDisQ ;
   private byte ZZ12213UndDisQ ;
   private byte GXt_int5 ;
   private byte GXv_int14[] ;
   private byte GXv_int6[] ;
   private byte ZV34flag ;
   private byte ZV35ValCod ;
   private short Z12215UltLinDisQ ;
   private short O12215UltLinDisQ ;
   private short Z12226LinDisID ;
   private short nRcdDeleted_1697 ;
   private short nRcdExists_1697 ;
   private short nIsMod_1697 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12215UltLinDisQ ;
   private short nBlankRcdCount1697 ;
   private short RcdFound1697 ;
   private short B12215UltLinDisQ ;
   private short nBlankRcdUsr1697 ;
   private short s12215UltLinDisQ ;
   private short A12226LinDisID ;
   private short RcdFound1696 ;
   private short nIsDirty_1696 ;
   private short nIsDirty_1697 ;
   private short i12215UltLinDisQ ;
   private short ZZ12215UltLinDisQ ;
   private short ZO12215UltLinDisQ ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDocDisID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFecDisQ_Enabled ;
   private int edtPrdDisQ_Enabled ;
   private int edtDscDisQ_Enabled ;
   private int edtCntDisQ_Enabled ;
   private int edtUndDisQ_Enabled ;
   private int edtDUnDisQ_Enabled ;
   private int edtUltLinDisQ_Enabled ;
   private int edtTotPor_Enabled ;
   private int edtTotCnt_Enabled ;
   private int edtTotCntR_Enabled ;
   private int edtValDisQ_Enabled ;
   private int edtavnRcdDeleted_1697_Enabled ;
   private int edtLinDisID_Enabled ;
   private int edtPrdDisQu_Enabled ;
   private int edtDscDisQu_Enabled ;
   private int edtPorDisQu_Enabled ;
   private int edtCntDisQu_Enabled ;
   private int edtValDisQu_Enabled ;
   private int edtUndDisQu_Enabled ;
   private int edtDUnDisQU_Enabled ;
   private int edtCntDisQ2_Enabled ;
   private int edtCntDif_Enabled ;
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
   private int defedtUndDisQu_Enabled ;
   private int defedtValDisQu_Enabled ;
   private int defedtCntDisQu_Enabled ;
   private int defedtLinDisID_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtValDisQ_Backcolor ;
   private int edtTotCntR_Backcolor ;
   private int edtTotCnt_Backcolor ;
   private int edtTotPor_Backcolor ;
   private int edtUltLinDisQ_Backcolor ;
   private int edtDUnDisQ_Backcolor ;
   private int edtUndDisQ_Backcolor ;
   private int edtCntDisQ_Backcolor ;
   private int edtDscDisQ_Backcolor ;
   private int edtPrdDisQ_Backcolor ;
   private int edtFecDisQ_Backcolor ;
   private int edtDocDisID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long wcpOA12225DocDisID ;
   private long Z12225DocDisID ;
   private long A12225DocDisID ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXv_int7[] ;
   private long ZZ12225DocDisID ;
   private java.math.BigDecimal Z12212CntDisQ ;
   private java.math.BigDecimal O12227TotCntR ;
   private java.math.BigDecimal O12231ValDisQ ;
   private java.math.BigDecimal O12217TotCnt ;
   private java.math.BigDecimal O12216TotPor ;
   private java.math.BigDecimal Z12224CntDisQ2 ;
   private java.math.BigDecimal Z12230ValDisQu ;
   private java.math.BigDecimal Z12220PorDisQu ;
   private java.math.BigDecimal Z12221CntDisQu ;
   private java.math.BigDecimal O12224CntDisQ2 ;
   private java.math.BigDecimal O12230ValDisQu ;
   private java.math.BigDecimal O12221CntDisQu ;
   private java.math.BigDecimal O12220PorDisQu ;
   private java.math.BigDecimal A12224CntDisQ2 ;
   private java.math.BigDecimal A12221CntDisQu ;
   private java.math.BigDecimal AV36PrdPreact ;
   private java.math.BigDecimal A12212CntDisQ ;
   private java.math.BigDecimal A12227TotCntR ;
   private java.math.BigDecimal A12216TotPor ;
   private java.math.BigDecimal A12217TotCnt ;
   private java.math.BigDecimal A12231ValDisQ ;
   private java.math.BigDecimal B12227TotCntR ;
   private java.math.BigDecimal B12231ValDisQ ;
   private java.math.BigDecimal B12217TotCnt ;
   private java.math.BigDecimal B12216TotPor ;
   private java.math.BigDecimal s12227TotCntR ;
   private java.math.BigDecimal s12231ValDisQ ;
   private java.math.BigDecimal s12217TotCnt ;
   private java.math.BigDecimal s12216TotPor ;
   private java.math.BigDecimal A12220PorDisQu ;
   private java.math.BigDecimal A12230ValDisQu ;
   private java.math.BigDecimal A12228CntDif ;
   private java.math.BigDecimal T12224CntDisQ2 ;
   private java.math.BigDecimal T12230ValDisQu ;
   private java.math.BigDecimal T12221CntDisQu ;
   private java.math.BigDecimal T12220PorDisQu ;
   private java.math.BigDecimal Z12216TotPor ;
   private java.math.BigDecimal Z12217TotCnt ;
   private java.math.BigDecimal Z12227TotCntR ;
   private java.math.BigDecimal Z12231ValDisQ ;
   private java.math.BigDecimal i12224CntDisQ2 ;
   private java.math.BigDecimal i12217TotCnt ;
   private java.math.BigDecimal ZZ12212CntDisQ ;
   private java.math.BigDecimal ZZ12216TotPor ;
   private java.math.BigDecimal ZZ12217TotCnt ;
   private java.math.BigDecimal ZZ12227TotCntR ;
   private java.math.BigDecimal ZZ12231ValDisQ ;
   private java.math.BigDecimal ZO12227TotCntR ;
   private java.math.BigDecimal ZO12231ValDisQ ;
   private java.math.BigDecimal ZO12217TotCnt ;
   private java.math.BigDecimal ZO12216TotPor ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal Z12228CntDif ;
   private java.math.BigDecimal ZV36PrdPreact ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z12210PrdDisQ ;
   private String Z12218PrdDisQu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A12218PrdDisQu ;
   private String AV37msg_err ;
   private String A12210PrdDisQ ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFecDisQ_Internalname ;
   private String sGXsfl_95_idx="0001" ;
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
   private String edtDocDisID_Internalname ;
   private String edtDocDisID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFecDisQ_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPrdDisQ_Internalname ;
   private String edtPrdDisQ_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDscDisQ_Internalname ;
   private String A12211DscDisQ ;
   private String edtDscDisQ_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCntDisQ_Internalname ;
   private String edtCntDisQ_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtUndDisQ_Internalname ;
   private String edtUndDisQ_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDUnDisQ_Internalname ;
   private String A12214DUnDisQ ;
   private String edtDUnDisQ_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtUltLinDisQ_Internalname ;
   private String edtUltLinDisQ_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTotPor_Internalname ;
   private String edtTotPor_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTotCnt_Internalname ;
   private String edtTotCnt_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTotCntR_Internalname ;
   private String edtTotCntR_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtValDisQ_Internalname ;
   private String edtValDisQ_Jsonclick ;
   private String sMode1697 ;
   private String edtavnRcdDeleted_1697_Internalname ;
   private String edtLinDisID_Internalname ;
   private String edtPrdDisQu_Internalname ;
   private String edtDscDisQu_Internalname ;
   private String edtPorDisQu_Internalname ;
   private String edtCntDisQu_Internalname ;
   private String edtValDisQu_Internalname ;
   private String edtUndDisQu_Internalname ;
   private String edtDUnDisQU_Internalname ;
   private String edtCntDisQ2_Internalname ;
   private String edtCntDif_Internalname ;
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
   private String AV40Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1696 ;
   private String GXCCtl ;
   private String A12219DscDisQu ;
   private String A12223DUnDisQU ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z12214DUnDisQ ;
   private String Z12211DscDisQ ;
   private String Z12223DUnDisQU ;
   private String Z12219DscDisQu ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1697_Jsonclick ;
   private String edtLinDisID_Jsonclick ;
   private String edtPrdDisQu_Jsonclick ;
   private String edtDscDisQu_Jsonclick ;
   private String edtPorDisQu_Jsonclick ;
   private String edtCntDisQu_Jsonclick ;
   private String edtValDisQu_Jsonclick ;
   private String edtUndDisQu_Jsonclick ;
   private String edtDUnDisQU_Jsonclick ;
   private String edtCntDisQ2_Jsonclick ;
   private String edtCntDif_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ12210PrdDisQ ;
   private String ZZ12211DscDisQ ;
   private String ZZ12214DUnDisQ ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV37msg_err ;
   private java.util.Date Z12208FecDisQ ;
   private java.util.Date A12208FecDisQ ;
   private java.util.Date i12208FecDisQ ;
   private java.util.Date ZZ12208FecDisQ ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n12218PrdDisQu ;
   private boolean n12224CntDisQ2 ;
   private boolean n12221CntDisQu ;
   private boolean n12210PrdDisQ ;
   private boolean n12212CntDisQ ;
   private boolean n12213UndDisQ ;
   private boolean n12222UndDisQu ;
   private boolean wbErr ;
   private boolean n12215UltLinDisQ ;
   private boolean n12209StaDisQ ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12208FecDisQ ;
   private boolean n12214DUnDisQ ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n12230ValDisQu ;
   private boolean n12220PorDisQu ;
   private boolean n12223DUnDisQU ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbStaDisQ ;
   private IDataStoreProvider pr_default ;
   private String[] T01JF8_A407EmprNom ;
   private boolean[] T01JF8_n407EmprNom ;
   private java.math.BigDecimal[] T01JF12_A12216TotPor ;
   private java.math.BigDecimal[] T01JF12_A12217TotCnt ;
   private java.math.BigDecimal[] T01JF12_A12227TotCntR ;
   private java.math.BigDecimal[] T01JF12_A12231ValDisQ ;
   private long[] T01JF14_A12225DocDisID ;
   private String[] T01JF14_A407EmprNom ;
   private boolean[] T01JF14_n407EmprNom ;
   private java.util.Date[] T01JF14_A12208FecDisQ ;
   private boolean[] T01JF14_n12208FecDisQ ;
   private byte[] T01JF14_A12209StaDisQ ;
   private boolean[] T01JF14_n12209StaDisQ ;
   private String[] T01JF14_A12211DscDisQ ;
   private java.math.BigDecimal[] T01JF14_A12212CntDisQ ;
   private boolean[] T01JF14_n12212CntDisQ ;
   private String[] T01JF14_A12214DUnDisQ ;
   private boolean[] T01JF14_n12214DUnDisQ ;
   private short[] T01JF14_A12215UltLinDisQ ;
   private boolean[] T01JF14_n12215UltLinDisQ ;
   private String[] T01JF14_A396EmprCod ;
   private String[] T01JF14_A12210PrdDisQ ;
   private boolean[] T01JF14_n12210PrdDisQ ;
   private byte[] T01JF14_A12213UndDisQ ;
   private boolean[] T01JF14_n12213UndDisQ ;
   private java.math.BigDecimal[] T01JF14_A12216TotPor ;
   private java.math.BigDecimal[] T01JF14_A12217TotCnt ;
   private java.math.BigDecimal[] T01JF14_A12227TotCntR ;
   private java.math.BigDecimal[] T01JF14_A12231ValDisQ ;
   private String[] T01JF9_A12211DscDisQ ;
   private String[] T01JF10_A12214DUnDisQ ;
   private boolean[] T01JF10_n12214DUnDisQ ;
   private String[] T01JF15_A12211DscDisQ ;
   private String[] T01JF16_A12214DUnDisQ ;
   private boolean[] T01JF16_n12214DUnDisQ ;
   private String[] T01JF17_A396EmprCod ;
   private long[] T01JF17_A12225DocDisID ;
   private long[] T01JF7_A12225DocDisID ;
   private java.util.Date[] T01JF7_A12208FecDisQ ;
   private boolean[] T01JF7_n12208FecDisQ ;
   private byte[] T01JF7_A12209StaDisQ ;
   private boolean[] T01JF7_n12209StaDisQ ;
   private java.math.BigDecimal[] T01JF7_A12212CntDisQ ;
   private boolean[] T01JF7_n12212CntDisQ ;
   private short[] T01JF7_A12215UltLinDisQ ;
   private boolean[] T01JF7_n12215UltLinDisQ ;
   private String[] T01JF7_A396EmprCod ;
   private String[] T01JF7_A12210PrdDisQ ;
   private boolean[] T01JF7_n12210PrdDisQ ;
   private byte[] T01JF7_A12213UndDisQ ;
   private boolean[] T01JF7_n12213UndDisQ ;
   private String[] T01JF18_A396EmprCod ;
   private long[] T01JF18_A12225DocDisID ;
   private String[] T01JF19_A396EmprCod ;
   private long[] T01JF19_A12225DocDisID ;
   private long[] T01JF6_A12225DocDisID ;
   private java.util.Date[] T01JF6_A12208FecDisQ ;
   private boolean[] T01JF6_n12208FecDisQ ;
   private byte[] T01JF6_A12209StaDisQ ;
   private boolean[] T01JF6_n12209StaDisQ ;
   private java.math.BigDecimal[] T01JF6_A12212CntDisQ ;
   private boolean[] T01JF6_n12212CntDisQ ;
   private short[] T01JF6_A12215UltLinDisQ ;
   private boolean[] T01JF6_n12215UltLinDisQ ;
   private String[] T01JF6_A396EmprCod ;
   private String[] T01JF6_A12210PrdDisQ ;
   private boolean[] T01JF6_n12210PrdDisQ ;
   private byte[] T01JF6_A12213UndDisQ ;
   private boolean[] T01JF6_n12213UndDisQ ;
   private String[] T01JF23_A12211DscDisQ ;
   private String[] T01JF24_A12214DUnDisQ ;
   private boolean[] T01JF24_n12214DUnDisQ ;
   private String[] T01JF26_A396EmprCod ;
   private long[] T01JF26_A12225DocDisID ;
   private long[] T01JF27_A12225DocDisID ;
   private short[] T01JF27_A12226LinDisID ;
   private java.math.BigDecimal[] T01JF27_A12224CntDisQ2 ;
   private boolean[] T01JF27_n12224CntDisQ2 ;
   private java.math.BigDecimal[] T01JF27_A12230ValDisQu ;
   private boolean[] T01JF27_n12230ValDisQu ;
   private String[] T01JF27_A12219DscDisQu ;
   private java.math.BigDecimal[] T01JF27_A12220PorDisQu ;
   private boolean[] T01JF27_n12220PorDisQu ;
   private java.math.BigDecimal[] T01JF27_A12221CntDisQu ;
   private boolean[] T01JF27_n12221CntDisQu ;
   private String[] T01JF27_A12223DUnDisQU ;
   private boolean[] T01JF27_n12223DUnDisQU ;
   private String[] T01JF27_A396EmprCod ;
   private String[] T01JF27_A12218PrdDisQu ;
   private boolean[] T01JF27_n12218PrdDisQu ;
   private byte[] T01JF27_A12222UndDisQu ;
   private boolean[] T01JF27_n12222UndDisQu ;
   private String[] T01JF4_A12219DscDisQu ;
   private String[] T01JF5_A12223DUnDisQU ;
   private boolean[] T01JF5_n12223DUnDisQU ;
   private String[] T01JF28_A12219DscDisQu ;
   private String[] T01JF29_A12223DUnDisQU ;
   private boolean[] T01JF29_n12223DUnDisQU ;
   private String[] T01JF30_A396EmprCod ;
   private long[] T01JF30_A12225DocDisID ;
   private short[] T01JF30_A12226LinDisID ;
   private long[] T01JF3_A12225DocDisID ;
   private short[] T01JF3_A12226LinDisID ;
   private java.math.BigDecimal[] T01JF3_A12224CntDisQ2 ;
   private boolean[] T01JF3_n12224CntDisQ2 ;
   private java.math.BigDecimal[] T01JF3_A12230ValDisQu ;
   private boolean[] T01JF3_n12230ValDisQu ;
   private java.math.BigDecimal[] T01JF3_A12220PorDisQu ;
   private boolean[] T01JF3_n12220PorDisQu ;
   private java.math.BigDecimal[] T01JF3_A12221CntDisQu ;
   private boolean[] T01JF3_n12221CntDisQu ;
   private String[] T01JF3_A396EmprCod ;
   private String[] T01JF3_A12218PrdDisQu ;
   private boolean[] T01JF3_n12218PrdDisQu ;
   private byte[] T01JF3_A12222UndDisQu ;
   private boolean[] T01JF3_n12222UndDisQu ;
   private long[] T01JF2_A12225DocDisID ;
   private short[] T01JF2_A12226LinDisID ;
   private java.math.BigDecimal[] T01JF2_A12224CntDisQ2 ;
   private boolean[] T01JF2_n12224CntDisQ2 ;
   private java.math.BigDecimal[] T01JF2_A12230ValDisQu ;
   private boolean[] T01JF2_n12230ValDisQu ;
   private java.math.BigDecimal[] T01JF2_A12220PorDisQu ;
   private boolean[] T01JF2_n12220PorDisQu ;
   private java.math.BigDecimal[] T01JF2_A12221CntDisQu ;
   private boolean[] T01JF2_n12221CntDisQu ;
   private String[] T01JF2_A396EmprCod ;
   private String[] T01JF2_A12218PrdDisQu ;
   private boolean[] T01JF2_n12218PrdDisQu ;
   private byte[] T01JF2_A12222UndDisQu ;
   private boolean[] T01JF2_n12222UndDisQu ;
   private String[] T01JF34_A12219DscDisQu ;
   private String[] T01JF35_A12223DUnDisQU ;
   private boolean[] T01JF35_n12223DUnDisQU ;
   private String[] T01JF36_A396EmprCod ;
   private long[] T01JF36_A12225DocDisID ;
   private short[] T01JF36_A12226LinDisID ;
   private String[] T01JF37_A407EmprNom ;
   private boolean[] T01JF37_n407EmprNom ;
   private java.math.BigDecimal[] T01JF39_A12216TotPor ;
   private java.math.BigDecimal[] T01JF39_A12217TotCnt ;
   private java.math.BigDecimal[] T01JF39_A12227TotCntR ;
   private java.math.BigDecimal[] T01JF39_A12231ValDisQ ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdispqr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispqr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispqr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispqr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispqr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JF2", "SELECT DocDisID, LinDisID, CntDisQ2, ValDisQu, PorDisQu, CntDisQu, EmprCod, PrdDisQu, UndDisQu FROM TXPDisPq1 WHERE EmprCod = ? AND DocDisID = ? AND LinDisID = ?  FOR UPDATE OF CntDisQ2, ValDisQu, PorDisQu, CntDisQu, PrdDisQu, UndDisQu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JF3", "SELECT DocDisID, LinDisID, CntDisQ2, ValDisQu, PorDisQu, CntDisQu, EmprCod, PrdDisQu, UndDisQu FROM TXPDisPq1 WHERE EmprCod = ? AND DocDisID = ? AND LinDisID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JF4", "SELECT PrdNom AS DscDisQu FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF5", "SELECT UniDsc AS DUnDisQU FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF6", "SELECT DocDisID, FecDisQ, StaDisQ, CntDisQ, UltLinDisQ, EmprCod, PrdDisQ, UndDisQ FROM TXPDisPqu WHERE EmprCod = ? AND DocDisID = ?  FOR UPDATE OF FecDisQ, StaDisQ, CntDisQ, UltLinDisQ, PrdDisQ, UndDisQ NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF7", "SELECT DocDisID, FecDisQ, StaDisQ, CntDisQ, UltLinDisQ, EmprCod, PrdDisQ, UndDisQ FROM TXPDisPqu WHERE EmprCod = ? AND DocDisID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF9", "SELECT PrdNom AS DscDisQ FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF10", "SELECT UniDsc AS DUnDisQ FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF12", "SELECT COALESCE( T1.TotPor, 0) AS TotPor, COALESCE( T1.TotCnt, 0) AS TotCnt, COALESCE( T1.TotCntR, 0) AS TotCntR, COALESCE( T1.ValDisQ, 0) AS ValDisQ FROM (SELECT SUM(PorDisQu) AS TotPor, EmprCod, DocDisID, SUM(CntDisQu) AS TotCnt, SUM(CntDisQ2) AS TotCntR, SUM(ValDisQu) AS ValDisQ FROM TXPDisPq1 GROUP BY EmprCod, DocDisID ) T1 WHERE T1.EmprCod = ? AND T1.DocDisID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF14", "SELECT /*+ FIRST_ROWS(1) */ TM1.DocDisID, T2.EmprNom, TM1.FecDisQ, TM1.StaDisQ, T5.PrdNom AS DscDisQ, TM1.CntDisQ, T3.UniDsc AS DUnDisQ, TM1.UltLinDisQ, TM1.EmprCod, TM1.PrdDisQ AS PrdDisQ, TM1.UndDisQ AS UndDisQ, COALESCE( T4.TotPor, 0) AS TotPor, COALESCE( T4.TotCnt, 0) AS TotCnt, COALESCE( T4.TotCntR, 0) AS TotCntR, COALESCE( T4.ValDisQ, 0) AS ValDisQ FROM ((((TXPDisPqu TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = TM1.EmprCod AND T3.UniCod = TM1.UndDisQ) LEFT JOIN (SELECT SUM(PorDisQu) AS TotPor, EmprCod, DocDisID, SUM(CntDisQu) AS TotCnt, SUM(CntDisQ2) AS TotCntR, SUM(ValDisQu) AS ValDisQ FROM TXPDisPq1 GROUP BY EmprCod, DocDisID ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.DocDisID = TM1.DocDisID) LEFT JOIN TXPPRODUC T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrdNum = TM1.PrdDisQ) WHERE TM1.EmprCod = ? and TM1.DocDisID = ? ORDER BY TM1.EmprCod, TM1.DocDisID ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF15", "SELECT PrdNom AS DscDisQ FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF16", "SELECT UniDsc AS DUnDisQ FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND DocDisID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? and DocDisID = ? ORDER BY EmprCod, DocDisID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? and DocDisID = ? ORDER BY EmprCod DESC, DocDisID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JF20", "INSERT INTO TXPDisPqu(DocDisID, FecDisQ, StaDisQ, CntDisQ, UltLinDisQ, EmprCod, PrdDisQ, UndDisQ, TrH2ODisQ, FecCieDQ, CntFinal, ValFinal) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0)", GX_NOMASK, "TXPDisPqu")
         ,new UpdateCursor("T01JF21", "UPDATE TXPDisPqu SET FecDisQ=?, StaDisQ=?, CntDisQ=?, UltLinDisQ=?, PrdDisQ=?, UndDisQ=?  WHERE EmprCod = ? AND DocDisID = ?", GX_NOMASK, "TXPDisPqu")
         ,new UpdateCursor("T01JF22", "DELETE FROM TXPDisPqu  WHERE EmprCod = ? AND DocDisID = ?", GX_NOMASK, "TXPDisPqu")
         ,new ForEachCursor("T01JF23", "SELECT PrdNom AS DscDisQ FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF24", "SELECT UniDsc AS DUnDisQ FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JF25", "UPDATE TXPDisPqu SET UltLinDisQ=?  WHERE EmprCod = ? AND DocDisID = ?", GX_NOMASK, "TXPDisPqu")
         ,new ForEachCursor("T01JF26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? and DocDisID = ? ORDER BY EmprCod, DocDisID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF27", "SELECT T1.DocDisID, T1.LinDisID, T1.CntDisQ2, T1.ValDisQu, T3.PrdNom AS DscDisQu, T1.PorDisQu, T1.CntDisQu, T2.UniDsc AS DUnDisQU, T1.EmprCod, T1.PrdDisQu AS PrdDisQu, T1.UndDisQu AS UndDisQu FROM ((TXPDisPq1 T1 LEFT JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.UndDisQu) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdDisQu) WHERE T1.EmprCod = ? and T1.DocDisID = ? and T1.LinDisID = ? ORDER BY T1.EmprCod, T1.DocDisID, T1.LinDisID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JF28", "SELECT PrdNom AS DscDisQu FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF29", "SELECT UniDsc AS DUnDisQU FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF30", "SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND DocDisID = ? AND LinDisID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01JF31", "INSERT INTO TXPDisPq1(DocDisID, LinDisID, CntDisQ2, ValDisQu, PorDisQu, CntDisQu, EmprCod, PrdDisQu, UndDisQu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDisPq1")
         ,new UpdateCursor("T01JF32", "UPDATE TXPDisPq1 SET CntDisQ2=?, ValDisQu=?, PorDisQu=?, CntDisQu=?, PrdDisQu=?, UndDisQu=?  WHERE EmprCod = ? AND DocDisID = ? AND LinDisID = ?", GX_NOMASK, "TXPDisPq1")
         ,new UpdateCursor("T01JF33", "DELETE FROM TXPDisPq1  WHERE EmprCod = ? AND DocDisID = ? AND LinDisID = ?", GX_NOMASK, "TXPDisPq1")
         ,new ForEachCursor("T01JF34", "SELECT PrdNom AS DscDisQu FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF35", "SELECT UniDsc AS DUnDisQU FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF36", "SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? and DocDisID = ? ORDER BY EmprCod, DocDisID, LinDisID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JF37", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JF39", "SELECT COALESCE( T1.TotPor, 0) AS TotPor, COALESCE( T1.TotCnt, 0) AS TotCnt, COALESCE( T1.TotCntR, 0) AS TotCntR, COALESCE( T1.ValDisQ, 0) AS ValDisQ FROM (SELECT SUM(PorDisQu) AS TotPor, EmprCod, DocDisID, SUM(CntDisQu) AS TotCnt, SUM(CntDisQ2) AS TotCntR, SUM(ValDisQu) AS ValDisQ FROM TXPDisPq1 GROUP BY EmprCod, DocDisID ) T1 WHERE T1.EmprCod = ? AND T1.DocDisID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((String[]) buf[15])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 23 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
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
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
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
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               stmt.setString(6, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[13]).byteValue());
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setLong(8, ((Number) parms[13]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 5);
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
               stmt.setString(7, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[14]).byteValue());
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setLong(8, ((Number) parms[13]).longValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
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
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

