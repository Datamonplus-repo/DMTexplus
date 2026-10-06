package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprdgen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A629MetCod = (byte)(GXutil.lval( httpContext.GetPar( "MetCod"))) ;
         n629MetCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A629MetCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
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
         gxload_10( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A835TipDtoCod = (byte)(GXutil.lval( httpContext.GetPar( "TipDtoCod"))) ;
         n835TipDtoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A835TipDtoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A742PrdUniCom = (byte)(GXutil.lval( httpContext.GetPar( "PrdUniCom"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A742PrdUniCom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A743PrdUniCon = (byte)(GXutil.lval( httpContext.GetPar( "PrdUniCon"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A743PrdUniCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A856ValCod = (byte)(GXutil.lval( httpContext.GetPar( "ValCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A856ValCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tprdgen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprdgen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdgen_impl.class ));
   }

   public tprdgen_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPrdAltAct = UIFactory.getCheckbox(this);
      chkPrdPesCon = UIFactory.getCheckbox(this);
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
      A8895PrdAltAct = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8895PrdAltAct, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8895PrdAltAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRDGEN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Tecnica", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDscTec_Internalname, GXutil.rtrim( A703PrdDscTec), GXutil.rtrim( localUtil.format( A703PrdDscTec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDscTec_Jsonclick, 0, "", "", "", "", "", 1, edtPrdDscTec_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Unidad de Compra", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9") : localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUniCom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Unidad de Compra", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUcpDsc_Internalname, GXutil.rtrim( A737PrdUcpDsc), GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUcpDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUcpDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Unidad de Consumo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCon_Internalname, GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCon_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUniCon_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Unidad Consumo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUcoDsc_Internalname, GXutil.rtrim( A736PrdUcoDsc), GXutil.rtrim( localUtil.format( A736PrdUcoDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUcoDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUcoDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Factor de Conversion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "ProveedorID", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Referencia Proveedor", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRefPrv_Internalname, GXutil.rtrim( A728PrdRefPrv), GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRefPrv_Jsonclick, 0, "", "", "", "", "", 1, edtPrdRefPrv_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Empresa Producto Sustituto", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpCodSus_Internalname, GXutil.rtrim( A394EmpCodSus), GXutil.rtrim( localUtil.format( A394EmpCodSus, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpCodSus_Jsonclick, 0, "", "", "", "", "", 1, edtEmpCodSus_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Producto Sustituto", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSus_Internalname, GXutil.rtrim( A734PrdSus), GXutil.rtrim( localUtil.format( A734PrdSus, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSus_Jsonclick, 0, "", "", "", "", "", 1, edtPrdSus_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "PrdSusNom", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSusNom_Internalname, GXutil.rtrim( A735PrdSusNom), GXutil.rtrim( localUtil.format( A735PrdSusNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSusNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdSusNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Validez", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValCod_Jsonclick, 0, "", "", "", "", "", 1, edtValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Descripcion Validez", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValDsc_Internalname, GXutil.rtrim( A857ValDsc), GXutil.rtrim( localUtil.format( A857ValDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValDsc_Jsonclick, 0, "", "", "", "", "", 1, edtValDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Control en Recuento", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRec_Internalname, GXutil.rtrim( A727PrdRec), GXutil.rtrim( localUtil.format( A727PrdRec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRec_Jsonclick, 0, "", "", "", "", "", 1, edtPrdRec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Calculo Necesidades", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCalNec_Internalname, GXutil.rtrim( A682PrdCalNec), GXutil.rtrim( localUtil.format( A682PrdCalNec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCalNec_Jsonclick, 0, "", "", "", "", "", 1, edtPrdCalNec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Detalle Partidas", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDetPar_Internalname, GXutil.rtrim( A698PrdDetPar), GXutil.rtrim( localUtil.format( A698PrdDetPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDetPar_Jsonclick, 0, "", "", "", "", "", 1, edtPrdDetPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSit_Internalname, GXutil.ltrim( localUtil.ntoc( A730PrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A730PrdSit), "9") : localUtil.format( DecimalUtil.doubleToDec(A730PrdSit), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSit_Jsonclick, 0, "", "", "", "", "", 1, edtPrdSit_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Rotacion Real", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRotRea_Internalname, GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdRotRea_Enabled!=0) ? localUtil.format( A729PrdRotRea, "ZZZZZ9.999") : localUtil.format( A729PrdRotRea, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRotRea_Jsonclick, 0, "", "", "", "", "", 1, edtPrdRotRea_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Tipo Descuento", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipDtoCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Descuento", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoDto_Internalname, GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoDto_Enabled!=0) ? localUtil.format( A837TipDtoDto, "Z9.99") : localUtil.format( A837TipDtoDto, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoDto_Jsonclick, 0, "", "", "", "", "", 1, edtTipDtoDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Precio Actual", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Fecha Ultimo Precio", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFecPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecPre_Internalname, localUtil.format(A709PrdFecPre, "99/99/99"), localUtil.format( A709PrdFecPre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecPre_Jsonclick, 0, "", "", "", "", "", 1, edtPrdFecPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFecPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Precio Anterior", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAnt_Enabled!=0) ? localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999") : localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAnt_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPreAnt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Precio Medio", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreMed_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPreMed_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Unidades Consumo por Dia", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConDia_Internalname, GXutil.ltrim( localUtil.ntoc( A696PrdConDia, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConDia_Enabled!=0) ? localUtil.format( A696PrdConDia, "ZZZ9.99") : localUtil.format( A696PrdConDia, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConDia_Jsonclick, 0, "", "", "", "", "", 1, edtPrdConDia_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Stock Minimo en Dias", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinD_Internalname, GXutil.ltrim( localUtil.ntoc( A731PrdStkMinD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinD_Jsonclick, 0, "", "", "", "", "", 1, edtPrdStkMinD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Unidades Stock Minimo", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinU_Internalname, GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinU_Enabled!=0) ? localUtil.format( A732PrdStkMinU, "ZZZZ9.99") : localUtil.format( A732PrdStkMinU, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinU_Jsonclick, 0, "", "", "", "", "", 1, edtPrdStkMinU_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Dias de Rotacion", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDiaRot_Internalname, GXutil.ltrim( localUtil.ntoc( A699PrdDiaRot, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDiaRot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDiaRot_Jsonclick, 0, "", "", "", "", "", 1, edtPrdDiaRot_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Plazo Entrega Segurid.en Dias", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A722PrdPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPlaEnt_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Codigo Metodo Pedido Producto", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetCod_Internalname, GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Descripcio Metodo Pedido Prod.", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetDsc_Internalname, GXutil.rtrim( A630MetDsc), GXutil.rtrim( localUtil.format( A630MetDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMetDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Lote Minimo", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLotMin_Internalname, GXutil.ltrim( localUtil.ntoc( A716PrdLotMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdLotMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLotMin_Jsonclick, 0, "", "", "", "", "", 1, edtPrdLotMin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Unidades por Contenedor", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumUco_Internalname, GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumUco_Enabled!=0) ? localUtil.format( A721PrdNumUco, "ZZZ9.99") : localUtil.format( A721PrdNumUco, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumUco_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNumUco_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Cantidad Reservada", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Cantidad Pendiente Recibir", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Fecha Ultima Entrada", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulEnt_Internalname, localUtil.format(A713PrdFulEnt, "99/99/99"), localUtil.format( A713PrdFulEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulEnt_Jsonclick, 0, "", "", "", "", "", 1, edtPrdFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Fecha Ultimo Pedido", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFulPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulPed_Internalname, localUtil.format(A714PrdFulPed, "99/99/99"), localUtil.format( A714PrdFulPed, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulPed_Jsonclick, 0, "", "", "", "", "", 1, edtPrdFulPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Fecha Ultima Entrega a C.Color", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFulCC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulCC_Internalname, localUtil.format(A712PrdFulCC, "99/99/99"), localUtil.format( A712PrdFulCC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdFulCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulCC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulCC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Probabilidad existencia en CC", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCCP_Internalname, GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCCP_Enabled!=0) ? localUtil.format( A706PrdExiCCP, "ZZZZ9.99") : localUtil.format( A706PrdExiCCP, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCCP_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiCCP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Ultima Cantidad Entregada a CC", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltECC_Internalname, GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltECC_Enabled!=0) ? localUtil.format( A740PrdUltECC, "ZZZZ9.99") : localUtil.format( A740PrdUltECC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltECC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUltECC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Ultimo No.Contenedores Ent.CC", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltCCC_Internalname, GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltCCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltCCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUltCCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Ultima Diferencia en CC", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltDCC_Internalname, GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltDCC_Enabled!=0) ? localUtil.format( A739PrdUltDCC, "ZZZZ9.99") : localUtil.format( A739PrdUltDCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltDCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUltDCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Diferencia Acumulada en CC", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDifCC_Internalname, GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDifCC_Enabled!=0) ? localUtil.format( A700PrdDifCC, "ZZZZ9.99") : localUtil.format( A700PrdDifCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDifCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdDifCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Contenedores Acumulados en CC", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConCC_Internalname, GXutil.ltrim( localUtil.ntoc( A695PrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A695PrdConCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A695PrdConCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdConCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Valor Almacen", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValStk_Enabled!=0) ? localUtil.format( A750PrdValStk, "ZZZZZZZ9.99") : localUtil.format( A750PrdValStk, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValStk_Jsonclick, 0, "", "", "", "", "", 1, edtPrdValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "orden ascendente valor stock", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDifValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A332DifValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDifValStk_Enabled!=0) ? localUtil.format( A332DifValStk, "ZZZZZZZ9.99") : localUtil.format( A332DifValStk, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDifValStk_Jsonclick, 0, "", "", "", "", "", 1, edtDifValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecEnt_Internalname, localUtil.format(A708PrdFecEnt, "99/99/99"), localUtil.format( A708PrdFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtPrdFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Estante / Pratelera", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosX_Internalname, GXutil.ltrim( localUtil.ntoc( A1193PrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosX_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPosX_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Posición en el Estante/Pratel.", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosY_Internalname, GXutil.ltrim( localUtil.ntoc( A1194PrdPosY, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosY_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosY_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPosY_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Tipo de Producto,Manual,Autom", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTip_Internalname, GXutil.rtrim( A1643PrdTip), GXutil.rtrim( localUtil.format( A1643PrdTip, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTip_Jsonclick, 0, "", "", "", "", "", 1, edtPrdTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Demanda Quimica Oxigeno", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDqo_Internalname, GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDqo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDqo_Jsonclick, 0, "", "", "", "", "", 1, edtPrdDqo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Revision", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRev_Internalname, GXutil.rtrim( A3004PrdRev), GXutil.rtrim( localUtil.format( A3004PrdRev, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRev_Jsonclick, 0, "", "", "", "", "", 1, edtPrdRev_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Tanque", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTnq_Jsonclick, 0, "", "", "", "", "", 1, edtPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Unid.Medida Prod. en Formula", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUMeFo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUMeFo_Jsonclick, 0, "", "", "", "", "", 1, edtPrdUMeFo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Precio Actual_2", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAc2_Enabled!=0) ? localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999") : localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAc2_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPreAc2_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "PrdNumCentra", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumCent_Internalname, GXutil.rtrim( A6191PrdNumCent), GXutil.rtrim( localUtil.format( A6191PrdNumCent, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumCent_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNumCent_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Solubilidad del producto(gr/l)", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSolub_Internalname, GXutil.ltrim( localUtil.ntoc( A5590PrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSolub_Enabled!=0) ? localUtil.format( A5590PrdSolub, "ZZZ9.99") : localUtil.format( A5590PrdSolub, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSolub_Jsonclick, 0, "", "", "", "", "", 1, edtPrdSolub_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Precio de Referencia", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreRef_Internalname, GXutil.ltrim( localUtil.ntoc( A7763PrdPreRef, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreRef_Enabled!=0) ? localUtil.format( A7763PrdPreRef, "ZZZZZZZ9.99999") : localUtil.format( A7763PrdPreRef, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreRef_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPreRef_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Existencias Almacen en Consgin", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlmc_Internalname, GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlmc_Enabled!=0) ? localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999") : localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlmc_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiAlmc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 350,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdAltAct.getInternalname(), GXutil.str( A8895PrdAltAct, 1, 0), "", "", 1, chkPrdAltAct.getEnabled(), "1", httpContext.getMessage( "Alternativo Activo", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(350, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,350);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdPesCon.getInternalname(), GXutil.str( A8896PrdPesCon, 1, 0), "", "", 1, chkPrdPesCon.getEnabled(), "1", httpContext.getMessage( "Controlar", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(354, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,354);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Estación de Pesaje", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPesTerm_Internalname, GXutil.rtrim( A8897PrdPesTerm), GXutil.rtrim( localUtil.format( A8897PrdPesTerm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPesTerm_Jsonclick, 0, "", "", "", "", "", 1, edtPrdPesTerm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Ubicacion", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNCAS_Internalname, GXutil.rtrim( A9734PrdNCAS), GXutil.rtrim( localUtil.format( A9734PrdNCAS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,364);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNCAS_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNCAS_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Prod.Eq. Lab/Producción", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 369,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdEqLP_Internalname, GXutil.rtrim( A3936PrdEqLP), GXutil.rtrim( localUtil.format( A3936PrdEqLP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,369);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdEqLP_Jsonclick, 0, "", "", "", "", "", 1, edtPrdEqLP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Concentración", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 374,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConc_Internalname, GXutil.ltrim( localUtil.ntoc( A3937PrdConc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConc_Enabled!=0) ? localUtil.format( A3937PrdConc, "ZZ9.99") : localUtil.format( A3937PrdConc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,374);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConc_Jsonclick, 0, "", "", "", "", "", 1, edtPrdConc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 377,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 378,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 379,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 380,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPRDGEN.htm");
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
         Z703PrdDscTec = httpContext.cgiGet( "Z703PrdDscTec") ;
         Z707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "Z707PrdFacCon")) ;
         Z728PrdRefPrv = httpContext.cgiGet( "Z728PrdRefPrv") ;
         Z734PrdSus = httpContext.cgiGet( "Z734PrdSus") ;
         Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
         Z682PrdCalNec = httpContext.cgiGet( "Z682PrdCalNec") ;
         Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
         Z730PrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z730PrdSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
         Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
         Z709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
         Z725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
         Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
         Z696PrdConDia = localUtil.ctond( httpContext.cgiGet( "Z696PrdConDia")) ;
         Z731PrdStkMinD = (short)(localUtil.ctol( httpContext.cgiGet( "Z731PrdStkMinD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( "Z732PrdStkMinU")) ;
         Z699PrdDiaRot = (short)(localUtil.ctol( httpContext.cgiGet( "Z699PrdDiaRot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z722PrdPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z722PrdPlaEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z716PrdLotMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z716PrdLotMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z721PrdNumUco = localUtil.ctond( httpContext.cgiGet( "Z721PrdNumUco")) ;
         Z704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "Z704PrdExiAlm")) ;
         Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
         Z685PrdCanRes = localUtil.ctond( httpContext.cgiGet( "Z685PrdCanRes")) ;
         Z684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
         Z713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
         Z714PrdFulPed = localUtil.ctod( httpContext.cgiGet( "Z714PrdFulPed"), 0) ;
         Z712PrdFulCC = localUtil.ctod( httpContext.cgiGet( "Z712PrdFulCC"), 0) ;
         Z706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( "Z706PrdExiCCP")) ;
         Z740PrdUltECC = localUtil.ctond( httpContext.cgiGet( "Z740PrdUltECC")) ;
         Z738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z738PrdUltCCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( "Z739PrdUltDCC")) ;
         Z700PrdDifCC = localUtil.ctond( httpContext.cgiGet( "Z700PrdDifCC")) ;
         Z695PrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z695PrdConCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z750PrdValStk = localUtil.ctond( httpContext.cgiGet( "Z750PrdValStk")) ;
         Z332DifValStk = localUtil.ctond( httpContext.cgiGet( "Z332DifValStk")) ;
         Z708PrdFecEnt = localUtil.ctod( httpContext.cgiGet( "Z708PrdFecEnt"), 0) ;
         Z1193PrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( "Z1193PrdPosX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1194PrdPosY = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1194PrdPosY"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1643PrdTip = httpContext.cgiGet( "Z1643PrdTip") ;
         Z1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( "Z1644PrdDqo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3004PrdRev = httpContext.cgiGet( "Z3004PrdRev") ;
         Z3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3273PrdTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4338PrdUMeFo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
         Z6191PrdNumCent = httpContext.cgiGet( "Z6191PrdNumCent") ;
         Z5590PrdSolub = localUtil.ctond( httpContext.cgiGet( "Z5590PrdSolub")) ;
         Z7763PrdPreRef = localUtil.ctond( httpContext.cgiGet( "Z7763PrdPreRef")) ;
         Z8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( "Z8659PrdExiAlmc")) ;
         Z8895PrdAltAct = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8895PrdAltAct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8896PrdPesCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8896PrdPesCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8897PrdPesTerm = httpContext.cgiGet( "Z8897PrdPesTerm") ;
         Z9734PrdNCAS = httpContext.cgiGet( "Z9734PrdNCAS") ;
         Z3936PrdEqLP = httpContext.cgiGet( "Z3936PrdEqLP") ;
         Z3937PrdConc = localUtil.ctond( httpContext.cgiGet( "Z3937PrdConc")) ;
         Z629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z629MetCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z835TipDtoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z742PrdUniCom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z743PrdUniCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = httpContext.cgiGet( edtPrdDscTec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNICOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUniCom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A742PrdUniCom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         }
         else
         {
            A742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         }
         A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
         n737PrdUcpDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNICON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUniCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A743PrdUniCon = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         }
         else
         {
            A743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         }
         A736PrdUcoDsc = httpContext.cgiGet( edtPrdUcoDsc_Internalname) ;
         n736PrdUcoDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDFACCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFacCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A707PrdFacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         }
         else
         {
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrvNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A795PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
         A394EmpCodSus = GXutil.upper( httpContext.cgiGet( edtEmpCodSus_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A394EmpCodSus", A394EmpCodSus);
         A734PrdSus = httpContext.cgiGet( edtPrdSus_Internalname) ;
         n734PrdSus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
         A735PrdSusNom = httpContext.cgiGet( edtPrdSusNom_Internalname) ;
         n735PrdSusNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", A735PrdSusNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VALCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtValCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A856ValCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         }
         else
         {
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         }
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = httpContext.cgiGet( edtPrdCalNec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = httpContext.cgiGet( edtPrdDetPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdSit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A730PrdSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         }
         else
         {
            A730PrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDROTREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdRotRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A729PrdRotRea = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         }
         else
         {
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDtoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A835TipDtoCod = (byte)(0) ;
            n835TipDtoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         }
         else
         {
            A835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n835TipDtoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         }
         A837TipDtoDto = localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)) ;
         n837TipDtoDto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREACT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreAct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A724PrdPreAct = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         }
         else
         {
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFecPre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFECPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFecPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A709PrdFecPre = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         }
         else
         {
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( edtPrdFecPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreAnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A725PrdPreAnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         else
         {
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREMED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreMed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A726PrdPreMed = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONDIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConDia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A696PrdConDia = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         }
         else
         {
            A696PrdConDia = localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSTKMIND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdStkMinD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A731PrdStkMinD = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         }
         else
         {
            A731PrdStkMinD = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSTKMINU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdStkMinU_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A732PrdStkMinU = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         }
         else
         {
            A732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDIAROT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDiaRot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A699PrdDiaRot = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         }
         else
         {
            A699PrdDiaRot = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPLAENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPlaEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A722PrdPlaEnt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         }
         else
         {
            A722PrdPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A629MetCod = (byte)(0) ;
            n629MetCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         }
         else
         {
            A629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n629MetCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         }
         A630MetDsc = httpContext.cgiGet( edtMetDsc_Internalname) ;
         n630MetDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDLOTMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdLotMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A716PrdLotMin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         }
         else
         {
            A716PrdLotMin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDNUMUCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNumUco_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A721PrdNumUco = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         }
         else
         {
            A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXIALM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiAlm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A704PrdExiAlm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         else
         {
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A705PrdExiCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         else
         {
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANRES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCanRes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A685PrdCanRes = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         }
         else
         {
            A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANPEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCanPen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A684PrdCanPen = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         else
         {
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFulEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFULENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFulEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A713PrdFulEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         }
         else
         {
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFulPed_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFULPED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFulPed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A714PrdFulPed = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         }
         else
         {
            A714PrdFulPed = localUtil.ctod( httpContext.cgiGet( edtPrdFulPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFulCC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFULCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFulCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A712PrdFulCC = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         }
         else
         {
            A712PrdFulCC = localUtil.ctod( httpContext.cgiGet( edtPrdFulCC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICCP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCCP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A706PrdExiCCP = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         }
         else
         {
            A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTECC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltECC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A740PrdUltECC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         }
         else
         {
            A740PrdUltECC = localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTCCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltCCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A738PrdUltCCC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         }
         else
         {
            A738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTDCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltDCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A739PrdUltDCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         }
         else
         {
            A739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDIFCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDifCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A700PrdDifCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         }
         else
         {
            A700PrdDifCC = localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A695PrdConCC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         }
         else
         {
            A695PrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDVALSTK");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdValStk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A750PrdValStk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIFVALSTK");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDifValStk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A332DifValStk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         }
         else
         {
            A332DifValStk = localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A708PrdFecEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         }
         else
         {
            A708PrdFecEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPOSX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPosX_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1193PrdPosX = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         }
         else
         {
            A1193PrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPOSY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPosY_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1194PrdPosY = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         }
         else
         {
            A1194PrdPosY = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         }
         A1643PrdTip = GXutil.upper( httpContext.cgiGet( edtPrdTip_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDQO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDqo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1644PrdDqo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         }
         else
         {
            A1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         }
         A3004PrdRev = GXutil.upper( httpContext.cgiGet( edtPrdRev_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3273PrdTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         }
         else
         {
            A3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUMEFO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUMeFo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4338PrdUMeFo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         }
         else
         {
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREAC2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreAc2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5255PrdPreAc2 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         }
         else
         {
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         }
         A6191PrdNumCent = httpContext.cgiGet( edtPrdNumCent_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSOLUB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdSolub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5590PrdSolub = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         }
         else
         {
            A5590PrdSolub = localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreRef_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreRef_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREREF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreRef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7763PrdPreRef = DecimalUtil.ZERO ;
            n7763PrdPreRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7763PrdPreRef", GXutil.ltrimstr( A7763PrdPreRef, 14, 5));
         }
         else
         {
            A7763PrdPreRef = localUtil.ctond( httpContext.cgiGet( edtPrdPreRef_Internalname)) ;
            n7763PrdPreRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7763PrdPreRef", GXutil.ltrimstr( A7763PrdPreRef, 14, 5));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXIALMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiAlmc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8659PrdExiAlmc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
         else
         {
            A8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdAltAct.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdAltAct.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDALTACT");
            AnyError = (short)(1) ;
            GX_FocusControl = chkPrdAltAct.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8895PrdAltAct = (byte)(0) ;
            n8895PrdAltAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
         }
         else
         {
            A8895PrdAltAct = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrdAltAct.getInternalname()), "1")==0) ? 1 : 0)) ;
            n8895PrdAltAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPESCON");
            AnyError = (short)(1) ;
            GX_FocusControl = chkPrdPesCon.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8896PrdPesCon = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         }
         else
         {
            A8896PrdPesCon = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         }
         A8897PrdPesTerm = httpContext.cgiGet( edtPrdPesTerm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A9734PrdNCAS = httpContext.cgiGet( edtPrdNCAS_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
         A3936PrdEqLP = httpContext.cgiGet( edtPrdEqLP_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3936PrdEqLP", A3936PrdEqLP);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdConc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdConc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3937PrdConc = DecimalUtil.ZERO ;
            n3937PrdConc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3937PrdConc", GXutil.ltrimstr( A3937PrdConc, 6, 2));
         }
         else
         {
            A3937PrdConc = localUtil.ctond( httpContext.cgiGet( edtPrdConc_Internalname)) ;
            n3937PrdConc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3937PrdConc", GXutil.ltrimstr( A3937PrdConc, 6, 2));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
            initAll1X29( ) ;
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
      disableAttributes1X29( ) ;
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

   public void confirm_1X0( )
   {
      beforeValidate1X29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1X29( ) ;
         }
         else
         {
            checkExtendedTable1X29( ) ;
            if ( AnyError == 0 )
            {
               zm1X29( 8) ;
               zm1X29( 9) ;
               zm1X29( 10) ;
               zm1X29( 11) ;
               zm1X29( 12) ;
               zm1X29( 13) ;
               zm1X29( 14) ;
               zm1X29( 15) ;
            }
            closeExtendedTableCursors1X29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1X0( ) ;
      }
   }

   public void resetCaption1X0( )
   {
   }

   public void zm1X29( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T001X3_A718PrdNom[0] ;
            Z703PrdDscTec = T001X3_A703PrdDscTec[0] ;
            Z707PrdFacCon = T001X3_A707PrdFacCon[0] ;
            Z728PrdRefPrv = T001X3_A728PrdRefPrv[0] ;
            Z734PrdSus = T001X3_A734PrdSus[0] ;
            Z727PrdRec = T001X3_A727PrdRec[0] ;
            Z682PrdCalNec = T001X3_A682PrdCalNec[0] ;
            Z698PrdDetPar = T001X3_A698PrdDetPar[0] ;
            Z730PrdSit = T001X3_A730PrdSit[0] ;
            Z729PrdRotRea = T001X3_A729PrdRotRea[0] ;
            Z724PrdPreAct = T001X3_A724PrdPreAct[0] ;
            Z709PrdFecPre = T001X3_A709PrdFecPre[0] ;
            Z725PrdPreAnt = T001X3_A725PrdPreAnt[0] ;
            Z726PrdPreMed = T001X3_A726PrdPreMed[0] ;
            Z696PrdConDia = T001X3_A696PrdConDia[0] ;
            Z731PrdStkMinD = T001X3_A731PrdStkMinD[0] ;
            Z732PrdStkMinU = T001X3_A732PrdStkMinU[0] ;
            Z699PrdDiaRot = T001X3_A699PrdDiaRot[0] ;
            Z722PrdPlaEnt = T001X3_A722PrdPlaEnt[0] ;
            Z716PrdLotMin = T001X3_A716PrdLotMin[0] ;
            Z721PrdNumUco = T001X3_A721PrdNumUco[0] ;
            Z704PrdExiAlm = T001X3_A704PrdExiAlm[0] ;
            Z705PrdExiCC = T001X3_A705PrdExiCC[0] ;
            Z685PrdCanRes = T001X3_A685PrdCanRes[0] ;
            Z684PrdCanPen = T001X3_A684PrdCanPen[0] ;
            Z713PrdFulEnt = T001X3_A713PrdFulEnt[0] ;
            Z714PrdFulPed = T001X3_A714PrdFulPed[0] ;
            Z712PrdFulCC = T001X3_A712PrdFulCC[0] ;
            Z706PrdExiCCP = T001X3_A706PrdExiCCP[0] ;
            Z740PrdUltECC = T001X3_A740PrdUltECC[0] ;
            Z738PrdUltCCC = T001X3_A738PrdUltCCC[0] ;
            Z739PrdUltDCC = T001X3_A739PrdUltDCC[0] ;
            Z700PrdDifCC = T001X3_A700PrdDifCC[0] ;
            Z695PrdConCC = T001X3_A695PrdConCC[0] ;
            Z750PrdValStk = T001X3_A750PrdValStk[0] ;
            Z332DifValStk = T001X3_A332DifValStk[0] ;
            Z708PrdFecEnt = T001X3_A708PrdFecEnt[0] ;
            Z1193PrdPosX = T001X3_A1193PrdPosX[0] ;
            Z1194PrdPosY = T001X3_A1194PrdPosY[0] ;
            Z1643PrdTip = T001X3_A1643PrdTip[0] ;
            Z1644PrdDqo = T001X3_A1644PrdDqo[0] ;
            Z3004PrdRev = T001X3_A3004PrdRev[0] ;
            Z3273PrdTnq = T001X3_A3273PrdTnq[0] ;
            Z4338PrdUMeFo = T001X3_A4338PrdUMeFo[0] ;
            Z5255PrdPreAc2 = T001X3_A5255PrdPreAc2[0] ;
            Z6191PrdNumCent = T001X3_A6191PrdNumCent[0] ;
            Z5590PrdSolub = T001X3_A5590PrdSolub[0] ;
            Z7763PrdPreRef = T001X3_A7763PrdPreRef[0] ;
            Z8659PrdExiAlmc = T001X3_A8659PrdExiAlmc[0] ;
            Z8895PrdAltAct = T001X3_A8895PrdAltAct[0] ;
            Z8896PrdPesCon = T001X3_A8896PrdPesCon[0] ;
            Z8897PrdPesTerm = T001X3_A8897PrdPesTerm[0] ;
            Z9734PrdNCAS = T001X3_A9734PrdNCAS[0] ;
            Z3936PrdEqLP = T001X3_A3936PrdEqLP[0] ;
            Z3937PrdConc = T001X3_A3937PrdConc[0] ;
            Z629MetCod = T001X3_A629MetCod[0] ;
            Z795PrvNum = T001X3_A795PrvNum[0] ;
            Z835TipDtoCod = T001X3_A835TipDtoCod[0] ;
            Z742PrdUniCom = T001X3_A742PrdUniCom[0] ;
            Z743PrdUniCon = T001X3_A743PrdUniCon[0] ;
            Z856ValCod = T001X3_A856ValCod[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
            Z703PrdDscTec = A703PrdDscTec ;
            Z707PrdFacCon = A707PrdFacCon ;
            Z728PrdRefPrv = A728PrdRefPrv ;
            Z734PrdSus = A734PrdSus ;
            Z727PrdRec = A727PrdRec ;
            Z682PrdCalNec = A682PrdCalNec ;
            Z698PrdDetPar = A698PrdDetPar ;
            Z730PrdSit = A730PrdSit ;
            Z729PrdRotRea = A729PrdRotRea ;
            Z724PrdPreAct = A724PrdPreAct ;
            Z709PrdFecPre = A709PrdFecPre ;
            Z725PrdPreAnt = A725PrdPreAnt ;
            Z726PrdPreMed = A726PrdPreMed ;
            Z696PrdConDia = A696PrdConDia ;
            Z731PrdStkMinD = A731PrdStkMinD ;
            Z732PrdStkMinU = A732PrdStkMinU ;
            Z699PrdDiaRot = A699PrdDiaRot ;
            Z722PrdPlaEnt = A722PrdPlaEnt ;
            Z716PrdLotMin = A716PrdLotMin ;
            Z721PrdNumUco = A721PrdNumUco ;
            Z704PrdExiAlm = A704PrdExiAlm ;
            Z705PrdExiCC = A705PrdExiCC ;
            Z685PrdCanRes = A685PrdCanRes ;
            Z684PrdCanPen = A684PrdCanPen ;
            Z713PrdFulEnt = A713PrdFulEnt ;
            Z714PrdFulPed = A714PrdFulPed ;
            Z712PrdFulCC = A712PrdFulCC ;
            Z706PrdExiCCP = A706PrdExiCCP ;
            Z740PrdUltECC = A740PrdUltECC ;
            Z738PrdUltCCC = A738PrdUltCCC ;
            Z739PrdUltDCC = A739PrdUltDCC ;
            Z700PrdDifCC = A700PrdDifCC ;
            Z695PrdConCC = A695PrdConCC ;
            Z750PrdValStk = A750PrdValStk ;
            Z332DifValStk = A332DifValStk ;
            Z708PrdFecEnt = A708PrdFecEnt ;
            Z1193PrdPosX = A1193PrdPosX ;
            Z1194PrdPosY = A1194PrdPosY ;
            Z1643PrdTip = A1643PrdTip ;
            Z1644PrdDqo = A1644PrdDqo ;
            Z3004PrdRev = A3004PrdRev ;
            Z3273PrdTnq = A3273PrdTnq ;
            Z4338PrdUMeFo = A4338PrdUMeFo ;
            Z5255PrdPreAc2 = A5255PrdPreAc2 ;
            Z6191PrdNumCent = A6191PrdNumCent ;
            Z5590PrdSolub = A5590PrdSolub ;
            Z7763PrdPreRef = A7763PrdPreRef ;
            Z8659PrdExiAlmc = A8659PrdExiAlmc ;
            Z8895PrdAltAct = A8895PrdAltAct ;
            Z8896PrdPesCon = A8896PrdPesCon ;
            Z8897PrdPesTerm = A8897PrdPesTerm ;
            Z9734PrdNCAS = A9734PrdNCAS ;
            Z3936PrdEqLP = A3936PrdEqLP ;
            Z3937PrdConc = A3937PrdConc ;
            Z629MetCod = A629MetCod ;
            Z795PrvNum = A795PrvNum ;
            Z835TipDtoCod = A835TipDtoCod ;
            Z742PrdUniCom = A742PrdUniCom ;
            Z743PrdUniCon = A743PrdUniCon ;
            Z856ValCod = A856ValCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z703PrdDscTec = A703PrdDscTec ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z728PrdRefPrv = A728PrdRefPrv ;
         Z734PrdSus = A734PrdSus ;
         Z727PrdRec = A727PrdRec ;
         Z682PrdCalNec = A682PrdCalNec ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z730PrdSit = A730PrdSit ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z696PrdConDia = A696PrdConDia ;
         Z731PrdStkMinD = A731PrdStkMinD ;
         Z732PrdStkMinU = A732PrdStkMinU ;
         Z699PrdDiaRot = A699PrdDiaRot ;
         Z722PrdPlaEnt = A722PrdPlaEnt ;
         Z716PrdLotMin = A716PrdLotMin ;
         Z721PrdNumUco = A721PrdNumUco ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z714PrdFulPed = A714PrdFulPed ;
         Z712PrdFulCC = A712PrdFulCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z740PrdUltECC = A740PrdUltECC ;
         Z738PrdUltCCC = A738PrdUltCCC ;
         Z739PrdUltDCC = A739PrdUltDCC ;
         Z700PrdDifCC = A700PrdDifCC ;
         Z695PrdConCC = A695PrdConCC ;
         Z750PrdValStk = A750PrdValStk ;
         Z332DifValStk = A332DifValStk ;
         Z708PrdFecEnt = A708PrdFecEnt ;
         Z1193PrdPosX = A1193PrdPosX ;
         Z1194PrdPosY = A1194PrdPosY ;
         Z1643PrdTip = A1643PrdTip ;
         Z1644PrdDqo = A1644PrdDqo ;
         Z3004PrdRev = A3004PrdRev ;
         Z3273PrdTnq = A3273PrdTnq ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z5255PrdPreAc2 = A5255PrdPreAc2 ;
         Z6191PrdNumCent = A6191PrdNumCent ;
         Z5590PrdSolub = A5590PrdSolub ;
         Z7763PrdPreRef = A7763PrdPreRef ;
         Z8659PrdExiAlmc = A8659PrdExiAlmc ;
         Z8895PrdAltAct = A8895PrdAltAct ;
         Z8896PrdPesCon = A8896PrdPesCon ;
         Z8897PrdPesTerm = A8897PrdPesTerm ;
         Z9734PrdNCAS = A9734PrdNCAS ;
         Z3936PrdEqLP = A3936PrdEqLP ;
         Z3937PrdConc = A3937PrdConc ;
         Z396EmprCod = A396EmprCod ;
         Z629MetCod = A629MetCod ;
         Z795PrvNum = A795PrvNum ;
         Z835TipDtoCod = A835TipDtoCod ;
         Z742PrdUniCom = A742PrdUniCom ;
         Z743PrdUniCon = A743PrdUniCon ;
         Z856ValCod = A856ValCod ;
         Z407EmprNom = A407EmprNom ;
         Z737PrdUcpDsc = A737PrdUcpDsc ;
         Z736PrdUcoDsc = A736PrdUcoDsc ;
         Z794PrvNom = A794PrvNom ;
         Z857ValDsc = A857ValDsc ;
         Z837TipDtoDto = A837TipDtoDto ;
         Z630MetDsc = A630MetDsc ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load1X29( )
   {
      /* Using cursor T001X12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T001X12_A407EmprNom[0] ;
         n407EmprNom = T001X12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T001X12_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = T001X12_A703PrdDscTec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
         A737PrdUcpDsc = T001X12_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = T001X12_n737PrdUcpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
         A736PrdUcoDsc = T001X12_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = T001X12_n736PrdUcoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
         A707PrdFacCon = T001X12_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A794PrvNom = T001X12_A794PrvNom[0] ;
         n794PrvNom = T001X12_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A728PrdRefPrv = T001X12_A728PrdRefPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
         A734PrdSus = T001X12_A734PrdSus[0] ;
         n734PrdSus = T001X12_n734PrdSus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
         A857ValDsc = T001X12_A857ValDsc[0] ;
         n857ValDsc = T001X12_n857ValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         A727PrdRec = T001X12_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = T001X12_A682PrdCalNec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = T001X12_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A730PrdSit = T001X12_A730PrdSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         A729PrdRotRea = T001X12_A729PrdRotRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A837TipDtoDto = T001X12_A837TipDtoDto[0] ;
         n837TipDtoDto = T001X12_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         A724PrdPreAct = T001X12_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A709PrdFecPre = T001X12_A709PrdFecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = T001X12_A725PrdPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A726PrdPreMed = T001X12_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A696PrdConDia = T001X12_A696PrdConDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         A731PrdStkMinD = T001X12_A731PrdStkMinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         A732PrdStkMinU = T001X12_A732PrdStkMinU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         A699PrdDiaRot = T001X12_A699PrdDiaRot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         A722PrdPlaEnt = T001X12_A722PrdPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         A630MetDsc = T001X12_A630MetDsc[0] ;
         n630MetDsc = T001X12_n630MetDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
         A716PrdLotMin = T001X12_A716PrdLotMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         A721PrdNumUco = T001X12_A721PrdNumUco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A704PrdExiAlm = T001X12_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T001X12_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = T001X12_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A684PrdCanPen = T001X12_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A713PrdFulEnt = T001X12_A713PrdFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A714PrdFulPed = T001X12_A714PrdFulPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         A712PrdFulCC = T001X12_A712PrdFulCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         A706PrdExiCCP = T001X12_A706PrdExiCCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A740PrdUltECC = T001X12_A740PrdUltECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = T001X12_A738PrdUltCCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A739PrdUltDCC = T001X12_A739PrdUltDCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A700PrdDifCC = T001X12_A700PrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A695PrdConCC = T001X12_A695PrdConCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         A750PrdValStk = T001X12_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A332DifValStk = T001X12_A332DifValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         A708PrdFecEnt = T001X12_A708PrdFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         A1193PrdPosX = T001X12_A1193PrdPosX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         A1194PrdPosY = T001X12_A1194PrdPosY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         A1643PrdTip = T001X12_A1643PrdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
         A1644PrdDqo = T001X12_A1644PrdDqo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         A3004PrdRev = T001X12_A3004PrdRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
         A3273PrdTnq = T001X12_A3273PrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         A4338PrdUMeFo = T001X12_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A5255PrdPreAc2 = T001X12_A5255PrdPreAc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         A6191PrdNumCent = T001X12_A6191PrdNumCent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
         A5590PrdSolub = T001X12_A5590PrdSolub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         A7763PrdPreRef = T001X12_A7763PrdPreRef[0] ;
         n7763PrdPreRef = T001X12_n7763PrdPreRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7763PrdPreRef", GXutil.ltrimstr( A7763PrdPreRef, 14, 5));
         A8659PrdExiAlmc = T001X12_A8659PrdExiAlmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A8895PrdAltAct = T001X12_A8895PrdAltAct[0] ;
         n8895PrdAltAct = T001X12_n8895PrdAltAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
         A8896PrdPesCon = T001X12_A8896PrdPesCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         A8897PrdPesTerm = T001X12_A8897PrdPesTerm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A9734PrdNCAS = T001X12_A9734PrdNCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
         A3936PrdEqLP = T001X12_A3936PrdEqLP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3936PrdEqLP", A3936PrdEqLP);
         A3937PrdConc = T001X12_A3937PrdConc[0] ;
         n3937PrdConc = T001X12_n3937PrdConc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3937PrdConc", GXutil.ltrimstr( A3937PrdConc, 6, 2));
         A629MetCod = T001X12_A629MetCod[0] ;
         n629MetCod = T001X12_n629MetCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         A795PrvNum = T001X12_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A835TipDtoCod = T001X12_A835TipDtoCod[0] ;
         n835TipDtoCod = T001X12_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         A742PrdUniCom = T001X12_A742PrdUniCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         A743PrdUniCon = T001X12_A743PrdUniCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         A856ValCod = T001X12_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         zm1X29( -7) ;
      }
      pr_default.close(10);
      onLoadActions1X29( ) ;
   }

   public void onLoadActions1X29( )
   {
   }

   public void checkExtendedTable1X29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T001X4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001X4_A407EmprNom[0] ;
      n407EmprNom = T001X4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T001X5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A630MetDsc = T001X5_A630MetDsc[0] ;
      n630MetDsc = T001X5_n630MetDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
      pr_default.close(3);
      /* Using cursor T001X6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T001X6_A794PrvNom[0] ;
      n794PrvNom = T001X6_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(4);
      /* Using cursor T001X7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A837TipDtoDto = T001X7_A837TipDtoDto[0] ;
      n837TipDtoDto = T001X7_n837TipDtoDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      pr_default.close(5);
      /* Using cursor T001X8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A737PrdUcpDsc = T001X8_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T001X8_n737PrdUcpDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
      pr_default.close(6);
      /* Using cursor T001X9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A736PrdUcoDsc = T001X9_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = T001X9_n736PrdUcoDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
      pr_default.close(7);
      /* Using cursor T001X10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A857ValDsc = T001X10_A857ValDsc[0] ;
      n857ValDsc = T001X10_n857ValDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      pr_default.close(8);
      if ( ! ( ( GXutil.strcmp(A727PrdRec, "S") == 0 ) || ( GXutil.strcmp(A727PrdRec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control en Recuento", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDREC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdRec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A682PrdCalNec, "S") == 0 ) || ( GXutil.strcmp(A682PrdCalNec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Calculo Necesidades", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDCALNEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdCalNec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A698PrdDetPar, "S") == 0 ) || ( GXutil.strcmp(A698PrdDetPar, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Detalle Partidas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDDETPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDetPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A1643PrdTip, "A") == 0 ) || ( GXutil.strcmp(A1643PrdTip, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo de Producto,Manual,Autom", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3004PrdRev, "S") == 0 ) || ( GXutil.strcmp(A3004PrdRev, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Revision", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDREV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdRev_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1X29( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod )
   {
      /* Using cursor T001X13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001X13_A407EmprNom[0] ;
      n407EmprNom = T001X13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_9( String A396EmprCod ,
                         byte A629MetCod )
   {
      /* Using cursor T001X14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A630MetDsc = T001X14_A630MetDsc[0] ;
      n630MetDsc = T001X14_n630MetDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A630MetDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_10( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T001X15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T001X15_A794PrvNom[0] ;
      n794PrvNom = T001X15_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_11( String A396EmprCod ,
                          byte A835TipDtoCod )
   {
      /* Using cursor T001X16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A837TipDtoDto = T001X16_A837TipDtoDto[0] ;
      n837TipDtoDto = T001X16_n837TipDtoDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_12( String A396EmprCod ,
                          byte A742PrdUniCom )
   {
      /* Using cursor T001X17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A737PrdUcpDsc = T001X17_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T001X17_n737PrdUcpDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A737PrdUcpDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_13( String A396EmprCod ,
                          byte A743PrdUniCon )
   {
      /* Using cursor T001X18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A736PrdUcoDsc = T001X18_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = T001X18_n736PrdUcoDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A736PrdUcoDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_14( String A396EmprCod ,
                          byte A856ValCod )
   {
      /* Using cursor T001X19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A857ValDsc = T001X19_A857ValDsc[0] ;
      n857ValDsc = T001X19_n857ValDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A857ValDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1X29( )
   {
      /* Using cursor T001X20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1X29( 7) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T001X3_A719PrdNum[0] ;
         n719PrdNum = T001X3_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T001X3_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = T001X3_A703PrdDscTec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
         A707PrdFacCon = T001X3_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A728PrdRefPrv = T001X3_A728PrdRefPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
         A734PrdSus = T001X3_A734PrdSus[0] ;
         n734PrdSus = T001X3_n734PrdSus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
         A727PrdRec = T001X3_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = T001X3_A682PrdCalNec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = T001X3_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A730PrdSit = T001X3_A730PrdSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         A729PrdRotRea = T001X3_A729PrdRotRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A724PrdPreAct = T001X3_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A709PrdFecPre = T001X3_A709PrdFecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = T001X3_A725PrdPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A726PrdPreMed = T001X3_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A696PrdConDia = T001X3_A696PrdConDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         A731PrdStkMinD = T001X3_A731PrdStkMinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         A732PrdStkMinU = T001X3_A732PrdStkMinU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         A699PrdDiaRot = T001X3_A699PrdDiaRot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         A722PrdPlaEnt = T001X3_A722PrdPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         A716PrdLotMin = T001X3_A716PrdLotMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         A721PrdNumUco = T001X3_A721PrdNumUco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A704PrdExiAlm = T001X3_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T001X3_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = T001X3_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A684PrdCanPen = T001X3_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A713PrdFulEnt = T001X3_A713PrdFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A714PrdFulPed = T001X3_A714PrdFulPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         A712PrdFulCC = T001X3_A712PrdFulCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         A706PrdExiCCP = T001X3_A706PrdExiCCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A740PrdUltECC = T001X3_A740PrdUltECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = T001X3_A738PrdUltCCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A739PrdUltDCC = T001X3_A739PrdUltDCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A700PrdDifCC = T001X3_A700PrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A695PrdConCC = T001X3_A695PrdConCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         A750PrdValStk = T001X3_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A332DifValStk = T001X3_A332DifValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         A708PrdFecEnt = T001X3_A708PrdFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         A1193PrdPosX = T001X3_A1193PrdPosX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         A1194PrdPosY = T001X3_A1194PrdPosY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         A1643PrdTip = T001X3_A1643PrdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
         A1644PrdDqo = T001X3_A1644PrdDqo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         A3004PrdRev = T001X3_A3004PrdRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
         A3273PrdTnq = T001X3_A3273PrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         A4338PrdUMeFo = T001X3_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A5255PrdPreAc2 = T001X3_A5255PrdPreAc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         A6191PrdNumCent = T001X3_A6191PrdNumCent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
         A5590PrdSolub = T001X3_A5590PrdSolub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         A7763PrdPreRef = T001X3_A7763PrdPreRef[0] ;
         n7763PrdPreRef = T001X3_n7763PrdPreRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7763PrdPreRef", GXutil.ltrimstr( A7763PrdPreRef, 14, 5));
         A8659PrdExiAlmc = T001X3_A8659PrdExiAlmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A8895PrdAltAct = T001X3_A8895PrdAltAct[0] ;
         n8895PrdAltAct = T001X3_n8895PrdAltAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
         A8896PrdPesCon = T001X3_A8896PrdPesCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         A8897PrdPesTerm = T001X3_A8897PrdPesTerm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A9734PrdNCAS = T001X3_A9734PrdNCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
         A3936PrdEqLP = T001X3_A3936PrdEqLP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3936PrdEqLP", A3936PrdEqLP);
         A3937PrdConc = T001X3_A3937PrdConc[0] ;
         n3937PrdConc = T001X3_n3937PrdConc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3937PrdConc", GXutil.ltrimstr( A3937PrdConc, 6, 2));
         A396EmprCod = T001X3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A629MetCod = T001X3_A629MetCod[0] ;
         n629MetCod = T001X3_n629MetCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         A795PrvNum = T001X3_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A835TipDtoCod = T001X3_A835TipDtoCod[0] ;
         n835TipDtoCod = T001X3_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         A742PrdUniCom = T001X3_A742PrdUniCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         A743PrdUniCon = T001X3_A743PrdUniCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         A856ValCod = T001X3_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1X29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1X29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1X29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1X29( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T001X21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T001X21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001X21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001X21_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T001X21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001X21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001X21_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T001X21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T001X21_A719PrdNum[0] ;
            n719PrdNum = T001X21_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T001X22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T001X22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001X22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001X22_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T001X22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001X22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001X22_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T001X22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T001X22_A719PrdNum[0] ;
            n719PrdNum = T001X22_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1X29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1X29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1X29( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1X29( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1X29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1X29( ) ;
      if ( RcdFound29 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = Z719PrdNum ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tprdgen");
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1X0( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1X29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1X29( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      scanStart1X29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext1X29( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1X29( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1X29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z718PrdNom, T001X2_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z703PrdDscTec, T001X2_A703PrdDscTec[0]) != 0 ) || ( DecimalUtil.compareTo(Z707PrdFacCon, T001X2_A707PrdFacCon[0]) != 0 ) || ( GXutil.strcmp(Z728PrdRefPrv, T001X2_A728PrdRefPrv[0]) != 0 ) || ( GXutil.strcmp(Z734PrdSus, T001X2_A734PrdSus[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z727PrdRec, T001X2_A727PrdRec[0]) != 0 ) || ( GXutil.strcmp(Z682PrdCalNec, T001X2_A682PrdCalNec[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, T001X2_A698PrdDetPar[0]) != 0 ) || ( Z730PrdSit != T001X2_A730PrdSit[0] ) || ( DecimalUtil.compareTo(Z729PrdRotRea, T001X2_A729PrdRotRea[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z724PrdPreAct, T001X2_A724PrdPreAct[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T001X2_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, T001X2_A725PrdPreAnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z726PrdPreMed, T001X2_A726PrdPreMed[0]) != 0 ) || ( DecimalUtil.compareTo(Z696PrdConDia, T001X2_A696PrdConDia[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z731PrdStkMinD != T001X2_A731PrdStkMinD[0] ) || ( DecimalUtil.compareTo(Z732PrdStkMinU, T001X2_A732PrdStkMinU[0]) != 0 ) || ( Z699PrdDiaRot != T001X2_A699PrdDiaRot[0] ) || ( Z722PrdPlaEnt != T001X2_A722PrdPlaEnt[0] ) || ( Z716PrdLotMin != T001X2_A716PrdLotMin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z721PrdNumUco, T001X2_A721PrdNumUco[0]) != 0 ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, T001X2_A704PrdExiAlm[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T001X2_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z685PrdCanRes, T001X2_A685PrdCanRes[0]) != 0 ) || ( DecimalUtil.compareTo(Z684PrdCanPen, T001X2_A684PrdCanPen[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T001X2_A713PrdFulEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z714PrdFulPed), GXutil.resetTime(T001X2_A714PrdFulPed[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z712PrdFulCC), GXutil.resetTime(T001X2_A712PrdFulCC[0])) ) || ( DecimalUtil.compareTo(Z706PrdExiCCP, T001X2_A706PrdExiCCP[0]) != 0 ) || ( DecimalUtil.compareTo(Z740PrdUltECC, T001X2_A740PrdUltECC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z738PrdUltCCC != T001X2_A738PrdUltCCC[0] ) || ( DecimalUtil.compareTo(Z739PrdUltDCC, T001X2_A739PrdUltDCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z700PrdDifCC, T001X2_A700PrdDifCC[0]) != 0 ) || ( Z695PrdConCC != T001X2_A695PrdConCC[0] ) || ( DecimalUtil.compareTo(Z750PrdValStk, T001X2_A750PrdValStk[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z332DifValStk, T001X2_A332DifValStk[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z708PrdFecEnt), GXutil.resetTime(T001X2_A708PrdFecEnt[0])) ) || ( Z1193PrdPosX != T001X2_A1193PrdPosX[0] ) || ( Z1194PrdPosY != T001X2_A1194PrdPosY[0] ) || ( GXutil.strcmp(Z1643PrdTip, T001X2_A1643PrdTip[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1644PrdDqo != T001X2_A1644PrdDqo[0] ) || ( GXutil.strcmp(Z3004PrdRev, T001X2_A3004PrdRev[0]) != 0 ) || ( Z3273PrdTnq != T001X2_A3273PrdTnq[0] ) || ( Z4338PrdUMeFo != T001X2_A4338PrdUMeFo[0] ) || ( DecimalUtil.compareTo(Z5255PrdPreAc2, T001X2_A5255PrdPreAc2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6191PrdNumCent, T001X2_A6191PrdNumCent[0]) != 0 ) || ( DecimalUtil.compareTo(Z5590PrdSolub, T001X2_A5590PrdSolub[0]) != 0 ) || ( DecimalUtil.compareTo(Z7763PrdPreRef, T001X2_A7763PrdPreRef[0]) != 0 ) || ( DecimalUtil.compareTo(Z8659PrdExiAlmc, T001X2_A8659PrdExiAlmc[0]) != 0 ) || ( Z8895PrdAltAct != T001X2_A8895PrdAltAct[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8896PrdPesCon != T001X2_A8896PrdPesCon[0] ) || ( GXutil.strcmp(Z8897PrdPesTerm, T001X2_A8897PrdPesTerm[0]) != 0 ) || ( GXutil.strcmp(Z9734PrdNCAS, T001X2_A9734PrdNCAS[0]) != 0 ) || ( GXutil.strcmp(Z3936PrdEqLP, T001X2_A3936PrdEqLP[0]) != 0 ) || ( DecimalUtil.compareTo(Z3937PrdConc, T001X2_A3937PrdConc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z629MetCod != T001X2_A629MetCod[0] ) || ( Z795PrvNum != T001X2_A795PrvNum[0] ) || ( Z835TipDtoCod != T001X2_A835TipDtoCod[0] ) || ( Z742PrdUniCom != T001X2_A742PrdUniCom[0] ) || ( Z743PrdUniCon != T001X2_A743PrdUniCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z856ValCod != T001X2_A856ValCod[0] ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T001X2_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T001X2_A718PrdNom[0]);
            }
            if ( GXutil.strcmp(Z703PrdDscTec, T001X2_A703PrdDscTec[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdDscTec");
               GXutil.writeLogRaw("Old: ",Z703PrdDscTec);
               GXutil.writeLogRaw("Current: ",T001X2_A703PrdDscTec[0]);
            }
            if ( DecimalUtil.compareTo(Z707PrdFacCon, T001X2_A707PrdFacCon[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdFacCon");
               GXutil.writeLogRaw("Old: ",Z707PrdFacCon);
               GXutil.writeLogRaw("Current: ",T001X2_A707PrdFacCon[0]);
            }
            if ( GXutil.strcmp(Z728PrdRefPrv, T001X2_A728PrdRefPrv[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdRefPrv");
               GXutil.writeLogRaw("Old: ",Z728PrdRefPrv);
               GXutil.writeLogRaw("Current: ",T001X2_A728PrdRefPrv[0]);
            }
            if ( GXutil.strcmp(Z734PrdSus, T001X2_A734PrdSus[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdSus");
               GXutil.writeLogRaw("Old: ",Z734PrdSus);
               GXutil.writeLogRaw("Current: ",T001X2_A734PrdSus[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T001X2_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T001X2_A727PrdRec[0]);
            }
            if ( GXutil.strcmp(Z682PrdCalNec, T001X2_A682PrdCalNec[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdCalNec");
               GXutil.writeLogRaw("Old: ",Z682PrdCalNec);
               GXutil.writeLogRaw("Current: ",T001X2_A682PrdCalNec[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T001X2_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T001X2_A698PrdDetPar[0]);
            }
            if ( Z730PrdSit != T001X2_A730PrdSit[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdSit");
               GXutil.writeLogRaw("Old: ",Z730PrdSit);
               GXutil.writeLogRaw("Current: ",T001X2_A730PrdSit[0]);
            }
            if ( DecimalUtil.compareTo(Z729PrdRotRea, T001X2_A729PrdRotRea[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdRotRea");
               GXutil.writeLogRaw("Old: ",Z729PrdRotRea);
               GXutil.writeLogRaw("Current: ",T001X2_A729PrdRotRea[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T001X2_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T001X2_A724PrdPreAct[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T001X2_A709PrdFecPre[0])) ) )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdFecPre");
               GXutil.writeLogRaw("Old: ",Z709PrdFecPre);
               GXutil.writeLogRaw("Current: ",T001X2_A709PrdFecPre[0]);
            }
            if ( DecimalUtil.compareTo(Z725PrdPreAnt, T001X2_A725PrdPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPreAnt");
               GXutil.writeLogRaw("Old: ",Z725PrdPreAnt);
               GXutil.writeLogRaw("Current: ",T001X2_A725PrdPreAnt[0]);
            }
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T001X2_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T001X2_A726PrdPreMed[0]);
            }
            if ( DecimalUtil.compareTo(Z696PrdConDia, T001X2_A696PrdConDia[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdConDia");
               GXutil.writeLogRaw("Old: ",Z696PrdConDia);
               GXutil.writeLogRaw("Current: ",T001X2_A696PrdConDia[0]);
            }
            if ( Z731PrdStkMinD != T001X2_A731PrdStkMinD[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdStkMinD");
               GXutil.writeLogRaw("Old: ",Z731PrdStkMinD);
               GXutil.writeLogRaw("Current: ",T001X2_A731PrdStkMinD[0]);
            }
            if ( DecimalUtil.compareTo(Z732PrdStkMinU, T001X2_A732PrdStkMinU[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdStkMinU");
               GXutil.writeLogRaw("Old: ",Z732PrdStkMinU);
               GXutil.writeLogRaw("Current: ",T001X2_A732PrdStkMinU[0]);
            }
            if ( Z699PrdDiaRot != T001X2_A699PrdDiaRot[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdDiaRot");
               GXutil.writeLogRaw("Old: ",Z699PrdDiaRot);
               GXutil.writeLogRaw("Current: ",T001X2_A699PrdDiaRot[0]);
            }
            if ( Z722PrdPlaEnt != T001X2_A722PrdPlaEnt[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPlaEnt");
               GXutil.writeLogRaw("Old: ",Z722PrdPlaEnt);
               GXutil.writeLogRaw("Current: ",T001X2_A722PrdPlaEnt[0]);
            }
            if ( Z716PrdLotMin != T001X2_A716PrdLotMin[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdLotMin");
               GXutil.writeLogRaw("Old: ",Z716PrdLotMin);
               GXutil.writeLogRaw("Current: ",T001X2_A716PrdLotMin[0]);
            }
            if ( DecimalUtil.compareTo(Z721PrdNumUco, T001X2_A721PrdNumUco[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdNumUco");
               GXutil.writeLogRaw("Old: ",Z721PrdNumUco);
               GXutil.writeLogRaw("Current: ",T001X2_A721PrdNumUco[0]);
            }
            if ( DecimalUtil.compareTo(Z704PrdExiAlm, T001X2_A704PrdExiAlm[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdExiAlm");
               GXutil.writeLogRaw("Old: ",Z704PrdExiAlm);
               GXutil.writeLogRaw("Current: ",T001X2_A704PrdExiAlm[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T001X2_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T001X2_A705PrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z685PrdCanRes, T001X2_A685PrdCanRes[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdCanRes");
               GXutil.writeLogRaw("Old: ",Z685PrdCanRes);
               GXutil.writeLogRaw("Current: ",T001X2_A685PrdCanRes[0]);
            }
            if ( DecimalUtil.compareTo(Z684PrdCanPen, T001X2_A684PrdCanPen[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdCanPen");
               GXutil.writeLogRaw("Old: ",Z684PrdCanPen);
               GXutil.writeLogRaw("Current: ",T001X2_A684PrdCanPen[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T001X2_A713PrdFulEnt[0])) ) )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdFulEnt");
               GXutil.writeLogRaw("Old: ",Z713PrdFulEnt);
               GXutil.writeLogRaw("Current: ",T001X2_A713PrdFulEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z714PrdFulPed), GXutil.resetTime(T001X2_A714PrdFulPed[0])) ) )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdFulPed");
               GXutil.writeLogRaw("Old: ",Z714PrdFulPed);
               GXutil.writeLogRaw("Current: ",T001X2_A714PrdFulPed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z712PrdFulCC), GXutil.resetTime(T001X2_A712PrdFulCC[0])) ) )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdFulCC");
               GXutil.writeLogRaw("Old: ",Z712PrdFulCC);
               GXutil.writeLogRaw("Current: ",T001X2_A712PrdFulCC[0]);
            }
            if ( DecimalUtil.compareTo(Z706PrdExiCCP, T001X2_A706PrdExiCCP[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdExiCCP");
               GXutil.writeLogRaw("Old: ",Z706PrdExiCCP);
               GXutil.writeLogRaw("Current: ",T001X2_A706PrdExiCCP[0]);
            }
            if ( DecimalUtil.compareTo(Z740PrdUltECC, T001X2_A740PrdUltECC[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdUltECC");
               GXutil.writeLogRaw("Old: ",Z740PrdUltECC);
               GXutil.writeLogRaw("Current: ",T001X2_A740PrdUltECC[0]);
            }
            if ( Z738PrdUltCCC != T001X2_A738PrdUltCCC[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdUltCCC");
               GXutil.writeLogRaw("Old: ",Z738PrdUltCCC);
               GXutil.writeLogRaw("Current: ",T001X2_A738PrdUltCCC[0]);
            }
            if ( DecimalUtil.compareTo(Z739PrdUltDCC, T001X2_A739PrdUltDCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdUltDCC");
               GXutil.writeLogRaw("Old: ",Z739PrdUltDCC);
               GXutil.writeLogRaw("Current: ",T001X2_A739PrdUltDCC[0]);
            }
            if ( DecimalUtil.compareTo(Z700PrdDifCC, T001X2_A700PrdDifCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdDifCC");
               GXutil.writeLogRaw("Old: ",Z700PrdDifCC);
               GXutil.writeLogRaw("Current: ",T001X2_A700PrdDifCC[0]);
            }
            if ( Z695PrdConCC != T001X2_A695PrdConCC[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdConCC");
               GXutil.writeLogRaw("Old: ",Z695PrdConCC);
               GXutil.writeLogRaw("Current: ",T001X2_A695PrdConCC[0]);
            }
            if ( DecimalUtil.compareTo(Z750PrdValStk, T001X2_A750PrdValStk[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdValStk");
               GXutil.writeLogRaw("Old: ",Z750PrdValStk);
               GXutil.writeLogRaw("Current: ",T001X2_A750PrdValStk[0]);
            }
            if ( DecimalUtil.compareTo(Z332DifValStk, T001X2_A332DifValStk[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"DifValStk");
               GXutil.writeLogRaw("Old: ",Z332DifValStk);
               GXutil.writeLogRaw("Current: ",T001X2_A332DifValStk[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z708PrdFecEnt), GXutil.resetTime(T001X2_A708PrdFecEnt[0])) ) )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdFecEnt");
               GXutil.writeLogRaw("Old: ",Z708PrdFecEnt);
               GXutil.writeLogRaw("Current: ",T001X2_A708PrdFecEnt[0]);
            }
            if ( Z1193PrdPosX != T001X2_A1193PrdPosX[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPosX");
               GXutil.writeLogRaw("Old: ",Z1193PrdPosX);
               GXutil.writeLogRaw("Current: ",T001X2_A1193PrdPosX[0]);
            }
            if ( Z1194PrdPosY != T001X2_A1194PrdPosY[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPosY");
               GXutil.writeLogRaw("Old: ",Z1194PrdPosY);
               GXutil.writeLogRaw("Current: ",T001X2_A1194PrdPosY[0]);
            }
            if ( GXutil.strcmp(Z1643PrdTip, T001X2_A1643PrdTip[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdTip");
               GXutil.writeLogRaw("Old: ",Z1643PrdTip);
               GXutil.writeLogRaw("Current: ",T001X2_A1643PrdTip[0]);
            }
            if ( Z1644PrdDqo != T001X2_A1644PrdDqo[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdDqo");
               GXutil.writeLogRaw("Old: ",Z1644PrdDqo);
               GXutil.writeLogRaw("Current: ",T001X2_A1644PrdDqo[0]);
            }
            if ( GXutil.strcmp(Z3004PrdRev, T001X2_A3004PrdRev[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdRev");
               GXutil.writeLogRaw("Old: ",Z3004PrdRev);
               GXutil.writeLogRaw("Current: ",T001X2_A3004PrdRev[0]);
            }
            if ( Z3273PrdTnq != T001X2_A3273PrdTnq[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdTnq");
               GXutil.writeLogRaw("Old: ",Z3273PrdTnq);
               GXutil.writeLogRaw("Current: ",T001X2_A3273PrdTnq[0]);
            }
            if ( Z4338PrdUMeFo != T001X2_A4338PrdUMeFo[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdUMeFo");
               GXutil.writeLogRaw("Old: ",Z4338PrdUMeFo);
               GXutil.writeLogRaw("Current: ",T001X2_A4338PrdUMeFo[0]);
            }
            if ( DecimalUtil.compareTo(Z5255PrdPreAc2, T001X2_A5255PrdPreAc2[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPreAc2");
               GXutil.writeLogRaw("Old: ",Z5255PrdPreAc2);
               GXutil.writeLogRaw("Current: ",T001X2_A5255PrdPreAc2[0]);
            }
            if ( GXutil.strcmp(Z6191PrdNumCent, T001X2_A6191PrdNumCent[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdNumCent");
               GXutil.writeLogRaw("Old: ",Z6191PrdNumCent);
               GXutil.writeLogRaw("Current: ",T001X2_A6191PrdNumCent[0]);
            }
            if ( DecimalUtil.compareTo(Z5590PrdSolub, T001X2_A5590PrdSolub[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdSolub");
               GXutil.writeLogRaw("Old: ",Z5590PrdSolub);
               GXutil.writeLogRaw("Current: ",T001X2_A5590PrdSolub[0]);
            }
            if ( DecimalUtil.compareTo(Z7763PrdPreRef, T001X2_A7763PrdPreRef[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPreRef");
               GXutil.writeLogRaw("Old: ",Z7763PrdPreRef);
               GXutil.writeLogRaw("Current: ",T001X2_A7763PrdPreRef[0]);
            }
            if ( DecimalUtil.compareTo(Z8659PrdExiAlmc, T001X2_A8659PrdExiAlmc[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdExiAlmc");
               GXutil.writeLogRaw("Old: ",Z8659PrdExiAlmc);
               GXutil.writeLogRaw("Current: ",T001X2_A8659PrdExiAlmc[0]);
            }
            if ( Z8895PrdAltAct != T001X2_A8895PrdAltAct[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdAltAct");
               GXutil.writeLogRaw("Old: ",Z8895PrdAltAct);
               GXutil.writeLogRaw("Current: ",T001X2_A8895PrdAltAct[0]);
            }
            if ( Z8896PrdPesCon != T001X2_A8896PrdPesCon[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPesCon");
               GXutil.writeLogRaw("Old: ",Z8896PrdPesCon);
               GXutil.writeLogRaw("Current: ",T001X2_A8896PrdPesCon[0]);
            }
            if ( GXutil.strcmp(Z8897PrdPesTerm, T001X2_A8897PrdPesTerm[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdPesTerm");
               GXutil.writeLogRaw("Old: ",Z8897PrdPesTerm);
               GXutil.writeLogRaw("Current: ",T001X2_A8897PrdPesTerm[0]);
            }
            if ( GXutil.strcmp(Z9734PrdNCAS, T001X2_A9734PrdNCAS[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdNCAS");
               GXutil.writeLogRaw("Old: ",Z9734PrdNCAS);
               GXutil.writeLogRaw("Current: ",T001X2_A9734PrdNCAS[0]);
            }
            if ( GXutil.strcmp(Z3936PrdEqLP, T001X2_A3936PrdEqLP[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdEqLP");
               GXutil.writeLogRaw("Old: ",Z3936PrdEqLP);
               GXutil.writeLogRaw("Current: ",T001X2_A3936PrdEqLP[0]);
            }
            if ( DecimalUtil.compareTo(Z3937PrdConc, T001X2_A3937PrdConc[0]) != 0 )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdConc");
               GXutil.writeLogRaw("Old: ",Z3937PrdConc);
               GXutil.writeLogRaw("Current: ",T001X2_A3937PrdConc[0]);
            }
            if ( Z629MetCod != T001X2_A629MetCod[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"MetCod");
               GXutil.writeLogRaw("Old: ",Z629MetCod);
               GXutil.writeLogRaw("Current: ",T001X2_A629MetCod[0]);
            }
            if ( Z795PrvNum != T001X2_A795PrvNum[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T001X2_A795PrvNum[0]);
            }
            if ( Z835TipDtoCod != T001X2_A835TipDtoCod[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"TipDtoCod");
               GXutil.writeLogRaw("Old: ",Z835TipDtoCod);
               GXutil.writeLogRaw("Current: ",T001X2_A835TipDtoCod[0]);
            }
            if ( Z742PrdUniCom != T001X2_A742PrdUniCom[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdUniCom");
               GXutil.writeLogRaw("Old: ",Z742PrdUniCom);
               GXutil.writeLogRaw("Current: ",T001X2_A742PrdUniCom[0]);
            }
            if ( Z743PrdUniCon != T001X2_A743PrdUniCon[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"PrdUniCon");
               GXutil.writeLogRaw("Old: ",Z743PrdUniCon);
               GXutil.writeLogRaw("Current: ",T001X2_A743PrdUniCon[0]);
            }
            if ( Z856ValCod != T001X2_A856ValCod[0] )
            {
               GXutil.writeLogln("tprdgen:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T001X2_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1X29( )
   {
      beforeValidate1X29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1X29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1X29( 0) ;
         checkOptimisticConcurrency1X29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1X29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1X29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001X23 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A703PrdDscTec, A707PrdFacCon, A728PrdRefPrv, Boolean.valueOf(n734PrdSus), A734PrdSus, A727PrdRec, A682PrdCalNec, A698PrdDetPar, Byte.valueOf(A730PrdSit), A729PrdRotRea, A724PrdPreAct, A709PrdFecPre, A725PrdPreAnt, A726PrdPreMed, A696PrdConDia, Short.valueOf(A731PrdStkMinD), A732PrdStkMinU, Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A704PrdExiAlm, A705PrdExiCC, A685PrdCanRes, A684PrdCanPen, A713PrdFulEnt, A714PrdFulPed, A712PrdFulCC, A706PrdExiCCP, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A739PrdUltDCC, A700PrdDifCC, Short.valueOf(A695PrdConCC), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), Byte.valueOf(A4338PrdUMeFo), A5255PrdPreAc2, A6191PrdNumCent, A5590PrdSolub, Boolean.valueOf(n7763PrdPreRef), A7763PrdPreRef, A8659PrdExiAlmc, Boolean.valueOf(n8895PrdAltAct), Byte.valueOf(A8895PrdAltAct), Byte.valueOf(A8896PrdPesCon), A8897PrdPesTerm, A9734PrdNCAS, A3936PrdEqLP, Boolean.valueOf(n3937PrdConc), A3937PrdConc, A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Integer.valueOf(A795PrvNum), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), Byte.valueOf(A856ValCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1X0( ) ;
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
            load1X29( ) ;
         }
         endLevel1X29( ) ;
      }
      closeExtendedTableCursors1X29( ) ;
   }

   public void update1X29( )
   {
      beforeValidate1X29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1X29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1X29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1X29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1X29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001X24 */
                  pr_default.execute(22, new Object[] {A718PrdNom, A703PrdDscTec, A707PrdFacCon, A728PrdRefPrv, Boolean.valueOf(n734PrdSus), A734PrdSus, A727PrdRec, A682PrdCalNec, A698PrdDetPar, Byte.valueOf(A730PrdSit), A729PrdRotRea, A724PrdPreAct, A709PrdFecPre, A725PrdPreAnt, A726PrdPreMed, A696PrdConDia, Short.valueOf(A731PrdStkMinD), A732PrdStkMinU, Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A704PrdExiAlm, A705PrdExiCC, A685PrdCanRes, A684PrdCanPen, A713PrdFulEnt, A714PrdFulPed, A712PrdFulCC, A706PrdExiCCP, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A739PrdUltDCC, A700PrdDifCC, Short.valueOf(A695PrdConCC), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), Byte.valueOf(A4338PrdUMeFo), A5255PrdPreAc2, A6191PrdNumCent, A5590PrdSolub, Boolean.valueOf(n7763PrdPreRef), A7763PrdPreRef, A8659PrdExiAlmc, Boolean.valueOf(n8895PrdAltAct), Byte.valueOf(A8895PrdAltAct), Byte.valueOf(A8896PrdPesCon), A8897PrdPesTerm, A9734PrdNCAS, A3936PrdEqLP, Boolean.valueOf(n3937PrdConc), A3937PrdConc, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Integer.valueOf(A795PrvNum), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), Byte.valueOf(A856ValCod), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1X29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1X0( ) ;
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
         endLevel1X29( ) ;
      }
      closeExtendedTableCursors1X29( ) ;
   }

   public void deferredUpdate1X29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1X29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1X29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1X29( ) ;
         afterConfirm1X29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1X29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001X25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound29 == 0 )
                     {
                        initAll1X29( ) ;
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
                     resetCaption1X0( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1X29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1X29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001X26 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         A407EmprNom = T001X26_A407EmprNom[0] ;
         n407EmprNom = T001X26_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(24);
         /* Using cursor T001X27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
         A737PrdUcpDsc = T001X27_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = T001X27_n737PrdUcpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
         pr_default.close(25);
         /* Using cursor T001X28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
         A736PrdUcoDsc = T001X28_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = T001X28_n736PrdUcoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
         pr_default.close(26);
         /* Using cursor T001X29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T001X29_A794PrvNom[0] ;
         n794PrvNom = T001X29_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(27);
         /* Using cursor T001X30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
         A857ValDsc = T001X30_A857ValDsc[0] ;
         n857ValDsc = T001X30_n857ValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         pr_default.close(28);
         /* Using cursor T001X31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         A837TipDtoDto = T001X31_A837TipDtoDto[0] ;
         n837TipDtoDto = T001X31_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         pr_default.close(29);
         /* Using cursor T001X32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
         A630MetDsc = T001X32_A630MetDsc[0] ;
         n630MetDsc = T001X32_n630MetDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
         pr_default.close(30);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001X33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T001X34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T001X35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T001X36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T001X37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T001X38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T001X39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T001X40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T001X41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T001X42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T001X43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T001X44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T001X45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T001X46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T001X47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T001X48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T001X49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T001X50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T001X51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T001X52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T001X53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T001X54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T001X55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T001X56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T001X57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T001X58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T001X59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T001X60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T001X61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T001X62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T001X63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T001X64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T001X65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T001X66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T001X67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T001X68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T001X69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T001X70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T001X71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T001X72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T001X73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T001X74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T001X75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T001X76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T001X77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T001X78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T001X79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T001X80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T001X81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T001X82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T001X83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T001X84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T001X85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T001X86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T001X87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T001X88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T001X89 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T001X90 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T001X91 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T001X92 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T001X93 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T001X94 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T001X95 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T001X96 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T001X97 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T001X98 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T001X99 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T001X100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T001X101 */
         pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T001X102 */
         pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T001X103 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T001X104 */
         pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T001X105 */
         pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
      }
   }

   public void endLevel1X29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1X29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprdgen");
         if ( AnyError == 0 )
         {
            confirmValues1X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprdgen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1X29( )
   {
      /* Using cursor T001X106 */
      pr_default.execute(104);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(104) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T001X106_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T001X106_A719PrdNum[0] ;
         n719PrdNum = T001X106_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1X29( )
   {
      /* Scan next routine */
      pr_default.readNext(104);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(104) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T001X106_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T001X106_A719PrdNum[0] ;
         n719PrdNum = T001X106_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1X29( )
   {
      pr_default.close(104);
   }

   public void afterConfirm1X29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1X29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1X29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1X29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1X29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1X29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1X29( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdDscTec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDscTec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDscTec_Enabled), 5, 0), true);
      edtPrdUniCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCom_Enabled), 5, 0), true);
      edtPrdUcpDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUcpDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Enabled), 5, 0), true);
      edtPrdUniCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCon_Enabled), 5, 0), true);
      edtPrdUcoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcoDsc_Enabled), 5, 0), true);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrdRefPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRefPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefPrv_Enabled), 5, 0), true);
      edtEmpCodSus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpCodSus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpCodSus_Enabled), 5, 0), true);
      edtPrdSus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSus_Enabled), 5, 0), true);
      edtPrdSusNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSusNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSusNom_Enabled), 5, 0), true);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), true);
      edtValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Enabled), 5, 0), true);
      edtPrdRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Enabled), 5, 0), true);
      edtPrdCalNec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCalNec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCalNec_Enabled), 5, 0), true);
      edtPrdDetPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDetPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDetPar_Enabled), 5, 0), true);
      edtPrdSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSit_Enabled), 5, 0), true);
      edtPrdRotRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRotRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRotRea_Enabled), 5, 0), true);
      edtTipDtoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoCod_Enabled), 5, 0), true);
      edtTipDtoDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoDto_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtPrdFecPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFecPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFecPre_Enabled), 5, 0), true);
      edtPrdPreAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAnt_Enabled), 5, 0), true);
      edtPrdPreMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), true);
      edtPrdConDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConDia_Enabled), 5, 0), true);
      edtPrdStkMinD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdStkMinD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdStkMinD_Enabled), 5, 0), true);
      edtPrdStkMinU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdStkMinU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdStkMinU_Enabled), 5, 0), true);
      edtPrdDiaRot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDiaRot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDiaRot_Enabled), 5, 0), true);
      edtPrdPlaEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPlaEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPlaEnt_Enabled), 5, 0), true);
      edtMetCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetCod_Enabled), 5, 0), true);
      edtMetDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetDsc_Enabled), 5, 0), true);
      edtPrdLotMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLotMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLotMin_Enabled), 5, 0), true);
      edtPrdNumUco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumUco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumUco_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
      edtPrdFulEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulEnt_Enabled), 5, 0), true);
      edtPrdFulPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulPed_Enabled), 5, 0), true);
      edtPrdFulCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulCC_Enabled), 5, 0), true);
      edtPrdExiCCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCCP_Enabled), 5, 0), true);
      edtPrdUltECC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltECC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltECC_Enabled), 5, 0), true);
      edtPrdUltCCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltCCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltCCC_Enabled), 5, 0), true);
      edtPrdUltDCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltDCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltDCC_Enabled), 5, 0), true);
      edtPrdDifCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDifCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDifCC_Enabled), 5, 0), true);
      edtPrdConCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConCC_Enabled), 5, 0), true);
      edtPrdValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), true);
      edtDifValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDifValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDifValStk_Enabled), 5, 0), true);
      edtPrdFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFecEnt_Enabled), 5, 0), true);
      edtPrdPosX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPosX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPosX_Enabled), 5, 0), true);
      edtPrdPosY_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPosY_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPosY_Enabled), 5, 0), true);
      edtPrdTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTip_Enabled), 5, 0), true);
      edtPrdDqo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDqo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDqo_Enabled), 5, 0), true);
      edtPrdRev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRev_Enabled), 5, 0), true);
      edtPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTnq_Enabled), 5, 0), true);
      edtPrdUMeFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUMeFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Enabled), 5, 0), true);
      edtPrdPreAc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAc2_Enabled), 5, 0), true);
      edtPrdNumCent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumCent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumCent_Enabled), 5, 0), true);
      edtPrdSolub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSolub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSolub_Enabled), 5, 0), true);
      edtPrdPreRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreRef_Enabled), 5, 0), true);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
      chkPrdAltAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdAltAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdAltAct.getEnabled(), 5, 0), true);
      chkPrdPesCon.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdPesCon.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdPesCon.getEnabled(), 5, 0), true);
      edtPrdPesTerm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPesTerm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPesTerm_Enabled), 5, 0), true);
      edtPrdNCAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNCAS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNCAS_Enabled), 5, 0), true);
      edtPrdEqLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdEqLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdEqLP_Enabled), 5, 0), true);
      edtPrdConc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1X29( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1X0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tprdgen", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z703PrdDscTec", GXutil.rtrim( Z703PrdDscTec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z728PrdRefPrv", GXutil.rtrim( Z728PrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z734PrdSus", GXutil.rtrim( Z734PrdSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z682PrdCalNec", GXutil.rtrim( Z682PrdCalNec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z730PrdSit", GXutil.ltrim( localUtil.ntoc( Z730PrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.dtoc( Z709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z696PrdConDia", GXutil.ltrim( localUtil.ntoc( Z696PrdConDia, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z731PrdStkMinD", GXutil.ltrim( localUtil.ntoc( Z731PrdStkMinD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z732PrdStkMinU", GXutil.ltrim( localUtil.ntoc( Z732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z699PrdDiaRot", GXutil.ltrim( localUtil.ntoc( Z699PrdDiaRot, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z722PrdPlaEnt", GXutil.ltrim( localUtil.ntoc( Z722PrdPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z716PrdLotMin", GXutil.ltrim( localUtil.ntoc( Z716PrdLotMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z721PrdNumUco", GXutil.ltrim( localUtil.ntoc( Z721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.dtoc( Z713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z714PrdFulPed", localUtil.dtoc( Z714PrdFulPed, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z712PrdFulCC", localUtil.dtoc( Z712PrdFulCC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z740PrdUltECC", GXutil.ltrim( localUtil.ntoc( Z740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( Z738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( Z739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z700PrdDifCC", GXutil.ltrim( localUtil.ntoc( Z700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z695PrdConCC", GXutil.ltrim( localUtil.ntoc( Z695PrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z332DifValStk", GXutil.ltrim( localUtil.ntoc( Z332DifValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z708PrdFecEnt", localUtil.dtoc( Z708PrdFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1193PrdPosX", GXutil.ltrim( localUtil.ntoc( Z1193PrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1194PrdPosY", GXutil.ltrim( localUtil.ntoc( Z1194PrdPosY, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1643PrdTip", GXutil.rtrim( Z1643PrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1644PrdDqo", GXutil.ltrim( localUtil.ntoc( Z1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3004PrdRev", GXutil.rtrim( Z3004PrdRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3273PrdTnq", GXutil.ltrim( localUtil.ntoc( Z3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( Z4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6191PrdNumCent", GXutil.rtrim( Z6191PrdNumCent));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5590PrdSolub", GXutil.ltrim( localUtil.ntoc( Z5590PrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7763PrdPreRef", GXutil.ltrim( localUtil.ntoc( Z7763PrdPreRef, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( Z8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8895PrdAltAct", GXutil.ltrim( localUtil.ntoc( Z8895PrdAltAct, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8896PrdPesCon", GXutil.ltrim( localUtil.ntoc( Z8896PrdPesCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8897PrdPesTerm", GXutil.rtrim( Z8897PrdPesTerm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9734PrdNCAS", GXutil.rtrim( Z9734PrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3936PrdEqLP", GXutil.rtrim( Z3936PrdEqLP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3937PrdConc", GXutil.ltrim( localUtil.ntoc( Z3937PrdConc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z629MetCod", GXutil.ltrim( localUtil.ntoc( Z629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z835TipDtoCod", GXutil.ltrim( localUtil.ntoc( Z835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z742PrdUniCom", GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z743PrdUniCon", GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tprdgen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPRDGEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", "") ;
   }

   public void initializeNonKey1X29( )
   {
      A394EmpCodSus = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A394EmpCodSus", A394EmpCodSus);
      A735PrdSusNom = "" ;
      n735PrdSusNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", A735PrdSusNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A703PrdDscTec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
      A742PrdUniCom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
      A737PrdUcpDsc = "" ;
      n737PrdUcpDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
      A743PrdUniCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
      A736PrdUcoDsc = "" ;
      n736PrdUcoDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A728PrdRefPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
      A734PrdSus = "" ;
      n734PrdSus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A857ValDsc = "" ;
      n857ValDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      A727PrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A682PrdCalNec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
      A698PrdDetPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A730PrdSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
      A729PrdRotRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
      A835TipDtoCod = (byte)(0) ;
      n835TipDtoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      A837TipDtoDto = DecimalUtil.ZERO ;
      n837TipDtoDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A709PrdFecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A725PrdPreAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A696PrdConDia = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
      A731PrdStkMinD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
      A732PrdStkMinU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
      A699PrdDiaRot = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
      A722PrdPlaEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
      A629MetCod = (byte)(0) ;
      n629MetCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
      A630MetDsc = "" ;
      n630MetDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
      A716PrdLotMin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
      A721PrdNumUco = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A713PrdFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A714PrdFulPed = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
      A712PrdFulCC = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
      A706PrdExiCCP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
      A740PrdUltECC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
      A738PrdUltCCC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
      A739PrdUltDCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
      A700PrdDifCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
      A695PrdConCC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A332DifValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
      A708PrdFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
      A1193PrdPosX = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
      A1194PrdPosY = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
      A1643PrdTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
      A1644PrdDqo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
      A3004PrdRev = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
      A3273PrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
      A6191PrdNumCent = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
      A5590PrdSolub = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
      A7763PrdPreRef = DecimalUtil.ZERO ;
      n7763PrdPreRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7763PrdPreRef", GXutil.ltrimstr( A7763PrdPreRef, 14, 5));
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      A8895PrdAltAct = (byte)(0) ;
      n8895PrdAltAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
      A8896PrdPesCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      A8897PrdPesTerm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
      A9734PrdNCAS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
      A3936PrdEqLP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3936PrdEqLP", A3936PrdEqLP);
      A3937PrdConc = DecimalUtil.ZERO ;
      n3937PrdConc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3937PrdConc", GXutil.ltrimstr( A3937PrdConc, 6, 2));
      Z718PrdNom = "" ;
      Z703PrdDscTec = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z728PrdRefPrv = "" ;
      Z734PrdSus = "" ;
      Z727PrdRec = "" ;
      Z682PrdCalNec = "" ;
      Z698PrdDetPar = "" ;
      Z730PrdSit = (byte)(0) ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z696PrdConDia = DecimalUtil.ZERO ;
      Z731PrdStkMinD = (short)(0) ;
      Z732PrdStkMinU = DecimalUtil.ZERO ;
      Z699PrdDiaRot = (short)(0) ;
      Z722PrdPlaEnt = (short)(0) ;
      Z716PrdLotMin = (short)(0) ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z714PrdFulPed = GXutil.nullDate() ;
      Z712PrdFulCC = GXutil.nullDate() ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z738PrdUltCCC = (short)(0) ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z695PrdConCC = (short)(0) ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z332DifValStk = DecimalUtil.ZERO ;
      Z708PrdFecEnt = GXutil.nullDate() ;
      Z1193PrdPosX = (short)(0) ;
      Z1194PrdPosY = (byte)(0) ;
      Z1643PrdTip = "" ;
      Z1644PrdDqo = (short)(0) ;
      Z3004PrdRev = "" ;
      Z3273PrdTnq = (byte)(0) ;
      Z4338PrdUMeFo = (byte)(0) ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z6191PrdNumCent = "" ;
      Z5590PrdSolub = DecimalUtil.ZERO ;
      Z7763PrdPreRef = DecimalUtil.ZERO ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8895PrdAltAct = (byte)(0) ;
      Z8896PrdPesCon = (byte)(0) ;
      Z8897PrdPesTerm = "" ;
      Z9734PrdNCAS = "" ;
      Z3936PrdEqLP = "" ;
      Z3937PrdConc = DecimalUtil.ZERO ;
      Z629MetCod = (byte)(0) ;
      Z795PrvNum = 0 ;
      Z835TipDtoCod = (byte)(0) ;
      Z742PrdUniCom = (byte)(0) ;
      Z743PrdUniCon = (byte)(0) ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll1X29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1X29( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241504036", true, true);
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
      httpContext.AddJavascriptSource("tprdgen.js", "?20268241504036", false, true);
      /* End function include_jscripts */
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
      edtPrdNum_Internalname = "PRDNUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPrdDscTec_Internalname = "PRDDSCTEC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPrdUniCom_Internalname = "PRDUNICOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrdUniCon_Internalname = "PRDUNICON" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPrdUcoDsc_Internalname = "PRDUCODSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPrdRefPrv_Internalname = "PRDREFPRV" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEmpCodSus_Internalname = "EMPCODSUS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtPrdSus_Internalname = "PRDSUS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPrdSusNom_Internalname = "PRDSUSNOM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtValCod_Internalname = "VALCOD" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtValDsc_Internalname = "VALDSC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtPrdRec_Internalname = "PRDREC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtPrdCalNec_Internalname = "PRDCALNEC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtPrdDetPar_Internalname = "PRDDETPAR" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtPrdSit_Internalname = "PRDSIT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtPrdRotRea_Internalname = "PRDROTREA" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTipDtoCod_Internalname = "TIPDTOCOD" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtTipDtoDto_Internalname = "TIPDTODTO" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtPrdFecPre_Internalname = "PRDFECPRE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtPrdPreAnt_Internalname = "PRDPREANT" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtPrdPreMed_Internalname = "PRDPREMED" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtPrdConDia_Internalname = "PRDCONDIA" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtPrdStkMinD_Internalname = "PRDSTKMIND" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtPrdStkMinU_Internalname = "PRDSTKMINU" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtPrdDiaRot_Internalname = "PRDDIAROT" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtPrdPlaEnt_Internalname = "PRDPLAENT" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtMetCod_Internalname = "METCOD" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtMetDsc_Internalname = "METDSC" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtPrdLotMin_Internalname = "PRDLOTMIN" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtPrdNumUco_Internalname = "PRDNUMUCO" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtPrdFulEnt_Internalname = "PRDFULENT" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtPrdFulPed_Internalname = "PRDFULPED" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtPrdFulCC_Internalname = "PRDFULCC" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtPrdExiCCP_Internalname = "PRDEXICCP" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtPrdUltECC_Internalname = "PRDULTECC" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtPrdUltCCC_Internalname = "PRDULTCCC" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtPrdUltDCC_Internalname = "PRDULTDCC" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtPrdDifCC_Internalname = "PRDDIFCC" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtPrdConCC_Internalname = "PRDCONCC" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtPrdValStk_Internalname = "PRDVALSTK" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtDifValStk_Internalname = "DIFVALSTK" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtPrdFecEnt_Internalname = "PRDFECENT" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtPrdPosX_Internalname = "PRDPOSX" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtPrdPosY_Internalname = "PRDPOSY" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtPrdTip_Internalname = "PRDTIP" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtPrdDqo_Internalname = "PRDDQO" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtPrdRev_Internalname = "PRDREV" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtPrdTnq_Internalname = "PRDTNQ" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtPrdUMeFo_Internalname = "PRDUMEFO" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtPrdPreAc2_Internalname = "PRDPREAC2" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtPrdNumCent_Internalname = "PRDNUMCENT" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtPrdSolub_Internalname = "PRDSOLUB" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtPrdPreRef_Internalname = "PRDPREREF" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtPrdExiAlmc_Internalname = "PRDEXIALMC" ;
      chkPrdAltAct.setInternalname( "PRDALTACT" );
      chkPrdPesCon.setInternalname( "PRDPESCON" );
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtPrdPesTerm_Internalname = "PRDPESTERM" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtPrdNCAS_Internalname = "PRDNCAS" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtPrdEqLP_Internalname = "PRDEQLP" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtPrdConc_Internalname = "PRDCONC" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdConc_Jsonclick = "" ;
      edtPrdConc_Backcolor = (int)(0xFFFFFF) ;
      edtPrdConc_Enabled = 1 ;
      edtPrdEqLP_Jsonclick = "" ;
      edtPrdEqLP_Backcolor = (int)(0xFFFFFF) ;
      edtPrdEqLP_Enabled = 1 ;
      edtPrdNCAS_Jsonclick = "" ;
      edtPrdNCAS_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNCAS_Enabled = 1 ;
      edtPrdPesTerm_Jsonclick = "" ;
      edtPrdPesTerm_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPesTerm_Enabled = 1 ;
      chkPrdPesCon.setIBackground( (int)(0xFFFFFF) );
      chkPrdPesCon.setEnabled( 1 );
      chkPrdAltAct.setIBackground( (int)(0xFFFFFF) );
      chkPrdAltAct.setEnabled( 1 );
      edtPrdExiAlmc_Jsonclick = "" ;
      edtPrdExiAlmc_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiAlmc_Enabled = 1 ;
      edtPrdPreRef_Jsonclick = "" ;
      edtPrdPreRef_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPreRef_Enabled = 1 ;
      edtPrdSolub_Jsonclick = "" ;
      edtPrdSolub_Backcolor = (int)(0xFFFFFF) ;
      edtPrdSolub_Enabled = 1 ;
      edtPrdNumCent_Jsonclick = "" ;
      edtPrdNumCent_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNumCent_Enabled = 1 ;
      edtPrdPreAc2_Jsonclick = "" ;
      edtPrdPreAc2_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPreAc2_Enabled = 1 ;
      edtPrdUMeFo_Jsonclick = "" ;
      edtPrdUMeFo_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUMeFo_Enabled = 1 ;
      edtPrdTnq_Jsonclick = "" ;
      edtPrdTnq_Backcolor = (int)(0xFFFFFF) ;
      edtPrdTnq_Enabled = 1 ;
      edtPrdRev_Jsonclick = "" ;
      edtPrdRev_Backcolor = (int)(0xFFFFFF) ;
      edtPrdRev_Enabled = 1 ;
      edtPrdDqo_Jsonclick = "" ;
      edtPrdDqo_Backcolor = (int)(0xFFFFFF) ;
      edtPrdDqo_Enabled = 1 ;
      edtPrdTip_Jsonclick = "" ;
      edtPrdTip_Backcolor = (int)(0xFFFFFF) ;
      edtPrdTip_Enabled = 1 ;
      edtPrdPosY_Jsonclick = "" ;
      edtPrdPosY_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPosY_Enabled = 1 ;
      edtPrdPosX_Jsonclick = "" ;
      edtPrdPosX_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPosX_Enabled = 1 ;
      edtPrdFecEnt_Jsonclick = "" ;
      edtPrdFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtPrdFecEnt_Enabled = 1 ;
      edtDifValStk_Jsonclick = "" ;
      edtDifValStk_Backcolor = (int)(0xFFFFFF) ;
      edtDifValStk_Enabled = 1 ;
      edtPrdValStk_Jsonclick = "" ;
      edtPrdValStk_Backcolor = (int)(0xFFFFFF) ;
      edtPrdValStk_Enabled = 1 ;
      edtPrdConCC_Jsonclick = "" ;
      edtPrdConCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdConCC_Enabled = 1 ;
      edtPrdDifCC_Jsonclick = "" ;
      edtPrdDifCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdDifCC_Enabled = 1 ;
      edtPrdUltDCC_Jsonclick = "" ;
      edtPrdUltDCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUltDCC_Enabled = 1 ;
      edtPrdUltCCC_Jsonclick = "" ;
      edtPrdUltCCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUltCCC_Enabled = 1 ;
      edtPrdUltECC_Jsonclick = "" ;
      edtPrdUltECC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUltECC_Enabled = 1 ;
      edtPrdExiCCP_Jsonclick = "" ;
      edtPrdExiCCP_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiCCP_Enabled = 1 ;
      edtPrdFulCC_Jsonclick = "" ;
      edtPrdFulCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdFulCC_Enabled = 1 ;
      edtPrdFulPed_Jsonclick = "" ;
      edtPrdFulPed_Backcolor = (int)(0xFFFFFF) ;
      edtPrdFulPed_Enabled = 1 ;
      edtPrdFulEnt_Jsonclick = "" ;
      edtPrdFulEnt_Backcolor = (int)(0xFFFFFF) ;
      edtPrdFulEnt_Enabled = 1 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Backcolor = (int)(0xFFFFFF) ;
      edtPrdCanPen_Enabled = 1 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Backcolor = (int)(0xFFFFFF) ;
      edtPrdCanRes_Enabled = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiCC_Enabled = 1 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiAlm_Enabled = 1 ;
      edtPrdNumUco_Jsonclick = "" ;
      edtPrdNumUco_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNumUco_Enabled = 1 ;
      edtPrdLotMin_Jsonclick = "" ;
      edtPrdLotMin_Backcolor = (int)(0xFFFFFF) ;
      edtPrdLotMin_Enabled = 1 ;
      edtMetDsc_Jsonclick = "" ;
      edtMetDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMetDsc_Enabled = 0 ;
      edtMetCod_Jsonclick = "" ;
      edtMetCod_Backcolor = (int)(0xFFFFFF) ;
      edtMetCod_Enabled = 1 ;
      edtPrdPlaEnt_Jsonclick = "" ;
      edtPrdPlaEnt_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPlaEnt_Enabled = 1 ;
      edtPrdDiaRot_Jsonclick = "" ;
      edtPrdDiaRot_Backcolor = (int)(0xFFFFFF) ;
      edtPrdDiaRot_Enabled = 1 ;
      edtPrdStkMinU_Jsonclick = "" ;
      edtPrdStkMinU_Backcolor = (int)(0xFFFFFF) ;
      edtPrdStkMinU_Enabled = 1 ;
      edtPrdStkMinD_Jsonclick = "" ;
      edtPrdStkMinD_Backcolor = (int)(0xFFFFFF) ;
      edtPrdStkMinD_Enabled = 1 ;
      edtPrdConDia_Jsonclick = "" ;
      edtPrdConDia_Backcolor = (int)(0xFFFFFF) ;
      edtPrdConDia_Enabled = 1 ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreMed_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPreMed_Enabled = 1 ;
      edtPrdPreAnt_Jsonclick = "" ;
      edtPrdPreAnt_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPreAnt_Enabled = 1 ;
      edtPrdFecPre_Jsonclick = "" ;
      edtPrdFecPre_Backcolor = (int)(0xFFFFFF) ;
      edtPrdFecPre_Enabled = 1 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Backcolor = (int)(0xFFFFFF) ;
      edtPrdPreAct_Enabled = 1 ;
      edtTipDtoDto_Jsonclick = "" ;
      edtTipDtoDto_Backcolor = (int)(0xFFFFFF) ;
      edtTipDtoDto_Enabled = 0 ;
      edtTipDtoCod_Jsonclick = "" ;
      edtTipDtoCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipDtoCod_Enabled = 1 ;
      edtPrdRotRea_Jsonclick = "" ;
      edtPrdRotRea_Backcolor = (int)(0xFFFFFF) ;
      edtPrdRotRea_Enabled = 1 ;
      edtPrdSit_Jsonclick = "" ;
      edtPrdSit_Backcolor = (int)(0xFFFFFF) ;
      edtPrdSit_Enabled = 1 ;
      edtPrdDetPar_Jsonclick = "" ;
      edtPrdDetPar_Backcolor = (int)(0xFFFFFF) ;
      edtPrdDetPar_Enabled = 1 ;
      edtPrdCalNec_Jsonclick = "" ;
      edtPrdCalNec_Backcolor = (int)(0xFFFFFF) ;
      edtPrdCalNec_Enabled = 1 ;
      edtPrdRec_Jsonclick = "" ;
      edtPrdRec_Backcolor = (int)(0xFFFFFF) ;
      edtPrdRec_Enabled = 1 ;
      edtValDsc_Jsonclick = "" ;
      edtValDsc_Backcolor = (int)(0xFFFFFF) ;
      edtValDsc_Enabled = 0 ;
      edtValCod_Jsonclick = "" ;
      edtValCod_Backcolor = (int)(0xFFFFFF) ;
      edtValCod_Enabled = 1 ;
      edtPrdSusNom_Jsonclick = "" ;
      edtPrdSusNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdSusNom_Enabled = 0 ;
      edtPrdSus_Jsonclick = "" ;
      edtPrdSus_Backcolor = (int)(0xFFFFFF) ;
      edtPrdSus_Enabled = 1 ;
      edtEmpCodSus_Jsonclick = "" ;
      edtEmpCodSus_Backcolor = (int)(0xFFFFFF) ;
      edtEmpCodSus_Enabled = 0 ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdRefPrv_Backcolor = (int)(0xFFFFFF) ;
      edtPrdRefPrv_Enabled = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNum_Enabled = 1 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Backcolor = (int)(0xFFFFFF) ;
      edtPrdFacCon_Enabled = 1 ;
      edtPrdUcoDsc_Jsonclick = "" ;
      edtPrdUcoDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUcoDsc_Enabled = 0 ;
      edtPrdUniCon_Jsonclick = "" ;
      edtPrdUniCon_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUniCon_Enabled = 1 ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdUcpDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUcpDsc_Enabled = 0 ;
      edtPrdUniCom_Jsonclick = "" ;
      edtPrdUniCom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdUniCom_Enabled = 1 ;
      edtPrdDscTec_Jsonclick = "" ;
      edtPrdDscTec_Backcolor = (int)(0xFFFFFF) ;
      edtPrdDscTec_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNom_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      chkPrdAltAct.setName( "PRDALTACT" );
      chkPrdAltAct.setWebtags( "" );
      chkPrdAltAct.setCaption( httpContext.getMessage( "Alternativo Activo", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdAltAct.getInternalname(), "TitleCaption", chkPrdAltAct.getCaption(), true);
      chkPrdAltAct.setCheckedValue( "0" );
      A8895PrdAltAct = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8895PrdAltAct, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8895PrdAltAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.str( A8895PrdAltAct, 1, 0));
      chkPrdPesCon.setName( "PRDPESCON" );
      chkPrdPesCon.setWebtags( "" );
      chkPrdPesCon.setCaption( httpContext.getMessage( "Controlar", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdPesCon.getInternalname(), "TitleCaption", chkPrdPesCon.getCaption(), true);
      chkPrdPesCon.setCheckedValue( "0" );
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T001X26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001X26_A407EmprNom[0] ;
      n407EmprNom = T001X26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      GX_FocusControl = edtPrdNom_Internalname ;
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
      /* Using cursor T001X26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T001X26_A407EmprNom[0] ;
      n407EmprNom = T001X26_n407EmprNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A8895PrdAltAct = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8895PrdAltAct, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8895PrdAltAct = false ;
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A394EmpCodSus", GXutil.rtrim( A394EmpCodSus));
      httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", GXutil.rtrim( A735PrdSusNom));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", GXutil.rtrim( A703PrdDscTec));
      httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", GXutil.rtrim( A728PrdRefPrv));
      httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", GXutil.rtrim( A734PrdSus));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", GXutil.rtrim( A682PrdCalNec));
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", GXutil.rtrim( A698PrdDetPar));
      httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.ltrim( localUtil.ntoc( A730PrdSit, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrim( localUtil.ntoc( A696PrdConDia, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrim( localUtil.ntoc( A731PrdStkMinD, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrim( localUtil.ntoc( A699PrdDiaRot, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrim( localUtil.ntoc( A722PrdPlaEnt, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrim( localUtil.ntoc( A716PrdLotMin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrim( localUtil.ntoc( A695PrdConCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrim( localUtil.ntoc( A332DifValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrim( localUtil.ntoc( A1193PrdPosX, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrim( localUtil.ntoc( A1194PrdPosY, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", GXutil.rtrim( A1643PrdTip));
      httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", GXutil.rtrim( A3004PrdRev));
      httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", GXutil.rtrim( A6191PrdNumCent));
      httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrim( localUtil.ntoc( A5590PrdSolub, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7763PrdPreRef", GXutil.ltrim( localUtil.ntoc( A7763PrdPreRef, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8895PrdAltAct", GXutil.ltrim( localUtil.ntoc( A8895PrdAltAct, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", GXutil.rtrim( A8897PrdPesTerm));
      httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", GXutil.rtrim( A9734PrdNCAS));
      httpContext.ajax_rsp_assign_attri("", false, "A3936PrdEqLP", GXutil.rtrim( A3936PrdEqLP));
      httpContext.ajax_rsp_assign_attri("", false, "A3937PrdConc", GXutil.ltrim( localUtil.ntoc( A3937PrdConc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", GXutil.rtrim( A630MetDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", GXutil.rtrim( A737PrdUcpDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", GXutil.rtrim( A736PrdUcoDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", GXutil.rtrim( A857ValDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z394EmpCodSus", GXutil.rtrim( Z394EmpCodSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z735PrdSusNom", GXutil.rtrim( Z735PrdSusNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z703PrdDscTec", GXutil.rtrim( Z703PrdDscTec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z742PrdUniCom", GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z743PrdUniCon", GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z728PrdRefPrv", GXutil.rtrim( Z728PrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z734PrdSus", GXutil.rtrim( Z734PrdSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z682PrdCalNec", GXutil.rtrim( Z682PrdCalNec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z730PrdSit", GXutil.ltrim( localUtil.ntoc( Z730PrdSit, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z835TipDtoCod", GXutil.ltrim( localUtil.ntoc( Z835TipDtoCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.format(Z709PrdFecPre, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z696PrdConDia", GXutil.ltrim( localUtil.ntoc( Z696PrdConDia, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z731PrdStkMinD", GXutil.ltrim( localUtil.ntoc( Z731PrdStkMinD, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z732PrdStkMinU", GXutil.ltrim( localUtil.ntoc( Z732PrdStkMinU, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z699PrdDiaRot", GXutil.ltrim( localUtil.ntoc( Z699PrdDiaRot, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z722PrdPlaEnt", GXutil.ltrim( localUtil.ntoc( Z722PrdPlaEnt, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z629MetCod", GXutil.ltrim( localUtil.ntoc( Z629MetCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z716PrdLotMin", GXutil.ltrim( localUtil.ntoc( Z716PrdLotMin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z721PrdNumUco", GXutil.ltrim( localUtil.ntoc( Z721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.format(Z713PrdFulEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z714PrdFulPed", localUtil.format(Z714PrdFulPed, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z712PrdFulCC", localUtil.format(Z712PrdFulCC, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z740PrdUltECC", GXutil.ltrim( localUtil.ntoc( Z740PrdUltECC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( Z738PrdUltCCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( Z739PrdUltDCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z700PrdDifCC", GXutil.ltrim( localUtil.ntoc( Z700PrdDifCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z695PrdConCC", GXutil.ltrim( localUtil.ntoc( Z695PrdConCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z332DifValStk", GXutil.ltrim( localUtil.ntoc( Z332DifValStk, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z708PrdFecEnt", localUtil.format(Z708PrdFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1193PrdPosX", GXutil.ltrim( localUtil.ntoc( Z1193PrdPosX, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1194PrdPosY", GXutil.ltrim( localUtil.ntoc( Z1194PrdPosY, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1643PrdTip", GXutil.rtrim( Z1643PrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1644PrdDqo", GXutil.ltrim( localUtil.ntoc( Z1644PrdDqo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3004PrdRev", GXutil.rtrim( Z3004PrdRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3273PrdTnq", GXutil.ltrim( localUtil.ntoc( Z3273PrdTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( Z4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6191PrdNumCent", GXutil.rtrim( Z6191PrdNumCent));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5590PrdSolub", GXutil.ltrim( localUtil.ntoc( Z5590PrdSolub, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7763PrdPreRef", GXutil.ltrim( localUtil.ntoc( Z7763PrdPreRef, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( Z8659PrdExiAlmc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8895PrdAltAct", GXutil.ltrim( localUtil.ntoc( Z8895PrdAltAct, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8896PrdPesCon", GXutil.ltrim( localUtil.ntoc( Z8896PrdPesCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8897PrdPesTerm", GXutil.rtrim( Z8897PrdPesTerm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9734PrdNCAS", GXutil.rtrim( Z9734PrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3936PrdEqLP", GXutil.rtrim( Z3936PrdEqLP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3937PrdConc", GXutil.ltrim( localUtil.ntoc( Z3937PrdConc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z630MetDsc", GXutil.rtrim( Z630MetDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z837TipDtoDto", GXutil.ltrim( localUtil.ntoc( Z837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z737PrdUcpDsc", GXutil.rtrim( Z737PrdUcpDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z736PrdUcoDsc", GXutil.rtrim( Z736PrdUcoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z857ValDsc", GXutil.rtrim( Z857ValDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdunicom( )
   {
      n737PrdUcpDsc = false ;
      /* Using cursor T001X27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A737PrdUcpDsc = T001X27_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T001X27_n737PrdUcpDsc[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", GXutil.rtrim( A737PrdUcpDsc));
   }

   public void valid_Prdunicon( )
   {
      n736PrdUcoDsc = false ;
      /* Using cursor T001X28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A736PrdUcoDsc = T001X28_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = T001X28_n736PrdUcoDsc[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", GXutil.rtrim( A736PrdUcoDsc));
   }

   public void valid_Prvnum( )
   {
      n794PrvNom = false ;
      /* Using cursor T001X29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A794PrvNom = T001X29_A794PrvNom[0] ;
      n794PrvNom = T001X29_n794PrvNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Prdsus( )
   {
      n734PrdSus = false ;
      n735PrdSusNom = false ;
      /* Using cursor T001X11 */
      pr_default.execute(9, new Object[] {A394EmpCodSus, Boolean.valueOf(n734PrdSus), A734PrdSus});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A735PrdSusNom = T001X11_A735PrdSusNom[0] ;
         n735PrdSusNom = T001X11_n735PrdSusNom[0] ;
      }
      else
      {
         A735PrdSusNom = "" ;
         n735PrdSusNom = false ;
      }
      pr_default.close(9);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", GXutil.rtrim( A735PrdSusNom));
   }

   public void valid_Valcod( )
   {
      n857ValDsc = false ;
      /* Using cursor T001X30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A857ValDsc = T001X30_A857ValDsc[0] ;
      n857ValDsc = T001X30_n857ValDsc[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", GXutil.rtrim( A857ValDsc));
   }

   public void valid_Tipdtocod( )
   {
      n835TipDtoCod = false ;
      n837TipDtoDto = false ;
      /* Using cursor T001X31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A837TipDtoDto = T001X31_A837TipDtoDto[0] ;
      n837TipDtoDto = T001X31_n837TipDtoDto[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
   }

   public void valid_Metcod( )
   {
      n629MetCod = false ;
      n630MetDsc = false ;
      /* Using cursor T001X32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A630MetDsc = T001X32_A630MetDsc[0] ;
      n630MetDsc = T001X32_n630MetDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", GXutil.rtrim( A630MetDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A394EmpCodSus',fld:'EMPCODSUS',pic:'@!'},{av:'A735PrdSusNom',fld:'PRDSUSNOM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A703PrdDscTec',fld:'PRDDSCTEC',pic:''},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A728PrdRefPrv',fld:'PRDREFPRV',pic:''},{av:'A734PrdSus',fld:'PRDSUS',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A682PrdCalNec',fld:'PRDCALNEC',pic:''},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A730PrdSit',fld:'PRDSIT',pic:'9'},{av:'A729PrdRotRea',fld:'PRDROTREA',pic:'ZZZZZ9.999'},{av:'A835TipDtoCod',fld:'TIPDTOCOD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A696PrdConDia',fld:'PRDCONDIA',pic:'ZZZ9.99'},{av:'A731PrdStkMinD',fld:'PRDSTKMIND',pic:'ZZZ9'},{av:'A732PrdStkMinU',fld:'PRDSTKMINU',pic:'ZZZZ9.99'},{av:'A699PrdDiaRot',fld:'PRDDIAROT',pic:'ZZ9'},{av:'A722PrdPlaEnt',fld:'PRDPLAENT',pic:'ZZ9'},{av:'A629MetCod',fld:'METCOD',pic:'9'},{av:'A716PrdLotMin',fld:'PRDLOTMIN',pic:'ZZZ9'},{av:'A721PrdNumUco',fld:'PRDNUMUCO',pic:'ZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A714PrdFulPed',fld:'PRDFULPED',pic:''},{av:'A712PrdFulCC',fld:'PRDFULCC',pic:''},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A740PrdUltECC',fld:'PRDULTECC',pic:'ZZZZ9.99'},{av:'A738PrdUltCCC',fld:'PRDULTCCC',pic:'ZZZ9'},{av:'A739PrdUltDCC',fld:'PRDULTDCC',pic:'ZZZZ9.99'},{av:'A700PrdDifCC',fld:'PRDDIFCC',pic:'ZZZZ9.99'},{av:'A695PrdConCC',fld:'PRDCONCC',pic:'ZZZ9'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A332DifValStk',fld:'DIFVALSTK',pic:'ZZZZZZZ9.99'},{av:'A708PrdFecEnt',fld:'PRDFECENT',pic:''},{av:'A1193PrdPosX',fld:'PRDPOSX',pic:'ZZZ9'},{av:'A1194PrdPosY',fld:'PRDPOSY',pic:'Z9'},{av:'A1643PrdTip',fld:'PRDTIP',pic:'@!'},{av:'A1644PrdDqo',fld:'PRDDQO',pic:'ZZZ9'},{av:'A3004PrdRev',fld:'PRDREV',pic:'@!'},{av:'A3273PrdTnq',fld:'PRDTNQ',pic:'Z9'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A5255PrdPreAc2',fld:'PRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'A6191PrdNumCent',fld:'PRDNUMCENT',pic:''},{av:'A5590PrdSolub',fld:'PRDSOLUB',pic:'ZZZ9.99'},{av:'A7763PrdPreRef',fld:'PRDPREREF',pic:'ZZZZZZZ9.99999'},{av:'A8659PrdExiAlmc',fld:'PRDEXIALMC',pic:'ZZZZZZ9.9999'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A9734PrdNCAS',fld:'PRDNCAS',pic:''},{av:'A3936PrdEqLP',fld:'PRDEQLP',pic:''},{av:'A3937PrdConc',fld:'PRDCONC',pic:'ZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A630MetDsc',fld:'METDSC',pic:''},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''},{av:'A736PrdUcoDsc',fld:'PRDUCODSC',pic:''},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z394EmpCodSus'},{av:'Z735PrdSusNom'},{av:'Z718PrdNom'},{av:'Z703PrdDscTec'},{av:'Z742PrdUniCom'},{av:'Z743PrdUniCon'},{av:'Z707PrdFacCon'},{av:'Z795PrvNum'},{av:'Z728PrdRefPrv'},{av:'Z734PrdSus'},{av:'Z856ValCod'},{av:'Z727PrdRec'},{av:'Z682PrdCalNec'},{av:'Z698PrdDetPar'},{av:'Z730PrdSit'},{av:'Z729PrdRotRea'},{av:'Z835TipDtoCod'},{av:'Z724PrdPreAct'},{av:'Z709PrdFecPre'},{av:'Z725PrdPreAnt'},{av:'Z726PrdPreMed'},{av:'Z696PrdConDia'},{av:'Z731PrdStkMinD'},{av:'Z732PrdStkMinU'},{av:'Z699PrdDiaRot'},{av:'Z722PrdPlaEnt'},{av:'Z629MetCod'},{av:'Z716PrdLotMin'},{av:'Z721PrdNumUco'},{av:'Z704PrdExiAlm'},{av:'Z705PrdExiCC'},{av:'Z685PrdCanRes'},{av:'Z684PrdCanPen'},{av:'Z713PrdFulEnt'},{av:'Z714PrdFulPed'},{av:'Z712PrdFulCC'},{av:'Z706PrdExiCCP'},{av:'Z740PrdUltECC'},{av:'Z738PrdUltCCC'},{av:'Z739PrdUltDCC'},{av:'Z700PrdDifCC'},{av:'Z695PrdConCC'},{av:'Z750PrdValStk'},{av:'Z332DifValStk'},{av:'Z708PrdFecEnt'},{av:'Z1193PrdPosX'},{av:'Z1194PrdPosY'},{av:'Z1643PrdTip'},{av:'Z1644PrdDqo'},{av:'Z3004PrdRev'},{av:'Z3273PrdTnq'},{av:'Z4338PrdUMeFo'},{av:'Z5255PrdPreAc2'},{av:'Z6191PrdNumCent'},{av:'Z5590PrdSolub'},{av:'Z7763PrdPreRef'},{av:'Z8659PrdExiAlmc'},{av:'Z8895PrdAltAct'},{av:'Z8896PrdPesCon'},{av:'Z8897PrdPesTerm'},{av:'Z9734PrdNCAS'},{av:'Z3936PrdEqLP'},{av:'Z3937PrdConc'},{av:'Z407EmprNom'},{av:'Z630MetDsc'},{av:'Z794PrvNom'},{av:'Z837TipDtoDto'},{av:'Z737PrdUcpDsc'},{av:'Z736PrdUcoDsc'},{av:'Z857ValDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDUNICOM","{handler:'valid_Prdunicom',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDUNICOM",",oparms:[{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDUNICON","{handler:'valid_Prdunicon',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A736PrdUcoDsc',fld:'PRDUCODSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDUNICON",",oparms:[{av:'A736PrdUcoDsc',fld:'PRDUCODSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_EMPCODSUS","{handler:'valid_Empcodsus',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_EMPCODSUS",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDSUS","{handler:'valid_Prdsus',iparms:[{av:'A394EmpCodSus',fld:'EMPCODSUS',pic:'@!'},{av:'A734PrdSus',fld:'PRDSUS',pic:''},{av:'A735PrdSusNom',fld:'PRDSUSNOM',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDSUS",",oparms:[{av:'A735PrdSusNom',fld:'PRDSUSNOM',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_VALCOD","{handler:'valid_Valcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_VALCOD",",oparms:[{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDREC",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDCALNEC","{handler:'valid_Prdcalnec',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDCALNEC",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDDETPAR","{handler:'valid_Prddetpar',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDDETPAR",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_TIPDTOCOD","{handler:'valid_Tipdtocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A835TipDtoCod',fld:'TIPDTOCOD',pic:'Z9'},{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_TIPDTOCOD",",oparms:[{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_METCOD","{handler:'valid_Metcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A629MetCod',fld:'METCOD',pic:'9'},{av:'A630MetDsc',fld:'METDSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_METCOD",",oparms:[{av:'A630MetDsc',fld:'METDSC',pic:''},{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDTIP","{handler:'valid_Prdtip',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDTIP",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
      setEventMetadata("VALID_PRDREV","{handler:'valid_Prdrev',iparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]");
      setEventMetadata("VALID_PRDREV",",oparms:[{av:'A8895PrdAltAct',fld:'PRDALTACT',pic:'9'},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'}]}");
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
      pr_default.close(24);
      pr_default.close(30);
      pr_default.close(27);
      pr_default.close(29);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(28);
      pr_default.close(9);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z703PrdDscTec = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z728PrdRefPrv = "" ;
      Z734PrdSus = "" ;
      Z727PrdRec = "" ;
      Z682PrdCalNec = "" ;
      Z698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z696PrdConDia = DecimalUtil.ZERO ;
      Z732PrdStkMinU = DecimalUtil.ZERO ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z714PrdFulPed = GXutil.nullDate() ;
      Z712PrdFulCC = GXutil.nullDate() ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z332DifValStk = DecimalUtil.ZERO ;
      Z708PrdFecEnt = GXutil.nullDate() ;
      Z1643PrdTip = "" ;
      Z3004PrdRev = "" ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z6191PrdNumCent = "" ;
      Z5590PrdSolub = DecimalUtil.ZERO ;
      Z7763PrdPreRef = DecimalUtil.ZERO ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8897PrdPesTerm = "" ;
      Z9734PrdNCAS = "" ;
      Z3936PrdEqLP = "" ;
      Z3937PrdConc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A719PrdNum = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A718PrdNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A703PrdDscTec = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A737PrdUcpDsc = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A736PrdUcoDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A794PrvNom = "" ;
      lblTextblock13_Jsonclick = "" ;
      A728PrdRefPrv = "" ;
      lblTextblock14_Jsonclick = "" ;
      A394EmpCodSus = "" ;
      lblTextblock15_Jsonclick = "" ;
      A734PrdSus = "" ;
      lblTextblock16_Jsonclick = "" ;
      A735PrdSusNom = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A857ValDsc = "" ;
      lblTextblock19_Jsonclick = "" ;
      A727PrdRec = "" ;
      lblTextblock20_Jsonclick = "" ;
      A682PrdCalNec = "" ;
      lblTextblock21_Jsonclick = "" ;
      A698PrdDetPar = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      A709PrdFecPre = GXutil.nullDate() ;
      lblTextblock28_Jsonclick = "" ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      lblTextblock29_Jsonclick = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      A696PrdConDia = DecimalUtil.ZERO ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A630MetDsc = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      lblTextblock39_Jsonclick = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      lblTextblock40_Jsonclick = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      lblTextblock41_Jsonclick = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      lblTextblock42_Jsonclick = "" ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      lblTextblock43_Jsonclick = "" ;
      A713PrdFulEnt = GXutil.nullDate() ;
      lblTextblock44_Jsonclick = "" ;
      A714PrdFulPed = GXutil.nullDate() ;
      lblTextblock45_Jsonclick = "" ;
      A712PrdFulCC = GXutil.nullDate() ;
      lblTextblock46_Jsonclick = "" ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      lblTextblock47_Jsonclick = "" ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      lblTextblock50_Jsonclick = "" ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      A750PrdValStk = DecimalUtil.ZERO ;
      lblTextblock53_Jsonclick = "" ;
      A332DifValStk = DecimalUtil.ZERO ;
      lblTextblock54_Jsonclick = "" ;
      A708PrdFecEnt = GXutil.nullDate() ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      A1643PrdTip = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      A3004PrdRev = "" ;
      lblTextblock60_Jsonclick = "" ;
      lblTextblock61_Jsonclick = "" ;
      lblTextblock62_Jsonclick = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      lblTextblock63_Jsonclick = "" ;
      A6191PrdNumCent = "" ;
      lblTextblock64_Jsonclick = "" ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      lblTextblock65_Jsonclick = "" ;
      A7763PrdPreRef = DecimalUtil.ZERO ;
      lblTextblock66_Jsonclick = "" ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      lblTextblock67_Jsonclick = "" ;
      A8897PrdPesTerm = "" ;
      lblTextblock68_Jsonclick = "" ;
      A9734PrdNCAS = "" ;
      lblTextblock69_Jsonclick = "" ;
      A3936PrdEqLP = "" ;
      lblTextblock70_Jsonclick = "" ;
      A3937PrdConc = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z737PrdUcpDsc = "" ;
      Z736PrdUcoDsc = "" ;
      Z794PrvNom = "" ;
      Z857ValDsc = "" ;
      Z837TipDtoDto = DecimalUtil.ZERO ;
      Z630MetDsc = "" ;
      T001X12_A719PrdNum = new String[] {""} ;
      T001X12_n719PrdNum = new boolean[] {false} ;
      T001X12_A407EmprNom = new String[] {""} ;
      T001X12_n407EmprNom = new boolean[] {false} ;
      T001X12_A718PrdNom = new String[] {""} ;
      T001X12_A703PrdDscTec = new String[] {""} ;
      T001X12_A737PrdUcpDsc = new String[] {""} ;
      T001X12_n737PrdUcpDsc = new boolean[] {false} ;
      T001X12_A736PrdUcoDsc = new String[] {""} ;
      T001X12_n736PrdUcoDsc = new boolean[] {false} ;
      T001X12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A794PrvNom = new String[] {""} ;
      T001X12_n794PrvNom = new boolean[] {false} ;
      T001X12_A728PrdRefPrv = new String[] {""} ;
      T001X12_A734PrdSus = new String[] {""} ;
      T001X12_n734PrdSus = new boolean[] {false} ;
      T001X12_A857ValDsc = new String[] {""} ;
      T001X12_n857ValDsc = new boolean[] {false} ;
      T001X12_A727PrdRec = new String[] {""} ;
      T001X12_A682PrdCalNec = new String[] {""} ;
      T001X12_A698PrdDetPar = new String[] {""} ;
      T001X12_A730PrdSit = new byte[1] ;
      T001X12_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_n837TipDtoDto = new boolean[] {false} ;
      T001X12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T001X12_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A731PrdStkMinD = new short[1] ;
      T001X12_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A699PrdDiaRot = new short[1] ;
      T001X12_A722PrdPlaEnt = new short[1] ;
      T001X12_A630MetDsc = new String[] {""} ;
      T001X12_n630MetDsc = new boolean[] {false} ;
      T001X12_A716PrdLotMin = new short[1] ;
      T001X12_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001X12_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      T001X12_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T001X12_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A738PrdUltCCC = new short[1] ;
      T001X12_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A695PrdConCC = new short[1] ;
      T001X12_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001X12_A1193PrdPosX = new short[1] ;
      T001X12_A1194PrdPosY = new byte[1] ;
      T001X12_A1643PrdTip = new String[] {""} ;
      T001X12_A1644PrdDqo = new short[1] ;
      T001X12_A3004PrdRev = new String[] {""} ;
      T001X12_A3273PrdTnq = new byte[1] ;
      T001X12_A4338PrdUMeFo = new byte[1] ;
      T001X12_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A6191PrdNumCent = new String[] {""} ;
      T001X12_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A7763PrdPreRef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_n7763PrdPreRef = new boolean[] {false} ;
      T001X12_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_A8895PrdAltAct = new byte[1] ;
      T001X12_n8895PrdAltAct = new boolean[] {false} ;
      T001X12_A8896PrdPesCon = new byte[1] ;
      T001X12_A8897PrdPesTerm = new String[] {""} ;
      T001X12_A9734PrdNCAS = new String[] {""} ;
      T001X12_A3936PrdEqLP = new String[] {""} ;
      T001X12_A3937PrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X12_n3937PrdConc = new boolean[] {false} ;
      T001X12_A396EmprCod = new String[] {""} ;
      T001X12_A629MetCod = new byte[1] ;
      T001X12_n629MetCod = new boolean[] {false} ;
      T001X12_A795PrvNum = new int[1] ;
      T001X12_A835TipDtoCod = new byte[1] ;
      T001X12_n835TipDtoCod = new boolean[] {false} ;
      T001X12_A742PrdUniCom = new byte[1] ;
      T001X12_A743PrdUniCon = new byte[1] ;
      T001X12_A856ValCod = new byte[1] ;
      T001X4_A407EmprNom = new String[] {""} ;
      T001X4_n407EmprNom = new boolean[] {false} ;
      T001X5_A630MetDsc = new String[] {""} ;
      T001X5_n630MetDsc = new boolean[] {false} ;
      T001X6_A794PrvNom = new String[] {""} ;
      T001X6_n794PrvNom = new boolean[] {false} ;
      T001X7_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X7_n837TipDtoDto = new boolean[] {false} ;
      T001X8_A737PrdUcpDsc = new String[] {""} ;
      T001X8_n737PrdUcpDsc = new boolean[] {false} ;
      T001X9_A736PrdUcoDsc = new String[] {""} ;
      T001X9_n736PrdUcoDsc = new boolean[] {false} ;
      T001X10_A857ValDsc = new String[] {""} ;
      T001X10_n857ValDsc = new boolean[] {false} ;
      T001X13_A407EmprNom = new String[] {""} ;
      T001X13_n407EmprNom = new boolean[] {false} ;
      T001X14_A630MetDsc = new String[] {""} ;
      T001X14_n630MetDsc = new boolean[] {false} ;
      T001X15_A794PrvNom = new String[] {""} ;
      T001X15_n794PrvNom = new boolean[] {false} ;
      T001X16_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X16_n837TipDtoDto = new boolean[] {false} ;
      T001X17_A737PrdUcpDsc = new String[] {""} ;
      T001X17_n737PrdUcpDsc = new boolean[] {false} ;
      T001X18_A736PrdUcoDsc = new String[] {""} ;
      T001X18_n736PrdUcoDsc = new boolean[] {false} ;
      T001X19_A857ValDsc = new String[] {""} ;
      T001X19_n857ValDsc = new boolean[] {false} ;
      T001X20_A396EmprCod = new String[] {""} ;
      T001X20_A719PrdNum = new String[] {""} ;
      T001X20_n719PrdNum = new boolean[] {false} ;
      T001X3_A719PrdNum = new String[] {""} ;
      T001X3_n719PrdNum = new boolean[] {false} ;
      T001X3_A718PrdNom = new String[] {""} ;
      T001X3_A703PrdDscTec = new String[] {""} ;
      T001X3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A728PrdRefPrv = new String[] {""} ;
      T001X3_A734PrdSus = new String[] {""} ;
      T001X3_n734PrdSus = new boolean[] {false} ;
      T001X3_A727PrdRec = new String[] {""} ;
      T001X3_A682PrdCalNec = new String[] {""} ;
      T001X3_A698PrdDetPar = new String[] {""} ;
      T001X3_A730PrdSit = new byte[1] ;
      T001X3_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T001X3_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A731PrdStkMinD = new short[1] ;
      T001X3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A699PrdDiaRot = new short[1] ;
      T001X3_A722PrdPlaEnt = new short[1] ;
      T001X3_A716PrdLotMin = new short[1] ;
      T001X3_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001X3_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      T001X3_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T001X3_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A738PrdUltCCC = new short[1] ;
      T001X3_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A695PrdConCC = new short[1] ;
      T001X3_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001X3_A1193PrdPosX = new short[1] ;
      T001X3_A1194PrdPosY = new byte[1] ;
      T001X3_A1643PrdTip = new String[] {""} ;
      T001X3_A1644PrdDqo = new short[1] ;
      T001X3_A3004PrdRev = new String[] {""} ;
      T001X3_A3273PrdTnq = new byte[1] ;
      T001X3_A4338PrdUMeFo = new byte[1] ;
      T001X3_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A6191PrdNumCent = new String[] {""} ;
      T001X3_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A7763PrdPreRef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_n7763PrdPreRef = new boolean[] {false} ;
      T001X3_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_A8895PrdAltAct = new byte[1] ;
      T001X3_n8895PrdAltAct = new boolean[] {false} ;
      T001X3_A8896PrdPesCon = new byte[1] ;
      T001X3_A8897PrdPesTerm = new String[] {""} ;
      T001X3_A9734PrdNCAS = new String[] {""} ;
      T001X3_A3936PrdEqLP = new String[] {""} ;
      T001X3_A3937PrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X3_n3937PrdConc = new boolean[] {false} ;
      T001X3_A396EmprCod = new String[] {""} ;
      T001X3_A629MetCod = new byte[1] ;
      T001X3_n629MetCod = new boolean[] {false} ;
      T001X3_A795PrvNum = new int[1] ;
      T001X3_A835TipDtoCod = new byte[1] ;
      T001X3_n835TipDtoCod = new boolean[] {false} ;
      T001X3_A742PrdUniCom = new byte[1] ;
      T001X3_A743PrdUniCon = new byte[1] ;
      T001X3_A856ValCod = new byte[1] ;
      sMode29 = "" ;
      T001X21_A396EmprCod = new String[] {""} ;
      T001X21_A719PrdNum = new String[] {""} ;
      T001X21_n719PrdNum = new boolean[] {false} ;
      T001X22_A396EmprCod = new String[] {""} ;
      T001X22_A719PrdNum = new String[] {""} ;
      T001X22_n719PrdNum = new boolean[] {false} ;
      T001X2_A719PrdNum = new String[] {""} ;
      T001X2_n719PrdNum = new boolean[] {false} ;
      T001X2_A718PrdNom = new String[] {""} ;
      T001X2_A703PrdDscTec = new String[] {""} ;
      T001X2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A728PrdRefPrv = new String[] {""} ;
      T001X2_A734PrdSus = new String[] {""} ;
      T001X2_n734PrdSus = new boolean[] {false} ;
      T001X2_A727PrdRec = new String[] {""} ;
      T001X2_A682PrdCalNec = new String[] {""} ;
      T001X2_A698PrdDetPar = new String[] {""} ;
      T001X2_A730PrdSit = new byte[1] ;
      T001X2_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T001X2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A731PrdStkMinD = new short[1] ;
      T001X2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A699PrdDiaRot = new short[1] ;
      T001X2_A722PrdPlaEnt = new short[1] ;
      T001X2_A716PrdLotMin = new short[1] ;
      T001X2_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001X2_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      T001X2_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T001X2_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A738PrdUltCCC = new short[1] ;
      T001X2_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A695PrdConCC = new short[1] ;
      T001X2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001X2_A1193PrdPosX = new short[1] ;
      T001X2_A1194PrdPosY = new byte[1] ;
      T001X2_A1643PrdTip = new String[] {""} ;
      T001X2_A1644PrdDqo = new short[1] ;
      T001X2_A3004PrdRev = new String[] {""} ;
      T001X2_A3273PrdTnq = new byte[1] ;
      T001X2_A4338PrdUMeFo = new byte[1] ;
      T001X2_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A6191PrdNumCent = new String[] {""} ;
      T001X2_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A7763PrdPreRef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_n7763PrdPreRef = new boolean[] {false} ;
      T001X2_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_A8895PrdAltAct = new byte[1] ;
      T001X2_n8895PrdAltAct = new boolean[] {false} ;
      T001X2_A8896PrdPesCon = new byte[1] ;
      T001X2_A8897PrdPesTerm = new String[] {""} ;
      T001X2_A9734PrdNCAS = new String[] {""} ;
      T001X2_A3936PrdEqLP = new String[] {""} ;
      T001X2_A3937PrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X2_n3937PrdConc = new boolean[] {false} ;
      T001X2_A396EmprCod = new String[] {""} ;
      T001X2_A629MetCod = new byte[1] ;
      T001X2_n629MetCod = new boolean[] {false} ;
      T001X2_A795PrvNum = new int[1] ;
      T001X2_A835TipDtoCod = new byte[1] ;
      T001X2_n835TipDtoCod = new boolean[] {false} ;
      T001X2_A742PrdUniCom = new byte[1] ;
      T001X2_A743PrdUniCon = new byte[1] ;
      T001X2_A856ValCod = new byte[1] ;
      T001X26_A407EmprNom = new String[] {""} ;
      T001X26_n407EmprNom = new boolean[] {false} ;
      T001X27_A737PrdUcpDsc = new String[] {""} ;
      T001X27_n737PrdUcpDsc = new boolean[] {false} ;
      T001X28_A736PrdUcoDsc = new String[] {""} ;
      T001X28_n736PrdUcoDsc = new boolean[] {false} ;
      T001X29_A794PrvNom = new String[] {""} ;
      T001X29_n794PrvNom = new boolean[] {false} ;
      T001X30_A857ValDsc = new String[] {""} ;
      T001X30_n857ValDsc = new boolean[] {false} ;
      T001X31_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001X31_n837TipDtoDto = new boolean[] {false} ;
      T001X32_A630MetDsc = new String[] {""} ;
      T001X32_n630MetDsc = new boolean[] {false} ;
      T001X33_A396EmprCod = new String[] {""} ;
      T001X33_A719PrdNum = new String[] {""} ;
      T001X33_n719PrdNum = new boolean[] {false} ;
      T001X33_A13217NormaID = new String[] {""} ;
      T001X34_A396EmprCod = new String[] {""} ;
      T001X34_A719PrdNum = new String[] {""} ;
      T001X34_n719PrdNum = new boolean[] {false} ;
      T001X34_A13586TheList = new String[] {""} ;
      T001X35_A396EmprCod = new String[] {""} ;
      T001X35_A5532Lb_numero = new int[1] ;
      T001X35_A5555Lb_opcion = new String[] {""} ;
      T001X35_A13460Lb_linCP = new short[1] ;
      T001X35_A13458Lb_TipCP = new String[] {""} ;
      T001X36_A396EmprCod = new String[] {""} ;
      T001X36_A13418AlbProID = new int[1] ;
      T001X36_A13442AlbProLine = new short[1] ;
      T001X37_A396EmprCod = new String[] {""} ;
      T001X37_A13324LDESID = new int[1] ;
      T001X37_A13333LDESNPeque = new String[] {""} ;
      T001X37_A13337LDESComb = new String[] {""} ;
      T001X37_A13339LDESFondo = new String[] {""} ;
      T001X37_A13342LDESLinea = new short[1] ;
      T001X38_A396EmprCod = new String[] {""} ;
      T001X38_A13312Lb_NLab = new int[1] ;
      T001X38_A13305Lb_IDVeces = new short[1] ;
      T001X38_A13306Lb_LinID = new short[1] ;
      T001X39_A396EmprCod = new String[] {""} ;
      T001X39_A12673LavMqId = new int[1] ;
      T001X39_A12692LavMqLnPq = new short[1] ;
      T001X39_A12681LavMqLn = new short[1] ;
      T001X40_A396EmprCod = new String[] {""} ;
      T001X40_A719PrdNum = new String[] {""} ;
      T001X40_n719PrdNum = new boolean[] {false} ;
      T001X40_A9713Tb1_Cod = new short[1] ;
      T001X41_A396EmprCod = new String[] {""} ;
      T001X41_A12236PrdNumD = new String[] {""} ;
      T001X41_A719PrdNum = new String[] {""} ;
      T001X41_n719PrdNum = new boolean[] {false} ;
      T001X42_A396EmprCod = new String[] {""} ;
      T001X42_A12225DocDisID = new long[1] ;
      T001X42_A12226LinDisID = new short[1] ;
      T001X43_A396EmprCod = new String[] {""} ;
      T001X43_A12225DocDisID = new long[1] ;
      T001X44_A396EmprCod = new String[] {""} ;
      T001X44_A12205OrdenCID = new long[1] ;
      T001X44_A12206OrdenCLnId = new short[1] ;
      T001X45_A396EmprCod = new String[] {""} ;
      T001X45_A719PrdNum = new String[] {""} ;
      T001X45_n719PrdNum = new boolean[] {false} ;
      T001X45_A11664LoteID = new String[] {""} ;
      T001X45_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001X46_A396EmprCod = new String[] {""} ;
      T001X46_A4850DevComCod = new int[1] ;
      T001X46_A719PrdNum = new String[] {""} ;
      T001X46_n719PrdNum = new boolean[] {false} ;
      T001X47_A396EmprCod = new String[] {""} ;
      T001X47_A252CliCod = new int[1] ;
      T001X47_A494ForSer = new String[] {""} ;
      T001X47_A482ForColNom = new String[] {""} ;
      T001X47_A483ForColNum = new int[1] ;
      T001X47_A831TipColCod = new byte[1] ;
      T001X47_A3571EnsCod = new String[] {""} ;
      T001X47_A3582EnsLin = new short[1] ;
      T001X48_A396EmprCod = new String[] {""} ;
      T001X48_A129BarCod = new int[1] ;
      T001X48_A132BarCodReo = new byte[1] ;
      T001X48_A130BarCodPar = new String[] {""} ;
      T001X48_A4075recestncol = new byte[1] ;
      T001X48_A4076recestnpro = new byte[1] ;
      T001X48_A4108recestlin = new short[1] ;
      T001X49_A396EmprCod = new String[] {""} ;
      T001X49_A4052EstNumFor = new int[1] ;
      T001X49_A4053EstNumCol = new byte[1] ;
      T001X49_A4090EstEspLin = new byte[1] ;
      T001X50_A396EmprCod = new String[] {""} ;
      T001X50_A4052EstNumFor = new int[1] ;
      T001X50_A4053EstNumCol = new byte[1] ;
      T001X50_A4084EstProLin = new byte[1] ;
      T001X51_A396EmprCod = new String[] {""} ;
      T001X51_A11644TransferId = new long[1] ;
      T001X51_A11653TransferLn = new int[1] ;
      T001X52_A396EmprCod = new String[] {""} ;
      T001X52_A11634TaesId = new String[] {""} ;
      T001X52_A11637TaesLn = new short[1] ;
      T001X52_A11641TaesLnP = new short[1] ;
      T001X53_A396EmprCod = new String[] {""} ;
      T001X53_A719PrdNum = new String[] {""} ;
      T001X53_n719PrdNum = new boolean[] {false} ;
      T001X53_A11329H_stklin = new long[1] ;
      T001X54_A396EmprCod = new String[] {""} ;
      T001X54_A11270Pot_num = new int[1] ;
      T001X54_A11271Pot_lin = new short[1] ;
      T001X55_A396EmprCod = new String[] {""} ;
      T001X55_A719PrdNum = new String[] {""} ;
      T001X55_n719PrdNum = new boolean[] {false} ;
      T001X55_A11199PrdNcasC = new String[] {""} ;
      T001X56_A396EmprCod = new String[] {""} ;
      T001X56_A719PrdNum = new String[] {""} ;
      T001X56_n719PrdNum = new boolean[] {false} ;
      T001X56_A11197CFraseR = new String[] {""} ;
      T001X57_A396EmprCod = new String[] {""} ;
      T001X57_A10243Jt_codigo = new short[1] ;
      T001X57_A10246Jt_ord = new short[1] ;
      T001X58_A396EmprCod = new String[] {""} ;
      T001X58_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T001X58_A10238Bny_lin = new short[1] ;
      T001X59_A396EmprCod = new String[] {""} ;
      T001X59_A129BarCod = new int[1] ;
      T001X59_A132BarCodReo = new byte[1] ;
      T001X59_A130BarCodPar = new String[] {""} ;
      T001X59_A758ProCod = new String[] {""} ;
      T001X59_A194BarOrdLin = new short[1] ;
      T001X59_A719PrdNum = new String[] {""} ;
      T001X59_n719PrdNum = new boolean[] {false} ;
      T001X60_A396EmprCod = new String[] {""} ;
      T001X60_A719PrdNum = new String[] {""} ;
      T001X60_n719PrdNum = new boolean[] {false} ;
      T001X60_A9735Cod_Rgo = new String[] {""} ;
      T001X61_A396EmprCod = new String[] {""} ;
      T001X61_A719PrdNum = new String[] {""} ;
      T001X61_n719PrdNum = new boolean[] {false} ;
      T001X61_A9711Ct_codigo = new short[1] ;
      T001X62_A396EmprCod = new String[] {""} ;
      T001X62_A9652OeNum = new long[1] ;
      T001X62_A9653OeHdr = new int[1] ;
      T001X62_A9654OeHdrr = new byte[1] ;
      T001X62_A9655OeHdrp = new String[] {""} ;
      T001X62_A9656OeLinC = new byte[1] ;
      T001X62_A9657OeComb = new String[] {""} ;
      T001X62_A9658Oefondo = new String[] {""} ;
      T001X62_A9659OeMolCil = new byte[1] ;
      T001X62_A9686OePasLin = new short[1] ;
      T001X62_A9694OePasPLi = new short[1] ;
      T001X63_A396EmprCod = new String[] {""} ;
      T001X63_A9652OeNum = new long[1] ;
      T001X63_A9653OeHdr = new int[1] ;
      T001X63_A9654OeHdrr = new byte[1] ;
      T001X63_A9655OeHdrp = new String[] {""} ;
      T001X63_A9656OeLinC = new byte[1] ;
      T001X63_A9657OeComb = new String[] {""} ;
      T001X63_A9658Oefondo = new String[] {""} ;
      T001X63_A9659OeMolCil = new byte[1] ;
      T001X63_A9677OeMolLin = new byte[1] ;
      T001X64_A396EmprCod = new String[] {""} ;
      T001X64_A9578Pas_Num = new int[1] ;
      T001X64_A719PrdNum = new String[] {""} ;
      T001X64_n719PrdNum = new boolean[] {false} ;
      T001X65_A396EmprCod = new String[] {""} ;
      T001X65_A719PrdNum = new String[] {""} ;
      T001X65_n719PrdNum = new boolean[] {false} ;
      T001X65_A8908CC_AlmCod = new byte[1] ;
      T001X66_A396EmprCod = new String[] {""} ;
      T001X66_A719PrdNum = new String[] {""} ;
      T001X66_n719PrdNum = new boolean[] {false} ;
      T001X66_A8661Almc_Ln = new int[1] ;
      T001X67_A396EmprCod = new String[] {""} ;
      T001X67_A719PrdNum = new String[] {""} ;
      T001X67_n719PrdNum = new boolean[] {false} ;
      T001X67_A8648Mat_PrdN = new String[] {""} ;
      T001X68_A396EmprCod = new String[] {""} ;
      T001X68_A8585Pet_cod = new long[1] ;
      T001X68_A719PrdNum = new String[] {""} ;
      T001X68_n719PrdNum = new boolean[] {false} ;
      T001X69_A396EmprCod = new String[] {""} ;
      T001X69_A719PrdNum = new String[] {""} ;
      T001X69_n719PrdNum = new boolean[] {false} ;
      T001X69_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T001X70_A396EmprCod = new String[] {""} ;
      T001X70_A719PrdNum = new String[] {""} ;
      T001X70_n719PrdNum = new boolean[] {false} ;
      T001X70_A8366PrdAnyo = new short[1] ;
      T001X70_A8360PrdProv = new int[1] ;
      T001X71_A396EmprCod = new String[] {""} ;
      T001X71_A252CliCod = new int[1] ;
      T001X71_A494ForSer = new String[] {""} ;
      T001X71_A482ForColNom = new String[] {""} ;
      T001X71_A483ForColNum = new int[1] ;
      T001X71_A831TipColCod = new byte[1] ;
      T001X71_A7797Sim_lin = new short[1] ;
      T001X72_A396EmprCod = new String[] {""} ;
      T001X72_A7163Vir_Codigo = new int[1] ;
      T001X72_A719PrdNum = new String[] {""} ;
      T001X72_n719PrdNum = new boolean[] {false} ;
      T001X73_A396EmprCod = new String[] {""} ;
      T001X73_A6310Lb_TaAuxC = new String[] {""} ;
      T001X73_A6313lb_TaAuxL = new short[1] ;
      T001X73_A6378Lb_TauxLP = new short[1] ;
      T001X74_A396EmprCod = new String[] {""} ;
      T001X74_A6290PreCoNum = new int[1] ;
      T001X74_A719PrdNum = new String[] {""} ;
      T001X74_n719PrdNum = new boolean[] {false} ;
      T001X75_A396EmprCod = new String[] {""} ;
      T001X75_A719PrdNum = new String[] {""} ;
      T001X75_n719PrdNum = new boolean[] {false} ;
      T001X75_A6158PrdPrv = new int[1] ;
      T001X76_A396EmprCod = new String[] {""} ;
      T001X76_A719PrdNum = new String[] {""} ;
      T001X76_n719PrdNum = new boolean[] {false} ;
      T001X76_A5973PrdSusNum = new String[] {""} ;
      T001X77_A396EmprCod = new String[] {""} ;
      T001X77_A5612Lb_CodGru = new String[] {""} ;
      T001X77_A5615Lb_LinGru = new short[1] ;
      T001X78_A396EmprCod = new String[] {""} ;
      T001X78_A5532Lb_numero = new int[1] ;
      T001X78_A5555Lb_opcion = new String[] {""} ;
      T001X78_A5560Lb_LineaPr = new short[1] ;
      T001X79_A396EmprCod = new String[] {""} ;
      T001X79_A5532Lb_numero = new int[1] ;
      T001X79_A5555Lb_opcion = new String[] {""} ;
      T001X79_A5557Lb_LineaC = new short[1] ;
      T001X80_A396EmprCod = new String[] {""} ;
      T001X80_A5145SobCod = new int[1] ;
      T001X80_A719PrdNum = new String[] {""} ;
      T001X80_n719PrdNum = new boolean[] {false} ;
      T001X81_A396EmprCod = new String[] {""} ;
      T001X81_A4744RecPreCod = new int[1] ;
      T001X81_A4762RecPreLin = new short[1] ;
      T001X81_A4763RecPreNli = new short[1] ;
      T001X82_A396EmprCod = new String[] {""} ;
      T001X82_A4492HreBarCod = new int[1] ;
      T001X82_A4493HreBarReo = new byte[1] ;
      T001X82_A4494HreBarPar = new String[] {""} ;
      T001X82_A4495HreNumCie = new byte[1] ;
      T001X82_A4545HreLinMaq = new short[1] ;
      T001X82_A4550HreLinPro = new byte[1] ;
      T001X82_A4557HreRecLin = new short[1] ;
      T001X83_A396EmprCod = new String[] {""} ;
      T001X83_A4492HreBarCod = new int[1] ;
      T001X83_A4493HreBarReo = new byte[1] ;
      T001X83_A4494HreBarPar = new String[] {""} ;
      T001X83_A4495HreNumCie = new byte[1] ;
      T001X83_A4508HreLinMAL = new short[1] ;
      T001X83_A4509HreNumAny = new byte[1] ;
      T001X83_A719PrdNum = new String[] {""} ;
      T001X83_n719PrdNum = new boolean[] {false} ;
      T001X84_A396EmprCod = new String[] {""} ;
      T001X84_A252CliCod = new int[1] ;
      T001X84_A4415EstCol = new String[] {""} ;
      T001X84_A4416EstColLin = new short[1] ;
      T001X85_A396EmprCod = new String[] {""} ;
      T001X85_A129BarCod = new int[1] ;
      T001X85_A132BarCodReo = new byte[1] ;
      T001X85_A130BarCodPar = new String[] {""} ;
      T001X85_A2524DisComLin = new byte[1] ;
      T001X85_A1056DisComCod = new String[] {""} ;
      T001X85_A1032FonCod = new String[] {""} ;
      T001X85_A2124RecMolCod = new byte[1] ;
      T001X85_A2672RecPasLin = new short[1] ;
      T001X85_A2675RecPasPLi = new short[1] ;
      T001X86_A396EmprCod = new String[] {""} ;
      T001X86_A129BarCod = new int[1] ;
      T001X86_A132BarCodReo = new byte[1] ;
      T001X86_A130BarCodPar = new String[] {""} ;
      T001X86_A2524DisComLin = new byte[1] ;
      T001X86_A1056DisComCod = new String[] {""} ;
      T001X86_A1032FonCod = new String[] {""} ;
      T001X86_A2124RecMolCod = new byte[1] ;
      T001X86_A2126RecMolLin = new byte[1] ;
      T001X87_A396EmprCod = new String[] {""} ;
      T001X87_A2107PasCod = new String[] {""} ;
      T001X87_A719PrdNum = new String[] {""} ;
      T001X87_n719PrdNum = new boolean[] {false} ;
      T001X88_A396EmprCod = new String[] {""} ;
      T001X88_A2637HisEstHRu = new int[1] ;
      T001X88_A2636HisEstHRe = new byte[1] ;
      T001X88_A2635HisEstHPa = new String[] {""} ;
      T001X88_A2638HisEstLCo = new byte[1] ;
      T001X88_A2630HisEstCom = new String[] {""} ;
      T001X88_A2634HisEstFon = new String[] {""} ;
      T001X88_A719PrdNum = new String[] {""} ;
      T001X88_n719PrdNum = new boolean[] {false} ;
      T001X89_A396EmprCod = new String[] {""} ;
      T001X89_A252CliCod = new int[1] ;
      T001X89_A2141SerEst = new String[] {""} ;
      T001X89_A1013DibCli = new String[] {""} ;
      T001X89_A1014DibInt = new int[1] ;
      T001X89_A2074ColCom = new String[] {""} ;
      T001X89_A2078ColFon = new String[] {""} ;
      T001X89_A2098MolCod = new byte[1] ;
      T001X89_A2535ForPrdLin = new short[1] ;
      T001X90_A396EmprCod = new String[] {""} ;
      T001X90_A719PrdNum = new String[] {""} ;
      T001X90_n719PrdNum = new boolean[] {false} ;
      T001X90_A3342CCStkLin = new long[1] ;
      T001X91_A396EmprCod = new String[] {""} ;
      T001X91_A252CliCod = new int[1] ;
      T001X91_A2891HMaForSer = new String[] {""} ;
      T001X91_A2892HMaForCNom = new String[] {""} ;
      T001X91_A2893HMaForCNum = new int[1] ;
      T001X91_A2894HMaTipCCod = new byte[1] ;
      T001X91_A2895HMaForNumC = new int[1] ;
      T001X91_A2897HMaColLin = new short[1] ;
      T001X91_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001X91_A2907HmaLin = new short[1] ;
      T001X92_A396EmprCod = new String[] {""} ;
      T001X92_A129BarCod = new int[1] ;
      T001X92_A132BarCodReo = new byte[1] ;
      T001X92_A130BarCodPar = new String[] {""} ;
      T001X92_A2808RecLinMAL = new short[1] ;
      T001X92_A1377RecNumAny = new byte[1] ;
      T001X92_A719PrdNum = new String[] {""} ;
      T001X92_n719PrdNum = new boolean[] {false} ;
      T001X93_A396EmprCod = new String[] {""} ;
      T001X93_A129BarCod = new int[1] ;
      T001X93_A132BarCodReo = new byte[1] ;
      T001X93_A130BarCodPar = new String[] {""} ;
      T001X93_A2804RecLinMaq = new short[1] ;
      T001X93_A1273RecLinPro = new byte[1] ;
      T001X93_A811RecLin = new short[1] ;
      T001X94_A396EmprCod = new String[] {""} ;
      T001X94_A129BarCod = new int[1] ;
      T001X94_A132BarCodReo = new byte[1] ;
      T001X94_A130BarCodPar = new String[] {""} ;
      T001X94_A2494BarDosPro = new String[] {""} ;
      T001X94_A719PrdNum = new String[] {""} ;
      T001X94_n719PrdNum = new boolean[] {false} ;
      T001X95_A396EmprCod = new String[] {""} ;
      T001X95_A1314EnsLabCod = new int[1] ;
      T001X95_A1317EnsLabLin = new short[1] ;
      T001X96_A396EmprCod = new String[] {""} ;
      T001X96_A910Workstat = new String[] {""} ;
      T001X96_A887EscMLin = new int[1] ;
      T001X97_A396EmprCod = new String[] {""} ;
      T001X97_A859CumCodCont = new int[1] ;
      T001X97_A719PrdNum = new String[] {""} ;
      T001X97_n719PrdNum = new boolean[] {false} ;
      T001X98_A396EmprCod = new String[] {""} ;
      T001X98_A719PrdNum = new String[] {""} ;
      T001X98_n719PrdNum = new boolean[] {false} ;
      T001X98_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001X99_A396EmprCod = new String[] {""} ;
      T001X99_A486ForNumCol = new int[1] ;
      T001X99_A715PrdLin = new short[1] ;
      T001X100_A396EmprCod = new String[] {""} ;
      T001X100_A719PrdNum = new String[] {""} ;
      T001X100_n719PrdNum = new boolean[] {false} ;
      T001X100_A681PrdAny = new short[1] ;
      T001X101_A396EmprCod = new String[] {""} ;
      T001X101_A719PrdNum = new String[] {""} ;
      T001X101_n719PrdNum = new boolean[] {false} ;
      T001X101_A688PrdComCod = new String[] {""} ;
      T001X102_A396EmprCod = new String[] {""} ;
      T001X102_A719PrdNum = new String[] {""} ;
      T001X102_n719PrdNum = new boolean[] {false} ;
      T001X102_A680PrdAltNum = new String[] {""} ;
      T001X103_A396EmprCod = new String[] {""} ;
      T001X103_A658PedCod = new int[1] ;
      T001X103_A719PrdNum = new String[] {""} ;
      T001X103_n719PrdNum = new boolean[] {false} ;
      T001X104_A396EmprCod = new String[] {""} ;
      T001X104_A486ForNumCol = new int[1] ;
      T001X104_A309ColLin = new short[1] ;
      T001X105_A396EmprCod = new String[] {""} ;
      T001X105_A719PrdNum = new String[] {""} ;
      T001X105_n719PrdNum = new boolean[] {false} ;
      T001X105_A647NumCon = new int[1] ;
      T001X106_A396EmprCod = new String[] {""} ;
      T001X106_A719PrdNum = new String[] {""} ;
      T001X106_n719PrdNum = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z394EmpCodSus = "" ;
      Z735PrdSusNom = "" ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ394EmpCodSus = "" ;
      ZZ735PrdSusNom = "" ;
      ZZ718PrdNom = "" ;
      ZZ703PrdDscTec = "" ;
      ZZ707PrdFacCon = DecimalUtil.ZERO ;
      ZZ728PrdRefPrv = "" ;
      ZZ734PrdSus = "" ;
      ZZ727PrdRec = "" ;
      ZZ682PrdCalNec = "" ;
      ZZ698PrdDetPar = "" ;
      ZZ729PrdRotRea = DecimalUtil.ZERO ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ709PrdFecPre = GXutil.nullDate() ;
      ZZ725PrdPreAnt = DecimalUtil.ZERO ;
      ZZ726PrdPreMed = DecimalUtil.ZERO ;
      ZZ696PrdConDia = DecimalUtil.ZERO ;
      ZZ732PrdStkMinU = DecimalUtil.ZERO ;
      ZZ721PrdNumUco = DecimalUtil.ZERO ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ685PrdCanRes = DecimalUtil.ZERO ;
      ZZ684PrdCanPen = DecimalUtil.ZERO ;
      ZZ713PrdFulEnt = GXutil.nullDate() ;
      ZZ714PrdFulPed = GXutil.nullDate() ;
      ZZ712PrdFulCC = GXutil.nullDate() ;
      ZZ706PrdExiCCP = DecimalUtil.ZERO ;
      ZZ740PrdUltECC = DecimalUtil.ZERO ;
      ZZ739PrdUltDCC = DecimalUtil.ZERO ;
      ZZ700PrdDifCC = DecimalUtil.ZERO ;
      ZZ750PrdValStk = DecimalUtil.ZERO ;
      ZZ332DifValStk = DecimalUtil.ZERO ;
      ZZ708PrdFecEnt = GXutil.nullDate() ;
      ZZ1643PrdTip = "" ;
      ZZ3004PrdRev = "" ;
      ZZ5255PrdPreAc2 = DecimalUtil.ZERO ;
      ZZ6191PrdNumCent = "" ;
      ZZ5590PrdSolub = DecimalUtil.ZERO ;
      ZZ7763PrdPreRef = DecimalUtil.ZERO ;
      ZZ8659PrdExiAlmc = DecimalUtil.ZERO ;
      ZZ8897PrdPesTerm = "" ;
      ZZ9734PrdNCAS = "" ;
      ZZ3936PrdEqLP = "" ;
      ZZ3937PrdConc = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ630MetDsc = "" ;
      ZZ794PrvNom = "" ;
      ZZ837TipDtoDto = DecimalUtil.ZERO ;
      ZZ737PrdUcpDsc = "" ;
      ZZ736PrdUcoDsc = "" ;
      ZZ857ValDsc = "" ;
      T001X11_A735PrdSusNom = new String[] {""} ;
      T001X11_n735PrdSusNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprdgen__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprdgen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprdgen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprdgen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdgen__default(),
         new Object[] {
             new Object[] {
            T001X2_A719PrdNum, T001X2_A718PrdNom, T001X2_A703PrdDscTec, T001X2_A707PrdFacCon, T001X2_A728PrdRefPrv, T001X2_A734PrdSus, T001X2_n734PrdSus, T001X2_A727PrdRec, T001X2_A682PrdCalNec, T001X2_A698PrdDetPar,
            T001X2_A730PrdSit, T001X2_A729PrdRotRea, T001X2_A724PrdPreAct, T001X2_A709PrdFecPre, T001X2_A725PrdPreAnt, T001X2_A726PrdPreMed, T001X2_A696PrdConDia, T001X2_A731PrdStkMinD, T001X2_A732PrdStkMinU, T001X2_A699PrdDiaRot,
            T001X2_A722PrdPlaEnt, T001X2_A716PrdLotMin, T001X2_A721PrdNumUco, T001X2_A704PrdExiAlm, T001X2_A705PrdExiCC, T001X2_A685PrdCanRes, T001X2_A684PrdCanPen, T001X2_A713PrdFulEnt, T001X2_A714PrdFulPed, T001X2_A712PrdFulCC,
            T001X2_A706PrdExiCCP, T001X2_A740PrdUltECC, T001X2_A738PrdUltCCC, T001X2_A739PrdUltDCC, T001X2_A700PrdDifCC, T001X2_A695PrdConCC, T001X2_A750PrdValStk, T001X2_A332DifValStk, T001X2_A708PrdFecEnt, T001X2_A1193PrdPosX,
            T001X2_A1194PrdPosY, T001X2_A1643PrdTip, T001X2_A1644PrdDqo, T001X2_A3004PrdRev, T001X2_A3273PrdTnq, T001X2_A4338PrdUMeFo, T001X2_A5255PrdPreAc2, T001X2_A6191PrdNumCent, T001X2_A5590PrdSolub, T001X2_A7763PrdPreRef,
            T001X2_n7763PrdPreRef, T001X2_A8659PrdExiAlmc, T001X2_A8895PrdAltAct, T001X2_n8895PrdAltAct, T001X2_A8896PrdPesCon, T001X2_A8897PrdPesTerm, T001X2_A9734PrdNCAS, T001X2_A3936PrdEqLP, T001X2_A3937PrdConc, T001X2_n3937PrdConc,
            T001X2_A396EmprCod, T001X2_A629MetCod, T001X2_n629MetCod, T001X2_A795PrvNum, T001X2_A835TipDtoCod, T001X2_n835TipDtoCod, T001X2_A742PrdUniCom, T001X2_A743PrdUniCon, T001X2_A856ValCod
            }
            , new Object[] {
            T001X3_A719PrdNum, T001X3_A718PrdNom, T001X3_A703PrdDscTec, T001X3_A707PrdFacCon, T001X3_A728PrdRefPrv, T001X3_A734PrdSus, T001X3_n734PrdSus, T001X3_A727PrdRec, T001X3_A682PrdCalNec, T001X3_A698PrdDetPar,
            T001X3_A730PrdSit, T001X3_A729PrdRotRea, T001X3_A724PrdPreAct, T001X3_A709PrdFecPre, T001X3_A725PrdPreAnt, T001X3_A726PrdPreMed, T001X3_A696PrdConDia, T001X3_A731PrdStkMinD, T001X3_A732PrdStkMinU, T001X3_A699PrdDiaRot,
            T001X3_A722PrdPlaEnt, T001X3_A716PrdLotMin, T001X3_A721PrdNumUco, T001X3_A704PrdExiAlm, T001X3_A705PrdExiCC, T001X3_A685PrdCanRes, T001X3_A684PrdCanPen, T001X3_A713PrdFulEnt, T001X3_A714PrdFulPed, T001X3_A712PrdFulCC,
            T001X3_A706PrdExiCCP, T001X3_A740PrdUltECC, T001X3_A738PrdUltCCC, T001X3_A739PrdUltDCC, T001X3_A700PrdDifCC, T001X3_A695PrdConCC, T001X3_A750PrdValStk, T001X3_A332DifValStk, T001X3_A708PrdFecEnt, T001X3_A1193PrdPosX,
            T001X3_A1194PrdPosY, T001X3_A1643PrdTip, T001X3_A1644PrdDqo, T001X3_A3004PrdRev, T001X3_A3273PrdTnq, T001X3_A4338PrdUMeFo, T001X3_A5255PrdPreAc2, T001X3_A6191PrdNumCent, T001X3_A5590PrdSolub, T001X3_A7763PrdPreRef,
            T001X3_n7763PrdPreRef, T001X3_A8659PrdExiAlmc, T001X3_A8895PrdAltAct, T001X3_n8895PrdAltAct, T001X3_A8896PrdPesCon, T001X3_A8897PrdPesTerm, T001X3_A9734PrdNCAS, T001X3_A3936PrdEqLP, T001X3_A3937PrdConc, T001X3_n3937PrdConc,
            T001X3_A396EmprCod, T001X3_A629MetCod, T001X3_n629MetCod, T001X3_A795PrvNum, T001X3_A835TipDtoCod, T001X3_n835TipDtoCod, T001X3_A742PrdUniCom, T001X3_A743PrdUniCon, T001X3_A856ValCod
            }
            , new Object[] {
            T001X4_A407EmprNom, T001X4_n407EmprNom
            }
            , new Object[] {
            T001X5_A630MetDsc, T001X5_n630MetDsc
            }
            , new Object[] {
            T001X6_A794PrvNom, T001X6_n794PrvNom
            }
            , new Object[] {
            T001X7_A837TipDtoDto, T001X7_n837TipDtoDto
            }
            , new Object[] {
            T001X8_A737PrdUcpDsc, T001X8_n737PrdUcpDsc
            }
            , new Object[] {
            T001X9_A736PrdUcoDsc, T001X9_n736PrdUcoDsc
            }
            , new Object[] {
            T001X10_A857ValDsc, T001X10_n857ValDsc
            }
            , new Object[] {
            T001X11_A735PrdSusNom, T001X11_n735PrdSusNom
            }
            , new Object[] {
            T001X12_A719PrdNum, T001X12_A407EmprNom, T001X12_n407EmprNom, T001X12_A718PrdNom, T001X12_A703PrdDscTec, T001X12_A737PrdUcpDsc, T001X12_n737PrdUcpDsc, T001X12_A736PrdUcoDsc, T001X12_n736PrdUcoDsc, T001X12_A707PrdFacCon,
            T001X12_A794PrvNom, T001X12_n794PrvNom, T001X12_A728PrdRefPrv, T001X12_A734PrdSus, T001X12_n734PrdSus, T001X12_A857ValDsc, T001X12_n857ValDsc, T001X12_A727PrdRec, T001X12_A682PrdCalNec, T001X12_A698PrdDetPar,
            T001X12_A730PrdSit, T001X12_A729PrdRotRea, T001X12_A837TipDtoDto, T001X12_n837TipDtoDto, T001X12_A724PrdPreAct, T001X12_A709PrdFecPre, T001X12_A725PrdPreAnt, T001X12_A726PrdPreMed, T001X12_A696PrdConDia, T001X12_A731PrdStkMinD,
            T001X12_A732PrdStkMinU, T001X12_A699PrdDiaRot, T001X12_A722PrdPlaEnt, T001X12_A630MetDsc, T001X12_n630MetDsc, T001X12_A716PrdLotMin, T001X12_A721PrdNumUco, T001X12_A704PrdExiAlm, T001X12_A705PrdExiCC, T001X12_A685PrdCanRes,
            T001X12_A684PrdCanPen, T001X12_A713PrdFulEnt, T001X12_A714PrdFulPed, T001X12_A712PrdFulCC, T001X12_A706PrdExiCCP, T001X12_A740PrdUltECC, T001X12_A738PrdUltCCC, T001X12_A739PrdUltDCC, T001X12_A700PrdDifCC, T001X12_A695PrdConCC,
            T001X12_A750PrdValStk, T001X12_A332DifValStk, T001X12_A708PrdFecEnt, T001X12_A1193PrdPosX, T001X12_A1194PrdPosY, T001X12_A1643PrdTip, T001X12_A1644PrdDqo, T001X12_A3004PrdRev, T001X12_A3273PrdTnq, T001X12_A4338PrdUMeFo,
            T001X12_A5255PrdPreAc2, T001X12_A6191PrdNumCent, T001X12_A5590PrdSolub, T001X12_A7763PrdPreRef, T001X12_n7763PrdPreRef, T001X12_A8659PrdExiAlmc, T001X12_A8895PrdAltAct, T001X12_n8895PrdAltAct, T001X12_A8896PrdPesCon, T001X12_A8897PrdPesTerm,
            T001X12_A9734PrdNCAS, T001X12_A3936PrdEqLP, T001X12_A3937PrdConc, T001X12_n3937PrdConc, T001X12_A396EmprCod, T001X12_A629MetCod, T001X12_n629MetCod, T001X12_A795PrvNum, T001X12_A835TipDtoCod, T001X12_n835TipDtoCod,
            T001X12_A742PrdUniCom, T001X12_A743PrdUniCon, T001X12_A856ValCod
            }
            , new Object[] {
            T001X13_A407EmprNom, T001X13_n407EmprNom
            }
            , new Object[] {
            T001X14_A630MetDsc, T001X14_n630MetDsc
            }
            , new Object[] {
            T001X15_A794PrvNom, T001X15_n794PrvNom
            }
            , new Object[] {
            T001X16_A837TipDtoDto, T001X16_n837TipDtoDto
            }
            , new Object[] {
            T001X17_A737PrdUcpDsc, T001X17_n737PrdUcpDsc
            }
            , new Object[] {
            T001X18_A736PrdUcoDsc, T001X18_n736PrdUcoDsc
            }
            , new Object[] {
            T001X19_A857ValDsc, T001X19_n857ValDsc
            }
            , new Object[] {
            T001X20_A396EmprCod, T001X20_A719PrdNum
            }
            , new Object[] {
            T001X21_A396EmprCod, T001X21_A719PrdNum
            }
            , new Object[] {
            T001X22_A396EmprCod, T001X22_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001X26_A407EmprNom, T001X26_n407EmprNom
            }
            , new Object[] {
            T001X27_A737PrdUcpDsc, T001X27_n737PrdUcpDsc
            }
            , new Object[] {
            T001X28_A736PrdUcoDsc, T001X28_n736PrdUcoDsc
            }
            , new Object[] {
            T001X29_A794PrvNom, T001X29_n794PrvNom
            }
            , new Object[] {
            T001X30_A857ValDsc, T001X30_n857ValDsc
            }
            , new Object[] {
            T001X31_A837TipDtoDto, T001X31_n837TipDtoDto
            }
            , new Object[] {
            T001X32_A630MetDsc, T001X32_n630MetDsc
            }
            , new Object[] {
            T001X33_A396EmprCod, T001X33_A719PrdNum, T001X33_A13217NormaID
            }
            , new Object[] {
            T001X34_A396EmprCod, T001X34_A719PrdNum, T001X34_A13586TheList
            }
            , new Object[] {
            T001X35_A396EmprCod, T001X35_A5532Lb_numero, T001X35_A5555Lb_opcion, T001X35_A13460Lb_linCP, T001X35_A13458Lb_TipCP
            }
            , new Object[] {
            T001X36_A396EmprCod, T001X36_A13418AlbProID, T001X36_A13442AlbProLine
            }
            , new Object[] {
            T001X37_A396EmprCod, T001X37_A13324LDESID, T001X37_A13333LDESNPeque, T001X37_A13337LDESComb, T001X37_A13339LDESFondo, T001X37_A13342LDESLinea
            }
            , new Object[] {
            T001X38_A396EmprCod, T001X38_A13312Lb_NLab, T001X38_A13305Lb_IDVeces, T001X38_A13306Lb_LinID
            }
            , new Object[] {
            T001X39_A396EmprCod, T001X39_A12673LavMqId, T001X39_A12692LavMqLnPq, T001X39_A12681LavMqLn
            }
            , new Object[] {
            T001X40_A396EmprCod, T001X40_A719PrdNum, T001X40_A9713Tb1_Cod
            }
            , new Object[] {
            T001X41_A396EmprCod, T001X41_A12236PrdNumD, T001X41_A719PrdNum
            }
            , new Object[] {
            T001X42_A396EmprCod, T001X42_A12225DocDisID, T001X42_A12226LinDisID
            }
            , new Object[] {
            T001X43_A396EmprCod, T001X43_A12225DocDisID
            }
            , new Object[] {
            T001X44_A396EmprCod, T001X44_A12205OrdenCID, T001X44_A12206OrdenCLnId
            }
            , new Object[] {
            T001X45_A396EmprCod, T001X45_A719PrdNum, T001X45_A11664LoteID, T001X45_A11665LoteFec
            }
            , new Object[] {
            T001X46_A396EmprCod, T001X46_A4850DevComCod, T001X46_A719PrdNum
            }
            , new Object[] {
            T001X47_A396EmprCod, T001X47_A252CliCod, T001X47_A494ForSer, T001X47_A482ForColNom, T001X47_A483ForColNum, T001X47_A831TipColCod, T001X47_A3571EnsCod, T001X47_A3582EnsLin
            }
            , new Object[] {
            T001X48_A396EmprCod, T001X48_A129BarCod, T001X48_A132BarCodReo, T001X48_A130BarCodPar, T001X48_A4075recestncol, T001X48_A4076recestnpro, T001X48_A4108recestlin
            }
            , new Object[] {
            T001X49_A396EmprCod, T001X49_A4052EstNumFor, T001X49_A4053EstNumCol, T001X49_A4090EstEspLin
            }
            , new Object[] {
            T001X50_A396EmprCod, T001X50_A4052EstNumFor, T001X50_A4053EstNumCol, T001X50_A4084EstProLin
            }
            , new Object[] {
            T001X51_A396EmprCod, T001X51_A11644TransferId, T001X51_A11653TransferLn
            }
            , new Object[] {
            T001X52_A396EmprCod, T001X52_A11634TaesId, T001X52_A11637TaesLn, T001X52_A11641TaesLnP
            }
            , new Object[] {
            T001X53_A396EmprCod, T001X53_A719PrdNum, T001X53_A11329H_stklin
            }
            , new Object[] {
            T001X54_A396EmprCod, T001X54_A11270Pot_num, T001X54_A11271Pot_lin
            }
            , new Object[] {
            T001X55_A396EmprCod, T001X55_A719PrdNum, T001X55_A11199PrdNcasC
            }
            , new Object[] {
            T001X56_A396EmprCod, T001X56_A719PrdNum, T001X56_A11197CFraseR
            }
            , new Object[] {
            T001X57_A396EmprCod, T001X57_A10243Jt_codigo, T001X57_A10246Jt_ord
            }
            , new Object[] {
            T001X58_A396EmprCod, T001X58_A10236Bny_dia, T001X58_A10238Bny_lin
            }
            , new Object[] {
            T001X59_A396EmprCod, T001X59_A129BarCod, T001X59_A132BarCodReo, T001X59_A130BarCodPar, T001X59_A758ProCod, T001X59_A194BarOrdLin, T001X59_A719PrdNum
            }
            , new Object[] {
            T001X60_A396EmprCod, T001X60_A719PrdNum, T001X60_A9735Cod_Rgo
            }
            , new Object[] {
            T001X61_A396EmprCod, T001X61_A719PrdNum, T001X61_A9711Ct_codigo
            }
            , new Object[] {
            T001X62_A396EmprCod, T001X62_A9652OeNum, T001X62_A9653OeHdr, T001X62_A9654OeHdrr, T001X62_A9655OeHdrp, T001X62_A9656OeLinC, T001X62_A9657OeComb, T001X62_A9658Oefondo, T001X62_A9659OeMolCil, T001X62_A9686OePasLin,
            T001X62_A9694OePasPLi
            }
            , new Object[] {
            T001X63_A396EmprCod, T001X63_A9652OeNum, T001X63_A9653OeHdr, T001X63_A9654OeHdrr, T001X63_A9655OeHdrp, T001X63_A9656OeLinC, T001X63_A9657OeComb, T001X63_A9658Oefondo, T001X63_A9659OeMolCil, T001X63_A9677OeMolLin
            }
            , new Object[] {
            T001X64_A396EmprCod, T001X64_A9578Pas_Num, T001X64_A719PrdNum
            }
            , new Object[] {
            T001X65_A396EmprCod, T001X65_A719PrdNum, T001X65_A8908CC_AlmCod
            }
            , new Object[] {
            T001X66_A396EmprCod, T001X66_A719PrdNum, T001X66_A8661Almc_Ln
            }
            , new Object[] {
            T001X67_A396EmprCod, T001X67_A719PrdNum, T001X67_A8648Mat_PrdN
            }
            , new Object[] {
            T001X68_A396EmprCod, T001X68_A8585Pet_cod, T001X68_A719PrdNum
            }
            , new Object[] {
            T001X69_A396EmprCod, T001X69_A719PrdNum, T001X69_A8577RecFecHr
            }
            , new Object[] {
            T001X70_A396EmprCod, T001X70_A719PrdNum, T001X70_A8366PrdAnyo, T001X70_A8360PrdProv
            }
            , new Object[] {
            T001X71_A396EmprCod, T001X71_A252CliCod, T001X71_A494ForSer, T001X71_A482ForColNom, T001X71_A483ForColNum, T001X71_A831TipColCod, T001X71_A7797Sim_lin
            }
            , new Object[] {
            T001X72_A396EmprCod, T001X72_A7163Vir_Codigo, T001X72_A719PrdNum
            }
            , new Object[] {
            T001X73_A396EmprCod, T001X73_A6310Lb_TaAuxC, T001X73_A6313lb_TaAuxL, T001X73_A6378Lb_TauxLP
            }
            , new Object[] {
            T001X74_A396EmprCod, T001X74_A6290PreCoNum, T001X74_A719PrdNum
            }
            , new Object[] {
            T001X75_A396EmprCod, T001X75_A719PrdNum, T001X75_A6158PrdPrv
            }
            , new Object[] {
            T001X76_A396EmprCod, T001X76_A719PrdNum, T001X76_A5973PrdSusNum
            }
            , new Object[] {
            T001X77_A396EmprCod, T001X77_A5612Lb_CodGru, T001X77_A5615Lb_LinGru
            }
            , new Object[] {
            T001X78_A396EmprCod, T001X78_A5532Lb_numero, T001X78_A5555Lb_opcion, T001X78_A5560Lb_LineaPr
            }
            , new Object[] {
            T001X79_A396EmprCod, T001X79_A5532Lb_numero, T001X79_A5555Lb_opcion, T001X79_A5557Lb_LineaC
            }
            , new Object[] {
            T001X80_A396EmprCod, T001X80_A5145SobCod, T001X80_A719PrdNum
            }
            , new Object[] {
            T001X81_A396EmprCod, T001X81_A4744RecPreCod, T001X81_A4762RecPreLin, T001X81_A4763RecPreNli
            }
            , new Object[] {
            T001X82_A396EmprCod, T001X82_A4492HreBarCod, T001X82_A4493HreBarReo, T001X82_A4494HreBarPar, T001X82_A4495HreNumCie, T001X82_A4545HreLinMaq, T001X82_A4550HreLinPro, T001X82_A4557HreRecLin
            }
            , new Object[] {
            T001X83_A396EmprCod, T001X83_A4492HreBarCod, T001X83_A4493HreBarReo, T001X83_A4494HreBarPar, T001X83_A4495HreNumCie, T001X83_A4508HreLinMAL, T001X83_A4509HreNumAny, T001X83_A719PrdNum
            }
            , new Object[] {
            T001X84_A396EmprCod, T001X84_A252CliCod, T001X84_A4415EstCol, T001X84_A4416EstColLin
            }
            , new Object[] {
            T001X85_A396EmprCod, T001X85_A129BarCod, T001X85_A132BarCodReo, T001X85_A130BarCodPar, T001X85_A2524DisComLin, T001X85_A1056DisComCod, T001X85_A1032FonCod, T001X85_A2124RecMolCod, T001X85_A2672RecPasLin, T001X85_A2675RecPasPLi
            }
            , new Object[] {
            T001X86_A396EmprCod, T001X86_A129BarCod, T001X86_A132BarCodReo, T001X86_A130BarCodPar, T001X86_A2524DisComLin, T001X86_A1056DisComCod, T001X86_A1032FonCod, T001X86_A2124RecMolCod, T001X86_A2126RecMolLin
            }
            , new Object[] {
            T001X87_A396EmprCod, T001X87_A2107PasCod, T001X87_A719PrdNum
            }
            , new Object[] {
            T001X88_A396EmprCod, T001X88_A2637HisEstHRu, T001X88_A2636HisEstHRe, T001X88_A2635HisEstHPa, T001X88_A2638HisEstLCo, T001X88_A2630HisEstCom, T001X88_A2634HisEstFon, T001X88_A719PrdNum
            }
            , new Object[] {
            T001X89_A396EmprCod, T001X89_A252CliCod, T001X89_A2141SerEst, T001X89_A1013DibCli, T001X89_A1014DibInt, T001X89_A2074ColCom, T001X89_A2078ColFon, T001X89_A2098MolCod, T001X89_A2535ForPrdLin
            }
            , new Object[] {
            T001X90_A396EmprCod, T001X90_A719PrdNum, T001X90_A3342CCStkLin
            }
            , new Object[] {
            T001X91_A396EmprCod, T001X91_A252CliCod, T001X91_A2891HMaForSer, T001X91_A2892HMaForCNom, T001X91_A2893HMaForCNum, T001X91_A2894HMaTipCCod, T001X91_A2895HMaForNumC, T001X91_A2897HMaColLin, T001X91_A2896HMaFec, T001X91_A2907HmaLin
            }
            , new Object[] {
            T001X92_A396EmprCod, T001X92_A129BarCod, T001X92_A132BarCodReo, T001X92_A130BarCodPar, T001X92_A2808RecLinMAL, T001X92_A1377RecNumAny, T001X92_A719PrdNum
            }
            , new Object[] {
            T001X93_A396EmprCod, T001X93_A129BarCod, T001X93_A132BarCodReo, T001X93_A130BarCodPar, T001X93_A2804RecLinMaq, T001X93_A1273RecLinPro, T001X93_A811RecLin
            }
            , new Object[] {
            T001X94_A396EmprCod, T001X94_A129BarCod, T001X94_A132BarCodReo, T001X94_A130BarCodPar, T001X94_A2494BarDosPro, T001X94_A719PrdNum
            }
            , new Object[] {
            T001X95_A396EmprCod, T001X95_A1314EnsLabCod, T001X95_A1317EnsLabLin
            }
            , new Object[] {
            T001X96_A396EmprCod, T001X96_A910Workstat, T001X96_A887EscMLin
            }
            , new Object[] {
            T001X97_A396EmprCod, T001X97_A859CumCodCont, T001X97_A719PrdNum
            }
            , new Object[] {
            T001X98_A396EmprCod, T001X98_A719PrdNum, T001X98_A810RecFec
            }
            , new Object[] {
            T001X99_A396EmprCod, T001X99_A486ForNumCol, T001X99_A715PrdLin
            }
            , new Object[] {
            T001X100_A396EmprCod, T001X100_A719PrdNum, T001X100_A681PrdAny
            }
            , new Object[] {
            T001X101_A396EmprCod, T001X101_A719PrdNum, T001X101_A688PrdComCod
            }
            , new Object[] {
            T001X102_A396EmprCod, T001X102_A719PrdNum, T001X102_A680PrdAltNum
            }
            , new Object[] {
            T001X103_A396EmprCod, T001X103_A658PedCod, T001X103_A719PrdNum
            }
            , new Object[] {
            T001X104_A396EmprCod, T001X104_A486ForNumCol, T001X104_A309ColLin
            }
            , new Object[] {
            T001X105_A396EmprCod, T001X105_A719PrdNum, T001X105_A647NumCon
            }
            , new Object[] {
            T001X106_A396EmprCod, T001X106_A719PrdNum
            }
         }
      );
   }

   private byte Z730PrdSit ;
   private byte Z1194PrdPosY ;
   private byte Z3273PrdTnq ;
   private byte Z4338PrdUMeFo ;
   private byte Z8895PrdAltAct ;
   private byte Z8896PrdPesCon ;
   private byte Z629MetCod ;
   private byte Z835TipDtoCod ;
   private byte Z742PrdUniCom ;
   private byte Z743PrdUniCon ;
   private byte Z856ValCod ;
   private byte GxWebError ;
   private byte A629MetCod ;
   private byte A835TipDtoCod ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private byte nKeyPressed ;
   private byte A8895PrdAltAct ;
   private byte A8896PrdPesCon ;
   private byte A730PrdSit ;
   private byte A1194PrdPosY ;
   private byte A3273PrdTnq ;
   private byte A4338PrdUMeFo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ742PrdUniCom ;
   private byte ZZ743PrdUniCon ;
   private byte ZZ856ValCod ;
   private byte ZZ730PrdSit ;
   private byte ZZ835TipDtoCod ;
   private byte ZZ629MetCod ;
   private byte ZZ1194PrdPosY ;
   private byte ZZ3273PrdTnq ;
   private byte ZZ4338PrdUMeFo ;
   private byte ZZ8895PrdAltAct ;
   private byte ZZ8896PrdPesCon ;
   private short Z731PrdStkMinD ;
   private short Z699PrdDiaRot ;
   private short Z722PrdPlaEnt ;
   private short Z716PrdLotMin ;
   private short Z738PrdUltCCC ;
   private short Z695PrdConCC ;
   private short Z1193PrdPosX ;
   private short Z1644PrdDqo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A731PrdStkMinD ;
   private short A699PrdDiaRot ;
   private short A722PrdPlaEnt ;
   private short A716PrdLotMin ;
   private short A738PrdUltCCC ;
   private short A695PrdConCC ;
   private short A1193PrdPosX ;
   private short A1644PrdDqo ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short ZZ731PrdStkMinD ;
   private short ZZ699PrdDiaRot ;
   private short ZZ722PrdPlaEnt ;
   private short ZZ716PrdLotMin ;
   private short ZZ738PrdUltCCC ;
   private short ZZ695PrdConCC ;
   private short ZZ1193PrdPosX ;
   private short ZZ1644PrdDqo ;
   private int Z795PrvNum ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdDscTec_Enabled ;
   private int edtPrdUniCom_Enabled ;
   private int edtPrdUcpDsc_Enabled ;
   private int edtPrdUniCon_Enabled ;
   private int edtPrdUcoDsc_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrdRefPrv_Enabled ;
   private int edtEmpCodSus_Enabled ;
   private int edtPrdSus_Enabled ;
   private int edtPrdSusNom_Enabled ;
   private int edtValCod_Enabled ;
   private int edtValDsc_Enabled ;
   private int edtPrdRec_Enabled ;
   private int edtPrdCalNec_Enabled ;
   private int edtPrdDetPar_Enabled ;
   private int edtPrdSit_Enabled ;
   private int edtPrdRotRea_Enabled ;
   private int edtTipDtoCod_Enabled ;
   private int edtTipDtoDto_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdFecPre_Enabled ;
   private int edtPrdPreAnt_Enabled ;
   private int edtPrdPreMed_Enabled ;
   private int edtPrdConDia_Enabled ;
   private int edtPrdStkMinD_Enabled ;
   private int edtPrdStkMinU_Enabled ;
   private int edtPrdDiaRot_Enabled ;
   private int edtPrdPlaEnt_Enabled ;
   private int edtMetCod_Enabled ;
   private int edtMetDsc_Enabled ;
   private int edtPrdLotMin_Enabled ;
   private int edtPrdNumUco_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int edtPrdFulEnt_Enabled ;
   private int edtPrdFulPed_Enabled ;
   private int edtPrdFulCC_Enabled ;
   private int edtPrdExiCCP_Enabled ;
   private int edtPrdUltECC_Enabled ;
   private int edtPrdUltCCC_Enabled ;
   private int edtPrdUltDCC_Enabled ;
   private int edtPrdDifCC_Enabled ;
   private int edtPrdConCC_Enabled ;
   private int edtPrdValStk_Enabled ;
   private int edtDifValStk_Enabled ;
   private int edtPrdFecEnt_Enabled ;
   private int edtPrdPosX_Enabled ;
   private int edtPrdPosY_Enabled ;
   private int edtPrdTip_Enabled ;
   private int edtPrdDqo_Enabled ;
   private int edtPrdRev_Enabled ;
   private int edtPrdTnq_Enabled ;
   private int edtPrdUMeFo_Enabled ;
   private int edtPrdPreAc2_Enabled ;
   private int edtPrdNumCent_Enabled ;
   private int edtPrdSolub_Enabled ;
   private int edtPrdPreRef_Enabled ;
   private int edtPrdExiAlmc_Enabled ;
   private int edtPrdPesTerm_Enabled ;
   private int edtPrdNCAS_Enabled ;
   private int edtPrdEqLP_Enabled ;
   private int edtPrdConc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtPrdConc_Backcolor ;
   private int edtPrdEqLP_Backcolor ;
   private int edtPrdNCAS_Backcolor ;
   private int edtPrdPesTerm_Backcolor ;
   private int edtPrdExiAlmc_Backcolor ;
   private int edtPrdPreRef_Backcolor ;
   private int edtPrdSolub_Backcolor ;
   private int edtPrdNumCent_Backcolor ;
   private int edtPrdPreAc2_Backcolor ;
   private int edtPrdUMeFo_Backcolor ;
   private int edtPrdTnq_Backcolor ;
   private int edtPrdRev_Backcolor ;
   private int edtPrdDqo_Backcolor ;
   private int edtPrdTip_Backcolor ;
   private int edtPrdPosY_Backcolor ;
   private int edtPrdPosX_Backcolor ;
   private int edtPrdFecEnt_Backcolor ;
   private int edtDifValStk_Backcolor ;
   private int edtPrdValStk_Backcolor ;
   private int edtPrdConCC_Backcolor ;
   private int edtPrdDifCC_Backcolor ;
   private int edtPrdUltDCC_Backcolor ;
   private int edtPrdUltCCC_Backcolor ;
   private int edtPrdUltECC_Backcolor ;
   private int edtPrdExiCCP_Backcolor ;
   private int edtPrdFulCC_Backcolor ;
   private int edtPrdFulPed_Backcolor ;
   private int edtPrdFulEnt_Backcolor ;
   private int edtPrdCanPen_Backcolor ;
   private int edtPrdCanRes_Backcolor ;
   private int edtPrdExiCC_Backcolor ;
   private int edtPrdExiAlm_Backcolor ;
   private int edtPrdNumUco_Backcolor ;
   private int edtPrdLotMin_Backcolor ;
   private int edtMetDsc_Backcolor ;
   private int edtMetCod_Backcolor ;
   private int edtPrdPlaEnt_Backcolor ;
   private int edtPrdDiaRot_Backcolor ;
   private int edtPrdStkMinU_Backcolor ;
   private int edtPrdStkMinD_Backcolor ;
   private int edtPrdConDia_Backcolor ;
   private int edtPrdPreMed_Backcolor ;
   private int edtPrdPreAnt_Backcolor ;
   private int edtPrdFecPre_Backcolor ;
   private int edtPrdPreAct_Backcolor ;
   private int edtTipDtoDto_Backcolor ;
   private int edtTipDtoCod_Backcolor ;
   private int edtPrdRotRea_Backcolor ;
   private int edtPrdSit_Backcolor ;
   private int edtPrdDetPar_Backcolor ;
   private int edtPrdCalNec_Backcolor ;
   private int edtPrdRec_Backcolor ;
   private int edtValDsc_Backcolor ;
   private int edtValCod_Backcolor ;
   private int edtPrdSusNom_Backcolor ;
   private int edtPrdSus_Backcolor ;
   private int edtEmpCodSus_Backcolor ;
   private int edtPrdRefPrv_Backcolor ;
   private int edtPrvNom_Backcolor ;
   private int edtPrvNum_Backcolor ;
   private int edtPrdFacCon_Backcolor ;
   private int edtPrdUcoDsc_Backcolor ;
   private int edtPrdUniCon_Backcolor ;
   private int edtPrdUcpDsc_Backcolor ;
   private int edtPrdUniCom_Backcolor ;
   private int edtPrdDscTec_Backcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ795PrvNum ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z696PrdConDia ;
   private java.math.BigDecimal Z732PrdStkMinU ;
   private java.math.BigDecimal Z721PrdNumUco ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z706PrdExiCCP ;
   private java.math.BigDecimal Z740PrdUltECC ;
   private java.math.BigDecimal Z739PrdUltDCC ;
   private java.math.BigDecimal Z700PrdDifCC ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z332DifValStk ;
   private java.math.BigDecimal Z5255PrdPreAc2 ;
   private java.math.BigDecimal Z5590PrdSolub ;
   private java.math.BigDecimal Z7763PrdPreRef ;
   private java.math.BigDecimal Z8659PrdExiAlmc ;
   private java.math.BigDecimal Z3937PrdConc ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A740PrdUltECC ;
   private java.math.BigDecimal A739PrdUltDCC ;
   private java.math.BigDecimal A700PrdDifCC ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A7763PrdPreRef ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A3937PrdConc ;
   private java.math.BigDecimal Z837TipDtoDto ;
   private java.math.BigDecimal ZZ707PrdFacCon ;
   private java.math.BigDecimal ZZ729PrdRotRea ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ725PrdPreAnt ;
   private java.math.BigDecimal ZZ726PrdPreMed ;
   private java.math.BigDecimal ZZ696PrdConDia ;
   private java.math.BigDecimal ZZ732PrdStkMinU ;
   private java.math.BigDecimal ZZ721PrdNumUco ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ685PrdCanRes ;
   private java.math.BigDecimal ZZ684PrdCanPen ;
   private java.math.BigDecimal ZZ706PrdExiCCP ;
   private java.math.BigDecimal ZZ740PrdUltECC ;
   private java.math.BigDecimal ZZ739PrdUltDCC ;
   private java.math.BigDecimal ZZ700PrdDifCC ;
   private java.math.BigDecimal ZZ750PrdValStk ;
   private java.math.BigDecimal ZZ332DifValStk ;
   private java.math.BigDecimal ZZ5255PrdPreAc2 ;
   private java.math.BigDecimal ZZ5590PrdSolub ;
   private java.math.BigDecimal ZZ7763PrdPreRef ;
   private java.math.BigDecimal ZZ8659PrdExiAlmc ;
   private java.math.BigDecimal ZZ3937PrdConc ;
   private java.math.BigDecimal ZZ837TipDtoDto ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z703PrdDscTec ;
   private String Z728PrdRefPrv ;
   private String Z734PrdSus ;
   private String Z727PrdRec ;
   private String Z682PrdCalNec ;
   private String Z698PrdDetPar ;
   private String Z1643PrdTip ;
   private String Z3004PrdRev ;
   private String Z6191PrdNumCent ;
   private String Z8897PrdPesTerm ;
   private String Z9734PrdNCAS ;
   private String Z3936PrdEqLP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPrdDscTec_Internalname ;
   private String A703PrdDscTec ;
   private String edtPrdDscTec_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPrdUniCom_Internalname ;
   private String edtPrdUniCom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPrdUcpDsc_Internalname ;
   private String A737PrdUcpDsc ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrdUniCon_Internalname ;
   private String edtPrdUniCon_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPrdUcoDsc_Internalname ;
   private String A736PrdUcoDsc ;
   private String edtPrdUcoDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPrdRefPrv_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEmpCodSus_Internalname ;
   private String A394EmpCodSus ;
   private String edtEmpCodSus_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtPrdSus_Internalname ;
   private String A734PrdSus ;
   private String edtPrdSus_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPrdSusNom_Internalname ;
   private String A735PrdSusNom ;
   private String edtPrdSusNom_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtValCod_Internalname ;
   private String edtValCod_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtValDsc_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtPrdRec_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtPrdCalNec_Internalname ;
   private String A682PrdCalNec ;
   private String edtPrdCalNec_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtPrdDetPar_Internalname ;
   private String A698PrdDetPar ;
   private String edtPrdDetPar_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtPrdSit_Internalname ;
   private String edtPrdSit_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtPrdRotRea_Internalname ;
   private String edtPrdRotRea_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTipDtoCod_Internalname ;
   private String edtTipDtoCod_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtTipDtoDto_Internalname ;
   private String edtTipDtoDto_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtPrdFecPre_Internalname ;
   private String edtPrdFecPre_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtPrdPreAnt_Internalname ;
   private String edtPrdPreAnt_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtPrdPreMed_Internalname ;
   private String edtPrdPreMed_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtPrdConDia_Internalname ;
   private String edtPrdConDia_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtPrdStkMinD_Internalname ;
   private String edtPrdStkMinD_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtPrdStkMinU_Internalname ;
   private String edtPrdStkMinU_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtPrdDiaRot_Internalname ;
   private String edtPrdDiaRot_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtPrdPlaEnt_Internalname ;
   private String edtPrdPlaEnt_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtMetCod_Internalname ;
   private String edtMetCod_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtMetDsc_Internalname ;
   private String A630MetDsc ;
   private String edtMetDsc_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtPrdLotMin_Internalname ;
   private String edtPrdLotMin_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtPrdNumUco_Internalname ;
   private String edtPrdNumUco_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtPrdFulEnt_Internalname ;
   private String edtPrdFulEnt_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtPrdFulPed_Internalname ;
   private String edtPrdFulPed_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtPrdFulCC_Internalname ;
   private String edtPrdFulCC_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtPrdExiCCP_Internalname ;
   private String edtPrdExiCCP_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtPrdUltECC_Internalname ;
   private String edtPrdUltECC_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtPrdUltCCC_Internalname ;
   private String edtPrdUltCCC_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtPrdUltDCC_Internalname ;
   private String edtPrdUltDCC_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtPrdDifCC_Internalname ;
   private String edtPrdDifCC_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtPrdConCC_Internalname ;
   private String edtPrdConCC_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtPrdValStk_Internalname ;
   private String edtPrdValStk_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtDifValStk_Internalname ;
   private String edtDifValStk_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtPrdFecEnt_Internalname ;
   private String edtPrdFecEnt_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtPrdPosX_Internalname ;
   private String edtPrdPosX_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtPrdPosY_Internalname ;
   private String edtPrdPosY_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtPrdTip_Internalname ;
   private String A1643PrdTip ;
   private String edtPrdTip_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtPrdDqo_Internalname ;
   private String edtPrdDqo_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtPrdRev_Internalname ;
   private String A3004PrdRev ;
   private String edtPrdRev_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtPrdTnq_Internalname ;
   private String edtPrdTnq_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtPrdUMeFo_Internalname ;
   private String edtPrdUMeFo_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtPrdPreAc2_Internalname ;
   private String edtPrdPreAc2_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtPrdNumCent_Internalname ;
   private String A6191PrdNumCent ;
   private String edtPrdNumCent_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtPrdSolub_Internalname ;
   private String edtPrdSolub_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtPrdPreRef_Internalname ;
   private String edtPrdPreRef_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtPrdExiAlmc_Internalname ;
   private String edtPrdExiAlmc_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtPrdPesTerm_Internalname ;
   private String A8897PrdPesTerm ;
   private String edtPrdPesTerm_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtPrdNCAS_Internalname ;
   private String A9734PrdNCAS ;
   private String edtPrdNCAS_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtPrdEqLP_Internalname ;
   private String A3936PrdEqLP ;
   private String edtPrdEqLP_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtPrdConc_Internalname ;
   private String edtPrdConc_Jsonclick ;
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
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z737PrdUcpDsc ;
   private String Z736PrdUcoDsc ;
   private String Z794PrvNom ;
   private String Z857ValDsc ;
   private String Z630MetDsc ;
   private String sMode29 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z394EmpCodSus ;
   private String Z735PrdSusNom ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ394EmpCodSus ;
   private String ZZ735PrdSusNom ;
   private String ZZ718PrdNom ;
   private String ZZ703PrdDscTec ;
   private String ZZ728PrdRefPrv ;
   private String ZZ734PrdSus ;
   private String ZZ727PrdRec ;
   private String ZZ682PrdCalNec ;
   private String ZZ698PrdDetPar ;
   private String ZZ1643PrdTip ;
   private String ZZ3004PrdRev ;
   private String ZZ6191PrdNumCent ;
   private String ZZ8897PrdPesTerm ;
   private String ZZ9734PrdNCAS ;
   private String ZZ3936PrdEqLP ;
   private String ZZ407EmprNom ;
   private String ZZ630MetDsc ;
   private String ZZ794PrvNom ;
   private String ZZ737PrdUcpDsc ;
   private String ZZ736PrdUcoDsc ;
   private String ZZ857ValDsc ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date Z714PrdFulPed ;
   private java.util.Date Z712PrdFulCC ;
   private java.util.Date Z708PrdFecEnt ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A714PrdFulPed ;
   private java.util.Date A712PrdFulCC ;
   private java.util.Date A708PrdFecEnt ;
   private java.util.Date ZZ709PrdFecPre ;
   private java.util.Date ZZ713PrdFulEnt ;
   private java.util.Date ZZ714PrdFulPed ;
   private java.util.Date ZZ712PrdFulCC ;
   private java.util.Date ZZ708PrdFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n629MetCod ;
   private boolean n835TipDtoCod ;
   private boolean wbErr ;
   private boolean n8895PrdAltAct ;
   private boolean n719PrdNum ;
   private boolean n407EmprNom ;
   private boolean n737PrdUcpDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n794PrvNom ;
   private boolean n734PrdSus ;
   private boolean n735PrdSusNom ;
   private boolean n857ValDsc ;
   private boolean n837TipDtoDto ;
   private boolean n630MetDsc ;
   private boolean n7763PrdPreRef ;
   private boolean n3937PrdConc ;
   private boolean Gx_longc ;
   private ICheckbox chkPrdAltAct ;
   private ICheckbox chkPrdPesCon ;
   private IDataStoreProvider pr_default ;
   private String[] T001X12_A719PrdNum ;
   private boolean[] T001X12_n719PrdNum ;
   private String[] T001X12_A407EmprNom ;
   private boolean[] T001X12_n407EmprNom ;
   private String[] T001X12_A718PrdNom ;
   private String[] T001X12_A703PrdDscTec ;
   private String[] T001X12_A737PrdUcpDsc ;
   private boolean[] T001X12_n737PrdUcpDsc ;
   private String[] T001X12_A736PrdUcoDsc ;
   private boolean[] T001X12_n736PrdUcoDsc ;
   private java.math.BigDecimal[] T001X12_A707PrdFacCon ;
   private String[] T001X12_A794PrvNom ;
   private boolean[] T001X12_n794PrvNom ;
   private String[] T001X12_A728PrdRefPrv ;
   private String[] T001X12_A734PrdSus ;
   private boolean[] T001X12_n734PrdSus ;
   private String[] T001X12_A857ValDsc ;
   private boolean[] T001X12_n857ValDsc ;
   private String[] T001X12_A727PrdRec ;
   private String[] T001X12_A682PrdCalNec ;
   private String[] T001X12_A698PrdDetPar ;
   private byte[] T001X12_A730PrdSit ;
   private java.math.BigDecimal[] T001X12_A729PrdRotRea ;
   private java.math.BigDecimal[] T001X12_A837TipDtoDto ;
   private boolean[] T001X12_n837TipDtoDto ;
   private java.math.BigDecimal[] T001X12_A724PrdPreAct ;
   private java.util.Date[] T001X12_A709PrdFecPre ;
   private java.math.BigDecimal[] T001X12_A725PrdPreAnt ;
   private java.math.BigDecimal[] T001X12_A726PrdPreMed ;
   private java.math.BigDecimal[] T001X12_A696PrdConDia ;
   private short[] T001X12_A731PrdStkMinD ;
   private java.math.BigDecimal[] T001X12_A732PrdStkMinU ;
   private short[] T001X12_A699PrdDiaRot ;
   private short[] T001X12_A722PrdPlaEnt ;
   private String[] T001X12_A630MetDsc ;
   private boolean[] T001X12_n630MetDsc ;
   private short[] T001X12_A716PrdLotMin ;
   private java.math.BigDecimal[] T001X12_A721PrdNumUco ;
   private java.math.BigDecimal[] T001X12_A704PrdExiAlm ;
   private java.math.BigDecimal[] T001X12_A705PrdExiCC ;
   private java.math.BigDecimal[] T001X12_A685PrdCanRes ;
   private java.math.BigDecimal[] T001X12_A684PrdCanPen ;
   private java.util.Date[] T001X12_A713PrdFulEnt ;
   private java.util.Date[] T001X12_A714PrdFulPed ;
   private java.util.Date[] T001X12_A712PrdFulCC ;
   private java.math.BigDecimal[] T001X12_A706PrdExiCCP ;
   private java.math.BigDecimal[] T001X12_A740PrdUltECC ;
   private short[] T001X12_A738PrdUltCCC ;
   private java.math.BigDecimal[] T001X12_A739PrdUltDCC ;
   private java.math.BigDecimal[] T001X12_A700PrdDifCC ;
   private short[] T001X12_A695PrdConCC ;
   private java.math.BigDecimal[] T001X12_A750PrdValStk ;
   private java.math.BigDecimal[] T001X12_A332DifValStk ;
   private java.util.Date[] T001X12_A708PrdFecEnt ;
   private short[] T001X12_A1193PrdPosX ;
   private byte[] T001X12_A1194PrdPosY ;
   private String[] T001X12_A1643PrdTip ;
   private short[] T001X12_A1644PrdDqo ;
   private String[] T001X12_A3004PrdRev ;
   private byte[] T001X12_A3273PrdTnq ;
   private byte[] T001X12_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T001X12_A5255PrdPreAc2 ;
   private String[] T001X12_A6191PrdNumCent ;
   private java.math.BigDecimal[] T001X12_A5590PrdSolub ;
   private java.math.BigDecimal[] T001X12_A7763PrdPreRef ;
   private boolean[] T001X12_n7763PrdPreRef ;
   private java.math.BigDecimal[] T001X12_A8659PrdExiAlmc ;
   private byte[] T001X12_A8895PrdAltAct ;
   private boolean[] T001X12_n8895PrdAltAct ;
   private byte[] T001X12_A8896PrdPesCon ;
   private String[] T001X12_A8897PrdPesTerm ;
   private String[] T001X12_A9734PrdNCAS ;
   private String[] T001X12_A3936PrdEqLP ;
   private java.math.BigDecimal[] T001X12_A3937PrdConc ;
   private boolean[] T001X12_n3937PrdConc ;
   private String[] T001X12_A396EmprCod ;
   private byte[] T001X12_A629MetCod ;
   private boolean[] T001X12_n629MetCod ;
   private int[] T001X12_A795PrvNum ;
   private byte[] T001X12_A835TipDtoCod ;
   private boolean[] T001X12_n835TipDtoCod ;
   private byte[] T001X12_A742PrdUniCom ;
   private byte[] T001X12_A743PrdUniCon ;
   private byte[] T001X12_A856ValCod ;
   private String[] T001X4_A407EmprNom ;
   private boolean[] T001X4_n407EmprNom ;
   private String[] T001X5_A630MetDsc ;
   private boolean[] T001X5_n630MetDsc ;
   private String[] T001X6_A794PrvNom ;
   private boolean[] T001X6_n794PrvNom ;
   private java.math.BigDecimal[] T001X7_A837TipDtoDto ;
   private boolean[] T001X7_n837TipDtoDto ;
   private String[] T001X8_A737PrdUcpDsc ;
   private boolean[] T001X8_n737PrdUcpDsc ;
   private String[] T001X9_A736PrdUcoDsc ;
   private boolean[] T001X9_n736PrdUcoDsc ;
   private String[] T001X10_A857ValDsc ;
   private boolean[] T001X10_n857ValDsc ;
   private String[] T001X13_A407EmprNom ;
   private boolean[] T001X13_n407EmprNom ;
   private String[] T001X14_A630MetDsc ;
   private boolean[] T001X14_n630MetDsc ;
   private String[] T001X15_A794PrvNom ;
   private boolean[] T001X15_n794PrvNom ;
   private java.math.BigDecimal[] T001X16_A837TipDtoDto ;
   private boolean[] T001X16_n837TipDtoDto ;
   private String[] T001X17_A737PrdUcpDsc ;
   private boolean[] T001X17_n737PrdUcpDsc ;
   private String[] T001X18_A736PrdUcoDsc ;
   private boolean[] T001X18_n736PrdUcoDsc ;
   private String[] T001X19_A857ValDsc ;
   private boolean[] T001X19_n857ValDsc ;
   private String[] T001X20_A396EmprCod ;
   private String[] T001X20_A719PrdNum ;
   private boolean[] T001X20_n719PrdNum ;
   private String[] T001X3_A719PrdNum ;
   private boolean[] T001X3_n719PrdNum ;
   private String[] T001X3_A718PrdNom ;
   private String[] T001X3_A703PrdDscTec ;
   private java.math.BigDecimal[] T001X3_A707PrdFacCon ;
   private String[] T001X3_A728PrdRefPrv ;
   private String[] T001X3_A734PrdSus ;
   private boolean[] T001X3_n734PrdSus ;
   private String[] T001X3_A727PrdRec ;
   private String[] T001X3_A682PrdCalNec ;
   private String[] T001X3_A698PrdDetPar ;
   private byte[] T001X3_A730PrdSit ;
   private java.math.BigDecimal[] T001X3_A729PrdRotRea ;
   private java.math.BigDecimal[] T001X3_A724PrdPreAct ;
   private java.util.Date[] T001X3_A709PrdFecPre ;
   private java.math.BigDecimal[] T001X3_A725PrdPreAnt ;
   private java.math.BigDecimal[] T001X3_A726PrdPreMed ;
   private java.math.BigDecimal[] T001X3_A696PrdConDia ;
   private short[] T001X3_A731PrdStkMinD ;
   private java.math.BigDecimal[] T001X3_A732PrdStkMinU ;
   private short[] T001X3_A699PrdDiaRot ;
   private short[] T001X3_A722PrdPlaEnt ;
   private short[] T001X3_A716PrdLotMin ;
   private java.math.BigDecimal[] T001X3_A721PrdNumUco ;
   private java.math.BigDecimal[] T001X3_A704PrdExiAlm ;
   private java.math.BigDecimal[] T001X3_A705PrdExiCC ;
   private java.math.BigDecimal[] T001X3_A685PrdCanRes ;
   private java.math.BigDecimal[] T001X3_A684PrdCanPen ;
   private java.util.Date[] T001X3_A713PrdFulEnt ;
   private java.util.Date[] T001X3_A714PrdFulPed ;
   private java.util.Date[] T001X3_A712PrdFulCC ;
   private java.math.BigDecimal[] T001X3_A706PrdExiCCP ;
   private java.math.BigDecimal[] T001X3_A740PrdUltECC ;
   private short[] T001X3_A738PrdUltCCC ;
   private java.math.BigDecimal[] T001X3_A739PrdUltDCC ;
   private java.math.BigDecimal[] T001X3_A700PrdDifCC ;
   private short[] T001X3_A695PrdConCC ;
   private java.math.BigDecimal[] T001X3_A750PrdValStk ;
   private java.math.BigDecimal[] T001X3_A332DifValStk ;
   private java.util.Date[] T001X3_A708PrdFecEnt ;
   private short[] T001X3_A1193PrdPosX ;
   private byte[] T001X3_A1194PrdPosY ;
   private String[] T001X3_A1643PrdTip ;
   private short[] T001X3_A1644PrdDqo ;
   private String[] T001X3_A3004PrdRev ;
   private byte[] T001X3_A3273PrdTnq ;
   private byte[] T001X3_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T001X3_A5255PrdPreAc2 ;
   private String[] T001X3_A6191PrdNumCent ;
   private java.math.BigDecimal[] T001X3_A5590PrdSolub ;
   private java.math.BigDecimal[] T001X3_A7763PrdPreRef ;
   private boolean[] T001X3_n7763PrdPreRef ;
   private java.math.BigDecimal[] T001X3_A8659PrdExiAlmc ;
   private byte[] T001X3_A8895PrdAltAct ;
   private boolean[] T001X3_n8895PrdAltAct ;
   private byte[] T001X3_A8896PrdPesCon ;
   private String[] T001X3_A8897PrdPesTerm ;
   private String[] T001X3_A9734PrdNCAS ;
   private String[] T001X3_A3936PrdEqLP ;
   private java.math.BigDecimal[] T001X3_A3937PrdConc ;
   private boolean[] T001X3_n3937PrdConc ;
   private String[] T001X3_A396EmprCod ;
   private byte[] T001X3_A629MetCod ;
   private boolean[] T001X3_n629MetCod ;
   private int[] T001X3_A795PrvNum ;
   private byte[] T001X3_A835TipDtoCod ;
   private boolean[] T001X3_n835TipDtoCod ;
   private byte[] T001X3_A742PrdUniCom ;
   private byte[] T001X3_A743PrdUniCon ;
   private byte[] T001X3_A856ValCod ;
   private String[] T001X21_A396EmprCod ;
   private String[] T001X21_A719PrdNum ;
   private boolean[] T001X21_n719PrdNum ;
   private String[] T001X22_A396EmprCod ;
   private String[] T001X22_A719PrdNum ;
   private boolean[] T001X22_n719PrdNum ;
   private String[] T001X2_A719PrdNum ;
   private boolean[] T001X2_n719PrdNum ;
   private String[] T001X2_A718PrdNom ;
   private String[] T001X2_A703PrdDscTec ;
   private java.math.BigDecimal[] T001X2_A707PrdFacCon ;
   private String[] T001X2_A728PrdRefPrv ;
   private String[] T001X2_A734PrdSus ;
   private boolean[] T001X2_n734PrdSus ;
   private String[] T001X2_A727PrdRec ;
   private String[] T001X2_A682PrdCalNec ;
   private String[] T001X2_A698PrdDetPar ;
   private byte[] T001X2_A730PrdSit ;
   private java.math.BigDecimal[] T001X2_A729PrdRotRea ;
   private java.math.BigDecimal[] T001X2_A724PrdPreAct ;
   private java.util.Date[] T001X2_A709PrdFecPre ;
   private java.math.BigDecimal[] T001X2_A725PrdPreAnt ;
   private java.math.BigDecimal[] T001X2_A726PrdPreMed ;
   private java.math.BigDecimal[] T001X2_A696PrdConDia ;
   private short[] T001X2_A731PrdStkMinD ;
   private java.math.BigDecimal[] T001X2_A732PrdStkMinU ;
   private short[] T001X2_A699PrdDiaRot ;
   private short[] T001X2_A722PrdPlaEnt ;
   private short[] T001X2_A716PrdLotMin ;
   private java.math.BigDecimal[] T001X2_A721PrdNumUco ;
   private java.math.BigDecimal[] T001X2_A704PrdExiAlm ;
   private java.math.BigDecimal[] T001X2_A705PrdExiCC ;
   private java.math.BigDecimal[] T001X2_A685PrdCanRes ;
   private java.math.BigDecimal[] T001X2_A684PrdCanPen ;
   private java.util.Date[] T001X2_A713PrdFulEnt ;
   private java.util.Date[] T001X2_A714PrdFulPed ;
   private java.util.Date[] T001X2_A712PrdFulCC ;
   private java.math.BigDecimal[] T001X2_A706PrdExiCCP ;
   private java.math.BigDecimal[] T001X2_A740PrdUltECC ;
   private short[] T001X2_A738PrdUltCCC ;
   private java.math.BigDecimal[] T001X2_A739PrdUltDCC ;
   private java.math.BigDecimal[] T001X2_A700PrdDifCC ;
   private short[] T001X2_A695PrdConCC ;
   private java.math.BigDecimal[] T001X2_A750PrdValStk ;
   private java.math.BigDecimal[] T001X2_A332DifValStk ;
   private java.util.Date[] T001X2_A708PrdFecEnt ;
   private short[] T001X2_A1193PrdPosX ;
   private byte[] T001X2_A1194PrdPosY ;
   private String[] T001X2_A1643PrdTip ;
   private short[] T001X2_A1644PrdDqo ;
   private String[] T001X2_A3004PrdRev ;
   private byte[] T001X2_A3273PrdTnq ;
   private byte[] T001X2_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T001X2_A5255PrdPreAc2 ;
   private String[] T001X2_A6191PrdNumCent ;
   private java.math.BigDecimal[] T001X2_A5590PrdSolub ;
   private java.math.BigDecimal[] T001X2_A7763PrdPreRef ;
   private boolean[] T001X2_n7763PrdPreRef ;
   private java.math.BigDecimal[] T001X2_A8659PrdExiAlmc ;
   private byte[] T001X2_A8895PrdAltAct ;
   private boolean[] T001X2_n8895PrdAltAct ;
   private byte[] T001X2_A8896PrdPesCon ;
   private String[] T001X2_A8897PrdPesTerm ;
   private String[] T001X2_A9734PrdNCAS ;
   private String[] T001X2_A3936PrdEqLP ;
   private java.math.BigDecimal[] T001X2_A3937PrdConc ;
   private boolean[] T001X2_n3937PrdConc ;
   private String[] T001X2_A396EmprCod ;
   private byte[] T001X2_A629MetCod ;
   private boolean[] T001X2_n629MetCod ;
   private int[] T001X2_A795PrvNum ;
   private byte[] T001X2_A835TipDtoCod ;
   private boolean[] T001X2_n835TipDtoCod ;
   private byte[] T001X2_A742PrdUniCom ;
   private byte[] T001X2_A743PrdUniCon ;
   private byte[] T001X2_A856ValCod ;
   private String[] T001X26_A407EmprNom ;
   private boolean[] T001X26_n407EmprNom ;
   private String[] T001X27_A737PrdUcpDsc ;
   private boolean[] T001X27_n737PrdUcpDsc ;
   private String[] T001X28_A736PrdUcoDsc ;
   private boolean[] T001X28_n736PrdUcoDsc ;
   private String[] T001X29_A794PrvNom ;
   private boolean[] T001X29_n794PrvNom ;
   private String[] T001X30_A857ValDsc ;
   private boolean[] T001X30_n857ValDsc ;
   private java.math.BigDecimal[] T001X31_A837TipDtoDto ;
   private boolean[] T001X31_n837TipDtoDto ;
   private String[] T001X32_A630MetDsc ;
   private boolean[] T001X32_n630MetDsc ;
   private String[] T001X33_A396EmprCod ;
   private String[] T001X33_A719PrdNum ;
   private boolean[] T001X33_n719PrdNum ;
   private String[] T001X33_A13217NormaID ;
   private String[] T001X34_A396EmprCod ;
   private String[] T001X34_A719PrdNum ;
   private boolean[] T001X34_n719PrdNum ;
   private String[] T001X34_A13586TheList ;
   private String[] T001X35_A396EmprCod ;
   private int[] T001X35_A5532Lb_numero ;
   private String[] T001X35_A5555Lb_opcion ;
   private short[] T001X35_A13460Lb_linCP ;
   private String[] T001X35_A13458Lb_TipCP ;
   private String[] T001X36_A396EmprCod ;
   private int[] T001X36_A13418AlbProID ;
   private short[] T001X36_A13442AlbProLine ;
   private String[] T001X37_A396EmprCod ;
   private int[] T001X37_A13324LDESID ;
   private String[] T001X37_A13333LDESNPeque ;
   private String[] T001X37_A13337LDESComb ;
   private String[] T001X37_A13339LDESFondo ;
   private short[] T001X37_A13342LDESLinea ;
   private String[] T001X38_A396EmprCod ;
   private int[] T001X38_A13312Lb_NLab ;
   private short[] T001X38_A13305Lb_IDVeces ;
   private short[] T001X38_A13306Lb_LinID ;
   private String[] T001X39_A396EmprCod ;
   private int[] T001X39_A12673LavMqId ;
   private short[] T001X39_A12692LavMqLnPq ;
   private short[] T001X39_A12681LavMqLn ;
   private String[] T001X40_A396EmprCod ;
   private String[] T001X40_A719PrdNum ;
   private boolean[] T001X40_n719PrdNum ;
   private short[] T001X40_A9713Tb1_Cod ;
   private String[] T001X41_A396EmprCod ;
   private String[] T001X41_A12236PrdNumD ;
   private String[] T001X41_A719PrdNum ;
   private boolean[] T001X41_n719PrdNum ;
   private String[] T001X42_A396EmprCod ;
   private long[] T001X42_A12225DocDisID ;
   private short[] T001X42_A12226LinDisID ;
   private String[] T001X43_A396EmprCod ;
   private long[] T001X43_A12225DocDisID ;
   private String[] T001X44_A396EmprCod ;
   private long[] T001X44_A12205OrdenCID ;
   private short[] T001X44_A12206OrdenCLnId ;
   private String[] T001X45_A396EmprCod ;
   private String[] T001X45_A719PrdNum ;
   private boolean[] T001X45_n719PrdNum ;
   private String[] T001X45_A11664LoteID ;
   private java.util.Date[] T001X45_A11665LoteFec ;
   private String[] T001X46_A396EmprCod ;
   private int[] T001X46_A4850DevComCod ;
   private String[] T001X46_A719PrdNum ;
   private boolean[] T001X46_n719PrdNum ;
   private String[] T001X47_A396EmprCod ;
   private int[] T001X47_A252CliCod ;
   private String[] T001X47_A494ForSer ;
   private String[] T001X47_A482ForColNom ;
   private int[] T001X47_A483ForColNum ;
   private byte[] T001X47_A831TipColCod ;
   private String[] T001X47_A3571EnsCod ;
   private short[] T001X47_A3582EnsLin ;
   private String[] T001X48_A396EmprCod ;
   private int[] T001X48_A129BarCod ;
   private byte[] T001X48_A132BarCodReo ;
   private String[] T001X48_A130BarCodPar ;
   private byte[] T001X48_A4075recestncol ;
   private byte[] T001X48_A4076recestnpro ;
   private short[] T001X48_A4108recestlin ;
   private String[] T001X49_A396EmprCod ;
   private int[] T001X49_A4052EstNumFor ;
   private byte[] T001X49_A4053EstNumCol ;
   private byte[] T001X49_A4090EstEspLin ;
   private String[] T001X50_A396EmprCod ;
   private int[] T001X50_A4052EstNumFor ;
   private byte[] T001X50_A4053EstNumCol ;
   private byte[] T001X50_A4084EstProLin ;
   private String[] T001X51_A396EmprCod ;
   private long[] T001X51_A11644TransferId ;
   private int[] T001X51_A11653TransferLn ;
   private String[] T001X52_A396EmprCod ;
   private String[] T001X52_A11634TaesId ;
   private short[] T001X52_A11637TaesLn ;
   private short[] T001X52_A11641TaesLnP ;
   private String[] T001X53_A396EmprCod ;
   private String[] T001X53_A719PrdNum ;
   private boolean[] T001X53_n719PrdNum ;
   private long[] T001X53_A11329H_stklin ;
   private String[] T001X54_A396EmprCod ;
   private int[] T001X54_A11270Pot_num ;
   private short[] T001X54_A11271Pot_lin ;
   private String[] T001X55_A396EmprCod ;
   private String[] T001X55_A719PrdNum ;
   private boolean[] T001X55_n719PrdNum ;
   private String[] T001X55_A11199PrdNcasC ;
   private String[] T001X56_A396EmprCod ;
   private String[] T001X56_A719PrdNum ;
   private boolean[] T001X56_n719PrdNum ;
   private String[] T001X56_A11197CFraseR ;
   private String[] T001X57_A396EmprCod ;
   private short[] T001X57_A10243Jt_codigo ;
   private short[] T001X57_A10246Jt_ord ;
   private String[] T001X58_A396EmprCod ;
   private java.util.Date[] T001X58_A10236Bny_dia ;
   private short[] T001X58_A10238Bny_lin ;
   private String[] T001X59_A396EmprCod ;
   private int[] T001X59_A129BarCod ;
   private byte[] T001X59_A132BarCodReo ;
   private String[] T001X59_A130BarCodPar ;
   private String[] T001X59_A758ProCod ;
   private short[] T001X59_A194BarOrdLin ;
   private String[] T001X59_A719PrdNum ;
   private boolean[] T001X59_n719PrdNum ;
   private String[] T001X60_A396EmprCod ;
   private String[] T001X60_A719PrdNum ;
   private boolean[] T001X60_n719PrdNum ;
   private String[] T001X60_A9735Cod_Rgo ;
   private String[] T001X61_A396EmprCod ;
   private String[] T001X61_A719PrdNum ;
   private boolean[] T001X61_n719PrdNum ;
   private short[] T001X61_A9711Ct_codigo ;
   private String[] T001X62_A396EmprCod ;
   private long[] T001X62_A9652OeNum ;
   private int[] T001X62_A9653OeHdr ;
   private byte[] T001X62_A9654OeHdrr ;
   private String[] T001X62_A9655OeHdrp ;
   private byte[] T001X62_A9656OeLinC ;
   private String[] T001X62_A9657OeComb ;
   private String[] T001X62_A9658Oefondo ;
   private byte[] T001X62_A9659OeMolCil ;
   private short[] T001X62_A9686OePasLin ;
   private short[] T001X62_A9694OePasPLi ;
   private String[] T001X63_A396EmprCod ;
   private long[] T001X63_A9652OeNum ;
   private int[] T001X63_A9653OeHdr ;
   private byte[] T001X63_A9654OeHdrr ;
   private String[] T001X63_A9655OeHdrp ;
   private byte[] T001X63_A9656OeLinC ;
   private String[] T001X63_A9657OeComb ;
   private String[] T001X63_A9658Oefondo ;
   private byte[] T001X63_A9659OeMolCil ;
   private byte[] T001X63_A9677OeMolLin ;
   private String[] T001X64_A396EmprCod ;
   private int[] T001X64_A9578Pas_Num ;
   private String[] T001X64_A719PrdNum ;
   private boolean[] T001X64_n719PrdNum ;
   private String[] T001X65_A396EmprCod ;
   private String[] T001X65_A719PrdNum ;
   private boolean[] T001X65_n719PrdNum ;
   private byte[] T001X65_A8908CC_AlmCod ;
   private String[] T001X66_A396EmprCod ;
   private String[] T001X66_A719PrdNum ;
   private boolean[] T001X66_n719PrdNum ;
   private int[] T001X66_A8661Almc_Ln ;
   private String[] T001X67_A396EmprCod ;
   private String[] T001X67_A719PrdNum ;
   private boolean[] T001X67_n719PrdNum ;
   private String[] T001X67_A8648Mat_PrdN ;
   private String[] T001X68_A396EmprCod ;
   private long[] T001X68_A8585Pet_cod ;
   private String[] T001X68_A719PrdNum ;
   private boolean[] T001X68_n719PrdNum ;
   private String[] T001X69_A396EmprCod ;
   private String[] T001X69_A719PrdNum ;
   private boolean[] T001X69_n719PrdNum ;
   private java.util.Date[] T001X69_A8577RecFecHr ;
   private String[] T001X70_A396EmprCod ;
   private String[] T001X70_A719PrdNum ;
   private boolean[] T001X70_n719PrdNum ;
   private short[] T001X70_A8366PrdAnyo ;
   private int[] T001X70_A8360PrdProv ;
   private String[] T001X71_A396EmprCod ;
   private int[] T001X71_A252CliCod ;
   private String[] T001X71_A494ForSer ;
   private String[] T001X71_A482ForColNom ;
   private int[] T001X71_A483ForColNum ;
   private byte[] T001X71_A831TipColCod ;
   private short[] T001X71_A7797Sim_lin ;
   private String[] T001X72_A396EmprCod ;
   private int[] T001X72_A7163Vir_Codigo ;
   private String[] T001X72_A719PrdNum ;
   private boolean[] T001X72_n719PrdNum ;
   private String[] T001X73_A396EmprCod ;
   private String[] T001X73_A6310Lb_TaAuxC ;
   private short[] T001X73_A6313lb_TaAuxL ;
   private short[] T001X73_A6378Lb_TauxLP ;
   private String[] T001X74_A396EmprCod ;
   private int[] T001X74_A6290PreCoNum ;
   private String[] T001X74_A719PrdNum ;
   private boolean[] T001X74_n719PrdNum ;
   private String[] T001X75_A396EmprCod ;
   private String[] T001X75_A719PrdNum ;
   private boolean[] T001X75_n719PrdNum ;
   private int[] T001X75_A6158PrdPrv ;
   private String[] T001X76_A396EmprCod ;
   private String[] T001X76_A719PrdNum ;
   private boolean[] T001X76_n719PrdNum ;
   private String[] T001X76_A5973PrdSusNum ;
   private String[] T001X77_A396EmprCod ;
   private String[] T001X77_A5612Lb_CodGru ;
   private short[] T001X77_A5615Lb_LinGru ;
   private String[] T001X78_A396EmprCod ;
   private int[] T001X78_A5532Lb_numero ;
   private String[] T001X78_A5555Lb_opcion ;
   private short[] T001X78_A5560Lb_LineaPr ;
   private String[] T001X79_A396EmprCod ;
   private int[] T001X79_A5532Lb_numero ;
   private String[] T001X79_A5555Lb_opcion ;
   private short[] T001X79_A5557Lb_LineaC ;
   private String[] T001X80_A396EmprCod ;
   private int[] T001X80_A5145SobCod ;
   private String[] T001X80_A719PrdNum ;
   private boolean[] T001X80_n719PrdNum ;
   private String[] T001X81_A396EmprCod ;
   private int[] T001X81_A4744RecPreCod ;
   private short[] T001X81_A4762RecPreLin ;
   private short[] T001X81_A4763RecPreNli ;
   private String[] T001X82_A396EmprCod ;
   private int[] T001X82_A4492HreBarCod ;
   private byte[] T001X82_A4493HreBarReo ;
   private String[] T001X82_A4494HreBarPar ;
   private byte[] T001X82_A4495HreNumCie ;
   private short[] T001X82_A4545HreLinMaq ;
   private byte[] T001X82_A4550HreLinPro ;
   private short[] T001X82_A4557HreRecLin ;
   private String[] T001X83_A396EmprCod ;
   private int[] T001X83_A4492HreBarCod ;
   private byte[] T001X83_A4493HreBarReo ;
   private String[] T001X83_A4494HreBarPar ;
   private byte[] T001X83_A4495HreNumCie ;
   private short[] T001X83_A4508HreLinMAL ;
   private byte[] T001X83_A4509HreNumAny ;
   private String[] T001X83_A719PrdNum ;
   private boolean[] T001X83_n719PrdNum ;
   private String[] T001X84_A396EmprCod ;
   private int[] T001X84_A252CliCod ;
   private String[] T001X84_A4415EstCol ;
   private short[] T001X84_A4416EstColLin ;
   private String[] T001X85_A396EmprCod ;
   private int[] T001X85_A129BarCod ;
   private byte[] T001X85_A132BarCodReo ;
   private String[] T001X85_A130BarCodPar ;
   private byte[] T001X85_A2524DisComLin ;
   private String[] T001X85_A1056DisComCod ;
   private String[] T001X85_A1032FonCod ;
   private byte[] T001X85_A2124RecMolCod ;
   private short[] T001X85_A2672RecPasLin ;
   private short[] T001X85_A2675RecPasPLi ;
   private String[] T001X86_A396EmprCod ;
   private int[] T001X86_A129BarCod ;
   private byte[] T001X86_A132BarCodReo ;
   private String[] T001X86_A130BarCodPar ;
   private byte[] T001X86_A2524DisComLin ;
   private String[] T001X86_A1056DisComCod ;
   private String[] T001X86_A1032FonCod ;
   private byte[] T001X86_A2124RecMolCod ;
   private byte[] T001X86_A2126RecMolLin ;
   private String[] T001X87_A396EmprCod ;
   private String[] T001X87_A2107PasCod ;
   private String[] T001X87_A719PrdNum ;
   private boolean[] T001X87_n719PrdNum ;
   private String[] T001X88_A396EmprCod ;
   private int[] T001X88_A2637HisEstHRu ;
   private byte[] T001X88_A2636HisEstHRe ;
   private String[] T001X88_A2635HisEstHPa ;
   private byte[] T001X88_A2638HisEstLCo ;
   private String[] T001X88_A2630HisEstCom ;
   private String[] T001X88_A2634HisEstFon ;
   private String[] T001X88_A719PrdNum ;
   private boolean[] T001X88_n719PrdNum ;
   private String[] T001X89_A396EmprCod ;
   private int[] T001X89_A252CliCod ;
   private String[] T001X89_A2141SerEst ;
   private String[] T001X89_A1013DibCli ;
   private int[] T001X89_A1014DibInt ;
   private String[] T001X89_A2074ColCom ;
   private String[] T001X89_A2078ColFon ;
   private byte[] T001X89_A2098MolCod ;
   private short[] T001X89_A2535ForPrdLin ;
   private String[] T001X90_A396EmprCod ;
   private String[] T001X90_A719PrdNum ;
   private boolean[] T001X90_n719PrdNum ;
   private long[] T001X90_A3342CCStkLin ;
   private String[] T001X91_A396EmprCod ;
   private int[] T001X91_A252CliCod ;
   private String[] T001X91_A2891HMaForSer ;
   private String[] T001X91_A2892HMaForCNom ;
   private int[] T001X91_A2893HMaForCNum ;
   private byte[] T001X91_A2894HMaTipCCod ;
   private int[] T001X91_A2895HMaForNumC ;
   private short[] T001X91_A2897HMaColLin ;
   private java.util.Date[] T001X91_A2896HMaFec ;
   private short[] T001X91_A2907HmaLin ;
   private String[] T001X92_A396EmprCod ;
   private int[] T001X92_A129BarCod ;
   private byte[] T001X92_A132BarCodReo ;
   private String[] T001X92_A130BarCodPar ;
   private short[] T001X92_A2808RecLinMAL ;
   private byte[] T001X92_A1377RecNumAny ;
   private String[] T001X92_A719PrdNum ;
   private boolean[] T001X92_n719PrdNum ;
   private String[] T001X93_A396EmprCod ;
   private int[] T001X93_A129BarCod ;
   private byte[] T001X93_A132BarCodReo ;
   private String[] T001X93_A130BarCodPar ;
   private short[] T001X93_A2804RecLinMaq ;
   private byte[] T001X93_A1273RecLinPro ;
   private short[] T001X93_A811RecLin ;
   private String[] T001X94_A396EmprCod ;
   private int[] T001X94_A129BarCod ;
   private byte[] T001X94_A132BarCodReo ;
   private String[] T001X94_A130BarCodPar ;
   private String[] T001X94_A2494BarDosPro ;
   private String[] T001X94_A719PrdNum ;
   private boolean[] T001X94_n719PrdNum ;
   private String[] T001X95_A396EmprCod ;
   private int[] T001X95_A1314EnsLabCod ;
   private short[] T001X95_A1317EnsLabLin ;
   private String[] T001X96_A396EmprCod ;
   private String[] T001X96_A910Workstat ;
   private int[] T001X96_A887EscMLin ;
   private String[] T001X97_A396EmprCod ;
   private int[] T001X97_A859CumCodCont ;
   private String[] T001X97_A719PrdNum ;
   private boolean[] T001X97_n719PrdNum ;
   private String[] T001X98_A396EmprCod ;
   private String[] T001X98_A719PrdNum ;
   private boolean[] T001X98_n719PrdNum ;
   private java.util.Date[] T001X98_A810RecFec ;
   private String[] T001X99_A396EmprCod ;
   private int[] T001X99_A486ForNumCol ;
   private short[] T001X99_A715PrdLin ;
   private String[] T001X100_A396EmprCod ;
   private String[] T001X100_A719PrdNum ;
   private boolean[] T001X100_n719PrdNum ;
   private short[] T001X100_A681PrdAny ;
   private String[] T001X101_A396EmprCod ;
   private String[] T001X101_A719PrdNum ;
   private boolean[] T001X101_n719PrdNum ;
   private String[] T001X101_A688PrdComCod ;
   private String[] T001X102_A396EmprCod ;
   private String[] T001X102_A719PrdNum ;
   private boolean[] T001X102_n719PrdNum ;
   private String[] T001X102_A680PrdAltNum ;
   private String[] T001X103_A396EmprCod ;
   private int[] T001X103_A658PedCod ;
   private String[] T001X103_A719PrdNum ;
   private boolean[] T001X103_n719PrdNum ;
   private String[] T001X104_A396EmprCod ;
   private int[] T001X104_A486ForNumCol ;
   private short[] T001X104_A309ColLin ;
   private String[] T001X105_A396EmprCod ;
   private String[] T001X105_A719PrdNum ;
   private boolean[] T001X105_n719PrdNum ;
   private int[] T001X105_A647NumCon ;
   private String[] T001X106_A396EmprCod ;
   private String[] T001X106_A719PrdNum ;
   private boolean[] T001X106_n719PrdNum ;
   private String[] T001X11_A735PrdSusNom ;
   private boolean[] T001X11_n735PrdSusNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprdgen__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdgen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdgen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdgen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001X2", "SELECT PrdNum, PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdUMeFo, PrdPreAc2, PrdNumCent, PrdSolub, PrdPreRef, PrdExiAlmc, PrdAltAct, PrdPesCon, PrdPesTerm, PrdNCAS, PrdEqLP, PrdConc, EmprCod, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdUMeFo, PrdPreAc2, PrdNumCent, PrdSolub, PrdPreRef, PrdExiAlmc, PrdAltAct, PrdPesCon, PrdPesTerm, PrdNCAS, PrdEqLP, PrdConc, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X3", "SELECT PrdNum, PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdUMeFo, PrdPreAc2, PrdNumCent, PrdSolub, PrdPreRef, PrdExiAlmc, PrdAltAct, PrdPesCon, PrdPesTerm, PrdNCAS, PrdEqLP, PrdConc, EmprCod, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X5", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X6", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X7", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X8", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X9", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X10", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X11", "SELECT COALESCE( PrdNum, '') AS PrdSusNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X12", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.PrdDscTec, T3.UniDsc AS PrdUcpDsc, T4.UniDsc AS PrdUcoDsc, TM1.PrdFacCon, T5.PrvNom, TM1.PrdRefPrv, TM1.PrdSus, T6.ValDsc, TM1.PrdRec, TM1.PrdCalNec, TM1.PrdDetPar, TM1.PrdSit, TM1.PrdRotRea, T7.TipDtoDto, TM1.PrdPreAct, TM1.PrdFecPre, TM1.PrdPreAnt, TM1.PrdPreMed, TM1.PrdConDia, TM1.PrdStkMinD, TM1.PrdStkMinU, TM1.PrdDiaRot, TM1.PrdPlaEnt, T8.MetDsc, TM1.PrdLotMin, TM1.PrdNumUco, TM1.PrdExiAlm, TM1.PrdExiCC, TM1.PrdCanRes, TM1.PrdCanPen, TM1.PrdFulEnt, TM1.PrdFulPed, TM1.PrdFulCC, TM1.PrdExiCCP, TM1.PrdUltECC, TM1.PrdUltCCC, TM1.PrdUltDCC, TM1.PrdDifCC, TM1.PrdConCC, TM1.PrdValStk, TM1.DifValStk, TM1.PrdFecEnt, TM1.PrdPosX, TM1.PrdPosY, TM1.PrdTip, TM1.PrdDqo, TM1.PrdRev, TM1.PrdTnq, TM1.PrdUMeFo, TM1.PrdPreAc2, TM1.PrdNumCent, TM1.PrdSolub, TM1.PrdPreRef, TM1.PrdExiAlmc, TM1.PrdAltAct, TM1.PrdPesCon, TM1.PrdPesTerm, TM1.PrdNCAS, TM1.PrdEqLP, TM1.PrdConc, TM1.EmprCod, TM1.MetCod, TM1.PrvNum, TM1.TipDtoCod, TM1.PrdUniCom AS PrdUniCom, TM1.PrdUniCon AS PrdUniCon, TM1.ValCod FROM (((((((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = TM1.EmprCod AND T3.UniCod = TM1.PrdUniCom) INNER JOIN TXPTIPUNI T4 ON T4.EmprCod = TM1.EmprCod AND T4.UniCod = TM1.PrdUniCon) INNER JOIN TXPPRVGEN T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrvNum = TM1.PrvNum) INNER JOIN TXPTIPVAL T6 ON T6.EmprCod = TM1.EmprCod AND T6.ValCod = TM1.ValCod) LEFT JOIN TXPTIPDTO T7 ON T7.EmprCod = TM1.EmprCod AND T7.TipDtoCod = TM1.TipDtoCod) LEFT JOIN TXPMETPED T8 ON T8.EmprCod = TM1.EmprCod AND T8.MetCod = TM1.MetCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X14", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X15", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X16", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X17", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X18", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X19", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001X23", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdUMeFo, PrdPreAc2, PrdNumCent, PrdSolub, PrdPreRef, PrdExiAlmc, PrdAltAct, PrdPesCon, PrdPesTerm, PrdNCAS, PrdEqLP, PrdConc, EmprCod, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, MovEspULin, CCStKULin, PrdNom2, PrdNum2, PrdObs, PrdDensS, PrdConcS, PrdSalM, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, Mat_Lts, Almc_Ult, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T001X24", "UPDATE TXPPRODUC SET PrdNom=?, PrdDscTec=?, PrdFacCon=?, PrdRefPrv=?, PrdSus=?, PrdRec=?, PrdCalNec=?, PrdDetPar=?, PrdSit=?, PrdRotRea=?, PrdPreAct=?, PrdFecPre=?, PrdPreAnt=?, PrdPreMed=?, PrdConDia=?, PrdStkMinD=?, PrdStkMinU=?, PrdDiaRot=?, PrdPlaEnt=?, PrdLotMin=?, PrdNumUco=?, PrdExiAlm=?, PrdExiCC=?, PrdCanRes=?, PrdCanPen=?, PrdFulEnt=?, PrdFulPed=?, PrdFulCC=?, PrdExiCCP=?, PrdUltECC=?, PrdUltCCC=?, PrdUltDCC=?, PrdDifCC=?, PrdConCC=?, PrdValStk=?, DifValStk=?, PrdFecEnt=?, PrdPosX=?, PrdPosY=?, PrdTip=?, PrdDqo=?, PrdRev=?, PrdTnq=?, PrdUMeFo=?, PrdPreAc2=?, PrdNumCent=?, PrdSolub=?, PrdPreRef=?, PrdExiAlmc=?, PrdAltAct=?, PrdPesCon=?, PrdPesTerm=?, PrdNCAS=?, PrdEqLP=?, PrdConc=?, MetCod=?, PrvNum=?, TipDtoCod=?, PrdUniCom=?, PrdUniCon=?, ValCod=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T001X25", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T001X26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X27", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X28", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X29", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X30", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X31", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X32", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001X33", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X34", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X35", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X36", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X37", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X38", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X39", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X40", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X41", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X42", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X43", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X44", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X45", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X46", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X47", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X49", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X50", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X51", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X52", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X53", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X54", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X55", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X56", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X57", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X58", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X59", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X60", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X61", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X62", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X63", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X64", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X65", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X66", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X67", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X68", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X69", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X70", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X71", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X72", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X73", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X74", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X75", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X76", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X77", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X78", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X79", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X80", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X81", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X82", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X83", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X84", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X85", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X86", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X87", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X88", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X89", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X90", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X91", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X92", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X93", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X94", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X95", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X96", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X97", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X98", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X99", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X100", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X101", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X102", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X103", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X104", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X105", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001X106", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,4);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,4);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,4);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(27);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(28);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(29);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(31,2);
               ((short[]) buf[32])[0] = rslt.getShort(32);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((short[]) buf[35])[0] = rslt.getShort(35);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(38);
               ((short[]) buf[39])[0] = rslt.getShort(39);
               ((byte[]) buf[40])[0] = rslt.getByte(40);
               ((String[]) buf[41])[0] = rslt.getString(41, 1);
               ((short[]) buf[42])[0] = rslt.getShort(42);
               ((String[]) buf[43])[0] = rslt.getString(43, 1);
               ((byte[]) buf[44])[0] = rslt.getByte(44);
               ((byte[]) buf[45])[0] = rslt.getByte(45);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(46,5);
               ((String[]) buf[47])[0] = rslt.getString(47, 6);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(49,5);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(50,4);
               ((byte[]) buf[52])[0] = rslt.getByte(51);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(52);
               ((String[]) buf[55])[0] = rslt.getString(53, 10);
               ((String[]) buf[56])[0] = rslt.getString(54, 30);
               ((String[]) buf[57])[0] = rslt.getString(55, 6);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(57, 3);
               ((byte[]) buf[61])[0] = rslt.getByte(58);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(59);
               ((byte[]) buf[64])[0] = rslt.getByte(60);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(61);
               ((byte[]) buf[67])[0] = rslt.getByte(62);
               ((byte[]) buf[68])[0] = rslt.getByte(63);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,4);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,4);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,4);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(27);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(28);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(29);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(31,2);
               ((short[]) buf[32])[0] = rslt.getShort(32);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((short[]) buf[35])[0] = rslt.getShort(35);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(38);
               ((short[]) buf[39])[0] = rslt.getShort(39);
               ((byte[]) buf[40])[0] = rslt.getByte(40);
               ((String[]) buf[41])[0] = rslt.getString(41, 1);
               ((short[]) buf[42])[0] = rslt.getShort(42);
               ((String[]) buf[43])[0] = rslt.getString(43, 1);
               ((byte[]) buf[44])[0] = rslt.getByte(44);
               ((byte[]) buf[45])[0] = rslt.getByte(45);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(46,5);
               ((String[]) buf[47])[0] = rslt.getString(47, 6);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(49,5);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(50,4);
               ((byte[]) buf[52])[0] = rslt.getByte(51);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(52);
               ((String[]) buf[55])[0] = rslt.getString(53, 10);
               ((String[]) buf[56])[0] = rslt.getString(54, 30);
               ((String[]) buf[57])[0] = rslt.getString(55, 6);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(57, 3);
               ((byte[]) buf[61])[0] = rslt.getByte(58);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(59);
               ((byte[]) buf[64])[0] = rslt.getByte(60);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(61);
               ((byte[]) buf[67])[0] = rslt.getByte(62);
               ((byte[]) buf[68])[0] = rslt.getByte(63);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((String[]) buf[18])[0] = rslt.getString(13, 1);
               ((String[]) buf[19])[0] = rslt.getString(14, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,5);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[29])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(24,2);
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((short[]) buf[32])[0] = rslt.getShort(26);
               ((String[]) buf[33])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(28);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(30,4);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(31,4);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(32,4);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,4);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(34);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(35);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(36);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[46])[0] = rslt.getShort(39);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(40,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(41,2);
               ((short[]) buf[49])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(44,2);
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(45);
               ((short[]) buf[53])[0] = rslt.getShort(46);
               ((byte[]) buf[54])[0] = rslt.getByte(47);
               ((String[]) buf[55])[0] = rslt.getString(48, 1);
               ((short[]) buf[56])[0] = rslt.getShort(49);
               ((String[]) buf[57])[0] = rslt.getString(50, 1);
               ((byte[]) buf[58])[0] = rslt.getByte(51);
               ((byte[]) buf[59])[0] = rslt.getByte(52);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(53,5);
               ((String[]) buf[61])[0] = rslt.getString(54, 6);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(55,2);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(56,5);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(57,4);
               ((byte[]) buf[66])[0] = rslt.getByte(58);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((byte[]) buf[68])[0] = rslt.getByte(59);
               ((String[]) buf[69])[0] = rslt.getString(60, 10);
               ((String[]) buf[70])[0] = rslt.getString(61, 30);
               ((String[]) buf[71])[0] = rslt.getString(62, 6);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(64, 3);
               ((byte[]) buf[75])[0] = rslt.getByte(65);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(66);
               ((byte[]) buf[78])[0] = rslt.getByte(67);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((byte[]) buf[80])[0] = rslt.getByte(68);
               ((byte[]) buf[81])[0] = rslt.getByte(69);
               ((byte[]) buf[82])[0] = rslt.getByte(70);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 84 :
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
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
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
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               stmt.setString(5, (String)parms[5], 30);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 6);
               }
               stmt.setString(7, (String)parms[8], 1);
               stmt.setString(8, (String)parms[9], 1);
               stmt.setString(9, (String)parms[10], 1);
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 5);
               stmt.setDate(13, (java.util.Date)parms[14]);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[15], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[16], 5);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(17, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[19], 2);
               stmt.setShort(19, ((Number) parms[20]).shortValue());
               stmt.setShort(20, ((Number) parms[21]).shortValue());
               stmt.setShort(21, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[23], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 4);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[25], 4);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[26], 4);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[27], 4);
               stmt.setDate(27, (java.util.Date)parms[28]);
               stmt.setDate(28, (java.util.Date)parms[29]);
               stmt.setDate(29, (java.util.Date)parms[30]);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[32], 2);
               stmt.setShort(32, ((Number) parms[33]).shortValue());
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[35], 2);
               stmt.setShort(35, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[38], 2);
               stmt.setDate(38, (java.util.Date)parms[39]);
               stmt.setShort(39, ((Number) parms[40]).shortValue());
               stmt.setByte(40, ((Number) parms[41]).byteValue());
               stmt.setString(41, (String)parms[42], 1);
               stmt.setShort(42, ((Number) parms[43]).shortValue());
               stmt.setString(43, (String)parms[44], 1);
               stmt.setByte(44, ((Number) parms[45]).byteValue());
               stmt.setByte(45, ((Number) parms[46]).byteValue());
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[47], 5);
               stmt.setString(47, (String)parms[48], 6);
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[49], 2);
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[51], 5);
               }
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[52], 4);
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(51, ((Number) parms[54]).byteValue());
               }
               stmt.setByte(52, ((Number) parms[55]).byteValue());
               stmt.setString(53, (String)parms[56], 10);
               stmt.setString(54, (String)parms[57], 30);
               stmt.setString(55, (String)parms[58], 6);
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(56, (java.math.BigDecimal)parms[60], 2);
               }
               stmt.setString(57, (String)parms[61], 3);
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[63]).byteValue());
               }
               stmt.setInt(59, ((Number) parms[64]).intValue());
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(60, ((Number) parms[66]).byteValue());
               }
               stmt.setByte(61, ((Number) parms[67]).byteValue());
               stmt.setByte(62, ((Number) parms[68]).byteValue());
               stmt.setByte(63, ((Number) parms[69]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 30);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 1);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 5);
               stmt.setDate(12, (java.util.Date)parms[12]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 4);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 4);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 4);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[25], 4);
               stmt.setDate(26, (java.util.Date)parms[26]);
               stmt.setDate(27, (java.util.Date)parms[27]);
               stmt.setDate(28, (java.util.Date)parms[28]);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[30], 2);
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[33], 2);
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[35], 2);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[36], 2);
               stmt.setDate(37, (java.util.Date)parms[37]);
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setByte(39, ((Number) parms[39]).byteValue());
               stmt.setString(40, (String)parms[40], 1);
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               stmt.setString(42, (String)parms[42], 1);
               stmt.setByte(43, ((Number) parms[43]).byteValue());
               stmt.setByte(44, ((Number) parms[44]).byteValue());
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[45], 5);
               stmt.setString(46, (String)parms[46], 6);
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[47], 2);
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(48, (java.math.BigDecimal)parms[49], 5);
               }
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[50], 4);
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(50, ((Number) parms[52]).byteValue());
               }
               stmt.setByte(51, ((Number) parms[53]).byteValue());
               stmt.setString(52, (String)parms[54], 10);
               stmt.setString(53, (String)parms[55], 30);
               stmt.setString(54, (String)parms[56], 6);
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(56, ((Number) parms[60]).byteValue());
               }
               stmt.setInt(57, ((Number) parms[61]).intValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[63]).byteValue());
               }
               stmt.setByte(59, ((Number) parms[64]).byteValue());
               stmt.setByte(60, ((Number) parms[65]).byteValue());
               stmt.setByte(61, ((Number) parms[66]).byteValue());
               stmt.setString(62, (String)parms[67], 3);
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[69], 6);
               }
               return;
            case 23 :
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 29 :
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
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
            case 62 :
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
            case 63 :
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
            case 64 :
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
            case 65 :
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 85 :
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
            case 86 :
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
            case 87 :
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
            case 88 :
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
            case 89 :
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
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
            case 91 :
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
            case 92 :
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
            case 93 :
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
            case 94 :
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
            case 95 :
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
            case 96 :
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
            case 97 :
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
            case 98 :
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
            case 99 :
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
            case 100 :
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
            case 101 :
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
            case 102 :
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
            case 103 :
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
      }
   }

}

