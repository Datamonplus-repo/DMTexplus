package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txtooco_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"XTOOCOPRVN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10211XToOCoPrv = (int)(GXutil.lval( httpContext.GetPar( "XToOCoPrv"))) ;
         n10211XToOCoPrv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10211XToOCoPrv), 6, 0));
         A10122GpoEcoCod = (int)(GXutil.lval( httpContext.GetPar( "GpoEcoCod"))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A10141XToOCoTpo = httpContext.GetPar( "XToOCoTpo") ;
         n10141XToOCoTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaxtoocoprvn17D1383( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod, A10141XToOCoTpo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10122GpoEcoCod = (int)(GXutil.lval( httpContext.GetPar( "GpoEcoCod"))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A10122GpoEcoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10144XToOCoPrdC = httpContext.GetPar( "XToOCoPrdC") ;
         n10144XToOCoPrdC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10144XToOCoPrdC", A10144XToOCoPrdC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A10144XToOCoPrdC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10142XToOCoCliN = (int)(GXutil.lval( httpContext.GetPar( "XToOCoCliN"))) ;
         n10142XToOCoCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10142XToOCoCliN), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A10142XToOCoCliN) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10143XToOCoCru = (int)(GXutil.lval( httpContext.GetPar( "XToOCoCru"))) ;
         n10143XToOCoCru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10143XToOCoCru), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A10143XToOCoCru) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10145XToOCoRep = (int)(GXutil.lval( httpContext.GetPar( "XToOCoRep"))) ;
         n10145XToOCoRep = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10145XToOCoRep), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A10145XToOCoRep) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Orden de Compra de Totvs.", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXToOCoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public txtooco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txtooco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txtooco_impl.class ));
   }

   public txtooco_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbXToOCoTpo = new HTMLChoice();
      cmbXToOCoSTpo = new HTMLChoice();
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
      if ( cmbXToOCoTpo.getItemCount() > 0 )
      {
         A10141XToOCoTpo = cmbXToOCoTpo.getValidValue(A10141XToOCoTpo) ;
         n10141XToOCoTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbXToOCoTpo.setValue( GXutil.rtrim( A10141XToOCoTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoTpo.getInternalname(), "Values", cmbXToOCoTpo.ToJavascriptSource(), true);
      }
      if ( cmbXToOCoSTpo.getItemCount() > 0 )
      {
         A10150XToOCoSTpo = cmbXToOCoSTpo.getValidValue(A10150XToOCoSTpo) ;
         n10150XToOCoSTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", A10150XToOCoSTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbXToOCoSTpo.setValue( GXutil.rtrim( A10150XToOCoSTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoSTpo.getInternalname(), "Values", cmbXToOCoSTpo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXToOCo.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod de Orden de Compra Totvs", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoCod_Internalname, GXutil.rtrim( A10139XToOCoCod), GXutil.rtrim( localUtil.format( A10139XToOCoCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoCod_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Item", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoItm_Internalname, GXutil.rtrim( A10140XToOCoItm), GXutil.rtrim( localUtil.format( A10140XToOCoItm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoItm_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoItm_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Naturaleza", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoNat_Internalname, GXutil.rtrim( A10210XToOCoNat), GXutil.rtrim( localUtil.format( A10210XToOCoNat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoNat_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoNat_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbXToOCoTpo, cmbXToOCoTpo.getInternalname(), GXutil.rtrim( A10141XToOCoTpo), 1, cmbXToOCoTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbXToOCoTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, (byte)(0), "HLP_TXToOCo.htm");
      cmbXToOCoTpo.setValue( GXutil.rtrim( A10141XToOCoTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoTpo.getInternalname(), "Values", cmbXToOCoTpo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "SubTipo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbXToOCoSTpo, cmbXToOCoSTpo.getInternalname(), GXutil.rtrim( A10150XToOCoSTpo), 1, cmbXToOCoSTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbXToOCoSTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "", true, (byte)(0), "HLP_TXToOCo.htm");
      cmbXToOCoSTpo.setValue( GXutil.rtrim( A10150XToOCoSTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoSTpo.getInternalname(), "Values", cmbXToOCoSTpo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A10211XToOCoPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCoPrv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10211XToOCoPrv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10211XToOCoPrv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoPrv_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoPrv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoPrvN_Internalname, GXutil.rtrim( A10212XToOCoPrvN), GXutil.rtrim( localUtil.format( A10212XToOCoPrvN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoPrvN_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoPrvN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cod. de Grupo Economico", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGpoEcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGpoEcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10122GpoEcoCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10122GpoEcoCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGpoEcoCod_Jsonclick, 0, "", "", "", "", "", 1, edtGpoEcoCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre del Grupo Económico", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGpoEcoNom_Internalname, A10123GpoEcoNom, GXutil.rtrim( localUtil.format( A10123GpoEcoNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGpoEcoNom_Jsonclick, 0, "", "", "", "", "", 1, edtGpoEcoNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoPrdC_Internalname, GXutil.rtrim( A10144XToOCoPrdC), GXutil.rtrim( localUtil.format( A10144XToOCoPrdC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoPrdC_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoPrdC_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre Producto", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoPrdN_Internalname, GXutil.rtrim( A10151XToOCoPrdN), GXutil.rtrim( localUtil.format( A10151XToOCoPrdN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoPrdN_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoPrdN_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoCliN_Internalname, GXutil.ltrim( localUtil.ntoc( A10142XToOCoCliN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCoCliN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10142XToOCoCliN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10142XToOCoCliN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoCliN_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoCliN_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoCli_Internalname, GXutil.rtrim( A10213XToOCoCli), GXutil.rtrim( localUtil.format( A10213XToOCoCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoCli_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoCli_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXToOCoFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoFch_Internalname, localUtil.format(A10214XToOCoFch, "99/99/99"), localUtil.format( A10214XToOCoFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoFch_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXToOCoFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXToOCoFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXToOCo.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Fecha Prevista", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXToOCoFchP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoFchP_Internalname, localUtil.format(A10215XToOCoFchP, "99/99/99"), localUtil.format( A10215XToOCoFchP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoFchP_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoFchP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXToOCoFchP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXToOCoFchP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXToOCo.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo de Crudo", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoCru_Internalname, GXutil.ltrim( localUtil.ntoc( A10143XToOCoCru, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCoCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10143XToOCoCru), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10143XToOCoCru), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoCru_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoCru_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Desc Crudo", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoCruD_Internalname, GXutil.rtrim( A10216XToOCoCruD), GXutil.rtrim( localUtil.format( A10216XToOCoCruD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoCruD_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoCruD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Repuesto", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoRep_Internalname, GXutil.ltrim( localUtil.ntoc( A10145XToOCoRep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCoRep_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10145XToOCoRep), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10145XToOCoRep), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoRep_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoRep_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Nombre Repuesto", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtXToOCoRepN_Internalname, GXutil.rtrim( A10217XToOCoRepN), "", "", (short)(0), 1, edtXToOCoRepN_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Cant. Orden De Compra Totvs", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCoCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A10218XToOCoCnt, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCoCnt_Enabled!=0) ? localUtil.format( A10218XToOCoCnt, "Z,ZZZ,ZZ9.99999") : localUtil.format( A10218XToOCoCnt, "Z,ZZZ,ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCoCnt_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCoCnt_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXToOCo.htm");
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
      e1117D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10139XToOCoCod = httpContext.cgiGet( "Z10139XToOCoCod") ;
            Z10140XToOCoItm = httpContext.cgiGet( "Z10140XToOCoItm") ;
            Z10210XToOCoNat = httpContext.cgiGet( "Z10210XToOCoNat") ;
            Z10141XToOCoTpo = httpContext.cgiGet( "Z10141XToOCoTpo") ;
            Z10150XToOCoSTpo = httpContext.cgiGet( "Z10150XToOCoSTpo") ;
            Z10211XToOCoPrv = (int)(localUtil.ctol( httpContext.cgiGet( "Z10211XToOCoPrv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10144XToOCoPrdC = httpContext.cgiGet( "Z10144XToOCoPrdC") ;
            Z10142XToOCoCliN = (int)(localUtil.ctol( httpContext.cgiGet( "Z10142XToOCoCliN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10214XToOCoFch = localUtil.ctod( httpContext.cgiGet( "Z10214XToOCoFch"), 0) ;
            Z10215XToOCoFchP = localUtil.ctod( httpContext.cgiGet( "Z10215XToOCoFchP"), 0) ;
            Z10143XToOCoCru = (int)(localUtil.ctol( httpContext.cgiGet( "Z10143XToOCoCru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10145XToOCoRep = (int)(localUtil.ctol( httpContext.cgiGet( "Z10145XToOCoRep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10218XToOCoCnt = localUtil.ctond( httpContext.cgiGet( "Z10218XToOCoCnt")) ;
            Z10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10139XToOCoCod = httpContext.cgiGet( edtXToOCoCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
            A10140XToOCoItm = httpContext.cgiGet( edtXToOCoItm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
            A10210XToOCoNat = httpContext.cgiGet( edtXToOCoNat_Internalname) ;
            n10210XToOCoNat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10210XToOCoNat", A10210XToOCoNat);
            cmbXToOCoTpo.setValue( httpContext.cgiGet( cmbXToOCoTpo.getInternalname()) );
            A10141XToOCoTpo = httpContext.cgiGet( cmbXToOCoTpo.getInternalname()) ;
            n10141XToOCoTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
            cmbXToOCoSTpo.setValue( httpContext.cgiGet( cmbXToOCoSTpo.getInternalname()) );
            A10150XToOCoSTpo = httpContext.cgiGet( cmbXToOCoSTpo.getInternalname()) ;
            n10150XToOCoSTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", A10150XToOCoSTpo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCOPRV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoPrv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10211XToOCoPrv = 0 ;
               n10211XToOCoPrv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10211XToOCoPrv), 6, 0));
            }
            else
            {
               A10211XToOCoPrv = (int)(localUtil.ctol( httpContext.cgiGet( edtXToOCoPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10211XToOCoPrv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10211XToOCoPrv), 6, 0));
            }
            A10212XToOCoPrvN = httpContext.cgiGet( edtXToOCoPrvN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GPOECOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGpoEcoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10122GpoEcoCod = 0 ;
               n10122GpoEcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
            }
            else
            {
               A10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10122GpoEcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
            }
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            A10123GpoEcoNom = httpContext.cgiGet( edtGpoEcoNom_Internalname) ;
            n10123GpoEcoNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
            A10144XToOCoPrdC = httpContext.cgiGet( edtXToOCoPrdC_Internalname) ;
            n10144XToOCoPrdC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10144XToOCoPrdC", A10144XToOCoPrdC);
            A10151XToOCoPrdN = httpContext.cgiGet( edtXToOCoPrdN_Internalname) ;
            n10151XToOCoPrdN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoCliN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoCliN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCOCLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoCliN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10142XToOCoCliN = 0 ;
               n10142XToOCoCliN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10142XToOCoCliN), 6, 0));
            }
            else
            {
               A10142XToOCoCliN = (int)(localUtil.ctol( httpContext.cgiGet( edtXToOCoCliN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10142XToOCoCliN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10142XToOCoCliN), 6, 0));
            }
            A10213XToOCoCli = httpContext.cgiGet( edtXToOCoCli_Internalname) ;
            n10213XToOCoCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
            if ( localUtil.vcdate( httpContext.cgiGet( edtXToOCoFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XTOOCOFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10214XToOCoFch = GXutil.nullDate() ;
               n10214XToOCoFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10214XToOCoFch", localUtil.format(A10214XToOCoFch, "99/99/99"));
            }
            else
            {
               A10214XToOCoFch = localUtil.ctod( httpContext.cgiGet( edtXToOCoFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10214XToOCoFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10214XToOCoFch", localUtil.format(A10214XToOCoFch, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtXToOCoFchP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XTOOCOFCHP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoFchP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10215XToOCoFchP = GXutil.nullDate() ;
               n10215XToOCoFchP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10215XToOCoFchP", localUtil.format(A10215XToOCoFchP, "99/99/99"));
            }
            else
            {
               A10215XToOCoFchP = localUtil.ctod( httpContext.cgiGet( edtXToOCoFchP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10215XToOCoFchP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10215XToOCoFchP", localUtil.format(A10215XToOCoFchP, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCOCRU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoCru_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10143XToOCoCru = 0 ;
               n10143XToOCoCru = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10143XToOCoCru), 6, 0));
            }
            else
            {
               A10143XToOCoCru = (int)(localUtil.ctol( httpContext.cgiGet( edtXToOCoCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10143XToOCoCru = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10143XToOCoCru), 6, 0));
            }
            A10216XToOCoCruD = httpContext.cgiGet( edtXToOCoCruD_Internalname) ;
            n10216XToOCoCruD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoRep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCoRep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCOREP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoRep_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10145XToOCoRep = 0 ;
               n10145XToOCoRep = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10145XToOCoRep), 8, 0));
            }
            else
            {
               A10145XToOCoRep = (int)(localUtil.ctol( httpContext.cgiGet( edtXToOCoRep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10145XToOCoRep = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10145XToOCoRep), 8, 0));
            }
            A10217XToOCoRepN = httpContext.cgiGet( edtXToOCoRepN_Internalname) ;
            n10217XToOCoRepN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXToOCoCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXToOCoCnt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCOCNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCoCnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10218XToOCoCnt = DecimalUtil.ZERO ;
               n10218XToOCoCnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10218XToOCoCnt", GXutil.ltrimstr( A10218XToOCoCnt, 13, 5));
            }
            else
            {
               A10218XToOCoCnt = localUtil.ctond( httpContext.cgiGet( edtXToOCoCnt_Internalname)) ;
               n10218XToOCoCnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10218XToOCoCnt", GXutil.ltrimstr( A10218XToOCoCnt, 13, 5));
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
               A10139XToOCoCod = httpContext.GetPar( "XToOCoCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
               A10140XToOCoItm = httpContext.GetPar( "XToOCoItm") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
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
                        e1117D2 ();
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
            initAll17D1383( ) ;
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
      disableAttributes17D1383( ) ;
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

   public void confirm_17D0( )
   {
      beforeValidate17D1383( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17D1383( ) ;
         }
         else
         {
            checkExtendedTable17D1383( ) ;
            if ( AnyError == 0 )
            {
               zm17D1383( 5) ;
               zm17D1383( 6) ;
               zm17D1383( 7) ;
               zm17D1383( 8) ;
               zm17D1383( 9) ;
               zm17D1383( 10) ;
            }
            closeExtendedTableCursors17D1383( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17D0( ) ;
      }
   }

   public void resetCaption17D0( )
   {
   }

   public void e1117D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      txtooco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV13Pgmname, (byte)(99), GXv_char2) ;
      txtooco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      txtooco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      txtooco_impl.this.A396EmprCod = GXv_char2[0] ;
      txtooco_impl.this.AV11EmprNom = GXv_char3[0] ;
      txtooco_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17D1383( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10210XToOCoNat = T017D3_A10210XToOCoNat[0] ;
            Z10141XToOCoTpo = T017D3_A10141XToOCoTpo[0] ;
            Z10150XToOCoSTpo = T017D3_A10150XToOCoSTpo[0] ;
            Z10211XToOCoPrv = T017D3_A10211XToOCoPrv[0] ;
            Z10144XToOCoPrdC = T017D3_A10144XToOCoPrdC[0] ;
            Z10142XToOCoCliN = T017D3_A10142XToOCoCliN[0] ;
            Z10214XToOCoFch = T017D3_A10214XToOCoFch[0] ;
            Z10215XToOCoFchP = T017D3_A10215XToOCoFchP[0] ;
            Z10143XToOCoCru = T017D3_A10143XToOCoCru[0] ;
            Z10145XToOCoRep = T017D3_A10145XToOCoRep[0] ;
            Z10218XToOCoCnt = T017D3_A10218XToOCoCnt[0] ;
            Z10122GpoEcoCod = T017D3_A10122GpoEcoCod[0] ;
         }
         else
         {
            Z10210XToOCoNat = A10210XToOCoNat ;
            Z10141XToOCoTpo = A10141XToOCoTpo ;
            Z10150XToOCoSTpo = A10150XToOCoSTpo ;
            Z10211XToOCoPrv = A10211XToOCoPrv ;
            Z10144XToOCoPrdC = A10144XToOCoPrdC ;
            Z10142XToOCoCliN = A10142XToOCoCliN ;
            Z10214XToOCoFch = A10214XToOCoFch ;
            Z10215XToOCoFchP = A10215XToOCoFchP ;
            Z10143XToOCoCru = A10143XToOCoCru ;
            Z10145XToOCoRep = A10145XToOCoRep ;
            Z10218XToOCoCnt = A10218XToOCoCnt ;
            Z10122GpoEcoCod = A10122GpoEcoCod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z10139XToOCoCod = A10139XToOCoCod ;
         Z10140XToOCoItm = A10140XToOCoItm ;
         Z10210XToOCoNat = A10210XToOCoNat ;
         Z10141XToOCoTpo = A10141XToOCoTpo ;
         Z10150XToOCoSTpo = A10150XToOCoSTpo ;
         Z10211XToOCoPrv = A10211XToOCoPrv ;
         Z10144XToOCoPrdC = A10144XToOCoPrdC ;
         Z10142XToOCoCliN = A10142XToOCoCliN ;
         Z10214XToOCoFch = A10214XToOCoFch ;
         Z10215XToOCoFchP = A10215XToOCoFchP ;
         Z10143XToOCoCru = A10143XToOCoCru ;
         Z10145XToOCoRep = A10145XToOCoRep ;
         Z10218XToOCoCnt = A10218XToOCoCnt ;
         Z396EmprCod = A396EmprCod ;
         Z10122GpoEcoCod = A10122GpoEcoCod ;
         Z407EmprNom = A407EmprNom ;
         Z10123GpoEcoNom = A10123GpoEcoNom ;
         Z10151XToOCoPrdN = A10151XToOCoPrdN ;
         Z10213XToOCoCli = A10213XToOCoCli ;
         Z10216XToOCoCruD = A10216XToOCoCruD ;
         Z10217XToOCoRepN = A10217XToOCoRepN ;
      }
   }

   public void standaloneNotModal( )
   {
      AV13Pgmname = "TXToOCo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      /* Using cursor T017D4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017D4_A407EmprNom[0] ;
      n407EmprNom = T017D4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load17D1383( )
   {
      /* Using cursor T017D10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1383 = (short)(1) ;
         A407EmprNom = T017D10_A407EmprNom[0] ;
         n407EmprNom = T017D10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10210XToOCoNat = T017D10_A10210XToOCoNat[0] ;
         n10210XToOCoNat = T017D10_n10210XToOCoNat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10210XToOCoNat", A10210XToOCoNat);
         A10141XToOCoTpo = T017D10_A10141XToOCoTpo[0] ;
         n10141XToOCoTpo = T017D10_n10141XToOCoTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
         A10150XToOCoSTpo = T017D10_A10150XToOCoSTpo[0] ;
         n10150XToOCoSTpo = T017D10_n10150XToOCoSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", A10150XToOCoSTpo);
         A10211XToOCoPrv = T017D10_A10211XToOCoPrv[0] ;
         n10211XToOCoPrv = T017D10_n10211XToOCoPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10211XToOCoPrv), 6, 0));
         A10123GpoEcoNom = T017D10_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T017D10_n10123GpoEcoNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
         A10144XToOCoPrdC = T017D10_A10144XToOCoPrdC[0] ;
         n10144XToOCoPrdC = T017D10_n10144XToOCoPrdC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10144XToOCoPrdC", A10144XToOCoPrdC);
         A10142XToOCoCliN = T017D10_A10142XToOCoCliN[0] ;
         n10142XToOCoCliN = T017D10_n10142XToOCoCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10142XToOCoCliN), 6, 0));
         A10214XToOCoFch = T017D10_A10214XToOCoFch[0] ;
         n10214XToOCoFch = T017D10_n10214XToOCoFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10214XToOCoFch", localUtil.format(A10214XToOCoFch, "99/99/99"));
         A10215XToOCoFchP = T017D10_A10215XToOCoFchP[0] ;
         n10215XToOCoFchP = T017D10_n10215XToOCoFchP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10215XToOCoFchP", localUtil.format(A10215XToOCoFchP, "99/99/99"));
         A10143XToOCoCru = T017D10_A10143XToOCoCru[0] ;
         n10143XToOCoCru = T017D10_n10143XToOCoCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10143XToOCoCru), 6, 0));
         A10145XToOCoRep = T017D10_A10145XToOCoRep[0] ;
         n10145XToOCoRep = T017D10_n10145XToOCoRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10145XToOCoRep), 8, 0));
         A10218XToOCoCnt = T017D10_A10218XToOCoCnt[0] ;
         n10218XToOCoCnt = T017D10_n10218XToOCoCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10218XToOCoCnt", GXutil.ltrimstr( A10218XToOCoCnt, 13, 5));
         A10122GpoEcoCod = T017D10_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T017D10_n10122GpoEcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A10151XToOCoPrdN = T017D10_A10151XToOCoPrdN[0] ;
         n10151XToOCoPrdN = T017D10_n10151XToOCoPrdN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
         A10213XToOCoCli = T017D10_A10213XToOCoCli[0] ;
         n10213XToOCoCli = T017D10_n10213XToOCoCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
         A10216XToOCoCruD = T017D10_A10216XToOCoCruD[0] ;
         n10216XToOCoCruD = T017D10_n10216XToOCoCruD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
         A10217XToOCoRepN = T017D10_A10217XToOCoRepN[0] ;
         n10217XToOCoRepN = T017D10_n10217XToOCoRepN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
         zm17D1383( -4) ;
      }
      pr_default.close(8);
      onLoadActions17D1383( ) ;
   }

   public void onLoadActions17D1383( )
   {
      if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) != 0 )
      {
         A10212XToOCoPrvN = getXToOCoPrvN0( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
      }
      else
      {
         if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
         {
            A10212XToOCoPrvN = getXToOCoPrvN1( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
         else
         {
            A10212XToOCoPrvN = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
      }
   }

   public void checkExtendedTable17D1383( )
   {
      nIsDirty_1383 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T017D5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGpoEcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10123GpoEcoNom = T017D5_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T017D5_n10123GpoEcoNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      pr_default.close(3);
      /* Using cursor T017D6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n10144XToOCoPrdC), A10144XToOCoPrdC});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A10151XToOCoPrdN = T017D6_A10151XToOCoPrdN[0] ;
         n10151XToOCoPrdN = T017D6_n10151XToOCoPrdN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
      }
      else
      {
         nIsDirty_1383 = (short)(1) ;
         A10151XToOCoPrdN = "" ;
         n10151XToOCoPrdN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
      }
      pr_default.close(4);
      /* Using cursor T017D7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n10142XToOCoCliN), Integer.valueOf(A10142XToOCoCliN)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A10213XToOCoCli = T017D7_A10213XToOCoCli[0] ;
         n10213XToOCoCli = T017D7_n10213XToOCoCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
      }
      else
      {
         nIsDirty_1383 = (short)(1) ;
         A10213XToOCoCli = "" ;
         n10213XToOCoCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
      }
      pr_default.close(5);
      /* Using cursor T017D8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n10143XToOCoCru), Integer.valueOf(A10143XToOCoCru)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A10216XToOCoCruD = T017D8_A10216XToOCoCruD[0] ;
         n10216XToOCoCruD = T017D8_n10216XToOCoCruD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
      }
      else
      {
         nIsDirty_1383 = (short)(1) ;
         A10216XToOCoCruD = "" ;
         n10216XToOCoCruD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
      }
      pr_default.close(6);
      /* Using cursor T017D9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n10145XToOCoRep), Integer.valueOf(A10145XToOCoRep)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A10217XToOCoRepN = T017D9_A10217XToOCoRepN[0] ;
         n10217XToOCoRepN = T017D9_n10217XToOCoRepN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
      }
      else
      {
         nIsDirty_1383 = (short)(1) ;
         A10217XToOCoRepN = "" ;
         n10217XToOCoRepN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
      }
      pr_default.close(7);
      if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) != 0 )
      {
         nIsDirty_1383 = (short)(1) ;
         A10212XToOCoPrvN = getXToOCoPrvN0( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
      }
      else
      {
         if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
         {
            nIsDirty_1383 = (short)(1) ;
            A10212XToOCoPrvN = getXToOCoPrvN1( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
         else
         {
            nIsDirty_1383 = (short)(1) ;
            A10212XToOCoPrvN = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
      }
      if ( ! ( ( GXutil.strcmp(A10141XToOCoTpo, "P") == 0 ) || ( GXutil.strcmp(A10141XToOCoTpo, "R") == 0 ) || ( GXutil.strcmp(A10141XToOCoTpo, "H") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XTOOCOTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbXToOCoTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A10150XToOCoSTpo, "C") == 0 ) || ( GXutil.strcmp(A10150XToOCoSTpo, "P") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "SubTipo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XTOOCOSTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbXToOCoSTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors17D1383( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         int A10122GpoEcoCod )
   {
      /* Using cursor T017D11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGpoEcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10123GpoEcoNom = T017D11_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T017D11_n10123GpoEcoNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A10123GpoEcoNom)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_7( String A396EmprCod ,
                         String A10144XToOCoPrdC )
   {
      /* Using cursor T017D12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n10144XToOCoPrdC), A10144XToOCoPrdC});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A10151XToOCoPrdN = T017D12_A10151XToOCoPrdN[0] ;
         n10151XToOCoPrdN = T017D12_n10151XToOCoPrdN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
      }
      else
      {
         A10151XToOCoPrdN = "" ;
         n10151XToOCoPrdN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10151XToOCoPrdN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_8( String A396EmprCod ,
                         int A10142XToOCoCliN )
   {
      /* Using cursor T017D13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n10142XToOCoCliN), Integer.valueOf(A10142XToOCoCliN)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A10213XToOCoCli = T017D13_A10213XToOCoCli[0] ;
         n10213XToOCoCli = T017D13_n10213XToOCoCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
      }
      else
      {
         A10213XToOCoCli = "" ;
         n10213XToOCoCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10213XToOCoCli))+"\"") ;
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
                         int A10143XToOCoCru )
   {
      /* Using cursor T017D14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n10143XToOCoCru), Integer.valueOf(A10143XToOCoCru)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A10216XToOCoCruD = T017D14_A10216XToOCoCruD[0] ;
         n10216XToOCoCruD = T017D14_n10216XToOCoCruD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
      }
      else
      {
         A10216XToOCoCruD = "" ;
         n10216XToOCoCruD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10216XToOCoCruD))+"\"") ;
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
                          int A10145XToOCoRep )
   {
      /* Using cursor T017D15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n10145XToOCoRep), Integer.valueOf(A10145XToOCoRep)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A10217XToOCoRepN = T017D15_A10217XToOCoRepN[0] ;
         n10217XToOCoRepN = T017D15_n10217XToOCoRepN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
      }
      else
      {
         A10217XToOCoRepN = "" ;
         n10217XToOCoRepN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10217XToOCoRepN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey17D1383( )
   {
      /* Using cursor T017D16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1383 = (short)(1) ;
      }
      else
      {
         RcdFound1383 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017D3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017D3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17D1383( 4) ;
         RcdFound1383 = (short)(1) ;
         A10139XToOCoCod = T017D3_A10139XToOCoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
         A10140XToOCoItm = T017D3_A10140XToOCoItm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
         A10210XToOCoNat = T017D3_A10210XToOCoNat[0] ;
         n10210XToOCoNat = T017D3_n10210XToOCoNat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10210XToOCoNat", A10210XToOCoNat);
         A10141XToOCoTpo = T017D3_A10141XToOCoTpo[0] ;
         n10141XToOCoTpo = T017D3_n10141XToOCoTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
         A10150XToOCoSTpo = T017D3_A10150XToOCoSTpo[0] ;
         n10150XToOCoSTpo = T017D3_n10150XToOCoSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", A10150XToOCoSTpo);
         A10211XToOCoPrv = T017D3_A10211XToOCoPrv[0] ;
         n10211XToOCoPrv = T017D3_n10211XToOCoPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10211XToOCoPrv), 6, 0));
         A10144XToOCoPrdC = T017D3_A10144XToOCoPrdC[0] ;
         n10144XToOCoPrdC = T017D3_n10144XToOCoPrdC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10144XToOCoPrdC", A10144XToOCoPrdC);
         A10142XToOCoCliN = T017D3_A10142XToOCoCliN[0] ;
         n10142XToOCoCliN = T017D3_n10142XToOCoCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10142XToOCoCliN), 6, 0));
         A10214XToOCoFch = T017D3_A10214XToOCoFch[0] ;
         n10214XToOCoFch = T017D3_n10214XToOCoFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10214XToOCoFch", localUtil.format(A10214XToOCoFch, "99/99/99"));
         A10215XToOCoFchP = T017D3_A10215XToOCoFchP[0] ;
         n10215XToOCoFchP = T017D3_n10215XToOCoFchP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10215XToOCoFchP", localUtil.format(A10215XToOCoFchP, "99/99/99"));
         A10143XToOCoCru = T017D3_A10143XToOCoCru[0] ;
         n10143XToOCoCru = T017D3_n10143XToOCoCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10143XToOCoCru), 6, 0));
         A10145XToOCoRep = T017D3_A10145XToOCoRep[0] ;
         n10145XToOCoRep = T017D3_n10145XToOCoRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10145XToOCoRep), 8, 0));
         A10218XToOCoCnt = T017D3_A10218XToOCoCnt[0] ;
         n10218XToOCoCnt = T017D3_n10218XToOCoCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10218XToOCoCnt", GXutil.ltrimstr( A10218XToOCoCnt, 13, 5));
         A10122GpoEcoCod = T017D3_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T017D3_n10122GpoEcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z10139XToOCoCod = A10139XToOCoCod ;
         Z10140XToOCoItm = A10140XToOCoItm ;
         sMode1383 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17D1383( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1383 = (short)(0) ;
            initializeNonKey17D1383( ) ;
         }
         Gx_mode = sMode1383 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1383 = (short)(0) ;
         initializeNonKey17D1383( ) ;
         sMode1383 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1383 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17D1383( ) ;
      if ( RcdFound1383 == 0 )
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
      RcdFound1383 = (short)(0) ;
      /* Using cursor T017D17 */
      pr_default.execute(15, new Object[] {A10139XToOCoCod, A10139XToOCoCod, A10140XToOCoItm, A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T017D17_A10139XToOCoCod[0], A10139XToOCoCod) < 0 ) || ( GXutil.strcmp(T017D17_A10139XToOCoCod[0], A10139XToOCoCod) == 0 ) && ( GXutil.strcmp(T017D17_A10140XToOCoItm[0], A10140XToOCoItm) < 0 ) ) && ( GXutil.strcmp(T017D17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T017D17_A10139XToOCoCod[0], A10139XToOCoCod) > 0 ) || ( GXutil.strcmp(T017D17_A10139XToOCoCod[0], A10139XToOCoCod) == 0 ) && ( GXutil.strcmp(T017D17_A10140XToOCoItm[0], A10140XToOCoItm) > 0 ) ) && ( GXutil.strcmp(T017D17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10139XToOCoCod = T017D17_A10139XToOCoCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
            A10140XToOCoItm = T017D17_A10140XToOCoItm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
            RcdFound1383 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound1383 = (short)(0) ;
      /* Using cursor T017D18 */
      pr_default.execute(16, new Object[] {A10139XToOCoCod, A10139XToOCoCod, A10140XToOCoItm, A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T017D18_A10139XToOCoCod[0], A10139XToOCoCod) > 0 ) || ( GXutil.strcmp(T017D18_A10139XToOCoCod[0], A10139XToOCoCod) == 0 ) && ( GXutil.strcmp(T017D18_A10140XToOCoItm[0], A10140XToOCoItm) > 0 ) ) && ( GXutil.strcmp(T017D18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T017D18_A10139XToOCoCod[0], A10139XToOCoCod) < 0 ) || ( GXutil.strcmp(T017D18_A10139XToOCoCod[0], A10139XToOCoCod) == 0 ) && ( GXutil.strcmp(T017D18_A10140XToOCoItm[0], A10140XToOCoItm) < 0 ) ) && ( GXutil.strcmp(T017D18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10139XToOCoCod = T017D18_A10139XToOCoCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
            A10140XToOCoItm = T017D18_A10140XToOCoItm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
            RcdFound1383 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17D1383( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXToOCoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17D1383( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1383 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10139XToOCoCod, Z10139XToOCoCod) != 0 ) || ( GXutil.strcmp(A10140XToOCoItm, Z10140XToOCoItm) != 0 ) )
            {
               A10139XToOCoCod = Z10139XToOCoCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
               A10140XToOCoItm = Z10140XToOCoItm ;
               httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXToOCoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17D1383( ) ;
               GX_FocusControl = edtXToOCoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10139XToOCoCod, Z10139XToOCoCod) != 0 ) || ( GXutil.strcmp(A10140XToOCoItm, Z10140XToOCoItm) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtXToOCoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17D1383( ) ;
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
                  GX_FocusControl = edtXToOCoCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17D1383( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10139XToOCoCod, Z10139XToOCoCod) != 0 ) || ( GXutil.strcmp(A10140XToOCoItm, Z10140XToOCoItm) != 0 ) )
      {
         A10139XToOCoCod = Z10139XToOCoCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
         A10140XToOCoItm = Z10140XToOCoItm ;
         httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXToOCoCod_Internalname ;
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
      getKey17D1383( ) ;
      if ( RcdFound1383 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10139XToOCoCod, Z10139XToOCoCod) != 0 ) || ( GXutil.strcmp(A10140XToOCoItm, Z10140XToOCoItm) != 0 ) )
         {
            A10139XToOCoCod = Z10139XToOCoCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
            A10140XToOCoItm = Z10140XToOCoItm ;
            httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10139XToOCoCod, Z10139XToOCoCod) != 0 ) || ( GXutil.strcmp(A10140XToOCoItm, Z10140XToOCoItm) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txtooco");
      GX_FocusControl = edtXToOCoNat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17D0( ) ;
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
      if ( RcdFound1383 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtXToOCoNat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17D1383( ) ;
      if ( RcdFound1383 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXToOCoNat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17D1383( ) ;
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
      if ( RcdFound1383 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXToOCoNat_Internalname ;
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
      if ( RcdFound1383 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXToOCoNat_Internalname ;
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
      scanStart17D1383( ) ;
      if ( RcdFound1383 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1383 != 0 )
         {
            scanNext17D1383( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXToOCoNat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17D1383( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17D1383( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXToOCo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10210XToOCoNat, T017D2_A10210XToOCoNat[0]) != 0 ) || ( GXutil.strcmp(Z10141XToOCoTpo, T017D2_A10141XToOCoTpo[0]) != 0 ) || ( GXutil.strcmp(Z10150XToOCoSTpo, T017D2_A10150XToOCoSTpo[0]) != 0 ) || ( Z10211XToOCoPrv != T017D2_A10211XToOCoPrv[0] ) || ( GXutil.strcmp(Z10144XToOCoPrdC, T017D2_A10144XToOCoPrdC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10142XToOCoCliN != T017D2_A10142XToOCoCliN[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z10214XToOCoFch), GXutil.resetTime(T017D2_A10214XToOCoFch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z10215XToOCoFchP), GXutil.resetTime(T017D2_A10215XToOCoFchP[0])) ) || ( Z10143XToOCoCru != T017D2_A10143XToOCoCru[0] ) || ( Z10145XToOCoRep != T017D2_A10145XToOCoRep[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10218XToOCoCnt, T017D2_A10218XToOCoCnt[0]) != 0 ) || ( Z10122GpoEcoCod != T017D2_A10122GpoEcoCod[0] ) )
         {
            if ( GXutil.strcmp(Z10210XToOCoNat, T017D2_A10210XToOCoNat[0]) != 0 )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoNat");
               GXutil.writeLogRaw("Old: ",Z10210XToOCoNat);
               GXutil.writeLogRaw("Current: ",T017D2_A10210XToOCoNat[0]);
            }
            if ( GXutil.strcmp(Z10141XToOCoTpo, T017D2_A10141XToOCoTpo[0]) != 0 )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoTpo");
               GXutil.writeLogRaw("Old: ",Z10141XToOCoTpo);
               GXutil.writeLogRaw("Current: ",T017D2_A10141XToOCoTpo[0]);
            }
            if ( GXutil.strcmp(Z10150XToOCoSTpo, T017D2_A10150XToOCoSTpo[0]) != 0 )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoSTpo");
               GXutil.writeLogRaw("Old: ",Z10150XToOCoSTpo);
               GXutil.writeLogRaw("Current: ",T017D2_A10150XToOCoSTpo[0]);
            }
            if ( Z10211XToOCoPrv != T017D2_A10211XToOCoPrv[0] )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoPrv");
               GXutil.writeLogRaw("Old: ",Z10211XToOCoPrv);
               GXutil.writeLogRaw("Current: ",T017D2_A10211XToOCoPrv[0]);
            }
            if ( GXutil.strcmp(Z10144XToOCoPrdC, T017D2_A10144XToOCoPrdC[0]) != 0 )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoPrdC");
               GXutil.writeLogRaw("Old: ",Z10144XToOCoPrdC);
               GXutil.writeLogRaw("Current: ",T017D2_A10144XToOCoPrdC[0]);
            }
            if ( Z10142XToOCoCliN != T017D2_A10142XToOCoCliN[0] )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoCliN");
               GXutil.writeLogRaw("Old: ",Z10142XToOCoCliN);
               GXutil.writeLogRaw("Current: ",T017D2_A10142XToOCoCliN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10214XToOCoFch), GXutil.resetTime(T017D2_A10214XToOCoFch[0])) ) )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoFch");
               GXutil.writeLogRaw("Old: ",Z10214XToOCoFch);
               GXutil.writeLogRaw("Current: ",T017D2_A10214XToOCoFch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10215XToOCoFchP), GXutil.resetTime(T017D2_A10215XToOCoFchP[0])) ) )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoFchP");
               GXutil.writeLogRaw("Old: ",Z10215XToOCoFchP);
               GXutil.writeLogRaw("Current: ",T017D2_A10215XToOCoFchP[0]);
            }
            if ( Z10143XToOCoCru != T017D2_A10143XToOCoCru[0] )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoCru");
               GXutil.writeLogRaw("Old: ",Z10143XToOCoCru);
               GXutil.writeLogRaw("Current: ",T017D2_A10143XToOCoCru[0]);
            }
            if ( Z10145XToOCoRep != T017D2_A10145XToOCoRep[0] )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoRep");
               GXutil.writeLogRaw("Old: ",Z10145XToOCoRep);
               GXutil.writeLogRaw("Current: ",T017D2_A10145XToOCoRep[0]);
            }
            if ( DecimalUtil.compareTo(Z10218XToOCoCnt, T017D2_A10218XToOCoCnt[0]) != 0 )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"XToOCoCnt");
               GXutil.writeLogRaw("Old: ",Z10218XToOCoCnt);
               GXutil.writeLogRaw("Current: ",T017D2_A10218XToOCoCnt[0]);
            }
            if ( Z10122GpoEcoCod != T017D2_A10122GpoEcoCod[0] )
            {
               GXutil.writeLogln("txtooco:[seudo value changed for attri]"+"GpoEcoCod");
               GXutil.writeLogRaw("Old: ",Z10122GpoEcoCod);
               GXutil.writeLogRaw("Current: ",T017D2_A10122GpoEcoCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXToOCo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17D1383( )
   {
      beforeValidate17D1383( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17D1383( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17D1383( 0) ;
         checkOptimisticConcurrency17D1383( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17D1383( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17D1383( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017D19 */
                  pr_default.execute(17, new Object[] {A10139XToOCoCod, A10140XToOCoItm, Boolean.valueOf(n10210XToOCoNat), A10210XToOCoNat, Boolean.valueOf(n10141XToOCoTpo), A10141XToOCoTpo, Boolean.valueOf(n10150XToOCoSTpo), A10150XToOCoSTpo, Boolean.valueOf(n10211XToOCoPrv), Integer.valueOf(A10211XToOCoPrv), Boolean.valueOf(n10144XToOCoPrdC), A10144XToOCoPrdC, Boolean.valueOf(n10142XToOCoCliN), Integer.valueOf(A10142XToOCoCliN), Boolean.valueOf(n10214XToOCoFch), A10214XToOCoFch, Boolean.valueOf(n10215XToOCoFchP), A10215XToOCoFchP, Boolean.valueOf(n10143XToOCoCru), Integer.valueOf(A10143XToOCoCru), Boolean.valueOf(n10145XToOCoRep), Integer.valueOf(A10145XToOCoRep), Boolean.valueOf(n10218XToOCoCnt), A10218XToOCoCnt, A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCo");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        resetCaption17D0( ) ;
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
            load17D1383( ) ;
         }
         endLevel17D1383( ) ;
      }
      closeExtendedTableCursors17D1383( ) ;
   }

   public void update17D1383( )
   {
      beforeValidate17D1383( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17D1383( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17D1383( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17D1383( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17D1383( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017D20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n10210XToOCoNat), A10210XToOCoNat, Boolean.valueOf(n10141XToOCoTpo), A10141XToOCoTpo, Boolean.valueOf(n10150XToOCoSTpo), A10150XToOCoSTpo, Boolean.valueOf(n10211XToOCoPrv), Integer.valueOf(A10211XToOCoPrv), Boolean.valueOf(n10144XToOCoPrdC), A10144XToOCoPrdC, Boolean.valueOf(n10142XToOCoCliN), Integer.valueOf(A10142XToOCoCliN), Boolean.valueOf(n10214XToOCoFch), A10214XToOCoFch, Boolean.valueOf(n10215XToOCoFchP), A10215XToOCoFchP, Boolean.valueOf(n10143XToOCoCru), Integer.valueOf(A10143XToOCoCru), Boolean.valueOf(n10145XToOCoRep), Integer.valueOf(A10145XToOCoRep), Boolean.valueOf(n10218XToOCoCnt), A10218XToOCoCnt, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCo");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXToOCo"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17D1383( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17D0( ) ;
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
         endLevel17D1383( ) ;
      }
      closeExtendedTableCursors17D1383( ) ;
   }

   public void deferredUpdate17D1383( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17D1383( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17D1383( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17D1383( ) ;
         afterConfirm17D1383( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17D1383( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017D21 */
               pr_default.execute(19, new Object[] {A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCo");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1383 == 0 )
                     {
                        initAll17D1383( ) ;
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
                     resetCaption17D0( ) ;
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
      sMode1383 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17D1383( ) ;
      Gx_mode = sMode1383 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17D1383( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T017D22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
         A10123GpoEcoNom = T017D22_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T017D22_n10123GpoEcoNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
         pr_default.close(20);
         if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) != 0 )
         {
            A10212XToOCoPrvN = getXToOCoPrvN0( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
         else
         {
            if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
            {
               A10212XToOCoPrvN = getXToOCoPrvN1( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
            }
            else
            {
               A10212XToOCoPrvN = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
            }
         }
         /* Using cursor T017D23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n10144XToOCoPrdC), A10144XToOCoPrdC});
         if ( (pr_default.getStatus(21) != 101) )
         {
            A10151XToOCoPrdN = T017D23_A10151XToOCoPrdN[0] ;
            n10151XToOCoPrdN = T017D23_n10151XToOCoPrdN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
         }
         else
         {
            A10151XToOCoPrdN = "" ;
            n10151XToOCoPrdN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
         }
         pr_default.close(21);
         /* Using cursor T017D24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n10142XToOCoCliN), Integer.valueOf(A10142XToOCoCliN)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A10213XToOCoCli = T017D24_A10213XToOCoCli[0] ;
            n10213XToOCoCli = T017D24_n10213XToOCoCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
         }
         else
         {
            A10213XToOCoCli = "" ;
            n10213XToOCoCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
         }
         pr_default.close(22);
         /* Using cursor T017D25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n10143XToOCoCru), Integer.valueOf(A10143XToOCoCru)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A10216XToOCoCruD = T017D25_A10216XToOCoCruD[0] ;
            n10216XToOCoCruD = T017D25_n10216XToOCoCruD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
         }
         else
         {
            A10216XToOCoCruD = "" ;
            n10216XToOCoCruD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
         }
         pr_default.close(23);
         /* Using cursor T017D26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n10145XToOCoRep), Integer.valueOf(A10145XToOCoRep)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A10217XToOCoRepN = T017D26_A10217XToOCoRepN[0] ;
            n10217XToOCoRepN = T017D26_n10217XToOCoRepN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
         }
         else
         {
            A10217XToOCoRepN = "" ;
            n10217XToOCoRepN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
         }
         pr_default.close(24);
      }
   }

   public void endLevel17D1383( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17D1383( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txtooco");
         if ( AnyError == 0 )
         {
            confirmValues17D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txtooco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17D1383( )
   {
      /* Scan By routine */
      /* Using cursor T017D27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound1383 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1383 = (short)(1) ;
         A10139XToOCoCod = T017D27_A10139XToOCoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
         A10140XToOCoItm = T017D27_A10140XToOCoItm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17D1383( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1383 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1383 = (short)(1) ;
         A10139XToOCoCod = T017D27_A10139XToOCoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
         A10140XToOCoItm = T017D27_A10140XToOCoItm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
      }
   }

   public void scanEnd17D1383( )
   {
      pr_default.close(25);
   }

   public void afterConfirm17D1383( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17D1383( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17D1383( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17D1383( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17D1383( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17D1383( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17D1383( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtXToOCoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoCod_Enabled), 5, 0), true);
      edtXToOCoItm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoItm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoItm_Enabled), 5, 0), true);
      edtXToOCoNat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoNat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoNat_Enabled), 5, 0), true);
      cmbXToOCoTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbXToOCoTpo.getEnabled(), 5, 0), true);
      cmbXToOCoSTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoSTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbXToOCoSTpo.getEnabled(), 5, 0), true);
      edtXToOCoPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoPrv_Enabled), 5, 0), true);
      edtXToOCoPrvN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoPrvN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoPrvN_Enabled), 5, 0), true);
      edtGpoEcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGpoEcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoCod_Enabled), 5, 0), true);
      edtGpoEcoNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGpoEcoNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoNom_Enabled), 5, 0), true);
      edtXToOCoPrdC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoPrdC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoPrdC_Enabled), 5, 0), true);
      edtXToOCoPrdN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoPrdN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoPrdN_Enabled), 5, 0), true);
      edtXToOCoCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoCliN_Enabled), 5, 0), true);
      edtXToOCoCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoCli_Enabled), 5, 0), true);
      edtXToOCoFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoFch_Enabled), 5, 0), true);
      edtXToOCoFchP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoFchP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoFchP_Enabled), 5, 0), true);
      edtXToOCoCru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoCru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoCru_Enabled), 5, 0), true);
      edtXToOCoCruD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoCruD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoCruD_Enabled), 5, 0), true);
      edtXToOCoRep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoRep_Enabled), 5, 0), true);
      edtXToOCoRepN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoRepN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoRepN_Enabled), 5, 0), true);
      edtXToOCoCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCoCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCoCnt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17D1383( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17D0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txtooco", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10139XToOCoCod", GXutil.rtrim( Z10139XToOCoCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10140XToOCoItm", GXutil.rtrim( Z10140XToOCoItm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10210XToOCoNat", GXutil.rtrim( Z10210XToOCoNat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10141XToOCoTpo", GXutil.rtrim( Z10141XToOCoTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10150XToOCoSTpo", GXutil.rtrim( Z10150XToOCoSTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10211XToOCoPrv", GXutil.ltrim( localUtil.ntoc( Z10211XToOCoPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10144XToOCoPrdC", GXutil.rtrim( Z10144XToOCoPrdC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10142XToOCoCliN", GXutil.ltrim( localUtil.ntoc( Z10142XToOCoCliN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10214XToOCoFch", localUtil.dtoc( Z10214XToOCoFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10215XToOCoFchP", localUtil.dtoc( Z10215XToOCoFchP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10143XToOCoCru", GXutil.ltrim( localUtil.ntoc( Z10143XToOCoCru, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10145XToOCoRep", GXutil.ltrim( localUtil.ntoc( Z10145XToOCoRep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10218XToOCoCnt", GXutil.ltrim( localUtil.ntoc( Z10218XToOCoCnt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( Z10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
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
      return formatLink("app.txtooco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TXToOCo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Orden de Compra de Totvs.", "") ;
   }

   public void initializeNonKey17D1383( )
   {
      A10151XToOCoPrdN = "" ;
      n10151XToOCoPrdN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", A10151XToOCoPrdN);
      A10212XToOCoPrvN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
      A10213XToOCoCli = "" ;
      n10213XToOCoCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", A10213XToOCoCli);
      A10216XToOCoCruD = "" ;
      n10216XToOCoCruD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", A10216XToOCoCruD);
      A10217XToOCoRepN = "" ;
      n10217XToOCoRepN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", A10217XToOCoRepN);
      A10210XToOCoNat = "" ;
      n10210XToOCoNat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10210XToOCoNat", A10210XToOCoNat);
      A10141XToOCoTpo = "" ;
      n10141XToOCoTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
      A10150XToOCoSTpo = "" ;
      n10150XToOCoSTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", A10150XToOCoSTpo);
      A10211XToOCoPrv = 0 ;
      n10211XToOCoPrv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10211XToOCoPrv), 6, 0));
      A10122GpoEcoCod = 0 ;
      n10122GpoEcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
      A10123GpoEcoNom = "" ;
      n10123GpoEcoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      A10144XToOCoPrdC = "" ;
      n10144XToOCoPrdC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10144XToOCoPrdC", A10144XToOCoPrdC);
      A10142XToOCoCliN = 0 ;
      n10142XToOCoCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10142XToOCoCliN), 6, 0));
      A10214XToOCoFch = GXutil.nullDate() ;
      n10214XToOCoFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10214XToOCoFch", localUtil.format(A10214XToOCoFch, "99/99/99"));
      A10215XToOCoFchP = GXutil.nullDate() ;
      n10215XToOCoFchP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10215XToOCoFchP", localUtil.format(A10215XToOCoFchP, "99/99/99"));
      A10143XToOCoCru = 0 ;
      n10143XToOCoCru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10143XToOCoCru), 6, 0));
      A10145XToOCoRep = 0 ;
      n10145XToOCoRep = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10145XToOCoRep), 8, 0));
      A10218XToOCoCnt = DecimalUtil.ZERO ;
      n10218XToOCoCnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10218XToOCoCnt", GXutil.ltrimstr( A10218XToOCoCnt, 13, 5));
      Z10210XToOCoNat = "" ;
      Z10141XToOCoTpo = "" ;
      Z10150XToOCoSTpo = "" ;
      Z10211XToOCoPrv = 0 ;
      Z10144XToOCoPrdC = "" ;
      Z10142XToOCoCliN = 0 ;
      Z10214XToOCoFch = GXutil.nullDate() ;
      Z10215XToOCoFchP = GXutil.nullDate() ;
      Z10143XToOCoCru = 0 ;
      Z10145XToOCoRep = 0 ;
      Z10218XToOCoCnt = DecimalUtil.ZERO ;
      Z10122GpoEcoCod = 0 ;
   }

   public void initAll17D1383( )
   {
      A10139XToOCoCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10139XToOCoCod", A10139XToOCoCod);
      A10140XToOCoItm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10140XToOCoItm", A10140XToOCoItm);
      initializeNonKey17D1383( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555515", true, true);
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
      httpContext.AddJavascriptSource("txtooco.js", "?20268241555515", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXToOCoCod_Internalname = "XTOOCOCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXToOCoItm_Internalname = "XTOOCOITM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXToOCoNat_Internalname = "XTOOCONAT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      cmbXToOCoTpo.setInternalname( "XTOOCOTPO" );
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      cmbXToOCoSTpo.setInternalname( "XTOOCOSTPO" );
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXToOCoPrv_Internalname = "XTOOCOPRV" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXToOCoPrvN_Internalname = "XTOOCOPRVN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtGpoEcoCod_Internalname = "GPOECOCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtGpoEcoNom_Internalname = "GPOECONOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtXToOCoPrdC_Internalname = "XTOOCOPRDC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtXToOCoPrdN_Internalname = "XTOOCOPRDN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtXToOCoCliN_Internalname = "XTOOCOCLIN" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtXToOCoCli_Internalname = "XTOOCOCLI" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtXToOCoFch_Internalname = "XTOOCOFCH" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtXToOCoFchP_Internalname = "XTOOCOFCHP" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtXToOCoCru_Internalname = "XTOOCOCRU" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtXToOCoCruD_Internalname = "XTOOCOCRUD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtXToOCoRep_Internalname = "XTOOCOREP" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtXToOCoRepN_Internalname = "XTOOCOREPN" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtXToOCoCnt_Internalname = "XTOOCOCNT" ;
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
      Form.setCaption( httpContext.getMessage( "Orden de Compra de Totvs.", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXToOCoCnt_Jsonclick = "" ;
      edtXToOCoCnt_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoCnt_Enabled = 1 ;
      edtXToOCoRepN_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoRepN_Enabled = 0 ;
      edtXToOCoRep_Jsonclick = "" ;
      edtXToOCoRep_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoRep_Enabled = 1 ;
      edtXToOCoCruD_Jsonclick = "" ;
      edtXToOCoCruD_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoCruD_Enabled = 0 ;
      edtXToOCoCru_Jsonclick = "" ;
      edtXToOCoCru_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoCru_Enabled = 1 ;
      edtXToOCoFchP_Jsonclick = "" ;
      edtXToOCoFchP_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoFchP_Enabled = 1 ;
      edtXToOCoFch_Jsonclick = "" ;
      edtXToOCoFch_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoFch_Enabled = 1 ;
      edtXToOCoCli_Jsonclick = "" ;
      edtXToOCoCli_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoCli_Enabled = 0 ;
      edtXToOCoCliN_Jsonclick = "" ;
      edtXToOCoCliN_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoCliN_Enabled = 1 ;
      edtXToOCoPrdN_Jsonclick = "" ;
      edtXToOCoPrdN_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoPrdN_Enabled = 0 ;
      edtXToOCoPrdC_Jsonclick = "" ;
      edtXToOCoPrdC_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoPrdC_Enabled = 1 ;
      edtGpoEcoNom_Jsonclick = "" ;
      edtGpoEcoNom_Backcolor = (int)(0xFFFFFF) ;
      edtGpoEcoNom_Enabled = 0 ;
      edtGpoEcoCod_Jsonclick = "" ;
      edtGpoEcoCod_Backcolor = (int)(0xFFFFFF) ;
      edtGpoEcoCod_Enabled = 1 ;
      edtXToOCoPrvN_Jsonclick = "" ;
      edtXToOCoPrvN_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoPrvN_Enabled = 0 ;
      edtXToOCoPrv_Jsonclick = "" ;
      edtXToOCoPrv_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoPrv_Enabled = 1 ;
      cmbXToOCoSTpo.setJsonclick( "" );
      cmbXToOCoSTpo.setEnabled( 1 );
      cmbXToOCoSTpo.setIBackground( (int)(0xFFFFFF) );
      cmbXToOCoTpo.setJsonclick( "" );
      cmbXToOCoTpo.setEnabled( 1 );
      cmbXToOCoTpo.setIBackground( (int)(0xFFFFFF) );
      edtXToOCoNat_Jsonclick = "" ;
      edtXToOCoNat_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoNat_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXToOCoItm_Jsonclick = "" ;
      edtXToOCoItm_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoItm_Enabled = 1 ;
      edtXToOCoCod_Jsonclick = "" ;
      edtXToOCoCod_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCoCod_Enabled = 1 ;
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

   public void gx3asaxtoocoprvn17D1383( String A396EmprCod ,
                                        int A10211XToOCoPrv ,
                                        int A10122GpoEcoCod ,
                                        String A10141XToOCoTpo )
   {
      if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) != 0 )
      {
         A10212XToOCoPrvN = getXToOCoPrvN0( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
      }
      else
      {
         if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
         {
            A10212XToOCoPrvN = getXToOCoPrvN1( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
         else
         {
            A10212XToOCoPrvN = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", A10212XToOCoPrvN);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10212XToOCoPrvN))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      cmbXToOCoTpo.setName( "XTOOCOTPO" );
      cmbXToOCoTpo.setWebtags( "" );
      cmbXToOCoTpo.addItem("H", httpContext.getMessage( "Hilado", ""), (short)(0));
      cmbXToOCoTpo.addItem("P", httpContext.getMessage( "Productos", ""), (short)(0));
      cmbXToOCoTpo.addItem("R", httpContext.getMessage( "Repuestos", ""), (short)(0));
      if ( cmbXToOCoTpo.getItemCount() > 0 )
      {
         A10141XToOCoTpo = cmbXToOCoTpo.getValidValue(A10141XToOCoTpo) ;
         n10141XToOCoTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", A10141XToOCoTpo);
      }
      cmbXToOCoSTpo.setName( "XTOOCOSTPO" );
      cmbXToOCoSTpo.setWebtags( "" );
      cmbXToOCoSTpo.addItem("P", httpContext.getMessage( "Propio", ""), (short)(0));
      cmbXToOCoSTpo.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
      if ( cmbXToOCoSTpo.getItemCount() > 0 )
      {
         A10150XToOCoSTpo = cmbXToOCoSTpo.getValidValue(A10150XToOCoSTpo) ;
         n10150XToOCoSTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", A10150XToOCoSTpo);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T017D28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017D28_A407EmprNom[0] ;
      n407EmprNom = T017D28_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      GX_FocusControl = edtXToOCoNat_Internalname ;
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

   public void valid_Xtoocoitm( )
   {
      n10150XToOCoSTpo = false ;
      A10150XToOCoSTpo = cmbXToOCoSTpo.getValue() ;
      n10150XToOCoSTpo = false ;
      cmbXToOCoSTpo.setValue( A10150XToOCoSTpo );
      n10141XToOCoTpo = false ;
      A10141XToOCoTpo = cmbXToOCoTpo.getValue() ;
      n10141XToOCoTpo = false ;
      cmbXToOCoTpo.setValue( A10141XToOCoTpo );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbXToOCoTpo.getItemCount() > 0 )
      {
         A10141XToOCoTpo = cmbXToOCoTpo.getValidValue(A10141XToOCoTpo) ;
         n10141XToOCoTpo = false ;
         cmbXToOCoTpo.setValue( A10141XToOCoTpo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbXToOCoTpo.setValue( GXutil.rtrim( A10141XToOCoTpo) );
      }
      if ( cmbXToOCoSTpo.getItemCount() > 0 )
      {
         A10150XToOCoSTpo = cmbXToOCoSTpo.getValidValue(A10150XToOCoSTpo) ;
         n10150XToOCoSTpo = false ;
         cmbXToOCoSTpo.setValue( A10150XToOCoSTpo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbXToOCoSTpo.setValue( GXutil.rtrim( A10150XToOCoSTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10210XToOCoNat", GXutil.rtrim( A10210XToOCoNat));
      httpContext.ajax_rsp_assign_attri("", false, "A10141XToOCoTpo", GXutil.rtrim( A10141XToOCoTpo));
      cmbXToOCoTpo.setValue( GXutil.rtrim( A10141XToOCoTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoTpo.getInternalname(), "Values", cmbXToOCoTpo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10150XToOCoSTpo", GXutil.rtrim( A10150XToOCoSTpo));
      cmbXToOCoSTpo.setValue( GXutil.rtrim( A10150XToOCoSTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCoSTpo.getInternalname(), "Values", cmbXToOCoSTpo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10211XToOCoPrv", GXutil.ltrim( localUtil.ntoc( A10211XToOCoPrv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10144XToOCoPrdC", GXutil.rtrim( A10144XToOCoPrdC));
      httpContext.ajax_rsp_assign_attri("", false, "A10142XToOCoCliN", GXutil.ltrim( localUtil.ntoc( A10142XToOCoCliN, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10214XToOCoFch", localUtil.format(A10214XToOCoFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10215XToOCoFchP", localUtil.format(A10215XToOCoFchP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10143XToOCoCru", GXutil.ltrim( localUtil.ntoc( A10143XToOCoCru, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10145XToOCoRep", GXutil.ltrim( localUtil.ntoc( A10145XToOCoRep, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10218XToOCoCnt", GXutil.ltrim( localUtil.ntoc( A10218XToOCoCnt, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", GXutil.rtrim( A10151XToOCoPrdN));
      httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", GXutil.rtrim( A10213XToOCoCli));
      httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", GXutil.rtrim( A10216XToOCoCruD));
      httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", GXutil.rtrim( A10217XToOCoRepN));
      httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", GXutil.rtrim( A10212XToOCoPrvN));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10139XToOCoCod", GXutil.rtrim( Z10139XToOCoCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10140XToOCoItm", GXutil.rtrim( Z10140XToOCoItm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10210XToOCoNat", GXutil.rtrim( Z10210XToOCoNat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10141XToOCoTpo", GXutil.rtrim( Z10141XToOCoTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10150XToOCoSTpo", GXutil.rtrim( Z10150XToOCoSTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10211XToOCoPrv", GXutil.ltrim( localUtil.ntoc( Z10211XToOCoPrv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( Z10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10144XToOCoPrdC", GXutil.rtrim( Z10144XToOCoPrdC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10142XToOCoCliN", GXutil.ltrim( localUtil.ntoc( Z10142XToOCoCliN, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10214XToOCoFch", localUtil.format(Z10214XToOCoFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10215XToOCoFchP", localUtil.format(Z10215XToOCoFchP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10143XToOCoCru", GXutil.ltrim( localUtil.ntoc( Z10143XToOCoCru, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10145XToOCoRep", GXutil.ltrim( localUtil.ntoc( Z10145XToOCoRep, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10218XToOCoCnt", GXutil.ltrim( localUtil.ntoc( Z10218XToOCoCnt, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10123GpoEcoNom", Z10123GpoEcoNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10151XToOCoPrdN", GXutil.rtrim( Z10151XToOCoPrdN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10213XToOCoCli", GXutil.rtrim( Z10213XToOCoCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10216XToOCoCruD", GXutil.rtrim( Z10216XToOCoCruD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10217XToOCoRepN", GXutil.rtrim( Z10217XToOCoRepN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10212XToOCoPrvN", GXutil.rtrim( Z10212XToOCoPrvN));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Gpoecocod( )
   {
      n10122GpoEcoCod = false ;
      n10211XToOCoPrv = false ;
      n10141XToOCoTpo = false ;
      A10141XToOCoTpo = cmbXToOCoTpo.getValue() ;
      n10141XToOCoTpo = false ;
      n10123GpoEcoNom = false ;
      /* Using cursor T017D22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGpoEcoCod_Internalname ;
      }
      A10123GpoEcoNom = T017D22_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T017D22_n10123GpoEcoNom[0] ;
      pr_default.close(20);
      if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) != 0 )
      {
         A10212XToOCoPrvN = getXToOCoPrvN0( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
      }
      else
      {
         if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
         {
            A10212XToOCoPrvN = getXToOCoPrvN1( A396EmprCod, A10211XToOCoPrv, A10122GpoEcoCod) ;
         }
         else
         {
            A10212XToOCoPrvN = "" ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      httpContext.ajax_rsp_assign_attri("", false, "A10212XToOCoPrvN", GXutil.rtrim( A10212XToOCoPrvN));
   }

   public void valid_Xtoocoprdc( )
   {
      n10144XToOCoPrdC = false ;
      n10151XToOCoPrdN = false ;
      /* Using cursor T017D23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n10144XToOCoPrdC), A10144XToOCoPrdC});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A10151XToOCoPrdN = T017D23_A10151XToOCoPrdN[0] ;
         n10151XToOCoPrdN = T017D23_n10151XToOCoPrdN[0] ;
      }
      else
      {
         A10151XToOCoPrdN = "" ;
         n10151XToOCoPrdN = false ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10151XToOCoPrdN", GXutil.rtrim( A10151XToOCoPrdN));
   }

   public void valid_Xtoococlin( )
   {
      n10142XToOCoCliN = false ;
      n10213XToOCoCli = false ;
      /* Using cursor T017D24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n10142XToOCoCliN), Integer.valueOf(A10142XToOCoCliN)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A10213XToOCoCli = T017D24_A10213XToOCoCli[0] ;
         n10213XToOCoCli = T017D24_n10213XToOCoCli[0] ;
      }
      else
      {
         A10213XToOCoCli = "" ;
         n10213XToOCoCli = false ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10213XToOCoCli", GXutil.rtrim( A10213XToOCoCli));
   }

   public void valid_Xtoococru( )
   {
      n10143XToOCoCru = false ;
      n10216XToOCoCruD = false ;
      /* Using cursor T017D25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n10143XToOCoCru), Integer.valueOf(A10143XToOCoCru)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A10216XToOCoCruD = T017D25_A10216XToOCoCruD[0] ;
         n10216XToOCoCruD = T017D25_n10216XToOCoCruD[0] ;
      }
      else
      {
         A10216XToOCoCruD = "" ;
         n10216XToOCoCruD = false ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10216XToOCoCruD", GXutil.rtrim( A10216XToOCoCruD));
   }

   public void valid_Xtoocorep( )
   {
      n10145XToOCoRep = false ;
      n10217XToOCoRepN = false ;
      /* Using cursor T017D26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n10145XToOCoRep), Integer.valueOf(A10145XToOCoRep)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A10217XToOCoRepN = T017D26_A10217XToOCoRepN[0] ;
         n10217XToOCoRepN = T017D26_n10217XToOCoRepN[0] ;
      }
      else
      {
         A10217XToOCoRepN = "" ;
         n10217XToOCoRepN = false ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10217XToOCoRepN", GXutil.rtrim( A10217XToOCoRepN));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_XTOOCOCOD","{handler:'valid_Xtoococod',iparms:[]");
      setEventMetadata("VALID_XTOOCOCOD",",oparms:[]}");
      setEventMetadata("VALID_XTOOCOITM","{handler:'valid_Xtoocoitm',iparms:[{av:'cmbXToOCoSTpo'},{av:'A10150XToOCoSTpo',fld:'XTOOCOSTPO',pic:''},{av:'cmbXToOCoTpo'},{av:'A10141XToOCoTpo',fld:'XTOOCOTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10139XToOCoCod',fld:'XTOOCOCOD',pic:''},{av:'A10140XToOCoItm',fld:'XTOOCOITM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XTOOCOITM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10210XToOCoNat',fld:'XTOOCONAT',pic:''},{av:'cmbXToOCoTpo'},{av:'A10141XToOCoTpo',fld:'XTOOCOTPO',pic:''},{av:'cmbXToOCoSTpo'},{av:'A10150XToOCoSTpo',fld:'XTOOCOSTPO',pic:''},{av:'A10211XToOCoPrv',fld:'XTOOCOPRV',pic:'ZZZZZ9'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'A10144XToOCoPrdC',fld:'XTOOCOPRDC',pic:''},{av:'A10142XToOCoCliN',fld:'XTOOCOCLIN',pic:'ZZZZZ9'},{av:'A10214XToOCoFch',fld:'XTOOCOFCH',pic:''},{av:'A10215XToOCoFchP',fld:'XTOOCOFCHP',pic:''},{av:'A10143XToOCoCru',fld:'XTOOCOCRU',pic:'ZZZZZ9'},{av:'A10145XToOCoRep',fld:'XTOOCOREP',pic:'ZZZZZZZ9'},{av:'A10218XToOCoCnt',fld:'XTOOCOCNT',pic:'Z,ZZZ,ZZ9.99999'},{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A10151XToOCoPrdN',fld:'XTOOCOPRDN',pic:''},{av:'A10213XToOCoCli',fld:'XTOOCOCLI',pic:''},{av:'A10216XToOCoCruD',fld:'XTOOCOCRUD',pic:''},{av:'A10217XToOCoRepN',fld:'XTOOCOREPN',pic:''},{av:'A10212XToOCoPrvN',fld:'XTOOCOPRVN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10139XToOCoCod'},{av:'Z10140XToOCoItm'},{av:'Z407EmprNom'},{av:'Z10210XToOCoNat'},{av:'Z10141XToOCoTpo'},{av:'Z10150XToOCoSTpo'},{av:'Z10211XToOCoPrv'},{av:'Z10122GpoEcoCod'},{av:'Z10144XToOCoPrdC'},{av:'Z10142XToOCoCliN'},{av:'Z10214XToOCoFch'},{av:'Z10215XToOCoFchP'},{av:'Z10143XToOCoCru'},{av:'Z10145XToOCoRep'},{av:'Z10218XToOCoCnt'},{av:'Z10123GpoEcoNom'},{av:'Z10151XToOCoPrdN'},{av:'Z10213XToOCoCli'},{av:'Z10216XToOCoCruD'},{av:'Z10217XToOCoRepN'},{av:'Z10212XToOCoPrvN'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XTOOCOTPO","{handler:'valid_Xtoocotpo',iparms:[]");
      setEventMetadata("VALID_XTOOCOTPO",",oparms:[]}");
      setEventMetadata("VALID_XTOOCOSTPO","{handler:'valid_Xtoocostpo',iparms:[]");
      setEventMetadata("VALID_XTOOCOSTPO",",oparms:[]}");
      setEventMetadata("VALID_XTOOCOPRV","{handler:'valid_Xtoocoprv',iparms:[]");
      setEventMetadata("VALID_XTOOCOPRV",",oparms:[]}");
      setEventMetadata("VALID_GPOECOCOD","{handler:'valid_Gpoecocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'A10211XToOCoPrv',fld:'XTOOCOPRV',pic:'ZZZZZ9'},{av:'cmbXToOCoTpo'},{av:'A10141XToOCoTpo',fld:'XTOOCOTPO',pic:''},{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A10212XToOCoPrvN',fld:'XTOOCOPRVN',pic:''}]");
      setEventMetadata("VALID_GPOECOCOD",",oparms:[{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A10212XToOCoPrvN',fld:'XTOOCOPRVN',pic:''}]}");
      setEventMetadata("VALID_XTOOCOPRDC","{handler:'valid_Xtoocoprdc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10144XToOCoPrdC',fld:'XTOOCOPRDC',pic:''},{av:'A10151XToOCoPrdN',fld:'XTOOCOPRDN',pic:''}]");
      setEventMetadata("VALID_XTOOCOPRDC",",oparms:[{av:'A10151XToOCoPrdN',fld:'XTOOCOPRDN',pic:''}]}");
      setEventMetadata("VALID_XTOOCOCLIN","{handler:'valid_Xtoococlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10142XToOCoCliN',fld:'XTOOCOCLIN',pic:'ZZZZZ9'},{av:'A10213XToOCoCli',fld:'XTOOCOCLI',pic:''}]");
      setEventMetadata("VALID_XTOOCOCLIN",",oparms:[{av:'A10213XToOCoCli',fld:'XTOOCOCLI',pic:''}]}");
      setEventMetadata("VALID_XTOOCOCRU","{handler:'valid_Xtoococru',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10143XToOCoCru',fld:'XTOOCOCRU',pic:'ZZZZZ9'},{av:'A10216XToOCoCruD',fld:'XTOOCOCRUD',pic:''}]");
      setEventMetadata("VALID_XTOOCOCRU",",oparms:[{av:'A10216XToOCoCruD',fld:'XTOOCOCRUD',pic:''}]}");
      setEventMetadata("VALID_XTOOCOREP","{handler:'valid_Xtoocorep',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10145XToOCoRep',fld:'XTOOCOREP',pic:'ZZZZZZZ9'},{av:'A10217XToOCoRepN',fld:'XTOOCOREPN',pic:''}]");
      setEventMetadata("VALID_XTOOCOREP",",oparms:[{av:'A10217XToOCoRepN',fld:'XTOOCOREPN',pic:''}]}");
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
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public String getXToOCoPrvN1( String E396EmprCod ,
                                 int E10211XToOCoPrv ,
                                 int E10122GpoEcoCod )
   {
      X971ProceNom = "" ;
      nX971ProceNom = false ;
      Gx_first = true ;
      /* Using cursor T017D29 */
      pr_default.execute(27, new Object[] {E396EmprCod, Boolean.valueOf(nA10211XToOCoPrv), Integer.valueOf(E10211XToOCoPrv)});
      while ( (pr_default.getStatus(27) != 101) )
      {
         if ( ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E10211XToOCoPrv == T017D29_A970ProceCod[0] ) ) && ( ( E10122GpoEcoCod == E10122GpoEcoCod ) ) )
         {
            X971ProceNom = T017D29_A971ProceNom[0] ;
            nX971ProceNom = false ;
            if (true) break;
         }
         pr_default.readNext(27);
      }
      pr_default.close(27);
      return X971ProceNom ;
   }

   public String getXToOCoPrvN0( String E396EmprCod ,
                                 int E10211XToOCoPrv ,
                                 int E10122GpoEcoCod )
   {
      X794PrvNom = "" ;
      nX794PrvNom = false ;
      Gx_first = true ;
      /* Using cursor T017D30 */
      pr_default.execute(28, new Object[] {E396EmprCod, Boolean.valueOf(nE10211XToOCoPrv), Integer.valueOf(E10211XToOCoPrv)});
      while ( (pr_default.getStatus(28) != 101) )
      {
         if ( ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E10211XToOCoPrv == T017D30_A795PrvNum[0] ) ) && ( ( E10122GpoEcoCod == E10122GpoEcoCod ) ) )
         {
            X794PrvNom = T017D30_A794PrvNom[0] ;
            nX794PrvNom = false ;
            if (true) break;
         }
         pr_default.readNext(28);
      }
      pr_default.close(28);
      return X794PrvNom ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10139XToOCoCod = "" ;
      Z10140XToOCoItm = "" ;
      Z10210XToOCoNat = "" ;
      Z10141XToOCoTpo = "" ;
      Z10150XToOCoSTpo = "" ;
      Z10144XToOCoPrdC = "" ;
      Z10214XToOCoFch = GXutil.nullDate() ;
      Z10215XToOCoFchP = GXutil.nullDate() ;
      Z10218XToOCoCnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10141XToOCoTpo = "" ;
      A10144XToOCoPrdC = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10150XToOCoSTpo = "" ;
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
      A10139XToOCoCod = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10140XToOCoItm = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10210XToOCoNat = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10212XToOCoPrvN = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10123GpoEcoNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10151XToOCoPrdN = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A10213XToOCoCli = "" ;
      lblTextblock16_Jsonclick = "" ;
      A10214XToOCoFch = GXutil.nullDate() ;
      lblTextblock17_Jsonclick = "" ;
      A10215XToOCoFchP = GXutil.nullDate() ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10216XToOCoCruD = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A10217XToOCoRepN = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10218XToOCoCnt = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV13Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z10123GpoEcoNom = "" ;
      Z10151XToOCoPrdN = "" ;
      Z10213XToOCoCli = "" ;
      Z10216XToOCoCruD = "" ;
      Z10217XToOCoRepN = "" ;
      T017D4_A407EmprNom = new String[] {""} ;
      T017D4_n407EmprNom = new boolean[] {false} ;
      T017D10_A9492MRCod = new int[1] ;
      T017D10_A5874CruCod = new int[1] ;
      T017D10_A252CliCod = new int[1] ;
      T017D10_A719PrdNum = new String[] {""} ;
      T017D10_A10139XToOCoCod = new String[] {""} ;
      T017D10_A10140XToOCoItm = new String[] {""} ;
      T017D10_A407EmprNom = new String[] {""} ;
      T017D10_n407EmprNom = new boolean[] {false} ;
      T017D10_A10210XToOCoNat = new String[] {""} ;
      T017D10_n10210XToOCoNat = new boolean[] {false} ;
      T017D10_A10141XToOCoTpo = new String[] {""} ;
      T017D10_n10141XToOCoTpo = new boolean[] {false} ;
      T017D10_A10150XToOCoSTpo = new String[] {""} ;
      T017D10_n10150XToOCoSTpo = new boolean[] {false} ;
      T017D10_A10211XToOCoPrv = new int[1] ;
      T017D10_n10211XToOCoPrv = new boolean[] {false} ;
      T017D10_A10123GpoEcoNom = new String[] {""} ;
      T017D10_n10123GpoEcoNom = new boolean[] {false} ;
      T017D10_A10144XToOCoPrdC = new String[] {""} ;
      T017D10_n10144XToOCoPrdC = new boolean[] {false} ;
      T017D10_A10142XToOCoCliN = new int[1] ;
      T017D10_n10142XToOCoCliN = new boolean[] {false} ;
      T017D10_A10214XToOCoFch = new java.util.Date[] {GXutil.nullDate()} ;
      T017D10_n10214XToOCoFch = new boolean[] {false} ;
      T017D10_A10215XToOCoFchP = new java.util.Date[] {GXutil.nullDate()} ;
      T017D10_n10215XToOCoFchP = new boolean[] {false} ;
      T017D10_A10143XToOCoCru = new int[1] ;
      T017D10_n10143XToOCoCru = new boolean[] {false} ;
      T017D10_A10145XToOCoRep = new int[1] ;
      T017D10_n10145XToOCoRep = new boolean[] {false} ;
      T017D10_A10218XToOCoCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017D10_n10218XToOCoCnt = new boolean[] {false} ;
      T017D10_A396EmprCod = new String[] {""} ;
      T017D10_A10122GpoEcoCod = new int[1] ;
      T017D10_n10122GpoEcoCod = new boolean[] {false} ;
      T017D10_A10151XToOCoPrdN = new String[] {""} ;
      T017D10_n10151XToOCoPrdN = new boolean[] {false} ;
      T017D10_A10213XToOCoCli = new String[] {""} ;
      T017D10_n10213XToOCoCli = new boolean[] {false} ;
      T017D10_A10216XToOCoCruD = new String[] {""} ;
      T017D10_n10216XToOCoCruD = new boolean[] {false} ;
      T017D10_A10217XToOCoRepN = new String[] {""} ;
      T017D10_n10217XToOCoRepN = new boolean[] {false} ;
      T017D5_A10123GpoEcoNom = new String[] {""} ;
      T017D5_n10123GpoEcoNom = new boolean[] {false} ;
      T017D6_A10151XToOCoPrdN = new String[] {""} ;
      T017D6_n10151XToOCoPrdN = new boolean[] {false} ;
      T017D7_A10213XToOCoCli = new String[] {""} ;
      T017D7_n10213XToOCoCli = new boolean[] {false} ;
      T017D8_A10216XToOCoCruD = new String[] {""} ;
      T017D8_n10216XToOCoCruD = new boolean[] {false} ;
      T017D9_A10217XToOCoRepN = new String[] {""} ;
      T017D9_n10217XToOCoRepN = new boolean[] {false} ;
      T017D11_A10123GpoEcoNom = new String[] {""} ;
      T017D11_n10123GpoEcoNom = new boolean[] {false} ;
      T017D12_A10151XToOCoPrdN = new String[] {""} ;
      T017D12_n10151XToOCoPrdN = new boolean[] {false} ;
      T017D13_A10213XToOCoCli = new String[] {""} ;
      T017D13_n10213XToOCoCli = new boolean[] {false} ;
      T017D14_A10216XToOCoCruD = new String[] {""} ;
      T017D14_n10216XToOCoCruD = new boolean[] {false} ;
      T017D15_A10217XToOCoRepN = new String[] {""} ;
      T017D15_n10217XToOCoRepN = new boolean[] {false} ;
      T017D16_A396EmprCod = new String[] {""} ;
      T017D16_A10139XToOCoCod = new String[] {""} ;
      T017D16_A10140XToOCoItm = new String[] {""} ;
      T017D3_A10139XToOCoCod = new String[] {""} ;
      T017D3_A10140XToOCoItm = new String[] {""} ;
      T017D3_A10210XToOCoNat = new String[] {""} ;
      T017D3_n10210XToOCoNat = new boolean[] {false} ;
      T017D3_A10141XToOCoTpo = new String[] {""} ;
      T017D3_n10141XToOCoTpo = new boolean[] {false} ;
      T017D3_A10150XToOCoSTpo = new String[] {""} ;
      T017D3_n10150XToOCoSTpo = new boolean[] {false} ;
      T017D3_A10211XToOCoPrv = new int[1] ;
      T017D3_n10211XToOCoPrv = new boolean[] {false} ;
      T017D3_A10144XToOCoPrdC = new String[] {""} ;
      T017D3_n10144XToOCoPrdC = new boolean[] {false} ;
      T017D3_A10142XToOCoCliN = new int[1] ;
      T017D3_n10142XToOCoCliN = new boolean[] {false} ;
      T017D3_A10214XToOCoFch = new java.util.Date[] {GXutil.nullDate()} ;
      T017D3_n10214XToOCoFch = new boolean[] {false} ;
      T017D3_A10215XToOCoFchP = new java.util.Date[] {GXutil.nullDate()} ;
      T017D3_n10215XToOCoFchP = new boolean[] {false} ;
      T017D3_A10143XToOCoCru = new int[1] ;
      T017D3_n10143XToOCoCru = new boolean[] {false} ;
      T017D3_A10145XToOCoRep = new int[1] ;
      T017D3_n10145XToOCoRep = new boolean[] {false} ;
      T017D3_A10218XToOCoCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017D3_n10218XToOCoCnt = new boolean[] {false} ;
      T017D3_A396EmprCod = new String[] {""} ;
      T017D3_A10122GpoEcoCod = new int[1] ;
      T017D3_n10122GpoEcoCod = new boolean[] {false} ;
      sMode1383 = "" ;
      T017D17_A396EmprCod = new String[] {""} ;
      T017D17_A10139XToOCoCod = new String[] {""} ;
      T017D17_A10140XToOCoItm = new String[] {""} ;
      T017D18_A396EmprCod = new String[] {""} ;
      T017D18_A10139XToOCoCod = new String[] {""} ;
      T017D18_A10140XToOCoItm = new String[] {""} ;
      T017D2_A10139XToOCoCod = new String[] {""} ;
      T017D2_A10140XToOCoItm = new String[] {""} ;
      T017D2_A10210XToOCoNat = new String[] {""} ;
      T017D2_n10210XToOCoNat = new boolean[] {false} ;
      T017D2_A10141XToOCoTpo = new String[] {""} ;
      T017D2_n10141XToOCoTpo = new boolean[] {false} ;
      T017D2_A10150XToOCoSTpo = new String[] {""} ;
      T017D2_n10150XToOCoSTpo = new boolean[] {false} ;
      T017D2_A10211XToOCoPrv = new int[1] ;
      T017D2_n10211XToOCoPrv = new boolean[] {false} ;
      T017D2_A10144XToOCoPrdC = new String[] {""} ;
      T017D2_n10144XToOCoPrdC = new boolean[] {false} ;
      T017D2_A10142XToOCoCliN = new int[1] ;
      T017D2_n10142XToOCoCliN = new boolean[] {false} ;
      T017D2_A10214XToOCoFch = new java.util.Date[] {GXutil.nullDate()} ;
      T017D2_n10214XToOCoFch = new boolean[] {false} ;
      T017D2_A10215XToOCoFchP = new java.util.Date[] {GXutil.nullDate()} ;
      T017D2_n10215XToOCoFchP = new boolean[] {false} ;
      T017D2_A10143XToOCoCru = new int[1] ;
      T017D2_n10143XToOCoCru = new boolean[] {false} ;
      T017D2_A10145XToOCoRep = new int[1] ;
      T017D2_n10145XToOCoRep = new boolean[] {false} ;
      T017D2_A10218XToOCoCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017D2_n10218XToOCoCnt = new boolean[] {false} ;
      T017D2_A396EmprCod = new String[] {""} ;
      T017D2_A10122GpoEcoCod = new int[1] ;
      T017D2_n10122GpoEcoCod = new boolean[] {false} ;
      T017D22_A10123GpoEcoNom = new String[] {""} ;
      T017D22_n10123GpoEcoNom = new boolean[] {false} ;
      T017D23_A10151XToOCoPrdN = new String[] {""} ;
      T017D23_n10151XToOCoPrdN = new boolean[] {false} ;
      T017D24_A10213XToOCoCli = new String[] {""} ;
      T017D24_n10213XToOCoCli = new boolean[] {false} ;
      T017D25_A10216XToOCoCruD = new String[] {""} ;
      T017D25_n10216XToOCoCruD = new boolean[] {false} ;
      T017D26_A10217XToOCoRepN = new String[] {""} ;
      T017D26_n10217XToOCoRepN = new boolean[] {false} ;
      T017D27_A396EmprCod = new String[] {""} ;
      T017D27_A10139XToOCoCod = new String[] {""} ;
      T017D27_A10140XToOCoItm = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T017D28_A407EmprNom = new String[] {""} ;
      T017D28_n407EmprNom = new boolean[] {false} ;
      Z10212XToOCoPrvN = "" ;
      ZZ396EmprCod = "" ;
      ZZ10139XToOCoCod = "" ;
      ZZ10140XToOCoItm = "" ;
      ZZ407EmprNom = "" ;
      ZZ10210XToOCoNat = "" ;
      ZZ10141XToOCoTpo = "" ;
      ZZ10150XToOCoSTpo = "" ;
      ZZ10144XToOCoPrdC = "" ;
      ZZ10214XToOCoFch = GXutil.nullDate() ;
      ZZ10215XToOCoFchP = GXutil.nullDate() ;
      ZZ10218XToOCoCnt = DecimalUtil.ZERO ;
      ZZ10123GpoEcoNom = "" ;
      ZZ10151XToOCoPrdN = "" ;
      ZZ10213XToOCoCli = "" ;
      ZZ10216XToOCoCruD = "" ;
      ZZ10217XToOCoRepN = "" ;
      ZZ10212XToOCoPrvN = "" ;
      X971ProceNom = "" ;
      E396EmprCod = "" ;
      T017D29_A396EmprCod = new String[] {""} ;
      T017D29_A970ProceCod = new short[1] ;
      T017D29_A971ProceNom = new String[] {""} ;
      T017D29_n971ProceNom = new boolean[] {false} ;
      X794PrvNom = "" ;
      T017D30_A396EmprCod = new String[] {""} ;
      T017D30_A795PrvNum = new int[1] ;
      T017D30_A794PrvNom = new String[] {""} ;
      T017D30_n794PrvNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.txtooco__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txtooco__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txtooco__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txtooco__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txtooco__default(),
         new Object[] {
             new Object[] {
            T017D2_A10139XToOCoCod, T017D2_A10140XToOCoItm, T017D2_A10210XToOCoNat, T017D2_n10210XToOCoNat, T017D2_A10141XToOCoTpo, T017D2_n10141XToOCoTpo, T017D2_A10150XToOCoSTpo, T017D2_n10150XToOCoSTpo, T017D2_A10211XToOCoPrv, T017D2_n10211XToOCoPrv,
            T017D2_A10144XToOCoPrdC, T017D2_n10144XToOCoPrdC, T017D2_A10142XToOCoCliN, T017D2_n10142XToOCoCliN, T017D2_A10214XToOCoFch, T017D2_n10214XToOCoFch, T017D2_A10215XToOCoFchP, T017D2_n10215XToOCoFchP, T017D2_A10143XToOCoCru, T017D2_n10143XToOCoCru,
            T017D2_A10145XToOCoRep, T017D2_n10145XToOCoRep, T017D2_A10218XToOCoCnt, T017D2_n10218XToOCoCnt, T017D2_A396EmprCod, T017D2_A10122GpoEcoCod, T017D2_n10122GpoEcoCod
            }
            , new Object[] {
            T017D3_A10139XToOCoCod, T017D3_A10140XToOCoItm, T017D3_A10210XToOCoNat, T017D3_n10210XToOCoNat, T017D3_A10141XToOCoTpo, T017D3_n10141XToOCoTpo, T017D3_A10150XToOCoSTpo, T017D3_n10150XToOCoSTpo, T017D3_A10211XToOCoPrv, T017D3_n10211XToOCoPrv,
            T017D3_A10144XToOCoPrdC, T017D3_n10144XToOCoPrdC, T017D3_A10142XToOCoCliN, T017D3_n10142XToOCoCliN, T017D3_A10214XToOCoFch, T017D3_n10214XToOCoFch, T017D3_A10215XToOCoFchP, T017D3_n10215XToOCoFchP, T017D3_A10143XToOCoCru, T017D3_n10143XToOCoCru,
            T017D3_A10145XToOCoRep, T017D3_n10145XToOCoRep, T017D3_A10218XToOCoCnt, T017D3_n10218XToOCoCnt, T017D3_A396EmprCod, T017D3_A10122GpoEcoCod, T017D3_n10122GpoEcoCod
            }
            , new Object[] {
            T017D4_A407EmprNom, T017D4_n407EmprNom
            }
            , new Object[] {
            T017D5_A10123GpoEcoNom, T017D5_n10123GpoEcoNom
            }
            , new Object[] {
            T017D6_A10151XToOCoPrdN, T017D6_n10151XToOCoPrdN
            }
            , new Object[] {
            T017D7_A10213XToOCoCli, T017D7_n10213XToOCoCli
            }
            , new Object[] {
            T017D8_A10216XToOCoCruD, T017D8_n10216XToOCoCruD
            }
            , new Object[] {
            T017D9_A10217XToOCoRepN, T017D9_n10217XToOCoRepN
            }
            , new Object[] {
            T017D10_A9492MRCod, T017D10_A5874CruCod, T017D10_A252CliCod, T017D10_A719PrdNum, T017D10_A10139XToOCoCod, T017D10_A10140XToOCoItm, T017D10_A407EmprNom, T017D10_n407EmprNom, T017D10_A10210XToOCoNat, T017D10_n10210XToOCoNat,
            T017D10_A10141XToOCoTpo, T017D10_n10141XToOCoTpo, T017D10_A10150XToOCoSTpo, T017D10_n10150XToOCoSTpo, T017D10_A10211XToOCoPrv, T017D10_n10211XToOCoPrv, T017D10_A10123GpoEcoNom, T017D10_n10123GpoEcoNom, T017D10_A10144XToOCoPrdC, T017D10_n10144XToOCoPrdC,
            T017D10_A10142XToOCoCliN, T017D10_n10142XToOCoCliN, T017D10_A10214XToOCoFch, T017D10_n10214XToOCoFch, T017D10_A10215XToOCoFchP, T017D10_n10215XToOCoFchP, T017D10_A10143XToOCoCru, T017D10_n10143XToOCoCru, T017D10_A10145XToOCoRep, T017D10_n10145XToOCoRep,
            T017D10_A10218XToOCoCnt, T017D10_n10218XToOCoCnt, T017D10_A396EmprCod, T017D10_A10122GpoEcoCod, T017D10_n10122GpoEcoCod, T017D10_A10151XToOCoPrdN, T017D10_n10151XToOCoPrdN, T017D10_A10213XToOCoCli, T017D10_n10213XToOCoCli, T017D10_A10216XToOCoCruD,
            T017D10_n10216XToOCoCruD, T017D10_A10217XToOCoRepN, T017D10_n10217XToOCoRepN
            }
            , new Object[] {
            T017D11_A10123GpoEcoNom, T017D11_n10123GpoEcoNom
            }
            , new Object[] {
            T017D12_A10151XToOCoPrdN, T017D12_n10151XToOCoPrdN
            }
            , new Object[] {
            T017D13_A10213XToOCoCli, T017D13_n10213XToOCoCli
            }
            , new Object[] {
            T017D14_A10216XToOCoCruD, T017D14_n10216XToOCoCruD
            }
            , new Object[] {
            T017D15_A10217XToOCoRepN, T017D15_n10217XToOCoRepN
            }
            , new Object[] {
            T017D16_A396EmprCod, T017D16_A10139XToOCoCod, T017D16_A10140XToOCoItm
            }
            , new Object[] {
            T017D17_A396EmprCod, T017D17_A10139XToOCoCod, T017D17_A10140XToOCoItm
            }
            , new Object[] {
            T017D18_A396EmprCod, T017D18_A10139XToOCoCod, T017D18_A10140XToOCoItm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017D22_A10123GpoEcoNom, T017D22_n10123GpoEcoNom
            }
            , new Object[] {
            T017D23_A10151XToOCoPrdN, T017D23_n10151XToOCoPrdN
            }
            , new Object[] {
            T017D24_A10213XToOCoCli, T017D24_n10213XToOCoCli
            }
            , new Object[] {
            T017D25_A10216XToOCoCruD, T017D25_n10216XToOCoCruD
            }
            , new Object[] {
            T017D26_A10217XToOCoRepN, T017D26_n10217XToOCoRepN
            }
            , new Object[] {
            T017D27_A396EmprCod, T017D27_A10139XToOCoCod, T017D27_A10140XToOCoItm
            }
            , new Object[] {
            T017D28_A407EmprNom, T017D28_n407EmprNom
            }
            , new Object[] {
            T017D29_A396EmprCod, T017D29_A970ProceCod, T017D29_A971ProceNom, T017D29_n971ProceNom
            }
            , new Object[] {
            T017D30_A396EmprCod, T017D30_A795PrvNum, T017D30_A794PrvNom, T017D30_n794PrvNom
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV13Pgmname = "TXToOCo" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1383 ;
   private short nIsDirty_1383 ;
   private int Z10211XToOCoPrv ;
   private int Z10142XToOCoCliN ;
   private int Z10143XToOCoCru ;
   private int Z10145XToOCoRep ;
   private int Z10122GpoEcoCod ;
   private int A10211XToOCoPrv ;
   private int A10122GpoEcoCod ;
   private int A10142XToOCoCliN ;
   private int A10143XToOCoCru ;
   private int A10145XToOCoRep ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtXToOCoCod_Enabled ;
   private int edtXToOCoItm_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXToOCoNat_Enabled ;
   private int edtXToOCoPrv_Enabled ;
   private int edtXToOCoPrvN_Enabled ;
   private int edtGpoEcoCod_Enabled ;
   private int edtGpoEcoNom_Enabled ;
   private int edtXToOCoPrdC_Enabled ;
   private int edtXToOCoPrdN_Enabled ;
   private int edtXToOCoCliN_Enabled ;
   private int edtXToOCoCli_Enabled ;
   private int edtXToOCoFch_Enabled ;
   private int edtXToOCoFchP_Enabled ;
   private int edtXToOCoCru_Enabled ;
   private int edtXToOCoCruD_Enabled ;
   private int edtXToOCoRep_Enabled ;
   private int edtXToOCoRepN_Enabled ;
   private int edtXToOCoCnt_Enabled ;
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
   private int edtXToOCoCnt_Backcolor ;
   private int edtXToOCoRepN_Backcolor ;
   private int edtXToOCoRep_Backcolor ;
   private int edtXToOCoCruD_Backcolor ;
   private int edtXToOCoCru_Backcolor ;
   private int edtXToOCoFchP_Backcolor ;
   private int edtXToOCoFch_Backcolor ;
   private int edtXToOCoCli_Backcolor ;
   private int edtXToOCoCliN_Backcolor ;
   private int edtXToOCoPrdN_Backcolor ;
   private int edtXToOCoPrdC_Backcolor ;
   private int edtGpoEcoNom_Backcolor ;
   private int edtGpoEcoCod_Backcolor ;
   private int edtXToOCoPrvN_Backcolor ;
   private int edtXToOCoPrv_Backcolor ;
   private int edtXToOCoNat_Backcolor ;
   private int edtXToOCoItm_Backcolor ;
   private int edtXToOCoCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10211XToOCoPrv ;
   private int ZZ10122GpoEcoCod ;
   private int ZZ10142XToOCoCliN ;
   private int ZZ10143XToOCoCru ;
   private int ZZ10145XToOCoRep ;
   private int E10211XToOCoPrv ;
   private int E10122GpoEcoCod ;
   private java.math.BigDecimal Z10218XToOCoCnt ;
   private java.math.BigDecimal A10218XToOCoCnt ;
   private java.math.BigDecimal ZZ10218XToOCoCnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10139XToOCoCod ;
   private String Z10140XToOCoItm ;
   private String Z10210XToOCoNat ;
   private String Z10141XToOCoTpo ;
   private String Z10150XToOCoSTpo ;
   private String Z10144XToOCoPrdC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10141XToOCoTpo ;
   private String A10144XToOCoPrdC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXToOCoCod_Internalname ;
   private String A10150XToOCoSTpo ;
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
   private String A10139XToOCoCod ;
   private String edtXToOCoCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXToOCoItm_Internalname ;
   private String A10140XToOCoItm ;
   private String edtXToOCoItm_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXToOCoNat_Internalname ;
   private String A10210XToOCoNat ;
   private String edtXToOCoNat_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXToOCoPrv_Internalname ;
   private String edtXToOCoPrv_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXToOCoPrvN_Internalname ;
   private String A10212XToOCoPrvN ;
   private String edtXToOCoPrvN_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtGpoEcoCod_Internalname ;
   private String edtGpoEcoCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtGpoEcoNom_Internalname ;
   private String edtGpoEcoNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtXToOCoPrdC_Internalname ;
   private String edtXToOCoPrdC_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtXToOCoPrdN_Internalname ;
   private String A10151XToOCoPrdN ;
   private String edtXToOCoPrdN_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtXToOCoCliN_Internalname ;
   private String edtXToOCoCliN_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtXToOCoCli_Internalname ;
   private String A10213XToOCoCli ;
   private String edtXToOCoCli_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtXToOCoFch_Internalname ;
   private String edtXToOCoFch_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtXToOCoFchP_Internalname ;
   private String edtXToOCoFchP_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtXToOCoCru_Internalname ;
   private String edtXToOCoCru_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtXToOCoCruD_Internalname ;
   private String A10216XToOCoCruD ;
   private String edtXToOCoCruD_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtXToOCoRep_Internalname ;
   private String edtXToOCoRep_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtXToOCoRepN_Internalname ;
   private String A10217XToOCoRepN ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtXToOCoCnt_Internalname ;
   private String edtXToOCoCnt_Jsonclick ;
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
   private String AV13Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z10151XToOCoPrdN ;
   private String Z10213XToOCoCli ;
   private String Z10216XToOCoCruD ;
   private String Z10217XToOCoRepN ;
   private String sMode1383 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z10212XToOCoPrvN ;
   private String ZZ396EmprCod ;
   private String ZZ10139XToOCoCod ;
   private String ZZ10140XToOCoItm ;
   private String ZZ407EmprNom ;
   private String ZZ10210XToOCoNat ;
   private String ZZ10141XToOCoTpo ;
   private String ZZ10150XToOCoSTpo ;
   private String ZZ10144XToOCoPrdC ;
   private String ZZ10151XToOCoPrdN ;
   private String ZZ10213XToOCoCli ;
   private String ZZ10216XToOCoCruD ;
   private String ZZ10217XToOCoRepN ;
   private String ZZ10212XToOCoPrvN ;
   private String X971ProceNom ;
   private String E396EmprCod ;
   private String X794PrvNom ;
   private java.util.Date Z10214XToOCoFch ;
   private java.util.Date Z10215XToOCoFchP ;
   private java.util.Date A10214XToOCoFch ;
   private java.util.Date A10215XToOCoFchP ;
   private java.util.Date ZZ10214XToOCoFch ;
   private java.util.Date ZZ10215XToOCoFchP ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10211XToOCoPrv ;
   private boolean n10122GpoEcoCod ;
   private boolean n10141XToOCoTpo ;
   private boolean n10144XToOCoPrdC ;
   private boolean n10142XToOCoCliN ;
   private boolean n10143XToOCoCru ;
   private boolean n10145XToOCoRep ;
   private boolean wbErr ;
   private boolean n10150XToOCoSTpo ;
   private boolean n407EmprNom ;
   private boolean n10210XToOCoNat ;
   private boolean n10123GpoEcoNom ;
   private boolean n10151XToOCoPrdN ;
   private boolean n10213XToOCoCli ;
   private boolean n10214XToOCoFch ;
   private boolean n10215XToOCoFchP ;
   private boolean n10216XToOCoCruD ;
   private boolean n10217XToOCoRepN ;
   private boolean n10218XToOCoCnt ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean nX971ProceNom ;
   private boolean Gx_first ;
   private boolean nA10211XToOCoPrv ;
   private boolean nX794PrvNom ;
   private boolean nE10211XToOCoPrv ;
   private String A10123GpoEcoNom ;
   private String Z10123GpoEcoNom ;
   private String ZZ10123GpoEcoNom ;
   private HTMLChoice cmbXToOCoTpo ;
   private HTMLChoice cmbXToOCoSTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T017D4_A407EmprNom ;
   private boolean[] T017D4_n407EmprNom ;
   private int[] T017D10_A9492MRCod ;
   private int[] T017D10_A5874CruCod ;
   private int[] T017D10_A252CliCod ;
   private String[] T017D10_A719PrdNum ;
   private String[] T017D10_A10139XToOCoCod ;
   private String[] T017D10_A10140XToOCoItm ;
   private String[] T017D10_A407EmprNom ;
   private boolean[] T017D10_n407EmprNom ;
   private String[] T017D10_A10210XToOCoNat ;
   private boolean[] T017D10_n10210XToOCoNat ;
   private String[] T017D10_A10141XToOCoTpo ;
   private boolean[] T017D10_n10141XToOCoTpo ;
   private String[] T017D10_A10150XToOCoSTpo ;
   private boolean[] T017D10_n10150XToOCoSTpo ;
   private int[] T017D10_A10211XToOCoPrv ;
   private boolean[] T017D10_n10211XToOCoPrv ;
   private String[] T017D10_A10123GpoEcoNom ;
   private boolean[] T017D10_n10123GpoEcoNom ;
   private String[] T017D10_A10144XToOCoPrdC ;
   private boolean[] T017D10_n10144XToOCoPrdC ;
   private int[] T017D10_A10142XToOCoCliN ;
   private boolean[] T017D10_n10142XToOCoCliN ;
   private java.util.Date[] T017D10_A10214XToOCoFch ;
   private boolean[] T017D10_n10214XToOCoFch ;
   private java.util.Date[] T017D10_A10215XToOCoFchP ;
   private boolean[] T017D10_n10215XToOCoFchP ;
   private int[] T017D10_A10143XToOCoCru ;
   private boolean[] T017D10_n10143XToOCoCru ;
   private int[] T017D10_A10145XToOCoRep ;
   private boolean[] T017D10_n10145XToOCoRep ;
   private java.math.BigDecimal[] T017D10_A10218XToOCoCnt ;
   private boolean[] T017D10_n10218XToOCoCnt ;
   private String[] T017D10_A396EmprCod ;
   private int[] T017D10_A10122GpoEcoCod ;
   private boolean[] T017D10_n10122GpoEcoCod ;
   private String[] T017D10_A10151XToOCoPrdN ;
   private boolean[] T017D10_n10151XToOCoPrdN ;
   private String[] T017D10_A10213XToOCoCli ;
   private boolean[] T017D10_n10213XToOCoCli ;
   private String[] T017D10_A10216XToOCoCruD ;
   private boolean[] T017D10_n10216XToOCoCruD ;
   private String[] T017D10_A10217XToOCoRepN ;
   private boolean[] T017D10_n10217XToOCoRepN ;
   private String[] T017D5_A10123GpoEcoNom ;
   private boolean[] T017D5_n10123GpoEcoNom ;
   private String[] T017D6_A10151XToOCoPrdN ;
   private boolean[] T017D6_n10151XToOCoPrdN ;
   private String[] T017D7_A10213XToOCoCli ;
   private boolean[] T017D7_n10213XToOCoCli ;
   private String[] T017D8_A10216XToOCoCruD ;
   private boolean[] T017D8_n10216XToOCoCruD ;
   private String[] T017D9_A10217XToOCoRepN ;
   private boolean[] T017D9_n10217XToOCoRepN ;
   private String[] T017D11_A10123GpoEcoNom ;
   private boolean[] T017D11_n10123GpoEcoNom ;
   private String[] T017D12_A10151XToOCoPrdN ;
   private boolean[] T017D12_n10151XToOCoPrdN ;
   private String[] T017D13_A10213XToOCoCli ;
   private boolean[] T017D13_n10213XToOCoCli ;
   private String[] T017D14_A10216XToOCoCruD ;
   private boolean[] T017D14_n10216XToOCoCruD ;
   private String[] T017D15_A10217XToOCoRepN ;
   private boolean[] T017D15_n10217XToOCoRepN ;
   private String[] T017D16_A396EmprCod ;
   private String[] T017D16_A10139XToOCoCod ;
   private String[] T017D16_A10140XToOCoItm ;
   private String[] T017D3_A10139XToOCoCod ;
   private String[] T017D3_A10140XToOCoItm ;
   private String[] T017D3_A10210XToOCoNat ;
   private boolean[] T017D3_n10210XToOCoNat ;
   private String[] T017D3_A10141XToOCoTpo ;
   private boolean[] T017D3_n10141XToOCoTpo ;
   private String[] T017D3_A10150XToOCoSTpo ;
   private boolean[] T017D3_n10150XToOCoSTpo ;
   private int[] T017D3_A10211XToOCoPrv ;
   private boolean[] T017D3_n10211XToOCoPrv ;
   private String[] T017D3_A10144XToOCoPrdC ;
   private boolean[] T017D3_n10144XToOCoPrdC ;
   private int[] T017D3_A10142XToOCoCliN ;
   private boolean[] T017D3_n10142XToOCoCliN ;
   private java.util.Date[] T017D3_A10214XToOCoFch ;
   private boolean[] T017D3_n10214XToOCoFch ;
   private java.util.Date[] T017D3_A10215XToOCoFchP ;
   private boolean[] T017D3_n10215XToOCoFchP ;
   private int[] T017D3_A10143XToOCoCru ;
   private boolean[] T017D3_n10143XToOCoCru ;
   private int[] T017D3_A10145XToOCoRep ;
   private boolean[] T017D3_n10145XToOCoRep ;
   private java.math.BigDecimal[] T017D3_A10218XToOCoCnt ;
   private boolean[] T017D3_n10218XToOCoCnt ;
   private String[] T017D3_A396EmprCod ;
   private int[] T017D3_A10122GpoEcoCod ;
   private boolean[] T017D3_n10122GpoEcoCod ;
   private String[] T017D17_A396EmprCod ;
   private String[] T017D17_A10139XToOCoCod ;
   private String[] T017D17_A10140XToOCoItm ;
   private String[] T017D18_A396EmprCod ;
   private String[] T017D18_A10139XToOCoCod ;
   private String[] T017D18_A10140XToOCoItm ;
   private String[] T017D2_A10139XToOCoCod ;
   private String[] T017D2_A10140XToOCoItm ;
   private String[] T017D2_A10210XToOCoNat ;
   private boolean[] T017D2_n10210XToOCoNat ;
   private String[] T017D2_A10141XToOCoTpo ;
   private boolean[] T017D2_n10141XToOCoTpo ;
   private String[] T017D2_A10150XToOCoSTpo ;
   private boolean[] T017D2_n10150XToOCoSTpo ;
   private int[] T017D2_A10211XToOCoPrv ;
   private boolean[] T017D2_n10211XToOCoPrv ;
   private String[] T017D2_A10144XToOCoPrdC ;
   private boolean[] T017D2_n10144XToOCoPrdC ;
   private int[] T017D2_A10142XToOCoCliN ;
   private boolean[] T017D2_n10142XToOCoCliN ;
   private java.util.Date[] T017D2_A10214XToOCoFch ;
   private boolean[] T017D2_n10214XToOCoFch ;
   private java.util.Date[] T017D2_A10215XToOCoFchP ;
   private boolean[] T017D2_n10215XToOCoFchP ;
   private int[] T017D2_A10143XToOCoCru ;
   private boolean[] T017D2_n10143XToOCoCru ;
   private int[] T017D2_A10145XToOCoRep ;
   private boolean[] T017D2_n10145XToOCoRep ;
   private java.math.BigDecimal[] T017D2_A10218XToOCoCnt ;
   private boolean[] T017D2_n10218XToOCoCnt ;
   private String[] T017D2_A396EmprCod ;
   private int[] T017D2_A10122GpoEcoCod ;
   private boolean[] T017D2_n10122GpoEcoCod ;
   private String[] T017D22_A10123GpoEcoNom ;
   private boolean[] T017D22_n10123GpoEcoNom ;
   private String[] T017D23_A10151XToOCoPrdN ;
   private boolean[] T017D23_n10151XToOCoPrdN ;
   private String[] T017D24_A10213XToOCoCli ;
   private boolean[] T017D24_n10213XToOCoCli ;
   private String[] T017D25_A10216XToOCoCruD ;
   private boolean[] T017D25_n10216XToOCoCruD ;
   private String[] T017D26_A10217XToOCoRepN ;
   private boolean[] T017D26_n10217XToOCoRepN ;
   private String[] T017D27_A396EmprCod ;
   private String[] T017D27_A10139XToOCoCod ;
   private String[] T017D27_A10140XToOCoItm ;
   private String[] T017D28_A407EmprNom ;
   private boolean[] T017D28_n407EmprNom ;
   private String[] T017D29_A396EmprCod ;
   private short[] T017D29_A970ProceCod ;
   private String[] T017D29_A971ProceNom ;
   private boolean[] T017D29_n971ProceNom ;
   private String[] T017D30_A396EmprCod ;
   private int[] T017D30_A795PrvNum ;
   private String[] T017D30_A794PrvNom ;
   private boolean[] T017D30_n794PrvNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txtooco__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtooco__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtooco__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtooco__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtooco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017D2", "SELECT XToOCoCod, XToOCoItm, XToOCoNat, XToOCoTpo, XToOCoSTpo, XToOCoPrv, XToOCoPrdC, XToOCoCliN, XToOCoFch, XToOCoFchP, XToOCoCru, XToOCoRep, XToOCoCnt, EmprCod, GpoEcoCod FROM TXPXToOCo WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ?  FOR UPDATE OF XToOCoNat, XToOCoTpo, XToOCoSTpo, XToOCoPrv, XToOCoPrdC, XToOCoCliN, XToOCoFch, XToOCoFchP, XToOCoCru, XToOCoRep, XToOCoCnt, GpoEcoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D3", "SELECT XToOCoCod, XToOCoItm, XToOCoNat, XToOCoTpo, XToOCoSTpo, XToOCoPrv, XToOCoPrdC, XToOCoCliN, XToOCoFch, XToOCoFchP, XToOCoCru, XToOCoRep, XToOCoCnt, EmprCod, GpoEcoCod FROM TXPXToOCo WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D5", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D6", "SELECT COALESCE( PrdNom, '') AS XToOCoPrdN FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D7", "SELECT COALESCE( CliNom, '') AS XToOCoCli FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D8", "SELECT COALESCE( CruDsc, '') AS XToOCoCruD FROM TXPCruTip WHERE EmprCod = ? AND CruCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D9", "SELECT COALESCE( MRNom, '') AS XToOCoRepN FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D10", "SELECT /*+ FIRST_ROWS(100) */ T7.MRCod, T6.CruCod, T5.CliCod, T4.PrdNum, TM1.XToOCoCod, TM1.XToOCoItm, T2.EmprNom, TM1.XToOCoNat, TM1.XToOCoTpo, TM1.XToOCoSTpo, TM1.XToOCoPrv, T3.GpoEcoNom, TM1.XToOCoPrdC, TM1.XToOCoCliN, TM1.XToOCoFch, TM1.XToOCoFchP, TM1.XToOCoCru, TM1.XToOCoRep, TM1.XToOCoCnt, TM1.EmprCod, TM1.GpoEcoCod, COALESCE( T4.PrdNom, '') AS XToOCoPrdN, COALESCE( T5.CliNom, '') AS XToOCoCli, COALESCE( T6.CruDsc, '') AS XToOCoCruD, COALESCE( T7.MRNom, '') AS XToOCoRepN FROM ((((((TXPXToOCo TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPGPOECO T3 ON T3.EmprCod = TM1.EmprCod AND T3.GpoEcoCod = TM1.GpoEcoCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.XToOCoPrdC) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.XToOCoCliN) LEFT JOIN TXPCruTip T6 ON T6.EmprCod = TM1.EmprCod AND T6.CruCod = TM1.XToOCoCru) LEFT JOIN TXPMREPUE T7 ON T7.EmprCod = TM1.EmprCod AND T7.MRCod = TM1.XToOCoRep) WHERE TM1.EmprCod = ? and TM1.XToOCoCod = ? and TM1.XToOCoItm = ? ORDER BY TM1.EmprCod, TM1.XToOCoCod, TM1.XToOCoItm ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D11", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D12", "SELECT COALESCE( PrdNom, '') AS XToOCoPrdN FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D13", "SELECT COALESCE( CliNom, '') AS XToOCoCli FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D14", "SELECT COALESCE( CruDsc, '') AS XToOCoCruD FROM TXPCruTip WHERE EmprCod = ? AND CruCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D15", "SELECT COALESCE( MRNom, '') AS XToOCoRepN FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XToOCoCod, XToOCoItm FROM TXPXToOCo WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XToOCoCod, XToOCoItm FROM TXPXToOCo WHERE ( XToOCoCod > ? or XToOCoCod = ? and XToOCoItm > ?) and EmprCod = ? ORDER BY EmprCod, XToOCoCod, XToOCoItm) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017D18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XToOCoCod, XToOCoItm FROM TXPXToOCo WHERE ( XToOCoCod < ? or XToOCoCod = ? and XToOCoItm < ?) and EmprCod = ? ORDER BY EmprCod DESC, XToOCoCod DESC, XToOCoItm DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017D19", "INSERT INTO TXPXToOCo(XToOCoCod, XToOCoItm, XToOCoNat, XToOCoTpo, XToOCoSTpo, XToOCoPrv, XToOCoPrdC, XToOCoCliN, XToOCoFch, XToOCoFchP, XToOCoCru, XToOCoRep, XToOCoCnt, EmprCod, GpoEcoCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXToOCo")
         ,new UpdateCursor("T017D20", "UPDATE TXPXToOCo SET XToOCoNat=?, XToOCoTpo=?, XToOCoSTpo=?, XToOCoPrv=?, XToOCoPrdC=?, XToOCoCliN=?, XToOCoFch=?, XToOCoFchP=?, XToOCoCru=?, XToOCoRep=?, XToOCoCnt=?, GpoEcoCod=?  WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ?", GX_NOMASK, "TXPXToOCo")
         ,new UpdateCursor("T017D21", "DELETE FROM TXPXToOCo  WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ?", GX_NOMASK, "TXPXToOCo")
         ,new ForEachCursor("T017D22", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D23", "SELECT COALESCE( PrdNom, '') AS XToOCoPrdN FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D24", "SELECT COALESCE( CliNom, '') AS XToOCoCli FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D25", "SELECT COALESCE( CruDsc, '') AS XToOCoCruD FROM TXPCruTip WHERE EmprCod = ? AND CruCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D26", "SELECT COALESCE( MRNom, '') AS XToOCoRepN FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XToOCoCod, XToOCoItm FROM TXPXToOCo WHERE EmprCod = ? ORDER BY EmprCod, XToOCoCod, XToOCoItm ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D29", "SELECT EmprCod, ProceCod, ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017D30", "SELECT EmprCod, PrvNum, PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 3);
               ((int[]) buf[33])[0] = rslt.getInt(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 26);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(25, 200);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
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
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 4);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
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
                  stmt.setInt(8, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[23], 5);
               }
               stmt.setString(14, (String)parms[24], 3);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[26]).intValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
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
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               stmt.setString(13, (String)parms[24], 3);
               stmt.setString(14, (String)parms[25], 6);
               stmt.setString(15, (String)parms[26], 4);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 20 :
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
            case 21 :
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
            case 22 :
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
            case 23 :
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
            case 24 :
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
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
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

