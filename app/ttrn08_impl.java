package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn08_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         A3685DisParVal = httpContext.GetPar( "DisParVal") ;
         A3686DisParObs = httpContext.GetPar( "DisParObs") ;
         AV34Flag_not = (byte)(GXutil.lval( httpContext.GetPar( "Flag_not"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Flag_not", GXutil.str( AV34Flag_not, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_2_1L6517( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod, A3685DisParVal, A3686DisParObs, AV34Flag_not) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"vPROFASNOT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaprofasnot1L6517( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A1664ParFasCod) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Copia TDISPAF", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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

   public ttrn08_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn08_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn08_impl.class ));
   }

   public ttrn08_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn08.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFasLin_Jsonclick, 0, "", "", "", "", "", 1, edtDisFasLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn08.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount517 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_517 = (short)(1) ;
            scanStart1L6517( ) ;
            while ( RcdFound517 != 0 )
            {
               init_level_properties517( ) ;
               getByPrimaryKey1L6517( ) ;
               addRow1L6517( ) ;
               scanNext1L6517( ) ;
            }
            scanEnd1L6517( ) ;
            nBlankRcdCount517 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1L6517( ) ;
         standaloneModal1L6517( ) ;
         sMode517 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1L6517( ) ;
            edtavnRcdDeleted_517_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_517_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_517_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_517_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisParVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPARVAL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisParVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParVal_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPAROBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisParOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPARORD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisParOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisParVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPARVL2_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisParVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParVl2_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_517 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1L6517( ) ;
            }
            sendRow1L6517( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode517 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount517 = (short)(5) ;
         nRcdExists_517 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1L6517( ) ;
            while ( RcdFound517 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60517( ) ;
               init_level_properties517( ) ;
               standaloneNotModal1L6517( ) ;
               getByPrimaryKey1L6517( ) ;
               standaloneModal1L6517( ) ;
               addRow1L6517( ) ;
               scanNext1L6517( ) ;
            }
            scanEnd1L6517( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode517 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60517( ) ;
      initAll1L6517( ) ;
      init_level_properties517( ) ;
      nRcdExists_517 = (short)(0) ;
      nIsMod_517 = (short)(0) ;
      nRcdDeleted_517 = (short)(0) ;
      nBlankRcdCount517 = (short)(nBlankRcdUsr517+nBlankRcdCount517) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount517 > 0 )
      {
         standaloneNotModal1L6517( ) ;
         standaloneModal1L6517( ) ;
         addRow1L6517( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtParFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount517 = (short)(nBlankRcdCount517-1) ;
      }
      Gx_mode = sMode517 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn08.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn08.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z368DisFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7744FasPreObl = false ;
         AV33Profasnot = httpContext.cgiGet( "vPROFASNOT") ;
         AV34Flag_not = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG_NOT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13989DisParVMn = httpContext.cgiGet( "DISPARVMN") ;
         A13990DisParVMx = httpContext.cgiGet( "DISPARVMX") ;
         A14078DisParPLC = httpContext.cgiGet( "DISPARPLC") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1L639( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_517_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_517_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1L639( ) ;
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

   public void confirm_1L60( )
   {
      beforeValidate1L639( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1L639( ) ;
         }
         else
         {
            checkExtendedTable1L639( ) ;
            if ( AnyError == 0 )
            {
               zm1L639( 4) ;
               zm1L639( 5) ;
               zm1L639( 6) ;
               zm1L639( 7) ;
            }
            closeExtendedTableCursors1L639( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode39 = Gx_mode ;
         confirm_1L6517( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode39 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1L60( ) ;
      }
   }

   public void confirm_1L6517( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1L6517( ) ;
         if ( ( nRcdExists_517 != 0 ) || ( nIsMod_517 != 0 ) )
         {
            getKey1L6517( ) ;
            if ( ( nRcdExists_517 == 0 ) && ( nRcdDeleted_517 == 0 ) )
            {
               if ( RcdFound517 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1L6517( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1L6517( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1L6517( 9) ;
                     }
                     closeExtendedTableCursors1L6517( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PARFASCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound517 != 0 )
               {
                  if ( nRcdDeleted_517 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1L6517( ) ;
                     load1L6517( ) ;
                     beforeValidate1L6517( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1L6517( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_517 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1L6517( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1L6517( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1L6517( 9) ;
                           }
                           closeExtendedTableCursors1L6517( ) ;
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
                  if ( nRcdDeleted_517 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_517_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtDisParVal_Internalname, GXutil.rtrim( A3685DisParVal)) ;
         httpContext.changePostValue( edtDisParObs_Internalname, GXutil.rtrim( A3686DisParObs)) ;
         httpContext.changePostValue( edtDisParOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A6557DisParOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisParVl2_Internalname, GXutil.rtrim( A12672DisParVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3685DisParVal_"+sGXsfl_60_idx, GXutil.rtrim( Z3685DisParVal)) ;
         httpContext.changePostValue( "ZT_"+"Z3686DisParObs_"+sGXsfl_60_idx, GXutil.rtrim( Z3686DisParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z6557DisParOrd_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z6557DisParOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12672DisParVl2_"+sGXsfl_60_idx, GXutil.rtrim( Z12672DisParVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13989DisParVMn_"+sGXsfl_60_idx, GXutil.rtrim( Z13989DisParVMn)) ;
         httpContext.changePostValue( "ZT_"+"Z13990DisParVMx_"+sGXsfl_60_idx, GXutil.rtrim( Z13990DisParVMx)) ;
         httpContext.changePostValue( "ZT_"+"Z14078DisParPLC_"+sGXsfl_60_idx, Z14078DisParPLC) ;
         httpContext.changePostValue( "nRcdDeleted_517_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_517_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_517_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_517 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_517_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_517_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPARVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPAROBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPARORD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPARVL2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1L60( )
   {
   }

   public void zm1L639( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z457FasCod = T01L66_A457FasCod[0] ;
         }
         else
         {
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z368DisFasLin = A368DisFasLin ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01L67 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01L67_A407EmprNom[0] ;
      n407EmprNom = T01L67_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01L68 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01L68_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T01L69 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
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

   public void load1L639( )
   {
      /* Using cursor T01L611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A407EmprNom = T01L611_A407EmprNom[0] ;
         n407EmprNom = T01L611_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T01L611_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T01L611_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A7744FasPreObl = T01L611_A7744FasPreObl[0] ;
         n7744FasPreObl = T01L611_n7744FasPreObl[0] ;
         A457FasCod = T01L611_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         zm1L639( -3) ;
      }
      pr_default.close(9);
      onLoadActions1L639( ) ;
   }

   public void onLoadActions1L639( )
   {
   }

   public void checkExtendedTable1L639( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01L610 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01L610_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7744FasPreObl = T01L610_A7744FasPreObl[0] ;
      n7744FasPreObl = T01L610_n7744FasPreObl[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1L639( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01L612 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01L612_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7744FasPreObl = T01L612_A7744FasPreObl[0] ;
      n7744FasPreObl = T01L612_n7744FasPreObl[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1L639( )
   {
      /* Using cursor T01L613 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01L66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(4) != 101) && ( T01L66_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T01L66_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L66_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01L66_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm1L639( 3) ;
         RcdFound39 = (short)(1) ;
         A457FasCod = T01L66_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1L639( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey1L639( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1L639( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1L639( ) ;
      if ( RcdFound39 == 0 )
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
      RcdFound39 = (short)(0) ;
      /* Using cursor T01L614 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01L614_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L614_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01L614_A758ProCod[0], A758ProCod) == 0 ) && ( T01L614_A368DisFasLin[0] == A368DisFasLin ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01L614_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L614_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01L614_A758ProCod[0], A758ProCod) == 0 ) && ( T01L614_A368DisFasLin[0] == A368DisFasLin ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T01L615 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01L615_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L615_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01L615_A758ProCod[0], A758ProCod) == 0 ) && ( T01L615_A368DisFasLin[0] == A368DisFasLin ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01L615_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L615_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01L615_A758ProCod[0], A758ProCod) == 0 ) && ( T01L615_A368DisFasLin[0] == A368DisFasLin ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1L639( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1L639( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1L639( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1L639( ) ;
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
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1L639( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
         GX_FocusControl = edtFasCod_Internalname ;
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
      getKey1L639( ) ;
      if ( RcdFound39 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn08");
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1L60( ) ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1L639( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1L639( ) ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart1L639( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound39 != 0 )
         {
            scanNext1L639( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1L639( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1L639( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z457FasCod, T01L65_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z457FasCod, T01L65_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01L65_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L639( )
   {
      beforeValidate1L639( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L639( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L639( 0) ;
         checkOptimisticConcurrency1L639( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L639( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L639( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L616 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Short.valueOf(A368DisFasLin), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
                        processLevel1L639( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1L60( ) ;
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
            load1L639( ) ;
         }
         endLevel1L639( ) ;
      }
      closeExtendedTableCursors1L639( ) ;
   }

   public void update1L639( )
   {
      beforeValidate1L639( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L639( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L639( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L639( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1L639( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L617 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1L639( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1L639( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1L60( ) ;
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
         endLevel1L639( ) ;
      }
      closeExtendedTableCursors1L639( ) ;
   }

   public void deferredUpdate1L639( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L639( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L639( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L639( ) ;
         afterConfirm1L639( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L639( ) ;
            if ( AnyError == 0 )
            {
               scanStart1L6517( ) ;
               while ( RcdFound517 != 0 )
               {
                  getByPrimaryKey1L6517( ) ;
                  delete1L6517( ) ;
                  scanNext1L6517( ) ;
               }
               scanEnd1L6517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L618 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound39 == 0 )
                        {
                           initAll1L639( ) ;
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
                        resetCaption1L60( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L639( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L639( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01L619 */
         pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01L619_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A7744FasPreObl = T01L619_A7744FasPreObl[0] ;
         n7744FasPreObl = T01L619_n7744FasPreObl[0] ;
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L620 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01L621 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01L622 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01L623 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1L6517( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1L6517( ) ;
         if ( ( nRcdExists_517 != 0 ) || ( nIsMod_517 != 0 ) )
         {
            standaloneNotModal1L6517( ) ;
            getKey1L6517( ) ;
            if ( ( nRcdExists_517 == 0 ) && ( nRcdDeleted_517 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1L6517( ) ;
            }
            else
            {
               if ( RcdFound517 != 0 )
               {
                  if ( ( nRcdDeleted_517 != 0 ) && ( nRcdExists_517 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1L6517( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_517 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1L6517( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_517 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_517_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtDisParVal_Internalname, GXutil.rtrim( A3685DisParVal)) ;
         httpContext.changePostValue( edtDisParObs_Internalname, GXutil.rtrim( A3686DisParObs)) ;
         httpContext.changePostValue( edtDisParOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A6557DisParOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisParVl2_Internalname, GXutil.rtrim( A12672DisParVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3685DisParVal_"+sGXsfl_60_idx, GXutil.rtrim( Z3685DisParVal)) ;
         httpContext.changePostValue( "ZT_"+"Z3686DisParObs_"+sGXsfl_60_idx, GXutil.rtrim( Z3686DisParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z6557DisParOrd_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z6557DisParOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12672DisParVl2_"+sGXsfl_60_idx, GXutil.rtrim( Z12672DisParVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13989DisParVMn_"+sGXsfl_60_idx, GXutil.rtrim( Z13989DisParVMn)) ;
         httpContext.changePostValue( "ZT_"+"Z13990DisParVMx_"+sGXsfl_60_idx, GXutil.rtrim( Z13990DisParVMx)) ;
         httpContext.changePostValue( "ZT_"+"Z14078DisParPLC_"+sGXsfl_60_idx, Z14078DisParPLC) ;
         httpContext.changePostValue( "nRcdDeleted_517_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_517_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_517_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_517 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_517_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_517_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPARVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPAROBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPARORD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISPARVL2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1L6517( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_517 = (short)(0) ;
      nIsMod_517 = (short)(0) ;
      nRcdDeleted_517 = (short)(0) ;
   }

   public void processLevel1L639( )
   {
      /* Save parent mode. */
      sMode39 = Gx_mode ;
      processNestedLevel1L6517( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1L639( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1L639( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn08");
         if ( AnyError == 0 )
         {
            confirmValues1L60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn08");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L639( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A361DisCod = A361DisCod ;
      this.A758ProCod = A758ProCod ;
      this.A368DisFasLin = A368DisFasLin ;
      /* Scan By routine */
      /* Using cursor T01L624 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L639( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
   }

   public void scanEnd1L639( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1L639( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1L639( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L639( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L639( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L639( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L639( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L639( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
   }

   public void zm1L6517( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3685DisParVal = T01L63_A3685DisParVal[0] ;
            Z3686DisParObs = T01L63_A3686DisParObs[0] ;
            Z6557DisParOrd = T01L63_A6557DisParOrd[0] ;
            Z12672DisParVl2 = T01L63_A12672DisParVl2[0] ;
            Z13989DisParVMn = T01L63_A13989DisParVMn[0] ;
            Z13990DisParVMx = T01L63_A13990DisParVMx[0] ;
            Z14078DisParPLC = T01L63_A14078DisParPLC[0] ;
         }
         else
         {
            Z3685DisParVal = A3685DisParVal ;
            Z3686DisParObs = A3686DisParObs ;
            Z6557DisParOrd = A6557DisParOrd ;
            Z12672DisParVl2 = A12672DisParVl2 ;
            Z13989DisParVMn = A13989DisParVMn ;
            Z13990DisParVMx = A13990DisParVMx ;
            Z14078DisParPLC = A14078DisParPLC ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z3685DisParVal = A3685DisParVal ;
         Z3686DisParObs = A3686DisParObs ;
         Z6557DisParOrd = A6557DisParOrd ;
         Z12672DisParVl2 = A12672DisParVl2 ;
         Z13989DisParVMn = A13989DisParVMn ;
         Z13990DisParVMx = A13990DisParVMx ;
         Z14078DisParPLC = A14078DisParPLC ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z1665ParFasDsc = A1665ParFasDsc ;
      }
   }

   public void standaloneNotModal1L6517( )
   {
   }

   public void standaloneModal1L6517( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1L6517( )
   {
      /* Using cursor T01L625 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound517 = (short)(1) ;
         A1665ParFasDsc = T01L625_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01L625_n1665ParFasDsc[0] ;
         A3685DisParVal = T01L625_A3685DisParVal[0] ;
         A3686DisParObs = T01L625_A3686DisParObs[0] ;
         A6557DisParOrd = T01L625_A6557DisParOrd[0] ;
         A12672DisParVl2 = T01L625_A12672DisParVl2[0] ;
         A13989DisParVMn = T01L625_A13989DisParVMn[0] ;
         A13990DisParVMx = T01L625_A13990DisParVMx[0] ;
         A14078DisParPLC = T01L625_A14078DisParPLC[0] ;
         zm1L6517( -8) ;
      }
      pr_default.close(23);
      onLoadActions1L6517( ) ;
   }

   public void onLoadActions1L6517( )
   {
      if ( true /* After */ )
      {
         GXt_char1 = AV33Profasnot ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pdispartxt(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod, GXv_char2) ;
         ttrn08_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Profasnot = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Profasnot", AV33Profasnot);
      }
   }

   public void checkExtendedTable1L6517( )
   {
      nIsDirty_517 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1L6517( ) ;
      /* Using cursor T01L64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01L64_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01L64_n1665ParFasDsc[0] ;
      pr_default.close(2);
      if ( true /* After */ )
      {
         GXt_char1 = AV33Profasnot ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pdispartxt(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod, GXv_char2) ;
         ttrn08_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Profasnot = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Profasnot", AV33Profasnot);
      }
   }

   public void closeExtendedTableCursors1L6517( )
   {
      pr_default.close(2);
   }

   public void enableDisable1L6517( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         short A1664ParFasCod )
   {
      /* Using cursor T01L626 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01L626_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01L626_n1665ParFasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey1L6517( )
   {
      /* Using cursor T01L627 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound517 = (short)(1) ;
      }
      else
      {
         RcdFound517 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1L6517( )
   {
      /* Using cursor T01L63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T01L63_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01L63_A758ProCod[0], A758ProCod) == 0 ) && ( T01L63_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T01L63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L6517( 8) ;
         RcdFound517 = (short)(1) ;
         initializeNonKey1L6517( ) ;
         A3685DisParVal = T01L63_A3685DisParVal[0] ;
         A3686DisParObs = T01L63_A3686DisParObs[0] ;
         A6557DisParOrd = T01L63_A6557DisParOrd[0] ;
         A12672DisParVl2 = T01L63_A12672DisParVl2[0] ;
         A13989DisParVMn = T01L63_A13989DisParVMn[0] ;
         A13990DisParVMx = T01L63_A13990DisParVMx[0] ;
         A14078DisParPLC = T01L63_A14078DisParPLC[0] ;
         A1664ParFasCod = T01L63_A1664ParFasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode517 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L6517( ) ;
         load1L6517( ) ;
         Gx_mode = sMode517 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound517 = (short)(0) ;
         initializeNonKey1L6517( ) ;
         sMode517 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L6517( ) ;
         Gx_mode = sMode517 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1L6517( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1L6517( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3685DisParVal, T01L62_A3685DisParVal[0]) != 0 ) || ( GXutil.strcmp(Z3686DisParObs, T01L62_A3686DisParObs[0]) != 0 ) || ( Z6557DisParOrd != T01L62_A6557DisParOrd[0] ) || ( GXutil.strcmp(Z12672DisParVl2, T01L62_A12672DisParVl2[0]) != 0 ) || ( GXutil.strcmp(Z13989DisParVMn, T01L62_A13989DisParVMn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13990DisParVMx, T01L62_A13990DisParVMx[0]) != 0 ) || ( GXutil.strcmp(Z14078DisParPLC, T01L62_A14078DisParPLC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3685DisParVal, T01L62_A3685DisParVal[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParVal");
               GXutil.writeLogRaw("Old: ",Z3685DisParVal);
               GXutil.writeLogRaw("Current: ",T01L62_A3685DisParVal[0]);
            }
            if ( GXutil.strcmp(Z3686DisParObs, T01L62_A3686DisParObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParObs");
               GXutil.writeLogRaw("Old: ",Z3686DisParObs);
               GXutil.writeLogRaw("Current: ",T01L62_A3686DisParObs[0]);
            }
            if ( Z6557DisParOrd != T01L62_A6557DisParOrd[0] )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParOrd");
               GXutil.writeLogRaw("Old: ",Z6557DisParOrd);
               GXutil.writeLogRaw("Current: ",T01L62_A6557DisParOrd[0]);
            }
            if ( GXutil.strcmp(Z12672DisParVl2, T01L62_A12672DisParVl2[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParVl2");
               GXutil.writeLogRaw("Old: ",Z12672DisParVl2);
               GXutil.writeLogRaw("Current: ",T01L62_A12672DisParVl2[0]);
            }
            if ( GXutil.strcmp(Z13989DisParVMn, T01L62_A13989DisParVMn[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParVMn");
               GXutil.writeLogRaw("Old: ",Z13989DisParVMn);
               GXutil.writeLogRaw("Current: ",T01L62_A13989DisParVMn[0]);
            }
            if ( GXutil.strcmp(Z13990DisParVMx, T01L62_A13990DisParVMx[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParVMx");
               GXutil.writeLogRaw("Old: ",Z13990DisParVMx);
               GXutil.writeLogRaw("Current: ",T01L62_A13990DisParVMx[0]);
            }
            if ( GXutil.strcmp(Z14078DisParPLC, T01L62_A14078DisParPLC[0]) != 0 )
            {
               GXutil.writeLogln("ttrn08:[seudo value changed for attri]"+"DisParPLC");
               GXutil.writeLogRaw("Old: ",Z14078DisParPLC);
               GXutil.writeLogRaw("Current: ",T01L62_A14078DisParPLC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L6517( )
   {
      beforeValidate1L6517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L6517( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L6517( 0) ;
         checkOptimisticConcurrency1L6517( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L6517( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L6517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L628 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A3685DisParVal, A3686DisParObs, Short.valueOf(A6557DisParOrd), A12672DisParVl2, A13989DisParVMn, A13990DisParVMx, A14078DisParPLC, A396EmprCod, Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                  if ( (pr_default.getStatus(26) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( AV34Flag_not == 1 ) )
                     {
                        GXv_char2[0] = A396EmprCod ;
                        GXv_int3[0] = A361DisCod ;
                        GXv_char4[0] = A758ProCod ;
                        GXv_int5[0] = A368DisFasLin ;
                        GXv_int6[0] = A1664ParFasCod ;
                        GXv_char7[0] = A3685DisParVal ;
                        GXv_char8[0] = A3686DisParObs ;
                        new app.pdispaf(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_char8) ;
                        ttrn08_impl.this.A396EmprCod = GXv_char2[0] ;
                        ttrn08_impl.this.A361DisCod = GXv_int3[0] ;
                        ttrn08_impl.this.A758ProCod = GXv_char4[0] ;
                        ttrn08_impl.this.A368DisFasLin = GXv_int5[0] ;
                        ttrn08_impl.this.A1664ParFasCod = GXv_int6[0] ;
                        ttrn08_impl.this.A3685DisParVal = GXv_char7[0] ;
                        ttrn08_impl.this.A3686DisParObs = GXv_char8[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
            load1L6517( ) ;
         }
         endLevel1L6517( ) ;
      }
      closeExtendedTableCursors1L6517( ) ;
   }

   public void update1L6517( )
   {
      beforeValidate1L6517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L6517( ) ;
      }
      if ( ( nIsMod_517 != 0 ) || ( nIsDirty_517 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1L6517( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1L6517( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1L6517( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01L629 */
                     pr_default.execute(27, new Object[] {A3685DisParVal, A3686DisParObs, Short.valueOf(A6557DisParOrd), A12672DisParVl2, A13989DisParVMn, A13990DisParVMx, A14078DisParPLC, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1L6517( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( AV34Flag_not == 1 ) )
                        {
                           GXv_char8[0] = A396EmprCod ;
                           GXv_int3[0] = A361DisCod ;
                           GXv_char7[0] = A758ProCod ;
                           GXv_int6[0] = A368DisFasLin ;
                           GXv_int5[0] = A1664ParFasCod ;
                           GXv_char4[0] = A3685DisParVal ;
                           GXv_char2[0] = A3686DisParObs ;
                           new app.pdispaf(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_char7, GXv_int6, GXv_int5, GXv_char4, GXv_char2) ;
                           ttrn08_impl.this.A396EmprCod = GXv_char8[0] ;
                           ttrn08_impl.this.A361DisCod = GXv_int3[0] ;
                           ttrn08_impl.this.A758ProCod = GXv_char7[0] ;
                           ttrn08_impl.this.A368DisFasLin = GXv_int6[0] ;
                           ttrn08_impl.this.A1664ParFasCod = GXv_int5[0] ;
                           ttrn08_impl.this.A3685DisParVal = GXv_char4[0] ;
                           ttrn08_impl.this.A3686DisParObs = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1L6517( ) ;
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
            endLevel1L6517( ) ;
         }
      }
      closeExtendedTableCursors1L6517( ) ;
   }

   public void deferredUpdate1L6517( )
   {
   }

   public void delete1L6517( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L6517( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L6517( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L6517( ) ;
         afterConfirm1L6517( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L6517( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L630 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
      sMode517 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L6517( ) ;
      Gx_mode = sMode517 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L6517( )
   {
      standaloneModal1L6517( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01L631 */
         pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T01L631_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01L631_n1665ParFasDsc[0] ;
         pr_default.close(29);
         if ( true /* After */ )
         {
            GXt_char1 = AV33Profasnot ;
            GXv_char8[0] = GXt_char1 ;
            new app.core.pdispartxt(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod, GXv_char8) ;
            ttrn08_impl.this.GXt_char1 = GXv_char8[0] ;
            AV33Profasnot = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Profasnot", AV33Profasnot);
         }
      }
   }

   public void endLevel1L6517( )
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

   public void scanStart1L6517( )
   {
      /* Scan By routine */
      /* Using cursor T01L632 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound517 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound517 = (short)(1) ;
         A1664ParFasCod = T01L632_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L6517( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound517 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound517 = (short)(1) ;
         A1664ParFasCod = T01L632_A1664ParFasCod[0] ;
      }
   }

   public void scanEnd1L6517( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1L6517( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1L6517( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L6517( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L6517( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L6517( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L6517( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L6517( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisParVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisParVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParVal_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisParObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisParOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisParOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParOrd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisParVl2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisParVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisParVl2_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1L6517( )
   {
   }

   public void send_integrity_lvl_hashes1L639( )
   {
   }

   public void subsflControlProps_60517( )
   {
      edtavnRcdDeleted_517_Internalname = "vNRCDDELETED_517_"+sGXsfl_60_idx ;
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_60_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_60_idx ;
      edtDisParVal_Internalname = "DISPARVAL_"+sGXsfl_60_idx ;
      edtDisParObs_Internalname = "DISPAROBS_"+sGXsfl_60_idx ;
      edtDisParOrd_Internalname = "DISPARORD_"+sGXsfl_60_idx ;
      edtDisParVl2_Internalname = "DISPARVL2_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60517( )
   {
      edtavnRcdDeleted_517_Internalname = "vNRCDDELETED_517_"+sGXsfl_60_fel_idx ;
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_60_fel_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_60_fel_idx ;
      edtDisParVal_Internalname = "DISPARVAL_"+sGXsfl_60_fel_idx ;
      edtDisParObs_Internalname = "DISPAROBS_"+sGXsfl_60_fel_idx ;
      edtDisParOrd_Internalname = "DISPARORD_"+sGXsfl_60_fel_idx ;
      edtDisParVl2_Internalname = "DISPARVL2_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1L6517( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60517( ) ;
      sendRow1L6517( ) ;
   }

   public void sendRow1L6517( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_517_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_517_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_517_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_517), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_517), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_517_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_517_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_517_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasDsc_Internalname,GXutil.rtrim( A1665ParFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_517_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisParVal_Internalname,GXutil.rtrim( A3685DisParVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisParVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisParVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_517_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisParObs_Internalname,GXutil.rtrim( A3686DisParObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisParObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisParObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_517_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisParOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A6557DisParOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisParOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6557DisParOrd), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6557DisParOrd), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisParOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisParOrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_517_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisParVl2_Internalname,GXutil.rtrim( A12672DisParVl2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisParVl2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisParVl2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1L6517( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3685DisParVal_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3685DisParVal));
      GXCCtl = "Z3686DisParObs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3686DisParObs));
      GXCCtl = "Z6557DisParOrd_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6557DisParOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12672DisParVl2_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12672DisParVl2));
      GXCCtl = "Z13989DisParVMn_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13989DisParVMn));
      GXCCtl = "Z13990DisParVMx_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13990DisParVMx));
      GXCCtl = "Z14078DisParPLC_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14078DisParPLC);
      GXCCtl = "nRcdDeleted_517_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_517_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_517_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_517_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_517_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPARVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPAROBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPARORD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPARVL2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1L6517( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60517( ) ;
      edtavnRcdDeleted_517_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_517_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisParVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPARVAL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPAROBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisParOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPARORD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisParVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISPARVL2_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_517_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_517_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_517");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_517_Internalname ;
         wbErr = true ;
         nRcdDeleted_517 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_517 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_517_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         wbErr = true ;
         A1664ParFasCod = (short)(0) ;
      }
      else
      {
         A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1665ParFasDsc = httpContext.cgiGet( edtParFasDsc_Internalname) ;
      n1665ParFasDsc = false ;
      A3685DisParVal = httpContext.cgiGet( edtDisParVal_Internalname) ;
      A3686DisParObs = httpContext.cgiGet( edtDisParObs_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisParOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisParOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "DISPARORD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisParOrd_Internalname ;
         wbErr = true ;
         A6557DisParOrd = (short)(0) ;
      }
      else
      {
         A6557DisParOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtDisParOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12672DisParVl2 = httpContext.cgiGet( edtDisParVl2_Internalname) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_60_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3685DisParVal_" + sGXsfl_60_idx ;
      Z3685DisParVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3686DisParObs_" + sGXsfl_60_idx ;
      Z3686DisParObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6557DisParOrd_" + sGXsfl_60_idx ;
      Z6557DisParOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12672DisParVl2_" + sGXsfl_60_idx ;
      Z12672DisParVl2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13989DisParVMn_" + sGXsfl_60_idx ;
      Z13989DisParVMn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13990DisParVMx_" + sGXsfl_60_idx ;
      Z13990DisParVMx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14078DisParPLC_" + sGXsfl_60_idx ;
      Z14078DisParPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13989DisParVMn_" + sGXsfl_60_idx ;
      A13989DisParVMn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13990DisParVMx_" + sGXsfl_60_idx ;
      A13990DisParVMx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14078DisParPLC_" + sGXsfl_60_idx ;
      A14078DisParPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_517_" + sGXsfl_60_idx ;
      nRcdDeleted_517 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_517_" + sGXsfl_60_idx ;
      nRcdExists_517 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_517_" + sGXsfl_60_idx ;
      nIsMod_517 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
   }

   public void confirmValues1L60( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60517( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60517( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3685DisParVal_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3685DisParVal_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3685DisParVal_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3686DisParObs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3686DisParObs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3686DisParObs_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z6557DisParOrd_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z6557DisParOrd_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6557DisParOrd_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z12672DisParVl2_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z12672DisParVl2_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12672DisParVl2_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13989DisParVMn_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13989DisParVMn_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13989DisParVMn_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13990DisParVMx_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13990DisParVMx_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13990DisParVMx_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z14078DisParPLC_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z14078DisParPLC_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14078DisParPLC_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn08", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFASNOT", AV33Profasnot);
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG_NOT", GXutil.ltrim( localUtil.ntoc( AV34Flag_not, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPARVMN", GXutil.rtrim( A13989DisParVMn));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPARVMX", GXutil.rtrim( A13990DisParVMx));
      app.GxWebStd.gx_hidden_field( httpContext, "DISPARPLC", A14078DisParPLC);
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
      return formatLink("app.ttrn08", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn08" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Copia TDISPAF", "") ;
   }

   public void initializeNonKey1L639( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      Z457FasCod = "" ;
   }

   public void initAll1L639( )
   {
      initializeNonKey1L639( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1L6517( )
   {
      AV33Profasnot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Profasnot", AV33Profasnot);
      AV34Flag_not = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Flag_not", GXutil.str( AV34Flag_not, 1, 0));
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      A6557DisParOrd = (short)(0) ;
      A12672DisParVl2 = "" ;
      A13989DisParVMn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13989DisParVMn", A13989DisParVMn);
      A13990DisParVMx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13990DisParVMx", A13990DisParVMx);
      A14078DisParPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14078DisParPLC", A14078DisParPLC);
      Z3685DisParVal = "" ;
      Z3686DisParObs = "" ;
      Z6557DisParOrd = (short)(0) ;
      Z12672DisParVl2 = "" ;
      Z13989DisParVMn = "" ;
      Z13990DisParVMx = "" ;
      Z14078DisParPLC = "" ;
   }

   public void initAll1L6517( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKey1L6517( ) ;
   }

   public void standaloneModalInsert1L6517( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241591210", true, true);
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
      httpContext.AddJavascriptSource("ttrn08.js", "?20268241591210", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties517( )
   {
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_517, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_517_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1665ParFasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3685DisParVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3686DisParObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6557DisParOrd, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12672DisParVl2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisParVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtavnRcdDeleted_517_Internalname = "vNRCDDELETED_517" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasDsc_Internalname = "PARFASDSC" ;
      edtDisParVal_Internalname = "DISPARVAL" ;
      edtDisParObs_Internalname = "DISPAROBS" ;
      edtDisParOrd_Internalname = "DISPARORD" ;
      edtDisParVl2_Internalname = "DISPARVL2" ;
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
      Form.setCaption( httpContext.getMessage( "Copia TDISPAF", "") );
      edtDisParVl2_Jsonclick = "" ;
      edtDisParOrd_Jsonclick = "" ;
      edtDisParObs_Jsonclick = "" ;
      edtDisParVal_Jsonclick = "" ;
      edtParFasDsc_Jsonclick = "" ;
      edtParFasCod_Jsonclick = "" ;
      edtavnRcdDeleted_517_Jsonclick = "" ;
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
      edtDisParVl2_Enabled = 1 ;
      edtDisParOrd_Enabled = 1 ;
      edtDisParObs_Enabled = 1 ;
      edtDisParVal_Enabled = 1 ;
      edtParFasDsc_Enabled = 0 ;
      edtParFasCod_Enabled = 1 ;
      edtavnRcdDeleted_517_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisFasLin_Jsonclick = "" ;
      edtDisFasLin_Backcolor = (int)(0xFFFFFF) ;
      edtDisFasLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void gx1asaprofasnot1L6517( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A758ProCod ,
                                      short A368DisFasLin ,
                                      short A1664ParFasCod )
   {
      if ( true /* After */ )
      {
         GXt_char1 = AV33Profasnot ;
         GXv_char8[0] = GXt_char1 ;
         new app.core.pdispartxt(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod, GXv_char8) ;
         ttrn08_impl.this.GXt_char1 = GXv_char8[0] ;
         AV33Profasnot = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Profasnot", AV33Profasnot);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( AV33Profasnot)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_2_1L6517( String A396EmprCod ,
                            int A361DisCod ,
                            String A758ProCod ,
                            short A368DisFasLin ,
                            short A1664ParFasCod ,
                            String A3685DisParVal ,
                            String A3686DisParObs ,
                            byte AV34Flag_not )
   {
      if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( AV34Flag_not == 1 ) )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A361DisCod ;
         GXv_char7[0] = A758ProCod ;
         GXv_int6[0] = A368DisFasLin ;
         GXv_int5[0] = A1664ParFasCod ;
         GXv_char4[0] = A3685DisParVal ;
         GXv_char2[0] = A3686DisParObs ;
         new app.pdispaf(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_char7, GXv_int6, GXv_int5, GXv_char4, GXv_char2) ;
         A396EmprCod = GXv_char8[0] ;
         A361DisCod = GXv_int3[0] ;
         A758ProCod = GXv_char7[0] ;
         A368DisFasLin = GXv_int6[0] ;
         A1664ParFasCod = GXv_int5[0] ;
         A3685DisParVal = GXv_char4[0] ;
         A3686DisParObs = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3685DisParVal))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3686DisParObs))+"\"") ;
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
      subsflControlProps_60517( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1L6517( ) ;
         standaloneModal1L6517( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1L6517( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60517( ) ;
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
      /* Using cursor T01L633 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01L633_A407EmprNom[0] ;
      n407EmprNom = T01L633_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(31);
      /* Using cursor T01L634 */
      pr_default.execute(32, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01L634_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(32);
      /* Using cursor T01L635 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(33);
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Disfaslin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7744FasPreObl", GXutil.ltrim( localUtil.ntoc( Z7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n7744FasPreObl = false ;
      /* Using cursor T01L619 */
      pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01L619_A460FasDsc[0] ;
      A7744FasPreObl = T01L619_A7744FasPreObl[0] ;
      n7744FasPreObl = T01L619_n7744FasPreObl[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Parfascod( )
   {
      n1665ParFasDsc = false ;
      /* Using cursor T01L631 */
      pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T01L631_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01L631_n1665ParFasDsc[0] ;
      pr_default.close(29);
      if ( true /* After */ )
      {
         GXt_char1 = AV33Profasnot ;
         GXv_char8[0] = GXt_char1 ;
         new app.core.pdispartxt(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, A1664ParFasCod, GXv_char8) ;
         ttrn08_impl.this.GXt_char1 = GXv_char8[0] ;
         AV33Profasnot = GXt_char1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", GXutil.rtrim( A1665ParFasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Profasnot", AV33Profasnot);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z758ProCod'},{av:'Z368DisFasLin'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z457FasCod'},{av:'Z460FasDsc'},{av:'Z7744FasPreObl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'}]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'AV33Profasnot',fld:'vPROFASNOT',pic:''}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'AV33Profasnot',fld:'vPROFASNOT',pic:''}]}");
      setEventMetadata("VALID_DISPARVAL","{handler:'valid_Disparval',iparms:[]");
      setEventMetadata("VALID_DISPARVAL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Disparvl2',iparms:[]");
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
      pr_default.close(29);
      pr_default.close(31);
      pr_default.close(33);
      pr_default.close(17);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z3685DisParVal = "" ;
      Z3686DisParObs = "" ;
      Z12672DisParVl2 = "" ;
      Z13989DisParVMn = "" ;
      Z13990DisParVMx = "" ;
      Z14078DisParPLC = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A460FasDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode517 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Profasnot = "" ;
      A13989DisParVMn = "" ;
      A13990DisParVMx = "" ;
      A14078DisParPLC = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode39 = "" ;
      GXCCtl = "" ;
      A1665ParFasDsc = "" ;
      A12672DisParVl2 = "" ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      T01L67_A407EmprNom = new String[] {""} ;
      T01L67_n407EmprNom = new boolean[] {false} ;
      T01L68_A759ProDsc = new String[] {""} ;
      T01L69_A396EmprCod = new String[] {""} ;
      T01L611_A368DisFasLin = new short[1] ;
      T01L611_A407EmprNom = new String[] {""} ;
      T01L611_n407EmprNom = new boolean[] {false} ;
      T01L611_A759ProDsc = new String[] {""} ;
      T01L611_A460FasDsc = new String[] {""} ;
      T01L611_A7744FasPreObl = new byte[1] ;
      T01L611_n7744FasPreObl = new boolean[] {false} ;
      T01L611_A396EmprCod = new String[] {""} ;
      T01L611_A361DisCod = new int[1] ;
      T01L611_A758ProCod = new String[] {""} ;
      T01L611_A457FasCod = new String[] {""} ;
      T01L610_A460FasDsc = new String[] {""} ;
      T01L610_A7744FasPreObl = new byte[1] ;
      T01L610_n7744FasPreObl = new boolean[] {false} ;
      T01L612_A460FasDsc = new String[] {""} ;
      T01L612_A7744FasPreObl = new byte[1] ;
      T01L612_n7744FasPreObl = new boolean[] {false} ;
      T01L613_A396EmprCod = new String[] {""} ;
      T01L613_A361DisCod = new int[1] ;
      T01L613_A758ProCod = new String[] {""} ;
      T01L613_A368DisFasLin = new short[1] ;
      T01L66_A368DisFasLin = new short[1] ;
      T01L66_A396EmprCod = new String[] {""} ;
      T01L66_A361DisCod = new int[1] ;
      T01L66_A758ProCod = new String[] {""} ;
      T01L66_A457FasCod = new String[] {""} ;
      T01L66_A7744FasPreObl = new byte[1] ;
      T01L66_n7744FasPreObl = new boolean[] {false} ;
      T01L614_A396EmprCod = new String[] {""} ;
      T01L614_A361DisCod = new int[1] ;
      T01L614_A758ProCod = new String[] {""} ;
      T01L614_A368DisFasLin = new short[1] ;
      T01L615_A396EmprCod = new String[] {""} ;
      T01L615_A361DisCod = new int[1] ;
      T01L615_A758ProCod = new String[] {""} ;
      T01L615_A368DisFasLin = new short[1] ;
      T01L65_A368DisFasLin = new short[1] ;
      T01L65_A396EmprCod = new String[] {""} ;
      T01L65_A361DisCod = new int[1] ;
      T01L65_A758ProCod = new String[] {""} ;
      T01L65_A457FasCod = new String[] {""} ;
      T01L65_A7744FasPreObl = new byte[1] ;
      T01L65_n7744FasPreObl = new boolean[] {false} ;
      T01L619_A460FasDsc = new String[] {""} ;
      T01L619_A7744FasPreObl = new byte[1] ;
      T01L619_n7744FasPreObl = new boolean[] {false} ;
      T01L620_A396EmprCod = new String[] {""} ;
      T01L620_A361DisCod = new int[1] ;
      T01L620_A758ProCod = new String[] {""} ;
      T01L620_A368DisFasLin = new short[1] ;
      T01L620_A7919Dta_Ordl = new short[1] ;
      T01L621_A396EmprCod = new String[] {""} ;
      T01L621_A361DisCod = new int[1] ;
      T01L621_A758ProCod = new String[] {""} ;
      T01L621_A368DisFasLin = new short[1] ;
      T01L621_A7727ArtAdiCod = new short[1] ;
      T01L622_A396EmprCod = new String[] {""} ;
      T01L622_A361DisCod = new int[1] ;
      T01L622_A758ProCod = new String[] {""} ;
      T01L622_A368DisFasLin = new short[1] ;
      T01L622_A5377DisQuiLin = new short[1] ;
      T01L623_A396EmprCod = new String[] {""} ;
      T01L623_A361DisCod = new int[1] ;
      T01L623_A758ProCod = new String[] {""} ;
      T01L623_A368DisFasLin = new short[1] ;
      T01L623_A5035A_Discod = new int[1] ;
      T01L623_A5038A_DProcod = new String[] {""} ;
      T01L623_A5039A_DOrdlin = new short[1] ;
      T01L624_A396EmprCod = new String[] {""} ;
      T01L624_A361DisCod = new int[1] ;
      T01L624_A758ProCod = new String[] {""} ;
      T01L624_A368DisFasLin = new short[1] ;
      Z1665ParFasDsc = "" ;
      T01L625_A361DisCod = new int[1] ;
      T01L625_A758ProCod = new String[] {""} ;
      T01L625_A368DisFasLin = new short[1] ;
      T01L625_A1665ParFasDsc = new String[] {""} ;
      T01L625_n1665ParFasDsc = new boolean[] {false} ;
      T01L625_A3685DisParVal = new String[] {""} ;
      T01L625_A3686DisParObs = new String[] {""} ;
      T01L625_A6557DisParOrd = new short[1] ;
      T01L625_A12672DisParVl2 = new String[] {""} ;
      T01L625_A13989DisParVMn = new String[] {""} ;
      T01L625_A13990DisParVMx = new String[] {""} ;
      T01L625_A14078DisParPLC = new String[] {""} ;
      T01L625_A396EmprCod = new String[] {""} ;
      T01L625_A1664ParFasCod = new short[1] ;
      T01L64_A1665ParFasDsc = new String[] {""} ;
      T01L64_n1665ParFasDsc = new boolean[] {false} ;
      T01L626_A1665ParFasDsc = new String[] {""} ;
      T01L626_n1665ParFasDsc = new boolean[] {false} ;
      T01L627_A396EmprCod = new String[] {""} ;
      T01L627_A361DisCod = new int[1] ;
      T01L627_A758ProCod = new String[] {""} ;
      T01L627_A368DisFasLin = new short[1] ;
      T01L627_A1664ParFasCod = new short[1] ;
      T01L63_A361DisCod = new int[1] ;
      T01L63_A758ProCod = new String[] {""} ;
      T01L63_A368DisFasLin = new short[1] ;
      T01L63_A3685DisParVal = new String[] {""} ;
      T01L63_A3686DisParObs = new String[] {""} ;
      T01L63_A6557DisParOrd = new short[1] ;
      T01L63_A12672DisParVl2 = new String[] {""} ;
      T01L63_A13989DisParVMn = new String[] {""} ;
      T01L63_A13990DisParVMx = new String[] {""} ;
      T01L63_A14078DisParPLC = new String[] {""} ;
      T01L63_A396EmprCod = new String[] {""} ;
      T01L63_A1664ParFasCod = new short[1] ;
      T01L62_A361DisCod = new int[1] ;
      T01L62_A758ProCod = new String[] {""} ;
      T01L62_A368DisFasLin = new short[1] ;
      T01L62_A3685DisParVal = new String[] {""} ;
      T01L62_A3686DisParObs = new String[] {""} ;
      T01L62_A6557DisParOrd = new short[1] ;
      T01L62_A12672DisParVl2 = new String[] {""} ;
      T01L62_A13989DisParVMn = new String[] {""} ;
      T01L62_A13990DisParVMx = new String[] {""} ;
      T01L62_A14078DisParPLC = new String[] {""} ;
      T01L62_A396EmprCod = new String[] {""} ;
      T01L62_A1664ParFasCod = new short[1] ;
      T01L631_A1665ParFasDsc = new String[] {""} ;
      T01L631_n1665ParFasDsc = new boolean[] {false} ;
      T01L632_A396EmprCod = new String[] {""} ;
      T01L632_A361DisCod = new int[1] ;
      T01L632_A758ProCod = new String[] {""} ;
      T01L632_A368DisFasLin = new short[1] ;
      T01L632_A1664ParFasCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int3 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int5 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      T01L633_A407EmprNom = new String[] {""} ;
      T01L633_n407EmprNom = new boolean[] {false} ;
      T01L634_A759ProDsc = new String[] {""} ;
      T01L635_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      GXt_char1 = "" ;
      GXv_char8 = new String[1] ;
      ZV33Profasnot = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn08__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn08__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn08__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn08__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn08__default(),
         new Object[] {
             new Object[] {
            T01L62_A361DisCod, T01L62_A758ProCod, T01L62_A368DisFasLin, T01L62_A3685DisParVal, T01L62_A3686DisParObs, T01L62_A6557DisParOrd, T01L62_A12672DisParVl2, T01L62_A13989DisParVMn, T01L62_A13990DisParVMx, T01L62_A14078DisParPLC,
            T01L62_A396EmprCod, T01L62_A1664ParFasCod
            }
            , new Object[] {
            T01L63_A361DisCod, T01L63_A758ProCod, T01L63_A368DisFasLin, T01L63_A3685DisParVal, T01L63_A3686DisParObs, T01L63_A6557DisParOrd, T01L63_A12672DisParVl2, T01L63_A13989DisParVMn, T01L63_A13990DisParVMx, T01L63_A14078DisParPLC,
            T01L63_A396EmprCod, T01L63_A1664ParFasCod
            }
            , new Object[] {
            T01L64_A1665ParFasDsc, T01L64_n1665ParFasDsc
            }
            , new Object[] {
            T01L65_A368DisFasLin, T01L65_A396EmprCod, T01L65_A361DisCod, T01L65_A758ProCod, T01L65_A457FasCod, T01L65_A7744FasPreObl, T01L65_n7744FasPreObl
            }
            , new Object[] {
            T01L66_A368DisFasLin, T01L66_A396EmprCod, T01L66_A361DisCod, T01L66_A758ProCod, T01L66_A457FasCod, T01L66_A7744FasPreObl, T01L66_n7744FasPreObl
            }
            , new Object[] {
            T01L67_A407EmprNom, T01L67_n407EmprNom
            }
            , new Object[] {
            T01L68_A759ProDsc
            }
            , new Object[] {
            T01L69_A396EmprCod
            }
            , new Object[] {
            T01L610_A460FasDsc, T01L610_A7744FasPreObl, T01L610_n7744FasPreObl
            }
            , new Object[] {
            T01L611_A368DisFasLin, T01L611_A407EmprNom, T01L611_n407EmprNom, T01L611_A759ProDsc, T01L611_A460FasDsc, T01L611_A7744FasPreObl, T01L611_n7744FasPreObl, T01L611_A396EmprCod, T01L611_A361DisCod, T01L611_A758ProCod,
            T01L611_A457FasCod
            }
            , new Object[] {
            T01L612_A460FasDsc, T01L612_A7744FasPreObl, T01L612_n7744FasPreObl
            }
            , new Object[] {
            T01L613_A396EmprCod, T01L613_A361DisCod, T01L613_A758ProCod, T01L613_A368DisFasLin
            }
            , new Object[] {
            T01L614_A396EmprCod, T01L614_A361DisCod, T01L614_A758ProCod, T01L614_A368DisFasLin
            }
            , new Object[] {
            T01L615_A396EmprCod, T01L615_A361DisCod, T01L615_A758ProCod, T01L615_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L619_A460FasDsc, T01L619_A7744FasPreObl, T01L619_n7744FasPreObl
            }
            , new Object[] {
            T01L620_A396EmprCod, T01L620_A361DisCod, T01L620_A758ProCod, T01L620_A368DisFasLin, T01L620_A7919Dta_Ordl
            }
            , new Object[] {
            T01L621_A396EmprCod, T01L621_A361DisCod, T01L621_A758ProCod, T01L621_A368DisFasLin, T01L621_A7727ArtAdiCod
            }
            , new Object[] {
            T01L622_A396EmprCod, T01L622_A361DisCod, T01L622_A758ProCod, T01L622_A368DisFasLin, T01L622_A5377DisQuiLin
            }
            , new Object[] {
            T01L623_A396EmprCod, T01L623_A361DisCod, T01L623_A758ProCod, T01L623_A368DisFasLin, T01L623_A5035A_Discod, T01L623_A5038A_DProcod, T01L623_A5039A_DOrdlin
            }
            , new Object[] {
            T01L624_A396EmprCod, T01L624_A361DisCod, T01L624_A758ProCod, T01L624_A368DisFasLin
            }
            , new Object[] {
            T01L625_A361DisCod, T01L625_A758ProCod, T01L625_A368DisFasLin, T01L625_A1665ParFasDsc, T01L625_n1665ParFasDsc, T01L625_A3685DisParVal, T01L625_A3686DisParObs, T01L625_A6557DisParOrd, T01L625_A12672DisParVl2, T01L625_A13989DisParVMn,
            T01L625_A13990DisParVMx, T01L625_A14078DisParPLC, T01L625_A396EmprCod, T01L625_A1664ParFasCod
            }
            , new Object[] {
            T01L626_A1665ParFasDsc, T01L626_n1665ParFasDsc
            }
            , new Object[] {
            T01L627_A396EmprCod, T01L627_A361DisCod, T01L627_A758ProCod, T01L627_A368DisFasLin, T01L627_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L631_A1665ParFasDsc, T01L631_n1665ParFasDsc
            }
            , new Object[] {
            T01L632_A396EmprCod, T01L632_A361DisCod, T01L632_A758ProCod, T01L632_A368DisFasLin, T01L632_A1664ParFasCod
            }
            , new Object[] {
            T01L633_A407EmprNom, T01L633_n407EmprNom
            }
            , new Object[] {
            T01L634_A759ProDsc
            }
            , new Object[] {
            T01L635_A396EmprCod
            }
         }
      );
      Z368DisFasLin = (short)(0) ;
      A368DisFasLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte AV34Flag_not ;
   private byte nKeyPressed ;
   private byte A7744FasPreObl ;
   private byte Z7744FasPreObl ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ7744FasPreObl ;
   private short wcpOA368DisFasLin ;
   private short Z368DisFasLin ;
   private short Z1664ParFasCod ;
   private short Z6557DisParOrd ;
   private short nRcdDeleted_517 ;
   private short nRcdExists_517 ;
   private short nIsMod_517 ;
   private short A368DisFasLin ;
   private short A1664ParFasCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount517 ;
   private short RcdFound517 ;
   private short nBlankRcdUsr517 ;
   private short A6557DisParOrd ;
   private short RcdFound39 ;
   private short nIsDirty_39 ;
   private short nIsDirty_517 ;
   private short GXv_int6[] ;
   private short GXv_int5[] ;
   private short ZZ368DisFasLin ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtavnRcdDeleted_517_Enabled ;
   private int edtParFasCod_Enabled ;
   private int edtParFasDsc_Enabled ;
   private int edtDisParVal_Enabled ;
   private int edtDisParObs_Enabled ;
   private int edtDisParOrd_Enabled ;
   private int edtDisParVl2_Enabled ;
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
   private int defedtParFasCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtDisFasLin_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int3[] ;
   private int ZZ361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z3685DisParVal ;
   private String Z3686DisParObs ;
   private String Z12672DisParVl2 ;
   private String Z13989DisParVMn ;
   private String Z13990DisParVMx ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisFasLin_Internalname ;
   private String edtDisFasLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String sMode517 ;
   private String edtavnRcdDeleted_517_Internalname ;
   private String edtParFasCod_Internalname ;
   private String edtParFasDsc_Internalname ;
   private String edtDisParVal_Internalname ;
   private String edtDisParObs_Internalname ;
   private String edtDisParOrd_Internalname ;
   private String edtDisParVl2_Internalname ;
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
   private String A13989DisParVMn ;
   private String A13990DisParVMx ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode39 ;
   private String GXCCtl ;
   private String A1665ParFasDsc ;
   private String A12672DisParVl2 ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z1665ParFasDsc ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_517_Jsonclick ;
   private String edtParFasCod_Jsonclick ;
   private String edtParFasDsc_Jsonclick ;
   private String edtDisParVal_Jsonclick ;
   private String edtDisParObs_Jsonclick ;
   private String edtDisParOrd_Jsonclick ;
   private String edtDisParVl2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private String GXt_char1 ;
   private String GXv_char8[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean n407EmprNom ;
   private boolean n1665ParFasDsc ;
   private boolean Gx_longc ;
   private String AV33Profasnot ;
   private String ZV33Profasnot ;
   private String Z14078DisParPLC ;
   private String A14078DisParPLC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01L67_A407EmprNom ;
   private boolean[] T01L67_n407EmprNom ;
   private String[] T01L68_A759ProDsc ;
   private String[] T01L69_A396EmprCod ;
   private short[] T01L611_A368DisFasLin ;
   private String[] T01L611_A407EmprNom ;
   private boolean[] T01L611_n407EmprNom ;
   private String[] T01L611_A759ProDsc ;
   private String[] T01L611_A460FasDsc ;
   private byte[] T01L611_A7744FasPreObl ;
   private boolean[] T01L611_n7744FasPreObl ;
   private String[] T01L611_A396EmprCod ;
   private int[] T01L611_A361DisCod ;
   private String[] T01L611_A758ProCod ;
   private String[] T01L611_A457FasCod ;
   private String[] T01L610_A460FasDsc ;
   private byte[] T01L610_A7744FasPreObl ;
   private boolean[] T01L610_n7744FasPreObl ;
   private String[] T01L612_A460FasDsc ;
   private byte[] T01L612_A7744FasPreObl ;
   private boolean[] T01L612_n7744FasPreObl ;
   private String[] T01L613_A396EmprCod ;
   private int[] T01L613_A361DisCod ;
   private String[] T01L613_A758ProCod ;
   private short[] T01L613_A368DisFasLin ;
   private short[] T01L66_A368DisFasLin ;
   private String[] T01L66_A396EmprCod ;
   private int[] T01L66_A361DisCod ;
   private String[] T01L66_A758ProCod ;
   private String[] T01L66_A457FasCod ;
   private byte[] T01L66_A7744FasPreObl ;
   private boolean[] T01L66_n7744FasPreObl ;
   private String[] T01L614_A396EmprCod ;
   private int[] T01L614_A361DisCod ;
   private String[] T01L614_A758ProCod ;
   private short[] T01L614_A368DisFasLin ;
   private String[] T01L615_A396EmprCod ;
   private int[] T01L615_A361DisCod ;
   private String[] T01L615_A758ProCod ;
   private short[] T01L615_A368DisFasLin ;
   private short[] T01L65_A368DisFasLin ;
   private String[] T01L65_A396EmprCod ;
   private int[] T01L65_A361DisCod ;
   private String[] T01L65_A758ProCod ;
   private String[] T01L65_A457FasCod ;
   private byte[] T01L65_A7744FasPreObl ;
   private boolean[] T01L65_n7744FasPreObl ;
   private String[] T01L619_A460FasDsc ;
   private byte[] T01L619_A7744FasPreObl ;
   private boolean[] T01L619_n7744FasPreObl ;
   private String[] T01L620_A396EmprCod ;
   private int[] T01L620_A361DisCod ;
   private String[] T01L620_A758ProCod ;
   private short[] T01L620_A368DisFasLin ;
   private short[] T01L620_A7919Dta_Ordl ;
   private String[] T01L621_A396EmprCod ;
   private int[] T01L621_A361DisCod ;
   private String[] T01L621_A758ProCod ;
   private short[] T01L621_A368DisFasLin ;
   private short[] T01L621_A7727ArtAdiCod ;
   private String[] T01L622_A396EmprCod ;
   private int[] T01L622_A361DisCod ;
   private String[] T01L622_A758ProCod ;
   private short[] T01L622_A368DisFasLin ;
   private short[] T01L622_A5377DisQuiLin ;
   private String[] T01L623_A396EmprCod ;
   private int[] T01L623_A361DisCod ;
   private String[] T01L623_A758ProCod ;
   private short[] T01L623_A368DisFasLin ;
   private int[] T01L623_A5035A_Discod ;
   private String[] T01L623_A5038A_DProcod ;
   private short[] T01L623_A5039A_DOrdlin ;
   private String[] T01L624_A396EmprCod ;
   private int[] T01L624_A361DisCod ;
   private String[] T01L624_A758ProCod ;
   private short[] T01L624_A368DisFasLin ;
   private int[] T01L625_A361DisCod ;
   private String[] T01L625_A758ProCod ;
   private short[] T01L625_A368DisFasLin ;
   private String[] T01L625_A1665ParFasDsc ;
   private boolean[] T01L625_n1665ParFasDsc ;
   private String[] T01L625_A3685DisParVal ;
   private String[] T01L625_A3686DisParObs ;
   private short[] T01L625_A6557DisParOrd ;
   private String[] T01L625_A12672DisParVl2 ;
   private String[] T01L625_A13989DisParVMn ;
   private String[] T01L625_A13990DisParVMx ;
   private String[] T01L625_A14078DisParPLC ;
   private String[] T01L625_A396EmprCod ;
   private short[] T01L625_A1664ParFasCod ;
   private String[] T01L64_A1665ParFasDsc ;
   private boolean[] T01L64_n1665ParFasDsc ;
   private String[] T01L626_A1665ParFasDsc ;
   private boolean[] T01L626_n1665ParFasDsc ;
   private String[] T01L627_A396EmprCod ;
   private int[] T01L627_A361DisCod ;
   private String[] T01L627_A758ProCod ;
   private short[] T01L627_A368DisFasLin ;
   private short[] T01L627_A1664ParFasCod ;
   private int[] T01L63_A361DisCod ;
   private String[] T01L63_A758ProCod ;
   private short[] T01L63_A368DisFasLin ;
   private String[] T01L63_A3685DisParVal ;
   private String[] T01L63_A3686DisParObs ;
   private short[] T01L63_A6557DisParOrd ;
   private String[] T01L63_A12672DisParVl2 ;
   private String[] T01L63_A13989DisParVMn ;
   private String[] T01L63_A13990DisParVMx ;
   private String[] T01L63_A14078DisParPLC ;
   private String[] T01L63_A396EmprCod ;
   private short[] T01L63_A1664ParFasCod ;
   private int[] T01L62_A361DisCod ;
   private String[] T01L62_A758ProCod ;
   private short[] T01L62_A368DisFasLin ;
   private String[] T01L62_A3685DisParVal ;
   private String[] T01L62_A3686DisParObs ;
   private short[] T01L62_A6557DisParOrd ;
   private String[] T01L62_A12672DisParVl2 ;
   private String[] T01L62_A13989DisParVMn ;
   private String[] T01L62_A13990DisParVMx ;
   private String[] T01L62_A14078DisParPLC ;
   private String[] T01L62_A396EmprCod ;
   private short[] T01L62_A1664ParFasCod ;
   private String[] T01L631_A1665ParFasDsc ;
   private boolean[] T01L631_n1665ParFasDsc ;
   private String[] T01L632_A396EmprCod ;
   private int[] T01L632_A361DisCod ;
   private String[] T01L632_A758ProCod ;
   private short[] T01L632_A368DisFasLin ;
   private short[] T01L632_A1664ParFasCod ;
   private String[] T01L633_A407EmprNom ;
   private boolean[] T01L633_n407EmprNom ;
   private String[] T01L634_A759ProDsc ;
   private String[] T01L635_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn08__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn08__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn08__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn08__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn08__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01L62", "SELECT DisCod, ProCod, DisFasLin, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?  FOR UPDATE OF DisParVal, DisParObs, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L63", "SELECT DisCod, ProCod, DisFasLin, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC, EmprCod, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L64", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L65", "SELECT DisFasLin, EmprCod, DisCod, ProCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L66", "SELECT DisFasLin, EmprCod, DisCod, ProCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L67", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L68", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L69", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L610", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L611", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisFasLin, T2.EmprNom, T3.ProDsc, T4.FasDsc, TM1.FasPreObl, TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.FasCod FROM (((TXPDISFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = TM1.EmprCod AND T4.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? and TM1.DisFasLin = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.DisFasLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L612", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L613", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L614", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L615", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC, DisFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01L616", "INSERT INTO TXPDISFAS(FasPreObl, DisFasLin, EmprCod, DisCod, ProCod, FasCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01L617", "UPDATE TXPDISFAS SET FasPreObl=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01L618", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01L619", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L620", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L621", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L622", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L623", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L624", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L625", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T2.ParFasDsc, T1.DisParVal, T1.DisParObs, T1.DisParOrd, T1.DisParVl2, T1.DisParVMn, T1.DisParVMx, T1.DisParPLC, T1.EmprCod, T1.ParFasCod FROM (TXPDISPAR T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L626", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L627", "SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L628", "INSERT INTO TXPDISPAR(DisCod, ProCod, DisFasLin, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC, EmprCod, ParFasCod, DisParTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPDISPAR")
         ,new UpdateCursor("T01L629", "UPDATE TXPDISPAR SET DisParVal=?, DisParObs=?, DisParOrd=?, DisParVl2=?, DisParVMn=?, DisParVMx=?, DisParPLC=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?", GX_NOMASK, "TXPDISPAR")
         ,new UpdateCursor("T01L630", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ParFasCod = ?", GX_NOMASK, "TXPDISPAR")
         ,new ForEachCursor("T01L631", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L632", "SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L633", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L634", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L635", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 60);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((String[]) buf[9])[0] = rslt.getString(9, 12);
               ((String[]) buf[10])[0] = rslt.getString(10, 12);
               ((String[]) buf[11])[0] = rslt.getVarchar(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 33 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 8);
               stmt.setString(6, (String)parms[6], 8);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 8);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setString(9, (String)parms[8], 12);
               stmt.setVarchar(10, (String)parms[9], 100, false);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setVarchar(7, (String)parms[6], 100, false);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

