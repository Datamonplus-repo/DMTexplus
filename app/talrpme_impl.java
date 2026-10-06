package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talrpme_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"ALBRECCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx13asaalbreccodWD299( A396EmprCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4800AlRPieBarC = (int)(GXutil.lval( httpContext.GetPar( "AlRPieBarC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = (byte)(GXutil.lval( httpContext.GetPar( "AlRPieBarR"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = httpContext.GetPar( "AlRPieBarP") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A4800AlRPieBarC, A4801AlRPieBarR, A4802AlRPieBarP) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4395AlRDefCod = (short)(GXutil.lval( httpContext.GetPar( "AlRDefCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_34( A396EmprCod, A4395AlRDefCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
      {
         gxnrgrid3_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Defectos de Piezas (Mtrs)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRecPie_Internalname ;
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
      nRC_GXsfl_160 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_160"))) ;
      nGXsfl_160_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_160_idx"))) ;
      sGXsfl_160_idx = httpContext.GetPar( "sGXsfl_160_idx") ;
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
      nRC_GXsfl_212 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_212"))) ;
      nGXsfl_212_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_212_idx"))) ;
      sGXsfl_212_idx = httpContext.GetPar( "sGXsfl_212_idx") ;
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

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_220 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_220"))) ;
      nGXsfl_220_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_220_idx"))) ;
      sGXsfl_220_idx = httpContext.GetPar( "sGXsfl_220_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid3_newrow( ) ;
      /* End function gxnrGrid3_newrow_invoke */
   }

   public talrpme_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talrpme_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talrpme_impl.class ));
   }

   public talrpme_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TAlRPMe.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "AlbRecPie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie), GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecPie_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecPie_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Mts Ent", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecMtr_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Kgs Ent", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecKgm_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Calidad", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieCla_Internalname, GXutil.ltrim( localUtil.ntoc( A4794AlRPieCla, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieCla_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4794AlRPieCla), "99") : localUtil.format( DecimalUtil.doubleToDec(A4794AlRPieCla), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieCla_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieCla_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Calidad", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieCal_Internalname, GXutil.rtrim( A4795AlRPieCal), GXutil.rtrim( localUtil.format( A4795AlRPieCal, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieCal_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieCal_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Calidad Automática", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieClaA_Internalname, GXutil.ltrim( localUtil.ntoc( A4796AlRPieClaA, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieClaA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4796AlRPieClaA), "99") : localUtil.format( DecimalUtil.doubleToDec(A4796AlRPieClaA), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieClaA_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieClaA_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Calidad del Crudo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieClaC_Internalname, GXutil.rtrim( A4797AlRPieClaC), GXutil.rtrim( localUtil.format( A4797AlRPieClaC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieClaC_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieClaC_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Calidad Manual", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieClaM_Internalname, GXutil.ltrim( localUtil.ntoc( A4798AlRPieClaM, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieClaM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4798AlRPieClaM), "99") : localUtil.format( DecimalUtil.doubleToDec(A4798AlRPieClaM), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieClaM_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieClaM_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultimo Control", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieUltC_Internalname, GXutil.rtrim( A4799AlRPieUltC), GXutil.rtrim( localUtil.format( A4799AlRPieUltC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieUltC_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieUltC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Barcada Actual de la Pieza", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieBarC_Internalname, GXutil.ltrim( localUtil.ntoc( A4800AlRPieBarC, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieBarC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4800AlRPieBarC), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4800AlRPieBarC), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieBarC_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieBarC_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Reopero Actual de la Pieza", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieBarR_Internalname, GXutil.ltrim( localUtil.ntoc( A4801AlRPieBarR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieBarR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4801AlRPieBarR), "9") : localUtil.format( DecimalUtil.doubleToDec(A4801AlRPieBarR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieBarR_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieBarR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Partición Actual de la Pieza", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieBarP_Internalname, GXutil.rtrim( A4802AlRPieBarP), GXutil.rtrim( localUtil.format( A4802AlRPieBarP, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieBarP_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieBarP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Fase Actual de la Pieza", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieFasC_Internalname, GXutil.rtrim( A4803AlRPieFasC), GXutil.rtrim( localUtil.format( A4803AlRPieFasC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieFasC_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieFasC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Linea Actual de Proceso", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieFasL_Internalname, GXutil.ltrim( localUtil.ntoc( A4804AlRPieFasL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieFasL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4804AlRPieFasL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4804AlRPieFasL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieFasL_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieFasL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Clasificación Pedida", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlrPieCalP_Internalname, GXutil.rtrim( A4831AlrPieCalP), GXutil.rtrim( localUtil.format( A4831AlrPieCalP, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlrPieCalP_Jsonclick, 0, "", "", "", "", "", 1, edtAlrPieCalP_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Metros Actuales", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlrPieMtrA_Internalname, GXutil.ltrim( localUtil.ntoc( A5259AlrPieMtrA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlrPieMtrA_Enabled!=0) ? localUtil.format( A5259AlrPieMtrA, "ZZZZZ9.99") : localUtil.format( A5259AlrPieMtrA, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlrPieMtrA_Jsonclick, 0, "", "", "", "", "", 1, edtAlrPieMtrA_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Kilos Actuales", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlrPieKgmA_Internalname, GXutil.ltrim( localUtil.ntoc( A5260AlrPieKgmA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlrPieKgmA_Enabled!=0) ? localUtil.format( A5260AlrPieKgmA, "ZZZZZ9.99") : localUtil.format( A5260AlrPieKgmA, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlrPieKgmA_Jsonclick, 0, "", "", "", "", "", 1, edtAlrPieKgmA_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Total de Defectos", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieDefT_Internalname, GXutil.ltrim( localUtil.ntoc( A4805AlRPieDefT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieDefT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4805AlRPieDefT), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4805AlRPieDefT), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieDefT_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieDefT_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Total Defectos de Crudo", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRPieDefC_Internalname, GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlRPieDefC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4806AlRPieDefC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4806AlRPieDefC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRPieDefC_Jsonclick, 0, "", "", "", "", "", 1, edtAlRPieDefC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Exportada Sistema 1", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRExp1_Internalname, GXutil.rtrim( A4807AlRExp1), GXutil.rtrim( localUtil.format( A4807AlRExp1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRExp1_Jsonclick, 0, "", "", "", "", "", 1, edtAlRExp1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Exportada Sistema 2", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlRExp2_Internalname, GXutil.rtrim( A4808AlRExp2), GXutil.rtrim( localUtil.format( A4808AlRExp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlRExp2_Jsonclick, 0, "", "", "", "", "", 1, edtAlRExp2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Destino Empesa", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Código de Procedencia", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Nombre Procedencia", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Identificacion Pieza", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecIdPz_Internalname, GXutil.rtrim( A3731AlbRecIdPz), GXutil.rtrim( localUtil.format( A3731AlbRecIdPz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecIdPz_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecIdPz_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlRPMe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol160( ) ;
      /* Save parent mode. */
      sMode665 = Gx_mode ;
      nGXsfl_160_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount665 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_665 = (short)(1) ;
            scanStartWD665( ) ;
            while ( RcdFound665 != 0 )
            {
               init_level_properties665( ) ;
               getByPrimaryKeyWD665( ) ;
               addRowWD665( ) ;
               scanNextWD665( ) ;
            }
            scanEndWD665( ) ;
            nBlankRcdCount665 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4806AlRPieDefC = A4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         B4805AlRPieDefT = A4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         standaloneNotModalWD665( ) ;
         standaloneModalWD665( ) ;
         sMode665 = Gx_mode ;
         while ( nGXsfl_160_idx < nRC_GXsfl_160 )
         {
            bGXsfl_160_Refreshing = true ;
            readRowWD665( ) ;
            edtAlRDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCOD_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRDefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFDSC_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefDsc_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFASCOD_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFasCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRDefPnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFPNT_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefPnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefPnt_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRDefCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCNT_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCnt_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEF_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDef_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRDefAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFACA_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefAca_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlRDefCru_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCRU_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCru_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtAlrDefPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFPRI_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlrDefPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefPri_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            if ( ( nRcdExists_665 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalWD665( ) ;
            }
            sendRowWD665( ) ;
            bGXsfl_160_Refreshing = false ;
         }
         Gx_mode = sMode665 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4806AlRPieDefC = B4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         A4805AlRPieDefT = B4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount665 = (short)(5) ;
         nRcdExists_665 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartWD665( ) ;
            while ( RcdFound665 != 0 )
            {
               sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_160665( ) ;
               init_level_properties665( ) ;
               standaloneNotModalWD665( ) ;
               getByPrimaryKeyWD665( ) ;
               standaloneModalWD665( ) ;
               addRowWD665( ) ;
               scanNextWD665( ) ;
            }
            scanEndWD665( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode665 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_160665( ) ;
      initAllWD665( ) ;
      init_level_properties665( ) ;
      B4806AlRPieDefC = A4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      B4805AlRPieDefT = A4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      nRcdExists_665 = (short)(0) ;
      nIsMod_665 = (short)(0) ;
      nRcdDeleted_665 = (short)(0) ;
      nBlankRcdCount665 = (short)(nBlankRcdUsr665+nBlankRcdCount665) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount665 > 0 )
      {
         standaloneNotModalWD665( ) ;
         standaloneModalWD665( ) ;
         addRowWD665( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlRDefCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount665 = (short)(nBlankRcdCount665-1) ;
      }
      Gx_mode = sMode665 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4806AlRPieDefC = B4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      A4805AlRPieDefT = B4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      /* Restore parent mode. */
      Gx_mode = sMode665 ;
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
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol220( ) ;
      nGXsfl_220_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount770 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_770 = (short)(1) ;
            scanStartWD770( ) ;
            while ( RcdFound770 != 0 )
            {
               init_level_properties770( ) ;
               getByPrimaryKeyWD770( ) ;
               addRowWD770( ) ;
               scanNextWD770( ) ;
            }
            scanEndWD770( ) ;
            nBlankRcdCount770 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4806AlRPieDefC = A4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         B4805AlRPieDefT = A4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         standaloneNotModalWD770( ) ;
         standaloneModalWD770( ) ;
         sMode770 = Gx_mode ;
         while ( nGXsfl_220_idx < nRC_GXsfl_220 )
         {
            bGXsfl_220_Refreshing = true ;
            readRowWD770( ) ;
            edtavnRcdDeleted_770_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_770_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_770_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_770_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecEvt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECEVT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecEvt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecEvt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREBARCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREBarCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREBarCodR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREBARCODR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREBarCodR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREBarCodR_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREBarCodP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREBARCODP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREBarCodP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREBarCodP_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREFCH_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREFch_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREDSC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREDsc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREPROCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREProCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREFASCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREFasCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREAlbProC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREALBPROC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREAlbProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREAlbProC_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREAlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREALMCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREAlmCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtARETip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARETIP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtARETip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtARETip_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREKGM_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREKgm_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREMTR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREMtr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREART_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREArt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAREUsu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREUSU_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAREUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREUsu_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            if ( ( nRcdExists_770 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalWD770( ) ;
            }
            sendRowWD770( ) ;
            bGXsfl_220_Refreshing = false ;
         }
         Gx_mode = sMode770 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4806AlRPieDefC = B4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         A4805AlRPieDefT = B4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount770 = (short)(5) ;
         nRcdExists_770 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartWD770( ) ;
            while ( RcdFound770 != 0 )
            {
               sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_220770( ) ;
               init_level_properties770( ) ;
               standaloneNotModalWD770( ) ;
               getByPrimaryKeyWD770( ) ;
               standaloneModalWD770( ) ;
               addRowWD770( ) ;
               scanNextWD770( ) ;
            }
            scanEndWD770( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode770 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_220770( ) ;
      initAllWD770( ) ;
      init_level_properties770( ) ;
      B4806AlRPieDefC = A4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      B4805AlRPieDefT = A4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      nRcdExists_770 = (short)(0) ;
      nIsMod_770 = (short)(0) ;
      nRcdDeleted_770 = (short)(0) ;
      nBlankRcdCount770 = (short)(nBlankRcdUsr770+nBlankRcdCount770) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount770 > 0 )
      {
         standaloneNotModalWD770( ) ;
         standaloneModalWD770( ) ;
         addRowWD770( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbRecEvt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount770 = (short)(nBlankRcdCount770-1) ;
      }
      Gx_mode = sMode770 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4806AlRPieDefC = B4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      A4805AlRPieDefT = B4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container, subGrid3_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 242,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlRPMe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TAlRPMe.htm");
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
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2159AlbRecPie = httpContext.cgiGet( "Z2159AlbRecPie") ;
         Z4795AlRPieCal = httpContext.cgiGet( "Z4795AlRPieCal") ;
         Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( "Z2157AlbRecMtr")) ;
         Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( "Z2155AlbRecKgm")) ;
         Z4798AlRPieClaM = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4798AlRPieClaM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4799AlRPieUltC = httpContext.cgiGet( "Z4799AlRPieUltC") ;
         Z4807AlRExp1 = httpContext.cgiGet( "Z4807AlRExp1") ;
         Z4808AlRExp2 = httpContext.cgiGet( "Z4808AlRExp2") ;
         Z3731AlbRecIdPz = httpContext.cgiGet( "Z3731AlbRecIdPz") ;
         O4806AlRPieDefC = (int)(localUtil.ctol( httpContext.cgiGet( "O4806AlRPieDefC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O4805AlRPieDefT = (int)(localUtil.ctol( httpContext.cgiGet( "O4805AlRPieDefT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_160 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_160"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_220 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_220"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrimstr( A2157AlbRecMtr, 9, 2));
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrimstr( A2155AlbRecKgm, 9, 2));
         A4794AlRPieCla = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlRPieCla_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         A4795AlRPieCal = httpContext.cgiGet( edtAlRPieCal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
         A4796AlRPieClaA = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlRPieClaA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         A4797AlRPieClaC = httpContext.cgiGet( edtAlRPieClaC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlRPieClaM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlRPieClaM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALRPIECLAM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlRPieClaM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4798AlRPieClaM = (byte)(0) ;
            n4798AlRPieClaM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4798AlRPieClaM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4798AlRPieClaM), 2, 0));
         }
         else
         {
            A4798AlRPieClaM = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlRPieClaM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4798AlRPieClaM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4798AlRPieClaM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4798AlRPieClaM), 2, 0));
         }
         A4799AlRPieUltC = httpContext.cgiGet( edtAlRPieUltC_Internalname) ;
         n4799AlRPieUltC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4799AlRPieUltC", A4799AlRPieUltC);
         A4800AlRPieBarC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRPieBarC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlRPieBarR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = httpContext.cgiGet( edtAlRPieBarP_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4803AlRPieFasC = httpContext.cgiGet( edtAlRPieFasC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4803AlRPieFasC", A4803AlRPieFasC);
         A4804AlRPieFasL = (short)(localUtil.ctol( httpContext.cgiGet( edtAlRPieFasL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4804AlRPieFasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4804AlRPieFasL), 4, 0));
         A4831AlrPieCalP = httpContext.cgiGet( edtAlrPieCalP_Internalname) ;
         n4831AlrPieCalP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
         A5259AlrPieMtrA = localUtil.ctond( httpContext.cgiGet( edtAlrPieMtrA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5259AlrPieMtrA", GXutil.ltrimstr( A5259AlrPieMtrA, 9, 2));
         A5260AlrPieKgmA = localUtil.ctond( httpContext.cgiGet( edtAlrPieKgmA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5260AlrPieKgmA", GXutil.ltrimstr( A5260AlrPieKgmA, 9, 2));
         A4805AlRPieDefT = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRPieDefT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRPieDefC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         A4807AlRExp1 = httpContext.cgiGet( edtAlRExp1_Internalname) ;
         n4807AlRExp1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4807AlRExp1", A4807AlRExp1);
         A4808AlRExp2 = httpContext.cgiGet( edtAlRExp2_Internalname) ;
         n4808AlRExp2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4808AlRExp2", A4808AlRExp2);
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A3731AlbRecIdPz = httpContext.cgiGet( edtAlbRecIdPz_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3731AlbRecIdPz", A3731AlbRecIdPz);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TAlRPMe");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrimstr( A2157AlbRecMtr, 9, 2));
         forbiddenHiddens.add("AlbRecMtr", localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"));
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrimstr( A2155AlbRecKgm, 9, 2));
         forbiddenHiddens.add("AlbRecKgm", localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("talrpme:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
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
            initAllWD299( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_955_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_955_Enabled), 5, 0), !bGXsfl_212_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_770_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_770_Enabled), 5, 0), !bGXsfl_220_Refreshing);
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
      disableAttributesWD299( ) ;
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

   public void confirm_WD0( )
   {
      beforeValidateWD299( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsWD299( ) ;
         }
         else
         {
            checkExtendedTableWD299( ) ;
            if ( AnyError == 0 )
            {
               zmWD299( 27) ;
               zmWD299( 28) ;
               zmWD299( 29) ;
               zmWD299( 30) ;
               zmWD299( 31) ;
               zmWD299( 32) ;
            }
            closeExtendedTableCursorsWD299( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode299 = Gx_mode ;
         confirm_WD665( ) ;
         if ( AnyError == 0 )
         {
            confirm_WD770( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode299 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesWD0( ) ;
      }
   }

   public void confirm_WD770( )
   {
      nGXsfl_220_idx = 0 ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         readRowWD770( ) ;
         if ( ( nRcdExists_770 != 0 ) || ( nIsMod_770 != 0 ) )
         {
            getKeyWD770( ) ;
            if ( ( nRcdExists_770 == 0 ) && ( nRcdDeleted_770 == 0 ) )
            {
               if ( RcdFound770 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateWD770( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableWD770( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsWD770( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALBRECEVT_" + sGXsfl_220_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecEvt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound770 != 0 )
               {
                  if ( nRcdDeleted_770 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyWD770( ) ;
                     loadWD770( ) ;
                     beforeValidateWD770( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsWD770( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_770 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateWD770( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableWD770( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsWD770( ) ;
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
                  if ( nRcdDeleted_770 == 0 )
                  {
                     GXCCtl = "ALBRECEVT_" + sGXsfl_220_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecEvt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_770_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecEvt_Internalname, GXutil.ltrim( localUtil.ntoc( A5262AlbRecEvt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5263AREBarCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREBarCodR_Internalname, GXutil.ltrim( localUtil.ntoc( A5264AREBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREBarCodP_Internalname, GXutil.rtrim( A5265AREBarCodP)) ;
         httpContext.changePostValue( edtAREFch_Internalname, localUtil.ttoc( A5266AREFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtAREDsc_Internalname, A5267AREDsc) ;
         httpContext.changePostValue( edtAREProCod_Internalname, GXutil.rtrim( A5268AREProCod)) ;
         httpContext.changePostValue( edtAREFasCod_Internalname, GXutil.rtrim( A5269AREFasCod)) ;
         httpContext.changePostValue( edtAREAlbProC_Internalname, GXutil.ltrim( localUtil.ntoc( A5270AREAlbProC, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREAlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5271AREAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtARETip_Internalname, GXutil.rtrim( A5272ARETip)) ;
         httpContext.changePostValue( edtAREKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A5273AREKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A5274AREMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREArt_Internalname, GXutil.rtrim( A5275AREArt)) ;
         httpContext.changePostValue( edtAREUsu_Internalname, GXutil.rtrim( A5276AREUsu)) ;
         httpContext.changePostValue( "ZT_"+"Z5262AlbRecEvt_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5262AlbRecEvt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5263AREBarCod_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5263AREBarCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5264AREBarCodR_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5264AREBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5265AREBarCodP_"+sGXsfl_220_idx, GXutil.rtrim( Z5265AREBarCodP)) ;
         httpContext.changePostValue( "ZT_"+"Z5266AREFch_"+sGXsfl_220_idx, localUtil.ttoc( Z5266AREFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5268AREProCod_"+sGXsfl_220_idx, GXutil.rtrim( Z5268AREProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5269AREFasCod_"+sGXsfl_220_idx, GXutil.rtrim( Z5269AREFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5270AREAlbProC_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5270AREAlbProC, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5271AREAlmCod_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5271AREAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5272ARETip_"+sGXsfl_220_idx, GXutil.rtrim( Z5272ARETip)) ;
         httpContext.changePostValue( "ZT_"+"Z5273AREKgm_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5273AREKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5274AREMtr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5274AREMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5275AREArt_"+sGXsfl_220_idx, GXutil.rtrim( Z5275AREArt)) ;
         httpContext.changePostValue( "ZT_"+"Z5276AREUsu_"+sGXsfl_220_idx, GXutil.rtrim( Z5276AREUsu)) ;
         httpContext.changePostValue( "nRcdDeleted_770_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_770_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_770_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_770 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_770_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_770_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECEVT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecEvt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREBARCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREBARCODR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREBARCODP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREFCH_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREDSC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREPROCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREFASCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREALBPROC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlbProC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREALMCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARETIP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtARETip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREKGM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREMTR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREART_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREUSU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREUsu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_WD955( )
   {
      nGXsfl_212_idx = 0 ;
      while ( nGXsfl_212_idx < nRC_GXsfl_212 )
      {
         readRowWD955( ) ;
         if ( ( nRcdExists_955 != 0 ) || ( nIsMod_955 != 0 ) )
         {
            getKeyWD955( ) ;
            if ( ( nRcdExists_955 == 0 ) && ( nRcdDeleted_955 == 0 ) )
            {
               if ( RcdFound955 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateWD955( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableWD955( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsWD955( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlRDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound955 != 0 )
               {
                  if ( nRcdDeleted_955 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyWD955( ) ;
                     loadWD955( ) ;
                     beforeValidateWD955( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsWD955( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_955 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateWD955( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableWD955( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsWD955( ) ;
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
                  if ( nRcdDeleted_955 == 0 )
                  {
                     GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlRDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_955_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlrDefMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A6683AlrDefMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefCDe_Internalname, GXutil.ltrim( localUtil.ntoc( A6684AlRDefCDe, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefMtf_Internalname, GXutil.ltrim( localUtil.ntoc( A12910AlRDefMtf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6683AlrDefMtr_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( Z6683AlrDefMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6684AlRDefCDe_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( Z6684AlRDefCDe, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12910AlRDefMtf_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( Z12910AlRDefMtf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_955_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_955_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_955_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_955 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_955_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_955_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFMTR_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFCDE_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCDe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFMTF_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefMtf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_WD665( )
   {
      s4806AlRPieDefC = O4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      s4805AlRPieDefT = O4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      s4797AlRPieClaC = O4797AlRPieClaC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      s4794AlRPieCla = O4794AlRPieCla ;
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      s4796AlRPieClaA = O4796AlRPieClaA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      nGXsfl_160_idx = 0 ;
      while ( nGXsfl_160_idx < nRC_GXsfl_160 )
      {
         readRowWD665( ) ;
         if ( ( nRcdExists_665 != 0 ) || ( nIsMod_665 != 0 ) )
         {
            getKeyWD665( ) ;
            if ( ( nRcdExists_665 == 0 ) && ( nRcdDeleted_665 == 0 ) )
            {
               if ( RcdFound665 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateWD665( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableWD665( ) ;
                     if ( AnyError == 0 )
                     {
                        zmWD665( 34) ;
                     }
                     closeExtendedTableCursorsWD665( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode665 = Gx_mode ;
                        confirm_WD955( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode665 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode665 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O4806AlRPieDefC = A4806AlRPieDefC ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
                     O4805AlRPieDefT = A4805AlRPieDefT ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
                     O4797AlRPieClaC = A4797AlRPieClaC ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
                     O4794AlRPieCla = A4794AlRPieCla ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
                     O4796AlRPieClaA = A4796AlRPieClaA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlRDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound665 != 0 )
               {
                  if ( nRcdDeleted_665 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyWD665( ) ;
                     loadWD665( ) ;
                     beforeValidateWD665( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsWD665( ) ;
                        O4806AlRPieDefC = A4806AlRPieDefC ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
                        O4805AlRPieDefT = A4805AlRPieDefT ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
                        O4797AlRPieClaC = A4797AlRPieClaC ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
                        O4794AlRPieCla = A4794AlRPieCla ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
                        O4796AlRPieClaA = A4796AlRPieClaA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_665 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateWD665( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableWD665( ) ;
                           if ( AnyError == 0 )
                           {
                              zmWD665( 34) ;
                           }
                           closeExtendedTableCursorsWD665( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode665 = Gx_mode ;
                              confirm_WD955( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode665 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode665 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O4806AlRPieDefC = A4806AlRPieDefC ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
                           O4805AlRPieDefT = A4805AlRPieDefT ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
                           O4797AlRPieClaC = A4797AlRPieClaC ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
                           O4794AlRPieCla = A4794AlRPieCla ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
                           O4796AlRPieClaA = A4796AlRPieClaA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_665 == 0 )
                  {
                     GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlRDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlRDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4395AlRDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefDsc_Internalname, GXutil.rtrim( A4396AlRDefDsc)) ;
         httpContext.changePostValue( edtAlRFasCod_Internalname, GXutil.rtrim( A4412AlRFasCod)) ;
         httpContext.changePostValue( edtAlRDefPnt_Internalname, GXutil.ltrim( localUtil.ntoc( A4397AlRDefPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A4403AlRDefCnt, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4404AlRDef, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefAca_Internalname, GXutil.ltrim( localUtil.ntoc( A4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefCru_Internalname, GXutil.ltrim( localUtil.ntoc( A4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlrDefPri_Internalname, GXutil.ltrim( localUtil.ntoc( A5261AlrDefPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4395AlRDefCod_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4395AlRDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4412AlRFasCod_"+sGXsfl_160_idx, GXutil.rtrim( Z4412AlRFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4404AlRDef_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4404AlRDef, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4971AlRDefAca_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4972AlRDefCru_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4403AlRDefCnt_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4403AlRDefCnt, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5261AlrDefPri_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z5261AlrDefPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4972AlRDefCru_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4971AlRDefAca_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_212_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_212, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_665_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_665_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_665_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_665 != 0 )
         {
            httpContext.changePostValue( "ALRDEFCOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFDSC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFASCOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFPNT_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefPnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFCNT_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEF_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFACA_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFCRU_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCru_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFPRI_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4806AlRPieDefC = s4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      O4805AlRPieDefT = s4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      O4797AlRPieClaC = s4797AlRPieClaC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      O4794AlRPieCla = s4794AlRPieCla ;
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      O4796AlRPieClaA = s4796AlRPieClaA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionWD0( )
   {
   }

   public void zmWD299( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4795AlRPieCal = T00WD10_A4795AlRPieCal[0] ;
            Z2157AlbRecMtr = T00WD10_A2157AlbRecMtr[0] ;
            Z2155AlbRecKgm = T00WD10_A2155AlbRecKgm[0] ;
            Z4798AlRPieClaM = T00WD10_A4798AlRPieClaM[0] ;
            Z4799AlRPieUltC = T00WD10_A4799AlRPieUltC[0] ;
            Z4807AlRExp1 = T00WD10_A4807AlRExp1[0] ;
            Z4808AlRExp2 = T00WD10_A4808AlRExp2[0] ;
            Z3731AlbRecIdPz = T00WD10_A3731AlbRecIdPz[0] ;
         }
         else
         {
            Z4795AlRPieCal = A4795AlRPieCal ;
            Z2157AlbRecMtr = A2157AlbRecMtr ;
            Z2155AlbRecKgm = A2155AlbRecKgm ;
            Z4798AlRPieClaM = A4798AlRPieClaM ;
            Z4799AlRPieUltC = A4799AlRPieUltC ;
            Z4807AlRExp1 = A4807AlRExp1 ;
            Z4808AlRExp2 = A4808AlRExp2 ;
            Z3731AlbRecIdPz = A3731AlbRecIdPz ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z4798AlRPieClaM = A4798AlRPieClaM ;
         Z4799AlRPieUltC = A4799AlRPieUltC ;
         Z4807AlRExp1 = A4807AlRExp1 ;
         Z4808AlRExp2 = A4808AlRExp2 ;
         Z3731AlbRecIdPz = A3731AlbRecIdPz ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z407EmprNom = A407EmprNom ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z970ProceCod = A970ProceCod ;
         Z971ProceNom = A971ProceNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), true);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), true);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), true);
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

   public void loadWD299( )
   {
      /* Using cursor T00WD19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T00WD19_A4795AlRPieCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
         A407EmprNom = T00WD19_A407EmprNom[0] ;
         n407EmprNom = T00WD19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2157AlbRecMtr = T00WD19_A2157AlbRecMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrimstr( A2157AlbRecMtr, 9, 2));
         A2155AlbRecKgm = T00WD19_A2155AlbRecKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrimstr( A2155AlbRecKgm, 9, 2));
         A4798AlRPieClaM = T00WD19_A4798AlRPieClaM[0] ;
         n4798AlRPieClaM = T00WD19_n4798AlRPieClaM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4798AlRPieClaM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4798AlRPieClaM), 2, 0));
         A4799AlRPieUltC = T00WD19_A4799AlRPieUltC[0] ;
         n4799AlRPieUltC = T00WD19_n4799AlRPieUltC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4799AlRPieUltC", A4799AlRPieUltC);
         A4807AlRExp1 = T00WD19_A4807AlRExp1[0] ;
         n4807AlRExp1 = T00WD19_n4807AlRExp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4807AlRExp1", A4807AlRExp1);
         A4808AlRExp2 = T00WD19_A4808AlRExp2[0] ;
         n4808AlRExp2 = T00WD19_n4808AlRExp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4808AlRExp2", A4808AlRExp2);
         A1291AlbRDes = T00WD19_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A971ProceNom = T00WD19_A971ProceNom[0] ;
         n971ProceNom = T00WD19_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A3731AlbRecIdPz = T00WD19_A3731AlbRecIdPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3731AlbRecIdPz", A3731AlbRecIdPz);
         A970ProceCod = T00WD19_A970ProceCod[0] ;
         n970ProceCod = T00WD19_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         zmWD299( -26) ;
      }
      pr_default.close(15);
      onLoadActionsWD299( ) ;
   }

   public void onLoadActionsWD299( )
   {
      /* Using cursor T00WD15 */
      pr_default.execute(12, new Object[] {A396EmprCod, A2159AlbRecPie, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A4800AlRPieBarC = T00WD15_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4800AlRPieBarC = T00WD15_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = T00WD15_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4801AlRPieBarR = T00WD15_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = T00WD15_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4802AlRPieBarP = T00WD15_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      else
      {
         A4800AlRPieBarC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      pr_default.close(12);
      /* Using cursor T00WD16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4800AlRPieBarC), Byte.valueOf(A4801AlRPieBarR), A4802AlRPieBarP});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A4831AlrPieCalP = T00WD16_A4831AlrPieCalP[0] ;
         n4831AlrPieCalP = T00WD16_n4831AlrPieCalP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      else
      {
         A4831AlrPieCalP = "N/A" ;
         n4831AlrPieCalP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      pr_default.close(13);
      GXt_int1 = A4804AlRPieFasL ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_int6[0] = GXt_int1 ;
      new app.pbarfaslin(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
      talrpme_impl.this.A396EmprCod = GXv_char2[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.GXt_int1 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      A4804AlRPieFasL = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4804AlRPieFasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4804AlRPieFasL), 4, 0));
      GXt_char7 = A4803AlRPieFasC ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char2[0] = A4802AlRPieBarP ;
      GXv_char8[0] = GXt_char7 ;
      new app.pbarfascod(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_char8) ;
      talrpme_impl.this.A396EmprCod = GXv_char5[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char2[0] ;
      talrpme_impl.this.GXt_char7 = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      A4803AlRPieFasC = GXt_char7 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4803AlRPieFasC", A4803AlRPieFasC);
      /* Using cursor T00WD18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A4805AlRPieDefT = T00WD18_A4805AlRPieDefT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = T00WD18_A4806AlRPieDefC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      else
      {
         A4805AlRPieDefT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      O4805AlRPieDefT = A4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      O4806AlRPieDefC = A4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      pr_default.close(14);
      if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
      {
         A4796AlRPieClaA = (byte)(99) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      else
      {
         if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
         {
            A4796AlRPieClaA = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         else
         {
            if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               A4796AlRPieClaA = (byte)(33) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
            }
            else
            {
               if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
               else
               {
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
            }
         }
      }
      if ( (0==A4798AlRPieClaM) )
      {
         A4794AlRPieCla = A4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      else
      {
         A4794AlRPieCla = A4798AlRPieClaM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
         }
      }
      GXt_decimal9 = A5260AlrPieKgmA ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = A2159AlbRecPie ;
      GXv_decimal10[0] = GXt_decimal9 ;
      new app.pbarpiekil(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
      talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A5260AlrPieKgmA = GXt_decimal9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5260AlrPieKgmA", GXutil.ltrimstr( A5260AlrPieKgmA, 9, 2));
      GXt_decimal9 = A5259AlrPieMtrA ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = A2159AlbRecPie ;
      GXv_decimal10[0] = GXt_decimal9 ;
      new app.pbarpiemet(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
      talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A5259AlrPieMtrA = GXt_decimal9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5259AlrPieMtrA", GXutil.ltrimstr( A5259AlrPieMtrA, 9, 2));
      GXt_char7 = A4795AlRPieCal ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A44AlbRecCod ;
      GXv_char5[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char7 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_char5, GXv_char2) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A44AlbRecCod = GXv_int3[0] ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char5[0] ;
      talrpme_impl.this.GXt_char7 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A4795AlRPieCal = GXt_char7 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      GXt_int11 = A44AlbRecCod ;
      GXv_int3[0] = GXt_int11 ;
      new app.palbreccod(remoteHandle, context).execute( A396EmprCod, A2159AlbRecPie, GXv_int3) ;
      talrpme_impl.this.GXt_int11 = GXv_int3[0] ;
      A44AlbRecCod = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
   }

   public void checkExtendedTableWD299( )
   {
      nIsDirty_299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00WD11 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00WD11_A407EmprNom[0] ;
      n407EmprNom = T00WD11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(9);
      /* Using cursor T00WD12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1291AlbRDes = T00WD12_A1291AlbRDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = T00WD12_A970ProceCod[0] ;
      n970ProceCod = T00WD12_n970ProceCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      pr_default.close(10);
      /* Using cursor T00WD13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T00WD13_A971ProceNom[0] ;
      n971ProceNom = T00WD13_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(11);
      /* Using cursor T00WD15 */
      pr_default.execute(12, new Object[] {A396EmprCod, A2159AlbRecPie, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A4800AlRPieBarC = T00WD15_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4800AlRPieBarC = T00WD15_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = T00WD15_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4801AlRPieBarR = T00WD15_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = T00WD15_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4802AlRPieBarP = T00WD15_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      else
      {
         nIsDirty_299 = (short)(1) ;
         A4800AlRPieBarC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         nIsDirty_299 = (short)(1) ;
         A4801AlRPieBarR = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         nIsDirty_299 = (short)(1) ;
         A4802AlRPieBarP = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      pr_default.close(12);
      /* Using cursor T00WD16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4800AlRPieBarC), Byte.valueOf(A4801AlRPieBarR), A4802AlRPieBarP});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A4831AlrPieCalP = T00WD16_A4831AlrPieCalP[0] ;
         n4831AlrPieCalP = T00WD16_n4831AlrPieCalP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      else
      {
         nIsDirty_299 = (short)(1) ;
         A4831AlrPieCalP = "N/A" ;
         n4831AlrPieCalP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      pr_default.close(13);
      nIsDirty_299 = (short)(1) ;
      GXt_int1 = A4804AlRPieFasL ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_int6[0] = GXt_int1 ;
      new app.pbarfaslin(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.GXt_int1 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      A4804AlRPieFasL = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4804AlRPieFasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4804AlRPieFasL), 4, 0));
      nIsDirty_299 = (short)(1) ;
      GXt_char7 = A4803AlRPieFasC ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = GXt_char7 ;
      new app.pbarfascod(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.GXt_char7 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      A4803AlRPieFasC = GXt_char7 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4803AlRPieFasC", A4803AlRPieFasC);
      /* Using cursor T00WD18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A4805AlRPieDefT = T00WD18_A4805AlRPieDefT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = T00WD18_A4806AlRPieDefC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      else
      {
         nIsDirty_299 = (short)(1) ;
         A4805AlRPieDefT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         nIsDirty_299 = (short)(1) ;
         A4806AlRPieDefC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      pr_default.close(14);
      if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
      {
         nIsDirty_299 = (short)(1) ;
         A4796AlRPieClaA = (byte)(99) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      else
      {
         if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
         {
            nIsDirty_299 = (short)(1) ;
            A4796AlRPieClaA = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         else
         {
            if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               nIsDirty_299 = (short)(1) ;
               A4796AlRPieClaA = (byte)(33) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
            }
            else
            {
               if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  nIsDirty_299 = (short)(1) ;
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
               else
               {
                  nIsDirty_299 = (short)(1) ;
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
            }
         }
      }
      if ( (0==A4798AlRPieClaM) )
      {
         nIsDirty_299 = (short)(1) ;
         A4794AlRPieCla = A4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      else
      {
         nIsDirty_299 = (short)(1) ;
         A4794AlRPieCla = A4798AlRPieClaM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         nIsDirty_299 = (short)(1) ;
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            nIsDirty_299 = (short)(1) ;
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               nIsDirty_299 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               nIsDirty_299 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
         }
      }
      nIsDirty_299 = (short)(1) ;
      GXt_decimal9 = A5260AlrPieKgmA ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = A2159AlbRecPie ;
      GXv_decimal10[0] = GXt_decimal9 ;
      new app.pbarpiekil(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
      talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A5260AlrPieKgmA = GXt_decimal9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5260AlrPieKgmA", GXutil.ltrimstr( A5260AlrPieKgmA, 9, 2));
      nIsDirty_299 = (short)(1) ;
      GXt_decimal9 = A5259AlrPieMtrA ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = A2159AlbRecPie ;
      GXv_decimal10[0] = GXt_decimal9 ;
      new app.pbarpiemet(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
      talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A5259AlrPieMtrA = GXt_decimal9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5259AlrPieMtrA", GXutil.ltrimstr( A5259AlrPieMtrA, 9, 2));
      nIsDirty_299 = (short)(1) ;
      GXt_char7 = A4795AlRPieCal ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A44AlbRecCod ;
      GXv_char5[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char7 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_char5, GXv_char2) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A44AlbRecCod = GXv_int3[0] ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char5[0] ;
      talrpme_impl.this.GXt_char7 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A4795AlRPieCal = GXt_char7 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      nIsDirty_299 = (short)(1) ;
      GXt_int11 = A44AlbRecCod ;
      GXv_int3[0] = GXt_int11 ;
      new app.palbreccod(remoteHandle, context).execute( A396EmprCod, A2159AlbRecPie, GXv_int3) ;
      talrpme_impl.this.GXt_int11 = GXv_int3[0] ;
      A44AlbRecCod = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      if ( ! ( ( GXutil.strcmp(A4807AlRExp1, "S") == 0 ) || ( GXutil.strcmp(A4807AlRExp1, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Exportada Sistema 1", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALREXP1");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRExp1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4808AlRExp2, "S") == 0 ) || ( GXutil.strcmp(A4808AlRExp2, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Exportada Sistema 2", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALREXP2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRExp2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsWD299( )
   {
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(14);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( String A396EmprCod )
   {
      /* Using cursor T00WD20 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00WD20_A407EmprNom[0] ;
      n407EmprNom = T00WD20_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_28( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T00WD21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1291AlbRDes = T00WD21_A1291AlbRDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = T00WD21_A970ProceCod[0] ;
      n970ProceCod = T00WD21_n970ProceCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1291AlbRDes))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_29( String A396EmprCod ,
                          short A970ProceCod )
   {
      /* Using cursor T00WD22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T00WD22_A971ProceNom[0] ;
      n971ProceNom = T00WD22_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_30( int A44AlbRecCod ,
                          String A2159AlbRecPie )
   {
      /* Using cursor T00WD24 */
      pr_default.execute(19, new Object[] {A396EmprCod, A2159AlbRecPie, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A4800AlRPieBarC = T00WD24_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4800AlRPieBarC = T00WD24_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = T00WD24_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4801AlRPieBarR = T00WD24_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = T00WD24_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4802AlRPieBarP = T00WD24_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      else
      {
         A4800AlRPieBarC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4800AlRPieBarC, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4801AlRPieBarR, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4802AlRPieBarP))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4800AlRPieBarC, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4801AlRPieBarR, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4802AlRPieBarP))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_31( String A396EmprCod ,
                          int A4800AlRPieBarC ,
                          byte A4801AlRPieBarR ,
                          String A4802AlRPieBarP )
   {
      /* Using cursor T00WD25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4800AlRPieBarC), Byte.valueOf(A4801AlRPieBarR), A4802AlRPieBarP});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A4831AlrPieCalP = T00WD25_A4831AlrPieCalP[0] ;
         n4831AlrPieCalP = T00WD25_n4831AlrPieCalP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      else
      {
         A4831AlrPieCalP = "N/A" ;
         n4831AlrPieCalP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4831AlrPieCalP))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_32( String A396EmprCod ,
                          int A44AlbRecCod ,
                          String A2159AlbRecPie )
   {
      /* Using cursor T00WD27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A4805AlRPieDefT = T00WD27_A4805AlRPieDefT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = T00WD27_A4806AlRPieDefC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      else
      {
         A4805AlRPieDefT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4805AlRPieDefT, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKeyWD299( )
   {
      /* Using cursor T00WD28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      else
      {
         RcdFound299 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00WD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zmWD299( 26) ;
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T00WD10_A4795AlRPieCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
         A2159AlbRecPie = T00WD10_A2159AlbRecPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         A2157AlbRecMtr = T00WD10_A2157AlbRecMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrimstr( A2157AlbRecMtr, 9, 2));
         A2155AlbRecKgm = T00WD10_A2155AlbRecKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrimstr( A2155AlbRecKgm, 9, 2));
         A4798AlRPieClaM = T00WD10_A4798AlRPieClaM[0] ;
         n4798AlRPieClaM = T00WD10_n4798AlRPieClaM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4798AlRPieClaM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4798AlRPieClaM), 2, 0));
         A4799AlRPieUltC = T00WD10_A4799AlRPieUltC[0] ;
         n4799AlRPieUltC = T00WD10_n4799AlRPieUltC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4799AlRPieUltC", A4799AlRPieUltC);
         A4807AlRExp1 = T00WD10_A4807AlRExp1[0] ;
         n4807AlRExp1 = T00WD10_n4807AlRExp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4807AlRExp1", A4807AlRExp1);
         A4808AlRExp2 = T00WD10_A4808AlRExp2[0] ;
         n4808AlRExp2 = T00WD10_n4808AlRExp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4808AlRExp2", A4808AlRExp2);
         A3731AlbRecIdPz = T00WD10_A3731AlbRecIdPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3731AlbRecIdPz", A3731AlbRecIdPz);
         A396EmprCod = T00WD10_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T00WD10_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadWD299( ) ;
         if ( AnyError == 1 )
         {
            RcdFound299 = (short)(0) ;
            initializeNonKeyWD299( ) ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound299 = (short)(0) ;
         initializeNonKeyWD299( ) ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKeyWD299( ) ;
      if ( RcdFound299 == 0 )
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
      RcdFound299 = (short)(0) ;
      /* Using cursor T00WD29 */
      pr_default.execute(23, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, A2159AlbRecPie});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T00WD29_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00WD29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00WD29_A44AlbRecCod[0] < A44AlbRecCod ) || ( T00WD29_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T00WD29_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00WD29_A2159AlbRecPie[0], A2159AlbRecPie) < 0 ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T00WD29_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00WD29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00WD29_A44AlbRecCod[0] > A44AlbRecCod ) || ( T00WD29_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T00WD29_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00WD29_A2159AlbRecPie[0], A2159AlbRecPie) > 0 ) ) )
         {
            A396EmprCod = T00WD29_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T00WD29_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A2159AlbRecPie = T00WD29_A2159AlbRecPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
            RcdFound299 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void move_previous( )
   {
      RcdFound299 = (short)(0) ;
      /* Using cursor T00WD30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, A2159AlbRecPie});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T00WD30_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00WD30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00WD30_A44AlbRecCod[0] > A44AlbRecCod ) || ( T00WD30_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T00WD30_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00WD30_A2159AlbRecPie[0], A2159AlbRecPie) > 0 ) ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T00WD30_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00WD30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00WD30_A44AlbRecCod[0] < A44AlbRecCod ) || ( T00WD30_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T00WD30_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00WD30_A2159AlbRecPie[0], A2159AlbRecPie) < 0 ) ) )
         {
            A396EmprCod = T00WD30_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T00WD30_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A2159AlbRecPie = T00WD30_A2159AlbRecPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
            RcdFound299 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyWD299( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4806AlRPieDefC = O4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         A4805AlRPieDefT = O4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4797AlRPieClaC = O4797AlRPieClaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         A4794AlRPieCla = O4794AlRPieCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         A4796AlRPieClaA = O4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertWD299( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound299 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A44AlbRecCod = Z44AlbRecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               A2159AlbRecPie = Z2159AlbRecPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4806AlRPieDefC = O4806AlRPieDefC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
               A4805AlRPieDefT = O4805AlRPieDefT ;
               httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
               A4797AlRPieClaC = O4797AlRPieClaC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               A4794AlRPieCla = O4794AlRPieCla ;
               httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
               A4796AlRPieClaA = O4796AlRPieClaA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4806AlRPieDefC = O4806AlRPieDefC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
               A4805AlRPieDefT = O4805AlRPieDefT ;
               httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
               A4797AlRPieClaC = O4797AlRPieClaC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               A4794AlRPieCla = O4794AlRPieCla ;
               httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
               A4796AlRPieClaA = O4796AlRPieClaA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               updateWD299( ) ;
               GX_FocusControl = edtAlbRecPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4806AlRPieDefC = O4806AlRPieDefC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
               A4805AlRPieDefT = O4805AlRPieDefT ;
               httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
               A4797AlRPieClaC = O4797AlRPieClaC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               A4794AlRPieCla = O4794AlRPieCla ;
               httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
               A4796AlRPieClaA = O4796AlRPieClaA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               GX_FocusControl = edtAlbRecPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertWD299( ) ;
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
                  A4806AlRPieDefC = O4806AlRPieDefC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
                  A4805AlRPieDefT = O4805AlRPieDefT ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
                  A4797AlRPieClaC = O4797AlRPieClaC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
                  A4794AlRPieCla = O4794AlRPieCla ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
                  A4796AlRPieClaA = O4796AlRPieClaA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertWD299( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = Z44AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = Z2159AlbRecPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4806AlRPieDefC = O4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         A4805AlRPieDefT = O4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4797AlRPieClaC = O4797AlRPieClaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         A4794AlRPieCla = O4794AlRPieCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         A4796AlRPieClaA = O4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
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
      getKeyWD299( ) ;
      if ( RcdFound299 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = Z44AlbRecCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A2159AlbRecPie = Z2159AlbRecPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talrpme");
      GX_FocusControl = edtAlRPieClaM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_WD0( ) ;
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
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlRPieClaM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartWD299( ) ;
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlRPieClaM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndWD299( ) ;
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
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlRPieClaM_Internalname ;
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
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlRPieClaM_Internalname ;
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
      scanStartWD299( ) ;
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound299 != 0 )
         {
            scanNextWD299( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlRPieClaM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndWD299( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyWD299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00WD9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z4795AlRPieCal, T00WD9_A4795AlRPieCal[0]) != 0 ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T00WD9_A2157AlbRecMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T00WD9_A2155AlbRecKgm[0]) != 0 ) || ( Z4798AlRPieClaM != T00WD9_A4798AlRPieClaM[0] ) || ( GXutil.strcmp(Z4799AlRPieUltC, T00WD9_A4799AlRPieUltC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4807AlRExp1, T00WD9_A4807AlRExp1[0]) != 0 ) || ( GXutil.strcmp(Z4808AlRExp2, T00WD9_A4808AlRExp2[0]) != 0 ) || ( GXutil.strcmp(Z3731AlbRecIdPz, T00WD9_A3731AlbRecIdPz[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T00WD9_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T00WD9_A4795AlRPieCal[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T00WD9_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T00WD9_A2157AlbRecMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T00WD9_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T00WD9_A2155AlbRecKgm[0]);
            }
            if ( Z4798AlRPieClaM != T00WD9_A4798AlRPieClaM[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRPieClaM");
               GXutil.writeLogRaw("Old: ",Z4798AlRPieClaM);
               GXutil.writeLogRaw("Current: ",T00WD9_A4798AlRPieClaM[0]);
            }
            if ( GXutil.strcmp(Z4799AlRPieUltC, T00WD9_A4799AlRPieUltC[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRPieUltC");
               GXutil.writeLogRaw("Old: ",Z4799AlRPieUltC);
               GXutil.writeLogRaw("Current: ",T00WD9_A4799AlRPieUltC[0]);
            }
            if ( GXutil.strcmp(Z4807AlRExp1, T00WD9_A4807AlRExp1[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRExp1");
               GXutil.writeLogRaw("Old: ",Z4807AlRExp1);
               GXutil.writeLogRaw("Current: ",T00WD9_A4807AlRExp1[0]);
            }
            if ( GXutil.strcmp(Z4808AlRExp2, T00WD9_A4808AlRExp2[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRExp2");
               GXutil.writeLogRaw("Old: ",Z4808AlRExp2);
               GXutil.writeLogRaw("Current: ",T00WD9_A4808AlRExp2[0]);
            }
            if ( GXutil.strcmp(Z3731AlbRecIdPz, T00WD9_A3731AlbRecIdPz[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlbRecIdPz");
               GXutil.writeLogRaw("Old: ",Z3731AlbRecIdPz);
               GXutil.writeLogRaw("Current: ",T00WD9_A3731AlbRecIdPz[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertWD299( )
   {
      beforeValidateWD299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD299( ) ;
      }
      if ( AnyError == 0 )
      {
         zmWD299( 0) ;
         checkOptimisticConcurrencyWD299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWD299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertWD299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD31 */
                  pr_default.execute(25, new Object[] {A4795AlRPieCal, A2159AlbRecPie, A2157AlbRecMtr, A2155AlbRecKgm, Boolean.valueOf(n4798AlRPieClaM), Byte.valueOf(A4798AlRPieClaM), Boolean.valueOf(n4799AlRPieUltC), A4799AlRPieUltC, Boolean.valueOf(n4807AlRExp1), A4807AlRExp1, Boolean.valueOf(n4808AlRExp2), A4808AlRExp2, A3731AlbRecIdPz, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A4805AlRPieDefT), Integer.valueOf(A4806AlRPieDefC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        processLevelWD299( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionWD0( ) ;
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
            loadWD299( ) ;
         }
         endLevelWD299( ) ;
      }
      closeExtendedTableCursorsWD299( ) ;
   }

   public void updateWD299( )
   {
      beforeValidateWD299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD299( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWD299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWD299( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateWD299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD32 */
                  pr_default.execute(26, new Object[] {A4795AlRPieCal, A2157AlbRecMtr, A2155AlbRecKgm, Boolean.valueOf(n4798AlRPieClaM), Byte.valueOf(A4798AlRPieClaM), Boolean.valueOf(n4799AlRPieUltC), A4799AlRPieUltC, Boolean.valueOf(n4807AlRExp1), A4807AlRExp1, Boolean.valueOf(n4808AlRExp2), A4808AlRExp2, A3731AlbRecIdPz, Integer.valueOf(A4805AlRPieDefT), Integer.valueOf(A4806AlRPieDefC), A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateWD299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelWD299( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionWD0( ) ;
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
         endLevelWD299( ) ;
      }
      closeExtendedTableCursorsWD299( ) ;
   }

   public void deferredUpdateWD299( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateWD299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWD299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsWD299( ) ;
         afterConfirmWD299( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteWD299( ) ;
            if ( AnyError == 0 )
            {
               scanStartWD770( ) ;
               while ( RcdFound770 != 0 )
               {
                  getByPrimaryKeyWD770( ) ;
                  deleteWD770( ) ;
                  scanNextWD770( ) ;
               }
               scanEndWD770( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD33 */
                  pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound299 == 0 )
                        {
                           initAllWD299( ) ;
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
                        resetCaptionWD0( ) ;
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
      sMode299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelWD299( ) ;
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsWD299( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00WD34 */
         pr_default.execute(28, new Object[] {A396EmprCod});
         A407EmprNom = T00WD34_A407EmprNom[0] ;
         n407EmprNom = T00WD34_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(28);
         /* Using cursor T00WD35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A1291AlbRDes = T00WD35_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A970ProceCod = T00WD35_A970ProceCod[0] ;
         n970ProceCod = T00WD35_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         pr_default.close(29);
         /* Using cursor T00WD36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T00WD36_A971ProceNom[0] ;
         n971ProceNom = T00WD36_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(30);
         /* Using cursor T00WD38 */
         pr_default.execute(31, new Object[] {A396EmprCod, A2159AlbRecPie, Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            A4800AlRPieBarC = T00WD38_A4800AlRPieBarC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
            A4800AlRPieBarC = T00WD38_A4800AlRPieBarC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
            A4801AlRPieBarR = T00WD38_A4801AlRPieBarR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
            A4801AlRPieBarR = T00WD38_A4801AlRPieBarR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
            A4802AlRPieBarP = T00WD38_A4802AlRPieBarP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
            A4802AlRPieBarP = T00WD38_A4802AlRPieBarP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         }
         else
         {
            A4800AlRPieBarC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
            A4801AlRPieBarR = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
            A4802AlRPieBarP = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         }
         pr_default.close(31);
         /* Using cursor T00WD39 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4800AlRPieBarC), Byte.valueOf(A4801AlRPieBarR), A4802AlRPieBarP});
         if ( (pr_default.getStatus(32) != 101) )
         {
            A4831AlrPieCalP = T00WD39_A4831AlrPieCalP[0] ;
            n4831AlrPieCalP = T00WD39_n4831AlrPieCalP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
         }
         else
         {
            A4831AlrPieCalP = "N/A" ;
            n4831AlrPieCalP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
         }
         pr_default.close(32);
         GXt_int1 = A4804AlRPieFasL ;
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A4800AlRPieBarC ;
         GXv_int4[0] = A4801AlRPieBarR ;
         GXv_char5[0] = A4802AlRPieBarP ;
         GXv_int6[0] = GXt_int1 ;
         new app.pbarfaslin(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
         talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
         talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
         talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
         talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
         talrpme_impl.this.GXt_int1 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4804AlRPieFasL = GXt_int1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4804AlRPieFasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4804AlRPieFasL), 4, 0));
         GXt_char7 = A4803AlRPieFasC ;
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A4800AlRPieBarC ;
         GXv_int4[0] = A4801AlRPieBarR ;
         GXv_char5[0] = A4802AlRPieBarP ;
         GXv_char2[0] = GXt_char7 ;
         new app.pbarfascod(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
         talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
         talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
         talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
         talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
         talrpme_impl.this.GXt_char7 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4803AlRPieFasC = GXt_char7 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4803AlRPieFasC", A4803AlRPieFasC);
         /* Using cursor T00WD41 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(33) != 101) )
         {
            A4805AlRPieDefT = T00WD41_A4805AlRPieDefT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
            A4806AlRPieDefC = T00WD41_A4806AlRPieDefC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         else
         {
            A4805AlRPieDefT = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
            A4806AlRPieDefC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         pr_default.close(33);
         GXt_decimal9 = A5260AlrPieKgmA ;
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A4800AlRPieBarC ;
         GXv_int4[0] = A4801AlRPieBarR ;
         GXv_char5[0] = A4802AlRPieBarP ;
         GXv_char2[0] = A2159AlbRecPie ;
         GXv_decimal10[0] = GXt_decimal9 ;
         new app.pbarpiekil(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
         talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
         talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
         talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
         talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
         talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
         talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         A5260AlrPieKgmA = GXt_decimal9 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5260AlrPieKgmA", GXutil.ltrimstr( A5260AlrPieKgmA, 9, 2));
         GXt_decimal9 = A5259AlrPieMtrA ;
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A4800AlRPieBarC ;
         GXv_int4[0] = A4801AlRPieBarR ;
         GXv_char5[0] = A4802AlRPieBarP ;
         GXv_char2[0] = A2159AlbRecPie ;
         GXv_decimal10[0] = GXt_decimal9 ;
         new app.pbarpiemet(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
         talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
         talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
         talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
         talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
         talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
         talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         A5259AlrPieMtrA = GXt_decimal9 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5259AlrPieMtrA", GXutil.ltrimstr( A5259AlrPieMtrA, 9, 2));
         if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
         {
            A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
               {
                  A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               }
               else
               {
                  A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               }
            }
         }
         if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
         {
            A4796AlRPieClaA = (byte)(99) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         else
         {
            if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               A4796AlRPieClaA = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
            }
            else
            {
               if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  A4796AlRPieClaA = (byte)(33) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
               else
               {
                  if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
                  {
                     A4796AlRPieClaA = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                  }
                  else
                  {
                     A4796AlRPieClaA = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                  }
               }
            }
         }
         if ( (0==A4798AlRPieClaM) )
         {
            A4794AlRPieCla = A4796AlRPieClaA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         }
         else
         {
            A4794AlRPieCla = A4798AlRPieClaM ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00WD42 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlrPiF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00WD43 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HILZPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00WD44 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPi1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00WD45 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void processNestedLevelWD665( )
   {
      s4806AlRPieDefC = O4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      s4805AlRPieDefT = O4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      s4797AlRPieClaC = O4797AlRPieClaC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      s4794AlRPieCla = O4794AlRPieCla ;
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      s4796AlRPieClaA = O4796AlRPieClaA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      nGXsfl_160_idx = 0 ;
      while ( nGXsfl_160_idx < nRC_GXsfl_160 )
      {
         readRowWD665( ) ;
         if ( ( nRcdExists_665 != 0 ) || ( nIsMod_665 != 0 ) )
         {
            standaloneNotModalWD665( ) ;
            getKeyWD665( ) ;
            if ( ( nRcdExists_665 == 0 ) && ( nRcdDeleted_665 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertWD665( ) ;
            }
            else
            {
               if ( RcdFound665 != 0 )
               {
                  if ( ( nRcdDeleted_665 != 0 ) && ( nRcdExists_665 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteWD665( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_665 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateWD665( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_665 == 0 )
                  {
                     GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlRDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4806AlRPieDefC = A4806AlRPieDefC ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
            O4805AlRPieDefT = A4805AlRPieDefT ;
            httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
            O4797AlRPieClaC = A4797AlRPieClaC ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            O4794AlRPieCla = A4794AlRPieCla ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
            O4796AlRPieClaA = A4796AlRPieClaA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         httpContext.changePostValue( edtAlRDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4395AlRDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefDsc_Internalname, GXutil.rtrim( A4396AlRDefDsc)) ;
         httpContext.changePostValue( edtAlRFasCod_Internalname, GXutil.rtrim( A4412AlRFasCod)) ;
         httpContext.changePostValue( edtAlRDefPnt_Internalname, GXutil.ltrim( localUtil.ntoc( A4397AlRDefPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A4403AlRDefCnt, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4404AlRDef, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefAca_Internalname, GXutil.ltrim( localUtil.ntoc( A4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefCru_Internalname, GXutil.ltrim( localUtil.ntoc( A4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlrDefPri_Internalname, GXutil.ltrim( localUtil.ntoc( A5261AlrDefPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4395AlRDefCod_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4395AlRDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4412AlRFasCod_"+sGXsfl_160_idx, GXutil.rtrim( Z4412AlRFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4404AlRDef_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4404AlRDef, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4971AlRDefAca_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4972AlRDefCru_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4403AlRDefCnt_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4403AlRDefCnt, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5261AlrDefPri_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z5261AlrDefPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4972AlRDefCru_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4971AlRDefAca_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_212_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_212, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_665_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_665_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_665_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_665 != 0 )
         {
            httpContext.changePostValue( "ALRDEFCOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFDSC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFASCOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFPNT_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefPnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFCNT_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEF_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFACA_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFCRU_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCru_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFPRI_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllWD665( ) ;
      if ( AnyError != 0 )
      {
         O4806AlRPieDefC = s4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         O4805AlRPieDefT = s4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         O4797AlRPieClaC = s4797AlRPieClaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         O4794AlRPieCla = s4794AlRPieCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         O4796AlRPieClaA = s4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      nRcdExists_665 = (short)(0) ;
      nIsMod_665 = (short)(0) ;
      nRcdDeleted_665 = (short)(0) ;
   }

   public void processNestedLevelWD770( )
   {
      nGXsfl_220_idx = 0 ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         readRowWD770( ) ;
         if ( ( nRcdExists_770 != 0 ) || ( nIsMod_770 != 0 ) )
         {
            standaloneNotModalWD770( ) ;
            getKeyWD770( ) ;
            if ( ( nRcdExists_770 == 0 ) && ( nRcdDeleted_770 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertWD770( ) ;
            }
            else
            {
               if ( RcdFound770 != 0 )
               {
                  if ( ( nRcdDeleted_770 != 0 ) && ( nRcdExists_770 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteWD770( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_770 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateWD770( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_770 == 0 )
                  {
                     GXCCtl = "ALBRECEVT_" + sGXsfl_220_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecEvt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_770_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecEvt_Internalname, GXutil.ltrim( localUtil.ntoc( A5262AlbRecEvt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5263AREBarCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREBarCodR_Internalname, GXutil.ltrim( localUtil.ntoc( A5264AREBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREBarCodP_Internalname, GXutil.rtrim( A5265AREBarCodP)) ;
         httpContext.changePostValue( edtAREFch_Internalname, localUtil.ttoc( A5266AREFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtAREDsc_Internalname, A5267AREDsc) ;
         httpContext.changePostValue( edtAREProCod_Internalname, GXutil.rtrim( A5268AREProCod)) ;
         httpContext.changePostValue( edtAREFasCod_Internalname, GXutil.rtrim( A5269AREFasCod)) ;
         httpContext.changePostValue( edtAREAlbProC_Internalname, GXutil.ltrim( localUtil.ntoc( A5270AREAlbProC, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREAlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5271AREAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtARETip_Internalname, GXutil.rtrim( A5272ARETip)) ;
         httpContext.changePostValue( edtAREKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A5273AREKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A5274AREMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAREArt_Internalname, GXutil.rtrim( A5275AREArt)) ;
         httpContext.changePostValue( edtAREUsu_Internalname, GXutil.rtrim( A5276AREUsu)) ;
         httpContext.changePostValue( "ZT_"+"Z5262AlbRecEvt_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5262AlbRecEvt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5263AREBarCod_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5263AREBarCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5264AREBarCodR_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5264AREBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5265AREBarCodP_"+sGXsfl_220_idx, GXutil.rtrim( Z5265AREBarCodP)) ;
         httpContext.changePostValue( "ZT_"+"Z5266AREFch_"+sGXsfl_220_idx, localUtil.ttoc( Z5266AREFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z5268AREProCod_"+sGXsfl_220_idx, GXutil.rtrim( Z5268AREProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5269AREFasCod_"+sGXsfl_220_idx, GXutil.rtrim( Z5269AREFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5270AREAlbProC_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5270AREAlbProC, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5271AREAlmCod_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5271AREAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5272ARETip_"+sGXsfl_220_idx, GXutil.rtrim( Z5272ARETip)) ;
         httpContext.changePostValue( "ZT_"+"Z5273AREKgm_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5273AREKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5274AREMtr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z5274AREMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5275AREArt_"+sGXsfl_220_idx, GXutil.rtrim( Z5275AREArt)) ;
         httpContext.changePostValue( "ZT_"+"Z5276AREUsu_"+sGXsfl_220_idx, GXutil.rtrim( Z5276AREUsu)) ;
         httpContext.changePostValue( "nRcdDeleted_770_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_770_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_770_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_770 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_770_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_770_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECEVT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecEvt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREBARCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREBARCODR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREBARCODP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREFCH_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREDSC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREPROCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREFASCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREALBPROC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlbProC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREALMCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARETIP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtARETip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREKGM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREMTR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREART_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AREUSU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREUsu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllWD770( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_770 = (short)(0) ;
      nIsMod_770 = (short)(0) ;
      nRcdDeleted_770 = (short)(0) ;
   }

   public void processLevelWD299( )
   {
      /* Save parent mode. */
      sMode299 = Gx_mode ;
      processNestedLevelWD665( ) ;
      processNestedLevelWD770( ) ;
      if ( AnyError != 0 )
      {
         O4806AlRPieDefC = s4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         O4805AlRPieDefT = s4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         O4797AlRPieClaC = s4797AlRPieClaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         O4794AlRPieCla = s4794AlRPieCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         O4796AlRPieClaA = s4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00WD46 */
      pr_default.execute(38, new Object[] {Integer.valueOf(A4806AlRPieDefC), Integer.valueOf(A4805AlRPieDefT), A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
   }

   public void endLevelWD299( )
   {
      pr_default.close(7);
      if ( AnyError == 0 )
      {
         beforeCompleteWD299( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talrpme");
         if ( AnyError == 0 )
         {
            confirmValuesWD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talrpme");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartWD299( )
   {
      /* Using cursor T00WD47 */
      pr_default.execute(39);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A396EmprCod = T00WD47_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T00WD47_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = T00WD47_A2159AlbRecPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextWD299( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A396EmprCod = T00WD47_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T00WD47_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = T00WD47_A2159AlbRecPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      }
   }

   public void scanEndWD299( )
   {
      pr_default.close(39);
   }

   public void afterConfirmWD299( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertWD299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateWD299( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteWD299( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteWD299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateWD299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesWD299( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), true);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), true);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), true);
      edtAlRPieCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieCla_Enabled), 5, 0), true);
      edtAlRPieCal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieCal_Enabled), 5, 0), true);
      edtAlRPieClaA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaA_Enabled), 5, 0), true);
      edtAlRPieClaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaC_Enabled), 5, 0), true);
      edtAlRPieClaM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaM_Enabled), 5, 0), true);
      edtAlRPieUltC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieUltC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieUltC_Enabled), 5, 0), true);
      edtAlRPieBarC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieBarC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieBarC_Enabled), 5, 0), true);
      edtAlRPieBarR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieBarR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieBarR_Enabled), 5, 0), true);
      edtAlRPieBarP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieBarP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieBarP_Enabled), 5, 0), true);
      edtAlRPieFasC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieFasC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieFasC_Enabled), 5, 0), true);
      edtAlRPieFasL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieFasL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieFasL_Enabled), 5, 0), true);
      edtAlrPieCalP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrPieCalP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieCalP_Enabled), 5, 0), true);
      edtAlrPieMtrA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrPieMtrA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieMtrA_Enabled), 5, 0), true);
      edtAlrPieKgmA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrPieKgmA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieKgmA_Enabled), 5, 0), true);
      edtAlRPieDefT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieDefT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieDefT_Enabled), 5, 0), true);
      edtAlRPieDefC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieDefC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieDefC_Enabled), 5, 0), true);
      edtAlRExp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRExp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRExp1_Enabled), 5, 0), true);
      edtAlRExp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRExp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRExp2_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtAlbRecIdPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), true);
   }

   public void zmWD665( int GX_JID )
   {
      if ( ( GX_JID == 33 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4404AlRDef = T00WD7_A4404AlRDef[0] ;
            Z4971AlRDefAca = T00WD7_A4971AlRDefAca[0] ;
            Z4972AlRDefCru = T00WD7_A4972AlRDefCru[0] ;
            Z4403AlRDefCnt = T00WD7_A4403AlRDefCnt[0] ;
            Z5261AlrDefPri = T00WD7_A5261AlrDefPri[0] ;
         }
         else
         {
            Z4404AlRDef = A4404AlRDef ;
            Z4971AlRDefAca = A4971AlRDefAca ;
            Z4972AlRDefCru = A4972AlRDefCru ;
            Z4403AlRDefCnt = A4403AlRDefCnt ;
            Z5261AlrDefPri = A5261AlrDefPri ;
         }
      }
      if ( GX_JID == -33 )
      {
         Z4404AlRDef = A4404AlRDef ;
         Z4971AlRDefAca = A4971AlRDefAca ;
         Z4972AlRDefCru = A4972AlRDefCru ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4412AlRFasCod = A4412AlRFasCod ;
         Z4403AlRDefCnt = A4403AlRDefCnt ;
         Z5261AlrDefPri = A5261AlrDefPri ;
         Z396EmprCod = A396EmprCod ;
         Z4395AlRDefCod = A4395AlRDefCod ;
         Z4396AlRDefDsc = A4396AlRDefDsc ;
         Z4397AlRDefPnt = A4397AlRDefPnt ;
      }
   }

   public void standaloneNotModalWD665( )
   {
   }

   public void standaloneModalWD665( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlRDefCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      }
      else
      {
         edtAlRDefCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlRFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlRFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFasCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      }
      else
      {
         edtAlRFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlRFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFasCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( (0==A4798AlRPieClaM) )
         {
            A4794AlRPieCla = A4796AlRPieClaA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         }
         else
         {
            A4794AlRPieCla = A4798AlRPieClaM ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         }
      }
   }

   public void loadWD665( )
   {
      /* Using cursor T00WD48 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound665 = (short)(1) ;
         A4404AlRDef = T00WD48_A4404AlRDef[0] ;
         A4971AlRDefAca = T00WD48_A4971AlRDefAca[0] ;
         A4972AlRDefCru = T00WD48_A4972AlRDefCru[0] ;
         A4396AlRDefDsc = T00WD48_A4396AlRDefDsc[0] ;
         n4396AlRDefDsc = T00WD48_n4396AlRDefDsc[0] ;
         A4397AlRDefPnt = T00WD48_A4397AlRDefPnt[0] ;
         n4397AlRDefPnt = T00WD48_n4397AlRDefPnt[0] ;
         A4403AlRDefCnt = T00WD48_A4403AlRDefCnt[0] ;
         n4403AlRDefCnt = T00WD48_n4403AlRDefCnt[0] ;
         A5261AlrDefPri = T00WD48_A5261AlrDefPri[0] ;
         n5261AlrDefPri = T00WD48_n5261AlrDefPri[0] ;
         zmWD665( -33) ;
      }
      pr_default.close(40);
      onLoadActionsWD665( ) ;
   }

   public void onLoadActionsWD665( )
   {
      A4404AlRDef = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
      if ( (GXutil.strcmp("", A4412AlRFasCod)==0) )
      {
         A4972AlRDefCru = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
      }
      else
      {
         A4972AlRDefCru = 0 ;
      }
      if ( ! (GXutil.strcmp("", A4412AlRFasCod)==0) )
      {
         A4971AlRDefAca = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
      }
      else
      {
         A4971AlRDefAca = 0 ;
      }
      if ( isIns( )  )
      {
         A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca-O4971AlRDefAca) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4805AlRPieDefT = (int)(O4805AlRPieDefT-O4971AlRDefAca) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
            }
         }
      }
      if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
      {
         A4796AlRPieClaA = (byte)(99) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      else
      {
         if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
         {
            A4796AlRPieClaA = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         else
         {
            if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               A4796AlRPieClaA = (byte)(33) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
            }
            else
            {
               if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
               else
               {
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
            }
         }
      }
      if ( (0==A4798AlRPieClaM) )
      {
         A4794AlRPieCla = A4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      else
      {
         A4794AlRPieCla = A4798AlRPieClaM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      if ( isIns( )  )
      {
         A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru-O4972AlRDefCru) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4806AlRPieDefC = (int)(O4806AlRPieDefC-O4972AlRDefCru) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
            }
         }
      }
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
         }
      }
   }

   public void checkExtendedTableWD665( )
   {
      nIsDirty_665 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalWD665( ) ;
      /* Using cursor T00WD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4395AlRDefCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "AlbDet TipDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4396AlRDefDsc = T00WD8_A4396AlRDefDsc[0] ;
      n4396AlRDefDsc = T00WD8_n4396AlRDefDsc[0] ;
      A4397AlRDefPnt = T00WD8_A4397AlRDefPnt[0] ;
      n4397AlRDefPnt = T00WD8_n4397AlRDefPnt[0] ;
      pr_default.close(6);
      nIsDirty_665 = (short)(1) ;
      A4404AlRDef = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
      if ( (GXutil.strcmp("", A4412AlRFasCod)==0) )
      {
         nIsDirty_665 = (short)(1) ;
         A4972AlRDefCru = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
      }
      else
      {
         nIsDirty_665 = (short)(1) ;
         A4972AlRDefCru = 0 ;
      }
      if ( ! (GXutil.strcmp("", A4412AlRFasCod)==0) )
      {
         nIsDirty_665 = (short)(1) ;
         A4971AlRDefAca = (int)(DecimalUtil.decToDouble(A4403AlRDefCnt.multiply(DecimalUtil.doubleToDec(A4397AlRDefPnt)))) ;
      }
      else
      {
         nIsDirty_665 = (short)(1) ;
         A4971AlRDefAca = 0 ;
      }
      if ( isIns( )  )
      {
         nIsDirty_665 = (short)(1) ;
         A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_665 = (short)(1) ;
            A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca-O4971AlRDefAca) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_665 = (short)(1) ;
               A4805AlRPieDefT = (int)(O4805AlRPieDefT-O4971AlRDefAca) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
            }
         }
      }
      if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
      {
         nIsDirty_665 = (short)(1) ;
         A4796AlRPieClaA = (byte)(99) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      else
      {
         if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
         {
            nIsDirty_665 = (short)(1) ;
            A4796AlRPieClaA = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         else
         {
            if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               nIsDirty_665 = (short)(1) ;
               A4796AlRPieClaA = (byte)(33) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
            }
            else
            {
               if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  nIsDirty_665 = (short)(1) ;
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
               else
               {
                  nIsDirty_665 = (short)(1) ;
                  A4796AlRPieClaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
            }
         }
      }
      if ( (0==A4798AlRPieClaM) )
      {
         nIsDirty_665 = (short)(1) ;
         A4794AlRPieCla = A4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      else
      {
         nIsDirty_665 = (short)(1) ;
         A4794AlRPieCla = A4798AlRPieClaM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      }
      if ( isIns( )  )
      {
         nIsDirty_665 = (short)(1) ;
         A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_665 = (short)(1) ;
            A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru-O4972AlRDefCru) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_665 = (short)(1) ;
               A4806AlRPieDefC = (int)(O4806AlRPieDefC-O4972AlRDefCru) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
            }
         }
      }
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         nIsDirty_665 = (short)(1) ;
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            nIsDirty_665 = (short)(1) ;
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               nIsDirty_665 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               nIsDirty_665 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
         }
      }
   }

   public void closeExtendedTableCursorsWD665( )
   {
      pr_default.close(6);
   }

   public void enableDisableWD665( )
   {
   }

   public void gxload_34( String A396EmprCod ,
                          short A4395AlRDefCod )
   {
      /* Using cursor T00WD49 */
      pr_default.execute(41, new Object[] {A396EmprCod, Short.valueOf(A4395AlRDefCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "AlbDet TipDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4396AlRDefDsc = T00WD49_A4396AlRDefDsc[0] ;
      n4396AlRDefDsc = T00WD49_n4396AlRDefDsc[0] ;
      A4397AlRDefPnt = T00WD49_A4397AlRDefPnt[0] ;
      n4397AlRDefPnt = T00WD49_n4397AlRDefPnt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4396AlRDefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4397AlRDefPnt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(41) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(41);
   }

   public void getKeyWD665( )
   {
      /* Using cursor T00WD50 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound665 = (short)(1) ;
      }
      else
      {
         RcdFound665 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKeyWD665( )
   {
      /* Using cursor T00WD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zmWD665( 33) ;
         RcdFound665 = (short)(1) ;
         initializeNonKeyWD665( ) ;
         A4404AlRDef = T00WD7_A4404AlRDef[0] ;
         A4971AlRDefAca = T00WD7_A4971AlRDefAca[0] ;
         A4972AlRDefCru = T00WD7_A4972AlRDefCru[0] ;
         A4412AlRFasCod = T00WD7_A4412AlRFasCod[0] ;
         A4403AlRDefCnt = T00WD7_A4403AlRDefCnt[0] ;
         n4403AlRDefCnt = T00WD7_n4403AlRDefCnt[0] ;
         A5261AlrDefPri = T00WD7_A5261AlrDefPri[0] ;
         n5261AlrDefPri = T00WD7_n5261AlrDefPri[0] ;
         A4395AlRDefCod = T00WD7_A4395AlRDefCod[0] ;
         O4972AlRDefCru = A4972AlRDefCru ;
         O4971AlRDefAca = A4971AlRDefAca ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4395AlRDefCod = A4395AlRDefCod ;
         Z4412AlRFasCod = A4412AlRFasCod ;
         sMode665 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalWD665( ) ;
         loadWD665( ) ;
         Gx_mode = sMode665 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound665 = (short)(0) ;
         initializeNonKeyWD665( ) ;
         sMode665 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalWD665( ) ;
         Gx_mode = sMode665 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesWD665( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrencyWD665( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00WD6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAlRPie"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z4404AlRDef != T00WD6_A4404AlRDef[0] ) || ( Z4971AlRDefAca != T00WD6_A4971AlRDefAca[0] ) || ( Z4972AlRDefCru != T00WD6_A4972AlRDefCru[0] ) || ( DecimalUtil.compareTo(Z4403AlRDefCnt, T00WD6_A4403AlRDefCnt[0]) != 0 ) || ( Z5261AlrDefPri != T00WD6_A5261AlrDefPri[0] ) )
         {
            if ( Z4404AlRDef != T00WD6_A4404AlRDef[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRDef");
               GXutil.writeLogRaw("Old: ",Z4404AlRDef);
               GXutil.writeLogRaw("Current: ",T00WD6_A4404AlRDef[0]);
            }
            if ( Z4971AlRDefAca != T00WD6_A4971AlRDefAca[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRDefAca");
               GXutil.writeLogRaw("Old: ",Z4971AlRDefAca);
               GXutil.writeLogRaw("Current: ",T00WD6_A4971AlRDefAca[0]);
            }
            if ( Z4972AlRDefCru != T00WD6_A4972AlRDefCru[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRDefCru");
               GXutil.writeLogRaw("Old: ",Z4972AlRDefCru);
               GXutil.writeLogRaw("Current: ",T00WD6_A4972AlRDefCru[0]);
            }
            if ( DecimalUtil.compareTo(Z4403AlRDefCnt, T00WD6_A4403AlRDefCnt[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRDefCnt");
               GXutil.writeLogRaw("Old: ",Z4403AlRDefCnt);
               GXutil.writeLogRaw("Current: ",T00WD6_A4403AlRDefCnt[0]);
            }
            if ( Z5261AlrDefPri != T00WD6_A5261AlrDefPri[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlrDefPri");
               GXutil.writeLogRaw("Old: ",Z5261AlrDefPri);
               GXutil.writeLogRaw("Current: ",T00WD6_A5261AlrDefPri[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAlRPie"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertWD665( )
   {
      beforeValidateWD665( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD665( ) ;
      }
      if ( AnyError == 0 )
      {
         zmWD665( 0) ;
         checkOptimisticConcurrencyWD665( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWD665( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertWD665( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD51 */
                  pr_default.execute(43, new Object[] {Integer.valueOf(A4404AlRDef), Integer.valueOf(A4971AlRDefAca), Integer.valueOf(A4972AlRDefCru), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, A4412AlRFasCod, Boolean.valueOf(n4403AlRDefCnt), A4403AlRDefCnt, Boolean.valueOf(n5261AlrDefPri), Byte.valueOf(A5261AlrDefPri), A396EmprCod, Short.valueOf(A4395AlRDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPie");
                  if ( (pr_default.getStatus(43) == 1) )
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
                        processLevelWD665( ) ;
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
            loadWD665( ) ;
         }
         endLevelWD665( ) ;
      }
      closeExtendedTableCursorsWD665( ) ;
   }

   public void updateWD665( )
   {
      beforeValidateWD665( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD665( ) ;
      }
      if ( ( nIsMod_665 != 0 ) || ( nIsDirty_665 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyWD665( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmWD665( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateWD665( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00WD52 */
                     pr_default.execute(44, new Object[] {Integer.valueOf(A4404AlRDef), Integer.valueOf(A4971AlRDefAca), Integer.valueOf(A4972AlRDefCru), Boolean.valueOf(n4403AlRDefCnt), A4403AlRDefCnt, Boolean.valueOf(n5261AlrDefPri), Byte.valueOf(A5261AlrDefPri), A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPie");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAlRPie"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateWD665( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelWD665( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyWD665( ) ;
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
            endLevelWD665( ) ;
         }
      }
      closeExtendedTableCursorsWD665( ) ;
   }

   public void deferredUpdateWD665( )
   {
   }

   public void deleteWD665( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateWD665( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWD665( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsWD665( ) ;
         afterConfirmWD665( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteWD665( ) ;
            if ( AnyError == 0 )
            {
               scanStartWD955( ) ;
               while ( RcdFound955 != 0 )
               {
                  getByPrimaryKeyWD955( ) ;
                  deleteWD955( ) ;
                  scanNextWD955( ) ;
               }
               scanEndWD955( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD53 */
                  pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPie");
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
      sMode665 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelWD665( ) ;
      Gx_mode = sMode665 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsWD665( )
   {
      standaloneModalWD665( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00WD54 */
         pr_default.execute(46, new Object[] {A396EmprCod, Short.valueOf(A4395AlRDefCod)});
         A4396AlRDefDsc = T00WD54_A4396AlRDefDsc[0] ;
         n4396AlRDefDsc = T00WD54_n4396AlRDefDsc[0] ;
         A4397AlRDefPnt = T00WD54_A4397AlRDefPnt[0] ;
         n4397AlRDefPnt = T00WD54_n4397AlRDefPnt[0] ;
         pr_default.close(46);
         if ( isIns( )  )
         {
            A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4805AlRPieDefT = (int)(O4805AlRPieDefT+A4971AlRDefAca-O4971AlRDefAca) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4805AlRPieDefT = (int)(O4805AlRPieDefT-O4971AlRDefAca) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
               }
            }
         }
         if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
         {
            A4796AlRPieClaA = (byte)(99) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         }
         else
         {
            if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               A4796AlRPieClaA = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
            }
            else
            {
               if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  A4796AlRPieClaA = (byte)(33) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
               }
               else
               {
                  if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
                  {
                     A4796AlRPieClaA = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                  }
                  else
                  {
                     A4796AlRPieClaA = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
                  }
               }
            }
         }
         if ( (0==A4798AlRPieClaM) )
         {
            A4794AlRPieCla = A4796AlRPieClaA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         }
         else
         {
            A4794AlRPieCla = A4798AlRPieClaM ;
            httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         }
         if ( isIns( )  )
         {
            A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4806AlRPieDefC = (int)(O4806AlRPieDefC+A4972AlRDefCru-O4972AlRDefCru) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4806AlRPieDefC = (int)(O4806AlRPieDefC-O4972AlRDefCru) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
               }
            }
         }
         if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
         {
            A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
               {
                  A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               }
               else
               {
                  A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               }
            }
         }
      }
   }

   public void processNestedLevelWD955( )
   {
      nGXsfl_212_idx = 0 ;
      while ( nGXsfl_212_idx < nRC_GXsfl_212 )
      {
         readRowWD955( ) ;
         if ( ( nRcdExists_955 != 0 ) || ( nIsMod_955 != 0 ) )
         {
            standaloneNotModalWD955( ) ;
            getKeyWD955( ) ;
            if ( ( nRcdExists_955 == 0 ) && ( nRcdDeleted_955 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertWD955( ) ;
            }
            else
            {
               if ( RcdFound955 != 0 )
               {
                  if ( ( nRcdDeleted_955 != 0 ) && ( nRcdExists_955 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteWD955( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_955 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateWD955( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_955 == 0 )
                  {
                     GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlRDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_955_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlrDefMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A6683AlrDefMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefCDe_Internalname, GXutil.ltrim( localUtil.ntoc( A6684AlRDefCDe, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRDefMtf_Internalname, GXutil.ltrim( localUtil.ntoc( A12910AlRDefMtf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6683AlrDefMtr_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( Z6683AlrDefMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6684AlRDefCDe_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( Z6684AlRDefCDe, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12910AlRDefMtf_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( Z12910AlRDefMtf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_955_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_955_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_955_"+sGXsfl_212_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_955 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_955_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_955_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFMTR_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFCDE_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCDe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRDEFMTF_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefMtf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllWD955( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_955 = (short)(0) ;
      nIsMod_955 = (short)(0) ;
      nRcdDeleted_955 = (short)(0) ;
   }

   public void processLevelWD665( )
   {
      /* Save parent mode. */
      sMode665 = Gx_mode ;
      processNestedLevelWD955( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode665 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelWD665( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartWD665( )
   {
      /* Scan By routine */
      /* Using cursor T00WD55 */
      pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      RcdFound665 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound665 = (short)(1) ;
         A4395AlRDefCod = T00WD55_A4395AlRDefCod[0] ;
         A4412AlRFasCod = T00WD55_A4412AlRFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextWD665( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound665 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound665 = (short)(1) ;
         A4395AlRDefCod = T00WD55_A4395AlRDefCod[0] ;
         A4412AlRFasCod = T00WD55_A4412AlRFasCod[0] ;
      }
   }

   public void scanEndWD665( )
   {
      pr_default.close(47);
   }

   public void afterConfirmWD665( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertWD665( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateWD665( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteWD665( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteWD665( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateWD665( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesWD665( )
   {
      edtAlRDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefDsc_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFasCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDefPnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefPnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefPnt_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDefCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCnt_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDef_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDefAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefAca_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDefCru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCru_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlrDefPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrDefPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefPri_Enabled), 5, 0), !bGXsfl_160_Refreshing);
   }

   public void zmWD955( int GX_JID )
   {
      if ( ( GX_JID == 35 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6684AlRDefCDe = T00WD5_A6684AlRDefCDe[0] ;
            Z12910AlRDefMtf = T00WD5_A12910AlRDefMtf[0] ;
         }
         else
         {
            Z6684AlRDefCDe = A6684AlRDefCDe ;
            Z12910AlRDefMtf = A12910AlRDefMtf ;
         }
      }
      if ( GX_JID == -35 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4395AlRDefCod = A4395AlRDefCod ;
         Z4412AlRFasCod = A4412AlRFasCod ;
         Z6683AlrDefMtr = A6683AlrDefMtr ;
         Z6684AlRDefCDe = A6684AlRDefCDe ;
         Z12910AlRDefMtf = A12910AlRDefMtf ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalWD955( )
   {
   }

   public void standaloneModalWD955( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlrDefMtr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlrDefMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefMtr_Enabled), 5, 0), !bGXsfl_212_Refreshing);
      }
      else
      {
         edtAlrDefMtr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlrDefMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefMtr_Enabled), 5, 0), !bGXsfl_212_Refreshing);
      }
   }

   public void loadWD955( )
   {
      /* Using cursor T00WD56 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound955 = (short)(1) ;
         A6684AlRDefCDe = T00WD56_A6684AlRDefCDe[0] ;
         n6684AlRDefCDe = T00WD56_n6684AlRDefCDe[0] ;
         A12910AlRDefMtf = T00WD56_A12910AlRDefMtf[0] ;
         n12910AlRDefMtf = T00WD56_n12910AlRDefMtf[0] ;
         zmWD955( -35) ;
      }
      pr_default.close(48);
      onLoadActionsWD955( ) ;
   }

   public void onLoadActionsWD955( )
   {
   }

   public void checkExtendedTableWD955( )
   {
      nIsDirty_955 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalWD955( ) ;
   }

   public void closeExtendedTableCursorsWD955( )
   {
   }

   public void enableDisableWD955( )
   {
   }

   public void getKeyWD955( )
   {
      /* Using cursor T00WD57 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr});
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound955 = (short)(1) ;
      }
      else
      {
         RcdFound955 = (short)(0) ;
      }
      pr_default.close(49);
   }

   public void getByPrimaryKeyWD955( )
   {
      /* Using cursor T00WD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmWD955( 35) ;
         RcdFound955 = (short)(1) ;
         initializeNonKeyWD955( ) ;
         A6683AlrDefMtr = T00WD5_A6683AlrDefMtr[0] ;
         A6684AlRDefCDe = T00WD5_A6684AlRDefCDe[0] ;
         n6684AlRDefCDe = T00WD5_n6684AlRDefCDe[0] ;
         A12910AlRDefMtf = T00WD5_A12910AlRDefMtf[0] ;
         n12910AlRDefMtf = T00WD5_n12910AlRDefMtf[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4395AlRDefCod = A4395AlRDefCod ;
         Z4412AlRFasCod = A4412AlRFasCod ;
         Z6683AlrDefMtr = A6683AlrDefMtr ;
         sMode955 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalWD955( ) ;
         loadWD955( ) ;
         Gx_mode = sMode955 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound955 = (short)(0) ;
         initializeNonKeyWD955( ) ;
         sMode955 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalWD955( ) ;
         Gx_mode = sMode955 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesWD955( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrencyWD955( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00WD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAlRPMe"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z6684AlRDefCDe, T00WD4_A6684AlRDefCDe[0]) != 0 ) || ( DecimalUtil.compareTo(Z12910AlRDefMtf, T00WD4_A12910AlRDefMtf[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6684AlRDefCDe, T00WD4_A6684AlRDefCDe[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRDefCDe");
               GXutil.writeLogRaw("Old: ",Z6684AlRDefCDe);
               GXutil.writeLogRaw("Current: ",T00WD4_A6684AlRDefCDe[0]);
            }
            if ( DecimalUtil.compareTo(Z12910AlRDefMtf, T00WD4_A12910AlRDefMtf[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AlRDefMtf");
               GXutil.writeLogRaw("Old: ",Z12910AlRDefMtf);
               GXutil.writeLogRaw("Current: ",T00WD4_A12910AlRDefMtf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAlRPMe"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertWD955( )
   {
      beforeValidateWD955( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD955( ) ;
      }
      if ( AnyError == 0 )
      {
         zmWD955( 0) ;
         checkOptimisticConcurrencyWD955( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWD955( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertWD955( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD58 */
                  pr_default.execute(50, new Object[] {Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr, Boolean.valueOf(n6684AlRDefCDe), A6684AlRDefCDe, Boolean.valueOf(n12910AlRDefMtf), A12910AlRDefMtf, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPMe");
                  if ( (pr_default.getStatus(50) == 1) )
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
            loadWD955( ) ;
         }
         endLevelWD955( ) ;
      }
      closeExtendedTableCursorsWD955( ) ;
   }

   public void updateWD955( )
   {
      beforeValidateWD955( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD955( ) ;
      }
      if ( ( nIsMod_955 != 0 ) || ( nIsDirty_955 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyWD955( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmWD955( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateWD955( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00WD59 */
                     pr_default.execute(51, new Object[] {Boolean.valueOf(n6684AlRDefCDe), A6684AlRDefCDe, Boolean.valueOf(n12910AlRDefMtf), A12910AlRDefMtf, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPMe");
                     if ( (pr_default.getStatus(51) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAlRPMe"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateWD955( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyWD955( ) ;
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
            endLevelWD955( ) ;
         }
      }
      closeExtendedTableCursorsWD955( ) ;
   }

   public void deferredUpdateWD955( )
   {
   }

   public void deleteWD955( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateWD955( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWD955( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsWD955( ) ;
         afterConfirmWD955( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteWD955( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00WD60 */
               pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod, A6683AlrDefMtr});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlRPMe");
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
      sMode955 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelWD955( ) ;
      Gx_mode = sMode955 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsWD955( )
   {
      standaloneModalWD955( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelWD955( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartWD955( )
   {
      /* Scan By routine */
      /* Using cursor T00WD61 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A4395AlRDefCod), A4412AlRFasCod});
      RcdFound955 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound955 = (short)(1) ;
         A6683AlrDefMtr = T00WD61_A6683AlrDefMtr[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextWD955( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound955 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound955 = (short)(1) ;
         A6683AlrDefMtr = T00WD61_A6683AlrDefMtr[0] ;
      }
   }

   public void scanEndWD955( )
   {
      pr_default.close(53);
   }

   public void afterConfirmWD955( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertWD955( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateWD955( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteWD955( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteWD955( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateWD955( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesWD955( )
   {
      edtAlrDefMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrDefMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefMtr_Enabled), 5, 0), !bGXsfl_212_Refreshing);
      edtAlRDefCDe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCDe_Enabled), 5, 0), !bGXsfl_212_Refreshing);
      edtAlRDefMtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefMtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefMtf_Enabled), 5, 0), !bGXsfl_212_Refreshing);
   }

   public void send_integrity_lvl_hashesWD955( )
   {
   }

   public void send_integrity_lvl_hashesWD665( )
   {
   }

   public void zmWD770( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5263AREBarCod = T00WD3_A5263AREBarCod[0] ;
            Z5264AREBarCodR = T00WD3_A5264AREBarCodR[0] ;
            Z5265AREBarCodP = T00WD3_A5265AREBarCodP[0] ;
            Z5266AREFch = T00WD3_A5266AREFch[0] ;
            Z5268AREProCod = T00WD3_A5268AREProCod[0] ;
            Z5269AREFasCod = T00WD3_A5269AREFasCod[0] ;
            Z5270AREAlbProC = T00WD3_A5270AREAlbProC[0] ;
            Z5271AREAlmCod = T00WD3_A5271AREAlmCod[0] ;
            Z5272ARETip = T00WD3_A5272ARETip[0] ;
            Z5273AREKgm = T00WD3_A5273AREKgm[0] ;
            Z5274AREMtr = T00WD3_A5274AREMtr[0] ;
            Z5275AREArt = T00WD3_A5275AREArt[0] ;
            Z5276AREUsu = T00WD3_A5276AREUsu[0] ;
         }
         else
         {
            Z5263AREBarCod = A5263AREBarCod ;
            Z5264AREBarCodR = A5264AREBarCodR ;
            Z5265AREBarCodP = A5265AREBarCodP ;
            Z5266AREFch = A5266AREFch ;
            Z5268AREProCod = A5268AREProCod ;
            Z5269AREFasCod = A5269AREFasCod ;
            Z5270AREAlbProC = A5270AREAlbProC ;
            Z5271AREAlmCod = A5271AREAlmCod ;
            Z5272ARETip = A5272ARETip ;
            Z5273AREKgm = A5273AREKgm ;
            Z5274AREMtr = A5274AREMtr ;
            Z5275AREArt = A5275AREArt ;
            Z5276AREUsu = A5276AREUsu ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z5262AlbRecEvt = A5262AlbRecEvt ;
         Z5263AREBarCod = A5263AREBarCod ;
         Z5264AREBarCodR = A5264AREBarCodR ;
         Z5265AREBarCodP = A5265AREBarCodP ;
         Z5266AREFch = A5266AREFch ;
         Z5267AREDsc = A5267AREDsc ;
         Z5268AREProCod = A5268AREProCod ;
         Z5269AREFasCod = A5269AREFasCod ;
         Z5270AREAlbProC = A5270AREAlbProC ;
         Z5271AREAlmCod = A5271AREAlmCod ;
         Z5272ARETip = A5272ARETip ;
         Z5273AREKgm = A5273AREKgm ;
         Z5274AREMtr = A5274AREMtr ;
         Z5275AREArt = A5275AREArt ;
         Z5276AREUsu = A5276AREUsu ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalWD770( )
   {
   }

   public void standaloneModalWD770( )
   {
      if ( isIns( )  || isUpd( )  || isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede afectar la historia", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecEvt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecEvt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecEvt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      }
      else
      {
         edtAlbRecEvt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecEvt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecEvt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      }
   }

   public void loadWD770( )
   {
      /* Using cursor T00WD62 */
      pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt)});
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound770 = (short)(1) ;
         A5267AREDsc = T00WD62_A5267AREDsc[0] ;
         n5267AREDsc = T00WD62_n5267AREDsc[0] ;
         A5263AREBarCod = T00WD62_A5263AREBarCod[0] ;
         n5263AREBarCod = T00WD62_n5263AREBarCod[0] ;
         A5264AREBarCodR = T00WD62_A5264AREBarCodR[0] ;
         n5264AREBarCodR = T00WD62_n5264AREBarCodR[0] ;
         A5265AREBarCodP = T00WD62_A5265AREBarCodP[0] ;
         n5265AREBarCodP = T00WD62_n5265AREBarCodP[0] ;
         A5266AREFch = T00WD62_A5266AREFch[0] ;
         n5266AREFch = T00WD62_n5266AREFch[0] ;
         A5268AREProCod = T00WD62_A5268AREProCod[0] ;
         n5268AREProCod = T00WD62_n5268AREProCod[0] ;
         A5269AREFasCod = T00WD62_A5269AREFasCod[0] ;
         n5269AREFasCod = T00WD62_n5269AREFasCod[0] ;
         A5270AREAlbProC = T00WD62_A5270AREAlbProC[0] ;
         n5270AREAlbProC = T00WD62_n5270AREAlbProC[0] ;
         A5271AREAlmCod = T00WD62_A5271AREAlmCod[0] ;
         n5271AREAlmCod = T00WD62_n5271AREAlmCod[0] ;
         A5272ARETip = T00WD62_A5272ARETip[0] ;
         n5272ARETip = T00WD62_n5272ARETip[0] ;
         A5273AREKgm = T00WD62_A5273AREKgm[0] ;
         n5273AREKgm = T00WD62_n5273AREKgm[0] ;
         A5274AREMtr = T00WD62_A5274AREMtr[0] ;
         n5274AREMtr = T00WD62_n5274AREMtr[0] ;
         A5275AREArt = T00WD62_A5275AREArt[0] ;
         n5275AREArt = T00WD62_n5275AREArt[0] ;
         A5276AREUsu = T00WD62_A5276AREUsu[0] ;
         n5276AREUsu = T00WD62_n5276AREUsu[0] ;
         zmWD770( -36) ;
      }
      pr_default.close(54);
      onLoadActionsWD770( ) ;
   }

   public void onLoadActionsWD770( )
   {
   }

   public void checkExtendedTableWD770( )
   {
      nIsDirty_770 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalWD770( ) ;
      if ( ! ( ( GXutil.strcmp(A5272ARETip, "E") == 0 ) || ( GXutil.strcmp(A5272ARETip, "S") == 0 ) ) )
      {
         GXCCtl = "ARETIP_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtARETip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsWD770( )
   {
   }

   public void enableDisableWD770( )
   {
   }

   public void getKeyWD770( )
   {
      /* Using cursor T00WD63 */
      pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound770 = (short)(1) ;
      }
      else
      {
         RcdFound770 = (short)(0) ;
      }
      pr_default.close(55);
   }

   public void getByPrimaryKeyWD770( )
   {
      /* Using cursor T00WD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmWD770( 36) ;
         RcdFound770 = (short)(1) ;
         initializeNonKeyWD770( ) ;
         A5267AREDsc = T00WD3_A5267AREDsc[0] ;
         n5267AREDsc = T00WD3_n5267AREDsc[0] ;
         A5262AlbRecEvt = T00WD3_A5262AlbRecEvt[0] ;
         A5263AREBarCod = T00WD3_A5263AREBarCod[0] ;
         n5263AREBarCod = T00WD3_n5263AREBarCod[0] ;
         A5264AREBarCodR = T00WD3_A5264AREBarCodR[0] ;
         n5264AREBarCodR = T00WD3_n5264AREBarCodR[0] ;
         A5265AREBarCodP = T00WD3_A5265AREBarCodP[0] ;
         n5265AREBarCodP = T00WD3_n5265AREBarCodP[0] ;
         A5266AREFch = T00WD3_A5266AREFch[0] ;
         n5266AREFch = T00WD3_n5266AREFch[0] ;
         A5268AREProCod = T00WD3_A5268AREProCod[0] ;
         n5268AREProCod = T00WD3_n5268AREProCod[0] ;
         A5269AREFasCod = T00WD3_A5269AREFasCod[0] ;
         n5269AREFasCod = T00WD3_n5269AREFasCod[0] ;
         A5270AREAlbProC = T00WD3_A5270AREAlbProC[0] ;
         n5270AREAlbProC = T00WD3_n5270AREAlbProC[0] ;
         A5271AREAlmCod = T00WD3_A5271AREAlmCod[0] ;
         n5271AREAlmCod = T00WD3_n5271AREAlmCod[0] ;
         A5272ARETip = T00WD3_A5272ARETip[0] ;
         n5272ARETip = T00WD3_n5272ARETip[0] ;
         A5273AREKgm = T00WD3_A5273AREKgm[0] ;
         n5273AREKgm = T00WD3_n5273AREKgm[0] ;
         A5274AREMtr = T00WD3_A5274AREMtr[0] ;
         n5274AREMtr = T00WD3_n5274AREMtr[0] ;
         A5275AREArt = T00WD3_A5275AREArt[0] ;
         n5275AREArt = T00WD3_n5275AREArt[0] ;
         A5276AREUsu = T00WD3_A5276AREUsu[0] ;
         n5276AREUsu = T00WD3_n5276AREUsu[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z5262AlbRecEvt = A5262AlbRecEvt ;
         sMode770 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalWD770( ) ;
         loadWD770( ) ;
         Gx_mode = sMode770 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound770 = (short)(0) ;
         initializeNonKeyWD770( ) ;
         sMode770 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalWD770( ) ;
         Gx_mode = sMode770 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesWD770( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyWD770( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00WD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALRHIS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z5263AREBarCod != T00WD2_A5263AREBarCod[0] ) || ( Z5264AREBarCodR != T00WD2_A5264AREBarCodR[0] ) || ( GXutil.strcmp(Z5265AREBarCodP, T00WD2_A5265AREBarCodP[0]) != 0 ) || !( GXutil.dateCompare(Z5266AREFch, T00WD2_A5266AREFch[0]) ) || ( GXutil.strcmp(Z5268AREProCod, T00WD2_A5268AREProCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5269AREFasCod, T00WD2_A5269AREFasCod[0]) != 0 ) || ( Z5270AREAlbProC != T00WD2_A5270AREAlbProC[0] ) || ( Z5271AREAlmCod != T00WD2_A5271AREAlmCod[0] ) || ( GXutil.strcmp(Z5272ARETip, T00WD2_A5272ARETip[0]) != 0 ) || ( DecimalUtil.compareTo(Z5273AREKgm, T00WD2_A5273AREKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5274AREMtr, T00WD2_A5274AREMtr[0]) != 0 ) || ( GXutil.strcmp(Z5275AREArt, T00WD2_A5275AREArt[0]) != 0 ) || ( GXutil.strcmp(Z5276AREUsu, T00WD2_A5276AREUsu[0]) != 0 ) )
         {
            if ( Z5263AREBarCod != T00WD2_A5263AREBarCod[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREBarCod");
               GXutil.writeLogRaw("Old: ",Z5263AREBarCod);
               GXutil.writeLogRaw("Current: ",T00WD2_A5263AREBarCod[0]);
            }
            if ( Z5264AREBarCodR != T00WD2_A5264AREBarCodR[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREBarCodR");
               GXutil.writeLogRaw("Old: ",Z5264AREBarCodR);
               GXutil.writeLogRaw("Current: ",T00WD2_A5264AREBarCodR[0]);
            }
            if ( GXutil.strcmp(Z5265AREBarCodP, T00WD2_A5265AREBarCodP[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREBarCodP");
               GXutil.writeLogRaw("Old: ",Z5265AREBarCodP);
               GXutil.writeLogRaw("Current: ",T00WD2_A5265AREBarCodP[0]);
            }
            if ( !( GXutil.dateCompare(Z5266AREFch, T00WD2_A5266AREFch[0]) ) )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREFch");
               GXutil.writeLogRaw("Old: ",Z5266AREFch);
               GXutil.writeLogRaw("Current: ",T00WD2_A5266AREFch[0]);
            }
            if ( GXutil.strcmp(Z5268AREProCod, T00WD2_A5268AREProCod[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREProCod");
               GXutil.writeLogRaw("Old: ",Z5268AREProCod);
               GXutil.writeLogRaw("Current: ",T00WD2_A5268AREProCod[0]);
            }
            if ( GXutil.strcmp(Z5269AREFasCod, T00WD2_A5269AREFasCod[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREFasCod");
               GXutil.writeLogRaw("Old: ",Z5269AREFasCod);
               GXutil.writeLogRaw("Current: ",T00WD2_A5269AREFasCod[0]);
            }
            if ( Z5270AREAlbProC != T00WD2_A5270AREAlbProC[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREAlbProC");
               GXutil.writeLogRaw("Old: ",Z5270AREAlbProC);
               GXutil.writeLogRaw("Current: ",T00WD2_A5270AREAlbProC[0]);
            }
            if ( Z5271AREAlmCod != T00WD2_A5271AREAlmCod[0] )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREAlmCod");
               GXutil.writeLogRaw("Old: ",Z5271AREAlmCod);
               GXutil.writeLogRaw("Current: ",T00WD2_A5271AREAlmCod[0]);
            }
            if ( GXutil.strcmp(Z5272ARETip, T00WD2_A5272ARETip[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"ARETip");
               GXutil.writeLogRaw("Old: ",Z5272ARETip);
               GXutil.writeLogRaw("Current: ",T00WD2_A5272ARETip[0]);
            }
            if ( DecimalUtil.compareTo(Z5273AREKgm, T00WD2_A5273AREKgm[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREKgm");
               GXutil.writeLogRaw("Old: ",Z5273AREKgm);
               GXutil.writeLogRaw("Current: ",T00WD2_A5273AREKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z5274AREMtr, T00WD2_A5274AREMtr[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREMtr");
               GXutil.writeLogRaw("Old: ",Z5274AREMtr);
               GXutil.writeLogRaw("Current: ",T00WD2_A5274AREMtr[0]);
            }
            if ( GXutil.strcmp(Z5275AREArt, T00WD2_A5275AREArt[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREArt");
               GXutil.writeLogRaw("Old: ",Z5275AREArt);
               GXutil.writeLogRaw("Current: ",T00WD2_A5275AREArt[0]);
            }
            if ( GXutil.strcmp(Z5276AREUsu, T00WD2_A5276AREUsu[0]) != 0 )
            {
               GXutil.writeLogln("talrpme:[seudo value changed for attri]"+"AREUsu");
               GXutil.writeLogRaw("Old: ",Z5276AREUsu);
               GXutil.writeLogRaw("Current: ",T00WD2_A5276AREUsu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALRHIS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertWD770( )
   {
      beforeValidateWD770( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD770( ) ;
      }
      if ( AnyError == 0 )
      {
         zmWD770( 0) ;
         checkOptimisticConcurrencyWD770( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWD770( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertWD770( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WD64 */
                  pr_default.execute(56, new Object[] {Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt), Boolean.valueOf(n5263AREBarCod), Integer.valueOf(A5263AREBarCod), Boolean.valueOf(n5264AREBarCodR), Byte.valueOf(A5264AREBarCodR), Boolean.valueOf(n5265AREBarCodP), A5265AREBarCodP, Boolean.valueOf(n5266AREFch), A5266AREFch, Boolean.valueOf(n5267AREDsc), A5267AREDsc, Boolean.valueOf(n5268AREProCod), A5268AREProCod, Boolean.valueOf(n5269AREFasCod), A5269AREFasCod, Boolean.valueOf(n5270AREAlbProC), Long.valueOf(A5270AREAlbProC), Boolean.valueOf(n5271AREAlmCod), Byte.valueOf(A5271AREAlmCod), Boolean.valueOf(n5272ARETip), A5272ARETip, Boolean.valueOf(n5273AREKgm), A5273AREKgm, Boolean.valueOf(n5274AREMtr), A5274AREMtr, Boolean.valueOf(n5275AREArt), A5275AREArt, Boolean.valueOf(n5276AREUsu), A5276AREUsu, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALRHIS");
                  if ( (pr_default.getStatus(56) == 1) )
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
            loadWD770( ) ;
         }
         endLevelWD770( ) ;
      }
      closeExtendedTableCursorsWD770( ) ;
   }

   public void updateWD770( )
   {
      beforeValidateWD770( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWD770( ) ;
      }
      if ( ( nIsMod_770 != 0 ) || ( nIsDirty_770 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyWD770( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmWD770( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateWD770( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00WD65 */
                     pr_default.execute(57, new Object[] {Boolean.valueOf(n5263AREBarCod), Integer.valueOf(A5263AREBarCod), Boolean.valueOf(n5264AREBarCodR), Byte.valueOf(A5264AREBarCodR), Boolean.valueOf(n5265AREBarCodP), A5265AREBarCodP, Boolean.valueOf(n5266AREFch), A5266AREFch, Boolean.valueOf(n5267AREDsc), A5267AREDsc, Boolean.valueOf(n5268AREProCod), A5268AREProCod, Boolean.valueOf(n5269AREFasCod), A5269AREFasCod, Boolean.valueOf(n5270AREAlbProC), Long.valueOf(A5270AREAlbProC), Boolean.valueOf(n5271AREAlmCod), Byte.valueOf(A5271AREAlmCod), Boolean.valueOf(n5272ARETip), A5272ARETip, Boolean.valueOf(n5273AREKgm), A5273AREKgm, Boolean.valueOf(n5274AREMtr), A5274AREMtr, Boolean.valueOf(n5275AREArt), A5275AREArt, Boolean.valueOf(n5276AREUsu), A5276AREUsu, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALRHIS");
                     if ( (pr_default.getStatus(57) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALRHIS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateWD770( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyWD770( ) ;
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
            endLevelWD770( ) ;
         }
      }
      closeExtendedTableCursorsWD770( ) ;
   }

   public void deferredUpdateWD770( )
   {
   }

   public void deleteWD770( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateWD770( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWD770( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsWD770( ) ;
         afterConfirmWD770( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteWD770( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00WD66 */
               pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A5262AlbRecEvt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALRHIS");
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
      sMode770 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelWD770( ) ;
      Gx_mode = sMode770 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsWD770( )
   {
      standaloneModalWD770( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelWD770( )
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

   public void scanStartWD770( )
   {
      /* Scan By routine */
      /* Using cursor T00WD67 */
      pr_default.execute(59, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      RcdFound770 = (short)(0) ;
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound770 = (short)(1) ;
         A5262AlbRecEvt = T00WD67_A5262AlbRecEvt[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextWD770( )
   {
      /* Scan next routine */
      pr_default.readNext(59);
      RcdFound770 = (short)(0) ;
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound770 = (short)(1) ;
         A5262AlbRecEvt = T00WD67_A5262AlbRecEvt[0] ;
      }
   }

   public void scanEndWD770( )
   {
      pr_default.close(59);
   }

   public void afterConfirmWD770( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertWD770( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateWD770( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteWD770( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteWD770( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateWD770( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesWD770( )
   {
      edtAlbRecEvt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecEvt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecEvt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREBarCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREBarCodR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREBarCodR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREBarCodR_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREBarCodP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREBarCodP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREBarCodP_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREFch_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREDsc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREProCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREFasCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREAlbProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREAlbProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREAlbProC_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREAlmCod_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtARETip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtARETip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtARETip_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREKgm_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREMtr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREArt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAREUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAREUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAREUsu_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void send_integrity_lvl_hashesWD770( )
   {
   }

   public void send_integrity_lvl_hashesWD299( )
   {
   }

   public void subsflControlProps_160665( )
   {
      lblTextblock29_Internalname = "TEXTBLOCK29_"+sGXsfl_160_idx ;
      edtAlRDefCod_Internalname = "ALRDEFCOD_"+sGXsfl_160_idx ;
      lblTextblock30_Internalname = "TEXTBLOCK30_"+sGXsfl_160_idx ;
      edtAlRDefDsc_Internalname = "ALRDEFDSC_"+sGXsfl_160_idx ;
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_160_idx ;
      edtAlRFasCod_Internalname = "ALRFASCOD_"+sGXsfl_160_idx ;
      lblTextblock32_Internalname = "TEXTBLOCK32_"+sGXsfl_160_idx ;
      edtAlRDefPnt_Internalname = "ALRDEFPNT_"+sGXsfl_160_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_160_idx ;
      edtAlRDefCnt_Internalname = "ALRDEFCNT_"+sGXsfl_160_idx ;
      lblTextblock34_Internalname = "TEXTBLOCK34_"+sGXsfl_160_idx ;
      edtAlRDef_Internalname = "ALRDEF_"+sGXsfl_160_idx ;
      lblTextblock35_Internalname = "TEXTBLOCK35_"+sGXsfl_160_idx ;
      edtAlRDefAca_Internalname = "ALRDEFACA_"+sGXsfl_160_idx ;
      lblTextblock36_Internalname = "TEXTBLOCK36_"+sGXsfl_160_idx ;
      edtAlRDefCru_Internalname = "ALRDEFCRU_"+sGXsfl_160_idx ;
      lblTextblock37_Internalname = "TEXTBLOCK37_"+sGXsfl_160_idx ;
      edtAlrDefPri_Internalname = "ALRDEFPRI_"+sGXsfl_160_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_160_idx ;
   }

   public void subsflControlProps_fel_160665( )
   {
      lblTextblock29_Internalname = "TEXTBLOCK29_"+sGXsfl_160_fel_idx ;
      edtAlRDefCod_Internalname = "ALRDEFCOD_"+sGXsfl_160_fel_idx ;
      lblTextblock30_Internalname = "TEXTBLOCK30_"+sGXsfl_160_fel_idx ;
      edtAlRDefDsc_Internalname = "ALRDEFDSC_"+sGXsfl_160_fel_idx ;
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_160_fel_idx ;
      edtAlRFasCod_Internalname = "ALRFASCOD_"+sGXsfl_160_fel_idx ;
      lblTextblock32_Internalname = "TEXTBLOCK32_"+sGXsfl_160_fel_idx ;
      edtAlRDefPnt_Internalname = "ALRDEFPNT_"+sGXsfl_160_fel_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_160_fel_idx ;
      edtAlRDefCnt_Internalname = "ALRDEFCNT_"+sGXsfl_160_fel_idx ;
      lblTextblock34_Internalname = "TEXTBLOCK34_"+sGXsfl_160_fel_idx ;
      edtAlRDef_Internalname = "ALRDEF_"+sGXsfl_160_fel_idx ;
      lblTextblock35_Internalname = "TEXTBLOCK35_"+sGXsfl_160_fel_idx ;
      edtAlRDefAca_Internalname = "ALRDEFACA_"+sGXsfl_160_fel_idx ;
      lblTextblock36_Internalname = "TEXTBLOCK36_"+sGXsfl_160_fel_idx ;
      edtAlRDefCru_Internalname = "ALRDEFCRU_"+sGXsfl_160_fel_idx ;
      lblTextblock37_Internalname = "TEXTBLOCK37_"+sGXsfl_160_fel_idx ;
      edtAlrDefPri_Internalname = "ALRDEFPRI_"+sGXsfl_160_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_160_fel_idx ;
   }

   public void addRowWD665( )
   {
      nRC_GXsfl_212 = 0 ;
      nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_160665( ) ;
      sendRowWD665( ) ;
   }

   public void sendRowWD665( )
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
         if ( ((int)((nGXsfl_160_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_160_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_160_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_160_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock29_Internalname,httpContext.getMessage( "Código de Defecto", ""),"","",lblTextblock29_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4395AlRDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4395AlRDefCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDefCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock30_Internalname,httpContext.getMessage( "Desc. Defecto", ""),"","",lblTextblock30_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefDsc_Internalname,GXutil.rtrim( A4396AlRDefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock31_Internalname,httpContext.getMessage( "Fase", ""),"","",lblTextblock31_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFasCod_Internalname,GXutil.rtrim( A4412AlRFasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,178);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFasCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock32_Internalname,httpContext.getMessage( "Puntaje de Defecto", ""),"","",lblTextblock32_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefPnt_Internalname,GXutil.ltrim( localUtil.ntoc( A4397AlRDefPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDefPnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4397AlRDefPnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4397AlRDefPnt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefPnt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDefPnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock33_Internalname,httpContext.getMessage( "AlRDefCnt", ""),"","",lblTextblock33_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A4403AlRDefCnt, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDefCnt_Enabled!=0) ? localUtil.format( A4403AlRDefCnt, "ZZZ9.99") : localUtil.format( A4403AlRDefCnt, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,188);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefCnt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDefCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(7),"chr",Integer.valueOf(1),"row",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock34_Internalname,httpContext.getMessage( "Defectos", ""),"","",lblTextblock34_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDef_Internalname,GXutil.ltrim( localUtil.ntoc( A4404AlRDef, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4404AlRDef), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4404AlRDef), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDef_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock35_Internalname,httpContext.getMessage( "AlRDefAca", ""),"","",lblTextblock35_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefAca_Internalname,GXutil.ltrim( localUtil.ntoc( A4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDefAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4971AlRDefAca), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4971AlRDefAca), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefAca_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDefAca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock36_Internalname,httpContext.getMessage( "Puntaje defectos Crudo", ""),"","",lblTextblock36_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefCru_Internalname,GXutil.ltrim( localUtil.ntoc( A4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDefCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4972AlRDefCru), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4972AlRDefCru), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefCru_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlRDefCru_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock37_Internalname,httpContext.getMessage( "Principal", ""),"","",lblTextblock37_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 208,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlrDefPri_Internalname,GXutil.ltrim( localUtil.ntoc( A5261AlrDefPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlrDefPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5261AlrDefPri), "9") : localUtil.format( DecimalUtil.doubleToDec(A5261AlrDefPri), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,208);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlrDefPri_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlrDefPri_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol212( ) ;
      nGXsfl_212_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount955 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_955 = (short)(1) ;
            scanStartWD955( ) ;
            while ( RcdFound955 != 0 )
            {
               init_level_properties955( ) ;
               getByPrimaryKeyWD955( ) ;
               addRowWD955( ) ;
               scanNextWD955( ) ;
            }
            scanEndWD955( ) ;
            nBlankRcdCount955 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4972AlRDefCru = A4972AlRDefCru ;
         B4806AlRPieDefC = A4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         B4971AlRDefAca = A4971AlRDefAca ;
         B4805AlRPieDefT = A4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         B4797AlRPieClaC = A4797AlRPieClaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         B4794AlRPieCla = A4794AlRPieCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         B4796AlRPieClaA = A4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
         standaloneNotModalWD955( ) ;
         standaloneModalWD955( ) ;
         sMode955 = Gx_mode ;
         while ( nGXsfl_212_idx < nRC_GXsfl_212 )
         {
            bGXsfl_212_Refreshing = true ;
            readRowWD955( ) ;
            edtavnRcdDeleted_955_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_955_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_955_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_955_Enabled), 5, 0), !bGXsfl_212_Refreshing);
            edtAlrDefMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFMTR_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlrDefMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefMtr_Enabled), 5, 0), !bGXsfl_212_Refreshing);
            edtAlRDefCDe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCDE_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCDe_Enabled), 5, 0), !bGXsfl_212_Refreshing);
            edtAlRDefMtf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFMTF_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRDefMtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefMtf_Enabled), 5, 0), !bGXsfl_212_Refreshing);
            if ( ( nRcdExists_955 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalWD955( ) ;
            }
            sendRowWD955( ) ;
            bGXsfl_212_Refreshing = false ;
         }
         Gx_mode = sMode955 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4972AlRDefCru = B4972AlRDefCru ;
         A4806AlRPieDefC = B4806AlRPieDefC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         A4971AlRDefAca = B4971AlRDefAca ;
         A4805AlRPieDefT = B4805AlRPieDefT ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4797AlRPieClaC = B4797AlRPieClaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         A4794AlRPieCla = B4794AlRPieCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
         A4796AlRPieClaA = B4796AlRPieClaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount955 = (short)(5) ;
         nRcdExists_955 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartWD955( ) ;
            while ( RcdFound955 != 0 )
            {
               sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx+1), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
               subsflControlProps_212955( ) ;
               init_level_properties955( ) ;
               standaloneNotModalWD955( ) ;
               getByPrimaryKeyWD955( ) ;
               standaloneModalWD955( ) ;
               addRowWD955( ) ;
               scanNextWD955( ) ;
            }
            scanEndWD955( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode955 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx+1), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
      subsflControlProps_212955( ) ;
      initAllWD955( ) ;
      init_level_properties955( ) ;
      B4972AlRDefCru = A4972AlRDefCru ;
      B4806AlRPieDefC = A4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      B4971AlRDefAca = A4971AlRDefAca ;
      B4805AlRPieDefT = A4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      B4797AlRPieClaC = A4797AlRPieClaC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      B4794AlRPieCla = A4794AlRPieCla ;
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      B4796AlRPieClaA = A4796AlRPieClaA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      nRcdExists_955 = (short)(0) ;
      nIsMod_955 = (short)(0) ;
      nRcdDeleted_955 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 160 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_160_idx, ".")) == 0 ) )
      {
         nBlankRcdCount955 = (short)(nBlankRcdUsr955+nBlankRcdCount955) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount955 > 0 )
      {
         standaloneNotModalWD955( ) ;
         standaloneModalWD955( ) ;
         addRowWD955( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlrDefMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount955 = (short)(nBlankRcdCount955-1) ;
      }
      Gx_mode = sMode955 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4972AlRDefCru = B4972AlRDefCru ;
      A4806AlRPieDefC = B4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      A4971AlRDefAca = B4971AlRDefAca ;
      A4805AlRPieDefT = B4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      A4797AlRPieClaC = B4797AlRPieClaC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      A4794AlRPieCla = B4794AlRPieCla ;
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      A4796AlRPieClaA = B4796AlRPieClaA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_160_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_160_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_160_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesWD665( ) ;
      GXCCtl = "Z4395AlRDefCod_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4395AlRDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4412AlRFasCod_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4412AlRFasCod));
      GXCCtl = "Z4404AlRDef_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4404AlRDef, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4971AlRDefAca_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4972AlRDefCru_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4403AlRDefCnt_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4403AlRDefCnt, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5261AlrDefPri_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5261AlrDefPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4972AlRDefCru_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4972AlRDefCru, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4971AlRDefAca_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4971AlRDefAca, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_212_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_212_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_665_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_665_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_665_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_665, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFCOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFDSC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFASCOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFPNT_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefPnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFCNT_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEF_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFACA_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFCRU_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCru_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFPRI_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefPri_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_160_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowWD665( )
   {
      nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_160665( ) ;
      edtAlRDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCOD_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFDSC_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFASCOD_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefPnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFPNT_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCNT_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEF_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFACA_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefCru_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCRU_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlrDefPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFPRI_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlRDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlRDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALRDEFCOD_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefCod_Internalname ;
         wbErr = true ;
         A4395AlRDefCod = (short)(0) ;
      }
      else
      {
         A4395AlRDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtAlRDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4396AlRDefDsc = httpContext.cgiGet( edtAlRDefDsc_Internalname) ;
      n4396AlRDefDsc = false ;
      A4412AlRFasCod = httpContext.cgiGet( edtAlRFasCod_Internalname) ;
      A4397AlRDefPnt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlRDefPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n4397AlRDefPnt = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlRDefCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlRDefCnt_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "ALRDEFCNT_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefCnt_Internalname ;
         wbErr = true ;
         A4403AlRDefCnt = DecimalUtil.ZERO ;
         n4403AlRDefCnt = false ;
      }
      else
      {
         A4403AlRDefCnt = localUtil.ctond( httpContext.cgiGet( edtAlRDefCnt_Internalname)) ;
         n4403AlRDefCnt = false ;
      }
      A4404AlRDef = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4971AlRDefAca = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRDefAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4972AlRDefCru = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRDefCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlrDefPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlrDefPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "ALRDEFPRI_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlrDefPri_Internalname ;
         wbErr = true ;
         A5261AlrDefPri = (byte)(0) ;
         n5261AlrDefPri = false ;
      }
      else
      {
         A5261AlrDefPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlrDefPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5261AlrDefPri = false ;
      }
      GXCCtl = "Z4395AlRDefCod_" + sGXsfl_160_idx ;
      Z4395AlRDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4412AlRFasCod_" + sGXsfl_160_idx ;
      Z4412AlRFasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4404AlRDef_" + sGXsfl_160_idx ;
      Z4404AlRDef = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4971AlRDefAca_" + sGXsfl_160_idx ;
      Z4971AlRDefAca = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4972AlRDefCru_" + sGXsfl_160_idx ;
      Z4972AlRDefCru = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4403AlRDefCnt_" + sGXsfl_160_idx ;
      Z4403AlRDefCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5261AlrDefPri_" + sGXsfl_160_idx ;
      Z5261AlrDefPri = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O4972AlRDefCru_" + sGXsfl_160_idx ;
      O4972AlRDefCru = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O4971AlRDefAca_" + sGXsfl_160_idx ;
      O4971AlRDefAca = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_212_" + sGXsfl_160_idx ;
      nRC_GXsfl_212 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_665_" + sGXsfl_160_idx ;
      nRcdDeleted_665 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_665_" + sGXsfl_160_idx ;
      nRcdExists_665 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_665_" + sGXsfl_160_idx ;
      nIsMod_665 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_212_" + sGXsfl_160_idx ;
      nRC_GXsfl_212 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_212955( )
   {
      edtavnRcdDeleted_955_Internalname = "vNRCDDELETED_955_"+sGXsfl_212_idx ;
      edtAlrDefMtr_Internalname = "ALRDEFMTR_"+sGXsfl_212_idx ;
      edtAlRDefCDe_Internalname = "ALRDEFCDE_"+sGXsfl_212_idx ;
      edtAlRDefMtf_Internalname = "ALRDEFMTF_"+sGXsfl_212_idx ;
   }

   public void subsflControlProps_fel_212955( )
   {
      edtavnRcdDeleted_955_Internalname = "vNRCDDELETED_955_"+sGXsfl_212_fel_idx ;
      edtAlrDefMtr_Internalname = "ALRDEFMTR_"+sGXsfl_212_fel_idx ;
      edtAlRDefCDe_Internalname = "ALRDEFCDE_"+sGXsfl_212_fel_idx ;
      edtAlRDefMtf_Internalname = "ALRDEFMTF_"+sGXsfl_212_fel_idx ;
   }

   public void addRowWD955( )
   {
      nGXsfl_212_idx = (int)(nGXsfl_212_idx+1) ;
      sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
      subsflControlProps_212955( ) ;
      sendRowWD955( ) ;
   }

   public void sendRowWD955( )
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
         if ( ((int)((nGXsfl_212_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_955_" + sGXsfl_212_idx + "',1);gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_212_idx + "',212)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_955_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_955_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_955), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_955), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,213);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_955_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_955_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(212),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_955_" + sGXsfl_212_idx + "',1);gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_212_idx + "',212)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlrDefMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A6683AlrDefMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6683AlrDefMtr, "ZZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,214);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlrDefMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlrDefMtr_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(212),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_955_" + sGXsfl_212_idx + "',1);gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_212_idx + "',212)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefCDe_Internalname,GXutil.ltrim( localUtil.ntoc( A6684AlRDefCDe, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDefCDe_Enabled!=0) ? localUtil.format( A6684AlRDefCDe, "ZZZ9.99") : localUtil.format( A6684AlRDefCDe, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,215);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefCDe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRDefCDe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(212),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_955_" + sGXsfl_212_idx + "',1);gx.fn.setControlValue('nIsMod_665_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_212_idx + "',212)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRDefMtf_Internalname,GXutil.ltrim( localUtil.ntoc( A12910AlRDefMtf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRDefMtf_Enabled!=0) ? localUtil.format( A12910AlRDefMtf, "ZZZZZZ9.99") : localUtil.format( A12910AlRDefMtf, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,216);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRDefMtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRDefMtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(212),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesWD955( ) ;
      GXCCtl = "Z6683AlrDefMtr_" + sGXsfl_212_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6683AlrDefMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6684AlRDefCDe_" + sGXsfl_212_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6684AlRDefCDe, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12910AlRDefMtf_" + sGXsfl_212_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12910AlRDefMtf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_955_" + sGXsfl_212_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_955_" + sGXsfl_212_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_955_" + sGXsfl_212_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_955, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_955_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_955_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFMTR_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFCDE_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCDe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRDEFMTF_"+sGXsfl_212_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefMtf_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowWD955( )
   {
      nGXsfl_212_idx = (int)(nGXsfl_212_idx+1) ;
      sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
      subsflControlProps_212955( ) ;
      edtavnRcdDeleted_955_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_955_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlrDefMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFMTR_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefCDe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFCDE_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRDefMtf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRDEFMTF_"+sGXsfl_212_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_955_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_955_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_955");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_955_Internalname ;
         wbErr = true ;
         nRcdDeleted_955 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_955 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_955_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlrDefMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlrDefMtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALRDEFMTR_" + sGXsfl_212_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlrDefMtr_Internalname ;
         wbErr = true ;
         A6683AlrDefMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A6683AlrDefMtr = localUtil.ctond( httpContext.cgiGet( edtAlrDefMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlRDefCDe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlRDefCDe_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "ALRDEFCDE_" + sGXsfl_212_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefCDe_Internalname ;
         wbErr = true ;
         A6684AlRDefCDe = DecimalUtil.ZERO ;
         n6684AlRDefCDe = false ;
      }
      else
      {
         A6684AlRDefCDe = localUtil.ctond( httpContext.cgiGet( edtAlRDefCDe_Internalname)) ;
         n6684AlRDefCDe = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlRDefMtf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlRDefMtf_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALRDEFMTF_" + sGXsfl_212_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefMtf_Internalname ;
         wbErr = true ;
         A12910AlRDefMtf = DecimalUtil.ZERO ;
         n12910AlRDefMtf = false ;
      }
      else
      {
         A12910AlRDefMtf = localUtil.ctond( httpContext.cgiGet( edtAlRDefMtf_Internalname)) ;
         n12910AlRDefMtf = false ;
      }
      GXCCtl = "Z6683AlrDefMtr_" + sGXsfl_212_idx ;
      Z6683AlrDefMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6684AlRDefCDe_" + sGXsfl_212_idx ;
      Z6684AlRDefCDe = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12910AlRDefMtf_" + sGXsfl_212_idx ;
      Z12910AlRDefMtf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_955_" + sGXsfl_212_idx ;
      nRcdDeleted_955 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_955_" + sGXsfl_212_idx ;
      nRcdExists_955 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_955_" + sGXsfl_212_idx ;
      nIsMod_955 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_220770( )
   {
      edtavnRcdDeleted_770_Internalname = "vNRCDDELETED_770_"+sGXsfl_220_idx ;
      edtAlbRecEvt_Internalname = "ALBRECEVT_"+sGXsfl_220_idx ;
      edtAREBarCod_Internalname = "AREBARCOD_"+sGXsfl_220_idx ;
      edtAREBarCodR_Internalname = "AREBARCODR_"+sGXsfl_220_idx ;
      edtAREBarCodP_Internalname = "AREBARCODP_"+sGXsfl_220_idx ;
      edtAREFch_Internalname = "AREFCH_"+sGXsfl_220_idx ;
      edtAREDsc_Internalname = "AREDSC_"+sGXsfl_220_idx ;
      edtAREProCod_Internalname = "AREPROCOD_"+sGXsfl_220_idx ;
      edtAREFasCod_Internalname = "AREFASCOD_"+sGXsfl_220_idx ;
      edtAREAlbProC_Internalname = "AREALBPROC_"+sGXsfl_220_idx ;
      edtAREAlmCod_Internalname = "AREALMCOD_"+sGXsfl_220_idx ;
      edtARETip_Internalname = "ARETIP_"+sGXsfl_220_idx ;
      edtAREKgm_Internalname = "AREKGM_"+sGXsfl_220_idx ;
      edtAREMtr_Internalname = "AREMTR_"+sGXsfl_220_idx ;
      edtAREArt_Internalname = "AREART_"+sGXsfl_220_idx ;
      edtAREUsu_Internalname = "AREUSU_"+sGXsfl_220_idx ;
   }

   public void subsflControlProps_fel_220770( )
   {
      edtavnRcdDeleted_770_Internalname = "vNRCDDELETED_770_"+sGXsfl_220_fel_idx ;
      edtAlbRecEvt_Internalname = "ALBRECEVT_"+sGXsfl_220_fel_idx ;
      edtAREBarCod_Internalname = "AREBARCOD_"+sGXsfl_220_fel_idx ;
      edtAREBarCodR_Internalname = "AREBARCODR_"+sGXsfl_220_fel_idx ;
      edtAREBarCodP_Internalname = "AREBARCODP_"+sGXsfl_220_fel_idx ;
      edtAREFch_Internalname = "AREFCH_"+sGXsfl_220_fel_idx ;
      edtAREDsc_Internalname = "AREDSC_"+sGXsfl_220_fel_idx ;
      edtAREProCod_Internalname = "AREPROCOD_"+sGXsfl_220_fel_idx ;
      edtAREFasCod_Internalname = "AREFASCOD_"+sGXsfl_220_fel_idx ;
      edtAREAlbProC_Internalname = "AREALBPROC_"+sGXsfl_220_fel_idx ;
      edtAREAlmCod_Internalname = "AREALMCOD_"+sGXsfl_220_fel_idx ;
      edtARETip_Internalname = "ARETIP_"+sGXsfl_220_fel_idx ;
      edtAREKgm_Internalname = "AREKGM_"+sGXsfl_220_fel_idx ;
      edtAREMtr_Internalname = "AREMTR_"+sGXsfl_220_fel_idx ;
      edtAREArt_Internalname = "AREART_"+sGXsfl_220_fel_idx ;
      edtAREUsu_Internalname = "AREUSU_"+sGXsfl_220_fel_idx ;
   }

   public void addRowWD770( )
   {
      nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220770( ) ;
      sendRowWD770( ) ;
   }

   public void sendRowWD770( )
   {
      Grid3Row = GXWebRow.GetNew(context) ;
      if ( subGrid3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         subGrid3_Backcolor = subGrid3_Allbackcolor ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
         subGrid3_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_220_idx) % (2))) == 0 )
         {
            subGrid3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_770_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_770_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_770), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_770), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_770_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_770_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 222,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecEvt_Internalname,GXutil.ltrim( localUtil.ntoc( A5262AlbRecEvt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5262AlbRecEvt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,222);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecEvt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecEvt_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 223,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A5263AREBarCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAREBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5263AREBarCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5263AREBarCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,223);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREBarCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREBarCodR_Internalname,GXutil.ltrim( localUtil.ntoc( A5264AREBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAREBarCodR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5264AREBarCodR), "9") : localUtil.format( DecimalUtil.doubleToDec(A5264AREBarCodR), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREBarCodR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREBarCodR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREBarCodP_Internalname,GXutil.rtrim( A5265AREBarCodP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,225);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREBarCodP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREBarCodP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 226,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREFch_Internalname,localUtil.ttoc( A5266AREFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5266AREFch, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,226);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 227,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREDsc_Internalname,A5267AREDsc,A5267AREDsc,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,227);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9999),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 228,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREProCod_Internalname,GXutil.rtrim( A5268AREProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,228);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREFasCod_Internalname,GXutil.rtrim( A5269AREFasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 230,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREAlbProC_Internalname,GXutil.ltrim( localUtil.ntoc( A5270AREAlbProC, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAREAlbProC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5270AREAlbProC), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5270AREAlbProC), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,230);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREAlbProC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREAlbProC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREAlmCod_Internalname,GXutil.ltrim( localUtil.ntoc( A5271AREAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAREAlmCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5271AREAlmCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A5271AREAlmCod), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREAlmCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREAlmCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtARETip_Internalname,GXutil.rtrim( A5272ARETip),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,232);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtARETip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtARETip_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A5273AREKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAREKgm_Enabled!=0) ? localUtil.format( A5273AREKgm, "ZZZZZ9.99") : localUtil.format( A5273AREKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,233);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A5274AREMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAREMtr_Enabled!=0) ? localUtil.format( A5274AREMtr, "ZZZZZ9.99") : localUtil.format( A5274AREMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,234);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREArt_Internalname,GXutil.rtrim( A5275AREArt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,235);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREArt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_770_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 236,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAREUsu_Internalname,GXutil.rtrim( A5276AREUsu),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAREUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAREUsu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid3Row);
      send_integrity_lvl_hashesWD770( ) ;
      GXCCtl = "Z5262AlbRecEvt_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5262AlbRecEvt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5263AREBarCod_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5263AREBarCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5264AREBarCodR_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5264AREBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5265AREBarCodP_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5265AREBarCodP));
      GXCCtl = "Z5266AREFch_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z5266AREFch, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z5268AREProCod_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5268AREProCod));
      GXCCtl = "Z5269AREFasCod_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5269AREFasCod));
      GXCCtl = "Z5270AREAlbProC_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5270AREAlbProC, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5271AREAlmCod_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5271AREAlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5272ARETip_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5272ARETip));
      GXCCtl = "Z5273AREKgm_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5273AREKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5274AREMtr_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5274AREMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5275AREArt_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5275AREArt));
      GXCCtl = "Z5276AREUsu_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5276AREUsu));
      GXCCtl = "nRcdDeleted_770_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_770_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_770_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_770, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_770_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_770_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECEVT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecEvt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREBARCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREBARCODR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREBARCODP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREFCH_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREDSC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREPROCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREFASCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREALBPROC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlbProC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREALMCOD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARETIP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtARETip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREKGM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREMTR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREART_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AREUSU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAREUsu_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid3Container.AddRow(Grid3Row);
   }

   public void readRowWD770( )
   {
      nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220770( ) ;
      edtavnRcdDeleted_770_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_770_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecEvt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECEVT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREBARCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREBarCodR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREBARCODR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREBarCodP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREBARCODP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREFCH_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREDSC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREPROCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREFASCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREAlbProC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREALBPROC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREAlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREALMCOD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtARETip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARETIP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREKGM_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREMTR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREART_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAREUsu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AREUSU_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_770_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_770_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_770");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_770_Internalname ;
         wbErr = true ;
         nRcdDeleted_770 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_770 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_770_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecEvt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecEvt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBRECEVT_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecEvt_Internalname ;
         wbErr = true ;
         A5262AlbRecEvt = (short)(0) ;
      }
      else
      {
         A5262AlbRecEvt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecEvt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAREBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAREBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AREBARCOD_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREBarCod_Internalname ;
         wbErr = true ;
         A5263AREBarCod = 0 ;
         n5263AREBarCod = false ;
      }
      else
      {
         A5263AREBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAREBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5263AREBarCod = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAREBarCodR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAREBarCodR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "AREBARCODR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREBarCodR_Internalname ;
         wbErr = true ;
         A5264AREBarCodR = (byte)(0) ;
         n5264AREBarCodR = false ;
      }
      else
      {
         A5264AREBarCodR = (byte)(localUtil.ctol( httpContext.cgiGet( edtAREBarCodR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5264AREBarCodR = false ;
      }
      A5265AREBarCodP = httpContext.cgiGet( edtAREBarCodP_Internalname) ;
      n5265AREBarCodP = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtAREFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "AREFCH_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREFch_Internalname ;
         wbErr = true ;
         A5266AREFch = GXutil.resetTime( GXutil.nullDate() );
         n5266AREFch = false ;
      }
      else
      {
         A5266AREFch = localUtil.ctot( httpContext.cgiGet( edtAREFch_Internalname)) ;
         n5266AREFch = false ;
      }
      A5267AREDsc = httpContext.cgiGet( edtAREDsc_Internalname) ;
      n5267AREDsc = false ;
      A5268AREProCod = httpContext.cgiGet( edtAREProCod_Internalname) ;
      n5268AREProCod = false ;
      A5269AREFasCod = httpContext.cgiGet( edtAREFasCod_Internalname) ;
      n5269AREFasCod = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAREAlbProC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAREAlbProC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "AREALBPROC_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREAlbProC_Internalname ;
         wbErr = true ;
         A5270AREAlbProC = 0 ;
         n5270AREAlbProC = false ;
      }
      else
      {
         A5270AREAlbProC = localUtil.ctol( httpContext.cgiGet( edtAREAlbProC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n5270AREAlbProC = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAREAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAREAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "AREALMCOD_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREAlmCod_Internalname ;
         wbErr = true ;
         A5271AREAlmCod = (byte)(0) ;
         n5271AREAlmCod = false ;
      }
      else
      {
         A5271AREAlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAREAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5271AREAlmCod = false ;
      }
      A5272ARETip = httpContext.cgiGet( edtARETip_Internalname) ;
      n5272ARETip = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAREKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAREKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "AREKGM_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREKgm_Internalname ;
         wbErr = true ;
         A5273AREKgm = DecimalUtil.ZERO ;
         n5273AREKgm = false ;
      }
      else
      {
         A5273AREKgm = localUtil.ctond( httpContext.cgiGet( edtAREKgm_Internalname)) ;
         n5273AREKgm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAREMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAREMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "AREMTR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAREMtr_Internalname ;
         wbErr = true ;
         A5274AREMtr = DecimalUtil.ZERO ;
         n5274AREMtr = false ;
      }
      else
      {
         A5274AREMtr = localUtil.ctond( httpContext.cgiGet( edtAREMtr_Internalname)) ;
         n5274AREMtr = false ;
      }
      A5275AREArt = httpContext.cgiGet( edtAREArt_Internalname) ;
      n5275AREArt = false ;
      A5276AREUsu = httpContext.cgiGet( edtAREUsu_Internalname) ;
      n5276AREUsu = false ;
      GXCCtl = "Z5262AlbRecEvt_" + sGXsfl_220_idx ;
      Z5262AlbRecEvt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5263AREBarCod_" + sGXsfl_220_idx ;
      Z5263AREBarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5264AREBarCodR_" + sGXsfl_220_idx ;
      Z5264AREBarCodR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5265AREBarCodP_" + sGXsfl_220_idx ;
      Z5265AREBarCodP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5266AREFch_" + sGXsfl_220_idx ;
      Z5266AREFch = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z5268AREProCod_" + sGXsfl_220_idx ;
      Z5268AREProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5269AREFasCod_" + sGXsfl_220_idx ;
      Z5269AREFasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5270AREAlbProC_" + sGXsfl_220_idx ;
      Z5270AREAlbProC = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z5271AREAlmCod_" + sGXsfl_220_idx ;
      Z5271AREAlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5272ARETip_" + sGXsfl_220_idx ;
      Z5272ARETip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5273AREKgm_" + sGXsfl_220_idx ;
      Z5273AREKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5274AREMtr_" + sGXsfl_220_idx ;
      Z5274AREMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5275AREArt_" + sGXsfl_220_idx ;
      Z5275AREArt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5276AREUsu_" + sGXsfl_220_idx ;
      Z5276AREUsu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_770_" + sGXsfl_220_idx ;
      nRcdDeleted_770 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_770_" + sGXsfl_220_idx ;
      nRcdExists_770 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_770_" + sGXsfl_220_idx ;
      nIsMod_770 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlrDefMtr_Enabled = edtAlrDefMtr_Enabled ;
      defedtAlbRecEvt_Enabled = edtAlbRecEvt_Enabled ;
      defedtAlRFasCod_Enabled = edtAlRFasCod_Enabled ;
      defedtAlRDefCod_Enabled = edtAlRDefCod_Enabled ;
   }

   public void confirmValuesWD0( )
   {
      nGXsfl_160_idx = 0 ;
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_160665( ) ;
      while ( nGXsfl_160_idx < nRC_GXsfl_160 )
      {
         nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
         sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_160665( ) ;
         httpContext.changePostValue( "Z4395AlRDefCod_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4395AlRDefCod_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4395AlRDefCod_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z4412AlRFasCod_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4412AlRFasCod_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4412AlRFasCod_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z4404AlRDef_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4404AlRDef_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4404AlRDef_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z4971AlRDefAca_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4971AlRDefAca_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4971AlRDefAca_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z4972AlRDefCru_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4972AlRDefCru_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4972AlRDefCru_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z4403AlRDefCnt_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4403AlRDefCnt_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4403AlRDefCnt_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z5261AlrDefPri_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z5261AlrDefPri_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5261AlrDefPri_"+sGXsfl_160_idx) ;
      }
      nGXsfl_212_idx = 0 ;
      sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
      subsflControlProps_212955( ) ;
      while ( nGXsfl_212_idx < nRC_GXsfl_212 )
      {
         nGXsfl_212_idx = (int)(nGXsfl_212_idx+1) ;
         sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
         subsflControlProps_212955( ) ;
         httpContext.changePostValue( "Z6683AlrDefMtr_"+sGXsfl_212_idx, httpContext.cgiGet( "ZT_"+"Z6683AlrDefMtr_"+sGXsfl_212_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6683AlrDefMtr_"+sGXsfl_212_idx) ;
         httpContext.changePostValue( "Z6684AlRDefCDe_"+sGXsfl_212_idx, httpContext.cgiGet( "ZT_"+"Z6684AlRDefCDe_"+sGXsfl_212_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6684AlRDefCDe_"+sGXsfl_212_idx) ;
         httpContext.changePostValue( "Z12910AlRDefMtf_"+sGXsfl_212_idx, httpContext.cgiGet( "ZT_"+"Z12910AlRDefMtf_"+sGXsfl_212_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12910AlRDefMtf_"+sGXsfl_212_idx) ;
      }
      nGXsfl_220_idx = 0 ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220770( ) ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
         sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_220770( ) ;
         httpContext.changePostValue( "Z5262AlbRecEvt_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5262AlbRecEvt_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5262AlbRecEvt_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5263AREBarCod_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5263AREBarCod_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5263AREBarCod_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5264AREBarCodR_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5264AREBarCodR_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5264AREBarCodR_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5265AREBarCodP_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5265AREBarCodP_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5265AREBarCodP_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5266AREFch_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5266AREFch_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5266AREFch_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5268AREProCod_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5268AREProCod_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5268AREProCod_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5269AREFasCod_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5269AREFasCod_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5269AREFasCod_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5270AREAlbProC_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5270AREAlbProC_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5270AREAlbProC_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5271AREAlmCod_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5271AREAlmCod_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5271AREAlmCod_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5272ARETip_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5272ARETip_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5272ARETip_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5273AREKgm_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5273AREKgm_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5273AREKgm_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5274AREMtr_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5274AREMtr_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5274AREMtr_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5275AREArt_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5275AREArt_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5275AREArt_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z5276AREUsu_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z5276AREUsu_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5276AREUsu_"+sGXsfl_220_idx) ;
      }
      httpContext.changePostValue( "O4972AlRDefCru", httpContext.cgiGet( "T4972AlRDefCru")) ;
      httpContext.deletePostValue( "T4972AlRDefCru") ;
      httpContext.changePostValue( "O4971AlRDefAca", httpContext.cgiGet( "T4971AlRDefAca")) ;
      httpContext.deletePostValue( "T4971AlRDefAca") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talrpme", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TAlRPMe");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("AlbRecMtr", localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbRecKgm", localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talrpme:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2159AlbRecPie", GXutil.rtrim( Z2159AlbRecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4795AlRPieCal", GXutil.rtrim( Z4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4798AlRPieClaM", GXutil.ltrim( localUtil.ntoc( Z4798AlRPieClaM, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4799AlRPieUltC", GXutil.rtrim( Z4799AlRPieUltC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4807AlRExp1", GXutil.rtrim( Z4807AlRExp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4808AlRExp2", GXutil.rtrim( Z4808AlRExp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3731AlbRecIdPz", GXutil.rtrim( Z3731AlbRecIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "O4806AlRPieDefC", GXutil.ltrim( localUtil.ntoc( O4806AlRPieDefC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4805AlRPieDefT", GXutil.ltrim( localUtil.ntoc( O4805AlRPieDefT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_160", GXutil.ltrim( localUtil.ntoc( nGXsfl_160_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_220", GXutil.ltrim( localUtil.ntoc( nGXsfl_220_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talrpme", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TAlRPMe" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Defectos de Piezas (Mtrs)", "") ;
   }

   public void initializeNonKeyWD299( )
   {
      A4794AlRPieCla = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4794AlRPieCla), 2, 0));
      A4796AlRPieClaA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4796AlRPieClaA), 2, 0));
      A4797AlRPieClaC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      A4800AlRPieBarC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
      A4801AlRPieBarR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
      A4802AlRPieBarP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      A4803AlRPieFasC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4803AlRPieFasC", A4803AlRPieFasC);
      A4804AlRPieFasL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4804AlRPieFasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4804AlRPieFasL), 4, 0));
      A4831AlrPieCalP = "" ;
      n4831AlrPieCalP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      A5259AlrPieMtrA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5259AlrPieMtrA", GXutil.ltrimstr( A5259AlrPieMtrA, 9, 2));
      A5260AlrPieKgmA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5260AlrPieKgmA", GXutil.ltrimstr( A5260AlrPieKgmA, 9, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrimstr( A2157AlbRecMtr, 9, 2));
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrimstr( A2155AlbRecKgm, 9, 2));
      A4798AlRPieClaM = (byte)(0) ;
      n4798AlRPieClaM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4798AlRPieClaM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4798AlRPieClaM), 2, 0));
      A4799AlRPieUltC = "" ;
      n4799AlRPieUltC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4799AlRPieUltC", A4799AlRPieUltC);
      A4805AlRPieDefT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      A4806AlRPieDefC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      A4807AlRExp1 = "" ;
      n4807AlRExp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4807AlRExp1", A4807AlRExp1);
      A4808AlRExp2 = "" ;
      n4808AlRExp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4808AlRExp2", A4808AlRExp2);
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A3731AlbRecIdPz = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3731AlbRecIdPz", A3731AlbRecIdPz);
      O4806AlRPieDefC = A4806AlRPieDefC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      O4805AlRPieDefT = A4805AlRPieDefT ;
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
      Z4795AlRPieCal = "" ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z4798AlRPieClaM = (byte)(0) ;
      Z4799AlRPieUltC = "" ;
      Z4807AlRExp1 = "" ;
      Z4808AlRExp2 = "" ;
      Z3731AlbRecIdPz = "" ;
   }

   public void initAllWD299( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A2159AlbRecPie = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      initializeNonKeyWD299( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyWD665( )
   {
      A4404AlRDef = 0 ;
      A4971AlRDefAca = 0 ;
      A4972AlRDefCru = 0 ;
      A4396AlRDefDsc = "" ;
      n4396AlRDefDsc = false ;
      A4397AlRDefPnt = (short)(0) ;
      n4397AlRDefPnt = false ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      n4403AlRDefCnt = false ;
      A5261AlrDefPri = (byte)(0) ;
      n5261AlrDefPri = false ;
      O4972AlRDefCru = A4972AlRDefCru ;
      O4971AlRDefAca = A4971AlRDefAca ;
      Z4404AlRDef = 0 ;
      Z4971AlRDefAca = 0 ;
      Z4972AlRDefCru = 0 ;
      Z4403AlRDefCnt = DecimalUtil.ZERO ;
      Z5261AlrDefPri = (byte)(0) ;
   }

   public void initAllWD665( )
   {
      A4395AlRDefCod = (short)(0) ;
      A4412AlRFasCod = "" ;
      initializeNonKeyWD665( ) ;
   }

   public void standaloneModalInsertWD665( )
   {
   }

   public void initializeNonKeyWD955( )
   {
      A6684AlRDefCDe = DecimalUtil.ZERO ;
      n6684AlRDefCDe = false ;
      A12910AlRDefMtf = DecimalUtil.ZERO ;
      n12910AlRDefMtf = false ;
      Z6684AlRDefCDe = DecimalUtil.ZERO ;
      Z12910AlRDefMtf = DecimalUtil.ZERO ;
   }

   public void initAllWD955( )
   {
      A6683AlrDefMtr = DecimalUtil.ZERO ;
      initializeNonKeyWD955( ) ;
   }

   public void standaloneModalInsertWD955( )
   {
   }

   public void initializeNonKeyWD770( )
   {
      A5263AREBarCod = 0 ;
      n5263AREBarCod = false ;
      A5264AREBarCodR = (byte)(0) ;
      n5264AREBarCodR = false ;
      A5265AREBarCodP = "" ;
      n5265AREBarCodP = false ;
      A5266AREFch = GXutil.resetTime( GXutil.nullDate() );
      n5266AREFch = false ;
      A5267AREDsc = "" ;
      n5267AREDsc = false ;
      A5268AREProCod = "" ;
      n5268AREProCod = false ;
      A5269AREFasCod = "" ;
      n5269AREFasCod = false ;
      A5270AREAlbProC = 0 ;
      n5270AREAlbProC = false ;
      A5271AREAlmCod = (byte)(0) ;
      n5271AREAlmCod = false ;
      A5272ARETip = "" ;
      n5272ARETip = false ;
      A5273AREKgm = DecimalUtil.ZERO ;
      n5273AREKgm = false ;
      A5274AREMtr = DecimalUtil.ZERO ;
      n5274AREMtr = false ;
      A5275AREArt = "" ;
      n5275AREArt = false ;
      A5276AREUsu = "" ;
      n5276AREUsu = false ;
      Z5263AREBarCod = 0 ;
      Z5264AREBarCodR = (byte)(0) ;
      Z5265AREBarCodP = "" ;
      Z5266AREFch = GXutil.resetTime( GXutil.nullDate() );
      Z5268AREProCod = "" ;
      Z5269AREFasCod = "" ;
      Z5270AREAlbProC = 0 ;
      Z5271AREAlmCod = (byte)(0) ;
      Z5272ARETip = "" ;
      Z5273AREKgm = DecimalUtil.ZERO ;
      Z5274AREMtr = DecimalUtil.ZERO ;
      Z5275AREArt = "" ;
      Z5276AREUsu = "" ;
   }

   public void initAllWD770( )
   {
      A5262AlbRecEvt = (short)(0) ;
      initializeNonKeyWD770( ) ;
   }

   public void standaloneModalInsertWD770( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241541927", true, true);
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
      httpContext.AddJavascriptSource("talrpme.js", "?20268241541928", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties665( )
   {
      edtAlRFasCod_Enabled = defedtAlRFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFasCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtAlRDefCod_Enabled = defedtAlRDefCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRDefCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
   }

   public void init_level_properties955( )
   {
      edtAlrDefMtr_Enabled = defedtAlrDefMtr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrDefMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrDefMtr_Enabled), 5, 0), !bGXsfl_212_Refreshing);
   }

   public void init_level_properties770( )
   {
      edtAlbRecEvt_Enabled = defedtAlbRecEvt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecEvt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecEvt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void startgridcontrol160( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock29_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4395AlRDefCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock30_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4396AlRDefDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock31_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4412AlRFasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock32_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4397AlRDefPnt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefPnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock33_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4403AlRDefCnt, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock34_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4404AlRDef, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock35_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4971AlRDefAca, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock36_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4972AlRDefCru, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCru_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock37_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5261AlrDefPri, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefPri_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol220( )
   {
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("Header", subGrid3_Header);
      Grid3Container.AddObjectProperty("DeleteMethod", "none");
      Grid3Container.AddObjectProperty("Class", "");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_770, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_770_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5262AlbRecEvt, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecEvt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5263AREBarCod, (byte)(6), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5264AREBarCodR, (byte)(1), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A5265AREBarCodP));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREBarCodP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", localUtil.ttoc( A5266AREFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", A5267AREDsc);
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A5268AREProCod));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A5269AREFasCod));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5270AREAlbProC, (byte)(10), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlbProC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5271AREAlmCod, (byte)(1), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREAlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A5272ARETip));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtARETip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5273AREKgm, (byte)(9), (byte)(2), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5274AREMtr, (byte)(9), (byte)(2), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A5275AREArt));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A5276AREUsu));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAREUsu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol212( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_955, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_955_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6683AlrDefMtr, (byte)(10), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrDefMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6684AlRDefCDe, (byte)(7), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefCDe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12910AlRDefMtf, (byte)(10), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRDefMtf_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAlRPieCla_Internalname = "ALRPIECLA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlRPieCal_Internalname = "ALRPIECAL" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlRPieClaA_Internalname = "ALRPIECLAA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlRPieClaC_Internalname = "ALRPIECLAC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlRPieClaM_Internalname = "ALRPIECLAM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAlRPieUltC_Internalname = "ALRPIEULTC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAlRPieBarC_Internalname = "ALRPIEBARC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtAlRPieBarR_Internalname = "ALRPIEBARR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtAlRPieBarP_Internalname = "ALRPIEBARP" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAlRPieFasC_Internalname = "ALRPIEFASC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtAlRPieFasL_Internalname = "ALRPIEFASL" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtAlrPieCalP_Internalname = "ALRPIECALP" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtAlrPieMtrA_Internalname = "ALRPIEMTRA" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtAlrPieKgmA_Internalname = "ALRPIEKGMA" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtAlRPieDefT_Internalname = "ALRPIEDEFT" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtAlRPieDefC_Internalname = "ALRPIEDEFC" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtAlRExp1_Internalname = "ALREXP1" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtAlRExp2_Internalname = "ALREXP2" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtProceCod_Internalname = "PROCECOD" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtProceNom_Internalname = "PROCENOM" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtAlRDefCod_Internalname = "ALRDEFCOD" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtAlRDefDsc_Internalname = "ALRDEFDSC" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtAlRFasCod_Internalname = "ALRFASCOD" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtAlRDefPnt_Internalname = "ALRDEFPNT" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtAlRDefCnt_Internalname = "ALRDEFCNT" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtAlRDef_Internalname = "ALRDEF" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtAlRDefAca_Internalname = "ALRDEFACA" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtAlRDefCru_Internalname = "ALRDEFCRU" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtAlrDefPri_Internalname = "ALRDEFPRI" ;
      edtavnRcdDeleted_955_Internalname = "vNRCDDELETED_955" ;
      edtAlrDefMtr_Internalname = "ALRDEFMTR" ;
      edtAlRDefCDe_Internalname = "ALRDEFCDE" ;
      edtAlRDefMtf_Internalname = "ALRDEFMTF" ;
      tblTable3_Internalname = "TABLE3" ;
      edtavnRcdDeleted_770_Internalname = "vNRCDDELETED_770" ;
      edtAlbRecEvt_Internalname = "ALBRECEVT" ;
      edtAREBarCod_Internalname = "AREBARCOD" ;
      edtAREBarCodR_Internalname = "AREBARCODR" ;
      edtAREBarCodP_Internalname = "AREBARCODP" ;
      edtAREFch_Internalname = "AREFCH" ;
      edtAREDsc_Internalname = "AREDSC" ;
      edtAREProCod_Internalname = "AREPROCOD" ;
      edtAREFasCod_Internalname = "AREFASCOD" ;
      edtAREAlbProC_Internalname = "AREALBPROC" ;
      edtAREAlmCod_Internalname = "AREALMCOD" ;
      edtARETip_Internalname = "ARETIP" ;
      edtAREKgm_Internalname = "AREKGM" ;
      edtAREMtr_Internalname = "AREMTR" ;
      edtAREArt_Internalname = "AREART" ;
      edtAREUsu_Internalname = "AREUSU" ;
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
      subGrid3_Internalname = "GRID3" ;
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
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Allowselection = (byte)(0) ;
      subGrid3_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock37_Caption = httpContext.getMessage( "Principal", "") ;
      lblTextblock36_Caption = httpContext.getMessage( "Puntaje defectos Crudo", "") ;
      lblTextblock35_Caption = httpContext.getMessage( "AlRDefAca", "") ;
      lblTextblock34_Caption = httpContext.getMessage( "Defectos", "") ;
      lblTextblock33_Caption = httpContext.getMessage( "AlRDefCnt", "") ;
      lblTextblock32_Caption = httpContext.getMessage( "Puntaje de Defecto", "") ;
      lblTextblock31_Caption = httpContext.getMessage( "Fase", "") ;
      lblTextblock30_Caption = httpContext.getMessage( "Desc. Defecto", "") ;
      lblTextblock29_Caption = httpContext.getMessage( "Código de Defecto", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Defectos de Piezas (Mtrs)", "") );
      edtAREUsu_Jsonclick = "" ;
      edtAREArt_Jsonclick = "" ;
      edtAREMtr_Jsonclick = "" ;
      edtAREKgm_Jsonclick = "" ;
      edtARETip_Jsonclick = "" ;
      edtAREAlmCod_Jsonclick = "" ;
      edtAREAlbProC_Jsonclick = "" ;
      edtAREFasCod_Jsonclick = "" ;
      edtAREProCod_Jsonclick = "" ;
      edtAREDsc_Jsonclick = "" ;
      edtAREFch_Jsonclick = "" ;
      edtAREBarCodP_Jsonclick = "" ;
      edtAREBarCodR_Jsonclick = "" ;
      edtAREBarCod_Jsonclick = "" ;
      edtAlbRecEvt_Jsonclick = "" ;
      edtavnRcdDeleted_770_Jsonclick = "" ;
      subGrid3_Class = "" ;
      subGrid3_Backcolorstyle = (byte)(2) ;
      edtAlRDefMtf_Jsonclick = "" ;
      edtAlRDefCDe_Jsonclick = "" ;
      edtAlrDefMtr_Jsonclick = "" ;
      edtavnRcdDeleted_955_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtAlrDefPri_Jsonclick = "" ;
      edtAlRDefCru_Jsonclick = "" ;
      edtAlRDefAca_Jsonclick = "" ;
      edtAlRDef_Jsonclick = "" ;
      edtAlRDefCnt_Jsonclick = "" ;
      edtAlRDefPnt_Jsonclick = "" ;
      edtAlRFasCod_Jsonclick = "" ;
      edtAlRDefDsc_Jsonclick = "" ;
      edtAlRDefCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtAlRDefMtf_Enabled = 1 ;
      edtAlRDefCDe_Enabled = 1 ;
      edtAlrDefMtr_Enabled = 1 ;
      edtavnRcdDeleted_955_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAREUsu_Enabled = 1 ;
      edtAREArt_Enabled = 1 ;
      edtAREMtr_Enabled = 1 ;
      edtAREKgm_Enabled = 1 ;
      edtARETip_Enabled = 1 ;
      edtAREAlmCod_Enabled = 1 ;
      edtAREAlbProC_Enabled = 1 ;
      edtAREFasCod_Enabled = 1 ;
      edtAREProCod_Enabled = 1 ;
      edtAREDsc_Enabled = 1 ;
      edtAREFch_Enabled = 1 ;
      edtAREBarCodP_Enabled = 1 ;
      edtAREBarCodR_Enabled = 1 ;
      edtAREBarCod_Enabled = 1 ;
      edtAlbRecEvt_Enabled = 1 ;
      edtavnRcdDeleted_770_Enabled = 1 ;
      edtAlrDefPri_Enabled = 1 ;
      edtAlRDefCru_Enabled = 0 ;
      edtAlRDefAca_Enabled = 0 ;
      edtAlRDef_Enabled = 0 ;
      edtAlRDefCnt_Enabled = 1 ;
      edtAlRDefPnt_Enabled = 0 ;
      edtAlRFasCod_Enabled = 1 ;
      edtAlRDefDsc_Enabled = 0 ;
      edtAlRDefCod_Enabled = 1 ;
      edtAlbRecIdPz_Jsonclick = "" ;
      edtAlbRecIdPz_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecIdPz_Enabled = 1 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Backcolor = (int)(0xFFFFFF) ;
      edtProceNom_Enabled = 0 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtProceCod_Enabled = 0 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRDes_Enabled = 0 ;
      edtAlRExp2_Jsonclick = "" ;
      edtAlRExp2_Backcolor = (int)(0xFFFFFF) ;
      edtAlRExp2_Enabled = 1 ;
      edtAlRExp1_Jsonclick = "" ;
      edtAlRExp1_Backcolor = (int)(0xFFFFFF) ;
      edtAlRExp1_Enabled = 1 ;
      edtAlRPieDefC_Jsonclick = "" ;
      edtAlRPieDefC_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieDefC_Enabled = 0 ;
      edtAlRPieDefT_Jsonclick = "" ;
      edtAlRPieDefT_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieDefT_Enabled = 0 ;
      edtAlrPieKgmA_Jsonclick = "" ;
      edtAlrPieKgmA_Backcolor = (int)(0xFFFFFF) ;
      edtAlrPieKgmA_Enabled = 0 ;
      edtAlrPieMtrA_Jsonclick = "" ;
      edtAlrPieMtrA_Backcolor = (int)(0xFFFFFF) ;
      edtAlrPieMtrA_Enabled = 0 ;
      edtAlrPieCalP_Jsonclick = "" ;
      edtAlrPieCalP_Backcolor = (int)(0xFFFFFF) ;
      edtAlrPieCalP_Enabled = 0 ;
      edtAlRPieFasL_Jsonclick = "" ;
      edtAlRPieFasL_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieFasL_Enabled = 0 ;
      edtAlRPieFasC_Jsonclick = "" ;
      edtAlRPieFasC_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieFasC_Enabled = 0 ;
      edtAlRPieBarP_Jsonclick = "" ;
      edtAlRPieBarP_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieBarP_Enabled = 0 ;
      edtAlRPieBarR_Jsonclick = "" ;
      edtAlRPieBarR_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieBarR_Enabled = 0 ;
      edtAlRPieBarC_Jsonclick = "" ;
      edtAlRPieBarC_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieBarC_Enabled = 0 ;
      edtAlRPieUltC_Jsonclick = "" ;
      edtAlRPieUltC_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieUltC_Enabled = 1 ;
      edtAlRPieClaM_Jsonclick = "" ;
      edtAlRPieClaM_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieClaM_Enabled = 1 ;
      edtAlRPieClaC_Jsonclick = "" ;
      edtAlRPieClaC_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieClaC_Enabled = 0 ;
      edtAlRPieClaA_Jsonclick = "" ;
      edtAlRPieClaA_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieClaA_Enabled = 0 ;
      edtAlRPieCal_Jsonclick = "" ;
      edtAlRPieCal_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieCal_Enabled = 0 ;
      edtAlRPieCla_Jsonclick = "" ;
      edtAlRPieCla_Backcolor = (int)(0xFFFFFF) ;
      edtAlRPieCla_Enabled = 0 ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecKgm_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecKgm_Enabled = 0 ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtAlbRecMtr_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecMtr_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecPie_Jsonclick = "" ;
      edtAlbRecPie_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecPie_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 0 ;
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

   public void gx13asaalbreccodWD299( String A396EmprCod ,
                                      String A2159AlbRecPie )
   {
      GXt_int11 = A44AlbRecCod ;
      GXv_int3[0] = GXt_int11 ;
      new app.palbreccod(remoteHandle, context).execute( A396EmprCod, A2159AlbRecPie, GXv_int3) ;
      talrpme_impl.this.GXt_int11 = GXv_int3[0] ;
      A44AlbRecCod = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_160665( ) ;
      while ( nGXsfl_160_idx <= nRC_GXsfl_160 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalWD665( ) ;
         standaloneModalWD665( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowWD665( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
         sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_160665( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_212955( ) ;
      while ( nGXsfl_212_idx <= nRC_GXsfl_212 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalWD665( ) ;
         standaloneModalWD665( ) ;
         standaloneNotModalWD955( ) ;
         standaloneModalWD955( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowWD955( ) ;
         nGXsfl_212_idx = (int)(nGXsfl_212_idx+1) ;
         sGXsfl_212_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_212_idx), 4, 0), (short)(4), "0") + sGXsfl_160_idx ;
         subsflControlProps_212955( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_220770( ) ;
      while ( nGXsfl_220_idx <= nRC_GXsfl_220 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalWD770( ) ;
         standaloneModalWD770( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowWD770( ) ;
         nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
         sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_220770( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
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
      /* Using cursor T00WD34 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00WD34_A407EmprNom[0] ;
      n407EmprNom = T00WD34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(28);
      /* Using cursor T00WD35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1291AlbRDes = T00WD35_A1291AlbRDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = T00WD35_A970ProceCod[0] ;
      n970ProceCod = T00WD35_n970ProceCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      pr_default.close(29);
      /* Using cursor T00WD36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T00WD36_A971ProceNom[0] ;
      n971ProceNom = T00WD36_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(30);
      /* Using cursor T00WD38 */
      pr_default.execute(31, new Object[] {A396EmprCod, A2159AlbRecPie, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         A4800AlRPieBarC = T00WD38_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4800AlRPieBarC = T00WD38_A4800AlRPieBarC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = T00WD38_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4801AlRPieBarR = T00WD38_A4801AlRPieBarR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = T00WD38_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
         A4802AlRPieBarP = T00WD38_A4802AlRPieBarP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      else
      {
         A4800AlRPieBarC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4800AlRPieBarC), 8, 0));
         A4801AlRPieBarR = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.str( A4801AlRPieBarR, 1, 0));
         A4802AlRPieBarP = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", A4802AlRPieBarP);
      }
      pr_default.close(31);
      /* Using cursor T00WD39 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4800AlRPieBarC), Byte.valueOf(A4801AlRPieBarR), A4802AlRPieBarP});
      if ( (pr_default.getStatus(32) != 101) )
      {
         A4831AlrPieCalP = T00WD39_A4831AlrPieCalP[0] ;
         n4831AlrPieCalP = T00WD39_n4831AlrPieCalP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      else
      {
         A4831AlrPieCalP = "N/A" ;
         n4831AlrPieCalP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", A4831AlrPieCalP);
      }
      pr_default.close(32);
      /* Using cursor T00WD41 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A4805AlRPieDefT = T00WD41_A4805AlRPieDefT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = T00WD41_A4806AlRPieDefC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      else
      {
         A4805AlRPieDefT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4805AlRPieDefT), 6, 0));
         A4806AlRPieDefC = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      pr_default.close(33);
      GX_FocusControl = edtAlRPieClaM_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00WD34 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00WD34_A407EmprNom[0] ;
      n407EmprNom = T00WD34_n407EmprNom[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Albreccod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      /* Using cursor T00WD35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1291AlbRDes = T00WD35_A1291AlbRDes[0] ;
      A970ProceCod = T00WD35_A970ProceCod[0] ;
      n970ProceCod = T00WD35_n970ProceCod[0] ;
      pr_default.close(29);
      /* Using cursor T00WD36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A971ProceNom = T00WD36_A971ProceNom[0] ;
      n971ProceNom = T00WD36_n971ProceNom[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
   }

   public void valid_Albrecpie( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00WD38 */
      pr_default.execute(31, new Object[] {A396EmprCod, A2159AlbRecPie, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         A4800AlRPieBarC = T00WD38_A4800AlRPieBarC[0] ;
         A4800AlRPieBarC = T00WD38_A4800AlRPieBarC[0] ;
         A4801AlRPieBarR = T00WD38_A4801AlRPieBarR[0] ;
         A4801AlRPieBarR = T00WD38_A4801AlRPieBarR[0] ;
         A4802AlRPieBarP = T00WD38_A4802AlRPieBarP[0] ;
         A4802AlRPieBarP = T00WD38_A4802AlRPieBarP[0] ;
      }
      else
      {
         A4800AlRPieBarC = 0 ;
         A4801AlRPieBarR = (byte)(0) ;
         A4802AlRPieBarP = "" ;
      }
      pr_default.close(31);
      /* Using cursor T00WD39 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4800AlRPieBarC), Byte.valueOf(A4801AlRPieBarR), A4802AlRPieBarP});
      if ( (pr_default.getStatus(32) != 101) )
      {
         A4831AlrPieCalP = T00WD39_A4831AlrPieCalP[0] ;
         n4831AlrPieCalP = T00WD39_n4831AlrPieCalP[0] ;
      }
      else
      {
         A4831AlrPieCalP = "N/A" ;
         n4831AlrPieCalP = false ;
      }
      pr_default.close(32);
      GXt_int1 = A4804AlRPieFasL ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_int6[0] = GXt_int1 ;
      new app.pbarfaslin(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      A4800AlRPieBarC = this.A4800AlRPieBarC ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      A4801AlRPieBarR = this.A4801AlRPieBarR ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      A4802AlRPieBarP = this.A4802AlRPieBarP ;
      talrpme_impl.this.GXt_int1 = GXv_int6[0] ;
      A4804AlRPieFasL = GXt_int1 ;
      GXt_char7 = A4803AlRPieFasC ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = GXt_char7 ;
      new app.pbarfascod(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      A4800AlRPieBarC = this.A4800AlRPieBarC ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      A4801AlRPieBarR = this.A4801AlRPieBarR ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      A4802AlRPieBarP = this.A4802AlRPieBarP ;
      talrpme_impl.this.GXt_char7 = GXv_char2[0] ;
      A4803AlRPieFasC = GXt_char7 ;
      /* Using cursor T00WD41 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A4805AlRPieDefT = T00WD41_A4805AlRPieDefT[0] ;
         A4806AlRPieDefC = T00WD41_A4806AlRPieDefC[0] ;
      }
      else
      {
         A4805AlRPieDefT = 0 ;
         A4806AlRPieDefC = 0 ;
      }
      pr_default.close(33);
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
            }
         }
      }
      GXt_decimal9 = A5260AlrPieKgmA ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = A2159AlbRecPie ;
      GXv_decimal10[0] = GXt_decimal9 ;
      new app.pbarpiekil(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      A4800AlRPieBarC = this.A4800AlRPieBarC ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      A4801AlRPieBarR = this.A4801AlRPieBarR ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      A4802AlRPieBarP = this.A4802AlRPieBarP ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
      talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
      A5260AlrPieKgmA = GXt_decimal9 ;
      GXt_decimal9 = A5259AlrPieMtrA ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4800AlRPieBarC ;
      GXv_int4[0] = A4801AlRPieBarR ;
      GXv_char5[0] = A4802AlRPieBarP ;
      GXv_char2[0] = A2159AlbRecPie ;
      GXv_decimal10[0] = GXt_decimal9 ;
      new app.pbarpiemet(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal10) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A4800AlRPieBarC = GXv_int3[0] ;
      A4800AlRPieBarC = this.A4800AlRPieBarC ;
      talrpme_impl.this.A4801AlRPieBarR = GXv_int4[0] ;
      A4801AlRPieBarR = this.A4801AlRPieBarR ;
      talrpme_impl.this.A4802AlRPieBarP = GXv_char5[0] ;
      A4802AlRPieBarP = this.A4802AlRPieBarP ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char2[0] ;
      talrpme_impl.this.GXt_decimal9 = GXv_decimal10[0] ;
      A5259AlrPieMtrA = GXt_decimal9 ;
      GXt_char7 = A4795AlRPieCal ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A44AlbRecCod ;
      GXv_char5[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char7 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_char5, GXv_char2) ;
      talrpme_impl.this.A396EmprCod = GXv_char8[0] ;
      talrpme_impl.this.A44AlbRecCod = GXv_int3[0] ;
      A44AlbRecCod = this.A44AlbRecCod ;
      talrpme_impl.this.A2159AlbRecPie = GXv_char5[0] ;
      talrpme_impl.this.GXt_char7 = GXv_char2[0] ;
      A4795AlRPieCal = GXt_char7 ;
      GXt_int11 = A44AlbRecCod ;
      GXv_int3[0] = GXt_int11 ;
      new app.palbreccod(remoteHandle, context).execute( A396EmprCod, A2159AlbRecPie, GXv_int3) ;
      talrpme_impl.this.GXt_int11 = GXv_int3[0] ;
      A44AlbRecCod = GXt_int11 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4798AlRPieClaM", GXutil.ltrim( localUtil.ntoc( A4798AlRPieClaM, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4799AlRPieUltC", GXutil.rtrim( A4799AlRPieUltC));
      httpContext.ajax_rsp_assign_attri("", false, "A4807AlRExp1", GXutil.rtrim( A4807AlRExp1));
      httpContext.ajax_rsp_assign_attri("", false, "A4808AlRExp2", GXutil.rtrim( A4808AlRExp2));
      httpContext.ajax_rsp_assign_attri("", false, "A3731AlbRecIdPz", GXutil.rtrim( A3731AlbRecIdPz));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4800AlRPieBarC", GXutil.ltrim( localUtil.ntoc( A4800AlRPieBarC, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4801AlRPieBarR", GXutil.ltrim( localUtil.ntoc( A4801AlRPieBarR, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4802AlRPieBarP", GXutil.rtrim( A4802AlRPieBarP));
      httpContext.ajax_rsp_assign_attri("", false, "A4831AlrPieCalP", GXutil.rtrim( A4831AlrPieCalP));
      httpContext.ajax_rsp_assign_attri("", false, "A4804AlRPieFasL", GXutil.ltrim( localUtil.ntoc( A4804AlRPieFasL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4803AlRPieFasC", GXutil.rtrim( A4803AlRPieFasC));
      httpContext.ajax_rsp_assign_attri("", false, "A4805AlRPieDefT", GXutil.ltrim( localUtil.ntoc( A4805AlRPieDefT, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4796AlRPieClaA", GXutil.ltrim( localUtil.ntoc( A4796AlRPieClaA, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4794AlRPieCla", GXutil.ltrim( localUtil.ntoc( A4794AlRPieCla, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", GXutil.rtrim( A4797AlRPieClaC));
      httpContext.ajax_rsp_assign_attri("", false, "A5260AlrPieKgmA", GXutil.ltrim( localUtil.ntoc( A5260AlrPieKgmA, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5259AlrPieMtrA", GXutil.ltrim( localUtil.ntoc( A5259AlrPieMtrA, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2159AlbRecPie", GXutil.rtrim( Z2159AlbRecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4798AlRPieClaM", GXutil.ltrim( localUtil.ntoc( Z4798AlRPieClaM, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4799AlRPieUltC", GXutil.rtrim( Z4799AlRPieUltC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4807AlRExp1", GXutil.rtrim( Z4807AlRExp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4808AlRExp2", GXutil.rtrim( Z4808AlRExp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3731AlbRecIdPz", GXutil.rtrim( Z3731AlbRecIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4800AlRPieBarC", GXutil.ltrim( localUtil.ntoc( Z4800AlRPieBarC, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4801AlRPieBarR", GXutil.ltrim( localUtil.ntoc( Z4801AlRPieBarR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4802AlRPieBarP", GXutil.rtrim( Z4802AlRPieBarP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4831AlrPieCalP", GXutil.rtrim( Z4831AlrPieCalP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4804AlRPieFasL", GXutil.ltrim( localUtil.ntoc( Z4804AlRPieFasL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4803AlRPieFasC", GXutil.rtrim( Z4803AlRPieFasC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4805AlRPieDefT", GXutil.ltrim( localUtil.ntoc( Z4805AlRPieDefT, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4806AlRPieDefC", GXutil.ltrim( localUtil.ntoc( Z4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4796AlRPieClaA", GXutil.ltrim( localUtil.ntoc( Z4796AlRPieClaA, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4794AlRPieCla", GXutil.ltrim( localUtil.ntoc( Z4794AlRPieCla, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4797AlRPieClaC", GXutil.rtrim( Z4797AlRPieClaC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5260AlrPieKgmA", GXutil.ltrim( localUtil.ntoc( Z5260AlrPieKgmA, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5259AlrPieMtrA", GXutil.ltrim( localUtil.ntoc( Z5259AlrPieMtrA, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4795AlRPieCal", GXutil.rtrim( Z4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4806AlRPieDefC", GXutil.ltrim( localUtil.ntoc( O4806AlRPieDefC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4805AlRPieDefT", GXutil.ltrim( localUtil.ntoc( O4805AlRPieDefT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Alrdefcod( )
   {
      n4396AlRDefDsc = false ;
      n4397AlRDefPnt = false ;
      /* Using cursor T00WD54 */
      pr_default.execute(46, new Object[] {A396EmprCod, Short.valueOf(A4395AlRDefCod)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "AlbDet TipDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALRDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRDefCod_Internalname ;
      }
      A4396AlRDefDsc = T00WD54_A4396AlRDefDsc[0] ;
      n4396AlRDefDsc = T00WD54_n4396AlRDefDsc[0] ;
      A4397AlRDefPnt = T00WD54_A4397AlRDefPnt[0] ;
      n4397AlRDefPnt = T00WD54_n4397AlRDefPnt[0] ;
      pr_default.close(46);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4396AlRDefDsc", GXutil.rtrim( A4396AlRDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4397AlRDefPnt", GXutil.ltrim( localUtil.ntoc( A4397AlRDefPnt, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A4800AlRPieBarC',fld:'ALRPIEBARC',pic:'ZZZZZZZ9'},{av:'A4801AlRPieBarR',fld:'ALRPIEBARR',pic:'9'},{av:'A4802AlRPieBarP',fld:'ALRPIEBARP',pic:''},{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A4798AlRPieClaM',fld:'ALRPIECLAM',pic:'99'},{av:'A4799AlRPieUltC',fld:'ALRPIEULTC',pic:''},{av:'A4807AlRExp1',fld:'ALREXP1',pic:''},{av:'A4808AlRExp2',fld:'ALREXP2',pic:''},{av:'A3731AlbRecIdPz',fld:'ALBRECIDPZ',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A4800AlRPieBarC',fld:'ALRPIEBARC',pic:'ZZZZZZZ9'},{av:'A4801AlRPieBarR',fld:'ALRPIEBARR',pic:'9'},{av:'A4802AlRPieBarP',fld:'ALRPIEBARP',pic:''},{av:'A4831AlrPieCalP',fld:'ALRPIECALP',pic:''},{av:'A4804AlRPieFasL',fld:'ALRPIEFASL',pic:'ZZZ9'},{av:'A4803AlRPieFasC',fld:'ALRPIEFASC',pic:''},{av:'A4805AlRPieDefT',fld:'ALRPIEDEFT',pic:'ZZZZZ9'},{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A4796AlRPieClaA',fld:'ALRPIECLAA',pic:'99'},{av:'A4794AlRPieCla',fld:'ALRPIECLA',pic:'99'},{av:'A4797AlRPieClaC',fld:'ALRPIECLAC',pic:''},{av:'A5260AlrPieKgmA',fld:'ALRPIEKGMA',pic:'ZZZZZ9.99'},{av:'A5259AlrPieMtrA',fld:'ALRPIEMTRA',pic:'ZZZZZ9.99'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2159AlbRecPie'},{av:'Z2157AlbRecMtr'},{av:'Z2155AlbRecKgm'},{av:'Z4798AlRPieClaM'},{av:'Z4799AlRPieUltC'},{av:'Z4807AlRExp1'},{av:'Z4808AlRExp2'},{av:'Z3731AlbRecIdPz'},{av:'Z407EmprNom'},{av:'Z1291AlbRDes'},{av:'Z970ProceCod'},{av:'Z971ProceNom'},{av:'Z4800AlRPieBarC'},{av:'Z4801AlRPieBarR'},{av:'Z4802AlRPieBarP'},{av:'Z4831AlrPieCalP'},{av:'Z4804AlRPieFasL'},{av:'Z4803AlRPieFasC'},{av:'Z4805AlRPieDefT'},{av:'Z4806AlRPieDefC'},{av:'Z4796AlRPieClaA'},{av:'Z4794AlRPieCla'},{av:'Z4797AlRPieClaC'},{av:'Z5260AlrPieKgmA'},{av:'Z5259AlrPieMtrA'},{av:'Z4795AlRPieCal'},{av:'Z44AlbRecCod'},{av:'O4806AlRPieDefC'},{av:'O4805AlRPieDefT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[]}");
      setEventMetadata("VALID_ALRPIECLAA","{handler:'valid_Alrpieclaa',iparms:[]");
      setEventMetadata("VALID_ALRPIECLAA",",oparms:[]}");
      setEventMetadata("VALID_ALRPIECLAM","{handler:'valid_Alrpieclam',iparms:[]");
      setEventMetadata("VALID_ALRPIECLAM",",oparms:[]}");
      setEventMetadata("VALID_ALRPIEULTC","{handler:'valid_Alrpieultc',iparms:[]");
      setEventMetadata("VALID_ALRPIEULTC",",oparms:[]}");
      setEventMetadata("VALID_ALRPIEBARC","{handler:'valid_Alrpiebarc',iparms:[]");
      setEventMetadata("VALID_ALRPIEBARC",",oparms:[]}");
      setEventMetadata("VALID_ALRPIEBARR","{handler:'valid_Alrpiebarr',iparms:[]");
      setEventMetadata("VALID_ALRPIEBARR",",oparms:[]}");
      setEventMetadata("VALID_ALRPIEBARP","{handler:'valid_Alrpiebarp',iparms:[]");
      setEventMetadata("VALID_ALRPIEBARP",",oparms:[]}");
      setEventMetadata("VALID_ALRPIEDEFT","{handler:'valid_Alrpiedeft',iparms:[]");
      setEventMetadata("VALID_ALRPIEDEFT",",oparms:[]}");
      setEventMetadata("VALID_ALRPIEDEFC","{handler:'valid_Alrpiedefc',iparms:[]");
      setEventMetadata("VALID_ALRPIEDEFC",",oparms:[]}");
      setEventMetadata("VALID_ALREXP1","{handler:'valid_Alrexp1',iparms:[]");
      setEventMetadata("VALID_ALREXP1",",oparms:[]}");
      setEventMetadata("VALID_ALREXP2","{handler:'valid_Alrexp2',iparms:[]");
      setEventMetadata("VALID_ALREXP2",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("VALID_ALRDEFCOD","{handler:'valid_Alrdefcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4395AlRDefCod',fld:'ALRDEFCOD',pic:'ZZZ9'},{av:'A4396AlRDefDsc',fld:'ALRDEFDSC',pic:''},{av:'A4397AlRDefPnt',fld:'ALRDEFPNT',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALRDEFCOD",",oparms:[{av:'A4396AlRDefDsc',fld:'ALRDEFDSC',pic:''},{av:'A4397AlRDefPnt',fld:'ALRDEFPNT',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALRFASCOD","{handler:'valid_Alrfascod',iparms:[]");
      setEventMetadata("VALID_ALRFASCOD",",oparms:[]}");
      setEventMetadata("VALID_ALRDEFPNT","{handler:'valid_Alrdefpnt',iparms:[]");
      setEventMetadata("VALID_ALRDEFPNT",",oparms:[]}");
      setEventMetadata("VALID_ALRDEFCNT","{handler:'valid_Alrdefcnt',iparms:[]");
      setEventMetadata("VALID_ALRDEFCNT",",oparms:[]}");
      setEventMetadata("VALID_ALRDEFACA","{handler:'valid_Alrdefaca',iparms:[]");
      setEventMetadata("VALID_ALRDEFACA",",oparms:[]}");
      setEventMetadata("VALID_ALRDEFCRU","{handler:'valid_Alrdefcru',iparms:[]");
      setEventMetadata("VALID_ALRDEFCRU",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Alrdefpri',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_ALRDEFMTR","{handler:'valid_Alrdefmtr',iparms:[]");
      setEventMetadata("VALID_ALRDEFMTR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Alrdefmtf',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_ALBRECEVT","{handler:'valid_Albrecevt',iparms:[]");
      setEventMetadata("VALID_ALBRECEVT",",oparms:[]}");
      setEventMetadata("VALID_ARETIP","{handler:'valid_Aretip',iparms:[]");
      setEventMetadata("VALID_ARETIP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Areusu',iparms:[]");
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
      pr_default.close(46);
      pr_default.close(29);
      pr_default.close(28);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(32);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2159AlbRecPie = "" ;
      Z4795AlRPieCal = "" ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z4799AlRPieUltC = "" ;
      Z4807AlRExp1 = "" ;
      Z4808AlRExp2 = "" ;
      Z3731AlbRecIdPz = "" ;
      Z4412AlRFasCod = "" ;
      Z4403AlRDefCnt = DecimalUtil.ZERO ;
      Z6683AlrDefMtr = DecimalUtil.ZERO ;
      Z6684AlRDefCDe = DecimalUtil.ZERO ;
      Z12910AlRDefMtf = DecimalUtil.ZERO ;
      Z5265AREBarCodP = "" ;
      Z5266AREFch = GXutil.resetTime( GXutil.nullDate() );
      Z5268AREProCod = "" ;
      Z5269AREFasCod = "" ;
      Z5272ARETip = "" ;
      Z5273AREKgm = DecimalUtil.ZERO ;
      Z5274AREMtr = DecimalUtil.ZERO ;
      Z5275AREArt = "" ;
      Z5276AREUsu = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2159AlbRecPie = "" ;
      A4802AlRPieBarP = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A4795AlRPieCal = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4797AlRPieClaC = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4799AlRPieUltC = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4803AlRPieFasC = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A4831AlrPieCalP = "" ;
      lblTextblock19_Jsonclick = "" ;
      A5259AlrPieMtrA = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A5260AlrPieKgmA = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A4807AlRExp1 = "" ;
      lblTextblock24_Jsonclick = "" ;
      A4808AlRExp2 = "" ;
      lblTextblock25_Jsonclick = "" ;
      A1291AlbRDes = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A971ProceNom = "" ;
      lblTextblock28_Jsonclick = "" ;
      A3731AlbRecIdPz = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode665 = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode770 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode299 = "" ;
      GXCCtl = "" ;
      A5265AREBarCodP = "" ;
      A5266AREFch = GXutil.resetTime( GXutil.nullDate() );
      A5267AREDsc = "" ;
      A5268AREProCod = "" ;
      A5269AREFasCod = "" ;
      A5272ARETip = "" ;
      A5273AREKgm = DecimalUtil.ZERO ;
      A5274AREMtr = DecimalUtil.ZERO ;
      A5275AREArt = "" ;
      A5276AREUsu = "" ;
      A6683AlrDefMtr = DecimalUtil.ZERO ;
      A6684AlRDefCDe = DecimalUtil.ZERO ;
      A12910AlRDefMtf = DecimalUtil.ZERO ;
      s4797AlRPieClaC = "" ;
      O4797AlRPieClaC = "" ;
      A4396AlRDefDsc = "" ;
      A4412AlRFasCod = "" ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z1291AlbRDes = "" ;
      Z971ProceNom = "" ;
      T00WD19_A4795AlRPieCal = new String[] {""} ;
      T00WD19_A2159AlbRecPie = new String[] {""} ;
      T00WD19_A407EmprNom = new String[] {""} ;
      T00WD19_n407EmprNom = new boolean[] {false} ;
      T00WD19_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD19_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD19_A4798AlRPieClaM = new byte[1] ;
      T00WD19_n4798AlRPieClaM = new boolean[] {false} ;
      T00WD19_A4799AlRPieUltC = new String[] {""} ;
      T00WD19_n4799AlRPieUltC = new boolean[] {false} ;
      T00WD19_A4807AlRExp1 = new String[] {""} ;
      T00WD19_n4807AlRExp1 = new boolean[] {false} ;
      T00WD19_A4808AlRExp2 = new String[] {""} ;
      T00WD19_n4808AlRExp2 = new boolean[] {false} ;
      T00WD19_A1291AlbRDes = new String[] {""} ;
      T00WD19_A971ProceNom = new String[] {""} ;
      T00WD19_n971ProceNom = new boolean[] {false} ;
      T00WD19_A3731AlbRecIdPz = new String[] {""} ;
      T00WD19_A396EmprCod = new String[] {""} ;
      T00WD19_A44AlbRecCod = new int[1] ;
      T00WD19_A970ProceCod = new short[1] ;
      T00WD19_n970ProceCod = new boolean[] {false} ;
      T00WD15_A4800AlRPieBarC = new int[1] ;
      T00WD15_A4801AlRPieBarR = new byte[1] ;
      T00WD15_A4802AlRPieBarP = new String[] {""} ;
      T00WD16_A4831AlrPieCalP = new String[] {""} ;
      T00WD16_n4831AlrPieCalP = new boolean[] {false} ;
      T00WD18_A4805AlRPieDefT = new int[1] ;
      T00WD18_A4806AlRPieDefC = new int[1] ;
      T00WD11_A407EmprNom = new String[] {""} ;
      T00WD11_n407EmprNom = new boolean[] {false} ;
      T00WD12_A1291AlbRDes = new String[] {""} ;
      T00WD12_A970ProceCod = new short[1] ;
      T00WD12_n970ProceCod = new boolean[] {false} ;
      T00WD13_A971ProceNom = new String[] {""} ;
      T00WD13_n971ProceNom = new boolean[] {false} ;
      T00WD20_A407EmprNom = new String[] {""} ;
      T00WD20_n407EmprNom = new boolean[] {false} ;
      T00WD21_A1291AlbRDes = new String[] {""} ;
      T00WD21_A970ProceCod = new short[1] ;
      T00WD21_n970ProceCod = new boolean[] {false} ;
      T00WD22_A971ProceNom = new String[] {""} ;
      T00WD22_n971ProceNom = new boolean[] {false} ;
      T00WD24_A4800AlRPieBarC = new int[1] ;
      T00WD24_A4801AlRPieBarR = new byte[1] ;
      T00WD24_A4802AlRPieBarP = new String[] {""} ;
      T00WD25_A4831AlrPieCalP = new String[] {""} ;
      T00WD25_n4831AlrPieCalP = new boolean[] {false} ;
      T00WD27_A4805AlRPieDefT = new int[1] ;
      T00WD27_A4806AlRPieDefC = new int[1] ;
      T00WD28_A396EmprCod = new String[] {""} ;
      T00WD28_A44AlbRecCod = new int[1] ;
      T00WD28_A2159AlbRecPie = new String[] {""} ;
      T00WD10_A4795AlRPieCal = new String[] {""} ;
      T00WD10_A2159AlbRecPie = new String[] {""} ;
      T00WD10_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD10_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD10_A4798AlRPieClaM = new byte[1] ;
      T00WD10_n4798AlRPieClaM = new boolean[] {false} ;
      T00WD10_A4799AlRPieUltC = new String[] {""} ;
      T00WD10_n4799AlRPieUltC = new boolean[] {false} ;
      T00WD10_A4807AlRExp1 = new String[] {""} ;
      T00WD10_n4807AlRExp1 = new boolean[] {false} ;
      T00WD10_A4808AlRExp2 = new String[] {""} ;
      T00WD10_n4808AlRExp2 = new boolean[] {false} ;
      T00WD10_A3731AlbRecIdPz = new String[] {""} ;
      T00WD10_A396EmprCod = new String[] {""} ;
      T00WD10_A44AlbRecCod = new int[1] ;
      T00WD29_A396EmprCod = new String[] {""} ;
      T00WD29_A44AlbRecCod = new int[1] ;
      T00WD29_A2159AlbRecPie = new String[] {""} ;
      T00WD30_A396EmprCod = new String[] {""} ;
      T00WD30_A44AlbRecCod = new int[1] ;
      T00WD30_A2159AlbRecPie = new String[] {""} ;
      T00WD9_A4795AlRPieCal = new String[] {""} ;
      T00WD9_A2159AlbRecPie = new String[] {""} ;
      T00WD9_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD9_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD9_A4798AlRPieClaM = new byte[1] ;
      T00WD9_n4798AlRPieClaM = new boolean[] {false} ;
      T00WD9_A4799AlRPieUltC = new String[] {""} ;
      T00WD9_n4799AlRPieUltC = new boolean[] {false} ;
      T00WD9_A4807AlRExp1 = new String[] {""} ;
      T00WD9_n4807AlRExp1 = new boolean[] {false} ;
      T00WD9_A4808AlRExp2 = new String[] {""} ;
      T00WD9_n4808AlRExp2 = new boolean[] {false} ;
      T00WD9_A3731AlbRecIdPz = new String[] {""} ;
      T00WD9_A396EmprCod = new String[] {""} ;
      T00WD9_A44AlbRecCod = new int[1] ;
      T00WD34_A407EmprNom = new String[] {""} ;
      T00WD34_n407EmprNom = new boolean[] {false} ;
      T00WD35_A1291AlbRDes = new String[] {""} ;
      T00WD35_A970ProceCod = new short[1] ;
      T00WD35_n970ProceCod = new boolean[] {false} ;
      T00WD36_A971ProceNom = new String[] {""} ;
      T00WD36_n971ProceNom = new boolean[] {false} ;
      T00WD38_A4800AlRPieBarC = new int[1] ;
      T00WD38_A4801AlRPieBarR = new byte[1] ;
      T00WD38_A4802AlRPieBarP = new String[] {""} ;
      T00WD39_A4831AlrPieCalP = new String[] {""} ;
      T00WD39_n4831AlrPieCalP = new boolean[] {false} ;
      T00WD41_A4805AlRPieDefT = new int[1] ;
      T00WD41_A4806AlRPieDefC = new int[1] ;
      T00WD42_A396EmprCod = new String[] {""} ;
      T00WD42_A44AlbRecCod = new int[1] ;
      T00WD42_A2159AlbRecPie = new String[] {""} ;
      T00WD42_A10188AlRFibOrd = new int[1] ;
      T00WD43_A396EmprCod = new String[] {""} ;
      T00WD43_A44AlbRecCod = new int[1] ;
      T00WD43_A2159AlbRecPie = new String[] {""} ;
      T00WD43_A9568CodHilz = new String[] {""} ;
      T00WD44_A396EmprCod = new String[] {""} ;
      T00WD44_A44AlbRecCod = new int[1] ;
      T00WD44_A2159AlbRecPie = new String[] {""} ;
      T00WD44_A7697AlREtiTpo = new byte[1] ;
      T00WD45_A396EmprCod = new String[] {""} ;
      T00WD45_A44AlbRecCod = new int[1] ;
      T00WD45_A2159AlbRecPie = new String[] {""} ;
      T00WD45_A4395AlRDefCod = new short[1] ;
      T00WD45_A4412AlRFasCod = new String[] {""} ;
      T00WD47_A396EmprCod = new String[] {""} ;
      T00WD47_A44AlbRecCod = new int[1] ;
      T00WD47_A2159AlbRecPie = new String[] {""} ;
      Z4396AlRDefDsc = "" ;
      T00WD48_A4404AlRDef = new int[1] ;
      T00WD48_A4971AlRDefAca = new int[1] ;
      T00WD48_A4972AlRDefCru = new int[1] ;
      T00WD48_A44AlbRecCod = new int[1] ;
      T00WD48_A2159AlbRecPie = new String[] {""} ;
      T00WD48_A4412AlRFasCod = new String[] {""} ;
      T00WD48_A4396AlRDefDsc = new String[] {""} ;
      T00WD48_n4396AlRDefDsc = new boolean[] {false} ;
      T00WD48_A4397AlRDefPnt = new short[1] ;
      T00WD48_n4397AlRDefPnt = new boolean[] {false} ;
      T00WD48_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD48_n4403AlRDefCnt = new boolean[] {false} ;
      T00WD48_A5261AlrDefPri = new byte[1] ;
      T00WD48_n5261AlrDefPri = new boolean[] {false} ;
      T00WD48_A396EmprCod = new String[] {""} ;
      T00WD48_A4395AlRDefCod = new short[1] ;
      T00WD8_A4396AlRDefDsc = new String[] {""} ;
      T00WD8_n4396AlRDefDsc = new boolean[] {false} ;
      T00WD8_A4397AlRDefPnt = new short[1] ;
      T00WD8_n4397AlRDefPnt = new boolean[] {false} ;
      T00WD49_A4396AlRDefDsc = new String[] {""} ;
      T00WD49_n4396AlRDefDsc = new boolean[] {false} ;
      T00WD49_A4397AlRDefPnt = new short[1] ;
      T00WD49_n4397AlRDefPnt = new boolean[] {false} ;
      T00WD50_A396EmprCod = new String[] {""} ;
      T00WD50_A44AlbRecCod = new int[1] ;
      T00WD50_A2159AlbRecPie = new String[] {""} ;
      T00WD50_A4395AlRDefCod = new short[1] ;
      T00WD50_A4412AlRFasCod = new String[] {""} ;
      T00WD7_A4404AlRDef = new int[1] ;
      T00WD7_A4971AlRDefAca = new int[1] ;
      T00WD7_A4972AlRDefCru = new int[1] ;
      T00WD7_A44AlbRecCod = new int[1] ;
      T00WD7_A2159AlbRecPie = new String[] {""} ;
      T00WD7_A4412AlRFasCod = new String[] {""} ;
      T00WD7_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD7_n4403AlRDefCnt = new boolean[] {false} ;
      T00WD7_A5261AlrDefPri = new byte[1] ;
      T00WD7_n5261AlrDefPri = new boolean[] {false} ;
      T00WD7_A396EmprCod = new String[] {""} ;
      T00WD7_A4395AlRDefCod = new short[1] ;
      T00WD6_A4404AlRDef = new int[1] ;
      T00WD6_A4971AlRDefAca = new int[1] ;
      T00WD6_A4972AlRDefCru = new int[1] ;
      T00WD6_A44AlbRecCod = new int[1] ;
      T00WD6_A2159AlbRecPie = new String[] {""} ;
      T00WD6_A4412AlRFasCod = new String[] {""} ;
      T00WD6_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD6_n4403AlRDefCnt = new boolean[] {false} ;
      T00WD6_A5261AlrDefPri = new byte[1] ;
      T00WD6_n5261AlrDefPri = new boolean[] {false} ;
      T00WD6_A396EmprCod = new String[] {""} ;
      T00WD6_A4395AlRDefCod = new short[1] ;
      T00WD54_A4396AlRDefDsc = new String[] {""} ;
      T00WD54_n4396AlRDefDsc = new boolean[] {false} ;
      T00WD54_A4397AlRDefPnt = new short[1] ;
      T00WD54_n4397AlRDefPnt = new boolean[] {false} ;
      T00WD55_A396EmprCod = new String[] {""} ;
      T00WD55_A44AlbRecCod = new int[1] ;
      T00WD55_A2159AlbRecPie = new String[] {""} ;
      T00WD55_A4395AlRDefCod = new short[1] ;
      T00WD55_A4412AlRFasCod = new String[] {""} ;
      T00WD56_A44AlbRecCod = new int[1] ;
      T00WD56_A2159AlbRecPie = new String[] {""} ;
      T00WD56_A4395AlRDefCod = new short[1] ;
      T00WD56_A4412AlRFasCod = new String[] {""} ;
      T00WD56_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD56_A6684AlRDefCDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD56_n6684AlRDefCDe = new boolean[] {false} ;
      T00WD56_A12910AlRDefMtf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD56_n12910AlRDefMtf = new boolean[] {false} ;
      T00WD56_A396EmprCod = new String[] {""} ;
      T00WD57_A396EmprCod = new String[] {""} ;
      T00WD57_A44AlbRecCod = new int[1] ;
      T00WD57_A2159AlbRecPie = new String[] {""} ;
      T00WD57_A4395AlRDefCod = new short[1] ;
      T00WD57_A4412AlRFasCod = new String[] {""} ;
      T00WD57_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD5_A44AlbRecCod = new int[1] ;
      T00WD5_A2159AlbRecPie = new String[] {""} ;
      T00WD5_A4395AlRDefCod = new short[1] ;
      T00WD5_A4412AlRFasCod = new String[] {""} ;
      T00WD5_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD5_A6684AlRDefCDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD5_n6684AlRDefCDe = new boolean[] {false} ;
      T00WD5_A12910AlRDefMtf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD5_n12910AlRDefMtf = new boolean[] {false} ;
      T00WD5_A396EmprCod = new String[] {""} ;
      sMode955 = "" ;
      T00WD4_A44AlbRecCod = new int[1] ;
      T00WD4_A2159AlbRecPie = new String[] {""} ;
      T00WD4_A4395AlRDefCod = new short[1] ;
      T00WD4_A4412AlRFasCod = new String[] {""} ;
      T00WD4_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD4_A6684AlRDefCDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD4_n6684AlRDefCDe = new boolean[] {false} ;
      T00WD4_A12910AlRDefMtf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD4_n12910AlRDefMtf = new boolean[] {false} ;
      T00WD4_A396EmprCod = new String[] {""} ;
      T00WD61_A396EmprCod = new String[] {""} ;
      T00WD61_A44AlbRecCod = new int[1] ;
      T00WD61_A2159AlbRecPie = new String[] {""} ;
      T00WD61_A4395AlRDefCod = new short[1] ;
      T00WD61_A4412AlRFasCod = new String[] {""} ;
      T00WD61_A6683AlrDefMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Z5267AREDsc = "" ;
      T00WD62_A5267AREDsc = new String[] {""} ;
      T00WD62_n5267AREDsc = new boolean[] {false} ;
      T00WD62_A44AlbRecCod = new int[1] ;
      T00WD62_A2159AlbRecPie = new String[] {""} ;
      T00WD62_A5262AlbRecEvt = new short[1] ;
      T00WD62_A5263AREBarCod = new int[1] ;
      T00WD62_n5263AREBarCod = new boolean[] {false} ;
      T00WD62_A5264AREBarCodR = new byte[1] ;
      T00WD62_n5264AREBarCodR = new boolean[] {false} ;
      T00WD62_A5265AREBarCodP = new String[] {""} ;
      T00WD62_n5265AREBarCodP = new boolean[] {false} ;
      T00WD62_A5266AREFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00WD62_n5266AREFch = new boolean[] {false} ;
      T00WD62_A5268AREProCod = new String[] {""} ;
      T00WD62_n5268AREProCod = new boolean[] {false} ;
      T00WD62_A5269AREFasCod = new String[] {""} ;
      T00WD62_n5269AREFasCod = new boolean[] {false} ;
      T00WD62_A5270AREAlbProC = new long[1] ;
      T00WD62_n5270AREAlbProC = new boolean[] {false} ;
      T00WD62_A5271AREAlmCod = new byte[1] ;
      T00WD62_n5271AREAlmCod = new boolean[] {false} ;
      T00WD62_A5272ARETip = new String[] {""} ;
      T00WD62_n5272ARETip = new boolean[] {false} ;
      T00WD62_A5273AREKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD62_n5273AREKgm = new boolean[] {false} ;
      T00WD62_A5274AREMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD62_n5274AREMtr = new boolean[] {false} ;
      T00WD62_A5275AREArt = new String[] {""} ;
      T00WD62_n5275AREArt = new boolean[] {false} ;
      T00WD62_A5276AREUsu = new String[] {""} ;
      T00WD62_n5276AREUsu = new boolean[] {false} ;
      T00WD62_A396EmprCod = new String[] {""} ;
      T00WD63_A396EmprCod = new String[] {""} ;
      T00WD63_A44AlbRecCod = new int[1] ;
      T00WD63_A2159AlbRecPie = new String[] {""} ;
      T00WD63_A5262AlbRecEvt = new short[1] ;
      T00WD3_A5267AREDsc = new String[] {""} ;
      T00WD3_n5267AREDsc = new boolean[] {false} ;
      T00WD3_A44AlbRecCod = new int[1] ;
      T00WD3_A2159AlbRecPie = new String[] {""} ;
      T00WD3_A5262AlbRecEvt = new short[1] ;
      T00WD3_A5263AREBarCod = new int[1] ;
      T00WD3_n5263AREBarCod = new boolean[] {false} ;
      T00WD3_A5264AREBarCodR = new byte[1] ;
      T00WD3_n5264AREBarCodR = new boolean[] {false} ;
      T00WD3_A5265AREBarCodP = new String[] {""} ;
      T00WD3_n5265AREBarCodP = new boolean[] {false} ;
      T00WD3_A5266AREFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00WD3_n5266AREFch = new boolean[] {false} ;
      T00WD3_A5268AREProCod = new String[] {""} ;
      T00WD3_n5268AREProCod = new boolean[] {false} ;
      T00WD3_A5269AREFasCod = new String[] {""} ;
      T00WD3_n5269AREFasCod = new boolean[] {false} ;
      T00WD3_A5270AREAlbProC = new long[1] ;
      T00WD3_n5270AREAlbProC = new boolean[] {false} ;
      T00WD3_A5271AREAlmCod = new byte[1] ;
      T00WD3_n5271AREAlmCod = new boolean[] {false} ;
      T00WD3_A5272ARETip = new String[] {""} ;
      T00WD3_n5272ARETip = new boolean[] {false} ;
      T00WD3_A5273AREKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD3_n5273AREKgm = new boolean[] {false} ;
      T00WD3_A5274AREMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD3_n5274AREMtr = new boolean[] {false} ;
      T00WD3_A5275AREArt = new String[] {""} ;
      T00WD3_n5275AREArt = new boolean[] {false} ;
      T00WD3_A5276AREUsu = new String[] {""} ;
      T00WD3_n5276AREUsu = new boolean[] {false} ;
      T00WD3_A396EmprCod = new String[] {""} ;
      T00WD2_A5267AREDsc = new String[] {""} ;
      T00WD2_n5267AREDsc = new boolean[] {false} ;
      T00WD2_A44AlbRecCod = new int[1] ;
      T00WD2_A2159AlbRecPie = new String[] {""} ;
      T00WD2_A5262AlbRecEvt = new short[1] ;
      T00WD2_A5263AREBarCod = new int[1] ;
      T00WD2_n5263AREBarCod = new boolean[] {false} ;
      T00WD2_A5264AREBarCodR = new byte[1] ;
      T00WD2_n5264AREBarCodR = new boolean[] {false} ;
      T00WD2_A5265AREBarCodP = new String[] {""} ;
      T00WD2_n5265AREBarCodP = new boolean[] {false} ;
      T00WD2_A5266AREFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00WD2_n5266AREFch = new boolean[] {false} ;
      T00WD2_A5268AREProCod = new String[] {""} ;
      T00WD2_n5268AREProCod = new boolean[] {false} ;
      T00WD2_A5269AREFasCod = new String[] {""} ;
      T00WD2_n5269AREFasCod = new boolean[] {false} ;
      T00WD2_A5270AREAlbProC = new long[1] ;
      T00WD2_n5270AREAlbProC = new boolean[] {false} ;
      T00WD2_A5271AREAlmCod = new byte[1] ;
      T00WD2_n5271AREAlmCod = new boolean[] {false} ;
      T00WD2_A5272ARETip = new String[] {""} ;
      T00WD2_n5272ARETip = new boolean[] {false} ;
      T00WD2_A5273AREKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD2_n5273AREKgm = new boolean[] {false} ;
      T00WD2_A5274AREMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WD2_n5274AREMtr = new boolean[] {false} ;
      T00WD2_A5275AREArt = new String[] {""} ;
      T00WD2_n5275AREArt = new boolean[] {false} ;
      T00WD2_A5276AREUsu = new String[] {""} ;
      T00WD2_n5276AREUsu = new boolean[] {false} ;
      T00WD2_A396EmprCod = new String[] {""} ;
      T00WD67_A396EmprCod = new String[] {""} ;
      T00WD67_A44AlbRecCod = new int[1] ;
      T00WD67_A2159AlbRecPie = new String[] {""} ;
      T00WD67_A5262AlbRecEvt = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock29_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      B4797AlRPieClaC = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Z4802AlRPieBarP = "" ;
      Z4831AlrPieCalP = "" ;
      Z4803AlRPieFasC = "" ;
      Z4797AlRPieClaC = "" ;
      Z5260AlrPieKgmA = DecimalUtil.ZERO ;
      Z5259AlrPieMtrA = DecimalUtil.ZERO ;
      GXv_int6 = new short[1] ;
      GXt_decimal9 = DecimalUtil.ZERO ;
      GXv_int4 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXt_char7 = "" ;
      GXv_char8 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      ZZ396EmprCod = "" ;
      ZZ2159AlbRecPie = "" ;
      ZZ2157AlbRecMtr = DecimalUtil.ZERO ;
      ZZ2155AlbRecKgm = DecimalUtil.ZERO ;
      ZZ4799AlRPieUltC = "" ;
      ZZ4807AlRExp1 = "" ;
      ZZ4808AlRExp2 = "" ;
      ZZ3731AlbRecIdPz = "" ;
      ZZ407EmprNom = "" ;
      ZZ1291AlbRDes = "" ;
      ZZ971ProceNom = "" ;
      ZZ4802AlRPieBarP = "" ;
      ZZ4831AlrPieCalP = "" ;
      ZZ4803AlRPieFasC = "" ;
      ZZ4797AlRPieClaC = "" ;
      ZZ5260AlrPieKgmA = DecimalUtil.ZERO ;
      ZZ5259AlrPieMtrA = DecimalUtil.ZERO ;
      ZZ4795AlRPieCal = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talrpme__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talrpme__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talrpme__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talrpme__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talrpme__default(),
         new Object[] {
             new Object[] {
            T00WD2_A5267AREDsc, T00WD2_n5267AREDsc, T00WD2_A44AlbRecCod, T00WD2_A2159AlbRecPie, T00WD2_A5262AlbRecEvt, T00WD2_A5263AREBarCod, T00WD2_n5263AREBarCod, T00WD2_A5264AREBarCodR, T00WD2_n5264AREBarCodR, T00WD2_A5265AREBarCodP,
            T00WD2_n5265AREBarCodP, T00WD2_A5266AREFch, T00WD2_n5266AREFch, T00WD2_A5268AREProCod, T00WD2_n5268AREProCod, T00WD2_A5269AREFasCod, T00WD2_n5269AREFasCod, T00WD2_A5270AREAlbProC, T00WD2_n5270AREAlbProC, T00WD2_A5271AREAlmCod,
            T00WD2_n5271AREAlmCod, T00WD2_A5272ARETip, T00WD2_n5272ARETip, T00WD2_A5273AREKgm, T00WD2_n5273AREKgm, T00WD2_A5274AREMtr, T00WD2_n5274AREMtr, T00WD2_A5275AREArt, T00WD2_n5275AREArt, T00WD2_A5276AREUsu,
            T00WD2_n5276AREUsu, T00WD2_A396EmprCod
            }
            , new Object[] {
            T00WD3_A5267AREDsc, T00WD3_n5267AREDsc, T00WD3_A44AlbRecCod, T00WD3_A2159AlbRecPie, T00WD3_A5262AlbRecEvt, T00WD3_A5263AREBarCod, T00WD3_n5263AREBarCod, T00WD3_A5264AREBarCodR, T00WD3_n5264AREBarCodR, T00WD3_A5265AREBarCodP,
            T00WD3_n5265AREBarCodP, T00WD3_A5266AREFch, T00WD3_n5266AREFch, T00WD3_A5268AREProCod, T00WD3_n5268AREProCod, T00WD3_A5269AREFasCod, T00WD3_n5269AREFasCod, T00WD3_A5270AREAlbProC, T00WD3_n5270AREAlbProC, T00WD3_A5271AREAlmCod,
            T00WD3_n5271AREAlmCod, T00WD3_A5272ARETip, T00WD3_n5272ARETip, T00WD3_A5273AREKgm, T00WD3_n5273AREKgm, T00WD3_A5274AREMtr, T00WD3_n5274AREMtr, T00WD3_A5275AREArt, T00WD3_n5275AREArt, T00WD3_A5276AREUsu,
            T00WD3_n5276AREUsu, T00WD3_A396EmprCod
            }
            , new Object[] {
            T00WD4_A44AlbRecCod, T00WD4_A2159AlbRecPie, T00WD4_A4395AlRDefCod, T00WD4_A4412AlRFasCod, T00WD4_A6683AlrDefMtr, T00WD4_A6684AlRDefCDe, T00WD4_n6684AlRDefCDe, T00WD4_A12910AlRDefMtf, T00WD4_n12910AlRDefMtf, T00WD4_A396EmprCod
            }
            , new Object[] {
            T00WD5_A44AlbRecCod, T00WD5_A2159AlbRecPie, T00WD5_A4395AlRDefCod, T00WD5_A4412AlRFasCod, T00WD5_A6683AlrDefMtr, T00WD5_A6684AlRDefCDe, T00WD5_n6684AlRDefCDe, T00WD5_A12910AlRDefMtf, T00WD5_n12910AlRDefMtf, T00WD5_A396EmprCod
            }
            , new Object[] {
            T00WD6_A4404AlRDef, T00WD6_A4971AlRDefAca, T00WD6_A4972AlRDefCru, T00WD6_A44AlbRecCod, T00WD6_A2159AlbRecPie, T00WD6_A4412AlRFasCod, T00WD6_A4403AlRDefCnt, T00WD6_n4403AlRDefCnt, T00WD6_A5261AlrDefPri, T00WD6_n5261AlrDefPri,
            T00WD6_A396EmprCod, T00WD6_A4395AlRDefCod
            }
            , new Object[] {
            T00WD7_A4404AlRDef, T00WD7_A4971AlRDefAca, T00WD7_A4972AlRDefCru, T00WD7_A44AlbRecCod, T00WD7_A2159AlbRecPie, T00WD7_A4412AlRFasCod, T00WD7_A4403AlRDefCnt, T00WD7_n4403AlRDefCnt, T00WD7_A5261AlrDefPri, T00WD7_n5261AlrDefPri,
            T00WD7_A396EmprCod, T00WD7_A4395AlRDefCod
            }
            , new Object[] {
            T00WD8_A4396AlRDefDsc, T00WD8_n4396AlRDefDsc, T00WD8_A4397AlRDefPnt, T00WD8_n4397AlRDefPnt
            }
            , new Object[] {
            T00WD9_A4795AlRPieCal, T00WD9_A2159AlbRecPie, T00WD9_A2157AlbRecMtr, T00WD9_A2155AlbRecKgm, T00WD9_A4798AlRPieClaM, T00WD9_n4798AlRPieClaM, T00WD9_A4799AlRPieUltC, T00WD9_n4799AlRPieUltC, T00WD9_A4807AlRExp1, T00WD9_n4807AlRExp1,
            T00WD9_A4808AlRExp2, T00WD9_n4808AlRExp2, T00WD9_A3731AlbRecIdPz, T00WD9_A396EmprCod, T00WD9_A44AlbRecCod
            }
            , new Object[] {
            T00WD10_A4795AlRPieCal, T00WD10_A2159AlbRecPie, T00WD10_A2157AlbRecMtr, T00WD10_A2155AlbRecKgm, T00WD10_A4798AlRPieClaM, T00WD10_n4798AlRPieClaM, T00WD10_A4799AlRPieUltC, T00WD10_n4799AlRPieUltC, T00WD10_A4807AlRExp1, T00WD10_n4807AlRExp1,
            T00WD10_A4808AlRExp2, T00WD10_n4808AlRExp2, T00WD10_A3731AlbRecIdPz, T00WD10_A396EmprCod, T00WD10_A44AlbRecCod
            }
            , new Object[] {
            T00WD11_A407EmprNom, T00WD11_n407EmprNom
            }
            , new Object[] {
            T00WD12_A1291AlbRDes, T00WD12_A970ProceCod, T00WD12_n970ProceCod
            }
            , new Object[] {
            T00WD13_A971ProceNom, T00WD13_n971ProceNom
            }
            , new Object[] {
            T00WD15_A4800AlRPieBarC, T00WD15_A4801AlRPieBarR, T00WD15_A4802AlRPieBarP, T00WD15_A4800AlRPieBarC, T00WD15_A4801AlRPieBarR, T00WD15_A4802AlRPieBarP
            }
            , new Object[] {
            T00WD16_A4831AlrPieCalP, T00WD16_n4831AlrPieCalP
            }
            , new Object[] {
            T00WD18_A4805AlRPieDefT, T00WD18_A4806AlRPieDefC
            }
            , new Object[] {
            T00WD19_A4795AlRPieCal, T00WD19_A2159AlbRecPie, T00WD19_A407EmprNom, T00WD19_n407EmprNom, T00WD19_A2157AlbRecMtr, T00WD19_A2155AlbRecKgm, T00WD19_A4798AlRPieClaM, T00WD19_n4798AlRPieClaM, T00WD19_A4799AlRPieUltC, T00WD19_n4799AlRPieUltC,
            T00WD19_A4807AlRExp1, T00WD19_n4807AlRExp1, T00WD19_A4808AlRExp2, T00WD19_n4808AlRExp2, T00WD19_A1291AlbRDes, T00WD19_A971ProceNom, T00WD19_n971ProceNom, T00WD19_A3731AlbRecIdPz, T00WD19_A396EmprCod, T00WD19_A44AlbRecCod,
            T00WD19_A970ProceCod, T00WD19_n970ProceCod
            }
            , new Object[] {
            T00WD20_A407EmprNom, T00WD20_n407EmprNom
            }
            , new Object[] {
            T00WD21_A1291AlbRDes, T00WD21_A970ProceCod, T00WD21_n970ProceCod
            }
            , new Object[] {
            T00WD22_A971ProceNom, T00WD22_n971ProceNom
            }
            , new Object[] {
            T00WD24_A4800AlRPieBarC, T00WD24_A4801AlRPieBarR, T00WD24_A4802AlRPieBarP
            }
            , new Object[] {
            T00WD25_A4831AlrPieCalP, T00WD25_n4831AlrPieCalP
            }
            , new Object[] {
            T00WD27_A4805AlRPieDefT, T00WD27_A4806AlRPieDefC
            }
            , new Object[] {
            T00WD28_A396EmprCod, T00WD28_A44AlbRecCod, T00WD28_A2159AlbRecPie
            }
            , new Object[] {
            T00WD29_A396EmprCod, T00WD29_A44AlbRecCod, T00WD29_A2159AlbRecPie
            }
            , new Object[] {
            T00WD30_A396EmprCod, T00WD30_A44AlbRecCod, T00WD30_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00WD34_A407EmprNom, T00WD34_n407EmprNom
            }
            , new Object[] {
            T00WD35_A1291AlbRDes, T00WD35_A970ProceCod, T00WD35_n970ProceCod
            }
            , new Object[] {
            T00WD36_A971ProceNom, T00WD36_n971ProceNom
            }
            , new Object[] {
            T00WD38_A4800AlRPieBarC, T00WD38_A4801AlRPieBarR, T00WD38_A4802AlRPieBarP
            }
            , new Object[] {
            T00WD39_A4831AlrPieCalP, T00WD39_n4831AlrPieCalP
            }
            , new Object[] {
            T00WD41_A4805AlRPieDefT, T00WD41_A4806AlRPieDefC
            }
            , new Object[] {
            T00WD42_A396EmprCod, T00WD42_A44AlbRecCod, T00WD42_A2159AlbRecPie, T00WD42_A10188AlRFibOrd
            }
            , new Object[] {
            T00WD43_A396EmprCod, T00WD43_A44AlbRecCod, T00WD43_A2159AlbRecPie, T00WD43_A9568CodHilz
            }
            , new Object[] {
            T00WD44_A396EmprCod, T00WD44_A44AlbRecCod, T00WD44_A2159AlbRecPie, T00WD44_A7697AlREtiTpo
            }
            , new Object[] {
            T00WD45_A396EmprCod, T00WD45_A44AlbRecCod, T00WD45_A2159AlbRecPie, T00WD45_A4395AlRDefCod, T00WD45_A4412AlRFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00WD47_A396EmprCod, T00WD47_A44AlbRecCod, T00WD47_A2159AlbRecPie
            }
            , new Object[] {
            T00WD48_A4404AlRDef, T00WD48_A4971AlRDefAca, T00WD48_A4972AlRDefCru, T00WD48_A44AlbRecCod, T00WD48_A2159AlbRecPie, T00WD48_A4412AlRFasCod, T00WD48_A4396AlRDefDsc, T00WD48_n4396AlRDefDsc, T00WD48_A4397AlRDefPnt, T00WD48_n4397AlRDefPnt,
            T00WD48_A4403AlRDefCnt, T00WD48_n4403AlRDefCnt, T00WD48_A5261AlrDefPri, T00WD48_n5261AlrDefPri, T00WD48_A396EmprCod, T00WD48_A4395AlRDefCod
            }
            , new Object[] {
            T00WD49_A4396AlRDefDsc, T00WD49_n4396AlRDefDsc, T00WD49_A4397AlRDefPnt, T00WD49_n4397AlRDefPnt
            }
            , new Object[] {
            T00WD50_A396EmprCod, T00WD50_A44AlbRecCod, T00WD50_A2159AlbRecPie, T00WD50_A4395AlRDefCod, T00WD50_A4412AlRFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00WD54_A4396AlRDefDsc, T00WD54_n4396AlRDefDsc, T00WD54_A4397AlRDefPnt, T00WD54_n4397AlRDefPnt
            }
            , new Object[] {
            T00WD55_A396EmprCod, T00WD55_A44AlbRecCod, T00WD55_A2159AlbRecPie, T00WD55_A4395AlRDefCod, T00WD55_A4412AlRFasCod
            }
            , new Object[] {
            T00WD56_A44AlbRecCod, T00WD56_A2159AlbRecPie, T00WD56_A4395AlRDefCod, T00WD56_A4412AlRFasCod, T00WD56_A6683AlrDefMtr, T00WD56_A6684AlRDefCDe, T00WD56_n6684AlRDefCDe, T00WD56_A12910AlRDefMtf, T00WD56_n12910AlRDefMtf, T00WD56_A396EmprCod
            }
            , new Object[] {
            T00WD57_A396EmprCod, T00WD57_A44AlbRecCod, T00WD57_A2159AlbRecPie, T00WD57_A4395AlRDefCod, T00WD57_A4412AlRFasCod, T00WD57_A6683AlrDefMtr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00WD61_A396EmprCod, T00WD61_A44AlbRecCod, T00WD61_A2159AlbRecPie, T00WD61_A4395AlRDefCod, T00WD61_A4412AlRFasCod, T00WD61_A6683AlrDefMtr
            }
            , new Object[] {
            T00WD62_A5267AREDsc, T00WD62_n5267AREDsc, T00WD62_A44AlbRecCod, T00WD62_A2159AlbRecPie, T00WD62_A5262AlbRecEvt, T00WD62_A5263AREBarCod, T00WD62_n5263AREBarCod, T00WD62_A5264AREBarCodR, T00WD62_n5264AREBarCodR, T00WD62_A5265AREBarCodP,
            T00WD62_n5265AREBarCodP, T00WD62_A5266AREFch, T00WD62_n5266AREFch, T00WD62_A5268AREProCod, T00WD62_n5268AREProCod, T00WD62_A5269AREFasCod, T00WD62_n5269AREFasCod, T00WD62_A5270AREAlbProC, T00WD62_n5270AREAlbProC, T00WD62_A5271AREAlmCod,
            T00WD62_n5271AREAlmCod, T00WD62_A5272ARETip, T00WD62_n5272ARETip, T00WD62_A5273AREKgm, T00WD62_n5273AREKgm, T00WD62_A5274AREMtr, T00WD62_n5274AREMtr, T00WD62_A5275AREArt, T00WD62_n5275AREArt, T00WD62_A5276AREUsu,
            T00WD62_n5276AREUsu, T00WD62_A396EmprCod
            }
            , new Object[] {
            T00WD63_A396EmprCod, T00WD63_A44AlbRecCod, T00WD63_A2159AlbRecPie, T00WD63_A5262AlbRecEvt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00WD67_A396EmprCod, T00WD67_A44AlbRecCod, T00WD67_A2159AlbRecPie, T00WD67_A5262AlbRecEvt
            }
         }
      );
   }

   private byte Z4798AlRPieClaM ;
   private byte Z5261AlrDefPri ;
   private byte Z5264AREBarCodR ;
   private byte Z5271AREAlmCod ;
   private byte GxWebError ;
   private byte A4801AlRPieBarR ;
   private byte nKeyPressed ;
   private byte A4794AlRPieCla ;
   private byte A4796AlRPieClaA ;
   private byte A4798AlRPieClaM ;
   private byte A5264AREBarCodR ;
   private byte A5271AREAlmCod ;
   private byte s4794AlRPieCla ;
   private byte O4794AlRPieCla ;
   private byte s4796AlRPieClaA ;
   private byte O4796AlRPieClaA ;
   private byte A5261AlrDefPri ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte B4794AlRPieCla ;
   private byte B4796AlRPieClaA ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid3_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte Z4801AlRPieBarR ;
   private byte Z4796AlRPieClaA ;
   private byte Z4794AlRPieCla ;
   private byte GXv_int4[] ;
   private byte ZZ4798AlRPieClaM ;
   private byte ZZ4801AlRPieBarR ;
   private byte ZZ4796AlRPieClaA ;
   private byte ZZ4794AlRPieCla ;
   private short Z4395AlRDefCod ;
   private short nRcdDeleted_665 ;
   private short nRcdExists_665 ;
   private short nIsMod_665 ;
   private short nRcdDeleted_955 ;
   private short nRcdExists_955 ;
   private short nIsMod_955 ;
   private short Z5262AlbRecEvt ;
   private short nRcdDeleted_770 ;
   private short nRcdExists_770 ;
   private short nIsMod_770 ;
   private short A970ProceCod ;
   private short A4395AlRDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4804AlRPieFasL ;
   private short nBlankRcdCount665 ;
   private short RcdFound665 ;
   private short nBlankRcdUsr665 ;
   private short nBlankRcdCount770 ;
   private short RcdFound770 ;
   private short nBlankRcdUsr770 ;
   private short A5262AlbRecEvt ;
   private short RcdFound955 ;
   private short A4397AlRDefPnt ;
   private short Z970ProceCod ;
   private short RcdFound299 ;
   private short nIsDirty_299 ;
   private short Z4397AlRDefPnt ;
   private short nIsDirty_665 ;
   private short nIsDirty_955 ;
   private short nIsDirty_770 ;
   private short nBlankRcdCount955 ;
   private short nBlankRcdUsr955 ;
   private short subGrid1_Borderwidth ;
   private short Z4804AlRPieFasL ;
   private short GXt_int1 ;
   private short GXv_int6[] ;
   private short ZZ970ProceCod ;
   private short ZZ4804AlRPieFasL ;
   private int Z44AlbRecCod ;
   private int O4806AlRPieDefC ;
   private int O4805AlRPieDefT ;
   private int nRC_GXsfl_160 ;
   private int nGXsfl_160_idx=1 ;
   private int nRC_GXsfl_220 ;
   private int nGXsfl_220_idx=1 ;
   private int Z4404AlRDef ;
   private int Z4971AlRDefAca ;
   private int Z4972AlRDefCru ;
   private int O4972AlRDefCru ;
   private int O4971AlRDefAca ;
   private int nRC_GXsfl_212 ;
   private int nGXsfl_212_idx=1 ;
   private int Z5263AREBarCod ;
   private int A44AlbRecCod ;
   private int A4800AlRPieBarC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRecPie_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlRPieCla_Enabled ;
   private int edtAlRPieCal_Enabled ;
   private int edtAlRPieClaA_Enabled ;
   private int edtAlRPieClaC_Enabled ;
   private int edtAlRPieClaM_Enabled ;
   private int edtAlRPieUltC_Enabled ;
   private int edtAlRPieBarC_Enabled ;
   private int edtAlRPieBarR_Enabled ;
   private int edtAlRPieBarP_Enabled ;
   private int edtAlRPieFasC_Enabled ;
   private int edtAlRPieFasL_Enabled ;
   private int edtAlrPieCalP_Enabled ;
   private int edtAlrPieMtrA_Enabled ;
   private int edtAlrPieKgmA_Enabled ;
   private int A4805AlRPieDefT ;
   private int edtAlRPieDefT_Enabled ;
   private int A4806AlRPieDefC ;
   private int edtAlRPieDefC_Enabled ;
   private int edtAlRExp1_Enabled ;
   private int edtAlRExp2_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtAlbRecIdPz_Enabled ;
   private int B4806AlRPieDefC ;
   private int B4805AlRPieDefT ;
   private int edtAlRDefCod_Enabled ;
   private int edtAlRDefDsc_Enabled ;
   private int edtAlRFasCod_Enabled ;
   private int edtAlRDefPnt_Enabled ;
   private int edtAlRDefCnt_Enabled ;
   private int edtAlRDef_Enabled ;
   private int edtAlRDefAca_Enabled ;
   private int edtAlRDefCru_Enabled ;
   private int edtAlrDefPri_Enabled ;
   private int fRowAdded ;
   private int edtavnRcdDeleted_770_Enabled ;
   private int edtAlbRecEvt_Enabled ;
   private int edtAREBarCod_Enabled ;
   private int edtAREBarCodR_Enabled ;
   private int edtAREBarCodP_Enabled ;
   private int edtAREFch_Enabled ;
   private int edtAREDsc_Enabled ;
   private int edtAREProCod_Enabled ;
   private int edtAREFasCod_Enabled ;
   private int edtAREAlbProC_Enabled ;
   private int edtAREAlmCod_Enabled ;
   private int edtARETip_Enabled ;
   private int edtAREKgm_Enabled ;
   private int edtAREMtr_Enabled ;
   private int edtAREArt_Enabled ;
   private int edtAREUsu_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_955_Enabled ;
   private int A5263AREBarCod ;
   private int edtAlrDefMtr_Enabled ;
   private int edtAlRDefCDe_Enabled ;
   private int edtAlRDefMtf_Enabled ;
   private int s4806AlRPieDefC ;
   private int s4805AlRPieDefT ;
   private int A4404AlRDef ;
   private int A4971AlRDefAca ;
   private int A4972AlRDefCru ;
   private int T4972AlRDefCru ;
   private int T4971AlRDefAca ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int B4972AlRDefCru ;
   private int B4971AlRDefAca ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int defedtAlrDefMtr_Enabled ;
   private int defedtAlbRecEvt_Enabled ;
   private int defedtAlRFasCod_Enabled ;
   private int defedtAlRDefCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtAlbRecIdPz_Backcolor ;
   private int edtProceNom_Backcolor ;
   private int edtProceCod_Backcolor ;
   private int edtAlbRDes_Backcolor ;
   private int edtAlRExp2_Backcolor ;
   private int edtAlRExp1_Backcolor ;
   private int edtAlRPieDefC_Backcolor ;
   private int edtAlRPieDefT_Backcolor ;
   private int edtAlrPieKgmA_Backcolor ;
   private int edtAlrPieMtrA_Backcolor ;
   private int edtAlrPieCalP_Backcolor ;
   private int edtAlRPieFasL_Backcolor ;
   private int edtAlRPieFasC_Backcolor ;
   private int edtAlRPieBarP_Backcolor ;
   private int edtAlRPieBarR_Backcolor ;
   private int edtAlRPieBarC_Backcolor ;
   private int edtAlRPieUltC_Backcolor ;
   private int edtAlRPieClaM_Backcolor ;
   private int edtAlRPieClaC_Backcolor ;
   private int edtAlRPieClaA_Backcolor ;
   private int edtAlRPieCal_Backcolor ;
   private int edtAlRPieCla_Backcolor ;
   private int edtAlbRecKgm_Backcolor ;
   private int edtAlbRecMtr_Backcolor ;
   private int edtAlbRecPie_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z4800AlRPieBarC ;
   private int Z4805AlRPieDefT ;
   private int Z4806AlRPieDefC ;
   private int GXt_int11 ;
   private int GXv_int3[] ;
   private int ZZ4800AlRPieBarC ;
   private int ZZ4805AlRPieDefT ;
   private int ZZ4806AlRPieDefC ;
   private int ZZ44AlbRecCod ;
   private int ZO4806AlRPieDefC ;
   private int ZO4805AlRPieDefT ;
   private long Z5270AREAlbProC ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long A5270AREAlbProC ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z4403AlRDefCnt ;
   private java.math.BigDecimal Z6683AlrDefMtr ;
   private java.math.BigDecimal Z6684AlRDefCDe ;
   private java.math.BigDecimal Z12910AlRDefMtf ;
   private java.math.BigDecimal Z5273AREKgm ;
   private java.math.BigDecimal Z5274AREMtr ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A5259AlrPieMtrA ;
   private java.math.BigDecimal A5260AlrPieKgmA ;
   private java.math.BigDecimal A5273AREKgm ;
   private java.math.BigDecimal A5274AREMtr ;
   private java.math.BigDecimal A6683AlrDefMtr ;
   private java.math.BigDecimal A6684AlRDefCDe ;
   private java.math.BigDecimal A12910AlRDefMtf ;
   private java.math.BigDecimal A4403AlRDefCnt ;
   private java.math.BigDecimal Z5260AlrPieKgmA ;
   private java.math.BigDecimal Z5259AlrPieMtrA ;
   private java.math.BigDecimal GXt_decimal9 ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal ZZ2157AlbRecMtr ;
   private java.math.BigDecimal ZZ2155AlbRecKgm ;
   private java.math.BigDecimal ZZ5260AlrPieKgmA ;
   private java.math.BigDecimal ZZ5259AlrPieMtrA ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String Z4799AlRPieUltC ;
   private String Z4807AlRExp1 ;
   private String Z4808AlRExp2 ;
   private String Z3731AlbRecIdPz ;
   private String Z4412AlRFasCod ;
   private String Z5265AREBarCodP ;
   private String Z5268AREProCod ;
   private String Z5269AREFasCod ;
   private String Z5272ARETip ;
   private String Z5275AREArt ;
   private String Z5276AREUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String A4802AlRPieBarP ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecPie_Internalname ;
   private String sGXsfl_160_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_212_idx="0001" ;
   private String sGXsfl_220_idx="0001" ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAlbRecPie_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecMtr_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecKgm_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAlRPieCla_Internalname ;
   private String edtAlRPieCla_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlRPieCal_Internalname ;
   private String A4795AlRPieCal ;
   private String edtAlRPieCal_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlRPieClaA_Internalname ;
   private String edtAlRPieClaA_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlRPieClaC_Internalname ;
   private String A4797AlRPieClaC ;
   private String edtAlRPieClaC_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlRPieClaM_Internalname ;
   private String edtAlRPieClaM_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAlRPieUltC_Internalname ;
   private String A4799AlRPieUltC ;
   private String edtAlRPieUltC_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAlRPieBarC_Internalname ;
   private String edtAlRPieBarC_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtAlRPieBarR_Internalname ;
   private String edtAlRPieBarR_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtAlRPieBarP_Internalname ;
   private String edtAlRPieBarP_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAlRPieFasC_Internalname ;
   private String A4803AlRPieFasC ;
   private String edtAlRPieFasC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtAlRPieFasL_Internalname ;
   private String edtAlRPieFasL_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtAlrPieCalP_Internalname ;
   private String A4831AlrPieCalP ;
   private String edtAlrPieCalP_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtAlrPieMtrA_Internalname ;
   private String edtAlrPieMtrA_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtAlrPieKgmA_Internalname ;
   private String edtAlrPieKgmA_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtAlRPieDefT_Internalname ;
   private String edtAlRPieDefT_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtAlRPieDefC_Internalname ;
   private String edtAlRPieDefC_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtAlRExp1_Internalname ;
   private String A4807AlRExp1 ;
   private String edtAlRExp1_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtAlRExp2_Internalname ;
   private String A4808AlRExp2 ;
   private String edtAlRExp2_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtAlbRecIdPz_Internalname ;
   private String A3731AlbRecIdPz ;
   private String edtAlbRecIdPz_Jsonclick ;
   private String sMode665 ;
   private String edtAlRDefCod_Internalname ;
   private String edtAlRDefDsc_Internalname ;
   private String edtAlRFasCod_Internalname ;
   private String edtAlRDefPnt_Internalname ;
   private String edtAlRDefCnt_Internalname ;
   private String edtAlRDef_Internalname ;
   private String edtAlRDefAca_Internalname ;
   private String edtAlRDefCru_Internalname ;
   private String edtAlrDefPri_Internalname ;
   private String subGrid1_Internalname ;
   private String sMode770 ;
   private String edtavnRcdDeleted_770_Internalname ;
   private String edtAlbRecEvt_Internalname ;
   private String edtAREBarCod_Internalname ;
   private String edtAREBarCodR_Internalname ;
   private String edtAREBarCodP_Internalname ;
   private String edtAREFch_Internalname ;
   private String edtAREDsc_Internalname ;
   private String edtAREProCod_Internalname ;
   private String edtAREFasCod_Internalname ;
   private String edtAREAlbProC_Internalname ;
   private String edtAREAlmCod_Internalname ;
   private String edtARETip_Internalname ;
   private String edtAREKgm_Internalname ;
   private String edtAREMtr_Internalname ;
   private String edtAREArt_Internalname ;
   private String edtAREUsu_Internalname ;
   private String subGrid3_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_955_Internalname ;
   private String sMode299 ;
   private String GXCCtl ;
   private String A5265AREBarCodP ;
   private String A5268AREProCod ;
   private String A5269AREFasCod ;
   private String A5272ARETip ;
   private String A5275AREArt ;
   private String A5276AREUsu ;
   private String edtAlrDefMtr_Internalname ;
   private String edtAlRDefCDe_Internalname ;
   private String edtAlRDefMtf_Internalname ;
   private String s4797AlRPieClaC ;
   private String O4797AlRPieClaC ;
   private String A4396AlRDefDsc ;
   private String A4412AlRFasCod ;
   private String Z407EmprNom ;
   private String Z1291AlbRDes ;
   private String Z971ProceNom ;
   private String Z4396AlRDefDsc ;
   private String sMode955 ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock37_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_160_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String ROClassString ;
   private String edtAlRDefCod_Jsonclick ;
   private String lblTextblock30_Jsonclick ;
   private String edtAlRDefDsc_Jsonclick ;
   private String lblTextblock31_Jsonclick ;
   private String edtAlRFasCod_Jsonclick ;
   private String lblTextblock32_Jsonclick ;
   private String edtAlRDefPnt_Jsonclick ;
   private String lblTextblock33_Jsonclick ;
   private String edtAlRDefCnt_Jsonclick ;
   private String lblTextblock34_Jsonclick ;
   private String edtAlRDef_Jsonclick ;
   private String lblTextblock35_Jsonclick ;
   private String edtAlRDefAca_Jsonclick ;
   private String lblTextblock36_Jsonclick ;
   private String edtAlRDefCru_Jsonclick ;
   private String lblTextblock37_Jsonclick ;
   private String edtAlrDefPri_Jsonclick ;
   private String B4797AlRPieClaC ;
   private String sGXsfl_212_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_955_Jsonclick ;
   private String edtAlrDefMtr_Jsonclick ;
   private String edtAlRDefCDe_Jsonclick ;
   private String edtAlRDefMtf_Jsonclick ;
   private String sGXsfl_220_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavnRcdDeleted_770_Jsonclick ;
   private String edtAlbRecEvt_Jsonclick ;
   private String edtAREBarCod_Jsonclick ;
   private String edtAREBarCodR_Jsonclick ;
   private String edtAREBarCodP_Jsonclick ;
   private String edtAREFch_Jsonclick ;
   private String edtAREDsc_Jsonclick ;
   private String edtAREProCod_Jsonclick ;
   private String edtAREFasCod_Jsonclick ;
   private String edtAREAlbProC_Jsonclick ;
   private String edtAREAlmCod_Jsonclick ;
   private String edtARETip_Jsonclick ;
   private String edtAREKgm_Jsonclick ;
   private String edtAREMtr_Jsonclick ;
   private String edtAREArt_Jsonclick ;
   private String edtAREUsu_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock29_Caption ;
   private String lblTextblock30_Caption ;
   private String lblTextblock31_Caption ;
   private String lblTextblock32_Caption ;
   private String lblTextblock33_Caption ;
   private String lblTextblock34_Caption ;
   private String lblTextblock35_Caption ;
   private String lblTextblock36_Caption ;
   private String lblTextblock37_Caption ;
   private String subGrid3_Header ;
   private String subGrid2_Header ;
   private String Z4802AlRPieBarP ;
   private String Z4831AlrPieCalP ;
   private String Z4803AlRPieFasC ;
   private String Z4797AlRPieClaC ;
   private String GXt_char7 ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ2159AlbRecPie ;
   private String ZZ4799AlRPieUltC ;
   private String ZZ4807AlRExp1 ;
   private String ZZ4808AlRExp2 ;
   private String ZZ3731AlbRecIdPz ;
   private String ZZ407EmprNom ;
   private String ZZ1291AlbRDes ;
   private String ZZ971ProceNom ;
   private String ZZ4802AlRPieBarP ;
   private String ZZ4831AlrPieCalP ;
   private String ZZ4803AlRPieFasC ;
   private String ZZ4797AlRPieClaC ;
   private String ZZ4795AlRPieCal ;
   private java.util.Date Z5266AREFch ;
   private java.util.Date A5266AREFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n970ProceCod ;
   private boolean wbErr ;
   private boolean bGXsfl_160_Refreshing=false ;
   private boolean bGXsfl_220_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4798AlRPieClaM ;
   private boolean n4799AlRPieUltC ;
   private boolean n4831AlrPieCalP ;
   private boolean n4807AlRExp1 ;
   private boolean n4808AlRExp2 ;
   private boolean n971ProceNom ;
   private boolean bGXsfl_212_Refreshing=false ;
   private boolean Gx_longc ;
   private boolean n4396AlRDefDsc ;
   private boolean n4397AlRDefPnt ;
   private boolean n4403AlRDefCnt ;
   private boolean n5261AlrDefPri ;
   private boolean n6684AlRDefCDe ;
   private boolean n12910AlRDefMtf ;
   private boolean n5267AREDsc ;
   private boolean n5263AREBarCod ;
   private boolean n5264AREBarCodR ;
   private boolean n5265AREBarCodP ;
   private boolean n5266AREFch ;
   private boolean n5268AREProCod ;
   private boolean n5269AREFasCod ;
   private boolean n5270AREAlbProC ;
   private boolean n5271AREAlmCod ;
   private boolean n5272ARETip ;
   private boolean n5273AREKgm ;
   private boolean n5274AREMtr ;
   private boolean n5275AREArt ;
   private boolean n5276AREUsu ;
   private String A5267AREDsc ;
   private String Z5267AREDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00WD19_A4795AlRPieCal ;
   private String[] T00WD19_A2159AlbRecPie ;
   private String[] T00WD19_A407EmprNom ;
   private boolean[] T00WD19_n407EmprNom ;
   private java.math.BigDecimal[] T00WD19_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T00WD19_A2155AlbRecKgm ;
   private byte[] T00WD19_A4798AlRPieClaM ;
   private boolean[] T00WD19_n4798AlRPieClaM ;
   private String[] T00WD19_A4799AlRPieUltC ;
   private boolean[] T00WD19_n4799AlRPieUltC ;
   private String[] T00WD19_A4807AlRExp1 ;
   private boolean[] T00WD19_n4807AlRExp1 ;
   private String[] T00WD19_A4808AlRExp2 ;
   private boolean[] T00WD19_n4808AlRExp2 ;
   private String[] T00WD19_A1291AlbRDes ;
   private String[] T00WD19_A971ProceNom ;
   private boolean[] T00WD19_n971ProceNom ;
   private String[] T00WD19_A3731AlbRecIdPz ;
   private String[] T00WD19_A396EmprCod ;
   private int[] T00WD19_A44AlbRecCod ;
   private short[] T00WD19_A970ProceCod ;
   private boolean[] T00WD19_n970ProceCod ;
   private int[] T00WD15_A4800AlRPieBarC ;
   private byte[] T00WD15_A4801AlRPieBarR ;
   private String[] T00WD15_A4802AlRPieBarP ;
   private String[] T00WD16_A4831AlrPieCalP ;
   private boolean[] T00WD16_n4831AlrPieCalP ;
   private int[] T00WD18_A4805AlRPieDefT ;
   private int[] T00WD18_A4806AlRPieDefC ;
   private String[] T00WD11_A407EmprNom ;
   private boolean[] T00WD11_n407EmprNom ;
   private String[] T00WD12_A1291AlbRDes ;
   private short[] T00WD12_A970ProceCod ;
   private boolean[] T00WD12_n970ProceCod ;
   private String[] T00WD13_A971ProceNom ;
   private boolean[] T00WD13_n971ProceNom ;
   private String[] T00WD20_A407EmprNom ;
   private boolean[] T00WD20_n407EmprNom ;
   private String[] T00WD21_A1291AlbRDes ;
   private short[] T00WD21_A970ProceCod ;
   private boolean[] T00WD21_n970ProceCod ;
   private String[] T00WD22_A971ProceNom ;
   private boolean[] T00WD22_n971ProceNom ;
   private int[] T00WD24_A4800AlRPieBarC ;
   private byte[] T00WD24_A4801AlRPieBarR ;
   private String[] T00WD24_A4802AlRPieBarP ;
   private String[] T00WD25_A4831AlrPieCalP ;
   private boolean[] T00WD25_n4831AlrPieCalP ;
   private int[] T00WD27_A4805AlRPieDefT ;
   private int[] T00WD27_A4806AlRPieDefC ;
   private String[] T00WD28_A396EmprCod ;
   private int[] T00WD28_A44AlbRecCod ;
   private String[] T00WD28_A2159AlbRecPie ;
   private String[] T00WD10_A4795AlRPieCal ;
   private String[] T00WD10_A2159AlbRecPie ;
   private java.math.BigDecimal[] T00WD10_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T00WD10_A2155AlbRecKgm ;
   private byte[] T00WD10_A4798AlRPieClaM ;
   private boolean[] T00WD10_n4798AlRPieClaM ;
   private String[] T00WD10_A4799AlRPieUltC ;
   private boolean[] T00WD10_n4799AlRPieUltC ;
   private String[] T00WD10_A4807AlRExp1 ;
   private boolean[] T00WD10_n4807AlRExp1 ;
   private String[] T00WD10_A4808AlRExp2 ;
   private boolean[] T00WD10_n4808AlRExp2 ;
   private String[] T00WD10_A3731AlbRecIdPz ;
   private String[] T00WD10_A396EmprCod ;
   private int[] T00WD10_A44AlbRecCod ;
   private String[] T00WD29_A396EmprCod ;
   private int[] T00WD29_A44AlbRecCod ;
   private String[] T00WD29_A2159AlbRecPie ;
   private String[] T00WD30_A396EmprCod ;
   private int[] T00WD30_A44AlbRecCod ;
   private String[] T00WD30_A2159AlbRecPie ;
   private String[] T00WD9_A4795AlRPieCal ;
   private String[] T00WD9_A2159AlbRecPie ;
   private java.math.BigDecimal[] T00WD9_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T00WD9_A2155AlbRecKgm ;
   private byte[] T00WD9_A4798AlRPieClaM ;
   private boolean[] T00WD9_n4798AlRPieClaM ;
   private String[] T00WD9_A4799AlRPieUltC ;
   private boolean[] T00WD9_n4799AlRPieUltC ;
   private String[] T00WD9_A4807AlRExp1 ;
   private boolean[] T00WD9_n4807AlRExp1 ;
   private String[] T00WD9_A4808AlRExp2 ;
   private boolean[] T00WD9_n4808AlRExp2 ;
   private String[] T00WD9_A3731AlbRecIdPz ;
   private String[] T00WD9_A396EmprCod ;
   private int[] T00WD9_A44AlbRecCod ;
   private String[] T00WD34_A407EmprNom ;
   private boolean[] T00WD34_n407EmprNom ;
   private String[] T00WD35_A1291AlbRDes ;
   private short[] T00WD35_A970ProceCod ;
   private boolean[] T00WD35_n970ProceCod ;
   private String[] T00WD36_A971ProceNom ;
   private boolean[] T00WD36_n971ProceNom ;
   private int[] T00WD38_A4800AlRPieBarC ;
   private byte[] T00WD38_A4801AlRPieBarR ;
   private String[] T00WD38_A4802AlRPieBarP ;
   private String[] T00WD39_A4831AlrPieCalP ;
   private boolean[] T00WD39_n4831AlrPieCalP ;
   private int[] T00WD41_A4805AlRPieDefT ;
   private int[] T00WD41_A4806AlRPieDefC ;
   private String[] T00WD42_A396EmprCod ;
   private int[] T00WD42_A44AlbRecCod ;
   private String[] T00WD42_A2159AlbRecPie ;
   private int[] T00WD42_A10188AlRFibOrd ;
   private String[] T00WD43_A396EmprCod ;
   private int[] T00WD43_A44AlbRecCod ;
   private String[] T00WD43_A2159AlbRecPie ;
   private String[] T00WD43_A9568CodHilz ;
   private String[] T00WD44_A396EmprCod ;
   private int[] T00WD44_A44AlbRecCod ;
   private String[] T00WD44_A2159AlbRecPie ;
   private byte[] T00WD44_A7697AlREtiTpo ;
   private String[] T00WD45_A396EmprCod ;
   private int[] T00WD45_A44AlbRecCod ;
   private String[] T00WD45_A2159AlbRecPie ;
   private short[] T00WD45_A4395AlRDefCod ;
   private String[] T00WD45_A4412AlRFasCod ;
   private String[] T00WD47_A396EmprCod ;
   private int[] T00WD47_A44AlbRecCod ;
   private String[] T00WD47_A2159AlbRecPie ;
   private int[] T00WD48_A4404AlRDef ;
   private int[] T00WD48_A4971AlRDefAca ;
   private int[] T00WD48_A4972AlRDefCru ;
   private int[] T00WD48_A44AlbRecCod ;
   private String[] T00WD48_A2159AlbRecPie ;
   private String[] T00WD48_A4412AlRFasCod ;
   private String[] T00WD48_A4396AlRDefDsc ;
   private boolean[] T00WD48_n4396AlRDefDsc ;
   private short[] T00WD48_A4397AlRDefPnt ;
   private boolean[] T00WD48_n4397AlRDefPnt ;
   private java.math.BigDecimal[] T00WD48_A4403AlRDefCnt ;
   private boolean[] T00WD48_n4403AlRDefCnt ;
   private byte[] T00WD48_A5261AlrDefPri ;
   private boolean[] T00WD48_n5261AlrDefPri ;
   private String[] T00WD48_A396EmprCod ;
   private short[] T00WD48_A4395AlRDefCod ;
   private String[] T00WD8_A4396AlRDefDsc ;
   private boolean[] T00WD8_n4396AlRDefDsc ;
   private short[] T00WD8_A4397AlRDefPnt ;
   private boolean[] T00WD8_n4397AlRDefPnt ;
   private String[] T00WD49_A4396AlRDefDsc ;
   private boolean[] T00WD49_n4396AlRDefDsc ;
   private short[] T00WD49_A4397AlRDefPnt ;
   private boolean[] T00WD49_n4397AlRDefPnt ;
   private String[] T00WD50_A396EmprCod ;
   private int[] T00WD50_A44AlbRecCod ;
   private String[] T00WD50_A2159AlbRecPie ;
   private short[] T00WD50_A4395AlRDefCod ;
   private String[] T00WD50_A4412AlRFasCod ;
   private int[] T00WD7_A4404AlRDef ;
   private int[] T00WD7_A4971AlRDefAca ;
   private int[] T00WD7_A4972AlRDefCru ;
   private int[] T00WD7_A44AlbRecCod ;
   private String[] T00WD7_A2159AlbRecPie ;
   private String[] T00WD7_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD7_A4403AlRDefCnt ;
   private boolean[] T00WD7_n4403AlRDefCnt ;
   private byte[] T00WD7_A5261AlrDefPri ;
   private boolean[] T00WD7_n5261AlrDefPri ;
   private String[] T00WD7_A396EmprCod ;
   private short[] T00WD7_A4395AlRDefCod ;
   private int[] T00WD6_A4404AlRDef ;
   private int[] T00WD6_A4971AlRDefAca ;
   private int[] T00WD6_A4972AlRDefCru ;
   private int[] T00WD6_A44AlbRecCod ;
   private String[] T00WD6_A2159AlbRecPie ;
   private String[] T00WD6_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD6_A4403AlRDefCnt ;
   private boolean[] T00WD6_n4403AlRDefCnt ;
   private byte[] T00WD6_A5261AlrDefPri ;
   private boolean[] T00WD6_n5261AlrDefPri ;
   private String[] T00WD6_A396EmprCod ;
   private short[] T00WD6_A4395AlRDefCod ;
   private String[] T00WD54_A4396AlRDefDsc ;
   private boolean[] T00WD54_n4396AlRDefDsc ;
   private short[] T00WD54_A4397AlRDefPnt ;
   private boolean[] T00WD54_n4397AlRDefPnt ;
   private String[] T00WD55_A396EmprCod ;
   private int[] T00WD55_A44AlbRecCod ;
   private String[] T00WD55_A2159AlbRecPie ;
   private short[] T00WD55_A4395AlRDefCod ;
   private String[] T00WD55_A4412AlRFasCod ;
   private int[] T00WD56_A44AlbRecCod ;
   private String[] T00WD56_A2159AlbRecPie ;
   private short[] T00WD56_A4395AlRDefCod ;
   private String[] T00WD56_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD56_A6683AlrDefMtr ;
   private java.math.BigDecimal[] T00WD56_A6684AlRDefCDe ;
   private boolean[] T00WD56_n6684AlRDefCDe ;
   private java.math.BigDecimal[] T00WD56_A12910AlRDefMtf ;
   private boolean[] T00WD56_n12910AlRDefMtf ;
   private String[] T00WD56_A396EmprCod ;
   private String[] T00WD57_A396EmprCod ;
   private int[] T00WD57_A44AlbRecCod ;
   private String[] T00WD57_A2159AlbRecPie ;
   private short[] T00WD57_A4395AlRDefCod ;
   private String[] T00WD57_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD57_A6683AlrDefMtr ;
   private int[] T00WD5_A44AlbRecCod ;
   private String[] T00WD5_A2159AlbRecPie ;
   private short[] T00WD5_A4395AlRDefCod ;
   private String[] T00WD5_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD5_A6683AlrDefMtr ;
   private java.math.BigDecimal[] T00WD5_A6684AlRDefCDe ;
   private boolean[] T00WD5_n6684AlRDefCDe ;
   private java.math.BigDecimal[] T00WD5_A12910AlRDefMtf ;
   private boolean[] T00WD5_n12910AlRDefMtf ;
   private String[] T00WD5_A396EmprCod ;
   private int[] T00WD4_A44AlbRecCod ;
   private String[] T00WD4_A2159AlbRecPie ;
   private short[] T00WD4_A4395AlRDefCod ;
   private String[] T00WD4_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD4_A6683AlrDefMtr ;
   private java.math.BigDecimal[] T00WD4_A6684AlRDefCDe ;
   private boolean[] T00WD4_n6684AlRDefCDe ;
   private java.math.BigDecimal[] T00WD4_A12910AlRDefMtf ;
   private boolean[] T00WD4_n12910AlRDefMtf ;
   private String[] T00WD4_A396EmprCod ;
   private String[] T00WD61_A396EmprCod ;
   private int[] T00WD61_A44AlbRecCod ;
   private String[] T00WD61_A2159AlbRecPie ;
   private short[] T00WD61_A4395AlRDefCod ;
   private String[] T00WD61_A4412AlRFasCod ;
   private java.math.BigDecimal[] T00WD61_A6683AlrDefMtr ;
   private String[] T00WD62_A5267AREDsc ;
   private boolean[] T00WD62_n5267AREDsc ;
   private int[] T00WD62_A44AlbRecCod ;
   private String[] T00WD62_A2159AlbRecPie ;
   private short[] T00WD62_A5262AlbRecEvt ;
   private int[] T00WD62_A5263AREBarCod ;
   private boolean[] T00WD62_n5263AREBarCod ;
   private byte[] T00WD62_A5264AREBarCodR ;
   private boolean[] T00WD62_n5264AREBarCodR ;
   private String[] T00WD62_A5265AREBarCodP ;
   private boolean[] T00WD62_n5265AREBarCodP ;
   private java.util.Date[] T00WD62_A5266AREFch ;
   private boolean[] T00WD62_n5266AREFch ;
   private String[] T00WD62_A5268AREProCod ;
   private boolean[] T00WD62_n5268AREProCod ;
   private String[] T00WD62_A5269AREFasCod ;
   private boolean[] T00WD62_n5269AREFasCod ;
   private long[] T00WD62_A5270AREAlbProC ;
   private boolean[] T00WD62_n5270AREAlbProC ;
   private byte[] T00WD62_A5271AREAlmCod ;
   private boolean[] T00WD62_n5271AREAlmCod ;
   private String[] T00WD62_A5272ARETip ;
   private boolean[] T00WD62_n5272ARETip ;
   private java.math.BigDecimal[] T00WD62_A5273AREKgm ;
   private boolean[] T00WD62_n5273AREKgm ;
   private java.math.BigDecimal[] T00WD62_A5274AREMtr ;
   private boolean[] T00WD62_n5274AREMtr ;
   private String[] T00WD62_A5275AREArt ;
   private boolean[] T00WD62_n5275AREArt ;
   private String[] T00WD62_A5276AREUsu ;
   private boolean[] T00WD62_n5276AREUsu ;
   private String[] T00WD62_A396EmprCod ;
   private String[] T00WD63_A396EmprCod ;
   private int[] T00WD63_A44AlbRecCod ;
   private String[] T00WD63_A2159AlbRecPie ;
   private short[] T00WD63_A5262AlbRecEvt ;
   private String[] T00WD3_A5267AREDsc ;
   private boolean[] T00WD3_n5267AREDsc ;
   private int[] T00WD3_A44AlbRecCod ;
   private String[] T00WD3_A2159AlbRecPie ;
   private short[] T00WD3_A5262AlbRecEvt ;
   private int[] T00WD3_A5263AREBarCod ;
   private boolean[] T00WD3_n5263AREBarCod ;
   private byte[] T00WD3_A5264AREBarCodR ;
   private boolean[] T00WD3_n5264AREBarCodR ;
   private String[] T00WD3_A5265AREBarCodP ;
   private boolean[] T00WD3_n5265AREBarCodP ;
   private java.util.Date[] T00WD3_A5266AREFch ;
   private boolean[] T00WD3_n5266AREFch ;
   private String[] T00WD3_A5268AREProCod ;
   private boolean[] T00WD3_n5268AREProCod ;
   private String[] T00WD3_A5269AREFasCod ;
   private boolean[] T00WD3_n5269AREFasCod ;
   private long[] T00WD3_A5270AREAlbProC ;
   private boolean[] T00WD3_n5270AREAlbProC ;
   private byte[] T00WD3_A5271AREAlmCod ;
   private boolean[] T00WD3_n5271AREAlmCod ;
   private String[] T00WD3_A5272ARETip ;
   private boolean[] T00WD3_n5272ARETip ;
   private java.math.BigDecimal[] T00WD3_A5273AREKgm ;
   private boolean[] T00WD3_n5273AREKgm ;
   private java.math.BigDecimal[] T00WD3_A5274AREMtr ;
   private boolean[] T00WD3_n5274AREMtr ;
   private String[] T00WD3_A5275AREArt ;
   private boolean[] T00WD3_n5275AREArt ;
   private String[] T00WD3_A5276AREUsu ;
   private boolean[] T00WD3_n5276AREUsu ;
   private String[] T00WD3_A396EmprCod ;
   private String[] T00WD2_A5267AREDsc ;
   private boolean[] T00WD2_n5267AREDsc ;
   private int[] T00WD2_A44AlbRecCod ;
   private String[] T00WD2_A2159AlbRecPie ;
   private short[] T00WD2_A5262AlbRecEvt ;
   private int[] T00WD2_A5263AREBarCod ;
   private boolean[] T00WD2_n5263AREBarCod ;
   private byte[] T00WD2_A5264AREBarCodR ;
   private boolean[] T00WD2_n5264AREBarCodR ;
   private String[] T00WD2_A5265AREBarCodP ;
   private boolean[] T00WD2_n5265AREBarCodP ;
   private java.util.Date[] T00WD2_A5266AREFch ;
   private boolean[] T00WD2_n5266AREFch ;
   private String[] T00WD2_A5268AREProCod ;
   private boolean[] T00WD2_n5268AREProCod ;
   private String[] T00WD2_A5269AREFasCod ;
   private boolean[] T00WD2_n5269AREFasCod ;
   private long[] T00WD2_A5270AREAlbProC ;
   private boolean[] T00WD2_n5270AREAlbProC ;
   private byte[] T00WD2_A5271AREAlmCod ;
   private boolean[] T00WD2_n5271AREAlmCod ;
   private String[] T00WD2_A5272ARETip ;
   private boolean[] T00WD2_n5272ARETip ;
   private java.math.BigDecimal[] T00WD2_A5273AREKgm ;
   private boolean[] T00WD2_n5273AREKgm ;
   private java.math.BigDecimal[] T00WD2_A5274AREMtr ;
   private boolean[] T00WD2_n5274AREMtr ;
   private String[] T00WD2_A5275AREArt ;
   private boolean[] T00WD2_n5275AREArt ;
   private String[] T00WD2_A5276AREUsu ;
   private boolean[] T00WD2_n5276AREUsu ;
   private String[] T00WD2_A396EmprCod ;
   private String[] T00WD67_A396EmprCod ;
   private int[] T00WD67_A44AlbRecCod ;
   private String[] T00WD67_A2159AlbRecPie ;
   private short[] T00WD67_A5262AlbRecEvt ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talrpme__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpme__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpme__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpme__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpme__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00WD2", "SELECT AlrEvtDsc, albreccod, AlbRecPie, AlbRecEvt, BarCod, BarCodReo, BarCodPar, AlrEvtFch, ProCod, FasCod, AlbProCod, AlmCod, AlrEvtTip, AlrEvtKgm, ALREVTMtr, ALREVTART, ALREVTUsu, EmprCod FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ? AND AlbRecEvt = ?  FOR UPDATE OF BarCod, BarCodReo, BarCodPar, AlrEvtFch, AlrEvtDsc, ProCod, FasCod, AlbProCod, AlmCod, AlrEvtTip, AlrEvtKgm, ALREVTMtr, ALREVTART, ALREVTUsu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD3", "SELECT AlrEvtDsc, albreccod, AlbRecPie, AlbRecEvt, BarCod, BarCodReo, BarCodPar, AlrEvtFch, ProCod, FasCod, AlbProCod, AlmCod, AlrEvtTip, AlrEvtKgm, ALREVTMtr, ALREVTART, ALREVTUsu, EmprCod FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ? AND AlbRecEvt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD4", "SELECT AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr, AlRDefCDe, AlRDefMtf, EmprCod FROM TXPAlRPMe WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? AND AlrDefMtr = ?  FOR UPDATE OF AlRDefCDe, AlRDefMtf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD5", "SELECT AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr, AlRDefCDe, AlRDefMtf, EmprCod FROM TXPAlRPMe WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? AND AlrDefMtr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD6", "SELECT AlRDef, AlRDefAca, AlRDefCru, AlbRecCod, AlbRecPie, AlRFasCod, AlRDefCnt, AlrDefPri, EmprCod, AlRDefCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ?  FOR UPDATE OF AlRDef, AlRDefAca, AlRDefCru, AlRDefCnt, AlrDefPri NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD7", "SELECT AlRDef, AlRDefAca, AlRDefCru, AlbRecCod, AlbRecPie, AlRFasCod, AlRDefCnt, AlrDefPri, EmprCod, AlRDefCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD8", "SELECT TipDefDsc AS AlRDefDsc, TipDefPnt AS AlRDefPnt FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD9", "SELECT AlRPieCal, AlbRecPie, AlbRecMtr, AlbRecKgm, AlRPieClaM, AlRPieUltC, AlRExp1, AlRExp2, AlbRecIdPz, EmprCod, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlRPieCal, AlbRecMtr, AlbRecKgm, AlRPieClaM, AlRPieUltC, AlRExp1, AlRExp2, AlbRecIdPz, AlRPieDefT, AlRPieDefC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD10", "SELECT AlRPieCal, AlbRecPie, AlbRecMtr, AlbRecKgm, AlRPieClaM, AlRPieUltC, AlRExp1, AlRExp2, AlbRecIdPz, EmprCod, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD12", "SELECT AlbRDes, ProceCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD13", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD15", "SELECT COALESCE( T1.AlRPieBarC, 0) AS AlRPieBarC, COALESCE( T1.AlRPieBarR, 0) AS AlRPieBarR, COALESCE( T1.AlRPieBarP, '') AS AlRPieBarP, T1.AlRPieBarC, T1.AlRPieBarR, T1.AlRPieBarP FROM (SELECT MIN(BarCod) AS AlRPieBarC, AlbRecCod, MIN(BarCodReo) AS AlRPieBarR, MIN(BarCodPar) AS AlRPieBarP FROM TXPBARPIE WHERE (EmprCod = ?) AND (BarPieCod = ?) GROUP BY AlbRecCod ) T1 WHERE T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD16", "SELECT COALESCE( BarMat, 'N/A') AS AlrPieCalP FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD18", "SELECT COALESCE( T1.AlRPieDefT, 0) AS AlRPieDefT, COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefAca) AS AlRPieDefT, EmprCod, AlbRecCod, AlbRecPie, SUM(AlRDefCru) AS AlRPieDefC FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD19", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlRPieCal, TM1.AlbRecPie, T2.EmprNom, TM1.AlbRecMtr, TM1.AlbRecKgm, TM1.AlRPieClaM, TM1.AlRPieUltC, TM1.AlRExp1, TM1.AlRExp2, T3.AlbRDes, T4.ProceNom, TM1.AlbRecIdPz, TM1.EmprCod, TM1.AlbRecCod, T3.ProceCod FROM (((TXPALBDET TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProceCod = T3.ProceCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.AlbRecPie = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod, TM1.AlbRecPie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD21", "SELECT AlbRDes, ProceCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD22", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD24", "SELECT T1.AlRPieBarC, T1.AlRPieBarR, T1.AlRPieBarP FROM (SELECT MIN(BarCod) AS AlRPieBarC, AlbRecCod, MIN(BarCodReo) AS AlRPieBarR, MIN(BarCodPar) AS AlRPieBarP FROM TXPBARPIE WHERE (EmprCod = ?) AND (BarPieCod = ?) GROUP BY AlbRecCod ) T1 WHERE T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD25", "SELECT COALESCE( BarMat, 'N/A') AS AlrPieCalP FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD27", "SELECT COALESCE( T1.AlRPieDefT, 0) AS AlRPieDefT, COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefAca) AS AlRPieDefT, EmprCod, AlbRecCod, AlbRecPie, SUM(AlRDefCru) AS AlRPieDefC FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD28", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD29", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ? or AlbRecCod = ? and EmprCod = ? and AlbRecPie > ?) ORDER BY EmprCod, AlbRecCod, AlbRecPie) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00WD30", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ? or AlbRecCod = ? and EmprCod = ? and AlbRecPie < ?) ORDER BY EmprCod DESC, AlbRecCod DESC, AlbRecPie DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00WD31", "INSERT INTO TXPALBDET(AlRPieCal, AlbRecPie, AlbRecMtr, AlbRecKgm, AlRPieClaM, AlRPieUltC, AlRExp1, AlRExp2, AlbRecIdPz, EmprCod, AlbRecCod, AlRPieDefT, AlRPieDefC, AlbRecAnh, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdRc, AlbRecPal, AlbRecFec, AlbRecPar, AlbRecCue, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, AlbPCont) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T00WD32", "UPDATE TXPALBDET SET AlRPieCal=?, AlbRecMtr=?, AlbRecKgm=?, AlRPieClaM=?, AlRPieUltC=?, AlRExp1=?, AlRExp2=?, AlbRecIdPz=?, AlRPieDefT=?, AlRPieDefC=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T00WD33", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T00WD34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD35", "SELECT AlbRDes, ProceCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD36", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD38", "SELECT T1.AlRPieBarC, T1.AlRPieBarR, T1.AlRPieBarP FROM (SELECT MIN(BarCod) AS AlRPieBarC, AlbRecCod, MIN(BarCodReo) AS AlRPieBarR, MIN(BarCodPar) AS AlRPieBarP FROM TXPBARPIE WHERE (EmprCod = ?) AND (BarPieCod = ?) GROUP BY AlbRecCod ) T1 WHERE T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD39", "SELECT COALESCE( BarMat, 'N/A') AS AlrPieCalP FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD41", "SELECT COALESCE( T1.AlRPieDefT, 0) AS AlRPieDefT, COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefAca) AS AlRPieDefT, EmprCod, AlbRecCod, AlbRecPie, SUM(AlRDefCru) AS AlRPieDefC FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD42", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00WD43", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, CodHilz FROM TXPHILZPZ WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00WD44", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlREtiTpo FROM TXPAlRPi1 WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00WD45", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00WD46", "UPDATE TXPALBDET SET AlRPieDefC=?, AlRPieDefT=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T00WD47", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD48", "SELECT T1.AlRDef, T1.AlRDefAca, T1.AlRDefCru, T1.AlbRecCod, T1.AlbRecPie, T1.AlRFasCod, T2.TipDefDsc AS AlRDefDsc, T2.TipDefPnt AS AlRDefPnt, T1.AlRDefCnt, T1.AlrDefPri, T1.EmprCod, T1.AlRDefCod AS AlRDefCod FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? and T1.AlRDefCod = ? and T1.AlRFasCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlRDefCod, T1.AlRFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD49", "SELECT TipDefDsc AS AlRDefDsc, TipDefPnt AS AlRDefPnt FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD50", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00WD51", "INSERT INTO TXPAlRPie(AlRDef, AlRDefAca, AlRDefCru, AlbRecCod, AlbRecPie, AlRFasCod, AlRDefCnt, AlrDefPri, EmprCod, AlRDefCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAlRPie")
         ,new UpdateCursor("T00WD52", "UPDATE TXPAlRPie SET AlRDef=?, AlRDefAca=?, AlRDefCru=?, AlRDefCnt=?, AlrDefPri=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ?", GX_NOMASK, "TXPAlRPie")
         ,new UpdateCursor("T00WD53", "DELETE FROM TXPAlRPie  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ?", GX_NOMASK, "TXPAlRPie")
         ,new ForEachCursor("T00WD54", "SELECT TipDefDsc AS AlRDefDsc, TipDefPnt AS AlRDefPnt FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD55", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD56", "SELECT AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr, AlRDefCDe, AlRDefMtf, EmprCod FROM TXPAlRPMe WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? and AlRDefCod = ? and AlRFasCod = ? and AlrDefMtr = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD57", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr FROM TXPAlRPMe WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? AND AlrDefMtr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00WD58", "INSERT INTO TXPAlRPMe(AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr, AlRDefCDe, AlRDefMtf, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAlRPMe")
         ,new UpdateCursor("T00WD59", "UPDATE TXPAlRPMe SET AlRDefCDe=?, AlRDefMtf=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? AND AlrDefMtr = ?", GX_NOMASK, "TXPAlRPMe")
         ,new UpdateCursor("T00WD60", "DELETE FROM TXPAlRPMe  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRDefCod = ? AND AlRFasCod = ? AND AlrDefMtr = ?", GX_NOMASK, "TXPAlRPMe")
         ,new ForEachCursor("T00WD61", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr FROM TXPAlRPMe WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? and AlRDefCod = ? and AlRFasCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod, AlrDefMtr ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD62", "SELECT AlrEvtDsc, albreccod, AlbRecPie, AlbRecEvt, BarCod, BarCodReo, BarCodPar, AlrEvtFch, ProCod, FasCod, AlbProCod, AlmCod, AlrEvtTip, AlrEvtKgm, ALREVTMtr, ALREVTART, ALREVTUsu, EmprCod FROM TXPALRHIS WHERE EmprCod = ? and albreccod = ? and AlbRecPie = ? and AlbRecEvt = ? ORDER BY EmprCod, albreccod, AlbRecPie, AlbRecEvt ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WD63", "SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ? AND AlbRecEvt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00WD64", "INSERT INTO TXPALRHIS(albreccod, AlbRecPie, AlbRecEvt, BarCod, BarCodReo, BarCodPar, AlrEvtFch, AlrEvtDsc, ProCod, FasCod, AlbProCod, AlmCod, AlrEvtTip, AlrEvtKgm, ALREVTMtr, ALREVTART, ALREVTUsu, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALRHIS")
         ,new UpdateCursor("T00WD65", "UPDATE TXPALRHIS SET BarCod=?, BarCodReo=?, BarCodPar=?, AlrEvtFch=?, AlrEvtDsc=?, ProCod=?, FasCod=?, AlbProCod=?, AlmCod=?, AlrEvtTip=?, AlrEvtKgm=?, ALREVTMtr=?, ALREVTART=?, ALREVTUsu=?  WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ? AND AlbRecEvt = ?", GX_NOMASK, "TXPALRHIS")
         ,new UpdateCursor("T00WD66", "DELETE FROM TXPALRHIS  WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ? AND AlbRecEvt = ?", GX_NOMASK, "TXPALRHIS")
         ,new ForEachCursor("T00WD67", "SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? and albreccod = ? and AlbRecPie = ? ORDER BY EmprCod, albreccod, AlbRecPie, AlbRecEvt ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 9);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 9);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 15);
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 15);
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 15);
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               ((int[]) buf[19])[0] = rslt.getInt(14);
               ((short[]) buf[20])[0] = rslt.getShort(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 48 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 9);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               stmt.setString(9, (String)parms[12], 15);
               stmt.setString(10, (String)parms[13], 3);
               stmt.setInt(11, ((Number) parms[14]).intValue());
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setInt(13, ((Number) parms[16]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               stmt.setString(8, (String)parms[11], 15);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setInt(10, ((Number) parms[13]).intValue());
               stmt.setString(11, (String)parms[14], 3);
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setString(13, (String)parms[16], 9);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 38 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 43 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               stmt.setString(6, (String)parms[5], 8);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[9]).byteValue());
               }
               stmt.setString(9, (String)parms[10], 3);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               return;
            case 44 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setString(8, (String)parms[9], 9);
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               stmt.setString(10, (String)parms[11], 8);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 50 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 9);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setString(8, (String)parms[9], 3);
               return;
            case 51 :
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
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 9);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               stmt.setString(7, (String)parms[8], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 56 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 9);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(8, (String)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[18]).longValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 16);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 10);
               }
               stmt.setString(18, (String)parms[31], 3);
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 16);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 10);
               }
               stmt.setString(15, (String)parms[28], 3);
               stmt.setInt(16, ((Number) parms[29]).intValue());
               stmt.setString(17, (String)parms[30], 9);
               stmt.setShort(18, ((Number) parms[31]).shortValue());
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

