package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tshagra_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7031ShaCod = httpContext.GetPar( "ShaCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A7031ShaCod) ;
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
            AV33OGSCod = (int)(GXutil.lval( httpContext.GetPar( "OGSCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33OGSCod), 8, 0));
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Grabado de Shablones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOGSCod_Internalname ;
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
      nRC_GXsfl_164 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_164"))) ;
      nGXsfl_164_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_164_idx"))) ;
      sGXsfl_164_idx = httpContext.GetPar( "sGXsfl_164_idx") ;
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

   public tshagra_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tshagra_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tshagra_impl.class ));
   }

   public tshagra_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkOGSEst = UIFactory.getCheckbox(this);
      lstDibTipMaq = new HTMLChoice();
      cmbOGSTam = new HTMLChoice();
      chkShaGrb = UIFactory.getCheckbox(this);
      cmbShaTipMaq = new HTMLChoice();
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
      A7050OGSEst = ((GXutil.strcmp(GXutil.rtrim( A7050OGSEst), "S")==0) ? "S" : "N") ;
      n7050OGSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7050OGSEst", A7050OGSEst);
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
         httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      }
      if ( cmbOGSTam.getItemCount() > 0 )
      {
         A7522OGSTam = cmbOGSTam.getValidValue(A7522OGSTam) ;
         n7522OGSTam = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7522OGSTam", A7522OGSTam);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOGSTam.setValue( GXutil.rtrim( A7522OGSTam) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOGSTam.getInternalname(), "Values", cmbOGSTam.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TShaGra.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod Ord Grab Shablon", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7049OGSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOGSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7049OGSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7049OGSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSCod_Jsonclick, 0, "", "", "", "", "", 1, edtOGSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkOGSEst.getInternalname(), A7050OGSEst, "", "", 1, chkOGSEst.getEnabled(), "S", httpContext.getMessage( "Realizada", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(35, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,35);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero Moldes cilindros", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCi2_Internalname, GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCi2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCi2_Jsonclick, 0, "", "", "", "", "", 1, edtDibMolCi2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tipo Maquina  Plana,Rotativa,Digital", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ListBox */
      app.GxWebStd.gx_listbox_ctrl1( httpContext, lstDibTipMaq, lstDibTipMaq.getInternalname(), GXutil.rtrim( A1823DibTipMaq), 3, lstDibTipMaq.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, lstDibTipMaq.getEnabled(), 1, (short)(0), 0, "em", 0, "row", "", "", "", "", "", "", true, (byte)(0), "HLP_TShaGra.htm");
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero de Moldes/Cilindros", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCil_Internalname, GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCil_Jsonclick, 0, "", "", "", "", "", 1, edtDibMolCil_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Usuario que Crea", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSUsuCre_Internalname, GXutil.rtrim( A7051OGSUsuCre), GXutil.rtrim( localUtil.format( A7051OGSUsuCre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSUsuCre_Jsonclick, 0, "", "", "", "", "", 1, edtOGSUsuCre_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOGSFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSFchCre_Internalname, localUtil.ttoc( A7052OGSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A7052OGSFchCre, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSFchCre_Jsonclick, 0, "", "", "", "", "", 1, edtOGSFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOGSFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOGSFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TShaGra.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Usuario que Realiza", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSUsuRea_Internalname, GXutil.rtrim( A7053OGSUsuRea), GXutil.rtrim( localUtil.format( A7053OGSUsuRea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSUsuRea_Jsonclick, 0, "", "", "", "", "", 1, edtOGSUsuRea_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Fecha de Realización", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOGSFchRea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSFchRea_Internalname, localUtil.ttoc( A7054OGSFchRea, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A7054OGSFchRea, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSFchRea_Jsonclick, 0, "", "", "", "", "", 1, edtOGSFchRea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOGSFchRea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOGSFchRea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TShaGra.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A7141OGSAnc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOGSAnc_Enabled!=0) ? localUtil.format( A7141OGSAnc, "Z9.99") : localUtil.format( A7141OGSAnc, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSAnc_Jsonclick, 0, "", "", "", "", "", 1, edtOGSAnc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Galga", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSGal_Internalname, GXutil.ltrim( localUtil.ntoc( A7142OGSGal, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOGSGal_Enabled!=0) ? localUtil.format( A7142OGSGal, "Z9.999") : localUtil.format( A7142OGSGal, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSGal_Jsonclick, 0, "", "", "", "", "", 1, edtOGSGal_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Ubicacion", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSUbi_Internalname, GXutil.rtrim( A7143OGSUbi), GXutil.rtrim( localUtil.format( A7143OGSUbi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSUbi_Jsonclick, 0, "", "", "", "", "", 1, edtOGSUbi_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSTpo_Internalname, GXutil.rtrim( A7144OGSTpo), GXutil.rtrim( localUtil.format( A7144OGSTpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSTpo_Jsonclick, 0, "", "", "", "", "", 1, edtOGSTpo_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A7519OGSMaq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOGSMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7519OGSMaq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7519OGSMaq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSMaq_Jsonclick, 0, "", "", "", "", "", 1, edtOGSMaq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Segmento", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSSeg_Internalname, GXutil.rtrim( A7520OGSSeg), GXutil.rtrim( localUtil.format( A7520OGSSeg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSSeg_Jsonclick, 0, "", "", "", "", "", 1, edtOGSSeg_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSDsc_Internalname, GXutil.rtrim( A7521OGSDsc), GXutil.rtrim( localUtil.format( A7521OGSDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSDsc_Jsonclick, 0, "", "", "", "", "", 1, edtOGSDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Tamaño", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOGSTam, cmbOGSTam.getInternalname(), GXutil.rtrim( A7522OGSTam), 1, cmbOGSTam.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOGSTam.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "", true, (byte)(0), "HLP_TShaGra.htm");
      cmbOGSTam.setValue( GXutil.rtrim( A7522OGSTam) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOGSTam.getInternalname(), "Values", cmbOGSTam.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOGSObs_Internalname, A7055OGSObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"", (short)(0), 1, edtOGSObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "10240", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "OGSDib C", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSDibC_Internalname, GXutil.rtrim( A10885OGSDibC), GXutil.rtrim( localUtil.format( A10885OGSDibC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSDibC_Jsonclick, 0, "", "", "", "", "", 1, edtOGSDibC_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "OGSDib I", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOGSDibI_Internalname, GXutil.ltrim( localUtil.ntoc( A10886OGSDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOGSDibI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10886OGSDibI), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10886OGSDibI), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOGSDibI_Jsonclick, 0, "", "", "", "", "", 1, edtOGSDibI_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaGra.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol164( ) ;
      nGXsfl_164_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount997 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_997 = (short)(1) ;
            scanStartXL997( ) ;
            while ( RcdFound997 != 0 )
            {
               init_level_properties997( ) ;
               getByPrimaryKeyXL997( ) ;
               addRowXL997( ) ;
               scanNextXL997( ) ;
            }
            scanEndXL997( ) ;
            nBlankRcdCount997 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalXL997( ) ;
         standaloneModalXL997( ) ;
         sMode997 = Gx_mode ;
         while ( nGXsfl_164_idx < nRC_GXsfl_164 )
         {
            bGXsfl_164_Refreshing = true ;
            readRowXL997( ) ;
            edtavnRcdDeleted_997_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_997_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_997_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_997_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            edtShaCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHACOD_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtShaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaCod_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            edtShaOGSOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAOGSORD_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtShaOGSOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaOGSOrd_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            chkShaGrb.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "SHAGRB_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkShaGrb.getInternalname(), "Enabled", GXutil.ltrimstr( chkShaGrb.getEnabled(), 5, 0), !bGXsfl_164_Refreshing);
            cmbShaTipMaq.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "SHATIPMAQ_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbShaTipMaq.getInternalname(), "Enabled", GXutil.ltrimstr( cmbShaTipMaq.getEnabled(), 5, 0), !bGXsfl_164_Refreshing);
            edtShaMal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAMAL_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtShaMal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaMal_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            edtShaAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAANC_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtShaAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaAnc_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            edtShaUbi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAUBI_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtShaUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaUbi_Enabled), 5, 0), !bGXsfl_164_Refreshing);
            if ( ( nRcdExists_997 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalXL997( ) ;
            }
            sendRowXL997( ) ;
            bGXsfl_164_Refreshing = false ;
         }
         Gx_mode = sMode997 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount997 = (short)(5) ;
         nRcdExists_997 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartXL997( ) ;
            while ( RcdFound997 != 0 )
            {
               sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_164997( ) ;
               init_level_properties997( ) ;
               standaloneNotModalXL997( ) ;
               getByPrimaryKeyXL997( ) ;
               standaloneModalXL997( ) ;
               addRowXL997( ) ;
               scanNextXL997( ) ;
            }
            scanEndXL997( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode997 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_164997( ) ;
         initAllXL997( ) ;
         init_level_properties997( ) ;
         nRcdExists_997 = (short)(0) ;
         nIsMod_997 = (short)(0) ;
         nRcdDeleted_997 = (short)(0) ;
         nBlankRcdCount997 = (short)(nBlankRcdUsr997+nBlankRcdCount997) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount997 > 0 )
         {
            standaloneNotModalXL997( ) ;
            standaloneModalXL997( ) ;
            addRowXL997( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtShaCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount997 = (short)(nBlankRcdCount997-1) ;
         }
         Gx_mode = sMode997 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaGra.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TShaGra.htm");
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
         Z7049OGSCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z7049OGSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7050OGSEst = httpContext.cgiGet( "Z7050OGSEst") ;
         Z7051OGSUsuCre = httpContext.cgiGet( "Z7051OGSUsuCre") ;
         Z7052OGSFchCre = localUtil.ctot( httpContext.cgiGet( "Z7052OGSFchCre"), 0) ;
         Z7053OGSUsuRea = httpContext.cgiGet( "Z7053OGSUsuRea") ;
         Z7054OGSFchRea = localUtil.ctot( httpContext.cgiGet( "Z7054OGSFchRea"), 0) ;
         Z7141OGSAnc = localUtil.ctond( httpContext.cgiGet( "Z7141OGSAnc")) ;
         Z7142OGSGal = localUtil.ctond( httpContext.cgiGet( "Z7142OGSGal")) ;
         Z7143OGSUbi = httpContext.cgiGet( "Z7143OGSUbi") ;
         Z7144OGSTpo = httpContext.cgiGet( "Z7144OGSTpo") ;
         Z7519OGSMaq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7519OGSMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7520OGSSeg = httpContext.cgiGet( "Z7520OGSSeg") ;
         Z7521OGSDsc = httpContext.cgiGet( "Z7521OGSDsc") ;
         Z7522OGSTam = httpContext.cgiGet( "Z7522OGSTam") ;
         Z10885OGSDibC = httpContext.cgiGet( "Z10885OGSDibC") ;
         Z10886OGSDibI = (int)(localUtil.ctol( httpContext.cgiGet( "Z10886OGSDibI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_164 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_164"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A7041ShaDibCli = httpContext.cgiGet( "SHADIBCLI") ;
         A7042ShaDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "SHADIBINT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOGSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOGSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGSCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7049OGSCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
         }
         else
         {
            A7049OGSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOGSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
         }
         A7050OGSEst = ((GXutil.strcmp(httpContext.cgiGet( chkOGSEst.getInternalname()), "S")==0) ? "S" : "N") ;
         n7050OGSEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7050OGSEst", A7050OGSEst);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2090DibMolCi2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCi2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2090DibMolCi2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         lstDibTipMaq.setName( lstDibTipMaq.getInternalname() );
         lstDibTipMaq.setValue( httpContext.cgiGet( lstDibTipMaq.getInternalname()) );
         A1823DibTipMaq = httpContext.cgiGet( lstDibTipMaq.getInternalname()) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1019DibMolCil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A7051OGSUsuCre = httpContext.cgiGet( edtOGSUsuCre_Internalname) ;
         n7051OGSUsuCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7051OGSUsuCre", A7051OGSUsuCre);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtOGSFchCre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OGSFCHCRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSFchCre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7052OGSFchCre = GXutil.resetTime( GXutil.nullDate() );
            n7052OGSFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7052OGSFchCre", localUtil.ttoc( A7052OGSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A7052OGSFchCre = localUtil.ctot( httpContext.cgiGet( edtOGSFchCre_Internalname)) ;
            n7052OGSFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7052OGSFchCre", localUtil.ttoc( A7052OGSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A7053OGSUsuRea = httpContext.cgiGet( edtOGSUsuRea_Internalname) ;
         n7053OGSUsuRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7053OGSUsuRea", A7053OGSUsuRea);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtOGSFchRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OGSFCHREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSFchRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
            n7054OGSFchRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7054OGSFchRea", localUtil.ttoc( A7054OGSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A7054OGSFchRea = localUtil.ctot( httpContext.cgiGet( edtOGSFchRea_Internalname)) ;
            n7054OGSFchRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7054OGSFchRea", localUtil.ttoc( A7054OGSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOGSAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOGSAnc_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGSANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7141OGSAnc = DecimalUtil.ZERO ;
            n7141OGSAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7141OGSAnc", GXutil.ltrimstr( A7141OGSAnc, 5, 2));
         }
         else
         {
            A7141OGSAnc = localUtil.ctond( httpContext.cgiGet( edtOGSAnc_Internalname)) ;
            n7141OGSAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7141OGSAnc", GXutil.ltrimstr( A7141OGSAnc, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOGSGal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOGSGal_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGSGAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSGal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7142OGSGal = DecimalUtil.ZERO ;
            n7142OGSGal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7142OGSGal", GXutil.ltrimstr( A7142OGSGal, 6, 3));
         }
         else
         {
            A7142OGSGal = localUtil.ctond( httpContext.cgiGet( edtOGSGal_Internalname)) ;
            n7142OGSGal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7142OGSGal", GXutil.ltrimstr( A7142OGSGal, 6, 3));
         }
         A7143OGSUbi = httpContext.cgiGet( edtOGSUbi_Internalname) ;
         n7143OGSUbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7143OGSUbi", A7143OGSUbi);
         A7144OGSTpo = httpContext.cgiGet( edtOGSTpo_Internalname) ;
         n7144OGSTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7144OGSTpo", A7144OGSTpo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOGSMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOGSMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGSMAQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7519OGSMaq = (byte)(0) ;
            n7519OGSMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7519OGSMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7519OGSMaq), 2, 0));
         }
         else
         {
            A7519OGSMaq = (byte)(localUtil.ctol( httpContext.cgiGet( edtOGSMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7519OGSMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7519OGSMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7519OGSMaq), 2, 0));
         }
         A7520OGSSeg = httpContext.cgiGet( edtOGSSeg_Internalname) ;
         n7520OGSSeg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7520OGSSeg", A7520OGSSeg);
         A7521OGSDsc = httpContext.cgiGet( edtOGSDsc_Internalname) ;
         n7521OGSDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7521OGSDsc", A7521OGSDsc);
         cmbOGSTam.setName( cmbOGSTam.getInternalname() );
         cmbOGSTam.setValue( httpContext.cgiGet( cmbOGSTam.getInternalname()) );
         A7522OGSTam = httpContext.cgiGet( cmbOGSTam.getInternalname()) ;
         n7522OGSTam = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7522OGSTam", A7522OGSTam);
         A7055OGSObs = httpContext.cgiGet( edtOGSObs_Internalname) ;
         n7055OGSObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7055OGSObs", A7055OGSObs);
         A10885OGSDibC = httpContext.cgiGet( edtOGSDibC_Internalname) ;
         n10885OGSDibC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10885OGSDibC", A10885OGSDibC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOGSDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOGSDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGSDIBI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOGSDibI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10886OGSDibI = 0 ;
            n10886OGSDibI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10886OGSDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10886OGSDibI), 8, 0));
         }
         else
         {
            A10886OGSDibI = (int)(localUtil.ctol( httpContext.cgiGet( edtOGSDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10886OGSDibI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10886OGSDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10886OGSDibI), 8, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TShaGra");
         forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( A7049OGSCod != Z7049OGSCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tshagra:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A7049OGSCod = (int)(GXutil.lval( httpContext.GetPar( "OGSCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons( ) ;
            standaloneModal( ) ;
         }
         else
         {
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
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
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
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAllXL996( ) ;
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributesXL996( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_997_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_997_Enabled), 5, 0), !bGXsfl_164_Refreshing);
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

   public void confirm_XL0( )
   {
      beforeValidateXL996( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsXL996( ) ;
         }
         else
         {
            checkExtendedTableXL996( ) ;
            if ( AnyError == 0 )
            {
               zmXL996( 2) ;
               zmXL996( 3) ;
               zmXL996( 4) ;
               zmXL996( 5) ;
               zmXL996( 6) ;
            }
            closeExtendedTableCursorsXL996( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode996 = Gx_mode ;
         confirm_XL997( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode996 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode996 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesXL0( ) ;
      }
   }

   public void confirm_XL997( )
   {
      nGXsfl_164_idx = 0 ;
      while ( nGXsfl_164_idx < nRC_GXsfl_164 )
      {
         readRowXL997( ) ;
         if ( ( nRcdExists_997 != 0 ) || ( nIsMod_997 != 0 ) )
         {
            getKeyXL997( ) ;
            if ( ( nRcdExists_997 == 0 ) && ( nRcdDeleted_997 == 0 ) )
            {
               if ( RcdFound997 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateXL997( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableXL997( ) ;
                     if ( AnyError == 0 )
                     {
                        zmXL997( 8) ;
                     }
                     closeExtendedTableCursorsXL997( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "SHACOD_" + sGXsfl_164_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtShaCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound997 != 0 )
               {
                  if ( nRcdDeleted_997 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyXL997( ) ;
                     loadXL997( ) ;
                     beforeValidateXL997( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsXL997( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_997 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateXL997( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableXL997( ) ;
                           if ( AnyError == 0 )
                           {
                              zmXL997( 8) ;
                           }
                           closeExtendedTableCursorsXL997( ) ;
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
                  if ( nRcdDeleted_997 == 0 )
                  {
                     GXCCtl = "SHACOD_" + sGXsfl_164_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtShaCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_997_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtShaCod_Internalname, GXutil.rtrim( A7031ShaCod)) ;
         httpContext.changePostValue( edtShaOGSOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7056ShaOGSOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkShaGrb.getInternalname(), ((GXutil.strcmp(A7036ShaGrb, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( cmbShaTipMaq.getInternalname(), GXutil.rtrim( A7037ShaTipMaq)) ;
         httpContext.changePostValue( edtShaMal_Internalname, GXutil.rtrim( A7032ShaMal)) ;
         httpContext.changePostValue( edtShaAnc_Internalname, GXutil.rtrim( A7033ShaAnc)) ;
         httpContext.changePostValue( edtShaUbi_Internalname, GXutil.rtrim( A7035ShaUbi)) ;
         httpContext.changePostValue( "ZT_"+"Z7031ShaCod_"+sGXsfl_164_idx, GXutil.rtrim( Z7031ShaCod)) ;
         httpContext.changePostValue( "ZT_"+"Z7056ShaOGSOrd_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( Z7056ShaOGSOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_997_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_997_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_997_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_997 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_997_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_997_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHACOD_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAOGSORD_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaOGSOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAGRB_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkShaGrb.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHATIPMAQ_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbShaTipMaq.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAMAL_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaMal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAANC_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAUBI_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaUbi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionXL0( )
   {
   }

   public void zmXL996( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7050OGSEst = T00XL6_A7050OGSEst[0] ;
            Z7051OGSUsuCre = T00XL6_A7051OGSUsuCre[0] ;
            Z7052OGSFchCre = T00XL6_A7052OGSFchCre[0] ;
            Z7053OGSUsuRea = T00XL6_A7053OGSUsuRea[0] ;
            Z7054OGSFchRea = T00XL6_A7054OGSFchRea[0] ;
            Z7141OGSAnc = T00XL6_A7141OGSAnc[0] ;
            Z7142OGSGal = T00XL6_A7142OGSGal[0] ;
            Z7143OGSUbi = T00XL6_A7143OGSUbi[0] ;
            Z7144OGSTpo = T00XL6_A7144OGSTpo[0] ;
            Z7519OGSMaq = T00XL6_A7519OGSMaq[0] ;
            Z7520OGSSeg = T00XL6_A7520OGSSeg[0] ;
            Z7521OGSDsc = T00XL6_A7521OGSDsc[0] ;
            Z7522OGSTam = T00XL6_A7522OGSTam[0] ;
            Z10885OGSDibC = T00XL6_A10885OGSDibC[0] ;
            Z10886OGSDibI = T00XL6_A10886OGSDibI[0] ;
            Z129BarCod = T00XL6_A129BarCod[0] ;
            Z132BarCodReo = T00XL6_A132BarCodReo[0] ;
            Z130BarCodPar = T00XL6_A130BarCodPar[0] ;
         }
         else
         {
            Z7050OGSEst = A7050OGSEst ;
            Z7051OGSUsuCre = A7051OGSUsuCre ;
            Z7052OGSFchCre = A7052OGSFchCre ;
            Z7053OGSUsuRea = A7053OGSUsuRea ;
            Z7054OGSFchRea = A7054OGSFchRea ;
            Z7141OGSAnc = A7141OGSAnc ;
            Z7142OGSGal = A7142OGSGal ;
            Z7143OGSUbi = A7143OGSUbi ;
            Z7144OGSTpo = A7144OGSTpo ;
            Z7519OGSMaq = A7519OGSMaq ;
            Z7520OGSSeg = A7520OGSSeg ;
            Z7521OGSDsc = A7521OGSDsc ;
            Z7522OGSTam = A7522OGSTam ;
            Z10885OGSDibC = A10885OGSDibC ;
            Z10886OGSDibI = A10886OGSDibI ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z7049OGSCod = A7049OGSCod ;
         Z7050OGSEst = A7050OGSEst ;
         Z7051OGSUsuCre = A7051OGSUsuCre ;
         Z7052OGSFchCre = A7052OGSFchCre ;
         Z7053OGSUsuRea = A7053OGSUsuRea ;
         Z7054OGSFchRea = A7054OGSFchRea ;
         Z7141OGSAnc = A7141OGSAnc ;
         Z7142OGSGal = A7142OGSGal ;
         Z7143OGSUbi = A7143OGSUbi ;
         Z7144OGSTpo = A7144OGSTpo ;
         Z7519OGSMaq = A7519OGSMaq ;
         Z7520OGSSeg = A7520OGSSeg ;
         Z7521OGSDsc = A7521OGSDsc ;
         Z7522OGSTam = A7522OGSTam ;
         Z7055OGSObs = A7055OGSObs ;
         Z10885OGSDibC = A10885OGSDibC ;
         Z10886OGSDibI = A10886OGSDibI ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z361DisCod = A361DisCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z279CliNom = A279CliNom ;
         Z2090DibMolCi2 = A2090DibMolCi2 ;
         Z1823DibTipMaq = A1823DibTipMaq ;
         Z1019DibMolCil = A1019DibMolCil ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T00XL7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XL7_A407EmprNom[0] ;
      n407EmprNom = T00XL7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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

   public void loadXL996( )
   {
      /* Using cursor T00XL12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A7049OGSCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound996 = (short)(1) ;
         A7055OGSObs = T00XL12_A7055OGSObs[0] ;
         n7055OGSObs = T00XL12_n7055OGSObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7055OGSObs", A7055OGSObs);
         A361DisCod = T00XL12_A361DisCod[0] ;
         A407EmprNom = T00XL12_A407EmprNom[0] ;
         n407EmprNom = T00XL12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7050OGSEst = T00XL12_A7050OGSEst[0] ;
         n7050OGSEst = T00XL12_n7050OGSEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7050OGSEst", A7050OGSEst);
         A279CliNom = T00XL12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A2090DibMolCi2 = T00XL12_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = T00XL12_n2090DibMolCi2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         A1823DibTipMaq = T00XL12_A1823DibTipMaq[0] ;
         n1823DibTipMaq = T00XL12_n1823DibTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = T00XL12_A1019DibMolCil[0] ;
         n1019DibMolCil = T00XL12_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A7051OGSUsuCre = T00XL12_A7051OGSUsuCre[0] ;
         n7051OGSUsuCre = T00XL12_n7051OGSUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7051OGSUsuCre", A7051OGSUsuCre);
         A7052OGSFchCre = T00XL12_A7052OGSFchCre[0] ;
         n7052OGSFchCre = T00XL12_n7052OGSFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7052OGSFchCre", localUtil.ttoc( A7052OGSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7053OGSUsuRea = T00XL12_A7053OGSUsuRea[0] ;
         n7053OGSUsuRea = T00XL12_n7053OGSUsuRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7053OGSUsuRea", A7053OGSUsuRea);
         A7054OGSFchRea = T00XL12_A7054OGSFchRea[0] ;
         n7054OGSFchRea = T00XL12_n7054OGSFchRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7054OGSFchRea", localUtil.ttoc( A7054OGSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7141OGSAnc = T00XL12_A7141OGSAnc[0] ;
         n7141OGSAnc = T00XL12_n7141OGSAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7141OGSAnc", GXutil.ltrimstr( A7141OGSAnc, 5, 2));
         A7142OGSGal = T00XL12_A7142OGSGal[0] ;
         n7142OGSGal = T00XL12_n7142OGSGal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7142OGSGal", GXutil.ltrimstr( A7142OGSGal, 6, 3));
         A7143OGSUbi = T00XL12_A7143OGSUbi[0] ;
         n7143OGSUbi = T00XL12_n7143OGSUbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7143OGSUbi", A7143OGSUbi);
         A7144OGSTpo = T00XL12_A7144OGSTpo[0] ;
         n7144OGSTpo = T00XL12_n7144OGSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7144OGSTpo", A7144OGSTpo);
         A7519OGSMaq = T00XL12_A7519OGSMaq[0] ;
         n7519OGSMaq = T00XL12_n7519OGSMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7519OGSMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7519OGSMaq), 2, 0));
         A7520OGSSeg = T00XL12_A7520OGSSeg[0] ;
         n7520OGSSeg = T00XL12_n7520OGSSeg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7520OGSSeg", A7520OGSSeg);
         A7521OGSDsc = T00XL12_A7521OGSDsc[0] ;
         n7521OGSDsc = T00XL12_n7521OGSDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7521OGSDsc", A7521OGSDsc);
         A7522OGSTam = T00XL12_A7522OGSTam[0] ;
         n7522OGSTam = T00XL12_n7522OGSTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7522OGSTam", A7522OGSTam);
         A10885OGSDibC = T00XL12_A10885OGSDibC[0] ;
         n10885OGSDibC = T00XL12_n10885OGSDibC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10885OGSDibC", A10885OGSDibC);
         A10886OGSDibI = T00XL12_A10886OGSDibI[0] ;
         n10886OGSDibI = T00XL12_n10886OGSDibI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10886OGSDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10886OGSDibI), 8, 0));
         A129BarCod = T00XL12_A129BarCod[0] ;
         n129BarCod = T00XL12_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00XL12_A132BarCodReo[0] ;
         n132BarCodReo = T00XL12_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00XL12_A130BarCodPar[0] ;
         n130BarCodPar = T00XL12_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = T00XL12_A252CliCod[0] ;
         n252CliCod = T00XL12_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T00XL12_A1013DibCli[0] ;
         n1013DibCli = T00XL12_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T00XL12_A1014DibInt[0] ;
         n1014DibInt = T00XL12_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         zmXL996( -1) ;
      }
      pr_default.close(10);
      onLoadActionsXL996( ) ;
   }

   public void onLoadActionsXL996( )
   {
   }

   public void checkExtendedTableXL996( )
   {
      nIsDirty_996 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00XL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00XL8_A361DisCod[0] ;
      A252CliCod = T00XL8_A252CliCod[0] ;
      n252CliCod = T00XL8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(6);
      /* Using cursor T00XL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A1013DibCli = T00XL9_A1013DibCli[0] ;
      n1013DibCli = T00XL9_n1013DibCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = T00XL9_A1014DibInt[0] ;
      n1014DibInt = T00XL9_n1014DibInt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      pr_default.close(7);
      /* Using cursor T00XL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T00XL10_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(8);
      /* Using cursor T00XL11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
         }
      }
      A2090DibMolCi2 = T00XL11_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T00XL11_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A1823DibTipMaq = T00XL11_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T00XL11_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T00XL11_A1019DibMolCil[0] ;
      n1019DibMolCil = T00XL11_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      pr_default.close(9);
   }

   public void closeExtendedTableCursorsXL996( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T00XL13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00XL13_A361DisCod[0] ;
      A252CliCod = T00XL13_A252CliCod[0] ;
      n252CliCod = T00XL13_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_4( String A396EmprCod ,
                         int A361DisCod )
   {
      /* Using cursor T00XL14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A1013DibCli = T00XL14_A1013DibCli[0] ;
      n1013DibCli = T00XL14_n1013DibCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = T00XL14_A1014DibInt[0] ;
      n1014DibInt = T00XL14_n1014DibInt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1013DibCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00XL15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T00XL15_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_6( String A396EmprCod ,
                         String A1013DibCli ,
                         int A252CliCod ,
                         int A1014DibInt )
   {
      /* Using cursor T00XL16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
         }
      }
      A2090DibMolCi2 = T00XL16_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T00XL16_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A1823DibTipMaq = T00XL16_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T00XL16_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T00XL16_A1019DibMolCil[0] ;
      n1019DibMolCil = T00XL16_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1823DibTipMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKeyXL996( )
   {
      /* Using cursor T00XL17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound996 = (short)(1) ;
      }
      else
      {
         RcdFound996 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00XL6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00XL6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmXL996( 1) ;
         RcdFound996 = (short)(1) ;
         A7055OGSObs = T00XL6_A7055OGSObs[0] ;
         n7055OGSObs = T00XL6_n7055OGSObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7055OGSObs", A7055OGSObs);
         A7049OGSCod = T00XL6_A7049OGSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
         A7050OGSEst = T00XL6_A7050OGSEst[0] ;
         n7050OGSEst = T00XL6_n7050OGSEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7050OGSEst", A7050OGSEst);
         A7051OGSUsuCre = T00XL6_A7051OGSUsuCre[0] ;
         n7051OGSUsuCre = T00XL6_n7051OGSUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7051OGSUsuCre", A7051OGSUsuCre);
         A7052OGSFchCre = T00XL6_A7052OGSFchCre[0] ;
         n7052OGSFchCre = T00XL6_n7052OGSFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7052OGSFchCre", localUtil.ttoc( A7052OGSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7053OGSUsuRea = T00XL6_A7053OGSUsuRea[0] ;
         n7053OGSUsuRea = T00XL6_n7053OGSUsuRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7053OGSUsuRea", A7053OGSUsuRea);
         A7054OGSFchRea = T00XL6_A7054OGSFchRea[0] ;
         n7054OGSFchRea = T00XL6_n7054OGSFchRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7054OGSFchRea", localUtil.ttoc( A7054OGSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7141OGSAnc = T00XL6_A7141OGSAnc[0] ;
         n7141OGSAnc = T00XL6_n7141OGSAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7141OGSAnc", GXutil.ltrimstr( A7141OGSAnc, 5, 2));
         A7142OGSGal = T00XL6_A7142OGSGal[0] ;
         n7142OGSGal = T00XL6_n7142OGSGal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7142OGSGal", GXutil.ltrimstr( A7142OGSGal, 6, 3));
         A7143OGSUbi = T00XL6_A7143OGSUbi[0] ;
         n7143OGSUbi = T00XL6_n7143OGSUbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7143OGSUbi", A7143OGSUbi);
         A7144OGSTpo = T00XL6_A7144OGSTpo[0] ;
         n7144OGSTpo = T00XL6_n7144OGSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7144OGSTpo", A7144OGSTpo);
         A7519OGSMaq = T00XL6_A7519OGSMaq[0] ;
         n7519OGSMaq = T00XL6_n7519OGSMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7519OGSMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7519OGSMaq), 2, 0));
         A7520OGSSeg = T00XL6_A7520OGSSeg[0] ;
         n7520OGSSeg = T00XL6_n7520OGSSeg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7520OGSSeg", A7520OGSSeg);
         A7521OGSDsc = T00XL6_A7521OGSDsc[0] ;
         n7521OGSDsc = T00XL6_n7521OGSDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7521OGSDsc", A7521OGSDsc);
         A7522OGSTam = T00XL6_A7522OGSTam[0] ;
         n7522OGSTam = T00XL6_n7522OGSTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7522OGSTam", A7522OGSTam);
         A10885OGSDibC = T00XL6_A10885OGSDibC[0] ;
         n10885OGSDibC = T00XL6_n10885OGSDibC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10885OGSDibC", A10885OGSDibC);
         A10886OGSDibI = T00XL6_A10886OGSDibI[0] ;
         n10886OGSDibI = T00XL6_n10886OGSDibI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10886OGSDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10886OGSDibI), 8, 0));
         A129BarCod = T00XL6_A129BarCod[0] ;
         n129BarCod = T00XL6_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00XL6_A132BarCodReo[0] ;
         n132BarCodReo = T00XL6_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00XL6_A130BarCodPar[0] ;
         n130BarCodPar = T00XL6_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z7049OGSCod = A7049OGSCod ;
         sMode996 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadXL996( ) ;
         if ( AnyError == 1 )
         {
            RcdFound996 = (short)(0) ;
            initializeNonKeyXL996( ) ;
         }
         Gx_mode = sMode996 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound996 = (short)(0) ;
         initializeNonKeyXL996( ) ;
         sMode996 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode996 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyXL996( ) ;
      if ( RcdFound996 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound996 = (short)(0) ;
      /* Using cursor T00XL18 */
      pr_default.execute(16, new Object[] {Integer.valueOf(A7049OGSCod), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T00XL18_A7049OGSCod[0] < A7049OGSCod ) ) && ( GXutil.strcmp(T00XL18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T00XL18_A7049OGSCod[0] > A7049OGSCod ) ) && ( GXutil.strcmp(T00XL18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A7049OGSCod = T00XL18_A7049OGSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
            RcdFound996 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound996 = (short)(0) ;
      /* Using cursor T00XL19 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A7049OGSCod), A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T00XL19_A7049OGSCod[0] > A7049OGSCod ) ) && ( GXutil.strcmp(T00XL19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T00XL19_A7049OGSCod[0] < A7049OGSCod ) ) && ( GXutil.strcmp(T00XL19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A7049OGSCod = T00XL19_A7049OGSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
            RcdFound996 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyXL996( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOGSCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertXL996( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound996 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7049OGSCod != Z7049OGSCod ) )
            {
               A7049OGSCod = Z7049OGSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOGSCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateXL996( ) ;
               GX_FocusControl = edtOGSCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7049OGSCod != Z7049OGSCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtOGSCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertXL996( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtOGSCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertXL996( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7049OGSCod != Z7049OGSCod ) )
      {
         A7049OGSCod = Z7049OGSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOGSCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
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
      getKeyXL996( ) ;
      if ( RcdFound996 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7049OGSCod != Z7049OGSCod ) )
         {
            A7049OGSCod = Z7049OGSCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7049OGSCod != Z7049OGSCod ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tshagra");
      GX_FocusControl = chkOGSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_XL0( ) ;
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
      if ( RcdFound996 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = chkOGSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartXL996( ) ;
      if ( RcdFound996 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      GX_FocusControl = chkOGSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXL996( ) ;
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
      if ( RcdFound996 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      GX_FocusControl = chkOGSEst.getInternalname() ;
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
      if ( RcdFound996 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      GX_FocusControl = chkOGSEst.getInternalname() ;
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
      scanStartXL996( ) ;
      if ( RcdFound996 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound996 != 0 )
         {
            scanNextXL996( ) ;
         }
      }
      GX_FocusControl = chkOGSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXL996( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyXL996( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XL5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaGra"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z7050OGSEst, T00XL5_A7050OGSEst[0]) != 0 ) || ( GXutil.strcmp(Z7051OGSUsuCre, T00XL5_A7051OGSUsuCre[0]) != 0 ) || !( GXutil.dateCompare(Z7052OGSFchCre, T00XL5_A7052OGSFchCre[0]) ) || ( GXutil.strcmp(Z7053OGSUsuRea, T00XL5_A7053OGSUsuRea[0]) != 0 ) || !( GXutil.dateCompare(Z7054OGSFchRea, T00XL5_A7054OGSFchRea[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7141OGSAnc, T00XL5_A7141OGSAnc[0]) != 0 ) || ( DecimalUtil.compareTo(Z7142OGSGal, T00XL5_A7142OGSGal[0]) != 0 ) || ( GXutil.strcmp(Z7143OGSUbi, T00XL5_A7143OGSUbi[0]) != 0 ) || ( GXutil.strcmp(Z7144OGSTpo, T00XL5_A7144OGSTpo[0]) != 0 ) || ( Z7519OGSMaq != T00XL5_A7519OGSMaq[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7520OGSSeg, T00XL5_A7520OGSSeg[0]) != 0 ) || ( GXutil.strcmp(Z7521OGSDsc, T00XL5_A7521OGSDsc[0]) != 0 ) || ( GXutil.strcmp(Z7522OGSTam, T00XL5_A7522OGSTam[0]) != 0 ) || ( GXutil.strcmp(Z10885OGSDibC, T00XL5_A10885OGSDibC[0]) != 0 ) || ( Z10886OGSDibI != T00XL5_A10886OGSDibI[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z129BarCod != T00XL5_A129BarCod[0] ) || ( Z132BarCodReo != T00XL5_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00XL5_A130BarCodPar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z7050OGSEst, T00XL5_A7050OGSEst[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSEst");
               GXutil.writeLogRaw("Old: ",Z7050OGSEst);
               GXutil.writeLogRaw("Current: ",T00XL5_A7050OGSEst[0]);
            }
            if ( GXutil.strcmp(Z7051OGSUsuCre, T00XL5_A7051OGSUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSUsuCre");
               GXutil.writeLogRaw("Old: ",Z7051OGSUsuCre);
               GXutil.writeLogRaw("Current: ",T00XL5_A7051OGSUsuCre[0]);
            }
            if ( !( GXutil.dateCompare(Z7052OGSFchCre, T00XL5_A7052OGSFchCre[0]) ) )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSFchCre");
               GXutil.writeLogRaw("Old: ",Z7052OGSFchCre);
               GXutil.writeLogRaw("Current: ",T00XL5_A7052OGSFchCre[0]);
            }
            if ( GXutil.strcmp(Z7053OGSUsuRea, T00XL5_A7053OGSUsuRea[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSUsuRea");
               GXutil.writeLogRaw("Old: ",Z7053OGSUsuRea);
               GXutil.writeLogRaw("Current: ",T00XL5_A7053OGSUsuRea[0]);
            }
            if ( !( GXutil.dateCompare(Z7054OGSFchRea, T00XL5_A7054OGSFchRea[0]) ) )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSFchRea");
               GXutil.writeLogRaw("Old: ",Z7054OGSFchRea);
               GXutil.writeLogRaw("Current: ",T00XL5_A7054OGSFchRea[0]);
            }
            if ( DecimalUtil.compareTo(Z7141OGSAnc, T00XL5_A7141OGSAnc[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSAnc");
               GXutil.writeLogRaw("Old: ",Z7141OGSAnc);
               GXutil.writeLogRaw("Current: ",T00XL5_A7141OGSAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z7142OGSGal, T00XL5_A7142OGSGal[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSGal");
               GXutil.writeLogRaw("Old: ",Z7142OGSGal);
               GXutil.writeLogRaw("Current: ",T00XL5_A7142OGSGal[0]);
            }
            if ( GXutil.strcmp(Z7143OGSUbi, T00XL5_A7143OGSUbi[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSUbi");
               GXutil.writeLogRaw("Old: ",Z7143OGSUbi);
               GXutil.writeLogRaw("Current: ",T00XL5_A7143OGSUbi[0]);
            }
            if ( GXutil.strcmp(Z7144OGSTpo, T00XL5_A7144OGSTpo[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSTpo");
               GXutil.writeLogRaw("Old: ",Z7144OGSTpo);
               GXutil.writeLogRaw("Current: ",T00XL5_A7144OGSTpo[0]);
            }
            if ( Z7519OGSMaq != T00XL5_A7519OGSMaq[0] )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSMaq");
               GXutil.writeLogRaw("Old: ",Z7519OGSMaq);
               GXutil.writeLogRaw("Current: ",T00XL5_A7519OGSMaq[0]);
            }
            if ( GXutil.strcmp(Z7520OGSSeg, T00XL5_A7520OGSSeg[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSSeg");
               GXutil.writeLogRaw("Old: ",Z7520OGSSeg);
               GXutil.writeLogRaw("Current: ",T00XL5_A7520OGSSeg[0]);
            }
            if ( GXutil.strcmp(Z7521OGSDsc, T00XL5_A7521OGSDsc[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSDsc");
               GXutil.writeLogRaw("Old: ",Z7521OGSDsc);
               GXutil.writeLogRaw("Current: ",T00XL5_A7521OGSDsc[0]);
            }
            if ( GXutil.strcmp(Z7522OGSTam, T00XL5_A7522OGSTam[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSTam");
               GXutil.writeLogRaw("Old: ",Z7522OGSTam);
               GXutil.writeLogRaw("Current: ",T00XL5_A7522OGSTam[0]);
            }
            if ( GXutil.strcmp(Z10885OGSDibC, T00XL5_A10885OGSDibC[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSDibC");
               GXutil.writeLogRaw("Old: ",Z10885OGSDibC);
               GXutil.writeLogRaw("Current: ",T00XL5_A10885OGSDibC[0]);
            }
            if ( Z10886OGSDibI != T00XL5_A10886OGSDibI[0] )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"OGSDibI");
               GXutil.writeLogRaw("Old: ",Z10886OGSDibI);
               GXutil.writeLogRaw("Current: ",T00XL5_A10886OGSDibI[0]);
            }
            if ( Z129BarCod != T00XL5_A129BarCod[0] )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00XL5_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00XL5_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00XL5_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00XL5_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00XL5_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPShaGra"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXL996( )
   {
      beforeValidateXL996( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXL996( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXL996( 0) ;
         checkOptimisticConcurrencyXL996( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXL996( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXL996( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XL20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A7049OGSCod), Boolean.valueOf(n7050OGSEst), A7050OGSEst, Boolean.valueOf(n7051OGSUsuCre), A7051OGSUsuCre, Boolean.valueOf(n7052OGSFchCre), A7052OGSFchCre, Boolean.valueOf(n7053OGSUsuRea), A7053OGSUsuRea, Boolean.valueOf(n7054OGSFchRea), A7054OGSFchRea, Boolean.valueOf(n7141OGSAnc), A7141OGSAnc, Boolean.valueOf(n7142OGSGal), A7142OGSGal, Boolean.valueOf(n7143OGSUbi), A7143OGSUbi, Boolean.valueOf(n7144OGSTpo), A7144OGSTpo, Boolean.valueOf(n7519OGSMaq), Byte.valueOf(A7519OGSMaq), Boolean.valueOf(n7520OGSSeg), A7520OGSSeg, Boolean.valueOf(n7521OGSDsc), A7521OGSDsc, Boolean.valueOf(n7522OGSTam), A7522OGSTam, Boolean.valueOf(n7055OGSObs), A7055OGSObs, Boolean.valueOf(n10885OGSDibC), A10885OGSDibC, Boolean.valueOf(n10886OGSDibI), Integer.valueOf(A10886OGSDibI), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevelXL996( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionXL0( ) ;
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
            loadXL996( ) ;
         }
         endLevelXL996( ) ;
      }
      closeExtendedTableCursorsXL996( ) ;
   }

   public void updateXL996( )
   {
      beforeValidateXL996( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXL996( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXL996( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXL996( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateXL996( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XL21 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n7050OGSEst), A7050OGSEst, Boolean.valueOf(n7051OGSUsuCre), A7051OGSUsuCre, Boolean.valueOf(n7052OGSFchCre), A7052OGSFchCre, Boolean.valueOf(n7053OGSUsuRea), A7053OGSUsuRea, Boolean.valueOf(n7054OGSFchRea), A7054OGSFchRea, Boolean.valueOf(n7141OGSAnc), A7141OGSAnc, Boolean.valueOf(n7142OGSGal), A7142OGSGal, Boolean.valueOf(n7143OGSUbi), A7143OGSUbi, Boolean.valueOf(n7144OGSTpo), A7144OGSTpo, Boolean.valueOf(n7519OGSMaq), Byte.valueOf(A7519OGSMaq), Boolean.valueOf(n7520OGSSeg), A7520OGSSeg, Boolean.valueOf(n7521OGSDsc), A7521OGSDsc, Boolean.valueOf(n7522OGSTam), A7522OGSTam, Boolean.valueOf(n7055OGSObs), A7055OGSObs, Boolean.valueOf(n10885OGSDibC), A10885OGSDibC, Boolean.valueOf(n10886OGSDibI), Integer.valueOf(A10886OGSDibI), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A396EmprCod, Integer.valueOf(A7049OGSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaGra"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateXL996( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelXL996( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionXL0( ) ;
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
         endLevelXL996( ) ;
      }
      closeExtendedTableCursorsXL996( ) ;
   }

   public void deferredUpdateXL996( )
   {
   }

   public void delete( )
   {
      beforeValidateXL996( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXL996( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXL996( ) ;
         afterConfirmXL996( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXL996( ) ;
            if ( AnyError == 0 )
            {
               scanStartXL997( ) ;
               while ( RcdFound997 != 0 )
               {
                  getByPrimaryKeyXL997( ) ;
                  deleteXL997( ) ;
                  scanNextXL997( ) ;
               }
               scanEndXL997( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XL22 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound996 == 0 )
                        {
                           initAllXL996( ) ;
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaptionXL0( ) ;
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
      sMode996 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXL996( ) ;
      Gx_mode = sMode996 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXL996( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00XL23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = T00XL23_A361DisCod[0] ;
         A252CliCod = T00XL23_A252CliCod[0] ;
         n252CliCod = T00XL23_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(21);
         /* Using cursor T00XL24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A1013DibCli = T00XL24_A1013DibCli[0] ;
         n1013DibCli = T00XL24_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T00XL24_A1014DibInt[0] ;
         n1014DibInt = T00XL24_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         pr_default.close(22);
         /* Using cursor T00XL25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00XL25_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(23);
         /* Using cursor T00XL26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         A2090DibMolCi2 = T00XL26_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = T00XL26_n2090DibMolCi2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         A1823DibTipMaq = T00XL26_A1823DibTipMaq[0] ;
         n1823DibTipMaq = T00XL26_n1823DibTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = T00XL26_A1019DibMolCil[0] ;
         n1019DibMolCil = T00XL26_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         pr_default.close(24);
      }
   }

   public void processNestedLevelXL997( )
   {
      nGXsfl_164_idx = 0 ;
      while ( nGXsfl_164_idx < nRC_GXsfl_164 )
      {
         readRowXL997( ) ;
         if ( ( nRcdExists_997 != 0 ) || ( nIsMod_997 != 0 ) )
         {
            standaloneNotModalXL997( ) ;
            getKeyXL997( ) ;
            if ( ( nRcdExists_997 == 0 ) && ( nRcdDeleted_997 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertXL997( ) ;
            }
            else
            {
               if ( RcdFound997 != 0 )
               {
                  if ( ( nRcdDeleted_997 != 0 ) && ( nRcdExists_997 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteXL997( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_997 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateXL997( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_997 == 0 )
                  {
                     GXCCtl = "SHACOD_" + sGXsfl_164_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtShaCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_997_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtShaCod_Internalname, GXutil.rtrim( A7031ShaCod)) ;
         httpContext.changePostValue( edtShaOGSOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7056ShaOGSOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkShaGrb.getInternalname(), ((GXutil.strcmp(A7036ShaGrb, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( cmbShaTipMaq.getInternalname(), GXutil.rtrim( A7037ShaTipMaq)) ;
         httpContext.changePostValue( edtShaMal_Internalname, GXutil.rtrim( A7032ShaMal)) ;
         httpContext.changePostValue( edtShaAnc_Internalname, GXutil.rtrim( A7033ShaAnc)) ;
         httpContext.changePostValue( edtShaUbi_Internalname, GXutil.rtrim( A7035ShaUbi)) ;
         httpContext.changePostValue( "ZT_"+"Z7031ShaCod_"+sGXsfl_164_idx, GXutil.rtrim( Z7031ShaCod)) ;
         httpContext.changePostValue( "ZT_"+"Z7056ShaOGSOrd_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( Z7056ShaOGSOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_997_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_997_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_997_"+sGXsfl_164_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_997 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_997_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_997_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHACOD_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAOGSORD_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaOGSOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAGRB_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkShaGrb.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHATIPMAQ_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbShaTipMaq.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAMAL_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaMal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAANC_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SHAUBI_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaUbi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllXL997( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_997 = (short)(0) ;
      nIsMod_997 = (short)(0) ;
      nRcdDeleted_997 = (short)(0) ;
   }

   public void processLevelXL996( )
   {
      /* Save parent mode. */
      sMode996 = Gx_mode ;
      processNestedLevelXL997( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode996 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelXL996( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteXL996( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tshagra");
         if ( AnyError == 0 )
         {
            confirmValuesXL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tshagra");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartXL996( )
   {
      this.A396EmprCod = A396EmprCod ;
      /* Scan By routine */
      /* Using cursor T00XL27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound996 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound996 = (short)(1) ;
         A7049OGSCod = T00XL27_A7049OGSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXL996( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound996 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound996 = (short)(1) ;
         A7049OGSCod = T00XL27_A7049OGSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
      }
   }

   public void scanEndXL996( )
   {
      pr_default.close(25);
   }

   public void afterConfirmXL996( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertXL996( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXL996( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXL996( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXL996( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXL996( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXL996( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOGSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSCod_Enabled), 5, 0), true);
      chkOGSEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkOGSEst.getInternalname(), "Enabled", GXutil.ltrimstr( chkOGSEst.getEnabled(), 5, 0), true);
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
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDibMolCi2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCi2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCi2_Enabled), 5, 0), true);
      lstDibTipMaq.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Enabled", GXutil.ltrimstr( lstDibTipMaq.getEnabled(), 5, 0), true);
      edtDibMolCil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCil_Enabled), 5, 0), true);
      edtOGSUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSUsuCre_Enabled), 5, 0), true);
      edtOGSFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSFchCre_Enabled), 5, 0), true);
      edtOGSUsuRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSUsuRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSUsuRea_Enabled), 5, 0), true);
      edtOGSFchRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSFchRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSFchRea_Enabled), 5, 0), true);
      edtOGSAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSAnc_Enabled), 5, 0), true);
      edtOGSGal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSGal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSGal_Enabled), 5, 0), true);
      edtOGSUbi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSUbi_Enabled), 5, 0), true);
      edtOGSTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSTpo_Enabled), 5, 0), true);
      edtOGSMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSMaq_Enabled), 5, 0), true);
      edtOGSSeg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSSeg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSSeg_Enabled), 5, 0), true);
      edtOGSDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSDsc_Enabled), 5, 0), true);
      cmbOGSTam.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOGSTam.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOGSTam.getEnabled(), 5, 0), true);
      edtOGSObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSObs_Enabled), 5, 0), true);
      edtOGSDibC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSDibC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSDibC_Enabled), 5, 0), true);
      edtOGSDibI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOGSDibI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOGSDibI_Enabled), 5, 0), true);
   }

   public void zmXL997( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7056ShaOGSOrd = T00XL3_A7056ShaOGSOrd[0] ;
         }
         else
         {
            Z7056ShaOGSOrd = A7056ShaOGSOrd ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z7049OGSCod = A7049OGSCod ;
         Z7056ShaOGSOrd = A7056ShaOGSOrd ;
         Z396EmprCod = A396EmprCod ;
         Z7031ShaCod = A7031ShaCod ;
         Z7041ShaDibCli = A7041ShaDibCli ;
         Z7042ShaDibInt = A7042ShaDibInt ;
         Z7036ShaGrb = A7036ShaGrb ;
         Z7037ShaTipMaq = A7037ShaTipMaq ;
         Z7032ShaMal = A7032ShaMal ;
         Z7033ShaAnc = A7033ShaAnc ;
         Z7035ShaUbi = A7035ShaUbi ;
      }
   }

   public void standaloneNotModalXL997( )
   {
   }

   public void standaloneModalXL997( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtShaCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtShaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaCod_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      }
      else
      {
         edtShaCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtShaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaCod_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      }
   }

   public void loadXL997( )
   {
      /* Using cursor T00XL28 */
      pr_default.execute(26, new Object[] {Integer.valueOf(A7049OGSCod), A396EmprCod, A7031ShaCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound997 = (short)(1) ;
         A7041ShaDibCli = T00XL28_A7041ShaDibCli[0] ;
         A7042ShaDibInt = T00XL28_A7042ShaDibInt[0] ;
         A7056ShaOGSOrd = T00XL28_A7056ShaOGSOrd[0] ;
         n7056ShaOGSOrd = T00XL28_n7056ShaOGSOrd[0] ;
         A7036ShaGrb = T00XL28_A7036ShaGrb[0] ;
         n7036ShaGrb = T00XL28_n7036ShaGrb[0] ;
         A7037ShaTipMaq = T00XL28_A7037ShaTipMaq[0] ;
         n7037ShaTipMaq = T00XL28_n7037ShaTipMaq[0] ;
         A7032ShaMal = T00XL28_A7032ShaMal[0] ;
         n7032ShaMal = T00XL28_n7032ShaMal[0] ;
         A7033ShaAnc = T00XL28_A7033ShaAnc[0] ;
         n7033ShaAnc = T00XL28_n7033ShaAnc[0] ;
         A7035ShaUbi = T00XL28_A7035ShaUbi[0] ;
         n7035ShaUbi = T00XL28_n7035ShaUbi[0] ;
         zmXL997( -7) ;
      }
      pr_default.close(26);
      onLoadActionsXL997( ) ;
   }

   public void onLoadActionsXL997( )
   {
   }

   public void checkExtendedTableXL997( )
   {
      nIsDirty_997 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalXL997( ) ;
      /* Using cursor T00XL4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A7031ShaCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "SHACOD_" + sGXsfl_164_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Shablones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtShaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7041ShaDibCli = T00XL4_A7041ShaDibCli[0] ;
      A7042ShaDibInt = T00XL4_A7042ShaDibInt[0] ;
      A7036ShaGrb = T00XL4_A7036ShaGrb[0] ;
      n7036ShaGrb = T00XL4_n7036ShaGrb[0] ;
      A7037ShaTipMaq = T00XL4_A7037ShaTipMaq[0] ;
      n7037ShaTipMaq = T00XL4_n7037ShaTipMaq[0] ;
      A7032ShaMal = T00XL4_A7032ShaMal[0] ;
      n7032ShaMal = T00XL4_n7032ShaMal[0] ;
      A7033ShaAnc = T00XL4_A7033ShaAnc[0] ;
      n7033ShaAnc = T00XL4_n7033ShaAnc[0] ;
      A7035ShaUbi = T00XL4_A7035ShaUbi[0] ;
      n7035ShaUbi = T00XL4_n7035ShaUbi[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsXL997( )
   {
      pr_default.close(2);
   }

   public void enableDisableXL997( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         String A7031ShaCod )
   {
      /* Using cursor T00XL29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A7031ShaCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         GXCCtl = "SHACOD_" + sGXsfl_164_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Shablones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtShaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7041ShaDibCli = T00XL29_A7041ShaDibCli[0] ;
      A7042ShaDibInt = T00XL29_A7042ShaDibInt[0] ;
      A7036ShaGrb = T00XL29_A7036ShaGrb[0] ;
      n7036ShaGrb = T00XL29_n7036ShaGrb[0] ;
      A7037ShaTipMaq = T00XL29_A7037ShaTipMaq[0] ;
      n7037ShaTipMaq = T00XL29_n7037ShaTipMaq[0] ;
      A7032ShaMal = T00XL29_A7032ShaMal[0] ;
      n7032ShaMal = T00XL29_n7032ShaMal[0] ;
      A7033ShaAnc = T00XL29_A7033ShaAnc[0] ;
      n7033ShaAnc = T00XL29_n7033ShaAnc[0] ;
      A7035ShaUbi = T00XL29_A7035ShaUbi[0] ;
      n7035ShaUbi = T00XL29_n7035ShaUbi[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7041ShaDibCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7042ShaDibInt, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7036ShaGrb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7037ShaTipMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7032ShaMal))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7033ShaAnc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7035ShaUbi))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void getKeyXL997( )
   {
      /* Using cursor T00XL30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), A7031ShaCod});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound997 = (short)(1) ;
      }
      else
      {
         RcdFound997 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKeyXL997( )
   {
      /* Using cursor T00XL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), A7031ShaCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00XL3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmXL997( 7) ;
         RcdFound997 = (short)(1) ;
         initializeNonKeyXL997( ) ;
         A7056ShaOGSOrd = T00XL3_A7056ShaOGSOrd[0] ;
         n7056ShaOGSOrd = T00XL3_n7056ShaOGSOrd[0] ;
         A7031ShaCod = T00XL3_A7031ShaCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z7049OGSCod = A7049OGSCod ;
         Z7031ShaCod = A7031ShaCod ;
         sMode997 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadXL997( ) ;
         Gx_mode = sMode997 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound997 = (short)(0) ;
         initializeNonKeyXL997( ) ;
         sMode997 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXL997( ) ;
         Gx_mode = sMode997 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesXL997( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyXL997( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), A7031ShaCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaGr1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z7056ShaOGSOrd != T00XL2_A7056ShaOGSOrd[0] ) )
         {
            if ( Z7056ShaOGSOrd != T00XL2_A7056ShaOGSOrd[0] )
            {
               GXutil.writeLogln("tshagra:[seudo value changed for attri]"+"ShaOGSOrd");
               GXutil.writeLogRaw("Old: ",Z7056ShaOGSOrd);
               GXutil.writeLogRaw("Current: ",T00XL2_A7056ShaOGSOrd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPShaGr1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXL997( )
   {
      beforeValidateXL997( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXL997( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXL997( 0) ;
         checkOptimisticConcurrencyXL997( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXL997( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXL997( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XL31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A7049OGSCod), Boolean.valueOf(n7056ShaOGSOrd), Byte.valueOf(A7056ShaOGSOrd), A396EmprCod, A7031ShaCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGr1");
                  if ( (pr_default.getStatus(29) == 1) )
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
            loadXL997( ) ;
         }
         endLevelXL997( ) ;
      }
      closeExtendedTableCursorsXL997( ) ;
   }

   public void updateXL997( )
   {
      beforeValidateXL997( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXL997( ) ;
      }
      if ( ( nIsMod_997 != 0 ) || ( nIsDirty_997 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyXL997( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmXL997( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateXL997( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00XL32 */
                     pr_default.execute(30, new Object[] {Boolean.valueOf(n7056ShaOGSOrd), Byte.valueOf(A7056ShaOGSOrd), A396EmprCod, Integer.valueOf(A7049OGSCod), A7031ShaCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGr1");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaGr1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateXL997( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyXL997( ) ;
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
            endLevelXL997( ) ;
         }
      }
      closeExtendedTableCursorsXL997( ) ;
   }

   public void deferredUpdateXL997( )
   {
   }

   public void deleteXL997( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXL997( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXL997( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXL997( ) ;
         afterConfirmXL997( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXL997( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00XL33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), A7031ShaCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGr1");
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
      sMode997 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXL997( ) ;
      Gx_mode = sMode997 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXL997( )
   {
      standaloneModalXL997( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00XL34 */
         pr_default.execute(32, new Object[] {A396EmprCod, A7031ShaCod});
         A7041ShaDibCli = T00XL34_A7041ShaDibCli[0] ;
         A7042ShaDibInt = T00XL34_A7042ShaDibInt[0] ;
         A7036ShaGrb = T00XL34_A7036ShaGrb[0] ;
         n7036ShaGrb = T00XL34_n7036ShaGrb[0] ;
         A7037ShaTipMaq = T00XL34_A7037ShaTipMaq[0] ;
         n7037ShaTipMaq = T00XL34_n7037ShaTipMaq[0] ;
         A7032ShaMal = T00XL34_A7032ShaMal[0] ;
         n7032ShaMal = T00XL34_n7032ShaMal[0] ;
         A7033ShaAnc = T00XL34_A7033ShaAnc[0] ;
         n7033ShaAnc = T00XL34_n7033ShaAnc[0] ;
         A7035ShaUbi = T00XL34_A7035ShaUbi[0] ;
         n7035ShaUbi = T00XL34_n7035ShaUbi[0] ;
         pr_default.close(32);
      }
   }

   public void endLevelXL997( )
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

   public void scanStartXL997( )
   {
      /* Scan By routine */
      /* Using cursor T00XL35 */
      pr_default.execute(33, new Object[] {Integer.valueOf(A7049OGSCod), A396EmprCod});
      RcdFound997 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound997 = (short)(1) ;
         A7031ShaCod = T00XL35_A7031ShaCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXL997( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound997 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound997 = (short)(1) ;
         A7031ShaCod = T00XL35_A7031ShaCod[0] ;
      }
   }

   public void scanEndXL997( )
   {
      pr_default.close(33);
   }

   public void afterConfirmXL997( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertXL997( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXL997( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXL997( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXL997( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXL997( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXL997( )
   {
      edtShaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtShaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaCod_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      edtShaOGSOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtShaOGSOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaOGSOrd_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      chkShaGrb.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkShaGrb.getInternalname(), "Enabled", GXutil.ltrimstr( chkShaGrb.getEnabled(), 5, 0), !bGXsfl_164_Refreshing);
      cmbShaTipMaq.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbShaTipMaq.getInternalname(), "Enabled", GXutil.ltrimstr( cmbShaTipMaq.getEnabled(), 5, 0), !bGXsfl_164_Refreshing);
      edtShaMal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtShaMal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaMal_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      edtShaAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtShaAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaAnc_Enabled), 5, 0), !bGXsfl_164_Refreshing);
      edtShaUbi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtShaUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaUbi_Enabled), 5, 0), !bGXsfl_164_Refreshing);
   }

   public void send_integrity_lvl_hashesXL997( )
   {
   }

   public void send_integrity_lvl_hashesXL996( )
   {
   }

   public void subsflControlProps_164997( )
   {
      edtavnRcdDeleted_997_Internalname = "vNRCDDELETED_997_"+sGXsfl_164_idx ;
      edtShaCod_Internalname = "SHACOD_"+sGXsfl_164_idx ;
      edtShaOGSOrd_Internalname = "SHAOGSORD_"+sGXsfl_164_idx ;
      chkShaGrb.setInternalname( "SHAGRB_"+sGXsfl_164_idx );
      cmbShaTipMaq.setInternalname( "SHATIPMAQ_"+sGXsfl_164_idx );
      edtShaMal_Internalname = "SHAMAL_"+sGXsfl_164_idx ;
      edtShaAnc_Internalname = "SHAANC_"+sGXsfl_164_idx ;
      edtShaUbi_Internalname = "SHAUBI_"+sGXsfl_164_idx ;
   }

   public void subsflControlProps_fel_164997( )
   {
      edtavnRcdDeleted_997_Internalname = "vNRCDDELETED_997_"+sGXsfl_164_fel_idx ;
      edtShaCod_Internalname = "SHACOD_"+sGXsfl_164_fel_idx ;
      edtShaOGSOrd_Internalname = "SHAOGSORD_"+sGXsfl_164_fel_idx ;
      chkShaGrb.setInternalname( "SHAGRB_"+sGXsfl_164_fel_idx );
      cmbShaTipMaq.setInternalname( "SHATIPMAQ_"+sGXsfl_164_fel_idx );
      edtShaMal_Internalname = "SHAMAL_"+sGXsfl_164_fel_idx ;
      edtShaAnc_Internalname = "SHAANC_"+sGXsfl_164_fel_idx ;
      edtShaUbi_Internalname = "SHAUBI_"+sGXsfl_164_fel_idx ;
   }

   public void addRowXL997( )
   {
      nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_164997( ) ;
      sendRowXL997( ) ;
   }

   public void sendRowXL997( )
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
         if ( ((int)((nGXsfl_164_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_997_" + sGXsfl_164_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 165,'',false,'" + sGXsfl_164_idx + "',164)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_997_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_997_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_997), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_997), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_997_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_997_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_997_" + sGXsfl_164_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_164_idx + "',164)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtShaCod_Internalname,GXutil.rtrim( A7031ShaCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtShaCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtShaCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_997_" + sGXsfl_164_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 167,'',false,'" + sGXsfl_164_idx + "',164)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtShaOGSOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A7056ShaOGSOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtShaOGSOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7056ShaOGSOrd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7056ShaOGSOrd), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,167);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtShaOGSOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtShaOGSOrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "SHAGRB_" + sGXsfl_164_idx ;
      chkShaGrb.setName( GXCCtl );
      chkShaGrb.setWebtags( "" );
      chkShaGrb.setCaption( httpContext.getMessage( "Grabado", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkShaGrb.getInternalname(), "TitleCaption", chkShaGrb.getCaption(), !bGXsfl_164_Refreshing);
      chkShaGrb.setCheckedValue( "N" );
      A7036ShaGrb = ((GXutil.strcmp(GXutil.rtrim( A7036ShaGrb), "S")==0) ? "S" : "N") ;
      n7036ShaGrb = false ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkShaGrb.getInternalname(),A7036ShaGrb,"","",Integer.valueOf(-1),Integer.valueOf(chkShaGrb.getEnabled()),"S",httpContext.getMessage( "Grabado", ""),StyleString,ClassString,"","",""});
      /* Subfile cell */
      GXCCtl = "SHATIPMAQ_" + sGXsfl_164_idx ;
      cmbShaTipMaq.setName( GXCCtl );
      cmbShaTipMaq.setWebtags( "" );
      cmbShaTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
      cmbShaTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
      if ( cmbShaTipMaq.getItemCount() > 0 )
      {
         A7037ShaTipMaq = cmbShaTipMaq.getValidValue(A7037ShaTipMaq) ;
         n7037ShaTipMaq = false ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbShaTipMaq,cmbShaTipMaq.getInternalname(),GXutil.rtrim( A7037ShaTipMaq),Integer.valueOf(1),cmbShaTipMaq.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbShaTipMaq.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbShaTipMaq.setValue( GXutil.rtrim( A7037ShaTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, cmbShaTipMaq.getInternalname(), "Values", cmbShaTipMaq.ToJavascriptSource(), !bGXsfl_164_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtShaMal_Internalname,GXutil.rtrim( A7032ShaMal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtShaMal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtShaMal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtShaAnc_Internalname,GXutil.rtrim( A7033ShaAnc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtShaAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtShaAnc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtShaUbi_Internalname,GXutil.rtrim( A7035ShaUbi),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtShaUbi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtShaUbi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(164),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesXL997( ) ;
      GXCCtl = "Z7031ShaCod_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7031ShaCod));
      GXCCtl = "Z7056ShaOGSOrd_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7056ShaOGSOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_997_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_997_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_997_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_997, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vOGSCOD_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33OGSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_164_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_997_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_997_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHACOD_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHAOGSORD_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaOGSOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHAGRB_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkShaGrb.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHATIPMAQ_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbShaTipMaq.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHAMAL_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaMal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHAANC_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHAUBI_"+sGXsfl_164_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtShaUbi_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowXL997( )
   {
      nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_164997( ) ;
      edtavnRcdDeleted_997_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_997_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtShaCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHACOD_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtShaOGSOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAOGSORD_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkShaGrb.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "SHAGRB_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbShaTipMaq.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "SHATIPMAQ_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtShaMal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAMAL_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtShaAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAANC_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtShaUbi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SHAUBI_"+sGXsfl_164_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_997_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_997_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_997");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_997_Internalname ;
         wbErr = true ;
         nRcdDeleted_997 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_997 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_997_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7031ShaCod = httpContext.cgiGet( edtShaCod_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtShaOGSOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtShaOGSOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SHAOGSORD_" + sGXsfl_164_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtShaOGSOrd_Internalname ;
         wbErr = true ;
         A7056ShaOGSOrd = (byte)(0) ;
         n7056ShaOGSOrd = false ;
      }
      else
      {
         A7056ShaOGSOrd = (byte)(localUtil.ctol( httpContext.cgiGet( edtShaOGSOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7056ShaOGSOrd = false ;
      }
      A7036ShaGrb = ((GXutil.strcmp(httpContext.cgiGet( chkShaGrb.getInternalname()), "S")==0) ? "S" : "N") ;
      n7036ShaGrb = false ;
      cmbShaTipMaq.setName( cmbShaTipMaq.getInternalname() );
      cmbShaTipMaq.setValue( httpContext.cgiGet( cmbShaTipMaq.getInternalname()) );
      A7037ShaTipMaq = httpContext.cgiGet( cmbShaTipMaq.getInternalname()) ;
      n7037ShaTipMaq = false ;
      A7032ShaMal = httpContext.cgiGet( edtShaMal_Internalname) ;
      n7032ShaMal = false ;
      A7033ShaAnc = httpContext.cgiGet( edtShaAnc_Internalname) ;
      n7033ShaAnc = false ;
      A7035ShaUbi = httpContext.cgiGet( edtShaUbi_Internalname) ;
      n7035ShaUbi = false ;
      GXCCtl = "Z7031ShaCod_" + sGXsfl_164_idx ;
      Z7031ShaCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7056ShaOGSOrd_" + sGXsfl_164_idx ;
      Z7056ShaOGSOrd = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_997_" + sGXsfl_164_idx ;
      nRcdDeleted_997 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_997_" + sGXsfl_164_idx ;
      nRcdExists_997 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_997_" + sGXsfl_164_idx ;
      nIsMod_997 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtShaCod_Enabled = edtShaCod_Enabled ;
   }

   public void confirmValuesXL0( )
   {
      nGXsfl_164_idx = 0 ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_164997( ) ;
      while ( nGXsfl_164_idx < nRC_GXsfl_164 )
      {
         nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_164997( ) ;
         httpContext.changePostValue( "Z7031ShaCod_"+sGXsfl_164_idx, httpContext.cgiGet( "ZT_"+"Z7031ShaCod_"+sGXsfl_164_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7031ShaCod_"+sGXsfl_164_idx) ;
         httpContext.changePostValue( "Z7056ShaOGSOrd_"+sGXsfl_164_idx, httpContext.cgiGet( "ZT_"+"Z7056ShaOGSOrd_"+sGXsfl_164_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7056ShaOGSOrd_"+sGXsfl_164_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tshagra", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33OGSCod,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","OGSCod","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TShaGra");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tshagra:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7049OGSCod", GXutil.ltrim( localUtil.ntoc( Z7049OGSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7050OGSEst", GXutil.rtrim( Z7050OGSEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7051OGSUsuCre", GXutil.rtrim( Z7051OGSUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7052OGSFchCre", localUtil.ttoc( Z7052OGSFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7053OGSUsuRea", GXutil.rtrim( Z7053OGSUsuRea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7054OGSFchRea", localUtil.ttoc( Z7054OGSFchRea, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7141OGSAnc", GXutil.ltrim( localUtil.ntoc( Z7141OGSAnc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7142OGSGal", GXutil.ltrim( localUtil.ntoc( Z7142OGSGal, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7143OGSUbi", GXutil.rtrim( Z7143OGSUbi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7144OGSTpo", GXutil.rtrim( Z7144OGSTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7519OGSMaq", GXutil.ltrim( localUtil.ntoc( Z7519OGSMaq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7520OGSSeg", GXutil.rtrim( Z7520OGSSeg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7521OGSDsc", GXutil.rtrim( Z7521OGSDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7522OGSTam", GXutil.rtrim( Z7522OGSTam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10885OGSDibC", GXutil.rtrim( Z10885OGSDibC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10886OGSDibI", GXutil.ltrim( localUtil.ntoc( Z10886OGSDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_164", GXutil.ltrim( localUtil.ntoc( nGXsfl_164_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOGSCOD", GXutil.ltrim( localUtil.ntoc( AV33OGSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SHADIBCLI", GXutil.rtrim( A7041ShaDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "SHADIBINT", GXutil.ltrim( localUtil.ntoc( A7042ShaDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tshagra", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33OGSCod,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","OGSCod","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TShaGra" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Grabado de Shablones", "") ;
   }

   public void initializeNonKeyXL996( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A7050OGSEst = "" ;
      n7050OGSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7050OGSEst", A7050OGSEst);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1013DibCli = "" ;
      n1013DibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = 0 ;
      n1014DibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A2090DibMolCi2 = (short)(0) ;
      n2090DibMolCi2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A1823DibTipMaq = "" ;
      n1823DibTipMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = (short)(0) ;
      n1019DibMolCil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A7051OGSUsuCre = "" ;
      n7051OGSUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7051OGSUsuCre", A7051OGSUsuCre);
      A7052OGSFchCre = GXutil.resetTime( GXutil.nullDate() );
      n7052OGSFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7052OGSFchCre", localUtil.ttoc( A7052OGSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A7053OGSUsuRea = "" ;
      n7053OGSUsuRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7053OGSUsuRea", A7053OGSUsuRea);
      A7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
      n7054OGSFchRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7054OGSFchRea", localUtil.ttoc( A7054OGSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A7141OGSAnc = DecimalUtil.ZERO ;
      n7141OGSAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7141OGSAnc", GXutil.ltrimstr( A7141OGSAnc, 5, 2));
      A7142OGSGal = DecimalUtil.ZERO ;
      n7142OGSGal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7142OGSGal", GXutil.ltrimstr( A7142OGSGal, 6, 3));
      A7143OGSUbi = "" ;
      n7143OGSUbi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7143OGSUbi", A7143OGSUbi);
      A7144OGSTpo = "" ;
      n7144OGSTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7144OGSTpo", A7144OGSTpo);
      A7519OGSMaq = (byte)(0) ;
      n7519OGSMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7519OGSMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7519OGSMaq), 2, 0));
      A7520OGSSeg = "" ;
      n7520OGSSeg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7520OGSSeg", A7520OGSSeg);
      A7521OGSDsc = "" ;
      n7521OGSDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7521OGSDsc", A7521OGSDsc);
      A7522OGSTam = "" ;
      n7522OGSTam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7522OGSTam", A7522OGSTam);
      A7055OGSObs = "" ;
      n7055OGSObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7055OGSObs", A7055OGSObs);
      A10885OGSDibC = "" ;
      n10885OGSDibC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10885OGSDibC", A10885OGSDibC);
      A10886OGSDibI = 0 ;
      n10886OGSDibI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10886OGSDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10886OGSDibI), 8, 0));
      Z7050OGSEst = "" ;
      Z7051OGSUsuCre = "" ;
      Z7052OGSFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z7053OGSUsuRea = "" ;
      Z7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
      Z7141OGSAnc = DecimalUtil.ZERO ;
      Z7142OGSGal = DecimalUtil.ZERO ;
      Z7143OGSUbi = "" ;
      Z7144OGSTpo = "" ;
      Z7519OGSMaq = (byte)(0) ;
      Z7520OGSSeg = "" ;
      Z7521OGSDsc = "" ;
      Z7522OGSTam = "" ;
      Z10885OGSDibC = "" ;
      Z10886OGSDibI = 0 ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAllXL996( )
   {
      A7049OGSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7049OGSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7049OGSCod), 8, 0));
      initializeNonKeyXL996( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyXL997( )
   {
      A7041ShaDibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7041ShaDibCli", A7041ShaDibCli);
      A7042ShaDibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7042ShaDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7042ShaDibInt), 8, 0));
      A7056ShaOGSOrd = (byte)(0) ;
      n7056ShaOGSOrd = false ;
      A7036ShaGrb = "" ;
      n7036ShaGrb = false ;
      A7037ShaTipMaq = "" ;
      n7037ShaTipMaq = false ;
      A7032ShaMal = "" ;
      n7032ShaMal = false ;
      A7033ShaAnc = "" ;
      n7033ShaAnc = false ;
      A7035ShaUbi = "" ;
      n7035ShaUbi = false ;
      Z7056ShaOGSOrd = (byte)(0) ;
   }

   public void initAllXL997( )
   {
      A7031ShaCod = "" ;
      initializeNonKeyXL997( ) ;
   }

   public void standaloneModalInsertXL997( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532140", true, true);
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
      httpContext.AddJavascriptSource("tshagra.js", "?20268241532140", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties997( )
   {
      edtShaCod_Enabled = defedtShaCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtShaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtShaCod_Enabled), 5, 0), !bGXsfl_164_Refreshing);
   }

   public void startgridcontrol164( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_997, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_997_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7031ShaCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtShaCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7056ShaOGSOrd, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtShaOGSOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7036ShaGrb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkShaGrb.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7037ShaTipMaq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbShaTipMaq.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7032ShaMal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtShaMal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7033ShaAnc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtShaAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7035ShaUbi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtShaUbi_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOGSCod_Internalname = "OGSCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      chkOGSEst.setInternalname( "OGSEST" );
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDibMolCi2_Internalname = "DIBMOLCI2" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      lstDibTipMaq.setInternalname( "DIBTIPMAQ" );
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDibMolCil_Internalname = "DIBMOLCIL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOGSUsuCre_Internalname = "OGSUSUCRE" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOGSFchCre_Internalname = "OGSFCHCRE" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtOGSUsuRea_Internalname = "OGSUSUREA" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtOGSFchRea_Internalname = "OGSFCHREA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtOGSAnc_Internalname = "OGSANC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtOGSGal_Internalname = "OGSGAL" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtOGSUbi_Internalname = "OGSUBI" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtOGSTpo_Internalname = "OGSTPO" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtOGSMaq_Internalname = "OGSMAQ" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtOGSSeg_Internalname = "OGSSEG" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtOGSDsc_Internalname = "OGSDSC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      cmbOGSTam.setInternalname( "OGSTAM" );
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtOGSObs_Internalname = "OGSOBS" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtOGSDibC_Internalname = "OGSDIBC" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtOGSDibI_Internalname = "OGSDIBI" ;
      edtavnRcdDeleted_997_Internalname = "vNRCDDELETED_997" ;
      edtShaCod_Internalname = "SHACOD" ;
      edtShaOGSOrd_Internalname = "SHAOGSORD" ;
      chkShaGrb.setInternalname( "SHAGRB" );
      cmbShaTipMaq.setInternalname( "SHATIPMAQ" );
      edtShaMal_Internalname = "SHAMAL" ;
      edtShaAnc_Internalname = "SHAANC" ;
      edtShaUbi_Internalname = "SHAUBI" ;
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
      Form.setCaption( httpContext.getMessage( "Grabado de Shablones", "") );
      edtShaUbi_Jsonclick = "" ;
      edtShaAnc_Jsonclick = "" ;
      edtShaMal_Jsonclick = "" ;
      cmbShaTipMaq.setJsonclick( "" );
      chkShaGrb.setCaption( "" );
      edtShaOGSOrd_Jsonclick = "" ;
      edtShaCod_Jsonclick = "" ;
      edtavnRcdDeleted_997_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtShaUbi_Enabled = 0 ;
      edtShaAnc_Enabled = 0 ;
      edtShaMal_Enabled = 0 ;
      cmbShaTipMaq.setEnabled( 0 );
      chkShaGrb.setEnabled( 0 );
      edtShaOGSOrd_Enabled = 1 ;
      edtShaCod_Enabled = 1 ;
      edtavnRcdDeleted_997_Enabled = 1 ;
      edtOGSDibI_Jsonclick = "" ;
      edtOGSDibI_Backcolor = (int)(0xFFFFFF) ;
      edtOGSDibI_Enabled = 1 ;
      edtOGSDibC_Jsonclick = "" ;
      edtOGSDibC_Backcolor = (int)(0xFFFFFF) ;
      edtOGSDibC_Enabled = 1 ;
      edtOGSObs_Backcolor = (int)(0xFFFFFF) ;
      edtOGSObs_Enabled = 1 ;
      cmbOGSTam.setJsonclick( "" );
      cmbOGSTam.setEnabled( 1 );
      cmbOGSTam.setIBackground( (int)(0xFFFFFF) );
      edtOGSDsc_Jsonclick = "" ;
      edtOGSDsc_Backcolor = (int)(0xFFFFFF) ;
      edtOGSDsc_Enabled = 1 ;
      edtOGSSeg_Jsonclick = "" ;
      edtOGSSeg_Backcolor = (int)(0xFFFFFF) ;
      edtOGSSeg_Enabled = 1 ;
      edtOGSMaq_Jsonclick = "" ;
      edtOGSMaq_Backcolor = (int)(0xFFFFFF) ;
      edtOGSMaq_Enabled = 1 ;
      edtOGSTpo_Jsonclick = "" ;
      edtOGSTpo_Backcolor = (int)(0xFFFFFF) ;
      edtOGSTpo_Enabled = 1 ;
      edtOGSUbi_Jsonclick = "" ;
      edtOGSUbi_Backcolor = (int)(0xFFFFFF) ;
      edtOGSUbi_Enabled = 1 ;
      edtOGSGal_Jsonclick = "" ;
      edtOGSGal_Backcolor = (int)(0xFFFFFF) ;
      edtOGSGal_Enabled = 1 ;
      edtOGSAnc_Jsonclick = "" ;
      edtOGSAnc_Backcolor = (int)(0xFFFFFF) ;
      edtOGSAnc_Enabled = 1 ;
      edtOGSFchRea_Jsonclick = "" ;
      edtOGSFchRea_Backcolor = (int)(0xFFFFFF) ;
      edtOGSFchRea_Enabled = 1 ;
      edtOGSUsuRea_Jsonclick = "" ;
      edtOGSUsuRea_Backcolor = (int)(0xFFFFFF) ;
      edtOGSUsuRea_Enabled = 1 ;
      edtOGSFchCre_Jsonclick = "" ;
      edtOGSFchCre_Backcolor = (int)(0xFFFFFF) ;
      edtOGSFchCre_Enabled = 1 ;
      edtOGSUsuCre_Jsonclick = "" ;
      edtOGSUsuCre_Backcolor = (int)(0xFFFFFF) ;
      edtOGSUsuCre_Enabled = 1 ;
      edtDibMolCil_Jsonclick = "" ;
      edtDibMolCil_Backcolor = (int)(0xFFFFFF) ;
      edtDibMolCil_Enabled = 0 ;
      lstDibTipMaq.setJsonclick( "" );
      lstDibTipMaq.setEnabled( 0 );
      lstDibTipMaq.setIBackground( (int)(0xFFFFFF) );
      edtDibMolCi2_Jsonclick = "" ;
      edtDibMolCi2_Backcolor = (int)(0xFFFFFF) ;
      edtDibMolCi2_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
      chkOGSEst.setIBackground( (int)(0xFFFFFF) );
      chkOGSEst.setEnabled( 1 );
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOGSCod_Jsonclick = "" ;
      edtOGSCod_Backcolor = (int)(0xFFFFFF) ;
      edtOGSCod_Enabled = 1 ;
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
      subsflControlProps_164997( ) ;
      while ( nGXsfl_164_idx <= nRC_GXsfl_164 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalXL997( ) ;
         standaloneModalXL997( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowXL997( ) ;
         nGXsfl_164_idx = (int)(nGXsfl_164_idx+1) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_164_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_164997( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkOGSEst.setName( "OGSEST" );
      chkOGSEst.setWebtags( "" );
      chkOGSEst.setCaption( httpContext.getMessage( "Realizada", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkOGSEst.getInternalname(), "TitleCaption", chkOGSEst.getCaption(), true);
      chkOGSEst.setCheckedValue( "N" );
      A7050OGSEst = ((GXutil.strcmp(GXutil.rtrim( A7050OGSEst), "S")==0) ? "S" : "N") ;
      n7050OGSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7050OGSEst", A7050OGSEst);
      lstDibTipMaq.setName( "DIBTIPMAQ" );
      lstDibTipMaq.setWebtags( "" );
      lstDibTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
      lstDibTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
      lstDibTipMaq.addItem("D", httpContext.getMessage( "Digital", ""), (short)(0));
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      }
      cmbOGSTam.setName( "OGSTAM" );
      cmbOGSTam.setWebtags( "" );
      cmbOGSTam.addItem("G", httpContext.getMessage( "Grande", ""), (short)(0));
      cmbOGSTam.addItem("P", httpContext.getMessage( "Prenda", ""), (short)(0));
      if ( cmbOGSTam.getItemCount() > 0 )
      {
         A7522OGSTam = cmbOGSTam.getValidValue(A7522OGSTam) ;
         n7522OGSTam = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7522OGSTam", A7522OGSTam);
      }
      GXCCtl = "SHAGRB_" + sGXsfl_164_idx ;
      chkShaGrb.setName( GXCCtl );
      chkShaGrb.setWebtags( "" );
      chkShaGrb.setCaption( httpContext.getMessage( "Grabado", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkShaGrb.getInternalname(), "TitleCaption", chkShaGrb.getCaption(), !bGXsfl_164_Refreshing);
      chkShaGrb.setCheckedValue( "N" );
      A7036ShaGrb = ((GXutil.strcmp(GXutil.rtrim( A7036ShaGrb), "S")==0) ? "S" : "N") ;
      n7036ShaGrb = false ;
      GXCCtl = "SHATIPMAQ_" + sGXsfl_164_idx ;
      cmbShaTipMaq.setName( GXCCtl );
      cmbShaTipMaq.setWebtags( "" );
      cmbShaTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
      cmbShaTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
      if ( cmbShaTipMaq.getItemCount() > 0 )
      {
         A7037ShaTipMaq = cmbShaTipMaq.getValidValue(A7037ShaTipMaq) ;
         n7037ShaTipMaq = false ;
      }
      /* End function init_web_controls */
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
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n252CliCod = false ;
      n1013DibCli = false ;
      n1014DibInt = false ;
      n2090DibMolCi2 = false ;
      n1823DibTipMaq = false ;
      A1823DibTipMaq = lstDibTipMaq.getValue() ;
      n1823DibTipMaq = false ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      n1019DibMolCil = false ;
      /* Using cursor T00XL23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T00XL23_A361DisCod[0] ;
      A252CliCod = T00XL23_A252CliCod[0] ;
      n252CliCod = T00XL23_n252CliCod[0] ;
      pr_default.close(21);
      /* Using cursor T00XL24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A1013DibCli = T00XL24_A1013DibCli[0] ;
      n1013DibCli = T00XL24_n1013DibCli[0] ;
      A1014DibInt = T00XL24_A1014DibInt[0] ;
      n1014DibInt = T00XL24_n1014DibInt[0] ;
      pr_default.close(22);
      /* Using cursor T00XL25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T00XL25_A279CliNom[0] ;
      pr_default.close(23);
      /* Using cursor T00XL26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
         }
      }
      A2090DibMolCi2 = T00XL26_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T00XL26_n2090DibMolCi2[0] ;
      A1823DibTipMaq = T00XL26_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T00XL26_n1823DibTipMaq[0] ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      A1019DibMolCil = T00XL26_A1019DibMolCil[0] ;
      n1019DibMolCil = T00XL26_n1019DibMolCil[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         lstDibTipMaq.setValue( A1823DibTipMaq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", GXutil.rtrim( A1013DibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", GXutil.rtrim( A1823DibTipMaq));
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Shacod( )
   {
      n7036ShaGrb = false ;
      n7037ShaTipMaq = false ;
      A7037ShaTipMaq = cmbShaTipMaq.getValue() ;
      n7037ShaTipMaq = false ;
      cmbShaTipMaq.setValue( A7037ShaTipMaq );
      n7032ShaMal = false ;
      n7033ShaAnc = false ;
      n7035ShaUbi = false ;
      /* Using cursor T00XL34 */
      pr_default.execute(32, new Object[] {A396EmprCod, A7031ShaCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Shablones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SHACOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtShaCod_Internalname ;
      }
      A7041ShaDibCli = T00XL34_A7041ShaDibCli[0] ;
      A7042ShaDibInt = T00XL34_A7042ShaDibInt[0] ;
      A7036ShaGrb = T00XL34_A7036ShaGrb[0] ;
      n7036ShaGrb = T00XL34_n7036ShaGrb[0] ;
      A7037ShaTipMaq = T00XL34_A7037ShaTipMaq[0] ;
      n7037ShaTipMaq = T00XL34_n7037ShaTipMaq[0] ;
      cmbShaTipMaq.setValue( A7037ShaTipMaq );
      A7032ShaMal = T00XL34_A7032ShaMal[0] ;
      n7032ShaMal = T00XL34_n7032ShaMal[0] ;
      A7033ShaAnc = T00XL34_A7033ShaAnc[0] ;
      n7033ShaAnc = T00XL34_n7033ShaAnc[0] ;
      A7035ShaUbi = T00XL34_A7035ShaUbi[0] ;
      n7035ShaUbi = T00XL34_n7035ShaUbi[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      A7036ShaGrb = ((GXutil.strcmp(GXutil.rtrim( A7036ShaGrb), "S")==0) ? "S" : "N") ;
      n7036ShaGrb = false ;
      if ( cmbShaTipMaq.getItemCount() > 0 )
      {
         A7037ShaTipMaq = cmbShaTipMaq.getValidValue(A7037ShaTipMaq) ;
         n7037ShaTipMaq = false ;
         cmbShaTipMaq.setValue( A7037ShaTipMaq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbShaTipMaq.setValue( GXutil.rtrim( A7037ShaTipMaq) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7041ShaDibCli", GXutil.rtrim( A7041ShaDibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A7042ShaDibInt", GXutil.ltrim( localUtil.ntoc( A7042ShaDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7036ShaGrb", GXutil.rtrim( A7036ShaGrb));
      httpContext.ajax_rsp_assign_attri("", false, "A7037ShaTipMaq", GXutil.rtrim( A7037ShaTipMaq));
      cmbShaTipMaq.setValue( GXutil.rtrim( A7037ShaTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, cmbShaTipMaq.getInternalname(), "Values", cmbShaTipMaq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A7032ShaMal", GXutil.rtrim( A7032ShaMal));
      httpContext.ajax_rsp_assign_attri("", false, "A7033ShaAnc", GXutil.rtrim( A7033ShaAnc));
      httpContext.ajax_rsp_assign_attri("", false, "A7035ShaUbi", GXutil.rtrim( A7035ShaUbi));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33OGSCod',fld:'vOGSCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_OGSCOD","{handler:'valid_Ogscod',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_OGSCOD",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_DIBCLI",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_DIBINT",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("VALID_SHACOD","{handler:'valid_Shacod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7031ShaCod',fld:'SHACOD',pic:''},{av:'A7041ShaDibCli',fld:'SHADIBCLI',pic:''},{av:'A7042ShaDibInt',fld:'SHADIBINT',pic:'ZZZZZZZ9'},{av:'A7036ShaGrb',fld:'SHAGRB',pic:''},{av:'cmbShaTipMaq'},{av:'A7037ShaTipMaq',fld:'SHATIPMAQ',pic:''},{av:'A7032ShaMal',fld:'SHAMAL',pic:''},{av:'A7033ShaAnc',fld:'SHAANC',pic:''},{av:'A7035ShaUbi',fld:'SHAUBI',pic:''},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("VALID_SHACOD",",oparms:[{av:'A7041ShaDibCli',fld:'SHADIBCLI',pic:''},{av:'A7042ShaDibInt',fld:'SHADIBINT',pic:'ZZZZZZZ9'},{av:'A7036ShaGrb',fld:'SHAGRB',pic:''},{av:'cmbShaTipMaq'},{av:'A7037ShaTipMaq',fld:'SHATIPMAQ',pic:''},{av:'A7032ShaMal',fld:'SHAMAL',pic:''},{av:'A7033ShaAnc',fld:'SHAANC',pic:''},{av:'A7035ShaUbi',fld:'SHAUBI',pic:''},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
      setEventMetadata("NULL","{handler:'valid_Shaubi',iparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]");
      setEventMetadata("NULL",",oparms:[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]}");
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
      pr_default.close(32);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z7050OGSEst = "" ;
      Z7051OGSUsuCre = "" ;
      Z7052OGSFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z7053OGSUsuRea = "" ;
      Z7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
      Z7141OGSAnc = DecimalUtil.ZERO ;
      Z7142OGSGal = DecimalUtil.ZERO ;
      Z7143OGSUbi = "" ;
      Z7144OGSTpo = "" ;
      Z7520OGSSeg = "" ;
      Z7521OGSDsc = "" ;
      Z7522OGSTam = "" ;
      Z10885OGSDibC = "" ;
      Z130BarCodPar = "" ;
      Z7031ShaCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1013DibCli = "" ;
      A7031ShaCod = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A7050OGSEst = "" ;
      A1823DibTipMaq = "" ;
      A7522OGSTam = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A7051OGSUsuCre = "" ;
      lblTextblock15_Jsonclick = "" ;
      A7052OGSFchCre = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock16_Jsonclick = "" ;
      A7053OGSUsuRea = "" ;
      lblTextblock17_Jsonclick = "" ;
      A7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock18_Jsonclick = "" ;
      A7141OGSAnc = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A7142OGSGal = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A7143OGSUbi = "" ;
      lblTextblock21_Jsonclick = "" ;
      A7144OGSTpo = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A7520OGSSeg = "" ;
      lblTextblock24_Jsonclick = "" ;
      A7521OGSDsc = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A7055OGSObs = "" ;
      lblTextblock27_Jsonclick = "" ;
      A10885OGSDibC = "" ;
      lblTextblock28_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode997 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A7041ShaDibCli = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode996 = "" ;
      GXCCtl = "" ;
      A7036ShaGrb = "" ;
      A7037ShaTipMaq = "" ;
      A7032ShaMal = "" ;
      A7033ShaAnc = "" ;
      A7035ShaUbi = "" ;
      Z7055OGSObs = "" ;
      Z407EmprNom = "" ;
      Z1013DibCli = "" ;
      Z279CliNom = "" ;
      Z1823DibTipMaq = "" ;
      T00XL7_A407EmprNom = new String[] {""} ;
      T00XL7_n407EmprNom = new boolean[] {false} ;
      T00XL12_A7055OGSObs = new String[] {""} ;
      T00XL12_n7055OGSObs = new boolean[] {false} ;
      T00XL12_A361DisCod = new int[1] ;
      T00XL12_A7049OGSCod = new int[1] ;
      T00XL12_A407EmprNom = new String[] {""} ;
      T00XL12_n407EmprNom = new boolean[] {false} ;
      T00XL12_A7050OGSEst = new String[] {""} ;
      T00XL12_n7050OGSEst = new boolean[] {false} ;
      T00XL12_A279CliNom = new String[] {""} ;
      T00XL12_A2090DibMolCi2 = new short[1] ;
      T00XL12_n2090DibMolCi2 = new boolean[] {false} ;
      T00XL12_A1823DibTipMaq = new String[] {""} ;
      T00XL12_n1823DibTipMaq = new boolean[] {false} ;
      T00XL12_A1019DibMolCil = new short[1] ;
      T00XL12_n1019DibMolCil = new boolean[] {false} ;
      T00XL12_A7051OGSUsuCre = new String[] {""} ;
      T00XL12_n7051OGSUsuCre = new boolean[] {false} ;
      T00XL12_A7052OGSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00XL12_n7052OGSFchCre = new boolean[] {false} ;
      T00XL12_A7053OGSUsuRea = new String[] {""} ;
      T00XL12_n7053OGSUsuRea = new boolean[] {false} ;
      T00XL12_A7054OGSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00XL12_n7054OGSFchRea = new boolean[] {false} ;
      T00XL12_A7141OGSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XL12_n7141OGSAnc = new boolean[] {false} ;
      T00XL12_A7142OGSGal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XL12_n7142OGSGal = new boolean[] {false} ;
      T00XL12_A7143OGSUbi = new String[] {""} ;
      T00XL12_n7143OGSUbi = new boolean[] {false} ;
      T00XL12_A7144OGSTpo = new String[] {""} ;
      T00XL12_n7144OGSTpo = new boolean[] {false} ;
      T00XL12_A7519OGSMaq = new byte[1] ;
      T00XL12_n7519OGSMaq = new boolean[] {false} ;
      T00XL12_A7520OGSSeg = new String[] {""} ;
      T00XL12_n7520OGSSeg = new boolean[] {false} ;
      T00XL12_A7521OGSDsc = new String[] {""} ;
      T00XL12_n7521OGSDsc = new boolean[] {false} ;
      T00XL12_A7522OGSTam = new String[] {""} ;
      T00XL12_n7522OGSTam = new boolean[] {false} ;
      T00XL12_A10885OGSDibC = new String[] {""} ;
      T00XL12_n10885OGSDibC = new boolean[] {false} ;
      T00XL12_A10886OGSDibI = new int[1] ;
      T00XL12_n10886OGSDibI = new boolean[] {false} ;
      T00XL12_A396EmprCod = new String[] {""} ;
      T00XL12_A129BarCod = new int[1] ;
      T00XL12_n129BarCod = new boolean[] {false} ;
      T00XL12_A132BarCodReo = new byte[1] ;
      T00XL12_n132BarCodReo = new boolean[] {false} ;
      T00XL12_A130BarCodPar = new String[] {""} ;
      T00XL12_n130BarCodPar = new boolean[] {false} ;
      T00XL12_A252CliCod = new int[1] ;
      T00XL12_n252CliCod = new boolean[] {false} ;
      T00XL12_A1013DibCli = new String[] {""} ;
      T00XL12_n1013DibCli = new boolean[] {false} ;
      T00XL12_A1014DibInt = new int[1] ;
      T00XL12_n1014DibInt = new boolean[] {false} ;
      T00XL8_A361DisCod = new int[1] ;
      T00XL8_A252CliCod = new int[1] ;
      T00XL8_n252CliCod = new boolean[] {false} ;
      T00XL9_A1013DibCli = new String[] {""} ;
      T00XL9_n1013DibCli = new boolean[] {false} ;
      T00XL9_A1014DibInt = new int[1] ;
      T00XL9_n1014DibInt = new boolean[] {false} ;
      T00XL10_A279CliNom = new String[] {""} ;
      T00XL11_A2090DibMolCi2 = new short[1] ;
      T00XL11_n2090DibMolCi2 = new boolean[] {false} ;
      T00XL11_A1823DibTipMaq = new String[] {""} ;
      T00XL11_n1823DibTipMaq = new boolean[] {false} ;
      T00XL11_A1019DibMolCil = new short[1] ;
      T00XL11_n1019DibMolCil = new boolean[] {false} ;
      T00XL13_A361DisCod = new int[1] ;
      T00XL13_A252CliCod = new int[1] ;
      T00XL13_n252CliCod = new boolean[] {false} ;
      T00XL14_A1013DibCli = new String[] {""} ;
      T00XL14_n1013DibCli = new boolean[] {false} ;
      T00XL14_A1014DibInt = new int[1] ;
      T00XL14_n1014DibInt = new boolean[] {false} ;
      T00XL15_A279CliNom = new String[] {""} ;
      T00XL16_A2090DibMolCi2 = new short[1] ;
      T00XL16_n2090DibMolCi2 = new boolean[] {false} ;
      T00XL16_A1823DibTipMaq = new String[] {""} ;
      T00XL16_n1823DibTipMaq = new boolean[] {false} ;
      T00XL16_A1019DibMolCil = new short[1] ;
      T00XL16_n1019DibMolCil = new boolean[] {false} ;
      T00XL17_A396EmprCod = new String[] {""} ;
      T00XL17_A7049OGSCod = new int[1] ;
      T00XL6_A7055OGSObs = new String[] {""} ;
      T00XL6_n7055OGSObs = new boolean[] {false} ;
      T00XL6_A7049OGSCod = new int[1] ;
      T00XL6_A7050OGSEst = new String[] {""} ;
      T00XL6_n7050OGSEst = new boolean[] {false} ;
      T00XL6_A7051OGSUsuCre = new String[] {""} ;
      T00XL6_n7051OGSUsuCre = new boolean[] {false} ;
      T00XL6_A7052OGSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00XL6_n7052OGSFchCre = new boolean[] {false} ;
      T00XL6_A7053OGSUsuRea = new String[] {""} ;
      T00XL6_n7053OGSUsuRea = new boolean[] {false} ;
      T00XL6_A7054OGSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00XL6_n7054OGSFchRea = new boolean[] {false} ;
      T00XL6_A7141OGSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XL6_n7141OGSAnc = new boolean[] {false} ;
      T00XL6_A7142OGSGal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XL6_n7142OGSGal = new boolean[] {false} ;
      T00XL6_A7143OGSUbi = new String[] {""} ;
      T00XL6_n7143OGSUbi = new boolean[] {false} ;
      T00XL6_A7144OGSTpo = new String[] {""} ;
      T00XL6_n7144OGSTpo = new boolean[] {false} ;
      T00XL6_A7519OGSMaq = new byte[1] ;
      T00XL6_n7519OGSMaq = new boolean[] {false} ;
      T00XL6_A7520OGSSeg = new String[] {""} ;
      T00XL6_n7520OGSSeg = new boolean[] {false} ;
      T00XL6_A7521OGSDsc = new String[] {""} ;
      T00XL6_n7521OGSDsc = new boolean[] {false} ;
      T00XL6_A7522OGSTam = new String[] {""} ;
      T00XL6_n7522OGSTam = new boolean[] {false} ;
      T00XL6_A10885OGSDibC = new String[] {""} ;
      T00XL6_n10885OGSDibC = new boolean[] {false} ;
      T00XL6_A10886OGSDibI = new int[1] ;
      T00XL6_n10886OGSDibI = new boolean[] {false} ;
      T00XL6_A396EmprCod = new String[] {""} ;
      T00XL6_A129BarCod = new int[1] ;
      T00XL6_n129BarCod = new boolean[] {false} ;
      T00XL6_A132BarCodReo = new byte[1] ;
      T00XL6_n132BarCodReo = new boolean[] {false} ;
      T00XL6_A130BarCodPar = new String[] {""} ;
      T00XL6_n130BarCodPar = new boolean[] {false} ;
      T00XL18_A7049OGSCod = new int[1] ;
      T00XL18_A396EmprCod = new String[] {""} ;
      T00XL19_A7049OGSCod = new int[1] ;
      T00XL19_A396EmprCod = new String[] {""} ;
      T00XL5_A7055OGSObs = new String[] {""} ;
      T00XL5_n7055OGSObs = new boolean[] {false} ;
      T00XL5_A7049OGSCod = new int[1] ;
      T00XL5_A7050OGSEst = new String[] {""} ;
      T00XL5_n7050OGSEst = new boolean[] {false} ;
      T00XL5_A7051OGSUsuCre = new String[] {""} ;
      T00XL5_n7051OGSUsuCre = new boolean[] {false} ;
      T00XL5_A7052OGSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00XL5_n7052OGSFchCre = new boolean[] {false} ;
      T00XL5_A7053OGSUsuRea = new String[] {""} ;
      T00XL5_n7053OGSUsuRea = new boolean[] {false} ;
      T00XL5_A7054OGSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00XL5_n7054OGSFchRea = new boolean[] {false} ;
      T00XL5_A7141OGSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XL5_n7141OGSAnc = new boolean[] {false} ;
      T00XL5_A7142OGSGal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XL5_n7142OGSGal = new boolean[] {false} ;
      T00XL5_A7143OGSUbi = new String[] {""} ;
      T00XL5_n7143OGSUbi = new boolean[] {false} ;
      T00XL5_A7144OGSTpo = new String[] {""} ;
      T00XL5_n7144OGSTpo = new boolean[] {false} ;
      T00XL5_A7519OGSMaq = new byte[1] ;
      T00XL5_n7519OGSMaq = new boolean[] {false} ;
      T00XL5_A7520OGSSeg = new String[] {""} ;
      T00XL5_n7520OGSSeg = new boolean[] {false} ;
      T00XL5_A7521OGSDsc = new String[] {""} ;
      T00XL5_n7521OGSDsc = new boolean[] {false} ;
      T00XL5_A7522OGSTam = new String[] {""} ;
      T00XL5_n7522OGSTam = new boolean[] {false} ;
      T00XL5_A10885OGSDibC = new String[] {""} ;
      T00XL5_n10885OGSDibC = new boolean[] {false} ;
      T00XL5_A10886OGSDibI = new int[1] ;
      T00XL5_n10886OGSDibI = new boolean[] {false} ;
      T00XL5_A396EmprCod = new String[] {""} ;
      T00XL5_A129BarCod = new int[1] ;
      T00XL5_n129BarCod = new boolean[] {false} ;
      T00XL5_A132BarCodReo = new byte[1] ;
      T00XL5_n132BarCodReo = new boolean[] {false} ;
      T00XL5_A130BarCodPar = new String[] {""} ;
      T00XL5_n130BarCodPar = new boolean[] {false} ;
      T00XL23_A361DisCod = new int[1] ;
      T00XL23_A252CliCod = new int[1] ;
      T00XL23_n252CliCod = new boolean[] {false} ;
      T00XL24_A1013DibCli = new String[] {""} ;
      T00XL24_n1013DibCli = new boolean[] {false} ;
      T00XL24_A1014DibInt = new int[1] ;
      T00XL24_n1014DibInt = new boolean[] {false} ;
      T00XL25_A279CliNom = new String[] {""} ;
      T00XL26_A2090DibMolCi2 = new short[1] ;
      T00XL26_n2090DibMolCi2 = new boolean[] {false} ;
      T00XL26_A1823DibTipMaq = new String[] {""} ;
      T00XL26_n1823DibTipMaq = new boolean[] {false} ;
      T00XL26_A1019DibMolCil = new short[1] ;
      T00XL26_n1019DibMolCil = new boolean[] {false} ;
      T00XL27_A396EmprCod = new String[] {""} ;
      T00XL27_A7049OGSCod = new int[1] ;
      Z7041ShaDibCli = "" ;
      Z7036ShaGrb = "" ;
      Z7037ShaTipMaq = "" ;
      Z7032ShaMal = "" ;
      Z7033ShaAnc = "" ;
      Z7035ShaUbi = "" ;
      T00XL28_A7041ShaDibCli = new String[] {""} ;
      T00XL28_A7042ShaDibInt = new int[1] ;
      T00XL28_A7049OGSCod = new int[1] ;
      T00XL28_A7056ShaOGSOrd = new byte[1] ;
      T00XL28_n7056ShaOGSOrd = new boolean[] {false} ;
      T00XL28_A7036ShaGrb = new String[] {""} ;
      T00XL28_n7036ShaGrb = new boolean[] {false} ;
      T00XL28_A7037ShaTipMaq = new String[] {""} ;
      T00XL28_n7037ShaTipMaq = new boolean[] {false} ;
      T00XL28_A7032ShaMal = new String[] {""} ;
      T00XL28_n7032ShaMal = new boolean[] {false} ;
      T00XL28_A7033ShaAnc = new String[] {""} ;
      T00XL28_n7033ShaAnc = new boolean[] {false} ;
      T00XL28_A7035ShaUbi = new String[] {""} ;
      T00XL28_n7035ShaUbi = new boolean[] {false} ;
      T00XL28_A396EmprCod = new String[] {""} ;
      T00XL28_A7031ShaCod = new String[] {""} ;
      T00XL4_A7041ShaDibCli = new String[] {""} ;
      T00XL4_A7042ShaDibInt = new int[1] ;
      T00XL4_A7036ShaGrb = new String[] {""} ;
      T00XL4_n7036ShaGrb = new boolean[] {false} ;
      T00XL4_A7037ShaTipMaq = new String[] {""} ;
      T00XL4_n7037ShaTipMaq = new boolean[] {false} ;
      T00XL4_A7032ShaMal = new String[] {""} ;
      T00XL4_n7032ShaMal = new boolean[] {false} ;
      T00XL4_A7033ShaAnc = new String[] {""} ;
      T00XL4_n7033ShaAnc = new boolean[] {false} ;
      T00XL4_A7035ShaUbi = new String[] {""} ;
      T00XL4_n7035ShaUbi = new boolean[] {false} ;
      T00XL29_A7041ShaDibCli = new String[] {""} ;
      T00XL29_A7042ShaDibInt = new int[1] ;
      T00XL29_A7036ShaGrb = new String[] {""} ;
      T00XL29_n7036ShaGrb = new boolean[] {false} ;
      T00XL29_A7037ShaTipMaq = new String[] {""} ;
      T00XL29_n7037ShaTipMaq = new boolean[] {false} ;
      T00XL29_A7032ShaMal = new String[] {""} ;
      T00XL29_n7032ShaMal = new boolean[] {false} ;
      T00XL29_A7033ShaAnc = new String[] {""} ;
      T00XL29_n7033ShaAnc = new boolean[] {false} ;
      T00XL29_A7035ShaUbi = new String[] {""} ;
      T00XL29_n7035ShaUbi = new boolean[] {false} ;
      T00XL30_A396EmprCod = new String[] {""} ;
      T00XL30_A7049OGSCod = new int[1] ;
      T00XL30_A7031ShaCod = new String[] {""} ;
      T00XL3_A7049OGSCod = new int[1] ;
      T00XL3_A7056ShaOGSOrd = new byte[1] ;
      T00XL3_n7056ShaOGSOrd = new boolean[] {false} ;
      T00XL3_A396EmprCod = new String[] {""} ;
      T00XL3_A7031ShaCod = new String[] {""} ;
      T00XL2_A7049OGSCod = new int[1] ;
      T00XL2_A7056ShaOGSOrd = new byte[1] ;
      T00XL2_n7056ShaOGSOrd = new boolean[] {false} ;
      T00XL2_A396EmprCod = new String[] {""} ;
      T00XL2_A7031ShaCod = new String[] {""} ;
      T00XL34_A7041ShaDibCli = new String[] {""} ;
      T00XL34_A7042ShaDibInt = new int[1] ;
      T00XL34_A7036ShaGrb = new String[] {""} ;
      T00XL34_n7036ShaGrb = new boolean[] {false} ;
      T00XL34_A7037ShaTipMaq = new String[] {""} ;
      T00XL34_n7037ShaTipMaq = new boolean[] {false} ;
      T00XL34_A7032ShaMal = new String[] {""} ;
      T00XL34_n7032ShaMal = new boolean[] {false} ;
      T00XL34_A7033ShaAnc = new String[] {""} ;
      T00XL34_n7033ShaAnc = new boolean[] {false} ;
      T00XL34_A7035ShaUbi = new String[] {""} ;
      T00XL34_n7035ShaUbi = new boolean[] {false} ;
      T00XL35_A396EmprCod = new String[] {""} ;
      T00XL35_A7049OGSCod = new int[1] ;
      T00XL35_A7031ShaCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tshagra__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tshagra__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tshagra__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tshagra__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tshagra__default(),
         new Object[] {
             new Object[] {
            T00XL2_A7049OGSCod, T00XL2_A7056ShaOGSOrd, T00XL2_n7056ShaOGSOrd, T00XL2_A396EmprCod, T00XL2_A7031ShaCod
            }
            , new Object[] {
            T00XL3_A7049OGSCod, T00XL3_A7056ShaOGSOrd, T00XL3_n7056ShaOGSOrd, T00XL3_A396EmprCod, T00XL3_A7031ShaCod
            }
            , new Object[] {
            T00XL4_A7041ShaDibCli, T00XL4_A7042ShaDibInt, T00XL4_A7036ShaGrb, T00XL4_n7036ShaGrb, T00XL4_A7037ShaTipMaq, T00XL4_n7037ShaTipMaq, T00XL4_A7032ShaMal, T00XL4_n7032ShaMal, T00XL4_A7033ShaAnc, T00XL4_n7033ShaAnc,
            T00XL4_A7035ShaUbi, T00XL4_n7035ShaUbi
            }
            , new Object[] {
            T00XL5_A7055OGSObs, T00XL5_n7055OGSObs, T00XL5_A7049OGSCod, T00XL5_A7050OGSEst, T00XL5_n7050OGSEst, T00XL5_A7051OGSUsuCre, T00XL5_n7051OGSUsuCre, T00XL5_A7052OGSFchCre, T00XL5_n7052OGSFchCre, T00XL5_A7053OGSUsuRea,
            T00XL5_n7053OGSUsuRea, T00XL5_A7054OGSFchRea, T00XL5_n7054OGSFchRea, T00XL5_A7141OGSAnc, T00XL5_n7141OGSAnc, T00XL5_A7142OGSGal, T00XL5_n7142OGSGal, T00XL5_A7143OGSUbi, T00XL5_n7143OGSUbi, T00XL5_A7144OGSTpo,
            T00XL5_n7144OGSTpo, T00XL5_A7519OGSMaq, T00XL5_n7519OGSMaq, T00XL5_A7520OGSSeg, T00XL5_n7520OGSSeg, T00XL5_A7521OGSDsc, T00XL5_n7521OGSDsc, T00XL5_A7522OGSTam, T00XL5_n7522OGSTam, T00XL5_A10885OGSDibC,
            T00XL5_n10885OGSDibC, T00XL5_A10886OGSDibI, T00XL5_n10886OGSDibI, T00XL5_A396EmprCod, T00XL5_A129BarCod, T00XL5_n129BarCod, T00XL5_A132BarCodReo, T00XL5_n132BarCodReo, T00XL5_A130BarCodPar, T00XL5_n130BarCodPar
            }
            , new Object[] {
            T00XL6_A7055OGSObs, T00XL6_n7055OGSObs, T00XL6_A7049OGSCod, T00XL6_A7050OGSEst, T00XL6_n7050OGSEst, T00XL6_A7051OGSUsuCre, T00XL6_n7051OGSUsuCre, T00XL6_A7052OGSFchCre, T00XL6_n7052OGSFchCre, T00XL6_A7053OGSUsuRea,
            T00XL6_n7053OGSUsuRea, T00XL6_A7054OGSFchRea, T00XL6_n7054OGSFchRea, T00XL6_A7141OGSAnc, T00XL6_n7141OGSAnc, T00XL6_A7142OGSGal, T00XL6_n7142OGSGal, T00XL6_A7143OGSUbi, T00XL6_n7143OGSUbi, T00XL6_A7144OGSTpo,
            T00XL6_n7144OGSTpo, T00XL6_A7519OGSMaq, T00XL6_n7519OGSMaq, T00XL6_A7520OGSSeg, T00XL6_n7520OGSSeg, T00XL6_A7521OGSDsc, T00XL6_n7521OGSDsc, T00XL6_A7522OGSTam, T00XL6_n7522OGSTam, T00XL6_A10885OGSDibC,
            T00XL6_n10885OGSDibC, T00XL6_A10886OGSDibI, T00XL6_n10886OGSDibI, T00XL6_A396EmprCod, T00XL6_A129BarCod, T00XL6_n129BarCod, T00XL6_A132BarCodReo, T00XL6_n132BarCodReo, T00XL6_A130BarCodPar, T00XL6_n130BarCodPar
            }
            , new Object[] {
            T00XL7_A407EmprNom, T00XL7_n407EmprNom
            }
            , new Object[] {
            T00XL8_A361DisCod, T00XL8_A252CliCod, T00XL8_n252CliCod
            }
            , new Object[] {
            T00XL9_A1013DibCli, T00XL9_n1013DibCli, T00XL9_A1014DibInt, T00XL9_n1014DibInt
            }
            , new Object[] {
            T00XL10_A279CliNom
            }
            , new Object[] {
            T00XL11_A2090DibMolCi2, T00XL11_n2090DibMolCi2, T00XL11_A1823DibTipMaq, T00XL11_n1823DibTipMaq, T00XL11_A1019DibMolCil, T00XL11_n1019DibMolCil
            }
            , new Object[] {
            T00XL12_A7055OGSObs, T00XL12_n7055OGSObs, T00XL12_A361DisCod, T00XL12_A7049OGSCod, T00XL12_A407EmprNom, T00XL12_n407EmprNom, T00XL12_A7050OGSEst, T00XL12_n7050OGSEst, T00XL12_A279CliNom, T00XL12_A2090DibMolCi2,
            T00XL12_n2090DibMolCi2, T00XL12_A1823DibTipMaq, T00XL12_n1823DibTipMaq, T00XL12_A1019DibMolCil, T00XL12_n1019DibMolCil, T00XL12_A7051OGSUsuCre, T00XL12_n7051OGSUsuCre, T00XL12_A7052OGSFchCre, T00XL12_n7052OGSFchCre, T00XL12_A7053OGSUsuRea,
            T00XL12_n7053OGSUsuRea, T00XL12_A7054OGSFchRea, T00XL12_n7054OGSFchRea, T00XL12_A7141OGSAnc, T00XL12_n7141OGSAnc, T00XL12_A7142OGSGal, T00XL12_n7142OGSGal, T00XL12_A7143OGSUbi, T00XL12_n7143OGSUbi, T00XL12_A7144OGSTpo,
            T00XL12_n7144OGSTpo, T00XL12_A7519OGSMaq, T00XL12_n7519OGSMaq, T00XL12_A7520OGSSeg, T00XL12_n7520OGSSeg, T00XL12_A7521OGSDsc, T00XL12_n7521OGSDsc, T00XL12_A7522OGSTam, T00XL12_n7522OGSTam, T00XL12_A10885OGSDibC,
            T00XL12_n10885OGSDibC, T00XL12_A10886OGSDibI, T00XL12_n10886OGSDibI, T00XL12_A396EmprCod, T00XL12_A129BarCod, T00XL12_n129BarCod, T00XL12_A132BarCodReo, T00XL12_n132BarCodReo, T00XL12_A130BarCodPar, T00XL12_n130BarCodPar,
            T00XL12_A252CliCod, T00XL12_n252CliCod, T00XL12_A1013DibCli, T00XL12_n1013DibCli, T00XL12_A1014DibInt, T00XL12_n1014DibInt
            }
            , new Object[] {
            T00XL13_A361DisCod, T00XL13_A252CliCod, T00XL13_n252CliCod
            }
            , new Object[] {
            T00XL14_A1013DibCli, T00XL14_n1013DibCli, T00XL14_A1014DibInt, T00XL14_n1014DibInt
            }
            , new Object[] {
            T00XL15_A279CliNom
            }
            , new Object[] {
            T00XL16_A2090DibMolCi2, T00XL16_n2090DibMolCi2, T00XL16_A1823DibTipMaq, T00XL16_n1823DibTipMaq, T00XL16_A1019DibMolCil, T00XL16_n1019DibMolCil
            }
            , new Object[] {
            T00XL17_A396EmprCod, T00XL17_A7049OGSCod
            }
            , new Object[] {
            T00XL18_A7049OGSCod, T00XL18_A396EmprCod
            }
            , new Object[] {
            T00XL19_A7049OGSCod, T00XL19_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XL23_A361DisCod, T00XL23_A252CliCod, T00XL23_n252CliCod
            }
            , new Object[] {
            T00XL24_A1013DibCli, T00XL24_n1013DibCli, T00XL24_A1014DibInt, T00XL24_n1014DibInt
            }
            , new Object[] {
            T00XL25_A279CliNom
            }
            , new Object[] {
            T00XL26_A2090DibMolCi2, T00XL26_n2090DibMolCi2, T00XL26_A1823DibTipMaq, T00XL26_n1823DibTipMaq, T00XL26_A1019DibMolCil, T00XL26_n1019DibMolCil
            }
            , new Object[] {
            T00XL27_A396EmprCod, T00XL27_A7049OGSCod
            }
            , new Object[] {
            T00XL28_A7041ShaDibCli, T00XL28_A7042ShaDibInt, T00XL28_A7049OGSCod, T00XL28_A7056ShaOGSOrd, T00XL28_n7056ShaOGSOrd, T00XL28_A7036ShaGrb, T00XL28_n7036ShaGrb, T00XL28_A7037ShaTipMaq, T00XL28_n7037ShaTipMaq, T00XL28_A7032ShaMal,
            T00XL28_n7032ShaMal, T00XL28_A7033ShaAnc, T00XL28_n7033ShaAnc, T00XL28_A7035ShaUbi, T00XL28_n7035ShaUbi, T00XL28_A396EmprCod, T00XL28_A7031ShaCod
            }
            , new Object[] {
            T00XL29_A7041ShaDibCli, T00XL29_A7042ShaDibInt, T00XL29_A7036ShaGrb, T00XL29_n7036ShaGrb, T00XL29_A7037ShaTipMaq, T00XL29_n7037ShaTipMaq, T00XL29_A7032ShaMal, T00XL29_n7032ShaMal, T00XL29_A7033ShaAnc, T00XL29_n7033ShaAnc,
            T00XL29_A7035ShaUbi, T00XL29_n7035ShaUbi
            }
            , new Object[] {
            T00XL30_A396EmprCod, T00XL30_A7049OGSCod, T00XL30_A7031ShaCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XL34_A7041ShaDibCli, T00XL34_A7042ShaDibInt, T00XL34_A7036ShaGrb, T00XL34_n7036ShaGrb, T00XL34_A7037ShaTipMaq, T00XL34_n7037ShaTipMaq, T00XL34_A7032ShaMal, T00XL34_n7032ShaMal, T00XL34_A7033ShaAnc, T00XL34_n7033ShaAnc,
            T00XL34_A7035ShaUbi, T00XL34_n7035ShaUbi
            }
            , new Object[] {
            T00XL35_A396EmprCod, T00XL35_A7049OGSCod, T00XL35_A7031ShaCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z7519OGSMaq ;
   private byte Z132BarCodReo ;
   private byte Z7056ShaOGSOrd ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A7519OGSMaq ;
   private byte A7056ShaOGSOrd ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_997 ;
   private short nRcdExists_997 ;
   private short nIsMod_997 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2090DibMolCi2 ;
   private short A1019DibMolCil ;
   private short nBlankRcdCount997 ;
   private short RcdFound997 ;
   private short nBlankRcdUsr997 ;
   private short Z2090DibMolCi2 ;
   private short Z1019DibMolCil ;
   private short RcdFound996 ;
   private short nIsDirty_996 ;
   private short nIsDirty_997 ;
   private int wcpOAV33OGSCod ;
   private int Z7049OGSCod ;
   private int Z10886OGSDibI ;
   private int Z129BarCod ;
   private int nRC_GXsfl_164 ;
   private int nGXsfl_164_idx=1 ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV33OGSCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A7049OGSCod ;
   private int edtOGSCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtDibMolCi2_Enabled ;
   private int edtDibMolCil_Enabled ;
   private int edtOGSUsuCre_Enabled ;
   private int edtOGSFchCre_Enabled ;
   private int edtOGSUsuRea_Enabled ;
   private int edtOGSFchRea_Enabled ;
   private int edtOGSAnc_Enabled ;
   private int edtOGSGal_Enabled ;
   private int edtOGSUbi_Enabled ;
   private int edtOGSTpo_Enabled ;
   private int edtOGSMaq_Enabled ;
   private int edtOGSSeg_Enabled ;
   private int edtOGSDsc_Enabled ;
   private int edtOGSObs_Enabled ;
   private int edtOGSDibC_Enabled ;
   private int A10886OGSDibI ;
   private int edtOGSDibI_Enabled ;
   private int edtavnRcdDeleted_997_Enabled ;
   private int edtShaCod_Enabled ;
   private int edtShaOGSOrd_Enabled ;
   private int edtShaMal_Enabled ;
   private int edtShaAnc_Enabled ;
   private int edtShaUbi_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A7042ShaDibInt ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int Z7042ShaDibInt ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtShaCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtOGSDibI_Backcolor ;
   private int edtOGSDibC_Backcolor ;
   private int edtOGSObs_Backcolor ;
   private int edtOGSDsc_Backcolor ;
   private int edtOGSSeg_Backcolor ;
   private int edtOGSMaq_Backcolor ;
   private int edtOGSTpo_Backcolor ;
   private int edtOGSUbi_Backcolor ;
   private int edtOGSGal_Backcolor ;
   private int edtOGSAnc_Backcolor ;
   private int edtOGSFchRea_Backcolor ;
   private int edtOGSUsuRea_Backcolor ;
   private int edtOGSFchCre_Backcolor ;
   private int edtOGSUsuCre_Backcolor ;
   private int edtDibMolCil_Backcolor ;
   private int edtDibMolCi2_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtOGSCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7141OGSAnc ;
   private java.math.BigDecimal Z7142OGSGal ;
   private java.math.BigDecimal A7141OGSAnc ;
   private java.math.BigDecimal A7142OGSGal ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z7050OGSEst ;
   private String Z7051OGSUsuCre ;
   private String Z7053OGSUsuRea ;
   private String Z7143OGSUbi ;
   private String Z7144OGSTpo ;
   private String Z7520OGSSeg ;
   private String Z7521OGSDsc ;
   private String Z7522OGSTam ;
   private String Z10885OGSDibC ;
   private String Z130BarCodPar ;
   private String Z7031ShaCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1013DibCli ;
   private String A7031ShaCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOGSCod_Internalname ;
   private String sGXsfl_164_idx="0001" ;
   private String A7050OGSEst ;
   private String A1823DibTipMaq ;
   private String A7522OGSTam ;
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
   private String edtOGSCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDibMolCi2_Internalname ;
   private String edtDibMolCi2_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDibMolCil_Internalname ;
   private String edtDibMolCil_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtOGSUsuCre_Internalname ;
   private String A7051OGSUsuCre ;
   private String edtOGSUsuCre_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtOGSFchCre_Internalname ;
   private String edtOGSFchCre_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtOGSUsuRea_Internalname ;
   private String A7053OGSUsuRea ;
   private String edtOGSUsuRea_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtOGSFchRea_Internalname ;
   private String edtOGSFchRea_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtOGSAnc_Internalname ;
   private String edtOGSAnc_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtOGSGal_Internalname ;
   private String edtOGSGal_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtOGSUbi_Internalname ;
   private String A7143OGSUbi ;
   private String edtOGSUbi_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtOGSTpo_Internalname ;
   private String A7144OGSTpo ;
   private String edtOGSTpo_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtOGSMaq_Internalname ;
   private String edtOGSMaq_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtOGSSeg_Internalname ;
   private String A7520OGSSeg ;
   private String edtOGSSeg_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtOGSDsc_Internalname ;
   private String A7521OGSDsc ;
   private String edtOGSDsc_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtOGSObs_Internalname ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtOGSDibC_Internalname ;
   private String A10885OGSDibC ;
   private String edtOGSDibC_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtOGSDibI_Internalname ;
   private String edtOGSDibI_Jsonclick ;
   private String sMode997 ;
   private String edtavnRcdDeleted_997_Internalname ;
   private String edtShaCod_Internalname ;
   private String edtShaOGSOrd_Internalname ;
   private String edtShaMal_Internalname ;
   private String edtShaAnc_Internalname ;
   private String edtShaUbi_Internalname ;
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
   private String A7041ShaDibCli ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode996 ;
   private String GXCCtl ;
   private String A7036ShaGrb ;
   private String A7037ShaTipMaq ;
   private String A7032ShaMal ;
   private String A7033ShaAnc ;
   private String A7035ShaUbi ;
   private String Z407EmprNom ;
   private String Z1013DibCli ;
   private String Z279CliNom ;
   private String Z1823DibTipMaq ;
   private String Z7041ShaDibCli ;
   private String Z7036ShaGrb ;
   private String Z7037ShaTipMaq ;
   private String Z7032ShaMal ;
   private String Z7033ShaAnc ;
   private String Z7035ShaUbi ;
   private String sGXsfl_164_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_997_Jsonclick ;
   private String edtShaCod_Jsonclick ;
   private String edtShaOGSOrd_Jsonclick ;
   private String edtShaMal_Jsonclick ;
   private String edtShaAnc_Jsonclick ;
   private String edtShaUbi_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private java.util.Date Z7052OGSFchCre ;
   private java.util.Date Z7054OGSFchRea ;
   private java.util.Date A7052OGSFchCre ;
   private java.util.Date A7054OGSFchRea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n252CliCod ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean wbErr ;
   private boolean n7050OGSEst ;
   private boolean n1823DibTipMaq ;
   private boolean n7522OGSTam ;
   private boolean bGXsfl_164_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n2090DibMolCi2 ;
   private boolean n1019DibMolCil ;
   private boolean n7051OGSUsuCre ;
   private boolean n7052OGSFchCre ;
   private boolean n7053OGSUsuRea ;
   private boolean n7054OGSFchRea ;
   private boolean n7141OGSAnc ;
   private boolean n7142OGSGal ;
   private boolean n7143OGSUbi ;
   private boolean n7144OGSTpo ;
   private boolean n7519OGSMaq ;
   private boolean n7520OGSSeg ;
   private boolean n7521OGSDsc ;
   private boolean n7055OGSObs ;
   private boolean n10885OGSDibC ;
   private boolean n10886OGSDibI ;
   private boolean Gx_longc ;
   private boolean n7056ShaOGSOrd ;
   private boolean n7036ShaGrb ;
   private boolean n7037ShaTipMaq ;
   private boolean n7032ShaMal ;
   private boolean n7033ShaAnc ;
   private boolean n7035ShaUbi ;
   private String A7055OGSObs ;
   private String Z7055OGSObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkOGSEst ;
   private HTMLChoice lstDibTipMaq ;
   private HTMLChoice cmbOGSTam ;
   private ICheckbox chkShaGrb ;
   private HTMLChoice cmbShaTipMaq ;
   private IDataStoreProvider pr_default ;
   private String[] T00XL7_A407EmprNom ;
   private boolean[] T00XL7_n407EmprNom ;
   private String[] T00XL12_A7055OGSObs ;
   private boolean[] T00XL12_n7055OGSObs ;
   private int[] T00XL12_A361DisCod ;
   private int[] T00XL12_A7049OGSCod ;
   private String[] T00XL12_A407EmprNom ;
   private boolean[] T00XL12_n407EmprNom ;
   private String[] T00XL12_A7050OGSEst ;
   private boolean[] T00XL12_n7050OGSEst ;
   private String[] T00XL12_A279CliNom ;
   private short[] T00XL12_A2090DibMolCi2 ;
   private boolean[] T00XL12_n2090DibMolCi2 ;
   private String[] T00XL12_A1823DibTipMaq ;
   private boolean[] T00XL12_n1823DibTipMaq ;
   private short[] T00XL12_A1019DibMolCil ;
   private boolean[] T00XL12_n1019DibMolCil ;
   private String[] T00XL12_A7051OGSUsuCre ;
   private boolean[] T00XL12_n7051OGSUsuCre ;
   private java.util.Date[] T00XL12_A7052OGSFchCre ;
   private boolean[] T00XL12_n7052OGSFchCre ;
   private String[] T00XL12_A7053OGSUsuRea ;
   private boolean[] T00XL12_n7053OGSUsuRea ;
   private java.util.Date[] T00XL12_A7054OGSFchRea ;
   private boolean[] T00XL12_n7054OGSFchRea ;
   private java.math.BigDecimal[] T00XL12_A7141OGSAnc ;
   private boolean[] T00XL12_n7141OGSAnc ;
   private java.math.BigDecimal[] T00XL12_A7142OGSGal ;
   private boolean[] T00XL12_n7142OGSGal ;
   private String[] T00XL12_A7143OGSUbi ;
   private boolean[] T00XL12_n7143OGSUbi ;
   private String[] T00XL12_A7144OGSTpo ;
   private boolean[] T00XL12_n7144OGSTpo ;
   private byte[] T00XL12_A7519OGSMaq ;
   private boolean[] T00XL12_n7519OGSMaq ;
   private String[] T00XL12_A7520OGSSeg ;
   private boolean[] T00XL12_n7520OGSSeg ;
   private String[] T00XL12_A7521OGSDsc ;
   private boolean[] T00XL12_n7521OGSDsc ;
   private String[] T00XL12_A7522OGSTam ;
   private boolean[] T00XL12_n7522OGSTam ;
   private String[] T00XL12_A10885OGSDibC ;
   private boolean[] T00XL12_n10885OGSDibC ;
   private int[] T00XL12_A10886OGSDibI ;
   private boolean[] T00XL12_n10886OGSDibI ;
   private String[] T00XL12_A396EmprCod ;
   private int[] T00XL12_A129BarCod ;
   private boolean[] T00XL12_n129BarCod ;
   private byte[] T00XL12_A132BarCodReo ;
   private boolean[] T00XL12_n132BarCodReo ;
   private String[] T00XL12_A130BarCodPar ;
   private boolean[] T00XL12_n130BarCodPar ;
   private int[] T00XL12_A252CliCod ;
   private boolean[] T00XL12_n252CliCod ;
   private String[] T00XL12_A1013DibCli ;
   private boolean[] T00XL12_n1013DibCli ;
   private int[] T00XL12_A1014DibInt ;
   private boolean[] T00XL12_n1014DibInt ;
   private int[] T00XL8_A361DisCod ;
   private int[] T00XL8_A252CliCod ;
   private boolean[] T00XL8_n252CliCod ;
   private String[] T00XL9_A1013DibCli ;
   private boolean[] T00XL9_n1013DibCli ;
   private int[] T00XL9_A1014DibInt ;
   private boolean[] T00XL9_n1014DibInt ;
   private String[] T00XL10_A279CliNom ;
   private short[] T00XL11_A2090DibMolCi2 ;
   private boolean[] T00XL11_n2090DibMolCi2 ;
   private String[] T00XL11_A1823DibTipMaq ;
   private boolean[] T00XL11_n1823DibTipMaq ;
   private short[] T00XL11_A1019DibMolCil ;
   private boolean[] T00XL11_n1019DibMolCil ;
   private int[] T00XL13_A361DisCod ;
   private int[] T00XL13_A252CliCod ;
   private boolean[] T00XL13_n252CliCod ;
   private String[] T00XL14_A1013DibCli ;
   private boolean[] T00XL14_n1013DibCli ;
   private int[] T00XL14_A1014DibInt ;
   private boolean[] T00XL14_n1014DibInt ;
   private String[] T00XL15_A279CliNom ;
   private short[] T00XL16_A2090DibMolCi2 ;
   private boolean[] T00XL16_n2090DibMolCi2 ;
   private String[] T00XL16_A1823DibTipMaq ;
   private boolean[] T00XL16_n1823DibTipMaq ;
   private short[] T00XL16_A1019DibMolCil ;
   private boolean[] T00XL16_n1019DibMolCil ;
   private String[] T00XL17_A396EmprCod ;
   private int[] T00XL17_A7049OGSCod ;
   private String[] T00XL6_A7055OGSObs ;
   private boolean[] T00XL6_n7055OGSObs ;
   private int[] T00XL6_A7049OGSCod ;
   private String[] T00XL6_A7050OGSEst ;
   private boolean[] T00XL6_n7050OGSEst ;
   private String[] T00XL6_A7051OGSUsuCre ;
   private boolean[] T00XL6_n7051OGSUsuCre ;
   private java.util.Date[] T00XL6_A7052OGSFchCre ;
   private boolean[] T00XL6_n7052OGSFchCre ;
   private String[] T00XL6_A7053OGSUsuRea ;
   private boolean[] T00XL6_n7053OGSUsuRea ;
   private java.util.Date[] T00XL6_A7054OGSFchRea ;
   private boolean[] T00XL6_n7054OGSFchRea ;
   private java.math.BigDecimal[] T00XL6_A7141OGSAnc ;
   private boolean[] T00XL6_n7141OGSAnc ;
   private java.math.BigDecimal[] T00XL6_A7142OGSGal ;
   private boolean[] T00XL6_n7142OGSGal ;
   private String[] T00XL6_A7143OGSUbi ;
   private boolean[] T00XL6_n7143OGSUbi ;
   private String[] T00XL6_A7144OGSTpo ;
   private boolean[] T00XL6_n7144OGSTpo ;
   private byte[] T00XL6_A7519OGSMaq ;
   private boolean[] T00XL6_n7519OGSMaq ;
   private String[] T00XL6_A7520OGSSeg ;
   private boolean[] T00XL6_n7520OGSSeg ;
   private String[] T00XL6_A7521OGSDsc ;
   private boolean[] T00XL6_n7521OGSDsc ;
   private String[] T00XL6_A7522OGSTam ;
   private boolean[] T00XL6_n7522OGSTam ;
   private String[] T00XL6_A10885OGSDibC ;
   private boolean[] T00XL6_n10885OGSDibC ;
   private int[] T00XL6_A10886OGSDibI ;
   private boolean[] T00XL6_n10886OGSDibI ;
   private String[] T00XL6_A396EmprCod ;
   private int[] T00XL6_A129BarCod ;
   private boolean[] T00XL6_n129BarCod ;
   private byte[] T00XL6_A132BarCodReo ;
   private boolean[] T00XL6_n132BarCodReo ;
   private String[] T00XL6_A130BarCodPar ;
   private boolean[] T00XL6_n130BarCodPar ;
   private int[] T00XL18_A7049OGSCod ;
   private String[] T00XL18_A396EmprCod ;
   private int[] T00XL19_A7049OGSCod ;
   private String[] T00XL19_A396EmprCod ;
   private String[] T00XL5_A7055OGSObs ;
   private boolean[] T00XL5_n7055OGSObs ;
   private int[] T00XL5_A7049OGSCod ;
   private String[] T00XL5_A7050OGSEst ;
   private boolean[] T00XL5_n7050OGSEst ;
   private String[] T00XL5_A7051OGSUsuCre ;
   private boolean[] T00XL5_n7051OGSUsuCre ;
   private java.util.Date[] T00XL5_A7052OGSFchCre ;
   private boolean[] T00XL5_n7052OGSFchCre ;
   private String[] T00XL5_A7053OGSUsuRea ;
   private boolean[] T00XL5_n7053OGSUsuRea ;
   private java.util.Date[] T00XL5_A7054OGSFchRea ;
   private boolean[] T00XL5_n7054OGSFchRea ;
   private java.math.BigDecimal[] T00XL5_A7141OGSAnc ;
   private boolean[] T00XL5_n7141OGSAnc ;
   private java.math.BigDecimal[] T00XL5_A7142OGSGal ;
   private boolean[] T00XL5_n7142OGSGal ;
   private String[] T00XL5_A7143OGSUbi ;
   private boolean[] T00XL5_n7143OGSUbi ;
   private String[] T00XL5_A7144OGSTpo ;
   private boolean[] T00XL5_n7144OGSTpo ;
   private byte[] T00XL5_A7519OGSMaq ;
   private boolean[] T00XL5_n7519OGSMaq ;
   private String[] T00XL5_A7520OGSSeg ;
   private boolean[] T00XL5_n7520OGSSeg ;
   private String[] T00XL5_A7521OGSDsc ;
   private boolean[] T00XL5_n7521OGSDsc ;
   private String[] T00XL5_A7522OGSTam ;
   private boolean[] T00XL5_n7522OGSTam ;
   private String[] T00XL5_A10885OGSDibC ;
   private boolean[] T00XL5_n10885OGSDibC ;
   private int[] T00XL5_A10886OGSDibI ;
   private boolean[] T00XL5_n10886OGSDibI ;
   private String[] T00XL5_A396EmprCod ;
   private int[] T00XL5_A129BarCod ;
   private boolean[] T00XL5_n129BarCod ;
   private byte[] T00XL5_A132BarCodReo ;
   private boolean[] T00XL5_n132BarCodReo ;
   private String[] T00XL5_A130BarCodPar ;
   private boolean[] T00XL5_n130BarCodPar ;
   private int[] T00XL23_A361DisCod ;
   private int[] T00XL23_A252CliCod ;
   private boolean[] T00XL23_n252CliCod ;
   private String[] T00XL24_A1013DibCli ;
   private boolean[] T00XL24_n1013DibCli ;
   private int[] T00XL24_A1014DibInt ;
   private boolean[] T00XL24_n1014DibInt ;
   private String[] T00XL25_A279CliNom ;
   private short[] T00XL26_A2090DibMolCi2 ;
   private boolean[] T00XL26_n2090DibMolCi2 ;
   private String[] T00XL26_A1823DibTipMaq ;
   private boolean[] T00XL26_n1823DibTipMaq ;
   private short[] T00XL26_A1019DibMolCil ;
   private boolean[] T00XL26_n1019DibMolCil ;
   private String[] T00XL27_A396EmprCod ;
   private int[] T00XL27_A7049OGSCod ;
   private String[] T00XL28_A7041ShaDibCli ;
   private int[] T00XL28_A7042ShaDibInt ;
   private int[] T00XL28_A7049OGSCod ;
   private byte[] T00XL28_A7056ShaOGSOrd ;
   private boolean[] T00XL28_n7056ShaOGSOrd ;
   private String[] T00XL28_A7036ShaGrb ;
   private boolean[] T00XL28_n7036ShaGrb ;
   private String[] T00XL28_A7037ShaTipMaq ;
   private boolean[] T00XL28_n7037ShaTipMaq ;
   private String[] T00XL28_A7032ShaMal ;
   private boolean[] T00XL28_n7032ShaMal ;
   private String[] T00XL28_A7033ShaAnc ;
   private boolean[] T00XL28_n7033ShaAnc ;
   private String[] T00XL28_A7035ShaUbi ;
   private boolean[] T00XL28_n7035ShaUbi ;
   private String[] T00XL28_A396EmprCod ;
   private String[] T00XL28_A7031ShaCod ;
   private String[] T00XL4_A7041ShaDibCli ;
   private int[] T00XL4_A7042ShaDibInt ;
   private String[] T00XL4_A7036ShaGrb ;
   private boolean[] T00XL4_n7036ShaGrb ;
   private String[] T00XL4_A7037ShaTipMaq ;
   private boolean[] T00XL4_n7037ShaTipMaq ;
   private String[] T00XL4_A7032ShaMal ;
   private boolean[] T00XL4_n7032ShaMal ;
   private String[] T00XL4_A7033ShaAnc ;
   private boolean[] T00XL4_n7033ShaAnc ;
   private String[] T00XL4_A7035ShaUbi ;
   private boolean[] T00XL4_n7035ShaUbi ;
   private String[] T00XL29_A7041ShaDibCli ;
   private int[] T00XL29_A7042ShaDibInt ;
   private String[] T00XL29_A7036ShaGrb ;
   private boolean[] T00XL29_n7036ShaGrb ;
   private String[] T00XL29_A7037ShaTipMaq ;
   private boolean[] T00XL29_n7037ShaTipMaq ;
   private String[] T00XL29_A7032ShaMal ;
   private boolean[] T00XL29_n7032ShaMal ;
   private String[] T00XL29_A7033ShaAnc ;
   private boolean[] T00XL29_n7033ShaAnc ;
   private String[] T00XL29_A7035ShaUbi ;
   private boolean[] T00XL29_n7035ShaUbi ;
   private String[] T00XL30_A396EmprCod ;
   private int[] T00XL30_A7049OGSCod ;
   private String[] T00XL30_A7031ShaCod ;
   private int[] T00XL3_A7049OGSCod ;
   private byte[] T00XL3_A7056ShaOGSOrd ;
   private boolean[] T00XL3_n7056ShaOGSOrd ;
   private String[] T00XL3_A396EmprCod ;
   private String[] T00XL3_A7031ShaCod ;
   private int[] T00XL2_A7049OGSCod ;
   private byte[] T00XL2_A7056ShaOGSOrd ;
   private boolean[] T00XL2_n7056ShaOGSOrd ;
   private String[] T00XL2_A396EmprCod ;
   private String[] T00XL2_A7031ShaCod ;
   private String[] T00XL34_A7041ShaDibCli ;
   private int[] T00XL34_A7042ShaDibInt ;
   private String[] T00XL34_A7036ShaGrb ;
   private boolean[] T00XL34_n7036ShaGrb ;
   private String[] T00XL34_A7037ShaTipMaq ;
   private boolean[] T00XL34_n7037ShaTipMaq ;
   private String[] T00XL34_A7032ShaMal ;
   private boolean[] T00XL34_n7032ShaMal ;
   private String[] T00XL34_A7033ShaAnc ;
   private boolean[] T00XL34_n7033ShaAnc ;
   private String[] T00XL34_A7035ShaUbi ;
   private boolean[] T00XL34_n7035ShaUbi ;
   private String[] T00XL35_A396EmprCod ;
   private int[] T00XL35_A7049OGSCod ;
   private String[] T00XL35_A7031ShaCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tshagra__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshagra__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshagra__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshagra__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshagra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00XL2", "SELECT OGSCod, ShaOGSOrd, EmprCod, ShaCod FROM TXPShaGr1 WHERE EmprCod = ? AND OGSCod = ? AND ShaCod = ?  FOR UPDATE OF ShaOGSOrd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL3", "SELECT OGSCod, ShaOGSOrd, EmprCod, ShaCod FROM TXPShaGr1 WHERE EmprCod = ? AND OGSCod = ? AND ShaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL4", "SELECT ShaDibCli, ShaDibInt, ShaGrb, ShaTipMaq, ShaMal, ShaAnc, ShaUbi FROM TXPShablo WHERE EmprCod = ? AND ShaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL5", "SELECT OGSObs, OGSCod, OGSEst, OGSUsuCre, OGSFchCre, OGSUsuRea, OGSFchRea, OGSAnc, OGSGal, OGSUbi, OGSTpo, OGSMaq, OGSSeg, OGSDsc, OGSTam, OGSDibC, OGSDibI, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPShaGra WHERE EmprCod = ? AND OGSCod = ?  FOR UPDATE OF OGSEst, OGSUsuCre, OGSFchCre, OGSUsuRea, OGSFchRea, OGSAnc, OGSGal, OGSUbi, OGSTpo, OGSMaq, OGSSeg, OGSDsc, OGSTam, OGSObs, OGSDibC, OGSDibI, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL6", "SELECT OGSObs, OGSCod, OGSEst, OGSUsuCre, OGSFchCre, OGSUsuRea, OGSFchRea, OGSAnc, OGSGal, OGSUbi, OGSTpo, OGSMaq, OGSSeg, OGSDsc, OGSTam, OGSDibC, OGSDibI, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPShaGra WHERE EmprCod = ? AND OGSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL8", "SELECT DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL9", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL11", "SELECT DibMolCi2, DibTipMaq, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL12", "SELECT /*+ FIRST_ROWS(100) */ TM1.OGSObs, T3.DisCod, TM1.OGSCod, T2.EmprNom, TM1.OGSEst, T5.CliNom, T6.DibMolCi2, T6.DibTipMaq, T6.DibMolCil, TM1.OGSUsuCre, TM1.OGSFchCre, TM1.OGSUsuRea, TM1.OGSFchRea, TM1.OGSAnc, TM1.OGSGal, TM1.OGSUbi, TM1.OGSTpo, TM1.OGSMaq, TM1.OGSSeg, TM1.OGSDsc, TM1.OGSTam, TM1.OGSDibC, TM1.OGSDibI, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.CliCod, T4.DibCli, T4.DibInt FROM (((((TXPShaGra TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = T3.DisCod) LEFT JOIN TXPCDIBUJ T6 ON T6.EmprCod = TM1.EmprCod AND T6.DibCli = T4.DibCli AND T6.CliCod = T3.CliCod AND T6.DibInt = T4.DibInt) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = T3.CliCod) WHERE TM1.OGSCod = ? and TM1.EmprCod = ? ORDER BY TM1.EmprCod, TM1.OGSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL13", "SELECT DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL14", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL16", "SELECT DibMolCi2, DibTipMaq, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND OGSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OGSCod, EmprCod FROM TXPShaGra WHERE ( OGSCod > ?) and EmprCod = ? ORDER BY EmprCod, OGSCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XL19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OGSCod, EmprCod FROM TXPShaGra WHERE ( OGSCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, OGSCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XL20", "INSERT INTO TXPShaGra(OGSCod, OGSEst, OGSUsuCre, OGSFchCre, OGSUsuRea, OGSFchRea, OGSAnc, OGSGal, OGSUbi, OGSTpo, OGSMaq, OGSSeg, OGSDsc, OGSTam, OGSObs, OGSDibC, OGSDibI, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPShaGra")
         ,new UpdateCursor("T00XL21", "UPDATE TXPShaGra SET OGSEst=?, OGSUsuCre=?, OGSFchCre=?, OGSUsuRea=?, OGSFchRea=?, OGSAnc=?, OGSGal=?, OGSUbi=?, OGSTpo=?, OGSMaq=?, OGSSeg=?, OGSDsc=?, OGSTam=?, OGSObs=?, OGSDibC=?, OGSDibI=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND OGSCod = ?", GX_NOMASK, "TXPShaGra")
         ,new UpdateCursor("T00XL22", "DELETE FROM TXPShaGra  WHERE EmprCod = ? AND OGSCod = ?", GX_NOMASK, "TXPShaGra")
         ,new ForEachCursor("T00XL23", "SELECT DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL24", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL26", "SELECT DibMolCi2, DibTipMaq, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? ORDER BY EmprCod, OGSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL28", "SELECT T2.ShaDibCli, T2.ShaDibInt, T1.OGSCod, T1.ShaOGSOrd, T2.ShaGrb, T2.ShaTipMaq, T2.ShaMal, T2.ShaAnc, T2.ShaUbi, T1.EmprCod, T1.ShaCod FROM (TXPShaGr1 T1 INNER JOIN TXPShablo T2 ON T2.EmprCod = T1.EmprCod AND T2.ShaCod = T1.ShaCod) WHERE T1.OGSCod = ? and T1.EmprCod = ? and T1.ShaCod = ? ORDER BY T1.EmprCod, T1.OGSCod, T1.ShaCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL29", "SELECT ShaDibCli, ShaDibInt, ShaGrb, ShaTipMaq, ShaMal, ShaAnc, ShaUbi FROM TXPShablo WHERE EmprCod = ? AND ShaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL30", "SELECT EmprCod, OGSCod, ShaCod FROM TXPShaGr1 WHERE EmprCod = ? AND OGSCod = ? AND ShaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00XL31", "INSERT INTO TXPShaGr1(OGSCod, ShaOGSOrd, EmprCod, ShaCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPShaGr1")
         ,new UpdateCursor("T00XL32", "UPDATE TXPShaGr1 SET ShaOGSOrd=?  WHERE EmprCod = ? AND OGSCod = ? AND ShaCod = ?", GX_NOMASK, "TXPShaGr1")
         ,new UpdateCursor("T00XL33", "DELETE FROM TXPShaGr1  WHERE EmprCod = ? AND OGSCod = ? AND ShaCod = ?", GX_NOMASK, "TXPShaGr1")
         ,new ForEachCursor("T00XL34", "SELECT ShaDibCli, ShaDibInt, ShaGrb, ShaTipMaq, ShaMal, ShaAnc, ShaUbi FROM TXPShablo WHERE EmprCod = ? AND ShaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XL35", "SELECT EmprCod, OGSCod, ShaCod FROM TXPShaGr1 WHERE OGSCod = ? and EmprCod = ? ORDER BY EmprCod, OGSCod, ShaCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 15);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 3);
               ((int[]) buf[44])[0] = rslt.getInt(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 16);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((String[]) buf[16])[0] = rslt.getString(11, 10);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 15);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(15, (String)parms[28]);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 16);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[32]).intValue());
               }
               stmt.setString(18, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[39], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
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
                  stmt.setString(8, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 10);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 15);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 30);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 16);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[33]).intValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               stmt.setString(20, (String)parms[38], 3);
               stmt.setInt(21, ((Number) parms[39]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 10);
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
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

