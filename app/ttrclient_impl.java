package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrclient_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A858ZonGeoCod = (short)(GXutil.lval( httpContext.GetPar( "ZonGeoCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A858ZonGeoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10301Cod_pais = (short)(GXutil.lval( httpContext.GetPar( "Cod_pais"))) ;
         n10301Cod_pais = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A10301Cod_pais) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11180TpOpC = (short)(GXutil.lval( httpContext.GetPar( "TpOpC"))) ;
         n11180TpOpC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A11180TpOpC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A781PrvCod = (short)(GXutil.lval( httpContext.GetPar( "PrvCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A781PrvCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CLIENT", ""), (short)(0)) ;
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

   public ttrclient_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrclient_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrclient_impl.class ));
   }

   public ttrclient_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkCliAlbAgr = UIFactory.getCheckbox(this);
      chkCliTub = UIFactory.getCheckbox(this);
      chkCliCtrl = UIFactory.getCheckbox(this);
      chkCliValA = UIFactory.getCheckbox(this);
      chkCliEtiEN = UIFactory.getCheckbox(this);
      chkCliEtiCN = UIFactory.getCheckbox(this);
      chkCliEtiCC = UIFactory.getCheckbox(this);
      cmbCliDivTra = new HTMLChoice();
      cmbCliTipo = new HTMLChoice();
      chkCliEFx = UIFactory.getCheckbox(this);
      chkCliEEm = UIFactory.getCheckbox(this);
      chkCliAct = UIFactory.getCheckbox(this);
      chkCliEt1 = UIFactory.getCheckbox(this);
      chkCliEt2 = UIFactory.getCheckbox(this);
      chkCliEt3 = UIFactory.getCheckbox(this);
      chkCliEt4 = UIFactory.getCheckbox(this);
      chkCliMailGrE = UIFactory.getCheckbox(this);
      chkCliMailPkE = UIFactory.getCheckbox(this);
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
      A250CliAlbAgr = ((GXutil.strcmp(GXutil.rtrim( A250CliAlbAgr), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", A250CliAlbAgr);
      A1466CliTub = ((GXutil.strcmp(GXutil.rtrim( A1466CliTub), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", A1466CliTub);
      A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", A1901CliCtrl);
      A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", A1902CliValA);
      A2843CliEtiEN = ((GXutil.strcmp(GXutil.rtrim( A2843CliEtiEN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", A2843CliEtiEN);
      A2842CliEtiCN = ((GXutil.strcmp(GXutil.rtrim( A2842CliEtiCN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", A2842CliEtiCN);
      A2841CliEtiCC = ((GXutil.strcmp(GXutil.rtrim( A2841CliEtiCC), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", A2841CliEtiCC);
      if ( cmbCliDivTra.getItemCount() > 0 )
      {
         A3091CliDivTra = cmbCliDivTra.getValidValue(A3091CliDivTra) ;
         n3091CliDivTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliDivTra.setValue( GXutil.rtrim( A3091CliDivTra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCliDivTra.getInternalname(), "Values", cmbCliDivTra.ToJavascriptSource(), true);
      }
      if ( cmbCliTipo.getItemCount() > 0 )
      {
         A5648CliTipo = cmbCliTipo.getValidValue(A5648CliTipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", A5648CliTipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliTipo.setValue( GXutil.rtrim( A5648CliTipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCliTipo.getInternalname(), "Values", cmbCliTipo.ToJavascriptSource(), true);
      }
      A9854CliEFx = ((GXutil.strcmp(GXutil.rtrim( A9854CliEFx), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", A9854CliEFx);
      A9855CliEEm = ((GXutil.strcmp(GXutil.rtrim( A9855CliEEm), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", A9855CliEEm);
      A10045CliAct = ((GXutil.strcmp(GXutil.rtrim( A10045CliAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
      A10046CliEt1 = ((GXutil.strcmp(GXutil.rtrim( A10046CliEt1), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", A10046CliEt1);
      A10047CliEt2 = ((GXutil.strcmp(GXutil.rtrim( A10047CliEt2), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", A10047CliEt2);
      A10048CliEt3 = ((GXutil.strcmp(GXutil.rtrim( A10048CliEt3), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", A10048CliEt3);
      A10049CliEt4 = ((GXutil.strcmp(GXutil.rtrim( A10049CliEt4), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", A10049CliEt4);
      A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", A11622CliMailGrE);
      A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", A11623CliMailPkE);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrCLIENT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nif Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNif_Internalname, GXutil.rtrim( A278CliNif), GXutil.rtrim( localUtil.format( A278CliNif, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNif_Jsonclick, 0, "", "", "", "", "", 1, edtCliNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Domicilio Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliDom_Internalname, GXutil.rtrim( A260CliDom), GXutil.rtrim( localUtil.format( A260CliDom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDom_Jsonclick, 0, "", "", "", "", "", 1, edtCliDom_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Poblacion Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliPob_Internalname, GXutil.rtrim( A295CliPob), GXutil.rtrim( localUtil.format( A295CliPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPob_Jsonclick, 0, "", "", "", "", "", 1, edtCliPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Postal", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCp_Internalname, GXutil.rtrim( A256CliCp), GXutil.rtrim( localUtil.format( A256CliCp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCp_Jsonclick, 0, "", "", "", "", "", 1, edtCliCp_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Provincia", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCod_Internalname, GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCod_Jsonclick, 0, "", "", "", "", "", 1, edtPrvCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Provincia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDsc_Internalname, GXutil.rtrim( A787PrvDsc), GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Telefono1", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliTel1_Internalname, GXutil.rtrim( A303CliTel1), GXutil.rtrim( localUtil.format( A303CliTel1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTel1_Jsonclick, 0, "", "", "", "", "", 1, edtCliTel1_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Telefono2", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliTel2_Internalname, GXutil.rtrim( A304CliTel2), GXutil.rtrim( localUtil.format( A304CliTel2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTel2_Jsonclick, 0, "", "", "", "", "", 1, edtCliTel2_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Telex", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliTelex_Internalname, GXutil.rtrim( A305CliTelex), GXutil.rtrim( localUtil.format( A305CliTelex, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTelex_Jsonclick, 0, "", "", "", "", "", 1, edtCliTelex_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "CliFax", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliFax_Internalname, GXutil.rtrim( A274CliFax), GXutil.rtrim( localUtil.format( A274CliFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFax_Jsonclick, 0, "", "", "", "", "", 1, edtCliFax_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Inicio Vacaciones", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliIniVac_Internalname, GXutil.rtrim( A277CliIniVac), GXutil.rtrim( localUtil.format( A277CliIniVac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliIniVac_Jsonclick, 0, "", "", "", "", "", 1, edtCliIniVac_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fin Vacaciones", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliFinVac_Internalname, GXutil.rtrim( A276CliFinVac), GXutil.rtrim( localUtil.format( A276CliFinVac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFinVac_Jsonclick, 0, "", "", "", "", "", 1, edtCliFinVac_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Desplazamiento", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliDes_Internalname, GXutil.rtrim( A258CliDes), GXutil.rtrim( localUtil.format( A258CliDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDes_Jsonclick, 0, "", "", "", "", "", 1, edtCliDes_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Etiqueta", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEti_Internalname, GXutil.rtrim( A272CliEti), GXutil.rtrim( localUtil.format( A272CliEti, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEti_Jsonclick, 0, "", "", "", "", "", 1, edtCliEti_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Urgencia", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUrg_Jsonclick, 0, "", "", "", "", "", 1, edtCliUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Persona", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliPer_Internalname, GXutil.rtrim( A293CliPer), GXutil.rtrim( localUtil.format( A293CliPer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPer_Jsonclick, 0, "", "", "", "", "", 1, edtCliPer_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliRef_Internalname, GXutil.rtrim( A298CliRef), GXutil.rtrim( localUtil.format( A298CliRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliRef_Jsonclick, 0, "", "", "", "", "", 1, edtCliRef_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Cuenta", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCue_Internalname, GXutil.rtrim( A257CliCue), GXutil.rtrim( localUtil.format( A257CliCue, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCue_Jsonclick, 0, "", "", "", "", "", 1, edtCliCue_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Riesgo Concedido", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliRieCon_Internalname, GXutil.ltrim( localUtil.ntoc( A301CliRieCon, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliRieCon_Enabled!=0) ? localUtil.format( A301CliRieCon, "ZZZZZZZZ9.99") : localUtil.format( A301CliRieCon, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliRieCon_Jsonclick, 0, "", "", "", "", "", 1, edtCliRieCon_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Riesgo Circulante", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliRieCir_Internalname, GXutil.ltrim( localUtil.ntoc( A300CliRieCir, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliRieCir_Enabled!=0) ? localUtil.format( A300CliRieCir, "ZZZZZZZZ9.99") : localUtil.format( A300CliRieCir, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliRieCir_Jsonclick, 0, "", "", "", "", "", 1, edtCliRieCir_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Riesgo Mayor Habido", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliRieMh_Internalname, GXutil.ltrim( localUtil.ntoc( A302CliRieMh, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliRieMh_Enabled!=0) ? localUtil.format( A302CliRieMh, "ZZZZZZZZ9.99") : localUtil.format( A302CliRieMh, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliRieMh_Jsonclick, 0, "", "", "", "", "", 1, edtCliRieMh_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Fecha Mayor Riesgo", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCliFecMh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliFecMh_Internalname, localUtil.format(A275CliFecMh, "99/99/99"), localUtil.format( A275CliFecMh, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFecMh_Jsonclick, 0, "", "", "", "", "", 1, edtCliFecMh_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCliFecMh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCliFecMh_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Cancelacion Riesgo", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCanRie_Internalname, GXutil.ltrim( localUtil.ntoc( A251CliCanRie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCanRie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A251CliCanRie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A251CliCanRie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCanRie_Jsonclick, 0, "", "", "", "", "", 1, edtCliCanRie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Periodo Facturacion", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliPerFac_Internalname, GXutil.ltrim( localUtil.ntoc( A294CliPerFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliPerFac_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A294CliPerFac), "9") : localUtil.format( DecimalUtil.doubleToDec(A294CliPerFac), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPerFac_Jsonclick, 0, "", "", "", "", "", 1, edtCliPerFac_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Agrupacion", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliAlbAgr.getInternalname(), A250CliAlbAgr, "", "", 1, chkCliAlbAgr.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(156, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,156);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Numero de Copias", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliFacCop_Internalname, GXutil.ltrim( localUtil.ntoc( A273CliFacCop, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliFacCop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A273CliFacCop), "9") : localUtil.format( DecimalUtil.doubleToDec(A273CliFacCop), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliFacCop_Jsonclick, 0, "", "", "", "", "", 1, edtCliFacCop_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Codigo Zona Geografica", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtZonGeoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtZonGeoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A858ZonGeoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A858ZonGeoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtZonGeoCod_Jsonclick, 0, "", "", "", "", "", 1, edtZonGeoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Descripcion Zona Geografica", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtZonGeoNom_Internalname, GXutil.rtrim( A1360ZonGeoNom), GXutil.rtrim( localUtil.format( A1360ZonGeoNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtZonGeoNom_Jsonclick, 0, "", "", "", "", "", 1, edtZonGeoNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Facturar Tubos? S o N", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliTub.getInternalname(), A1466CliTub, "", "", 1, chkCliTub.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(176, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,176);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Controlar Cliente", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliCtrl.getInternalname(), A1901CliCtrl, "", "", 1, chkCliCtrl.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(181, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,181);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Imprimir Valorado Albaran", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliValA.getInternalname(), A1902CliValA, "", "", 1, chkCliValA.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(186, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,186);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Alias", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliAlias_Internalname, GXutil.rtrim( A2748CliAlias), GXutil.rtrim( localUtil.format( A2748CliAlias, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliAlias_Jsonclick, 0, "", "", "", "", "", 1, edtCliAlias_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Imprimir Nom.Emp en Eti. (S,N)", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEtiEN.getInternalname(), A2843CliEtiEN, "", "", 1, chkCliEtiEN.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(196, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,196);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Imprimir Nom.Cli en Eti. (S,N)", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEtiCN.getInternalname(), A2842CliEtiCN, "", "", 1, chkCliEtiCN.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(201, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,201);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Imprimir Cod.Cli en Eti. (S,N)", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEtiCC.getInternalname(), A2841CliEtiCC, "", "", 1, chkCliEtiCC.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(206, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,206);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Divisa Traspaso", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCliDivTra, cmbCliDivTra.getInternalname(), GXutil.rtrim( A3091CliDivTra), 1, cmbCliDivTra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCliDivTra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,211);\"", "", true, (byte)(0), "HLP_TTrCLIENT.htm");
      cmbCliDivTra.setValue( GXutil.rtrim( A3091CliDivTra) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliDivTra.getInternalname(), "Values", cmbCliDivTra.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Numero Eti.Sal", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNumEtSa_Internalname, GXutil.ltrim( localUtil.ntoc( A3304CliNumEtSa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliNumEtSa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3304CliNumEtSa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3304CliNumEtSa), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNumEtSa_Jsonclick, 0, "", "", "", "", "", 1, edtCliNumEtSa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Num. Eti. Tinte", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNumEtTi_Internalname, GXutil.ltrim( localUtil.ntoc( A3305CliNumEtTi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliNumEtTi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3305CliNumEtTi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3305CliNumEtTi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNumEtTi_Jsonclick, 0, "", "", "", "", "", 1, edtCliNumEtTi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Portes", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliPort_Internalname, GXutil.rtrim( A3630CliPort), GXutil.rtrim( localUtil.format( A3630CliPort, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPort_Jsonclick, 0, "", "", "", "", "", 1, edtCliPort_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3631CliTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3631CliTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3631CliTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Copias Albaran", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCopAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A3632CliCopAlb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCopAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3632CliCopAlb), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3632CliCopAlb), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCopAlb_Jsonclick, 0, "", "", "", "", "", 1, edtCliCopAlb_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Email", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEmail_Internalname, GXutil.rtrim( A3633CliEmail), GXutil.rtrim( localUtil.format( A3633CliEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEmail_Jsonclick, 0, "", "", "", "", "", 1, edtCliEmail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Peaso de Nombre", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom1_Internalname, GXutil.rtrim( A3644CliNom1), GXutil.rtrim( localUtil.format( A3644CliNom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom1_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Codigo Postal II", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCp2_Internalname, GXutil.rtrim( A4828CliCp2), GXutil.rtrim( localUtil.format( A4828CliCp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCp2_Jsonclick, 0, "", "", "", "", "", 1, edtCliCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Tipo Bonificación", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliTBon_Internalname, GXutil.rtrim( A5042CliTBon), GXutil.rtrim( localUtil.format( A5042CliTBon, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliTBon_Jsonclick, 0, "", "", "", "", "", 1, edtCliTBon_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Tipo Cliente(Interno,Externo)", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCliTipo, cmbCliTipo.getInternalname(), GXutil.rtrim( A5648CliTipo), 1, cmbCliTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCliTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "", true, (byte)(0), "HLP_TTrCLIENT.htm");
      cmbCliTipo.setValue( GXutil.rtrim( A5648CliTipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliTipo.getInternalname(), "Values", cmbCliTipo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Domicilio 2", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliDom2_Internalname, GXutil.rtrim( A5649CliDom2), GXutil.rtrim( localUtil.format( A5649CliDom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDom2_Jsonclick, 0, "", "", "", "", "", 1, edtCliDom2_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Incripcion Estatal", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliIe_Internalname, GXutil.rtrim( A6185CliIe), GXutil.rtrim( localUtil.format( A6185CliIe, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliIe_Jsonclick, 0, "", "", "", "", "", 1, edtCliIe_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Ultima linea Marquilla", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUltMq_Internalname, GXutil.ltrim( localUtil.ntoc( A7064CliUltMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUltMq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7064CliUltMq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7064CliUltMq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUltMq_Jsonclick, 0, "", "", "", "", "", 1, edtCliUltMq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "CliEst", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEst_Internalname, GXutil.rtrim( A8723CliEst), GXutil.rtrim( localUtil.format( A8723CliEst, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEst_Jsonclick, 0, "", "", "", "", "", 1, edtCliEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Porcentaje 1", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliP1_Internalname, GXutil.ltrim( localUtil.ntoc( A9852CliP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9852CliP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9852CliP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliP1_Jsonclick, 0, "", "", "", "", "", 1, edtCliP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Porcentaje", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliP0_Internalname, GXutil.ltrim( localUtil.ntoc( A9853CliP0, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliP0_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9853CliP0), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9853CliP0), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliP0_Jsonclick, 0, "", "", "", "", "", 1, edtCliP0_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Envio Fax", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEFx.getInternalname(), A9854CliEFx, "", "", 1, chkCliEFx.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(296, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,296);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Envio Mail", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEEm.getInternalname(), A9855CliEEm, "", "", 1, chkCliEEm.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(301, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,301);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "N Colores", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A9901CliNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9901CliNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9901CliNumC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNumC_Jsonclick, 0, "", "", "", "", "", 1, edtCliNumC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Cliente Activo?", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliAct.getInternalname(), A10045CliAct, "", "", 1, chkCliAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(311, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,311);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Etiqueta Neutra", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt1.getInternalname(), A10046CliEt1, "", "", 1, chkCliEt1.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(316, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,316);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Salir Ancho?", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt2.getInternalname(), A10047CliEt2, "", "", 1, chkCliEt2.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(321, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,321);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Salir Color?", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt3.getInternalname(), A10048CliEt3, "", "", 1, chkCliEt3.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(326, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,326);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Salir ?", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliEt4.getInternalname(), A10049CliEt4, "", "", 1, chkCliEt4.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(331, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,331);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Email Facturacion", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliemf_Internalname, GXutil.rtrim( A10050Cliemf), GXutil.rtrim( localUtil.format( A10050Cliemf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliemf_Jsonclick, 0, "", "", "", "", "", 1, edtCliemf_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Codigo pais", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCod_pais_Internalname, GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCod_pais_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_pais_Jsonclick, 0, "", "", "", "", "", 1, edtCod_pais_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDsc_pais_Internalname, GXutil.rtrim( A10302Dsc_pais), GXutil.rtrim( localUtil.format( A10302Dsc_pais, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDsc_pais_Jsonclick, 0, "", "", "", "", "", 1, edtDsc_pais_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Tipo Operacion", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTpOpC_Internalname, GXutil.ltrim( localUtil.ntoc( A11180TpOpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTpOpC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11180TpOpC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11180TpOpC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,351);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpOpC_Jsonclick, 0, "", "", "", "", "", 1, edtTpOpC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Tipo Operacion Nombre", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTpOpD_Internalname, GXutil.rtrim( A11181TpOpD), GXutil.rtrim( localUtil.format( A11181TpOpD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpOpD_Jsonclick, 0, "", "", "", "", "", 1, edtTpOpD_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Codigo WEB", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodWebId_Internalname, GXutil.rtrim( A11521CodWebId), GXutil.rtrim( localUtil.format( A11521CodWebId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodWebId_Jsonclick, 0, "", "", "", "", "", 1, edtCodWebId_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "E-mail Guia Remessa", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliMailGr_Internalname, GXutil.rtrim( A11620CliMailGr), GXutil.rtrim( localUtil.format( A11620CliMailGr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliMailGr_Jsonclick, 0, "", "", "", "", "", 1, edtCliMailGr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "E-mail Packing List", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliMailPk_Internalname, GXutil.rtrim( A11621CliMailPk), GXutil.rtrim( localUtil.format( A11621CliMailPk, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,371);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliMailPk_Jsonclick, 0, "", "", "", "", "", 1, edtCliMailPk_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "Envia Guia Email S/N", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliMailGrE.getInternalname(), A11622CliMailGrE, "", "", 1, chkCliMailGrE.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(376, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,376);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "Envia Packing Email S/N", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCliMailPkE.getInternalname(), A11623CliMailPkE, "", "", 1, chkCliMailPkE.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(381, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,381);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliPlanUL_Internalname, GXutil.ltrim( localUtil.ntoc( A3891CliPlanUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliPlanUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3891CliPlanUL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3891CliPlanUL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPlanUL_Jsonclick, 0, "", "", "", "", "", 1, edtCliPlanUL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "Lb_ Linu", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Linu_Internalname, GXutil.ltrim( localUtil.ntoc( A11632Lb_Linu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Linu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11632Lb_Linu), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11632Lb_Linu), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,391);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Linu_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Linu_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "Cli Ultl", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUltl_Internalname, GXutil.ltrim( localUtil.ntoc( A11633CliUltl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUltl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11633CliUltl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11633CliUltl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUltl_Jsonclick, 0, "", "", "", "", "", 1, edtCliUltl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "E-mail Precios Facturacion", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClimailPr_Internalname, GXutil.rtrim( A11701ClimailPr), GXutil.rtrim( localUtil.format( A11701ClimailPr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClimailPr_Jsonclick, 0, "", "", "", "", "", 1, edtClimailPr_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "Persona envio precios", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliPerPr_Internalname, GXutil.rtrim( A11702CliPerPr), GXutil.rtrim( localUtil.format( A11702CliPerPr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliPerPr_Jsonclick, 0, "", "", "", "", "", 1, edtCliPerPr_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "Ultimo Numero Pieza", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUltNPz_Internalname, GXutil.ltrim( localUtil.ntoc( A11761CliUltNPz, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUltNPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11761CliUltNPz), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11761CliUltNPz), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUltNPz_Jsonclick, 0, "", "", "", "", "", 1, edtCliUltNPz_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrCLIENT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 414,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 415,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 417,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrCLIENT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 418,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrCLIENT.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z278CliNif = httpContext.cgiGet( "Z278CliNif") ;
         Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
         Z260CliDom = httpContext.cgiGet( "Z260CliDom") ;
         Z295CliPob = httpContext.cgiGet( "Z295CliPob") ;
         Z256CliCp = httpContext.cgiGet( "Z256CliCp") ;
         Z303CliTel1 = httpContext.cgiGet( "Z303CliTel1") ;
         Z304CliTel2 = httpContext.cgiGet( "Z304CliTel2") ;
         Z305CliTelex = httpContext.cgiGet( "Z305CliTelex") ;
         Z274CliFax = httpContext.cgiGet( "Z274CliFax") ;
         Z277CliIniVac = httpContext.cgiGet( "Z277CliIniVac") ;
         Z276CliFinVac = httpContext.cgiGet( "Z276CliFinVac") ;
         Z258CliDes = httpContext.cgiGet( "Z258CliDes") ;
         Z272CliEti = httpContext.cgiGet( "Z272CliEti") ;
         Z306CliUrg = (byte)(localUtil.ctol( httpContext.cgiGet( "Z306CliUrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z293CliPer = httpContext.cgiGet( "Z293CliPer") ;
         Z298CliRef = httpContext.cgiGet( "Z298CliRef") ;
         Z257CliCue = httpContext.cgiGet( "Z257CliCue") ;
         Z301CliRieCon = localUtil.ctond( httpContext.cgiGet( "Z301CliRieCon")) ;
         Z300CliRieCir = localUtil.ctond( httpContext.cgiGet( "Z300CliRieCir")) ;
         Z302CliRieMh = localUtil.ctond( httpContext.cgiGet( "Z302CliRieMh")) ;
         Z275CliFecMh = localUtil.ctod( httpContext.cgiGet( "Z275CliFecMh"), 0) ;
         Z251CliCanRie = (byte)(localUtil.ctol( httpContext.cgiGet( "Z251CliCanRie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z294CliPerFac = (byte)(localUtil.ctol( httpContext.cgiGet( "Z294CliPerFac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z250CliAlbAgr = httpContext.cgiGet( "Z250CliAlbAgr") ;
         Z273CliFacCop = (byte)(localUtil.ctol( httpContext.cgiGet( "Z273CliFacCop"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1466CliTub = httpContext.cgiGet( "Z1466CliTub") ;
         Z1901CliCtrl = httpContext.cgiGet( "Z1901CliCtrl") ;
         Z1902CliValA = httpContext.cgiGet( "Z1902CliValA") ;
         Z2748CliAlias = httpContext.cgiGet( "Z2748CliAlias") ;
         Z2843CliEtiEN = httpContext.cgiGet( "Z2843CliEtiEN") ;
         Z2842CliEtiCN = httpContext.cgiGet( "Z2842CliEtiCN") ;
         Z2841CliEtiCC = httpContext.cgiGet( "Z2841CliEtiCC") ;
         Z3091CliDivTra = httpContext.cgiGet( "Z3091CliDivTra") ;
         Z3304CliNumEtSa = (short)(localUtil.ctol( httpContext.cgiGet( "Z3304CliNumEtSa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3305CliNumEtTi = (short)(localUtil.ctol( httpContext.cgiGet( "Z3305CliNumEtTi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3630CliPort = httpContext.cgiGet( "Z3630CliPort") ;
         Z3631CliTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3631CliTrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3632CliCopAlb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3632CliCopAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3633CliEmail = httpContext.cgiGet( "Z3633CliEmail") ;
         Z3644CliNom1 = httpContext.cgiGet( "Z3644CliNom1") ;
         Z4828CliCp2 = httpContext.cgiGet( "Z4828CliCp2") ;
         Z5042CliTBon = httpContext.cgiGet( "Z5042CliTBon") ;
         Z5648CliTipo = httpContext.cgiGet( "Z5648CliTipo") ;
         Z5649CliDom2 = httpContext.cgiGet( "Z5649CliDom2") ;
         Z6185CliIe = httpContext.cgiGet( "Z6185CliIe") ;
         Z7064CliUltMq = (short)(localUtil.ctol( httpContext.cgiGet( "Z7064CliUltMq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8723CliEst = httpContext.cgiGet( "Z8723CliEst") ;
         Z9852CliP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z9852CliP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9853CliP0 = (short)(localUtil.ctol( httpContext.cgiGet( "Z9853CliP0"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9854CliEFx = httpContext.cgiGet( "Z9854CliEFx") ;
         Z9855CliEEm = httpContext.cgiGet( "Z9855CliEEm") ;
         Z9901CliNumC = (int)(localUtil.ctol( httpContext.cgiGet( "Z9901CliNumC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10045CliAct = httpContext.cgiGet( "Z10045CliAct") ;
         Z10046CliEt1 = httpContext.cgiGet( "Z10046CliEt1") ;
         Z10047CliEt2 = httpContext.cgiGet( "Z10047CliEt2") ;
         Z10048CliEt3 = httpContext.cgiGet( "Z10048CliEt3") ;
         Z10049CliEt4 = httpContext.cgiGet( "Z10049CliEt4") ;
         Z10050Cliemf = httpContext.cgiGet( "Z10050Cliemf") ;
         Z11521CodWebId = httpContext.cgiGet( "Z11521CodWebId") ;
         Z11620CliMailGr = httpContext.cgiGet( "Z11620CliMailGr") ;
         Z11621CliMailPk = httpContext.cgiGet( "Z11621CliMailPk") ;
         Z11622CliMailGrE = httpContext.cgiGet( "Z11622CliMailGrE") ;
         Z11623CliMailPkE = httpContext.cgiGet( "Z11623CliMailPkE") ;
         Z3891CliPlanUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z3891CliPlanUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11632Lb_Linu = (short)(localUtil.ctol( httpContext.cgiGet( "Z11632Lb_Linu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11633CliUltl = (short)(localUtil.ctol( httpContext.cgiGet( "Z11633CliUltl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11701ClimailPr = httpContext.cgiGet( "Z11701ClimailPr") ;
         Z11702CliPerPr = httpContext.cgiGet( "Z11702CliPerPr") ;
         Z11761CliUltNPz = (int)(localUtil.ctol( httpContext.cgiGet( "Z11761CliUltNPz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z858ZonGeoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z858ZonGeoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( "Z10301Cod_pais"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11180TpOpC = (short)(localUtil.ctol( httpContext.cgiGet( "Z11180TpOpC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A278CliNif = GXutil.upper( httpContext.cgiGet( edtCliNif_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A278CliNif", A278CliNif);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A260CliDom = httpContext.cgiGet( edtCliDom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A260CliDom", A260CliDom);
         A295CliPob = httpContext.cgiGet( edtCliPob_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A295CliPob", A295CliPob);
         A256CliCp = httpContext.cgiGet( edtCliCp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A256CliCp", A256CliCp);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrvCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A781PrvCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         }
         else
         {
            A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         }
         A787PrvDsc = GXutil.upper( httpContext.cgiGet( edtPrvDsc_Internalname)) ;
         n787PrvDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
         A303CliTel1 = httpContext.cgiGet( edtCliTel1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A303CliTel1", A303CliTel1);
         A304CliTel2 = httpContext.cgiGet( edtCliTel2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A304CliTel2", A304CliTel2);
         A305CliTelex = httpContext.cgiGet( edtCliTelex_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A305CliTelex", A305CliTelex);
         A274CliFax = httpContext.cgiGet( edtCliFax_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A274CliFax", A274CliFax);
         A277CliIniVac = httpContext.cgiGet( edtCliIniVac_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A277CliIniVac", A277CliIniVac);
         A276CliFinVac = httpContext.cgiGet( edtCliFinVac_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A276CliFinVac", A276CliFinVac);
         A258CliDes = httpContext.cgiGet( edtCliDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A258CliDes", A258CliDes);
         A272CliEti = GXutil.upper( httpContext.cgiGet( edtCliEti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIURG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliUrg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A306CliUrg = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         }
         else
         {
            A306CliUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         }
         A293CliPer = httpContext.cgiGet( edtCliPer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A293CliPer", A293CliPer);
         A298CliRef = httpContext.cgiGet( edtCliRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A298CliRef", A298CliRef);
         A257CliCue = httpContext.cgiGet( edtCliCue_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A257CliCue", A257CliCue);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliRieCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliRieCon_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIRIECON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliRieCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A301CliRieCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A301CliRieCon", GXutil.ltrimstr( A301CliRieCon, 12, 2));
         }
         else
         {
            A301CliRieCon = localUtil.ctond( httpContext.cgiGet( edtCliRieCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A301CliRieCon", GXutil.ltrimstr( A301CliRieCon, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliRieCir_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliRieCir_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIRIECIR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliRieCir_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A300CliRieCir = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A300CliRieCir", GXutil.ltrimstr( A300CliRieCir, 12, 2));
         }
         else
         {
            A300CliRieCir = localUtil.ctond( httpContext.cgiGet( edtCliRieCir_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A300CliRieCir", GXutil.ltrimstr( A300CliRieCir, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliRieMh_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliRieMh_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIRIEMH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliRieMh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A302CliRieMh = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A302CliRieMh", GXutil.ltrimstr( A302CliRieMh, 12, 2));
         }
         else
         {
            A302CliRieMh = localUtil.ctond( httpContext.cgiGet( edtCliRieMh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A302CliRieMh", GXutil.ltrimstr( A302CliRieMh, 12, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtCliFecMh_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CLIFECMH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliFecMh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A275CliFecMh = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A275CliFecMh", localUtil.format(A275CliFecMh, "99/99/99"));
         }
         else
         {
            A275CliFecMh = localUtil.ctod( httpContext.cgiGet( edtCliFecMh_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A275CliFecMh", localUtil.format(A275CliFecMh, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCanRie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCanRie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICANRIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCanRie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A251CliCanRie = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A251CliCanRie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A251CliCanRie), 2, 0));
         }
         else
         {
            A251CliCanRie = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliCanRie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A251CliCanRie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A251CliCanRie), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliPerFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliPerFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIPERFAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliPerFac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A294CliPerFac = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
         }
         else
         {
            A294CliPerFac = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliPerFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
         }
         A250CliAlbAgr = ((GXutil.strcmp(httpContext.cgiGet( chkCliAlbAgr.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", A250CliAlbAgr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliFacCop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliFacCop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIFACCOP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliFacCop_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A273CliFacCop = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
         }
         else
         {
            A273CliFacCop = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliFacCop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtZonGeoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtZonGeoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ZONGEOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtZonGeoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A858ZonGeoCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         }
         else
         {
            A858ZonGeoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtZonGeoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         }
         A1360ZonGeoNom = httpContext.cgiGet( edtZonGeoNom_Internalname) ;
         n1360ZonGeoNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
         A1466CliTub = ((GXutil.strcmp(httpContext.cgiGet( chkCliTub.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", A1466CliTub);
         A1901CliCtrl = ((GXutil.strcmp(httpContext.cgiGet( chkCliCtrl.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", A1901CliCtrl);
         A1902CliValA = ((GXutil.strcmp(httpContext.cgiGet( chkCliValA.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", A1902CliValA);
         A2748CliAlias = httpContext.cgiGet( edtCliAlias_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2748CliAlias", A2748CliAlias);
         A2843CliEtiEN = ((GXutil.strcmp(httpContext.cgiGet( chkCliEtiEN.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", A2843CliEtiEN);
         A2842CliEtiCN = ((GXutil.strcmp(httpContext.cgiGet( chkCliEtiCN.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", A2842CliEtiCN);
         A2841CliEtiCC = ((GXutil.strcmp(httpContext.cgiGet( chkCliEtiCC.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", A2841CliEtiCC);
         cmbCliDivTra.setValue( httpContext.cgiGet( cmbCliDivTra.getInternalname()) );
         A3091CliDivTra = httpContext.cgiGet( cmbCliDivTra.getInternalname()) ;
         n3091CliDivTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliNumEtSa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliNumEtSa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLINUMETSA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliNumEtSa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3304CliNumEtSa = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3304CliNumEtSa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3304CliNumEtSa), 4, 0));
         }
         else
         {
            A3304CliNumEtSa = (short)(localUtil.ctol( httpContext.cgiGet( edtCliNumEtSa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3304CliNumEtSa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3304CliNumEtSa), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliNumEtTi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliNumEtTi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLINUMETTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliNumEtTi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3305CliNumEtTi = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3305CliNumEtTi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3305CliNumEtTi), 4, 0));
         }
         else
         {
            A3305CliNumEtTi = (short)(localUtil.ctol( httpContext.cgiGet( edtCliNumEtTi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3305CliNumEtTi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3305CliNumEtTi), 4, 0));
         }
         A3630CliPort = GXutil.upper( httpContext.cgiGet( edtCliPort_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3630CliPort", A3630CliPort);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLITRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3631CliTrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
         }
         else
         {
            A3631CliTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCliTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCopAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCopAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOPALB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCopAlb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3632CliCopAlb = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
         }
         else
         {
            A3632CliCopAlb = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliCopAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
         }
         A3633CliEmail = httpContext.cgiGet( edtCliEmail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3633CliEmail", A3633CliEmail);
         A3644CliNom1 = httpContext.cgiGet( edtCliNom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3644CliNom1", A3644CliNom1);
         A4828CliCp2 = httpContext.cgiGet( edtCliCp2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4828CliCp2", A4828CliCp2);
         A5042CliTBon = GXutil.upper( httpContext.cgiGet( edtCliTBon_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5042CliTBon", A5042CliTBon);
         cmbCliTipo.setValue( httpContext.cgiGet( cmbCliTipo.getInternalname()) );
         A5648CliTipo = httpContext.cgiGet( cmbCliTipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", A5648CliTipo);
         A5649CliDom2 = httpContext.cgiGet( edtCliDom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5649CliDom2", A5649CliDom2);
         A6185CliIe = GXutil.upper( httpContext.cgiGet( edtCliIe_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6185CliIe", A6185CliIe);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliUltMq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliUltMq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIULTMQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliUltMq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7064CliUltMq = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7064CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7064CliUltMq), 4, 0));
         }
         else
         {
            A7064CliUltMq = (short)(localUtil.ctol( httpContext.cgiGet( edtCliUltMq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7064CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7064CliUltMq), 4, 0));
         }
         A8723CliEst = httpContext.cgiGet( edtCliEst_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9852CliP1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9852CliP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9852CliP1), 3, 0));
         }
         else
         {
            A9852CliP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtCliP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9852CliP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9852CliP1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliP0_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliP0_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIP0");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliP0_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9853CliP0 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
         }
         else
         {
            A9853CliP0 = (short)(localUtil.ctol( httpContext.cgiGet( edtCliP0_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
         }
         A9854CliEFx = ((GXutil.strcmp(httpContext.cgiGet( chkCliEFx.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", A9854CliEFx);
         A9855CliEEm = ((GXutil.strcmp(httpContext.cgiGet( chkCliEEm.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", A9855CliEEm);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLINUMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliNumC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9901CliNumC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9901CliNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9901CliNumC), 6, 0));
         }
         else
         {
            A9901CliNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtCliNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9901CliNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9901CliNumC), 6, 0));
         }
         A10045CliAct = ((GXutil.strcmp(httpContext.cgiGet( chkCliAct.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
         A10046CliEt1 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt1.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", A10046CliEt1);
         A10047CliEt2 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt2.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", A10047CliEt2);
         A10048CliEt3 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt3.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", A10048CliEt3);
         A10049CliEt4 = ((GXutil.strcmp(httpContext.cgiGet( chkCliEt4.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", A10049CliEt4);
         A10050Cliemf = httpContext.cgiGet( edtCliemf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10050Cliemf", A10050Cliemf);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COD_PAIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCod_pais_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10301Cod_pais = (short)(0) ;
            n10301Cod_pais = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
         }
         else
         {
            A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10301Cod_pais = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
         }
         A10302Dsc_pais = httpContext.cgiGet( edtDsc_pais_Internalname) ;
         n10302Dsc_pais = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTpOpC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTpOpC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TPOPC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTpOpC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11180TpOpC = (short)(0) ;
            n11180TpOpC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
         }
         else
         {
            A11180TpOpC = (short)(localUtil.ctol( httpContext.cgiGet( edtTpOpC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11180TpOpC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
         }
         A11181TpOpD = httpContext.cgiGet( edtTpOpD_Internalname) ;
         n11181TpOpD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", A11181TpOpD);
         A11521CodWebId = httpContext.cgiGet( edtCodWebId_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11521CodWebId", A11521CodWebId);
         A11620CliMailGr = httpContext.cgiGet( edtCliMailGr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11620CliMailGr", A11620CliMailGr);
         A11621CliMailPk = httpContext.cgiGet( edtCliMailPk_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11621CliMailPk", A11621CliMailPk);
         A11622CliMailGrE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailGrE.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", A11622CliMailGrE);
         A11623CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailPkE.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", A11623CliMailPkE);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliPlanUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliPlanUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIPLANUL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliPlanUL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3891CliPlanUL = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3891CliPlanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3891CliPlanUL), 4, 0));
         }
         else
         {
            A3891CliPlanUL = (short)(localUtil.ctol( httpContext.cgiGet( edtCliPlanUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3891CliPlanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3891CliPlanUL), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Linu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Linu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_LINU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_Linu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11632Lb_Linu = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11632Lb_Linu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11632Lb_Linu), 4, 0));
         }
         else
         {
            A11632Lb_Linu = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_Linu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11632Lb_Linu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11632Lb_Linu), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliUltl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliUltl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIULTL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliUltl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11633CliUltl = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11633CliUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11633CliUltl), 4, 0));
         }
         else
         {
            A11633CliUltl = (short)(localUtil.ctol( httpContext.cgiGet( edtCliUltl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11633CliUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11633CliUltl), 4, 0));
         }
         A11701ClimailPr = httpContext.cgiGet( edtClimailPr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11701ClimailPr", A11701ClimailPr);
         A11702CliPerPr = httpContext.cgiGet( edtCliPerPr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11702CliPerPr", A11702CliPerPr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliUltNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliUltNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIULTNPZ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliUltNPz_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11761CliUltNPz = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
         }
         else
         {
            A11761CliUltNPz = (int)(localUtil.ctol( httpContext.cgiGet( edtCliUltNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
            initAll1HU21( ) ;
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
      disableAttributes1HU21( ) ;
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

   public void confirm_1HU0( )
   {
      beforeValidate1HU21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HU21( ) ;
         }
         else
         {
            checkExtendedTable1HU21( ) ;
            if ( AnyError == 0 )
            {
               zm1HU21( 17) ;
               zm1HU21( 18) ;
               zm1HU21( 19) ;
               zm1HU21( 20) ;
            }
            closeExtendedTableCursors1HU21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HU0( ) ;
      }
   }

   public void resetCaption1HU0( )
   {
   }

   public void zm1HU21( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z278CliNif = T01HU3_A278CliNif[0] ;
            Z279CliNom = T01HU3_A279CliNom[0] ;
            Z260CliDom = T01HU3_A260CliDom[0] ;
            Z295CliPob = T01HU3_A295CliPob[0] ;
            Z256CliCp = T01HU3_A256CliCp[0] ;
            Z303CliTel1 = T01HU3_A303CliTel1[0] ;
            Z304CliTel2 = T01HU3_A304CliTel2[0] ;
            Z305CliTelex = T01HU3_A305CliTelex[0] ;
            Z274CliFax = T01HU3_A274CliFax[0] ;
            Z277CliIniVac = T01HU3_A277CliIniVac[0] ;
            Z276CliFinVac = T01HU3_A276CliFinVac[0] ;
            Z258CliDes = T01HU3_A258CliDes[0] ;
            Z272CliEti = T01HU3_A272CliEti[0] ;
            Z306CliUrg = T01HU3_A306CliUrg[0] ;
            Z293CliPer = T01HU3_A293CliPer[0] ;
            Z298CliRef = T01HU3_A298CliRef[0] ;
            Z257CliCue = T01HU3_A257CliCue[0] ;
            Z301CliRieCon = T01HU3_A301CliRieCon[0] ;
            Z300CliRieCir = T01HU3_A300CliRieCir[0] ;
            Z302CliRieMh = T01HU3_A302CliRieMh[0] ;
            Z275CliFecMh = T01HU3_A275CliFecMh[0] ;
            Z251CliCanRie = T01HU3_A251CliCanRie[0] ;
            Z294CliPerFac = T01HU3_A294CliPerFac[0] ;
            Z250CliAlbAgr = T01HU3_A250CliAlbAgr[0] ;
            Z273CliFacCop = T01HU3_A273CliFacCop[0] ;
            Z1466CliTub = T01HU3_A1466CliTub[0] ;
            Z1901CliCtrl = T01HU3_A1901CliCtrl[0] ;
            Z1902CliValA = T01HU3_A1902CliValA[0] ;
            Z2748CliAlias = T01HU3_A2748CliAlias[0] ;
            Z2843CliEtiEN = T01HU3_A2843CliEtiEN[0] ;
            Z2842CliEtiCN = T01HU3_A2842CliEtiCN[0] ;
            Z2841CliEtiCC = T01HU3_A2841CliEtiCC[0] ;
            Z3091CliDivTra = T01HU3_A3091CliDivTra[0] ;
            Z3304CliNumEtSa = T01HU3_A3304CliNumEtSa[0] ;
            Z3305CliNumEtTi = T01HU3_A3305CliNumEtTi[0] ;
            Z3630CliPort = T01HU3_A3630CliPort[0] ;
            Z3631CliTrnCod = T01HU3_A3631CliTrnCod[0] ;
            Z3632CliCopAlb = T01HU3_A3632CliCopAlb[0] ;
            Z3633CliEmail = T01HU3_A3633CliEmail[0] ;
            Z3644CliNom1 = T01HU3_A3644CliNom1[0] ;
            Z4828CliCp2 = T01HU3_A4828CliCp2[0] ;
            Z5042CliTBon = T01HU3_A5042CliTBon[0] ;
            Z5648CliTipo = T01HU3_A5648CliTipo[0] ;
            Z5649CliDom2 = T01HU3_A5649CliDom2[0] ;
            Z6185CliIe = T01HU3_A6185CliIe[0] ;
            Z7064CliUltMq = T01HU3_A7064CliUltMq[0] ;
            Z8723CliEst = T01HU3_A8723CliEst[0] ;
            Z9852CliP1 = T01HU3_A9852CliP1[0] ;
            Z9853CliP0 = T01HU3_A9853CliP0[0] ;
            Z9854CliEFx = T01HU3_A9854CliEFx[0] ;
            Z9855CliEEm = T01HU3_A9855CliEEm[0] ;
            Z9901CliNumC = T01HU3_A9901CliNumC[0] ;
            Z10045CliAct = T01HU3_A10045CliAct[0] ;
            Z10046CliEt1 = T01HU3_A10046CliEt1[0] ;
            Z10047CliEt2 = T01HU3_A10047CliEt2[0] ;
            Z10048CliEt3 = T01HU3_A10048CliEt3[0] ;
            Z10049CliEt4 = T01HU3_A10049CliEt4[0] ;
            Z10050Cliemf = T01HU3_A10050Cliemf[0] ;
            Z11521CodWebId = T01HU3_A11521CodWebId[0] ;
            Z11620CliMailGr = T01HU3_A11620CliMailGr[0] ;
            Z11621CliMailPk = T01HU3_A11621CliMailPk[0] ;
            Z11622CliMailGrE = T01HU3_A11622CliMailGrE[0] ;
            Z11623CliMailPkE = T01HU3_A11623CliMailPkE[0] ;
            Z3891CliPlanUL = T01HU3_A3891CliPlanUL[0] ;
            Z11632Lb_Linu = T01HU3_A11632Lb_Linu[0] ;
            Z11633CliUltl = T01HU3_A11633CliUltl[0] ;
            Z11701ClimailPr = T01HU3_A11701ClimailPr[0] ;
            Z11702CliPerPr = T01HU3_A11702CliPerPr[0] ;
            Z11761CliUltNPz = T01HU3_A11761CliUltNPz[0] ;
            Z858ZonGeoCod = T01HU3_A858ZonGeoCod[0] ;
            Z10301Cod_pais = T01HU3_A10301Cod_pais[0] ;
            Z11180TpOpC = T01HU3_A11180TpOpC[0] ;
            Z781PrvCod = T01HU3_A781PrvCod[0] ;
         }
         else
         {
            Z278CliNif = A278CliNif ;
            Z279CliNom = A279CliNom ;
            Z260CliDom = A260CliDom ;
            Z295CliPob = A295CliPob ;
            Z256CliCp = A256CliCp ;
            Z303CliTel1 = A303CliTel1 ;
            Z304CliTel2 = A304CliTel2 ;
            Z305CliTelex = A305CliTelex ;
            Z274CliFax = A274CliFax ;
            Z277CliIniVac = A277CliIniVac ;
            Z276CliFinVac = A276CliFinVac ;
            Z258CliDes = A258CliDes ;
            Z272CliEti = A272CliEti ;
            Z306CliUrg = A306CliUrg ;
            Z293CliPer = A293CliPer ;
            Z298CliRef = A298CliRef ;
            Z257CliCue = A257CliCue ;
            Z301CliRieCon = A301CliRieCon ;
            Z300CliRieCir = A300CliRieCir ;
            Z302CliRieMh = A302CliRieMh ;
            Z275CliFecMh = A275CliFecMh ;
            Z251CliCanRie = A251CliCanRie ;
            Z294CliPerFac = A294CliPerFac ;
            Z250CliAlbAgr = A250CliAlbAgr ;
            Z273CliFacCop = A273CliFacCop ;
            Z1466CliTub = A1466CliTub ;
            Z1901CliCtrl = A1901CliCtrl ;
            Z1902CliValA = A1902CliValA ;
            Z2748CliAlias = A2748CliAlias ;
            Z2843CliEtiEN = A2843CliEtiEN ;
            Z2842CliEtiCN = A2842CliEtiCN ;
            Z2841CliEtiCC = A2841CliEtiCC ;
            Z3091CliDivTra = A3091CliDivTra ;
            Z3304CliNumEtSa = A3304CliNumEtSa ;
            Z3305CliNumEtTi = A3305CliNumEtTi ;
            Z3630CliPort = A3630CliPort ;
            Z3631CliTrnCod = A3631CliTrnCod ;
            Z3632CliCopAlb = A3632CliCopAlb ;
            Z3633CliEmail = A3633CliEmail ;
            Z3644CliNom1 = A3644CliNom1 ;
            Z4828CliCp2 = A4828CliCp2 ;
            Z5042CliTBon = A5042CliTBon ;
            Z5648CliTipo = A5648CliTipo ;
            Z5649CliDom2 = A5649CliDom2 ;
            Z6185CliIe = A6185CliIe ;
            Z7064CliUltMq = A7064CliUltMq ;
            Z8723CliEst = A8723CliEst ;
            Z9852CliP1 = A9852CliP1 ;
            Z9853CliP0 = A9853CliP0 ;
            Z9854CliEFx = A9854CliEFx ;
            Z9855CliEEm = A9855CliEEm ;
            Z9901CliNumC = A9901CliNumC ;
            Z10045CliAct = A10045CliAct ;
            Z10046CliEt1 = A10046CliEt1 ;
            Z10047CliEt2 = A10047CliEt2 ;
            Z10048CliEt3 = A10048CliEt3 ;
            Z10049CliEt4 = A10049CliEt4 ;
            Z10050Cliemf = A10050Cliemf ;
            Z11521CodWebId = A11521CodWebId ;
            Z11620CliMailGr = A11620CliMailGr ;
            Z11621CliMailPk = A11621CliMailPk ;
            Z11622CliMailGrE = A11622CliMailGrE ;
            Z11623CliMailPkE = A11623CliMailPkE ;
            Z3891CliPlanUL = A3891CliPlanUL ;
            Z11632Lb_Linu = A11632Lb_Linu ;
            Z11633CliUltl = A11633CliUltl ;
            Z11701ClimailPr = A11701ClimailPr ;
            Z11702CliPerPr = A11702CliPerPr ;
            Z11761CliUltNPz = A11761CliUltNPz ;
            Z858ZonGeoCod = A858ZonGeoCod ;
            Z10301Cod_pais = A10301Cod_pais ;
            Z11180TpOpC = A11180TpOpC ;
            Z781PrvCod = A781PrvCod ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z252CliCod = A252CliCod ;
         Z278CliNif = A278CliNif ;
         Z279CliNom = A279CliNom ;
         Z260CliDom = A260CliDom ;
         Z295CliPob = A295CliPob ;
         Z256CliCp = A256CliCp ;
         Z303CliTel1 = A303CliTel1 ;
         Z304CliTel2 = A304CliTel2 ;
         Z305CliTelex = A305CliTelex ;
         Z274CliFax = A274CliFax ;
         Z277CliIniVac = A277CliIniVac ;
         Z276CliFinVac = A276CliFinVac ;
         Z258CliDes = A258CliDes ;
         Z272CliEti = A272CliEti ;
         Z306CliUrg = A306CliUrg ;
         Z293CliPer = A293CliPer ;
         Z298CliRef = A298CliRef ;
         Z257CliCue = A257CliCue ;
         Z301CliRieCon = A301CliRieCon ;
         Z300CliRieCir = A300CliRieCir ;
         Z302CliRieMh = A302CliRieMh ;
         Z275CliFecMh = A275CliFecMh ;
         Z251CliCanRie = A251CliCanRie ;
         Z294CliPerFac = A294CliPerFac ;
         Z250CliAlbAgr = A250CliAlbAgr ;
         Z273CliFacCop = A273CliFacCop ;
         Z1466CliTub = A1466CliTub ;
         Z1901CliCtrl = A1901CliCtrl ;
         Z1902CliValA = A1902CliValA ;
         Z2748CliAlias = A2748CliAlias ;
         Z2843CliEtiEN = A2843CliEtiEN ;
         Z2842CliEtiCN = A2842CliEtiCN ;
         Z2841CliEtiCC = A2841CliEtiCC ;
         Z3091CliDivTra = A3091CliDivTra ;
         Z3304CliNumEtSa = A3304CliNumEtSa ;
         Z3305CliNumEtTi = A3305CliNumEtTi ;
         Z3630CliPort = A3630CliPort ;
         Z3631CliTrnCod = A3631CliTrnCod ;
         Z3632CliCopAlb = A3632CliCopAlb ;
         Z3633CliEmail = A3633CliEmail ;
         Z3644CliNom1 = A3644CliNom1 ;
         Z4828CliCp2 = A4828CliCp2 ;
         Z5042CliTBon = A5042CliTBon ;
         Z5648CliTipo = A5648CliTipo ;
         Z5649CliDom2 = A5649CliDom2 ;
         Z6185CliIe = A6185CliIe ;
         Z7064CliUltMq = A7064CliUltMq ;
         Z8723CliEst = A8723CliEst ;
         Z9852CliP1 = A9852CliP1 ;
         Z9853CliP0 = A9853CliP0 ;
         Z9854CliEFx = A9854CliEFx ;
         Z9855CliEEm = A9855CliEEm ;
         Z9901CliNumC = A9901CliNumC ;
         Z10045CliAct = A10045CliAct ;
         Z10046CliEt1 = A10046CliEt1 ;
         Z10047CliEt2 = A10047CliEt2 ;
         Z10048CliEt3 = A10048CliEt3 ;
         Z10049CliEt4 = A10049CliEt4 ;
         Z10050Cliemf = A10050Cliemf ;
         Z11521CodWebId = A11521CodWebId ;
         Z11620CliMailGr = A11620CliMailGr ;
         Z11621CliMailPk = A11621CliMailPk ;
         Z11622CliMailGrE = A11622CliMailGrE ;
         Z11623CliMailPkE = A11623CliMailPkE ;
         Z3891CliPlanUL = A3891CliPlanUL ;
         Z11632Lb_Linu = A11632Lb_Linu ;
         Z11633CliUltl = A11633CliUltl ;
         Z11701ClimailPr = A11701ClimailPr ;
         Z11702CliPerPr = A11702CliPerPr ;
         Z11761CliUltNPz = A11761CliUltNPz ;
         Z396EmprCod = A396EmprCod ;
         Z858ZonGeoCod = A858ZonGeoCod ;
         Z10301Cod_pais = A10301Cod_pais ;
         Z11180TpOpC = A11180TpOpC ;
         Z781PrvCod = A781PrvCod ;
         Z787PrvDsc = A787PrvDsc ;
         Z1360ZonGeoNom = A1360ZonGeoNom ;
         Z10302Dsc_pais = A10302Dsc_pais ;
         Z11181TpOpD = A11181TpOpD ;
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

   public void load1HU21( )
   {
      /* Using cursor T01HU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A278CliNif = T01HU8_A278CliNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A278CliNif", A278CliNif);
         A279CliNom = T01HU8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A260CliDom = T01HU8_A260CliDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260CliDom", A260CliDom);
         A295CliPob = T01HU8_A295CliPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295CliPob", A295CliPob);
         A256CliCp = T01HU8_A256CliCp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A256CliCp", A256CliCp);
         A787PrvDsc = T01HU8_A787PrvDsc[0] ;
         n787PrvDsc = T01HU8_n787PrvDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
         A303CliTel1 = T01HU8_A303CliTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303CliTel1", A303CliTel1);
         A304CliTel2 = T01HU8_A304CliTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304CliTel2", A304CliTel2);
         A305CliTelex = T01HU8_A305CliTelex[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305CliTelex", A305CliTelex);
         A274CliFax = T01HU8_A274CliFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A274CliFax", A274CliFax);
         A277CliIniVac = T01HU8_A277CliIniVac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A277CliIniVac", A277CliIniVac);
         A276CliFinVac = T01HU8_A276CliFinVac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A276CliFinVac", A276CliFinVac);
         A258CliDes = T01HU8_A258CliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A258CliDes", A258CliDes);
         A272CliEti = T01HU8_A272CliEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
         A306CliUrg = T01HU8_A306CliUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         A293CliPer = T01HU8_A293CliPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293CliPer", A293CliPer);
         A298CliRef = T01HU8_A298CliRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298CliRef", A298CliRef);
         A257CliCue = T01HU8_A257CliCue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A257CliCue", A257CliCue);
         A301CliRieCon = T01HU8_A301CliRieCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A301CliRieCon", GXutil.ltrimstr( A301CliRieCon, 12, 2));
         A300CliRieCir = T01HU8_A300CliRieCir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300CliRieCir", GXutil.ltrimstr( A300CliRieCir, 12, 2));
         A302CliRieMh = T01HU8_A302CliRieMh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A302CliRieMh", GXutil.ltrimstr( A302CliRieMh, 12, 2));
         A275CliFecMh = T01HU8_A275CliFecMh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A275CliFecMh", localUtil.format(A275CliFecMh, "99/99/99"));
         A251CliCanRie = T01HU8_A251CliCanRie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A251CliCanRie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A251CliCanRie), 2, 0));
         A294CliPerFac = T01HU8_A294CliPerFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
         A250CliAlbAgr = T01HU8_A250CliAlbAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", A250CliAlbAgr);
         A273CliFacCop = T01HU8_A273CliFacCop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
         A1360ZonGeoNom = T01HU8_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01HU8_n1360ZonGeoNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
         A1466CliTub = T01HU8_A1466CliTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", A1466CliTub);
         A1901CliCtrl = T01HU8_A1901CliCtrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", A1901CliCtrl);
         A1902CliValA = T01HU8_A1902CliValA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", A1902CliValA);
         A2748CliAlias = T01HU8_A2748CliAlias[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2748CliAlias", A2748CliAlias);
         A2843CliEtiEN = T01HU8_A2843CliEtiEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", A2843CliEtiEN);
         A2842CliEtiCN = T01HU8_A2842CliEtiCN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", A2842CliEtiCN);
         A2841CliEtiCC = T01HU8_A2841CliEtiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", A2841CliEtiCC);
         A3091CliDivTra = T01HU8_A3091CliDivTra[0] ;
         n3091CliDivTra = T01HU8_n3091CliDivTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
         A3304CliNumEtSa = T01HU8_A3304CliNumEtSa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3304CliNumEtSa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3304CliNumEtSa), 4, 0));
         A3305CliNumEtTi = T01HU8_A3305CliNumEtTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3305CliNumEtTi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3305CliNumEtTi), 4, 0));
         A3630CliPort = T01HU8_A3630CliPort[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3630CliPort", A3630CliPort);
         A3631CliTrnCod = T01HU8_A3631CliTrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
         A3632CliCopAlb = T01HU8_A3632CliCopAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
         A3633CliEmail = T01HU8_A3633CliEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3633CliEmail", A3633CliEmail);
         A3644CliNom1 = T01HU8_A3644CliNom1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3644CliNom1", A3644CliNom1);
         A4828CliCp2 = T01HU8_A4828CliCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4828CliCp2", A4828CliCp2);
         A5042CliTBon = T01HU8_A5042CliTBon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5042CliTBon", A5042CliTBon);
         A5648CliTipo = T01HU8_A5648CliTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", A5648CliTipo);
         A5649CliDom2 = T01HU8_A5649CliDom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5649CliDom2", A5649CliDom2);
         A6185CliIe = T01HU8_A6185CliIe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6185CliIe", A6185CliIe);
         A7064CliUltMq = T01HU8_A7064CliUltMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7064CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7064CliUltMq), 4, 0));
         A8723CliEst = T01HU8_A8723CliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         A9852CliP1 = T01HU8_A9852CliP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9852CliP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9852CliP1), 3, 0));
         A9853CliP0 = T01HU8_A9853CliP0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
         A9854CliEFx = T01HU8_A9854CliEFx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", A9854CliEFx);
         A9855CliEEm = T01HU8_A9855CliEEm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", A9855CliEEm);
         A9901CliNumC = T01HU8_A9901CliNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9901CliNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9901CliNumC), 6, 0));
         A10045CliAct = T01HU8_A10045CliAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
         A10046CliEt1 = T01HU8_A10046CliEt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", A10046CliEt1);
         A10047CliEt2 = T01HU8_A10047CliEt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", A10047CliEt2);
         A10048CliEt3 = T01HU8_A10048CliEt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", A10048CliEt3);
         A10049CliEt4 = T01HU8_A10049CliEt4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", A10049CliEt4);
         A10050Cliemf = T01HU8_A10050Cliemf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10050Cliemf", A10050Cliemf);
         A10302Dsc_pais = T01HU8_A10302Dsc_pais[0] ;
         n10302Dsc_pais = T01HU8_n10302Dsc_pais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
         A11181TpOpD = T01HU8_A11181TpOpD[0] ;
         n11181TpOpD = T01HU8_n11181TpOpD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", A11181TpOpD);
         A11521CodWebId = T01HU8_A11521CodWebId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11521CodWebId", A11521CodWebId);
         A11620CliMailGr = T01HU8_A11620CliMailGr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11620CliMailGr", A11620CliMailGr);
         A11621CliMailPk = T01HU8_A11621CliMailPk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11621CliMailPk", A11621CliMailPk);
         A11622CliMailGrE = T01HU8_A11622CliMailGrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", A11622CliMailGrE);
         A11623CliMailPkE = T01HU8_A11623CliMailPkE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", A11623CliMailPkE);
         A3891CliPlanUL = T01HU8_A3891CliPlanUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3891CliPlanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3891CliPlanUL), 4, 0));
         A11632Lb_Linu = T01HU8_A11632Lb_Linu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11632Lb_Linu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11632Lb_Linu), 4, 0));
         A11633CliUltl = T01HU8_A11633CliUltl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11633CliUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11633CliUltl), 4, 0));
         A11701ClimailPr = T01HU8_A11701ClimailPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11701ClimailPr", A11701ClimailPr);
         A11702CliPerPr = T01HU8_A11702CliPerPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11702CliPerPr", A11702CliPerPr);
         A11761CliUltNPz = T01HU8_A11761CliUltNPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
         A858ZonGeoCod = T01HU8_A858ZonGeoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         A10301Cod_pais = T01HU8_A10301Cod_pais[0] ;
         n10301Cod_pais = T01HU8_n10301Cod_pais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
         A11180TpOpC = T01HU8_A11180TpOpC[0] ;
         n11180TpOpC = T01HU8_n11180TpOpC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
         A781PrvCod = T01HU8_A781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         zm1HU21( -16) ;
      }
      pr_default.close(6);
      onLoadActions1HU21( ) ;
   }

   public void onLoadActions1HU21( )
   {
   }

   public void checkExtendedTable1HU21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01HU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1360ZonGeoNom = T01HU4_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01HU4_n1360ZonGeoNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
      pr_default.close(2);
      /* Using cursor T01HU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n10301Cod_pais), Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10301Cod_pais) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0400", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_PAIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10302Dsc_pais = T01HU5_A10302Dsc_pais[0] ;
      n10302Dsc_pais = T01HU5_n10302Dsc_pais[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
      pr_default.close(3);
      /* Using cursor T01HU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n11180TpOpC), Short.valueOf(A11180TpOpC)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A11180TpOpC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERACION ASEGURA EN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TPOPC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11181TpOpD = T01HU6_A11181TpOpD[0] ;
      n11181TpOpD = T01HU6_n11181TpOpD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", A11181TpOpD);
      pr_default.close(4);
      /* Using cursor T01HU7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T01HU7_A787PrvDsc[0] ;
      n787PrvDsc = T01HU7_n787PrvDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
      pr_default.close(5);
      if ( ! ( ( GXutil.strcmp(A272CliEti, "S") == 0 ) || ( GXutil.strcmp(A272CliEti, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Etiqueta", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIETI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliEti_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A306CliUrg >= 0 ) && ( A306CliUrg <= 9 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Urgencia", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIURG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliUrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A250CliAlbAgr, "S") == 0 ) || ( GXutil.strcmp(A250CliAlbAgr, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Agrupacion", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIALBAGR");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliAlbAgr.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A1466CliTub, "S") == 0 ) || ( GXutil.strcmp(A1466CliTub, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Facturar Tubos?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLITUB");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliTub.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A1901CliCtrl, "S") == 0 ) || ( GXutil.strcmp(A1901CliCtrl, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Controlar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLICTRL");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliCtrl.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A1902CliValA, "S") == 0 ) || ( GXutil.strcmp(A1902CliValA, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Imprimir Albaran Valorado ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIVALA");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliValA.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A2843CliEtiEN, "S") == 0 ) || ( GXutil.strcmp(A2843CliEtiEN, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Imprimir Empresa Etiqueta?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIETIEN");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliEtiEN.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A2842CliEtiCN, "S") == 0 ) || ( GXutil.strcmp(A2842CliEtiCN, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Imprimir Nombre Etiqueta?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIETICN");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliEtiCN.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A2841CliEtiCC, "S") == 0 ) || ( GXutil.strcmp(A2841CliEtiCC, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Imprimir Codigo Etiqueta?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIETICC");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliEtiCC.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3630CliPort, "D") == 0 ) || ( GXutil.strcmp(A3630CliPort, "P") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Portes", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIPORT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliPort_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A5648CliTipo, "I") == 0 ) || ( GXutil.strcmp(A5648CliTipo, "E") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo Cliente", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLITIPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliTipo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A10045CliAct, "S") == 0 ) || ( GXutil.strcmp(A10045CliAct, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Activo?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIACT");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliAct.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A10046CliEt1, "S") == 0 ) || ( GXutil.strcmp(A10046CliEt1, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Etiqueta Neutra", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIET1");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliEt1.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A10047CliEt2, "S") == 0 ) || ( GXutil.strcmp(A10047CliEt2, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Salir Ancho?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIET2");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliEt2.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A10048CliEt3, "S") == 0 ) || ( GXutil.strcmp(A10048CliEt3, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Salir Color?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "CLIET3");
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliEt3.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1HU21( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          short A858ZonGeoCod )
   {
      /* Using cursor T01HU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1360ZonGeoNom = T01HU9_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01HU9_n1360ZonGeoNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1360ZonGeoNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_18( String A396EmprCod ,
                          short A10301Cod_pais )
   {
      /* Using cursor T01HU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n10301Cod_pais), Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10301Cod_pais) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0400", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_PAIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10302Dsc_pais = T01HU10_A10302Dsc_pais[0] ;
      n10302Dsc_pais = T01HU10_n10302Dsc_pais[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10302Dsc_pais))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_19( String A396EmprCod ,
                          short A11180TpOpC )
   {
      /* Using cursor T01HU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n11180TpOpC), Short.valueOf(A11180TpOpC)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A11180TpOpC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERACION ASEGURA EN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TPOPC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11181TpOpD = T01HU11_A11181TpOpD[0] ;
      n11181TpOpD = T01HU11_n11181TpOpD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", A11181TpOpD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11181TpOpD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_20( short A781PrvCod )
   {
      /* Using cursor T01HU12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T01HU12_A787PrvDsc[0] ;
      n787PrvDsc = T01HU12_n787PrvDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A787PrvDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1HU21( )
   {
      /* Using cursor T01HU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HU21( 16) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T01HU3_A252CliCod[0] ;
         n252CliCod = T01HU3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A278CliNif = T01HU3_A278CliNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A278CliNif", A278CliNif);
         A279CliNom = T01HU3_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A260CliDom = T01HU3_A260CliDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260CliDom", A260CliDom);
         A295CliPob = T01HU3_A295CliPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295CliPob", A295CliPob);
         A256CliCp = T01HU3_A256CliCp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A256CliCp", A256CliCp);
         A303CliTel1 = T01HU3_A303CliTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303CliTel1", A303CliTel1);
         A304CliTel2 = T01HU3_A304CliTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304CliTel2", A304CliTel2);
         A305CliTelex = T01HU3_A305CliTelex[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305CliTelex", A305CliTelex);
         A274CliFax = T01HU3_A274CliFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A274CliFax", A274CliFax);
         A277CliIniVac = T01HU3_A277CliIniVac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A277CliIniVac", A277CliIniVac);
         A276CliFinVac = T01HU3_A276CliFinVac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A276CliFinVac", A276CliFinVac);
         A258CliDes = T01HU3_A258CliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A258CliDes", A258CliDes);
         A272CliEti = T01HU3_A272CliEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
         A306CliUrg = T01HU3_A306CliUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         A293CliPer = T01HU3_A293CliPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293CliPer", A293CliPer);
         A298CliRef = T01HU3_A298CliRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298CliRef", A298CliRef);
         A257CliCue = T01HU3_A257CliCue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A257CliCue", A257CliCue);
         A301CliRieCon = T01HU3_A301CliRieCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A301CliRieCon", GXutil.ltrimstr( A301CliRieCon, 12, 2));
         A300CliRieCir = T01HU3_A300CliRieCir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300CliRieCir", GXutil.ltrimstr( A300CliRieCir, 12, 2));
         A302CliRieMh = T01HU3_A302CliRieMh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A302CliRieMh", GXutil.ltrimstr( A302CliRieMh, 12, 2));
         A275CliFecMh = T01HU3_A275CliFecMh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A275CliFecMh", localUtil.format(A275CliFecMh, "99/99/99"));
         A251CliCanRie = T01HU3_A251CliCanRie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A251CliCanRie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A251CliCanRie), 2, 0));
         A294CliPerFac = T01HU3_A294CliPerFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
         A250CliAlbAgr = T01HU3_A250CliAlbAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", A250CliAlbAgr);
         A273CliFacCop = T01HU3_A273CliFacCop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
         A1466CliTub = T01HU3_A1466CliTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", A1466CliTub);
         A1901CliCtrl = T01HU3_A1901CliCtrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", A1901CliCtrl);
         A1902CliValA = T01HU3_A1902CliValA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", A1902CliValA);
         A2748CliAlias = T01HU3_A2748CliAlias[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2748CliAlias", A2748CliAlias);
         A2843CliEtiEN = T01HU3_A2843CliEtiEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", A2843CliEtiEN);
         A2842CliEtiCN = T01HU3_A2842CliEtiCN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", A2842CliEtiCN);
         A2841CliEtiCC = T01HU3_A2841CliEtiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", A2841CliEtiCC);
         A3091CliDivTra = T01HU3_A3091CliDivTra[0] ;
         n3091CliDivTra = T01HU3_n3091CliDivTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
         A3304CliNumEtSa = T01HU3_A3304CliNumEtSa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3304CliNumEtSa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3304CliNumEtSa), 4, 0));
         A3305CliNumEtTi = T01HU3_A3305CliNumEtTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3305CliNumEtTi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3305CliNumEtTi), 4, 0));
         A3630CliPort = T01HU3_A3630CliPort[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3630CliPort", A3630CliPort);
         A3631CliTrnCod = T01HU3_A3631CliTrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
         A3632CliCopAlb = T01HU3_A3632CliCopAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
         A3633CliEmail = T01HU3_A3633CliEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3633CliEmail", A3633CliEmail);
         A3644CliNom1 = T01HU3_A3644CliNom1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3644CliNom1", A3644CliNom1);
         A4828CliCp2 = T01HU3_A4828CliCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4828CliCp2", A4828CliCp2);
         A5042CliTBon = T01HU3_A5042CliTBon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5042CliTBon", A5042CliTBon);
         A5648CliTipo = T01HU3_A5648CliTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", A5648CliTipo);
         A5649CliDom2 = T01HU3_A5649CliDom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5649CliDom2", A5649CliDom2);
         A6185CliIe = T01HU3_A6185CliIe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6185CliIe", A6185CliIe);
         A7064CliUltMq = T01HU3_A7064CliUltMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7064CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7064CliUltMq), 4, 0));
         A8723CliEst = T01HU3_A8723CliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         A9852CliP1 = T01HU3_A9852CliP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9852CliP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9852CliP1), 3, 0));
         A9853CliP0 = T01HU3_A9853CliP0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
         A9854CliEFx = T01HU3_A9854CliEFx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", A9854CliEFx);
         A9855CliEEm = T01HU3_A9855CliEEm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", A9855CliEEm);
         A9901CliNumC = T01HU3_A9901CliNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9901CliNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9901CliNumC), 6, 0));
         A10045CliAct = T01HU3_A10045CliAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
         A10046CliEt1 = T01HU3_A10046CliEt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", A10046CliEt1);
         A10047CliEt2 = T01HU3_A10047CliEt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", A10047CliEt2);
         A10048CliEt3 = T01HU3_A10048CliEt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", A10048CliEt3);
         A10049CliEt4 = T01HU3_A10049CliEt4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", A10049CliEt4);
         A10050Cliemf = T01HU3_A10050Cliemf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10050Cliemf", A10050Cliemf);
         A11521CodWebId = T01HU3_A11521CodWebId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11521CodWebId", A11521CodWebId);
         A11620CliMailGr = T01HU3_A11620CliMailGr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11620CliMailGr", A11620CliMailGr);
         A11621CliMailPk = T01HU3_A11621CliMailPk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11621CliMailPk", A11621CliMailPk);
         A11622CliMailGrE = T01HU3_A11622CliMailGrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", A11622CliMailGrE);
         A11623CliMailPkE = T01HU3_A11623CliMailPkE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", A11623CliMailPkE);
         A3891CliPlanUL = T01HU3_A3891CliPlanUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3891CliPlanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3891CliPlanUL), 4, 0));
         A11632Lb_Linu = T01HU3_A11632Lb_Linu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11632Lb_Linu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11632Lb_Linu), 4, 0));
         A11633CliUltl = T01HU3_A11633CliUltl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11633CliUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11633CliUltl), 4, 0));
         A11701ClimailPr = T01HU3_A11701ClimailPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11701ClimailPr", A11701ClimailPr);
         A11702CliPerPr = T01HU3_A11702CliPerPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11702CliPerPr", A11702CliPerPr);
         A11761CliUltNPz = T01HU3_A11761CliUltNPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
         A396EmprCod = T01HU3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A858ZonGeoCod = T01HU3_A858ZonGeoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         A10301Cod_pais = T01HU3_A10301Cod_pais[0] ;
         n10301Cod_pais = T01HU3_n10301Cod_pais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
         A11180TpOpC = T01HU3_A11180TpOpC[0] ;
         n11180TpOpC = T01HU3_n11180TpOpC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
         A781PrvCod = T01HU3_A781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HU21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey1HU21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey1HU21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HU21( ) ;
      if ( RcdFound21 == 0 )
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
      RcdFound21 = (short)(0) ;
      /* Using cursor T01HU14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01HU14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HU14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HU14_A252CliCod[0] < A252CliCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01HU14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HU14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HU14_A252CliCod[0] > A252CliCod ) ) )
         {
            A396EmprCod = T01HU14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01HU14_A252CliCod[0] ;
            n252CliCod = T01HU14_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T01HU15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01HU15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HU15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HU15_A252CliCod[0] > A252CliCod ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01HU15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HU15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HU15_A252CliCod[0] < A252CliCod ) ) )
         {
            A396EmprCod = T01HU15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01HU15_A252CliCod[0] ;
            n252CliCod = T01HU15_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HU21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HU21( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
               update1HU21( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HU21( ) ;
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
                  insert1HU21( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
      getKey1HU21( ) ;
      if ( RcdFound21 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = Z252CliCod ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrclient");
      GX_FocusControl = edtCliNif_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1HU0( ) ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliNif_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HU21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNif_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HU21( ) ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNif_Internalname ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNif_Internalname ;
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
      scanStart1HU21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNext1HU21( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNif_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HU21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HU21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z278CliNif, T01HU2_A278CliNif[0]) != 0 ) || ( GXutil.strcmp(Z279CliNom, T01HU2_A279CliNom[0]) != 0 ) || ( GXutil.strcmp(Z260CliDom, T01HU2_A260CliDom[0]) != 0 ) || ( GXutil.strcmp(Z295CliPob, T01HU2_A295CliPob[0]) != 0 ) || ( GXutil.strcmp(Z256CliCp, T01HU2_A256CliCp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z303CliTel1, T01HU2_A303CliTel1[0]) != 0 ) || ( GXutil.strcmp(Z304CliTel2, T01HU2_A304CliTel2[0]) != 0 ) || ( GXutil.strcmp(Z305CliTelex, T01HU2_A305CliTelex[0]) != 0 ) || ( GXutil.strcmp(Z274CliFax, T01HU2_A274CliFax[0]) != 0 ) || ( GXutil.strcmp(Z277CliIniVac, T01HU2_A277CliIniVac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z276CliFinVac, T01HU2_A276CliFinVac[0]) != 0 ) || ( GXutil.strcmp(Z258CliDes, T01HU2_A258CliDes[0]) != 0 ) || ( GXutil.strcmp(Z272CliEti, T01HU2_A272CliEti[0]) != 0 ) || ( Z306CliUrg != T01HU2_A306CliUrg[0] ) || ( GXutil.strcmp(Z293CliPer, T01HU2_A293CliPer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z298CliRef, T01HU2_A298CliRef[0]) != 0 ) || ( GXutil.strcmp(Z257CliCue, T01HU2_A257CliCue[0]) != 0 ) || ( DecimalUtil.compareTo(Z301CliRieCon, T01HU2_A301CliRieCon[0]) != 0 ) || ( DecimalUtil.compareTo(Z300CliRieCir, T01HU2_A300CliRieCir[0]) != 0 ) || ( DecimalUtil.compareTo(Z302CliRieMh, T01HU2_A302CliRieMh[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z275CliFecMh), GXutil.resetTime(T01HU2_A275CliFecMh[0])) ) || ( Z251CliCanRie != T01HU2_A251CliCanRie[0] ) || ( Z294CliPerFac != T01HU2_A294CliPerFac[0] ) || ( GXutil.strcmp(Z250CliAlbAgr, T01HU2_A250CliAlbAgr[0]) != 0 ) || ( Z273CliFacCop != T01HU2_A273CliFacCop[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1466CliTub, T01HU2_A1466CliTub[0]) != 0 ) || ( GXutil.strcmp(Z1901CliCtrl, T01HU2_A1901CliCtrl[0]) != 0 ) || ( GXutil.strcmp(Z1902CliValA, T01HU2_A1902CliValA[0]) != 0 ) || ( GXutil.strcmp(Z2748CliAlias, T01HU2_A2748CliAlias[0]) != 0 ) || ( GXutil.strcmp(Z2843CliEtiEN, T01HU2_A2843CliEtiEN[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2842CliEtiCN, T01HU2_A2842CliEtiCN[0]) != 0 ) || ( GXutil.strcmp(Z2841CliEtiCC, T01HU2_A2841CliEtiCC[0]) != 0 ) || ( GXutil.strcmp(Z3091CliDivTra, T01HU2_A3091CliDivTra[0]) != 0 ) || ( Z3304CliNumEtSa != T01HU2_A3304CliNumEtSa[0] ) || ( Z3305CliNumEtTi != T01HU2_A3305CliNumEtTi[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3630CliPort, T01HU2_A3630CliPort[0]) != 0 ) || ( Z3631CliTrnCod != T01HU2_A3631CliTrnCod[0] ) || ( Z3632CliCopAlb != T01HU2_A3632CliCopAlb[0] ) || ( GXutil.strcmp(Z3633CliEmail, T01HU2_A3633CliEmail[0]) != 0 ) || ( GXutil.strcmp(Z3644CliNom1, T01HU2_A3644CliNom1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4828CliCp2, T01HU2_A4828CliCp2[0]) != 0 ) || ( GXutil.strcmp(Z5042CliTBon, T01HU2_A5042CliTBon[0]) != 0 ) || ( GXutil.strcmp(Z5648CliTipo, T01HU2_A5648CliTipo[0]) != 0 ) || ( GXutil.strcmp(Z5649CliDom2, T01HU2_A5649CliDom2[0]) != 0 ) || ( GXutil.strcmp(Z6185CliIe, T01HU2_A6185CliIe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7064CliUltMq != T01HU2_A7064CliUltMq[0] ) || ( GXutil.strcmp(Z8723CliEst, T01HU2_A8723CliEst[0]) != 0 ) || ( Z9852CliP1 != T01HU2_A9852CliP1[0] ) || ( Z9853CliP0 != T01HU2_A9853CliP0[0] ) || ( GXutil.strcmp(Z9854CliEFx, T01HU2_A9854CliEFx[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9855CliEEm, T01HU2_A9855CliEEm[0]) != 0 ) || ( Z9901CliNumC != T01HU2_A9901CliNumC[0] ) || ( GXutil.strcmp(Z10045CliAct, T01HU2_A10045CliAct[0]) != 0 ) || ( GXutil.strcmp(Z10046CliEt1, T01HU2_A10046CliEt1[0]) != 0 ) || ( GXutil.strcmp(Z10047CliEt2, T01HU2_A10047CliEt2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10048CliEt3, T01HU2_A10048CliEt3[0]) != 0 ) || ( GXutil.strcmp(Z10049CliEt4, T01HU2_A10049CliEt4[0]) != 0 ) || ( GXutil.strcmp(Z10050Cliemf, T01HU2_A10050Cliemf[0]) != 0 ) || ( GXutil.strcmp(Z11521CodWebId, T01HU2_A11521CodWebId[0]) != 0 ) || ( GXutil.strcmp(Z11620CliMailGr, T01HU2_A11620CliMailGr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11621CliMailPk, T01HU2_A11621CliMailPk[0]) != 0 ) || ( GXutil.strcmp(Z11622CliMailGrE, T01HU2_A11622CliMailGrE[0]) != 0 ) || ( GXutil.strcmp(Z11623CliMailPkE, T01HU2_A11623CliMailPkE[0]) != 0 ) || ( Z3891CliPlanUL != T01HU2_A3891CliPlanUL[0] ) || ( Z11632Lb_Linu != T01HU2_A11632Lb_Linu[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11633CliUltl != T01HU2_A11633CliUltl[0] ) || ( GXutil.strcmp(Z11701ClimailPr, T01HU2_A11701ClimailPr[0]) != 0 ) || ( GXutil.strcmp(Z11702CliPerPr, T01HU2_A11702CliPerPr[0]) != 0 ) || ( Z11761CliUltNPz != T01HU2_A11761CliUltNPz[0] ) || ( Z858ZonGeoCod != T01HU2_A858ZonGeoCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10301Cod_pais != T01HU2_A10301Cod_pais[0] ) || ( Z11180TpOpC != T01HU2_A11180TpOpC[0] ) || ( Z781PrvCod != T01HU2_A781PrvCod[0] ) )
         {
            if ( GXutil.strcmp(Z278CliNif, T01HU2_A278CliNif[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliNif");
               GXutil.writeLogRaw("Old: ",Z278CliNif);
               GXutil.writeLogRaw("Current: ",T01HU2_A278CliNif[0]);
            }
            if ( GXutil.strcmp(Z279CliNom, T01HU2_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T01HU2_A279CliNom[0]);
            }
            if ( GXutil.strcmp(Z260CliDom, T01HU2_A260CliDom[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliDom");
               GXutil.writeLogRaw("Old: ",Z260CliDom);
               GXutil.writeLogRaw("Current: ",T01HU2_A260CliDom[0]);
            }
            if ( GXutil.strcmp(Z295CliPob, T01HU2_A295CliPob[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliPob");
               GXutil.writeLogRaw("Old: ",Z295CliPob);
               GXutil.writeLogRaw("Current: ",T01HU2_A295CliPob[0]);
            }
            if ( GXutil.strcmp(Z256CliCp, T01HU2_A256CliCp[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliCp");
               GXutil.writeLogRaw("Old: ",Z256CliCp);
               GXutil.writeLogRaw("Current: ",T01HU2_A256CliCp[0]);
            }
            if ( GXutil.strcmp(Z303CliTel1, T01HU2_A303CliTel1[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTel1");
               GXutil.writeLogRaw("Old: ",Z303CliTel1);
               GXutil.writeLogRaw("Current: ",T01HU2_A303CliTel1[0]);
            }
            if ( GXutil.strcmp(Z304CliTel2, T01HU2_A304CliTel2[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTel2");
               GXutil.writeLogRaw("Old: ",Z304CliTel2);
               GXutil.writeLogRaw("Current: ",T01HU2_A304CliTel2[0]);
            }
            if ( GXutil.strcmp(Z305CliTelex, T01HU2_A305CliTelex[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTelex");
               GXutil.writeLogRaw("Old: ",Z305CliTelex);
               GXutil.writeLogRaw("Current: ",T01HU2_A305CliTelex[0]);
            }
            if ( GXutil.strcmp(Z274CliFax, T01HU2_A274CliFax[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliFax");
               GXutil.writeLogRaw("Old: ",Z274CliFax);
               GXutil.writeLogRaw("Current: ",T01HU2_A274CliFax[0]);
            }
            if ( GXutil.strcmp(Z277CliIniVac, T01HU2_A277CliIniVac[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliIniVac");
               GXutil.writeLogRaw("Old: ",Z277CliIniVac);
               GXutil.writeLogRaw("Current: ",T01HU2_A277CliIniVac[0]);
            }
            if ( GXutil.strcmp(Z276CliFinVac, T01HU2_A276CliFinVac[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliFinVac");
               GXutil.writeLogRaw("Old: ",Z276CliFinVac);
               GXutil.writeLogRaw("Current: ",T01HU2_A276CliFinVac[0]);
            }
            if ( GXutil.strcmp(Z258CliDes, T01HU2_A258CliDes[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliDes");
               GXutil.writeLogRaw("Old: ",Z258CliDes);
               GXutil.writeLogRaw("Current: ",T01HU2_A258CliDes[0]);
            }
            if ( GXutil.strcmp(Z272CliEti, T01HU2_A272CliEti[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEti");
               GXutil.writeLogRaw("Old: ",Z272CliEti);
               GXutil.writeLogRaw("Current: ",T01HU2_A272CliEti[0]);
            }
            if ( Z306CliUrg != T01HU2_A306CliUrg[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliUrg");
               GXutil.writeLogRaw("Old: ",Z306CliUrg);
               GXutil.writeLogRaw("Current: ",T01HU2_A306CliUrg[0]);
            }
            if ( GXutil.strcmp(Z293CliPer, T01HU2_A293CliPer[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliPer");
               GXutil.writeLogRaw("Old: ",Z293CliPer);
               GXutil.writeLogRaw("Current: ",T01HU2_A293CliPer[0]);
            }
            if ( GXutil.strcmp(Z298CliRef, T01HU2_A298CliRef[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliRef");
               GXutil.writeLogRaw("Old: ",Z298CliRef);
               GXutil.writeLogRaw("Current: ",T01HU2_A298CliRef[0]);
            }
            if ( GXutil.strcmp(Z257CliCue, T01HU2_A257CliCue[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliCue");
               GXutil.writeLogRaw("Old: ",Z257CliCue);
               GXutil.writeLogRaw("Current: ",T01HU2_A257CliCue[0]);
            }
            if ( DecimalUtil.compareTo(Z301CliRieCon, T01HU2_A301CliRieCon[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliRieCon");
               GXutil.writeLogRaw("Old: ",Z301CliRieCon);
               GXutil.writeLogRaw("Current: ",T01HU2_A301CliRieCon[0]);
            }
            if ( DecimalUtil.compareTo(Z300CliRieCir, T01HU2_A300CliRieCir[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliRieCir");
               GXutil.writeLogRaw("Old: ",Z300CliRieCir);
               GXutil.writeLogRaw("Current: ",T01HU2_A300CliRieCir[0]);
            }
            if ( DecimalUtil.compareTo(Z302CliRieMh, T01HU2_A302CliRieMh[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliRieMh");
               GXutil.writeLogRaw("Old: ",Z302CliRieMh);
               GXutil.writeLogRaw("Current: ",T01HU2_A302CliRieMh[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z275CliFecMh), GXutil.resetTime(T01HU2_A275CliFecMh[0])) ) )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliFecMh");
               GXutil.writeLogRaw("Old: ",Z275CliFecMh);
               GXutil.writeLogRaw("Current: ",T01HU2_A275CliFecMh[0]);
            }
            if ( Z251CliCanRie != T01HU2_A251CliCanRie[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliCanRie");
               GXutil.writeLogRaw("Old: ",Z251CliCanRie);
               GXutil.writeLogRaw("Current: ",T01HU2_A251CliCanRie[0]);
            }
            if ( Z294CliPerFac != T01HU2_A294CliPerFac[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliPerFac");
               GXutil.writeLogRaw("Old: ",Z294CliPerFac);
               GXutil.writeLogRaw("Current: ",T01HU2_A294CliPerFac[0]);
            }
            if ( GXutil.strcmp(Z250CliAlbAgr, T01HU2_A250CliAlbAgr[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliAlbAgr");
               GXutil.writeLogRaw("Old: ",Z250CliAlbAgr);
               GXutil.writeLogRaw("Current: ",T01HU2_A250CliAlbAgr[0]);
            }
            if ( Z273CliFacCop != T01HU2_A273CliFacCop[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliFacCop");
               GXutil.writeLogRaw("Old: ",Z273CliFacCop);
               GXutil.writeLogRaw("Current: ",T01HU2_A273CliFacCop[0]);
            }
            if ( GXutil.strcmp(Z1466CliTub, T01HU2_A1466CliTub[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTub");
               GXutil.writeLogRaw("Old: ",Z1466CliTub);
               GXutil.writeLogRaw("Current: ",T01HU2_A1466CliTub[0]);
            }
            if ( GXutil.strcmp(Z1901CliCtrl, T01HU2_A1901CliCtrl[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliCtrl");
               GXutil.writeLogRaw("Old: ",Z1901CliCtrl);
               GXutil.writeLogRaw("Current: ",T01HU2_A1901CliCtrl[0]);
            }
            if ( GXutil.strcmp(Z1902CliValA, T01HU2_A1902CliValA[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliValA");
               GXutil.writeLogRaw("Old: ",Z1902CliValA);
               GXutil.writeLogRaw("Current: ",T01HU2_A1902CliValA[0]);
            }
            if ( GXutil.strcmp(Z2748CliAlias, T01HU2_A2748CliAlias[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliAlias");
               GXutil.writeLogRaw("Old: ",Z2748CliAlias);
               GXutil.writeLogRaw("Current: ",T01HU2_A2748CliAlias[0]);
            }
            if ( GXutil.strcmp(Z2843CliEtiEN, T01HU2_A2843CliEtiEN[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEtiEN");
               GXutil.writeLogRaw("Old: ",Z2843CliEtiEN);
               GXutil.writeLogRaw("Current: ",T01HU2_A2843CliEtiEN[0]);
            }
            if ( GXutil.strcmp(Z2842CliEtiCN, T01HU2_A2842CliEtiCN[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEtiCN");
               GXutil.writeLogRaw("Old: ",Z2842CliEtiCN);
               GXutil.writeLogRaw("Current: ",T01HU2_A2842CliEtiCN[0]);
            }
            if ( GXutil.strcmp(Z2841CliEtiCC, T01HU2_A2841CliEtiCC[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEtiCC");
               GXutil.writeLogRaw("Old: ",Z2841CliEtiCC);
               GXutil.writeLogRaw("Current: ",T01HU2_A2841CliEtiCC[0]);
            }
            if ( GXutil.strcmp(Z3091CliDivTra, T01HU2_A3091CliDivTra[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliDivTra");
               GXutil.writeLogRaw("Old: ",Z3091CliDivTra);
               GXutil.writeLogRaw("Current: ",T01HU2_A3091CliDivTra[0]);
            }
            if ( Z3304CliNumEtSa != T01HU2_A3304CliNumEtSa[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliNumEtSa");
               GXutil.writeLogRaw("Old: ",Z3304CliNumEtSa);
               GXutil.writeLogRaw("Current: ",T01HU2_A3304CliNumEtSa[0]);
            }
            if ( Z3305CliNumEtTi != T01HU2_A3305CliNumEtTi[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliNumEtTi");
               GXutil.writeLogRaw("Old: ",Z3305CliNumEtTi);
               GXutil.writeLogRaw("Current: ",T01HU2_A3305CliNumEtTi[0]);
            }
            if ( GXutil.strcmp(Z3630CliPort, T01HU2_A3630CliPort[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliPort");
               GXutil.writeLogRaw("Old: ",Z3630CliPort);
               GXutil.writeLogRaw("Current: ",T01HU2_A3630CliPort[0]);
            }
            if ( Z3631CliTrnCod != T01HU2_A3631CliTrnCod[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTrnCod");
               GXutil.writeLogRaw("Old: ",Z3631CliTrnCod);
               GXutil.writeLogRaw("Current: ",T01HU2_A3631CliTrnCod[0]);
            }
            if ( Z3632CliCopAlb != T01HU2_A3632CliCopAlb[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliCopAlb");
               GXutil.writeLogRaw("Old: ",Z3632CliCopAlb);
               GXutil.writeLogRaw("Current: ",T01HU2_A3632CliCopAlb[0]);
            }
            if ( GXutil.strcmp(Z3633CliEmail, T01HU2_A3633CliEmail[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEmail");
               GXutil.writeLogRaw("Old: ",Z3633CliEmail);
               GXutil.writeLogRaw("Current: ",T01HU2_A3633CliEmail[0]);
            }
            if ( GXutil.strcmp(Z3644CliNom1, T01HU2_A3644CliNom1[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliNom1");
               GXutil.writeLogRaw("Old: ",Z3644CliNom1);
               GXutil.writeLogRaw("Current: ",T01HU2_A3644CliNom1[0]);
            }
            if ( GXutil.strcmp(Z4828CliCp2, T01HU2_A4828CliCp2[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliCp2");
               GXutil.writeLogRaw("Old: ",Z4828CliCp2);
               GXutil.writeLogRaw("Current: ",T01HU2_A4828CliCp2[0]);
            }
            if ( GXutil.strcmp(Z5042CliTBon, T01HU2_A5042CliTBon[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTBon");
               GXutil.writeLogRaw("Old: ",Z5042CliTBon);
               GXutil.writeLogRaw("Current: ",T01HU2_A5042CliTBon[0]);
            }
            if ( GXutil.strcmp(Z5648CliTipo, T01HU2_A5648CliTipo[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliTipo");
               GXutil.writeLogRaw("Old: ",Z5648CliTipo);
               GXutil.writeLogRaw("Current: ",T01HU2_A5648CliTipo[0]);
            }
            if ( GXutil.strcmp(Z5649CliDom2, T01HU2_A5649CliDom2[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliDom2");
               GXutil.writeLogRaw("Old: ",Z5649CliDom2);
               GXutil.writeLogRaw("Current: ",T01HU2_A5649CliDom2[0]);
            }
            if ( GXutil.strcmp(Z6185CliIe, T01HU2_A6185CliIe[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliIe");
               GXutil.writeLogRaw("Old: ",Z6185CliIe);
               GXutil.writeLogRaw("Current: ",T01HU2_A6185CliIe[0]);
            }
            if ( Z7064CliUltMq != T01HU2_A7064CliUltMq[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliUltMq");
               GXutil.writeLogRaw("Old: ",Z7064CliUltMq);
               GXutil.writeLogRaw("Current: ",T01HU2_A7064CliUltMq[0]);
            }
            if ( GXutil.strcmp(Z8723CliEst, T01HU2_A8723CliEst[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEst");
               GXutil.writeLogRaw("Old: ",Z8723CliEst);
               GXutil.writeLogRaw("Current: ",T01HU2_A8723CliEst[0]);
            }
            if ( Z9852CliP1 != T01HU2_A9852CliP1[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliP1");
               GXutil.writeLogRaw("Old: ",Z9852CliP1);
               GXutil.writeLogRaw("Current: ",T01HU2_A9852CliP1[0]);
            }
            if ( Z9853CliP0 != T01HU2_A9853CliP0[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliP0");
               GXutil.writeLogRaw("Old: ",Z9853CliP0);
               GXutil.writeLogRaw("Current: ",T01HU2_A9853CliP0[0]);
            }
            if ( GXutil.strcmp(Z9854CliEFx, T01HU2_A9854CliEFx[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEFx");
               GXutil.writeLogRaw("Old: ",Z9854CliEFx);
               GXutil.writeLogRaw("Current: ",T01HU2_A9854CliEFx[0]);
            }
            if ( GXutil.strcmp(Z9855CliEEm, T01HU2_A9855CliEEm[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEEm");
               GXutil.writeLogRaw("Old: ",Z9855CliEEm);
               GXutil.writeLogRaw("Current: ",T01HU2_A9855CliEEm[0]);
            }
            if ( Z9901CliNumC != T01HU2_A9901CliNumC[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliNumC");
               GXutil.writeLogRaw("Old: ",Z9901CliNumC);
               GXutil.writeLogRaw("Current: ",T01HU2_A9901CliNumC[0]);
            }
            if ( GXutil.strcmp(Z10045CliAct, T01HU2_A10045CliAct[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliAct");
               GXutil.writeLogRaw("Old: ",Z10045CliAct);
               GXutil.writeLogRaw("Current: ",T01HU2_A10045CliAct[0]);
            }
            if ( GXutil.strcmp(Z10046CliEt1, T01HU2_A10046CliEt1[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEt1");
               GXutil.writeLogRaw("Old: ",Z10046CliEt1);
               GXutil.writeLogRaw("Current: ",T01HU2_A10046CliEt1[0]);
            }
            if ( GXutil.strcmp(Z10047CliEt2, T01HU2_A10047CliEt2[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEt2");
               GXutil.writeLogRaw("Old: ",Z10047CliEt2);
               GXutil.writeLogRaw("Current: ",T01HU2_A10047CliEt2[0]);
            }
            if ( GXutil.strcmp(Z10048CliEt3, T01HU2_A10048CliEt3[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEt3");
               GXutil.writeLogRaw("Old: ",Z10048CliEt3);
               GXutil.writeLogRaw("Current: ",T01HU2_A10048CliEt3[0]);
            }
            if ( GXutil.strcmp(Z10049CliEt4, T01HU2_A10049CliEt4[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliEt4");
               GXutil.writeLogRaw("Old: ",Z10049CliEt4);
               GXutil.writeLogRaw("Current: ",T01HU2_A10049CliEt4[0]);
            }
            if ( GXutil.strcmp(Z10050Cliemf, T01HU2_A10050Cliemf[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"Cliemf");
               GXutil.writeLogRaw("Old: ",Z10050Cliemf);
               GXutil.writeLogRaw("Current: ",T01HU2_A10050Cliemf[0]);
            }
            if ( GXutil.strcmp(Z11521CodWebId, T01HU2_A11521CodWebId[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CodWebId");
               GXutil.writeLogRaw("Old: ",Z11521CodWebId);
               GXutil.writeLogRaw("Current: ",T01HU2_A11521CodWebId[0]);
            }
            if ( GXutil.strcmp(Z11620CliMailGr, T01HU2_A11620CliMailGr[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliMailGr");
               GXutil.writeLogRaw("Old: ",Z11620CliMailGr);
               GXutil.writeLogRaw("Current: ",T01HU2_A11620CliMailGr[0]);
            }
            if ( GXutil.strcmp(Z11621CliMailPk, T01HU2_A11621CliMailPk[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliMailPk");
               GXutil.writeLogRaw("Old: ",Z11621CliMailPk);
               GXutil.writeLogRaw("Current: ",T01HU2_A11621CliMailPk[0]);
            }
            if ( GXutil.strcmp(Z11622CliMailGrE, T01HU2_A11622CliMailGrE[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliMailGrE");
               GXutil.writeLogRaw("Old: ",Z11622CliMailGrE);
               GXutil.writeLogRaw("Current: ",T01HU2_A11622CliMailGrE[0]);
            }
            if ( GXutil.strcmp(Z11623CliMailPkE, T01HU2_A11623CliMailPkE[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliMailPkE");
               GXutil.writeLogRaw("Old: ",Z11623CliMailPkE);
               GXutil.writeLogRaw("Current: ",T01HU2_A11623CliMailPkE[0]);
            }
            if ( Z3891CliPlanUL != T01HU2_A3891CliPlanUL[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliPlanUL");
               GXutil.writeLogRaw("Old: ",Z3891CliPlanUL);
               GXutil.writeLogRaw("Current: ",T01HU2_A3891CliPlanUL[0]);
            }
            if ( Z11632Lb_Linu != T01HU2_A11632Lb_Linu[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"Lb_Linu");
               GXutil.writeLogRaw("Old: ",Z11632Lb_Linu);
               GXutil.writeLogRaw("Current: ",T01HU2_A11632Lb_Linu[0]);
            }
            if ( Z11633CliUltl != T01HU2_A11633CliUltl[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliUltl");
               GXutil.writeLogRaw("Old: ",Z11633CliUltl);
               GXutil.writeLogRaw("Current: ",T01HU2_A11633CliUltl[0]);
            }
            if ( GXutil.strcmp(Z11701ClimailPr, T01HU2_A11701ClimailPr[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"ClimailPr");
               GXutil.writeLogRaw("Old: ",Z11701ClimailPr);
               GXutil.writeLogRaw("Current: ",T01HU2_A11701ClimailPr[0]);
            }
            if ( GXutil.strcmp(Z11702CliPerPr, T01HU2_A11702CliPerPr[0]) != 0 )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliPerPr");
               GXutil.writeLogRaw("Old: ",Z11702CliPerPr);
               GXutil.writeLogRaw("Current: ",T01HU2_A11702CliPerPr[0]);
            }
            if ( Z11761CliUltNPz != T01HU2_A11761CliUltNPz[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"CliUltNPz");
               GXutil.writeLogRaw("Old: ",Z11761CliUltNPz);
               GXutil.writeLogRaw("Current: ",T01HU2_A11761CliUltNPz[0]);
            }
            if ( Z858ZonGeoCod != T01HU2_A858ZonGeoCod[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"ZonGeoCod");
               GXutil.writeLogRaw("Old: ",Z858ZonGeoCod);
               GXutil.writeLogRaw("Current: ",T01HU2_A858ZonGeoCod[0]);
            }
            if ( Z10301Cod_pais != T01HU2_A10301Cod_pais[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"Cod_pais");
               GXutil.writeLogRaw("Old: ",Z10301Cod_pais);
               GXutil.writeLogRaw("Current: ",T01HU2_A10301Cod_pais[0]);
            }
            if ( Z11180TpOpC != T01HU2_A11180TpOpC[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"TpOpC");
               GXutil.writeLogRaw("Old: ",Z11180TpOpC);
               GXutil.writeLogRaw("Current: ",T01HU2_A11180TpOpC[0]);
            }
            if ( Z781PrvCod != T01HU2_A781PrvCod[0] )
            {
               GXutil.writeLogln("ttrclient:[seudo value changed for attri]"+"PrvCod");
               GXutil.writeLogRaw("Old: ",Z781PrvCod);
               GXutil.writeLogRaw("Current: ",T01HU2_A781PrvCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HU21( )
   {
      beforeValidate1HU21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HU21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HU21( 0) ;
         checkOptimisticConcurrency1HU21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HU21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HU21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HU16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A278CliNif, A279CliNom, A260CliDom, A295CliPob, A256CliCp, A303CliTel1, A304CliTel2, A305CliTelex, A274CliFax, A277CliIniVac, A276CliFinVac, A258CliDes, A272CliEti, Byte.valueOf(A306CliUrg), A293CliPer, A298CliRef, A257CliCue, A301CliRieCon, A300CliRieCir, A302CliRieMh, A275CliFecMh, Byte.valueOf(A251CliCanRie), Byte.valueOf(A294CliPerFac), A250CliAlbAgr, Byte.valueOf(A273CliFacCop), A1466CliTub, A1901CliCtrl, A1902CliValA, A2748CliAlias, A2843CliEtiEN, A2842CliEtiCN, A2841CliEtiCC, Boolean.valueOf(n3091CliDivTra), A3091CliDivTra, Short.valueOf(A3304CliNumEtSa), Short.valueOf(A3305CliNumEtTi), A3630CliPort, Short.valueOf(A3631CliTrnCod), Byte.valueOf(A3632CliCopAlb), A3633CliEmail, A3644CliNom1, A4828CliCp2, A5042CliTBon, A5648CliTipo, A5649CliDom2, A6185CliIe, Short.valueOf(A7064CliUltMq), A8723CliEst, Short.valueOf(A9852CliP1), Short.valueOf(A9853CliP0), A9854CliEFx, A9855CliEEm, Integer.valueOf(A9901CliNumC), A10045CliAct, A10046CliEt1, A10047CliEt2, A10048CliEt3, A10049CliEt4, A10050Cliemf, A11521CodWebId, A11620CliMailGr, A11621CliMailPk, A11622CliMailGrE, A11623CliMailPkE, Short.valueOf(A3891CliPlanUL), Short.valueOf(A11632Lb_Linu), Short.valueOf(A11633CliUltl), A11701ClimailPr, A11702CliPerPr, Integer.valueOf(A11761CliUltNPz), A396EmprCod, Short.valueOf(A858ZonGeoCod), Boolean.valueOf(n10301Cod_pais), Short.valueOf(A10301Cod_pais), Boolean.valueOf(n11180TpOpC), Short.valueOf(A11180TpOpC), Short.valueOf(A781PrvCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1HU0( ) ;
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
            load1HU21( ) ;
         }
         endLevel1HU21( ) ;
      }
      closeExtendedTableCursors1HU21( ) ;
   }

   public void update1HU21( )
   {
      beforeValidate1HU21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HU21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HU21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HU21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HU21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HU17 */
                  pr_default.execute(15, new Object[] {A278CliNif, A279CliNom, A260CliDom, A295CliPob, A256CliCp, A303CliTel1, A304CliTel2, A305CliTelex, A274CliFax, A277CliIniVac, A276CliFinVac, A258CliDes, A272CliEti, Byte.valueOf(A306CliUrg), A293CliPer, A298CliRef, A257CliCue, A301CliRieCon, A300CliRieCir, A302CliRieMh, A275CliFecMh, Byte.valueOf(A251CliCanRie), Byte.valueOf(A294CliPerFac), A250CliAlbAgr, Byte.valueOf(A273CliFacCop), A1466CliTub, A1901CliCtrl, A1902CliValA, A2748CliAlias, A2843CliEtiEN, A2842CliEtiCN, A2841CliEtiCC, Boolean.valueOf(n3091CliDivTra), A3091CliDivTra, Short.valueOf(A3304CliNumEtSa), Short.valueOf(A3305CliNumEtTi), A3630CliPort, Short.valueOf(A3631CliTrnCod), Byte.valueOf(A3632CliCopAlb), A3633CliEmail, A3644CliNom1, A4828CliCp2, A5042CliTBon, A5648CliTipo, A5649CliDom2, A6185CliIe, Short.valueOf(A7064CliUltMq), A8723CliEst, Short.valueOf(A9852CliP1), Short.valueOf(A9853CliP0), A9854CliEFx, A9855CliEEm, Integer.valueOf(A9901CliNumC), A10045CliAct, A10046CliEt1, A10047CliEt2, A10048CliEt3, A10049CliEt4, A10050Cliemf, A11521CodWebId, A11620CliMailGr, A11621CliMailPk, A11622CliMailGrE, A11623CliMailPkE, Short.valueOf(A3891CliPlanUL), Short.valueOf(A11632Lb_Linu), Short.valueOf(A11633CliUltl), A11701ClimailPr, A11702CliPerPr, Integer.valueOf(A11761CliUltNPz), Short.valueOf(A858ZonGeoCod), Boolean.valueOf(n10301Cod_pais), Short.valueOf(A10301Cod_pais), Boolean.valueOf(n11180TpOpC), Short.valueOf(A11180TpOpC), Short.valueOf(A781PrvCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HU21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HU0( ) ;
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
         endLevel1HU21( ) ;
      }
      closeExtendedTableCursors1HU21( ) ;
   }

   public void deferredUpdate1HU21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HU21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HU21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HU21( ) ;
         afterConfirm1HU21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HU21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HU18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound21 == 0 )
                     {
                        initAll1HU21( ) ;
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
                     resetCaption1HU0( ) ;
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HU21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HU21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01HU19 */
         pr_default.execute(17, new Object[] {Short.valueOf(A781PrvCod)});
         A787PrvDsc = T01HU19_A787PrvDsc[0] ;
         n787PrvDsc = T01HU19_n787PrvDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
         pr_default.close(17);
         /* Using cursor T01HU20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
         A1360ZonGeoNom = T01HU20_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01HU20_n1360ZonGeoNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
         pr_default.close(18);
         /* Using cursor T01HU21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n10301Cod_pais), Short.valueOf(A10301Cod_pais)});
         A10302Dsc_pais = T01HU21_A10302Dsc_pais[0] ;
         n10302Dsc_pais = T01HU21_n10302Dsc_pais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
         pr_default.close(19);
         /* Using cursor T01HU22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n11180TpOpC), Short.valueOf(A11180TpOpC)});
         A11181TpOpD = T01HU22_A11181TpOpD[0] ;
         n11181TpOpD = T01HU22_n11181TpOpD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", A11181TpOpD);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HU23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01HU24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01HU25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01HU26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01HU27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01HU28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01HU29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01HU30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01HU31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01HU32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01HU33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01HU34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01HU35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01HU36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01HU37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01HU38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01HU39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01HU40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01HU41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01HU42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01HU43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01HU44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01HU45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01HU46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01HU47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01HU48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01HU49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01HU50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01HU51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01HU52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01HU53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01HU54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01HU55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01HU56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01HU57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01HU58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01HU59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01HU60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01HU61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01HU62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01HU63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01HU64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01HU65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01HU66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01HU67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01HU68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01HU69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01HU70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01HU71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01HU72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01HU73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01HU74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01HU75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01HU76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01HU77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01HU78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01HU79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01HU80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01HU81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01HU82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01HU83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01HU84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
      }
   }

   public void endLevel1HU21( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HU21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrclient");
         if ( AnyError == 0 )
         {
            confirmValues1HU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrclient");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HU21( )
   {
      /* Using cursor T01HU85 */
      pr_default.execute(83);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T01HU85_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01HU85_A252CliCod[0] ;
         n252CliCod = T01HU85_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HU21( )
   {
      /* Scan next routine */
      pr_default.readNext(83);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T01HU85_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01HU85_A252CliCod[0] ;
         n252CliCod = T01HU85_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd1HU21( )
   {
      pr_default.close(83);
   }

   public void afterConfirm1HU21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HU21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HU21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HU21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HU21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HU21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HU21( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNif_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtCliDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDom_Enabled), 5, 0), true);
      edtCliPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPob_Enabled), 5, 0), true);
      edtCliCp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCp_Enabled), 5, 0), true);
      edtPrvCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      edtPrvDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDsc_Enabled), 5, 0), true);
      edtCliTel1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliTel1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliTel1_Enabled), 5, 0), true);
      edtCliTel2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliTel2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliTel2_Enabled), 5, 0), true);
      edtCliTelex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliTelex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliTelex_Enabled), 5, 0), true);
      edtCliFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliFax_Enabled), 5, 0), true);
      edtCliIniVac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliIniVac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliIniVac_Enabled), 5, 0), true);
      edtCliFinVac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliFinVac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliFinVac_Enabled), 5, 0), true);
      edtCliDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDes_Enabled), 5, 0), true);
      edtCliEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEti_Enabled), 5, 0), true);
      edtCliUrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUrg_Enabled), 5, 0), true);
      edtCliPer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPer_Enabled), 5, 0), true);
      edtCliRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliRef_Enabled), 5, 0), true);
      edtCliCue_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCue_Enabled), 5, 0), true);
      edtCliRieCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliRieCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliRieCon_Enabled), 5, 0), true);
      edtCliRieCir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliRieCir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliRieCir_Enabled), 5, 0), true);
      edtCliRieMh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliRieMh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliRieMh_Enabled), 5, 0), true);
      edtCliFecMh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliFecMh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliFecMh_Enabled), 5, 0), true);
      edtCliCanRie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCanRie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCanRie_Enabled), 5, 0), true);
      edtCliPerFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPerFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPerFac_Enabled), 5, 0), true);
      chkCliAlbAgr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAlbAgr.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliAlbAgr.getEnabled(), 5, 0), true);
      edtCliFacCop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliFacCop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliFacCop_Enabled), 5, 0), true);
      edtZonGeoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtZonGeoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtZonGeoCod_Enabled), 5, 0), true);
      edtZonGeoNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtZonGeoNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtZonGeoNom_Enabled), 5, 0), true);
      chkCliTub.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliTub.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliTub.getEnabled(), 5, 0), true);
      chkCliCtrl.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliCtrl.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliCtrl.getEnabled(), 5, 0), true);
      chkCliValA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliValA.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliValA.getEnabled(), 5, 0), true);
      edtCliAlias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliAlias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliAlias_Enabled), 5, 0), true);
      chkCliEtiEN.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEtiEN.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEtiEN.getEnabled(), 5, 0), true);
      chkCliEtiCN.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEtiCN.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEtiCN.getEnabled(), 5, 0), true);
      chkCliEtiCC.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEtiCC.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEtiCC.getEnabled(), 5, 0), true);
      cmbCliDivTra.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliDivTra.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliDivTra.getEnabled(), 5, 0), true);
      edtCliNumEtSa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNumEtSa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNumEtSa_Enabled), 5, 0), true);
      edtCliNumEtTi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNumEtTi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNumEtTi_Enabled), 5, 0), true);
      edtCliPort_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPort_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPort_Enabled), 5, 0), true);
      edtCliTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliTrnCod_Enabled), 5, 0), true);
      edtCliCopAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCopAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCopAlb_Enabled), 5, 0), true);
      edtCliEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEmail_Enabled), 5, 0), true);
      edtCliNom1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom1_Enabled), 5, 0), true);
      edtCliCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCp2_Enabled), 5, 0), true);
      edtCliTBon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliTBon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliTBon_Enabled), 5, 0), true);
      cmbCliTipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliTipo.getEnabled(), 5, 0), true);
      edtCliDom2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDom2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDom2_Enabled), 5, 0), true);
      edtCliIe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliIe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliIe_Enabled), 5, 0), true);
      edtCliUltMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltMq_Enabled), 5, 0), true);
      edtCliEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEst_Enabled), 5, 0), true);
      edtCliP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliP1_Enabled), 5, 0), true);
      edtCliP0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliP0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliP0_Enabled), 5, 0), true);
      chkCliEFx.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEFx.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEFx.getEnabled(), 5, 0), true);
      chkCliEEm.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEEm.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEEm.getEnabled(), 5, 0), true);
      edtCliNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNumC_Enabled), 5, 0), true);
      chkCliAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliAct.getEnabled(), 5, 0), true);
      chkCliEt1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt1.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEt1.getEnabled(), 5, 0), true);
      chkCliEt2.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt2.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEt2.getEnabled(), 5, 0), true);
      chkCliEt3.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt3.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEt3.getEnabled(), 5, 0), true);
      chkCliEt4.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt4.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliEt4.getEnabled(), 5, 0), true);
      edtCliemf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliemf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliemf_Enabled), 5, 0), true);
      edtCod_pais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_pais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_pais_Enabled), 5, 0), true);
      edtDsc_pais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDsc_pais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_pais_Enabled), 5, 0), true);
      edtTpOpC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpOpC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTpOpC_Enabled), 5, 0), true);
      edtTpOpD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpOpD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTpOpD_Enabled), 5, 0), true);
      edtCodWebId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodWebId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodWebId_Enabled), 5, 0), true);
      edtCliMailGr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliMailGr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMailGr_Enabled), 5, 0), true);
      edtCliMailPk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliMailPk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMailPk_Enabled), 5, 0), true);
      chkCliMailGrE.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailGrE.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliMailGrE.getEnabled(), 5, 0), true);
      chkCliMailPkE.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailPkE.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliMailPkE.getEnabled(), 5, 0), true);
      edtCliPlanUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPlanUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPlanUL_Enabled), 5, 0), true);
      edtLb_Linu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Linu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Linu_Enabled), 5, 0), true);
      edtCliUltl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltl_Enabled), 5, 0), true);
      edtClimailPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClimailPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClimailPr_Enabled), 5, 0), true);
      edtCliPerPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPerPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPerPr_Enabled), 5, 0), true);
      edtCliUltNPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltNPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltNPz_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HU21( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HU0( )
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrclient", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z278CliNif", GXutil.rtrim( Z278CliNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z260CliDom", GXutil.rtrim( Z260CliDom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z295CliPob", GXutil.rtrim( Z295CliPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z256CliCp", GXutil.rtrim( Z256CliCp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z303CliTel1", GXutil.rtrim( Z303CliTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z304CliTel2", GXutil.rtrim( Z304CliTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z305CliTelex", GXutil.rtrim( Z305CliTelex));
      app.GxWebStd.gx_hidden_field( httpContext, "Z274CliFax", GXutil.rtrim( Z274CliFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z277CliIniVac", GXutil.rtrim( Z277CliIniVac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z276CliFinVac", GXutil.rtrim( Z276CliFinVac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z258CliDes", GXutil.rtrim( Z258CliDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z272CliEti", GXutil.rtrim( Z272CliEti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z306CliUrg", GXutil.ltrim( localUtil.ntoc( Z306CliUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z293CliPer", GXutil.rtrim( Z293CliPer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z298CliRef", GXutil.rtrim( Z298CliRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z257CliCue", GXutil.rtrim( Z257CliCue));
      app.GxWebStd.gx_hidden_field( httpContext, "Z301CliRieCon", GXutil.ltrim( localUtil.ntoc( Z301CliRieCon, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z300CliRieCir", GXutil.ltrim( localUtil.ntoc( Z300CliRieCir, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z302CliRieMh", GXutil.ltrim( localUtil.ntoc( Z302CliRieMh, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z275CliFecMh", localUtil.dtoc( Z275CliFecMh, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z251CliCanRie", GXutil.ltrim( localUtil.ntoc( Z251CliCanRie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z294CliPerFac", GXutil.ltrim( localUtil.ntoc( Z294CliPerFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z250CliAlbAgr", GXutil.rtrim( Z250CliAlbAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z273CliFacCop", GXutil.ltrim( localUtil.ntoc( Z273CliFacCop, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1466CliTub", GXutil.rtrim( Z1466CliTub));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1901CliCtrl", GXutil.rtrim( Z1901CliCtrl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1902CliValA", GXutil.rtrim( Z1902CliValA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2748CliAlias", GXutil.rtrim( Z2748CliAlias));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2843CliEtiEN", GXutil.rtrim( Z2843CliEtiEN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2842CliEtiCN", GXutil.rtrim( Z2842CliEtiCN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2841CliEtiCC", GXutil.rtrim( Z2841CliEtiCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3091CliDivTra", GXutil.rtrim( Z3091CliDivTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3304CliNumEtSa", GXutil.ltrim( localUtil.ntoc( Z3304CliNumEtSa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3305CliNumEtTi", GXutil.ltrim( localUtil.ntoc( Z3305CliNumEtTi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3630CliPort", GXutil.rtrim( Z3630CliPort));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3631CliTrnCod", GXutil.ltrim( localUtil.ntoc( Z3631CliTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3632CliCopAlb", GXutil.ltrim( localUtil.ntoc( Z3632CliCopAlb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3633CliEmail", GXutil.rtrim( Z3633CliEmail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3644CliNom1", GXutil.rtrim( Z3644CliNom1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4828CliCp2", GXutil.rtrim( Z4828CliCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5042CliTBon", GXutil.rtrim( Z5042CliTBon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5648CliTipo", GXutil.rtrim( Z5648CliTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5649CliDom2", GXutil.rtrim( Z5649CliDom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6185CliIe", GXutil.rtrim( Z6185CliIe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7064CliUltMq", GXutil.ltrim( localUtil.ntoc( Z7064CliUltMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8723CliEst", GXutil.rtrim( Z8723CliEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9852CliP1", GXutil.ltrim( localUtil.ntoc( Z9852CliP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9853CliP0", GXutil.ltrim( localUtil.ntoc( Z9853CliP0, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9854CliEFx", GXutil.rtrim( Z9854CliEFx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9855CliEEm", GXutil.rtrim( Z9855CliEEm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9901CliNumC", GXutil.ltrim( localUtil.ntoc( Z9901CliNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10045CliAct", GXutil.rtrim( Z10045CliAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10046CliEt1", GXutil.rtrim( Z10046CliEt1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10047CliEt2", GXutil.rtrim( Z10047CliEt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10048CliEt3", GXutil.rtrim( Z10048CliEt3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10049CliEt4", GXutil.rtrim( Z10049CliEt4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10050Cliemf", GXutil.rtrim( Z10050Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11521CodWebId", GXutil.rtrim( Z11521CodWebId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11620CliMailGr", GXutil.rtrim( Z11620CliMailGr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11621CliMailPk", GXutil.rtrim( Z11621CliMailPk));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11622CliMailGrE", GXutil.rtrim( Z11622CliMailGrE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11623CliMailPkE", GXutil.rtrim( Z11623CliMailPkE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3891CliPlanUL", GXutil.ltrim( localUtil.ntoc( Z3891CliPlanUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11632Lb_Linu", GXutil.ltrim( localUtil.ntoc( Z11632Lb_Linu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11633CliUltl", GXutil.ltrim( localUtil.ntoc( Z11633CliUltl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11701ClimailPr", GXutil.rtrim( Z11701ClimailPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11702CliPerPr", GXutil.rtrim( Z11702CliPerPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11761CliUltNPz", GXutil.ltrim( localUtil.ntoc( Z11761CliUltNPz, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z858ZonGeoCod", GXutil.ltrim( localUtil.ntoc( Z858ZonGeoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10301Cod_pais", GXutil.ltrim( localUtil.ntoc( Z10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11180TpOpC", GXutil.ltrim( localUtil.ntoc( Z11180TpOpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z781PrvCod", GXutil.ltrim( localUtil.ntoc( Z781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrclient", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrCLIENT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CLIENT", "") ;
   }

   public void initializeNonKey1HU21( )
   {
      A278CliNif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A278CliNif", A278CliNif);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A260CliDom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A260CliDom", A260CliDom);
      A295CliPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A295CliPob", A295CliPob);
      A256CliCp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A256CliCp", A256CliCp);
      A781PrvCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      A787PrvDsc = "" ;
      n787PrvDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
      A303CliTel1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A303CliTel1", A303CliTel1);
      A304CliTel2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A304CliTel2", A304CliTel2);
      A305CliTelex = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A305CliTelex", A305CliTelex);
      A274CliFax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A274CliFax", A274CliFax);
      A277CliIniVac = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A277CliIniVac", A277CliIniVac);
      A276CliFinVac = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A276CliFinVac", A276CliFinVac);
      A258CliDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A258CliDes", A258CliDes);
      A272CliEti = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
      A306CliUrg = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      A293CliPer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A293CliPer", A293CliPer);
      A298CliRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A298CliRef", A298CliRef);
      A257CliCue = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A257CliCue", A257CliCue);
      A301CliRieCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A301CliRieCon", GXutil.ltrimstr( A301CliRieCon, 12, 2));
      A300CliRieCir = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A300CliRieCir", GXutil.ltrimstr( A300CliRieCir, 12, 2));
      A302CliRieMh = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A302CliRieMh", GXutil.ltrimstr( A302CliRieMh, 12, 2));
      A275CliFecMh = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A275CliFecMh", localUtil.format(A275CliFecMh, "99/99/99"));
      A251CliCanRie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A251CliCanRie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A251CliCanRie), 2, 0));
      A294CliPerFac = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A294CliPerFac", GXutil.str( A294CliPerFac, 1, 0));
      A250CliAlbAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", A250CliAlbAgr);
      A273CliFacCop = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A273CliFacCop", GXutil.str( A273CliFacCop, 1, 0));
      A858ZonGeoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
      A1360ZonGeoNom = "" ;
      n1360ZonGeoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
      A1466CliTub = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", A1466CliTub);
      A1901CliCtrl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", A1901CliCtrl);
      A1902CliValA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", A1902CliValA);
      A2748CliAlias = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2748CliAlias", A2748CliAlias);
      A2843CliEtiEN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", A2843CliEtiEN);
      A2842CliEtiCN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", A2842CliEtiCN);
      A2841CliEtiCC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", A2841CliEtiCC);
      A3091CliDivTra = "" ;
      n3091CliDivTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
      A3304CliNumEtSa = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3304CliNumEtSa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3304CliNumEtSa), 4, 0));
      A3305CliNumEtTi = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3305CliNumEtTi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3305CliNumEtTi), 4, 0));
      A3630CliPort = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3630CliPort", A3630CliPort);
      A3631CliTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3631CliTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3631CliTrnCod), 4, 0));
      A3632CliCopAlb = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3632CliCopAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3632CliCopAlb), 2, 0));
      A3633CliEmail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3633CliEmail", A3633CliEmail);
      A3644CliNom1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3644CliNom1", A3644CliNom1);
      A4828CliCp2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4828CliCp2", A4828CliCp2);
      A5042CliTBon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5042CliTBon", A5042CliTBon);
      A5648CliTipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", A5648CliTipo);
      A5649CliDom2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5649CliDom2", A5649CliDom2);
      A6185CliIe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6185CliIe", A6185CliIe);
      A7064CliUltMq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7064CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7064CliUltMq), 4, 0));
      A8723CliEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      A9852CliP1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9852CliP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9852CliP1), 3, 0));
      A9853CliP0 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9853CliP0", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9853CliP0), 3, 0));
      A9854CliEFx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", A9854CliEFx);
      A9855CliEEm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", A9855CliEEm);
      A9901CliNumC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9901CliNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9901CliNumC), 6, 0));
      A10045CliAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
      A10046CliEt1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", A10046CliEt1);
      A10047CliEt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", A10047CliEt2);
      A10048CliEt3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", A10048CliEt3);
      A10049CliEt4 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", A10049CliEt4);
      A10050Cliemf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10050Cliemf", A10050Cliemf);
      A10301Cod_pais = (short)(0) ;
      n10301Cod_pais = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
      A10302Dsc_pais = "" ;
      n10302Dsc_pais = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
      A11180TpOpC = (short)(0) ;
      n11180TpOpC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11180TpOpC), 4, 0));
      A11181TpOpD = "" ;
      n11181TpOpD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", A11181TpOpD);
      A11521CodWebId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11521CodWebId", A11521CodWebId);
      A11620CliMailGr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11620CliMailGr", A11620CliMailGr);
      A11621CliMailPk = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11621CliMailPk", A11621CliMailPk);
      A11622CliMailGrE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", A11622CliMailGrE);
      A11623CliMailPkE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", A11623CliMailPkE);
      A3891CliPlanUL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3891CliPlanUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3891CliPlanUL), 4, 0));
      A11632Lb_Linu = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11632Lb_Linu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11632Lb_Linu), 4, 0));
      A11633CliUltl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11633CliUltl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11633CliUltl), 4, 0));
      A11701ClimailPr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11701ClimailPr", A11701ClimailPr);
      A11702CliPerPr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11702CliPerPr", A11702CliPerPr);
      A11761CliUltNPz = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11761CliUltNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11761CliUltNPz), 8, 0));
      Z278CliNif = "" ;
      Z279CliNom = "" ;
      Z260CliDom = "" ;
      Z295CliPob = "" ;
      Z256CliCp = "" ;
      Z303CliTel1 = "" ;
      Z304CliTel2 = "" ;
      Z305CliTelex = "" ;
      Z274CliFax = "" ;
      Z277CliIniVac = "" ;
      Z276CliFinVac = "" ;
      Z258CliDes = "" ;
      Z272CliEti = "" ;
      Z306CliUrg = (byte)(0) ;
      Z293CliPer = "" ;
      Z298CliRef = "" ;
      Z257CliCue = "" ;
      Z301CliRieCon = DecimalUtil.ZERO ;
      Z300CliRieCir = DecimalUtil.ZERO ;
      Z302CliRieMh = DecimalUtil.ZERO ;
      Z275CliFecMh = GXutil.nullDate() ;
      Z251CliCanRie = (byte)(0) ;
      Z294CliPerFac = (byte)(0) ;
      Z250CliAlbAgr = "" ;
      Z273CliFacCop = (byte)(0) ;
      Z1466CliTub = "" ;
      Z1901CliCtrl = "" ;
      Z1902CliValA = "" ;
      Z2748CliAlias = "" ;
      Z2843CliEtiEN = "" ;
      Z2842CliEtiCN = "" ;
      Z2841CliEtiCC = "" ;
      Z3091CliDivTra = "" ;
      Z3304CliNumEtSa = (short)(0) ;
      Z3305CliNumEtTi = (short)(0) ;
      Z3630CliPort = "" ;
      Z3631CliTrnCod = (short)(0) ;
      Z3632CliCopAlb = (byte)(0) ;
      Z3633CliEmail = "" ;
      Z3644CliNom1 = "" ;
      Z4828CliCp2 = "" ;
      Z5042CliTBon = "" ;
      Z5648CliTipo = "" ;
      Z5649CliDom2 = "" ;
      Z6185CliIe = "" ;
      Z7064CliUltMq = (short)(0) ;
      Z8723CliEst = "" ;
      Z9852CliP1 = (short)(0) ;
      Z9853CliP0 = (short)(0) ;
      Z9854CliEFx = "" ;
      Z9855CliEEm = "" ;
      Z9901CliNumC = 0 ;
      Z10045CliAct = "" ;
      Z10046CliEt1 = "" ;
      Z10047CliEt2 = "" ;
      Z10048CliEt3 = "" ;
      Z10049CliEt4 = "" ;
      Z10050Cliemf = "" ;
      Z11521CodWebId = "" ;
      Z11620CliMailGr = "" ;
      Z11621CliMailPk = "" ;
      Z11622CliMailGrE = "" ;
      Z11623CliMailPkE = "" ;
      Z3891CliPlanUL = (short)(0) ;
      Z11632Lb_Linu = (short)(0) ;
      Z11633CliUltl = (short)(0) ;
      Z11701ClimailPr = "" ;
      Z11702CliPerPr = "" ;
      Z11761CliUltNPz = 0 ;
      Z858ZonGeoCod = (short)(0) ;
      Z10301Cod_pais = (short)(0) ;
      Z11180TpOpC = (short)(0) ;
      Z781PrvCod = (short)(0) ;
   }

   public void initAll1HU21( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey1HU21( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016331513", true, true);
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
      httpContext.AddJavascriptSource("ttrclient.js", "?202661016331514", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliNif_Internalname = "CLINIF" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliDom_Internalname = "CLIDOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliPob_Internalname = "CLIPOB" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCp_Internalname = "CLICP" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrvCod_Internalname = "PRVCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPrvDsc_Internalname = "PRVDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliTel1_Internalname = "CLITEL1" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCliTel2_Internalname = "CLITEL2" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCliTelex_Internalname = "CLITELEX" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtCliFax_Internalname = "CLIFAX" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCliIniVac_Internalname = "CLIINIVAC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtCliFinVac_Internalname = "CLIFINVAC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtCliDes_Internalname = "CLIDES" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtCliEti_Internalname = "CLIETI" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtCliUrg_Internalname = "CLIURG" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtCliPer_Internalname = "CLIPER" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtCliRef_Internalname = "CLIREF" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtCliCue_Internalname = "CLICUE" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtCliRieCon_Internalname = "CLIRIECON" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtCliRieCir_Internalname = "CLIRIECIR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtCliRieMh_Internalname = "CLIRIEMH" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtCliFecMh_Internalname = "CLIFECMH" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtCliCanRie_Internalname = "CLICANRIE" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtCliPerFac_Internalname = "CLIPERFAC" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      chkCliAlbAgr.setInternalname( "CLIALBAGR" );
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtCliFacCop_Internalname = "CLIFACCOP" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtZonGeoCod_Internalname = "ZONGEOCOD" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtZonGeoNom_Internalname = "ZONGEONOM" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      chkCliTub.setInternalname( "CLITUB" );
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      chkCliCtrl.setInternalname( "CLICTRL" );
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      chkCliValA.setInternalname( "CLIVALA" );
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtCliAlias_Internalname = "CLIALIAS" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      chkCliEtiEN.setInternalname( "CLIETIEN" );
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      chkCliEtiCN.setInternalname( "CLIETICN" );
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      chkCliEtiCC.setInternalname( "CLIETICC" );
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      cmbCliDivTra.setInternalname( "CLIDIVTRA" );
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtCliNumEtSa_Internalname = "CLINUMETSA" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtCliNumEtTi_Internalname = "CLINUMETTI" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtCliPort_Internalname = "CLIPORT" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtCliTrnCod_Internalname = "CLITRNCOD" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtCliCopAlb_Internalname = "CLICOPALB" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtCliEmail_Internalname = "CLIEMAIL" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtCliNom1_Internalname = "CLINOM1" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtCliCp2_Internalname = "CLICP2" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtCliTBon_Internalname = "CLITBON" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      cmbCliTipo.setInternalname( "CLITIPO" );
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtCliDom2_Internalname = "CLIDOM2" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtCliIe_Internalname = "CLIIE" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtCliUltMq_Internalname = "CLIULTMQ" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtCliEst_Internalname = "CLIEST" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtCliP1_Internalname = "CLIP1" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtCliP0_Internalname = "CLIP0" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      chkCliEFx.setInternalname( "CLIEFX" );
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      chkCliEEm.setInternalname( "CLIEEM" );
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtCliNumC_Internalname = "CLINUMC" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      chkCliAct.setInternalname( "CLIACT" );
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      chkCliEt1.setInternalname( "CLIET1" );
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      chkCliEt2.setInternalname( "CLIET2" );
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      chkCliEt3.setInternalname( "CLIET3" );
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      chkCliEt4.setInternalname( "CLIET4" );
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtCliemf_Internalname = "CLIEMF" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtCod_pais_Internalname = "COD_PAIS" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtDsc_pais_Internalname = "DSC_PAIS" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtTpOpC_Internalname = "TPOPC" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtTpOpD_Internalname = "TPOPD" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtCodWebId_Internalname = "CODWEBID" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtCliMailGr_Internalname = "CLIMAILGR" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtCliMailPk_Internalname = "CLIMAILPK" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      chkCliMailGrE.setInternalname( "CLIMAILGRE" );
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE" );
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtCliPlanUL_Internalname = "CLIPLANUL" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtLb_Linu_Internalname = "LB_LINU" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtCliUltl_Internalname = "CLIULTL" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtClimailPr_Internalname = "CLIMAILPR" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtCliPerPr_Internalname = "CLIPERPR" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtCliUltNPz_Internalname = "CLIULTNPZ" ;
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
      Form.setCaption( httpContext.getMessage( "CLIENT", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCliUltNPz_Jsonclick = "" ;
      edtCliUltNPz_Backcolor = (int)(0xFFFFFF) ;
      edtCliUltNPz_Enabled = 1 ;
      edtCliPerPr_Jsonclick = "" ;
      edtCliPerPr_Backcolor = (int)(0xFFFFFF) ;
      edtCliPerPr_Enabled = 1 ;
      edtClimailPr_Jsonclick = "" ;
      edtClimailPr_Backcolor = (int)(0xFFFFFF) ;
      edtClimailPr_Enabled = 1 ;
      edtCliUltl_Jsonclick = "" ;
      edtCliUltl_Backcolor = (int)(0xFFFFFF) ;
      edtCliUltl_Enabled = 1 ;
      edtLb_Linu_Jsonclick = "" ;
      edtLb_Linu_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Linu_Enabled = 1 ;
      edtCliPlanUL_Jsonclick = "" ;
      edtCliPlanUL_Backcolor = (int)(0xFFFFFF) ;
      edtCliPlanUL_Enabled = 1 ;
      chkCliMailPkE.setIBackground( (int)(0xFFFFFF) );
      chkCliMailPkE.setEnabled( 1 );
      chkCliMailGrE.setIBackground( (int)(0xFFFFFF) );
      chkCliMailGrE.setEnabled( 1 );
      edtCliMailPk_Jsonclick = "" ;
      edtCliMailPk_Backcolor = (int)(0xFFFFFF) ;
      edtCliMailPk_Enabled = 1 ;
      edtCliMailGr_Jsonclick = "" ;
      edtCliMailGr_Backcolor = (int)(0xFFFFFF) ;
      edtCliMailGr_Enabled = 1 ;
      edtCodWebId_Jsonclick = "" ;
      edtCodWebId_Backcolor = (int)(0xFFFFFF) ;
      edtCodWebId_Enabled = 1 ;
      edtTpOpD_Jsonclick = "" ;
      edtTpOpD_Backcolor = (int)(0xFFFFFF) ;
      edtTpOpD_Enabled = 0 ;
      edtTpOpC_Jsonclick = "" ;
      edtTpOpC_Backcolor = (int)(0xFFFFFF) ;
      edtTpOpC_Enabled = 1 ;
      edtDsc_pais_Jsonclick = "" ;
      edtDsc_pais_Backcolor = (int)(0xFFFFFF) ;
      edtDsc_pais_Enabled = 0 ;
      edtCod_pais_Jsonclick = "" ;
      edtCod_pais_Backcolor = (int)(0xFFFFFF) ;
      edtCod_pais_Enabled = 1 ;
      edtCliemf_Jsonclick = "" ;
      edtCliemf_Backcolor = (int)(0xFFFFFF) ;
      edtCliemf_Enabled = 1 ;
      chkCliEt4.setIBackground( (int)(0xFFFFFF) );
      chkCliEt4.setEnabled( 1 );
      chkCliEt3.setIBackground( (int)(0xFFFFFF) );
      chkCliEt3.setEnabled( 1 );
      chkCliEt2.setIBackground( (int)(0xFFFFFF) );
      chkCliEt2.setEnabled( 1 );
      chkCliEt1.setIBackground( (int)(0xFFFFFF) );
      chkCliEt1.setEnabled( 1 );
      chkCliAct.setIBackground( (int)(0xFFFFFF) );
      chkCliAct.setEnabled( 1 );
      edtCliNumC_Jsonclick = "" ;
      edtCliNumC_Backcolor = (int)(0xFFFFFF) ;
      edtCliNumC_Enabled = 1 ;
      chkCliEEm.setIBackground( (int)(0xFFFFFF) );
      chkCliEEm.setEnabled( 1 );
      chkCliEFx.setIBackground( (int)(0xFFFFFF) );
      chkCliEFx.setEnabled( 1 );
      edtCliP0_Jsonclick = "" ;
      edtCliP0_Backcolor = (int)(0xFFFFFF) ;
      edtCliP0_Enabled = 1 ;
      edtCliP1_Jsonclick = "" ;
      edtCliP1_Backcolor = (int)(0xFFFFFF) ;
      edtCliP1_Enabled = 1 ;
      edtCliEst_Jsonclick = "" ;
      edtCliEst_Backcolor = (int)(0xFFFFFF) ;
      edtCliEst_Enabled = 1 ;
      edtCliUltMq_Jsonclick = "" ;
      edtCliUltMq_Backcolor = (int)(0xFFFFFF) ;
      edtCliUltMq_Enabled = 1 ;
      edtCliIe_Jsonclick = "" ;
      edtCliIe_Backcolor = (int)(0xFFFFFF) ;
      edtCliIe_Enabled = 1 ;
      edtCliDom2_Jsonclick = "" ;
      edtCliDom2_Backcolor = (int)(0xFFFFFF) ;
      edtCliDom2_Enabled = 1 ;
      cmbCliTipo.setJsonclick( "" );
      cmbCliTipo.setEnabled( 1 );
      cmbCliTipo.setIBackground( (int)(0xFFFFFF) );
      edtCliTBon_Jsonclick = "" ;
      edtCliTBon_Backcolor = (int)(0xFFFFFF) ;
      edtCliTBon_Enabled = 1 ;
      edtCliCp2_Jsonclick = "" ;
      edtCliCp2_Backcolor = (int)(0xFFFFFF) ;
      edtCliCp2_Enabled = 1 ;
      edtCliNom1_Jsonclick = "" ;
      edtCliNom1_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom1_Enabled = 1 ;
      edtCliEmail_Jsonclick = "" ;
      edtCliEmail_Backcolor = (int)(0xFFFFFF) ;
      edtCliEmail_Enabled = 1 ;
      edtCliCopAlb_Jsonclick = "" ;
      edtCliCopAlb_Backcolor = (int)(0xFFFFFF) ;
      edtCliCopAlb_Enabled = 1 ;
      edtCliTrnCod_Jsonclick = "" ;
      edtCliTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliTrnCod_Enabled = 1 ;
      edtCliPort_Jsonclick = "" ;
      edtCliPort_Backcolor = (int)(0xFFFFFF) ;
      edtCliPort_Enabled = 1 ;
      edtCliNumEtTi_Jsonclick = "" ;
      edtCliNumEtTi_Backcolor = (int)(0xFFFFFF) ;
      edtCliNumEtTi_Enabled = 1 ;
      edtCliNumEtSa_Jsonclick = "" ;
      edtCliNumEtSa_Backcolor = (int)(0xFFFFFF) ;
      edtCliNumEtSa_Enabled = 1 ;
      cmbCliDivTra.setJsonclick( "" );
      cmbCliDivTra.setEnabled( 1 );
      cmbCliDivTra.setIBackground( (int)(0xFFFFFF) );
      chkCliEtiCC.setIBackground( (int)(0xFFFFFF) );
      chkCliEtiCC.setEnabled( 1 );
      chkCliEtiCN.setIBackground( (int)(0xFFFFFF) );
      chkCliEtiCN.setEnabled( 1 );
      chkCliEtiEN.setIBackground( (int)(0xFFFFFF) );
      chkCliEtiEN.setEnabled( 1 );
      edtCliAlias_Jsonclick = "" ;
      edtCliAlias_Backcolor = (int)(0xFFFFFF) ;
      edtCliAlias_Enabled = 1 ;
      chkCliValA.setIBackground( (int)(0xFFFFFF) );
      chkCliValA.setEnabled( 1 );
      chkCliCtrl.setIBackground( (int)(0xFFFFFF) );
      chkCliCtrl.setEnabled( 1 );
      chkCliTub.setIBackground( (int)(0xFFFFFF) );
      chkCliTub.setEnabled( 1 );
      edtZonGeoNom_Jsonclick = "" ;
      edtZonGeoNom_Backcolor = (int)(0xFFFFFF) ;
      edtZonGeoNom_Enabled = 0 ;
      edtZonGeoCod_Jsonclick = "" ;
      edtZonGeoCod_Backcolor = (int)(0xFFFFFF) ;
      edtZonGeoCod_Enabled = 1 ;
      edtCliFacCop_Jsonclick = "" ;
      edtCliFacCop_Backcolor = (int)(0xFFFFFF) ;
      edtCliFacCop_Enabled = 1 ;
      chkCliAlbAgr.setIBackground( (int)(0xFFFFFF) );
      chkCliAlbAgr.setEnabled( 1 );
      edtCliPerFac_Jsonclick = "" ;
      edtCliPerFac_Backcolor = (int)(0xFFFFFF) ;
      edtCliPerFac_Enabled = 1 ;
      edtCliCanRie_Jsonclick = "" ;
      edtCliCanRie_Backcolor = (int)(0xFFFFFF) ;
      edtCliCanRie_Enabled = 1 ;
      edtCliFecMh_Jsonclick = "" ;
      edtCliFecMh_Backcolor = (int)(0xFFFFFF) ;
      edtCliFecMh_Enabled = 1 ;
      edtCliRieMh_Jsonclick = "" ;
      edtCliRieMh_Backcolor = (int)(0xFFFFFF) ;
      edtCliRieMh_Enabled = 1 ;
      edtCliRieCir_Jsonclick = "" ;
      edtCliRieCir_Backcolor = (int)(0xFFFFFF) ;
      edtCliRieCir_Enabled = 1 ;
      edtCliRieCon_Jsonclick = "" ;
      edtCliRieCon_Backcolor = (int)(0xFFFFFF) ;
      edtCliRieCon_Enabled = 1 ;
      edtCliCue_Jsonclick = "" ;
      edtCliCue_Backcolor = (int)(0xFFFFFF) ;
      edtCliCue_Enabled = 1 ;
      edtCliRef_Jsonclick = "" ;
      edtCliRef_Backcolor = (int)(0xFFFFFF) ;
      edtCliRef_Enabled = 1 ;
      edtCliPer_Jsonclick = "" ;
      edtCliPer_Backcolor = (int)(0xFFFFFF) ;
      edtCliPer_Enabled = 1 ;
      edtCliUrg_Jsonclick = "" ;
      edtCliUrg_Backcolor = (int)(0xFFFFFF) ;
      edtCliUrg_Enabled = 1 ;
      edtCliEti_Jsonclick = "" ;
      edtCliEti_Backcolor = (int)(0xFFFFFF) ;
      edtCliEti_Enabled = 1 ;
      edtCliDes_Jsonclick = "" ;
      edtCliDes_Backcolor = (int)(0xFFFFFF) ;
      edtCliDes_Enabled = 1 ;
      edtCliFinVac_Jsonclick = "" ;
      edtCliFinVac_Backcolor = (int)(0xFFFFFF) ;
      edtCliFinVac_Enabled = 1 ;
      edtCliIniVac_Jsonclick = "" ;
      edtCliIniVac_Backcolor = (int)(0xFFFFFF) ;
      edtCliIniVac_Enabled = 1 ;
      edtCliFax_Jsonclick = "" ;
      edtCliFax_Backcolor = (int)(0xFFFFFF) ;
      edtCliFax_Enabled = 1 ;
      edtCliTelex_Jsonclick = "" ;
      edtCliTelex_Backcolor = (int)(0xFFFFFF) ;
      edtCliTelex_Enabled = 1 ;
      edtCliTel2_Jsonclick = "" ;
      edtCliTel2_Backcolor = (int)(0xFFFFFF) ;
      edtCliTel2_Enabled = 1 ;
      edtCliTel1_Jsonclick = "" ;
      edtCliTel1_Backcolor = (int)(0xFFFFFF) ;
      edtCliTel1_Enabled = 1 ;
      edtPrvDsc_Jsonclick = "" ;
      edtPrvDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDsc_Enabled = 0 ;
      edtPrvCod_Jsonclick = "" ;
      edtPrvCod_Backcolor = (int)(0xFFFFFF) ;
      edtPrvCod_Enabled = 1 ;
      edtCliCp_Jsonclick = "" ;
      edtCliCp_Backcolor = (int)(0xFFFFFF) ;
      edtCliCp_Enabled = 1 ;
      edtCliPob_Jsonclick = "" ;
      edtCliPob_Backcolor = (int)(0xFFFFFF) ;
      edtCliPob_Enabled = 1 ;
      edtCliDom_Jsonclick = "" ;
      edtCliDom_Backcolor = (int)(0xFFFFFF) ;
      edtCliDom_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 1 ;
      edtCliNif_Jsonclick = "" ;
      edtCliNif_Backcolor = (int)(0xFFFFFF) ;
      edtCliNif_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      chkCliAlbAgr.setName( "CLIALBAGR" );
      chkCliAlbAgr.setWebtags( "" );
      chkCliAlbAgr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAlbAgr.getInternalname(), "TitleCaption", chkCliAlbAgr.getCaption(), true);
      chkCliAlbAgr.setCheckedValue( "N" );
      A250CliAlbAgr = ((GXutil.strcmp(GXutil.rtrim( A250CliAlbAgr), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", A250CliAlbAgr);
      chkCliTub.setName( "CLITUB" );
      chkCliTub.setWebtags( "" );
      chkCliTub.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliTub.getInternalname(), "TitleCaption", chkCliTub.getCaption(), true);
      chkCliTub.setCheckedValue( "N" );
      A1466CliTub = ((GXutil.strcmp(GXutil.rtrim( A1466CliTub), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", A1466CliTub);
      chkCliCtrl.setName( "CLICTRL" );
      chkCliCtrl.setWebtags( "" );
      chkCliCtrl.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliCtrl.getInternalname(), "TitleCaption", chkCliCtrl.getCaption(), true);
      chkCliCtrl.setCheckedValue( "N" );
      A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", A1901CliCtrl);
      chkCliValA.setName( "CLIVALA" );
      chkCliValA.setWebtags( "" );
      chkCliValA.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliValA.getInternalname(), "TitleCaption", chkCliValA.getCaption(), true);
      chkCliValA.setCheckedValue( "N" );
      A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", A1902CliValA);
      chkCliEtiEN.setName( "CLIETIEN" );
      chkCliEtiEN.setWebtags( "" );
      chkCliEtiEN.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEtiEN.getInternalname(), "TitleCaption", chkCliEtiEN.getCaption(), true);
      chkCliEtiEN.setCheckedValue( "N" );
      A2843CliEtiEN = ((GXutil.strcmp(GXutil.rtrim( A2843CliEtiEN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", A2843CliEtiEN);
      chkCliEtiCN.setName( "CLIETICN" );
      chkCliEtiCN.setWebtags( "" );
      chkCliEtiCN.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEtiCN.getInternalname(), "TitleCaption", chkCliEtiCN.getCaption(), true);
      chkCliEtiCN.setCheckedValue( "N" );
      A2842CliEtiCN = ((GXutil.strcmp(GXutil.rtrim( A2842CliEtiCN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", A2842CliEtiCN);
      chkCliEtiCC.setName( "CLIETICC" );
      chkCliEtiCC.setWebtags( "" );
      chkCliEtiCC.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEtiCC.getInternalname(), "TitleCaption", chkCliEtiCC.getCaption(), true);
      chkCliEtiCC.setCheckedValue( "N" );
      A2841CliEtiCC = ((GXutil.strcmp(GXutil.rtrim( A2841CliEtiCC), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", A2841CliEtiCC);
      cmbCliDivTra.setName( "CLIDIVTRA" );
      cmbCliDivTra.setWebtags( "" );
      cmbCliDivTra.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbCliDivTra.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbCliDivTra.getItemCount() > 0 )
      {
         A3091CliDivTra = cmbCliDivTra.getValidValue(A3091CliDivTra) ;
         n3091CliDivTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
      }
      cmbCliTipo.setName( "CLITIPO" );
      cmbCliTipo.setWebtags( "" );
      cmbCliTipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbCliTipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
      if ( cmbCliTipo.getItemCount() > 0 )
      {
         A5648CliTipo = cmbCliTipo.getValidValue(A5648CliTipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", A5648CliTipo);
      }
      chkCliEFx.setName( "CLIEFX" );
      chkCliEFx.setWebtags( "" );
      chkCliEFx.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEFx.getInternalname(), "TitleCaption", chkCliEFx.getCaption(), true);
      chkCliEFx.setCheckedValue( "N" );
      A9854CliEFx = ((GXutil.strcmp(GXutil.rtrim( A9854CliEFx), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", A9854CliEFx);
      chkCliEEm.setName( "CLIEEM" );
      chkCliEEm.setWebtags( "" );
      chkCliEEm.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEEm.getInternalname(), "TitleCaption", chkCliEEm.getCaption(), true);
      chkCliEEm.setCheckedValue( "N" );
      A9855CliEEm = ((GXutil.strcmp(GXutil.rtrim( A9855CliEEm), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", A9855CliEEm);
      chkCliAct.setName( "CLIACT" );
      chkCliAct.setWebtags( "" );
      chkCliAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAct.getInternalname(), "TitleCaption", chkCliAct.getCaption(), true);
      chkCliAct.setCheckedValue( "N" );
      A10045CliAct = ((GXutil.strcmp(GXutil.rtrim( A10045CliAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
      chkCliEt1.setName( "CLIET1" );
      chkCliEt1.setWebtags( "" );
      chkCliEt1.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt1.getInternalname(), "TitleCaption", chkCliEt1.getCaption(), true);
      chkCliEt1.setCheckedValue( "N" );
      A10046CliEt1 = ((GXutil.strcmp(GXutil.rtrim( A10046CliEt1), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", A10046CliEt1);
      chkCliEt2.setName( "CLIET2" );
      chkCliEt2.setWebtags( "" );
      chkCliEt2.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt2.getInternalname(), "TitleCaption", chkCliEt2.getCaption(), true);
      chkCliEt2.setCheckedValue( "N" );
      A10047CliEt2 = ((GXutil.strcmp(GXutil.rtrim( A10047CliEt2), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", A10047CliEt2);
      chkCliEt3.setName( "CLIET3" );
      chkCliEt3.setWebtags( "" );
      chkCliEt3.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt3.getInternalname(), "TitleCaption", chkCliEt3.getCaption(), true);
      chkCliEt3.setCheckedValue( "N" );
      A10048CliEt3 = ((GXutil.strcmp(GXutil.rtrim( A10048CliEt3), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", A10048CliEt3);
      chkCliEt4.setName( "CLIET4" );
      chkCliEt4.setWebtags( "" );
      chkCliEt4.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliEt4.getInternalname(), "TitleCaption", chkCliEt4.getCaption(), true);
      chkCliEt4.setCheckedValue( "N" );
      A10049CliEt4 = ((GXutil.strcmp(GXutil.rtrim( A10049CliEt4), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", A10049CliEt4);
      chkCliMailGrE.setName( "CLIMAILGRE" );
      chkCliMailGrE.setWebtags( "" );
      chkCliMailGrE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailGrE.getInternalname(), "TitleCaption", chkCliMailGrE.getCaption(), true);
      chkCliMailGrE.setCheckedValue( "N" );
      A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", A11622CliMailGrE);
      chkCliMailPkE.setName( "CLIMAILPKE" );
      chkCliMailPkE.setWebtags( "" );
      chkCliMailPkE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailPkE.getInternalname(), "TitleCaption", chkCliMailPkE.getCaption(), true);
      chkCliMailPkE.setCheckedValue( "N" );
      A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", A11623CliMailPkE);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtCliNif_Internalname ;
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

   public void valid_Clicod( )
   {
      A5648CliTipo = cmbCliTipo.getValue() ;
      cmbCliTipo.setValue( A5648CliTipo );
      n3091CliDivTra = false ;
      A3091CliDivTra = cmbCliDivTra.getValue() ;
      n3091CliDivTra = false ;
      cmbCliDivTra.setValue( A3091CliDivTra );
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A250CliAlbAgr = ((GXutil.strcmp(GXutil.rtrim( A250CliAlbAgr), "S")==0) ? "S" : "N") ;
      A1466CliTub = ((GXutil.strcmp(GXutil.rtrim( A1466CliTub), "S")==0) ? "S" : "N") ;
      A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
      A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
      A2843CliEtiEN = ((GXutil.strcmp(GXutil.rtrim( A2843CliEtiEN), "S")==0) ? "S" : "N") ;
      A2842CliEtiCN = ((GXutil.strcmp(GXutil.rtrim( A2842CliEtiCN), "S")==0) ? "S" : "N") ;
      A2841CliEtiCC = ((GXutil.strcmp(GXutil.rtrim( A2841CliEtiCC), "S")==0) ? "S" : "N") ;
      if ( cmbCliDivTra.getItemCount() > 0 )
      {
         A3091CliDivTra = cmbCliDivTra.getValidValue(A3091CliDivTra) ;
         n3091CliDivTra = false ;
         cmbCliDivTra.setValue( A3091CliDivTra );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliDivTra.setValue( GXutil.rtrim( A3091CliDivTra) );
      }
      if ( cmbCliTipo.getItemCount() > 0 )
      {
         A5648CliTipo = cmbCliTipo.getValidValue(A5648CliTipo) ;
         cmbCliTipo.setValue( A5648CliTipo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliTipo.setValue( GXutil.rtrim( A5648CliTipo) );
      }
      A9854CliEFx = ((GXutil.strcmp(GXutil.rtrim( A9854CliEFx), "S")==0) ? "S" : "N") ;
      A9855CliEEm = ((GXutil.strcmp(GXutil.rtrim( A9855CliEEm), "S")==0) ? "S" : "N") ;
      A10045CliAct = ((GXutil.strcmp(GXutil.rtrim( A10045CliAct), "S")==0) ? "S" : "N") ;
      A10046CliEt1 = ((GXutil.strcmp(GXutil.rtrim( A10046CliEt1), "S")==0) ? "S" : "N") ;
      A10047CliEt2 = ((GXutil.strcmp(GXutil.rtrim( A10047CliEt2), "S")==0) ? "S" : "N") ;
      A10048CliEt3 = ((GXutil.strcmp(GXutil.rtrim( A10048CliEt3), "S")==0) ? "S" : "N") ;
      A10049CliEt4 = ((GXutil.strcmp(GXutil.rtrim( A10049CliEt4), "S")==0) ? "S" : "N") ;
      A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
      A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A278CliNif", GXutil.rtrim( A278CliNif));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A260CliDom", GXutil.rtrim( A260CliDom));
      httpContext.ajax_rsp_assign_attri("", false, "A295CliPob", GXutil.rtrim( A295CliPob));
      httpContext.ajax_rsp_assign_attri("", false, "A256CliCp", GXutil.rtrim( A256CliCp));
      httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A303CliTel1", GXutil.rtrim( A303CliTel1));
      httpContext.ajax_rsp_assign_attri("", false, "A304CliTel2", GXutil.rtrim( A304CliTel2));
      httpContext.ajax_rsp_assign_attri("", false, "A305CliTelex", GXutil.rtrim( A305CliTelex));
      httpContext.ajax_rsp_assign_attri("", false, "A274CliFax", GXutil.rtrim( A274CliFax));
      httpContext.ajax_rsp_assign_attri("", false, "A277CliIniVac", GXutil.rtrim( A277CliIniVac));
      httpContext.ajax_rsp_assign_attri("", false, "A276CliFinVac", GXutil.rtrim( A276CliFinVac));
      httpContext.ajax_rsp_assign_attri("", false, "A258CliDes", GXutil.rtrim( A258CliDes));
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", GXutil.rtrim( A272CliEti));
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A293CliPer", GXutil.rtrim( A293CliPer));
      httpContext.ajax_rsp_assign_attri("", false, "A298CliRef", GXutil.rtrim( A298CliRef));
      httpContext.ajax_rsp_assign_attri("", false, "A257CliCue", GXutil.rtrim( A257CliCue));
      httpContext.ajax_rsp_assign_attri("", false, "A301CliRieCon", GXutil.ltrim( localUtil.ntoc( A301CliRieCon, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A300CliRieCir", GXutil.ltrim( localUtil.ntoc( A300CliRieCir, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A302CliRieMh", GXutil.ltrim( localUtil.ntoc( A302CliRieMh, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A275CliFecMh", localUtil.format(A275CliFecMh, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A251CliCanRie", GXutil.ltrim( localUtil.ntoc( A251CliCanRie, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A294CliPerFac", GXutil.ltrim( localUtil.ntoc( A294CliPerFac, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A250CliAlbAgr", GXutil.rtrim( A250CliAlbAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A273CliFacCop", GXutil.ltrim( localUtil.ntoc( A273CliFacCop, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1466CliTub", GXutil.rtrim( A1466CliTub));
      httpContext.ajax_rsp_assign_attri("", false, "A1901CliCtrl", GXutil.rtrim( A1901CliCtrl));
      httpContext.ajax_rsp_assign_attri("", false, "A1902CliValA", GXutil.rtrim( A1902CliValA));
      httpContext.ajax_rsp_assign_attri("", false, "A2748CliAlias", GXutil.rtrim( A2748CliAlias));
      httpContext.ajax_rsp_assign_attri("", false, "A2843CliEtiEN", GXutil.rtrim( A2843CliEtiEN));
      httpContext.ajax_rsp_assign_attri("", false, "A2842CliEtiCN", GXutil.rtrim( A2842CliEtiCN));
      httpContext.ajax_rsp_assign_attri("", false, "A2841CliEtiCC", GXutil.rtrim( A2841CliEtiCC));
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", GXutil.rtrim( A3091CliDivTra));
      cmbCliDivTra.setValue( GXutil.rtrim( A3091CliDivTra) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliDivTra.getInternalname(), "Values", cmbCliDivTra.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A3304CliNumEtSa", GXutil.ltrim( localUtil.ntoc( A3304CliNumEtSa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3305CliNumEtTi", GXutil.ltrim( localUtil.ntoc( A3305CliNumEtTi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3630CliPort", GXutil.rtrim( A3630CliPort));
      httpContext.ajax_rsp_assign_attri("", false, "A3631CliTrnCod", GXutil.ltrim( localUtil.ntoc( A3631CliTrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3632CliCopAlb", GXutil.ltrim( localUtil.ntoc( A3632CliCopAlb, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3633CliEmail", GXutil.rtrim( A3633CliEmail));
      httpContext.ajax_rsp_assign_attri("", false, "A3644CliNom1", GXutil.rtrim( A3644CliNom1));
      httpContext.ajax_rsp_assign_attri("", false, "A4828CliCp2", GXutil.rtrim( A4828CliCp2));
      httpContext.ajax_rsp_assign_attri("", false, "A5042CliTBon", GXutil.rtrim( A5042CliTBon));
      httpContext.ajax_rsp_assign_attri("", false, "A5648CliTipo", GXutil.rtrim( A5648CliTipo));
      cmbCliTipo.setValue( GXutil.rtrim( A5648CliTipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliTipo.getInternalname(), "Values", cmbCliTipo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A5649CliDom2", GXutil.rtrim( A5649CliDom2));
      httpContext.ajax_rsp_assign_attri("", false, "A6185CliIe", GXutil.rtrim( A6185CliIe));
      httpContext.ajax_rsp_assign_attri("", false, "A7064CliUltMq", GXutil.ltrim( localUtil.ntoc( A7064CliUltMq, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", GXutil.rtrim( A8723CliEst));
      httpContext.ajax_rsp_assign_attri("", false, "A9852CliP1", GXutil.ltrim( localUtil.ntoc( A9852CliP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9853CliP0", GXutil.ltrim( localUtil.ntoc( A9853CliP0, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9854CliEFx", GXutil.rtrim( A9854CliEFx));
      httpContext.ajax_rsp_assign_attri("", false, "A9855CliEEm", GXutil.rtrim( A9855CliEEm));
      httpContext.ajax_rsp_assign_attri("", false, "A9901CliNumC", GXutil.ltrim( localUtil.ntoc( A9901CliNumC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", GXutil.rtrim( A10045CliAct));
      httpContext.ajax_rsp_assign_attri("", false, "A10046CliEt1", GXutil.rtrim( A10046CliEt1));
      httpContext.ajax_rsp_assign_attri("", false, "A10047CliEt2", GXutil.rtrim( A10047CliEt2));
      httpContext.ajax_rsp_assign_attri("", false, "A10048CliEt3", GXutil.rtrim( A10048CliEt3));
      httpContext.ajax_rsp_assign_attri("", false, "A10049CliEt4", GXutil.rtrim( A10049CliEt4));
      httpContext.ajax_rsp_assign_attri("", false, "A10050Cliemf", GXutil.rtrim( A10050Cliemf));
      httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11180TpOpC", GXutil.ltrim( localUtil.ntoc( A11180TpOpC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11521CodWebId", GXutil.rtrim( A11521CodWebId));
      httpContext.ajax_rsp_assign_attri("", false, "A11620CliMailGr", GXutil.rtrim( A11620CliMailGr));
      httpContext.ajax_rsp_assign_attri("", false, "A11621CliMailPk", GXutil.rtrim( A11621CliMailPk));
      httpContext.ajax_rsp_assign_attri("", false, "A11622CliMailGrE", GXutil.rtrim( A11622CliMailGrE));
      httpContext.ajax_rsp_assign_attri("", false, "A11623CliMailPkE", GXutil.rtrim( A11623CliMailPkE));
      httpContext.ajax_rsp_assign_attri("", false, "A3891CliPlanUL", GXutil.ltrim( localUtil.ntoc( A3891CliPlanUL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11632Lb_Linu", GXutil.ltrim( localUtil.ntoc( A11632Lb_Linu, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11633CliUltl", GXutil.ltrim( localUtil.ntoc( A11633CliUltl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11701ClimailPr", GXutil.rtrim( A11701ClimailPr));
      httpContext.ajax_rsp_assign_attri("", false, "A11702CliPerPr", GXutil.rtrim( A11702CliPerPr));
      httpContext.ajax_rsp_assign_attri("", false, "A11761CliUltNPz", GXutil.ltrim( localUtil.ntoc( A11761CliUltNPz, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", GXutil.rtrim( A1360ZonGeoNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", GXutil.rtrim( A10302Dsc_pais));
      httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", GXutil.rtrim( A11181TpOpD));
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", GXutil.rtrim( A787PrvDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z278CliNif", GXutil.rtrim( Z278CliNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z260CliDom", GXutil.rtrim( Z260CliDom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z295CliPob", GXutil.rtrim( Z295CliPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z256CliCp", GXutil.rtrim( Z256CliCp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z781PrvCod", GXutil.ltrim( localUtil.ntoc( Z781PrvCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z303CliTel1", GXutil.rtrim( Z303CliTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z304CliTel2", GXutil.rtrim( Z304CliTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z305CliTelex", GXutil.rtrim( Z305CliTelex));
      app.GxWebStd.gx_hidden_field( httpContext, "Z274CliFax", GXutil.rtrim( Z274CliFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z277CliIniVac", GXutil.rtrim( Z277CliIniVac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z276CliFinVac", GXutil.rtrim( Z276CliFinVac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z258CliDes", GXutil.rtrim( Z258CliDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z272CliEti", GXutil.rtrim( Z272CliEti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z306CliUrg", GXutil.ltrim( localUtil.ntoc( Z306CliUrg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z293CliPer", GXutil.rtrim( Z293CliPer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z298CliRef", GXutil.rtrim( Z298CliRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z257CliCue", GXutil.rtrim( Z257CliCue));
      app.GxWebStd.gx_hidden_field( httpContext, "Z301CliRieCon", GXutil.ltrim( localUtil.ntoc( Z301CliRieCon, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z300CliRieCir", GXutil.ltrim( localUtil.ntoc( Z300CliRieCir, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z302CliRieMh", GXutil.ltrim( localUtil.ntoc( Z302CliRieMh, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z275CliFecMh", localUtil.format(Z275CliFecMh, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z251CliCanRie", GXutil.ltrim( localUtil.ntoc( Z251CliCanRie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z294CliPerFac", GXutil.ltrim( localUtil.ntoc( Z294CliPerFac, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z250CliAlbAgr", GXutil.rtrim( Z250CliAlbAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z273CliFacCop", GXutil.ltrim( localUtil.ntoc( Z273CliFacCop, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z858ZonGeoCod", GXutil.ltrim( localUtil.ntoc( Z858ZonGeoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1466CliTub", GXutil.rtrim( Z1466CliTub));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1901CliCtrl", GXutil.rtrim( Z1901CliCtrl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1902CliValA", GXutil.rtrim( Z1902CliValA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2748CliAlias", GXutil.rtrim( Z2748CliAlias));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2843CliEtiEN", GXutil.rtrim( Z2843CliEtiEN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2842CliEtiCN", GXutil.rtrim( Z2842CliEtiCN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2841CliEtiCC", GXutil.rtrim( Z2841CliEtiCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3091CliDivTra", GXutil.rtrim( Z3091CliDivTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3304CliNumEtSa", GXutil.ltrim( localUtil.ntoc( Z3304CliNumEtSa, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3305CliNumEtTi", GXutil.ltrim( localUtil.ntoc( Z3305CliNumEtTi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3630CliPort", GXutil.rtrim( Z3630CliPort));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3631CliTrnCod", GXutil.ltrim( localUtil.ntoc( Z3631CliTrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3632CliCopAlb", GXutil.ltrim( localUtil.ntoc( Z3632CliCopAlb, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3633CliEmail", GXutil.rtrim( Z3633CliEmail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3644CliNom1", GXutil.rtrim( Z3644CliNom1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4828CliCp2", GXutil.rtrim( Z4828CliCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5042CliTBon", GXutil.rtrim( Z5042CliTBon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5648CliTipo", GXutil.rtrim( Z5648CliTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5649CliDom2", GXutil.rtrim( Z5649CliDom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6185CliIe", GXutil.rtrim( Z6185CliIe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7064CliUltMq", GXutil.ltrim( localUtil.ntoc( Z7064CliUltMq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8723CliEst", GXutil.rtrim( Z8723CliEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9852CliP1", GXutil.ltrim( localUtil.ntoc( Z9852CliP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9853CliP0", GXutil.ltrim( localUtil.ntoc( Z9853CliP0, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9854CliEFx", GXutil.rtrim( Z9854CliEFx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9855CliEEm", GXutil.rtrim( Z9855CliEEm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9901CliNumC", GXutil.ltrim( localUtil.ntoc( Z9901CliNumC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10045CliAct", GXutil.rtrim( Z10045CliAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10046CliEt1", GXutil.rtrim( Z10046CliEt1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10047CliEt2", GXutil.rtrim( Z10047CliEt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10048CliEt3", GXutil.rtrim( Z10048CliEt3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10049CliEt4", GXutil.rtrim( Z10049CliEt4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10050Cliemf", GXutil.rtrim( Z10050Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10301Cod_pais", GXutil.ltrim( localUtil.ntoc( Z10301Cod_pais, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11180TpOpC", GXutil.ltrim( localUtil.ntoc( Z11180TpOpC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11521CodWebId", GXutil.rtrim( Z11521CodWebId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11620CliMailGr", GXutil.rtrim( Z11620CliMailGr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11621CliMailPk", GXutil.rtrim( Z11621CliMailPk));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11622CliMailGrE", GXutil.rtrim( Z11622CliMailGrE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11623CliMailPkE", GXutil.rtrim( Z11623CliMailPkE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3891CliPlanUL", GXutil.ltrim( localUtil.ntoc( Z3891CliPlanUL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11632Lb_Linu", GXutil.ltrim( localUtil.ntoc( Z11632Lb_Linu, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11633CliUltl", GXutil.ltrim( localUtil.ntoc( Z11633CliUltl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11701ClimailPr", GXutil.rtrim( Z11701ClimailPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11702CliPerPr", GXutil.rtrim( Z11702CliPerPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11761CliUltNPz", GXutil.ltrim( localUtil.ntoc( Z11761CliUltNPz, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1360ZonGeoNom", GXutil.rtrim( Z1360ZonGeoNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10302Dsc_pais", GXutil.rtrim( Z10302Dsc_pais));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11181TpOpD", GXutil.rtrim( Z11181TpOpD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z787PrvDsc", GXutil.rtrim( Z787PrvDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prvcod( )
   {
      n787PrvDsc = false ;
      /* Using cursor T01HU19 */
      pr_default.execute(17, new Object[] {Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
      }
      A787PrvDsc = T01HU19_A787PrvDsc[0] ;
      n787PrvDsc = T01HU19_n787PrvDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", GXutil.rtrim( A787PrvDsc));
   }

   public void valid_Zongeocod( )
   {
      n1360ZonGeoNom = false ;
      /* Using cursor T01HU20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1360ZonGeoNom = T01HU20_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01HU20_n1360ZonGeoNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", GXutil.rtrim( A1360ZonGeoNom));
   }

   public void valid_Cod_pais( )
   {
      n10301Cod_pais = false ;
      n10302Dsc_pais = false ;
      /* Using cursor T01HU21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n10301Cod_pais), Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10301Cod_pais) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0400", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_PAIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A10302Dsc_pais = T01HU21_A10302Dsc_pais[0] ;
      n10302Dsc_pais = T01HU21_n10302Dsc_pais[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", GXutil.rtrim( A10302Dsc_pais));
   }

   public void valid_Tpopc( )
   {
      n11180TpOpC = false ;
      n11181TpOpD = false ;
      /* Using cursor T01HU22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n11180TpOpC), Short.valueOf(A11180TpOpC)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A11180TpOpC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERACION ASEGURA EN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TPOPC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A11181TpOpD = T01HU22_A11181TpOpD[0] ;
      n11181TpOpD = T01HU22_n11181TpOpD[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11181TpOpD", GXutil.rtrim( A11181TpOpD));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'cmbCliTipo'},{av:'A5648CliTipo',fld:'CLITIPO',pic:'@!'},{av:'cmbCliDivTra'},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A278CliNif',fld:'CLINIF',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A260CliDom',fld:'CLIDOM',pic:''},{av:'A295CliPob',fld:'CLIPOB',pic:''},{av:'A256CliCp',fld:'CLICP',pic:''},{av:'A781PrvCod',fld:'PRVCOD',pic:'ZZ9'},{av:'A303CliTel1',fld:'CLITEL1',pic:''},{av:'A304CliTel2',fld:'CLITEL2',pic:''},{av:'A305CliTelex',fld:'CLITELEX',pic:''},{av:'A274CliFax',fld:'CLIFAX',pic:''},{av:'A277CliIniVac',fld:'CLIINIVAC',pic:''},{av:'A276CliFinVac',fld:'CLIFINVAC',pic:''},{av:'A258CliDes',fld:'CLIDES',pic:''},{av:'A272CliEti',fld:'CLIETI',pic:'@!'},{av:'A306CliUrg',fld:'CLIURG',pic:'9'},{av:'A293CliPer',fld:'CLIPER',pic:''},{av:'A298CliRef',fld:'CLIREF',pic:''},{av:'A257CliCue',fld:'CLICUE',pic:''},{av:'A301CliRieCon',fld:'CLIRIECON',pic:'ZZZZZZZZ9.99'},{av:'A300CliRieCir',fld:'CLIRIECIR',pic:'ZZZZZZZZ9.99'},{av:'A302CliRieMh',fld:'CLIRIEMH',pic:'ZZZZZZZZ9.99'},{av:'A275CliFecMh',fld:'CLIFECMH',pic:''},{av:'A251CliCanRie',fld:'CLICANRIE',pic:'Z9'},{av:'A294CliPerFac',fld:'CLIPERFAC',pic:'9'},{av:'A273CliFacCop',fld:'CLIFACCOP',pic:'9'},{av:'A858ZonGeoCod',fld:'ZONGEOCOD',pic:'ZZ9'},{av:'A2748CliAlias',fld:'CLIALIAS',pic:''},{av:'cmbCliDivTra'},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A3304CliNumEtSa',fld:'CLINUMETSA',pic:'ZZZ9'},{av:'A3305CliNumEtTi',fld:'CLINUMETTI',pic:'ZZZ9'},{av:'A3630CliPort',fld:'CLIPORT',pic:'@!'},{av:'A3631CliTrnCod',fld:'CLITRNCOD',pic:'ZZZ9'},{av:'A3632CliCopAlb',fld:'CLICOPALB',pic:'Z9'},{av:'A3633CliEmail',fld:'CLIEMAIL',pic:''},{av:'A3644CliNom1',fld:'CLINOM1',pic:''},{av:'A4828CliCp2',fld:'CLICP2',pic:''},{av:'A5042CliTBon',fld:'CLITBON',pic:'@!'},{av:'cmbCliTipo'},{av:'A5648CliTipo',fld:'CLITIPO',pic:'@!'},{av:'A5649CliDom2',fld:'CLIDOM2',pic:''},{av:'A6185CliIe',fld:'CLIIE',pic:'@!'},{av:'A7064CliUltMq',fld:'CLIULTMQ',pic:'ZZZ9'},{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A9852CliP1',fld:'CLIP1',pic:'ZZ9'},{av:'A9853CliP0',fld:'CLIP0',pic:'ZZ9'},{av:'A9901CliNumC',fld:'CLINUMC',pic:'ZZZZZ9'},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'},{av:'A11180TpOpC',fld:'TPOPC',pic:'ZZZ9'},{av:'A11521CodWebId',fld:'CODWEBID',pic:''},{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A3891CliPlanUL',fld:'CLIPLANUL',pic:'ZZZ9'},{av:'A11632Lb_Linu',fld:'LB_LINU',pic:'ZZZ9'},{av:'A11633CliUltl',fld:'CLIULTL',pic:'ZZZ9'},{av:'A11701ClimailPr',fld:'CLIMAILPR',pic:''},{av:'A11702CliPerPr',fld:'CLIPERPR',pic:''},{av:'A11761CliUltNPz',fld:'CLIULTNPZ',pic:'ZZZZZZZ9'},{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''},{av:'A10302Dsc_pais',fld:'DSC_PAIS',pic:''},{av:'A11181TpOpD',fld:'TPOPD',pic:''},{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z278CliNif'},{av:'Z279CliNom'},{av:'Z260CliDom'},{av:'Z295CliPob'},{av:'Z256CliCp'},{av:'Z781PrvCod'},{av:'Z303CliTel1'},{av:'Z304CliTel2'},{av:'Z305CliTelex'},{av:'Z274CliFax'},{av:'Z277CliIniVac'},{av:'Z276CliFinVac'},{av:'Z258CliDes'},{av:'Z272CliEti'},{av:'Z306CliUrg'},{av:'Z293CliPer'},{av:'Z298CliRef'},{av:'Z257CliCue'},{av:'Z301CliRieCon'},{av:'Z300CliRieCir'},{av:'Z302CliRieMh'},{av:'Z275CliFecMh'},{av:'Z251CliCanRie'},{av:'Z294CliPerFac'},{av:'Z250CliAlbAgr'},{av:'Z273CliFacCop'},{av:'Z858ZonGeoCod'},{av:'Z1466CliTub'},{av:'Z1901CliCtrl'},{av:'Z1902CliValA'},{av:'Z2748CliAlias'},{av:'Z2843CliEtiEN'},{av:'Z2842CliEtiCN'},{av:'Z2841CliEtiCC'},{av:'Z3091CliDivTra'},{av:'Z3304CliNumEtSa'},{av:'Z3305CliNumEtTi'},{av:'Z3630CliPort'},{av:'Z3631CliTrnCod'},{av:'Z3632CliCopAlb'},{av:'Z3633CliEmail'},{av:'Z3644CliNom1'},{av:'Z4828CliCp2'},{av:'Z5042CliTBon'},{av:'Z5648CliTipo'},{av:'Z5649CliDom2'},{av:'Z6185CliIe'},{av:'Z7064CliUltMq'},{av:'Z8723CliEst'},{av:'Z9852CliP1'},{av:'Z9853CliP0'},{av:'Z9854CliEFx'},{av:'Z9855CliEEm'},{av:'Z9901CliNumC'},{av:'Z10045CliAct'},{av:'Z10046CliEt1'},{av:'Z10047CliEt2'},{av:'Z10048CliEt3'},{av:'Z10049CliEt4'},{av:'Z10050Cliemf'},{av:'Z10301Cod_pais'},{av:'Z11180TpOpC'},{av:'Z11521CodWebId'},{av:'Z11620CliMailGr'},{av:'Z11621CliMailPk'},{av:'Z11622CliMailGrE'},{av:'Z11623CliMailPkE'},{av:'Z3891CliPlanUL'},{av:'Z11632Lb_Linu'},{av:'Z11633CliUltl'},{av:'Z11701ClimailPr'},{av:'Z11702CliPerPr'},{av:'Z11761CliUltNPz'},{av:'Z1360ZonGeoNom'},{av:'Z10302Dsc_pais'},{av:'Z11181TpOpD'},{av:'Z787PrvDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[{av:'A781PrvCod',fld:'PRVCOD',pic:'ZZ9'},{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_PRVCOD",",oparms:[{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIETI","{handler:'valid_Clieti',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIETI",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIURG","{handler:'valid_Cliurg',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIURG",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIALBAGR","{handler:'valid_Clialbagr',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIALBAGR",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_ZONGEOCOD","{handler:'valid_Zongeocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A858ZonGeoCod',fld:'ZONGEOCOD',pic:'ZZ9'},{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_ZONGEOCOD",",oparms:[{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLITUB","{handler:'valid_Clitub',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLITUB",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLICTRL","{handler:'valid_Clictrl',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLICTRL",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIVALA","{handler:'valid_Clivala',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIVALA",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIETIEN","{handler:'valid_Clietien',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIETIEN",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIETICN","{handler:'valid_Clieticn',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIETICN",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIETICC","{handler:'valid_Clieticc',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIETICC",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIPORT","{handler:'valid_Cliport',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIPORT",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLITIPO","{handler:'valid_Clitipo',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLITIPO",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIACT","{handler:'valid_Cliact',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIACT",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIET1","{handler:'valid_Cliet1',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIET1",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIET2","{handler:'valid_Cliet2',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIET2",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_CLIET3","{handler:'valid_Cliet3',iparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_CLIET3",",oparms:[{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_COD_PAIS","{handler:'valid_Cod_pais',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'},{av:'A10302Dsc_pais',fld:'DSC_PAIS',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_COD_PAIS",",oparms:[{av:'A10302Dsc_pais',fld:'DSC_PAIS',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
      setEventMetadata("VALID_TPOPC","{handler:'valid_Tpopc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11180TpOpC',fld:'TPOPC',pic:'ZZZ9'},{av:'A11181TpOpD',fld:'TPOPD',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]");
      setEventMetadata("VALID_TPOPC",",oparms:[{av:'A11181TpOpD',fld:'TPOPD',pic:''},{av:'A250CliAlbAgr',fld:'CLIALBAGR',pic:'@!'},{av:'A1466CliTub',fld:'CLITUB',pic:'@!'},{av:'A1901CliCtrl',fld:'CLICTRL',pic:'@!'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A2843CliEtiEN',fld:'CLIETIEN',pic:'@!'},{av:'A2842CliEtiCN',fld:'CLIETICN',pic:'@!'},{av:'A2841CliEtiCC',fld:'CLIETICC',pic:'@!'},{av:'A9854CliEFx',fld:'CLIEFX',pic:''},{av:'A9855CliEEm',fld:'CLIEEM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'},{av:'A10046CliEt1',fld:'CLIET1',pic:''},{av:'A10047CliEt2',fld:'CLIET2',pic:''},{av:'A10048CliEt3',fld:'CLIET3',pic:''},{av:'A10049CliEt4',fld:'CLIET4',pic:''},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''}]}");
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
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z278CliNif = "" ;
      Z279CliNom = "" ;
      Z260CliDom = "" ;
      Z295CliPob = "" ;
      Z256CliCp = "" ;
      Z303CliTel1 = "" ;
      Z304CliTel2 = "" ;
      Z305CliTelex = "" ;
      Z274CliFax = "" ;
      Z277CliIniVac = "" ;
      Z276CliFinVac = "" ;
      Z258CliDes = "" ;
      Z272CliEti = "" ;
      Z293CliPer = "" ;
      Z298CliRef = "" ;
      Z257CliCue = "" ;
      Z301CliRieCon = DecimalUtil.ZERO ;
      Z300CliRieCir = DecimalUtil.ZERO ;
      Z302CliRieMh = DecimalUtil.ZERO ;
      Z275CliFecMh = GXutil.nullDate() ;
      Z250CliAlbAgr = "" ;
      Z1466CliTub = "" ;
      Z1901CliCtrl = "" ;
      Z1902CliValA = "" ;
      Z2748CliAlias = "" ;
      Z2843CliEtiEN = "" ;
      Z2842CliEtiCN = "" ;
      Z2841CliEtiCC = "" ;
      Z3091CliDivTra = "" ;
      Z3630CliPort = "" ;
      Z3633CliEmail = "" ;
      Z3644CliNom1 = "" ;
      Z4828CliCp2 = "" ;
      Z5042CliTBon = "" ;
      Z5648CliTipo = "" ;
      Z5649CliDom2 = "" ;
      Z6185CliIe = "" ;
      Z8723CliEst = "" ;
      Z9854CliEFx = "" ;
      Z9855CliEEm = "" ;
      Z10045CliAct = "" ;
      Z10046CliEt1 = "" ;
      Z10047CliEt2 = "" ;
      Z10048CliEt3 = "" ;
      Z10049CliEt4 = "" ;
      Z10050Cliemf = "" ;
      Z11521CodWebId = "" ;
      Z11620CliMailGr = "" ;
      Z11621CliMailPk = "" ;
      Z11622CliMailGrE = "" ;
      Z11623CliMailPkE = "" ;
      Z11701ClimailPr = "" ;
      Z11702CliPerPr = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A250CliAlbAgr = "" ;
      A1466CliTub = "" ;
      A1901CliCtrl = "" ;
      A1902CliValA = "" ;
      A2843CliEtiEN = "" ;
      A2842CliEtiCN = "" ;
      A2841CliEtiCC = "" ;
      A3091CliDivTra = "" ;
      A5648CliTipo = "" ;
      A9854CliEFx = "" ;
      A9855CliEEm = "" ;
      A10045CliAct = "" ;
      A10046CliEt1 = "" ;
      A10047CliEt2 = "" ;
      A10048CliEt3 = "" ;
      A10049CliEt4 = "" ;
      A11622CliMailGrE = "" ;
      A11623CliMailPkE = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A278CliNif = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A260CliDom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A295CliPob = "" ;
      lblTextblock7_Jsonclick = "" ;
      A256CliCp = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A787PrvDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A303CliTel1 = "" ;
      lblTextblock11_Jsonclick = "" ;
      A304CliTel2 = "" ;
      lblTextblock12_Jsonclick = "" ;
      A305CliTelex = "" ;
      lblTextblock13_Jsonclick = "" ;
      A274CliFax = "" ;
      lblTextblock14_Jsonclick = "" ;
      A277CliIniVac = "" ;
      lblTextblock15_Jsonclick = "" ;
      A276CliFinVac = "" ;
      lblTextblock16_Jsonclick = "" ;
      A258CliDes = "" ;
      lblTextblock17_Jsonclick = "" ;
      A272CliEti = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A293CliPer = "" ;
      lblTextblock20_Jsonclick = "" ;
      A298CliRef = "" ;
      lblTextblock21_Jsonclick = "" ;
      A257CliCue = "" ;
      lblTextblock22_Jsonclick = "" ;
      A301CliRieCon = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A300CliRieCir = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A302CliRieMh = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      A275CliFecMh = GXutil.nullDate() ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A1360ZonGeoNom = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      A2748CliAlias = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      A3630CliPort = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A3633CliEmail = "" ;
      lblTextblock46_Jsonclick = "" ;
      A3644CliNom1 = "" ;
      lblTextblock47_Jsonclick = "" ;
      A4828CliCp2 = "" ;
      lblTextblock48_Jsonclick = "" ;
      A5042CliTBon = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      A5649CliDom2 = "" ;
      lblTextblock51_Jsonclick = "" ;
      A6185CliIe = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      A8723CliEst = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      lblTextblock60_Jsonclick = "" ;
      lblTextblock61_Jsonclick = "" ;
      lblTextblock62_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock64_Jsonclick = "" ;
      A10050Cliemf = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      A10302Dsc_pais = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      A11181TpOpD = "" ;
      lblTextblock69_Jsonclick = "" ;
      A11521CodWebId = "" ;
      lblTextblock70_Jsonclick = "" ;
      A11620CliMailGr = "" ;
      lblTextblock71_Jsonclick = "" ;
      A11621CliMailPk = "" ;
      lblTextblock72_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock75_Jsonclick = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      A11701ClimailPr = "" ;
      lblTextblock78_Jsonclick = "" ;
      A11702CliPerPr = "" ;
      lblTextblock79_Jsonclick = "" ;
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
      Z787PrvDsc = "" ;
      Z1360ZonGeoNom = "" ;
      Z10302Dsc_pais = "" ;
      Z11181TpOpD = "" ;
      T01HU8_A252CliCod = new int[1] ;
      T01HU8_n252CliCod = new boolean[] {false} ;
      T01HU8_A278CliNif = new String[] {""} ;
      T01HU8_A279CliNom = new String[] {""} ;
      T01HU8_A260CliDom = new String[] {""} ;
      T01HU8_A295CliPob = new String[] {""} ;
      T01HU8_A256CliCp = new String[] {""} ;
      T01HU8_A787PrvDsc = new String[] {""} ;
      T01HU8_n787PrvDsc = new boolean[] {false} ;
      T01HU8_A303CliTel1 = new String[] {""} ;
      T01HU8_A304CliTel2 = new String[] {""} ;
      T01HU8_A305CliTelex = new String[] {""} ;
      T01HU8_A274CliFax = new String[] {""} ;
      T01HU8_A277CliIniVac = new String[] {""} ;
      T01HU8_A276CliFinVac = new String[] {""} ;
      T01HU8_A258CliDes = new String[] {""} ;
      T01HU8_A272CliEti = new String[] {""} ;
      T01HU8_A306CliUrg = new byte[1] ;
      T01HU8_A293CliPer = new String[] {""} ;
      T01HU8_A298CliRef = new String[] {""} ;
      T01HU8_A257CliCue = new String[] {""} ;
      T01HU8_A301CliRieCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU8_A300CliRieCir = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU8_A302CliRieMh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU8_A275CliFecMh = new java.util.Date[] {GXutil.nullDate()} ;
      T01HU8_A251CliCanRie = new byte[1] ;
      T01HU8_A294CliPerFac = new byte[1] ;
      T01HU8_A250CliAlbAgr = new String[] {""} ;
      T01HU8_A273CliFacCop = new byte[1] ;
      T01HU8_A1360ZonGeoNom = new String[] {""} ;
      T01HU8_n1360ZonGeoNom = new boolean[] {false} ;
      T01HU8_A1466CliTub = new String[] {""} ;
      T01HU8_A1901CliCtrl = new String[] {""} ;
      T01HU8_A1902CliValA = new String[] {""} ;
      T01HU8_A2748CliAlias = new String[] {""} ;
      T01HU8_A2843CliEtiEN = new String[] {""} ;
      T01HU8_A2842CliEtiCN = new String[] {""} ;
      T01HU8_A2841CliEtiCC = new String[] {""} ;
      T01HU8_A3091CliDivTra = new String[] {""} ;
      T01HU8_n3091CliDivTra = new boolean[] {false} ;
      T01HU8_A3304CliNumEtSa = new short[1] ;
      T01HU8_A3305CliNumEtTi = new short[1] ;
      T01HU8_A3630CliPort = new String[] {""} ;
      T01HU8_A3631CliTrnCod = new short[1] ;
      T01HU8_A3632CliCopAlb = new byte[1] ;
      T01HU8_A3633CliEmail = new String[] {""} ;
      T01HU8_A3644CliNom1 = new String[] {""} ;
      T01HU8_A4828CliCp2 = new String[] {""} ;
      T01HU8_A5042CliTBon = new String[] {""} ;
      T01HU8_A5648CliTipo = new String[] {""} ;
      T01HU8_A5649CliDom2 = new String[] {""} ;
      T01HU8_A6185CliIe = new String[] {""} ;
      T01HU8_A7064CliUltMq = new short[1] ;
      T01HU8_A8723CliEst = new String[] {""} ;
      T01HU8_A9852CliP1 = new short[1] ;
      T01HU8_A9853CliP0 = new short[1] ;
      T01HU8_A9854CliEFx = new String[] {""} ;
      T01HU8_A9855CliEEm = new String[] {""} ;
      T01HU8_A9901CliNumC = new int[1] ;
      T01HU8_A10045CliAct = new String[] {""} ;
      T01HU8_A10046CliEt1 = new String[] {""} ;
      T01HU8_A10047CliEt2 = new String[] {""} ;
      T01HU8_A10048CliEt3 = new String[] {""} ;
      T01HU8_A10049CliEt4 = new String[] {""} ;
      T01HU8_A10050Cliemf = new String[] {""} ;
      T01HU8_A10302Dsc_pais = new String[] {""} ;
      T01HU8_n10302Dsc_pais = new boolean[] {false} ;
      T01HU8_A11181TpOpD = new String[] {""} ;
      T01HU8_n11181TpOpD = new boolean[] {false} ;
      T01HU8_A11521CodWebId = new String[] {""} ;
      T01HU8_A11620CliMailGr = new String[] {""} ;
      T01HU8_A11621CliMailPk = new String[] {""} ;
      T01HU8_A11622CliMailGrE = new String[] {""} ;
      T01HU8_A11623CliMailPkE = new String[] {""} ;
      T01HU8_A3891CliPlanUL = new short[1] ;
      T01HU8_A11632Lb_Linu = new short[1] ;
      T01HU8_A11633CliUltl = new short[1] ;
      T01HU8_A11701ClimailPr = new String[] {""} ;
      T01HU8_A11702CliPerPr = new String[] {""} ;
      T01HU8_A11761CliUltNPz = new int[1] ;
      T01HU8_A396EmprCod = new String[] {""} ;
      T01HU8_A858ZonGeoCod = new short[1] ;
      T01HU8_A10301Cod_pais = new short[1] ;
      T01HU8_n10301Cod_pais = new boolean[] {false} ;
      T01HU8_A11180TpOpC = new short[1] ;
      T01HU8_n11180TpOpC = new boolean[] {false} ;
      T01HU8_A781PrvCod = new short[1] ;
      T01HU4_A1360ZonGeoNom = new String[] {""} ;
      T01HU4_n1360ZonGeoNom = new boolean[] {false} ;
      T01HU5_A10302Dsc_pais = new String[] {""} ;
      T01HU5_n10302Dsc_pais = new boolean[] {false} ;
      T01HU6_A11181TpOpD = new String[] {""} ;
      T01HU6_n11181TpOpD = new boolean[] {false} ;
      T01HU7_A787PrvDsc = new String[] {""} ;
      T01HU7_n787PrvDsc = new boolean[] {false} ;
      T01HU9_A1360ZonGeoNom = new String[] {""} ;
      T01HU9_n1360ZonGeoNom = new boolean[] {false} ;
      T01HU10_A10302Dsc_pais = new String[] {""} ;
      T01HU10_n10302Dsc_pais = new boolean[] {false} ;
      T01HU11_A11181TpOpD = new String[] {""} ;
      T01HU11_n11181TpOpD = new boolean[] {false} ;
      T01HU12_A787PrvDsc = new String[] {""} ;
      T01HU12_n787PrvDsc = new boolean[] {false} ;
      T01HU13_A396EmprCod = new String[] {""} ;
      T01HU13_A252CliCod = new int[1] ;
      T01HU13_n252CliCod = new boolean[] {false} ;
      T01HU3_A252CliCod = new int[1] ;
      T01HU3_n252CliCod = new boolean[] {false} ;
      T01HU3_A278CliNif = new String[] {""} ;
      T01HU3_A279CliNom = new String[] {""} ;
      T01HU3_A260CliDom = new String[] {""} ;
      T01HU3_A295CliPob = new String[] {""} ;
      T01HU3_A256CliCp = new String[] {""} ;
      T01HU3_A303CliTel1 = new String[] {""} ;
      T01HU3_A304CliTel2 = new String[] {""} ;
      T01HU3_A305CliTelex = new String[] {""} ;
      T01HU3_A274CliFax = new String[] {""} ;
      T01HU3_A277CliIniVac = new String[] {""} ;
      T01HU3_A276CliFinVac = new String[] {""} ;
      T01HU3_A258CliDes = new String[] {""} ;
      T01HU3_A272CliEti = new String[] {""} ;
      T01HU3_A306CliUrg = new byte[1] ;
      T01HU3_A293CliPer = new String[] {""} ;
      T01HU3_A298CliRef = new String[] {""} ;
      T01HU3_A257CliCue = new String[] {""} ;
      T01HU3_A301CliRieCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU3_A300CliRieCir = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU3_A302CliRieMh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU3_A275CliFecMh = new java.util.Date[] {GXutil.nullDate()} ;
      T01HU3_A251CliCanRie = new byte[1] ;
      T01HU3_A294CliPerFac = new byte[1] ;
      T01HU3_A250CliAlbAgr = new String[] {""} ;
      T01HU3_A273CliFacCop = new byte[1] ;
      T01HU3_A1466CliTub = new String[] {""} ;
      T01HU3_A1901CliCtrl = new String[] {""} ;
      T01HU3_A1902CliValA = new String[] {""} ;
      T01HU3_A2748CliAlias = new String[] {""} ;
      T01HU3_A2843CliEtiEN = new String[] {""} ;
      T01HU3_A2842CliEtiCN = new String[] {""} ;
      T01HU3_A2841CliEtiCC = new String[] {""} ;
      T01HU3_A3091CliDivTra = new String[] {""} ;
      T01HU3_n3091CliDivTra = new boolean[] {false} ;
      T01HU3_A3304CliNumEtSa = new short[1] ;
      T01HU3_A3305CliNumEtTi = new short[1] ;
      T01HU3_A3630CliPort = new String[] {""} ;
      T01HU3_A3631CliTrnCod = new short[1] ;
      T01HU3_A3632CliCopAlb = new byte[1] ;
      T01HU3_A3633CliEmail = new String[] {""} ;
      T01HU3_A3644CliNom1 = new String[] {""} ;
      T01HU3_A4828CliCp2 = new String[] {""} ;
      T01HU3_A5042CliTBon = new String[] {""} ;
      T01HU3_A5648CliTipo = new String[] {""} ;
      T01HU3_A5649CliDom2 = new String[] {""} ;
      T01HU3_A6185CliIe = new String[] {""} ;
      T01HU3_A7064CliUltMq = new short[1] ;
      T01HU3_A8723CliEst = new String[] {""} ;
      T01HU3_A9852CliP1 = new short[1] ;
      T01HU3_A9853CliP0 = new short[1] ;
      T01HU3_A9854CliEFx = new String[] {""} ;
      T01HU3_A9855CliEEm = new String[] {""} ;
      T01HU3_A9901CliNumC = new int[1] ;
      T01HU3_A10045CliAct = new String[] {""} ;
      T01HU3_A10046CliEt1 = new String[] {""} ;
      T01HU3_A10047CliEt2 = new String[] {""} ;
      T01HU3_A10048CliEt3 = new String[] {""} ;
      T01HU3_A10049CliEt4 = new String[] {""} ;
      T01HU3_A10050Cliemf = new String[] {""} ;
      T01HU3_A11521CodWebId = new String[] {""} ;
      T01HU3_A11620CliMailGr = new String[] {""} ;
      T01HU3_A11621CliMailPk = new String[] {""} ;
      T01HU3_A11622CliMailGrE = new String[] {""} ;
      T01HU3_A11623CliMailPkE = new String[] {""} ;
      T01HU3_A3891CliPlanUL = new short[1] ;
      T01HU3_A11632Lb_Linu = new short[1] ;
      T01HU3_A11633CliUltl = new short[1] ;
      T01HU3_A11701ClimailPr = new String[] {""} ;
      T01HU3_A11702CliPerPr = new String[] {""} ;
      T01HU3_A11761CliUltNPz = new int[1] ;
      T01HU3_A396EmprCod = new String[] {""} ;
      T01HU3_A858ZonGeoCod = new short[1] ;
      T01HU3_A10301Cod_pais = new short[1] ;
      T01HU3_n10301Cod_pais = new boolean[] {false} ;
      T01HU3_A11180TpOpC = new short[1] ;
      T01HU3_n11180TpOpC = new boolean[] {false} ;
      T01HU3_A781PrvCod = new short[1] ;
      sMode21 = "" ;
      T01HU14_A396EmprCod = new String[] {""} ;
      T01HU14_A252CliCod = new int[1] ;
      T01HU14_n252CliCod = new boolean[] {false} ;
      T01HU15_A396EmprCod = new String[] {""} ;
      T01HU15_A252CliCod = new int[1] ;
      T01HU15_n252CliCod = new boolean[] {false} ;
      T01HU2_A252CliCod = new int[1] ;
      T01HU2_n252CliCod = new boolean[] {false} ;
      T01HU2_A278CliNif = new String[] {""} ;
      T01HU2_A279CliNom = new String[] {""} ;
      T01HU2_A260CliDom = new String[] {""} ;
      T01HU2_A295CliPob = new String[] {""} ;
      T01HU2_A256CliCp = new String[] {""} ;
      T01HU2_A303CliTel1 = new String[] {""} ;
      T01HU2_A304CliTel2 = new String[] {""} ;
      T01HU2_A305CliTelex = new String[] {""} ;
      T01HU2_A274CliFax = new String[] {""} ;
      T01HU2_A277CliIniVac = new String[] {""} ;
      T01HU2_A276CliFinVac = new String[] {""} ;
      T01HU2_A258CliDes = new String[] {""} ;
      T01HU2_A272CliEti = new String[] {""} ;
      T01HU2_A306CliUrg = new byte[1] ;
      T01HU2_A293CliPer = new String[] {""} ;
      T01HU2_A298CliRef = new String[] {""} ;
      T01HU2_A257CliCue = new String[] {""} ;
      T01HU2_A301CliRieCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU2_A300CliRieCir = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU2_A302CliRieMh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU2_A275CliFecMh = new java.util.Date[] {GXutil.nullDate()} ;
      T01HU2_A251CliCanRie = new byte[1] ;
      T01HU2_A294CliPerFac = new byte[1] ;
      T01HU2_A250CliAlbAgr = new String[] {""} ;
      T01HU2_A273CliFacCop = new byte[1] ;
      T01HU2_A1466CliTub = new String[] {""} ;
      T01HU2_A1901CliCtrl = new String[] {""} ;
      T01HU2_A1902CliValA = new String[] {""} ;
      T01HU2_A2748CliAlias = new String[] {""} ;
      T01HU2_A2843CliEtiEN = new String[] {""} ;
      T01HU2_A2842CliEtiCN = new String[] {""} ;
      T01HU2_A2841CliEtiCC = new String[] {""} ;
      T01HU2_A3091CliDivTra = new String[] {""} ;
      T01HU2_n3091CliDivTra = new boolean[] {false} ;
      T01HU2_A3304CliNumEtSa = new short[1] ;
      T01HU2_A3305CliNumEtTi = new short[1] ;
      T01HU2_A3630CliPort = new String[] {""} ;
      T01HU2_A3631CliTrnCod = new short[1] ;
      T01HU2_A3632CliCopAlb = new byte[1] ;
      T01HU2_A3633CliEmail = new String[] {""} ;
      T01HU2_A3644CliNom1 = new String[] {""} ;
      T01HU2_A4828CliCp2 = new String[] {""} ;
      T01HU2_A5042CliTBon = new String[] {""} ;
      T01HU2_A5648CliTipo = new String[] {""} ;
      T01HU2_A5649CliDom2 = new String[] {""} ;
      T01HU2_A6185CliIe = new String[] {""} ;
      T01HU2_A7064CliUltMq = new short[1] ;
      T01HU2_A8723CliEst = new String[] {""} ;
      T01HU2_A9852CliP1 = new short[1] ;
      T01HU2_A9853CliP0 = new short[1] ;
      T01HU2_A9854CliEFx = new String[] {""} ;
      T01HU2_A9855CliEEm = new String[] {""} ;
      T01HU2_A9901CliNumC = new int[1] ;
      T01HU2_A10045CliAct = new String[] {""} ;
      T01HU2_A10046CliEt1 = new String[] {""} ;
      T01HU2_A10047CliEt2 = new String[] {""} ;
      T01HU2_A10048CliEt3 = new String[] {""} ;
      T01HU2_A10049CliEt4 = new String[] {""} ;
      T01HU2_A10050Cliemf = new String[] {""} ;
      T01HU2_A11521CodWebId = new String[] {""} ;
      T01HU2_A11620CliMailGr = new String[] {""} ;
      T01HU2_A11621CliMailPk = new String[] {""} ;
      T01HU2_A11622CliMailGrE = new String[] {""} ;
      T01HU2_A11623CliMailPkE = new String[] {""} ;
      T01HU2_A3891CliPlanUL = new short[1] ;
      T01HU2_A11632Lb_Linu = new short[1] ;
      T01HU2_A11633CliUltl = new short[1] ;
      T01HU2_A11701ClimailPr = new String[] {""} ;
      T01HU2_A11702CliPerPr = new String[] {""} ;
      T01HU2_A11761CliUltNPz = new int[1] ;
      T01HU2_A396EmprCod = new String[] {""} ;
      T01HU2_A858ZonGeoCod = new short[1] ;
      T01HU2_A10301Cod_pais = new short[1] ;
      T01HU2_n10301Cod_pais = new boolean[] {false} ;
      T01HU2_A11180TpOpC = new short[1] ;
      T01HU2_n11180TpOpC = new boolean[] {false} ;
      T01HU2_A781PrvCod = new short[1] ;
      T01HU19_A787PrvDsc = new String[] {""} ;
      T01HU19_n787PrvDsc = new boolean[] {false} ;
      T01HU20_A1360ZonGeoNom = new String[] {""} ;
      T01HU20_n1360ZonGeoNom = new boolean[] {false} ;
      T01HU21_A10302Dsc_pais = new String[] {""} ;
      T01HU21_n10302Dsc_pais = new boolean[] {false} ;
      T01HU22_A11181TpOpD = new String[] {""} ;
      T01HU22_n11181TpOpD = new boolean[] {false} ;
      T01HU23_A396EmprCod = new String[] {""} ;
      T01HU23_A252CliCod = new int[1] ;
      T01HU23_n252CliCod = new boolean[] {false} ;
      T01HU23_A6930Lb_rclin = new int[1] ;
      T01HU24_A396EmprCod = new String[] {""} ;
      T01HU24_A6850Tex_NPed = new int[1] ;
      T01HU25_A396EmprCod = new String[] {""} ;
      T01HU25_A252CliCod = new int[1] ;
      T01HU25_n252CliCod = new boolean[] {false} ;
      T01HU25_A829TipArtCod = new short[1] ;
      T01HU25_A831TipColCod = new byte[1] ;
      T01HU25_A583IntCod = new byte[1] ;
      T01HU25_A5098TipDisCod = new String[] {""} ;
      T01HU25_A6603Est1_anyo = new short[1] ;
      T01HU25_A6604Est1_mes = new byte[1] ;
      T01HU25_A6605Est1_dia = new byte[1] ;
      T01HU26_A396EmprCod = new String[] {""} ;
      T01HU26_A6319C_Barcod = new int[1] ;
      T01HU26_A6320C_Barcodre = new byte[1] ;
      T01HU26_A6321C_Barcodpa = new String[] {""} ;
      T01HU26_A6322C_Reclinma = new short[1] ;
      T01HU27_A396EmprCod = new String[] {""} ;
      T01HU27_A6235DevEmpCod = new int[1] ;
      T01HU28_A396EmprCod = new String[] {""} ;
      T01HU28_A602MaqCod = new String[] {""} ;
      T01HU28_A6078MaqCliCod = new int[1] ;
      T01HU28_A6079MaqArtCod = new String[] {""} ;
      T01HU29_A396EmprCod = new String[] {""} ;
      T01HU29_A5532Lb_numero = new int[1] ;
      T01HU30_A396EmprCod = new String[] {""} ;
      T01HU30_A252CliCod = new int[1] ;
      T01HU30_n252CliCod = new boolean[] {false} ;
      T01HU30_A5503CliifLin = new short[1] ;
      T01HU31_A396EmprCod = new String[] {""} ;
      T01HU31_A252CliCod = new int[1] ;
      T01HU31_n252CliCod = new boolean[] {false} ;
      T01HU31_A5499ClieiLin = new short[1] ;
      T01HU32_A396EmprCod = new String[] {""} ;
      T01HU32_A252CliCod = new int[1] ;
      T01HU32_n252CliCod = new boolean[] {false} ;
      T01HU32_A5495ClidtLin = new short[1] ;
      T01HU33_A396EmprCod = new String[] {""} ;
      T01HU33_A252CliCod = new int[1] ;
      T01HU33_n252CliCod = new boolean[] {false} ;
      T01HU33_A5491CliedLin = new short[1] ;
      T01HU34_A396EmprCod = new String[] {""} ;
      T01HU34_A252CliCod = new int[1] ;
      T01HU34_n252CliCod = new boolean[] {false} ;
      T01HU34_A5452P_ForCod = new String[] {""} ;
      T01HU35_A396EmprCod = new String[] {""} ;
      T01HU35_A252CliCod = new int[1] ;
      T01HU35_n252CliCod = new boolean[] {false} ;
      T01HU35_A5443Mdl_Cod = new String[] {""} ;
      T01HU36_A396EmprCod = new String[] {""} ;
      T01HU36_A252CliCod = new int[1] ;
      T01HU36_n252CliCod = new boolean[] {false} ;
      T01HU36_A5436IntCodF2 = new short[1] ;
      T01HU37_A396EmprCod = new String[] {""} ;
      T01HU37_A252CliCod = new int[1] ;
      T01HU37_n252CliCod = new boolean[] {false} ;
      T01HU37_A5396IntCodFC = new byte[1] ;
      T01HU37_A5434Tip_ColC = new byte[1] ;
      T01HU38_A396EmprCod = new String[] {""} ;
      T01HU38_A252CliCod = new int[1] ;
      T01HU38_n252CliCod = new boolean[] {false} ;
      T01HU38_A5428FasPreCod = new String[] {""} ;
      T01HU39_A396EmprCod = new String[] {""} ;
      T01HU39_A252CliCod = new int[1] ;
      T01HU39_n252CliCod = new boolean[] {false} ;
      T01HU39_A5398Cli_Proc = new String[] {""} ;
      T01HU40_A396EmprCod = new String[] {""} ;
      T01HU40_A5130PagIden = new int[1] ;
      T01HU41_A396EmprCod = new String[] {""} ;
      T01HU41_A5059Hl_hdr = new int[1] ;
      T01HU41_A5060Hl_hdrr = new byte[1] ;
      T01HU41_A5061Hl_hdrp = new String[] {""} ;
      T01HU42_A396EmprCod = new String[] {""} ;
      T01HU42_A252CliCod = new int[1] ;
      T01HU42_n252CliCod = new boolean[] {false} ;
      T01HU42_A4718DishCod = new String[] {""} ;
      T01HU42_A5020TipEstCod = new byte[1] ;
      T01HU42_A5022GraCod = new byte[1] ;
      T01HU43_A396EmprCod = new String[] {""} ;
      T01HU43_A4618EnsLCod = new int[1] ;
      T01HU44_A396EmprCod = new String[] {""} ;
      T01HU44_A4492HreBarCod = new int[1] ;
      T01HU44_A4493HreBarReo = new byte[1] ;
      T01HU44_A4494HreBarPar = new String[] {""} ;
      T01HU44_A4495HreNumCie = new byte[1] ;
      T01HU45_A396EmprCod = new String[] {""} ;
      T01HU45_A252CliCod = new int[1] ;
      T01HU45_n252CliCod = new boolean[] {false} ;
      T01HU45_A4415EstCol = new String[] {""} ;
      T01HU46_A396EmprCod = new String[] {""} ;
      T01HU46_A4185WEBUSU = new String[] {""} ;
      T01HU47_A396EmprCod = new String[] {""} ;
      T01HU47_A252CliCod = new int[1] ;
      T01HU47_n252CliCod = new boolean[] {false} ;
      T01HU47_A4079WEBDISCOD = new String[] {""} ;
      T01HU47_A4078EMPCOD = new String[] {""} ;
      T01HU48_A396EmprCod = new String[] {""} ;
      T01HU48_A2637HisEstHRu = new int[1] ;
      T01HU48_A2636HisEstHRe = new byte[1] ;
      T01HU48_A2635HisEstHPa = new String[] {""} ;
      T01HU48_A2638HisEstLCo = new byte[1] ;
      T01HU48_A2630HisEstCom = new String[] {""} ;
      T01HU48_A2634HisEstFon = new String[] {""} ;
      T01HU49_A396EmprCod = new String[] {""} ;
      T01HU49_A2574GrpDibCod = new int[1] ;
      T01HU50_A396EmprCod = new String[] {""} ;
      T01HU50_A2558GrmDibCod = new int[1] ;
      T01HU51_A396EmprCod = new String[] {""} ;
      T01HU51_A2542GrcDibCod = new int[1] ;
      T01HU52_A396EmprCod = new String[] {""} ;
      T01HU52_A1031EmpesCod = new String[] {""} ;
      T01HU52_A252CliCod = new int[1] ;
      T01HU52_n252CliCod = new boolean[] {false} ;
      T01HU52_A1032FonCod = new String[] {""} ;
      T01HU53_A396EmprCod = new String[] {""} ;
      T01HU53_A1013DibCli = new String[] {""} ;
      T01HU53_A252CliCod = new int[1] ;
      T01HU53_n252CliCod = new boolean[] {false} ;
      T01HU53_A1014DibInt = new int[1] ;
      T01HU54_A396EmprCod = new String[] {""} ;
      T01HU54_A1736AlbExtCod = new long[1] ;
      T01HU55_A396EmprCod = new String[] {""} ;
      T01HU55_A252CliCod = new int[1] ;
      T01HU55_n252CliCod = new boolean[] {false} ;
      T01HU55_A3661FacProAny = new short[1] ;
      T01HU55_A3662FacProSer = new String[] {""} ;
      T01HU55_A3663FacProInt = new byte[1] ;
      T01HU55_A3664FacProTip = new byte[1] ;
      T01HU55_A3665FacProTar = new short[1] ;
      T01HU56_A396EmprCod = new String[] {""} ;
      T01HU56_A3646EstTinAny = new short[1] ;
      T01HU56_A3647EstTinMes = new byte[1] ;
      T01HU56_A3648EstTinDia = new byte[1] ;
      T01HU56_A1929EstTinNr = new short[1] ;
      T01HU57_A396EmprCod = new String[] {""} ;
      T01HU57_A3617AlbTrnCod = new long[1] ;
      T01HU58_A396EmprCod = new String[] {""} ;
      T01HU58_A252CliCod = new int[1] ;
      T01HU58_n252CliCod = new boolean[] {false} ;
      T01HU58_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HU59_A396EmprCod = new String[] {""} ;
      T01HU59_A3073RepCod = new String[] {""} ;
      T01HU59_A252CliCod = new int[1] ;
      T01HU59_n252CliCod = new boolean[] {false} ;
      T01HU60_A396EmprCod = new String[] {""} ;
      T01HU60_A3061Codia = new byte[1] ;
      T01HU60_A3062CoMes = new byte[1] ;
      T01HU60_A3063CoAny = new short[1] ;
      T01HU60_A3065CoLin = new byte[1] ;
      T01HU60_A3010CoBarCod = new int[1] ;
      T01HU60_A3011CoBarReo = new byte[1] ;
      T01HU60_A3012CoBarPar = new String[] {""} ;
      T01HU61_A396EmprCod = new String[] {""} ;
      T01HU61_A2971SabFacCod = new int[1] ;
      T01HU62_A396EmprCod = new String[] {""} ;
      T01HU62_A2954TiDia = new byte[1] ;
      T01HU62_A2955TiMes = new byte[1] ;
      T01HU62_A2956TiAny = new short[1] ;
      T01HU62_A2958TiLin = new byte[1] ;
      T01HU62_A2959TiBarCod = new int[1] ;
      T01HU62_A2960TiBarReo = new byte[1] ;
      T01HU62_A2961TiBarPar = new String[] {""} ;
      T01HU63_A396EmprCod = new String[] {""} ;
      T01HU63_A252CliCod = new int[1] ;
      T01HU63_n252CliCod = new boolean[] {false} ;
      T01HU63_A2933RecTipCon = new short[1] ;
      T01HU64_A396EmprCod = new String[] {""} ;
      T01HU64_A252CliCod = new int[1] ;
      T01HU64_n252CliCod = new boolean[] {false} ;
      T01HU64_A2927RecProCod = new String[] {""} ;
      T01HU65_A396EmprCod = new String[] {""} ;
      T01HU65_A252CliCod = new int[1] ;
      T01HU65_n252CliCod = new boolean[] {false} ;
      T01HU65_A2891HMaForSer = new String[] {""} ;
      T01HU65_A2892HMaForCNom = new String[] {""} ;
      T01HU65_A2893HMaForCNum = new int[1] ;
      T01HU65_A2894HMaTipCCod = new byte[1] ;
      T01HU65_A2895HMaForNumC = new int[1] ;
      T01HU65_A2897HMaColLin = new short[1] ;
      T01HU65_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01HU65_A2907HmaLin = new short[1] ;
      T01HU66_A396EmprCod = new String[] {""} ;
      T01HU66_A252CliCod = new int[1] ;
      T01HU66_n252CliCod = new boolean[] {false} ;
      T01HU66_A425EstAny = new short[1] ;
      T01HU66_A2755EstSerFac = new String[] {""} ;
      T01HU67_A396EmprCod = new String[] {""} ;
      T01HU67_A2730RecTipCo = new short[1] ;
      T01HU67_A252CliCod = new int[1] ;
      T01HU67_n252CliCod = new boolean[] {false} ;
      T01HU68_A396EmprCod = new String[] {""} ;
      T01HU68_A2720TarSec = new String[] {""} ;
      T01HU68_A252CliCod = new int[1] ;
      T01HU68_n252CliCod = new boolean[] {false} ;
      T01HU68_A829TipArtCod = new short[1] ;
      T01HU68_A831TipColCod = new byte[1] ;
      T01HU69_A396EmprCod = new String[] {""} ;
      T01HU69_A2382AbcTerCod = new String[] {""} ;
      T01HU69_A2381AbcSec = new String[] {""} ;
      T01HU69_A252CliCod = new int[1] ;
      T01HU69_n252CliCod = new boolean[] {false} ;
      T01HU70_A396EmprCod = new String[] {""} ;
      T01HU70_A252CliCod = new int[1] ;
      T01HU70_n252CliCod = new boolean[] {false} ;
      T01HU70_A2308CliDesCod = new int[1] ;
      T01HU71_A396EmprCod = new String[] {""} ;
      T01HU71_A2268MovParCod = new String[] {""} ;
      T01HU71_A252CliCod = new int[1] ;
      T01HU71_n252CliCod = new boolean[] {false} ;
      T01HU72_A396EmprCod = new String[] {""} ;
      T01HU72_A966PartCod = new String[] {""} ;
      T01HU72_A252CliCod = new int[1] ;
      T01HU72_n252CliCod = new boolean[] {false} ;
      T01HU73_A396EmprCod = new String[] {""} ;
      T01HU73_A1387AlbPrvCod = new int[1] ;
      T01HU74_A396EmprCod = new String[] {""} ;
      T01HU74_A252CliCod = new int[1] ;
      T01HU74_n252CliCod = new boolean[] {false} ;
      T01HU74_A1213TalCod = new String[] {""} ;
      T01HU75_A396EmprCod = new String[] {""} ;
      T01HU75_A252CliCod = new int[1] ;
      T01HU75_n252CliCod = new boolean[] {false} ;
      T01HU75_A457FasCod = new String[] {""} ;
      T01HU76_A396EmprCod = new String[] {""} ;
      T01HU76_A539HisBarCod = new int[1] ;
      T01HU76_A545HisCodReo = new byte[1] ;
      T01HU76_A544HisCodPar = new String[] {""} ;
      T01HU76_A833TipDefCod = new short[1] ;
      T01HU77_A396EmprCod = new String[] {""} ;
      T01HU77_A506HbaBarCod = new int[1] ;
      T01HU77_A508HbaBarReo = new byte[1] ;
      T01HU77_A507HbaBarPar = new String[] {""} ;
      T01HU78_A396EmprCod = new String[] {""} ;
      T01HU78_A252CliCod = new int[1] ;
      T01HU78_n252CliCod = new boolean[] {false} ;
      T01HU78_A494ForSer = new String[] {""} ;
      T01HU78_A482ForColNom = new String[] {""} ;
      T01HU78_A483ForColNum = new int[1] ;
      T01HU78_A831TipColCod = new byte[1] ;
      T01HU79_A396EmprCod = new String[] {""} ;
      T01HU79_A252CliCod = new int[1] ;
      T01HU79_n252CliCod = new boolean[] {false} ;
      T01HU79_A287CliPagLin = new byte[1] ;
      T01HU80_A396EmprCod = new String[] {""} ;
      T01HU80_A252CliCod = new int[1] ;
      T01HU80_n252CliCod = new boolean[] {false} ;
      T01HU80_A266CliEnvLin = new byte[1] ;
      T01HU81_A396EmprCod = new String[] {""} ;
      T01HU81_A252CliCod = new int[1] ;
      T01HU81_n252CliCod = new boolean[] {false} ;
      T01HU81_A65ArtCod = new String[] {""} ;
      T01HU82_A396EmprCod = new String[] {""} ;
      T01HU82_A44AlbRecCod = new int[1] ;
      T01HU83_A396EmprCod = new String[] {""} ;
      T01HU83_A30AlbProCod = new long[1] ;
      T01HU84_A396EmprCod = new String[] {""} ;
      T01HU84_A14AlbComCod = new int[1] ;
      T01HU85_A396EmprCod = new String[] {""} ;
      T01HU85_A252CliCod = new int[1] ;
      T01HU85_n252CliCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ278CliNif = "" ;
      ZZ279CliNom = "" ;
      ZZ260CliDom = "" ;
      ZZ295CliPob = "" ;
      ZZ256CliCp = "" ;
      ZZ303CliTel1 = "" ;
      ZZ304CliTel2 = "" ;
      ZZ305CliTelex = "" ;
      ZZ274CliFax = "" ;
      ZZ277CliIniVac = "" ;
      ZZ276CliFinVac = "" ;
      ZZ258CliDes = "" ;
      ZZ272CliEti = "" ;
      ZZ293CliPer = "" ;
      ZZ298CliRef = "" ;
      ZZ257CliCue = "" ;
      ZZ301CliRieCon = DecimalUtil.ZERO ;
      ZZ300CliRieCir = DecimalUtil.ZERO ;
      ZZ302CliRieMh = DecimalUtil.ZERO ;
      ZZ275CliFecMh = GXutil.nullDate() ;
      ZZ250CliAlbAgr = "" ;
      ZZ1466CliTub = "" ;
      ZZ1901CliCtrl = "" ;
      ZZ1902CliValA = "" ;
      ZZ2748CliAlias = "" ;
      ZZ2843CliEtiEN = "" ;
      ZZ2842CliEtiCN = "" ;
      ZZ2841CliEtiCC = "" ;
      ZZ3091CliDivTra = "" ;
      ZZ3630CliPort = "" ;
      ZZ3633CliEmail = "" ;
      ZZ3644CliNom1 = "" ;
      ZZ4828CliCp2 = "" ;
      ZZ5042CliTBon = "" ;
      ZZ5648CliTipo = "" ;
      ZZ5649CliDom2 = "" ;
      ZZ6185CliIe = "" ;
      ZZ8723CliEst = "" ;
      ZZ9854CliEFx = "" ;
      ZZ9855CliEEm = "" ;
      ZZ10045CliAct = "" ;
      ZZ10046CliEt1 = "" ;
      ZZ10047CliEt2 = "" ;
      ZZ10048CliEt3 = "" ;
      ZZ10049CliEt4 = "" ;
      ZZ10050Cliemf = "" ;
      ZZ11521CodWebId = "" ;
      ZZ11620CliMailGr = "" ;
      ZZ11621CliMailPk = "" ;
      ZZ11622CliMailGrE = "" ;
      ZZ11623CliMailPkE = "" ;
      ZZ11701ClimailPr = "" ;
      ZZ11702CliPerPr = "" ;
      ZZ1360ZonGeoNom = "" ;
      ZZ10302Dsc_pais = "" ;
      ZZ11181TpOpD = "" ;
      ZZ787PrvDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrclient__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrclient__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrclient__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrclient__default(),
         new Object[] {
             new Object[] {
            T01HU2_A252CliCod, T01HU2_A278CliNif, T01HU2_A279CliNom, T01HU2_A260CliDom, T01HU2_A295CliPob, T01HU2_A256CliCp, T01HU2_A303CliTel1, T01HU2_A304CliTel2, T01HU2_A305CliTelex, T01HU2_A274CliFax,
            T01HU2_A277CliIniVac, T01HU2_A276CliFinVac, T01HU2_A258CliDes, T01HU2_A272CliEti, T01HU2_A306CliUrg, T01HU2_A293CliPer, T01HU2_A298CliRef, T01HU2_A257CliCue, T01HU2_A301CliRieCon, T01HU2_A300CliRieCir,
            T01HU2_A302CliRieMh, T01HU2_A275CliFecMh, T01HU2_A251CliCanRie, T01HU2_A294CliPerFac, T01HU2_A250CliAlbAgr, T01HU2_A273CliFacCop, T01HU2_A1466CliTub, T01HU2_A1901CliCtrl, T01HU2_A1902CliValA, T01HU2_A2748CliAlias,
            T01HU2_A2843CliEtiEN, T01HU2_A2842CliEtiCN, T01HU2_A2841CliEtiCC, T01HU2_A3091CliDivTra, T01HU2_n3091CliDivTra, T01HU2_A3304CliNumEtSa, T01HU2_A3305CliNumEtTi, T01HU2_A3630CliPort, T01HU2_A3631CliTrnCod, T01HU2_A3632CliCopAlb,
            T01HU2_A3633CliEmail, T01HU2_A3644CliNom1, T01HU2_A4828CliCp2, T01HU2_A5042CliTBon, T01HU2_A5648CliTipo, T01HU2_A5649CliDom2, T01HU2_A6185CliIe, T01HU2_A7064CliUltMq, T01HU2_A8723CliEst, T01HU2_A9852CliP1,
            T01HU2_A9853CliP0, T01HU2_A9854CliEFx, T01HU2_A9855CliEEm, T01HU2_A9901CliNumC, T01HU2_A10045CliAct, T01HU2_A10046CliEt1, T01HU2_A10047CliEt2, T01HU2_A10048CliEt3, T01HU2_A10049CliEt4, T01HU2_A10050Cliemf,
            T01HU2_A11521CodWebId, T01HU2_A11620CliMailGr, T01HU2_A11621CliMailPk, T01HU2_A11622CliMailGrE, T01HU2_A11623CliMailPkE, T01HU2_A3891CliPlanUL, T01HU2_A11632Lb_Linu, T01HU2_A11633CliUltl, T01HU2_A11701ClimailPr, T01HU2_A11702CliPerPr,
            T01HU2_A11761CliUltNPz, T01HU2_A396EmprCod, T01HU2_A858ZonGeoCod, T01HU2_A10301Cod_pais, T01HU2_n10301Cod_pais, T01HU2_A11180TpOpC, T01HU2_n11180TpOpC, T01HU2_A781PrvCod
            }
            , new Object[] {
            T01HU3_A252CliCod, T01HU3_A278CliNif, T01HU3_A279CliNom, T01HU3_A260CliDom, T01HU3_A295CliPob, T01HU3_A256CliCp, T01HU3_A303CliTel1, T01HU3_A304CliTel2, T01HU3_A305CliTelex, T01HU3_A274CliFax,
            T01HU3_A277CliIniVac, T01HU3_A276CliFinVac, T01HU3_A258CliDes, T01HU3_A272CliEti, T01HU3_A306CliUrg, T01HU3_A293CliPer, T01HU3_A298CliRef, T01HU3_A257CliCue, T01HU3_A301CliRieCon, T01HU3_A300CliRieCir,
            T01HU3_A302CliRieMh, T01HU3_A275CliFecMh, T01HU3_A251CliCanRie, T01HU3_A294CliPerFac, T01HU3_A250CliAlbAgr, T01HU3_A273CliFacCop, T01HU3_A1466CliTub, T01HU3_A1901CliCtrl, T01HU3_A1902CliValA, T01HU3_A2748CliAlias,
            T01HU3_A2843CliEtiEN, T01HU3_A2842CliEtiCN, T01HU3_A2841CliEtiCC, T01HU3_A3091CliDivTra, T01HU3_n3091CliDivTra, T01HU3_A3304CliNumEtSa, T01HU3_A3305CliNumEtTi, T01HU3_A3630CliPort, T01HU3_A3631CliTrnCod, T01HU3_A3632CliCopAlb,
            T01HU3_A3633CliEmail, T01HU3_A3644CliNom1, T01HU3_A4828CliCp2, T01HU3_A5042CliTBon, T01HU3_A5648CliTipo, T01HU3_A5649CliDom2, T01HU3_A6185CliIe, T01HU3_A7064CliUltMq, T01HU3_A8723CliEst, T01HU3_A9852CliP1,
            T01HU3_A9853CliP0, T01HU3_A9854CliEFx, T01HU3_A9855CliEEm, T01HU3_A9901CliNumC, T01HU3_A10045CliAct, T01HU3_A10046CliEt1, T01HU3_A10047CliEt2, T01HU3_A10048CliEt3, T01HU3_A10049CliEt4, T01HU3_A10050Cliemf,
            T01HU3_A11521CodWebId, T01HU3_A11620CliMailGr, T01HU3_A11621CliMailPk, T01HU3_A11622CliMailGrE, T01HU3_A11623CliMailPkE, T01HU3_A3891CliPlanUL, T01HU3_A11632Lb_Linu, T01HU3_A11633CliUltl, T01HU3_A11701ClimailPr, T01HU3_A11702CliPerPr,
            T01HU3_A11761CliUltNPz, T01HU3_A396EmprCod, T01HU3_A858ZonGeoCod, T01HU3_A10301Cod_pais, T01HU3_n10301Cod_pais, T01HU3_A11180TpOpC, T01HU3_n11180TpOpC, T01HU3_A781PrvCod
            }
            , new Object[] {
            T01HU4_A1360ZonGeoNom, T01HU4_n1360ZonGeoNom
            }
            , new Object[] {
            T01HU5_A10302Dsc_pais, T01HU5_n10302Dsc_pais
            }
            , new Object[] {
            T01HU6_A11181TpOpD, T01HU6_n11181TpOpD
            }
            , new Object[] {
            T01HU7_A787PrvDsc, T01HU7_n787PrvDsc
            }
            , new Object[] {
            T01HU8_A252CliCod, T01HU8_A278CliNif, T01HU8_A279CliNom, T01HU8_A260CliDom, T01HU8_A295CliPob, T01HU8_A256CliCp, T01HU8_A787PrvDsc, T01HU8_n787PrvDsc, T01HU8_A303CliTel1, T01HU8_A304CliTel2,
            T01HU8_A305CliTelex, T01HU8_A274CliFax, T01HU8_A277CliIniVac, T01HU8_A276CliFinVac, T01HU8_A258CliDes, T01HU8_A272CliEti, T01HU8_A306CliUrg, T01HU8_A293CliPer, T01HU8_A298CliRef, T01HU8_A257CliCue,
            T01HU8_A301CliRieCon, T01HU8_A300CliRieCir, T01HU8_A302CliRieMh, T01HU8_A275CliFecMh, T01HU8_A251CliCanRie, T01HU8_A294CliPerFac, T01HU8_A250CliAlbAgr, T01HU8_A273CliFacCop, T01HU8_A1360ZonGeoNom, T01HU8_n1360ZonGeoNom,
            T01HU8_A1466CliTub, T01HU8_A1901CliCtrl, T01HU8_A1902CliValA, T01HU8_A2748CliAlias, T01HU8_A2843CliEtiEN, T01HU8_A2842CliEtiCN, T01HU8_A2841CliEtiCC, T01HU8_A3091CliDivTra, T01HU8_n3091CliDivTra, T01HU8_A3304CliNumEtSa,
            T01HU8_A3305CliNumEtTi, T01HU8_A3630CliPort, T01HU8_A3631CliTrnCod, T01HU8_A3632CliCopAlb, T01HU8_A3633CliEmail, T01HU8_A3644CliNom1, T01HU8_A4828CliCp2, T01HU8_A5042CliTBon, T01HU8_A5648CliTipo, T01HU8_A5649CliDom2,
            T01HU8_A6185CliIe, T01HU8_A7064CliUltMq, T01HU8_A8723CliEst, T01HU8_A9852CliP1, T01HU8_A9853CliP0, T01HU8_A9854CliEFx, T01HU8_A9855CliEEm, T01HU8_A9901CliNumC, T01HU8_A10045CliAct, T01HU8_A10046CliEt1,
            T01HU8_A10047CliEt2, T01HU8_A10048CliEt3, T01HU8_A10049CliEt4, T01HU8_A10050Cliemf, T01HU8_A10302Dsc_pais, T01HU8_n10302Dsc_pais, T01HU8_A11181TpOpD, T01HU8_n11181TpOpD, T01HU8_A11521CodWebId, T01HU8_A11620CliMailGr,
            T01HU8_A11621CliMailPk, T01HU8_A11622CliMailGrE, T01HU8_A11623CliMailPkE, T01HU8_A3891CliPlanUL, T01HU8_A11632Lb_Linu, T01HU8_A11633CliUltl, T01HU8_A11701ClimailPr, T01HU8_A11702CliPerPr, T01HU8_A11761CliUltNPz, T01HU8_A396EmprCod,
            T01HU8_A858ZonGeoCod, T01HU8_A10301Cod_pais, T01HU8_n10301Cod_pais, T01HU8_A11180TpOpC, T01HU8_n11180TpOpC, T01HU8_A781PrvCod
            }
            , new Object[] {
            T01HU9_A1360ZonGeoNom, T01HU9_n1360ZonGeoNom
            }
            , new Object[] {
            T01HU10_A10302Dsc_pais, T01HU10_n10302Dsc_pais
            }
            , new Object[] {
            T01HU11_A11181TpOpD, T01HU11_n11181TpOpD
            }
            , new Object[] {
            T01HU12_A787PrvDsc, T01HU12_n787PrvDsc
            }
            , new Object[] {
            T01HU13_A396EmprCod, T01HU13_A252CliCod
            }
            , new Object[] {
            T01HU14_A396EmprCod, T01HU14_A252CliCod
            }
            , new Object[] {
            T01HU15_A396EmprCod, T01HU15_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HU19_A787PrvDsc, T01HU19_n787PrvDsc
            }
            , new Object[] {
            T01HU20_A1360ZonGeoNom, T01HU20_n1360ZonGeoNom
            }
            , new Object[] {
            T01HU21_A10302Dsc_pais, T01HU21_n10302Dsc_pais
            }
            , new Object[] {
            T01HU22_A11181TpOpD, T01HU22_n11181TpOpD
            }
            , new Object[] {
            T01HU23_A396EmprCod, T01HU23_A252CliCod, T01HU23_A6930Lb_rclin
            }
            , new Object[] {
            T01HU24_A396EmprCod, T01HU24_A6850Tex_NPed
            }
            , new Object[] {
            T01HU25_A396EmprCod, T01HU25_A252CliCod, T01HU25_A829TipArtCod, T01HU25_A831TipColCod, T01HU25_A583IntCod, T01HU25_A5098TipDisCod, T01HU25_A6603Est1_anyo, T01HU25_A6604Est1_mes, T01HU25_A6605Est1_dia
            }
            , new Object[] {
            T01HU26_A396EmprCod, T01HU26_A6319C_Barcod, T01HU26_A6320C_Barcodre, T01HU26_A6321C_Barcodpa, T01HU26_A6322C_Reclinma
            }
            , new Object[] {
            T01HU27_A396EmprCod, T01HU27_A6235DevEmpCod
            }
            , new Object[] {
            T01HU28_A396EmprCod, T01HU28_A602MaqCod, T01HU28_A6078MaqCliCod, T01HU28_A6079MaqArtCod
            }
            , new Object[] {
            T01HU29_A396EmprCod, T01HU29_A5532Lb_numero
            }
            , new Object[] {
            T01HU30_A396EmprCod, T01HU30_A252CliCod, T01HU30_A5503CliifLin
            }
            , new Object[] {
            T01HU31_A396EmprCod, T01HU31_A252CliCod, T01HU31_A5499ClieiLin
            }
            , new Object[] {
            T01HU32_A396EmprCod, T01HU32_A252CliCod, T01HU32_A5495ClidtLin
            }
            , new Object[] {
            T01HU33_A396EmprCod, T01HU33_A252CliCod, T01HU33_A5491CliedLin
            }
            , new Object[] {
            T01HU34_A396EmprCod, T01HU34_A252CliCod, T01HU34_A5452P_ForCod
            }
            , new Object[] {
            T01HU35_A396EmprCod, T01HU35_A252CliCod, T01HU35_A5443Mdl_Cod
            }
            , new Object[] {
            T01HU36_A396EmprCod, T01HU36_A252CliCod, T01HU36_A5436IntCodF2
            }
            , new Object[] {
            T01HU37_A396EmprCod, T01HU37_A252CliCod, T01HU37_A5396IntCodFC, T01HU37_A5434Tip_ColC
            }
            , new Object[] {
            T01HU38_A396EmprCod, T01HU38_A252CliCod, T01HU38_A5428FasPreCod
            }
            , new Object[] {
            T01HU39_A396EmprCod, T01HU39_A252CliCod, T01HU39_A5398Cli_Proc
            }
            , new Object[] {
            T01HU40_A396EmprCod, T01HU40_A5130PagIden
            }
            , new Object[] {
            T01HU41_A396EmprCod, T01HU41_A5059Hl_hdr, T01HU41_A5060Hl_hdrr, T01HU41_A5061Hl_hdrp
            }
            , new Object[] {
            T01HU42_A396EmprCod, T01HU42_A252CliCod, T01HU42_A4718DishCod, T01HU42_A5020TipEstCod, T01HU42_A5022GraCod
            }
            , new Object[] {
            T01HU43_A396EmprCod, T01HU43_A4618EnsLCod
            }
            , new Object[] {
            T01HU44_A396EmprCod, T01HU44_A4492HreBarCod, T01HU44_A4493HreBarReo, T01HU44_A4494HreBarPar, T01HU44_A4495HreNumCie
            }
            , new Object[] {
            T01HU45_A396EmprCod, T01HU45_A252CliCod, T01HU45_A4415EstCol
            }
            , new Object[] {
            T01HU46_A396EmprCod, T01HU46_A4185WEBUSU
            }
            , new Object[] {
            T01HU47_A396EmprCod, T01HU47_A252CliCod, T01HU47_A4079WEBDISCOD, T01HU47_A4078EMPCOD
            }
            , new Object[] {
            T01HU48_A396EmprCod, T01HU48_A2637HisEstHRu, T01HU48_A2636HisEstHRe, T01HU48_A2635HisEstHPa, T01HU48_A2638HisEstLCo, T01HU48_A2630HisEstCom, T01HU48_A2634HisEstFon
            }
            , new Object[] {
            T01HU49_A396EmprCod, T01HU49_A2574GrpDibCod
            }
            , new Object[] {
            T01HU50_A396EmprCod, T01HU50_A2558GrmDibCod
            }
            , new Object[] {
            T01HU51_A396EmprCod, T01HU51_A2542GrcDibCod
            }
            , new Object[] {
            T01HU52_A396EmprCod, T01HU52_A1031EmpesCod, T01HU52_A252CliCod, T01HU52_A1032FonCod
            }
            , new Object[] {
            T01HU53_A396EmprCod, T01HU53_A1013DibCli, T01HU53_A252CliCod, T01HU53_A1014DibInt
            }
            , new Object[] {
            T01HU54_A396EmprCod, T01HU54_A1736AlbExtCod
            }
            , new Object[] {
            T01HU55_A396EmprCod, T01HU55_A252CliCod, T01HU55_A3661FacProAny, T01HU55_A3662FacProSer, T01HU55_A3663FacProInt, T01HU55_A3664FacProTip, T01HU55_A3665FacProTar
            }
            , new Object[] {
            T01HU56_A396EmprCod, T01HU56_A3646EstTinAny, T01HU56_A3647EstTinMes, T01HU56_A3648EstTinDia, T01HU56_A1929EstTinNr
            }
            , new Object[] {
            T01HU57_A396EmprCod, T01HU57_A3617AlbTrnCod
            }
            , new Object[] {
            T01HU58_A396EmprCod, T01HU58_A252CliCod, T01HU58_A3320CliLimKgs
            }
            , new Object[] {
            T01HU59_A396EmprCod, T01HU59_A3073RepCod, T01HU59_A252CliCod
            }
            , new Object[] {
            T01HU60_A396EmprCod, T01HU60_A3061Codia, T01HU60_A3062CoMes, T01HU60_A3063CoAny, T01HU60_A3065CoLin, T01HU60_A3010CoBarCod, T01HU60_A3011CoBarReo, T01HU60_A3012CoBarPar
            }
            , new Object[] {
            T01HU61_A396EmprCod, T01HU61_A2971SabFacCod
            }
            , new Object[] {
            T01HU62_A396EmprCod, T01HU62_A2954TiDia, T01HU62_A2955TiMes, T01HU62_A2956TiAny, T01HU62_A2958TiLin, T01HU62_A2959TiBarCod, T01HU62_A2960TiBarReo, T01HU62_A2961TiBarPar
            }
            , new Object[] {
            T01HU63_A396EmprCod, T01HU63_A252CliCod, T01HU63_A2933RecTipCon
            }
            , new Object[] {
            T01HU64_A396EmprCod, T01HU64_A252CliCod, T01HU64_A2927RecProCod
            }
            , new Object[] {
            T01HU65_A396EmprCod, T01HU65_A252CliCod, T01HU65_A2891HMaForSer, T01HU65_A2892HMaForCNom, T01HU65_A2893HMaForCNum, T01HU65_A2894HMaTipCCod, T01HU65_A2895HMaForNumC, T01HU65_A2897HMaColLin, T01HU65_A2896HMaFec, T01HU65_A2907HmaLin
            }
            , new Object[] {
            T01HU66_A396EmprCod, T01HU66_A252CliCod, T01HU66_A425EstAny, T01HU66_A2755EstSerFac
            }
            , new Object[] {
            T01HU67_A396EmprCod, T01HU67_A2730RecTipCo, T01HU67_A252CliCod
            }
            , new Object[] {
            T01HU68_A396EmprCod, T01HU68_A2720TarSec, T01HU68_A252CliCod, T01HU68_A829TipArtCod, T01HU68_A831TipColCod
            }
            , new Object[] {
            T01HU69_A396EmprCod, T01HU69_A2382AbcTerCod, T01HU69_A2381AbcSec, T01HU69_A252CliCod
            }
            , new Object[] {
            T01HU70_A396EmprCod, T01HU70_A252CliCod, T01HU70_A2308CliDesCod
            }
            , new Object[] {
            T01HU71_A396EmprCod, T01HU71_A2268MovParCod, T01HU71_A252CliCod
            }
            , new Object[] {
            T01HU72_A396EmprCod, T01HU72_A966PartCod, T01HU72_A252CliCod
            }
            , new Object[] {
            T01HU73_A396EmprCod, T01HU73_A1387AlbPrvCod
            }
            , new Object[] {
            T01HU74_A396EmprCod, T01HU74_A252CliCod, T01HU74_A1213TalCod
            }
            , new Object[] {
            T01HU75_A396EmprCod, T01HU75_A252CliCod, T01HU75_A457FasCod
            }
            , new Object[] {
            T01HU76_A396EmprCod, T01HU76_A539HisBarCod, T01HU76_A545HisCodReo, T01HU76_A544HisCodPar, T01HU76_A833TipDefCod
            }
            , new Object[] {
            T01HU77_A396EmprCod, T01HU77_A506HbaBarCod, T01HU77_A508HbaBarReo, T01HU77_A507HbaBarPar
            }
            , new Object[] {
            T01HU78_A396EmprCod, T01HU78_A252CliCod, T01HU78_A494ForSer, T01HU78_A482ForColNom, T01HU78_A483ForColNum, T01HU78_A831TipColCod
            }
            , new Object[] {
            T01HU79_A396EmprCod, T01HU79_A252CliCod, T01HU79_A287CliPagLin
            }
            , new Object[] {
            T01HU80_A396EmprCod, T01HU80_A252CliCod, T01HU80_A266CliEnvLin
            }
            , new Object[] {
            T01HU81_A396EmprCod, T01HU81_A252CliCod, T01HU81_A65ArtCod
            }
            , new Object[] {
            T01HU82_A396EmprCod, T01HU82_A44AlbRecCod
            }
            , new Object[] {
            T01HU83_A396EmprCod, T01HU83_A30AlbProCod
            }
            , new Object[] {
            T01HU84_A396EmprCod, T01HU84_A14AlbComCod
            }
            , new Object[] {
            T01HU85_A396EmprCod, T01HU85_A252CliCod
            }
         }
      );
   }

   private byte Z306CliUrg ;
   private byte Z251CliCanRie ;
   private byte Z294CliPerFac ;
   private byte Z273CliFacCop ;
   private byte Z3632CliCopAlb ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A306CliUrg ;
   private byte A251CliCanRie ;
   private byte A294CliPerFac ;
   private byte A273CliFacCop ;
   private byte A3632CliCopAlb ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ306CliUrg ;
   private byte ZZ251CliCanRie ;
   private byte ZZ294CliPerFac ;
   private byte ZZ273CliFacCop ;
   private byte ZZ3632CliCopAlb ;
   private short Z3304CliNumEtSa ;
   private short Z3305CliNumEtTi ;
   private short Z3631CliTrnCod ;
   private short Z7064CliUltMq ;
   private short Z9852CliP1 ;
   private short Z9853CliP0 ;
   private short Z3891CliPlanUL ;
   private short Z11632Lb_Linu ;
   private short Z11633CliUltl ;
   private short Z858ZonGeoCod ;
   private short Z10301Cod_pais ;
   private short Z11180TpOpC ;
   private short Z781PrvCod ;
   private short A858ZonGeoCod ;
   private short A10301Cod_pais ;
   private short A11180TpOpC ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3304CliNumEtSa ;
   private short A3305CliNumEtTi ;
   private short A3631CliTrnCod ;
   private short A7064CliUltMq ;
   private short A9852CliP1 ;
   private short A9853CliP0 ;
   private short A3891CliPlanUL ;
   private short A11632Lb_Linu ;
   private short A11633CliUltl ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short ZZ781PrvCod ;
   private short ZZ858ZonGeoCod ;
   private short ZZ3304CliNumEtSa ;
   private short ZZ3305CliNumEtTi ;
   private short ZZ3631CliTrnCod ;
   private short ZZ7064CliUltMq ;
   private short ZZ9852CliP1 ;
   private short ZZ9853CliP0 ;
   private short ZZ10301Cod_pais ;
   private short ZZ11180TpOpC ;
   private short ZZ3891CliPlanUL ;
   private short ZZ11632Lb_Linu ;
   private short ZZ11633CliUltl ;
   private int Z252CliCod ;
   private int Z9901CliNumC ;
   private int Z11761CliUltNPz ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNif_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtCliDom_Enabled ;
   private int edtCliPob_Enabled ;
   private int edtCliCp_Enabled ;
   private int edtPrvCod_Enabled ;
   private int edtPrvDsc_Enabled ;
   private int edtCliTel1_Enabled ;
   private int edtCliTel2_Enabled ;
   private int edtCliTelex_Enabled ;
   private int edtCliFax_Enabled ;
   private int edtCliIniVac_Enabled ;
   private int edtCliFinVac_Enabled ;
   private int edtCliDes_Enabled ;
   private int edtCliEti_Enabled ;
   private int edtCliUrg_Enabled ;
   private int edtCliPer_Enabled ;
   private int edtCliRef_Enabled ;
   private int edtCliCue_Enabled ;
   private int edtCliRieCon_Enabled ;
   private int edtCliRieCir_Enabled ;
   private int edtCliRieMh_Enabled ;
   private int edtCliFecMh_Enabled ;
   private int edtCliCanRie_Enabled ;
   private int edtCliPerFac_Enabled ;
   private int edtCliFacCop_Enabled ;
   private int edtZonGeoCod_Enabled ;
   private int edtZonGeoNom_Enabled ;
   private int edtCliAlias_Enabled ;
   private int edtCliNumEtSa_Enabled ;
   private int edtCliNumEtTi_Enabled ;
   private int edtCliPort_Enabled ;
   private int edtCliTrnCod_Enabled ;
   private int edtCliCopAlb_Enabled ;
   private int edtCliEmail_Enabled ;
   private int edtCliNom1_Enabled ;
   private int edtCliCp2_Enabled ;
   private int edtCliTBon_Enabled ;
   private int edtCliDom2_Enabled ;
   private int edtCliIe_Enabled ;
   private int edtCliUltMq_Enabled ;
   private int edtCliEst_Enabled ;
   private int edtCliP1_Enabled ;
   private int edtCliP0_Enabled ;
   private int A9901CliNumC ;
   private int edtCliNumC_Enabled ;
   private int edtCliemf_Enabled ;
   private int edtCod_pais_Enabled ;
   private int edtDsc_pais_Enabled ;
   private int edtTpOpC_Enabled ;
   private int edtTpOpD_Enabled ;
   private int edtCodWebId_Enabled ;
   private int edtCliMailGr_Enabled ;
   private int edtCliMailPk_Enabled ;
   private int edtCliPlanUL_Enabled ;
   private int edtLb_Linu_Enabled ;
   private int edtCliUltl_Enabled ;
   private int edtClimailPr_Enabled ;
   private int edtCliPerPr_Enabled ;
   private int A11761CliUltNPz ;
   private int edtCliUltNPz_Enabled ;
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
   private int edtCliUltNPz_Backcolor ;
   private int edtCliPerPr_Backcolor ;
   private int edtClimailPr_Backcolor ;
   private int edtCliUltl_Backcolor ;
   private int edtLb_Linu_Backcolor ;
   private int edtCliPlanUL_Backcolor ;
   private int edtCliMailPk_Backcolor ;
   private int edtCliMailGr_Backcolor ;
   private int edtCodWebId_Backcolor ;
   private int edtTpOpD_Backcolor ;
   private int edtTpOpC_Backcolor ;
   private int edtDsc_pais_Backcolor ;
   private int edtCod_pais_Backcolor ;
   private int edtCliemf_Backcolor ;
   private int edtCliNumC_Backcolor ;
   private int edtCliP0_Backcolor ;
   private int edtCliP1_Backcolor ;
   private int edtCliEst_Backcolor ;
   private int edtCliUltMq_Backcolor ;
   private int edtCliIe_Backcolor ;
   private int edtCliDom2_Backcolor ;
   private int edtCliTBon_Backcolor ;
   private int edtCliCp2_Backcolor ;
   private int edtCliNom1_Backcolor ;
   private int edtCliEmail_Backcolor ;
   private int edtCliCopAlb_Backcolor ;
   private int edtCliTrnCod_Backcolor ;
   private int edtCliPort_Backcolor ;
   private int edtCliNumEtTi_Backcolor ;
   private int edtCliNumEtSa_Backcolor ;
   private int edtCliAlias_Backcolor ;
   private int edtZonGeoNom_Backcolor ;
   private int edtZonGeoCod_Backcolor ;
   private int edtCliFacCop_Backcolor ;
   private int edtCliPerFac_Backcolor ;
   private int edtCliCanRie_Backcolor ;
   private int edtCliFecMh_Backcolor ;
   private int edtCliRieMh_Backcolor ;
   private int edtCliRieCir_Backcolor ;
   private int edtCliRieCon_Backcolor ;
   private int edtCliCue_Backcolor ;
   private int edtCliRef_Backcolor ;
   private int edtCliPer_Backcolor ;
   private int edtCliUrg_Backcolor ;
   private int edtCliEti_Backcolor ;
   private int edtCliDes_Backcolor ;
   private int edtCliFinVac_Backcolor ;
   private int edtCliIniVac_Backcolor ;
   private int edtCliFax_Backcolor ;
   private int edtCliTelex_Backcolor ;
   private int edtCliTel2_Backcolor ;
   private int edtCliTel1_Backcolor ;
   private int edtPrvDsc_Backcolor ;
   private int edtPrvCod_Backcolor ;
   private int edtCliCp_Backcolor ;
   private int edtCliPob_Backcolor ;
   private int edtCliDom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliNif_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ9901CliNumC ;
   private int ZZ11761CliUltNPz ;
   private java.math.BigDecimal Z301CliRieCon ;
   private java.math.BigDecimal Z300CliRieCir ;
   private java.math.BigDecimal Z302CliRieMh ;
   private java.math.BigDecimal A301CliRieCon ;
   private java.math.BigDecimal A300CliRieCir ;
   private java.math.BigDecimal A302CliRieMh ;
   private java.math.BigDecimal ZZ301CliRieCon ;
   private java.math.BigDecimal ZZ300CliRieCir ;
   private java.math.BigDecimal ZZ302CliRieMh ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z278CliNif ;
   private String Z279CliNom ;
   private String Z260CliDom ;
   private String Z295CliPob ;
   private String Z256CliCp ;
   private String Z303CliTel1 ;
   private String Z304CliTel2 ;
   private String Z305CliTelex ;
   private String Z274CliFax ;
   private String Z277CliIniVac ;
   private String Z276CliFinVac ;
   private String Z258CliDes ;
   private String Z272CliEti ;
   private String Z293CliPer ;
   private String Z298CliRef ;
   private String Z257CliCue ;
   private String Z250CliAlbAgr ;
   private String Z1466CliTub ;
   private String Z1901CliCtrl ;
   private String Z1902CliValA ;
   private String Z2748CliAlias ;
   private String Z2843CliEtiEN ;
   private String Z2842CliEtiCN ;
   private String Z2841CliEtiCC ;
   private String Z3091CliDivTra ;
   private String Z3630CliPort ;
   private String Z3633CliEmail ;
   private String Z3644CliNom1 ;
   private String Z4828CliCp2 ;
   private String Z5042CliTBon ;
   private String Z5648CliTipo ;
   private String Z5649CliDom2 ;
   private String Z6185CliIe ;
   private String Z8723CliEst ;
   private String Z9854CliEFx ;
   private String Z9855CliEEm ;
   private String Z10045CliAct ;
   private String Z10046CliEt1 ;
   private String Z10047CliEt2 ;
   private String Z10048CliEt3 ;
   private String Z10049CliEt4 ;
   private String Z10050Cliemf ;
   private String Z11521CodWebId ;
   private String Z11620CliMailGr ;
   private String Z11621CliMailPk ;
   private String Z11622CliMailGrE ;
   private String Z11623CliMailPkE ;
   private String Z11701ClimailPr ;
   private String Z11702CliPerPr ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A250CliAlbAgr ;
   private String A1466CliTub ;
   private String A1901CliCtrl ;
   private String A1902CliValA ;
   private String A2843CliEtiEN ;
   private String A2842CliEtiCN ;
   private String A2841CliEtiCC ;
   private String A3091CliDivTra ;
   private String A5648CliTipo ;
   private String A9854CliEFx ;
   private String A9855CliEEm ;
   private String A10045CliAct ;
   private String A10046CliEt1 ;
   private String A10047CliEt2 ;
   private String A10048CliEt3 ;
   private String A10049CliEt4 ;
   private String A11622CliMailGrE ;
   private String A11623CliMailPkE ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliNif_Internalname ;
   private String A278CliNif ;
   private String edtCliNif_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliDom_Internalname ;
   private String A260CliDom ;
   private String edtCliDom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliPob_Internalname ;
   private String A295CliPob ;
   private String edtCliPob_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliCp_Internalname ;
   private String A256CliCp ;
   private String edtCliCp_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrvCod_Internalname ;
   private String edtPrvCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPrvDsc_Internalname ;
   private String A787PrvDsc ;
   private String edtPrvDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCliTel1_Internalname ;
   private String A303CliTel1 ;
   private String edtCliTel1_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCliTel2_Internalname ;
   private String A304CliTel2 ;
   private String edtCliTel2_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCliTelex_Internalname ;
   private String A305CliTelex ;
   private String edtCliTelex_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtCliFax_Internalname ;
   private String A274CliFax ;
   private String edtCliFax_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtCliIniVac_Internalname ;
   private String A277CliIniVac ;
   private String edtCliIniVac_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtCliFinVac_Internalname ;
   private String A276CliFinVac ;
   private String edtCliFinVac_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtCliDes_Internalname ;
   private String A258CliDes ;
   private String edtCliDes_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtCliEti_Internalname ;
   private String A272CliEti ;
   private String edtCliEti_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtCliUrg_Internalname ;
   private String edtCliUrg_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtCliPer_Internalname ;
   private String A293CliPer ;
   private String edtCliPer_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtCliRef_Internalname ;
   private String A298CliRef ;
   private String edtCliRef_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtCliCue_Internalname ;
   private String A257CliCue ;
   private String edtCliCue_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtCliRieCon_Internalname ;
   private String edtCliRieCon_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtCliRieCir_Internalname ;
   private String edtCliRieCir_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtCliRieMh_Internalname ;
   private String edtCliRieMh_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtCliFecMh_Internalname ;
   private String edtCliFecMh_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtCliCanRie_Internalname ;
   private String edtCliCanRie_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtCliPerFac_Internalname ;
   private String edtCliPerFac_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtCliFacCop_Internalname ;
   private String edtCliFacCop_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtZonGeoCod_Internalname ;
   private String edtZonGeoCod_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtZonGeoNom_Internalname ;
   private String A1360ZonGeoNom ;
   private String edtZonGeoNom_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtCliAlias_Internalname ;
   private String A2748CliAlias ;
   private String edtCliAlias_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtCliNumEtSa_Internalname ;
   private String edtCliNumEtSa_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtCliNumEtTi_Internalname ;
   private String edtCliNumEtTi_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtCliPort_Internalname ;
   private String A3630CliPort ;
   private String edtCliPort_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtCliTrnCod_Internalname ;
   private String edtCliTrnCod_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtCliCopAlb_Internalname ;
   private String edtCliCopAlb_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtCliEmail_Internalname ;
   private String A3633CliEmail ;
   private String edtCliEmail_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtCliNom1_Internalname ;
   private String A3644CliNom1 ;
   private String edtCliNom1_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtCliCp2_Internalname ;
   private String A4828CliCp2 ;
   private String edtCliCp2_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtCliTBon_Internalname ;
   private String A5042CliTBon ;
   private String edtCliTBon_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtCliDom2_Internalname ;
   private String A5649CliDom2 ;
   private String edtCliDom2_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtCliIe_Internalname ;
   private String A6185CliIe ;
   private String edtCliIe_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtCliUltMq_Internalname ;
   private String edtCliUltMq_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtCliEst_Internalname ;
   private String A8723CliEst ;
   private String edtCliEst_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtCliP1_Internalname ;
   private String edtCliP1_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtCliP0_Internalname ;
   private String edtCliP0_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtCliNumC_Internalname ;
   private String edtCliNumC_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtCliemf_Internalname ;
   private String A10050Cliemf ;
   private String edtCliemf_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtCod_pais_Internalname ;
   private String edtCod_pais_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtDsc_pais_Internalname ;
   private String A10302Dsc_pais ;
   private String edtDsc_pais_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtTpOpC_Internalname ;
   private String edtTpOpC_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtTpOpD_Internalname ;
   private String A11181TpOpD ;
   private String edtTpOpD_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtCodWebId_Internalname ;
   private String A11521CodWebId ;
   private String edtCodWebId_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtCliMailGr_Internalname ;
   private String A11620CliMailGr ;
   private String edtCliMailGr_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtCliMailPk_Internalname ;
   private String A11621CliMailPk ;
   private String edtCliMailPk_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtCliPlanUL_Internalname ;
   private String edtCliPlanUL_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String edtLb_Linu_Internalname ;
   private String edtLb_Linu_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtCliUltl_Internalname ;
   private String edtCliUltl_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtClimailPr_Internalname ;
   private String A11701ClimailPr ;
   private String edtClimailPr_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtCliPerPr_Internalname ;
   private String A11702CliPerPr ;
   private String edtCliPerPr_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtCliUltNPz_Internalname ;
   private String edtCliUltNPz_Jsonclick ;
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
   private String Z787PrvDsc ;
   private String Z1360ZonGeoNom ;
   private String Z10302Dsc_pais ;
   private String Z11181TpOpD ;
   private String sMode21 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ278CliNif ;
   private String ZZ279CliNom ;
   private String ZZ260CliDom ;
   private String ZZ295CliPob ;
   private String ZZ256CliCp ;
   private String ZZ303CliTel1 ;
   private String ZZ304CliTel2 ;
   private String ZZ305CliTelex ;
   private String ZZ274CliFax ;
   private String ZZ277CliIniVac ;
   private String ZZ276CliFinVac ;
   private String ZZ258CliDes ;
   private String ZZ272CliEti ;
   private String ZZ293CliPer ;
   private String ZZ298CliRef ;
   private String ZZ257CliCue ;
   private String ZZ250CliAlbAgr ;
   private String ZZ1466CliTub ;
   private String ZZ1901CliCtrl ;
   private String ZZ1902CliValA ;
   private String ZZ2748CliAlias ;
   private String ZZ2843CliEtiEN ;
   private String ZZ2842CliEtiCN ;
   private String ZZ2841CliEtiCC ;
   private String ZZ3091CliDivTra ;
   private String ZZ3630CliPort ;
   private String ZZ3633CliEmail ;
   private String ZZ3644CliNom1 ;
   private String ZZ4828CliCp2 ;
   private String ZZ5042CliTBon ;
   private String ZZ5648CliTipo ;
   private String ZZ5649CliDom2 ;
   private String ZZ6185CliIe ;
   private String ZZ8723CliEst ;
   private String ZZ9854CliEFx ;
   private String ZZ9855CliEEm ;
   private String ZZ10045CliAct ;
   private String ZZ10046CliEt1 ;
   private String ZZ10047CliEt2 ;
   private String ZZ10048CliEt3 ;
   private String ZZ10049CliEt4 ;
   private String ZZ10050Cliemf ;
   private String ZZ11521CodWebId ;
   private String ZZ11620CliMailGr ;
   private String ZZ11621CliMailPk ;
   private String ZZ11622CliMailGrE ;
   private String ZZ11623CliMailPkE ;
   private String ZZ11701ClimailPr ;
   private String ZZ11702CliPerPr ;
   private String ZZ1360ZonGeoNom ;
   private String ZZ10302Dsc_pais ;
   private String ZZ11181TpOpD ;
   private String ZZ787PrvDsc ;
   private java.util.Date Z275CliFecMh ;
   private java.util.Date A275CliFecMh ;
   private java.util.Date ZZ275CliFecMh ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10301Cod_pais ;
   private boolean n11180TpOpC ;
   private boolean wbErr ;
   private boolean n3091CliDivTra ;
   private boolean n252CliCod ;
   private boolean n787PrvDsc ;
   private boolean n1360ZonGeoNom ;
   private boolean n10302Dsc_pais ;
   private boolean n11181TpOpD ;
   private boolean Gx_longc ;
   private ICheckbox chkCliAlbAgr ;
   private ICheckbox chkCliTub ;
   private ICheckbox chkCliCtrl ;
   private ICheckbox chkCliValA ;
   private ICheckbox chkCliEtiEN ;
   private ICheckbox chkCliEtiCN ;
   private ICheckbox chkCliEtiCC ;
   private HTMLChoice cmbCliDivTra ;
   private HTMLChoice cmbCliTipo ;
   private ICheckbox chkCliEFx ;
   private ICheckbox chkCliEEm ;
   private ICheckbox chkCliAct ;
   private ICheckbox chkCliEt1 ;
   private ICheckbox chkCliEt2 ;
   private ICheckbox chkCliEt3 ;
   private ICheckbox chkCliEt4 ;
   private ICheckbox chkCliMailGrE ;
   private ICheckbox chkCliMailPkE ;
   private IDataStoreProvider pr_default ;
   private int[] T01HU8_A252CliCod ;
   private boolean[] T01HU8_n252CliCod ;
   private String[] T01HU8_A278CliNif ;
   private String[] T01HU8_A279CliNom ;
   private String[] T01HU8_A260CliDom ;
   private String[] T01HU8_A295CliPob ;
   private String[] T01HU8_A256CliCp ;
   private String[] T01HU8_A787PrvDsc ;
   private boolean[] T01HU8_n787PrvDsc ;
   private String[] T01HU8_A303CliTel1 ;
   private String[] T01HU8_A304CliTel2 ;
   private String[] T01HU8_A305CliTelex ;
   private String[] T01HU8_A274CliFax ;
   private String[] T01HU8_A277CliIniVac ;
   private String[] T01HU8_A276CliFinVac ;
   private String[] T01HU8_A258CliDes ;
   private String[] T01HU8_A272CliEti ;
   private byte[] T01HU8_A306CliUrg ;
   private String[] T01HU8_A293CliPer ;
   private String[] T01HU8_A298CliRef ;
   private String[] T01HU8_A257CliCue ;
   private java.math.BigDecimal[] T01HU8_A301CliRieCon ;
   private java.math.BigDecimal[] T01HU8_A300CliRieCir ;
   private java.math.BigDecimal[] T01HU8_A302CliRieMh ;
   private java.util.Date[] T01HU8_A275CliFecMh ;
   private byte[] T01HU8_A251CliCanRie ;
   private byte[] T01HU8_A294CliPerFac ;
   private String[] T01HU8_A250CliAlbAgr ;
   private byte[] T01HU8_A273CliFacCop ;
   private String[] T01HU8_A1360ZonGeoNom ;
   private boolean[] T01HU8_n1360ZonGeoNom ;
   private String[] T01HU8_A1466CliTub ;
   private String[] T01HU8_A1901CliCtrl ;
   private String[] T01HU8_A1902CliValA ;
   private String[] T01HU8_A2748CliAlias ;
   private String[] T01HU8_A2843CliEtiEN ;
   private String[] T01HU8_A2842CliEtiCN ;
   private String[] T01HU8_A2841CliEtiCC ;
   private String[] T01HU8_A3091CliDivTra ;
   private boolean[] T01HU8_n3091CliDivTra ;
   private short[] T01HU8_A3304CliNumEtSa ;
   private short[] T01HU8_A3305CliNumEtTi ;
   private String[] T01HU8_A3630CliPort ;
   private short[] T01HU8_A3631CliTrnCod ;
   private byte[] T01HU8_A3632CliCopAlb ;
   private String[] T01HU8_A3633CliEmail ;
   private String[] T01HU8_A3644CliNom1 ;
   private String[] T01HU8_A4828CliCp2 ;
   private String[] T01HU8_A5042CliTBon ;
   private String[] T01HU8_A5648CliTipo ;
   private String[] T01HU8_A5649CliDom2 ;
   private String[] T01HU8_A6185CliIe ;
   private short[] T01HU8_A7064CliUltMq ;
   private String[] T01HU8_A8723CliEst ;
   private short[] T01HU8_A9852CliP1 ;
   private short[] T01HU8_A9853CliP0 ;
   private String[] T01HU8_A9854CliEFx ;
   private String[] T01HU8_A9855CliEEm ;
   private int[] T01HU8_A9901CliNumC ;
   private String[] T01HU8_A10045CliAct ;
   private String[] T01HU8_A10046CliEt1 ;
   private String[] T01HU8_A10047CliEt2 ;
   private String[] T01HU8_A10048CliEt3 ;
   private String[] T01HU8_A10049CliEt4 ;
   private String[] T01HU8_A10050Cliemf ;
   private String[] T01HU8_A10302Dsc_pais ;
   private boolean[] T01HU8_n10302Dsc_pais ;
   private String[] T01HU8_A11181TpOpD ;
   private boolean[] T01HU8_n11181TpOpD ;
   private String[] T01HU8_A11521CodWebId ;
   private String[] T01HU8_A11620CliMailGr ;
   private String[] T01HU8_A11621CliMailPk ;
   private String[] T01HU8_A11622CliMailGrE ;
   private String[] T01HU8_A11623CliMailPkE ;
   private short[] T01HU8_A3891CliPlanUL ;
   private short[] T01HU8_A11632Lb_Linu ;
   private short[] T01HU8_A11633CliUltl ;
   private String[] T01HU8_A11701ClimailPr ;
   private String[] T01HU8_A11702CliPerPr ;
   private int[] T01HU8_A11761CliUltNPz ;
   private String[] T01HU8_A396EmprCod ;
   private short[] T01HU8_A858ZonGeoCod ;
   private short[] T01HU8_A10301Cod_pais ;
   private boolean[] T01HU8_n10301Cod_pais ;
   private short[] T01HU8_A11180TpOpC ;
   private boolean[] T01HU8_n11180TpOpC ;
   private short[] T01HU8_A781PrvCod ;
   private String[] T01HU4_A1360ZonGeoNom ;
   private boolean[] T01HU4_n1360ZonGeoNom ;
   private String[] T01HU5_A10302Dsc_pais ;
   private boolean[] T01HU5_n10302Dsc_pais ;
   private String[] T01HU6_A11181TpOpD ;
   private boolean[] T01HU6_n11181TpOpD ;
   private String[] T01HU7_A787PrvDsc ;
   private boolean[] T01HU7_n787PrvDsc ;
   private String[] T01HU9_A1360ZonGeoNom ;
   private boolean[] T01HU9_n1360ZonGeoNom ;
   private String[] T01HU10_A10302Dsc_pais ;
   private boolean[] T01HU10_n10302Dsc_pais ;
   private String[] T01HU11_A11181TpOpD ;
   private boolean[] T01HU11_n11181TpOpD ;
   private String[] T01HU12_A787PrvDsc ;
   private boolean[] T01HU12_n787PrvDsc ;
   private String[] T01HU13_A396EmprCod ;
   private int[] T01HU13_A252CliCod ;
   private boolean[] T01HU13_n252CliCod ;
   private int[] T01HU3_A252CliCod ;
   private boolean[] T01HU3_n252CliCod ;
   private String[] T01HU3_A278CliNif ;
   private String[] T01HU3_A279CliNom ;
   private String[] T01HU3_A260CliDom ;
   private String[] T01HU3_A295CliPob ;
   private String[] T01HU3_A256CliCp ;
   private String[] T01HU3_A303CliTel1 ;
   private String[] T01HU3_A304CliTel2 ;
   private String[] T01HU3_A305CliTelex ;
   private String[] T01HU3_A274CliFax ;
   private String[] T01HU3_A277CliIniVac ;
   private String[] T01HU3_A276CliFinVac ;
   private String[] T01HU3_A258CliDes ;
   private String[] T01HU3_A272CliEti ;
   private byte[] T01HU3_A306CliUrg ;
   private String[] T01HU3_A293CliPer ;
   private String[] T01HU3_A298CliRef ;
   private String[] T01HU3_A257CliCue ;
   private java.math.BigDecimal[] T01HU3_A301CliRieCon ;
   private java.math.BigDecimal[] T01HU3_A300CliRieCir ;
   private java.math.BigDecimal[] T01HU3_A302CliRieMh ;
   private java.util.Date[] T01HU3_A275CliFecMh ;
   private byte[] T01HU3_A251CliCanRie ;
   private byte[] T01HU3_A294CliPerFac ;
   private String[] T01HU3_A250CliAlbAgr ;
   private byte[] T01HU3_A273CliFacCop ;
   private String[] T01HU3_A1466CliTub ;
   private String[] T01HU3_A1901CliCtrl ;
   private String[] T01HU3_A1902CliValA ;
   private String[] T01HU3_A2748CliAlias ;
   private String[] T01HU3_A2843CliEtiEN ;
   private String[] T01HU3_A2842CliEtiCN ;
   private String[] T01HU3_A2841CliEtiCC ;
   private String[] T01HU3_A3091CliDivTra ;
   private boolean[] T01HU3_n3091CliDivTra ;
   private short[] T01HU3_A3304CliNumEtSa ;
   private short[] T01HU3_A3305CliNumEtTi ;
   private String[] T01HU3_A3630CliPort ;
   private short[] T01HU3_A3631CliTrnCod ;
   private byte[] T01HU3_A3632CliCopAlb ;
   private String[] T01HU3_A3633CliEmail ;
   private String[] T01HU3_A3644CliNom1 ;
   private String[] T01HU3_A4828CliCp2 ;
   private String[] T01HU3_A5042CliTBon ;
   private String[] T01HU3_A5648CliTipo ;
   private String[] T01HU3_A5649CliDom2 ;
   private String[] T01HU3_A6185CliIe ;
   private short[] T01HU3_A7064CliUltMq ;
   private String[] T01HU3_A8723CliEst ;
   private short[] T01HU3_A9852CliP1 ;
   private short[] T01HU3_A9853CliP0 ;
   private String[] T01HU3_A9854CliEFx ;
   private String[] T01HU3_A9855CliEEm ;
   private int[] T01HU3_A9901CliNumC ;
   private String[] T01HU3_A10045CliAct ;
   private String[] T01HU3_A10046CliEt1 ;
   private String[] T01HU3_A10047CliEt2 ;
   private String[] T01HU3_A10048CliEt3 ;
   private String[] T01HU3_A10049CliEt4 ;
   private String[] T01HU3_A10050Cliemf ;
   private String[] T01HU3_A11521CodWebId ;
   private String[] T01HU3_A11620CliMailGr ;
   private String[] T01HU3_A11621CliMailPk ;
   private String[] T01HU3_A11622CliMailGrE ;
   private String[] T01HU3_A11623CliMailPkE ;
   private short[] T01HU3_A3891CliPlanUL ;
   private short[] T01HU3_A11632Lb_Linu ;
   private short[] T01HU3_A11633CliUltl ;
   private String[] T01HU3_A11701ClimailPr ;
   private String[] T01HU3_A11702CliPerPr ;
   private int[] T01HU3_A11761CliUltNPz ;
   private String[] T01HU3_A396EmprCod ;
   private short[] T01HU3_A858ZonGeoCod ;
   private short[] T01HU3_A10301Cod_pais ;
   private boolean[] T01HU3_n10301Cod_pais ;
   private short[] T01HU3_A11180TpOpC ;
   private boolean[] T01HU3_n11180TpOpC ;
   private short[] T01HU3_A781PrvCod ;
   private String[] T01HU14_A396EmprCod ;
   private int[] T01HU14_A252CliCod ;
   private boolean[] T01HU14_n252CliCod ;
   private String[] T01HU15_A396EmprCod ;
   private int[] T01HU15_A252CliCod ;
   private boolean[] T01HU15_n252CliCod ;
   private int[] T01HU2_A252CliCod ;
   private boolean[] T01HU2_n252CliCod ;
   private String[] T01HU2_A278CliNif ;
   private String[] T01HU2_A279CliNom ;
   private String[] T01HU2_A260CliDom ;
   private String[] T01HU2_A295CliPob ;
   private String[] T01HU2_A256CliCp ;
   private String[] T01HU2_A303CliTel1 ;
   private String[] T01HU2_A304CliTel2 ;
   private String[] T01HU2_A305CliTelex ;
   private String[] T01HU2_A274CliFax ;
   private String[] T01HU2_A277CliIniVac ;
   private String[] T01HU2_A276CliFinVac ;
   private String[] T01HU2_A258CliDes ;
   private String[] T01HU2_A272CliEti ;
   private byte[] T01HU2_A306CliUrg ;
   private String[] T01HU2_A293CliPer ;
   private String[] T01HU2_A298CliRef ;
   private String[] T01HU2_A257CliCue ;
   private java.math.BigDecimal[] T01HU2_A301CliRieCon ;
   private java.math.BigDecimal[] T01HU2_A300CliRieCir ;
   private java.math.BigDecimal[] T01HU2_A302CliRieMh ;
   private java.util.Date[] T01HU2_A275CliFecMh ;
   private byte[] T01HU2_A251CliCanRie ;
   private byte[] T01HU2_A294CliPerFac ;
   private String[] T01HU2_A250CliAlbAgr ;
   private byte[] T01HU2_A273CliFacCop ;
   private String[] T01HU2_A1466CliTub ;
   private String[] T01HU2_A1901CliCtrl ;
   private String[] T01HU2_A1902CliValA ;
   private String[] T01HU2_A2748CliAlias ;
   private String[] T01HU2_A2843CliEtiEN ;
   private String[] T01HU2_A2842CliEtiCN ;
   private String[] T01HU2_A2841CliEtiCC ;
   private String[] T01HU2_A3091CliDivTra ;
   private boolean[] T01HU2_n3091CliDivTra ;
   private short[] T01HU2_A3304CliNumEtSa ;
   private short[] T01HU2_A3305CliNumEtTi ;
   private String[] T01HU2_A3630CliPort ;
   private short[] T01HU2_A3631CliTrnCod ;
   private byte[] T01HU2_A3632CliCopAlb ;
   private String[] T01HU2_A3633CliEmail ;
   private String[] T01HU2_A3644CliNom1 ;
   private String[] T01HU2_A4828CliCp2 ;
   private String[] T01HU2_A5042CliTBon ;
   private String[] T01HU2_A5648CliTipo ;
   private String[] T01HU2_A5649CliDom2 ;
   private String[] T01HU2_A6185CliIe ;
   private short[] T01HU2_A7064CliUltMq ;
   private String[] T01HU2_A8723CliEst ;
   private short[] T01HU2_A9852CliP1 ;
   private short[] T01HU2_A9853CliP0 ;
   private String[] T01HU2_A9854CliEFx ;
   private String[] T01HU2_A9855CliEEm ;
   private int[] T01HU2_A9901CliNumC ;
   private String[] T01HU2_A10045CliAct ;
   private String[] T01HU2_A10046CliEt1 ;
   private String[] T01HU2_A10047CliEt2 ;
   private String[] T01HU2_A10048CliEt3 ;
   private String[] T01HU2_A10049CliEt4 ;
   private String[] T01HU2_A10050Cliemf ;
   private String[] T01HU2_A11521CodWebId ;
   private String[] T01HU2_A11620CliMailGr ;
   private String[] T01HU2_A11621CliMailPk ;
   private String[] T01HU2_A11622CliMailGrE ;
   private String[] T01HU2_A11623CliMailPkE ;
   private short[] T01HU2_A3891CliPlanUL ;
   private short[] T01HU2_A11632Lb_Linu ;
   private short[] T01HU2_A11633CliUltl ;
   private String[] T01HU2_A11701ClimailPr ;
   private String[] T01HU2_A11702CliPerPr ;
   private int[] T01HU2_A11761CliUltNPz ;
   private String[] T01HU2_A396EmprCod ;
   private short[] T01HU2_A858ZonGeoCod ;
   private short[] T01HU2_A10301Cod_pais ;
   private boolean[] T01HU2_n10301Cod_pais ;
   private short[] T01HU2_A11180TpOpC ;
   private boolean[] T01HU2_n11180TpOpC ;
   private short[] T01HU2_A781PrvCod ;
   private String[] T01HU19_A787PrvDsc ;
   private boolean[] T01HU19_n787PrvDsc ;
   private String[] T01HU20_A1360ZonGeoNom ;
   private boolean[] T01HU20_n1360ZonGeoNom ;
   private String[] T01HU21_A10302Dsc_pais ;
   private boolean[] T01HU21_n10302Dsc_pais ;
   private String[] T01HU22_A11181TpOpD ;
   private boolean[] T01HU22_n11181TpOpD ;
   private String[] T01HU23_A396EmprCod ;
   private int[] T01HU23_A252CliCod ;
   private boolean[] T01HU23_n252CliCod ;
   private int[] T01HU23_A6930Lb_rclin ;
   private String[] T01HU24_A396EmprCod ;
   private int[] T01HU24_A6850Tex_NPed ;
   private String[] T01HU25_A396EmprCod ;
   private int[] T01HU25_A252CliCod ;
   private boolean[] T01HU25_n252CliCod ;
   private short[] T01HU25_A829TipArtCod ;
   private byte[] T01HU25_A831TipColCod ;
   private byte[] T01HU25_A583IntCod ;
   private String[] T01HU25_A5098TipDisCod ;
   private short[] T01HU25_A6603Est1_anyo ;
   private byte[] T01HU25_A6604Est1_mes ;
   private byte[] T01HU25_A6605Est1_dia ;
   private String[] T01HU26_A396EmprCod ;
   private int[] T01HU26_A6319C_Barcod ;
   private byte[] T01HU26_A6320C_Barcodre ;
   private String[] T01HU26_A6321C_Barcodpa ;
   private short[] T01HU26_A6322C_Reclinma ;
   private String[] T01HU27_A396EmprCod ;
   private int[] T01HU27_A6235DevEmpCod ;
   private String[] T01HU28_A396EmprCod ;
   private String[] T01HU28_A602MaqCod ;
   private int[] T01HU28_A6078MaqCliCod ;
   private String[] T01HU28_A6079MaqArtCod ;
   private String[] T01HU29_A396EmprCod ;
   private int[] T01HU29_A5532Lb_numero ;
   private String[] T01HU30_A396EmprCod ;
   private int[] T01HU30_A252CliCod ;
   private boolean[] T01HU30_n252CliCod ;
   private short[] T01HU30_A5503CliifLin ;
   private String[] T01HU31_A396EmprCod ;
   private int[] T01HU31_A252CliCod ;
   private boolean[] T01HU31_n252CliCod ;
   private short[] T01HU31_A5499ClieiLin ;
   private String[] T01HU32_A396EmprCod ;
   private int[] T01HU32_A252CliCod ;
   private boolean[] T01HU32_n252CliCod ;
   private short[] T01HU32_A5495ClidtLin ;
   private String[] T01HU33_A396EmprCod ;
   private int[] T01HU33_A252CliCod ;
   private boolean[] T01HU33_n252CliCod ;
   private short[] T01HU33_A5491CliedLin ;
   private String[] T01HU34_A396EmprCod ;
   private int[] T01HU34_A252CliCod ;
   private boolean[] T01HU34_n252CliCod ;
   private String[] T01HU34_A5452P_ForCod ;
   private String[] T01HU35_A396EmprCod ;
   private int[] T01HU35_A252CliCod ;
   private boolean[] T01HU35_n252CliCod ;
   private String[] T01HU35_A5443Mdl_Cod ;
   private String[] T01HU36_A396EmprCod ;
   private int[] T01HU36_A252CliCod ;
   private boolean[] T01HU36_n252CliCod ;
   private short[] T01HU36_A5436IntCodF2 ;
   private String[] T01HU37_A396EmprCod ;
   private int[] T01HU37_A252CliCod ;
   private boolean[] T01HU37_n252CliCod ;
   private byte[] T01HU37_A5396IntCodFC ;
   private byte[] T01HU37_A5434Tip_ColC ;
   private String[] T01HU38_A396EmprCod ;
   private int[] T01HU38_A252CliCod ;
   private boolean[] T01HU38_n252CliCod ;
   private String[] T01HU38_A5428FasPreCod ;
   private String[] T01HU39_A396EmprCod ;
   private int[] T01HU39_A252CliCod ;
   private boolean[] T01HU39_n252CliCod ;
   private String[] T01HU39_A5398Cli_Proc ;
   private String[] T01HU40_A396EmprCod ;
   private int[] T01HU40_A5130PagIden ;
   private String[] T01HU41_A396EmprCod ;
   private int[] T01HU41_A5059Hl_hdr ;
   private byte[] T01HU41_A5060Hl_hdrr ;
   private String[] T01HU41_A5061Hl_hdrp ;
   private String[] T01HU42_A396EmprCod ;
   private int[] T01HU42_A252CliCod ;
   private boolean[] T01HU42_n252CliCod ;
   private String[] T01HU42_A4718DishCod ;
   private byte[] T01HU42_A5020TipEstCod ;
   private byte[] T01HU42_A5022GraCod ;
   private String[] T01HU43_A396EmprCod ;
   private int[] T01HU43_A4618EnsLCod ;
   private String[] T01HU44_A396EmprCod ;
   private int[] T01HU44_A4492HreBarCod ;
   private byte[] T01HU44_A4493HreBarReo ;
   private String[] T01HU44_A4494HreBarPar ;
   private byte[] T01HU44_A4495HreNumCie ;
   private String[] T01HU45_A396EmprCod ;
   private int[] T01HU45_A252CliCod ;
   private boolean[] T01HU45_n252CliCod ;
   private String[] T01HU45_A4415EstCol ;
   private String[] T01HU46_A396EmprCod ;
   private String[] T01HU46_A4185WEBUSU ;
   private String[] T01HU47_A396EmprCod ;
   private int[] T01HU47_A252CliCod ;
   private boolean[] T01HU47_n252CliCod ;
   private String[] T01HU47_A4079WEBDISCOD ;
   private String[] T01HU47_A4078EMPCOD ;
   private String[] T01HU48_A396EmprCod ;
   private int[] T01HU48_A2637HisEstHRu ;
   private byte[] T01HU48_A2636HisEstHRe ;
   private String[] T01HU48_A2635HisEstHPa ;
   private byte[] T01HU48_A2638HisEstLCo ;
   private String[] T01HU48_A2630HisEstCom ;
   private String[] T01HU48_A2634HisEstFon ;
   private String[] T01HU49_A396EmprCod ;
   private int[] T01HU49_A2574GrpDibCod ;
   private String[] T01HU50_A396EmprCod ;
   private int[] T01HU50_A2558GrmDibCod ;
   private String[] T01HU51_A396EmprCod ;
   private int[] T01HU51_A2542GrcDibCod ;
   private String[] T01HU52_A396EmprCod ;
   private String[] T01HU52_A1031EmpesCod ;
   private int[] T01HU52_A252CliCod ;
   private boolean[] T01HU52_n252CliCod ;
   private String[] T01HU52_A1032FonCod ;
   private String[] T01HU53_A396EmprCod ;
   private String[] T01HU53_A1013DibCli ;
   private int[] T01HU53_A252CliCod ;
   private boolean[] T01HU53_n252CliCod ;
   private int[] T01HU53_A1014DibInt ;
   private String[] T01HU54_A396EmprCod ;
   private long[] T01HU54_A1736AlbExtCod ;
   private String[] T01HU55_A396EmprCod ;
   private int[] T01HU55_A252CliCod ;
   private boolean[] T01HU55_n252CliCod ;
   private short[] T01HU55_A3661FacProAny ;
   private String[] T01HU55_A3662FacProSer ;
   private byte[] T01HU55_A3663FacProInt ;
   private byte[] T01HU55_A3664FacProTip ;
   private short[] T01HU55_A3665FacProTar ;
   private String[] T01HU56_A396EmprCod ;
   private short[] T01HU56_A3646EstTinAny ;
   private byte[] T01HU56_A3647EstTinMes ;
   private byte[] T01HU56_A3648EstTinDia ;
   private short[] T01HU56_A1929EstTinNr ;
   private String[] T01HU57_A396EmprCod ;
   private long[] T01HU57_A3617AlbTrnCod ;
   private String[] T01HU58_A396EmprCod ;
   private int[] T01HU58_A252CliCod ;
   private boolean[] T01HU58_n252CliCod ;
   private java.math.BigDecimal[] T01HU58_A3320CliLimKgs ;
   private String[] T01HU59_A396EmprCod ;
   private String[] T01HU59_A3073RepCod ;
   private int[] T01HU59_A252CliCod ;
   private boolean[] T01HU59_n252CliCod ;
   private String[] T01HU60_A396EmprCod ;
   private byte[] T01HU60_A3061Codia ;
   private byte[] T01HU60_A3062CoMes ;
   private short[] T01HU60_A3063CoAny ;
   private byte[] T01HU60_A3065CoLin ;
   private int[] T01HU60_A3010CoBarCod ;
   private byte[] T01HU60_A3011CoBarReo ;
   private String[] T01HU60_A3012CoBarPar ;
   private String[] T01HU61_A396EmprCod ;
   private int[] T01HU61_A2971SabFacCod ;
   private String[] T01HU62_A396EmprCod ;
   private byte[] T01HU62_A2954TiDia ;
   private byte[] T01HU62_A2955TiMes ;
   private short[] T01HU62_A2956TiAny ;
   private byte[] T01HU62_A2958TiLin ;
   private int[] T01HU62_A2959TiBarCod ;
   private byte[] T01HU62_A2960TiBarReo ;
   private String[] T01HU62_A2961TiBarPar ;
   private String[] T01HU63_A396EmprCod ;
   private int[] T01HU63_A252CliCod ;
   private boolean[] T01HU63_n252CliCod ;
   private short[] T01HU63_A2933RecTipCon ;
   private String[] T01HU64_A396EmprCod ;
   private int[] T01HU64_A252CliCod ;
   private boolean[] T01HU64_n252CliCod ;
   private String[] T01HU64_A2927RecProCod ;
   private String[] T01HU65_A396EmprCod ;
   private int[] T01HU65_A252CliCod ;
   private boolean[] T01HU65_n252CliCod ;
   private String[] T01HU65_A2891HMaForSer ;
   private String[] T01HU65_A2892HMaForCNom ;
   private int[] T01HU65_A2893HMaForCNum ;
   private byte[] T01HU65_A2894HMaTipCCod ;
   private int[] T01HU65_A2895HMaForNumC ;
   private short[] T01HU65_A2897HMaColLin ;
   private java.util.Date[] T01HU65_A2896HMaFec ;
   private short[] T01HU65_A2907HmaLin ;
   private String[] T01HU66_A396EmprCod ;
   private int[] T01HU66_A252CliCod ;
   private boolean[] T01HU66_n252CliCod ;
   private short[] T01HU66_A425EstAny ;
   private String[] T01HU66_A2755EstSerFac ;
   private String[] T01HU67_A396EmprCod ;
   private short[] T01HU67_A2730RecTipCo ;
   private int[] T01HU67_A252CliCod ;
   private boolean[] T01HU67_n252CliCod ;
   private String[] T01HU68_A396EmprCod ;
   private String[] T01HU68_A2720TarSec ;
   private int[] T01HU68_A252CliCod ;
   private boolean[] T01HU68_n252CliCod ;
   private short[] T01HU68_A829TipArtCod ;
   private byte[] T01HU68_A831TipColCod ;
   private String[] T01HU69_A396EmprCod ;
   private String[] T01HU69_A2382AbcTerCod ;
   private String[] T01HU69_A2381AbcSec ;
   private int[] T01HU69_A252CliCod ;
   private boolean[] T01HU69_n252CliCod ;
   private String[] T01HU70_A396EmprCod ;
   private int[] T01HU70_A252CliCod ;
   private boolean[] T01HU70_n252CliCod ;
   private int[] T01HU70_A2308CliDesCod ;
   private String[] T01HU71_A396EmprCod ;
   private String[] T01HU71_A2268MovParCod ;
   private int[] T01HU71_A252CliCod ;
   private boolean[] T01HU71_n252CliCod ;
   private String[] T01HU72_A396EmprCod ;
   private String[] T01HU72_A966PartCod ;
   private int[] T01HU72_A252CliCod ;
   private boolean[] T01HU72_n252CliCod ;
   private String[] T01HU73_A396EmprCod ;
   private int[] T01HU73_A1387AlbPrvCod ;
   private String[] T01HU74_A396EmprCod ;
   private int[] T01HU74_A252CliCod ;
   private boolean[] T01HU74_n252CliCod ;
   private String[] T01HU74_A1213TalCod ;
   private String[] T01HU75_A396EmprCod ;
   private int[] T01HU75_A252CliCod ;
   private boolean[] T01HU75_n252CliCod ;
   private String[] T01HU75_A457FasCod ;
   private String[] T01HU76_A396EmprCod ;
   private int[] T01HU76_A539HisBarCod ;
   private byte[] T01HU76_A545HisCodReo ;
   private String[] T01HU76_A544HisCodPar ;
   private short[] T01HU76_A833TipDefCod ;
   private String[] T01HU77_A396EmprCod ;
   private int[] T01HU77_A506HbaBarCod ;
   private byte[] T01HU77_A508HbaBarReo ;
   private String[] T01HU77_A507HbaBarPar ;
   private String[] T01HU78_A396EmprCod ;
   private int[] T01HU78_A252CliCod ;
   private boolean[] T01HU78_n252CliCod ;
   private String[] T01HU78_A494ForSer ;
   private String[] T01HU78_A482ForColNom ;
   private int[] T01HU78_A483ForColNum ;
   private byte[] T01HU78_A831TipColCod ;
   private String[] T01HU79_A396EmprCod ;
   private int[] T01HU79_A252CliCod ;
   private boolean[] T01HU79_n252CliCod ;
   private byte[] T01HU79_A287CliPagLin ;
   private String[] T01HU80_A396EmprCod ;
   private int[] T01HU80_A252CliCod ;
   private boolean[] T01HU80_n252CliCod ;
   private byte[] T01HU80_A266CliEnvLin ;
   private String[] T01HU81_A396EmprCod ;
   private int[] T01HU81_A252CliCod ;
   private boolean[] T01HU81_n252CliCod ;
   private String[] T01HU81_A65ArtCod ;
   private String[] T01HU82_A396EmprCod ;
   private int[] T01HU82_A44AlbRecCod ;
   private String[] T01HU83_A396EmprCod ;
   private long[] T01HU83_A30AlbProCod ;
   private String[] T01HU84_A396EmprCod ;
   private int[] T01HU84_A14AlbComCod ;
   private String[] T01HU85_A396EmprCod ;
   private int[] T01HU85_A252CliCod ;
   private boolean[] T01HU85_n252CliCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrclient__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrclient__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrclient__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrclient__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HU2", "SELECT CliCod, CliNif, CliNom, CliDom, CliPob, CliCp, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, CliTub, CliCtrl, CliValA, CliAlias, CliEtiEN, CliEtiCN, CliEtiCC, CliDivTra, CliNumEtSa, CliNumEtTi, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliTipo, CliDom2, CliIe, CliUltMq, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, EmprCod, ZonGeoCod, Cod_pais, TpOpC, PrvCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNif, CliNom, CliDom, CliPob, CliCp, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, CliTub, CliCtrl, CliValA, CliAlias, CliEtiEN, CliEtiCN, CliEtiCC, CliDivTra, CliNumEtSa, CliNumEtTi, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliTipo, CliDom2, CliIe, CliUltMq, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, ZonGeoCod, Cod_pais, TpOpC, PrvCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU3", "SELECT CliCod, CliNif, CliNom, CliDom, CliPob, CliCp, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, CliTub, CliCtrl, CliValA, CliAlias, CliEtiEN, CliEtiCN, CliEtiCC, CliDivTra, CliNumEtSa, CliNumEtTi, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliTipo, CliDom2, CliIe, CliUltMq, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, EmprCod, ZonGeoCod, Cod_pais, TpOpC, PrvCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU4", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU5", "SELECT Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? AND Cod_pais = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU6", "SELECT TpOpD FROM TXPOPASEN WHERE EmprCod = ? AND TpOpC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU7", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, TM1.CliNif, TM1.CliNom, TM1.CliDom, TM1.CliPob, TM1.CliCp, T2.PrvDsc, TM1.CliTel1, TM1.CliTel2, TM1.CliTelex, TM1.CliFax, TM1.CliIniVac, TM1.CliFinVac, TM1.CliDes, TM1.CliEti, TM1.CliUrg, TM1.CliPer, TM1.CliRef, TM1.CliCue, TM1.CliRieCon, TM1.CliRieCir, TM1.CliRieMh, TM1.CliFecMh, TM1.CliCanRie, TM1.CliPerFac, TM1.CliAlbAgr, TM1.CliFacCop, T3.ZonGeoNom, TM1.CliTub, TM1.CliCtrl, TM1.CliValA, TM1.CliAlias, TM1.CliEtiEN, TM1.CliEtiCN, TM1.CliEtiCC, TM1.CliDivTra, TM1.CliNumEtSa, TM1.CliNumEtTi, TM1.CliPort, TM1.CliTrnCod, TM1.CliCopAlb, TM1.CliEmail, TM1.CliNom1, TM1.CliCp2, TM1.CliTBon, TM1.CliTipo, TM1.CliDom2, TM1.CliIe, TM1.CliUltMq, TM1.CliEst, TM1.CliP1, TM1.CliP0, TM1.CliEFx, TM1.CliEEm, TM1.CliNumC, TM1.CliAct, TM1.CliEt1, TM1.CliEt2, TM1.CliEt3, TM1.CliEt4, TM1.Cliemf, T4.Dsc_pais, T5.TpOpD, TM1.CodWebId, TM1.CliMailGr, TM1.CliMailPk, TM1.CliMailGrE, TM1.CliMailPkE, TM1.CliPlanUL, TM1.Lb_Linu, TM1.CliUltl, TM1.ClimailPr, TM1.CliPerPr, TM1.CliUltNPz, TM1.EmprCod, TM1.ZonGeoCod, TM1.Cod_pais, TM1.TpOpC, TM1.PrvCod FROM ((((TXPCLIENT TM1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = TM1.PrvCod) INNER JOIN TXPZONGEO T3 ON T3.EmprCod = TM1.EmprCod AND T3.ZonGeoCod = TM1.ZonGeoCod) LEFT JOIN TXPTR0400 T4 ON T4.EmprCod = TM1.EmprCod AND T4.Cod_pais = TM1.Cod_pais) LEFT JOIN TXPOPASEN T5 ON T5.EmprCod = TM1.EmprCod AND T5.TpOpC = TM1.TpOpC) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU9", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU10", "SELECT Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? AND Cod_pais = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU11", "SELECT TpOpD FROM TXPOPASEN WHERE EmprCod = ? AND TpOpC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU12", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ?) ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ?) ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HU16", "INSERT INTO TXPCLIENT(CliCod, CliNif, CliNom, CliDom, CliPob, CliCp, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, CliTub, CliCtrl, CliValA, CliAlias, CliEtiEN, CliEtiCN, CliEtiCC, CliDivTra, CliNumEtSa, CliNumEtTi, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliTipo, CliDom2, CliIe, CliUltMq, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, EmprCod, ZonGeoCod, Cod_pais, TpOpC, PrvCod, CliPagUli, CliImpMin, CliNEti, CliObs1, CliObs2, CliDivCod, CliObs, CliedUl, ClidtUl, ClieiUl, CliifUl, FasExpUtl, CliPreAlq, Lb_Linurc, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, Com_ult, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, CliCEE, TxtObs, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01HU17", "UPDATE TXPCLIENT SET CliNif=?, CliNom=?, CliDom=?, CliPob=?, CliCp=?, CliTel1=?, CliTel2=?, CliTelex=?, CliFax=?, CliIniVac=?, CliFinVac=?, CliDes=?, CliEti=?, CliUrg=?, CliPer=?, CliRef=?, CliCue=?, CliRieCon=?, CliRieCir=?, CliRieMh=?, CliFecMh=?, CliCanRie=?, CliPerFac=?, CliAlbAgr=?, CliFacCop=?, CliTub=?, CliCtrl=?, CliValA=?, CliAlias=?, CliEtiEN=?, CliEtiCN=?, CliEtiCC=?, CliDivTra=?, CliNumEtSa=?, CliNumEtTi=?, CliPort=?, CliTrnCod=?, CliCopAlb=?, CliEmail=?, CliNom1=?, CliCp2=?, CliTBon=?, CliTipo=?, CliDom2=?, CliIe=?, CliUltMq=?, CliEst=?, CliP1=?, CliP0=?, CliEFx=?, CliEEm=?, CliNumC=?, CliAct=?, CliEt1=?, CliEt2=?, CliEt3=?, CliEt4=?, Cliemf=?, CodWebId=?, CliMailGr=?, CliMailPk=?, CliMailGrE=?, CliMailPkE=?, CliPlanUL=?, Lb_Linu=?, CliUltl=?, ClimailPr=?, CliPerPr=?, CliUltNPz=?, ZonGeoCod=?, Cod_pais=?, TpOpC=?, PrvCod=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01HU18", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T01HU19", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU20", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU21", "SELECT Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? AND Cod_pais = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU22", "SELECT TpOpD FROM TXPOPASEN WHERE EmprCod = ? AND TpOpC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HU23", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU24", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU25", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU26", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU27", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU28", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU29", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU30", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU31", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU32", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU33", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU34", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU35", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU36", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU37", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU38", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU39", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU40", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU41", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU42", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU43", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU44", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU45", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU46", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU47", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU48", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU49", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU50", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU51", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU52", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU53", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU54", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU55", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU56", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU57", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU58", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU59", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU60", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU61", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU62", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU63", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU64", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU65", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU66", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU67", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU68", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU69", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU70", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU71", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU72", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU73", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU74", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU75", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU76", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU77", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU78", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU79", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU80", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU81", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU82", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU83", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU84", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HU85", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 15);
               ((String[]) buf[7])[0] = rslt.getString(8, 15);
               ((String[]) buf[8])[0] = rslt.getString(9, 14);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 4);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 12);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               ((String[]) buf[27])[0] = rslt.getString(28, 1);
               ((String[]) buf[28])[0] = rslt.getString(29, 1);
               ((String[]) buf[29])[0] = rslt.getString(30, 16);
               ((String[]) buf[30])[0] = rslt.getString(31, 1);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((String[]) buf[32])[0] = rslt.getString(33, 1);
               ((String[]) buf[33])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(35);
               ((short[]) buf[36])[0] = rslt.getShort(36);
               ((String[]) buf[37])[0] = rslt.getString(37, 1);
               ((short[]) buf[38])[0] = rslt.getShort(38);
               ((byte[]) buf[39])[0] = rslt.getByte(39);
               ((String[]) buf[40])[0] = rslt.getString(40, 40);
               ((String[]) buf[41])[0] = rslt.getString(41, 30);
               ((String[]) buf[42])[0] = rslt.getString(42, 6);
               ((String[]) buf[43])[0] = rslt.getString(43, 2);
               ((String[]) buf[44])[0] = rslt.getString(44, 1);
               ((String[]) buf[45])[0] = rslt.getString(45, 34);
               ((String[]) buf[46])[0] = rslt.getString(46, 20);
               ((short[]) buf[47])[0] = rslt.getShort(47);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((short[]) buf[49])[0] = rslt.getShort(49);
               ((short[]) buf[50])[0] = rslt.getShort(50);
               ((String[]) buf[51])[0] = rslt.getString(51, 1);
               ((String[]) buf[52])[0] = rslt.getString(52, 1);
               ((int[]) buf[53])[0] = rslt.getInt(53);
               ((String[]) buf[54])[0] = rslt.getString(54, 1);
               ((String[]) buf[55])[0] = rslt.getString(55, 1);
               ((String[]) buf[56])[0] = rslt.getString(56, 1);
               ((String[]) buf[57])[0] = rslt.getString(57, 1);
               ((String[]) buf[58])[0] = rslt.getString(58, 1);
               ((String[]) buf[59])[0] = rslt.getString(59, 40);
               ((String[]) buf[60])[0] = rslt.getString(60, 15);
               ((String[]) buf[61])[0] = rslt.getString(61, 100);
               ((String[]) buf[62])[0] = rslt.getString(62, 100);
               ((String[]) buf[63])[0] = rslt.getString(63, 1);
               ((String[]) buf[64])[0] = rslt.getString(64, 1);
               ((short[]) buf[65])[0] = rslt.getShort(65);
               ((short[]) buf[66])[0] = rslt.getShort(66);
               ((short[]) buf[67])[0] = rslt.getShort(67);
               ((String[]) buf[68])[0] = rslt.getString(68, 200);
               ((String[]) buf[69])[0] = rslt.getString(69, 60);
               ((int[]) buf[70])[0] = rslt.getInt(70);
               ((String[]) buf[71])[0] = rslt.getString(71, 3);
               ((short[]) buf[72])[0] = rslt.getShort(72);
               ((short[]) buf[73])[0] = rslt.getShort(73);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(74);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(75);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 15);
               ((String[]) buf[7])[0] = rslt.getString(8, 15);
               ((String[]) buf[8])[0] = rslt.getString(9, 14);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getString(13, 4);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 12);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               ((String[]) buf[27])[0] = rslt.getString(28, 1);
               ((String[]) buf[28])[0] = rslt.getString(29, 1);
               ((String[]) buf[29])[0] = rslt.getString(30, 16);
               ((String[]) buf[30])[0] = rslt.getString(31, 1);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((String[]) buf[32])[0] = rslt.getString(33, 1);
               ((String[]) buf[33])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(35);
               ((short[]) buf[36])[0] = rslt.getShort(36);
               ((String[]) buf[37])[0] = rslt.getString(37, 1);
               ((short[]) buf[38])[0] = rslt.getShort(38);
               ((byte[]) buf[39])[0] = rslt.getByte(39);
               ((String[]) buf[40])[0] = rslt.getString(40, 40);
               ((String[]) buf[41])[0] = rslt.getString(41, 30);
               ((String[]) buf[42])[0] = rslt.getString(42, 6);
               ((String[]) buf[43])[0] = rslt.getString(43, 2);
               ((String[]) buf[44])[0] = rslt.getString(44, 1);
               ((String[]) buf[45])[0] = rslt.getString(45, 34);
               ((String[]) buf[46])[0] = rslt.getString(46, 20);
               ((short[]) buf[47])[0] = rslt.getShort(47);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((short[]) buf[49])[0] = rslt.getShort(49);
               ((short[]) buf[50])[0] = rslt.getShort(50);
               ((String[]) buf[51])[0] = rslt.getString(51, 1);
               ((String[]) buf[52])[0] = rslt.getString(52, 1);
               ((int[]) buf[53])[0] = rslt.getInt(53);
               ((String[]) buf[54])[0] = rslt.getString(54, 1);
               ((String[]) buf[55])[0] = rslt.getString(55, 1);
               ((String[]) buf[56])[0] = rslt.getString(56, 1);
               ((String[]) buf[57])[0] = rslt.getString(57, 1);
               ((String[]) buf[58])[0] = rslt.getString(58, 1);
               ((String[]) buf[59])[0] = rslt.getString(59, 40);
               ((String[]) buf[60])[0] = rslt.getString(60, 15);
               ((String[]) buf[61])[0] = rslt.getString(61, 100);
               ((String[]) buf[62])[0] = rslt.getString(62, 100);
               ((String[]) buf[63])[0] = rslt.getString(63, 1);
               ((String[]) buf[64])[0] = rslt.getString(64, 1);
               ((short[]) buf[65])[0] = rslt.getShort(65);
               ((short[]) buf[66])[0] = rslt.getShort(66);
               ((short[]) buf[67])[0] = rslt.getShort(67);
               ((String[]) buf[68])[0] = rslt.getString(68, 200);
               ((String[]) buf[69])[0] = rslt.getString(69, 60);
               ((int[]) buf[70])[0] = rslt.getInt(70);
               ((String[]) buf[71])[0] = rslt.getString(71, 3);
               ((short[]) buf[72])[0] = rslt.getShort(72);
               ((short[]) buf[73])[0] = rslt.getShort(73);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(74);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(75);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 15);
               ((String[]) buf[9])[0] = rslt.getString(9, 15);
               ((String[]) buf[10])[0] = rslt.getString(10, 14);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((String[]) buf[13])[0] = rslt.getString(13, 4);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getString(18, 12);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(23);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((byte[]) buf[25])[0] = rslt.getByte(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(29, 1);
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((String[]) buf[32])[0] = rslt.getString(31, 1);
               ((String[]) buf[33])[0] = rslt.getString(32, 16);
               ((String[]) buf[34])[0] = rslt.getString(33, 1);
               ((String[]) buf[35])[0] = rslt.getString(34, 1);
               ((String[]) buf[36])[0] = rslt.getString(35, 1);
               ((String[]) buf[37])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(37);
               ((short[]) buf[40])[0] = rslt.getShort(38);
               ((String[]) buf[41])[0] = rslt.getString(39, 1);
               ((short[]) buf[42])[0] = rslt.getShort(40);
               ((byte[]) buf[43])[0] = rslt.getByte(41);
               ((String[]) buf[44])[0] = rslt.getString(42, 40);
               ((String[]) buf[45])[0] = rslt.getString(43, 30);
               ((String[]) buf[46])[0] = rslt.getString(44, 6);
               ((String[]) buf[47])[0] = rslt.getString(45, 2);
               ((String[]) buf[48])[0] = rslt.getString(46, 1);
               ((String[]) buf[49])[0] = rslt.getString(47, 34);
               ((String[]) buf[50])[0] = rslt.getString(48, 20);
               ((short[]) buf[51])[0] = rslt.getShort(49);
               ((String[]) buf[52])[0] = rslt.getString(50, 1);
               ((short[]) buf[53])[0] = rslt.getShort(51);
               ((short[]) buf[54])[0] = rslt.getShort(52);
               ((String[]) buf[55])[0] = rslt.getString(53, 1);
               ((String[]) buf[56])[0] = rslt.getString(54, 1);
               ((int[]) buf[57])[0] = rslt.getInt(55);
               ((String[]) buf[58])[0] = rslt.getString(56, 1);
               ((String[]) buf[59])[0] = rslt.getString(57, 1);
               ((String[]) buf[60])[0] = rslt.getString(58, 1);
               ((String[]) buf[61])[0] = rslt.getString(59, 1);
               ((String[]) buf[62])[0] = rslt.getString(60, 1);
               ((String[]) buf[63])[0] = rslt.getString(61, 40);
               ((String[]) buf[64])[0] = rslt.getString(62, 40);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(63, 40);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(64, 15);
               ((String[]) buf[69])[0] = rslt.getString(65, 100);
               ((String[]) buf[70])[0] = rslt.getString(66, 100);
               ((String[]) buf[71])[0] = rslt.getString(67, 1);
               ((String[]) buf[72])[0] = rslt.getString(68, 1);
               ((short[]) buf[73])[0] = rslt.getShort(69);
               ((short[]) buf[74])[0] = rslt.getShort(70);
               ((short[]) buf[75])[0] = rslt.getShort(71);
               ((String[]) buf[76])[0] = rslt.getString(72, 200);
               ((String[]) buf[77])[0] = rslt.getString(73, 60);
               ((int[]) buf[78])[0] = rslt.getInt(74);
               ((String[]) buf[79])[0] = rslt.getString(75, 3);
               ((short[]) buf[80])[0] = rslt.getShort(76);
               ((short[]) buf[81])[0] = rslt.getShort(77);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(78);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(79);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 63 :
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
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
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
            case 4 :
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
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 20);
               stmt.setString(3, (String)parms[3], 30);
               stmt.setString(4, (String)parms[4], 34);
               stmt.setString(5, (String)parms[5], 30);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 15);
               stmt.setString(8, (String)parms[8], 15);
               stmt.setString(9, (String)parms[9], 14);
               stmt.setString(10, (String)parms[10], 10);
               stmt.setString(11, (String)parms[11], 4);
               stmt.setString(12, (String)parms[12], 4);
               stmt.setString(13, (String)parms[13], 4);
               stmt.setString(14, (String)parms[14], 1);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setString(16, (String)parms[16], 20);
               stmt.setString(17, (String)parms[17], 12);
               stmt.setString(18, (String)parms[18], 8);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 2);
               stmt.setDate(22, (java.util.Date)parms[22]);
               stmt.setByte(23, ((Number) parms[23]).byteValue());
               stmt.setByte(24, ((Number) parms[24]).byteValue());
               stmt.setString(25, (String)parms[25], 1);
               stmt.setByte(26, ((Number) parms[26]).byteValue());
               stmt.setString(27, (String)parms[27], 1);
               stmt.setString(28, (String)parms[28], 1);
               stmt.setString(29, (String)parms[29], 1);
               stmt.setString(30, (String)parms[30], 16);
               stmt.setString(31, (String)parms[31], 1);
               stmt.setString(32, (String)parms[32], 1);
               stmt.setString(33, (String)parms[33], 1);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[35], 1);
               }
               stmt.setShort(35, ((Number) parms[36]).shortValue());
               stmt.setShort(36, ((Number) parms[37]).shortValue());
               stmt.setString(37, (String)parms[38], 1);
               stmt.setShort(38, ((Number) parms[39]).shortValue());
               stmt.setByte(39, ((Number) parms[40]).byteValue());
               stmt.setString(40, (String)parms[41], 40);
               stmt.setString(41, (String)parms[42], 30);
               stmt.setString(42, (String)parms[43], 6);
               stmt.setString(43, (String)parms[44], 2);
               stmt.setString(44, (String)parms[45], 1);
               stmt.setString(45, (String)parms[46], 34);
               stmt.setString(46, (String)parms[47], 20);
               stmt.setShort(47, ((Number) parms[48]).shortValue());
               stmt.setString(48, (String)parms[49], 1);
               stmt.setShort(49, ((Number) parms[50]).shortValue());
               stmt.setShort(50, ((Number) parms[51]).shortValue());
               stmt.setString(51, (String)parms[52], 1);
               stmt.setString(52, (String)parms[53], 1);
               stmt.setInt(53, ((Number) parms[54]).intValue());
               stmt.setString(54, (String)parms[55], 1);
               stmt.setString(55, (String)parms[56], 1);
               stmt.setString(56, (String)parms[57], 1);
               stmt.setString(57, (String)parms[58], 1);
               stmt.setString(58, (String)parms[59], 1);
               stmt.setString(59, (String)parms[60], 40);
               stmt.setString(60, (String)parms[61], 15);
               stmt.setString(61, (String)parms[62], 100);
               stmt.setString(62, (String)parms[63], 100);
               stmt.setString(63, (String)parms[64], 1);
               stmt.setString(64, (String)parms[65], 1);
               stmt.setShort(65, ((Number) parms[66]).shortValue());
               stmt.setShort(66, ((Number) parms[67]).shortValue());
               stmt.setShort(67, ((Number) parms[68]).shortValue());
               stmt.setString(68, (String)parms[69], 200);
               stmt.setString(69, (String)parms[70], 60);
               stmt.setInt(70, ((Number) parms[71]).intValue());
               stmt.setString(71, (String)parms[72], 3);
               stmt.setShort(72, ((Number) parms[73]).shortValue());
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(73, ((Number) parms[75]).shortValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[77]).shortValue());
               }
               stmt.setShort(75, ((Number) parms[78]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 34);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 15);
               stmt.setString(7, (String)parms[6], 15);
               stmt.setString(8, (String)parms[7], 14);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 4);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setString(12, (String)parms[11], 4);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setString(17, (String)parms[16], 8);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setDate(21, (java.util.Date)parms[20]);
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 1);
               stmt.setString(27, (String)parms[26], 1);
               stmt.setString(28, (String)parms[27], 1);
               stmt.setString(29, (String)parms[28], 16);
               stmt.setString(30, (String)parms[29], 1);
               stmt.setString(31, (String)parms[30], 1);
               stmt.setString(32, (String)parms[31], 1);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[33], 1);
               }
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setString(36, (String)parms[36], 1);
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setByte(38, ((Number) parms[38]).byteValue());
               stmt.setString(39, (String)parms[39], 40);
               stmt.setString(40, (String)parms[40], 30);
               stmt.setString(41, (String)parms[41], 6);
               stmt.setString(42, (String)parms[42], 2);
               stmt.setString(43, (String)parms[43], 1);
               stmt.setString(44, (String)parms[44], 34);
               stmt.setString(45, (String)parms[45], 20);
               stmt.setShort(46, ((Number) parms[46]).shortValue());
               stmt.setString(47, (String)parms[47], 1);
               stmt.setShort(48, ((Number) parms[48]).shortValue());
               stmt.setShort(49, ((Number) parms[49]).shortValue());
               stmt.setString(50, (String)parms[50], 1);
               stmt.setString(51, (String)parms[51], 1);
               stmt.setInt(52, ((Number) parms[52]).intValue());
               stmt.setString(53, (String)parms[53], 1);
               stmt.setString(54, (String)parms[54], 1);
               stmt.setString(55, (String)parms[55], 1);
               stmt.setString(56, (String)parms[56], 1);
               stmt.setString(57, (String)parms[57], 1);
               stmt.setString(58, (String)parms[58], 40);
               stmt.setString(59, (String)parms[59], 15);
               stmt.setString(60, (String)parms[60], 100);
               stmt.setString(61, (String)parms[61], 100);
               stmt.setString(62, (String)parms[62], 1);
               stmt.setString(63, (String)parms[63], 1);
               stmt.setShort(64, ((Number) parms[64]).shortValue());
               stmt.setShort(65, ((Number) parms[65]).shortValue());
               stmt.setShort(66, ((Number) parms[66]).shortValue());
               stmt.setString(67, (String)parms[67], 200);
               stmt.setString(68, (String)parms[68], 60);
               stmt.setInt(69, ((Number) parms[69]).intValue());
               stmt.setShort(70, ((Number) parms[70]).shortValue());
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[74]).shortValue());
               }
               stmt.setShort(73, ((Number) parms[75]).shortValue());
               stmt.setString(74, (String)parms[76], 3);
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(75, ((Number) parms[78]).intValue());
               }
               return;
            case 16 :
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
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
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
            case 20 :
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
            case 21 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
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
            case 29 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 61 :
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
            case 62 :
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
            case 63 :
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
            case 64 :
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
            case 65 :
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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

