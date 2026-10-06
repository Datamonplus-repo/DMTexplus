package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tresfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10472ResFasMaq = httpContext.GetPar( "ResFasMaq") ;
         n10472ResFasMaq = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A10472ResFasMaq) ;
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
            A10433ResCod = (int)(GXutil.lval( httpContext.GetPar( "ResCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10433ResCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10433ResCod), 8, 0));
            A10457ResParCod = httpContext.GetPar( "ResParCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10457ResParCod", A10457ResParCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fases de la Reserva", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtResParKgm_Internalname ;
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
      nRC_GXsfl_183 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_183"))) ;
      nGXsfl_183_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_183_idx"))) ;
      sGXsfl_183_idx = httpContext.GetPar( "sGXsfl_183_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tresfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tresfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tresfas_impl.class ));
   }

   public tresfas_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbResTpo = new HTMLChoice();
      cmbResEst = new HTMLChoice();
      cmbResUni = new HTMLChoice();
      chkResPar = UIFactory.getCheckbox(this);
      chkResAgr = UIFactory.getCheckbox(this);
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
      if ( cmbResTpo.getItemCount() > 0 )
      {
         A10434ResTpo = cmbResTpo.getValidValue(A10434ResTpo) ;
         n10434ResTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Values", cmbResTpo.ToJavascriptSource(), true);
      }
      if ( cmbResEst.getItemCount() > 0 )
      {
         A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValidValue(GXutil.trim( GXutil.str( A10435ResEst, 1, 0))))) ;
         n10435ResEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Values", cmbResEst.ToJavascriptSource(), true);
      }
      if ( cmbResUni.getItemCount() > 0 )
      {
         A10455ResUni = cmbResUni.getValidValue(A10455ResUni) ;
         n10455ResUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Values", cmbResUni.ToJavascriptSource(), true);
      }
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      A10461ResAgr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10461ResAgr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TResFas.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Reserva", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10433ResCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10433ResCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10433ResCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResCod_Jsonclick, 0, "", "", "", "", "", 1, edtResCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbResTpo, cmbResTpo.getInternalname(), GXutil.rtrim( A10434ResTpo), 1, cmbResTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbResTpo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TResFas.htm");
      cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Values", cmbResTpo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbResEst, cmbResEst.getInternalname(), GXutil.trim( GXutil.str( A10435ResEst, 1, 0)), 1, cmbResEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbResEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TResFas.htm");
      cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Values", cmbResEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Externo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResNum_Internalname, GXutil.rtrim( A10436ResNum), GXutil.rtrim( localUtil.format( A10436ResNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResNum_Jsonclick, 0, "", "", "", "", "", 1, edtResNum_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha de la Reserva", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtResFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResFch_Internalname, localUtil.format(A10437ResFch, "99/99/99"), localUtil.format( A10437ResFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResFch_Jsonclick, 0, "", "", "", "", "", 1, edtResFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtResFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtResFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TResFas.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Compromiso de la Reserva", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtResFchCmp_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResFchCmp_Internalname, localUtil.format(A10438ResFchCmp, "99/99/99"), localUtil.format( A10438ResFchCmp, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResFchCmp_Jsonclick, 0, "", "", "", "", "", 1, edtResFchCmp_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtResFchCmp_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtResFchCmp_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TResFas.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Mínima", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtResFchMin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResFchMin_Internalname, localUtil.ttoc( A10439ResFchMin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10439ResFchMin, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResFchMin_Jsonclick, 0, "", "", "", "", "", 1, edtResFchMin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtResFchMin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtResFchMin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TResFas.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10440ResCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10440ResCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10440ResCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtResCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResCliNom_Internalname, GXutil.rtrim( A10441ResCliNom), GXutil.rtrim( localUtil.format( A10441ResCliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtResCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResArtCod_Internalname, GXutil.rtrim( A10442ResArtCod), GXutil.rtrim( localUtil.format( A10442ResArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtResArtCod_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Desc Artículo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResArtDsc_Internalname, GXutil.rtrim( A10443ResArtDsc), GXutil.rtrim( localUtil.format( A10443ResArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtResArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResColNom_Internalname, GXutil.rtrim( A10444ResColNom), GXutil.rtrim( localUtil.format( A10444ResColNom, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResColNom_Jsonclick, 0, "", "", "", "", "", 1, edtResColNom_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero de Color", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A10445ResColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10445ResColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10445ResColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResColNum_Jsonclick, 0, "", "", "", "", "", 1, edtResColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tipo de Colorante", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A10446ResTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10446ResTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10446ResTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtResTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Tipo de Colorante", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResTipColD_Internalname, GXutil.rtrim( A10447ResTipColD), GXutil.rtrim( localUtil.format( A10447ResTipColD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResTipColD_Jsonclick, 0, "", "", "", "", "", 1, edtResTipColD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Matiz", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResMatCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10448ResMatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResMatCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10448ResMatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10448ResMatCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResMatCod_Jsonclick, 0, "", "", "", "", "", 1, edtResMatCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Desc Matiz", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResMatDsc_Internalname, GXutil.rtrim( A10449ResMatDsc), GXutil.rtrim( localUtil.format( A10449ResMatDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResMatDsc_Jsonclick, 0, "", "", "", "", "", 1, edtResMatDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Intensidad", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10450ResIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10450ResIntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10450ResIntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtResIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Desc Intensidad", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResIntDsc_Internalname, GXutil.rtrim( A10451ResIntDsc), GXutil.rtrim( localUtil.format( A10451ResIntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtResIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10452ResKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResKgm_Enabled!=0) ? localUtil.format( A10452ResKgm, "ZZZZZ9.99") : localUtil.format( A10452ResKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResKgm_Jsonclick, 0, "", "", "", "", "", 1, edtResKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10453ResMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResMtr_Enabled!=0) ? localUtil.format( A10453ResMtr, "ZZZZZ9.99") : localUtil.format( A10453ResMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResMtr_Jsonclick, 0, "", "", "", "", "", 1, edtResMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResPie_Internalname, GXutil.ltrim( localUtil.ntoc( A10454ResPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10454ResPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10454ResPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResPie_Jsonclick, 0, "", "", "", "", "", 1, edtResPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbResUni, cmbResUni.getInternalname(), GXutil.rtrim( A10455ResUni), 1, cmbResUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbResUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TResFas.htm");
      cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Values", cmbResUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkResPar.getInternalname(), GXutil.str( A10456ResPar, 1, 0), "", "", 1, chkResPar.getEnabled(), "1", httpContext.getMessage( "Particionada?", ""), StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Codigo de Partición", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResParCod_Internalname, GXutil.rtrim( A10457ResParCod), GXutil.rtrim( localUtil.format( A10457ResParCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResParCod_Jsonclick, 0, "", "", "", "", "", 1, edtResParCod_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Kilos Partición", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResParKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A10458ResParKgm, "ZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResParKgm_Jsonclick, 0, "", "", "", "", "", 1, edtResParKgm_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Metros Partición", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResParMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A10459ResParMtr, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResParMtr_Jsonclick, 0, "", "", "", "", "", 1, edtResParMtr_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Piezas Partición", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResParPie_Internalname, GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10460ResParPie), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResParPie_Jsonclick, 0, "", "", "", "", "", 1, edtResParPie_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkResAgr.getInternalname(), GXutil.str( A10461ResAgr, 1, 0), "", "", 1, chkResAgr.getEnabled(), "1", httpContext.getMessage( "Agrupada?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(169, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Agrupada Con", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResAgrCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10462ResAgrCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10462ResAgrCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResAgrCod_Jsonclick, 0, "", "", "", "", "", 1, edtResAgrCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Partición de Lider Agrupación", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResAgrPar_Internalname, GXutil.rtrim( A10463ResAgrPar), GXutil.rtrim( localUtil.format( A10463ResAgrPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResAgrPar_Jsonclick, 0, "", "", "", "", "", 1, edtResAgrPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResFas.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol183( ) ;
      nGXsfl_183_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1409 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1409 = (short)(1) ;
            scanStart1861409( ) ;
            while ( RcdFound1409 != 0 )
            {
               init_level_properties1409( ) ;
               getByPrimaryKey1861409( ) ;
               addRow1861409( ) ;
               scanNext1861409( ) ;
            }
            scanEnd1861409( ) ;
            nBlankRcdCount1409 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1861409( ) ;
         standaloneModal1861409( ) ;
         sMode1409 = Gx_mode ;
         while ( nGXsfl_183_idx < nRC_GXsfl_183 )
         {
            bGXsfl_183_Refreshing = true ;
            readRow1861409( ) ;
            edtavnRcdDeleted_1409_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1409_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1409_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1409_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESLIN_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResLin_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPROCOD_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResProCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPRODSC_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResProDsc_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASCOD_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASDSC_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasDsc_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasPla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASPLA_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasPla_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASFCH_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasFch_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasDur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASDUR_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasDur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasDur_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASMAQ_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasMaq_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasMaqD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASMAQD_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasMaqD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasMaqD_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASPRI_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasPri_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            edtResFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASDEC_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasDec_Enabled), 5, 0), !bGXsfl_183_Refreshing);
            if ( ( nRcdExists_1409 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1861409( ) ;
            }
            sendRow1861409( ) ;
            bGXsfl_183_Refreshing = false ;
         }
         Gx_mode = sMode1409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1409 = (short)(5) ;
         nRcdExists_1409 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1861409( ) ;
            while ( RcdFound1409 != 0 )
            {
               sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1831409( ) ;
               init_level_properties1409( ) ;
               standaloneNotModal1861409( ) ;
               getByPrimaryKey1861409( ) ;
               standaloneModal1861409( ) ;
               addRow1861409( ) ;
               scanNext1861409( ) ;
            }
            scanEnd1861409( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1409 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1831409( ) ;
      initAll1861409( ) ;
      init_level_properties1409( ) ;
      nRcdExists_1409 = (short)(0) ;
      nIsMod_1409 = (short)(0) ;
      nRcdDeleted_1409 = (short)(0) ;
      nBlankRcdCount1409 = (short)(nBlankRcdUsr1409+nBlankRcdCount1409) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1409 > 0 )
      {
         standaloneNotModal1861409( ) ;
         standaloneModal1861409( ) ;
         addRow1861409( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtResFasPla_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1409 = (short)(nBlankRcdCount1409-1) ;
      }
      Gx_mode = sMode1409 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResFas.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TResFas.htm");
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
      e111862 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10433ResCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10433ResCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10457ResParCod = httpContext.cgiGet( "Z10457ResParCod") ;
            Z10458ResParKgm = localUtil.ctond( httpContext.cgiGet( "Z10458ResParKgm")) ;
            Z10459ResParMtr = localUtil.ctond( httpContext.cgiGet( "Z10459ResParMtr")) ;
            Z10460ResParPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z10460ResParPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10461ResAgr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10461ResAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10462ResAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10462ResAgrCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10463ResAgrPar = httpContext.cgiGet( "Z10463ResAgrPar") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_183 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_183"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N10458ResParKgm = localUtil.ctond( httpContext.cgiGet( "N10458ResParKgm")) ;
            N10459ResParMtr = localUtil.ctond( httpContext.cgiGet( "N10459ResParMtr")) ;
            N10460ResParPie = (int)(localUtil.ctol( httpContext.cgiGet( "N10460ResParPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10433ResCod = (int)(localUtil.ctol( httpContext.cgiGet( edtResCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10433ResCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10433ResCod), 8, 0));
            cmbResTpo.setName( cmbResTpo.getInternalname() );
            cmbResTpo.setValue( httpContext.cgiGet( cmbResTpo.getInternalname()) );
            A10434ResTpo = httpContext.cgiGet( cmbResTpo.getInternalname()) ;
            n10434ResTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
            cmbResEst.setName( cmbResEst.getInternalname() );
            cmbResEst.setValue( httpContext.cgiGet( cmbResEst.getInternalname()) );
            A10435ResEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbResEst.getInternalname()))) ;
            n10435ResEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
            A10436ResNum = httpContext.cgiGet( edtResNum_Internalname) ;
            n10436ResNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
            A10437ResFch = localUtil.ctod( httpContext.cgiGet( edtResFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n10437ResFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
            A10438ResFchCmp = localUtil.ctod( httpContext.cgiGet( edtResFchCmp_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n10438ResFchCmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
            A10439ResFchMin = localUtil.ctot( httpContext.cgiGet( edtResFchMin_Internalname)) ;
            n10439ResFchMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10440ResCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtResCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10440ResCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
            A10441ResCliNom = httpContext.cgiGet( edtResCliNom_Internalname) ;
            n10441ResCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
            A10442ResArtCod = httpContext.cgiGet( edtResArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
            A10443ResArtDsc = httpContext.cgiGet( edtResArtDsc_Internalname) ;
            n10443ResArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
            A10444ResColNom = GXutil.upper( httpContext.cgiGet( edtResColNom_Internalname)) ;
            n10444ResColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
            A10445ResColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtResColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10445ResColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
            A10446ResTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtResTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10446ResTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
            A10447ResTipColD = httpContext.cgiGet( edtResTipColD_Internalname) ;
            n10447ResTipColD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
            A10448ResMatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtResMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10448ResMatCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
            A10449ResMatDsc = httpContext.cgiGet( edtResMatDsc_Internalname) ;
            n10449ResMatDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
            A10450ResIntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtResIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10450ResIntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
            A10451ResIntDsc = httpContext.cgiGet( edtResIntDsc_Internalname) ;
            n10451ResIntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
            A10452ResKgm = localUtil.ctond( httpContext.cgiGet( edtResKgm_Internalname)) ;
            n10452ResKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
            A10453ResMtr = localUtil.ctond( httpContext.cgiGet( edtResMtr_Internalname)) ;
            n10453ResMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
            A10454ResPie = (int)(localUtil.ctol( httpContext.cgiGet( edtResPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10454ResPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
            cmbResUni.setName( cmbResUni.getInternalname() );
            cmbResUni.setValue( httpContext.cgiGet( cmbResUni.getInternalname()) );
            A10455ResUni = httpContext.cgiGet( cmbResUni.getInternalname()) ;
            n10455ResUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
            A10456ResPar = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkResPar.getInternalname()), "1")==0) ? 1 : 0)) ;
            n10456ResPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
            A10457ResParCod = httpContext.cgiGet( edtResParCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10457ResParCod", A10457ResParCod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtResParKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtResParKgm_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESPARKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResParKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10458ResParKgm = DecimalUtil.ZERO ;
               n10458ResParKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10458ResParKgm", GXutil.ltrimstr( A10458ResParKgm, 8, 2));
            }
            else
            {
               A10458ResParKgm = localUtil.ctond( httpContext.cgiGet( edtResParKgm_Internalname)) ;
               n10458ResParKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10458ResParKgm", GXutil.ltrimstr( A10458ResParKgm, 8, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtResParMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtResParMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESPARMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResParMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10459ResParMtr = DecimalUtil.ZERO ;
               n10459ResParMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10459ResParMtr", GXutil.ltrimstr( A10459ResParMtr, 9, 2));
            }
            else
            {
               A10459ResParMtr = localUtil.ctond( httpContext.cgiGet( edtResParMtr_Internalname)) ;
               n10459ResParMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10459ResParMtr", GXutil.ltrimstr( A10459ResParMtr, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResParPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResParPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESPARPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResParPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10460ResParPie = 0 ;
               n10460ResParPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10460ResParPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10460ResParPie), 6, 0));
            }
            else
            {
               A10460ResParPie = (int)(localUtil.ctol( httpContext.cgiGet( edtResParPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10460ResParPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10460ResParPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10460ResParPie), 6, 0));
            }
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkResAgr.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkResAgr.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESAGR");
               AnyError = (short)(1) ;
               GX_FocusControl = chkResAgr.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10461ResAgr = (byte)(0) ;
               n10461ResAgr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
            }
            else
            {
               A10461ResAgr = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkResAgr.getInternalname()), "1")==0) ? 1 : 0)) ;
               n10461ResAgr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESAGRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10462ResAgrCod = 0 ;
               n10462ResAgrCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10462ResAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10462ResAgrCod), 8, 0));
            }
            else
            {
               A10462ResAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtResAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10462ResAgrCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10462ResAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10462ResAgrCod), 8, 0));
            }
            A10463ResAgrPar = httpContext.cgiGet( edtResAgrPar_Internalname) ;
            n10463ResAgrPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10463ResAgrPar", A10463ResAgrPar);
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
               A10433ResCod = (int)(GXutil.lval( httpContext.GetPar( "ResCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10433ResCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10433ResCod), 8, 0));
               A10457ResParCod = httpContext.GetPar( "ResParCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10457ResParCod", A10457ResParCod);
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
                        e111862 ();
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
            initAll1861408( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1409_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1409_Enabled), 5, 0), !bGXsfl_183_Refreshing);
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
      disableAttributes1861408( ) ;
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

   public void confirm_1860( )
   {
      beforeValidate1861408( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1861408( ) ;
         }
         else
         {
            checkExtendedTable1861408( ) ;
            if ( AnyError == 0 )
            {
               zm1861408( 20) ;
               zm1861408( 21) ;
               zm1861408( 22) ;
               zm1861408( 23) ;
               zm1861408( 24) ;
               zm1861408( 25) ;
               zm1861408( 26) ;
               zm1861408( 27) ;
            }
            closeExtendedTableCursors1861408( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1408 = Gx_mode ;
         confirm_1861409( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1408 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1860( ) ;
      }
   }

   public void confirm_1861409( )
   {
      nGXsfl_183_idx = 0 ;
      while ( nGXsfl_183_idx < nRC_GXsfl_183 )
      {
         readRow1861409( ) ;
         if ( ( nRcdExists_1409 != 0 ) || ( nIsMod_1409 != 0 ) )
         {
            getKey1861409( ) ;
            if ( ( nRcdExists_1409 == 0 ) && ( nRcdDeleted_1409 == 0 ) )
            {
               if ( RcdFound1409 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1861409( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1861409( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1861409( 29) ;
                        zm1861409( 30) ;
                        zm1861409( 31) ;
                     }
                     closeExtendedTableCursors1861409( ) ;
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
               if ( RcdFound1409 != 0 )
               {
                  if ( nRcdDeleted_1409 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1861409( ) ;
                     load1861409( ) ;
                     beforeValidate1861409( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1861409( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1409 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1861409( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1861409( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1861409( 29) ;
                              zm1861409( 30) ;
                              zm1861409( 31) ;
                           }
                           closeExtendedTableCursors1861409( ) ;
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
                  if ( nRcdDeleted_1409 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1409_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10464ResLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResProCod_Internalname, GXutil.rtrim( A10465ResProCod)) ;
         httpContext.changePostValue( edtResProDsc_Internalname, GXutil.rtrim( A10466ResProDsc)) ;
         httpContext.changePostValue( edtResFasCod_Internalname, GXutil.rtrim( A10467ResFasCod)) ;
         httpContext.changePostValue( edtResFasDsc_Internalname, GXutil.rtrim( A10468ResFasDsc)) ;
         httpContext.changePostValue( edtResFasPla_Internalname, GXutil.rtrim( A10469ResFasPla)) ;
         httpContext.changePostValue( edtResFasFch_Internalname, localUtil.ttoc( A10470ResFasFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtResFasDur_Internalname, GXutil.ltrim( localUtil.ntoc( A10471ResFasDur, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResFasMaq_Internalname, GXutil.rtrim( A10472ResFasMaq)) ;
         httpContext.changePostValue( edtResFasMaqD_Internalname, GXutil.rtrim( A10473ResFasMaqD)) ;
         httpContext.changePostValue( edtResFasPri_Internalname, GXutil.ltrim( localUtil.ntoc( A10474ResFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A10475ResFasDec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10464ResLin_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10464ResLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10465ResProCod_"+sGXsfl_183_idx, GXutil.rtrim( Z10465ResProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10467ResFasCod_"+sGXsfl_183_idx, GXutil.rtrim( Z10467ResFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10469ResFasPla_"+sGXsfl_183_idx, GXutil.rtrim( Z10469ResFasPla)) ;
         httpContext.changePostValue( "ZT_"+"Z10470ResFasFch_"+sGXsfl_183_idx, localUtil.ttoc( Z10470ResFasFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10471ResFasDur_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10471ResFasDur, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10472ResFasMaq_"+sGXsfl_183_idx, GXutil.rtrim( Z10472ResFasMaq)) ;
         httpContext.changePostValue( "ZT_"+"Z10474ResFasPri_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10474ResFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10475ResFasDec_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10475ResFasDec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1409_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1409_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1409_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1409 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1409_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1409_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESLIN_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPROCOD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPRODSC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASCOD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASDSC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASPLA_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASFCH_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASDUR_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASMAQ_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASMAQD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaqD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASPRI_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASDEC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1860( )
   {
   }

   public void e111862( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tresfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV14Pgmname, (byte)(99), GXv_char2) ;
      tresfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tresfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tresfas_impl.this.A396EmprCod = GXv_char2[0] ;
      tresfas_impl.this.AV11EmprNom = GXv_char3[0] ;
      tresfas_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV13ResCod = GXutil.trim( GXutil.str( A10433ResCod, 10, 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = AV13ResCod ;
      GXv_char2[0] = A10457ResParCod ;
      GXv_int5[0] = (byte)(0) ;
      new app.pmodton(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
      tresfas_impl.this.A396EmprCod = GXv_char4[0] ;
      tresfas_impl.this.AV13ResCod = GXv_char3[0] ;
      tresfas_impl.this.A10457ResParCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
      httpContext.ajax_rsp_assign_attri("", false, "A10457ResParCod", A10457ResParCod);
   }

   public void zm1861408( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10458ResParKgm = T01868_A10458ResParKgm[0] ;
            Z10459ResParMtr = T01868_A10459ResParMtr[0] ;
            Z10460ResParPie = T01868_A10460ResParPie[0] ;
            Z10461ResAgr = T01868_A10461ResAgr[0] ;
            Z10462ResAgrCod = T01868_A10462ResAgrCod[0] ;
            Z10463ResAgrPar = T01868_A10463ResAgrPar[0] ;
         }
         else
         {
            Z10458ResParKgm = A10458ResParKgm ;
            Z10459ResParMtr = A10459ResParMtr ;
            Z10460ResParPie = A10460ResParPie ;
            Z10461ResAgr = A10461ResAgr ;
            Z10462ResAgrCod = A10462ResAgrCod ;
            Z10463ResAgrPar = A10463ResAgrPar ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z10457ResParCod = A10457ResParCod ;
         Z10458ResParKgm = A10458ResParKgm ;
         Z10459ResParMtr = A10459ResParMtr ;
         Z10460ResParPie = A10460ResParPie ;
         Z10461ResAgr = A10461ResAgr ;
         Z10462ResAgrCod = A10462ResAgrCod ;
         Z10463ResAgrPar = A10463ResAgrPar ;
         Z396EmprCod = A396EmprCod ;
         Z10433ResCod = A10433ResCod ;
         Z407EmprNom = A407EmprNom ;
         Z10434ResTpo = A10434ResTpo ;
         Z10435ResEst = A10435ResEst ;
         Z10436ResNum = A10436ResNum ;
         Z10437ResFch = A10437ResFch ;
         Z10438ResFchCmp = A10438ResFchCmp ;
         Z10439ResFchMin = A10439ResFchMin ;
         Z10445ResColNum = A10445ResColNum ;
         Z10446ResTipCol = A10446ResTipCol ;
         Z10448ResMatCod = A10448ResMatCod ;
         Z10450ResIntCod = A10450ResIntCod ;
         Z10452ResKgm = A10452ResKgm ;
         Z10453ResMtr = A10453ResMtr ;
         Z10454ResPie = A10454ResPie ;
         Z10455ResUni = A10455ResUni ;
         Z10456ResPar = A10456ResPar ;
         Z10444ResColNom = A10444ResColNom ;
         Z10440ResCliCod = A10440ResCliCod ;
         Z10447ResTipColD = A10447ResTipColD ;
         Z10449ResMatDsc = A10449ResMatDsc ;
         Z10451ResIntDsc = A10451ResIntDsc ;
         Z10442ResArtCod = A10442ResArtCod ;
         Z10441ResCliNom = A10441ResCliNom ;
         Z10443ResArtDsc = A10443ResArtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResTpo.getEnabled(), 5, 0), true);
      cmbResEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResEst.getEnabled(), 5, 0), true);
      edtResFchMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchMin_Enabled), 5, 0), true);
      cmbResUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResUni.getEnabled(), 5, 0), true);
      edtResKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResKgm_Enabled), 5, 0), true);
      edtResMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMtr_Enabled), 5, 0), true);
      edtResPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResPie_Enabled), 5, 0), true);
      chkResPar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "Enabled", GXutil.ltrimstr( chkResPar.getEnabled(), 5, 0), true);
      AV14Pgmname = "TResFas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      cmbResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResTpo.getEnabled(), 5, 0), true);
      cmbResEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResEst.getEnabled(), 5, 0), true);
      edtResFchMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchMin_Enabled), 5, 0), true);
      cmbResUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResUni.getEnabled(), 5, 0), true);
      edtResKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResKgm_Enabled), 5, 0), true);
      edtResMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMtr_Enabled), 5, 0), true);
      edtResPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResPie_Enabled), 5, 0), true);
      chkResPar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "Enabled", GXutil.ltrimstr( chkResPar.getEnabled(), 5, 0), true);
      /* Using cursor T01869 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01869_A407EmprNom[0] ;
      n407EmprNom = T01869_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T018610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Reservas Filasur", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCOD");
         AnyError = (short)(1) ;
      }
      A10434ResTpo = T018610_A10434ResTpo[0] ;
      n10434ResTpo = T018610_n10434ResTpo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      A10435ResEst = T018610_A10435ResEst[0] ;
      n10435ResEst = T018610_n10435ResEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      A10436ResNum = T018610_A10436ResNum[0] ;
      n10436ResNum = T018610_n10436ResNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
      A10437ResFch = T018610_A10437ResFch[0] ;
      n10437ResFch = T018610_n10437ResFch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
      A10438ResFchCmp = T018610_A10438ResFchCmp[0] ;
      n10438ResFchCmp = T018610_n10438ResFchCmp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
      A10439ResFchMin = T018610_A10439ResFchMin[0] ;
      n10439ResFchMin = T018610_n10439ResFchMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10445ResColNum = T018610_A10445ResColNum[0] ;
      n10445ResColNum = T018610_n10445ResColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
      A10446ResTipCol = T018610_A10446ResTipCol[0] ;
      n10446ResTipCol = T018610_n10446ResTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
      A10448ResMatCod = T018610_A10448ResMatCod[0] ;
      n10448ResMatCod = T018610_n10448ResMatCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
      A10450ResIntCod = T018610_A10450ResIntCod[0] ;
      n10450ResIntCod = T018610_n10450ResIntCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
      A10452ResKgm = T018610_A10452ResKgm[0] ;
      n10452ResKgm = T018610_n10452ResKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
      A10453ResMtr = T018610_A10453ResMtr[0] ;
      n10453ResMtr = T018610_n10453ResMtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
      A10454ResPie = T018610_A10454ResPie[0] ;
      n10454ResPie = T018610_n10454ResPie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
      A10455ResUni = T018610_A10455ResUni[0] ;
      n10455ResUni = T018610_n10455ResUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      A10456ResPar = T018610_A10456ResPar[0] ;
      n10456ResPar = T018610_n10456ResPar[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      A10444ResColNom = T018610_A10444ResColNom[0] ;
      n10444ResColNom = T018610_n10444ResColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
      A10440ResCliCod = T018610_A10440ResCliCod[0] ;
      n10440ResCliCod = T018610_n10440ResCliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
      pr_default.close(8);
      /* Using cursor T018614 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A10447ResTipColD = T018614_A10447ResTipColD[0] ;
         n10447ResTipColD = T018614_n10447ResTipColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      else
      {
         A10447ResTipColD = "" ;
         n10447ResTipColD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      pr_default.close(12);
      /* Using cursor T018615 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A10449ResMatDsc = T018615_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018615_n10449ResMatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      else
      {
         A10449ResMatDsc = "" ;
         n10449ResMatDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      pr_default.close(13);
      /* Using cursor T018616 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A10451ResIntDsc = T018616_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018616_n10451ResIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      else
      {
         A10451ResIntDsc = "" ;
         n10451ResIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      pr_default.close(14);
      if ( A10456ResPar == 0 )
      {
         edtResParKgm_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), true);
      }
      else
      {
         edtResParKgm_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), true);
      }
      if ( A10456ResPar == 0 )
      {
         edtResParMtr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), true);
      }
      else
      {
         edtResParMtr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), true);
      }
      if ( A10456ResPar == 0 )
      {
         edtResParPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), true);
      }
      else
      {
         edtResParPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), true);
      }
      /* Using cursor T018611 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EstTinCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCLICOD");
         AnyError = (short)(1) ;
      }
      A10442ResArtCod = T018611_A10442ResArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
      pr_default.close(9);
      /* Using cursor T018612 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A10441ResCliNom = T018612_A10441ResCliNom[0] ;
         n10441ResCliNom = T018612_n10441ResCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      else
      {
         A10441ResCliNom = "" ;
         n10441ResCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      pr_default.close(10);
      /* Using cursor T018613 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A10443ResArtDsc = T018613_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T018613_n10443ResArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      else
      {
         A10443ResArtDsc = "" ;
         n10443ResArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      pr_default.close(11);
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

   public void load1861408( )
   {
      /* Using cursor T018617 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1408 = (short)(1) ;
         A407EmprNom = T018617_A407EmprNom[0] ;
         n407EmprNom = T018617_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10434ResTpo = T018617_A10434ResTpo[0] ;
         n10434ResTpo = T018617_n10434ResTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
         A10435ResEst = T018617_A10435ResEst[0] ;
         n10435ResEst = T018617_n10435ResEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
         A10436ResNum = T018617_A10436ResNum[0] ;
         n10436ResNum = T018617_n10436ResNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
         A10437ResFch = T018617_A10437ResFch[0] ;
         n10437ResFch = T018617_n10437ResFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
         A10438ResFchCmp = T018617_A10438ResFchCmp[0] ;
         n10438ResFchCmp = T018617_n10438ResFchCmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
         A10439ResFchMin = T018617_A10439ResFchMin[0] ;
         n10439ResFchMin = T018617_n10439ResFchMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10442ResArtCod = T018617_A10442ResArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
         A10445ResColNum = T018617_A10445ResColNum[0] ;
         n10445ResColNum = T018617_n10445ResColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
         A10446ResTipCol = T018617_A10446ResTipCol[0] ;
         n10446ResTipCol = T018617_n10446ResTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
         A10448ResMatCod = T018617_A10448ResMatCod[0] ;
         n10448ResMatCod = T018617_n10448ResMatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
         A10450ResIntCod = T018617_A10450ResIntCod[0] ;
         n10450ResIntCod = T018617_n10450ResIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
         A10452ResKgm = T018617_A10452ResKgm[0] ;
         n10452ResKgm = T018617_n10452ResKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
         A10453ResMtr = T018617_A10453ResMtr[0] ;
         n10453ResMtr = T018617_n10453ResMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
         A10454ResPie = T018617_A10454ResPie[0] ;
         n10454ResPie = T018617_n10454ResPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
         A10455ResUni = T018617_A10455ResUni[0] ;
         n10455ResUni = T018617_n10455ResUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
         A10456ResPar = T018617_A10456ResPar[0] ;
         n10456ResPar = T018617_n10456ResPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
         A10458ResParKgm = T018617_A10458ResParKgm[0] ;
         n10458ResParKgm = T018617_n10458ResParKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10458ResParKgm", GXutil.ltrimstr( A10458ResParKgm, 8, 2));
         A10459ResParMtr = T018617_A10459ResParMtr[0] ;
         n10459ResParMtr = T018617_n10459ResParMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10459ResParMtr", GXutil.ltrimstr( A10459ResParMtr, 9, 2));
         A10460ResParPie = T018617_A10460ResParPie[0] ;
         n10460ResParPie = T018617_n10460ResParPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10460ResParPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10460ResParPie), 6, 0));
         A10461ResAgr = T018617_A10461ResAgr[0] ;
         n10461ResAgr = T018617_n10461ResAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
         A10462ResAgrCod = T018617_A10462ResAgrCod[0] ;
         n10462ResAgrCod = T018617_n10462ResAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10462ResAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10462ResAgrCod), 8, 0));
         A10463ResAgrPar = T018617_A10463ResAgrPar[0] ;
         n10463ResAgrPar = T018617_n10463ResAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10463ResAgrPar", A10463ResAgrPar);
         A10444ResColNom = T018617_A10444ResColNom[0] ;
         n10444ResColNom = T018617_n10444ResColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
         A10440ResCliCod = T018617_A10440ResCliCod[0] ;
         n10440ResCliCod = T018617_n10440ResCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
         A10441ResCliNom = T018617_A10441ResCliNom[0] ;
         n10441ResCliNom = T018617_n10441ResCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
         A10443ResArtDsc = T018617_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T018617_n10443ResArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
         A10447ResTipColD = T018617_A10447ResTipColD[0] ;
         n10447ResTipColD = T018617_n10447ResTipColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
         A10449ResMatDsc = T018617_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018617_n10449ResMatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
         A10451ResIntDsc = T018617_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018617_n10451ResIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
         zm1861408( -19) ;
      }
      pr_default.close(15);
      onLoadActions1861408( ) ;
   }

   public void onLoadActions1861408( )
   {
   }

   public void checkExtendedTable1861408( )
   {
      nIsDirty_1408 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1861408( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1861408( )
   {
      /* Using cursor T018618 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1408 = (short)(1) ;
      }
      else
      {
         RcdFound1408 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01868 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01868_A10457ResParCod[0], A10457ResParCod) == 0 ) && ( GXutil.strcmp(T01868_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01868_A10433ResCod[0] == A10433ResCod ) )
      {
         zm1861408( 19) ;
         RcdFound1408 = (short)(1) ;
         A10458ResParKgm = T01868_A10458ResParKgm[0] ;
         n10458ResParKgm = T01868_n10458ResParKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10458ResParKgm", GXutil.ltrimstr( A10458ResParKgm, 8, 2));
         A10459ResParMtr = T01868_A10459ResParMtr[0] ;
         n10459ResParMtr = T01868_n10459ResParMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10459ResParMtr", GXutil.ltrimstr( A10459ResParMtr, 9, 2));
         A10460ResParPie = T01868_A10460ResParPie[0] ;
         n10460ResParPie = T01868_n10460ResParPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10460ResParPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10460ResParPie), 6, 0));
         A10461ResAgr = T01868_A10461ResAgr[0] ;
         n10461ResAgr = T01868_n10461ResAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
         A10462ResAgrCod = T01868_A10462ResAgrCod[0] ;
         n10462ResAgrCod = T01868_n10462ResAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10462ResAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10462ResAgrCod), 8, 0));
         A10463ResAgrPar = T01868_A10463ResAgrPar[0] ;
         n10463ResAgrPar = T01868_n10463ResAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10463ResAgrPar", A10463ResAgrPar);
         Z396EmprCod = A396EmprCod ;
         Z10433ResCod = A10433ResCod ;
         Z10457ResParCod = A10457ResParCod ;
         sMode1408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1861408( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1408 = (short)(0) ;
            initializeNonKey1861408( ) ;
         }
         Gx_mode = sMode1408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1408 = (short)(0) ;
         initializeNonKey1861408( ) ;
         sMode1408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1861408( ) ;
      if ( RcdFound1408 == 0 )
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
      RcdFound1408 = (short)(0) ;
      /* Using cursor T018619 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( GXutil.strcmp(T018619_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018619_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T018619_A10457ResParCod[0], A10457ResParCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( GXutil.strcmp(T018619_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018619_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T018619_A10457ResParCod[0], A10457ResParCod) == 0 ) )
         {
            RcdFound1408 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound1408 = (short)(0) ;
      /* Using cursor T018620 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( GXutil.strcmp(T018620_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018620_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T018620_A10457ResParCod[0], A10457ResParCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( GXutil.strcmp(T018620_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018620_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T018620_A10457ResParCod[0], A10457ResParCod) == 0 ) )
         {
            RcdFound1408 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1861408( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtResParKgm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1861408( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1408 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) || ( GXutil.strcmp(A10457ResParCod, Z10457ResParCod) != 0 ) )
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
               GX_FocusControl = edtResParKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1861408( ) ;
               GX_FocusControl = edtResParKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) || ( GXutil.strcmp(A10457ResParCod, Z10457ResParCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtResParKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1861408( ) ;
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
                  GX_FocusControl = edtResParKgm_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1861408( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) || ( GXutil.strcmp(A10457ResParCod, Z10457ResParCod) != 0 ) )
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
         GX_FocusControl = edtResParKgm_Internalname ;
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
      getKey1861408( ) ;
      if ( RcdFound1408 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) || ( GXutil.strcmp(A10457ResParCod, Z10457ResParCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) || ( GXutil.strcmp(A10457ResParCod, Z10457ResParCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tresfas");
      GX_FocusControl = edtResParKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1860( ) ;
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
      if ( RcdFound1408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtResParKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1861408( ) ;
      if ( RcdFound1408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResParKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1861408( ) ;
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
      if ( RcdFound1408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResParKgm_Internalname ;
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
      if ( RcdFound1408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResParKgm_Internalname ;
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
      scanStart1861408( ) ;
      if ( RcdFound1408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1408 != 0 )
         {
            scanNext1861408( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResParKgm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1861408( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1861408( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01867 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResPar"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( DecimalUtil.compareTo(Z10458ResParKgm, T01867_A10458ResParKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z10459ResParMtr, T01867_A10459ResParMtr[0]) != 0 ) || ( Z10460ResParPie != T01867_A10460ResParPie[0] ) || ( Z10461ResAgr != T01867_A10461ResAgr[0] ) || ( Z10462ResAgrCod != T01867_A10462ResAgrCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10463ResAgrPar, T01867_A10463ResAgrPar[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10458ResParKgm, T01867_A10458ResParKgm[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResParKgm");
               GXutil.writeLogRaw("Old: ",Z10458ResParKgm);
               GXutil.writeLogRaw("Current: ",T01867_A10458ResParKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z10459ResParMtr, T01867_A10459ResParMtr[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResParMtr");
               GXutil.writeLogRaw("Old: ",Z10459ResParMtr);
               GXutil.writeLogRaw("Current: ",T01867_A10459ResParMtr[0]);
            }
            if ( Z10460ResParPie != T01867_A10460ResParPie[0] )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResParPie");
               GXutil.writeLogRaw("Old: ",Z10460ResParPie);
               GXutil.writeLogRaw("Current: ",T01867_A10460ResParPie[0]);
            }
            if ( Z10461ResAgr != T01867_A10461ResAgr[0] )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResAgr");
               GXutil.writeLogRaw("Old: ",Z10461ResAgr);
               GXutil.writeLogRaw("Current: ",T01867_A10461ResAgr[0]);
            }
            if ( Z10462ResAgrCod != T01867_A10462ResAgrCod[0] )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResAgrCod");
               GXutil.writeLogRaw("Old: ",Z10462ResAgrCod);
               GXutil.writeLogRaw("Current: ",T01867_A10462ResAgrCod[0]);
            }
            if ( GXutil.strcmp(Z10463ResAgrPar, T01867_A10463ResAgrPar[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResAgrPar");
               GXutil.writeLogRaw("Old: ",Z10463ResAgrPar);
               GXutil.writeLogRaw("Current: ",T01867_A10463ResAgrPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPResPar"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1861408( )
   {
      beforeValidate1861408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1861408( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1861408( 0) ;
         checkOptimisticConcurrency1861408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1861408( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1861408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018621 */
                  pr_default.execute(19, new Object[] {A10457ResParCod, Boolean.valueOf(n10458ResParKgm), A10458ResParKgm, Boolean.valueOf(n10459ResParMtr), A10459ResParMtr, Boolean.valueOf(n10460ResParPie), Integer.valueOf(A10460ResParPie), Boolean.valueOf(n10461ResAgr), Byte.valueOf(A10461ResAgr), Boolean.valueOf(n10462ResAgrCod), Integer.valueOf(A10462ResAgrCod), Boolean.valueOf(n10463ResAgrPar), A10463ResAgrPar, A396EmprCod, Integer.valueOf(A10433ResCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel1861408( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1860( ) ;
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
            load1861408( ) ;
         }
         endLevel1861408( ) ;
      }
      closeExtendedTableCursors1861408( ) ;
   }

   public void update1861408( )
   {
      beforeValidate1861408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1861408( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1861408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1861408( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1861408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018622 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n10458ResParKgm), A10458ResParKgm, Boolean.valueOf(n10459ResParMtr), A10459ResParMtr, Boolean.valueOf(n10460ResParPie), Integer.valueOf(A10460ResParPie), Boolean.valueOf(n10461ResAgr), Byte.valueOf(A10461ResAgr), Boolean.valueOf(n10462ResAgrCod), Integer.valueOf(A10462ResAgrCod), Boolean.valueOf(n10463ResAgrPar), A10463ResAgrPar, A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResPar"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1861408( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1861408( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1860( ) ;
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
         endLevel1861408( ) ;
      }
      closeExtendedTableCursors1861408( ) ;
   }

   public void deferredUpdate1861408( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1861408( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1861408( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1861408( ) ;
         afterConfirm1861408( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1861408( ) ;
            if ( AnyError == 0 )
            {
               scanStart1861409( ) ;
               while ( RcdFound1409 != 0 )
               {
                  getByPrimaryKey1861409( ) ;
                  delete1861409( ) ;
                  scanNext1861409( ) ;
               }
               scanEnd1861409( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018623 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1408 == 0 )
                        {
                           initAll1861408( ) ;
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
                        resetCaption1860( ) ;
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
      sMode1408 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1861408( ) ;
      Gx_mode = sMode1408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1861408( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1861409( )
   {
      nGXsfl_183_idx = 0 ;
      while ( nGXsfl_183_idx < nRC_GXsfl_183 )
      {
         readRow1861409( ) ;
         if ( ( nRcdExists_1409 != 0 ) || ( nIsMod_1409 != 0 ) )
         {
            standaloneNotModal1861409( ) ;
            getKey1861409( ) ;
            if ( ( nRcdExists_1409 == 0 ) && ( nRcdDeleted_1409 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1861409( ) ;
            }
            else
            {
               if ( RcdFound1409 != 0 )
               {
                  if ( ( nRcdDeleted_1409 != 0 ) && ( nRcdExists_1409 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1861409( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1409 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1861409( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1409 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1409_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10464ResLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResProCod_Internalname, GXutil.rtrim( A10465ResProCod)) ;
         httpContext.changePostValue( edtResProDsc_Internalname, GXutil.rtrim( A10466ResProDsc)) ;
         httpContext.changePostValue( edtResFasCod_Internalname, GXutil.rtrim( A10467ResFasCod)) ;
         httpContext.changePostValue( edtResFasDsc_Internalname, GXutil.rtrim( A10468ResFasDsc)) ;
         httpContext.changePostValue( edtResFasPla_Internalname, GXutil.rtrim( A10469ResFasPla)) ;
         httpContext.changePostValue( edtResFasFch_Internalname, localUtil.ttoc( A10470ResFasFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtResFasDur_Internalname, GXutil.ltrim( localUtil.ntoc( A10471ResFasDur, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResFasMaq_Internalname, GXutil.rtrim( A10472ResFasMaq)) ;
         httpContext.changePostValue( edtResFasMaqD_Internalname, GXutil.rtrim( A10473ResFasMaqD)) ;
         httpContext.changePostValue( edtResFasPri_Internalname, GXutil.ltrim( localUtil.ntoc( A10474ResFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A10475ResFasDec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10464ResLin_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10464ResLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10465ResProCod_"+sGXsfl_183_idx, GXutil.rtrim( Z10465ResProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10467ResFasCod_"+sGXsfl_183_idx, GXutil.rtrim( Z10467ResFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10469ResFasPla_"+sGXsfl_183_idx, GXutil.rtrim( Z10469ResFasPla)) ;
         httpContext.changePostValue( "ZT_"+"Z10470ResFasFch_"+sGXsfl_183_idx, localUtil.ttoc( Z10470ResFasFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10471ResFasDur_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10471ResFasDur, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10472ResFasMaq_"+sGXsfl_183_idx, GXutil.rtrim( Z10472ResFasMaq)) ;
         httpContext.changePostValue( "ZT_"+"Z10474ResFasPri_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10474ResFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10475ResFasDec_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( Z10475ResFasDec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1409_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1409_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1409_"+sGXsfl_183_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1409 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1409_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1409_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESLIN_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPROCOD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPRODSC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASCOD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASDSC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASPLA_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASFCH_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASDUR_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASMAQ_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASMAQD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaqD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASPRI_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESFASDEC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1861409( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1409 = (short)(0) ;
      nIsMod_1409 = (short)(0) ;
      nRcdDeleted_1409 = (short)(0) ;
   }

   public void processLevel1861408( )
   {
      /* Save parent mode. */
      sMode1408 = Gx_mode ;
      processNestedLevel1861409( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1861408( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1861408( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tresfas");
         if ( AnyError == 0 )
         {
            confirmValues1860( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tresfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1861408( )
   {
      /* Scan By routine */
      /* Using cursor T018624 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      RcdFound1408 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1408 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1861408( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1408 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1408 = (short)(1) ;
      }
   }

   public void scanEnd1861408( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1861408( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1861408( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1861408( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1861408( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1861408( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1861408( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1861408( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtResCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResCod_Enabled), 5, 0), true);
      cmbResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResTpo.getEnabled(), 5, 0), true);
      cmbResEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResEst.getEnabled(), 5, 0), true);
      edtResNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResNum_Enabled), 5, 0), true);
      edtResFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFch_Enabled), 5, 0), true);
      edtResFchCmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchCmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchCmp_Enabled), 5, 0), true);
      edtResFchMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchMin_Enabled), 5, 0), true);
      edtResCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResCliCod_Enabled), 5, 0), true);
      edtResCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResCliNom_Enabled), 5, 0), true);
      edtResArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResArtCod_Enabled), 5, 0), true);
      edtResArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResArtDsc_Enabled), 5, 0), true);
      edtResColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResColNom_Enabled), 5, 0), true);
      edtResColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResColNum_Enabled), 5, 0), true);
      edtResTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResTipCol_Enabled), 5, 0), true);
      edtResTipColD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResTipColD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResTipColD_Enabled), 5, 0), true);
      edtResMatCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMatCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMatCod_Enabled), 5, 0), true);
      edtResMatDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMatDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMatDsc_Enabled), 5, 0), true);
      edtResIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResIntCod_Enabled), 5, 0), true);
      edtResIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResIntDsc_Enabled), 5, 0), true);
      edtResKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResKgm_Enabled), 5, 0), true);
      edtResMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMtr_Enabled), 5, 0), true);
      edtResPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResPie_Enabled), 5, 0), true);
      cmbResUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResUni.getEnabled(), 5, 0), true);
      chkResPar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "Enabled", GXutil.ltrimstr( chkResPar.getEnabled(), 5, 0), true);
      edtResParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), true);
      edtResParKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), true);
      edtResParMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), true);
      edtResParPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), true);
      chkResAgr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResAgr.getInternalname(), "Enabled", GXutil.ltrimstr( chkResAgr.getEnabled(), 5, 0), true);
      edtResAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResAgrCod_Enabled), 5, 0), true);
      edtResAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResAgrPar_Enabled), 5, 0), true);
   }

   public void zm1861409( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10465ResProCod = T01863_A10465ResProCod[0] ;
            Z10467ResFasCod = T01863_A10467ResFasCod[0] ;
            Z10469ResFasPla = T01863_A10469ResFasPla[0] ;
            Z10470ResFasFch = T01863_A10470ResFasFch[0] ;
            Z10471ResFasDur = T01863_A10471ResFasDur[0] ;
            Z10472ResFasMaq = T01863_A10472ResFasMaq[0] ;
            Z10474ResFasPri = T01863_A10474ResFasPri[0] ;
            Z10475ResFasDec = T01863_A10475ResFasDec[0] ;
         }
         else
         {
            Z10465ResProCod = A10465ResProCod ;
            Z10467ResFasCod = A10467ResFasCod ;
            Z10469ResFasPla = A10469ResFasPla ;
            Z10470ResFasFch = A10470ResFasFch ;
            Z10471ResFasDur = A10471ResFasDur ;
            Z10472ResFasMaq = A10472ResFasMaq ;
            Z10474ResFasPri = A10474ResFasPri ;
            Z10475ResFasDec = A10475ResFasDec ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z10433ResCod = A10433ResCod ;
         Z10457ResParCod = A10457ResParCod ;
         Z10464ResLin = A10464ResLin ;
         Z10465ResProCod = A10465ResProCod ;
         Z10467ResFasCod = A10467ResFasCod ;
         Z10469ResFasPla = A10469ResFasPla ;
         Z10470ResFasFch = A10470ResFasFch ;
         Z10471ResFasDur = A10471ResFasDur ;
         Z10472ResFasMaq = A10472ResFasMaq ;
         Z10474ResFasPri = A10474ResFasPri ;
         Z10475ResFasDec = A10475ResFasDec ;
         Z396EmprCod = A396EmprCod ;
         Z10468ResFasDsc = A10468ResFasDsc ;
         Z10466ResProDsc = A10466ResProDsc ;
         Z10473ResFasMaqD = A10473ResFasMaqD ;
      }
   }

   public void standaloneNotModal1861409( )
   {
      edtResLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResLin_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResProCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
   }

   public void standaloneModal1861409( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden eliminar fases.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01866 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n10465ResProCod), A10465ResProCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A10466ResProDsc = T01866_A10466ResProDsc[0] ;
         n10466ResProDsc = T01866_n10466ResProDsc[0] ;
      }
      else
      {
         A10466ResProDsc = "" ;
         n10466ResProDsc = false ;
      }
      pr_default.close(4);
      /* Using cursor T01865 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n10467ResFasCod), A10467ResFasCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A10468ResFasDsc = T01865_A10468ResFasDsc[0] ;
         n10468ResFasDsc = T01865_n10468ResFasDsc[0] ;
      }
      else
      {
         A10468ResFasDsc = "" ;
         n10468ResFasDsc = false ;
      }
      pr_default.close(3);
   }

   public void load1861409( )
   {
      /* Using cursor T018625 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1409 = (short)(1) ;
         A10465ResProCod = T018625_A10465ResProCod[0] ;
         n10465ResProCod = T018625_n10465ResProCod[0] ;
         A10467ResFasCod = T018625_A10467ResFasCod[0] ;
         n10467ResFasCod = T018625_n10467ResFasCod[0] ;
         A10469ResFasPla = T018625_A10469ResFasPla[0] ;
         n10469ResFasPla = T018625_n10469ResFasPla[0] ;
         A10470ResFasFch = T018625_A10470ResFasFch[0] ;
         n10470ResFasFch = T018625_n10470ResFasFch[0] ;
         A10471ResFasDur = T018625_A10471ResFasDur[0] ;
         n10471ResFasDur = T018625_n10471ResFasDur[0] ;
         A10472ResFasMaq = T018625_A10472ResFasMaq[0] ;
         n10472ResFasMaq = T018625_n10472ResFasMaq[0] ;
         A10474ResFasPri = T018625_A10474ResFasPri[0] ;
         n10474ResFasPri = T018625_n10474ResFasPri[0] ;
         A10475ResFasDec = T018625_A10475ResFasDec[0] ;
         n10475ResFasDec = T018625_n10475ResFasDec[0] ;
         A10473ResFasMaqD = T018625_A10473ResFasMaqD[0] ;
         n10473ResFasMaqD = T018625_n10473ResFasMaqD[0] ;
         A10468ResFasDsc = T018625_A10468ResFasDsc[0] ;
         n10468ResFasDsc = T018625_n10468ResFasDsc[0] ;
         A10466ResProDsc = T018625_A10466ResProDsc[0] ;
         n10466ResProDsc = T018625_n10466ResProDsc[0] ;
         zm1861409( -28) ;
      }
      pr_default.close(23);
      onLoadActions1861409( ) ;
   }

   public void onLoadActions1861409( )
   {
   }

   public void checkExtendedTable1861409( )
   {
      nIsDirty_1409 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1861409( ) ;
      /* Using cursor T01864 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A10473ResFasMaqD = T01864_A10473ResFasMaqD[0] ;
         n10473ResFasMaqD = T01864_n10473ResFasMaqD[0] ;
      }
      else
      {
         nIsDirty_1409 = (short)(1) ;
         A10473ResFasMaqD = "" ;
         n10473ResFasMaqD = false ;
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1861409( )
   {
      pr_default.close(2);
   }

   public void enableDisable1861409( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          String A10472ResFasMaq )
   {
      /* Using cursor T018626 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A10473ResFasMaqD = T018626_A10473ResFasMaqD[0] ;
         n10473ResFasMaqD = T018626_n10473ResFasMaqD[0] ;
      }
      else
      {
         A10473ResFasMaqD = "" ;
         n10473ResFasMaqD = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10473ResFasMaqD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey1861409( )
   {
      /* Using cursor T018627 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1409 = (short)(1) ;
      }
      else
      {
         RcdFound1409 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1861409( )
   {
      /* Using cursor T01863 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01863_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T01863_A10457ResParCod[0], A10457ResParCod) == 0 ) && ( GXutil.strcmp(T01863_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1861409( 28) ;
         RcdFound1409 = (short)(1) ;
         initializeNonKey1861409( ) ;
         A10464ResLin = T01863_A10464ResLin[0] ;
         A10465ResProCod = T01863_A10465ResProCod[0] ;
         n10465ResProCod = T01863_n10465ResProCod[0] ;
         A10467ResFasCod = T01863_A10467ResFasCod[0] ;
         n10467ResFasCod = T01863_n10467ResFasCod[0] ;
         A10469ResFasPla = T01863_A10469ResFasPla[0] ;
         n10469ResFasPla = T01863_n10469ResFasPla[0] ;
         A10470ResFasFch = T01863_A10470ResFasFch[0] ;
         n10470ResFasFch = T01863_n10470ResFasFch[0] ;
         A10471ResFasDur = T01863_A10471ResFasDur[0] ;
         n10471ResFasDur = T01863_n10471ResFasDur[0] ;
         A10472ResFasMaq = T01863_A10472ResFasMaq[0] ;
         n10472ResFasMaq = T01863_n10472ResFasMaq[0] ;
         A10474ResFasPri = T01863_A10474ResFasPri[0] ;
         n10474ResFasPri = T01863_n10474ResFasPri[0] ;
         A10475ResFasDec = T01863_A10475ResFasDec[0] ;
         n10475ResFasDec = T01863_n10475ResFasDec[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10433ResCod = A10433ResCod ;
         Z10457ResParCod = A10457ResParCod ;
         Z10464ResLin = A10464ResLin ;
         sMode1409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1861409( ) ;
         load1861409( ) ;
         Gx_mode = sMode1409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1409 = (short)(0) ;
         initializeNonKey1861409( ) ;
         sMode1409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1861409( ) ;
         Gx_mode = sMode1409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1861409( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1861409( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01862 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResFas"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10465ResProCod, T01862_A10465ResProCod[0]) != 0 ) || ( GXutil.strcmp(Z10467ResFasCod, T01862_A10467ResFasCod[0]) != 0 ) || ( GXutil.strcmp(Z10469ResFasPla, T01862_A10469ResFasPla[0]) != 0 ) || !( GXutil.dateCompare(Z10470ResFasFch, T01862_A10470ResFasFch[0]) ) || ( Z10471ResFasDur != T01862_A10471ResFasDur[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10472ResFasMaq, T01862_A10472ResFasMaq[0]) != 0 ) || ( Z10474ResFasPri != T01862_A10474ResFasPri[0] ) || ( Z10475ResFasDec != T01862_A10475ResFasDec[0] ) )
         {
            if ( GXutil.strcmp(Z10465ResProCod, T01862_A10465ResProCod[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResProCod");
               GXutil.writeLogRaw("Old: ",Z10465ResProCod);
               GXutil.writeLogRaw("Current: ",T01862_A10465ResProCod[0]);
            }
            if ( GXutil.strcmp(Z10467ResFasCod, T01862_A10467ResFasCod[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasCod");
               GXutil.writeLogRaw("Old: ",Z10467ResFasCod);
               GXutil.writeLogRaw("Current: ",T01862_A10467ResFasCod[0]);
            }
            if ( GXutil.strcmp(Z10469ResFasPla, T01862_A10469ResFasPla[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasPla");
               GXutil.writeLogRaw("Old: ",Z10469ResFasPla);
               GXutil.writeLogRaw("Current: ",T01862_A10469ResFasPla[0]);
            }
            if ( !( GXutil.dateCompare(Z10470ResFasFch, T01862_A10470ResFasFch[0]) ) )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasFch");
               GXutil.writeLogRaw("Old: ",Z10470ResFasFch);
               GXutil.writeLogRaw("Current: ",T01862_A10470ResFasFch[0]);
            }
            if ( Z10471ResFasDur != T01862_A10471ResFasDur[0] )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasDur");
               GXutil.writeLogRaw("Old: ",Z10471ResFasDur);
               GXutil.writeLogRaw("Current: ",T01862_A10471ResFasDur[0]);
            }
            if ( GXutil.strcmp(Z10472ResFasMaq, T01862_A10472ResFasMaq[0]) != 0 )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasMaq");
               GXutil.writeLogRaw("Old: ",Z10472ResFasMaq);
               GXutil.writeLogRaw("Current: ",T01862_A10472ResFasMaq[0]);
            }
            if ( Z10474ResFasPri != T01862_A10474ResFasPri[0] )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasPri");
               GXutil.writeLogRaw("Old: ",Z10474ResFasPri);
               GXutil.writeLogRaw("Current: ",T01862_A10474ResFasPri[0]);
            }
            if ( Z10475ResFasDec != T01862_A10475ResFasDec[0] )
            {
               GXutil.writeLogln("tresfas:[seudo value changed for attri]"+"ResFasDec");
               GXutil.writeLogRaw("Old: ",Z10475ResFasDec);
               GXutil.writeLogRaw("Current: ",T01862_A10475ResFasDec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPResFas"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1861409( )
   {
      beforeValidate1861409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1861409( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1861409( 0) ;
         checkOptimisticConcurrency1861409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1861409( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1861409( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018628 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin), Boolean.valueOf(n10465ResProCod), A10465ResProCod, Boolean.valueOf(n10467ResFasCod), A10467ResFasCod, Boolean.valueOf(n10469ResFasPla), A10469ResFasPla, Boolean.valueOf(n10470ResFasFch), A10470ResFasFch, Boolean.valueOf(n10471ResFasDur), Integer.valueOf(A10471ResFasDur), Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq, Boolean.valueOf(n10474ResFasPri), Byte.valueOf(A10474ResFasPri), Boolean.valueOf(n10475ResFasDec), Integer.valueOf(A10475ResFasDec), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFas");
                  if ( (pr_default.getStatus(26) == 1) )
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
            load1861409( ) ;
         }
         endLevel1861409( ) ;
      }
      closeExtendedTableCursors1861409( ) ;
   }

   public void update1861409( )
   {
      beforeValidate1861409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1861409( ) ;
      }
      if ( ( nIsMod_1409 != 0 ) || ( nIsDirty_1409 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1861409( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1861409( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1861409( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018629 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n10465ResProCod), A10465ResProCod, Boolean.valueOf(n10467ResFasCod), A10467ResFasCod, Boolean.valueOf(n10469ResFasPla), A10469ResFasPla, Boolean.valueOf(n10470ResFasFch), A10470ResFasFch, Boolean.valueOf(n10471ResFasDur), Integer.valueOf(A10471ResFasDur), Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq, Boolean.valueOf(n10474ResFasPri), Byte.valueOf(A10474ResFasPri), Boolean.valueOf(n10475ResFasDec), Integer.valueOf(A10475ResFasDec), A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFas");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResFas"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1861409( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1861409( ) ;
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
            endLevel1861409( ) ;
         }
      }
      closeExtendedTableCursors1861409( ) ;
   }

   public void deferredUpdate1861409( )
   {
   }

   public void delete1861409( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1861409( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1861409( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1861409( ) ;
         afterConfirm1861409( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1861409( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018630 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFas");
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
      sMode1409 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1861409( ) ;
      Gx_mode = sMode1409 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1861409( )
   {
      standaloneModal1861409( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T018631 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A10473ResFasMaqD = T018631_A10473ResFasMaqD[0] ;
            n10473ResFasMaqD = T018631_n10473ResFasMaqD[0] ;
         }
         else
         {
            A10473ResFasMaqD = "" ;
            n10473ResFasMaqD = false ;
         }
         pr_default.close(29);
      }
   }

   public void endLevel1861409( )
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

   public void scanStart1861409( )
   {
      /* Scan By routine */
      /* Using cursor T018632 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      RcdFound1409 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1409 = (short)(1) ;
         A10464ResLin = T018632_A10464ResLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1861409( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1409 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1409 = (short)(1) ;
         A10464ResLin = T018632_A10464ResLin[0] ;
      }
   }

   public void scanEnd1861409( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1861409( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1861409( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1861409( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1861409( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1861409( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1861409( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1861409( )
   {
      edtResLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResLin_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResProCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResProDsc_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasDsc_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasPla_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasFch_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasDur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasDur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasDur_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasMaq_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasMaqD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasMaqD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasMaqD_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasPri_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasDec_Enabled), 5, 0), !bGXsfl_183_Refreshing);
   }

   public void send_integrity_lvl_hashes1861409( )
   {
   }

   public void send_integrity_lvl_hashes1861408( )
   {
   }

   public void subsflControlProps_1831409( )
   {
      edtavnRcdDeleted_1409_Internalname = "vNRCDDELETED_1409_"+sGXsfl_183_idx ;
      edtResLin_Internalname = "RESLIN_"+sGXsfl_183_idx ;
      edtResProCod_Internalname = "RESPROCOD_"+sGXsfl_183_idx ;
      edtResProDsc_Internalname = "RESPRODSC_"+sGXsfl_183_idx ;
      edtResFasCod_Internalname = "RESFASCOD_"+sGXsfl_183_idx ;
      edtResFasDsc_Internalname = "RESFASDSC_"+sGXsfl_183_idx ;
      edtResFasPla_Internalname = "RESFASPLA_"+sGXsfl_183_idx ;
      edtResFasFch_Internalname = "RESFASFCH_"+sGXsfl_183_idx ;
      edtResFasDur_Internalname = "RESFASDUR_"+sGXsfl_183_idx ;
      edtResFasMaq_Internalname = "RESFASMAQ_"+sGXsfl_183_idx ;
      edtResFasMaqD_Internalname = "RESFASMAQD_"+sGXsfl_183_idx ;
      edtResFasPri_Internalname = "RESFASPRI_"+sGXsfl_183_idx ;
      edtResFasDec_Internalname = "RESFASDEC_"+sGXsfl_183_idx ;
   }

   public void subsflControlProps_fel_1831409( )
   {
      edtavnRcdDeleted_1409_Internalname = "vNRCDDELETED_1409_"+sGXsfl_183_fel_idx ;
      edtResLin_Internalname = "RESLIN_"+sGXsfl_183_fel_idx ;
      edtResProCod_Internalname = "RESPROCOD_"+sGXsfl_183_fel_idx ;
      edtResProDsc_Internalname = "RESPRODSC_"+sGXsfl_183_fel_idx ;
      edtResFasCod_Internalname = "RESFASCOD_"+sGXsfl_183_fel_idx ;
      edtResFasDsc_Internalname = "RESFASDSC_"+sGXsfl_183_fel_idx ;
      edtResFasPla_Internalname = "RESFASPLA_"+sGXsfl_183_fel_idx ;
      edtResFasFch_Internalname = "RESFASFCH_"+sGXsfl_183_fel_idx ;
      edtResFasDur_Internalname = "RESFASDUR_"+sGXsfl_183_fel_idx ;
      edtResFasMaq_Internalname = "RESFASMAQ_"+sGXsfl_183_fel_idx ;
      edtResFasMaqD_Internalname = "RESFASMAQD_"+sGXsfl_183_fel_idx ;
      edtResFasPri_Internalname = "RESFASPRI_"+sGXsfl_183_fel_idx ;
      edtResFasDec_Internalname = "RESFASDEC_"+sGXsfl_183_fel_idx ;
   }

   public void addRow1861409( )
   {
      nGXsfl_183_idx = (int)(nGXsfl_183_idx+1) ;
      sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1831409( ) ;
      sendRow1861409( ) ;
   }

   public void sendRow1861409( )
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
         if ( ((int)((nGXsfl_183_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1409_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1409_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1409), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1409), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1409_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1409_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResLin_Internalname,GXutil.ltrim( localUtil.ntoc( A10464ResLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtResLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10464ResLin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10464ResLin), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResProCod_Internalname,GXutil.rtrim( A10465ResProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResProDsc_Internalname,GXutil.rtrim( A10466ResProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasCod_Internalname,GXutil.rtrim( A10467ResFasCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasDsc_Internalname,GXutil.rtrim( A10468ResFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasPla_Internalname,GXutil.rtrim( A10469ResFasPla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasPla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasFch_Internalname,localUtil.ttoc( A10470ResFasFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10470ResFasFch, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,191);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasDur_Internalname,GXutil.ltrim( localUtil.ntoc( A10471ResFasDur, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtResFasDur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10471ResFasDur), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10471ResFasDur), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,192);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasDur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasDur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 193,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasMaq_Internalname,GXutil.rtrim( A10472ResFasMaq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,193);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasMaq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasMaqD_Internalname,GXutil.rtrim( A10473ResFasMaqD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasMaqD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasMaqD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasPri_Internalname,GXutil.ltrim( localUtil.ntoc( A10474ResFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtResFasPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10474ResFasPri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10474ResFasPri), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,195);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasPri_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1409_" + sGXsfl_183_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 196,'',false,'" + sGXsfl_183_idx + "',183)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A10475ResFasDec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtResFasDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10475ResFasDec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10475ResFasDec), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResFasDec_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(183),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1861409( ) ;
      GXCCtl = "Z10464ResLin_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10464ResLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10465ResProCod_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10465ResProCod));
      GXCCtl = "Z10467ResFasCod_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10467ResFasCod));
      GXCCtl = "Z10469ResFasPla_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10469ResFasPla));
      GXCCtl = "Z10470ResFasFch_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10470ResFasFch, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10471ResFasDur_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10471ResFasDur, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10472ResFasMaq_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10472ResFasMaq));
      GXCCtl = "Z10474ResFasPri_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10474ResFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10475ResFasDec_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10475ResFasDec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1409_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1409_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1409_" + sGXsfl_183_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1409, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1409_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1409_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESLIN_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESPROCOD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESPRODSC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASCOD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASDSC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASPLA_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASFCH_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASDUR_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDur_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASMAQ_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASMAQD_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaqD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASPRI_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPri_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESFASDEC_"+sGXsfl_183_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1861409( )
   {
      nGXsfl_183_idx = (int)(nGXsfl_183_idx+1) ;
      sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1831409( ) ;
      edtavnRcdDeleted_1409_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1409_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESLIN_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPROCOD_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPRODSC_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASCOD_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASDSC_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasPla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASPLA_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASFCH_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasDur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASDUR_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASMAQ_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasMaqD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASMAQD_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASPRI_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESFASDEC_"+sGXsfl_183_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1409_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1409_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1409");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1409_Internalname ;
         wbErr = true ;
         nRcdDeleted_1409 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1409 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1409_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10464ResLin = (int)(localUtil.ctol( httpContext.cgiGet( edtResLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10465ResProCod = httpContext.cgiGet( edtResProCod_Internalname) ;
      n10465ResProCod = false ;
      A10466ResProDsc = httpContext.cgiGet( edtResProDsc_Internalname) ;
      n10466ResProDsc = false ;
      A10467ResFasCod = httpContext.cgiGet( edtResFasCod_Internalname) ;
      n10467ResFasCod = false ;
      A10468ResFasDsc = httpContext.cgiGet( edtResFasDsc_Internalname) ;
      n10468ResFasDsc = false ;
      A10469ResFasPla = httpContext.cgiGet( edtResFasPla_Internalname) ;
      n10469ResFasPla = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtResFasFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "RESFASFCH_" + sGXsfl_183_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResFasFch_Internalname ;
         wbErr = true ;
         A10470ResFasFch = GXutil.resetTime( GXutil.nullDate() );
         n10470ResFasFch = false ;
      }
      else
      {
         A10470ResFasFch = localUtil.ctot( httpContext.cgiGet( edtResFasFch_Internalname)) ;
         n10470ResFasFch = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResFasDur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResFasDur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "RESFASDUR_" + sGXsfl_183_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResFasDur_Internalname ;
         wbErr = true ;
         A10471ResFasDur = 0 ;
         n10471ResFasDur = false ;
      }
      else
      {
         A10471ResFasDur = (int)(localUtil.ctol( httpContext.cgiGet( edtResFasDur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10471ResFasDur = false ;
      }
      A10472ResFasMaq = httpContext.cgiGet( edtResFasMaq_Internalname) ;
      n10472ResFasMaq = false ;
      A10473ResFasMaqD = httpContext.cgiGet( edtResFasMaqD_Internalname) ;
      n10473ResFasMaqD = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "RESFASPRI_" + sGXsfl_183_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResFasPri_Internalname ;
         wbErr = true ;
         A10474ResFasPri = (byte)(0) ;
         n10474ResFasPri = false ;
      }
      else
      {
         A10474ResFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtResFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10474ResFasPri = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResFasDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResFasDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "RESFASDEC_" + sGXsfl_183_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResFasDec_Internalname ;
         wbErr = true ;
         A10475ResFasDec = 0 ;
         n10475ResFasDec = false ;
      }
      else
      {
         A10475ResFasDec = (int)(localUtil.ctol( httpContext.cgiGet( edtResFasDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10475ResFasDec = false ;
      }
      GXCCtl = "Z10464ResLin_" + sGXsfl_183_idx ;
      Z10464ResLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10465ResProCod_" + sGXsfl_183_idx ;
      Z10465ResProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10467ResFasCod_" + sGXsfl_183_idx ;
      Z10467ResFasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10469ResFasPla_" + sGXsfl_183_idx ;
      Z10469ResFasPla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10470ResFasFch_" + sGXsfl_183_idx ;
      Z10470ResFasFch = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10471ResFasDur_" + sGXsfl_183_idx ;
      Z10471ResFasDur = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10472ResFasMaq_" + sGXsfl_183_idx ;
      Z10472ResFasMaq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10474ResFasPri_" + sGXsfl_183_idx ;
      Z10474ResFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10475ResFasDec_" + sGXsfl_183_idx ;
      Z10475ResFasDec = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1409_" + sGXsfl_183_idx ;
      nRcdDeleted_1409 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1409_" + sGXsfl_183_idx ;
      nRcdExists_1409 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1409_" + sGXsfl_183_idx ;
      nIsMod_1409 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtResFasCod_Enabled = edtResFasCod_Enabled ;
      defedtResProCod_Enabled = edtResProCod_Enabled ;
      defedtResLin_Enabled = edtResLin_Enabled ;
   }

   public void confirmValues1860( )
   {
      nGXsfl_183_idx = 0 ;
      sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1831409( ) ;
      while ( nGXsfl_183_idx < nRC_GXsfl_183 )
      {
         nGXsfl_183_idx = (int)(nGXsfl_183_idx+1) ;
         sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1831409( ) ;
         httpContext.changePostValue( "Z10464ResLin_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10464ResLin_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10464ResLin_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10465ResProCod_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10465ResProCod_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10465ResProCod_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10467ResFasCod_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10467ResFasCod_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10467ResFasCod_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10469ResFasPla_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10469ResFasPla_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10469ResFasPla_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10470ResFasFch_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10470ResFasFch_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10470ResFasFch_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10471ResFasDur_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10471ResFasDur_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10471ResFasDur_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10472ResFasMaq_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10472ResFasMaq_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10472ResFasMaq_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10474ResFasPri_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10474ResFasPri_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10474ResFasPri_"+sGXsfl_183_idx) ;
         httpContext.changePostValue( "Z10475ResFasDec_"+sGXsfl_183_idx, httpContext.cgiGet( "ZT_"+"Z10475ResFasDec_"+sGXsfl_183_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10475ResFasDec_"+sGXsfl_183_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tresfas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10433ResCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A10457ResParCod))}, new String[] {"EmprCod","ResCod","ResParCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10433ResCod", GXutil.ltrim( localUtil.ntoc( Z10433ResCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10457ResParCod", GXutil.rtrim( Z10457ResParCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10458ResParKgm", GXutil.ltrim( localUtil.ntoc( Z10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10459ResParMtr", GXutil.ltrim( localUtil.ntoc( Z10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10460ResParPie", GXutil.ltrim( localUtil.ntoc( Z10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10461ResAgr", GXutil.ltrim( localUtil.ntoc( Z10461ResAgr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10462ResAgrCod", GXutil.ltrim( localUtil.ntoc( Z10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10463ResAgrPar", GXutil.rtrim( Z10463ResAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_183", GXutil.ltrim( localUtil.ntoc( nGXsfl_183_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N10458ResParKgm", GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N10459ResParMtr", GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N10460ResParPie", GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
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
      return formatLink("app.tresfas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10433ResCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A10457ResParCod))}, new String[] {"EmprCod","ResCod","ResParCod"})  ;
   }

   public String getPgmname( )
   {
      return "TResFas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fases de la Reserva", "") ;
   }

   public void initializeNonKey1861408( )
   {
      A10458ResParKgm = DecimalUtil.ZERO ;
      n10458ResParKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10458ResParKgm", GXutil.ltrimstr( A10458ResParKgm, 8, 2));
      A10459ResParMtr = DecimalUtil.ZERO ;
      n10459ResParMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10459ResParMtr", GXutil.ltrimstr( A10459ResParMtr, 9, 2));
      A10460ResParPie = 0 ;
      n10460ResParPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10460ResParPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10460ResParPie), 6, 0));
      A10461ResAgr = (byte)(0) ;
      n10461ResAgr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
      A10462ResAgrCod = 0 ;
      n10462ResAgrCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10462ResAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10462ResAgrCod), 8, 0));
      A10463ResAgrPar = "" ;
      n10463ResAgrPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10463ResAgrPar", A10463ResAgrPar);
      Z10458ResParKgm = DecimalUtil.ZERO ;
      Z10459ResParMtr = DecimalUtil.ZERO ;
      Z10460ResParPie = 0 ;
      Z10461ResAgr = (byte)(0) ;
      Z10462ResAgrCod = 0 ;
      Z10463ResAgrPar = "" ;
   }

   public void initAll1861408( )
   {
      initializeNonKey1861408( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1861409( )
   {
      A10473ResFasMaqD = "" ;
      n10473ResFasMaqD = false ;
      A10468ResFasDsc = "" ;
      n10468ResFasDsc = false ;
      A10466ResProDsc = "" ;
      n10466ResProDsc = false ;
      A10465ResProCod = "" ;
      n10465ResProCod = false ;
      A10467ResFasCod = "" ;
      n10467ResFasCod = false ;
      A10469ResFasPla = "" ;
      n10469ResFasPla = false ;
      A10470ResFasFch = GXutil.resetTime( GXutil.nullDate() );
      n10470ResFasFch = false ;
      A10471ResFasDur = 0 ;
      n10471ResFasDur = false ;
      A10472ResFasMaq = "" ;
      n10472ResFasMaq = false ;
      A10474ResFasPri = (byte)(0) ;
      n10474ResFasPri = false ;
      A10475ResFasDec = 0 ;
      n10475ResFasDec = false ;
      Z10465ResProCod = "" ;
      Z10467ResFasCod = "" ;
      Z10469ResFasPla = "" ;
      Z10470ResFasFch = GXutil.resetTime( GXutil.nullDate() );
      Z10471ResFasDur = 0 ;
      Z10472ResFasMaq = "" ;
      Z10474ResFasPri = (byte)(0) ;
      Z10475ResFasDec = 0 ;
   }

   public void initAll1861409( )
   {
      A10464ResLin = 0 ;
      initializeNonKey1861409( ) ;
   }

   public void standaloneModalInsert1861409( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241561858", true, true);
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
      httpContext.AddJavascriptSource("tresfas.js", "?20268241561858", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1409( )
   {
      edtResFasCod_Enabled = defedtResFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFasCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResProCod_Enabled = defedtResProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResProCod_Enabled), 5, 0), !bGXsfl_183_Refreshing);
      edtResLin_Enabled = defedtResLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResLin_Enabled), 5, 0), !bGXsfl_183_Refreshing);
   }

   public void startgridcontrol183( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1409, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1409_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10464ResLin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10465ResProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10466ResProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10467ResFasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10468ResFasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10469ResFasPla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10470ResFasFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10471ResFasDur, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDur_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10472ResFasMaq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10473ResFasMaqD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasMaqD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10474ResFasPri, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasPri_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10475ResFasDec, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtResCod_Internalname = "RESCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      cmbResTpo.setInternalname( "RESTPO" );
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      cmbResEst.setInternalname( "RESEST" );
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtResNum_Internalname = "RESNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtResFch_Internalname = "RESFCH" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtResFchCmp_Internalname = "RESFCHCMP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtResFchMin_Internalname = "RESFCHMIN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtResCliCod_Internalname = "RESCLICOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtResCliNom_Internalname = "RESCLINOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtResArtCod_Internalname = "RESARTCOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtResArtDsc_Internalname = "RESARTDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtResColNom_Internalname = "RESCOLNOM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtResColNum_Internalname = "RESCOLNUM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtResTipCol_Internalname = "RESTIPCOL" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtResTipColD_Internalname = "RESTIPCOLD" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtResMatCod_Internalname = "RESMATCOD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtResMatDsc_Internalname = "RESMATDSC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtResIntCod_Internalname = "RESINTCOD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtResIntDsc_Internalname = "RESINTDSC" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtResKgm_Internalname = "RESKGM" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtResMtr_Internalname = "RESMTR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtResPie_Internalname = "RESPIE" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      cmbResUni.setInternalname( "RESUNI" );
      chkResPar.setInternalname( "RESPAR" );
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtResParCod_Internalname = "RESPARCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtResParKgm_Internalname = "RESPARKGM" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtResParMtr_Internalname = "RESPARMTR" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtResParPie_Internalname = "RESPARPIE" ;
      chkResAgr.setInternalname( "RESAGR" );
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtResAgrCod_Internalname = "RESAGRCOD" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtResAgrPar_Internalname = "RESAGRPAR" ;
      edtavnRcdDeleted_1409_Internalname = "vNRCDDELETED_1409" ;
      edtResLin_Internalname = "RESLIN" ;
      edtResProCod_Internalname = "RESPROCOD" ;
      edtResProDsc_Internalname = "RESPRODSC" ;
      edtResFasCod_Internalname = "RESFASCOD" ;
      edtResFasDsc_Internalname = "RESFASDSC" ;
      edtResFasPla_Internalname = "RESFASPLA" ;
      edtResFasFch_Internalname = "RESFASFCH" ;
      edtResFasDur_Internalname = "RESFASDUR" ;
      edtResFasMaq_Internalname = "RESFASMAQ" ;
      edtResFasMaqD_Internalname = "RESFASMAQD" ;
      edtResFasPri_Internalname = "RESFASPRI" ;
      edtResFasDec_Internalname = "RESFASDEC" ;
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
      Form.setCaption( httpContext.getMessage( "Fases de la Reserva", "") );
      edtResFasDec_Jsonclick = "" ;
      edtResFasPri_Jsonclick = "" ;
      edtResFasMaqD_Jsonclick = "" ;
      edtResFasMaq_Jsonclick = "" ;
      edtResFasDur_Jsonclick = "" ;
      edtResFasFch_Jsonclick = "" ;
      edtResFasPla_Jsonclick = "" ;
      edtResFasDsc_Jsonclick = "" ;
      edtResFasCod_Jsonclick = "" ;
      edtResProDsc_Jsonclick = "" ;
      edtResProCod_Jsonclick = "" ;
      edtResLin_Jsonclick = "" ;
      edtavnRcdDeleted_1409_Jsonclick = "" ;
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
      edtResFasDec_Enabled = 1 ;
      edtResFasPri_Enabled = 1 ;
      edtResFasMaqD_Enabled = 0 ;
      edtResFasMaq_Enabled = 1 ;
      edtResFasDur_Enabled = 1 ;
      edtResFasFch_Enabled = 1 ;
      edtResFasPla_Enabled = 1 ;
      edtResFasDsc_Enabled = 0 ;
      edtResFasCod_Enabled = 0 ;
      edtResProDsc_Enabled = 0 ;
      edtResProCod_Enabled = 0 ;
      edtResLin_Enabled = 0 ;
      edtavnRcdDeleted_1409_Enabled = 1 ;
      edtResAgrPar_Jsonclick = "" ;
      edtResAgrPar_Backcolor = (int)(0xFFFFFF) ;
      edtResAgrPar_Enabled = 1 ;
      edtResAgrCod_Jsonclick = "" ;
      edtResAgrCod_Backcolor = (int)(0xFFFFFF) ;
      edtResAgrCod_Enabled = 1 ;
      chkResAgr.setIBackground( (int)(0xFFFFFF) );
      chkResAgr.setEnabled( 1 );
      edtResParPie_Jsonclick = "" ;
      edtResParPie_Backcolor = (int)(0xFFFFFF) ;
      edtResParPie_Enabled = 1 ;
      edtResParMtr_Jsonclick = "" ;
      edtResParMtr_Backcolor = (int)(0xFFFFFF) ;
      edtResParMtr_Enabled = 1 ;
      edtResParKgm_Jsonclick = "" ;
      edtResParKgm_Backcolor = (int)(0xFFFFFF) ;
      edtResParKgm_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtResParCod_Jsonclick = "" ;
      edtResParCod_Backcolor = (int)(0xFFFFFF) ;
      edtResParCod_Enabled = 0 ;
      chkResPar.setIBackground( (int)(0xFFFFFF) );
      chkResPar.setEnabled( 0 );
      cmbResUni.setJsonclick( "" );
      cmbResUni.setEnabled( 0 );
      cmbResUni.setIBackground( (int)(0xFFFFFF) );
      edtResPie_Jsonclick = "" ;
      edtResPie_Backcolor = (int)(0xFFFFFF) ;
      edtResPie_Enabled = 0 ;
      edtResMtr_Jsonclick = "" ;
      edtResMtr_Backcolor = (int)(0xFFFFFF) ;
      edtResMtr_Enabled = 0 ;
      edtResKgm_Jsonclick = "" ;
      edtResKgm_Backcolor = (int)(0xFFFFFF) ;
      edtResKgm_Enabled = 0 ;
      edtResIntDsc_Jsonclick = "" ;
      edtResIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtResIntDsc_Enabled = 0 ;
      edtResIntCod_Jsonclick = "" ;
      edtResIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtResIntCod_Enabled = 0 ;
      edtResMatDsc_Jsonclick = "" ;
      edtResMatDsc_Backcolor = (int)(0xFFFFFF) ;
      edtResMatDsc_Enabled = 0 ;
      edtResMatCod_Jsonclick = "" ;
      edtResMatCod_Backcolor = (int)(0xFFFFFF) ;
      edtResMatCod_Enabled = 0 ;
      edtResTipColD_Jsonclick = "" ;
      edtResTipColD_Backcolor = (int)(0xFFFFFF) ;
      edtResTipColD_Enabled = 0 ;
      edtResTipCol_Jsonclick = "" ;
      edtResTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtResTipCol_Enabled = 0 ;
      edtResColNum_Jsonclick = "" ;
      edtResColNum_Backcolor = (int)(0xFFFFFF) ;
      edtResColNum_Enabled = 0 ;
      edtResColNom_Jsonclick = "" ;
      edtResColNom_Backcolor = (int)(0xFFFFFF) ;
      edtResColNom_Enabled = 0 ;
      edtResArtDsc_Jsonclick = "" ;
      edtResArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtResArtDsc_Enabled = 0 ;
      edtResArtCod_Jsonclick = "" ;
      edtResArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtResArtCod_Enabled = 0 ;
      edtResCliNom_Jsonclick = "" ;
      edtResCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtResCliNom_Enabled = 0 ;
      edtResCliCod_Jsonclick = "" ;
      edtResCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtResCliCod_Enabled = 0 ;
      edtResFchMin_Jsonclick = "" ;
      edtResFchMin_Backcolor = (int)(0xFFFFFF) ;
      edtResFchMin_Enabled = 0 ;
      edtResFchCmp_Jsonclick = "" ;
      edtResFchCmp_Backcolor = (int)(0xFFFFFF) ;
      edtResFchCmp_Enabled = 0 ;
      edtResFch_Jsonclick = "" ;
      edtResFch_Backcolor = (int)(0xFFFFFF) ;
      edtResFch_Enabled = 0 ;
      edtResNum_Jsonclick = "" ;
      edtResNum_Backcolor = (int)(0xFFFFFF) ;
      edtResNum_Enabled = 0 ;
      cmbResEst.setJsonclick( "" );
      cmbResEst.setEnabled( 0 );
      cmbResEst.setIBackground( (int)(0xFFFFFF) );
      cmbResTpo.setJsonclick( "" );
      cmbResTpo.setEnabled( 0 );
      cmbResTpo.setIBackground( (int)(0xFFFFFF) );
      edtResCod_Jsonclick = "" ;
      edtResCod_Backcolor = (int)(0xFFFFFF) ;
      edtResCod_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1831409( ) ;
      while ( nGXsfl_183_idx <= nRC_GXsfl_183 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1861409( ) ;
         standaloneModal1861409( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1861409( ) ;
         nGXsfl_183_idx = (int)(nGXsfl_183_idx+1) ;
         sGXsfl_183_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_183_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1831409( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbResTpo.setName( "RESTPO" );
      cmbResTpo.setWebtags( "" );
      cmbResTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbResTpo.addItem("P", httpContext.getMessage( "Pronostico", ""), (short)(0));
      if ( cmbResTpo.getItemCount() > 0 )
      {
         A10434ResTpo = cmbResTpo.getValidValue(A10434ResTpo) ;
         n10434ResTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      }
      cmbResEst.setName( "RESEST" );
      cmbResEst.setWebtags( "" );
      cmbResEst.addItem("1", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbResEst.addItem("2", httpContext.getMessage( "Confirmada", ""), (short)(0));
      cmbResEst.addItem("3", httpContext.getMessage( "Cancelada", ""), (short)(0));
      cmbResEst.addItem("4", httpContext.getMessage( "Generada", ""), (short)(0));
      if ( cmbResEst.getItemCount() > 0 )
      {
         A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValidValue(GXutil.trim( GXutil.str( A10435ResEst, 1, 0))))) ;
         n10435ResEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      }
      cmbResUni.setName( "RESUNI" );
      cmbResUni.setWebtags( "" );
      cmbResUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      cmbResUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      if ( cmbResUni.getItemCount() > 0 )
      {
         A10455ResUni = cmbResUni.getValidValue(A10455ResUni) ;
         n10455ResUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      }
      chkResPar.setName( "RESPAR" );
      chkResPar.setWebtags( "" );
      chkResPar.setCaption( httpContext.getMessage( "Particionada?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "TitleCaption", chkResPar.getCaption(), true);
      chkResPar.setCheckedValue( "0" );
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      chkResAgr.setName( "RESAGR" );
      chkResAgr.setWebtags( "" );
      chkResAgr.setCaption( httpContext.getMessage( "Agrupada?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkResAgr.getInternalname(), "TitleCaption", chkResAgr.getCaption(), true);
      chkResAgr.setCheckedValue( "0" );
      A10461ResAgr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10461ResAgr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.str( A10461ResAgr, 1, 0));
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T018633 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018633_A407EmprNom[0] ;
      n407EmprNom = T018633_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(31);
      /* Using cursor T018634 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Reservas Filasur", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCOD");
         AnyError = (short)(1) ;
      }
      A10434ResTpo = T018634_A10434ResTpo[0] ;
      n10434ResTpo = T018634_n10434ResTpo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      A10435ResEst = T018634_A10435ResEst[0] ;
      n10435ResEst = T018634_n10435ResEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      A10436ResNum = T018634_A10436ResNum[0] ;
      n10436ResNum = T018634_n10436ResNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
      A10437ResFch = T018634_A10437ResFch[0] ;
      n10437ResFch = T018634_n10437ResFch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
      A10438ResFchCmp = T018634_A10438ResFchCmp[0] ;
      n10438ResFchCmp = T018634_n10438ResFchCmp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
      A10439ResFchMin = T018634_A10439ResFchMin[0] ;
      n10439ResFchMin = T018634_n10439ResFchMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10445ResColNum = T018634_A10445ResColNum[0] ;
      n10445ResColNum = T018634_n10445ResColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
      A10446ResTipCol = T018634_A10446ResTipCol[0] ;
      n10446ResTipCol = T018634_n10446ResTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
      A10448ResMatCod = T018634_A10448ResMatCod[0] ;
      n10448ResMatCod = T018634_n10448ResMatCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
      A10450ResIntCod = T018634_A10450ResIntCod[0] ;
      n10450ResIntCod = T018634_n10450ResIntCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
      A10452ResKgm = T018634_A10452ResKgm[0] ;
      n10452ResKgm = T018634_n10452ResKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
      A10453ResMtr = T018634_A10453ResMtr[0] ;
      n10453ResMtr = T018634_n10453ResMtr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
      A10454ResPie = T018634_A10454ResPie[0] ;
      n10454ResPie = T018634_n10454ResPie[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
      A10455ResUni = T018634_A10455ResUni[0] ;
      n10455ResUni = T018634_n10455ResUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      A10456ResPar = T018634_A10456ResPar[0] ;
      n10456ResPar = T018634_n10456ResPar[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      A10444ResColNom = T018634_A10444ResColNom[0] ;
      n10444ResColNom = T018634_n10444ResColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
      A10440ResCliCod = T018634_A10440ResCliCod[0] ;
      n10440ResCliCod = T018634_n10440ResCliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
      pr_default.close(32);
      /* Using cursor T018635 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A10447ResTipColD = T018635_A10447ResTipColD[0] ;
         n10447ResTipColD = T018635_n10447ResTipColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      else
      {
         A10447ResTipColD = "" ;
         n10447ResTipColD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      pr_default.close(33);
      /* Using cursor T018636 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         A10449ResMatDsc = T018636_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018636_n10449ResMatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      else
      {
         A10449ResMatDsc = "" ;
         n10449ResMatDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      pr_default.close(34);
      /* Using cursor T018637 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A10451ResIntDsc = T018637_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018637_n10451ResIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      else
      {
         A10451ResIntDsc = "" ;
         n10451ResIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      pr_default.close(35);
      /* Using cursor T018638 */
      pr_default.execute(36, new Object[] {Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EstTinCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCLICOD");
         AnyError = (short)(1) ;
      }
      A10442ResArtCod = T018638_A10442ResArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
      pr_default.close(36);
      /* Using cursor T018639 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         A10441ResCliNom = T018639_A10441ResCliNom[0] ;
         n10441ResCliNom = T018639_n10441ResCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      else
      {
         A10441ResCliNom = "" ;
         n10441ResCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      pr_default.close(37);
      /* Using cursor T018640 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A10443ResArtDsc = T018640_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T018640_n10443ResArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      else
      {
         A10443ResArtDsc = "" ;
         n10443ResArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      pr_default.close(38);
      GX_FocusControl = edtResParKgm_Internalname ;
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

   public void valid_Resparcod( )
   {
      n10467ResFasCod = false ;
      n10465ResProCod = false ;
      n10455ResUni = false ;
      A10455ResUni = cmbResUni.getValue() ;
      n10455ResUni = false ;
      cmbResUni.setValue( A10455ResUni );
      n10435ResEst = false ;
      A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValue())) ;
      n10435ResEst = false ;
      cmbResEst.setValue( GXutil.str( A10435ResEst, 1, 0) );
      n10434ResTpo = false ;
      A10434ResTpo = cmbResTpo.getValue() ;
      n10434ResTpo = false ;
      cmbResTpo.setValue( A10434ResTpo );
      n10446ResTipCol = false ;
      n10448ResMatCod = false ;
      n10450ResIntCod = false ;
      n10456ResPar = false ;
      n10444ResColNom = false ;
      n10440ResCliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbResTpo.getItemCount() > 0 )
      {
         A10434ResTpo = cmbResTpo.getValidValue(A10434ResTpo) ;
         n10434ResTpo = false ;
         cmbResTpo.setValue( A10434ResTpo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
      }
      if ( cmbResEst.getItemCount() > 0 )
      {
         A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValidValue(GXutil.trim( GXutil.str( A10435ResEst, 1, 0))))) ;
         n10435ResEst = false ;
         cmbResEst.setValue( GXutil.str( A10435ResEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
      }
      if ( cmbResUni.getItemCount() > 0 )
      {
         A10455ResUni = cmbResUni.getValidValue(A10455ResUni) ;
         n10455ResUni = false ;
         cmbResUni.setValue( A10455ResUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
      }
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      A10461ResAgr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10461ResAgr = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", GXutil.rtrim( A10441ResCliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", GXutil.rtrim( A10443ResArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", GXutil.rtrim( A10447ResTipColD));
      httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", GXutil.rtrim( A10449ResMatDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", GXutil.rtrim( A10451ResIntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", GXutil.rtrim( A10434ResTpo));
      cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Values", cmbResTpo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.ltrim( localUtil.ntoc( A10435ResEst, (byte)(1), (byte)(0), ".", "")));
      cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Values", cmbResEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", GXutil.rtrim( A10436ResNum));
      httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrim( localUtil.ntoc( A10440ResCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", GXutil.rtrim( A10442ResArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", GXutil.rtrim( A10444ResColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrim( localUtil.ntoc( A10445ResColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrim( localUtil.ntoc( A10446ResTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrim( localUtil.ntoc( A10448ResMatCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrim( localUtil.ntoc( A10450ResIntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrim( localUtil.ntoc( A10452ResKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrim( localUtil.ntoc( A10453ResMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrim( localUtil.ntoc( A10454ResPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", GXutil.rtrim( A10455ResUni));
      cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Values", cmbResUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10458ResParKgm", GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10459ResParMtr", GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10460ResParPie", GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10461ResAgr", GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10462ResAgrCod", GXutil.ltrim( localUtil.ntoc( A10462ResAgrCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10463ResAgrPar", GXutil.rtrim( A10463ResAgrPar));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10433ResCod", GXutil.ltrim( localUtil.ntoc( Z10433ResCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10457ResParCod", GXutil.rtrim( Z10457ResParCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10441ResCliNom", GXutil.rtrim( Z10441ResCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10443ResArtDsc", GXutil.rtrim( Z10443ResArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10447ResTipColD", GXutil.rtrim( Z10447ResTipColD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10449ResMatDsc", GXutil.rtrim( Z10449ResMatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10451ResIntDsc", GXutil.rtrim( Z10451ResIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10434ResTpo", GXutil.rtrim( Z10434ResTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10435ResEst", GXutil.ltrim( localUtil.ntoc( Z10435ResEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10436ResNum", GXutil.rtrim( Z10436ResNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10437ResFch", localUtil.format(Z10437ResFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10438ResFchCmp", localUtil.format(Z10438ResFchCmp, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10439ResFchMin", localUtil.ttoc( Z10439ResFchMin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10440ResCliCod", GXutil.ltrim( localUtil.ntoc( Z10440ResCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10442ResArtCod", GXutil.rtrim( Z10442ResArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10444ResColNom", GXutil.rtrim( Z10444ResColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10445ResColNum", GXutil.ltrim( localUtil.ntoc( Z10445ResColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10446ResTipCol", GXutil.ltrim( localUtil.ntoc( Z10446ResTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10448ResMatCod", GXutil.ltrim( localUtil.ntoc( Z10448ResMatCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10450ResIntCod", GXutil.ltrim( localUtil.ntoc( Z10450ResIntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10452ResKgm", GXutil.ltrim( localUtil.ntoc( Z10452ResKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10453ResMtr", GXutil.ltrim( localUtil.ntoc( Z10453ResMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10454ResPie", GXutil.ltrim( localUtil.ntoc( Z10454ResPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10455ResUni", GXutil.rtrim( Z10455ResUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10456ResPar", GXutil.ltrim( localUtil.ntoc( Z10456ResPar, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10458ResParKgm", GXutil.ltrim( localUtil.ntoc( Z10458ResParKgm, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10459ResParMtr", GXutil.ltrim( localUtil.ntoc( Z10459ResParMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10460ResParPie", GXutil.ltrim( localUtil.ntoc( Z10460ResParPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10461ResAgr", GXutil.ltrim( localUtil.ntoc( Z10461ResAgr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10462ResAgrCod", GXutil.ltrim( localUtil.ntoc( Z10462ResAgrCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10463ResAgrPar", GXutil.rtrim( Z10463ResAgrPar));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Resfasmaq( )
   {
      n10472ResFasMaq = false ;
      n10473ResFasMaqD = false ;
      /* Using cursor T018631 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A10473ResFasMaqD = T018631_A10473ResFasMaqD[0] ;
         n10473ResFasMaqD = T018631_n10473ResFasMaqD[0] ;
      }
      else
      {
         A10473ResFasMaqD = "" ;
         n10473ResFasMaqD = false ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10473ResFasMaqD", GXutil.rtrim( A10473ResFasMaqD));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A10457ResParCod',fld:'RESPARCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESCOD","{handler:'valid_Rescod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESCLICOD","{handler:'valid_Resclicod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESCLICOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESARTCOD","{handler:'valid_Resartcod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESARTCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESCOLNOM","{handler:'valid_Rescolnom',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESCOLNOM",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESTIPCOL","{handler:'valid_Restipcol',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESTIPCOL",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESMATCOD","{handler:'valid_Resmatcod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESMATCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESINTCOD","{handler:'valid_Resintcod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESINTCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESPAR","{handler:'valid_Respar',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESPAR",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESPARCOD","{handler:'valid_Resparcod',iparms:[{av:'A10467ResFasCod',fld:'RESFASCOD',pic:''},{av:'A10465ResProCod',fld:'RESPROCOD',pic:''},{av:'cmbResUni'},{av:'A10455ResUni',fld:'RESUNI',pic:''},{av:'cmbResEst'},{av:'A10435ResEst',fld:'RESEST',pic:'9'},{av:'cmbResTpo'},{av:'A10434ResTpo',fld:'RESTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A10457ResParCod',fld:'RESPARCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A10446ResTipCol',fld:'RESTIPCOL',pic:'Z9'},{av:'A10448ResMatCod',fld:'RESMATCOD',pic:'ZZ9'},{av:'A10450ResIntCod',fld:'RESINTCOD',pic:'Z9'},{av:'A10444ResColNom',fld:'RESCOLNOM',pic:'@!'},{av:'A10440ResCliCod',fld:'RESCLICOD',pic:'ZZZZZ9'},{av:'A10442ResArtCod',fld:'RESARTCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESPARCOD",",oparms:[{av:'A10441ResCliNom',fld:'RESCLINOM',pic:''},{av:'A10443ResArtDsc',fld:'RESARTDSC',pic:''},{av:'A10447ResTipColD',fld:'RESTIPCOLD',pic:''},{av:'A10449ResMatDsc',fld:'RESMATDSC',pic:''},{av:'A10451ResIntDsc',fld:'RESINTDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'cmbResTpo'},{av:'A10434ResTpo',fld:'RESTPO',pic:''},{av:'cmbResEst'},{av:'A10435ResEst',fld:'RESEST',pic:'9'},{av:'A10436ResNum',fld:'RESNUM',pic:''},{av:'A10437ResFch',fld:'RESFCH',pic:''},{av:'A10438ResFchCmp',fld:'RESFCHCMP',pic:''},{av:'A10439ResFchMin',fld:'RESFCHMIN',pic:'99/99/99 99:99'},{av:'A10440ResCliCod',fld:'RESCLICOD',pic:'ZZZZZ9'},{av:'A10442ResArtCod',fld:'RESARTCOD',pic:''},{av:'A10444ResColNom',fld:'RESCOLNOM',pic:'@!'},{av:'A10445ResColNum',fld:'RESCOLNUM',pic:'ZZZZZ9'},{av:'A10446ResTipCol',fld:'RESTIPCOL',pic:'Z9'},{av:'A10448ResMatCod',fld:'RESMATCOD',pic:'ZZ9'},{av:'A10450ResIntCod',fld:'RESINTCOD',pic:'Z9'},{av:'A10452ResKgm',fld:'RESKGM',pic:'ZZZZZ9.99'},{av:'A10453ResMtr',fld:'RESMTR',pic:'ZZZZZ9.99'},{av:'A10454ResPie',fld:'RESPIE',pic:'ZZZZZ9'},{av:'cmbResUni'},{av:'A10455ResUni',fld:'RESUNI',pic:''},{av:'A10458ResParKgm',fld:'RESPARKGM',pic:'ZZZZ9.99'},{av:'A10459ResParMtr',fld:'RESPARMTR',pic:'ZZZZZ9.99'},{av:'A10460ResParPie',fld:'RESPARPIE',pic:'ZZZZZ9'},{av:'A10462ResAgrCod',fld:'RESAGRCOD',pic:'ZZZZZZZ9'},{av:'A10463ResAgrPar',fld:'RESAGRPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10433ResCod'},{av:'Z10457ResParCod'},{av:'Z10441ResCliNom'},{av:'Z10443ResArtDsc'},{av:'Z10447ResTipColD'},{av:'Z10449ResMatDsc'},{av:'Z10451ResIntDsc'},{av:'Z407EmprNom'},{av:'Z10434ResTpo'},{av:'Z10435ResEst'},{av:'Z10436ResNum'},{av:'Z10437ResFch'},{av:'Z10438ResFchCmp'},{av:'Z10439ResFchMin'},{av:'Z10440ResCliCod'},{av:'Z10442ResArtCod'},{av:'Z10444ResColNom'},{av:'Z10445ResColNum'},{av:'Z10446ResTipCol'},{av:'Z10448ResMatCod'},{av:'Z10450ResIntCod'},{av:'Z10452ResKgm'},{av:'Z10453ResMtr'},{av:'Z10454ResPie'},{av:'Z10455ResUni'},{av:'Z10456ResPar'},{av:'Z10458ResParKgm'},{av:'Z10459ResParMtr'},{av:'Z10460ResParPie'},{av:'Z10461ResAgr'},{av:'Z10462ResAgrCod'},{av:'Z10463ResAgrPar'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESLIN","{handler:'valid_Reslin',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESLIN",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESPROCOD","{handler:'valid_Resprocod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESPROCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESFASCOD","{handler:'valid_Resfascod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESFASCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("VALID_RESFASMAQ","{handler:'valid_Resfasmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10472ResFasMaq',fld:'RESFASMAQ',pic:''},{av:'A10473ResFasMaqD',fld:'RESFASMAQD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("VALID_RESFASMAQ",",oparms:[{av:'A10473ResFasMaqD',fld:'RESFASMAQD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Resfasdec',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]");
      setEventMetadata("NULL",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'},{av:'A10461ResAgr',fld:'RESAGR',pic:'9'}]}");
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
      pr_default.close(32);
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(38);
      pr_default.close(33);
      pr_default.close(34);
      pr_default.close(35);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA10457ResParCod = "" ;
      Z396EmprCod = "" ;
      Z10457ResParCod = "" ;
      Z10458ResParKgm = DecimalUtil.ZERO ;
      Z10459ResParMtr = DecimalUtil.ZERO ;
      Z10463ResAgrPar = "" ;
      N10458ResParKgm = DecimalUtil.ZERO ;
      N10459ResParMtr = DecimalUtil.ZERO ;
      Z10465ResProCod = "" ;
      Z10467ResFasCod = "" ;
      Z10469ResFasPla = "" ;
      Z10470ResFasFch = GXutil.resetTime( GXutil.nullDate() );
      Z10472ResFasMaq = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10472ResFasMaq = "" ;
      A10457ResParCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10434ResTpo = "" ;
      A10455ResUni = "" ;
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
      A10436ResNum = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10437ResFch = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A10438ResFchCmp = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10441ResCliNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10442ResArtCod = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10443ResArtDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10444ResColNom = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10447ResTipColD = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10449ResMatDsc = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A10451ResIntDsc = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10452ResKgm = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A10453ResMtr = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A10458ResParKgm = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      A10459ResParMtr = DecimalUtil.ZERO ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A10463ResAgrPar = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1409 = "" ;
      Gx_mode = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV14Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1408 = "" ;
      A10465ResProCod = "" ;
      A10466ResProDsc = "" ;
      A10467ResFasCod = "" ;
      A10468ResFasDsc = "" ;
      A10469ResFasPla = "" ;
      A10470ResFasFch = GXutil.resetTime( GXutil.nullDate() );
      A10473ResFasMaqD = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV13ResCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new byte[1] ;
      Z407EmprNom = "" ;
      Z10434ResTpo = "" ;
      Z10436ResNum = "" ;
      Z10437ResFch = GXutil.nullDate() ;
      Z10438ResFchCmp = GXutil.nullDate() ;
      Z10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      Z10452ResKgm = DecimalUtil.ZERO ;
      Z10453ResMtr = DecimalUtil.ZERO ;
      Z10455ResUni = "" ;
      Z10444ResColNom = "" ;
      Z10447ResTipColD = "" ;
      Z10449ResMatDsc = "" ;
      Z10451ResIntDsc = "" ;
      Z10442ResArtCod = "" ;
      Z10441ResCliNom = "" ;
      Z10443ResArtDsc = "" ;
      T01869_A407EmprNom = new String[] {""} ;
      T01869_n407EmprNom = new boolean[] {false} ;
      T018610_A10434ResTpo = new String[] {""} ;
      T018610_n10434ResTpo = new boolean[] {false} ;
      T018610_A10435ResEst = new byte[1] ;
      T018610_n10435ResEst = new boolean[] {false} ;
      T018610_A10436ResNum = new String[] {""} ;
      T018610_n10436ResNum = new boolean[] {false} ;
      T018610_A10437ResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T018610_n10437ResFch = new boolean[] {false} ;
      T018610_A10438ResFchCmp = new java.util.Date[] {GXutil.nullDate()} ;
      T018610_n10438ResFchCmp = new boolean[] {false} ;
      T018610_A10439ResFchMin = new java.util.Date[] {GXutil.nullDate()} ;
      T018610_n10439ResFchMin = new boolean[] {false} ;
      T018610_A10445ResColNum = new int[1] ;
      T018610_n10445ResColNum = new boolean[] {false} ;
      T018610_A10446ResTipCol = new byte[1] ;
      T018610_n10446ResTipCol = new boolean[] {false} ;
      T018610_A10448ResMatCod = new short[1] ;
      T018610_n10448ResMatCod = new boolean[] {false} ;
      T018610_A10450ResIntCod = new byte[1] ;
      T018610_n10450ResIntCod = new boolean[] {false} ;
      T018610_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018610_n10452ResKgm = new boolean[] {false} ;
      T018610_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018610_n10453ResMtr = new boolean[] {false} ;
      T018610_A10454ResPie = new int[1] ;
      T018610_n10454ResPie = new boolean[] {false} ;
      T018610_A10455ResUni = new String[] {""} ;
      T018610_n10455ResUni = new boolean[] {false} ;
      T018610_A10456ResPar = new byte[1] ;
      T018610_n10456ResPar = new boolean[] {false} ;
      T018610_A10444ResColNom = new String[] {""} ;
      T018610_n10444ResColNom = new boolean[] {false} ;
      T018610_A10440ResCliCod = new int[1] ;
      T018610_n10440ResCliCod = new boolean[] {false} ;
      T018614_A10447ResTipColD = new String[] {""} ;
      T018614_n10447ResTipColD = new boolean[] {false} ;
      T018615_A10449ResMatDsc = new String[] {""} ;
      T018615_n10449ResMatDsc = new boolean[] {false} ;
      T018616_A10451ResIntDsc = new String[] {""} ;
      T018616_n10451ResIntDsc = new boolean[] {false} ;
      T018611_A10442ResArtCod = new String[] {""} ;
      T018612_A10441ResCliNom = new String[] {""} ;
      T018612_n10441ResCliNom = new boolean[] {false} ;
      T018613_A10443ResArtDsc = new String[] {""} ;
      T018613_n10443ResArtDsc = new boolean[] {false} ;
      T018617_A65ArtCod = new String[] {""} ;
      T018617_A252CliCod = new int[1] ;
      T018617_A583IntCod = new byte[1] ;
      T018617_A626MatCod = new short[1] ;
      T018617_A831TipColCod = new byte[1] ;
      T018617_A10457ResParCod = new String[] {""} ;
      T018617_A407EmprNom = new String[] {""} ;
      T018617_n407EmprNom = new boolean[] {false} ;
      T018617_A10434ResTpo = new String[] {""} ;
      T018617_n10434ResTpo = new boolean[] {false} ;
      T018617_A10435ResEst = new byte[1] ;
      T018617_n10435ResEst = new boolean[] {false} ;
      T018617_A10436ResNum = new String[] {""} ;
      T018617_n10436ResNum = new boolean[] {false} ;
      T018617_A10437ResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T018617_n10437ResFch = new boolean[] {false} ;
      T018617_A10438ResFchCmp = new java.util.Date[] {GXutil.nullDate()} ;
      T018617_n10438ResFchCmp = new boolean[] {false} ;
      T018617_A10439ResFchMin = new java.util.Date[] {GXutil.nullDate()} ;
      T018617_n10439ResFchMin = new boolean[] {false} ;
      T018617_A10442ResArtCod = new String[] {""} ;
      T018617_A10445ResColNum = new int[1] ;
      T018617_n10445ResColNum = new boolean[] {false} ;
      T018617_A10446ResTipCol = new byte[1] ;
      T018617_n10446ResTipCol = new boolean[] {false} ;
      T018617_A10448ResMatCod = new short[1] ;
      T018617_n10448ResMatCod = new boolean[] {false} ;
      T018617_A10450ResIntCod = new byte[1] ;
      T018617_n10450ResIntCod = new boolean[] {false} ;
      T018617_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018617_n10452ResKgm = new boolean[] {false} ;
      T018617_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018617_n10453ResMtr = new boolean[] {false} ;
      T018617_A10454ResPie = new int[1] ;
      T018617_n10454ResPie = new boolean[] {false} ;
      T018617_A10455ResUni = new String[] {""} ;
      T018617_n10455ResUni = new boolean[] {false} ;
      T018617_A10456ResPar = new byte[1] ;
      T018617_n10456ResPar = new boolean[] {false} ;
      T018617_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018617_n10458ResParKgm = new boolean[] {false} ;
      T018617_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018617_n10459ResParMtr = new boolean[] {false} ;
      T018617_A10460ResParPie = new int[1] ;
      T018617_n10460ResParPie = new boolean[] {false} ;
      T018617_A10461ResAgr = new byte[1] ;
      T018617_n10461ResAgr = new boolean[] {false} ;
      T018617_A10462ResAgrCod = new int[1] ;
      T018617_n10462ResAgrCod = new boolean[] {false} ;
      T018617_A10463ResAgrPar = new String[] {""} ;
      T018617_n10463ResAgrPar = new boolean[] {false} ;
      T018617_A396EmprCod = new String[] {""} ;
      T018617_A10433ResCod = new int[1] ;
      T018617_A10444ResColNom = new String[] {""} ;
      T018617_n10444ResColNom = new boolean[] {false} ;
      T018617_A10440ResCliCod = new int[1] ;
      T018617_n10440ResCliCod = new boolean[] {false} ;
      T018617_A10441ResCliNom = new String[] {""} ;
      T018617_n10441ResCliNom = new boolean[] {false} ;
      T018617_A10443ResArtDsc = new String[] {""} ;
      T018617_n10443ResArtDsc = new boolean[] {false} ;
      T018617_A10447ResTipColD = new String[] {""} ;
      T018617_n10447ResTipColD = new boolean[] {false} ;
      T018617_A10449ResMatDsc = new String[] {""} ;
      T018617_n10449ResMatDsc = new boolean[] {false} ;
      T018617_A10451ResIntDsc = new String[] {""} ;
      T018617_n10451ResIntDsc = new boolean[] {false} ;
      T018618_A396EmprCod = new String[] {""} ;
      T018618_A10433ResCod = new int[1] ;
      T018618_A10457ResParCod = new String[] {""} ;
      T01868_A10457ResParCod = new String[] {""} ;
      T01868_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01868_n10458ResParKgm = new boolean[] {false} ;
      T01868_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01868_n10459ResParMtr = new boolean[] {false} ;
      T01868_A10460ResParPie = new int[1] ;
      T01868_n10460ResParPie = new boolean[] {false} ;
      T01868_A10461ResAgr = new byte[1] ;
      T01868_n10461ResAgr = new boolean[] {false} ;
      T01868_A10462ResAgrCod = new int[1] ;
      T01868_n10462ResAgrCod = new boolean[] {false} ;
      T01868_A10463ResAgrPar = new String[] {""} ;
      T01868_n10463ResAgrPar = new boolean[] {false} ;
      T01868_A396EmprCod = new String[] {""} ;
      T01868_A10433ResCod = new int[1] ;
      T018619_A396EmprCod = new String[] {""} ;
      T018619_A10433ResCod = new int[1] ;
      T018619_A10457ResParCod = new String[] {""} ;
      T018620_A396EmprCod = new String[] {""} ;
      T018620_A10433ResCod = new int[1] ;
      T018620_A10457ResParCod = new String[] {""} ;
      T01867_A10457ResParCod = new String[] {""} ;
      T01867_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01867_n10458ResParKgm = new boolean[] {false} ;
      T01867_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01867_n10459ResParMtr = new boolean[] {false} ;
      T01867_A10460ResParPie = new int[1] ;
      T01867_n10460ResParPie = new boolean[] {false} ;
      T01867_A10461ResAgr = new byte[1] ;
      T01867_n10461ResAgr = new boolean[] {false} ;
      T01867_A10462ResAgrCod = new int[1] ;
      T01867_n10462ResAgrCod = new boolean[] {false} ;
      T01867_A10463ResAgrPar = new String[] {""} ;
      T01867_n10463ResAgrPar = new boolean[] {false} ;
      T01867_A396EmprCod = new String[] {""} ;
      T01867_A10433ResCod = new int[1] ;
      T018624_A396EmprCod = new String[] {""} ;
      T018624_A10433ResCod = new int[1] ;
      T018624_A10457ResParCod = new String[] {""} ;
      Z10468ResFasDsc = "" ;
      Z10466ResProDsc = "" ;
      Z10473ResFasMaqD = "" ;
      T01866_A10466ResProDsc = new String[] {""} ;
      T01866_n10466ResProDsc = new boolean[] {false} ;
      T01865_A10468ResFasDsc = new String[] {""} ;
      T01865_n10468ResFasDsc = new boolean[] {false} ;
      T018625_A602MaqCod = new String[] {""} ;
      T018625_A758ProCod = new String[] {""} ;
      T018625_A457FasCod = new String[] {""} ;
      T018625_A10433ResCod = new int[1] ;
      T018625_A10457ResParCod = new String[] {""} ;
      T018625_A10464ResLin = new int[1] ;
      T018625_A10465ResProCod = new String[] {""} ;
      T018625_n10465ResProCod = new boolean[] {false} ;
      T018625_A10467ResFasCod = new String[] {""} ;
      T018625_n10467ResFasCod = new boolean[] {false} ;
      T018625_A10469ResFasPla = new String[] {""} ;
      T018625_n10469ResFasPla = new boolean[] {false} ;
      T018625_A10470ResFasFch = new java.util.Date[] {GXutil.nullDate()} ;
      T018625_n10470ResFasFch = new boolean[] {false} ;
      T018625_A10471ResFasDur = new int[1] ;
      T018625_n10471ResFasDur = new boolean[] {false} ;
      T018625_A10472ResFasMaq = new String[] {""} ;
      T018625_n10472ResFasMaq = new boolean[] {false} ;
      T018625_A10474ResFasPri = new byte[1] ;
      T018625_n10474ResFasPri = new boolean[] {false} ;
      T018625_A10475ResFasDec = new int[1] ;
      T018625_n10475ResFasDec = new boolean[] {false} ;
      T018625_A396EmprCod = new String[] {""} ;
      T018625_A10473ResFasMaqD = new String[] {""} ;
      T018625_n10473ResFasMaqD = new boolean[] {false} ;
      T018625_A10468ResFasDsc = new String[] {""} ;
      T018625_n10468ResFasDsc = new boolean[] {false} ;
      T018625_A10466ResProDsc = new String[] {""} ;
      T018625_n10466ResProDsc = new boolean[] {false} ;
      T01864_A10473ResFasMaqD = new String[] {""} ;
      T01864_n10473ResFasMaqD = new boolean[] {false} ;
      T018626_A10473ResFasMaqD = new String[] {""} ;
      T018626_n10473ResFasMaqD = new boolean[] {false} ;
      T018627_A396EmprCod = new String[] {""} ;
      T018627_A10433ResCod = new int[1] ;
      T018627_A10457ResParCod = new String[] {""} ;
      T018627_A10464ResLin = new int[1] ;
      T01863_A10433ResCod = new int[1] ;
      T01863_A10457ResParCod = new String[] {""} ;
      T01863_A10464ResLin = new int[1] ;
      T01863_A10465ResProCod = new String[] {""} ;
      T01863_n10465ResProCod = new boolean[] {false} ;
      T01863_A10467ResFasCod = new String[] {""} ;
      T01863_n10467ResFasCod = new boolean[] {false} ;
      T01863_A10469ResFasPla = new String[] {""} ;
      T01863_n10469ResFasPla = new boolean[] {false} ;
      T01863_A10470ResFasFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01863_n10470ResFasFch = new boolean[] {false} ;
      T01863_A10471ResFasDur = new int[1] ;
      T01863_n10471ResFasDur = new boolean[] {false} ;
      T01863_A10472ResFasMaq = new String[] {""} ;
      T01863_n10472ResFasMaq = new boolean[] {false} ;
      T01863_A10474ResFasPri = new byte[1] ;
      T01863_n10474ResFasPri = new boolean[] {false} ;
      T01863_A10475ResFasDec = new int[1] ;
      T01863_n10475ResFasDec = new boolean[] {false} ;
      T01863_A396EmprCod = new String[] {""} ;
      T01862_A10433ResCod = new int[1] ;
      T01862_A10457ResParCod = new String[] {""} ;
      T01862_A10464ResLin = new int[1] ;
      T01862_A10465ResProCod = new String[] {""} ;
      T01862_n10465ResProCod = new boolean[] {false} ;
      T01862_A10467ResFasCod = new String[] {""} ;
      T01862_n10467ResFasCod = new boolean[] {false} ;
      T01862_A10469ResFasPla = new String[] {""} ;
      T01862_n10469ResFasPla = new boolean[] {false} ;
      T01862_A10470ResFasFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01862_n10470ResFasFch = new boolean[] {false} ;
      T01862_A10471ResFasDur = new int[1] ;
      T01862_n10471ResFasDur = new boolean[] {false} ;
      T01862_A10472ResFasMaq = new String[] {""} ;
      T01862_n10472ResFasMaq = new boolean[] {false} ;
      T01862_A10474ResFasPri = new byte[1] ;
      T01862_n10474ResFasPri = new boolean[] {false} ;
      T01862_A10475ResFasDec = new int[1] ;
      T01862_n10475ResFasDec = new boolean[] {false} ;
      T01862_A396EmprCod = new String[] {""} ;
      T018631_A10473ResFasMaqD = new String[] {""} ;
      T018631_n10473ResFasMaqD = new boolean[] {false} ;
      T018632_A396EmprCod = new String[] {""} ;
      T018632_A10433ResCod = new int[1] ;
      T018632_A10457ResParCod = new String[] {""} ;
      T018632_A10464ResLin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018633_A407EmprNom = new String[] {""} ;
      T018633_n407EmprNom = new boolean[] {false} ;
      T018634_A10434ResTpo = new String[] {""} ;
      T018634_n10434ResTpo = new boolean[] {false} ;
      T018634_A10435ResEst = new byte[1] ;
      T018634_n10435ResEst = new boolean[] {false} ;
      T018634_A10436ResNum = new String[] {""} ;
      T018634_n10436ResNum = new boolean[] {false} ;
      T018634_A10437ResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T018634_n10437ResFch = new boolean[] {false} ;
      T018634_A10438ResFchCmp = new java.util.Date[] {GXutil.nullDate()} ;
      T018634_n10438ResFchCmp = new boolean[] {false} ;
      T018634_A10439ResFchMin = new java.util.Date[] {GXutil.nullDate()} ;
      T018634_n10439ResFchMin = new boolean[] {false} ;
      T018634_A10445ResColNum = new int[1] ;
      T018634_n10445ResColNum = new boolean[] {false} ;
      T018634_A10446ResTipCol = new byte[1] ;
      T018634_n10446ResTipCol = new boolean[] {false} ;
      T018634_A10448ResMatCod = new short[1] ;
      T018634_n10448ResMatCod = new boolean[] {false} ;
      T018634_A10450ResIntCod = new byte[1] ;
      T018634_n10450ResIntCod = new boolean[] {false} ;
      T018634_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018634_n10452ResKgm = new boolean[] {false} ;
      T018634_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018634_n10453ResMtr = new boolean[] {false} ;
      T018634_A10454ResPie = new int[1] ;
      T018634_n10454ResPie = new boolean[] {false} ;
      T018634_A10455ResUni = new String[] {""} ;
      T018634_n10455ResUni = new boolean[] {false} ;
      T018634_A10456ResPar = new byte[1] ;
      T018634_n10456ResPar = new boolean[] {false} ;
      T018634_A10444ResColNom = new String[] {""} ;
      T018634_n10444ResColNom = new boolean[] {false} ;
      T018634_A10440ResCliCod = new int[1] ;
      T018634_n10440ResCliCod = new boolean[] {false} ;
      T018635_A10447ResTipColD = new String[] {""} ;
      T018635_n10447ResTipColD = new boolean[] {false} ;
      T018636_A10449ResMatDsc = new String[] {""} ;
      T018636_n10449ResMatDsc = new boolean[] {false} ;
      T018637_A10451ResIntDsc = new String[] {""} ;
      T018637_n10451ResIntDsc = new boolean[] {false} ;
      T018638_A10442ResArtCod = new String[] {""} ;
      T018639_A10441ResCliNom = new String[] {""} ;
      T018639_n10441ResCliNom = new boolean[] {false} ;
      T018640_A10443ResArtDsc = new String[] {""} ;
      T018640_n10443ResArtDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10457ResParCod = "" ;
      ZZ10441ResCliNom = "" ;
      ZZ10443ResArtDsc = "" ;
      ZZ10447ResTipColD = "" ;
      ZZ10449ResMatDsc = "" ;
      ZZ10451ResIntDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ10434ResTpo = "" ;
      ZZ10436ResNum = "" ;
      ZZ10437ResFch = GXutil.nullDate() ;
      ZZ10438ResFchCmp = GXutil.nullDate() ;
      ZZ10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      ZZ10442ResArtCod = "" ;
      ZZ10444ResColNom = "" ;
      ZZ10452ResKgm = DecimalUtil.ZERO ;
      ZZ10453ResMtr = DecimalUtil.ZERO ;
      ZZ10455ResUni = "" ;
      ZZ10458ResParKgm = DecimalUtil.ZERO ;
      ZZ10459ResParMtr = DecimalUtil.ZERO ;
      ZZ10463ResAgrPar = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tresfas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tresfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tresfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tresfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tresfas__default(),
         new Object[] {
             new Object[] {
            T01862_A10433ResCod, T01862_A10457ResParCod, T01862_A10464ResLin, T01862_A10465ResProCod, T01862_n10465ResProCod, T01862_A10467ResFasCod, T01862_n10467ResFasCod, T01862_A10469ResFasPla, T01862_n10469ResFasPla, T01862_A10470ResFasFch,
            T01862_n10470ResFasFch, T01862_A10471ResFasDur, T01862_n10471ResFasDur, T01862_A10472ResFasMaq, T01862_n10472ResFasMaq, T01862_A10474ResFasPri, T01862_n10474ResFasPri, T01862_A10475ResFasDec, T01862_n10475ResFasDec, T01862_A396EmprCod
            }
            , new Object[] {
            T01863_A10433ResCod, T01863_A10457ResParCod, T01863_A10464ResLin, T01863_A10465ResProCod, T01863_n10465ResProCod, T01863_A10467ResFasCod, T01863_n10467ResFasCod, T01863_A10469ResFasPla, T01863_n10469ResFasPla, T01863_A10470ResFasFch,
            T01863_n10470ResFasFch, T01863_A10471ResFasDur, T01863_n10471ResFasDur, T01863_A10472ResFasMaq, T01863_n10472ResFasMaq, T01863_A10474ResFasPri, T01863_n10474ResFasPri, T01863_A10475ResFasDec, T01863_n10475ResFasDec, T01863_A396EmprCod
            }
            , new Object[] {
            T01864_A10473ResFasMaqD, T01864_n10473ResFasMaqD
            }
            , new Object[] {
            T01865_A10468ResFasDsc, T01865_n10468ResFasDsc
            }
            , new Object[] {
            T01866_A10466ResProDsc, T01866_n10466ResProDsc
            }
            , new Object[] {
            T01867_A10457ResParCod, T01867_A10458ResParKgm, T01867_n10458ResParKgm, T01867_A10459ResParMtr, T01867_n10459ResParMtr, T01867_A10460ResParPie, T01867_n10460ResParPie, T01867_A10461ResAgr, T01867_n10461ResAgr, T01867_A10462ResAgrCod,
            T01867_n10462ResAgrCod, T01867_A10463ResAgrPar, T01867_n10463ResAgrPar, T01867_A396EmprCod, T01867_A10433ResCod
            }
            , new Object[] {
            T01868_A10457ResParCod, T01868_A10458ResParKgm, T01868_n10458ResParKgm, T01868_A10459ResParMtr, T01868_n10459ResParMtr, T01868_A10460ResParPie, T01868_n10460ResParPie, T01868_A10461ResAgr, T01868_n10461ResAgr, T01868_A10462ResAgrCod,
            T01868_n10462ResAgrCod, T01868_A10463ResAgrPar, T01868_n10463ResAgrPar, T01868_A396EmprCod, T01868_A10433ResCod
            }
            , new Object[] {
            T01869_A407EmprNom, T01869_n407EmprNom
            }
            , new Object[] {
            T018610_A10434ResTpo, T018610_n10434ResTpo, T018610_A10435ResEst, T018610_n10435ResEst, T018610_A10436ResNum, T018610_n10436ResNum, T018610_A10437ResFch, T018610_n10437ResFch, T018610_A10438ResFchCmp, T018610_n10438ResFchCmp,
            T018610_A10439ResFchMin, T018610_n10439ResFchMin, T018610_A10445ResColNum, T018610_n10445ResColNum, T018610_A10446ResTipCol, T018610_n10446ResTipCol, T018610_A10448ResMatCod, T018610_n10448ResMatCod, T018610_A10450ResIntCod, T018610_n10450ResIntCod,
            T018610_A10452ResKgm, T018610_n10452ResKgm, T018610_A10453ResMtr, T018610_n10453ResMtr, T018610_A10454ResPie, T018610_n10454ResPie, T018610_A10455ResUni, T018610_n10455ResUni, T018610_A10456ResPar, T018610_n10456ResPar,
            T018610_A10444ResColNom, T018610_n10444ResColNom, T018610_A10440ResCliCod, T018610_n10440ResCliCod
            }
            , new Object[] {
            T018611_A10442ResArtCod
            }
            , new Object[] {
            T018612_A10441ResCliNom, T018612_n10441ResCliNom
            }
            , new Object[] {
            T018613_A10443ResArtDsc, T018613_n10443ResArtDsc
            }
            , new Object[] {
            T018614_A10447ResTipColD, T018614_n10447ResTipColD
            }
            , new Object[] {
            T018615_A10449ResMatDsc, T018615_n10449ResMatDsc
            }
            , new Object[] {
            T018616_A10451ResIntDsc, T018616_n10451ResIntDsc
            }
            , new Object[] {
            T018617_A65ArtCod, T018617_A252CliCod, T018617_A583IntCod, T018617_A626MatCod, T018617_A831TipColCod, T018617_A10457ResParCod, T018617_A407EmprNom, T018617_n407EmprNom, T018617_A10434ResTpo, T018617_n10434ResTpo,
            T018617_A10435ResEst, T018617_n10435ResEst, T018617_A10436ResNum, T018617_n10436ResNum, T018617_A10437ResFch, T018617_n10437ResFch, T018617_A10438ResFchCmp, T018617_n10438ResFchCmp, T018617_A10439ResFchMin, T018617_n10439ResFchMin,
            T018617_A10442ResArtCod, T018617_A10445ResColNum, T018617_n10445ResColNum, T018617_A10446ResTipCol, T018617_n10446ResTipCol, T018617_A10448ResMatCod, T018617_n10448ResMatCod, T018617_A10450ResIntCod, T018617_n10450ResIntCod, T018617_A10452ResKgm,
            T018617_n10452ResKgm, T018617_A10453ResMtr, T018617_n10453ResMtr, T018617_A10454ResPie, T018617_n10454ResPie, T018617_A10455ResUni, T018617_n10455ResUni, T018617_A10456ResPar, T018617_n10456ResPar, T018617_A10458ResParKgm,
            T018617_n10458ResParKgm, T018617_A10459ResParMtr, T018617_n10459ResParMtr, T018617_A10460ResParPie, T018617_n10460ResParPie, T018617_A10461ResAgr, T018617_n10461ResAgr, T018617_A10462ResAgrCod, T018617_n10462ResAgrCod, T018617_A10463ResAgrPar,
            T018617_n10463ResAgrPar, T018617_A396EmprCod, T018617_A10433ResCod, T018617_A10444ResColNom, T018617_n10444ResColNom, T018617_A10440ResCliCod, T018617_n10440ResCliCod, T018617_A10441ResCliNom, T018617_n10441ResCliNom, T018617_A10443ResArtDsc,
            T018617_n10443ResArtDsc, T018617_A10447ResTipColD, T018617_n10447ResTipColD, T018617_A10449ResMatDsc, T018617_n10449ResMatDsc, T018617_A10451ResIntDsc, T018617_n10451ResIntDsc
            }
            , new Object[] {
            T018618_A396EmprCod, T018618_A10433ResCod, T018618_A10457ResParCod
            }
            , new Object[] {
            T018619_A396EmprCod, T018619_A10433ResCod, T018619_A10457ResParCod
            }
            , new Object[] {
            T018620_A396EmprCod, T018620_A10433ResCod, T018620_A10457ResParCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018624_A396EmprCod, T018624_A10433ResCod, T018624_A10457ResParCod
            }
            , new Object[] {
            T018625_A602MaqCod, T018625_A758ProCod, T018625_A457FasCod, T018625_A10433ResCod, T018625_A10457ResParCod, T018625_A10464ResLin, T018625_A10465ResProCod, T018625_n10465ResProCod, T018625_A10467ResFasCod, T018625_n10467ResFasCod,
            T018625_A10469ResFasPla, T018625_n10469ResFasPla, T018625_A10470ResFasFch, T018625_n10470ResFasFch, T018625_A10471ResFasDur, T018625_n10471ResFasDur, T018625_A10472ResFasMaq, T018625_n10472ResFasMaq, T018625_A10474ResFasPri, T018625_n10474ResFasPri,
            T018625_A10475ResFasDec, T018625_n10475ResFasDec, T018625_A396EmprCod, T018625_A10473ResFasMaqD, T018625_n10473ResFasMaqD, T018625_A10468ResFasDsc, T018625_n10468ResFasDsc, T018625_A10466ResProDsc, T018625_n10466ResProDsc
            }
            , new Object[] {
            T018626_A10473ResFasMaqD, T018626_n10473ResFasMaqD
            }
            , new Object[] {
            T018627_A396EmprCod, T018627_A10433ResCod, T018627_A10457ResParCod, T018627_A10464ResLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018631_A10473ResFasMaqD, T018631_n10473ResFasMaqD
            }
            , new Object[] {
            T018632_A396EmprCod, T018632_A10433ResCod, T018632_A10457ResParCod, T018632_A10464ResLin
            }
            , new Object[] {
            T018633_A407EmprNom, T018633_n407EmprNom
            }
            , new Object[] {
            T018634_A10434ResTpo, T018634_n10434ResTpo, T018634_A10435ResEst, T018634_n10435ResEst, T018634_A10436ResNum, T018634_n10436ResNum, T018634_A10437ResFch, T018634_n10437ResFch, T018634_A10438ResFchCmp, T018634_n10438ResFchCmp,
            T018634_A10439ResFchMin, T018634_n10439ResFchMin, T018634_A10445ResColNum, T018634_n10445ResColNum, T018634_A10446ResTipCol, T018634_n10446ResTipCol, T018634_A10448ResMatCod, T018634_n10448ResMatCod, T018634_A10450ResIntCod, T018634_n10450ResIntCod,
            T018634_A10452ResKgm, T018634_n10452ResKgm, T018634_A10453ResMtr, T018634_n10453ResMtr, T018634_A10454ResPie, T018634_n10454ResPie, T018634_A10455ResUni, T018634_n10455ResUni, T018634_A10456ResPar, T018634_n10456ResPar,
            T018634_A10444ResColNom, T018634_n10444ResColNom, T018634_A10440ResCliCod, T018634_n10440ResCliCod
            }
            , new Object[] {
            T018635_A10447ResTipColD, T018635_n10447ResTipColD
            }
            , new Object[] {
            T018636_A10449ResMatDsc, T018636_n10449ResMatDsc
            }
            , new Object[] {
            T018637_A10451ResIntDsc, T018637_n10451ResIntDsc
            }
            , new Object[] {
            T018638_A10442ResArtCod
            }
            , new Object[] {
            T018639_A10441ResCliNom, T018639_n10441ResCliNom
            }
            , new Object[] {
            T018640_A10443ResArtDsc, T018640_n10443ResArtDsc
            }
         }
      );
      Z10433ResCod = 0 ;
      A10433ResCod = 0 ;
      Z10457ResParCod = "" ;
      A10457ResParCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV14Pgmname = "TResFas" ;
   }

   private byte Z10461ResAgr ;
   private byte Z10474ResFasPri ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10435ResEst ;
   private byte A10456ResPar ;
   private byte A10461ResAgr ;
   private byte A10446ResTipCol ;
   private byte A10450ResIntCod ;
   private byte A10474ResFasPri ;
   private byte GXv_int5[] ;
   private byte Z10435ResEst ;
   private byte Z10446ResTipCol ;
   private byte Z10450ResIntCod ;
   private byte Z10456ResPar ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ10435ResEst ;
   private byte ZZ10446ResTipCol ;
   private byte ZZ10450ResIntCod ;
   private byte ZZ10456ResPar ;
   private byte ZZ10461ResAgr ;
   private short nRcdDeleted_1409 ;
   private short nRcdExists_1409 ;
   private short nIsMod_1409 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10448ResMatCod ;
   private short nBlankRcdCount1409 ;
   private short RcdFound1409 ;
   private short nBlankRcdUsr1409 ;
   private short Z10448ResMatCod ;
   private short RcdFound1408 ;
   private short nIsDirty_1408 ;
   private short nIsDirty_1409 ;
   private short ZZ10448ResMatCod ;
   private int wcpOA10433ResCod ;
   private int Z10433ResCod ;
   private int Z10460ResParPie ;
   private int Z10462ResAgrCod ;
   private int nRC_GXsfl_183 ;
   private int nGXsfl_183_idx=1 ;
   private int N10460ResParPie ;
   private int Z10464ResLin ;
   private int Z10471ResFasDur ;
   private int Z10475ResFasDec ;
   private int A10433ResCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtResCod_Enabled ;
   private int edtResNum_Enabled ;
   private int edtResFch_Enabled ;
   private int edtResFchCmp_Enabled ;
   private int edtResFchMin_Enabled ;
   private int A10440ResCliCod ;
   private int edtResCliCod_Enabled ;
   private int edtResCliNom_Enabled ;
   private int edtResArtCod_Enabled ;
   private int edtResArtDsc_Enabled ;
   private int edtResColNom_Enabled ;
   private int A10445ResColNum ;
   private int edtResColNum_Enabled ;
   private int edtResTipCol_Enabled ;
   private int edtResTipColD_Enabled ;
   private int edtResMatCod_Enabled ;
   private int edtResMatDsc_Enabled ;
   private int edtResIntCod_Enabled ;
   private int edtResIntDsc_Enabled ;
   private int edtResKgm_Enabled ;
   private int edtResMtr_Enabled ;
   private int A10454ResPie ;
   private int edtResPie_Enabled ;
   private int edtResParCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtResParKgm_Enabled ;
   private int edtResParMtr_Enabled ;
   private int A10460ResParPie ;
   private int edtResParPie_Enabled ;
   private int A10462ResAgrCod ;
   private int edtResAgrCod_Enabled ;
   private int edtResAgrPar_Enabled ;
   private int edtavnRcdDeleted_1409_Enabled ;
   private int edtResLin_Enabled ;
   private int edtResProCod_Enabled ;
   private int edtResProDsc_Enabled ;
   private int edtResFasCod_Enabled ;
   private int edtResFasDsc_Enabled ;
   private int edtResFasPla_Enabled ;
   private int edtResFasFch_Enabled ;
   private int edtResFasDur_Enabled ;
   private int edtResFasMaq_Enabled ;
   private int edtResFasMaqD_Enabled ;
   private int edtResFasPri_Enabled ;
   private int edtResFasDec_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10464ResLin ;
   private int A10471ResFasDur ;
   private int A10475ResFasDec ;
   private int GX_JID ;
   private int Z10445ResColNum ;
   private int Z10454ResPie ;
   private int Z10440ResCliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtResFasCod_Enabled ;
   private int defedtResProCod_Enabled ;
   private int defedtResLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtResAgrPar_Backcolor ;
   private int edtResAgrCod_Backcolor ;
   private int edtResParPie_Backcolor ;
   private int edtResParMtr_Backcolor ;
   private int edtResParKgm_Backcolor ;
   private int edtResParCod_Backcolor ;
   private int edtResPie_Backcolor ;
   private int edtResMtr_Backcolor ;
   private int edtResKgm_Backcolor ;
   private int edtResIntDsc_Backcolor ;
   private int edtResIntCod_Backcolor ;
   private int edtResMatDsc_Backcolor ;
   private int edtResMatCod_Backcolor ;
   private int edtResTipColD_Backcolor ;
   private int edtResTipCol_Backcolor ;
   private int edtResColNum_Backcolor ;
   private int edtResColNom_Backcolor ;
   private int edtResArtDsc_Backcolor ;
   private int edtResArtCod_Backcolor ;
   private int edtResCliNom_Backcolor ;
   private int edtResCliCod_Backcolor ;
   private int edtResFchMin_Backcolor ;
   private int edtResFchCmp_Backcolor ;
   private int edtResFch_Backcolor ;
   private int edtResNum_Backcolor ;
   private int edtResCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10433ResCod ;
   private int ZZ10440ResCliCod ;
   private int ZZ10445ResColNum ;
   private int ZZ10454ResPie ;
   private int ZZ10460ResParPie ;
   private int ZZ10462ResAgrCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10458ResParKgm ;
   private java.math.BigDecimal Z10459ResParMtr ;
   private java.math.BigDecimal N10458ResParKgm ;
   private java.math.BigDecimal N10459ResParMtr ;
   private java.math.BigDecimal A10452ResKgm ;
   private java.math.BigDecimal A10453ResMtr ;
   private java.math.BigDecimal A10458ResParKgm ;
   private java.math.BigDecimal A10459ResParMtr ;
   private java.math.BigDecimal Z10452ResKgm ;
   private java.math.BigDecimal Z10453ResMtr ;
   private java.math.BigDecimal ZZ10452ResKgm ;
   private java.math.BigDecimal ZZ10453ResMtr ;
   private java.math.BigDecimal ZZ10458ResParKgm ;
   private java.math.BigDecimal ZZ10459ResParMtr ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA10457ResParCod ;
   private String Z396EmprCod ;
   private String Z10457ResParCod ;
   private String Z10463ResAgrPar ;
   private String Z10465ResProCod ;
   private String Z10467ResFasCod ;
   private String Z10469ResFasPla ;
   private String Z10472ResFasMaq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10472ResFasMaq ;
   private String A10457ResParCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtResParKgm_Internalname ;
   private String sGXsfl_183_idx="0001" ;
   private String A10434ResTpo ;
   private String A10455ResUni ;
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
   private String edtResCod_Internalname ;
   private String edtResCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtResNum_Internalname ;
   private String A10436ResNum ;
   private String edtResNum_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtResFch_Internalname ;
   private String edtResFch_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtResFchCmp_Internalname ;
   private String edtResFchCmp_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtResFchMin_Internalname ;
   private String edtResFchMin_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtResCliCod_Internalname ;
   private String edtResCliCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtResCliNom_Internalname ;
   private String A10441ResCliNom ;
   private String edtResCliNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtResArtCod_Internalname ;
   private String A10442ResArtCod ;
   private String edtResArtCod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtResArtDsc_Internalname ;
   private String A10443ResArtDsc ;
   private String edtResArtDsc_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtResColNom_Internalname ;
   private String A10444ResColNom ;
   private String edtResColNom_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtResColNum_Internalname ;
   private String edtResColNum_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtResTipCol_Internalname ;
   private String edtResTipCol_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtResTipColD_Internalname ;
   private String A10447ResTipColD ;
   private String edtResTipColD_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtResMatCod_Internalname ;
   private String edtResMatCod_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtResMatDsc_Internalname ;
   private String A10449ResMatDsc ;
   private String edtResMatDsc_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtResIntCod_Internalname ;
   private String edtResIntCod_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtResIntDsc_Internalname ;
   private String A10451ResIntDsc ;
   private String edtResIntDsc_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtResKgm_Internalname ;
   private String edtResKgm_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtResMtr_Internalname ;
   private String edtResMtr_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtResPie_Internalname ;
   private String edtResPie_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtResParCod_Internalname ;
   private String edtResParCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtResParKgm_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtResParMtr_Internalname ;
   private String edtResParMtr_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtResParPie_Internalname ;
   private String edtResParPie_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtResAgrCod_Internalname ;
   private String edtResAgrCod_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtResAgrPar_Internalname ;
   private String A10463ResAgrPar ;
   private String edtResAgrPar_Jsonclick ;
   private String sMode1409 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1409_Internalname ;
   private String edtResLin_Internalname ;
   private String edtResProCod_Internalname ;
   private String edtResProDsc_Internalname ;
   private String edtResFasCod_Internalname ;
   private String edtResFasDsc_Internalname ;
   private String edtResFasPla_Internalname ;
   private String edtResFasFch_Internalname ;
   private String edtResFasDur_Internalname ;
   private String edtResFasMaq_Internalname ;
   private String edtResFasMaqD_Internalname ;
   private String edtResFasPri_Internalname ;
   private String edtResFasDec_Internalname ;
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
   private String AV14Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1408 ;
   private String A10465ResProCod ;
   private String A10466ResProDsc ;
   private String A10467ResFasCod ;
   private String A10468ResFasDsc ;
   private String A10469ResFasPla ;
   private String A10473ResFasMaqD ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV13ResCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z10434ResTpo ;
   private String Z10436ResNum ;
   private String Z10455ResUni ;
   private String Z10444ResColNom ;
   private String Z10447ResTipColD ;
   private String Z10449ResMatDsc ;
   private String Z10451ResIntDsc ;
   private String Z10442ResArtCod ;
   private String Z10441ResCliNom ;
   private String Z10443ResArtDsc ;
   private String Z10468ResFasDsc ;
   private String Z10466ResProDsc ;
   private String Z10473ResFasMaqD ;
   private String sGXsfl_183_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1409_Jsonclick ;
   private String edtResLin_Jsonclick ;
   private String edtResProCod_Jsonclick ;
   private String edtResProDsc_Jsonclick ;
   private String edtResFasCod_Jsonclick ;
   private String edtResFasDsc_Jsonclick ;
   private String edtResFasPla_Jsonclick ;
   private String edtResFasFch_Jsonclick ;
   private String edtResFasDur_Jsonclick ;
   private String edtResFasMaq_Jsonclick ;
   private String edtResFasMaqD_Jsonclick ;
   private String edtResFasPri_Jsonclick ;
   private String edtResFasDec_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ10457ResParCod ;
   private String ZZ10441ResCliNom ;
   private String ZZ10443ResArtDsc ;
   private String ZZ10447ResTipColD ;
   private String ZZ10449ResMatDsc ;
   private String ZZ10451ResIntDsc ;
   private String ZZ407EmprNom ;
   private String ZZ10434ResTpo ;
   private String ZZ10436ResNum ;
   private String ZZ10442ResArtCod ;
   private String ZZ10444ResColNom ;
   private String ZZ10455ResUni ;
   private String ZZ10463ResAgrPar ;
   private java.util.Date Z10470ResFasFch ;
   private java.util.Date A10439ResFchMin ;
   private java.util.Date A10470ResFasFch ;
   private java.util.Date Z10439ResFchMin ;
   private java.util.Date ZZ10439ResFchMin ;
   private java.util.Date A10437ResFch ;
   private java.util.Date A10438ResFchCmp ;
   private java.util.Date Z10437ResFch ;
   private java.util.Date Z10438ResFchCmp ;
   private java.util.Date ZZ10437ResFch ;
   private java.util.Date ZZ10438ResFchCmp ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10472ResFasMaq ;
   private boolean wbErr ;
   private boolean n10434ResTpo ;
   private boolean n10435ResEst ;
   private boolean n10455ResUni ;
   private boolean n10456ResPar ;
   private boolean n10461ResAgr ;
   private boolean bGXsfl_183_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10436ResNum ;
   private boolean n10437ResFch ;
   private boolean n10438ResFchCmp ;
   private boolean n10439ResFchMin ;
   private boolean n10440ResCliCod ;
   private boolean n10441ResCliNom ;
   private boolean n10443ResArtDsc ;
   private boolean n10444ResColNom ;
   private boolean n10445ResColNum ;
   private boolean n10446ResTipCol ;
   private boolean n10447ResTipColD ;
   private boolean n10448ResMatCod ;
   private boolean n10449ResMatDsc ;
   private boolean n10450ResIntCod ;
   private boolean n10451ResIntDsc ;
   private boolean n10452ResKgm ;
   private boolean n10453ResMtr ;
   private boolean n10454ResPie ;
   private boolean n10458ResParKgm ;
   private boolean n10459ResParMtr ;
   private boolean n10460ResParPie ;
   private boolean n10462ResAgrCod ;
   private boolean n10463ResAgrPar ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n10465ResProCod ;
   private boolean n10466ResProDsc ;
   private boolean n10467ResFasCod ;
   private boolean n10468ResFasDsc ;
   private boolean n10469ResFasPla ;
   private boolean n10470ResFasFch ;
   private boolean n10471ResFasDur ;
   private boolean n10474ResFasPri ;
   private boolean n10475ResFasDec ;
   private boolean n10473ResFasMaqD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbResTpo ;
   private HTMLChoice cmbResEst ;
   private HTMLChoice cmbResUni ;
   private ICheckbox chkResPar ;
   private ICheckbox chkResAgr ;
   private IDataStoreProvider pr_default ;
   private String[] T01869_A407EmprNom ;
   private boolean[] T01869_n407EmprNom ;
   private String[] T018610_A10434ResTpo ;
   private boolean[] T018610_n10434ResTpo ;
   private byte[] T018610_A10435ResEst ;
   private boolean[] T018610_n10435ResEst ;
   private String[] T018610_A10436ResNum ;
   private boolean[] T018610_n10436ResNum ;
   private java.util.Date[] T018610_A10437ResFch ;
   private boolean[] T018610_n10437ResFch ;
   private java.util.Date[] T018610_A10438ResFchCmp ;
   private boolean[] T018610_n10438ResFchCmp ;
   private java.util.Date[] T018610_A10439ResFchMin ;
   private boolean[] T018610_n10439ResFchMin ;
   private int[] T018610_A10445ResColNum ;
   private boolean[] T018610_n10445ResColNum ;
   private byte[] T018610_A10446ResTipCol ;
   private boolean[] T018610_n10446ResTipCol ;
   private short[] T018610_A10448ResMatCod ;
   private boolean[] T018610_n10448ResMatCod ;
   private byte[] T018610_A10450ResIntCod ;
   private boolean[] T018610_n10450ResIntCod ;
   private java.math.BigDecimal[] T018610_A10452ResKgm ;
   private boolean[] T018610_n10452ResKgm ;
   private java.math.BigDecimal[] T018610_A10453ResMtr ;
   private boolean[] T018610_n10453ResMtr ;
   private int[] T018610_A10454ResPie ;
   private boolean[] T018610_n10454ResPie ;
   private String[] T018610_A10455ResUni ;
   private boolean[] T018610_n10455ResUni ;
   private byte[] T018610_A10456ResPar ;
   private boolean[] T018610_n10456ResPar ;
   private String[] T018610_A10444ResColNom ;
   private boolean[] T018610_n10444ResColNom ;
   private int[] T018610_A10440ResCliCod ;
   private boolean[] T018610_n10440ResCliCod ;
   private String[] T018614_A10447ResTipColD ;
   private boolean[] T018614_n10447ResTipColD ;
   private String[] T018615_A10449ResMatDsc ;
   private boolean[] T018615_n10449ResMatDsc ;
   private String[] T018616_A10451ResIntDsc ;
   private boolean[] T018616_n10451ResIntDsc ;
   private String[] T018611_A10442ResArtCod ;
   private String[] T018612_A10441ResCliNom ;
   private boolean[] T018612_n10441ResCliNom ;
   private String[] T018613_A10443ResArtDsc ;
   private boolean[] T018613_n10443ResArtDsc ;
   private String[] T018617_A65ArtCod ;
   private int[] T018617_A252CliCod ;
   private byte[] T018617_A583IntCod ;
   private short[] T018617_A626MatCod ;
   private byte[] T018617_A831TipColCod ;
   private String[] T018617_A10457ResParCod ;
   private String[] T018617_A407EmprNom ;
   private boolean[] T018617_n407EmprNom ;
   private String[] T018617_A10434ResTpo ;
   private boolean[] T018617_n10434ResTpo ;
   private byte[] T018617_A10435ResEst ;
   private boolean[] T018617_n10435ResEst ;
   private String[] T018617_A10436ResNum ;
   private boolean[] T018617_n10436ResNum ;
   private java.util.Date[] T018617_A10437ResFch ;
   private boolean[] T018617_n10437ResFch ;
   private java.util.Date[] T018617_A10438ResFchCmp ;
   private boolean[] T018617_n10438ResFchCmp ;
   private java.util.Date[] T018617_A10439ResFchMin ;
   private boolean[] T018617_n10439ResFchMin ;
   private String[] T018617_A10442ResArtCod ;
   private int[] T018617_A10445ResColNum ;
   private boolean[] T018617_n10445ResColNum ;
   private byte[] T018617_A10446ResTipCol ;
   private boolean[] T018617_n10446ResTipCol ;
   private short[] T018617_A10448ResMatCod ;
   private boolean[] T018617_n10448ResMatCod ;
   private byte[] T018617_A10450ResIntCod ;
   private boolean[] T018617_n10450ResIntCod ;
   private java.math.BigDecimal[] T018617_A10452ResKgm ;
   private boolean[] T018617_n10452ResKgm ;
   private java.math.BigDecimal[] T018617_A10453ResMtr ;
   private boolean[] T018617_n10453ResMtr ;
   private int[] T018617_A10454ResPie ;
   private boolean[] T018617_n10454ResPie ;
   private String[] T018617_A10455ResUni ;
   private boolean[] T018617_n10455ResUni ;
   private byte[] T018617_A10456ResPar ;
   private boolean[] T018617_n10456ResPar ;
   private java.math.BigDecimal[] T018617_A10458ResParKgm ;
   private boolean[] T018617_n10458ResParKgm ;
   private java.math.BigDecimal[] T018617_A10459ResParMtr ;
   private boolean[] T018617_n10459ResParMtr ;
   private int[] T018617_A10460ResParPie ;
   private boolean[] T018617_n10460ResParPie ;
   private byte[] T018617_A10461ResAgr ;
   private boolean[] T018617_n10461ResAgr ;
   private int[] T018617_A10462ResAgrCod ;
   private boolean[] T018617_n10462ResAgrCod ;
   private String[] T018617_A10463ResAgrPar ;
   private boolean[] T018617_n10463ResAgrPar ;
   private String[] T018617_A396EmprCod ;
   private int[] T018617_A10433ResCod ;
   private String[] T018617_A10444ResColNom ;
   private boolean[] T018617_n10444ResColNom ;
   private int[] T018617_A10440ResCliCod ;
   private boolean[] T018617_n10440ResCliCod ;
   private String[] T018617_A10441ResCliNom ;
   private boolean[] T018617_n10441ResCliNom ;
   private String[] T018617_A10443ResArtDsc ;
   private boolean[] T018617_n10443ResArtDsc ;
   private String[] T018617_A10447ResTipColD ;
   private boolean[] T018617_n10447ResTipColD ;
   private String[] T018617_A10449ResMatDsc ;
   private boolean[] T018617_n10449ResMatDsc ;
   private String[] T018617_A10451ResIntDsc ;
   private boolean[] T018617_n10451ResIntDsc ;
   private String[] T018618_A396EmprCod ;
   private int[] T018618_A10433ResCod ;
   private String[] T018618_A10457ResParCod ;
   private String[] T01868_A10457ResParCod ;
   private java.math.BigDecimal[] T01868_A10458ResParKgm ;
   private boolean[] T01868_n10458ResParKgm ;
   private java.math.BigDecimal[] T01868_A10459ResParMtr ;
   private boolean[] T01868_n10459ResParMtr ;
   private int[] T01868_A10460ResParPie ;
   private boolean[] T01868_n10460ResParPie ;
   private byte[] T01868_A10461ResAgr ;
   private boolean[] T01868_n10461ResAgr ;
   private int[] T01868_A10462ResAgrCod ;
   private boolean[] T01868_n10462ResAgrCod ;
   private String[] T01868_A10463ResAgrPar ;
   private boolean[] T01868_n10463ResAgrPar ;
   private String[] T01868_A396EmprCod ;
   private int[] T01868_A10433ResCod ;
   private String[] T018619_A396EmprCod ;
   private int[] T018619_A10433ResCod ;
   private String[] T018619_A10457ResParCod ;
   private String[] T018620_A396EmprCod ;
   private int[] T018620_A10433ResCod ;
   private String[] T018620_A10457ResParCod ;
   private String[] T01867_A10457ResParCod ;
   private java.math.BigDecimal[] T01867_A10458ResParKgm ;
   private boolean[] T01867_n10458ResParKgm ;
   private java.math.BigDecimal[] T01867_A10459ResParMtr ;
   private boolean[] T01867_n10459ResParMtr ;
   private int[] T01867_A10460ResParPie ;
   private boolean[] T01867_n10460ResParPie ;
   private byte[] T01867_A10461ResAgr ;
   private boolean[] T01867_n10461ResAgr ;
   private int[] T01867_A10462ResAgrCod ;
   private boolean[] T01867_n10462ResAgrCod ;
   private String[] T01867_A10463ResAgrPar ;
   private boolean[] T01867_n10463ResAgrPar ;
   private String[] T01867_A396EmprCod ;
   private int[] T01867_A10433ResCod ;
   private String[] T018624_A396EmprCod ;
   private int[] T018624_A10433ResCod ;
   private String[] T018624_A10457ResParCod ;
   private String[] T01866_A10466ResProDsc ;
   private boolean[] T01866_n10466ResProDsc ;
   private String[] T01865_A10468ResFasDsc ;
   private boolean[] T01865_n10468ResFasDsc ;
   private String[] T018625_A602MaqCod ;
   private String[] T018625_A758ProCod ;
   private String[] T018625_A457FasCod ;
   private int[] T018625_A10433ResCod ;
   private String[] T018625_A10457ResParCod ;
   private int[] T018625_A10464ResLin ;
   private String[] T018625_A10465ResProCod ;
   private boolean[] T018625_n10465ResProCod ;
   private String[] T018625_A10467ResFasCod ;
   private boolean[] T018625_n10467ResFasCod ;
   private String[] T018625_A10469ResFasPla ;
   private boolean[] T018625_n10469ResFasPla ;
   private java.util.Date[] T018625_A10470ResFasFch ;
   private boolean[] T018625_n10470ResFasFch ;
   private int[] T018625_A10471ResFasDur ;
   private boolean[] T018625_n10471ResFasDur ;
   private String[] T018625_A10472ResFasMaq ;
   private boolean[] T018625_n10472ResFasMaq ;
   private byte[] T018625_A10474ResFasPri ;
   private boolean[] T018625_n10474ResFasPri ;
   private int[] T018625_A10475ResFasDec ;
   private boolean[] T018625_n10475ResFasDec ;
   private String[] T018625_A396EmprCod ;
   private String[] T018625_A10473ResFasMaqD ;
   private boolean[] T018625_n10473ResFasMaqD ;
   private String[] T018625_A10468ResFasDsc ;
   private boolean[] T018625_n10468ResFasDsc ;
   private String[] T018625_A10466ResProDsc ;
   private boolean[] T018625_n10466ResProDsc ;
   private String[] T01864_A10473ResFasMaqD ;
   private boolean[] T01864_n10473ResFasMaqD ;
   private String[] T018626_A10473ResFasMaqD ;
   private boolean[] T018626_n10473ResFasMaqD ;
   private String[] T018627_A396EmprCod ;
   private int[] T018627_A10433ResCod ;
   private String[] T018627_A10457ResParCod ;
   private int[] T018627_A10464ResLin ;
   private int[] T01863_A10433ResCod ;
   private String[] T01863_A10457ResParCod ;
   private int[] T01863_A10464ResLin ;
   private String[] T01863_A10465ResProCod ;
   private boolean[] T01863_n10465ResProCod ;
   private String[] T01863_A10467ResFasCod ;
   private boolean[] T01863_n10467ResFasCod ;
   private String[] T01863_A10469ResFasPla ;
   private boolean[] T01863_n10469ResFasPla ;
   private java.util.Date[] T01863_A10470ResFasFch ;
   private boolean[] T01863_n10470ResFasFch ;
   private int[] T01863_A10471ResFasDur ;
   private boolean[] T01863_n10471ResFasDur ;
   private String[] T01863_A10472ResFasMaq ;
   private boolean[] T01863_n10472ResFasMaq ;
   private byte[] T01863_A10474ResFasPri ;
   private boolean[] T01863_n10474ResFasPri ;
   private int[] T01863_A10475ResFasDec ;
   private boolean[] T01863_n10475ResFasDec ;
   private String[] T01863_A396EmprCod ;
   private int[] T01862_A10433ResCod ;
   private String[] T01862_A10457ResParCod ;
   private int[] T01862_A10464ResLin ;
   private String[] T01862_A10465ResProCod ;
   private boolean[] T01862_n10465ResProCod ;
   private String[] T01862_A10467ResFasCod ;
   private boolean[] T01862_n10467ResFasCod ;
   private String[] T01862_A10469ResFasPla ;
   private boolean[] T01862_n10469ResFasPla ;
   private java.util.Date[] T01862_A10470ResFasFch ;
   private boolean[] T01862_n10470ResFasFch ;
   private int[] T01862_A10471ResFasDur ;
   private boolean[] T01862_n10471ResFasDur ;
   private String[] T01862_A10472ResFasMaq ;
   private boolean[] T01862_n10472ResFasMaq ;
   private byte[] T01862_A10474ResFasPri ;
   private boolean[] T01862_n10474ResFasPri ;
   private int[] T01862_A10475ResFasDec ;
   private boolean[] T01862_n10475ResFasDec ;
   private String[] T01862_A396EmprCod ;
   private String[] T018631_A10473ResFasMaqD ;
   private boolean[] T018631_n10473ResFasMaqD ;
   private String[] T018632_A396EmprCod ;
   private int[] T018632_A10433ResCod ;
   private String[] T018632_A10457ResParCod ;
   private int[] T018632_A10464ResLin ;
   private String[] T018633_A407EmprNom ;
   private boolean[] T018633_n407EmprNom ;
   private String[] T018634_A10434ResTpo ;
   private boolean[] T018634_n10434ResTpo ;
   private byte[] T018634_A10435ResEst ;
   private boolean[] T018634_n10435ResEst ;
   private String[] T018634_A10436ResNum ;
   private boolean[] T018634_n10436ResNum ;
   private java.util.Date[] T018634_A10437ResFch ;
   private boolean[] T018634_n10437ResFch ;
   private java.util.Date[] T018634_A10438ResFchCmp ;
   private boolean[] T018634_n10438ResFchCmp ;
   private java.util.Date[] T018634_A10439ResFchMin ;
   private boolean[] T018634_n10439ResFchMin ;
   private int[] T018634_A10445ResColNum ;
   private boolean[] T018634_n10445ResColNum ;
   private byte[] T018634_A10446ResTipCol ;
   private boolean[] T018634_n10446ResTipCol ;
   private short[] T018634_A10448ResMatCod ;
   private boolean[] T018634_n10448ResMatCod ;
   private byte[] T018634_A10450ResIntCod ;
   private boolean[] T018634_n10450ResIntCod ;
   private java.math.BigDecimal[] T018634_A10452ResKgm ;
   private boolean[] T018634_n10452ResKgm ;
   private java.math.BigDecimal[] T018634_A10453ResMtr ;
   private boolean[] T018634_n10453ResMtr ;
   private int[] T018634_A10454ResPie ;
   private boolean[] T018634_n10454ResPie ;
   private String[] T018634_A10455ResUni ;
   private boolean[] T018634_n10455ResUni ;
   private byte[] T018634_A10456ResPar ;
   private boolean[] T018634_n10456ResPar ;
   private String[] T018634_A10444ResColNom ;
   private boolean[] T018634_n10444ResColNom ;
   private int[] T018634_A10440ResCliCod ;
   private boolean[] T018634_n10440ResCliCod ;
   private String[] T018635_A10447ResTipColD ;
   private boolean[] T018635_n10447ResTipColD ;
   private String[] T018636_A10449ResMatDsc ;
   private boolean[] T018636_n10449ResMatDsc ;
   private String[] T018637_A10451ResIntDsc ;
   private boolean[] T018637_n10451ResIntDsc ;
   private String[] T018638_A10442ResArtCod ;
   private String[] T018639_A10441ResCliNom ;
   private boolean[] T018639_n10441ResCliNom ;
   private String[] T018640_A10443ResArtDsc ;
   private boolean[] T018640_n10443ResArtDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tresfas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tresfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tresfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tresfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tresfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01862", "SELECT ResCod, ResParCod, ResLin, ResProCod, ResFasCod, ResFasPla, ResFasFch, ResFasDur, ResFasMaq, ResFasPri, ResFasDec, EmprCod FROM TXPResFas WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ?  FOR UPDATE OF ResProCod, ResFasCod, ResFasPla, ResFasFch, ResFasDur, ResFasMaq, ResFasPri, ResFasDec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01863", "SELECT ResCod, ResParCod, ResLin, ResProCod, ResFasCod, ResFasPla, ResFasFch, ResFasDur, ResFasMaq, ResFasPri, ResFasDec, EmprCod FROM TXPResFas WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01864", "SELECT COALESCE( MaqDsc, '') AS ResFasMaqD FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01865", "SELECT COALESCE( FasDsc, '') AS ResFasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01866", "SELECT COALESCE( ProDsc, '') AS ResProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01867", "SELECT ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod, ResCod FROM TXPResPar WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?  FOR UPDATE OF ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01868", "SELECT ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod, ResCod FROM TXPResPar WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01869", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018610", "SELECT ResTpo, ResEst, ResNum, ResFch, ResFchCmp, ResFchMin, ResColNum, ResTipCol, ResMatCod, ResIntCod, ResKgm, ResMtr, ResPie, ResUni, ResPar, ResColNom, ResCliCod FROM TXPResFil WHERE EmprCod = ? AND ResCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018611", "SELECT CliNom AS ResArtCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018612", "SELECT COALESCE( CliNom, '') AS ResCliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018613", "SELECT COALESCE( ArtDsc, '') AS ResArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018614", "SELECT COALESCE( TipColDsc, '') AS ResTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018615", "SELECT COALESCE( MatDsc, '') AS ResMatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018616", "SELECT COALESCE( IntDsc, '') AS ResIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018617", "SELECT /*+ FIRST_ROWS(1) */ T9.ArtCod, T8.CliCod, T6.IntCod, T5.MatCod, T4.TipColCod, TM1.ResParCod, T2.EmprNom, T3.ResTpo, T3.ResEst, T3.ResNum, T3.ResFch, T3.ResFchCmp, T3.ResFchMin, T7.CliNom AS ResArtCod, T3.ResColNum, T3.ResTipCol, T3.ResMatCod, T3.ResIntCod, T3.ResKgm, T3.ResMtr, T3.ResPie, T3.ResUni, T3.ResPar, TM1.ResParKgm, TM1.ResParMtr, TM1.ResParPie, TM1.ResAgr, TM1.ResAgrCod, TM1.ResAgrPar, TM1.EmprCod, TM1.ResCod, T3.ResColNom AS ResColNom, T3.ResCliCod AS ResCliCod, COALESCE( T8.CliNom, '') AS ResCliNom, COALESCE( T9.ArtDsc, '') AS ResArtDsc, COALESCE( T4.TipColDsc, '') AS ResTipColD, COALESCE( T5.MatDsc, '') AS ResMatDsc, COALESCE( T6.IntDsc, '') AS ResIntDsc FROM ((((((((TXPResPar TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPResFil T3 ON T3.EmprCod = TM1.EmprCod AND T3.ResCod = TM1.ResCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipColCod = T3.ResTipCol) LEFT JOIN TXPMATICE T5 ON T5.EmprCod = TM1.EmprCod AND T5.MatCod = T3.ResMatCod) LEFT JOIN TXPINTENS T6 ON T6.EmprCod = TM1.EmprCod AND T6.IntCod = T3.ResIntCod) LEFT JOIN TXPCLIENT T7 ON T7.EmprCod = T3.ResColNom AND T7.CliCod = T3.ResCliCod) LEFT JOIN TXPARTICU T9 ON T9.EmprCod = TM1.EmprCod AND T9.CliCod = T3.ResCliCod AND T9.ArtCod = T7.CliNom) LEFT JOIN TXPCLIENT T8 ON T8.EmprCod = TM1.EmprCod AND T8.CliCod = T3.ResCliCod) WHERE TM1.EmprCod = ? and TM1.ResCod = ? and TM1.ResParCod = ? ORDER BY TM1.EmprCod, TM1.ResCod, TM1.ResParCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018618", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018619", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? and ResParCod = ? ORDER BY EmprCod, ResCod, ResParCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018620", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? and ResParCod = ? ORDER BY EmprCod DESC, ResCod DESC, ResParCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018621", "INSERT INTO TXPResPar(ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod, ResCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPResPar")
         ,new UpdateCursor("T018622", "UPDATE TXPResPar SET ResParKgm=?, ResParMtr=?, ResParPie=?, ResAgr=?, ResAgrCod=?, ResAgrPar=?  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?", GX_NOMASK, "TXPResPar")
         ,new UpdateCursor("T018623", "DELETE FROM TXPResPar  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?", GX_NOMASK, "TXPResPar")
         ,new ForEachCursor("T018624", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? and ResParCod = ? ORDER BY EmprCod, ResCod, ResParCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018625", "SELECT T4.MaqCod, T3.ProCod, T2.FasCod, T1.ResCod, T1.ResParCod, T1.ResLin, T1.ResProCod, T1.ResFasCod, T1.ResFasPla, T1.ResFasFch, T1.ResFasDur, T1.ResFasMaq, T1.ResFasPri, T1.ResFasDec, T1.EmprCod, COALESCE( T4.MaqDsc, '') AS ResFasMaqD, COALESCE( T2.FasDsc, '') AS ResFasDsc, COALESCE( T3.ProDsc, '') AS ResProDsc FROM (((TXPResFas T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.ResFasCod) LEFT JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ResProCod) LEFT JOIN TXPMAQUIN T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.ResFasMaq) WHERE T1.EmprCod = ? and T1.ResCod = ? and T1.ResParCod = ? and T1.ResLin = ? ORDER BY T1.EmprCod, T1.ResCod, T1.ResParCod, T1.ResLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018626", "SELECT COALESCE( MaqDsc, '') AS ResFasMaqD FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018627", "SELECT EmprCod, ResCod, ResParCod, ResLin FROM TXPResFas WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018628", "INSERT INTO TXPResFas(ResCod, ResParCod, ResLin, ResProCod, ResFasCod, ResFasPla, ResFasFch, ResFasDur, ResFasMaq, ResFasPri, ResFasDec, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPResFas")
         ,new UpdateCursor("T018629", "UPDATE TXPResFas SET ResProCod=?, ResFasCod=?, ResFasPla=?, ResFasFch=?, ResFasDur=?, ResFasMaq=?, ResFasPri=?, ResFasDec=?  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ?", GX_NOMASK, "TXPResFas")
         ,new UpdateCursor("T018630", "DELETE FROM TXPResFas  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ?", GX_NOMASK, "TXPResFas")
         ,new ForEachCursor("T018631", "SELECT COALESCE( MaqDsc, '') AS ResFasMaqD FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018632", "SELECT EmprCod, ResCod, ResParCod, ResLin FROM TXPResFas WHERE EmprCod = ? and ResCod = ? and ResParCod = ? ORDER BY EmprCod, ResCod, ResParCod, ResLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018633", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018634", "SELECT ResTpo, ResEst, ResNum, ResFch, ResFchCmp, ResFchMin, ResColNum, ResTipCol, ResMatCod, ResIntCod, ResKgm, ResMtr, ResPie, ResUni, ResPar, ResColNom, ResCliCod FROM TXPResFil WHERE EmprCod = ? AND ResCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018635", "SELECT COALESCE( TipColDsc, '') AS ResTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018636", "SELECT COALESCE( MatDsc, '') AS ResMatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018637", "SELECT COALESCE( IntDsc, '') AS ResIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018638", "SELECT CliNom AS ResArtCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018639", "SELECT COALESCE( CliNom, '') AS ResCliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018640", "SELECT COALESCE( ArtDsc, '') AS ResArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(15);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(17);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 30);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(23);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(26);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(27);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(28);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(30, 3);
               ((int[]) buf[52])[0] = rslt.getInt(31);
               ((String[]) buf[53])[0] = rslt.getString(32, 3);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(33);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(35, 26);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(37, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 3);
               ((String[]) buf[23])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 28);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(15);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(17);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
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
               stmt.setString(3, (String)parms[3], 30);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 1);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
               }
               stmt.setString(8, (String)parms[13], 3);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               return;
            case 20 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
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
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[18]).intValue());
               }
               stmt.setString(12, (String)parms[19], 3);
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 1);
               stmt.setInt(12, ((Number) parms[19]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 29 :
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
               stmt.setString(3, (String)parms[3], 30);
               return;
      }
   }

}

